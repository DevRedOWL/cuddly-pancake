package p035ru.unicorn.ujin.market.offer;

import android.view.View;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.ServiceViewHolder$bind$2$onLoadFailed$1 */
/* compiled from: ServiceViewHolder.kt */
final class ServiceViewHolder$bind$2$onLoadFailed$1 implements Runnable {
    final /* synthetic */ ServiceViewHolder$bind$2 this$0;

    ServiceViewHolder$bind$2$onLoadFailed$1(ServiceViewHolder$bind$2 serviceViewHolder$bind$2) {
        this.this$0 = serviceViewHolder$bind$2;
    }

    public final void run() {
        View view = this.this$0.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        CardView cardView = (CardView) view.findViewById(C5619R.C5622id.cvImage);
        Intrinsics.checkNotNullExpressionValue(cardView, "itemView.cvImage");
        cardView.setVisibility(8);
    }
}
