package com.afollestad.materialdialogs;

import com.afollestad.materialdialogs.utils.ColorsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* renamed from: com.afollestad.materialdialogs.MaterialDialog$invalidateBackgroundColorAndRadius$backgroundColor$1 */
/* compiled from: MaterialDialog.kt */
final class C1035xc4691f22 extends Lambda implements Function0<Integer> {
    final /* synthetic */ MaterialDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1035xc4691f22(MaterialDialog materialDialog) {
        super(0);
        this.this$0 = materialDialog;
    }

    public final int invoke() {
        return ColorsKt.resolveColor$default(this.this$0, (Integer) null, Integer.valueOf(C1036R.attr.colorBackgroundFloating), (Function0) null, 5, (Object) null);
    }
}
