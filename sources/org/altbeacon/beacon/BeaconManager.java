package org.altbeacon.beacon;

import android.app.Notification;
import android.bluetooth.BluetoothManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.work.PeriodicWorkRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.beacon.logging.Loggers;
import org.altbeacon.beacon.service.BeaconService;
import org.altbeacon.beacon.service.Callback;
import org.altbeacon.beacon.service.MonitoringStatus;
import org.altbeacon.beacon.service.RangeState;
import org.altbeacon.beacon.service.RangedBeacon;
import org.altbeacon.beacon.service.RegionMonitoringState;
import org.altbeacon.beacon.service.RunningAverageRssiFilter;
import org.altbeacon.beacon.service.ScanJobScheduler;
import org.altbeacon.beacon.service.SettingsData;
import org.altbeacon.beacon.service.StartRMData;
import org.altbeacon.beacon.service.scanner.NonBeaconLeScanCallback;
import org.altbeacon.beacon.simulator.BeaconSimulator;
import org.altbeacon.beacon.utils.ProcessUtils;

public class BeaconManager {
    public static final long DEFAULT_BACKGROUND_BETWEEN_SCAN_PERIOD = 300000;
    public static final long DEFAULT_BACKGROUND_SCAN_PERIOD = 10000;
    public static final long DEFAULT_EXIT_PERIOD = 10000;
    public static final long DEFAULT_FOREGROUND_BETWEEN_SCAN_PERIOD = 0;
    public static final long DEFAULT_FOREGROUND_SCAN_PERIOD = 1100;
    private static final Object SINGLETON_LOCK = new Object();
    private static final String TAG = "BeaconManager";
    protected static BeaconSimulator beaconSimulator = null;
    protected static String distanceModelUpdateUrl = "https://s3.amazonaws.com/android-beacon-library/android-distance.json";
    protected static Class rssiFilterImplClass = RunningAverageRssiFilter.class;
    private static boolean sAndroidLScanningDisabled = false;
    private static long sExitRegionPeriod = 10000;
    protected static volatile BeaconManager sInstance = null;
    private static boolean sManifestCheckingDisabled = false;
    private long backgroundBetweenScanPeriod = 300000;
    private long backgroundScanPeriod = 10000;
    private final List<BeaconParser> beaconParsers = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */
    public final ConcurrentMap<BeaconConsumer, ConsumerInfo> consumers = new ConcurrentHashMap();
    protected RangeNotifier dataRequestNotifier = null;
    private long foregroundBetweenScanPeriod = 0;
    private long foregroundScanPeriod = DEFAULT_FOREGROUND_SCAN_PERIOD;
    private boolean mBackgroundMode = false;
    private boolean mBackgroundModeUninitialized = true;
    private final Context mContext;
    private Notification mForegroundServiceNotification = null;
    private int mForegroundServiceNotificationId = -1;
    private boolean mMainProcess = false;
    private NonBeaconLeScanCallback mNonBeaconLeScanCallback;
    private boolean mRegionStatePersistenceEnabled = true;
    /* access modifiers changed from: private */
    public Boolean mScannerInSameProcess = null;
    private boolean mScheduledScanJobsEnabled = false;
    protected final Set<MonitorNotifier> monitorNotifiers = new CopyOnWriteArraySet();
    protected final Set<RangeNotifier> rangeNotifiers = new CopyOnWriteArraySet();
    private final ArrayList<Region> rangedRegions = new ArrayList<>();
    /* access modifiers changed from: private */
    public Messenger serviceMessenger = null;

    public static void setDebug(boolean z) {
        if (z) {
            LogManager.setLogger(Loggers.verboseLogger());
            LogManager.setVerboseLoggingEnabled(true);
            return;
        }
        LogManager.setLogger(Loggers.empty());
        LogManager.setVerboseLoggingEnabled(false);
    }

    public void setForegroundScanPeriod(long j) {
        this.foregroundScanPeriod = j;
    }

    public void setForegroundBetweenScanPeriod(long j) {
        this.foregroundBetweenScanPeriod = j;
    }

    public void setBackgroundScanPeriod(long j) {
        this.backgroundScanPeriod = j;
    }

