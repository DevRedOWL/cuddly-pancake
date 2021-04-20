package org.koin.core.qualifier;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo51343d2 = {"Lorg/koin/core/qualifier/StringQualifier;", "Lorg/koin/core/qualifier/Qualifier;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: StringQualifier.kt */
public final class StringQualifier implements Qualifier {
    private final String value;

    public static /* synthetic */ StringQualifier copy$default(StringQualifier stringQualifier, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringQualifier.value;
        }
        return stringQualifier.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final StringQualifier copy(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        return new StringQualifier(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StringQualifier) && Intrinsics.areEqual((Object) this.value, (Object) ((StringQualifier) obj).value);
        }
        return true;
    }

    public int hashCode() {
        String str = this.value;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public StringQualifier(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    public String toString() {
        return this.value;
    }
}
