package org.altbeacon.beacon.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BuildConfig;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.distance.ModelSpecificDistanceCalculator;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.beacon.utils.ProcessUtils;
import org.altbeacon.bluetooth.BluetoothCrashResolver;

public class ScanJob extends JobService {
    /* access modifiers changed from: private */
    public static final String TAG = ScanJob.class.getSimpleName();
    private static int sOverrideImmediateScanJobId = -1;
    private static int sOverridePeriodicScanJobId = -1;
    /* access modifiers changed from: private */
    public boolean mInitialized = false;
    /* access modifiers changed from: private */
    public ScanHelper mScanHelper;
    /* access modifiers changed from: private */
    public ScanState mScanState = null;
    /* access modifiers changed from: private */
    public boolean mStopCalled = false;
    /* access modifiers changed from: private */
    public Handler mStopHandler = new Handler();

    public boolean onStartJob(final JobParameters jobParameters) {
        String str = TAG;
        LogManager.m6834d(str, "ScanJob Lifecycle START: " + this, new Object[0]);
        new Thread(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x01b6, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r13 = this;
                    org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this
                    boolean r0 = r0.initialzeScanHelper()
                    r1 = 0
                    if (r0 != 0) goto L_0x001b
                    java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.TAG
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    java.lang.String r3 = "Cannot allocate a scanner to look for beacons.  System resources are low."
                    org.altbeacon.beacon.logging.LogManager.m6836e(r0, r3, r2)
                    org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this
                    android.app.job.JobParameters r2 = r4
                    r0.jobFinished(r2, r1)
                L_0x001b:
                    org.altbeacon.beacon.service.ScanJobScheduler r0 = org.altbeacon.beacon.service.ScanJobScheduler.getInstance()
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this
                    android.content.Context r2 = r2.getApplicationContext()
                    r0.ensureNotificationProcessorSetup(r2)
                    android.app.job.JobParameters r0 = r4
                    int r0 = r0.getJobId()
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this
                    int r2 = org.altbeacon.beacon.service.ScanJob.getImmediateScanJobId(r2)
                    if (r0 != r2) goto L_0x0053
                    java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.TAG
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Running immediate scan job: instance is "
                    r2.append(r3)
                    org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    org.altbeacon.beacon.logging.LogManager.m6838i(r0, r2, r3)
                    goto L_0x006f
                L_0x0053:
                    java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.TAG
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Running periodic scan job: instance is "
                    r2.append(r3)
                    org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    org.altbeacon.beacon.logging.LogManager.m6838i(r0, r2, r3)
                L_0x006f:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    org.altbeacon.beacon.service.ScanJobScheduler r2 = org.altbeacon.beacon.service.ScanJobScheduler.getInstance()
                    java.util.List r2 = r2.dumpBackgroundScanResultQueue()
                    r0.<init>(r2)
                    java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.TAG
                    r3 = 1
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    int r4 = r0.size()
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r3[r1] = r4
                    java.lang.String r4 = "Processing %d queued scan results"
                    org.altbeacon.beacon.logging.LogManager.m6834d(r2, r4, r3)
                    java.util.Iterator r0 = r0.iterator()
                L_0x0096:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L_0x00d8
                    java.lang.Object r2 = r0.next()
                    android.bluetooth.le.ScanResult r2 = (android.bluetooth.le.ScanResult) r2
                    android.bluetooth.le.ScanRecord r3 = r2.getScanRecord()
                    if (r3 == 0) goto L_0x0096
                    org.altbeacon.beacon.service.ScanJob r4 = org.altbeacon.beacon.service.ScanJob.this
                    org.altbeacon.beacon.service.ScanHelper r4 = r4.mScanHelper
                    if (r4 == 0) goto L_0x0096
                    org.altbeacon.beacon.service.ScanJob r4 = org.altbeacon.beacon.service.ScanJob.this
                    org.altbeacon.beacon.service.ScanHelper r5 = r4.mScanHelper
                    android.bluetooth.BluetoothDevice r6 = r2.getDevice()
                    int r7 = r2.getRssi()
                    byte[] r8 = r3.getBytes()
                    long r3 = java.lang.System.currentTimeMillis()
                    long r9 = android.os.SystemClock.elapsedRealtime()
                    long r3 = r3 - r9
                    long r9 = r2.getTimestampNanos()
                    r11 = 1000000(0xf4240, double:4.940656E-318)
                    long r9 = r9 / r11
                    long r9 = r9 + r3
                    r5.processScanResult(r6, r7, r8, r9)
                    goto L_0x0096
                L_0x00d8:
                    java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.TAG
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    java.lang.String r3 = "Done processing queued scan results"
                    org.altbeacon.beacon.logging.LogManager.m6834d(r0, r3, r2)
                    org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this
                    monitor-enter(r0)
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    boolean r2 = r2.mStopCalled     // Catch:{ all -> 0x01b7 }
                    if (r2 == 0) goto L_0x0102
                    java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x01b7 }
                    java.lang.String r3 = "Quitting scan job before we even start.  Somebody told us to stop."
                    java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.logging.LogManager.m6834d(r2, r3, r4)     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    android.app.job.JobParameters r3 = r4     // Catch:{ all -> 0x01b7 }
                    r2.jobFinished(r3, r1)     // Catch:{ all -> 0x01b7 }
                    monitor-exit(r0)     // Catch:{ all -> 0x01b7 }
                    return
                L_0x0102:
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    boolean r2 = r2.mInitialized     // Catch:{ all -> 0x01b7 }
                    if (r2 == 0) goto L_0x011c
                    java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x01b7 }
                    java.lang.String r3 = "Scanning already started.  Resetting for current parameters"
                    java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.logging.LogManager.m6834d(r2, r3, r4)     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    boolean r2 = r2.restartScanning()     // Catch:{ all -> 0x01b7 }
                    goto L_0x0122
                L_0x011c:
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    boolean r2 = r2.startScanning()     // Catch:{ all -> 0x01b7 }
                L_0x0122:
                    org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    android.os.Handler r3 = r3.mStopHandler     // Catch:{ all -> 0x01b7 }
                    r4 = 0
                    r3.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x01b7 }
                    if (r2 == 0) goto L_0x0179
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanState r2 = r2.mScanState     // Catch:{ all -> 0x01b7 }
                    if (r2 == 0) goto L_0x01b5
                    java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x01b7 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
                    r3.<init>()     // Catch:{ all -> 0x01b7 }
                    java.lang.String r4 = "Scan job running for "
                    r3.append(r4)     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanJob r4 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanState r4 = r4.mScanState     // Catch:{ all -> 0x01b7 }
                    int r4 = r4.getScanJobRuntimeMillis()     // Catch:{ all -> 0x01b7 }
                    r3.append(r4)     // Catch:{ all -> 0x01b7 }
                    java.lang.String r4 = " millis"
                    r3.append(r4)     // Catch:{ all -> 0x01b7 }
                    java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01b7 }
                    java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.logging.LogManager.m6838i(r2, r3, r1)     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanJob r1 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    android.os.Handler r1 = r1.mStopHandler     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanJob$1$1 r2 = new org.altbeacon.beacon.service.ScanJob$1$1     // Catch:{ all -> 0x01b7 }
                    r2.<init>()     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanState r3 = r3.mScanState     // Catch:{ all -> 0x01b7 }
                    int r3 = r3.getScanJobRuntimeMillis()     // Catch:{ all -> 0x01b7 }
                    long r3 = (long) r3     // Catch:{ all -> 0x01b7 }
                    r1.postDelayed(r2, r3)     // Catch:{ all -> 0x01b7 }
                    goto L_0x01b5
                L_0x0179:
                    java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x01b7 }
                    java.lang.String r3 = "Scanning not started so Scan job is complete."
                    java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.logging.LogManager.m6838i(r2, r3, r4)     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    r2.stopScanning()     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanState r2 = r2.mScanState     // Catch:{ all -> 0x01b7 }
                    r2.save()     // Catch:{ all -> 0x01b7 }
                    java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.TAG     // Catch:{ all -> 0x01b7 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
                    r3.<init>()     // Catch:{ all -> 0x01b7 }
                    java.lang.String r4 = "ScanJob Lifecycle STOP (start fail): "
                    r3.append(r4)     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanJob r4 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    r3.append(r4)     // Catch:{ all -> 0x01b7 }
                    java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01b7 }
                    java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.logging.LogManager.m6834d(r2, r3, r4)     // Catch:{ all -> 0x01b7 }
                    org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01b7 }
                    android.app.job.JobParameters r3 = r4     // Catch:{ all -> 0x01b7 }
                    r2.jobFinished(r3, r1)     // Catch:{ all -> 0x01b7 }
                L_0x01b5:
                    monitor-exit(r0)     // Catch:{ all -> 0x01b7 }
                    return
                L_0x01b7:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x01b7 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.ScanJob.C51121.run():void");
            }
        }).start();
        return true;
    }

    /* access modifiers changed from: private */
    public void scheduleNextScan() {
        ScanState scanState = this.mScanState;
        if (scanState == null) {
            return;
        }
        if (!scanState.getBackgroundMode().booleanValue()) {
            LogManager.m6834d(TAG, "In foreground mode, schedule next scan", new Object[0]);
            ScanJobScheduler.getInstance().forceScheduleNextScan(this);
            return;
        }
        startPassiveScanIfNeeded();
    }

    private void startPassiveScanIfNeeded() {
        if (this.mScanState != null) {
            LogManager.m6834d(TAG, "Checking to see if we need to start a passive scan", new Object[0]);
            boolean z = false;
            for (Region stateOf : new ArrayList(this.mScanState.getMonitoringStatus().regions())) {
                RegionMonitoringState stateOf2 = this.mScanState.getMonitoringStatus().stateOf(stateOf);
                if (stateOf2 != null && stateOf2.getInside()) {
                    z = true;
                }
            }
            if (z) {
                LogManager.m6838i(TAG, "We are inside a beacon region.  We will not scan between cycles.", new Object[0]);
            } else if (Build.VERSION.SDK_INT >= 26) {
                ScanHelper scanHelper = this.mScanHelper;
                if (scanHelper != null) {
                    scanHelper.startAndroidOBackgroundScan(this.mScanState.getBeaconParsers());
                }
            } else {
                LogManager.m6834d(TAG, "This is not Android O.  No scanning between cycles when using ScanJob", new Object[0]);
            }
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        synchronized (this) {
            this.mStopCalled = true;
            if (jobParameters.getJobId() == getPeriodicScanJobId(this)) {
                String str = TAG;
                LogManager.m6838i(str, "onStopJob called for periodic scan " + this, new Object[0]);
            } else {
                String str2 = TAG;
                LogManager.m6838i(str2, "onStopJob called for immediate scan " + this, new Object[0]);
            }
            String str3 = TAG;
            LogManager.m6834d(str3, "ScanJob Lifecycle STOP: " + this, new Object[0]);
            this.mStopHandler.removeCallbacksAndMessages((Object) null);
            stopScanning();
            startPassiveScanIfNeeded();
            if (this.mScanHelper != null) {
                this.mScanHelper.terminateThreads();
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void stopScanning() {
        this.mInitialized = false;
        if (this.mScanHelper != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mScanHelper.stopAndroidOBackgroundScan();
            }
            if (this.mScanHelper.getCycledScanner() != null) {
                this.mScanHelper.getCycledScanner().stop();
                this.mScanHelper.getCycledScanner().destroy();
            }
        }
        LogManager.m6834d(TAG, "Scanning stopped", new Object[0]);
    }

    /* access modifiers changed from: private */
    public boolean initialzeScanHelper() {
        this.mScanState = ScanState.restore(this);
        if (this.mScanState == null) {
            return false;
        }
        ScanHelper scanHelper = new ScanHelper(this);
        this.mScanState.setLastScanStartTimeMillis(System.currentTimeMillis());
        scanHelper.setMonitoringStatus(this.mScanState.getMonitoringStatus());
        scanHelper.setRangedRegionState(this.mScanState.getRangedRegionState());
        scanHelper.setBeaconParsers(this.mScanState.getBeaconParsers());
        scanHelper.setExtraDataBeaconTracker(this.mScanState.getExtraBeaconDataTracker());
        if (scanHelper.getCycledScanner() == null) {
            try {
                scanHelper.createCycledLeScanner(this.mScanState.getBackgroundMode().booleanValue(), (BluetoothCrashResolver) null);
            } catch (OutOfMemoryError unused) {
                LogManager.m6842w(TAG, "Failed to create CycledLeScanner thread.", new Object[0]);
                return false;
            }
        }
        this.mScanHelper = scanHelper;
        return true;
    }

    /* access modifiers changed from: private */
    public boolean restartScanning() {
        if (this.mScanState == null || this.mScanHelper == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.mScanHelper.stopAndroidOBackgroundScan();
        }
        long longValue = (this.mScanState.getBackgroundMode().booleanValue() ? this.mScanState.getBackgroundScanPeriod() : this.mScanState.getForegroundScanPeriod()).longValue();
        long longValue2 = (this.mScanState.getBackgroundMode().booleanValue() ? this.mScanState.getBackgroundBetweenScanPeriod() : this.mScanState.getForegroundBetweenScanPeriod()).longValue();
        if (this.mScanHelper.getCycledScanner() != null) {
            this.mScanHelper.getCycledScanner().setScanPeriods(longValue, longValue2, this.mScanState.getBackgroundMode().booleanValue());
        }
        this.mInitialized = true;
        if (longValue <= 0) {
            LogManager.m6842w(TAG, "Starting scan with scan period of zero.  Exiting ScanJob.", new Object[0]);
            if (this.mScanHelper.getCycledScanner() != null) {
                this.mScanHelper.getCycledScanner().stop();
            }
            return false;
        } else if (this.mScanHelper.getRangedRegionState().size() > 0 || this.mScanHelper.getMonitoringStatus().regions().size() > 0) {
            if (this.mScanHelper.getCycledScanner() != null) {
                this.mScanHelper.getCycledScanner().start();
            }
            return true;
        } else {
            if (this.mScanHelper.getCycledScanner() != null) {
                this.mScanHelper.getCycledScanner().stop();
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    public boolean startScanning() {
        BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(getApplicationContext());
        instanceForApplication.setScannerInSameProcess(true);
        if (instanceForApplication.isMainProcess()) {
            LogManager.m6838i(TAG, "scanJob version %s is starting up on the main process", BuildConfig.VERSION_NAME);
        } else {
            LogManager.m6838i(TAG, "beaconScanJob library version %s is starting up on a separate process", BuildConfig.VERSION_NAME);
            ProcessUtils processUtils = new ProcessUtils(this);
            String str = TAG;
            LogManager.m6838i(str, "beaconScanJob PID is " + processUtils.getPid() + " with process name " + processUtils.getProcessName(), new Object[0]);
        }
        Beacon.setDistanceCalculator(new ModelSpecificDistanceCalculator(this, BeaconManager.getDistanceModelUpdateUrl()));
        return restartScanning();
    }

    public static void setOverrideImmediateScanJobId(int i) {
        sOverrideImmediateScanJobId = i;
    }

    public static void setOverridePeriodicScanJobId(int i) {
        sOverridePeriodicScanJobId = i;
    }

    public static int getImmediateScanJobId(Context context) {
        if (sOverrideImmediateScanJobId < 0) {
            return getJobIdFromManifest(context, "immediateScanJobId");
        }
        String str = TAG;
        LogManager.m6838i(str, "Using ImmediateScanJobId from static override: " + sOverrideImmediateScanJobId, new Object[0]);
        return sOverrideImmediateScanJobId;
    }

    public static int getPeriodicScanJobId(Context context) {
        if (sOverrideImmediateScanJobId < 0) {
            return getJobIdFromManifest(context, "periodicScanJobId");
        }
        String str = TAG;
        LogManager.m6838i(str, "Using PeriodicScanJobId from static override: " + sOverridePeriodicScanJobId, new Object[0]);
        return sOverridePeriodicScanJobId;
    }

    private static int getJobIdFromManifest(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, ScanJob.class), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            serviceInfo = null;
        }
        if (serviceInfo == null || serviceInfo.metaData == null || serviceInfo.metaData.get(str) == null) {
            throw new RuntimeException("Cannot get job id from manifest.  Make sure that the " + str + " is configured in the manifest for the ScanJob.");
        }
        int i = serviceInfo.metaData.getInt(str);
        String str2 = TAG;
        LogManager.m6838i(str2, "Using " + str + " from manifest: " + i, new Object[0]);
        return i;
    }
}
