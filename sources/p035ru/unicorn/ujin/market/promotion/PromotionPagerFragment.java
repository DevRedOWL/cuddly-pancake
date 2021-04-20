package p035ru.unicorn.ujin.market.promotion;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.Promotion;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.viewModel.events.market.PromotionListEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0014J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0016\u001a\u00020\bH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/market/promotion/PromotionPagerFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "companyId", "", "promotionPagerAdapter", "Lru/unicorn/ujin/market/promotion/PromotionPagerAdapter;", "handleEvent", "", "event", "Lru/unicorn/ujin/viewModel/events/market/PromotionListEvent;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.promotion.PromotionPagerFragment */
/* compiled from: PromotionPagerFragment.kt */
public final class PromotionPagerFragment extends MarketBaseFragment {
    public static final String COMPANY_ID = "companyId";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int LIMIT = 10;
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public String companyId;
    private PromotionPagerAdapter promotionPagerAdapter;

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
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_promotion_pager, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setNeedResetToolbar(false);
        Bundle arguments = getArguments();
        this.companyId = arguments != null ? arguments.getString("companyId") : null;
        List emptyList = CollectionsKt.emptyList();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        this.promotionPagerAdapter = new PromotionPagerAdapter(emptyList, context);
        PromotionPagerAdapter promotionPagerAdapter2 = this.promotionPagerAdapter;
        if (promotionPagerAdapter2 != null) {
            promotionPagerAdapter2.setShowPromotionFragment(new PromotionPagerFragment$onViewCreated$1(this));
        }
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.promotionViewPager);
        viewPager.setAdapter(this.promotionPagerAdapter);
        viewPager.setPageMargin(viewPager.getResources().getDimensionPixelOffset(R.dimen.smallPadding));
        viewPager.setClipToPadding(false);
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvShowAll)).setOnClickListener(new PromotionPagerFragment$onViewCreated$3(this));
        String str = this.companyId;
        if (str != null && (!StringsKt.isBlank(str))) {
            getMarketViewModel().loadPromotionList(this.companyId, 10, 0);
            getMarketViewModel().getPromotionListLiveData().observe(this, new PromotionPagerFragment$onViewCreated$4(this));
        }
    }

    /* access modifiers changed from: private */
    public final void handleEvent(PromotionListEvent promotionListEvent) {
        if (promotionListEvent.getSuccess()) {
            List<Promotion> promotionList = promotionListEvent.getPromotionList();
            Collection collection = promotionList;
            if (!(collection == null || collection.isEmpty())) {
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvPromotionCount);
                Intrinsics.checkNotNullExpressionValue(textView, "tvPromotionCount");
                textView.setText(getResources().getString(R.string.total_count, new Object[]{String.valueOf(promotionListEvent.getTotalCount())}));
                PromotionPagerAdapter promotionPagerAdapter2 = this.promotionPagerAdapter;
                if (promotionPagerAdapter2 != null) {
                    promotionPagerAdapter2.setItems(promotionList);
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C5619R.C5622id.promotionPagerLayout);
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "promotionPagerLayout");
                constraintLayout.setVisibility(0);
            }
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/market/promotion/PromotionPagerFragment$Companion;", "", "()V", "COMPANY_ID", "", "LIMIT", "", "newInstance", "Lru/unicorn/ujin/market/promotion/PromotionPagerFragment;", "companyId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.promotion.PromotionPagerFragment$Companion */
    /* compiled from: PromotionPagerFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PromotionPagerFragment newInstance(String str) {
            PromotionPagerFragment promotionPagerFragment = new PromotionPagerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("companyId", str);
            Unit unit = Unit.INSTANCE;
            promotionPagerFragment.setArguments(bundle);
            return promotionPagerFragment;
        }
    }
}
