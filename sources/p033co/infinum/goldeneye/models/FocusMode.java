package p033co.infinum.goldeneye.models;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p033co.infinum.goldeneye.IllegalEnumException;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, mo51343d2 = {"Lco/infinum/goldeneye/models/FocusMode;", "", "(Ljava/lang/String;I)V", "toCamera1", "", "toCamera2", "", "AUTO", "INFINITY", "MACRO", "FIXED", "EDOF", "CONTINUOUS_VIDEO", "CONTINUOUS_PICTURE", "UNKNOWN", "Companion", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.models.FocusMode */
/* compiled from: FocusMode.kt */
public enum FocusMode {
    AUTO,
    INFINITY,
    MACRO,
    FIXED,
    EDOF,
    CONTINUOUS_VIDEO,
    CONTINUOUS_PICTURE,
    UNKNOWN;
    
    public static final Companion Companion = null;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.models.FocusMode$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
            $EnumSwitchMapping$0 = new int[FocusMode.values().length];
            $EnumSwitchMapping$0[FocusMode.AUTO.ordinal()] = 1;
            $EnumSwitchMapping$0[FocusMode.INFINITY.ordinal()] = 2;
            $EnumSwitchMapping$0[FocusMode.MACRO.ordinal()] = 3;
            $EnumSwitchMapping$0[FocusMode.FIXED.ordinal()] = 4;
            $EnumSwitchMapping$0[FocusMode.EDOF.ordinal()] = 5;
            $EnumSwitchMapping$0[FocusMode.CONTINUOUS_VIDEO.ordinal()] = 6;
            $EnumSwitchMapping$0[FocusMode.CONTINUOUS_PICTURE.ordinal()] = 7;
            $EnumSwitchMapping$0[FocusMode.UNKNOWN.ordinal()] = 8;
            $EnumSwitchMapping$1 = new int[FocusMode.values().length];
            $EnumSwitchMapping$1[FocusMode.AUTO.ordinal()] = 1;
            $EnumSwitchMapping$1[FocusMode.MACRO.ordinal()] = 2;
            $EnumSwitchMapping$1[FocusMode.EDOF.ordinal()] = 3;
            $EnumSwitchMapping$1[FocusMode.CONTINUOUS_VIDEO.ordinal()] = 4;
            $EnumSwitchMapping$1[FocusMode.CONTINUOUS_PICTURE.ordinal()] = 5;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public final String toCamera1() {
        switch (this) {
            case AUTO:
                return "auto";
            case INFINITY:
                return "infinity";
            case MACRO:
                return "macro";
            case FIXED:
                return "fixed";
            case EDOF:
                return "edof";
            case CONTINUOUS_VIDEO:
                return "continuous-video";
            case CONTINUOUS_PICTURE:
                return "continuous-picture";
            case UNKNOWN:
                throw IllegalEnumException.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int toCamera2() {
        int i = WhenMappings.$EnumSwitchMapping$1[ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 5;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        throw IllegalEnumException.INSTANCE;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, mo51343d2 = {"Lco/infinum/goldeneye/models/FocusMode$Companion;", "", "()V", "fromCamera1", "Lco/infinum/goldeneye/models/FocusMode;", "string", "", "fromCamera2", "int", "", "(Ljava/lang/Integer;)Lco/infinum/goldeneye/models/FocusMode;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.models.FocusMode$Companion */
    /* compiled from: FocusMode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FocusMode fromCamera1(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -194628547:
                        if (str.equals("continuous-video")) {
                            return FocusMode.CONTINUOUS_VIDEO;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            return FocusMode.AUTO;
                        }
                        break;
                    case 3108534:
                        if (str.equals("edof")) {
                            return FocusMode.EDOF;
                        }
                        break;
                    case 97445748:
                        if (str.equals("fixed")) {
                            return FocusMode.FIXED;
                        }
                        break;
                    case 103652300:
                        if (str.equals("macro")) {
                            return FocusMode.MACRO;
                        }
                        break;
                    case 173173288:
                        if (str.equals("infinity")) {
                            return FocusMode.INFINITY;
                        }
                        break;
                    case 910005312:
                        if (str.equals("continuous-picture")) {
                            return FocusMode.CONTINUOUS_PICTURE;
                        }
                        break;
                }
            }
            return FocusMode.UNKNOWN;
        }

        public final FocusMode fromCamera2(Integer num) {
            if (num != null && num.intValue() == 1) {
                return FocusMode.AUTO;
            }
            if (num != null && num.intValue() == 4) {
                return FocusMode.CONTINUOUS_PICTURE;
            }
            if (num != null && num.intValue() == 3) {
                return FocusMode.CONTINUOUS_VIDEO;
            }
            if (num != null && num.intValue() == 5) {
                return FocusMode.EDOF;
            }
            if (num != null && num.intValue() == 2) {
                return FocusMode.MACRO;
            }
            return FocusMode.UNKNOWN;
        }
    }
}
