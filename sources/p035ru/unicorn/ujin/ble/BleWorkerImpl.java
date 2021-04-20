package p035ru.unicorn.ujin.ble;

import android.app.Application;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.HashSet;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.BleReader;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001RB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0002\u0010\tJ\u0006\u0010I\u001a\u00020JJ(\u0010K\u001a\u00020J2\u0006\u00109\u001a\u00020:2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020MH\u0002J\b\u0010P\u001a\u00020JH\u0002J\u0016\u0010P\u001a\u00020J2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J \u0010Q\u001a\u00020J2\u0006\u00109\u001a\u00020:2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u001a\u0010)\u001a\u00020*X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000200X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00101\"\u0004\b5\u00103R\u001a\u00106\u001a\u000200X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00101\"\u0004\b8\u00103R\u001c\u00109\u001a\u0004\u0018\u00010:X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR!\u0010C\u001a\u0012\u0012\u0004\u0012\u00020E0Dj\b\u0012\u0004\u0012\u00020E`F¢\u0006\b\n\u0000\u001a\u0004\bG\u0010H¨\u0006S"}, mo51343d2 = {"Lru/unicorn/ujin/ble/BleWorkerImpl;", "Lru/unicorn/ujin/ble/BleWorker;", "application", "Landroid/app/Application;", "bleWorkerResult", "Lru/unicorn/ujin/ble/BleWorkerImpl$BleWorkerResult;", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "(Landroid/app/Application;Lru/unicorn/ujin/ble/BleWorkerImpl$BleWorkerResult;Ljava/lang/StringBuilder;)V", "getApplication", "()Landroid/app/Application;", "ble", "Lru/unicorn/ujin/ble/data/BleReader;", "getBle", "()Lru/unicorn/ujin/ble/data/BleReader;", "setBle", "(Lru/unicorn/ujin/ble/data/BleReader;)V", "bleKeyData", "Lru/unicorn/ujin/ble/data/BleKeyData;", "getBleKeyData", "()Lru/unicorn/ujin/ble/data/BleKeyData;", "setBleKeyData", "(Lru/unicorn/ujin/ble/data/BleKeyData;)V", "getBleWorkerResult", "()Lru/unicorn/ujin/ble/BleWorkerImpl$BleWorkerResult;", "central", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothCentral;", "getCentral", "()Lru/unicorn/ujin/ble/ble_helper_class/BluetoothCentral;", "central$delegate", "Lkotlin/Lazy;", "countTry", "", "getCountTry", "()I", "setCountTry", "(I)V", "failCount", "getFailCount", "setFailCount", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "isHas41", "", "()Z", "setHas41", "(Z)V", "isSuccess", "setSuccess", "isa", "getIsa", "setIsa", "peripheral", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothPeripheral;", "getPeripheral", "()Lru/unicorn/ujin/ble/ble_helper_class/BluetoothPeripheral;", "setPeripheral", "(Lru/unicorn/ujin/ble/ble_helper_class/BluetoothPeripheral;)V", "getSb", "()Ljava/lang/StringBuilder;", "setSb", "(Ljava/lang/StringBuilder;)V", "unique", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "getUnique", "()Ljava/util/HashSet;", "onDestroy", "", "print", "UUID_Service", "Ljava/util/UUID;", "UUID_TX", "UUID_RX", "startScan", "startWork", "BleWorkerResult", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.BleWorkerImpl */
/* compiled from: BleWorkerImpl.kt */
public final class BleWorkerImpl implements BleWorker {
    private final Application application;
    private BleReader ble;
    private BleKeyData bleKeyData;
    private final BleWorkerResult bleWorkerResult;
    private final Lazy central$delegate;
    private int countTry;
    private int failCount;
    public Handler handler;
    private boolean isHas41;
    private boolean isSuccess;
    private boolean isa;
    private BluetoothPeripheral peripheral;

    /* renamed from: sb */
    private StringBuilder f6605sb;
    private final HashSet<String> unique;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/ble/BleWorkerImpl$BleWorkerResult;", "", "onFailure", "", "toString", "", "onSuccess", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.ble.BleWorkerImpl$BleWorkerResult */
    /* compiled from: BleWorkerImpl.kt */
    public interface BleWorkerResult {
        void onFailure(String str);

        void onSuccess(String str);
    }

    /* access modifiers changed from: private */
    public final BluetoothCentral getCentral() {
        return (BluetoothCentral) this.central$delegate.getValue();
    }

    public BleWorkerImpl(Application application2, BleWorkerResult bleWorkerResult2, StringBuilder sb) {
        Intrinsics.checkNotNullParameter(application2, "application");
        Intrinsics.checkNotNullParameter(bleWorkerResult2, "bleWorkerResult");
        Intrinsics.checkNotNullParameter(sb, "sb");
        this.application = application2;
        this.bleWorkerResult = bleWorkerResult2;
        this.f6605sb = sb;
        this.isa = true;
        this.unique = new HashSet<>();
        this.central$delegate = LazyKt.lazy(new BleWorkerImpl$central$2(this));
    }

    public final Application getApplication() {
        return this.application;
    }

    public final BleWorkerResult getBleWorkerResult() {
        return this.bleWorkerResult;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BleWorkerImpl(Application application2, BleWorkerResult bleWorkerResult2, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application2, bleWorkerResult2, (i & 4) != 0 ? new StringBuilder("") : sb);
    }

    public final StringBuilder getSb() {
        return this.f6605sb;
    }

    public final void setSb(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<set-?>");
        this.f6605sb = sb;
    }

    public final boolean getIsa() {
        return this.isa;
    }

    public final void setIsa(boolean z) {
        this.isa = z;
    }

    public final boolean isHas41() {
        return this.isHas41;
    }

    public final void setHas41(boolean z) {
        this.isHas41 = z;
    }

    public final int getCountTry() {
        return this.countTry;
    }

    public final void setCountTry(int i) {
        this.countTry = i;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public final int getFailCount() {
        return this.failCount;
    }

    public final void setFailCount(int i) {
        this.failCount = i;
    }

    public final Handler getHandler() {
        Handler handler2 = this.handler;
        if (handler2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
        }
        return handler2;
    }

    public final void setHandler(Handler handler2) {
        Intrinsics.checkNotNullParameter(handler2, "<set-?>");
        this.handler = handler2;
    }

    public final HashSet<String> getUnique() {
        return this.unique;
    }

    public final BluetoothPeripheral getPeripheral() {
        return this.peripheral;
    }

    public final void setPeripheral(BluetoothPeripheral bluetoothPeripheral) {
        this.peripheral = bluetoothPeripheral;
    }

    public final BleKeyData getBleKeyData() {
        return this.bleKeyData;
    }

    public final void setBleKeyData(BleKeyData bleKeyData2) {
        this.bleKeyData = bleKeyData2;
    }

    public final BleReader getBle() {
        return this.ble;
    }

    public final void setBle(BleReader bleReader) {
        this.ble = bleReader;
    }

    public final void startScan(BleReader bleReader, BleKeyData bleKeyData2) {
        Intrinsics.checkNotNullParameter(bleReader, "ble");
        Intrinsics.checkNotNullParameter(bleKeyData2, "bleKeyData");
        BluetoothPeripheral peripheral2 = getCentral().getPeripheral(bleReader.getDeviceMac());
        Intrinsics.checkNotNullExpressionValue(peripheral2, "central.getPeripheral(ble.deviceMac)");
        this.handler = new Handler(Looper.getMainLooper());
        Handler handler2 = this.handler;
        if (handler2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
        }
        handler2.postDelayed(new BleWorkerImpl$startScan$1(this, peripheral2), 5000);
        peripheral2.clearServicesCache();
        startWork(peripheral2, bleKeyData2, bleReader);
    }

    /* access modifiers changed from: private */
    public final void startScan() {
        BleKeyData bleKeyData2;
        BleReader bleReader;
        BluetoothPeripheral bluetoothPeripheral = this.peripheral;
        if (bluetoothPeripheral != null && (bleKeyData2 = this.bleKeyData) != null && (bleReader = this.ble) != null) {
            startWork(bluetoothPeripheral, bleKeyData2, bleReader);
        }
    }

    private final void startWork(BluetoothPeripheral bluetoothPeripheral, BleKeyData bleKeyData2, BleReader bleReader) {
        this.peripheral = bluetoothPeripheral;
        this.bleKeyData = bleKeyData2;
        this.ble = bleReader;
        UUID fromString = UUID.fromString(bleReader.getUuidService());
        Intrinsics.checkNotNullExpressionValue(fromString, "UUID.fromString(ble.uuidService)");
        UUID fromString2 = UUID.fromString(bleReader.getUuidID());
        Intrinsics.checkNotNullExpressionValue(fromString2, "UUID.fromString(ble.uuidID)");
        String keyValue = bleKeyData2.getKeyValue();
        UUID fromString3 = UUID.fromString(bleReader.getUuidTX());
        Intrinsics.checkNotNullExpressionValue(fromString3, "UUID.fromString(ble.uuidTX)");
        UUID fromString4 = UUID.fromString(bleReader.getUuidRX());
        Intrinsics.checkNotNullExpressionValue(fromString4, "UUID.fromString(ble.uuidRX)");
        OpenBleDevice openBleDevice = new OpenBleDevice();
        this.isa = true;
        this.isHas41 = false;
        BluetoothGattCharacteristic characteristic = bluetoothPeripheral.getCharacteristic(fromString, fromString3);
        this.unique.add(BleUtil.printHexBinary(characteristic != null ? characteristic.getValue() : null));
        getCentral().connectPeripheral(bluetoothPeripheral, new BleWorkerImpl$startWork$1(this, fromString, fromString3, fromString4, fromString2, keyValue, openBleDevice));
    }

    /* access modifiers changed from: private */
    public final void print(BluetoothPeripheral bluetoothPeripheral, UUID uuid, UUID uuid2, UUID uuid3) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int i = 0;
        while (i < 400) {
            i++;
            BluetoothGattCharacteristic characteristic = bluetoothPeripheral.getCharacteristic(uuid, uuid2);
            byte[] bArr = null;
            byte[] value = characteristic != null ? characteristic.getValue() : null;
            BluetoothGattCharacteristic characteristic2 = bluetoothPeripheral.getCharacteristic(uuid, uuid3);
            if (characteristic2 != null) {
                bArr = characteristic2.getValue();
            }
            String printHexBinary = BleUtil.printHexBinary(value);
            Intrinsics.checkNotNullExpressionValue(printHexBinary, "strinxX");
            boolean z = true;
            if ((printHexBinary.length() > 0) && !hashSet.contains(printHexBinary)) {
                hashSet.add(printHexBinary);
                Log.d("TAG", "EEE print onCharacteristicUpdate TX " + printHexBinary);
            }
            String printHexBinary2 = BleUtil.printHexBinary(bArr);
            Intrinsics.checkNotNullExpressionValue(printHexBinary2, "strinxRX");
            if (printHexBinary2.length() <= 0) {
                z = false;
            }
            if (z && !hashSet2.contains(printHexBinary2)) {
                hashSet2.add(printHexBinary2);
                Log.d("TAG", "EEE print onCharacteristicUpdate RX " + printHexBinary2);
            }
        }
    }

    public final void onDestroy() {
        getCentral().close();
    }
}
