package com.yandex.metrica.impl.p039ob;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.dd */
public class C3326dd {

    /* renamed from: a */
    private final Context f3035a;

    public C3326dd(Context context) {
        this.f3035a = context;
    }

    /* renamed from: a */
    public BluetoothLeScanner mo39895a() {
        BluetoothAdapter bluetoothAdapter;
        BluetoothManager bluetoothManager = (BluetoothManager) this.f3035a.getSystemService("bluetooth");
        if (bluetoothManager == null || (bluetoothAdapter = (BluetoothAdapter) C3306cx.m2841a(new C4236wo<BluetoothManager, BluetoothAdapter>() {
            /* renamed from: a */
            public BluetoothAdapter mo39698a(BluetoothManager bluetoothManager) throws Throwable {
                return bluetoothManager.getAdapter();
            }
        }, bluetoothManager, "getting adapter", "BluetoothManager")) == null || !bluetoothAdapter.isEnabled()) {
            return null;
        }
        return (BluetoothLeScanner) C3306cx.m2841a(new C4236wo<BluetoothAdapter, BluetoothLeScanner>() {
            /* renamed from: a */
            public BluetoothLeScanner mo39698a(BluetoothAdapter bluetoothAdapter) throws Throwable {
                return bluetoothAdapter.getBluetoothLeScanner();
            }
        }, bluetoothAdapter, "Get bluetooth LE scanner", "BluetoothAdapter");
    }
}
