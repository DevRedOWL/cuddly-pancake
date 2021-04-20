package p035ru.unicorn.ujin.view.fragments.development;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "show", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperFragment$onResume$2 */
/* compiled from: DeveloperFragment.kt */
final class DeveloperFragment$onResume$2<T> implements Observer<Boolean> {
    final /* synthetic */ DeveloperFragment this$0;

    DeveloperFragment$onResume$2(DeveloperFragment developerFragment) {
        this.this$0 = developerFragment;
    }

    public final void onChanged(Boolean bool) {
        DeveloperFragment developerFragment = this.this$0;
        LinearLayout linearLayout = (LinearLayout) developerFragment._$_findCachedViewById(C5619R.C5622id.llContent);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llContent");
        Intrinsics.checkNotNullExpressionValue(bool, "show");
        int i = 8;
        linearLayout.setVisibility(bool.booleanValue() ? 8 : 0);
        LinearLayout linearLayout2 = (LinearLayout) developerFragment._$_findCachedViewById(C5619R.C5622id.layoutContent2);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "layoutContent2");
        linearLayout2.setVisibility(bool.booleanValue() ? 8 : 0);
        View _$_findCachedViewById = developerFragment._$_findCachedViewById(C5619R.C5622id.layoutContentDivider);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layoutContentDivider");
        _$_findCachedViewById.setVisibility(bool.booleanValue() ? 8 : 0);
        RelativeLayout relativeLayout = (RelativeLayout) developerFragment._$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "pbLoading");
        if (bool.booleanValue()) {
            i = 0;
        }
        relativeLayout.setVisibility(i);
    }
}
