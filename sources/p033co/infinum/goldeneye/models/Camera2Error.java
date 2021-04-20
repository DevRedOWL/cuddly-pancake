package p033co.infinum.goldeneye.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, mo51343d2 = {"Lco/infinum/goldeneye/models/Camera2Error;", "", "message", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "IN_USE", "MAX_CAMERAS_IN_USE", "DISABLED", "DEVICE", "HARDWARE", "UNKNOWN", "Companion", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.models.Camera2Error */
/* compiled from: Camera2Error.kt */
public enum Camera2Error {
    IN_USE("Camera already used by higher-priority camera API client"),
    MAX_CAMERAS_IN_USE("Camera could not open because there are too many other open cameras"),
    DISABLED("Camera could not be opened due to a device policy"),
    DEVICE("Fatal error. Camera needs to be re-opened to be used again"),
    HARDWARE("Hardware error"),
    UNKNOWN("Unknown Camera error happened");
    
    public static final Companion Companion = null;
    private final String message;

    protected Camera2Error(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        this.message = str;
    }

    public final String getMessage() {
        return this.message;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lco/infinum/goldeneye/models/Camera2Error$Companion;", "", "()V", "fromInt", "Lco/infinum/goldeneye/models/Camera2Error;", "errorCode", "", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.models.Camera2Error$Companion */
    /* compiled from: Camera2Error.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Camera2Error fromInt(int i) {
            if (i == 1) {
                return Camera2Error.IN_USE;
            }
            if (i == 2) {
                return Camera2Error.MAX_CAMERAS_IN_USE;
            }
            if (i == 3) {
                return Camera2Error.DISABLED;
            }
            if (i == 4) {
                return Camera2Error.DEVICE;
            }
            if (i != 5) {
                return Camera2Error.UNKNOWN;
            }
            return Camera2Error.HARDWARE;
        }
    }
}
