package p035ru.unicorn.ujin.market.company;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.marketplace.CompanyContact;
import p035ru.unicorn.ujin.market.company.ContactListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/market/company/ContactListAdapter$ViewHolder$bind$1$1$1$3", "ru/unicorn/ujin/market/company/ContactListAdapter$ViewHolder$$special$$inlined$apply$lambda$3", "ru/unicorn/ujin/market/company/ContactListAdapter$ViewHolder$$special$$inlined$let$lambda$3"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.company.ContactListAdapter$ViewHolder$bind$$inlined$let$lambda$3 */
/* compiled from: ContactListAdapter.kt */
final class ContactListAdapter$ViewHolder$bind$$inlined$let$lambda$3 implements View.OnClickListener {
    final /* synthetic */ CompanyContact $contact$inlined;
    final /* synthetic */ String $type$inlined;
    final /* synthetic */ String $value$inlined;
    final /* synthetic */ ContactListAdapter.ViewHolder this$0;

    ContactListAdapter$ViewHolder$bind$$inlined$let$lambda$3(String str, String str2, ContactListAdapter.ViewHolder viewHolder, CompanyContact companyContact) {
        this.$value$inlined = str;
        this.$type$inlined = str2;
        this.this$0 = viewHolder;
        this.$contact$inlined = companyContact;
    }

    public final void onClick(View view) {
        this.this$0.this$0.getOnContactClickedListener$app_kortrosRelease().onWebSiteClicked(this.$value$inlined);
    }
}
