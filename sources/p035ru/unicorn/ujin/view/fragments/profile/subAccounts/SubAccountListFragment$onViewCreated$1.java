package p035ru.unicorn.ujin.view.fragments.profile.subAccounts;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment$onViewCreated$1 */
/* compiled from: SubAccountListFragment.kt */
final class SubAccountListFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ SubAccountListFragment this$0;

    SubAccountListFragment$onViewCreated$1(SubAccountListFragment subAccountListFragment) {
        this.this$0 = subAccountListFragment;
    }

    public final void onClick(View view) {
        this.this$0.nextFragment(NewSubAccountFragment.Companion.newInstance(this.this$0.getTitle()), false, BaseActivity.FRAGMENT_NEW_ACCOUNT);
    }
}
