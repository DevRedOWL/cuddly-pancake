package com.afollestad.date.managers;

import android.content.Context;
import com.afollestad.date.C1027R;
import com.afollestad.date.util.ContextsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: DatePickerLayoutManager.kt */
final class DatePickerLayoutManager$headerBackgroundColor$1 extends Lambda implements Function0<Integer> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DatePickerLayoutManager$headerBackgroundColor$1(Context context) {
        super(0);
        this.$context = context;
    }

    public final int invoke() {
        return ContextsKt.resolveColor$default(this.$context, C1027R.attr.colorAccent, (Function0) null, 2, (Object) null);
    }
}
