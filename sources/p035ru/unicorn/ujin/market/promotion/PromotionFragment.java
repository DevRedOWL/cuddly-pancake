package p035ru.unicorn.ujin.market.promotion;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.Promotion;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0014J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/market/promotion/PromotionFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "promotionId", "", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.promotion.PromotionFragment */
/* compiled from: PromotionFragment.kt */
public final class PromotionFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String PROMOTION_ID = "promotionId";
    private HashMap _$_findViewCache;
    private String promotionId;

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
        getBaseActivity().setTextTitle(getResources().getString(R.string.promotion));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        this.promotionId = arguments != null ? arguments.getString(PROMOTION_ID) : null;
        View inflate = layoutInflater.inflate(R.layout.fragment_promotion, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…motion, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Promotion promotion = getMarketViewModel().getPromotion(this.promotionId);
        if (!(promotion == null || promotion.getText() == null)) {
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDescription);
            Intrinsics.checkNotNullExpressionValue(textView, "tvDescription");
            textView.setText(Html.fromHtml(promotion.getText()));
        }
        TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvDate);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvDate");
        String str = null;
        CharSequence finishedAt = promotion != null ? promotion.getFinishedAt() : null;
        if (finishedAt == null || StringsKt.isBlank(finishedAt)) {
            charSequence = view.getResources().getString(R.string.permanent_promotion);
        } else {
            if (promotion != null) {
                str = promotion.getFinishedAt();
            }
            charSequence = DateUtils.formatDateFromUnix(str);
        }
        textView2.setText(charSequence);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/market/promotion/PromotionFragment$Companion;", "", "()V", "PROMOTION_ID", "", "newInstance", "Lru/unicorn/ujin/market/promotion/PromotionFragment;", "promotionId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.promotion.PromotionFragment$Companion */
    /* compiled from: PromotionFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PromotionFragment newInstance(String str) {
            PromotionFragment promotionFragment = new PromotionFragment();
            Bundle bundle = new Bundle();
            bundle.putString(PromotionFragment.PROMOTION_ID, str);
            Unit unit = Unit.INSTANCE;
            promotionFragment.setArguments(bundle);
            return promotionFragment;
        }
    }
}
