package p035ru.unicorn.ujin.market.coupon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.marketplace.CouponListResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.marketplace.Coupon;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.metrics.MetricsFacade;
import p035ru.unicorn.ujin.metrics.MetricsKeys;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.market.RedeemCouponEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002J'\u0010\f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0014J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\"\u001a\u00020\tH\u0002J\b\u0010#\u001a\u00020\tH\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006%"}, mo51343d2 = {"Lru/unicorn/ujin/market/coupon/CouponListFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "couponList", "", "Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "couponListAdapter", "Lru/unicorn/ujin/market/coupon/CouponListAdapter;", "handleCouponClick", "", "position", "", "handleEvent", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CouponListResponseData;", "event", "Lru/unicorn/ujin/viewModel/events/market/RedeemCouponEvent;", "id", "(Lru/unicorn/ujin/viewModel/events/market/RedeemCouponEvent;Ljava/lang/Integer;I)V", "handleGroupClicked", "title", "", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "removeObservers", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.coupon.CouponListFragment */
/* compiled from: CouponListFragment.kt */
public final class CouponListFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private List<Coupon> couponList = new ArrayList();
    private CouponListAdapter couponListAdapter;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.coupon.CouponListFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 3;
        }
    }

    /* access modifiers changed from: private */
    public final void handleCouponClick(int i) {
    }

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
        getBaseActivity().setTextTitle(getResources().getString(R.string.special_offers));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        MetricsFacade.Companion companion = MetricsFacade.Companion;
        String value = MetricsKeys.market.getValue();
        HashMap hashMap = new HashMap();
        hashMap.put(MetricsKeys.coupons.getValue(), "");
        Unit unit = Unit.INSTANCE;
        companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
        View inflate = layoutInflater.inflate(R.layout.fragment_market_coupon_list, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…n_list, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.couponListAdapter = new CouponListAdapter(this.couponList, new CouponListFragment$onViewCreated$1(this), new CouponListFragment$onViewCreated$2(this), new CouponListFragment$onViewCreated$3(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvCouponList);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rvCouponList");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvCouponList);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvCouponList");
        CouponListAdapter couponListAdapter2 = this.couponListAdapter;
        if (couponListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponListAdapter");
        }
        recyclerView2.setAdapter(couponListAdapter2);
        removeObservers();
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(0);
        getMarketViewModel().loadCouponList();
        getMarketViewModel().getCouponListLiveData().observe(this, new CouponListFragment$onViewCreated$4(this));
    }

    /* access modifiers changed from: private */
    public final void handleEvent(Resource<CouponListResponseData> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(8);
                this.couponList = resource.getData().getCoupons();
                CouponListAdapter couponListAdapter2 = this.couponListAdapter;
                if (couponListAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("couponListAdapter");
                }
                couponListAdapter2.setItems(this.couponList);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(8);
                showMessage(resource.getMessage());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                progressBar3.setVisibility(0);
            }
        }
    }

    private final void handleGroupClicked(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) getString(R.string.coupon_category_all))) {
            CouponListAdapter couponListAdapter2 = this.couponListAdapter;
            if (couponListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("couponListAdapter");
            }
            couponListAdapter2.setItems(this.couponList);
            return;
        }
        CouponListAdapter couponListAdapter3 = this.couponListAdapter;
        if (couponListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponListAdapter");
        }
        ArrayList arrayList = new ArrayList();
        Collection arrayList2 = new ArrayList();
        for (Object next : this.couponList) {
            if (Intrinsics.areEqual((Object) ((Coupon) next).getGroup(), (Object) str)) {
                arrayList2.add(next);
            }
        }
        arrayList.addAll((List) arrayList2);
        Unit unit = Unit.INSTANCE;
        couponListAdapter3.setItems(arrayList);
    }

    /* access modifiers changed from: private */
    public final void handleEvent(RedeemCouponEvent redeemCouponEvent, Integer num, int i) {
        Coupon updateRedeemedCoupon;
        if (!redeemCouponEvent.getSuccess()) {
            showMessage(redeemCouponEvent.getMessage());
        } else if (!(redeemCouponEvent.getCode() == null || (updateRedeemedCoupon = getMarketViewModel().updateRedeemedCoupon(num, redeemCouponEvent.getCode())) == null)) {
            CouponListAdapter couponListAdapter2 = this.couponListAdapter;
            if (couponListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("couponListAdapter");
            }
            couponListAdapter2.updateItem(i, updateRedeemedCoupon);
        }
        removeObservers();
    }

    private final void removeObservers() {
        getMarketViewModel().getRedeemCouponCodeLiveData().removeObservers(this);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/market/coupon/CouponListFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/market/coupon/CouponListFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.coupon.CouponListFragment$Companion */
    /* compiled from: CouponListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CouponListFragment newInstance() {
            return new CouponListFragment();
        }
    }
}
