package p035ru.unicorn.ujin.view.fragments.mortgage.adapters;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.realm.ContextBanner;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, mo51343d2 = {"<anonymous>", "", "invoke", "ru/unicorn/ujin/view/fragments/mortgage/adapters/MortgagePagerAdapter$instantiateItem$2$3$1", "ru/unicorn/ujin/view/fragments/mortgage/adapters/MortgagePagerAdapter$$special$$inlined$let$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.mortgage.adapters.MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$1 */
/* compiled from: MortgagePagerAdapter.kt */
final class MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ FeatureListAdapter $featureListAdapter$inlined;
    final /* synthetic */ String $id;
    final /* synthetic */ ContextBanner $mortgage$inlined;
    final /* synthetic */ View $view$inlined;
    final /* synthetic */ MortgagePagerAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MortgagePagerAdapter$instantiateItem$$inlined$let$lambda$1(String str, FeatureListAdapter featureListAdapter, MortgagePagerAdapter mortgagePagerAdapter, View view, ContextBanner contextBanner) {
        super(0);
        this.$id = str;
        this.$featureListAdapter$inlined = featureListAdapter;
        this.this$0 = mortgagePagerAdapter;
        this.$view$inlined = view;
        this.$mortgage$inlined = contextBanner;
    }

    public final void invoke() {
        this.this$0.getShowMortgageFragment().invoke(this.$id);
    }
}
