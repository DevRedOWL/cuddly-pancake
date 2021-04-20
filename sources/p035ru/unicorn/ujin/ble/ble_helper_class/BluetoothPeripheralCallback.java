package p035ru.unicorn.ujin.ble.ble_helper_class;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* renamed from: ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheralCallback */
public abstract class BluetoothPeripheralCallback {
    public void onBondLost(BluetoothPeripheral bluetoothPeripheral) {
    }

    public void onBondingFailed(BluetoothPeripheral bluetoothPeripheral) {
    }

    public void onBondingStarted(BluetoothPeripheral bluetoothPeripheral) {
    }

    public void onBondingSucceeded(BluetoothPeripheral bluetoothPeripheral) {
    }

    public void onCharacteristicUpdate(BluetoothPeripheral bluetoothPeripheral, byte[] bArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    public void onCharacteristicWrite(BluetoothPeripheral bluetoothPeripheral, byte[] bArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    public void onDescriptorRead(BluetoothPeripheral bluetoothPeripheral, byte[] bArr, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
    }

    public void onDescriptorWrite(BluetoothPeripheral bluetoothPeripheral, byte[] bArr, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
    }

    public void onMtuChanged(BluetoothPeripheral bluetoothPeripheral, int i, int i2) {
    }

    public void onNotificationStateUpdate(BluetoothPeripheral bluetoothPeripheral, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    public void onReadRemoteRssi(BluetoothPeripheral bluetoothPeripheral, int i, int i2) {
    }

    public void onServicesDiscovered(BluetoothPeripheral bluetoothPeripheral) {
    }
}
