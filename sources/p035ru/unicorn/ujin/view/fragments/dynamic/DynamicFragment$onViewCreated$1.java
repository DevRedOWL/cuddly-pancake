package p035ru.unicorn.ujin.view.fragments.dynamic;

import android.widget.ProgressBar;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "show", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment$onViewCreated$1 */
/* compiled from: DynamicFragment.kt */
final class DynamicFragment$onViewCreated$1<T> implements Observer<Boolean> {
    final /* synthetic */ DynamicFragment this$0;

    DynamicFragment$onViewCreated$1(DynamicFragment dynamicFragment) {
        this.this$0 = dynamicFragment;
    }

    public final void onChanged(Boolean bool) {
        DynamicFragment dynamicFragment = this.this$0;
        dynamicFragment.showLoader(bool, (ProgressBar) dynamicFragment._$_findCachedViewById(C5619R.C5622id.pbLoading));
    }
}
