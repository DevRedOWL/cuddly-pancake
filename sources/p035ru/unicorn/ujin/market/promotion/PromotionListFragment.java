package p035ru.unicorn.ujin.market.promotion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.Promotion;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.market.PromotionListEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0014J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/market/promotion/PromotionListFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "companyId", "", "isLoading", "", "offset", "", "promotionListAdapter", "Lru/unicorn/ujin/market/promotion/PromotionListAdapter;", "handleEvent", "", "event", "Lru/unicorn/ujin/viewModel/events/market/PromotionListEvent;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.promotion.PromotionListFragment */
/* compiled from: PromotionListFragment.kt */
public final class PromotionListFragment extends MarketBaseFragment {
    public static final String COMPANY_ID = "companyId";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int LIMIT = 10;
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public String companyId;
    /* access modifiers changed from: private */
    public boolean isLoading;
    /* access modifiers changed from: private */
    public int offset;
    /* access modifiers changed from: private */
    public PromotionListAdapter promotionListAdapter;

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

    public static final /* synthetic */ PromotionListAdapter access$getPromotionListAdapter$p(PromotionListFragment promotionListFragment) {
        PromotionListAdapter promotionListAdapter2 = promotionListFragment.promotionListAdapter;
        if (promotionListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promotionListAdapter");
        }
        return promotionListAdapter2;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getResources().getString(R.string.promotions));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_promotion_list, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…n_list, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.companyId = arguments != null ? arguments.getString("companyId") : null;
        this.promotionListAdapter = new PromotionListAdapter(getMarketViewModel().getPromotionList(this.companyId));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvPromotionList);
        PromotionListAdapter promotionListAdapter2 = this.promotionListAdapter;
        if (promotionListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promotionListAdapter");
        }
        recyclerView.setAdapter(promotionListAdapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        ((NestedScrollView) _$_findCachedViewById(C5619R.C5622id.promotionListScrollView)).setOnScrollChangeListener(new PromotionListFragment$onViewCreated$2(this));
        LifecycleOwner lifecycleOwner = this;
        getMarketViewModel().getPromotionListLiveData().observe(lifecycleOwner, new PromotionListFragment$onViewCreated$3(this));
        getMarketViewModel().getShowProgressLiveData().observe(lifecycleOwner, new PromotionListFragment$onViewCreated$4(this));
    }

    /* access modifiers changed from: private */
    public final void handleEvent(PromotionListEvent promotionListEvent) {
        if (promotionListEvent.getSuccess()) {
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.smallProgressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar, "smallProgressBar");
            progressBar.setVisibility(8);
            for (Promotion next : promotionListEvent.getPromotionList()) {
                PromotionListAdapter promotionListAdapter2 = this.promotionListAdapter;
                if (promotionListAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("promotionListAdapter");
                }
                promotionListAdapter2.addItem(next);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handleEvent(boolean z) {
        this.isLoading = z;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/market/promotion/PromotionListFragment$Companion;", "", "()V", "COMPANY_ID", "", "LIMIT", "", "newInstance", "Lru/unicorn/ujin/market/promotion/PromotionListFragment;", "companyId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.promotion.PromotionListFragment$Companion */
    /* compiled from: PromotionListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PromotionListFragment newInstance(String str) {
            PromotionListFragment promotionListFragment = new PromotionListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("companyId", str);
            Unit unit = Unit.INSTANCE;
            promotionListFragment.setArguments(bundle);
            return promotionListFragment;
        }
    }
}
