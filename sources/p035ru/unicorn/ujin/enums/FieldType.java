package p035ru.unicorn.ujin.enums;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldType;", "", "inputType", "", "(Ljava/lang/String;II)V", "getInputType", "()I", "STRING", "INT", "FLOAT", "PHONE", "EMAIL", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.enums.FieldType */
/* compiled from: FieldType.kt */
public enum FieldType {
    STRING(1),
    INT(4096),
    FLOAT(8192),
    PHONE(3),
    EMAIL(32);
    
    public static final Companion Companion = null;
    private final int inputType;

    private FieldType(int i) {
        this.inputType = i;
    }

    public final int getInputType() {
        return this.inputType;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/enums/FieldType$Companion;", "", "()V", "getInputType", "", "name", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.FieldType$Companion */
    /* compiled from: FieldType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getInputType(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return FieldType.valueOf(upperCase).getInputType();
        }
    }
}
