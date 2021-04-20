package p035ru.unicorn.ujin.ble.ble_helper_class;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral;

/* renamed from: ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral */
public class BluetoothCentral {
    private static final int MAX_CONNECTED_PERIPHERALS = 7;
    private static final int MAX_CONNECTION_RETRIES = 1;
    public static final int SCAN_FAILED_ALREADY_STARTED = 1;
    public static final int SCAN_FAILED_APPLICATION_REGISTRATION_FAILED = 2;
    public static final int SCAN_FAILED_FEATURE_UNSUPPORTED = 4;
    public static final int SCAN_FAILED_INTERNAL_ERROR = 3;
    public static final int SCAN_FAILED_OUT_OF_HARDWARE_RESOURCES = 5;
    public static final int SCAN_FAILED_SCANNING_TOO_FREQUENTLY = 6;
    private static final int SCAN_RESTART_DELAY = 2000;
    private static final long SCAN_TIMEOUT = 180000;
    private final BroadcastReceiver adapterStateReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                final int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                BluetoothCentral.this.callBackHandler.post(new Runnable() {
                    public void run() {
                        BluetoothCentral.this.bluetoothCentralCallback.onBluetoothAdapterStateChanged(intExtra);
                    }
                });
                BluetoothCentral.this.handleAdapterState(intExtra);
            }
        }
    };
    private Runnable autoConnectRunnable;
    /* access modifiers changed from: private */
    public final ScanCallback autoConnectScanCallback = new ScanCallback() {
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x008d, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onScanResult(int r3, android.bluetooth.le.ScanResult r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r3 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this     // Catch:{ all -> 0x008e }
                boolean r3 = r3.isAutoScanning()     // Catch:{ all -> 0x008e }
                if (r3 != 0) goto L_0x000b
                monitor-exit(r2)     // Catch:{ all -> 0x008e }
                return
            L_0x000b:
                java.lang.String r3 = "TAG"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
                r0.<init>()     // Catch:{ all -> 0x008e }
                java.lang.String r1 = "peripheral with address '%s' found "
                r0.append(r1)     // Catch:{ all -> 0x008e }
                android.bluetooth.BluetoothDevice r1 = r4.getDevice()     // Catch:{ all -> 0x008e }
                java.lang.String r1 = r1.getAddress()     // Catch:{ all -> 0x008e }
                r0.append(r1)     // Catch:{ all -> 0x008e }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008e }
                android.util.Log.d(r3, r0)     // Catch:{ all -> 0x008e }
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r3 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this     // Catch:{ all -> 0x008e }
                r3.stopAutoconnectScan()     // Catch:{ all -> 0x008e }
                android.bluetooth.BluetoothDevice r3 = r4.getDevice()     // Catch:{ all -> 0x008e }
                java.lang.String r3 = r3.getAddress()     // Catch:{ all -> 0x008e }
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r4 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this     // Catch:{ all -> 0x008e }
                java.util.Map r4 = r4.unconnectedPeripherals     // Catch:{ all -> 0x008e }
                java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x008e }
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral r4 = (p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral) r4     // Catch:{ all -> 0x008e }
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r0 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this     // Catch:{ all -> 0x008e }
                java.util.Map r0 = r0.reconnectCallbacks     // Catch:{ all -> 0x008e }
                java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x008e }
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheralCallback r0 = (p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheralCallback) r0     // Catch:{ all -> 0x008e }
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r1 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this     // Catch:{ all -> 0x008e }
                java.util.List r1 = r1.reconnectPeripheralAddresses     // Catch:{ all -> 0x008e }
                r1.remove(r3)     // Catch:{ all -> 0x008e }
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r1 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this     // Catch:{ all -> 0x008e }
                java.util.Map r1 = r1.reconnectCallbacks     // Catch:{ all -> 0x008e }
                r1.remove(r3)     // Catch:{ all -> 0x008e }
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r1 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this     // Catch:{ all -> 0x008e }
                java.util.Map r1 = r1.unconnectedPeripherals     // Catch:{ all -> 0x008e }
                r1.remove(r3)     // Catch:{ all -> 0x008e }
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r1 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this     // Catch:{ all -> 0x008e }
                java.util.Map r1 = r1.scannedPeripherals     // Catch:{ all -> 0x008e }
                r1.remove(r3)     // Catch:{ all -> 0x008e }
                if (r4 == 0) goto L_0x007b
                if (r0 == 0) goto L_0x007b
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r3 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this     // Catch:{ all -> 0x008e }
                r3.connectPeripheral(r4, r0)     // Catch:{ all -> 0x008e }
            L_0x007b:
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r3 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this     // Catch:{ all -> 0x008e }
                java.util.List r3 = r3.reconnectPeripheralAddresses     // Catch:{ all -> 0x008e }
                int r3 = r3.size()     // Catch:{ all -> 0x008e }
                if (r3 <= 0) goto L_0x008c
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r3 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this     // Catch:{ all -> 0x008e }
                r3.scanForAutoConnectPeripherals()     // Catch:{ all -> 0x008e }
            L_0x008c:
                monitor-exit(r2)     // Catch:{ all -> 0x008e }
                return
            L_0x008e:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x008e }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.C56883.onScanResult(int, android.bluetooth.le.ScanResult):void");
        }

        public void onScanFailed(final int i) {
            BluetoothCentral.this.callBackHandler.post(new Runnable() {
                public void run() {
                    BluetoothCentral.this.bluetoothCentralCallback.onScanFailed(i);
                }
            });
        }
    };
    private final ScanSettings autoConnectScanSettings;
    /* access modifiers changed from: private */
    public BluetoothLeScanner autoConnectScanner;
    /* access modifiers changed from: private */
    public final BluetoothAdapter bluetoothAdapter;
    /* access modifiers changed from: private */
    public final BluetoothCentralCallback bluetoothCentralCallback;
    private BluetoothLeScanner bluetoothScanner;
    /* access modifiers changed from: private */
    public final Handler callBackHandler;
    private final Object connectLock = new Object();
    /* access modifiers changed from: private */
    public final Map<String, BluetoothPeripheral> connectedPeripherals = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final Map<String, Integer> connectionRetries = new ConcurrentHashMap();
    private final Context context;
    /* access modifiers changed from: private */
    public ScanCallback currentCallback;
    /* access modifiers changed from: private */
    public List<ScanFilter> currentFilters;
    private final ScanCallback defaultScanCallback = new ScanCallback() {
        public void onScanResult(int i, final ScanResult scanResult) {
            synchronized (this) {
                BluetoothCentral.this.callBackHandler.post(new Runnable() {
                    public void run() {
                        if (BluetoothCentral.this.isScanning()) {
                            BluetoothPeripheral peripheral = BluetoothCentral.this.getPeripheral(scanResult.getDevice().getAddress());
                            peripheral.setDevice(scanResult.getDevice());
                            BluetoothCentral.this.bluetoothCentralCallback.onDiscoveredPeripheral(peripheral, scanResult);
                        }
                    }
                });
            }
        }

        public void onScanFailed(final int i) {
            BluetoothCentral.this.callBackHandler.post(new Runnable() {
                public void run() {
                    BluetoothCentral.this.bluetoothCentralCallback.onScanFailed(i);
                }
            });
        }
    };
    /* access modifiers changed from: private */
    public Runnable disconnectRunnable;
    /* access modifiers changed from: private */
    public boolean expectingBluetoothOffDisconnects = false;
    private final BluetoothPeripheral.InternalCallback internalCallback = new BluetoothPeripheral.InternalCallback() {
        public void connected(final BluetoothPeripheral bluetoothPeripheral) {
            BluetoothCentral.this.connectionRetries.remove(bluetoothPeripheral.getAddress());
            BluetoothCentral.this.unconnectedPeripherals.remove(bluetoothPeripheral.getAddress());
            BluetoothCentral.this.scannedPeripherals.remove(bluetoothPeripheral.getAddress());
            BluetoothCentral.this.connectedPeripherals.put(bluetoothPeripheral.getAddress(), bluetoothPeripheral);
            BluetoothCentral.this.connectedPeripherals.size();
            BluetoothCentral.this.callBackHandler.post(new Runnable() {
                public void run() {
                    BluetoothCentral.this.bluetoothCentralCallback.onConnectedPeripheral(bluetoothPeripheral);
                }
            });
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x002a, code lost:
            r0 = (java.lang.Integer) p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.access$1000(r4.this$0).get(r5.getAddress());
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void connectFailed(final p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral r5, final int r6) {
            /*
                r4 = this;
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r0 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this
                java.util.Map r0 = r0.unconnectedPeripherals
                java.lang.String r1 = r5.getAddress()
                r0.remove(r1)
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r0 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this
                java.util.Map r0 = r0.scannedPeripherals
                java.lang.String r1 = r5.getAddress()
                r0.remove(r1)
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r0 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this
                java.util.Map r0 = r0.connectionRetries
                java.lang.String r1 = r5.getAddress()
                java.lang.Object r0 = r0.get(r1)
                if (r0 == 0) goto L_0x0041
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r0 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this
                java.util.Map r0 = r0.connectionRetries
                java.lang.String r1 = r5.getAddress()
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L_0x0041
                int r0 = r0.intValue()
                goto L_0x0042
            L_0x0041:
                r0 = 0
            L_0x0042:
                java.lang.String r1 = "TAG"
                r2 = 1
                if (r0 >= r2) goto L_0x008d
                r3 = 8
                if (r6 == r3) goto L_0x008d
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r3 = "retrying connection to '%s' (%s)"
                r6.append(r3)
                java.lang.String r3 = r5.getName()
                r6.append(r3)
                java.lang.String r3 = r5.getAddress()
                r6.append(r3)
                java.lang.String r6 = r6.toString()
                android.util.Log.d(r1, r6)
                int r0 = r0 + r2
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r6 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this
                java.util.Map r6 = r6.connectionRetries
                java.lang.String r1 = r5.getAddress()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r6.put(r1, r0)
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r6 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this
                java.util.Map r6 = r6.unconnectedPeripherals
                java.lang.String r0 = r5.getAddress()
                r6.put(r0, r5)
                r5.connect()
                goto L_0x00c7
            L_0x008d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "connection to '%s' (%s) failed"
                r0.append(r2)
                java.lang.String r2 = r5.getName()
                r0.append(r2)
                java.lang.String r2 = r5.getAddress()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r1, r0)
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r0 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this
                java.util.Map r0 = r0.connectionRetries
                java.lang.String r1 = r5.getAddress()
                r0.remove(r1)
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r0 = p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.this
                android.os.Handler r0 = r0.callBackHandler
                ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral$4$2 r1 = new ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral$4$2
                r1.<init>(r5, r6)
                r0.post(r1)
            L_0x00c7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral.C56904.connectFailed(ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral, int):void");
        }

        public void disconnected(final BluetoothPeripheral bluetoothPeripheral, final int i) {
            if (BluetoothCentral.this.expectingBluetoothOffDisconnects) {
                BluetoothCentral.this.cancelDisconnectionTimer();
                boolean unused = BluetoothCentral.this.expectingBluetoothOffDisconnects = false;
            }
            BluetoothCentral.this.connectedPeripherals.remove(bluetoothPeripheral.getAddress());
            BluetoothCentral.this.unconnectedPeripherals.remove(bluetoothPeripheral.getAddress());
            BluetoothCentral.this.scannedPeripherals.remove(bluetoothPeripheral.getAddress());
            BluetoothCentral.this.connectionRetries.remove(bluetoothPeripheral.getAddress());
            BluetoothCentral.this.callBackHandler.post(new Runnable() {
                public void run() {
                    BluetoothCentral.this.bluetoothCentralCallback.onDisconnectedPeripheral(bluetoothPeripheral, i);
                }
            });
        }

        public String getPincode(BluetoothPeripheral bluetoothPeripheral) {
            return (String) BluetoothCentral.this.pinCodes.get(bluetoothPeripheral.getAddress());
        }
    };
    /* access modifiers changed from: private */
    public final Handler mainHandler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public final Map<String, String> pinCodes = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final Map<String, BluetoothPeripheralCallback> reconnectCallbacks = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final List<String> reconnectPeripheralAddresses = new ArrayList();
    private final ScanCallback scanByNameCallback = new ScanCallback() {
        public void onScanResult(int i, final ScanResult scanResult) {
            synchronized (this) {
                String name = scanResult.getDevice().getName();
                if (name != null) {
                    if (BluetoothCentral.this.scanPeripheralNames != null) {
                        for (String contains : BluetoothCentral.this.scanPeripheralNames) {
                            if (name.contains(contains)) {
                                BluetoothCentral.this.callBackHandler.post(new Runnable() {
                                    public void run() {
                                        if (BluetoothCentral.this.isScanning()) {
                                            BluetoothPeripheral peripheral = BluetoothCentral.this.getPeripheral(scanResult.getDevice().getAddress());
                                            peripheral.setDevice(scanResult.getDevice());
                                            BluetoothCentral.this.bluetoothCentralCallback.onDiscoveredPeripheral(peripheral, scanResult);
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                }
            }
        }

        public void onScanFailed(final int i) {
            BluetoothCentral.this.callBackHandler.post(new Runnable() {
                public void run() {
                    BluetoothCentral.this.bluetoothCentralCallback.onScanFailed(i);
                }
            });
        }
    };
    /* access modifiers changed from: private */
    public String[] scanPeripheralNames;
    /* access modifiers changed from: private */
    public ScanSettings scanSettings;
    /* access modifiers changed from: private */
    public final Map<String, BluetoothPeripheral> scannedPeripherals = new ConcurrentHashMap();
    private Runnable timeoutRunnable;
    /* access modifiers changed from: private */
    public final Map<String, BluetoothPeripheral> unconnectedPeripherals = new ConcurrentHashMap();

    private String scanErrorToString(int i) {
        switch (i) {
            case 1:
                return "ALREADY STARTED";
            case 2:
                return "APPLICATION REGISTRATION FAILED";
            case 3:
                return "INTERNAL ERROR";
            case 4:
                return "FEATURE UNSUPPORTED";
            case 5:
                return "OUT OF HARDWARE RESOURCES";
            case 6:
                return "SCANNING TOO FREQUENTLY";
            default:
                return "UNKNOWN";
        }
    }

    public BluetoothCentral(Context context2, BluetoothCentralCallback bluetoothCentralCallback2, Handler handler) {
        this.context = (Context) Objects.requireNonNull(context2, "no valid context provided");
        this.bluetoothCentralCallback = (BluetoothCentralCallback) Objects.requireNonNull(bluetoothCentralCallback2, "no valid bluetoothCallback provided");
        this.callBackHandler = (Handler) Objects.requireNonNull(handler, "no valid handler provided");
        this.bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (Build.VERSION.SDK_INT >= 23) {
            this.autoConnectScanSettings = new ScanSettings.Builder().setScanMode(0).setCallbackType(1).setMatchMode(1).setNumOfMatches(1).setReportDelay(0).build();
        } else {
            this.autoConnectScanSettings = new ScanSettings.Builder().setScanMode(0).setReportDelay(0).build();
        }
        setScanMode(2);
        context2.registerReceiver(this.adapterStateReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    public void close() {
        this.unconnectedPeripherals.clear();
        this.connectedPeripherals.clear();
        this.reconnectCallbacks.clear();
        this.reconnectPeripheralAddresses.clear();
        Context context2 = this.context;
        if (context2 != null) {
            try {
                context2.unregisterReceiver(this.adapterStateReceiver);
            } catch (Exception e) {
                Log.e("Bluetooth error", e.getLocalizedMessage());
            }
        }
    }

    public boolean setScanMode(int i) {
        if (i != 0 && i != 2 && i != 1 && i != -1) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.scanSettings = new ScanSettings.Builder().setScanMode(i).setCallbackType(1).setMatchMode(1).setNumOfMatches(1).setReportDelay(0).build();
        } else {
            this.scanSettings = new ScanSettings.Builder().setScanMode(i).setReportDelay(0).build();
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void startScan(List<ScanFilter> list, ScanSettings scanSettings2, ScanCallback scanCallback) {
        if (isBleReady()) {
            if (isScanning()) {
                Log.d("TAG", "other scan still active, stopping scan");
                stopScan();
            }
            if (this.bluetoothScanner == null) {
                this.bluetoothScanner = this.bluetoothAdapter.getBluetoothLeScanner();
            }
            if (this.bluetoothScanner != null) {
                setScanTimer();
                this.currentCallback = scanCallback;
                this.currentFilters = list;
                this.bluetoothScanner.startScan(list, scanSettings2, scanCallback);
                Log.d("TAG", "scan started");
                return;
            }
            Log.d("TAG", "starting scan failed");
        }
    }

    public void scanForPeripheralsWithServices(UUID[] uuidArr) {
        Objects.requireNonNull(uuidArr, "no service UUIDs supplied");
        if (uuidArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (UUID parcelUuid : uuidArr) {
                arrayList.add(new ScanFilter.Builder().setServiceUuid(new ParcelUuid(parcelUuid)).build());
            }
            startScan(arrayList, this.scanSettings, this.defaultScanCallback);
            return;
        }
        throw new IllegalArgumentException("at least one service UUID  must be supplied");
    }

    public void scanForPeripheralsWithNames(String[] strArr) {
        Objects.requireNonNull(strArr, "No peripheral names supplied");
        if (strArr.length != 0) {
            this.scanPeripheralNames = strArr;
            startScan((List<ScanFilter>) null, this.scanSettings, this.scanByNameCallback);
            return;
        }
        throw new IllegalArgumentException("at least one peripheral name must be supplied");
    }

    public void scanForPeripheralsWithAddresses(String[] strArr) {
        Objects.requireNonNull(strArr, "No peripheral addresses supplied");
        if (strArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (BluetoothAdapter.checkBluetoothAddress(str)) {
                    arrayList.add(new ScanFilter.Builder().setDeviceAddress(str).build());
                } else {
                    Log.d("TAG", "%s is not a valid address. Make sure all alphabetic characters are uppercase." + str);
                }
            }
            startScan(arrayList, this.scanSettings, this.defaultScanCallback);
            return;
        }
        throw new IllegalArgumentException("at least one peripheral address must be supplied");
    }

    public void scanForPeripheralsUsingFilters(List<ScanFilter> list) {
        Objects.requireNonNull(list, "no filters supplied");
        if (!list.isEmpty()) {
            startScan(list, this.scanSettings, this.defaultScanCallback);
            return;
        }
        throw new IllegalArgumentException("at least one scan filter must be supplied");
    }

    public void scanForPeripherals() {
        startScan((List<ScanFilter>) null, this.scanSettings, this.defaultScanCallback);
    }

    /* access modifiers changed from: private */
    public void scanForAutoConnectPeripherals() {
        if (isBleReady()) {
            if (this.autoConnectScanner != null) {
                stopAutoconnectScan();
            }
            this.autoConnectScanner = this.bluetoothAdapter.getBluetoothLeScanner();
            if (this.autoConnectScanner != null) {
                ArrayList arrayList = new ArrayList();
                for (String deviceAddress : this.reconnectPeripheralAddresses) {
                    arrayList.add(new ScanFilter.Builder().setDeviceAddress(deviceAddress).build());
                }
                this.autoConnectScanner.startScan(arrayList, this.autoConnectScanSettings, this.autoConnectScanCallback);
                Log.d("TAG", "started scanning to autoconnect peripherals (" + this.reconnectPeripheralAddresses.size() + ")");
                setAutoConnectTimer();
                return;
            }
            Log.d("TAG", "starting autoconnect scan failed");
        }
    }

    /* access modifiers changed from: private */
    public void stopAutoconnectScan() {
        cancelAutoConnectTimer();
        BluetoothLeScanner bluetoothLeScanner = this.autoConnectScanner;
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.stopScan(this.autoConnectScanCallback);
            this.autoConnectScanner = null;
            Log.d("TAG", "autoscan stopped");
        }
    }

    /* access modifiers changed from: private */
    public boolean isAutoScanning() {
        return this.autoConnectScanner != null;
    }

    public void stopScan() {
        cancelTimeoutTimer();
        if (isScanning()) {
            this.bluetoothScanner.stopScan(this.currentCallback);
            Log.d("TAG", "scan stopped");
        } else {
            Log.d("TAG", "no scan to stop because no scan is running");
            ScanCallback scanCallback = this.currentCallback;
            if (scanCallback != null) {
                this.bluetoothScanner.flushPendingScanResults(scanCallback);
            }
        }
        this.currentCallback = null;
        this.currentFilters = null;
        this.scannedPeripherals.clear();
    }

    public boolean isScanning() {
        Log.d("TAG", "xxx isScanning " + this.bluetoothScanner + " " + this.currentCallback);
        return (this.bluetoothScanner == null || this.currentCallback == null) ? false : true;
    }

    public void connectPeripheral(BluetoothPeripheral bluetoothPeripheral, BluetoothPeripheralCallback bluetoothPeripheralCallback) {
        synchronized (this.connectLock) {
            Objects.requireNonNull(bluetoothPeripheral, "no valid peripheral specified");
            Objects.requireNonNull(bluetoothPeripheralCallback, "no valid peripheral callback specified");
            if (this.connectedPeripherals.containsKey(bluetoothPeripheral.getAddress())) {
                Log.d("TAG", "already connected to %s'" + bluetoothPeripheral.getAddress());
            } else if (this.unconnectedPeripherals.containsKey(bluetoothPeripheral.getAddress())) {
                this.bluetoothCentralCallback.onDisconnectedPeripheral(bluetoothPeripheral, 0);
                Log.d("TAG", "already connecting to %s'" + bluetoothPeripheral.getAddress());
            } else {
                if (bluetoothPeripheral.getType() == 0) {
                    Log.d("TAG", "peripheral with address '%s' is not in the Bluetooth cache, hence connection may fail " + bluetoothPeripheral.getAddress());
                }
                bluetoothPeripheral.setPeripheralCallback(bluetoothPeripheralCallback);
                this.scannedPeripherals.remove(bluetoothPeripheral.getAddress());
                this.unconnectedPeripherals.put(bluetoothPeripheral.getAddress(), bluetoothPeripheral);
                bluetoothPeripheral.connect();
            }
        }
    }

    public void autoConnectPeripheral(BluetoothPeripheral bluetoothPeripheral, BluetoothPeripheralCallback bluetoothPeripheralCallback) {
        synchronized (this.connectLock) {
            Objects.requireNonNull(bluetoothPeripheral, "no valid peripheral specified");
            Objects.requireNonNull(bluetoothPeripheralCallback, "no valid peripheral callback specified");
            if (this.connectedPeripherals.containsKey(bluetoothPeripheral.getAddress())) {
                Log.d("TAG", "already connected to %s' " + bluetoothPeripheral.getAddress());
            } else if (this.unconnectedPeripherals.get(bluetoothPeripheral.getAddress()) != null) {
                Log.d("TAG", "already issued autoconnect for '%s'  " + bluetoothPeripheral.getAddress());
            } else {
                int type = bluetoothPeripheral.getType();
                if (type == 0) {
                    Log.d("TAG", "peripheral with address '%s' not in Bluetooth cache, autoconnecting by scanning " + bluetoothPeripheral.getAddress());
                    this.scannedPeripherals.remove(bluetoothPeripheral.getAddress());
                    this.unconnectedPeripherals.put(bluetoothPeripheral.getAddress(), bluetoothPeripheral);
                    autoConnectPeripheralByScan(bluetoothPeripheral.getAddress(), bluetoothPeripheralCallback);
                } else if (type == 2 || type == 3) {
                    bluetoothPeripheral.setPeripheralCallback(bluetoothPeripheralCallback);
                    this.scannedPeripherals.remove(bluetoothPeripheral.getAddress());
                    this.unconnectedPeripherals.put(bluetoothPeripheral.getAddress(), bluetoothPeripheral);
                    bluetoothPeripheral.autoConnect();
                } else {
                    Log.d("TAG", "peripheral does not support Bluetooth LE");
                }
            }
        }
    }

    private void autoConnectPeripheralByScan(String str, BluetoothPeripheralCallback bluetoothPeripheralCallback) {
        if (this.reconnectPeripheralAddresses.contains(str)) {
            Log.d("TAG", "peripheral already on list for reconnection");
            return;
        }
        this.reconnectPeripheralAddresses.add(str);
        this.reconnectCallbacks.put(str, bluetoothPeripheralCallback);
        scanForAutoConnectPeripherals();
    }

    public void cancelConnection(final BluetoothPeripheral bluetoothPeripheral) {
        Objects.requireNonNull(bluetoothPeripheral, "no valid peripheral specified");
        String address = bluetoothPeripheral.getAddress();
        if (this.reconnectPeripheralAddresses.contains(address)) {
            this.reconnectPeripheralAddresses.remove(address);
            this.reconnectCallbacks.remove(address);
            this.unconnectedPeripherals.remove(address);
            stopAutoconnectScan();
            Log.d("TAG", "cancelling autoconnect for %s " + address);
            this.callBackHandler.post(new Runnable() {
                public void run() {
                    BluetoothCentral.this.bluetoothCentralCallback.onDisconnectedPeripheral(bluetoothPeripheral, 0);
                }
            });
            if (this.reconnectPeripheralAddresses.size() > 0) {
                scanForAutoConnectPeripherals();
            }
        } else if (this.unconnectedPeripherals.containsKey(address) || this.connectedPeripherals.containsKey(address)) {
            bluetoothPeripheral.cancelConnection();
        } else {
            Log.d("TAG", "cannot cancel connection to unknown peripheral %s " + address);
        }
    }

    public void autoConnectPeripheralsBatch(Map<BluetoothPeripheral, BluetoothPeripheralCallback> map) {
        Objects.requireNonNull(map, "no valid batch provided");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (BluetoothPeripheral next : map.keySet()) {
            if (next.getType() == 0) {
                hashMap.put(next, map.get(next));
            } else {
                hashMap2.put(next, map.get(next));
            }
        }
        for (BluetoothPeripheral bluetoothPeripheral : hashMap2.keySet()) {
            autoConnectPeripheral(bluetoothPeripheral, (BluetoothPeripheralCallback) Objects.requireNonNull(hashMap2.get(bluetoothPeripheral)));
        }
        if (!hashMap.isEmpty()) {
            for (BluetoothPeripheral bluetoothPeripheral2 : hashMap.keySet()) {
                String address = bluetoothPeripheral2.getAddress();
                if (this.reconnectPeripheralAddresses.contains(address)) {
                    Log.d("TAG", "peripheral already on list for reconnection");
                } else {
                    this.reconnectPeripheralAddresses.add(address);
                }
                this.reconnectCallbacks.put(address, hashMap.get(bluetoothPeripheral2));
                this.unconnectedPeripherals.put(bluetoothPeripheral2.getAddress(), bluetoothPeripheral2);
            }
            scanForAutoConnectPeripherals();
        }
    }

    public BluetoothPeripheral getPeripheral(String str) {
        Objects.requireNonNull(str, "no valid peripheral address provided");
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            throw new IllegalArgumentException(String.format("%s is not a valid bluetooth address. Make sure all alphabetic characters are uppercase.", new Object[]{str}));
        } else if (this.connectedPeripherals.containsKey(str)) {
            return (BluetoothPeripheral) Objects.requireNonNull(this.connectedPeripherals.get(str));
        } else {
            if (this.unconnectedPeripherals.containsKey(str)) {
                return (BluetoothPeripheral) Objects.requireNonNull(this.unconnectedPeripherals.get(str));
            }
            if (this.scannedPeripherals.containsKey(str)) {
                return (BluetoothPeripheral) Objects.requireNonNull(this.scannedPeripherals.get(str));
            }
            BluetoothPeripheral bluetoothPeripheral = new BluetoothPeripheral(this.context, this.bluetoothAdapter.getRemoteDevice(str), this.internalCallback, (BluetoothPeripheralCallback) null, this.callBackHandler);
            this.scannedPeripherals.put(str, bluetoothPeripheral);
            return bluetoothPeripheral;
        }
    }

    public List<BluetoothPeripheral> getConnectedPeripherals() {
        return new ArrayList(this.connectedPeripherals.values());
    }

    private boolean isBleReady() {
        if (!isBleSupported() || !isBluetoothEnabled()) {
            return false;
        }
        return permissionsGranted();
    }

    private boolean isBleSupported() {
        if (this.bluetoothAdapter != null && this.context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return true;
        }
        Log.d("TAG", "BLE not supported");
        return false;
    }

    public boolean isBluetoothEnabled() {
        if (this.bluetoothAdapter.isEnabled()) {
            return true;
        }
        Log.d("TAG", "Bluetooth disabled");
        return false;
    }

    public boolean permissionsGranted() {
        int i = this.context.getApplicationInfo().targetSdkVersion;
        if (Build.VERSION.SDK_INT < 29 || i < 29) {
            if (Build.VERSION.SDK_INT < 23 || this.context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                return true;
            }
            Log.d("TAG", "no ACCESS_COARSE_LOCATION permission, cannot scan");
            return false;
        } else if (this.context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        } else {
            Log.d("TAG", "no ACCESS_FINE_LOCATION permission, cannot scan");
            return false;
        }
    }

    private void setScanTimer() {
        cancelTimeoutTimer();
        this.timeoutRunnable = new Runnable() {
            public void run() {
                Log.d("TAG", "scanning timeout, restarting scan");
                final ScanCallback access$1500 = BluetoothCentral.this.currentCallback;
                final List access$1600 = BluetoothCentral.this.currentFilters;
                BluetoothCentral.this.stopScan();
                BluetoothCentral.this.callBackHandler.postDelayed(new Runnable() {
                    public void run() {
                        BluetoothCentral.this.startScan(access$1600, BluetoothCentral.this.scanSettings, access$1500);
                    }
                }, 2000);
            }
        };
        this.mainHandler.postDelayed(this.timeoutRunnable, SCAN_TIMEOUT);
    }

    private void cancelTimeoutTimer() {
        Runnable runnable = this.timeoutRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
            this.timeoutRunnable = null;
        }
    }

    private void setAutoConnectTimer() {
        cancelAutoConnectTimer();
        this.autoConnectRunnable = new Runnable() {
            public void run() {
                Log.d("TAG", "autoconnect scan timeout, restarting scan");
                if (BluetoothCentral.this.autoConnectScanner != null) {
                    BluetoothCentral.this.autoConnectScanner.stopScan(BluetoothCentral.this.autoConnectScanCallback);
                    BluetoothLeScanner unused = BluetoothCentral.this.autoConnectScanner = null;
                }
                BluetoothCentral.this.mainHandler.postDelayed(new Runnable() {
                    public void run() {
                        BluetoothCentral.this.scanForAutoConnectPeripherals();
                    }
                }, 2000);
            }
        };
        this.mainHandler.postDelayed(this.autoConnectRunnable, SCAN_TIMEOUT);
    }

    private void cancelAutoConnectTimer() {
        Runnable runnable = this.autoConnectRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
            this.autoConnectRunnable = null;
        }
    }

    public boolean setPinCodeForPeripheral(String str, String str2) {
        Objects.requireNonNull(str, "no peripheral address provided");
        Objects.requireNonNull(str2, "no pin provided");
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            Log.d("TAG", "%s is not a valid address. Make sure all alphabetic characters are uppercase. " + str);
            return false;
        } else if (str2.length() != 6) {
            Log.d("TAG", "%s is not 6 digits long " + str2);
            return false;
        } else {
            this.pinCodes.put(str, str2);
            return true;
        }
    }

    public boolean removeBond(String str) {
        Objects.requireNonNull(str, "no peripheral address provided");
        Set<BluetoothDevice> bondedDevices = this.bluetoothAdapter.getBondedDevices();
        if (bondedDevices.size() > 0) {
            BluetoothDevice bluetoothDevice = null;
            for (BluetoothDevice next : bondedDevices) {
                if (next.getAddress().equals(str)) {
                    bluetoothDevice = next;
                }
            }
            if (bluetoothDevice != null) {
                try {
                    boolean booleanValue = ((Boolean) bluetoothDevice.getClass().getMethod("removeBond", (Class[]) null).invoke(bluetoothDevice, (Object[]) null)).booleanValue();
                    if (booleanValue) {
                        Log.d("TAG", "Succesfully removed bond for '%s'" + bluetoothDevice.getName());
                    }
                    return booleanValue;
                } catch (Exception e) {
                    Log.d("TAG", "could not remove bond");
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }

    public void startPairingPopupHack() {
        if (!Build.MANUFACTURER.equals("samsung")) {
            this.bluetoothAdapter.startDiscovery();
            this.callBackHandler.postDelayed(new Runnable() {
                public void run() {
                    Log.d("TAG", "popup hack completed");
                    BluetoothCentral.this.bluetoothAdapter.cancelDiscovery();
                }
            }, 1000);
        }
    }

    /* access modifiers changed from: private */
    public void cancelAllConnectionsWhenBluetoothOff() {
        Log.d("TAG", "disconnect all peripherals because bluetooth is off");
        for (BluetoothPeripheral disconnectWhenBluetoothOff : this.connectedPeripherals.values()) {
            disconnectWhenBluetoothOff.disconnectWhenBluetoothOff();
        }
        this.connectedPeripherals.clear();
        for (BluetoothPeripheral disconnectWhenBluetoothOff2 : this.unconnectedPeripherals.values()) {
            disconnectWhenBluetoothOff2.disconnectWhenBluetoothOff();
        }
        this.unconnectedPeripherals.clear();
        this.reconnectPeripheralAddresses.clear();
        this.reconnectCallbacks.clear();
    }

    private void startDisconnectionTimer() {
        cancelDisconnectionTimer();
        this.disconnectRunnable = new Runnable() {
            public void run() {
                Log.d("TAG", "bluetooth turned off but no automatic disconnects happening, so doing it ourselves");
                BluetoothCentral.this.cancelAllConnectionsWhenBluetoothOff();
                Runnable unused = BluetoothCentral.this.disconnectRunnable = null;
            }
        };
        this.mainHandler.postDelayed(this.disconnectRunnable, 2000);
    }

    /* access modifiers changed from: private */
    public void cancelDisconnectionTimer() {
        Runnable runnable = this.disconnectRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
            this.disconnectRunnable = null;
        }
    }

    /* access modifiers changed from: private */
    public void handleAdapterState(int i) {
        switch (i) {
            case 10:
                if (this.connectedPeripherals.size() > 0 || this.unconnectedPeripherals.size() > 0) {
                    this.expectingBluetoothOffDisconnects = true;
                    startDisconnectionTimer();
                }
                Log.d("TAG", "bluetooth turned off");
                return;
            case 11:
                this.expectingBluetoothOffDisconnects = false;
                Log.d("TAG", "bluetooth turning on");
                return;
            case 12:
                this.expectingBluetoothOffDisconnects = false;
                Log.d("TAG", "bluetooth turned on");
                return;
            case 13:
                this.expectingBluetoothOffDisconnects = true;
                cancelTimeoutTimer();
                cancelAutoConnectTimer();
                this.currentCallback = null;
                this.currentFilters = null;
                this.autoConnectScanner = null;
                Log.d("TAG", "bluetooth turning off");
                return;
            default:
                return;
        }
    }
}
