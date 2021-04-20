package p035ru.unicorn.ujin.market.offer;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
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
import p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse;
import p035ru.unicorn.ujin.data.api.response.marketplace.OfferListResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.market.category.CategoryFragment;
import p035ru.unicorn.ujin.market.search.SearchViewFragment;
import p035ru.unicorn.ujin.metrics.MetricsFacade;
import p035ru.unicorn.ujin.metrics.MetricsKeys;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.market.CompanyEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0016\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0018\u0010\u001c\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0014J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010*\u001a\u00020\u0014H\u0014J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/OfferListFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "companyTitle", "", "currentPage", "", "event", "isOfferListLoaded", "", "lastPage", "offerList", "", "Lru/unicorn/ujin/data/realm/marketplace/Offer;", "offerListAdapter", "Lru/unicorn/ujin/market/offer/OfferListAdapter;", "parentId", "parentType", "searchValue", "checkOffersCount", "", "clearOffers", "handleEvent", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/OfferListResponseData;", "Lru/unicorn/ujin/viewModel/events/market/CompanyEvent;", "handleSearchEvent", "handleSetCartEvent", "Lru/unicorn/ujin/data/api/response/marketplace/CartResponse;", "loadOfferList", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "toggleProgressVisibility", "isLoading", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferListFragment */
/* compiled from: OfferListFragment.kt */
public final class OfferListFragment extends MarketBaseFragment {
    public static final String CATEGORY_TYPE = "category";
    public static final String COMPANY_TYPE = "company";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String SEARCH_TYPE = "search";
    private HashMap _$_findViewCache;
    private String companyTitle = "";
    /* access modifiers changed from: private */
    public int currentPage = 1;
    /* access modifiers changed from: private */
    public String event = "";
    /* access modifiers changed from: private */
    public boolean isOfferListLoaded;
    /* access modifiers changed from: private */
    public int lastPage = 1;
    private List<Offer> offerList = new ArrayList();
    /* access modifiers changed from: private */
    public OfferListAdapter offerListAdapter;
    /* access modifiers changed from: private */
    public String parentId;
    /* access modifiers changed from: private */
    public String parentType;
    private String searchValue;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.offer.OfferListFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 3;
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

    public static final /* synthetic */ OfferListAdapter access$getOfferListAdapter$p(OfferListFragment offerListFragment) {
        OfferListAdapter offerListAdapter2 = offerListFragment.offerListAdapter;
        if (offerListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offerListAdapter");
        }
        return offerListAdapter2;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setToolbarRight(initRightButtonList(true));
        getBaseActivity().setTextTitle(this.companyTitle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        if (Intrinsics.areEqual((Object) this.parentType, (Object) "company") && (str = this.parentId) != null) {
            if (getMarketViewModel().getCompany(str) != null) {
                Company company = getMarketViewModel().getCompany(str);
                if (company == null || (str2 = company.getTitle()) == null) {
                    str2 = "";
                }
                this.companyTitle = str2;
            } else {
                getMarketViewModel().getCompanyLiveData().observe(getViewLifecycleOwner(), new OfferListFragment$onCreateView$$inlined$let$lambda$1(this));
                getMarketViewModel().loadCompanyDetails(CollectionsKt.listOf(str));
            }
        }
        if ((!StringsKt.isBlank(this.event)) && Intrinsics.areEqual((Object) this.parentType, (Object) "company")) {
            MetricsFacade.Companion companion = MetricsFacade.Companion;
            String value = MetricsKeys.market.getValue();
            HashMap hashMap = new HashMap();
            hashMap.put(this.event, StringsKt.isBlank(this.companyTitle) ^ true ? this.companyTitle : MetricsKeys.error.getValue());
            Unit unit = Unit.INSTANCE;
            companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_market_offers, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…offers, container, false)");
        return inflate;
    }

    /* access modifiers changed from: private */
    public final void handleEvent(CompanyEvent companyEvent) {
        String str;
        Company company = getMarketViewModel().getCompany(this.parentId);
        if (company == null || (str = company.getTitle()) == null) {
            str = "";
        }
        this.companyTitle = str;
        getBaseActivity().setTextTitle(this.companyTitle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (Intrinsics.areEqual((Object) this.parentType, (Object) CATEGORY_TYPE) || Intrinsics.areEqual((Object) this.parentType, (Object) "search")) {
            setNeedResetToolbar(false);
        }
        NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.offerListScrollView);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "offerListScrollView");
        nestedScrollView.setVisibility(8);
        this.offerListAdapter = new OfferListAdapter(new ArrayList(), getMarketViewModel().getTagList(), new OfferListFragment$onViewCreated$1(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.offersView);
        OfferListAdapter offerListAdapter2 = this.offerListAdapter;
        if (offerListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offerListAdapter");
        }
        recyclerView.setAdapter(offerListAdapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        ((NestedScrollView) _$_findCachedViewById(C5619R.C5622id.offerListScrollView)).setOnScrollChangeListener(new OfferListFragment$onViewCreated$3(this));
        if (this.offerList.isEmpty()) {
            loadOfferList();
        } else {
            OfferListAdapter offerListAdapter3 = this.offerListAdapter;
            if (offerListAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("offerListAdapter");
            }
            offerListAdapter3.setItems(this.offerList);
            NestedScrollView nestedScrollView2 = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.offerListScrollView);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "offerListScrollView");
            nestedScrollView2.setVisibility(0);
        }
        getMarketViewModel().getSearchOfferValueLiveData().observe(getViewLifecycleOwner(), new OfferListFragment$onViewCreated$4(this));
        getMarketViewModel().getOfferListLiveData().observe(getViewLifecycleOwner(), new OfferListFragment$onViewCreated$5(this));
        getMarketViewModel().getShowProgressLiveData().observe(getViewLifecycleOwner(), new OfferListFragment$onViewCreated$6(this));
    }

