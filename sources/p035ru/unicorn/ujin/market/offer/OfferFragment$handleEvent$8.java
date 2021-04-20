package p035ru.unicorn.ujin.market.offer;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.util.AnimationUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferFragment$handleEvent$8 */
/* compiled from: OfferFragment.kt */
final class OfferFragment$handleEvent$8 implements Runnable {
    final /* synthetic */ OfferFragment this$0;

    OfferFragment$handleEvent$8(OfferFragment offerFragment) {
        this.this$0 = offerFragment;
    }

    public final void run() {
        TextView textView = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvDescription);
        Intrinsics.checkNotNullExpressionValue(textView, "tvDescription");
        if (textView.getLineCount() > 5) {
            TextView textView2 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvDescription);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvDescription");
            textView2.setMaxLines(5);
            ((TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvExpand)).setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ OfferFragment$handleEvent$8 this$0;

                {
                    this.this$0 = r1;
                }

                public final void onClick(View view) {
                    TextView textView = (TextView) this.this$0.this$0._$_findCachedViewById(C5619R.C5622id.tvExpand);
                    Intrinsics.checkNotNullExpressionValue(textView, "tvExpand");
                    if (Intrinsics.areEqual((Object) textView.getText(), (Object) this.this$0.this$0.getResources().getString(R.string.expand))) {
                        AnimationUtils animationUtils = AnimationUtils.INSTANCE;
                        TextView textView2 = (TextView) this.this$0.this$0._$_findCachedViewById(C5619R.C5622id.tvDescription);
                        Intrinsics.checkNotNullExpressionValue(textView2, "tvDescription");
                        animationUtils.animateViewMaxLines(100, textView2, new Function0<Unit>(this) {
                            final /* synthetic */ C57571 this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final void invoke() {
                                TextView textView = (TextView) this.this$0.this$0.this$0._$_findCachedViewById(C5619R.C5622id.tvExpand);
                                Intrinsics.checkNotNullExpressionValue(textView, "tvExpand");
                                textView.setText(this.this$0.this$0.this$0.getResources().getString(R.string.wrap));
                            }
                        });
                        return;
                    }
                    AnimationUtils animationUtils2 = AnimationUtils.INSTANCE;
                    TextView textView3 = (TextView) this.this$0.this$0._$_findCachedViewById(C5619R.C5622id.tvDescription);
                    Intrinsics.checkNotNullExpressionValue(textView3, "tvDescription");
                    animationUtils2.animateViewMaxLines(5, textView3, new Function0<Unit>(this) {
                        final /* synthetic */ C57571 this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void invoke() {
                            TextView textView = (TextView) this.this$0.this$0.this$0._$_findCachedViewById(C5619R.C5622id.tvExpand);
                            Intrinsics.checkNotNullExpressionValue(textView, "tvExpand");
                            textView.setText(this.this$0.this$0.this$0.getResources().getString(R.string.expand));
                        }
                    });
                }
            });
            return;
        }
        TextView textView3 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvExpand);
        Intrinsics.checkNotNullExpressionValue(textView3, "tvExpand");
        textView3.setVisibility(8);
    }
}
