package p035ru.unicorn.ujin.market.order;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CartCompany;
import p035ru.unicorn.ujin.data.realm.marketplace.CartItem;
import p035ru.unicorn.ujin.data.realm.marketplace.CartOffer;
import p035ru.unicorn.ujin.data.realm.marketplace.CartTotal;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.market.model.MarketViewModel;
import p035ru.unicorn.ujin.util.TextUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002*+B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0012J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J$\u0010\u001d\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012H\u0014J,\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060\u0003R\u00020\u00002\u0006\u0010%\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0014J\u000e\u0010&\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u0012J\u0014\u0010'\u001a\u00020#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020)R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006,"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/OrderListAdapter;", "Lru/unicorn/ujin/view/activity/navigation/adapter/BaseAdapter;", "Lru/unicorn/ujin/data/realm/marketplace/CartItem;", "Lru/unicorn/ujin/market/order/OrderListAdapter$ViewHolder;", "marketViewModel", "Lru/unicorn/ujin/market/model/MarketViewModel;", "onOrderListener", "Lru/unicorn/ujin/market/order/OrderListAdapter$OnOrderListener;", "(Lru/unicorn/ujin/market/model/MarketViewModel;Lru/unicorn/ujin/market/order/OrderListAdapter$OnOrderListener;)V", "context", "Landroid/content/Context;", "getMarketViewModel", "()Lru/unicorn/ujin/market/model/MarketViewModel;", "setMarketViewModel", "(Lru/unicorn/ujin/market/model/MarketViewModel;)V", "getOnOrderListener", "()Lru/unicorn/ujin/market/order/OrderListAdapter$OnOrderListener;", "updatedPosition", "", "getUpdatedPosition", "()Ljava/lang/Integer;", "setUpdatedPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getItemById", "position", "id", "", "getItemCount", "getViewHolder", "parent", "Landroid/view/View;", "type", "viewType", "onBindViewHolder", "", "holder", "val", "removeItem", "setItems", "items", "", "OnOrderListener", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderListAdapter */
/* compiled from: OrderListAdapter.kt */
public final class OrderListAdapter extends BaseAdapter<CartItem, ViewHolder> {
    /* access modifiers changed from: private */
    public Context context;
    private MarketViewModel marketViewModel;
    private final OnOrderListener onOrderListener;
    private Integer updatedPosition;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/OrderListAdapter$OnOrderListener;", "", "onOrderChanged", "", "onShowOrderForm", "companyId", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.order.OrderListAdapter$OnOrderListener */
    /* compiled from: OrderListAdapter.kt */
    public interface OnOrderListener {
        void onOrderChanged();

        void onShowOrderForm(String str);
    }

    public CartItem getItemById(String str) {
        return null;
    }

    public static final /* synthetic */ Context access$getContext$p(OrderListAdapter orderListAdapter) {
        Context context2 = orderListAdapter.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context2;
    }

    public final MarketViewModel getMarketViewModel() {
        return this.marketViewModel;
    }

    public final void setMarketViewModel(MarketViewModel marketViewModel2) {
        Intrinsics.checkNotNullParameter(marketViewModel2, "<set-?>");
        this.marketViewModel = marketViewModel2;
    }

    public OrderListAdapter(MarketViewModel marketViewModel2, OnOrderListener onOrderListener2) {
        Intrinsics.checkNotNullParameter(marketViewModel2, "marketViewModel");
        Intrinsics.checkNotNullParameter(onOrderListener2, "onOrderListener");
        this.marketViewModel = marketViewModel2;
        this.onOrderListener = onOrderListener2;
    }

    public final OnOrderListener getOnOrderListener() {
        return this.onOrderListener;
    }

    public final Integer getUpdatedPosition() {
        return this.updatedPosition;
    }

    public final void setUpdatedPosition(Integer num) {
        this.updatedPosition = num;
    }

