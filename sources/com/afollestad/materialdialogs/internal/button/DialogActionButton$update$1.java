package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import com.afollestad.materialdialogs.C1036R;
import com.afollestad.materialdialogs.utils.MDUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* compiled from: DialogActionButton.kt */
final class DialogActionButton$update$1 extends Lambda implements Function0<Integer> {
    final /* synthetic */ Context $appContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DialogActionButton$update$1(Context context) {
        super(0);
        this.$appContext = context;
    }

    public final int invoke() {
        return MDUtil.resolveColor$default(MDUtil.INSTANCE, this.$appContext, (Integer) null, Integer.valueOf(C1036R.attr.colorPrimary), (Function0) null, 10, (Object) null);
    }
}
