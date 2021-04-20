package com.afollestad.materialdialogs.internal.rtl;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.afollestad.materialdialogs.utils.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lcom/afollestad/materialdialogs/internal/rtl/RtlTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, mo51344k = 1, mo51345mv = {1, 1, 16})
/* compiled from: RtlTextView.kt */
public final class RtlTextView extends AppCompatTextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtlTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        ViewsKt.setGravityStartCompat(this);
    }
}
