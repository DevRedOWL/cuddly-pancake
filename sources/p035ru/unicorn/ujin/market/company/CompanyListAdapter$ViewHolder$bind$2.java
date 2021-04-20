package p035ru.unicorn.ujin.market.company;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.market.company.CompanyListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.company.CompanyListAdapter$ViewHolder$bind$2 */
/* compiled from: CompanyListAdapter.kt */
final class CompanyListAdapter$ViewHolder$bind$2 implements View.OnClickListener {
    final /* synthetic */ Company $company;
    final /* synthetic */ CompanyListAdapter.ViewHolder this$0;

    CompanyListAdapter$ViewHolder$bind$2(CompanyListAdapter.ViewHolder viewHolder, Company company) {
        this.this$0 = viewHolder;
        this.$company = company;
    }

    public final void onClick(View view) {
        this.this$0.this$0.getOnItemClick().invoke(this.$company.getId(), this.$company.getTitle());
    }
}