    public void setBackgroundBetweenScanPeriod(long j) {
        this.backgroundBetweenScanPeriod = j;
        if (Build.VERSION.SDK_INT >= 26 && this.backgroundBetweenScanPeriod < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            LogManager.m6842w(TAG, "Setting a short backgroundBetweenScanPeriod has no effect on Android 8+, which is limited to scanning every ~15 minutes", new Object[0]);
        }
    }

    public static void setRegionExitPeriod(long j) {
        sExitRegionPeriod = j;
        BeaconManager beaconManager = sInstance;
        if (beaconManager != null) {
            beaconManager.applySettings();
        }
    }

    public static long getRegionExitPeriod() {
        return sExitRegionPeriod;
    }

    public static BeaconManager getInstanceForApplication(Context context) {
        BeaconManager beaconManager = sInstance;
        if (beaconManager == null) {
            synchronized (SINGLETON_LOCK) {
                beaconManager = sInstance;
                if (beaconManager == null) {
                    beaconManager = new BeaconManager(context);
                    sInstance = beaconManager;
                }
            }
        }
        return beaconManager;
    }

    protected BeaconManager(Context context) {
        this.mContext = context.getApplicationContext();
        checkIfMainProcess();
        if (!sManifestCheckingDisabled) {
            verifyServiceDeclaration();
        }
        this.beaconParsers.add(new AltBeaconParser());
        setScheduledScanJobsEnabledDefault();
    }

    public boolean isMainProcess() {
        return this.mMainProcess;
    }

    public boolean isScannerInDifferentProcess() {
        Boolean bool = this.mScannerInSameProcess;
        return bool != null && !bool.booleanValue();
    }

