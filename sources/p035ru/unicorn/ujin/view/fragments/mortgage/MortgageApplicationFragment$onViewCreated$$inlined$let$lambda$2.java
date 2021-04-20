package p035ru.unicorn.ujin.view.fragments.mortgage;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/mortgage/MortgageApplicationFragment$onViewCreated$2$6$1$1", "ru/unicorn/ujin/view/fragments/mortgage/MortgageApplicationFragment$$special$$inlined$apply$lambda$2", "ru/unicorn/ujin/view/fragments/mortgage/MortgageApplicationFragment$$special$$inlined$let$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.mortgage.MortgageApplicationFragment$onViewCreated$$inlined$let$lambda$2 */
/* compiled from: MortgageApplicationFragment.kt */
final class MortgageApplicationFragment$onViewCreated$$inlined$let$lambda$2 implements View.OnClickListener {
    final /* synthetic */ String $phone$inlined;
    final /* synthetic */ MortgageApplicationFragment this$0;

    MortgageApplicationFragment$onViewCreated$$inlined$let$lambda$2(String str, MortgageApplicationFragment mortgageApplicationFragment) {
        this.$phone$inlined = str;
        this.this$0 = mortgageApplicationFragment;
    }

    public final void onClick(View view) {
        this.this$0.startCallIntent(this.$phone$inlined);
    }
}
