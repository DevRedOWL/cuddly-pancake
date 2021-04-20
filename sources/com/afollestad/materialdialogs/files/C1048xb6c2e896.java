package com.afollestad.materialdialogs.files;

import java.io.File;
import java.util.Comparator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* renamed from: com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1$result$1$invokeSuspend$$inlined$sortedBy$1 */
/* compiled from: Comparisons.kt */
public final class C1048xb6c2e896<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        File file = (File) t;
        Intrinsics.checkExpressionValueIsNotNull(file, "it");
        String name = file.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "it.name");
        Locale locale = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
        if (name != null) {
            String lowerCase = name.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            Comparable comparable = lowerCase;
            File file2 = (File) t2;
            Intrinsics.checkExpressionValueIsNotNull(file2, "it");
            String name2 = file2.getName();
            Intrinsics.checkExpressionValueIsNotNull(name2, "it.name");
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.getDefault()");
            if (name2 != null) {
                String lowerCase2 = name2.toLowerCase(locale2);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                return ComparisonsKt.compareValues(comparable, lowerCase2);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
