package p035ru.unicorn.ujin.market;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.MarketFragment$onViewCreated$2 */
/* compiled from: MarketFragment.kt */
final class MarketFragment$onViewCreated$2 implements View.OnClickListener {
    final /* synthetic */ MarketFragment this$0;

    MarketFragment$onViewCreated$2(MarketFragment marketFragment) {
        this.this$0 = marketFragment;
    }

    public final void onClick(View view) {
        BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
        if (access$getBaseActivity != null) {
            ((StageActivity) access$getBaseActivity).showChatsFragment(3);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity");
    }
}
