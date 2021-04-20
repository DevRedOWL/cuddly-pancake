package org.linphone;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

public class BluetoothManager extends BroadcastReceiver {
    private static BluetoothManager instance;
    public int PLANTRONICS_BUTTON_CALL = 2;
    public int PLANTRONICS_BUTTON_DOUBLE_PRESS = 5;
    public int PLANTRONICS_BUTTON_LONG_PRESS = 2;
    public int PLANTRONICS_BUTTON_MUTE = 3;
    public int PLANTRONICS_BUTTON_PRESS = 1;
    /* access modifiers changed from: private */
    public boolean isBluetoothConnected = false;
    private boolean isScoConnected;
    private AudioManager mAudioManager;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothDevice mBluetoothDevice;
    /* access modifiers changed from: private */
    public BluetoothHeadset mBluetoothHeadset;
    private Context mContext;
    private BluetoothProfile.ServiceListener mProfileListener;

    public static BluetoothManager getInstance() {
        if (instance == null) {
            instance = new BluetoothManager();
        }
        return instance;
    }

    public BluetoothManager() {
        if (!ensureInit()) {
            Log.w("BluetoothManager", "[Bluetooth] Manager tried to init but LinphoneService not ready yet...");
        }
        instance = this;
    }

    public void initBluetooth() {
        if (!ensureInit()) {
            Log.w("BluetoothManager", "[Bluetooth] Manager tried to init bluetooth but LinphoneService not ready yet...");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.bluetooth.headset.intent.category.companyid.85");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT");
        this.mContext.registerReceiver(this, intentFilter);
        Log.d("BluetoothManager", "[Bluetooth] Receiver started");
        startBluetooth();
    }

    private void startBluetooth() {
        if (this.isBluetoothConnected) {
            Log.e("BluetoothManager", "[Bluetooth] Already started, skipping...");
            return;
        }
        this.mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            Log.w("BluetoothManager", "[Bluetooth] Interface disabled on device");
            return;
        }
        if (this.mProfileListener != null) {
            Log.w("BluetoothManager", "[Bluetooth] Headset profile was already opened, let's close it");
            this.mBluetoothAdapter.closeProfileProxy(1, this.mBluetoothHeadset);
        }
        this.mProfileListener = new BluetoothProfile.ServiceListener() {
            public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                if (i == 1) {
                    Log.d("BluetoothManager", "[Bluetooth] Headset connected");
                    BluetoothHeadset unused = BluetoothManager.this.mBluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
                    boolean unused2 = BluetoothManager.this.isBluetoothConnected = true;
                }
            }

