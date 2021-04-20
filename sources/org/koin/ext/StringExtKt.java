package org.koin.ext;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0002¨\u0006\u0005"}, mo51343d2 = {"isFloat", "", "", "isInt", "quoted", "koin-core"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: StringExt.kt */
public final class StringExtKt {
    public static final boolean isFloat(String str) {
        Intrinsics.checkParameterIsNotNull(str, "$this$isFloat");
        return StringsKt.toFloatOrNull(str) != null;
    }

    public static final boolean isInt(String str) {
        Intrinsics.checkParameterIsNotNull(str, "$this$isInt");
        return StringsKt.toIntOrNull(str) != null;
    }

    public static final String quoted(String str) {
        Intrinsics.checkParameterIsNotNull(str, "$this$quoted");
        return StringsKt.replace$default(str, "\"", "", false, 4, (Object) null);
    }
}
