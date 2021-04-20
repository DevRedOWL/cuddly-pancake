package p035ru.unicorn.ujin.ble.data;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.data.SimpleData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/ble/data/PASS_TYPE;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "BLE", "FACE", "FINGER", "CARD", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.data.PASS_TYPE */
/* compiled from: BleData.kt */
public enum PASS_TYPE {
    BLE("ble"),
    FACE("face"),
    FINGER("finger"),
    CARD(SimpleData.CARD);
    
    private final String type;

    private PASS_TYPE(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}