    public void setScannerInSameProcess(boolean z) {
        this.mScannerInSameProcess = Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public void checkIfMainProcess() {
        ProcessUtils processUtils = new ProcessUtils(this.mContext);
        String processName = processUtils.getProcessName();
        String packageName = processUtils.getPackageName();
        int pid = processUtils.getPid();
        this.mMainProcess = processUtils.isMainProcess();
        LogManager.m6838i(TAG, "BeaconManager started up on pid " + pid + " named '" + processName + "' for application package '" + packageName + "'.  isMainProcess=" + this.mMainProcess, new Object[0]);
    }

    public List<BeaconParser> getBeaconParsers() {
        return this.beaconParsers;
    }

    public boolean checkAvailability() throws BleNotAvailableException {
        if (isBleAvailableOrSimulated()) {
            return ((BluetoothManager) this.mContext.getSystemService("bluetooth")).getAdapter().isEnabled();
        }
        throw new BleNotAvailableException("Bluetooth LE not supported by this device");
    }

    public void bind(BeaconConsumer beaconConsumer) {
        if (!isBleAvailableOrSimulated()) {
            LogManager.m6842w(TAG, "Method invocation will be ignored.", new Object[0]);
            return;
        }
        synchronized (this.consumers) {
            ConsumerInfo consumerInfo = new ConsumerInfo();
            if (this.consumers.putIfAbsent(beaconConsumer, consumerInfo) != null) {
                LogManager.m6834d(TAG, "This consumer is already bound", new Object[0]);
            } else {
                LogManager.m6834d(TAG, "This consumer is not bound.  Binding now: %s", beaconConsumer);
                if (this.mScheduledScanJobsEnabled) {
                    LogManager.m6834d(TAG, "Not starting beacon scanning service. Using scheduled jobs", new Object[0]);
                    beaconConsumer.onBeaconServiceConnect();
                } else {
                    LogManager.m6834d(TAG, "Binding to service", new Object[0]);
                    Intent intent = new Intent(beaconConsumer.getApplicationContext(), BeaconService.class);
                    if (Build.VERSION.SDK_INT >= 26 && getForegroundServiceNotification() != null) {
                        if (isAnyConsumerBound()) {
                            LogManager.m6838i(TAG, "Not starting foreground beacon scanning service.  A consumer is already bound, so it should be started", new Object[0]);
                        } else {
                            LogManager.m6838i(TAG, "Starting foreground beacon scanning service.", new Object[0]);
                            this.mContext.startForegroundService(intent);
                        }
                    }
                    beaconConsumer.bindService(intent, consumerInfo.beaconServiceConnection, 1);
                }
                LogManager.m6834d(TAG, "consumer count is now: %s", Integer.valueOf(this.consumers.size()));
            }
        }
    }

    public void unbind(BeaconConsumer beaconConsumer) {
        if (!isBleAvailableOrSimulated()) {
            LogManager.m6842w(TAG, "Method invocation will be ignored.", new Object[0]);
            return;
        }
        synchronized (this.consumers) {
            if (this.consumers.containsKey(beaconConsumer)) {
                LogManager.m6834d(TAG, "Unbinding", new Object[0]);
                if (this.mScheduledScanJobsEnabled) {
                    LogManager.m6834d(TAG, "Not unbinding from scanning service as we are using scan jobs.", new Object[0]);
                } else {
                    beaconConsumer.unbindService(((ConsumerInfo) this.consumers.get(beaconConsumer)).beaconServiceConnection);
                }
                LogManager.m6834d(TAG, "Before unbind, consumer count is " + this.consumers.size(), new Object[0]);
                this.consumers.remove(beaconConsumer);
                LogManager.m6834d(TAG, "After unbind, consumer count is " + this.consumers.size(), new Object[0]);
                if (this.consumers.size() == 0) {
                    this.serviceMessenger = null;
                    if (this.mScheduledScanJobsEnabled && Build.VERSION.SDK_INT >= 21) {
                        LogManager.m6838i(TAG, "Cancelling scheduled jobs after unbind of last consumer.", new Object[0]);
                        ScanJobScheduler.getInstance().cancelSchedule(this.mContext);
                    }
                }
            } else {
                LogManager.m6834d(TAG, "This consumer is not bound to: %s", beaconConsumer);
                LogManager.m6834d(TAG, "Bound consumers: ", new Object[0]);
                for (Map.Entry value : this.consumers.entrySet()) {
                    LogManager.m6834d(TAG, String.valueOf(value.getValue()), new Object[0]);
                }
            }
        }
    }

    public boolean isBound(BeaconConsumer beaconConsumer) {
        boolean z;
        synchronized (this.consumers) {
            if (beaconConsumer != null) {
                try {
                    if (this.consumers.get(beaconConsumer) != null && (this.mScheduledScanJobsEnabled || this.serviceMessenger != null)) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }

    public boolean isAnyConsumerBound() {
        boolean z;
        synchronized (this.consumers) {
            z = !this.consumers.isEmpty() && (this.mScheduledScanJobsEnabled || this.serviceMessenger != null);
        }
        return z;
    }

    public void setBackgroundMode(boolean z) {
        if (!isBleAvailableOrSimulated()) {
            LogManager.m6842w(TAG, "Method invocation will be ignored.", new Object[0]);
            return;
        }
        this.mBackgroundModeUninitialized = false;
        if (z != this.mBackgroundMode) {
            this.mBackgroundMode = z;
            try {
                updateScanPeriods();
            } catch (RemoteException unused) {
                LogManager.m6836e(TAG, "Cannot contact service to set scan periods", new Object[0]);
            }
        }
    }

    public void setEnableScheduledScanJobs(boolean z) {
        if (isAnyConsumerBound()) {
            LogManager.m6836e(TAG, "ScanJob may not be configured because a consumer is already bound.", new Object[0]);
            throw new IllegalStateException("Method must be called before calling bind()");
        } else if (!z || Build.VERSION.SDK_INT >= 21) {
            if (!z && Build.VERSION.SDK_INT >= 26) {
                LogManager.m6842w(TAG, "Disabling ScanJobs on Android 8+ may disable delivery of beacon callbacks in the background unless a foreground service is active.", new Object[0]);
            }
            if (!z && Build.VERSION.SDK_INT >= 21) {
                ScanJobScheduler.getInstance().cancelSchedule(this.mContext);
            }
            this.mScheduledScanJobsEnabled = z;
        } else {
            LogManager.m6836e(TAG, "ScanJob may not be configured because JobScheduler is not availble prior to Android 5.0", new Object[0]);
        }
    }

    public boolean getScheduledScanJobsEnabled() {
        return this.mScheduledScanJobsEnabled;
    }

    public boolean getBackgroundMode() {
        return this.mBackgroundMode;
    }

    public long getBackgroundScanPeriod() {
        return this.backgroundScanPeriod;
    }

    public long getBackgroundBetweenScanPeriod() {
        return this.backgroundBetweenScanPeriod;
    }

    public long getForegroundScanPeriod() {
        return this.foregroundScanPeriod;
    }

    public long getForegroundBetweenScanPeriod() {
        return this.foregroundBetweenScanPeriod;
    }

    public boolean isBackgroundModeUninitialized() {
        return this.mBackgroundModeUninitialized;
    }

    @Deprecated
    public void setRangeNotifier(RangeNotifier rangeNotifier) {
        this.rangeNotifiers.clear();
        if (rangeNotifier != null) {
            addRangeNotifier(rangeNotifier);
        }
    }

    public void addRangeNotifier(RangeNotifier rangeNotifier) {
        if (rangeNotifier != null) {
            this.rangeNotifiers.add(rangeNotifier);
        }
    }

    public boolean removeRangeNotifier(RangeNotifier rangeNotifier) {
        return this.rangeNotifiers.remove(rangeNotifier);
    }

    public void removeAllRangeNotifiers() {
        this.rangeNotifiers.clear();
    }

    @Deprecated
    public void setMonitorNotifier(MonitorNotifier monitorNotifier) {
        if (!determineIfCalledFromSeparateScannerProcess()) {
            this.monitorNotifiers.clear();
            if (monitorNotifier != null) {
                addMonitorNotifier(monitorNotifier);
            }
        }
    }

    public void addMonitorNotifier(MonitorNotifier monitorNotifier) {
        if (!determineIfCalledFromSeparateScannerProcess() && monitorNotifier != null) {
            this.monitorNotifiers.add(monitorNotifier);
        }
    }

    @Deprecated
    public boolean removeMonitoreNotifier(MonitorNotifier monitorNotifier) {
        return removeMonitorNotifier(monitorNotifier);
    }

    public boolean removeMonitorNotifier(MonitorNotifier monitorNotifier) {
        if (determineIfCalledFromSeparateScannerProcess()) {
            return false;
        }
        return this.monitorNotifiers.remove(monitorNotifier);
    }

    public void removeAllMonitorNotifiers() {
        if (!determineIfCalledFromSeparateScannerProcess()) {
            this.monitorNotifiers.clear();
        }
    }

    @Deprecated
    public void setRegionStatePeristenceEnabled(boolean z) {
        setRegionStatePersistenceEnabled(z);
    }

    public void setRegionStatePersistenceEnabled(boolean z) {
        this.mRegionStatePersistenceEnabled = z;
        if (!isScannerInDifferentProcess()) {
            if (z) {
                MonitoringStatus.getInstanceForApplication(this.mContext).startStatusPreservation();
            } else {
                MonitoringStatus.getInstanceForApplication(this.mContext).stopStatusPreservation();
            }
        }
        applySettings();
    }

    public boolean isRegionStatePersistenceEnabled() {
        return this.mRegionStatePersistenceEnabled;
    }

    public void requestStateForRegion(Region region) {
        if (!determineIfCalledFromSeparateScannerProcess()) {
            RegionMonitoringState stateOf = MonitoringStatus.getInstanceForApplication(this.mContext).stateOf(region);
            int i = 0;
            if (stateOf != null && stateOf.getInside()) {
                i = 1;
            }
            for (MonitorNotifier didDetermineStateForRegion : this.monitorNotifiers) {
                didDetermineStateForRegion.didDetermineStateForRegion(i, region);
            }
        }
    }

    public void startRangingBeaconsInRegion(Region region) throws RemoteException {
        if (!isBleAvailableOrSimulated()) {
            LogManager.m6842w(TAG, "Method invocation will be ignored.", new Object[0]);
        } else if (!determineIfCalledFromSeparateScannerProcess()) {
            synchronized (this.rangedRegions) {
                this.rangedRegions.add(region);
            }
            applyChangesToServices(2, region);
        }
    }

    public void stopRangingBeaconsInRegion(Region region) throws RemoteException {
        if (!isBleAvailableOrSimulated()) {
            LogManager.m6842w(TAG, "Method invocation will be ignored.", new Object[0]);
        } else if (!determineIfCalledFromSeparateScannerProcess()) {
            synchronized (this.rangedRegions) {
                Region region2 = null;
                Iterator<Region> it = this.rangedRegions.iterator();
                while (it.hasNext()) {
                    Region next = it.next();
                    if (region.getUniqueId().equals(next.getUniqueId())) {
                        region2 = next;
                    }
                }
                this.rangedRegions.remove(region2);
            }
            applyChangesToServices(3, region);
        }
    }

    public void applySettings() {
        if (!determineIfCalledFromSeparateScannerProcess()) {
            if (!isAnyConsumerBound()) {
                LogManager.m6834d(TAG, "Not synchronizing settings to service, as it has not started up yet", new Object[0]);
            } else if (isScannerInDifferentProcess()) {
                LogManager.m6834d(TAG, "Synchronizing settings to service", new Object[0]);
                syncSettingsToService();
            } else {
                LogManager.m6834d(TAG, "Not synchronizing settings to service, as it is in the same process", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void syncSettingsToService() {
        if (!this.mScheduledScanJobsEnabled) {
            try {
                applyChangesToServices(7, (Region) null);
            } catch (RemoteException e) {
                LogManager.m6836e(TAG, "Failed to sync settings to service", e);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            ScanJobScheduler.getInstance().applySettingsToScheduledJob(this.mContext, this);
        }
    }

    public void startMonitoringBeaconsInRegion(Region region) throws RemoteException {
        if (!isBleAvailableOrSimulated()) {
            LogManager.m6842w(TAG, "Method invocation will be ignored.", new Object[0]);
        } else if (!determineIfCalledFromSeparateScannerProcess()) {
            if (this.mScheduledScanJobsEnabled) {
                MonitoringStatus.getInstanceForApplication(this.mContext).addRegion(region, new Callback(callbackPackageName()));
            }
            applyChangesToServices(4, region);
            if (isScannerInDifferentProcess()) {
                MonitoringStatus.getInstanceForApplication(this.mContext).addLocalRegion(region);
            }
            requestStateForRegion(region);
        }
    }

    public void stopMonitoringBeaconsInRegion(Region region) throws RemoteException {
        if (!isBleAvailableOrSimulated()) {
            LogManager.m6842w(TAG, "Method invocation will be ignored.", new Object[0]);
        } else if (!determineIfCalledFromSeparateScannerProcess()) {
            if (this.mScheduledScanJobsEnabled) {
                MonitoringStatus.getInstanceForApplication(this.mContext).removeRegion(region);
            }
            applyChangesToServices(5, region);
            if (isScannerInDifferentProcess()) {
                MonitoringStatus.getInstanceForApplication(this.mContext).removeLocalRegion(region);
            }
        }
    }

    public void updateScanPeriods() throws RemoteException {
        if (!isBleAvailableOrSimulated()) {
            LogManager.m6842w(TAG, "Method invocation will be ignored.", new Object[0]);
        } else if (!determineIfCalledFromSeparateScannerProcess()) {
            LogManager.m6834d(TAG, "updating background flag to %s", Boolean.valueOf(this.mBackgroundMode));
            LogManager.m6834d(TAG, "updating scan period to %s, %s", Long.valueOf(getScanPeriod()), Long.valueOf(getBetweenScanPeriod()));
            applyChangesToServices(6, (Region) null);
        }
    }

    private void applyChangesToServices(int i, Region region) throws RemoteException {
        if (!isAnyConsumerBound()) {
            LogManager.m6842w(TAG, "The BeaconManager is not bound to the service.  Call beaconManager.bind(BeaconConsumer consumer) and wait for a callback to onBeaconServiceConnect()", new Object[0]);
        } else if (!this.mScheduledScanJobsEnabled) {
            Message obtain = Message.obtain((Handler) null, i, 0, 0);
            if (i == 6) {
                obtain.setData(new StartRMData(getScanPeriod(), getBetweenScanPeriod(), this.mBackgroundMode).toBundle());
            } else if (i == 7) {
                obtain.setData(new SettingsData().collect(this.mContext).toBundle());
            } else {
                obtain.setData(new StartRMData(region, callbackPackageName(), getScanPeriod(), getBetweenScanPeriod(), this.mBackgroundMode).toBundle());
            }
            this.serviceMessenger.send(obtain);
        } else if (Build.VERSION.SDK_INT >= 21) {
            ScanJobScheduler.getInstance().applySettingsToScheduledJob(this.mContext, this);
        }
    }

    private String callbackPackageName() {
        String packageName = this.mContext.getPackageName();
        LogManager.m6834d(TAG, "callback packageName: %s", packageName);
        return packageName;
    }

    @Deprecated
    public MonitorNotifier getMonitoringNotifier() {
        Iterator<MonitorNotifier> it = this.monitorNotifiers.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public Set<MonitorNotifier> getMonitoringNotifiers() {
        return Collections.unmodifiableSet(this.monitorNotifiers);
    }

    @Deprecated
    public RangeNotifier getRangingNotifier() {
        Iterator<RangeNotifier> it = this.rangeNotifiers.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public Set<RangeNotifier> getRangingNotifiers() {
        return Collections.unmodifiableSet(this.rangeNotifiers);
    }

    public Collection<Region> getMonitoredRegions() {
        return MonitoringStatus.getInstanceForApplication(this.mContext).regions();
    }

    public Collection<Region> getRangedRegions() {
        ArrayList arrayList;
        synchronized (this.rangedRegions) {
            arrayList = new ArrayList(this.rangedRegions);
        }
        return arrayList;
    }

    @Deprecated
    public static void logDebug(String str, String str2) {
        LogManager.m6834d(str, str2, new Object[0]);
    }

    @Deprecated
    public static void logDebug(String str, String str2, Throwable th) {
        LogManager.m6835d(th, str, str2, new Object[0]);
    }

    public static String getDistanceModelUpdateUrl() {
        return distanceModelUpdateUrl;
    }

    public static void setDistanceModelUpdateUrl(String str) {
        warnIfScannerNotInSameProcess();
        distanceModelUpdateUrl = str;
    }

    public static void setRssiFilterImplClass(Class cls) {
        warnIfScannerNotInSameProcess();
        rssiFilterImplClass = cls;
    }

    public static Class getRssiFilterImplClass() {
        return rssiFilterImplClass;
    }

    public static void setUseTrackingCache(boolean z) {
        RangeState.setUseTrackingCache(z);
        if (sInstance != null) {
            sInstance.applySettings();
        }
    }

    public void setMaxTrackingAge(int i) {
        RangedBeacon.setMaxTrackinAge(i);
    }

    public static void setBeaconSimulator(BeaconSimulator beaconSimulator2) {
        warnIfScannerNotInSameProcess();
        beaconSimulator = beaconSimulator2;
    }

    public static BeaconSimulator getBeaconSimulator() {
        return beaconSimulator;
    }

    /* access modifiers changed from: protected */
    public void setDataRequestNotifier(RangeNotifier rangeNotifier) {
        this.dataRequestNotifier = rangeNotifier;
    }

    /* access modifiers changed from: protected */
    public RangeNotifier getDataRequestNotifier() {
        return this.dataRequestNotifier;
    }

    public NonBeaconLeScanCallback getNonBeaconLeScanCallback() {
        return this.mNonBeaconLeScanCallback;
    }

    public void setNonBeaconLeScanCallback(NonBeaconLeScanCallback nonBeaconLeScanCallback) {
        this.mNonBeaconLeScanCallback = nonBeaconLeScanCallback;
    }

    private boolean isBleAvailableOrSimulated() {
        if (getBeaconSimulator() != null) {
            return true;
        }
        return isBleAvailable();
    }

    private boolean isBleAvailable() {
        if (Build.VERSION.SDK_INT < 18) {
            LogManager.m6842w(TAG, "Bluetooth LE not supported prior to API 18.", new Object[0]);
            return false;
        } else if (this.mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return true;
        } else {
            LogManager.m6842w(TAG, "This device does not support bluetooth LE.", new Object[0]);
            return false;
        }
    }

    private long getScanPeriod() {
        if (this.mBackgroundMode) {
            return this.backgroundScanPeriod;
        }
        return this.foregroundScanPeriod;
    }

    private long getBetweenScanPeriod() {
        if (this.mBackgroundMode) {
            return this.backgroundBetweenScanPeriod;
        }
        return this.foregroundBetweenScanPeriod;
    }

    private void verifyServiceDeclaration() {
        List<ResolveInfo> queryIntentServices = this.mContext.getPackageManager().queryIntentServices(new Intent(this.mContext, BeaconService.class), 65536);
        if (queryIntentServices != null && queryIntentServices.isEmpty()) {
            throw new ServiceNotDeclaredException();
        }
    }

    private class ConsumerInfo {
        public BeaconServiceConnection beaconServiceConnection;
        public boolean isConnected;

        public ConsumerInfo() {
            this.isConnected = false;
            this.isConnected = false;
            this.beaconServiceConnection = new BeaconServiceConnection();
        }
    }

    private class BeaconServiceConnection implements ServiceConnection {
        private BeaconServiceConnection() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LogManager.m6834d(BeaconManager.TAG, "we have a connection to the service now", new Object[0]);
            if (BeaconManager.this.mScannerInSameProcess == null) {
                Boolean unused = BeaconManager.this.mScannerInSameProcess = false;
            }
            Messenger unused2 = BeaconManager.this.serviceMessenger = new Messenger(iBinder);
            BeaconManager.this.applySettings();
            synchronized (BeaconManager.this.consumers) {
                for (Map.Entry entry : BeaconManager.this.consumers.entrySet()) {
                    if (!((ConsumerInfo) entry.getValue()).isConnected) {
                        ((BeaconConsumer) entry.getKey()).onBeaconServiceConnect();
                        ((ConsumerInfo) entry.getValue()).isConnected = true;
                    }
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            LogManager.m6836e(BeaconManager.TAG, "onServiceDisconnected", new Object[0]);
            Messenger unused = BeaconManager.this.serviceMessenger = null;
        }
    }

    public class ServiceNotDeclaredException extends RuntimeException {
        public ServiceNotDeclaredException() {
            super("The BeaconService is not properly declared in AndroidManifest.xml.  If using Eclipse, please verify that your project.properties has manifestmerger.enabled=true");
        }
    }

    public static boolean isAndroidLScanningDisabled() {
        return sAndroidLScanningDisabled;
    }

    public static void setAndroidLScanningDisabled(boolean z) {
        sAndroidLScanningDisabled = z;
        BeaconManager beaconManager = sInstance;
        if (beaconManager != null) {
            beaconManager.applySettings();
        }
    }

    @Deprecated
    public static void setsManifestCheckingDisabled(boolean z) {
        sManifestCheckingDisabled = z;
    }

    public static void setManifestCheckingDisabled(boolean z) {
        sManifestCheckingDisabled = z;
    }

    public static boolean getManifestCheckingDisabled() {
        return sManifestCheckingDisabled;
    }

    public void enableForegroundServiceScanning(Notification notification, int i) throws IllegalStateException {
        if (isAnyConsumerBound()) {
            throw new IllegalStateException("May not be called after consumers are already bound.");
        } else if (notification != null) {
            setEnableScheduledScanJobs(false);
            this.mForegroundServiceNotification = notification;
            this.mForegroundServiceNotificationId = i;
        } else {
            throw new NullPointerException("Notification cannot be null");
        }
    }

    public void disableForegroundServiceScanning() throws IllegalStateException {
        if (!isAnyConsumerBound()) {
            this.mForegroundServiceNotification = null;
            setScheduledScanJobsEnabledDefault();
            return;
        }
        throw new IllegalStateException("May not be called after consumers are already bound");
    }

    public Notification getForegroundServiceNotification() {
        return this.mForegroundServiceNotification;
    }

    public int getForegroundServiceNotificationId() {
        return this.mForegroundServiceNotificationId;
    }

    private boolean determineIfCalledFromSeparateScannerProcess() {
        if (!isScannerInDifferentProcess() || isMainProcess()) {
            return false;
        }
        LogManager.m6842w(TAG, "Ranging/Monitoring may not be controlled from a separate BeaconScanner process.  To remove this warning, please wrap this call in: if (beaconManager.isMainProcess())", new Object[0]);
        return true;
    }

    private static void warnIfScannerNotInSameProcess() {
        BeaconManager beaconManager = sInstance;
        if (beaconManager != null && beaconManager.isScannerInDifferentProcess()) {
            LogManager.m6842w(TAG, "Unsupported configuration change made for BeaconScanner in separate process", new Object[0]);
        }
    }

    private void setScheduledScanJobsEnabledDefault() {
        this.mScheduledScanJobsEnabled = Build.VERSION.SDK_INT >= 26;
    }
}
