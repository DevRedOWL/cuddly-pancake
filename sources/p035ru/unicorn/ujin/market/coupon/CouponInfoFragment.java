package p035ru.unicorn.ujin.market.coupon;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.Coupon;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.market.model.MarketViewModel;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.market.RedeemCouponEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0010H\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\b\u0010'\u001a\u00020(H\u0014J$\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u001a\u00100\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0018\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002J\u0018\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u000203H\u0002J\b\u00108\u001a\u00020\u0019H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006:"}, mo51343d2 = {"Lru/unicorn/ujin/market/coupon/CouponInfoFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "coupon", "Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "getCoupon", "()Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "setCoupon", "(Lru/unicorn/ujin/data/realm/marketplace/Coupon;)V", "modeExpanded", "", "getModeExpanded", "()Z", "setModeExpanded", "(Z)V", "obtainHeight", "", "getObtainHeight", "()I", "setObtainHeight", "(I)V", "obtainTitleHeight", "getObtainTitleHeight", "setObtainTitleHeight", "animateDescription", "", "lines", "collapse", "collapseTerms", "view", "Landroid/view/View;", "expand", "expandTerms", "height", "handleEvent", "event", "Lru/unicorn/ujin/viewModel/events/market/RedeemCouponEvent;", "handleExpandCollapse", "handleRedeemClick", "metricsScreenName", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "rotateArrow", "from", "", "to", "scaleImage", "scaleStart", "scaleEnd", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.coupon.CouponInfoFragment */
/* compiled from: CouponInfoFragment.kt */
public final class CouponInfoFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public Coupon coupon;
    private boolean modeExpanded;
    private int obtainHeight;
    private int obtainTitleHeight;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setToolbarRight(initRightButtonList(false));
        BaseActivity baseActivity = getBaseActivity();
        Coupon coupon2 = this.coupon;
        if (coupon2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.COUPON);
        }
        baseActivity.setTextTitle(coupon2.getTitle());
    }

    public final Coupon getCoupon() {
        Coupon coupon2 = this.coupon;
        if (coupon2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.COUPON);
        }
        return coupon2;
    }

    public final void setCoupon(Coupon coupon2) {
        Intrinsics.checkNotNullParameter(coupon2, "<set-?>");
        this.coupon = coupon2;
    }

    public final boolean getModeExpanded() {
        return this.modeExpanded;
    }

    public final void setModeExpanded(boolean z) {
        this.modeExpanded = z;
    }

    public final int getObtainHeight() {
        return this.obtainHeight;
    }

    public final void setObtainHeight(int i) {
        this.obtainHeight = i;
    }

    public final int getObtainTitleHeight() {
        return this.obtainTitleHeight;
    }

    public final void setObtainTitleHeight(int i) {
        this.obtainTitleHeight = i;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_market_coupon_info, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…n_info, container, false)");
        return inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0233  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            super.onViewCreated(r7, r8)
            ru.unicorn.ujin.data.realm.marketplace.Coupon r7 = r6.coupon
            java.lang.String r8 = "coupon"
            if (r7 != 0) goto L_0x0011
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0011:
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r7 = r7.getRedeemedCode()
            r0 = 0
            if (r7 == 0) goto L_0x0058
            ru.unicorn.ujin.data.realm.marketplace.Coupon r7 = r6.coupon
            if (r7 != 0) goto L_0x001f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x001f:
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r7 = r7.getRedeemedCode()
            if (r7 == 0) goto L_0x002a
            java.lang.String r7 = r7.getText()
            goto L_0x002b
        L_0x002a:
            r7 = r0
        L_0x002b:
            if (r7 == 0) goto L_0x0058
            int r7 = p035ru.unicorn.C5619R.C5622id.btnGetCoupon
            android.view.View r7 = r6._$_findCachedViewById(r7)
            androidx.appcompat.widget.AppCompatButton r7 = (androidx.appcompat.widget.AppCompatButton) r7
            ru.unicorn.ujin.data.realm.marketplace.Coupon r1 = r6.coupon
            if (r1 != 0) goto L_0x003c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x003c:
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r1 = r1.getRedeemedCode()
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = r1.getText()
            goto L_0x0048
        L_0x0047:
            r1 = r0
        L_0x0048:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r7.setText(r1)
            ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$$inlined$apply$lambda$1 r1 = new ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$$inlined$apply$lambda$1
            r1.<init>(r6)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r7.setOnClickListener(r1)
            goto L_0x0088
        L_0x0058:
            int r7 = p035ru.unicorn.C5619R.C5622id.btnGetCoupon
            android.view.View r7 = r6._$_findCachedViewById(r7)
            androidx.appcompat.widget.AppCompatButton r7 = (androidx.appcompat.widget.AppCompatButton) r7
            ru.unicorn.ujin.data.realm.marketplace.Coupon r1 = r6.coupon
            if (r1 != 0) goto L_0x0067
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0067:
            java.lang.String r1 = r1.getButtonTitle()
            if (r1 == 0) goto L_0x006e
            goto L_0x0079
        L_0x006e:
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131886819(0x7f1202e3, float:1.9408228E38)
            java.lang.String r1 = r1.getString(r2)
        L_0x0079:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r7.setText(r1)
            ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$$inlined$apply$lambda$2 r1 = new ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$$inlined$apply$lambda$2
            r1.<init>(r6)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r7.setOnClickListener(r1)
        L_0x0088:
            ru.unicorn.ujin.data.realm.marketplace.Coupon r7 = r6.coupon
            if (r7 != 0) goto L_0x008f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x008f:
            java.lang.String r7 = r7.getTitle()
            if (r7 == 0) goto L_0x00a7
            int r1 = p035ru.unicorn.C5619R.C5622id.tvTitle
            android.view.View r1 = r6._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = "tvTitle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.setText(r7)
        L_0x00a7:
            ru.unicorn.ujin.data.realm.marketplace.Coupon r7 = r6.coupon
            if (r7 != 0) goto L_0x00ae
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x00ae:
            java.lang.String r7 = r7.getDescription()
            if (r7 == 0) goto L_0x00c6
            int r1 = p035ru.unicorn.C5619R.C5622id.tvDescription
            android.view.View r1 = r6._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = "tvDescription"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.setText(r7)
        L_0x00c6:
            android.content.Context r7 = r6.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            ru.unicorn.ujin.util.GlideRequests r7 = p035ru.unicorn.ujin.util.GlideApp.with((android.content.Context) r7)
            ru.unicorn.ujin.data.realm.marketplace.Coupon r1 = r6.coupon
            if (r1 != 0) goto L_0x00d8
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x00d8:
            ru.unicorn.ujin.data.realm.marketplace.CouponImage r1 = r1.getImage()
            if (r1 == 0) goto L_0x00e2
            java.lang.String r0 = r1.getUrl()
        L_0x00e2:
            ru.unicorn.ujin.util.GlideRequest r7 = r7.load((java.lang.String) r0)
            int r0 = p035ru.unicorn.C5619R.C5622id.ivCouponImage
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.into((android.widget.ImageView) r0)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            r1 = 1
            if (r7 < r0) goto L_0x0108
            int r7 = p035ru.unicorn.C5619R.C5622id.ivCouponImage
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            java.lang.String r0 = "ivCouponImage"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            r7.setClipToOutline(r1)
        L_0x0108:
            ru.unicorn.ujin.data.realm.marketplace.Coupon r7 = r6.coupon
            if (r7 != 0) goto L_0x010f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x010f:
            java.lang.String r7 = r7.getLongDescription()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r0 = 0
            if (r7 == 0) goto L_0x0121
            int r7 = r7.length()
            if (r7 != 0) goto L_0x011f
            goto L_0x0121
        L_0x011f:
            r7 = 0
            goto L_0x0122
        L_0x0121:
            r7 = 1
        L_0x0122:
            java.lang.String r2 = "ivArrowExpand"
            r3 = 8
            if (r7 == 0) goto L_0x0163
            ru.unicorn.ujin.data.realm.marketplace.Coupon r7 = r6.coupon
            if (r7 != 0) goto L_0x012f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x012f:
            java.lang.String r7 = r7.getTermsOfObtaining()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L_0x0140
            int r7 = r7.length()
            if (r7 != 0) goto L_0x013e
            goto L_0x0140
        L_0x013e:
            r7 = 0
            goto L_0x0141
        L_0x0140:
            r7 = 1
        L_0x0141:
            if (r7 == 0) goto L_0x0163
            int r7 = p035ru.unicorn.C5619R.C5622id.llAdditionalInfo
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            java.lang.String r8 = "llAdditionalInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r7.setVisibility(r3)
            int r7 = p035ru.unicorn.C5619R.C5622id.ivArrowExpand
            android.view.View r7 = r6._$_findCachedViewById(r7)
            androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r7.setVisibility(r3)
            goto L_0x024e
        L_0x0163:
            ru.unicorn.ujin.data.realm.marketplace.Coupon r7 = r6.coupon
            if (r7 != 0) goto L_0x016a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x016a:
            java.lang.String r7 = r7.getLongDescription()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L_0x017b
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r7 = 0
            goto L_0x017c
        L_0x017b:
            r7 = 1
        L_0x017c:
            java.lang.String r4 = "tvLongDescriptionTitle"
            java.lang.String r5 = "tvLongDescription"
            if (r7 == 0) goto L_0x01ad
            int r7 = p035ru.unicorn.C5619R.C5622id.tvLongDescription
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            r7.setVisibility(r3)
            int r7 = p035ru.unicorn.C5619R.C5622id.tvLongDescriptionTitle
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)
            r7.setVisibility(r3)
            int r7 = p035ru.unicorn.C5619R.C5622id.ivArrowExpand
            android.view.View r7 = r6._$_findCachedViewById(r7)
            androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r7.setVisibility(r3)
            goto L_0x01fa
        L_0x01ad:
            int r7 = p035ru.unicorn.C5619R.C5622id.tvLongDescription
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            ru.unicorn.ujin.data.realm.marketplace.Coupon r2 = r6.coupon
            if (r2 != 0) goto L_0x01bf
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x01bf:
            java.lang.String r2 = r2.getLongDescription()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.setText(r2)
            int r7 = p035ru.unicorn.C5619R.C5622id.tvLongDescription
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            android.view.ViewTreeObserver r7 = r7.getViewTreeObserver()
            ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$5 r2 = new ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$5
            r2.<init>(r6)
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r2
            r7.addOnGlobalLayoutListener(r2)
            int r7 = p035ru.unicorn.C5619R.C5622id.tvLongDescriptionTitle
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)
            android.view.ViewTreeObserver r7 = r7.getViewTreeObserver()
            ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$6 r2 = new ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$6
            r2.<init>(r6)
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r2
            r7.addOnGlobalLayoutListener(r2)
        L_0x01fa:
            ru.unicorn.ujin.data.realm.marketplace.Coupon r7 = r6.coupon
            if (r7 != 0) goto L_0x0201
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0201:
            java.lang.String r7 = r7.getTermsOfObtaining()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L_0x020f
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0210
        L_0x020f:
            r0 = 1
        L_0x0210:
            java.lang.String r7 = "tvTermsOfObtaining"
            if (r0 == 0) goto L_0x0233
            int r8 = p035ru.unicorn.C5619R.C5622id.tvTermsOfObtaining
            android.view.View r8 = r6._$_findCachedViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            r8.setVisibility(r3)
            int r7 = p035ru.unicorn.C5619R.C5622id.tvTermsOfObtainingTitle
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r8 = "tvTermsOfObtainingTitle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r7.setVisibility(r3)
            goto L_0x024e
        L_0x0233:
            int r0 = p035ru.unicorn.C5619R.C5622id.tvTermsOfObtaining
            android.view.View r0 = r6._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
            ru.unicorn.ujin.data.realm.marketplace.Coupon r7 = r6.coupon
            if (r7 != 0) goto L_0x0245
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0245:
            java.lang.String r7 = r7.getTermsOfObtaining()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r0.setText(r7)
        L_0x024e:
            int r7 = p035ru.unicorn.C5619R.C5622id.ivArrowExpand
            android.view.View r7 = r6._$_findCachedViewById(r7)
            androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
            ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$7 r8 = new ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$7
            r8.<init>(r6)
            android.view.View$OnClickListener r8 = (android.view.View.OnClickListener) r8
            r7.setOnClickListener(r8)
            int r7 = p035ru.unicorn.C5619R.C5622id.llAdditionalInfo
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$8 r8 = new ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$8
            r8.<init>(r6)
            android.view.View$OnClickListener r8 = (android.view.View.OnClickListener) r8
            r7.setOnClickListener(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.coupon.CouponInfoFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    public final void handleRedeemClick() {
        MarketViewModel marketViewModel = getMarketViewModel();
        Coupon coupon2 = this.coupon;
        if (coupon2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.COUPON);
        }
        marketViewModel.redeemCouponCode(coupon2.getId());
        getMarketViewModel().getRedeemCouponCodeLiveData().observe(this, new CouponInfoFragment$handleRedeemClick$1(this));
    }

    /* access modifiers changed from: private */
    public final void handleEvent(RedeemCouponEvent redeemCouponEvent) {
        if (redeemCouponEvent.getSuccess()) {
            RedeemedCode code = redeemCouponEvent.getCode();
            if (code != null) {
                AppCompatButton appCompatButton = (AppCompatButton) _$_findCachedViewById(C5619R.C5622id.btnGetCoupon);
                Intrinsics.checkNotNullExpressionValue(appCompatButton, "btnGetCoupon");
                appCompatButton.setText(code.getText());
                ((AppCompatButton) _$_findCachedViewById(C5619R.C5622id.btnGetCoupon)).setOnClickListener(new CouponInfoFragment$handleEvent$$inlined$let$lambda$1(this));
            }
        } else {
            showMessage(redeemCouponEvent.getMessage());
        }
        getMarketViewModel().getRedeemCouponCodeLiveData().removeObservers(this);
    }

    /* access modifiers changed from: private */
    public final void handleExpandCollapse() {
        if (this.modeExpanded) {
            collapse();
        } else {
            expand();
        }
        this.modeExpanded = !this.modeExpanded;
    }

    private final void collapse() {
        Coupon coupon2 = this.coupon;
        if (coupon2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.COUPON);
        }
        CharSequence termsOfObtaining = coupon2.getTermsOfObtaining();
        if (!(termsOfObtaining == null || termsOfObtaining.length() == 0)) {
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvTermsOfObtaining);
            Intrinsics.checkNotNullExpressionValue(textView, "tvTermsOfObtaining");
            expandTerms(textView, this.obtainHeight);
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvTermsOfObtainingTitle);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvTermsOfObtainingTitle");
            expandTerms(textView2, this.obtainTitleHeight);
        }
        animateDescription(5);
        rotateArrow(180.0f, 0.0f);
        scaleImage(1.2f, 1.0f);
    }

    private final void scaleImage(float f, float f2) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(400);
        ((ImageView) _$_findCachedViewById(C5619R.C5622id.ivCouponImage)).startAnimation(scaleAnimation);
    }

    private final void expand() {
        animateDescription(100);
        Coupon coupon2 = this.coupon;
        if (coupon2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.COUPON);
        }
        CharSequence termsOfObtaining = coupon2.getTermsOfObtaining();
        if (!(termsOfObtaining == null || termsOfObtaining.length() == 0)) {
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvTermsOfObtaining);
            Intrinsics.checkNotNullExpressionValue(textView, "tvTermsOfObtaining");
            collapseTerms(textView);
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvTermsOfObtainingTitle);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvTermsOfObtainingTitle");
            collapseTerms(textView2);
        }
        rotateArrow(0.0f, 180.0f);
        scaleImage(1.0f, 1.2f);
    }

    private final void animateDescription(int i) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt((TextView) _$_findCachedViewById(C5619R.C5622id.tvLongDescription), "maxLines", new int[]{i});
        Intrinsics.checkNotNullExpressionValue(ofInt, "animation");
        ofInt.setDuration(500);
        ofInt.start();
    }

    private final void expandTerms(View view, int i) {
        view.setVisibility(0);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, i});
        Intrinsics.checkNotNullExpressionValue(ofInt, "anim");
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(500);
        ofInt.addUpdateListener(new CouponInfoFragment$expandTerms$1(view, i));
        ofInt.addListener(new CouponInfoFragment$expandTerms$2(view));
        ofInt.start();
    }

    private final void collapseTerms(View view) {
        int measuredHeight = view.getMeasuredHeight();
        view.setVisibility(0);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{measuredHeight, 0});
        Intrinsics.checkNotNullExpressionValue(ofInt, "anim");
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(500);
        ofInt.addUpdateListener(new CouponInfoFragment$collapseTerms$1(view, measuredHeight));
        ofInt.addListener(new CouponInfoFragment$collapseTerms$2(view));
        ofInt.start();
    }

    private final void rotateArrow(float f, float f2) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new DecelerateInterpolator());
        animationSet.setFillAfter(true);
        animationSet.setFillEnabled(true);
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(500);
        rotateAnimation.setFillAfter(true);
        animationSet.addAnimation(rotateAnimation);
        ((AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivArrowExpand)).startAnimation(animationSet);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/market/coupon/CouponInfoFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/market/coupon/CouponInfoFragment;", "coupon", "Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.coupon.CouponInfoFragment$Companion */
    /* compiled from: CouponInfoFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CouponInfoFragment newInstance(Coupon coupon) {
            Intrinsics.checkNotNullParameter(coupon, FirebaseAnalytics.Param.COUPON);
            CouponInfoFragment couponInfoFragment = new CouponInfoFragment();
            couponInfoFragment.setCoupon(coupon);
            return couponInfoFragment;
        }
    }
}
