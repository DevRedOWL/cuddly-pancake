package com.afollestad.date.renderers;

import com.afollestad.date.C1027R;
import com.afollestad.date.util.ContextsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: MonthItemRenderer.kt */
final class MonthItemRenderer$selectionColor$1 extends Lambda implements Function0<Integer> {
    final /* synthetic */ MonthItemRenderer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MonthItemRenderer$selectionColor$1(MonthItemRenderer monthItemRenderer) {
        super(0);
        this.this$0 = monthItemRenderer;
    }

    public final int invoke() {
        return ContextsKt.resolveColor$default(this.this$0.context, C1027R.attr.colorAccent, (Function0) null, 2, (Object) null);
    }
}
