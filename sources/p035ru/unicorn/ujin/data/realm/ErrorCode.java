package p035ru.unicorn.ujin.data.realm;

import androidx.core.p004os.EnvironmentCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/ErrorCode;", "", "codeValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCodeValue", "()Ljava/lang/String;", "UNKNOWN", "INCORRECT_VALUE", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.ErrorCode */
/* compiled from: ErrorCode.kt */
public enum ErrorCode {
    UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN),
    INCORRECT_VALUE("incorrect-value");
    
    public static final Companion Companion = null;
    private final String codeValue;

    private ErrorCode(String str) {
        this.codeValue = str;
    }

    public final String getCodeValue() {
        return this.codeValue;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/ErrorCode$Companion;", "", "()V", "getCodeByValue", "Lru/unicorn/ujin/data/realm/ErrorCode;", "value", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.ErrorCode$Companion */
    /* compiled from: ErrorCode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorCode getCodeByValue(String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (Intrinsics.areEqual((Object) errorCode.getCodeValue(), (Object) str)) {
                    return errorCode;
                }
            }
            return ErrorCode.UNKNOWN;
        }
    }
}
