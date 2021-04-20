package p035ru.unicorn.ujin.market.order;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderedOfferListAdapter$setExpandableText$1 */
/* compiled from: OrderedOfferListAdapter.kt */
final class OrderedOfferListAdapter$setExpandableText$1 implements Runnable {
    final /* synthetic */ String $caption;
    final /* synthetic */ TextView $this_setExpandableText;
    final /* synthetic */ OrderedOfferListAdapter this$0;

    OrderedOfferListAdapter$setExpandableText$1(OrderedOfferListAdapter orderedOfferListAdapter, TextView textView, String str) {
        this.this$0 = orderedOfferListAdapter;
        this.$this_setExpandableText = textView;
        this.$caption = str;
    }

    public final void run() {
        this.this$0.setCaption(this.$this_setExpandableText, this.$caption);
        this.$this_setExpandableText.setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ OrderedOfferListAdapter$setExpandableText$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                TextView textView = this.this$0.$this_setExpandableText;
                textView.setMaxLines(100);
                textView.setText(this.this$0.this$0.getFullCaption(this.this$0.$caption));
            }
        });
    }
}
