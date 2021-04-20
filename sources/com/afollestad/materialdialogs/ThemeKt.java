package com.afollestad.materialdialogs;

import android.content.Context;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\b"}, mo51343d2 = {"inferTheme", "", "context", "Landroid/content/Context;", "dialogBehavior", "Lcom/afollestad/materialdialogs/DialogBehavior;", "inferThemeIsLight", "", "core"}, mo51344k = 2, mo51345mv = {1, 1, 16})
/* compiled from: Theme.kt */
public final class ThemeKt {
    public static final int inferTheme(Context context, DialogBehavior dialogBehavior) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(dialogBehavior, "dialogBehavior");
        return dialogBehavior.getThemeRes(!inferThemeIsLight(context));
    }

    public static final boolean inferThemeIsLight(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return MDUtil.isColorDark$default(MDUtil.INSTANCE, MDUtil.resolveColor$default(MDUtil.INSTANCE, context, (Integer) null, 16842806, (Function0) null, 10, (Object) null), Utils.DOUBLE_EPSILON, 1, (Object) null);
    }
}
