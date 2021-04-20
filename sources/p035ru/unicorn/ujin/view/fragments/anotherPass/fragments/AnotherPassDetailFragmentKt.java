package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, mo51343d2 = {"setVisibleOrGone", "", "Landroid/view/View;", "isVisible", "", "setVisibleOrHide", "app_kortrosRelease"}, mo51344k = 2, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragmentKt */
/* compiled from: AnotherPassDetailFragment.kt */
public final class AnotherPassDetailFragmentKt {
    public static final void setVisibleOrGone(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "$this$setVisibleOrGone");
        if (z) {
            view.setVisibility(0);
        }
    }

    public static final void setVisibleOrHide(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "$this$setVisibleOrHide");
        if (z) {
            view.setVisibility(0);
        }
    }
}
