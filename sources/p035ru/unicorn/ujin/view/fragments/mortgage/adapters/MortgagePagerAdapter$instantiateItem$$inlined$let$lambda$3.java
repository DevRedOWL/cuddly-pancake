package p035ru.unicorn.ujin.view.fragments.mortgage.adapters;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/mortgage/adapters/MortgagePagerAdapter$instantiateItem$3$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$3 */
/* compiled from: MortgagePagerAdapter.kt */
final class MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$3 implements View.OnClickListener {
    final /* synthetic */ String $id;
    final /* synthetic */ View $view$inlined;
    final /* synthetic */ MortgagePagerAdapter this$0;

    MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$3(String str, MortgagePagerAdapter mortgagePagerAdapter, View view) {
        this.$id = str;
        this.this$0 = mortgagePagerAdapter;
        this.$view$inlined = view;
    }

    public final void onClick(View view) {
        this.this$0.getShowMortgageFragment().invoke(this.$id);
    }
}
