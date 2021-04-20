package org.altbeacon.bluetooth;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.TaskStackBuilder;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.work.PeriodicWorkRequest;
import org.altbeacon.beacon.logging.LogManager;

public class BluetoothMedic {
    private static final long MIN_MILLIS_BETWEEN_BLUETOOTH_POWER_CYCLES = 60000;
    public static final int NO_TEST = 0;
    public static final int SCAN_TEST = 1;
    /* access modifiers changed from: private */
    public static final String TAG = BluetoothMedic.class.getSimpleName();
    public static final int TRANSMIT_TEST = 2;
    private static BluetoothMedic sInstance;
    /* access modifiers changed from: private */
    public BluetoothAdapter mAdapter;
    /* access modifiers changed from: private */
    public BroadcastReceiver mBluetoothEventReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            LogManager.m6834d(BluetoothMedic.TAG, "Broadcast notification received.", new Object[0]);
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            if (action.equalsIgnoreCase("onScanFailed")) {
                if (intent.getIntExtra("errorCode", -1) == 2) {
                    BluetoothMedic.this.sendNotification(context, "scan failed", "Power cycling bluetooth");
                    LogManager.m6834d(BluetoothMedic.TAG, "Detected a SCAN_FAILED_APPLICATION_REGISTRATION_FAILED.  We need to cycle bluetooth to recover", new Object[0]);
                    if (!BluetoothMedic.this.cycleBluetoothIfNotTooSoon()) {
                        BluetoothMedic.this.sendNotification(context, "scan failed", "Cannot power cycle bluetooth again");
                    }
                }
            } else if (!action.equalsIgnoreCase("onStartFailed")) {
                LogManager.m6834d(BluetoothMedic.TAG, "Unknown event.", new Object[0]);
            } else if (intent.getIntExtra("errorCode", -1) == 4) {
                BluetoothMedic.this.sendNotification(context, "advertising failed", "Expected failure.  Power cycling.");
                if (!BluetoothMedic.this.cycleBluetoothIfNotTooSoon()) {
                    BluetoothMedic.this.sendNotification(context, "advertising failed", "Cannot power cycle bluetooth again");
                }
            }
        }
    };
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private long mLastBluetoothPowerCycleTime = 0;
    /* access modifiers changed from: private */
    public LocalBroadcastManager mLocalBroadcastManager;
    private boolean mNotificationChannelCreated = false;
    private int mNotificationIcon = 0;
    private boolean mNotificationsEnabled = false;
    /* access modifiers changed from: private */
    public Boolean mScanTestResult = null;
    private int mTestType = 0;
    /* access modifiers changed from: private */
    public Boolean mTransmitterTestResult = null;

    public static BluetoothMedic getInstance() {
        if (sInstance == null) {
            sInstance = new BluetoothMedic();
        }
        return sInstance;
    }

    private BluetoothMedic() {
    }

    private void initializeWithContext(Context context) {
        if (this.mAdapter == null || this.mLocalBroadcastManager == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
            if (bluetoothManager != null) {
                this.mAdapter = bluetoothManager.getAdapter();
                this.mLocalBroadcastManager = LocalBroadcastManager.getInstance(context);
                return;
            }
            throw new NullPointerException("Cannot get BluetoothManager");
        }
    }

    public void enablePowerCycleOnFailures(Context context) {
        initializeWithContext(context);
        LocalBroadcastManager localBroadcastManager = this.mLocalBroadcastManager;
        if (localBroadcastManager != null) {
            localBroadcastManager.registerReceiver(this.mBluetoothEventReceiver, new IntentFilter("onScanFailed"));
            this.mLocalBroadcastManager.registerReceiver(this.mBluetoothEventReceiver, new IntentFilter("onStartFailure"));
            String str = TAG;
            LogManager.m6834d(str, "Medic monitoring for transmission and scan failure notifications with receiver: " + this.mBluetoothEventReceiver, new Object[0]);
        }
    }

    public void enablePeriodicTests(Context context, int i) {
        initializeWithContext(context);
        this.mTestType = i;
        String str = TAG;
        LogManager.m6834d(str, "Medic scheduling periodic tests of types " + i, new Object[0]);
        scheduleRegularTests(context);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|12|13|(2:27|15)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean runScanTest(final android.content.Context r11) {
        /*
            r10 = this;
            r10.initializeWithContext(r11)
            r0 = 0
            r10.mScanTestResult = r0
            java.lang.String r0 = TAG
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Starting scan test"
            org.altbeacon.beacon.logging.LogManager.m6838i(r0, r3, r2)
            long r2 = java.lang.System.currentTimeMillis()
            android.bluetooth.BluetoothAdapter r0 = r10.mAdapter
            r4 = 1
            if (r0 == 0) goto L_0x0071
            android.bluetooth.le.BluetoothLeScanner r0 = r0.getBluetoothLeScanner()
            org.altbeacon.bluetooth.BluetoothMedic$2 r5 = new org.altbeacon.bluetooth.BluetoothMedic$2
            r5.<init>(r0, r11)
            if (r0 == 0) goto L_0x0068
            r0.startScan(r5)     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
        L_0x0027:
            java.lang.Boolean r11 = r10.mScanTestResult     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            if (r11 != 0) goto L_0x004d
            java.lang.String r11 = TAG     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            java.lang.String r6 = "Waiting for scan test to complete..."
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            org.altbeacon.beacon.logging.LogManager.m6834d(r11, r6, r7)     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x0039 }
        L_0x0039:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            long r6 = r6 - r2
            r8 = 5000(0x1388, double:2.4703E-320)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0027
            java.lang.String r11 = TAG     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            java.lang.String r2 = "Timeout running scan test"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            org.altbeacon.beacon.logging.LogManager.m6834d(r11, r2, r3)     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
        L_0x004d:
            r0.stopScan(r5)     // Catch:{ IllegalStateException -> 0x005e, NullPointerException -> 0x0051 }
            goto L_0x0071
        L_0x0051:
            r11 = move-exception
            java.lang.String r0 = TAG
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r1] = r11
            java.lang.String r11 = "NullPointerException. Cannot run scan test."
            org.altbeacon.beacon.logging.LogManager.m6836e(r0, r11, r2)
            goto L_0x0071
        L_0x005e:
            java.lang.String r11 = TAG
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Bluetooth is off.  Cannot run scan test."
            org.altbeacon.beacon.logging.LogManager.m6834d(r11, r2, r0)
            goto L_0x0071
        L_0x0068:
            java.lang.String r11 = TAG
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Cannot get scanner"
            org.altbeacon.beacon.logging.LogManager.m6834d(r11, r2, r0)
        L_0x0071:
            java.lang.String r11 = TAG
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "scan test complete"
            org.altbeacon.beacon.logging.LogManager.m6834d(r11, r2, r0)
            java.lang.Boolean r11 = r10.mScanTestResult
            if (r11 == 0) goto L_0x0084
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0085
        L_0x0084:
            r1 = 1
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.bluetooth.BluetoothMedic.runScanTest(android.content.Context):boolean");
    }

    public boolean runTransmitterTest(final Context context) {
        initializeWithContext(context);
        this.mTransmitterTestResult = null;
        long currentTimeMillis = System.currentTimeMillis();
        BluetoothAdapter bluetoothAdapter = this.mAdapter;
        if (bluetoothAdapter != null) {
            final BluetoothLeAdvertiser advertiserSafely = getAdvertiserSafely(bluetoothAdapter);
            if (advertiserSafely != null) {
                AdvertiseSettings build = new AdvertiseSettings.Builder().setAdvertiseMode(0).build();
                AdvertiseData build2 = new AdvertiseData.Builder().addManufacturerData(0, new byte[]{0}).build();
                LogManager.m6838i(TAG, "Starting transmitter test", new Object[0]);
                advertiserSafely.startAdvertising(build, build2, new AdvertiseCallback() {
                    public void onStartSuccess(AdvertiseSettings advertiseSettings) {
                        super.onStartSuccess(advertiseSettings);
                        LogManager.m6838i(BluetoothMedic.TAG, "Transmitter test succeeded", new Object[0]);
                        advertiserSafely.stopAdvertising(this);
                        Boolean unused = BluetoothMedic.this.mTransmitterTestResult = true;
                    }

                    public void onStartFailure(int i) {
                        super.onStartFailure(i);
                        Intent intent = new Intent("onStartFailed");
                        intent.putExtra("errorCode", i);
                        String access$000 = BluetoothMedic.TAG;
                        LogManager.m6834d(access$000, "Sending onStartFailure broadcast with " + BluetoothMedic.this.mLocalBroadcastManager, new Object[0]);
                        if (BluetoothMedic.this.mLocalBroadcastManager != null) {
                            BluetoothMedic.this.mLocalBroadcastManager.sendBroadcast(intent);
                        }
                        if (i == 4) {
                            Boolean unused = BluetoothMedic.this.mTransmitterTestResult = false;
                            LogManager.m6842w(BluetoothMedic.TAG, "Transmitter test failed in a way we consider a test failure", new Object[0]);
                            BluetoothMedic.this.sendNotification(context, "transmitter failed", "bluetooth not ok");
                            return;
                        }
                        Boolean unused2 = BluetoothMedic.this.mTransmitterTestResult = true;
                        LogManager.m6838i(BluetoothMedic.TAG, "Transmitter test failed, but not in a way we consider a test failure", new Object[0]);
                    }
                });
            } else {
                LogManager.m6834d(TAG, "Cannot get advertiser", new Object[0]);
            }
            while (true) {
                if (this.mTransmitterTestResult != null) {
                    break;
                }
                LogManager.m6834d(TAG, "Waiting for transmitter test to complete...", new Object[0]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException unused) {
                }
                if (System.currentTimeMillis() - currentTimeMillis > 5000) {
                    LogManager.m6834d(TAG, "Timeout running transmitter test", new Object[0]);
                    break;
                }
            }
        }
        LogManager.m6834d(TAG, "transmitter test complete", new Object[0]);
        Boolean bool = this.mTransmitterTestResult;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public void setNotificationsEnabled(boolean z, int i) {
        this.mNotificationsEnabled = z;
        this.mNotificationIcon = i;
    }

    /* access modifiers changed from: private */
    public boolean cycleBluetoothIfNotTooSoon() {
        long currentTimeMillis = System.currentTimeMillis() - this.mLastBluetoothPowerCycleTime;
        if (currentTimeMillis < 60000) {
            String str = TAG;
            LogManager.m6834d(str, "Not cycling bluetooth because we just did so " + currentTimeMillis + " milliseconds ago.", new Object[0]);
            return false;
        }
        this.mLastBluetoothPowerCycleTime = System.currentTimeMillis();
        LogManager.m6834d(TAG, "Power cycling bluetooth", new Object[0]);
        cycleBluetooth();
        return true;
    }

    private void cycleBluetooth() {
        LogManager.m6834d(TAG, "Power cycling bluetooth", new Object[0]);
        LogManager.m6834d(TAG, "Turning Bluetooth off.", new Object[0]);
        BluetoothAdapter bluetoothAdapter = this.mAdapter;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.disable();
            this.mHandler.postDelayed(new Runnable() {
                public void run() {
                    LogManager.m6834d(BluetoothMedic.TAG, "Turning Bluetooth back on.", new Object[0]);
                    if (BluetoothMedic.this.mAdapter != null) {
                        BluetoothMedic.this.mAdapter.enable();
                    }
                }
            }, 1000);
            return;
        }
        LogManager.m6842w(TAG, "Cannot cycle bluetooth.  Manager is null.", new Object[0]);
    }

    /* access modifiers changed from: private */
    public void sendNotification(Context context, String str, String str2) {
        initializeWithContext(context);
        if (this.mNotificationsEnabled) {
            if (!this.mNotificationChannelCreated) {
                createNotificationChannel(context, NotificationCompat.CATEGORY_ERROR);
            }
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, NotificationCompat.CATEGORY_ERROR);
            NotificationCompat.Builder contentText = builder.setContentTitle("BluetoothMedic: " + str).setSmallIcon(this.mNotificationIcon).setVibrate(new long[]{200, 100, 200}).setContentText(str2);
            TaskStackBuilder create = TaskStackBuilder.create(context);
            create.addNextIntent(new Intent("NoOperation"));
            contentText.setContentIntent(create.getPendingIntent(0, 134217728));
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.notify(1, contentText.build());
            }
        }
    }

    private void createNotificationChannel(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, "Errors", 3);
            notificationChannel.setDescription("Scan errors");
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
            this.mNotificationChannelCreated = true;
        }
    }

    private void scheduleRegularTests(Context context) {
        initializeWithContext(context);
        JobInfo.Builder builder = new JobInfo.Builder(BluetoothTestJob.getJobId(context), new ComponentName(context, BluetoothTestJob.class));
        builder.setRequiresCharging(false);
        builder.setRequiresDeviceIdle(false);
        builder.setPeriodic(PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("test_type", this.mTestType);
        builder.setExtras(persistableBundle);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.schedule(builder.build());
        }
    }

    private BluetoothLeAdvertiser getAdvertiserSafely(BluetoothAdapter bluetoothAdapter) {
        try {
            return bluetoothAdapter.getBluetoothLeAdvertiser();
        } catch (Exception e) {
            LogManager.m6842w(TAG, "Cannot get bluetoothLeAdvertiser", e);
            return null;
        }
    }
}
