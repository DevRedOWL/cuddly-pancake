package com.afollestad.materialdialogs.internal.message;

import com.afollestad.materialdialogs.C1036R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* compiled from: DialogContentLayout.kt */
final class DialogContentLayout$frameHorizontalMargin$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ DialogContentLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DialogContentLayout$frameHorizontalMargin$2(DialogContentLayout dialogContentLayout) {
        super(0);
        this.this$0 = dialogContentLayout;
    }

    public final int invoke() {
        return this.this$0.getResources().getDimensionPixelSize(C1036R.dimen.md_dialog_frame_margin_horizontal);
    }
}
