package p033co.infinum.goldeneye.models;

import kotlin.Metadata;
import p033co.infinum.goldeneye.IllegalEnumException;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, mo51343d2 = {"Lco/infinum/goldeneye/models/ColorEffectMode;", "", "(Ljava/lang/String;I)V", "toCamera1", "", "toCamera2", "", "NONE", "MONO", "NEGATIVE", "SOLARIZE", "SEPIA", "POSTERIZE", "WHITEBOARD", "BLACKBOARD", "AQUA", "UNKNOWN", "Companion", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.models.ColorEffectMode */
/* compiled from: ColorEffectMode.kt */
public enum ColorEffectMode {
    NONE,
    MONO,
    NEGATIVE,
    SOLARIZE,
    SEPIA,
    POSTERIZE,
    WHITEBOARD,
    BLACKBOARD,
    AQUA,
    UNKNOWN;
    
    public static final Companion Companion = null;

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public final String toCamera1() {
        switch (this) {
            case NONE:
                return "none";
            case MONO:
                return "mono";
            case NEGATIVE:
                return "negative";
            case SOLARIZE:
                return "solarize";
            case SEPIA:
                return "sepia";
            case POSTERIZE:
                return "posterize";
            case WHITEBOARD:
                return "whiteboard";
            case BLACKBOARD:
                return "blackboard";
            case AQUA:
                return "aqua";
            default:
                throw IllegalEnumException.INSTANCE;
        }
    }

    public final int toCamera2() {
        switch (this) {
            case NONE:
                return 0;
            case MONO:
                return 1;
            case NEGATIVE:
                return 2;
            case SOLARIZE:
                return 3;
            case SEPIA:
                return 4;
            case POSTERIZE:
                return 5;
            case WHITEBOARD:
                return 6;
            case BLACKBOARD:
                return 7;
            case AQUA:
                return 8;
            default:
                throw IllegalEnumException.INSTANCE;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, mo51343d2 = {"Lco/infinum/goldeneye/models/ColorEffectMode$Companion;", "", "()V", "fromCamera1", "Lco/infinum/goldeneye/models/ColorEffectMode;", "string", "", "fromCamera2", "int", "", "(Ljava/lang/Integer;)Lco/infinum/goldeneye/models/ColorEffectMode;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.models.ColorEffectMode$Companion */
    /* compiled from: ColorEffectMode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ColorEffectMode fromCamera1(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1635350969:
                        if (str.equals("blackboard")) {
                            return ColorEffectMode.BLACKBOARD;
                        }
                        break;
                    case 3002044:
                        if (str.equals("aqua")) {
                            return ColorEffectMode.AQUA;
                        }
                        break;
                    case 3357411:
                        if (str.equals("mono")) {
                            return ColorEffectMode.MONO;
                        }
                        break;
                    case 3387192:
                        if (str.equals("none")) {
                            return ColorEffectMode.NONE;
                        }
                        break;
                    case 109324790:
                        if (str.equals("sepia")) {
                            return ColorEffectMode.SEPIA;
                        }
                        break;
                    case 261182557:
                        if (str.equals("whiteboard")) {
                            return ColorEffectMode.WHITEBOARD;
                        }
                        break;
                    case 921111605:
                        if (str.equals("negative")) {
                            return ColorEffectMode.NEGATIVE;
                        }
                        break;
                    case 1473417203:
                        if (str.equals("solarize")) {
                            return ColorEffectMode.SOLARIZE;
                        }
                        break;
                    case 2008448231:
                        if (str.equals("posterize")) {
                            return ColorEffectMode.POSTERIZE;
                        }
                        break;
                }
            }
            return ColorEffectMode.UNKNOWN;
        }

        public final ColorEffectMode fromCamera2(Integer num) {
            if (num != null && num.intValue() == 0) {
                return ColorEffectMode.NONE;
            }
            if (num != null && num.intValue() == 1) {
                return ColorEffectMode.MONO;
            }
            if (num != null && num.intValue() == 2) {
                return ColorEffectMode.NEGATIVE;
            }
            if (num != null && num.intValue() == 3) {
                return ColorEffectMode.SOLARIZE;
            }
            if (num != null && num.intValue() == 4) {
                return ColorEffectMode.SEPIA;
            }
            if (num != null && num.intValue() == 5) {
                return ColorEffectMode.POSTERIZE;
            }
            if (num != null && num.intValue() == 6) {
                return ColorEffectMode.WHITEBOARD;
            }
            if (num != null && num.intValue() == 7) {
                return ColorEffectMode.BLACKBOARD;
            }
            if (num != null && num.intValue() == 8) {
                return ColorEffectMode.AQUA;
            }
            return ColorEffectMode.UNKNOWN;
        }
    }
}
