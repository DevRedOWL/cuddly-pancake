package p035ru.unicorn.ujin.market.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.market.offer.OfferListFragment;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002&'B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0005H\u0014J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000fH\u0016J\u001a\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u001f\u001a\u00020\bH\u0002J\b\u0010 \u001a\u00020\bH\u0002J\b\u0010!\u001a\u00020\bH\u0014J\u0016\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, mo51343d2 = {"Lru/unicorn/ujin/market/search/SearchViewFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "()V", "categoryId", "", "queryText", "hideResultsView", "", "hideSearchHint", "initSearchView", "initTabs", "metricsScreenName", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onQueryTextChange", "", "newText", "onQueryTextSubmit", "query", "onSaveInstanceState", "outState", "onViewCreated", "view", "showResultsView", "showSearchHint", "showToolbar", "updateTabLayout", "position", "", "count", "Companion", "SearchViewPagerAdapter", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.search.SearchViewFragment */
/* compiled from: SearchViewFragment.kt */
public final class SearchViewFragment extends MarketBaseFragment implements SearchView.OnQueryTextListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String SEARCH_QUERY = "searchQuery";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public String categoryId;
    private String queryText = "";

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

    public boolean onQueryTextSubmit(String str) {
        return false;
    }

    public boolean onQueryTextChange(String str) {
        this.queryText = str;
        String str2 = this.queryText;
        if (str2 == null || Intrinsics.compare(str2.length(), 2) != 1) {
            hideResultsView();
            showSearchHint();
            return false;
        }
        getMarketViewModel().getSearchOfferValueLiveData().postValue(this.queryText);
        getMarketViewModel().getSearchCompanyValueLiveData().postValue(this.queryText);
        getMarketViewModel().getSearchCategoryValueLiveData().postValue(this.queryText);
        hideSearchHint();
        showResultsView();
        return false;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarRight(initRightButtonList(false));
        getBaseActivity().setCenterLayout(initCenterLayout());
        initSearchView();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.queryText = bundle != null ? bundle.getString("searchQuery") : null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_market_search_view, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…h_view, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initTabs();
    }

    private final void initTabs() {
        List listOf = CollectionsKt.listOf(OfferListFragment.Companion.newInstance(this.categoryId, "search", ""), SearchResultCompanyFragment.Companion.newInstance(this.categoryId), SearchResultCategoryFragment.Companion.newInstance(this.categoryId));
        List listOf2 = CollectionsKt.listOf(getResources().getString(R.string.search_offers_title), getResources().getString(R.string.search_companies_title), getResources().getString(R.string.search_categories_title));
        ViewPager2 viewPager2 = (ViewPager2) _$_findCachedViewById(C5619R.C5622id.viewPager);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        viewPager2.setAdapter(new SearchViewPagerAdapter(this, childFragmentManager, listOf));
        viewPager2.setOffscreenPageLimit(listOf.size());
        new TabLayoutMediator((TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout), (ViewPager2) _$_findCachedViewById(C5619R.C5622id.viewPager), new SearchViewFragment$initTabs$2(listOf2)).attach();
    }

    public final void updateTabLayout(int i, int i2) {
        String str;
        TabLayout.Tab tabAt;
        CharSequence charSequence;
        TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout);
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        if (tabLayout.getTabCount() > i && (str = this.queryText) != null && Intrinsics.compare(str.length(), 2) == 1 && (tabAt = ((TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout)).getTabAt(i)) != null) {
            if (i == 0) {
                charSequence = getResources().getString(R.string.search_offers_count_title, new Object[]{Integer.valueOf(i2)});
            } else if (i != 1) {
                charSequence = getResources().getString(R.string.search_categories_count_title, new Object[]{Integer.valueOf(i2)});
            } else {
                charSequence = getResources().getString(R.string.search_companies_count_title, new Object[]{Integer.valueOf(i2)});
            }
            tabAt.setText(charSequence);
        }
    }

    private final void initSearchView() {
        SearchView searchView = getSearchView();
        if (searchView != null) {
            searchView.setIconified(false);
        }
        SearchView searchView2 = getSearchView();
        if (searchView2 != null) {
            searchView2.setOnQueryTextFocusChangeListener(new SearchViewFragment$initSearchView$1(this));
        }
        SearchView searchView3 = getSearchView();
        if (searchView3 != null) {
            searchView3.requestFocus();
        }
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            baseActivity.hideBottomNavigation();
        }
        SearchView searchView4 = getSearchView();
        if (searchView4 != null) {
            searchView4.setOnQueryTextListener(this);
        }
        SearchView searchView5 = getSearchView();
        if (searchView5 != null) {
            searchView5.setQuery(this.queryText, true);
        }
    }

    private final void showSearchHint() {
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvHintMessage);
        Intrinsics.checkNotNullExpressionValue(textView, "tvHintMessage");
        textView.setVisibility(0);
    }

    private final void hideSearchHint() {
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvHintMessage);
        Intrinsics.checkNotNullExpressionValue(textView, "tvHintMessage");
        textView.setVisibility(8);
    }

    private final void showResultsView() {
        ViewPager2 viewPager2 = (ViewPager2) _$_findCachedViewById(C5619R.C5622id.viewPager);
        Intrinsics.checkNotNullExpressionValue(viewPager2, "viewPager");
        viewPager2.setVisibility(0);
        TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout);
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        tabLayout.setVisibility(0);
    }

    private final void hideResultsView() {
        ViewPager2 viewPager2 = (ViewPager2) _$_findCachedViewById(C5619R.C5622id.viewPager);
        Intrinsics.checkNotNullExpressionValue(viewPager2, "viewPager");
        viewPager2.setVisibility(8);
        TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout);
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        tabLayout.setVisibility(8);
    }

    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        SearchView searchView = getSearchView();
        bundle.putString("searchQuery", String.valueOf(searchView != null ? searchView.getQuery() : null));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/market/search/SearchViewFragment$SearchViewPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "fragments", "", "Landroidx/fragment/app/Fragment;", "(Lru/unicorn/ujin/market/search/SearchViewFragment;Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "getFragments", "()Ljava/util/List;", "setFragments", "(Ljava/util/List;)V", "createFragment", "position", "", "getItemCount", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.search.SearchViewFragment$SearchViewPagerAdapter */
    /* compiled from: SearchViewFragment.kt */
    public final class SearchViewPagerAdapter extends FragmentStateAdapter {
        private List<? extends Fragment> fragments;
        final /* synthetic */ SearchViewFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SearchViewPagerAdapter(SearchViewFragment searchViewFragment, FragmentManager fragmentManager, List<? extends Fragment> list) {
            super(fragmentManager, searchViewFragment.getLifecycle());
            Intrinsics.checkNotNullParameter(fragmentManager, "fm");
            Intrinsics.checkNotNullParameter(list, "fragments");
            this.this$0 = searchViewFragment;
            this.fragments = list;
        }

        public final List<Fragment> getFragments() {
            return this.fragments;
        }

        public final void setFragments(List<? extends Fragment> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.fragments = list;
        }

        public int getItemCount() {
            return this.fragments.size();
        }

        public Fragment createFragment(int i) {
            return (Fragment) this.fragments.get(i);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/market/search/SearchViewFragment$Companion;", "", "()V", "SEARCH_QUERY", "", "newInstance", "Lru/unicorn/ujin/market/search/SearchViewFragment;", "categoryId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.search.SearchViewFragment$Companion */
    /* compiled from: SearchViewFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SearchViewFragment newInstance(String str) {
            SearchViewFragment searchViewFragment = new SearchViewFragment();
            searchViewFragment.categoryId = str;
            return searchViewFragment;
        }
    }
}
