package com.afollestad.date.managers;

import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/widget/ImageView;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: DatePickerLayoutManager.kt */
final class DatePickerLayoutManager$onNavigate$2 extends Lambda implements Function1<ImageView, Unit> {
    final /* synthetic */ Function0 $onGoToNext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DatePickerLayoutManager$onNavigate$2(Function0 function0) {
        super(1);
        this.$onGoToNext = function0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ImageView) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(imageView, "it");
        this.$onGoToNext.invoke();
    }
}
