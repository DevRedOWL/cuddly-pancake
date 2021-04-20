package p033co.infinum.goldeneye.models;

import kotlin.Metadata;
import kotlinx.coroutines.DebugKt;
import p033co.infinum.goldeneye.IllegalEnumException;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, mo51343d2 = {"Lco/infinum/goldeneye/models/FlashMode;", "", "(Ljava/lang/String;I)V", "toCamera1", "", "toCamera2", "", "OFF", "ON", "AUTO", "TORCH", "RED_EYE", "UNKNOWN", "Companion", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.models.FlashMode */
/* compiled from: FlashMode.kt */
public enum FlashMode {
    OFF,
    ON,
    AUTO,
    TORCH,
    RED_EYE,
    UNKNOWN;
    
    public static final Companion Companion = null;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.models.FlashMode$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
            $EnumSwitchMapping$0 = new int[FlashMode.values().length];
            $EnumSwitchMapping$0[FlashMode.OFF.ordinal()] = 1;
            $EnumSwitchMapping$0[FlashMode.ON.ordinal()] = 2;
            $EnumSwitchMapping$0[FlashMode.AUTO.ordinal()] = 3;
            $EnumSwitchMapping$0[FlashMode.TORCH.ordinal()] = 4;
            $EnumSwitchMapping$0[FlashMode.RED_EYE.ordinal()] = 5;
            $EnumSwitchMapping$1 = new int[FlashMode.values().length];
            $EnumSwitchMapping$1[FlashMode.ON.ordinal()] = 1;
            $EnumSwitchMapping$1[FlashMode.AUTO.ordinal()] = 2;
            $EnumSwitchMapping$1[FlashMode.RED_EYE.ordinal()] = 3;
            $EnumSwitchMapping$1[FlashMode.OFF.ordinal()] = 4;
            $EnumSwitchMapping$1[FlashMode.TORCH.ordinal()] = 5;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public final String toCamera1() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return DebugKt.DEBUG_PROPERTY_VALUE_OFF;
        }
        if (i == 2) {
            return "on";
        }
        if (i == 3) {
            return "auto";
        }
        if (i == 4) {
            return "torch";
        }
        if (i == 5) {
            return "red-eye";
        }
        throw IllegalEnumException.INSTANCE;
    }

    public final int toCamera2() {
        int i = WhenMappings.$EnumSwitchMapping$1[ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 5) {
            return 2;
        }
        throw IllegalEnumException.INSTANCE;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, mo51343d2 = {"Lco/infinum/goldeneye/models/FlashMode$Companion;", "", "()V", "fromCamera1", "Lco/infinum/goldeneye/models/FlashMode;", "string", "", "fromCamera2", "int", "", "(Ljava/lang/Integer;)Lco/infinum/goldeneye/models/FlashMode;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.models.FlashMode$Companion */
    /* compiled from: FlashMode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FlashMode fromCamera1(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case 3551:
                        if (str.equals("on")) {
                            return FlashMode.ON;
                        }
                        break;
                    case 109935:
                        if (str.equals(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                            return FlashMode.OFF;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            return FlashMode.AUTO;
                        }
                        break;
                    case 110547964:
                        if (str.equals("torch")) {
                            return FlashMode.TORCH;
                        }
                        break;
                    case 1081542389:
                        if (str.equals("red-eye")) {
                            return FlashMode.RED_EYE;
                        }
                        break;
                }
            }
            return FlashMode.UNKNOWN;
        }

        public final FlashMode fromCamera2(Integer num) {
            if (num != null && num.intValue() == 3) {
                return FlashMode.ON;
            }
            if (num != null && num.intValue() == 2) {
                return FlashMode.AUTO;
            }
            if (num != null && num.intValue() == 4) {
                return FlashMode.RED_EYE;
            }
            if (num != null && num.intValue() == 1) {
                return FlashMode.OFF;
            }
            return FlashMode.UNKNOWN;
        }
    }
}
