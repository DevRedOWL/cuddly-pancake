package p033co.infinum.goldeneye.models;

import kotlin.Metadata;
import kotlinx.coroutines.DebugKt;
import p033co.infinum.goldeneye.IllegalEnumException;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, mo51343d2 = {"Lco/infinum/goldeneye/models/AntibandingMode;", "", "(Ljava/lang/String;I)V", "toCamera1", "", "toCamera2", "", "AUTO", "HZ_50", "HZ_60", "OFF", "UNKNOWN", "Companion", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.models.AntibandingMode */
/* compiled from: AntibandingMode.kt */
public enum AntibandingMode {
    AUTO,
    HZ_50,
    HZ_60,
    OFF,
    UNKNOWN;
    
    public static final Companion Companion = null;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.models.AntibandingMode$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
            $EnumSwitchMapping$0 = new int[AntibandingMode.values().length];
            $EnumSwitchMapping$0[AntibandingMode.AUTO.ordinal()] = 1;
            $EnumSwitchMapping$0[AntibandingMode.HZ_50.ordinal()] = 2;
            $EnumSwitchMapping$0[AntibandingMode.HZ_60.ordinal()] = 3;
            $EnumSwitchMapping$0[AntibandingMode.OFF.ordinal()] = 4;
            $EnumSwitchMapping$1 = new int[AntibandingMode.values().length];
            $EnumSwitchMapping$1[AntibandingMode.AUTO.ordinal()] = 1;
            $EnumSwitchMapping$1[AntibandingMode.HZ_50.ordinal()] = 2;
            $EnumSwitchMapping$1[AntibandingMode.HZ_60.ordinal()] = 3;
            $EnumSwitchMapping$1[AntibandingMode.OFF.ordinal()] = 4;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public final String toCamera1() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "auto";
        }
        if (i == 2) {
            return "50hz";
        }
        if (i == 3) {
            return "60hz";
        }
        if (i == 4) {
            return DebugKt.DEBUG_PROPERTY_VALUE_OFF;
        }
        throw IllegalEnumException.INSTANCE;
    }

    public final int toCamera2() {
        int i = WhenMappings.$EnumSwitchMapping$1[ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 0;
        }
        throw IllegalEnumException.INSTANCE;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, mo51343d2 = {"Lco/infinum/goldeneye/models/AntibandingMode$Companion;", "", "()V", "fromCamera1", "Lco/infinum/goldeneye/models/AntibandingMode;", "string", "", "fromCamera2", "int", "", "(Ljava/lang/Integer;)Lco/infinum/goldeneye/models/AntibandingMode;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.models.AntibandingMode$Companion */
    /* compiled from: AntibandingMode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AntibandingMode fromCamera1(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case 109935:
                        if (str.equals(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                            return AntibandingMode.OFF;
                        }
                        break;
                    case 1628397:
                        if (str.equals("50hz")) {
                            return AntibandingMode.HZ_50;
                        }
                        break;
                    case 1658188:
                        if (str.equals("60hz")) {
                            return AntibandingMode.HZ_60;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            return AntibandingMode.AUTO;
                        }
                        break;
                }
            }
            return AntibandingMode.UNKNOWN;
        }

        public final AntibandingMode fromCamera2(Integer num) {
            if (num != null && num.intValue() == 0) {
                return AntibandingMode.OFF;
            }
            if (num != null && num.intValue() == 1) {
                return AntibandingMode.HZ_50;
            }
            if (num != null && num.intValue() == 2) {
                return AntibandingMode.HZ_60;
            }
            if (num != null && num.intValue() == 3) {
                return AntibandingMode.AUTO;
            }
            return AntibandingMode.UNKNOWN;
        }
    }
}
