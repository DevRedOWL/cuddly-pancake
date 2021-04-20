package com.afollestad.materialdialogs.files.util;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"setVisible", "", "T", "Landroid/view/View;", "visible", "", "(Landroid/view/View;Z)V", "files"}, mo51344k = 2, mo51345mv = {1, 1, 16})
/* compiled from: ViewExt.kt */
public final class ViewExtKt {
    public static final <T extends View> void setVisible(T t, boolean z) {
        Intrinsics.checkParameterIsNotNull(t, "$this$setVisible");
        t.setVisibility(z ? 0 : 4);
    }
}
