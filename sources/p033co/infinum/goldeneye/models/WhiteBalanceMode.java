package p033co.infinum.goldeneye.models;

import kotlin.Metadata;
import p033co.infinum.goldeneye.IllegalEnumException;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, mo51343d2 = {"Lco/infinum/goldeneye/models/WhiteBalanceMode;", "", "(Ljava/lang/String;I)V", "toCamera1", "", "toCamera2", "", "OFF", "AUTO", "INCANDESCENT", "FLUORESCENT", "WARM_FLUORESCENT", "DAYLIGHT", "CLOUDY_DAYLIGHT", "TWILIGHT", "SHADE", "UNKNOWN", "Companion", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.models.WhiteBalanceMode */
/* compiled from: WhiteBalanceMode.kt */
public enum WhiteBalanceMode {
    OFF,
    AUTO,
    INCANDESCENT,
    FLUORESCENT,
    WARM_FLUORESCENT,
    DAYLIGHT,
    CLOUDY_DAYLIGHT,
    TWILIGHT,
    SHADE,
    UNKNOWN;
    
    public static final Companion Companion = null;

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public final String toCamera1() {
        switch (this) {
            case AUTO:
                return "auto";
            case INCANDESCENT:
                return "incandescent";
            case FLUORESCENT:
                return "fluorescent";
            case WARM_FLUORESCENT:
                return "warm-fluorescent";
            case DAYLIGHT:
                return "daylight";
            case CLOUDY_DAYLIGHT:
                return "cloudy-daylight";
            case TWILIGHT:
                return "twilight";
            case SHADE:
                return "shade";
            default:
                throw IllegalEnumException.INSTANCE;
        }
    }

    public final int toCamera2() {
        switch (this) {
            case OFF:
                return 0;
            case AUTO:
                return 1;
            case INCANDESCENT:
                return 2;
            case FLUORESCENT:
                return 3;
            case WARM_FLUORESCENT:
                return 4;
            case DAYLIGHT:
                return 5;
            case CLOUDY_DAYLIGHT:
                return 6;
            case TWILIGHT:
                return 7;
            case SHADE:
                return 8;
            default:
                throw IllegalEnumException.INSTANCE;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, mo51343d2 = {"Lco/infinum/goldeneye/models/WhiteBalanceMode$Companion;", "", "()V", "fromCamera1", "Lco/infinum/goldeneye/models/WhiteBalanceMode;", "string", "", "fromCamera2", "int", "", "(Ljava/lang/Integer;)Lco/infinum/goldeneye/models/WhiteBalanceMode;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.models.WhiteBalanceMode$Companion */
    /* compiled from: WhiteBalanceMode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WhiteBalanceMode fromCamera1(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -939299377:
                        if (str.equals("incandescent")) {
                            return WhiteBalanceMode.INCANDESCENT;
                        }
                        break;
                    case -719316704:
                        if (str.equals("warm-fluorescent")) {
                            return WhiteBalanceMode.WARM_FLUORESCENT;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            return WhiteBalanceMode.AUTO;
                        }
                        break;
                    case 109399597:
                        if (str.equals("shade")) {
                            return WhiteBalanceMode.SHADE;
                        }
                        break;
                    case 474934723:
                        if (str.equals("cloudy-daylight")) {
                            return WhiteBalanceMode.CLOUDY_DAYLIGHT;
                        }
                        break;
                    case 1650323088:
                        if (str.equals("twilight")) {
                            return WhiteBalanceMode.TWILIGHT;
                        }
                        break;
                    case 1902580840:
                        if (str.equals("fluorescent")) {
                            return WhiteBalanceMode.FLUORESCENT;
                        }
                        break;
                    case 1942983418:
                        if (str.equals("daylight")) {
                            return WhiteBalanceMode.DAYLIGHT;
                        }
                        break;
                }
            }
            return WhiteBalanceMode.UNKNOWN;
        }

        public final WhiteBalanceMode fromCamera2(Integer num) {
            if (num != null && num.intValue() == 0) {
                return WhiteBalanceMode.OFF;
            }
            if (num != null && num.intValue() == 1) {
                return WhiteBalanceMode.AUTO;
            }
            if (num != null && num.intValue() == 2) {
                return WhiteBalanceMode.INCANDESCENT;
            }
            if (num != null && num.intValue() == 3) {
                return WhiteBalanceMode.FLUORESCENT;
            }
            if (num != null && num.intValue() == 4) {
                return WhiteBalanceMode.WARM_FLUORESCENT;
            }
            if (num != null && num.intValue() == 5) {
                return WhiteBalanceMode.DAYLIGHT;
            }
            if (num != null && num.intValue() == 6) {
                return WhiteBalanceMode.CLOUDY_DAYLIGHT;
            }
            if (num != null && num.intValue() == 7) {
                return WhiteBalanceMode.TWILIGHT;
            }
            if (num != null && num.intValue() == 8) {
                return WhiteBalanceMode.SHADE;
            }
            return WhiteBalanceMode.UNKNOWN;
        }
    }
}
