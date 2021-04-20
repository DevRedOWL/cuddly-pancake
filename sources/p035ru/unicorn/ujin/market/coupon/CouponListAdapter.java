package p035ru.unicorn.ujin.market.coupon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.data.realm.marketplace.Coupon;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002,-BC\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0005J\b\u0010!\u001a\u00020\nH\u0016J\u001c\u0010\"\u001a\u00020\u000b2\n\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020\nH\u0016J\u001c\u0010%\u001a\u00060\u0002R\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\nH\u0016J\u0014\u0010)\u001a\u00020\u000b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0016\u0010+\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0005R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006."}, mo51343d2 = {"Lru/unicorn/ujin/market/coupon/CouponListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/market/coupon/CouponListAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "onGetCouponListener", "Lru/unicorn/ujin/market/coupon/CouponListAdapter$OnGetCouponListener;", "onCouponClickListener", "Lkotlin/Function1;", "", "", "onCopyCouponClickListener", "", "(Ljava/util/List;Lru/unicorn/ujin/market/coupon/CouponListAdapter$OnGetCouponListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "context", "Landroid/content/Context;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getOnCopyCouponClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnCopyCouponClickListener", "(Lkotlin/jvm/functions/Function1;)V", "getOnCouponClickListener", "setOnCouponClickListener", "getOnGetCouponListener$app_kortrosRelease", "()Lru/unicorn/ujin/market/coupon/CouponListAdapter$OnGetCouponListener;", "setOnGetCouponListener$app_kortrosRelease", "(Lru/unicorn/ujin/market/coupon/CouponListAdapter$OnGetCouponListener;)V", "addItem", "item", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "updateItem", "OnGetCouponListener", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.coupon.CouponListAdapter */
/* compiled from: CouponListAdapter.kt */
public final class CouponListAdapter extends RecyclerView.Adapter<ViewHolder> {
    /* access modifiers changed from: private */
    public Context context;
    private List<Coupon> data;
    private Function1<? super String, Unit> onCopyCouponClickListener;
    private Function1<? super Integer, Unit> onCouponClickListener;
    private OnGetCouponListener onGetCouponListener;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/market/coupon/CouponListAdapter$OnGetCouponListener;", "", "onGetCoupon", "", "id", "", "position", "(Ljava/lang/Integer;I)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.coupon.CouponListAdapter$OnGetCouponListener */
    /* compiled from: CouponListAdapter.kt */
    public interface OnGetCouponListener {
        void onGetCoupon(Integer num, int i);
    }

    public static final /* synthetic */ Context access$getContext$p(CouponListAdapter couponListAdapter) {
        Context context2 = couponListAdapter.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context2;
    }

    public final List<Coupon> getData() {
        return this.data;
    }

    public final void setData(List<Coupon> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final OnGetCouponListener getOnGetCouponListener$app_kortrosRelease() {
        return this.onGetCouponListener;
    }

    public final void setOnGetCouponListener$app_kortrosRelease(OnGetCouponListener onGetCouponListener2) {
        Intrinsics.checkNotNullParameter(onGetCouponListener2, "<set-?>");
        this.onGetCouponListener = onGetCouponListener2;
    }

    public final Function1<Integer, Unit> getOnCouponClickListener() {
        return this.onCouponClickListener;
    }

    public final void setOnCouponClickListener(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onCouponClickListener = function1;
    }

    public final Function1<String, Unit> getOnCopyCouponClickListener() {
        return this.onCopyCouponClickListener;
    }

    public final void setOnCopyCouponClickListener(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onCopyCouponClickListener = function1;
    }

    public CouponListAdapter(List<Coupon> list, OnGetCouponListener onGetCouponListener2, Function1<? super Integer, Unit> function1, Function1<? super String, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(onGetCouponListener2, "onGetCouponListener");
        Intrinsics.checkNotNullParameter(function1, "onCouponClickListener");
        Intrinsics.checkNotNullParameter(function12, "onCopyCouponClickListener");
        this.data = list;
        this.onGetCouponListener = onGetCouponListener2;
        this.onCouponClickListener = function1;
        this.onCopyCouponClickListener = function12;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        this.context = context2;
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        View inflate = LayoutInflater.from(context3).inflate(R.layout.item_market_coupon, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…et_coupon, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(i);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final void setItems(List<Coupon> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(Coupon coupon) {
        Intrinsics.checkNotNullParameter(coupon, "item");
        this.data.add(coupon);
        notifyItemInserted(getItemCount() - 1);
    }

    public final void updateItem(int i, Coupon coupon) {
        Intrinsics.checkNotNullParameter(coupon, "item");
        this.data.set(i, coupon);
        notifyItemChanged(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/market/coupon/CouponListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/market/coupon/CouponListAdapter;Landroid/view/View;)V", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.coupon.CouponListAdapter$ViewHolder */
    /* compiled from: CouponListAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ CouponListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CouponListAdapter couponListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = couponListAdapter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void bind(int r7) {
            /*
                r6 = this;
                ru.unicorn.ujin.market.coupon.CouponListAdapter r0 = r6.this$0
                java.util.List r0 = r0.getData()
                java.lang.Object r0 = r0.get(r7)
                ru.unicorn.ujin.data.realm.marketplace.Coupon r0 = (p035ru.unicorn.ujin.data.realm.marketplace.Coupon) r0
                android.view.View r1 = r6.itemView
                ru.unicorn.ujin.market.coupon.CouponListAdapter$ViewHolder$bind$1 r2 = new ru.unicorn.ujin.market.coupon.CouponListAdapter$ViewHolder$bind$1
                r2.<init>(r6, r7)
                android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
                r1.setOnClickListener(r2)
                ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r1 = r0.getRedeemedCode()
                r2 = 0
                java.lang.String r3 = "itemView"
                if (r1 == 0) goto L_0x0058
                ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r1 = r0.getRedeemedCode()
                if (r1 == 0) goto L_0x002c
                java.lang.String r1 = r1.getText()
                goto L_0x002d
            L_0x002c:
                r1 = r2
            L_0x002d:
                if (r1 == 0) goto L_0x0058
                android.view.View r7 = r6.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
                int r1 = p035ru.unicorn.C5619R.C5622id.btnGetCoupon
                android.view.View r7 = r7.findViewById(r1)
                androidx.appcompat.widget.AppCompatButton r7 = (androidx.appcompat.widget.AppCompatButton) r7
                ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r1 = r0.getRedeemedCode()
                if (r1 == 0) goto L_0x0047
                java.lang.String r1 = r1.getText()
                goto L_0x0048
            L_0x0047:
                r1 = r2
            L_0x0048:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r7.setText(r1)
                ru.unicorn.ujin.market.coupon.CouponListAdapter$ViewHolder$bind$$inlined$apply$lambda$1 r1 = new ru.unicorn.ujin.market.coupon.CouponListAdapter$ViewHolder$bind$$inlined$apply$lambda$1
                r1.<init>(r6, r0)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r7.setOnClickListener(r1)
                goto L_0x008b
            L_0x0058:
                android.view.View r1 = r6.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                int r4 = p035ru.unicorn.C5619R.C5622id.btnGetCoupon
                android.view.View r1 = r1.findViewById(r4)
                androidx.appcompat.widget.AppCompatButton r1 = (androidx.appcompat.widget.AppCompatButton) r1
                java.lang.String r4 = r0.getButtonTitle()
                if (r4 == 0) goto L_0x006c
                goto L_0x007c
            L_0x006c:
                android.view.View r4 = r6.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131886819(0x7f1202e3, float:1.9408228E38)
                java.lang.String r4 = r4.getString(r5)
            L_0x007c:
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r1.setText(r4)
                ru.unicorn.ujin.market.coupon.CouponListAdapter$ViewHolder$bind$$inlined$apply$lambda$2 r4 = new ru.unicorn.ujin.market.coupon.CouponListAdapter$ViewHolder$bind$$inlined$apply$lambda$2
                r4.<init>(r6, r0, r7)
                android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
                r1.setOnClickListener(r4)
            L_0x008b:
                java.lang.String r7 = r0.getTitle()
                if (r7 == 0) goto L_0x00a8
                android.view.View r1 = r6.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                int r4 = p035ru.unicorn.C5619R.C5622id.tvTitle
                android.view.View r1 = r1.findViewById(r4)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r4 = "itemView.tvTitle"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r1.setText(r7)
            L_0x00a8:
                java.lang.String r7 = r0.getDescription()
                if (r7 == 0) goto L_0x00c5
                android.view.View r1 = r6.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                int r4 = p035ru.unicorn.C5619R.C5622id.tvDescription
                android.view.View r1 = r1.findViewById(r4)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r4 = "itemView.tvDescription"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r1.setText(r7)
            L_0x00c5:
                ru.unicorn.ujin.market.coupon.CouponListAdapter r7 = r6.this$0
                android.content.Context r7 = p035ru.unicorn.ujin.market.coupon.CouponListAdapter.access$getContext$p(r7)
                ru.unicorn.ujin.util.GlideRequests r7 = p035ru.unicorn.ujin.util.GlideApp.with((android.content.Context) r7)
                ru.unicorn.ujin.data.realm.marketplace.CouponImage r0 = r0.getImage()
                if (r0 == 0) goto L_0x00d9
                java.lang.String r2 = r0.getUrl()
            L_0x00d9:
                ru.unicorn.ujin.util.GlideRequest r7 = r7.load((java.lang.String) r2)
                android.view.View r0 = r6.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                int r1 = p035ru.unicorn.C5619R.C5622id.ivCouponImage
                android.view.View r0 = r0.findViewById(r1)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r7.into((android.widget.ImageView) r0)
                int r7 = android.os.Build.VERSION.SDK_INT
                r0 = 21
                if (r7 < r0) goto L_0x0109
                android.view.View r7 = r6.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
                int r0 = p035ru.unicorn.C5619R.C5622id.ivCouponImage
                android.view.View r7 = r7.findViewById(r0)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                java.lang.String r0 = "itemView.ivCouponImage"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
                r0 = 1
                r7.setClipToOutline(r0)
            L_0x0109:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.coupon.CouponListAdapter.ViewHolder.bind(int):void");
        }
    }
}
