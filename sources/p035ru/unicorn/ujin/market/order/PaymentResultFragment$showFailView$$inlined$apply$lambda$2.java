package p035ru.unicorn.ujin.market.order;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/market/order/PaymentResultFragment$showFailView$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.PaymentResultFragment$showFailView$$inlined$apply$lambda$2 */
/* compiled from: PaymentResultFragment.kt */
final class PaymentResultFragment$showFailView$$inlined$apply$lambda$2 implements View.OnClickListener {
    final /* synthetic */ PaymentResultFragment this$0;

    PaymentResultFragment$showFailView$$inlined$apply$lambda$2(PaymentResultFragment paymentResultFragment) {
        this.this$0 = paymentResultFragment;
    }

    public final void onClick(View view) {
        this.this$0.getBaseActivity().onBackPressed();
    }
}
