package p035ru.unicorn.ujin.market;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse;
import p035ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData;
import p035ru.unicorn.ujin.data.api.response.marketplace.CouponListResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.data.realm.marketplace.Coupon;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.util.Flavors;
import p035ru.unicorn.ujin.view.adapters.marketplace.CategoriesAdapter;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.market.CompanyEvent;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 22\u00020\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0018\u0010\u0019\u001a\u00020\u00172\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u00172\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001bH\u0002J\u0018\u0010\u001f\u001a\u00020\u00172\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\u0015H\u0014J$\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00100\u001a\u00020\u0017H\u0014J\b\u00101\u001a\u00020\u0017H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, mo51343d2 = {"Lru/unicorn/ujin/market/MarketFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "allCategoryList", "", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "categories", "categoriesAdapter", "Lru/unicorn/ujin/view/adapters/marketplace/CategoriesAdapter;", "couponList", "", "Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "currentPage", "", "isCategoryListLoaded", "", "isCompanyLoaded", "isCouponListLoaded", "lastPage", "ujinCategory", "ujinCompanyId", "", "checkCategoryCount", "", "checkDataLoading", "handleCartEvent", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CartResponse;", "handleCouponEvent", "Lru/unicorn/ujin/data/api/response/marketplace/CouponListResponseData;", "handleEvent", "Lru/unicorn/ujin/data/api/response/marketplace/CategoryListResponseData;", "event", "Lru/unicorn/ujin/viewModel/events/market/CompanyEvent;", "initCart", "loadCategoryList", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showImageToolbar", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.MarketFragment */
/* compiled from: MarketFragment.kt */
public final class MarketFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private List<Category> allCategoryList = new ArrayList();
    private List<Category> categories = new ArrayList();
    /* access modifiers changed from: private */
    public CategoriesAdapter categoriesAdapter;
    private List<? extends Coupon> couponList = CollectionsKt.emptyList();
    /* access modifiers changed from: private */
    public int currentPage = 1;
    /* access modifiers changed from: private */
    public boolean isCategoryListLoaded;
    /* access modifiers changed from: private */
    public boolean isCompanyLoaded = true;
    /* access modifiers changed from: private */
    public boolean isCouponListLoaded;
    /* access modifiers changed from: private */
    public int lastPage = 1;
    private Category ujinCategory;
    private String ujinCompanyId;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.MarketFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$2 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 3;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.LOADING.ordinal()] = 3;
            $EnumSwitchMapping$2[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$2[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$2[Resource.Status.LOADING.ordinal()] = 3;
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

    public static final /* synthetic */ CategoriesAdapter access$getCategoriesAdapter$p(MarketFragment marketFragment) {
        CategoriesAdapter categoriesAdapter2 = marketFragment.categoriesAdapter;
        if (categoriesAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoriesAdapter");
        }
        return categoriesAdapter2;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        showImageToolbar();
        if (Intrinsics.areEqual((Object) "kortros", (Object) Flavors.PASS)) {
            getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        } else if (!Intrinsics.areEqual((Object) "kortros", (Object) Flavors.MORIONDIGITAL)) {
            getBaseActivity().setToolbarLeft(ToolbarButtons.PROFILE);
        }
        initCart();
        getBaseActivity().showBottomNavigation();
    }

    /* access modifiers changed from: protected */
    public void showImageToolbar() {
        if (Flavor.Companion.isCurrent(Flavor.SMARTDOMRU)) {
            getBaseActivity().setTextTitle(getResources().getString(R.string.marketplace));
        } else if (Flavor.Companion.isCurrent(Flavor.PASS)) {
            getBaseActivity().setTextTitle(getResources().getString(R.string.marketplace));
        } else {
            getBaseActivity().showImageLogo();
        }
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        String string = getString(R.string.metricsMarketplaceFragment);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.metricsMarketplaceFragment)");
        return string;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_market_categories, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…gories, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getBaseActivity().profileViewModel.loadSplashscreen();
        getBaseActivity().openMarketFromReact = false;
        getMarketViewModel().getCart();
        getMarketViewModel().getCartItemListLiveData().observe(getViewLifecycleOwner(), new MarketFragment$onViewCreated$1(this));
        ((TextView) _$_findCachedViewById(C5619R.C5622id.noCategoriesTextViewToChat)).setOnClickListener(new MarketFragment$onViewCreated$2(this));
        this.categoriesAdapter = new CategoriesAdapter(this.categories);
        CategoriesAdapter categoriesAdapter2 = this.categoriesAdapter;
        if (categoriesAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoriesAdapter");
        }
        categoriesAdapter2.setShowCategory(new MarketFragment$onViewCreated$3(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.categoriesView);
        int hashCode = "kortros".hashCode();
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        CategoriesAdapter categoriesAdapter3 = this.categoriesAdapter;
        if (categoriesAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("categoriesAdapter");
        }
        recyclerView.setAdapter(categoriesAdapter3);
        ((NestedScrollView) _$_findCachedViewById(C5619R.C5622id.categoriesScrollView)).setOnScrollChangeListener(new MarketFragment$onViewCreated$5(this));
        if (getBaseActivity().openMarketFromReact) {
            this.isCompanyLoaded = false;
            getMarketViewModel().loadCompanyDetails(CollectionsKt.listOf(MarketBaseFragment.UJIN_COMPANY_ID));
            getMarketViewModel().getCompanyLiveData().observe(getViewLifecycleOwner(), new MarketFragment$onViewCreated$6(this));
        }
        if (!this.allCategoryList.isEmpty() || !this.couponList.isEmpty()) {
            if (!this.allCategoryList.isEmpty()) {
                CategoriesAdapter categoriesAdapter4 = this.categoriesAdapter;
                if (categoriesAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("categoriesAdapter");
                }
                categoriesAdapter4.setItems(this.allCategoryList);
                NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.categoriesScrollView);
                Intrinsics.checkNotNullExpressionValue(nestedScrollView, "categoriesScrollView");
                nestedScrollView.setVisibility(0);
            }
            if (!this.couponList.isEmpty()) {
                View _$_findCachedViewById = _$_findCachedViewById(C5619R.C5622id.specCategoryLayout);
                _$_findCachedViewById.setVisibility(0);
                _$_findCachedViewById.setOnClickListener(new MarketFragment$onViewCreated$$inlined$apply$lambda$1(this));
                return;
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(C5619R.C5622id.specCategoryLayout);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "specCategoryLayout");
            _$_findCachedViewById2.setVisibility(8);
            return;
        }
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(0);
        loadCategoryList();
        getMarketViewModel().getCategoryListLiveData().observe(getViewLifecycleOwner(), new MarketFragment$onViewCreated$7(this));
        getMarketViewModel().loadCouponList();
        getMarketViewModel().getCouponListLiveData().observe(getViewLifecycleOwner(), new MarketFragment$onViewCreated$8(this));
        getMarketViewModel().loadTagList();
    }

    /* access modifiers changed from: private */
    public final void handleCartEvent(Resource<CartResponse> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                initCart();
            } else if (i == 2) {
                initCart();
            }
        }
    }

    private final void initCart() {
        if (getBaseActivity().profileViewModel.getDemoStage() == 0) {
            getBaseActivity().setToolbarRight(initRightButtonList(true));
        }
    }

    /* access modifiers changed from: private */
    public final void loadCategoryList() {
        this.isCategoryListLoaded = false;
        getMarketViewModel().loadCategoryList(this.currentPage, (String) null, (String) null);
    }

    /* access modifiers changed from: private */
    public final void handleEvent(Resource<CategoryListResponseData> resource) {
        Resource.Status status;
        List<Category> list;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            boolean z = false;
            if (i == 1) {
                this.isCategoryListLoaded = true;
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(4);
                RealmList<Category> categories2 = resource.getData().getCategories();
                if (categories2 == null || (list = CollectionsKt.toMutableList(categories2)) == null) {
                    list = new ArrayList<>();
                }
                this.categories = list;
                this.allCategoryList.addAll(this.categories);
                this.lastPage = resource.getData().getMeta().getLastPage();
                String message = resource.getMessage();
                Intrinsics.checkNotNullExpressionValue(message, "resource.message");
                if (message.length() > 0) {
                    z = true;
                }
                if (z) {
                    TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.noCategoriesTextView);
                    Intrinsics.checkNotNullExpressionValue(textView, "noCategoriesTextView");
                    textView.setText(resource.getMessage());
                }
                checkDataLoading();
                checkCategoryCount();
            } else if (i == 2) {
                this.isCategoryListLoaded = true;
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(4);
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                MaterialDialog.negativeButton$default(MaterialDialog.positiveButton$default(MaterialDialog.message$default(new MaterialDialog(requireContext, (DialogBehavior) null, 2, (DefaultConstructorMarker) null).cancelOnTouchOutside(false), Integer.valueOf(R.string.error_getting_data), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.button_repeat), (CharSequence) null, new MarketFragment$handleEvent$$inlined$let$lambda$1(this, resource), 2, (Object) null), Integer.valueOf(R.string.cancel_label), (CharSequence) null, MarketFragment$handleEvent$1$2.INSTANCE, 2, (Object) null).show();
                checkDataLoading();
                checkCategoryCount();
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                progressBar3.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handleEvent(CompanyEvent companyEvent) {
        String str;
        Object obj;
        if (companyEvent.getSuccess()) {
            Iterator it = companyEvent.getCompanyList().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((Company) obj).getId(), (Object) MarketBaseFragment.UJIN_COMPANY_ID)) {
                    break;
                }
            }
            Company company = (Company) obj;
            if (company != null) {
                str = company.getId();
            }
            this.ujinCompanyId = str;
            if (this.ujinCompanyId == null) {
                getBaseActivity().openMarketFromReact = false;
            }
        }
        this.isCompanyLoaded = true;
        checkDataLoading();
        checkCategoryCount();
    }

    /* access modifiers changed from: private */
    public final void handleCouponEvent(Resource<CouponListResponseData> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$2[status.ordinal()];
            if (i == 1) {
                this.isCouponListLoaded = true;
                this.couponList = resource.getData().getCoupons();
                checkDataLoading();
                checkCategoryCount();
            } else if (i == 2) {
                this.isCouponListLoaded = true;
                checkDataLoading();
                checkCategoryCount();
            }
        }
    }

    private final void checkCategoryCount() {
        if (this.isCouponListLoaded && this.isCategoryListLoaded && !getBaseActivity().openMarketFromReact) {
            CategoriesAdapter categoriesAdapter2 = this.categoriesAdapter;
            if (categoriesAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("categoriesAdapter");
            }
            if (categoriesAdapter2.getData().isEmpty() && this.couponList.isEmpty()) {
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.noCategoriesTextView);
                Intrinsics.checkNotNullExpressionValue(textView, "noCategoriesTextView");
                textView.setVisibility(0);
                TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.noCategoriesTextViewToChat);
                Intrinsics.checkNotNullExpressionValue(textView2, "noCategoriesTextViewToChat");
                textView2.setVisibility(0);
            }
        }
    }

    private final void checkDataLoading() {
        if (this.isCategoryListLoaded && this.isCouponListLoaded && this.isCompanyLoaded) {
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            progressBar.setVisibility(8);
            if (!this.couponList.isEmpty()) {
                View _$_findCachedViewById = _$_findCachedViewById(C5619R.C5622id.specCategoryLayout);
                _$_findCachedViewById.setVisibility(0);
                _$_findCachedViewById.setOnClickListener(new MarketFragment$checkDataLoading$$inlined$apply$lambda$1(this));
            } else {
                View _$_findCachedViewById2 = _$_findCachedViewById(C5619R.C5622id.specCategoryLayout);
                Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "specCategoryLayout");
                _$_findCachedViewById2.setVisibility(8);
            }
            if (!(!this.categories.isEmpty())) {
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.categoriesView);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "categoriesView");
                recyclerView.setVisibility(8);
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.noCategoriesTextView);
                Intrinsics.checkNotNullExpressionValue(textView, "noCategoriesTextView");
                textView.setVisibility(0);
                TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.noCategoriesTextViewToChat);
                Intrinsics.checkNotNullExpressionValue(textView2, "noCategoriesTextViewToChat");
                textView2.setVisibility(0);
            } else if (this.currentPage == 1) {
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.categoriesView);
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "categoriesView");
                recyclerView2.setVisibility(0);
                TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.noCategoriesTextView);
                Intrinsics.checkNotNullExpressionValue(textView3, "noCategoriesTextView");
                textView3.setVisibility(8);
                TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.noCategoriesTextViewToChat);
                Intrinsics.checkNotNullExpressionValue(textView4, "noCategoriesTextViewToChat");
                textView4.setVisibility(8);
                CategoriesAdapter categoriesAdapter2 = this.categoriesAdapter;
                if (categoriesAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("categoriesAdapter");
                }
                categoriesAdapter2.setItems(this.categories);
            } else {
                for (Category next : this.categories) {
                    CategoriesAdapter categoriesAdapter3 = this.categoriesAdapter;
                    if (categoriesAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("categoriesAdapter");
                    }
                    categoriesAdapter3.addItem(next);
                }
            }
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/market/MarketFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/market/MarketFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.MarketFragment$Companion */
    /* compiled from: MarketFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MarketFragment newInstance() {
            return new MarketFragment();
        }
    }
}
