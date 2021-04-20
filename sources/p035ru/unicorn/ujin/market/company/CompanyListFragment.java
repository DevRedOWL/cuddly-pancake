package p035ru.unicorn.ujin.market.company;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.marketplace.CompanyListResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u0012\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0014J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\"\u001a\u00020\u0010H\u0014J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\rH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/market/company/CompanyListFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "categoryId", "", "companyList", "", "Lru/unicorn/ujin/data/realm/marketplace/Company;", "companyListAdapter", "Lru/unicorn/ujin/market/company/CompanyListAdapter;", "currentPage", "", "isCompanyListLoaded", "", "lastPage", "checkCompaniesCount", "", "clearCompanyList", "handleEvent", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CompanyListResponseData;", "loadCompanyList", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "toggleProgressVisibility", "isLoading", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.company.CompanyListFragment */
/* compiled from: CompanyListFragment.kt */
public final class CompanyListFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String PARENT_ID = "0";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public String categoryId;
    private List<Company> companyList = new ArrayList();
    private CompanyListAdapter companyListAdapter;
    /* access modifiers changed from: private */
    public int currentPage = 1;
    /* access modifiers changed from: private */
    public boolean isCompanyListLoaded;
    /* access modifiers changed from: private */
    public int lastPage = 1;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.company.CompanyListFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 3;
        }
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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        String string = getString(R.string.metricsCompaniesFragment);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.metricsCompaniesFragment)");
        return string;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_market_company_list, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…y_list, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setNeedResetToolbar(false);
        NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.companyListScrollView);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "companyListScrollView");
        nestedScrollView.setVisibility(8);
        this.companyListAdapter = new CompanyListAdapter(this.companyList);
        CompanyListAdapter companyListAdapter2 = this.companyListAdapter;
        if (companyListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("companyListAdapter");
        }
        companyListAdapter2.setOnItemClick(new CompanyListFragment$onViewCreated$1(this));
        ((NestedScrollView) _$_findCachedViewById(C5619R.C5622id.companyListScrollView)).setOnScrollChangeListener(new CompanyListFragment$onViewCreated$2(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.companyListView);
        CompanyListAdapter companyListAdapter3 = this.companyListAdapter;
        if (companyListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("companyListAdapter");
        }
        recyclerView.setAdapter(companyListAdapter3);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        if (this.companyList.isEmpty()) {
            this.isCompanyListLoaded = false;
            getMarketViewModel().getCompanyListLiveData().observe(getViewLifecycleOwner(), new CompanyListFragment$onViewCreated$4(this));
            getMarketViewModel().getShowProgressLiveData().observe(getViewLifecycleOwner(), new CompanyListFragment$onViewCreated$5(this));
            loadCompanyList();
        } else if (!this.companyList.isEmpty()) {
            CompanyListAdapter companyListAdapter4 = this.companyListAdapter;
            if (companyListAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("companyListAdapter");
            }
            companyListAdapter4.setItems(this.companyList);
            NestedScrollView nestedScrollView2 = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.companyListScrollView);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "companyListScrollView");
            nestedScrollView2.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public final void loadCompanyList() {
        String str = this.categoryId;
        if (str != null) {
            getMarketViewModel().loadCompanyList(CollectionsKt.listOf(str), this.currentPage, (String) null);
        }
    }

    private final void clearCompanyList() {
        CompanyListAdapter companyListAdapter2 = this.companyListAdapter;
        if (companyListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("companyListAdapter");
        }
        companyListAdapter2.setItems(new ArrayList());
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.noOffersTextView);
        Intrinsics.checkNotNullExpressionValue(textView, "noOffersTextView");
        textView.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void toggleProgressVisibility(boolean z) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        int i = 0;
        progressBar.setVisibility((!z || this.currentPage != 1) ? 8 : 0);
        ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.smallProgressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar2, "smallProgressBar");
        if (!z || this.currentPage == 1) {
            i = 8;
        }
        progressBar2.setVisibility(i);
    }

    /* access modifiers changed from: private */
    public final void handleEvent(Resource<CompanyListResponseData> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.companyListScrollView);
                Intrinsics.checkNotNullExpressionValue(nestedScrollView, "companyListScrollView");
                nestedScrollView.setVisibility(0);
                this.isCompanyListLoaded = true;
                RealmList<Company> companies = resource.getData().getCompanies();
                Collection collection = companies;
                if (!(collection == null || collection.isEmpty())) {
                    this.companyList.addAll(collection);
                    if (this.currentPage == 1) {
                        this.lastPage = resource.getData().getMeta().getLastPage();
                        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.noOffersTextView);
                        Intrinsics.checkNotNullExpressionValue(textView, "noOffersTextView");
                        textView.setVisibility(8);
                        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.companyListView);
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "companyListView");
                        recyclerView.setVisibility(0);
                        CompanyListAdapter companyListAdapter2 = this.companyListAdapter;
                        if (companyListAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("companyListAdapter");
                        }
                        companyListAdapter2.setItems(companies);
                    } else {
                        Iterator<Company> it = companies.iterator();
                        while (it.hasNext()) {
                            Company next = it.next();
                            CompanyListAdapter companyListAdapter3 = this.companyListAdapter;
                            if (companyListAdapter3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("companyListAdapter");
                            }
                            Intrinsics.checkNotNullExpressionValue(next, "item");
                            companyListAdapter3.addItem(next);
                        }
                    }
                }
                checkCompaniesCount();
            } else if (i == 2) {
                NestedScrollView nestedScrollView2 = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.companyListScrollView);
                Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "companyListScrollView");
                nestedScrollView2.setVisibility(0);
                this.isCompanyListLoaded = true;
                showMessage(resource.getMessage());
            }
        }
    }

    private final void checkCompaniesCount() {
        if (this.isCompanyListLoaded) {
            CompanyListAdapter companyListAdapter2 = this.companyListAdapter;
            if (companyListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("companyListAdapter");
            }
            if (companyListAdapter2.getData().isEmpty()) {
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.noOffersTextView);
                Intrinsics.checkNotNullExpressionValue(textView, "noOffersTextView");
                textView.setVisibility(0);
            }
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/market/company/CompanyListFragment$Companion;", "", "()V", "PARENT_ID", "", "newInstance", "Lru/unicorn/ujin/market/company/CompanyListFragment;", "id", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.company.CompanyListFragment$Companion */
    /* compiled from: CompanyListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CompanyListFragment newInstance(String str) {
            CompanyListFragment companyListFragment = new CompanyListFragment();
            if (str == null) {
                str = "0";
            }
            companyListFragment.categoryId = str;
            return companyListFragment;
        }
    }
}
