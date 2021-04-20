package p035ru.unicorn.ujin.market.category;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.market.company.CompanyListFragment;
import p035ru.unicorn.ujin.market.offer.OfferListFragment;
import p035ru.unicorn.ujin.metrics.MetricsFacade;
import p035ru.unicorn.ujin.metrics.MetricsKeys;
import p035ru.unicorn.ujin.util.TextUtils;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002J\u0006\u0010\u001f\u001a\u00020\u001bJ\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\nH\u0014J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001a\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010.\u001a\u00020\u001bH\u0002J\u0016\u0010.\u001a\u00020\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u00100\u001a\u00020\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0006\u00101\u001a\u00020\u001bJ\b\u00102\u001a\u00020\u001bH\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u00064"}, mo51343d2 = {"Lru/unicorn/ujin/market/category/CategoryFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "allSubCategoryList", "", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "currentPage", "", "decCategories", "", "", "[Ljava/lang/String;", "event", "hasOffers", "", "Ljava/lang/Boolean;", "isCategoryListLoaded", "isOfferListLoaded", "lastPage", "needLoadMore", "parentCategoryId", "parentCategoryTitle", "subCategories", "subCategoryListAdapter", "Lru/unicorn/ujin/market/category/SubCategoryListAdapter;", "totalCount", "handleEvent", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CategoryListResponseData;", "hideTabs", "initCategoryList", "initTabs", "loadCategoryList", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showSubCategoryList", "subCategoryList", "showSubCategoryListMore", "showTabs", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.category.CategoryFragment */
/* compiled from: CategoryFragment.kt */
public final class CategoryFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private List<Category> allSubCategoryList = new ArrayList();
    /* access modifiers changed from: private */
    public int currentPage = 1;
    private final String[] decCategories = {"категорию", "категории", "категорий"};
    /* access modifiers changed from: private */
    public String event = "";
    private Boolean hasOffers;
    /* access modifiers changed from: private */
    public boolean isCategoryListLoaded;
    private boolean isOfferListLoaded;
    /* access modifiers changed from: private */
    public int lastPage = 1;
    /* access modifiers changed from: private */
    public boolean needLoadMore;
    /* access modifiers changed from: private */
    public String parentCategoryId;
    /* access modifiers changed from: private */
    public String parentCategoryTitle;
    private List<Category> subCategories = new ArrayList();
    /* access modifiers changed from: private */
    public SubCategoryListAdapter subCategoryListAdapter;
    private int totalCount;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.category.CategoryFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Flavor.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Flavor.PASS.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.LOADING.ordinal()] = 3;
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

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ SubCategoryListAdapter access$getSubCategoryListAdapter$p(CategoryFragment categoryFragment) {
        SubCategoryListAdapter subCategoryListAdapter2 = categoryFragment.subCategoryListAdapter;
        if (subCategoryListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subCategoryListAdapter");
        }
        return subCategoryListAdapter2;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(this.parentCategoryTitle);
        getBaseActivity().setToolbarRight(initRightButtonList(true, false, this.parentCategoryId));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        if (!StringsKt.isBlank(this.event)) {
            MetricsFacade.Companion companion = MetricsFacade.Companion;
            String value = MetricsKeys.market.getValue();
            HashMap hashMap = new HashMap();
            String str = this.event;
            String str2 = this.parentCategoryTitle;
            if (str2 == null) {
                str2 = MetricsKeys.error.getValue();
            }
            hashMap.put(str, str2);
            Unit unit = Unit.INSTANCE;
            companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
        }
        if (getBaseActivity().openMarketFromReact) {
            getBaseActivity().openMarketFromReact = false;
            showOfferListFragment(MarketBaseFragment.UJIN_COMPANY_ID, "company", MetricsKeys.companyProducts.getValue());
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_category, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…tegory, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Flavor flavor = getBaseActivity().flavor;
        if (flavor != null && WhenMappings.$EnumSwitchMapping$0[flavor.ordinal()] == 1) {
            CardView cardView = (CardView) _$_findCachedViewById(C5619R.C5622id.bannerLayout);
            Intrinsics.checkNotNullExpressionValue(cardView, "bannerLayout");
            cardView.setVisibility(0);
        } else {
            CardView cardView2 = (CardView) _$_findCachedViewById(C5619R.C5622id.bannerLayout);
            Intrinsics.checkNotNullExpressionValue(cardView2, "bannerLayout");
            cardView2.setVisibility(8);
        }
        ((NestedScrollView) _$_findCachedViewById(C5619R.C5622id.categoryListScrollView)).setOnScrollChangeListener(new CategoryFragment$onViewCreated$1(this));
        ((AppBarLayout) _$_findCachedViewById(C5619R.C5622id.appBarLayout)).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new CategoryFragment$onViewCreated$2(this));
        initTabs();
        if (Intrinsics.areEqual((Object) this.hasOffers, (Object) true)) {
            TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout);
            Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
            tabLayout.setVisibility(0);
            initCategoryList();
            return;
        }
        TabLayout tabLayout2 = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout);
        Intrinsics.checkNotNullExpressionValue(tabLayout2, "tabLayout");
        tabLayout2.setVisibility(8);
        initCategoryList();
    }

    private final void initCategoryList() {
        if (!this.allSubCategoryList.isEmpty()) {
            showSubCategoryList(this.subCategories);
            if (Intrinsics.areEqual((Object) this.hasOffers, (Object) true)) {
                ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.viewPager);
                Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
                viewPager.setVisibility(0);
                TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout);
                Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
                tabLayout.setVisibility(0);
                return;
            }
            ViewPager viewPager2 = (ViewPager) _$_findCachedViewById(C5619R.C5622id.viewPager);
            Intrinsics.checkNotNullExpressionValue(viewPager2, "viewPager");
            viewPager2.setVisibility(8);
            TabLayout tabLayout2 = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout);
            Intrinsics.checkNotNullExpressionValue(tabLayout2, "tabLayout");
            tabLayout2.setVisibility(8);
            return;
        }
        loadCategoryList();
        getMarketViewModel().getCategoryListLiveData().observe(getViewLifecycleOwner(), new CategoryFragment$initCategoryList$1(this));
    }

    private final void showSubCategoryList() {
        if (this.isCategoryListLoaded && this.isOfferListLoaded) {
            if (this.currentPage == 1) {
                showSubCategoryList(this.subCategories);
                if (Intrinsics.areEqual((Object) this.hasOffers, (Object) true)) {
                    ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.viewPager);
                    Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
                    viewPager.setVisibility(0);
                    TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout);
                    Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
                    tabLayout.setVisibility(0);
                    return;
                }
                ViewPager viewPager2 = (ViewPager) _$_findCachedViewById(C5619R.C5622id.viewPager);
                Intrinsics.checkNotNullExpressionValue(viewPager2, "viewPager");
                viewPager2.setVisibility(8);
                TabLayout tabLayout2 = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout);
                Intrinsics.checkNotNullExpressionValue(tabLayout2, "tabLayout");
                tabLayout2.setVisibility(8);
                return;
            }
            showSubCategoryListMore(this.subCategories);
        }
    }

    public final void hideTabs() {
        if (!this.isOfferListLoaded) {
            ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.viewPager);
            Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
            viewPager.setVisibility(8);
            TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout);
            Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
            tabLayout.setVisibility(8);
            this.hasOffers = false;
            this.isOfferListLoaded = true;
            showSubCategoryList();
        }
    }

    public final void showTabs() {
        if (!this.isOfferListLoaded) {
            ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.viewPager);
            Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
            viewPager.setVisibility(8);
            TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout);
            Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
            tabLayout.setVisibility(8);
            this.hasOffers = true;
            this.isOfferListLoaded = true;
            showSubCategoryList();
        }
    }

    /* access modifiers changed from: private */
    public final void handleEvent(Resource<CategoryListResponseData> resource) {
        Resource.Status status;
        List<Category> list;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            if (i == 1) {
                this.isCategoryListLoaded = true;
                RealmList<Category> categories = resource.getData().getCategories();
                if (categories == null || (list = CollectionsKt.toMutableList(categories)) == null) {
                    list = new ArrayList<>();
                }
                this.subCategories = list;
                this.allSubCategoryList.addAll(this.subCategories);
                this.lastPage = resource.getData().getMeta().getLastPage();
                this.totalCount = resource.getData().getMeta().getTotal();
                showSubCategoryList();
            } else if (i == 2) {
                this.isCategoryListLoaded = true;
            } else if (i == 3) {
                this.isCategoryListLoaded = false;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void loadCategoryList() {
        getMarketViewModel().loadCategoryList(this.currentPage, this.parentCategoryId, (String) null);
    }

    private final void initTabs() {
        List listOf = CollectionsKt.listOf(OfferListFragment.Companion.newInstance(this.parentCategoryId, OfferListFragment.CATEGORY_TYPE, ""), CompanyListFragment.Companion.newInstance(this.parentCategoryId));
        List listOf2 = CollectionsKt.listOf(getResources().getString(R.string.offers_and_services), getResources().getString(R.string.companies));
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.viewPager);
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        viewPager.setAdapter(new ViewPagerAdapter(childFragmentManager, listOf, listOf2));
        ((TabLayout) _$_findCachedViewById(C5619R.C5622id.tabLayout)).setupWithViewPager((ViewPager) _$_findCachedViewById(C5619R.C5622id.viewPager), true);
    }

    private final void showSubCategoryList(List<Category> list) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (!list.isEmpty()) {
            this.subCategoryListAdapter = new SubCategoryListAdapter(new ArrayList(), new CategoryFragment$showSubCategoryList$1(this));
            String decOfNumber = TextUtils.decOfNumber(this.totalCount, this.decCategories);
            Boolean bool = this.hasOffers;
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvSubCategoryList);
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                SubCategoryListAdapter subCategoryListAdapter2 = this.subCategoryListAdapter;
                if (subCategoryListAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subCategoryListAdapter");
                }
                recyclerView.setAdapter(subCategoryListAdapter2);
                recyclerView.setVisibility(0);
                if (this.totalCount > 5 && !this.needLoadMore) {
                    DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnLoadAll);
                    if (Intrinsics.areEqual((Object) decOfNumber, (Object) this.decCategories[0])) {
                        Resources resources = dynamicBackgroundButton.getResources();
                        charSequence2 = resources.getString(R.string.show_sub_categories, new Object[]{this.totalCount + ' ' + decOfNumber});
                    } else {
                        Resources resources2 = dynamicBackgroundButton.getResources();
                        charSequence2 = resources2.getString(R.string.show_all_sub_categories, new Object[]{this.totalCount + ' ' + decOfNumber});
                    }
                    dynamicBackgroundButton.setText(charSequence2);
                    dynamicBackgroundButton.setVisibility(0);
                    dynamicBackgroundButton.setOnClickListener(new CategoryFragment$showSubCategoryList$$inlined$apply$lambda$1(this, decOfNumber, list));
                }
            } else if (Intrinsics.areEqual((Object) bool, (Object) false)) {
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvSubCategoryList2);
                recyclerView2.setVisibility(0);
                SubCategoryListAdapter subCategoryListAdapter3 = this.subCategoryListAdapter;
                if (subCategoryListAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subCategoryListAdapter");
                }
                recyclerView2.setAdapter(subCategoryListAdapter3);
                recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
                if (this.totalCount > 5 && !this.needLoadMore) {
                    DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnLoadAll2);
                    if (Intrinsics.areEqual((Object) decOfNumber, (Object) this.decCategories[0])) {
                        Resources resources3 = dynamicBackgroundButton2.getResources();
                        charSequence = resources3.getString(R.string.show_sub_categories, new Object[]{this.totalCount + ' ' + decOfNumber});
                    } else {
                        Resources resources4 = dynamicBackgroundButton2.getResources();
                        charSequence = resources4.getString(R.string.show_all_sub_categories, new Object[]{this.totalCount + ' ' + decOfNumber});
                    }
                    dynamicBackgroundButton2.setText(charSequence);
                    dynamicBackgroundButton2.setVisibility(0);
                    dynamicBackgroundButton2.setOnClickListener(new CategoryFragment$showSubCategoryList$$inlined$apply$lambda$2(this, decOfNumber, list));
                }
            }
            if (this.totalCount <= 5 || this.needLoadMore) {
                SubCategoryListAdapter subCategoryListAdapter4 = this.subCategoryListAdapter;
                if (subCategoryListAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subCategoryListAdapter");
                }
                subCategoryListAdapter4.setItems(list);
                return;
            }
            for (int i = 0; i < 5; i++) {
                SubCategoryListAdapter subCategoryListAdapter5 = this.subCategoryListAdapter;
                if (subCategoryListAdapter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subCategoryListAdapter");
                }
                subCategoryListAdapter5.addItem(list.get(i));
            }
            return;
        }
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvSubCategoryList);
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "rvSubCategoryList");
        recyclerView3.setVisibility(8);
        DynamicBackgroundButton dynamicBackgroundButton3 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnLoadAll);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton3, "btnLoadAll");
        dynamicBackgroundButton3.setVisibility(8);
        RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvSubCategoryList2);
        Intrinsics.checkNotNullExpressionValue(recyclerView4, "rvSubCategoryList2");
        recyclerView4.setVisibility(8);
        DynamicBackgroundButton dynamicBackgroundButton4 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnLoadAll2);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton4, "btnLoadAll2");
        dynamicBackgroundButton4.setVisibility(8);
    }

    private final void showSubCategoryListMore(List<Category> list) {
        for (Category next : list) {
            SubCategoryListAdapter subCategoryListAdapter2 = this.subCategoryListAdapter;
            if (subCategoryListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subCategoryListAdapter");
            }
            subCategoryListAdapter2.addItem(next);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/market/category/CategoryFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/market/category/CategoryFragment;", "id", "", "title", "event", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.category.CategoryFragment$Companion */
    /* compiled from: CategoryFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CategoryFragment newInstance(String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str3, "event");
            CategoryFragment categoryFragment = new CategoryFragment();
            categoryFragment.parentCategoryId = str;
            categoryFragment.parentCategoryTitle = str2;
            categoryFragment.event = str3;
            return categoryFragment;
        }
    }
}