            public void onServiceDisconnected(int i) {
                if (i == 1) {
                    BluetoothHeadset unused = BluetoothManager.this.mBluetoothHeadset = null;
                    boolean unused2 = BluetoothManager.this.isBluetoothConnected = false;
                    Log.d("BluetoothManager", "[Bluetooth] Headset disconnected");
                    LinphoneManager.getInstance().routeAudioToReceiver();
                }
            }
        };
        if (!this.mBluetoothAdapter.getProfileProxy(this.mContext, this.mProfileListener, 1)) {
            Log.e("BluetoothManager", "[Bluetooth] getProfileProxy failed !");
        }
    }

    private void refreshCallView() {
        if (CallActivity.isInstanciated()) {
            CallActivity.instance().refreshInCallActions();
        }
    }

    private boolean ensureInit() {
        if (this.mBluetoothAdapter == null) {
            this.mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        }
        if (this.mContext == null) {
            if (!LinphoneService.isReady()) {
                return false;
            }
            this.mContext = LinphoneService.instance().getApplicationContext();
        }
        Context context = this.mContext;
        if (context == null || this.mAudioManager != null) {
            return true;
        }
        this.mAudioManager = (AudioManager) context.getSystemService("audio");
        return true;
    }

    public boolean routeAudioToBluetooth() {
        AudioManager audioManager;
        ensureInit();
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        int i = 0;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled() || (audioManager = this.mAudioManager) == null || !audioManager.isBluetoothScoAvailableOffCall() || !isBluetoothHeadsetAvailable()) {
            return false;
        }
        AudioManager audioManager2 = this.mAudioManager;
        if (audioManager2 != null && !audioManager2.isBluetoothScoOn()) {
            Log.d("BluetoothManager", "[Bluetooth] SCO off, let's start it");
            this.mAudioManager.setBluetoothScoOn(true);
            this.mAudioManager.startBluetoothSco();
        }
        boolean isUsingBluetoothAudioRoute = isUsingBluetoothAudioRoute();
        while (!isUsingBluetoothAudioRoute && i < 5) {
            i++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException unused) {
            }
            AudioManager audioManager3 = this.mAudioManager;
            if (audioManager3 != null) {
                audioManager3.setBluetoothScoOn(true);
                this.mAudioManager.startBluetoothSco();
            }
            isUsingBluetoothAudioRoute = isUsingBluetoothAudioRoute();
        }
        if (!isUsingBluetoothAudioRoute) {
            Log.d("BluetoothManager", "[Bluetooth] Audio route still not ok...");
        } else if (i > 0) {
            Log.d("BluetoothManager", "[Bluetooth] Audio route ok after " + i + " retries");
        } else {
            Log.d("BluetoothManager", "[Bluetooth] Audio route ok");
        }
        return isUsingBluetoothAudioRoute;
    }

    public boolean isUsingBluetoothAudioRoute() {
        BluetoothHeadset bluetoothHeadset = this.mBluetoothHeadset;
        return bluetoothHeadset != null && bluetoothHeadset.isAudioConnected(this.mBluetoothDevice) && this.isScoConnected;
    }

    public boolean isBluetoothHeadsetAvailable() {
        AudioManager audioManager;
        BluetoothHeadset bluetoothHeadset;
        ensureInit();
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        boolean z = false;
        if (!(bluetoothAdapter == null || !bluetoothAdapter.isEnabled() || (audioManager = this.mAudioManager) == null || !audioManager.isBluetoothScoAvailableOffCall() || (bluetoothHeadset = this.mBluetoothHeadset) == null)) {
            List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
            this.mBluetoothDevice = null;
            Iterator<BluetoothDevice> it = connectedDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BluetoothDevice next = it.next();
                if (this.mBluetoothHeadset.getConnectionState(next) == 2) {
                    this.mBluetoothDevice = next;
                    z = true;
                    break;
                }
            }
            Log.d("BluetoothManager", z ? "[Bluetooth] Headset found, bluetooth audio route available" : "[Bluetooth] No headset found, bluetooth audio route unavailable");
        }
        return z;
    }

    public void disableBluetoothSCO() {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager != null && audioManager.isBluetoothScoOn()) {
            this.mAudioManager.stopBluetoothSco();
            this.mAudioManager.setBluetoothScoOn(false);
            int i = 0;
            while (this.isScoConnected && i < 10) {
                i++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException unused) {
                }
                this.mAudioManager.stopBluetoothSco();
                this.mAudioManager.setBluetoothScoOn(false);
            }
            Log.w("BluetoothManager", "[Bluetooth] SCO disconnected!");
        }
    }

    public void stopBluetooth() {
        BluetoothHeadset bluetoothHeadset;
        Log.w("BluetoothManager", "[Bluetooth] Stopping...");
        this.isBluetoothConnected = false;
        disableBluetoothSCO();
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        if (!(bluetoothAdapter == null || this.mProfileListener == null || (bluetoothHeadset = this.mBluetoothHeadset) == null)) {
            bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
            this.mProfileListener = null;
        }
        this.mBluetoothDevice = null;
        Log.w("BluetoothManager", "[Bluetooth] Stopped!");
        if (LinphoneManager.isInstanciated()) {
            LinphoneManager.getInstance().routeAudioToReceiver();
        }
        refreshCallView();
    }

    public void destroy() {
        try {
            stopBluetooth();
            try {
                this.mContext.unregisterReceiver(this);
                Log.d("BluetoothManager", "[Bluetooth] Receiver stopped");
            } catch (Exception unused) {
            }
        } catch (Exception e) {
            Log.e("BluetoothManager", e.getMessage());
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (LinphoneManager.isInstanciated()) {
            String action = intent.getAction();
            if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(action)) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
                if (intExtra == 1) {
                    Log.d("BluetoothManager", "[Bluetooth] SCO state: connected");
                    this.isScoConnected = true;
                } else if (intExtra == 0) {
                    Log.d("BluetoothManager", "[Bluetooth] SCO state: disconnected");
                    this.isScoConnected = false;
                } else if (intExtra == 2) {
                    Log.d("BluetoothManager", "[Bluetooth] SCO state: connecting");
                    this.isScoConnected = true;
                } else {
                    Log.d("BluetoothManager", "[Bluetooth] SCO state: " + intExtra);
                }
                refreshCallView();
            } else if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(action)) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0);
                if (intExtra2 == 0) {
                    Log.d("BluetoothManager", "[Bluetooth] State: disconnected");
                    stopBluetooth();
                } else if (intExtra2 == 2) {
                    Log.d("BluetoothManager", "[Bluetooth] State: connected");
                    startBluetooth();
                } else {
                    Log.d("BluetoothManager", "[Bluetooth] State: " + intExtra2);
                }
            } else if (intent.getAction().equals("android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT")) {
                String string = intent.getExtras().getString("android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_CMD");
                Object[] objArr = (Object[]) intent.getExtras().get("android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_ARGS");
                if (objArr.length <= 0) {
                    Log.d("BluetoothManager", "[Bluetooth] Event: " + string + ", no args");
                    return;
                }
                String obj = objArr[0].toString();
                if (!obj.equals("BUTTON") || objArr.length < 3) {
                    Log.d("BluetoothManager", "[Bluetooth] Event: " + string + " : " + obj);
                    return;
                }
                String obj2 = objArr[1].toString();
                String obj3 = objArr[2].toString();
                Log.d("BluetoothManager", "[Bluetooth] Event: " + string + " : " + obj + ", id = " + obj2 + " (" + obj3 + ")");
            }
        }
    }
}
