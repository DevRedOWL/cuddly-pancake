package p035ru.unicorn.ujin.market.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.market.MarketBaseFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0014J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010$\u001a\u00020\u0011H\u0014J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, mo51343d2 = {"Lru/unicorn/ujin/market/search/SearchResultCategoryFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "categoryId", "", "currentPage", "", "isResultListLoaded", "", "lastPage", "resultList", "", "Lru/unicorn/ujin/market/search/SearchResultType;", "searchResultAdapter", "Lru/unicorn/ujin/market/search/SearchResultAdapter;", "searchValue", "checkDataCount", "", "clearResults", "handleCategoryEvent", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CategoryListResponseData;", "handleSearchCategoryEvent", "loadData", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "toggleProgressVisibility", "isLoading", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.search.SearchResultCategoryFragment */
/* compiled from: SearchResultCategoryFragment.kt */
public final class SearchResultCategoryFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String PARENT_ID = "0";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public String categoryId;
    /* access modifiers changed from: private */
    public int currentPage = 1;
    /* access modifiers changed from: private */
    public boolean isResultListLoaded;
    /* access modifiers changed from: private */
    public int lastPage = 1;
    private List<SearchResultType> resultList = new ArrayList();
    private SearchResultAdapter searchResultAdapter;
    private String searchValue;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.search.SearchResultCategoryFragment$WhenMappings */
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
        View inflate = layoutInflater.inflate(R.layout.fragment_search_result, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…result, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        boolean z = false;
        setNeedResetToolbar(false);
        NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.resultListScrollView);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "resultListScrollView");
        nestedScrollView.setVisibility(8);
        this.searchResultAdapter = new SearchResultAdapter(new ArrayList(), new SearchResultCategoryFragment$onViewCreated$1(this));
        ((NestedScrollView) _$_findCachedViewById(C5619R.C5622id.resultListScrollView)).setOnScrollChangeListener(new SearchResultCategoryFragment$onViewCreated$2(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.resultListView);
        SearchResultAdapter searchResultAdapter2 = this.searchResultAdapter;
        if (searchResultAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchResultAdapter");
        }
        recyclerView.setAdapter(searchResultAdapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        if (this.resultList.isEmpty()) {
            CharSequence charSequence = this.searchValue;
            if (charSequence == null || StringsKt.isBlank(charSequence)) {
                z = true;
            }
            if (!z) {
                checkDataCount();
            }
        } else {
            SearchResultAdapter searchResultAdapter3 = this.searchResultAdapter;
            if (searchResultAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchResultAdapter");
            }
            searchResultAdapter3.setItems(this.resultList);
            NestedScrollView nestedScrollView2 = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.resultListScrollView);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "resultListScrollView");
            nestedScrollView2.setVisibility(0);
        }
        getMarketViewModel().getSearchCategoryValueLiveData().observe(getViewLifecycleOwner(), new SearchResultCategoryFragment$onViewCreated$4(this));
    }

    /* access modifiers changed from: private */
    public final void handleSearchCategoryEvent(String str) {
        if (!StringsKt.isBlank(str)) {
            this.searchValue = str;
            this.currentPage = 1;
            clearResults();
            getMarketViewModel().getCategoryListLiveData().removeObserver(new SearchResultCategoryFragment$handleSearchCategoryEvent$1(this));
            loadData();
            getMarketViewModel().getCategoryListLiveData().observe(getViewLifecycleOwner(), new SearchResultCategoryFragment$handleSearchCategoryEvent$2(this));
        }
    }

    private final void clearResults() {
        this.resultList = new ArrayList();
        SearchResultAdapter searchResultAdapter2 = this.searchResultAdapter;
        if (searchResultAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchResultAdapter");
        }
        searchResultAdapter2.setItems(new ArrayList());
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.noResultsLayout);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "noResultsLayout");
        linearLayout.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void loadData() {
        if (this.categoryId != null) {
            toggleProgressVisibility(true);
            getMarketViewModel().searchCategoryList(this.currentPage, this.searchValue);
        }
    }

    private final void toggleProgressVisibility(boolean z) {
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
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        r0 = kotlin.collections.CollectionsKt.toMutableList(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleCategoryEvent(p035ru.unicorn.ujin.data.realm.Resource<p035ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData> r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0138
            ru.unicorn.ujin.data.realm.Resource$Status r0 = r7.getStatus()
            if (r0 != 0) goto L_0x000a
            goto L_0x0138
        L_0x000a:
            int[] r1 = p035ru.unicorn.ujin.market.search.SearchResultCategoryFragment.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            java.lang.String r1 = "null cannot be cast to non-null type ru.unicorn.ujin.market.search.SearchViewFragment"
            java.lang.String r2 = "resultListScrollView"
            r3 = 2
            r4 = 0
            r5 = 1
            if (r0 == r5) goto L_0x0061
            if (r0 == r3) goto L_0x0027
            r7 = 3
            if (r0 == r7) goto L_0x0022
            goto L_0x0138
        L_0x0022:
            r6.toggleProgressVisibility(r5)
            goto L_0x0138
        L_0x0027:
            r6.toggleProgressVisibility(r4)
            androidx.fragment.app.Fragment r0 = r6.getParentFragment()
            boolean r0 = r0 instanceof p035ru.unicorn.ujin.market.search.SearchViewFragment
            if (r0 == 0) goto L_0x0048
            int r0 = r6.currentPage
            if (r0 != r5) goto L_0x0048
            androidx.fragment.app.Fragment r0 = r6.getParentFragment()
            if (r0 == 0) goto L_0x0042
            ru.unicorn.ujin.market.search.SearchViewFragment r0 = (p035ru.unicorn.ujin.market.search.SearchViewFragment) r0
            r0.updateTabLayout(r3, r4)
            goto L_0x0048
        L_0x0042:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r1)
            throw r7
        L_0x0048:
            int r0 = p035ru.unicorn.C5619R.C5622id.resultListScrollView
            android.view.View r0 = r6._$_findCachedViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r0.setVisibility(r4)
            r6.isResultListLoaded = r5
            java.lang.String r7 = r7.getMessage()
            r6.showMessage((java.lang.String) r7)
            goto L_0x0138
        L_0x0061:
            r6.toggleProgressVisibility(r4)
            int r0 = p035ru.unicorn.C5619R.C5622id.resultListScrollView
            android.view.View r0 = r6._$_findCachedViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r0.setVisibility(r4)
            r6.isResultListLoaded = r5
            java.lang.Object r0 = r7.getData()
            ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData r0 = (p035ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData) r0
            io.realm.RealmList r0 = r0.getCategories()
            if (r0 == 0) goto L_0x008f
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)
            if (r0 == 0) goto L_0x008f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.filterNotNull(r0)
            goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            androidx.fragment.app.Fragment r2 = r6.getParentFragment()
            boolean r2 = r2 instanceof p035ru.unicorn.ujin.market.search.SearchViewFragment
            if (r2 == 0) goto L_0x00bc
            int r2 = r6.currentPage
            if (r2 != r5) goto L_0x00bc
            androidx.fragment.app.Fragment r2 = r6.getParentFragment()
            if (r2 == 0) goto L_0x00b6
            ru.unicorn.ujin.market.search.SearchViewFragment r2 = (p035ru.unicorn.ujin.market.search.SearchViewFragment) r2
            java.lang.Object r1 = r7.getData()
            ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData r1 = (p035ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData) r1
            ru.unicorn.ujin.data.realm.MetaData r1 = r1.getMeta()
            int r1 = r1.getTotal()
            r2.updateTabLayout(r3, r1)
            goto L_0x00bc
        L_0x00b6:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r1)
            throw r7
        L_0x00bc:
            if (r0 == 0) goto L_0x0135
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r2 = r1.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0135
            int r2 = r6.currentPage
            java.lang.String r3 = "searchResultAdapter"
            if (r2 != r5) goto L_0x0113
            java.lang.Object r7 = r7.getData()
            ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData r7 = (p035ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData) r7
            ru.unicorn.ujin.data.realm.MetaData r7 = r7.getMeta()
            int r7 = r7.getLastPage()
            r6.lastPage = r7
            int r7 = p035ru.unicorn.C5619R.C5622id.noResultsLayout
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            java.lang.String r0 = "noResultsLayout"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            r0 = 8
            r7.setVisibility(r0)
            int r7 = p035ru.unicorn.C5619R.C5622id.resultListView
            android.view.View r7 = r6._$_findCachedViewById(r7)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            java.lang.String r0 = "resultListView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            r7.setVisibility(r4)
            java.util.List r7 = kotlin.collections.CollectionsKt.toMutableList(r1)
            r6.resultList = r7
            ru.unicorn.ujin.market.search.SearchResultAdapter r7 = r6.searchResultAdapter
            if (r7 != 0) goto L_0x010d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x010d:
            java.util.List<ru.unicorn.ujin.market.search.SearchResultType> r0 = r6.resultList
            r7.setItems(r0)
            goto L_0x0135
        L_0x0113:
            java.util.List<ru.unicorn.ujin.market.search.SearchResultType> r7 = r6.resultList
            r7.addAll(r1)
            java.util.Iterator r7 = r0.iterator()
        L_0x011c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r7.next()
            ru.unicorn.ujin.data.realm.marketplace.Category r0 = (p035ru.unicorn.ujin.data.realm.marketplace.Category) r0
            ru.unicorn.ujin.market.search.SearchResultAdapter r1 = r6.searchResultAdapter
            if (r1 != 0) goto L_0x012f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x012f:
            ru.unicorn.ujin.market.search.SearchResultType r0 = (p035ru.unicorn.ujin.market.search.SearchResultType) r0
            r1.addItem(r0)
            goto L_0x011c
        L_0x0135:
            r6.checkDataCount()
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.search.SearchResultCategoryFragment.handleCategoryEvent(ru.unicorn.ujin.data.realm.Resource):void");
    }

    private final void checkDataCount() {
        if (this.isResultListLoaded) {
            SearchResultAdapter searchResultAdapter2 = this.searchResultAdapter;
            if (searchResultAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchResultAdapter");
            }
            if (searchResultAdapter2.getData().isEmpty()) {
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.noResultsLayout);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "noResultsLayout");
                linearLayout.setVisibility(0);
            }
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/market/search/SearchResultCategoryFragment$Companion;", "", "()V", "PARENT_ID", "", "newInstance", "Lru/unicorn/ujin/market/search/SearchResultCategoryFragment;", "id", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.search.SearchResultCategoryFragment$Companion */
    /* compiled from: SearchResultCategoryFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SearchResultCategoryFragment newInstance(String str) {
            SearchResultCategoryFragment searchResultCategoryFragment = new SearchResultCategoryFragment();
            if (str == null) {
                str = "0";
            }
            searchResultCategoryFragment.categoryId = str;
            return searchResultCategoryFragment;
        }
    }
}
