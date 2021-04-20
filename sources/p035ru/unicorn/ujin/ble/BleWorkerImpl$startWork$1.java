package p035ru.unicorn.ujin.ble;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.util.Log;
import androidx.room.RoomMasterTable;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.ujin.ble.BleWorkerImpl;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheralCallback;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, mo51343d2 = {"ru/unicorn/ujin/ble/BleWorkerImpl$startWork$1", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothPeripheralCallback;", "onCharacteristicUpdate", "", "peripheral", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothPeripheral;", "value", "", "characteristic", "Landroid/bluetooth/BluetoothGattCharacteristic;", "status", "", "onCharacteristicWrite", "onServicesDiscovered", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.BleWorkerImpl$startWork$1 */
/* compiled from: BleWorkerImpl.kt */
public final class BleWorkerImpl$startWork$1 extends BluetoothPeripheralCallback {
    final /* synthetic */ String $UIDA;
    final /* synthetic */ UUID $UUID_Characteristic;
    final /* synthetic */ UUID $UUID_RX;
    final /* synthetic */ UUID $UUID_Service;
    final /* synthetic */ UUID $UUID_TX;
    final /* synthetic */ OpenBleDevice $openBleDevice;
    final /* synthetic */ BleWorkerImpl this$0;

    BleWorkerImpl$startWork$1(BleWorkerImpl bleWorkerImpl, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, String str, OpenBleDevice openBleDevice) {
        this.this$0 = bleWorkerImpl;
        this.$UUID_Service = uuid;
        this.$UUID_TX = uuid2;
        this.$UUID_RX = uuid3;
        this.$UUID_Characteristic = uuid4;
        this.$UIDA = str;
        this.$openBleDevice = openBleDevice;
    }

    public void onServicesDiscovered(BluetoothPeripheral bluetoothPeripheral) {
        BluetoothGattCharacteristic characteristic;
        List<BluetoothGattCharacteristic> characteristics;
        Intrinsics.checkNotNullParameter(bluetoothPeripheral, "peripheral");
        super.onServicesDiscovered(bluetoothPeripheral);
        Log.d("TAg", "EEE onServicesDiscovered");
        StringBuilder sb = this.this$0.getSb();
        sb.append("\nWWW 1 service=" + this.$UUID_Service + " tx =" + this.$UUID_TX + " rx" + this.$UUID_RX);
        Log.d("TAg", "WWW 1 service=" + this.$UUID_Service + " tx =" + this.$UUID_TX + " rx" + this.$UUID_RX);
        BluetoothGattService service = bluetoothPeripheral.getService(this.$UUID_Service);
        if (!(service == null || (characteristics = service.getCharacteristics()) == null)) {
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics) {
                Intrinsics.checkNotNullExpressionValue(bluetoothGattCharacteristic, "it");
                if (Intrinsics.areEqual((Object) bluetoothGattCharacteristic.getUuid().toString(), (Object) this.$UUID_RX.toString())) {
                    Log.d("TAg", "EEE onServicesDiscovered characteristics " + bluetoothGattCharacteristic.getUuid().toString());
                    bluetoothPeripheral.setNotify(bluetoothGattCharacteristic, true);
                    List<BluetoothGattDescriptor> descriptors = bluetoothGattCharacteristic.getDescriptors();
                    if (descriptors != null) {
                        for (BluetoothGattDescriptor bluetoothGattDescriptor : descriptors) {
                            if (bluetoothGattDescriptor != null) {
                                Log.d("TAg", "EEE onServicesDiscovered descriptorr  " + bluetoothGattDescriptor.getUuid().toString());
                                bluetoothPeripheral.writeDescriptor(bluetoothGattDescriptor, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                            }
                        }
                    }
                }
            }
        }
        BluetoothGattService service2 = bluetoothPeripheral.getService(this.$UUID_Service);
        if (service2 != null && (characteristic = service2.getCharacteristic(this.$UUID_Characteristic)) != null) {
            bluetoothPeripheral.setNotify(characteristic, true);
            this.this$0.getSb().append("\nWWW 2 ");
            Log.d("TAg", "WWW 2 ");
            bluetoothPeripheral.writeCharacteristic(characteristic, BleUtil.parseHexBinary(this.$UIDA), 2);
        }
    }

    public void onCharacteristicWrite(BluetoothPeripheral bluetoothPeripheral, byte[] bArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        Intrinsics.checkNotNullParameter(bluetoothPeripheral, "peripheral");
        Intrinsics.checkNotNullParameter(bArr, "value");
        Intrinsics.checkNotNullParameter(bluetoothGattCharacteristic, "characteristic");
        super.onCharacteristicWrite(bluetoothPeripheral, bArr, bluetoothGattCharacteristic, i);
        Log.d("TAg", "EEE onCharacteristicWrite " + BleUtil.printHexBinary(bArr));
        StringBuilder sb = this.this$0.getSb();
        sb.append("\n WWW onCharacteristicWrite + value " + BleUtil.printHexBinary(bArr));
        Log.d("TAg", "WWW onCharacteristicWrite + value " + BleUtil.printHexBinary(bArr));
        String printHexBinary = BleUtil.printHexBinary(bArr);
        Intrinsics.checkNotNullExpressionValue(printHexBinary, "BleUtil.printHexBinary(value)");
        if (StringsKt.startsWith$default(printHexBinary, RoomMasterTable.DEFAULT_ID, false, 2, (Object) null)) {
            bluetoothPeripheral.cancelConnection();
        }
    }

    public void onCharacteristicUpdate(BluetoothPeripheral bluetoothPeripheral, byte[] bArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        byte[] bArr2;
        Intrinsics.checkNotNullParameter(bluetoothPeripheral, "peripheral");
        Intrinsics.checkNotNullParameter(bArr, "value");
        Intrinsics.checkNotNullParameter(bluetoothGattCharacteristic, "characteristic");
        super.onCharacteristicUpdate(bluetoothPeripheral, bArr, bluetoothGattCharacteristic, i);
        Log.d("TAg", "EEE onCharacteristicUpdate " + BleUtil.printHexBinary(bArr) + " " + bluetoothGattCharacteristic.getUuid().toString());
        this.this$0.print(bluetoothPeripheral, this.$UUID_Service, this.$UUID_TX, this.$UUID_RX);
        StringBuilder sb = new StringBuilder();
        sb.append("WWW 3 ");
        sb.append(BleUtil.printHexBinary(bArr));
        Log.d("TAg", sb.toString());
        BluetoothGattCharacteristic characteristic = bluetoothPeripheral.getCharacteristic(this.$UUID_Service, this.$UUID_TX);
        byte[] value = characteristic != null ? characteristic.getValue() : null;
        Log.d("TAg", "WWW 3 1 1   " + BleUtil.printHexBinary(value));
        this.this$0.getSb().append("\nWWW 3 1   " + BleUtil.printHexBinary(value));
        if (bluetoothPeripheral.getCharacteristic(this.$UUID_Service, this.$UUID_TX) != null) {
            String byteToString = this.$openBleDevice.byteToString(bArr);
            Log.d("TAg", "WWW 3 1 2   " + BleUtil.printHexBinary(value) + this.this$0.getUnique() + " " + byteToString);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("WWW 3 1 3 ");
            sb2.append(byteToString);
            sb2.append(" ");
            Intrinsics.checkNotNullExpressionValue(byteToString, "currnt");
            CharSequence charSequence = byteToString;
            sb2.append(charSequence.length() > 0);
            sb2.append(" ");
            sb2.append(!this.this$0.getUnique().contains(byteToString));
            Log.d("TAg", sb2.toString());
            BleWorkerImpl bleWorkerImpl = this.this$0;
            bleWorkerImpl.setIsa(!bleWorkerImpl.getUnique().contains(byteToString));
            if ((charSequence.length() > 0) && !this.this$0.getUnique().contains(byteToString)) {
                Log.d("TAg", "WWW 3 1 4 " + this.this$0.getIsa());
                this.this$0.getUnique().add(byteToString);
                if (StringsKt.startsWith(byteToString, "41", true) && this.this$0.getIsa()) {
                    this.this$0.setHas41(true);
                    Log.d("TAg", "WWW 4 ");
                    this.this$0.getSb().append("\nWWW 4 ");
                    this.this$0.setIsa(false);
                    OpenBleDevice openBleDevice = this.$openBleDevice;
                    String substring = byteToString.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                    String rotateString = openBleDevice.rotateString(substring);
                    byte[] bArr3 = new byte[0];
                    try {
                        bArr2 = this.$openBleDevice.main(rotateString, this.$UIDA);
                        Intrinsics.checkNotNullExpressionValue(bArr2, "openBleDevice.main(rndn, UIDA)");
                    } catch (Exception unused) {
                        BleWorkerImpl.BleWorkerResult bleWorkerResult = this.this$0.getBleWorkerResult();
                        String sb3 = this.this$0.getSb().toString();
                        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
                        bleWorkerResult.onFailure(sb3);
                        bArr2 = bArr3;
                    }
                    Log.d("TAg", "WWW 4 42 start ");
                    String str = RoomMasterTable.DEFAULT_ID + BleUtil.printHexBinary(bArr2);
                    BluetoothGattCharacteristic characteristic2 = bluetoothPeripheral.getCharacteristic(this.$UUID_Service, this.$UUID_TX);
                    if (characteristic2 != null) {
                        Log.d("TAg", "WWW 4 42 start 2 ");
                        bluetoothPeripheral.writeCharacteristic(characteristic2, BleUtil.parseHexBinary(str), 2);
                    }
                } else if (StringsKt.startsWith(byteToString, "43", true)) {
                    Log.d("TAg", "WWW 5 ");
                    bluetoothPeripheral.cancelConnection();
                    this.this$0.setSuccess(true);
                }
            }
        }
    }
}
