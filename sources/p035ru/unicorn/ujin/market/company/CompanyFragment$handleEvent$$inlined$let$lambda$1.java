package p035ru.unicorn.ujin.market.company;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.market.company.ContactListAdapter;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b¸\u0006\t"}, mo51343d2 = {"ru/unicorn/ujin/market/company/CompanyFragment$handleEvent$3$1$1", "Lru/unicorn/ujin/market/company/ContactListAdapter$OnContactClickedListener;", "onEmailClicked", "", "value", "", "onPhoneClicked", "onWebSiteClicked", "app_kortrosRelease", "ru/unicorn/ujin/market/company/CompanyFragment$$special$$inlined$apply$lambda$1"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.company.CompanyFragment$handleEvent$$inlined$let$lambda$1 */
/* compiled from: CompanyFragment.kt */
public final class CompanyFragment$handleEvent$$inlined$let$lambda$1 implements ContactListAdapter.OnContactClickedListener {
    final /* synthetic */ RealmList $it$inlined;
    final /* synthetic */ CompanyFragment this$0;

    CompanyFragment$handleEvent$$inlined$let$lambda$1(RealmList realmList, CompanyFragment companyFragment) {
        this.$it$inlined = realmList;
        this.this$0 = companyFragment;
    }

    public void onPhoneClicked(String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "value");
        CompanyFragment companyFragment = this.this$0;
        Company access$getCompany$p = companyFragment.company;
        if (access$getCompany$p == null || (str2 = access$getCompany$p.getTitle()) == null) {
            str2 = "";
        }
        companyFragment.startCallIntent(str, str2);
    }

    public void onEmailClicked(String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "value");
        CompanyFragment companyFragment = this.this$0;
        Company access$getCompany$p = companyFragment.company;
        if (access$getCompany$p == null || (str2 = access$getCompany$p.getTitle()) == null) {
            str2 = "";
        }
        companyFragment.startEmailIntent(str, str2);
    }

    public void onWebSiteClicked(String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "value");
        CompanyFragment companyFragment = this.this$0;
        Company access$getCompany$p = companyFragment.company;
        if (access$getCompany$p == null || (str2 = access$getCompany$p.getTitle()) == null) {
            str2 = "";
        }
        companyFragment.startWebIntent(str, str2);
    }
}
