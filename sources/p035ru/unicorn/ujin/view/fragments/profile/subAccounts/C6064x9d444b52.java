package p035ru.unicorn.ujin.view.fragments.profile.subAccounts;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.api.response.SubAccountsResponseData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "phone", "", "invoke", "ru/unicorn/ujin/view/fragments/profile/subAccounts/SubAccountListFragment$handleSubAccountList$1$1$1$1", "ru/unicorn/ujin/view/fragments/profile/subAccounts/SubAccountListFragment$$special$$inlined$apply$lambda$1", "ru/unicorn/ujin/view/fragments/profile/subAccounts/SubAccountListFragment$$special$$inlined$let$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment$handleSubAccountList$$inlined$let$lambda$1 */
/* compiled from: SubAccountListFragment.kt */
final class C6064x9d444b52 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ SubAccountEvent $event$inlined;
    final /* synthetic */ SubAccountsResponseData $it$inlined;
    final /* synthetic */ SubAccountListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6064x9d444b52(SubAccountsResponseData subAccountsResponseData, SubAccountListFragment subAccountListFragment, SubAccountEvent subAccountEvent) {
        super(1);
        this.$it$inlined = subAccountsResponseData;
        this.this$0 = subAccountListFragment;
        this.$event$inlined = subAccountEvent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkNotNullParameter(str, "phone");
        this.this$0.handleButtonSubAccountDelete(str);
    }
}
