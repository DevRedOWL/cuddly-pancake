package p035ru.unicorn.ujin.market.order;

import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.market.order.OrderedOfferListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderedOfferListAdapter$ViewHolder$bind$4 */
/* compiled from: OrderedOfferListAdapter.kt */
final class OrderedOfferListAdapter$ViewHolder$bind$4 implements View.OnClickListener {
    final /* synthetic */ int $position;
    final /* synthetic */ OrderedOfferListAdapter.ViewHolder this$0;

    OrderedOfferListAdapter$ViewHolder$bind$4(OrderedOfferListAdapter.ViewHolder viewHolder, int i) {
        this.this$0 = viewHolder;
        this.$position = i;
    }

    public final void onClick(View view) {
        this.this$0.lastClickTime = System.currentTimeMillis();
        View view2 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        TextView textView = (TextView) view2.findViewById(C5619R.C5622id.tvCount);
        Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvCount");
        final int parseInt = Integer.parseInt(textView.getText().toString()) - 1;
        if (parseInt != 0) {
            View view3 = this.this$0.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView2 = (TextView) view3.findViewById(C5619R.C5622id.tvCount);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvCount");
            textView2.setText(String.valueOf(parseInt));
        }
        new Handler().postDelayed(new Runnable(this) {
            final /* synthetic */ OrderedOfferListAdapter$ViewHolder$bind$4 this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                if (System.currentTimeMillis() - this.this$0.this$0.lastClickTime >= 500) {
                    this.this$0.this$0.this$0.getOnOfferSelectedListener$app_kortrosRelease().onOfferSelected(this.this$0.$position, parseInt);
                }
            }
        }, 500);
    }
}