    /* access modifiers changed from: private */
    public final void handleSetCartEvent(Resource<CartResponse> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                Snackbar.make((View) (RelativeLayout) _$_findCachedViewById(C5619R.C5622id.offerListLayout), (CharSequence) getString(R.string.item_added_to_cart), -1).show();
                getBaseActivity().setToolbarRight(initRightButtonList(true, true));
            } else if (i == 2) {
                getBaseActivity().showMessage(getResources().getString(R.string.item_add_to_cart_error));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void loadOfferList() {
        String str;
        String str2;
        String str3 = this.parentType;
        if (str3 != null) {
            int hashCode = str3.hashCode();
            if (hashCode != -906336856) {
                if (hashCode != 50511102) {
                    if (hashCode == 950484093 && str3.equals("company") && (str2 = this.parentId) != null) {
                        getMarketViewModel().loadOfferList(CollectionsKt.emptyList(), CollectionsKt.listOf(str2), (String) null, this.currentPage);
                    }
                } else if (str3.equals(CATEGORY_TYPE) && (str = this.parentId) != null) {
                    getMarketViewModel().loadOfferList(CollectionsKt.listOf(str), CollectionsKt.emptyList(), (String) null, this.currentPage);
                }
            } else if (str3.equals("search")) {
                CharSequence charSequence = this.searchValue;
                if (!(charSequence == null || StringsKt.isBlank(charSequence))) {
                    getMarketViewModel().loadOfferList(CollectionsKt.emptyList(), CollectionsKt.emptyList(), this.searchValue, this.currentPage);
                }
            }
        }
    }

    private final void clearOffers() {
        this.offerList = new ArrayList();
        OfferListAdapter offerListAdapter2 = this.offerListAdapter;
        if (offerListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offerListAdapter");
        }
        offerListAdapter2.setItems(new ArrayList());
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.noOffersTextView);
        Intrinsics.checkNotNullExpressionValue(textView, "noOffersTextView");
        textView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.noResultsLayout);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "noResultsLayout");
        linearLayout.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void toggleProgressVisibility(boolean z) {
        int i = 0;
        if (!z) {
            NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.offerListScrollView);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "offerListScrollView");
            nestedScrollView.setVisibility(0);
        }
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility((!z || this.currentPage != 1) ? 8 : 0);
        ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.smallProgressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar2, "smallProgressBar");
        if (!z || this.currentPage == 1) {
            i = 8;
        }
        progressBar2.setVisibility(i);
    }

    /* access modifiers changed from: private */
    public final void handleSearchEvent(String str) {
        if (!StringsKt.isBlank(str)) {
            this.searchValue = str;
            this.currentPage = 1;
            clearOffers();
            getMarketViewModel().getOfferListLiveData().removeObserver(new OfferListFragment$handleSearchEvent$1(this));
            loadOfferList();
            getMarketViewModel().getOfferListLiveData().observe(getViewLifecycleOwner(), new OfferListFragment$handleSearchEvent$2(this));
        }
    }

    /* access modifiers changed from: private */
    public final void handleEvent(Resource<OfferListResponseData> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            if (i == 1) {
                toggleProgressVisibility(false);
                this.isOfferListLoaded = true;
                List offers = resource.getData().getOffers();
                if (offers == null) {
                    offers = new ArrayList();
                }
                List list = offers;
                if ((getParentFragment() instanceof CategoryFragment) && this.currentPage == 1) {
                    if (!list.isEmpty()) {
                        Fragment parentFragment = getParentFragment();
                        if (parentFragment != null) {
                            ((CategoryFragment) parentFragment).showTabs();
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.market.category.CategoryFragment");
                        }
                    } else {
                        Fragment parentFragment2 = getParentFragment();
                        if (parentFragment2 != null) {
                            ((CategoryFragment) parentFragment2).hideTabs();
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.market.category.CategoryFragment");
                        }
                    }
                }
                if ((getParentFragment() instanceof SearchViewFragment) && this.currentPage == 1) {
                    Fragment parentFragment3 = getParentFragment();
                    if (parentFragment3 != null) {
                        ((SearchViewFragment) parentFragment3).updateTabLayout(0, resource.getData().getMeta().getTotal());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.market.search.SearchViewFragment");
                    }
                }
                Collection collection = list;
                if (!collection.isEmpty()) {
                    this.offerList.addAll(collection);
                    if (this.currentPage == 1) {
                        this.lastPage = resource.getData().getMeta().getLastPage();
                        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.noOffersTextView);
                        Intrinsics.checkNotNullExpressionValue(textView, "noOffersTextView");
                        textView.setVisibility(8);
                        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.noResultsLayout);
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "noResultsLayout");
                        linearLayout.setVisibility(8);
                        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.offersView);
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "offersView");
                        recyclerView.setVisibility(0);
                        OfferListAdapter offerListAdapter2 = this.offerListAdapter;
                        if (offerListAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("offerListAdapter");
                        }
                        offerListAdapter2.setItems(list);
                    } else {
                        new Handler().post(new OfferListFragment$handleEvent$$inlined$let$lambda$1(list, this, resource));
                    }
                }
                checkOffersCount();
            } else if (i == 2) {
                if (getParentFragment() instanceof CategoryFragment) {
                    Fragment parentFragment4 = getParentFragment();
                    if (parentFragment4 != null) {
                        ((CategoryFragment) parentFragment4).hideTabs();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.market.category.CategoryFragment");
                    }
                }
                if ((getParentFragment() instanceof SearchViewFragment) && this.currentPage == 1) {
                    Fragment parentFragment5 = getParentFragment();
                    if (parentFragment5 != null) {
                        ((SearchViewFragment) parentFragment5).updateTabLayout(0, 0);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.market.search.SearchViewFragment");
                    }
                }
                toggleProgressVisibility(false);
                this.isOfferListLoaded = true;
                showMessage(resource.getMessage());
            } else if (i == 3) {
                this.isOfferListLoaded = false;
                toggleProgressVisibility(true);
            }
        }
    }

    private final void checkOffersCount() {
        if (this.isOfferListLoaded) {
            OfferListAdapter offerListAdapter2 = this.offerListAdapter;
            if (offerListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("offerListAdapter");
            }
            if (offerListAdapter2.getData().isEmpty()) {
                String str = this.parentType;
                if (str != null && str.hashCode() == -906336856 && str.equals("search")) {
                    LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.noResultsLayout);
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "noResultsLayout");
                    linearLayout.setVisibility(0);
                } else if (getParentFragment() instanceof CategoryFragment) {
                    TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.noOffersTextView);
                    Intrinsics.checkNotNullExpressionValue(textView, "noOffersTextView");
                    textView.setVisibility(8);
                } else {
                    TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.noOffersTextView);
                    Intrinsics.checkNotNullExpressionValue(textView2, "noOffersTextView");
                    textView2.setVisibility(0);
                }
            }
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/OfferListFragment$Companion;", "", "()V", "CATEGORY_TYPE", "", "COMPANY_TYPE", "SEARCH_TYPE", "newInstance", "Lru/unicorn/ujin/market/offer/OfferListFragment;", "id", "type", "event", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.offer.OfferListFragment$Companion */
    /* compiled from: OfferListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OfferListFragment newInstance(String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str2, "type");
            Intrinsics.checkNotNullParameter(str3, "event");
            OfferListFragment offerListFragment = new OfferListFragment();
            offerListFragment.parentId = str;
            offerListFragment.parentType = str2;
            offerListFragment.event = str3;
            return offerListFragment;
        }
    }
}
