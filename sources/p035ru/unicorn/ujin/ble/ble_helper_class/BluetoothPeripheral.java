package p035ru.unicorn.ujin.ble.ble_helper_class;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import p035ru.unicorn.ujin.ble.BleUtil;

/* renamed from: ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral */
public class BluetoothPeripheral {
    public static final int BLE_HCI_CONN_TERMINATED_DUE_TO_MIC_FAILURE = 61;
    public static final int BOND_BONDED = 12;
    public static final int BOND_BONDING = 11;
    public static final int BOND_NONE = 10;
    private static final String CCC_DESCRIPTOR_UUID = "00002902-0000-1000-8000-00805f9b34fb";
    private static final int CONNECTION_TIMEOUT_IN_MS = 35000;
    private static final long DELAY_AFTER_BOND_LOST = 1000;
    public static final int DEVICE_TYPE_CLASSIC = 1;
    public static final int DEVICE_TYPE_DUAL = 3;
    public static final int DEVICE_TYPE_LE = 2;
    public static final int DEVICE_TYPE_UNKNOWN = 0;
    private static final int DIRECT_CONNECTION_DELAY_IN_MS = 100;
    public static final int GATT_AUTH_FAIL = 137;
    public static final int GATT_BUSY = 132;
    public static final int GATT_CONN_CANCEL = 256;
    public static final int GATT_CONN_FAIL_ESTABLISH = 62;
    public static final int GATT_CONN_L2C_FAILURE = 1;
    public static final int GATT_CONN_LMP_TIMEOUT = 34;
    public static final int GATT_CONN_TERMINATE_LOCAL_HOST = 22;
    public static final int GATT_CONN_TERMINATE_PEER_USER = 19;
    public static final int GATT_CONN_TIMEOUT = 8;
    public static final int GATT_ERROR = 133;
    public static final int GATT_INSUFFICIENT_AUTHENTICATION = 5;
    public static final int GATT_INSUFFICIENT_ENCRYPTION = 15;
    public static final int GATT_INTERNAL_ERROR = 129;
    public static final int GATT_NO_RESOURCES = 128;
    public static final int GATT_READ_NOT_PERMITTED = 2;
    public static final int GATT_REQUEST_NOT_SUPPORTED = 6;
    public static final int GATT_SUCCESS = 0;
    public static final int GATT_WRITE_NOT_PERMITTED = 3;
    private static final int MAX_NOTIFYING_CHARACTERISTICS = 15;
    private static final int MAX_TRIES = 2;
    private static final int PAIRING_VARIANT_CONSENT = 3;
    private static final int PAIRING_VARIANT_DISPLAY_PASSKEY = 4;
    private static final int PAIRING_VARIANT_DISPLAY_PIN = 5;
    private static final int PAIRING_VARIANT_OOB_CONSENT = 6;
    private static final int PAIRING_VARIANT_PASSKEY = 1;
    private static final int PAIRING_VARIANT_PASSKEY_CONFIRMATION = 2;
    private static final int PAIRING_VARIANT_PIN = 0;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_DISCONNECTING = 3;
    private static final int TIMEOUT_THRESHOLD_DEFAULT = 25000;
    private static final int TIMEOUT_THRESHOLD_SAMSUNG = 4500;
    /* access modifiers changed from: private */
    public volatile BluetoothGatt bluetoothGatt;
    /* access modifiers changed from: private */
    public final BluetoothGattCallback bluetoothGattCallback = new BluetoothGattCallback() {
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - BluetoothPeripheral.this.connectTimestamp;
            BluetoothPeripheral.this.cancelConnectionTimer();
            int access$200 = BluetoothPeripheral.this.state;
            int unused = BluetoothPeripheral.this.state = i2;
            if (i != 0) {
                BluetoothPeripheral.this.connectionStateChangeUnsuccessful(i, access$200, i2, elapsedRealtime);
            } else if (i2 == 0) {
                BluetoothPeripheral.this.successfullyDisconnected(access$200);
            } else if (i2 == 2) {
                BluetoothPeripheral bluetoothPeripheral = BluetoothPeripheral.this;
                bluetoothPeripheral.successfullyConnected(bluetoothPeripheral.device.getBondState(), elapsedRealtime);
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            if (i != 0) {
                BluetoothPeripheral.this.disconnect();
                return;
            }
            bluetoothGatt.getServices();
            if (BluetoothPeripheral.this.listener != null) {
                BluetoothPeripheral.this.listener.connected(BluetoothPeripheral.this);
            }
            BluetoothPeripheral.this.callbackHandler.post(new Runnable() {
                public void run() {
                    BluetoothPeripheral.this.peripheralCallback.onServicesDiscovered(BluetoothPeripheral.this);
                }
            });
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, final int i) {
            byte[] value;
            final BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
            if (bluetoothGattDescriptor.getUuid().equals(UUID.fromString(BluetoothPeripheral.CCC_DESCRIPTOR_UUID))) {
                if (i == 0 && (value = bluetoothGattDescriptor.getValue()) != null) {
                    if (Arrays.equals(value, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) || Arrays.equals(value, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE)) {
                        BluetoothPeripheral.this.notifyingCharacteristics.add(characteristic.getUuid());
                        int size = BluetoothPeripheral.this.notifyingCharacteristics.size();
                    } else if (Arrays.equals(value, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
                        BluetoothPeripheral.this.notifyingCharacteristics.remove(characteristic.getUuid());
                    }
                }
                BluetoothPeripheral.this.callbackHandler.post(new Runnable() {
                    public void run() {
                        BluetoothPeripheral.this.peripheralCallback.onNotificationStateUpdate(BluetoothPeripheral.this, characteristic, i);
                    }
                });
            } else {
                BluetoothPeripheral.this.callbackHandler.post(new Runnable() {
                    public void run() {
                        BluetoothPeripheral.this.peripheralCallback.onDescriptorWrite(BluetoothPeripheral.this, BluetoothPeripheral.this.currentWriteBytes, bluetoothGattDescriptor, i);
                    }
                });
            }
            BluetoothPeripheral.this.completedCommand();
        }

        public void onDescriptorRead(BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, final int i) {
            final byte[] access$1400 = BluetoothPeripheral.this.copyOf(bluetoothGattDescriptor.getValue());
            BluetoothPeripheral.this.callbackHandler.post(new Runnable() {
                public void run() {
                    BluetoothPeripheral.this.peripheralCallback.onDescriptorRead(BluetoothPeripheral.this, access$1400, bluetoothGattDescriptor, i);
                }
            });
            BluetoothPeripheral.this.completedCommand();
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            final byte[] access$1400 = BluetoothPeripheral.this.copyOf(bluetoothGattCharacteristic.getValue());
            Log.d("TAG", "GGG onCharacteristicUpdate  " + BleUtil.printHexBinary(access$1400) + " " + bluetoothGattCharacteristic.getUuid().toString());
            BluetoothPeripheral.this.callbackHandler.post(new Runnable() {
                public void run() {
                    BluetoothPeripheral.this.peripheralCallback.onCharacteristicUpdate(BluetoothPeripheral.this, access$1400, bluetoothGattCharacteristic, 0);
                }
            });
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i) {
            if (i == 0) {
                final byte[] access$1400 = BluetoothPeripheral.this.copyOf(bluetoothGattCharacteristic.getValue());
                BluetoothPeripheral.this.callbackHandler.post(new Runnable() {
                    public void run() {
                        BluetoothPeripheral.this.peripheralCallback.onCharacteristicUpdate(BluetoothPeripheral.this, access$1400, bluetoothGattCharacteristic, i);
                    }
                });
                BluetoothPeripheral.this.completedCommand();
            } else if (i != 137 && i != 5) {
                BluetoothPeripheral.this.completedCommand();
            }
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i) {
            if (i == 0 || !(i == 137 || i == 5)) {
                BluetoothPeripheral bluetoothPeripheral = BluetoothPeripheral.this;
                final byte[] access$1400 = bluetoothPeripheral.copyOf(bluetoothPeripheral.currentWriteBytes);
                Log.d("TAG", "GGG onCharacteristicWrite  " + BleUtil.printHexBinary(access$1400) + " " + bluetoothGattCharacteristic.getUuid().toString());
                byte[] unused = BluetoothPeripheral.this.currentWriteBytes = null;
                BluetoothPeripheral.this.callbackHandler.post(new Runnable() {
                    public void run() {
                        BluetoothPeripheral.this.peripheralCallback.onCharacteristicWrite(BluetoothPeripheral.this, access$1400, bluetoothGattCharacteristic, i);
                    }
                });
                BluetoothPeripheral.this.completedCommand();
            }
        }

        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, final int i, final int i2) {
            BluetoothPeripheral.this.callbackHandler.post(new Runnable() {
                public void run() {
                    BluetoothPeripheral.this.peripheralCallback.onReadRemoteRssi(BluetoothPeripheral.this, i, i2);
                }
            });
            BluetoothPeripheral.this.completedCommand();
        }

        public void onMtuChanged(BluetoothGatt bluetoothGatt, final int i, final int i2) {
            BluetoothPeripheral.this.callbackHandler.post(new Runnable() {
                public void run() {
                    BluetoothPeripheral.this.peripheralCallback.onMtuChanged(BluetoothPeripheral.this, i, i2);
                }
            });
            BluetoothPeripheral.this.completedCommand();
        }
    };
    private boolean bondLost = false;
    private final BroadcastReceiver bondStateReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            String action = intent.getAction();
            if (action != null && (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null && bluetoothDevice.getAddress().equalsIgnoreCase(BluetoothPeripheral.this.getAddress()) && action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                BluetoothPeripheral.this.handleBondStateChange(intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE), intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", Integer.MIN_VALUE));
            }
        }
    };
    private String cachedName;
    /* access modifiers changed from: private */
    public final Handler callbackHandler;
    private final Queue<Runnable> commandQueue = new ConcurrentLinkedQueue();
    private boolean commandQueueBusy;
    /* access modifiers changed from: private */
    public long connectTimestamp;
    private final Context context;
    /* access modifiers changed from: private */
    public byte[] currentWriteBytes;
    /* access modifiers changed from: private */
    public BluetoothDevice device;
    /* access modifiers changed from: private */
    public Runnable discoverServicesRunnable;
    /* access modifiers changed from: private */
    public boolean discoveryStarted = false;
    private boolean isRetrying;
    /* access modifiers changed from: private */
    public final InternalCallback listener;
    /* access modifiers changed from: private */
    public final Handler mainHandler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public boolean manuallyBonding = false;
    /* access modifiers changed from: private */
    public final Set<UUID> notifyingCharacteristics = new HashSet();
    private int nrTries;
    private final BroadcastReceiver pairingRequestBroadcastReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String pincode;
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null && bluetoothDevice.getAddress().equalsIgnoreCase(BluetoothPeripheral.this.getAddress()) && intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE) == 0 && (pincode = BluetoothPeripheral.this.listener.getPincode(BluetoothPeripheral.this)) != null) {
                bluetoothDevice.setPin(pincode.getBytes());
                abortBroadcast();
            }
        }
    };
    /* access modifiers changed from: private */
    public BluetoothPeripheralCallback peripheralCallback;
    /* access modifiers changed from: private */
    public int state;
    /* access modifiers changed from: private */
    public Runnable timeoutRunnable;

    /* renamed from: ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral$InternalCallback */
    interface InternalCallback {
        void connectFailed(BluetoothPeripheral bluetoothPeripheral, int i);

        void connected(BluetoothPeripheral bluetoothPeripheral);

        void disconnected(BluetoothPeripheral bluetoothPeripheral, int i);

        String getPincode(BluetoothPeripheral bluetoothPeripheral);
    }

    private String bondStateToString(int i) {
        switch (i) {
            case 10:
                return "BOND_NONE";
            case 11:
                return "BOND_BONDING";
            case 12:
                return "BOND_BONDED";
            default:
                return "UNKNOWN";
        }
    }

    private String pairingVariantToString(int i) {
        switch (i) {
            case 0:
                return "PAIRING_VARIANT_PIN";
            case 1:
                return "PAIRING_VARIANT_PASSKEY";
            case 2:
                return "PAIRING_VARIANT_PASSKEY_CONFIRMATION";
            case 3:
                return "PAIRING_VARIANT_CONSENT";
            case 4:
                return "PAIRING_VARIANT_DISPLAY_PASSKEY";
            case 5:
                return "PAIRING_VARIANT_DISPLAY_PIN";
            case 6:
                return "PAIRING_VARIANT_OOB_CONSENT";
            default:
                return "UNKNOWN";
        }
    }

    private String stateToString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "DISCONNECTED" : "DISCONNECTING" : "CONNECTED" : "CONNECTING";
    }

    private String writeTypeToString(int i) {
        return i != 1 ? i != 2 ? i != 4 ? "unknown writeType" : "WRITE_TYPE_SIGNED" : "WRITE_TYPE_DEFAULT" : "WRITE_TYPE_NO_RESPONSE";
    }

    static /* synthetic */ int access$2508(BluetoothPeripheral bluetoothPeripheral) {
        int i = bluetoothPeripheral.nrTries;
        bluetoothPeripheral.nrTries = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    public void successfullyConnected(int i, long j) {
        if (i == 10 || i == 12) {
            delayedDiscoverServices(getServiceDiscoveryDelay(i));
        }
    }

    private void delayedDiscoverServices(long j) {
        this.discoverServicesRunnable = new Runnable() {
            public void run() {
                if (BluetoothPeripheral.this.bluetoothGatt.discoverServices()) {
                    boolean unused = BluetoothPeripheral.this.discoveryStarted = true;
                }
                Runnable unused2 = BluetoothPeripheral.this.discoverServicesRunnable = null;
            }
        };
        this.mainHandler.postDelayed(this.discoverServicesRunnable, j);
    }

    private long getServiceDiscoveryDelay(int i) {
        long j = Build.VERSION.SDK_INT <= 24 ? 1000 : 0;
        if (i == 12) {
            return j;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public void successfullyDisconnected(int i) {
        if (i != 2) {
        }
        if (this.bondLost) {
            completeDisconnect(false, 0);
            if (this.listener != null) {
                this.callbackHandler.postDelayed(new Runnable() {
                    public void run() {
                        BluetoothPeripheral.this.listener.connectFailed(BluetoothPeripheral.this, 0);
                    }
                }, 1000);
                return;
            }
            return;
        }
        completeDisconnect(true, 0);
    }

    /* access modifiers changed from: private */
    public void connectionStateChangeUnsuccessful(int i, int i2, int i3, long j) {
        Runnable runnable = this.discoverServicesRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
            this.discoverServicesRunnable = null;
        }
        boolean z = true;
        boolean z2 = !getServices().isEmpty();
        if (i2 == 1) {
            if (j <= ((long) getTimoutThreshold())) {
                z = false;
            }
            if (i == 133 && z) {
                i = 8;
            }
            completeDisconnect(false, i);
            InternalCallback internalCallback = this.listener;
            if (internalCallback != null) {
                internalCallback.connectFailed(this, i);
            }
        } else if (i2 == 2 && i3 == 0 && !z2) {
            completeDisconnect(false, i);
            InternalCallback internalCallback2 = this.listener;
            if (internalCallback2 != null) {
                internalCallback2.connectFailed(this, i);
            }
        } else {
            completeDisconnect(true, i);
        }
    }

    /* access modifiers changed from: private */
    public void handleBondStateChange(int i, int i2) {
        switch (i) {
            case 10:
                if (i2 == 11) {
                    this.callbackHandler.post(new Runnable() {
                        public void run() {
                            BluetoothPeripheral.this.peripheralCallback.onBondingFailed(BluetoothPeripheral.this);
                        }
                    });
                } else {
                    this.bondLost = true;
                    Runnable runnable = this.discoverServicesRunnable;
                    if (runnable != null) {
                        this.mainHandler.removeCallbacks(runnable);
                        this.discoverServicesRunnable = null;
                    }
                    this.callbackHandler.post(new Runnable() {
                        public void run() {
                            BluetoothPeripheral.this.peripheralCallback.onBondLost(BluetoothPeripheral.this);
                        }
                    });
                }
                disconnect();
                return;
            case 11:
                this.callbackHandler.post(new Runnable() {
                    public void run() {
                        BluetoothPeripheral.this.peripheralCallback.onBondingStarted(BluetoothPeripheral.this);
                    }
                });
                return;
            case 12:
                this.callbackHandler.post(new Runnable() {
                    public void run() {
                        BluetoothPeripheral.this.peripheralCallback.onBondingSucceeded(BluetoothPeripheral.this);
                    }
                });
                if (this.bluetoothGatt.getServices().isEmpty() && !this.discoveryStarted) {
                    delayedDiscoverServices(0);
                }
                if (Build.VERSION.SDK_INT < 26 && this.commandQueueBusy && !this.manuallyBonding) {
                    this.mainHandler.postDelayed(new Runnable() {
                        public void run() {
                            BluetoothPeripheral.this.retryCommand();
                        }
                    }, 50);
                }
                if (this.manuallyBonding) {
                    this.manuallyBonding = false;
                    completedCommand();
                    return;
                }
                return;
            default:
                return;
        }
    }

    BluetoothPeripheral(Context context2, BluetoothDevice bluetoothDevice, InternalCallback internalCallback, BluetoothPeripheralCallback bluetoothPeripheralCallback, Handler handler) {
        Objects.requireNonNull(context2, "no valid context provided");
        Objects.requireNonNull(bluetoothDevice, "no valid device provided");
        Objects.requireNonNull(internalCallback, "no valid listener provided");
        this.context = context2;
        this.device = bluetoothDevice;
        this.peripheralCallback = bluetoothPeripheralCallback;
        this.listener = internalCallback;
        this.callbackHandler = handler == null ? new Handler(Looper.getMainLooper()) : handler;
        this.state = 0;
        this.commandQueueBusy = false;
    }

    /* access modifiers changed from: package-private */
    public void setPeripheralCallback(BluetoothPeripheralCallback bluetoothPeripheralCallback) {
        this.peripheralCallback = (BluetoothPeripheralCallback) Objects.requireNonNull(bluetoothPeripheralCallback, "no valid peripheral callback provided");
    }

    /* access modifiers changed from: package-private */
    public void setDevice(BluetoothDevice bluetoothDevice) {
        this.device = (BluetoothDevice) Objects.requireNonNull(bluetoothDevice, "bluetoothdevice is not valid");
    }

    /* access modifiers changed from: package-private */
    public void connect() {
        if (this.state == 0) {
            this.mainHandler.postDelayed(new Runnable() {
                public void run() {
                    BluetoothPeripheral.this.registerBondingBroadcastReceivers();
                    int unused = BluetoothPeripheral.this.state = 1;
                    boolean unused2 = BluetoothPeripheral.this.discoveryStarted = false;
                    BluetoothPeripheral bluetoothPeripheral = BluetoothPeripheral.this;
                    BluetoothGatt unused3 = bluetoothPeripheral.bluetoothGatt = bluetoothPeripheral.connectGattHelper(bluetoothPeripheral.device, false, BluetoothPeripheral.this.bluetoothGattCallback);
                    long unused4 = BluetoothPeripheral.this.connectTimestamp = SystemClock.elapsedRealtime();
                    BluetoothPeripheral bluetoothPeripheral2 = BluetoothPeripheral.this;
                    bluetoothPeripheral2.startConnectionTimer(bluetoothPeripheral2);
                }
            }, 100);
        }
    }

    /* access modifiers changed from: package-private */
    public void autoConnect() {
        if (this.state == 0) {
            this.mainHandler.post(new Runnable() {
                public void run() {
                    BluetoothPeripheral.this.registerBondingBroadcastReceivers();
                    int unused = BluetoothPeripheral.this.state = 1;
                    boolean unused2 = BluetoothPeripheral.this.discoveryStarted = false;
                    BluetoothPeripheral bluetoothPeripheral = BluetoothPeripheral.this;
                    BluetoothGatt unused3 = bluetoothPeripheral.bluetoothGatt = bluetoothPeripheral.connectGattHelper(bluetoothPeripheral.device, true, BluetoothPeripheral.this.bluetoothGattCallback);
                    long unused4 = BluetoothPeripheral.this.connectTimestamp = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void registerBondingBroadcastReceivers() {
        this.context.registerReceiver(this.bondStateReceiver, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
        this.context.registerReceiver(this.pairingRequestBroadcastReceiver, new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST"));
    }

    public boolean createBond() {
        if (this.bluetoothGatt == null) {
            return this.device.createBond();
        }
        boolean add = this.commandQueue.add(new Runnable() {
            public void run() {
                boolean unused = BluetoothPeripheral.this.manuallyBonding = true;
                if (!BluetoothPeripheral.this.device.createBond()) {
                    BluetoothPeripheral.this.completedCommand();
                } else {
                    BluetoothPeripheral.access$2508(BluetoothPeripheral.this);
                }
            }
        });
        if (add) {
            nextCommand();
        }
        return add;
    }

    public boolean requestConnectionPriority(final int i) {
        boolean add = this.commandQueue.add(new Runnable() {
            public void run() {
                if (BluetoothPeripheral.this.isConnected()) {
                    BluetoothPeripheral.this.bluetoothGatt.requestConnectionPriority(i);
                    BluetoothPeripheral.this.completedCommand();
                }
            }
        });
        if (add) {
            nextCommand();
        }
        return add;
    }

    private boolean createBond(int i) {
        try {
            Method method = this.device.getClass().getMethod("createBond", new Class[]{Integer.TYPE});
            if (method == null) {
                return false;
            }
            return ((Boolean) method.invoke(this.device, new Object[]{Integer.valueOf(i)})).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public void cancelConnection() {
        int i;
        Log.d("TAG", "XXX cancelConnection ");
        if (this.bluetoothGatt != null && (i = this.state) != 0 && i != 3) {
            cancelConnectionTimer();
            if (this.state == 1) {
                disconnect();
                this.mainHandler.postDelayed(new Runnable() {
                    public void run() {
                        BluetoothPeripheral.this.bluetoothGattCallback.onConnectionStateChange(BluetoothPeripheral.this.bluetoothGatt, 0, 0);
                    }
                }, 50);
                return;
            }
            disconnect();
        }
    }

    /* access modifiers changed from: private */
    public void disconnect() {
        int i = this.state;
        if (i == 2 || i == 1) {
            this.state = 3;
            this.mainHandler.post(new Runnable() {
                public void run() {
                    if (BluetoothPeripheral.this.bluetoothGatt != null) {
                        BluetoothPeripheral.this.bluetoothGatt.disconnect();
                    }
                }
            });
            return;
        }
        InternalCallback internalCallback = this.listener;
        if (internalCallback != null) {
            internalCallback.disconnected(this, 22);
        }
    }

    /* access modifiers changed from: package-private */
    public void disconnectWhenBluetoothOff() {
        this.bluetoothGatt = null;
        completeDisconnect(true, 0);
    }

    private void completeDisconnect(boolean z, int i) {
        if (this.bluetoothGatt != null) {
            this.bluetoothGatt.close();
            this.bluetoothGatt = null;
        }
        this.commandQueue.clear();
        this.commandQueueBusy = false;
        try {
            this.context.unregisterReceiver(this.bondStateReceiver);
            this.context.unregisterReceiver(this.pairingRequestBroadcastReceiver);
        } catch (IllegalArgumentException unused) {
        }
        this.bondLost = false;
        InternalCallback internalCallback = this.listener;
        if (internalCallback != null && z) {
            internalCallback.disconnected(this, i);
        }
    }

    public String getAddress() {
        return this.device.getAddress();
    }

    public int getType() {
        return this.device.getType();
    }

    public String getName() {
        String name = this.device.getName();
        if (name != null) {
            this.cachedName = name;
        }
        return this.cachedName;
    }

    public int getBondState() {
        return this.device.getBondState();
    }

    public List<BluetoothGattService> getServices() {
        if (this.bluetoothGatt != null) {
            return this.bluetoothGatt.getServices();
        }
        return Collections.emptyList();
    }

    public BluetoothGattService getService(UUID uuid) {
        Objects.requireNonNull(uuid, "no valid service UUID provided");
        if (this.bluetoothGatt != null) {
            return this.bluetoothGatt.getService(uuid);
        }
        return null;
    }

    public BluetoothGattCharacteristic getCharacteristic(UUID uuid, UUID uuid2) {
        Objects.requireNonNull(uuid, "no valid service UUID provided");
        Objects.requireNonNull(uuid2, "no valid characteristic provided");
        BluetoothGattService service = getService(uuid);
        if (service != null) {
            return service.getCharacteristic(uuid2);
        }
        return null;
    }

    public int getState() {
        return this.state;
    }

    public boolean isNotifying(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        Objects.requireNonNull(bluetoothGattCharacteristic, "no valid characteristic provided");
        return this.notifyingCharacteristics.contains(bluetoothGattCharacteristic.getUuid());
    }

    /* access modifiers changed from: private */
    public boolean isConnected() {
        return this.bluetoothGatt != null && this.state == 2;
    }

    public boolean readCharacteristic(final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        Objects.requireNonNull(bluetoothGattCharacteristic, "characteristic is 'null', ignoring read request");
        if (this.bluetoothGatt == null || (bluetoothGattCharacteristic.getProperties() & 2) == 0) {
            return false;
        }
        boolean add = this.commandQueue.add(new Runnable() {
            public void run() {
                if (!BluetoothPeripheral.this.isConnected()) {
                    BluetoothPeripheral.this.completedCommand();
                } else if (!BluetoothPeripheral.this.bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic)) {
                    BluetoothPeripheral.this.completedCommand();
                } else {
                    BluetoothPeripheral.access$2508(BluetoothPeripheral.this);
                }
            }
        });
        if (add) {
            nextCommand();
        }
        return add;
    }

    public boolean writeCharacteristic(final BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, final int i) {
        Objects.requireNonNull(bluetoothGattCharacteristic, "no valid characteristic provided");
        Objects.requireNonNull(bArr, "no valid value provided");
        if (this.bluetoothGatt == null) {
            return false;
        }
        final byte[] copyOf = copyOf(bArr);
        if (((i != 1 ? i != 2 ? i != 4 ? 0 : 64 : 8 : 4) & bluetoothGattCharacteristic.getProperties()) == 0) {
            return false;
        }
        boolean add = this.commandQueue.add(new Runnable() {
            public void run() {
                if (BluetoothPeripheral.this.isConnected()) {
                    byte[] unused = BluetoothPeripheral.this.currentWriteBytes = copyOf;
                    bluetoothGattCharacteristic.setValue(copyOf);
                    bluetoothGattCharacteristic.setWriteType(i);
                    if (!BluetoothPeripheral.this.bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic)) {
                        BluetoothPeripheral.this.completedCommand();
                    } else {
                        BluetoothPeripheral.access$2508(BluetoothPeripheral.this);
                    }
                } else {
                    BluetoothPeripheral.this.completedCommand();
                }
            }
        });
        if (add) {
            nextCommand();
        }
        return add;
    }

    public boolean readDescriptor(final BluetoothGattDescriptor bluetoothGattDescriptor) {
        Objects.requireNonNull(bluetoothGattDescriptor, "no valid descriptor provided");
        if (this.bluetoothGatt == null) {
            return false;
        }
        boolean add = this.commandQueue.add(new Runnable() {
            public void run() {
                if (!BluetoothPeripheral.this.isConnected()) {
                    BluetoothPeripheral.this.completedCommand();
                } else if (!BluetoothPeripheral.this.bluetoothGatt.readDescriptor(bluetoothGattDescriptor)) {
                    BluetoothPeripheral.this.completedCommand();
                } else {
                    BluetoothPeripheral.access$2508(BluetoothPeripheral.this);
                }
            }
        });
        if (add) {
            nextCommand();
        }
        return add;
    }

    public boolean writeDescriptor(final BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        Objects.requireNonNull(bluetoothGattDescriptor, "no valid descriptor provided");
        Objects.requireNonNull(bArr, "no valid value provided");
        if (this.bluetoothGatt == null) {
            return false;
        }
        final byte[] copyOf = copyOf(bArr);
        boolean add = this.commandQueue.add(new Runnable() {
            public void run() {
                if (BluetoothPeripheral.this.isConnected()) {
                    byte[] unused = BluetoothPeripheral.this.currentWriteBytes = copyOf;
                    bluetoothGattDescriptor.setValue(copyOf);
                    if (!BluetoothPeripheral.this.bluetoothGatt.writeDescriptor(bluetoothGattDescriptor)) {
                        BluetoothPeripheral.this.completedCommand();
                    } else {
                        BluetoothPeripheral.access$2508(BluetoothPeripheral.this);
                    }
                } else {
                    BluetoothPeripheral.this.completedCommand();
                }
            }
        });
        if (add) {
            nextCommand();
        }
        return add;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r7 = r9.getDescriptor(java.util.UUID.fromString(CCC_DESCRIPTOR_UUID));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean setNotify(android.bluetooth.BluetoothGattCharacteristic r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = "no valid characteristic provided"
            java.util.Objects.requireNonNull(r9, r0)
            android.bluetooth.BluetoothGatt r0 = r8.bluetoothGatt
            r1 = 0
            if (r0 != 0) goto L_0x000b
            return r1
        L_0x000b:
            java.lang.String r0 = "00002902-0000-1000-8000-00805f9b34fb"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            android.bluetooth.BluetoothGattDescriptor r7 = r9.getDescriptor(r0)
            if (r7 != 0) goto L_0x0018
            return r1
        L_0x0018:
            int r0 = r9.getProperties()
            r2 = r0 & 16
            if (r2 <= 0) goto L_0x0023
            byte[] r0 = android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
            goto L_0x0029
        L_0x0023:
            r0 = r0 & 32
            if (r0 <= 0) goto L_0x0044
            byte[] r0 = android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE
        L_0x0029:
            if (r10 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            byte[] r0 = android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE
        L_0x002e:
            r6 = r0
            java.util.Queue<java.lang.Runnable> r0 = r8.commandQueue
            ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral$21 r1 = new ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral$21
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            r2.<init>(r4, r5, r6, r7)
            boolean r9 = r0.add(r1)
            if (r9 == 0) goto L_0x0043
            r8.nextCommand()
        L_0x0043:
            return r9
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral.setNotify(android.bluetooth.BluetoothGattCharacteristic, boolean):boolean");
    }

    public boolean clearServicesCache() {
        try {
            Method method = this.bluetoothGatt.getClass().getMethod("refresh", new Class[0]);
            if (method != null) {
                return ((Boolean) method.invoke(this.bluetoothGatt, new Object[0])).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean readRemoteRssi() {
        boolean add = this.commandQueue.add(new Runnable() {
            public void run() {
                if (!BluetoothPeripheral.this.isConnected()) {
                    BluetoothPeripheral.this.completedCommand();
                } else if (!BluetoothPeripheral.this.bluetoothGatt.readRemoteRssi()) {
                    BluetoothPeripheral.this.completedCommand();
                }
            }
        });
        if (add) {
            nextCommand();
        }
        return add;
    }

    public boolean requestMtu(final int i) {
        boolean add = this.commandQueue.add(new Runnable() {
            public void run() {
                if (!BluetoothPeripheral.this.isConnected()) {
                    BluetoothPeripheral.this.completedCommand();
                } else if (!BluetoothPeripheral.this.bluetoothGatt.requestMtu(i)) {
                    BluetoothPeripheral.this.completedCommand();
                }
            }
        });
        if (add) {
            nextCommand();
        }
        return add;
    }

    /* access modifiers changed from: private */
    public void completedCommand() {
        this.isRetrying = false;
        this.commandQueue.poll();
        this.commandQueueBusy = false;
        nextCommand();
    }

    /* access modifiers changed from: private */
    public void retryCommand() {
        this.commandQueueBusy = false;
        if (this.commandQueue.peek() != null) {
            if (this.nrTries >= 2) {
                this.commandQueue.poll();
            } else {
                this.isRetrying = true;
            }
        }
        nextCommand();
    }

    private void nextCommand() {
        synchronized (this) {
            if (!this.commandQueueBusy) {
                final Runnable peek = this.commandQueue.peek();
                if (peek != null) {
                    if (this.bluetoothGatt == null) {
                        this.commandQueue.clear();
                        this.commandQueueBusy = false;
                        return;
                    }
                    this.commandQueueBusy = true;
                    if (!this.isRetrying) {
                        this.nrTries = 0;
                    }
                    this.mainHandler.post(new Runnable() {
                        public void run() {
                            try {
                                peek.run();
                            } catch (Exception unused) {
                                BluetoothPeripheral.this.completedCommand();
                            }
                        }
                    });
                }
            }
        }
    }

    private static String statusToString(int i) {
        if (i == 0) {
            return "SUCCESS";
        }
        if (i == 1) {
            return "GATT CONN L2C FAILURE";
        }
        if (i == 8) {
            return "GATT CONN TIMEOUT";
        }
        if (i == 19) {
            return "GATT CONN TERMINATE PEER USER";
        }
        if (i == 22) {
            return "GATT CONN TERMINATE LOCAL HOST";
        }
        if (i == 34) {
            return "GATT CONN LMP TIMEOUT";
        }
        if (i == 137) {
            return "GATT AUTH FAIL";
        }
        if (i == 256) {
            return "GATT CONN CANCEL ";
        }
        if (i == 61) {
            return "BLE HCI CONN TERMINATED DUE TO MIC FAILURE";
        }
        if (i == 62) {
            return "GATT CONN FAIL ESTABLISH";
        }
        if (i == 128) {
            return "GATT NO RESOURCES";
        }
        if (i == 129) {
            return "GATT INTERNAL ERROR";
        }
        if (i == 132) {
            return "GATT BUSY";
        }
        if (i == 133) {
            return "GATT ERROR";
        }
        return "UNKNOWN (" + i + ")";
    }

    private static String bytes2String(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", new Object[]{Integer.valueOf(bArr[i] & 255)}));
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public BluetoothGatt connectGattHelper(BluetoothDevice bluetoothDevice, boolean z, BluetoothGattCallback bluetoothGattCallback2) {
        if (bluetoothDevice == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24 || !z) {
            return connectGattCompat(bluetoothGattCallback2, bluetoothDevice, z);
        }
        try {
            Object iBluetoothGatt = getIBluetoothGatt(getIBluetoothManager());
            if (iBluetoothGatt == null) {
                return connectGattCompat(bluetoothGattCallback2, bluetoothDevice, true);
            }
            BluetoothGatt createBluetoothGatt = createBluetoothGatt(iBluetoothGatt, bluetoothDevice);
            if (createBluetoothGatt == null) {
                return connectGattCompat(bluetoothGattCallback2, bluetoothDevice, true);
            }
            if (!connectUsingReflection(bluetoothDevice, createBluetoothGatt, bluetoothGattCallback2, true)) {
                createBluetoothGatt.close();
            }
            return createBluetoothGatt;
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            return connectGattCompat(bluetoothGattCallback2, bluetoothDevice, true);
        }
    }

    private BluetoothGatt connectGattCompat(BluetoothGattCallback bluetoothGattCallback2, BluetoothDevice bluetoothDevice, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            return bluetoothDevice.connectGatt(this.context, z, bluetoothGattCallback2, 2);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                try {
                    return (BluetoothGatt) bluetoothDevice.getClass().getMethod("connectGatt", new Class[]{Context.class, Boolean.TYPE, BluetoothGattCallback.class, Integer.TYPE}).invoke(bluetoothDevice, new Object[]{this.context, Boolean.valueOf(z), bluetoothGattCallback2, 2});
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            }
        }
        return bluetoothDevice.connectGatt(this.context, z, bluetoothGattCallback2);
    }

    private boolean connectUsingReflection(BluetoothDevice bluetoothDevice, BluetoothGatt bluetoothGatt2, BluetoothGattCallback bluetoothGattCallback2, boolean z) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        setAutoConnectValue(bluetoothGatt2, z);
        Method declaredMethod = bluetoothGatt2.getClass().getDeclaredMethod("connect", new Class[]{Boolean.class, BluetoothGattCallback.class});
        declaredMethod.setAccessible(true);
        return ((Boolean) declaredMethod.invoke(bluetoothGatt2, new Object[]{true, bluetoothGattCallback2})).booleanValue();
    }

    private BluetoothGatt createBluetoothGatt(Object obj, BluetoothDevice bluetoothDevice) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor constructor = BluetoothGatt.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        if (constructor.getParameterTypes().length == 4) {
            return (BluetoothGatt) constructor.newInstance(new Object[]{this.context, obj, bluetoothDevice, 2});
        }
        return (BluetoothGatt) constructor.newInstance(new Object[]{this.context, obj, bluetoothDevice});
    }

    private Object getIBluetoothGatt(Object obj) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (obj == null) {
            return null;
        }
        return getMethodFromClass(obj.getClass(), "getBluetoothGatt").invoke(obj, new Object[0]);
    }

    private Object getIBluetoothManager() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return null;
        }
        return getMethodFromClass(defaultAdapter.getClass(), "getBluetoothManager").invoke(defaultAdapter, new Object[0]);
    }

    private Method getMethodFromClass(Class<?> cls, String str) throws NoSuchMethodException {
        Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    private void setAutoConnectValue(BluetoothGatt bluetoothGatt2, boolean z) throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = bluetoothGatt2.getClass().getDeclaredField("mAutoConnect");
        declaredField.setAccessible(true);
        declaredField.setBoolean(bluetoothGatt2, z);
    }

    /* access modifiers changed from: private */
    public void startConnectionTimer(BluetoothPeripheral bluetoothPeripheral) {
        cancelConnectionTimer();
        this.timeoutRunnable = new Runnable() {
            public void run() {
                BluetoothPeripheral.this.disconnect();
                BluetoothPeripheral.this.mainHandler.postDelayed(new Runnable() {
                    public void run() {
                        BluetoothPeripheral.this.bluetoothGattCallback.onConnectionStateChange(BluetoothPeripheral.this.bluetoothGatt, 8, 0);
                    }
                }, 50);
                Runnable unused = BluetoothPeripheral.this.timeoutRunnable = null;
            }
        };
        this.mainHandler.postDelayed(this.timeoutRunnable, 35000);
    }

    /* access modifiers changed from: private */
    public void cancelConnectionTimer() {
        Runnable runnable = this.timeoutRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
            this.timeoutRunnable = null;
        }
    }

    private int getTimoutThreshold() {
        return Build.MANUFACTURER.equals("samsung") ? TIMEOUT_THRESHOLD_SAMSUNG : TIMEOUT_THRESHOLD_DEFAULT;
    }

    /* access modifiers changed from: private */
    public byte[] copyOf(byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
