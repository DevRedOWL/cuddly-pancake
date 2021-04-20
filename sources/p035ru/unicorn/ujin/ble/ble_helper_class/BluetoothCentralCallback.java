package p035ru.unicorn.ujin.ble.ble_helper_class;

import android.bluetooth.le.ScanResult;

/* renamed from: ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentralCallback */
public abstract class BluetoothCentralCallback {
    public void onBluetoothAdapterStateChanged(int i) {
    }

    public void onConnectedPeripheral(BluetoothPeripheral bluetoothPeripheral) {
    }

    public void onConnectionFailed(BluetoothPeripheral bluetoothPeripheral, int i) {
    }

    public void onDisconnectedPeripheral(BluetoothPeripheral bluetoothPeripheral, int i) {
    }

    public void onDiscoveredPeripheral(BluetoothPeripheral bluetoothPeripheral, ScanResult scanResult) {
    }

    public void onScanFailed(int i) {
    }
}
