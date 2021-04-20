package p035ru.unicorn.ujin.market.order;

import android.view.View;
import androidx.lifecycle.Observer;
import com.google.android.material.textfield.TextInputEditText;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CartOffer;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.metrics.MetricsFacade;
import p035ru.unicorn.ujin.metrics.MetricsKeys;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;
import p035ru.unicorn.ujin.viewModel.events.market.CreateOrderEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/market/order/OrderFormFragment$initFinishButton$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderFormFragment$initFinishButton$$inlined$apply$lambda$1 */
/* compiled from: OrderFormFragment.kt */
final class OrderFormFragment$initFinishButton$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ Ref.ObjectRef $orderItemList$inlined;
    final /* synthetic */ DynamicBackgroundButton $this_apply;
    final /* synthetic */ OrderFormFragment this$0;

    OrderFormFragment$initFinishButton$$inlined$apply$lambda$1(DynamicBackgroundButton dynamicBackgroundButton, OrderFormFragment orderFormFragment, Ref.ObjectRef objectRef) {
        this.$this_apply = dynamicBackgroundButton;
        this.this$0 = orderFormFragment;
        this.$orderItemList$inlined = objectRef;
    }

    public final void onClick(View view) {
        String str;
        UIHelper.hideKeyboard(this.this$0.getActivity(), view);
        if (this.this$0.getProfileViewModel().getUser().getDemo() == 1) {
            this.this$0.showMessage(this.$this_apply.getResources().getString(R.string.demoFunctionNotAvailable));
        } else if (this.this$0.isUserDataValid()) {
            this.this$0.setVisibilityProgressView(true);
            String access$getItemType$p = this.this$0.itemType;
            if (access$getItemType$p != null && access$getItemType$p.hashCode() == 105650780 && access$getItemType$p.equals(OrderFormFragment.OFFER_TYPE)) {
                MetricsFacade.Companion companion = MetricsFacade.Companion;
                String value = MetricsKeys.market.getValue();
                HashMap hashMap = new HashMap();
                String value2 = MetricsKeys.fillRequest.getValue();
                Offer access$getOffer$p = this.this$0.offer;
                if (access$getOffer$p == null || (str = access$getOffer$p.getTitle()) == null) {
                    str = MetricsKeys.error.getValue();
                }
                hashMap.put(value2, str);
                Unit unit = Unit.INSTANCE;
                companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
            } else {
                for (CartOffer title : (List) this.$orderItemList$inlined.element) {
                    MetricsFacade.Companion companion2 = MetricsFacade.Companion;
                    String value3 = MetricsKeys.market.getValue();
                    HashMap hashMap2 = new HashMap();
                    String value4 = MetricsKeys.paymentForm.getValue();
                    String title2 = title.getTitle();
                    if (title2 == null) {
                        title2 = MetricsKeys.error.getValue();
                    }
                    hashMap2.put(value4, title2);
                    Unit unit2 = Unit.INSTANCE;
                    companion2.reportEvent(value3, (HashMap<String, ? extends Object>) hashMap2);
                }
            }
            TextInputEditText textInputEditText = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etSurname);
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "etSurname");
            String valueOf = String.valueOf(textInputEditText.getText());
            TextInputEditText textInputEditText2 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etName);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etName");
            String valueOf2 = String.valueOf(textInputEditText2.getText());
            TextInputEditText textInputEditText3 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPatronymic);
            Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etPatronymic");
            String valueOf3 = String.valueOf(textInputEditText3.getText());
            String value5 = ((PhoneMaskedEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPhone)).getValue();
            TextInputEditText textInputEditText4 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etEmail);
            Intrinsics.checkNotNullExpressionValue(textInputEditText4, "etEmail");
            String valueOf4 = String.valueOf(textInputEditText4.getText());
            TextInputEditText textInputEditText5 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etAddress);
            Intrinsics.checkNotNullExpressionValue(textInputEditText5, "etAddress");
            String valueOf5 = String.valueOf(textInputEditText5.getText());
            TextInputEditText textInputEditText6 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etComment);
            Intrinsics.checkNotNullExpressionValue(textInputEditText6, "etComment");
            this.this$0.getMarketViewModel().createOrder((List) this.$orderItemList$inlined.element, valueOf, valueOf2, valueOf3, value5, valueOf4, valueOf5, String.valueOf(textInputEditText6.getText()));
            this.this$0.getMarketViewModel().getCreateOrderLiveData().observe(this.this$0.getViewLifecycleOwner(), new Observer<CreateOrderEvent>(this) {
                final /* synthetic */ OrderFormFragment$initFinishButton$$inlined$apply$lambda$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void onChanged(CreateOrderEvent createOrderEvent) {
                    OrderFormFragment orderFormFragment = this.this$0.this$0;
                    Intrinsics.checkNotNullExpressionValue(createOrderEvent, "event");
                    orderFormFragment.handleEvent(createOrderEvent);
                }
            });
        } else {
            this.this$0.showMessage(this.$this_apply.getResources().getString(R.string.emptyFieldsMessage));
        }
    }
}