    /* access modifiers changed from: protected */
    public ViewHolder getViewHolder(View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, CategoryItem.Fields.parent);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        this.context = context2;
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        View inflate = LayoutInflater.from(context3).inflate(R.layout.item_order, (ViewGroup) view, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…rent as ViewGroup, false)");
        return new ViewHolder(this, inflate);
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(ViewHolder viewHolder, CartItem cartItem, int i, int i2) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        Intrinsics.checkNotNullParameter(cartItem, "val");
        viewHolder.bind(i2);
    }

    public int getItemCount() {
        return getData().size();
    }

    public final void setItems(List<CartItem> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        setData(list);
        notifyDataSetChanged();
    }

    public final void removeItem(int i) {
        getData().remove(i);
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, getData().size());
    }

    public final CartItem getItemById(int i) {
        Object obj = getData().get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "data[position]");
        return (CartItem) obj;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\"\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/OrderListAdapter$ViewHolder;", "Lru/unicorn/ujin/view/activity/navigation/adapter/BaseHolder;", "Lru/unicorn/ujin/data/realm/marketplace/CartItem;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/market/order/OrderListAdapter;Landroid/view/View;)V", "offerListAdapter", "Lru/unicorn/ujin/market/order/OrderedOfferListAdapter;", "bind", "", "orderPosition", "", "showRemoveMessage", "position", "updateOrderData", "cartOffer", "Lru/unicorn/ujin/data/realm/marketplace/CartOffer;", "cartItem", "count", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.order.OrderListAdapter$ViewHolder */
    /* compiled from: OrderListAdapter.kt */
    public final class ViewHolder extends BaseHolder<CartItem> {
        /* access modifiers changed from: private */
        public OrderedOfferListAdapter offerListAdapter;
        final /* synthetic */ OrderListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(OrderListAdapter orderListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = orderListAdapter;
        }

        public static final /* synthetic */ OrderedOfferListAdapter access$getOfferListAdapter$p(ViewHolder viewHolder) {
            OrderedOfferListAdapter orderedOfferListAdapter = viewHolder.offerListAdapter;
            if (orderedOfferListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("offerListAdapter");
            }
            return orderedOfferListAdapter;
        }

        public final void bind(int i) {
            CartItem cartItem = (CartItem) this.this$0.getData().get(i);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvCompanyTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvCompanyTitle");
            CartCompany company = cartItem.getCompany();
            String str = null;
            textView.setText(company != null ? company.getTitle() : null);
            CartTotal total = cartItem.getTotal();
            CharSequence price = total != null ? total.getPrice() : null;
            boolean z = true;
            if (!(price == null || StringsKt.isBlank(price))) {
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvTotalCompanyAmount);
                Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvTotalCompanyAmount");
                CartTotal total2 = cartItem.getTotal();
                textView2.setText(TextUtils.formatAmount(new BigDecimal(total2 != null ? total2.getPrice() : null).setScale(2, 4), OrderListAdapter.access$getContext$p(this.this$0)));
            } else {
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.tvTotalCompanyAmount);
                Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvTotalCompanyAmount");
                textView3.setVisibility(4);
            }
            CartTotal total3 = cartItem.getTotal();
            CharSequence oldPrice = total3 != null ? total3.getOldPrice() : null;
            if (!(oldPrice == null || StringsKt.isBlank(oldPrice))) {
                CartTotal total4 = cartItem.getTotal();
                BigDecimal scale = new BigDecimal(total4 != null ? total4.getOldPrice() : null).setScale(2, 4);
                if (scale.compareTo(BigDecimal.ZERO) > 0) {
                    View view4 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                    TextView textView4 = (TextView) view4.findViewById(C5619R.C5622id.tvTotalAmountOld);
                    Intrinsics.checkNotNullExpressionValue(textView4, "this");
                    textView4.setPaintFlags(textView4.getPaintFlags() | 16);
                    textView4.setText(TextUtils.formatAmount(scale, textView4.getContext()));
                    textView4.setVisibility(0);
                } else {
                    View view5 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                    TextView textView5 = (TextView) view5.findViewById(C5619R.C5622id.tvTotalAmountOld);
                    Intrinsics.checkNotNullExpressionValue(textView5, "itemView.tvTotalAmountOld");
                    textView5.setVisibility(4);
                }
            } else {
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                TextView textView6 = (TextView) view6.findViewById(C5619R.C5622id.tvTotalAmountOld);
                Intrinsics.checkNotNullExpressionValue(textView6, "itemView.tvTotalAmountOld");
                textView6.setVisibility(4);
            }
            RealmList<CartOffer> offers = cartItem.getOffers();
            List<CartOffer> filterNotNull = offers != null ? CollectionsKt.filterNotNull(offers) : null;
            Collection collection = filterNotNull;
            if (!(collection == null || collection.isEmpty())) {
                this.offerListAdapter = new OrderedOfferListAdapter(new OrderListAdapter$ViewHolder$bind$2(this, cartItem, i));
                OrderedOfferListAdapter orderedOfferListAdapter = this.offerListAdapter;
                if (orderedOfferListAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offerListAdapter");
                }
                orderedOfferListAdapter.setData(filterNotNull);
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                RecyclerView recyclerView = (RecyclerView) view7.findViewById(C5619R.C5622id.rvOfferList);
                OrderedOfferListAdapter orderedOfferListAdapter2 = this.offerListAdapter;
                if (orderedOfferListAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offerListAdapter");
                }
                recyclerView.setAdapter(orderedOfferListAdapter2);
                View view8 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view8, "itemView");
                recyclerView.setLayoutManager(new LinearLayoutManager(view8.getContext()));
                int i2 = 0;
                for (CartOffer quantity : filterNotNull) {
                    Integer quantity2 = quantity.getQuantity();
                    i2 += quantity2 != null ? quantity2.intValue() : 0;
                }
                View view9 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                TextView textView7 = (TextView) view9.findViewById(C5619R.C5622id.tvOfferCount);
                Intrinsics.checkNotNullExpressionValue(textView7, "itemView.tvOfferCount");
                textView7.setText(String.valueOf(i2));
            }
            CartCompany company2 = cartItem.getCompany();
            CharSequence delivery = company2 != null ? company2.getDelivery() : null;
            if (delivery != null && !StringsKt.isBlank(delivery)) {
                z = false;
            }
            if (z) {
                View view10 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view10, "itemView");
                TextView textView8 = (TextView) view10.findViewById(C5619R.C5622id.tvDeliveryTitle);
                Intrinsics.checkNotNullExpressionValue(textView8, "itemView.tvDeliveryTitle");
                textView8.setVisibility(8);
                View view11 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view11, "itemView");
                TextView textView9 = (TextView) view11.findViewById(C5619R.C5622id.tvDelivery);
                Intrinsics.checkNotNullExpressionValue(textView9, "itemView.tvDelivery");
                textView9.setVisibility(8);
                View view12 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view12, "itemView");
                View findViewById = view12.findViewById(C5619R.C5622id.divider1);
                Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.divider1");
                findViewById.setVisibility(8);
            } else {
                View view13 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view13, "itemView");
                TextView textView10 = (TextView) view13.findViewById(C5619R.C5622id.tvDeliveryTitle);
                Intrinsics.checkNotNullExpressionValue(textView10, "itemView.tvDeliveryTitle");
                textView10.setVisibility(0);
                View view14 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view14, "itemView");
                TextView textView11 = (TextView) view14.findViewById(C5619R.C5622id.tvDelivery);
                CartCompany company3 = cartItem.getCompany();
                if (company3 != null) {
                    str = company3.getDelivery();
                }
                textView11.setText(str);
                textView11.setVisibility(0);
                View view15 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view15, "itemView");
                View findViewById2 = view15.findViewById(C5619R.C5622id.divider1);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.divider1");
                findViewById2.setVisibility(0);
            }
            View view16 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view16, "itemView");
            ((DynamicBackgroundButton) view16.findViewById(C5619R.C5622id.btnOrder)).setOnClickListener(new OrderListAdapter$ViewHolder$bind$5(this, cartItem));
        }

        /* access modifiers changed from: private */
        public final void updateOrderData(CartOffer cartOffer, CartItem cartItem, int i) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Integer quantity;
            Integer quantity2;
            Integer quantity3;
            CartTotal total;
            CartTotal total2;
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvOfferCount);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvOfferCount");
            int parseInt = Integer.parseInt(textView.getText().toString());
            MarketViewModel marketViewModel = this.this$0.getMarketViewModel();
            CartCompany company = cartItem.getCompany();
            String str7 = null;
            CartItem cartItem2 = marketViewModel.getCartItem(company != null ? company.getId() : null);
            if (cartItem2 == null || (total2 = cartItem2.getTotal()) == null || (str = total2.getPrice()) == null) {
                str = IdManager.DEFAULT_VERSION_NAME;
            }
            BigDecimal bigDecimal = new BigDecimal(str);
            MarketViewModel marketViewModel2 = this.this$0.getMarketViewModel();
            CartCompany company2 = cartItem.getCompany();
            CartItem cartItem3 = marketViewModel2.getCartItem(company2 != null ? company2.getId() : null);
            if (cartItem3 == null || (total = cartItem3.getTotal()) == null || (str2 = total.getOldPrice()) == null) {
                str2 = IdManager.DEFAULT_VERSION_NAME;
            }
            BigDecimal bigDecimal2 = new BigDecimal(str2);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvOfferCount);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvOfferCount");
            textView2.setText(String.valueOf((parseInt - ((cartOffer == null || (quantity3 = cartOffer.getQuantity()) == null) ? 0 : quantity3.intValue())) + i));
            BigDecimal bigDecimal3 = new BigDecimal((cartOffer == null || (quantity2 = cartOffer.getQuantity()) == null) ? 0 : quantity2.intValue());
            if (cartOffer == null || (str3 = cartOffer.getPrice()) == null) {
                str3 = IdManager.DEFAULT_VERSION_NAME;
            }
            BigDecimal subtract = bigDecimal.subtract(bigDecimal3.multiply(new BigDecimal(str3)));
            Intrinsics.checkNotNullExpressionValue(subtract, "amount.subtract(\n       … ?: \"0.0\"))\n            )");
            BigDecimal bigDecimal4 = new BigDecimal(i);
            if (cartOffer == null || (str4 = cartOffer.getPrice()) == null) {
                str4 = IdManager.DEFAULT_VERSION_NAME;
            }
            BigDecimal multiply = bigDecimal4.multiply(new BigDecimal(str4));
            Intrinsics.checkNotNullExpressionValue(multiply, "BigDecimal(count).multip…rtOffer?.price ?: \"0.0\"))");
            BigDecimal add = subtract.add(multiply);
            Intrinsics.checkNotNullExpressionValue(add, "this.add(other)");
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.tvTotalCompanyAmount);
            Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvTotalCompanyAmount");
            textView3.setText(TextUtils.formatAmount(add.setScale(2, 4), OrderListAdapter.access$getContext$p(this.this$0)));
            if (cartOffer != null) {
                str7 = cartOffer.getOldPrice();
            }
            CharSequence charSequence = str7;
            if (!(charSequence == null || StringsKt.isBlank(charSequence))) {
                BigDecimal bigDecimal5 = new BigDecimal((cartOffer == null || (quantity = cartOffer.getQuantity()) == null) ? 0 : quantity.intValue());
                if (cartOffer == null || (str5 = cartOffer.getOldPrice()) == null) {
                    str5 = IdManager.DEFAULT_VERSION_NAME;
                }
                BigDecimal subtract2 = bigDecimal2.subtract(bigDecimal5.multiply(new BigDecimal(str5)));
                Intrinsics.checkNotNullExpressionValue(subtract2, "oldAmount.subtract(\n    …\"0.0\"))\n                )");
                BigDecimal bigDecimal6 = new BigDecimal(i);
                if (cartOffer == null || (str6 = cartOffer.getOldPrice()) == null) {
                    str6 = IdManager.DEFAULT_VERSION_NAME;
                }
                BigDecimal multiply2 = bigDecimal6.multiply(new BigDecimal(str6));
                Intrinsics.checkNotNullExpressionValue(multiply2, "BigDecimal(count).multip…ffer?.oldPrice ?: \"0.0\"))");
                bigDecimal2 = subtract2.add(multiply2);
                Intrinsics.checkNotNullExpressionValue(bigDecimal2, "this.add(other)");
            }
            if (bigDecimal2.compareTo(BigDecimal.ZERO) > 0) {
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                TextView textView4 = (TextView) view4.findViewById(C5619R.C5622id.tvTotalAmountOld);
                Intrinsics.checkNotNullExpressionValue(textView4, "this");
                textView4.setPaintFlags(textView4.getPaintFlags() | 16);
                textView4.setText(TextUtils.formatAmount(bigDecimal2.setScale(2, 4), textView4.getContext()));
                textView4.setVisibility(0);
                return;
            }
            View view5 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view5, "itemView");
            TextView textView5 = (TextView) view5.findViewById(C5619R.C5622id.tvTotalAmountOld);
            Intrinsics.checkNotNullExpressionValue(textView5, "itemView.tvTotalAmountOld");
            textView5.setVisibility(4);
        }

        /* access modifiers changed from: private */
        public final void showRemoveMessage(int i, int i2) {
            AlertDialog.Builder builder = new AlertDialog.Builder(OrderListAdapter.access$getContext$p(this.this$0));
            builder.setMessage((CharSequence) OrderListAdapter.access$getContext$p(this.this$0).getResources().getString(R.string.remove_good_message)).setPositiveButton((CharSequence) OrderListAdapter.access$getContext$p(this.this$0).getResources().getString(R.string.button_yes), (DialogInterface.OnClickListener) new OrderListAdapter$ViewHolder$showRemoveMessage$1(this, i, i2)).setNegativeButton((CharSequence) OrderListAdapter.access$getContext$p(this.this$0).getResources().getString(R.string.button_no), (DialogInterface.OnClickListener) OrderListAdapter$ViewHolder$showRemoveMessage$2.INSTANCE);
            AlertDialog create = builder.create();
            Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
            create.show();
        }
    }
}
