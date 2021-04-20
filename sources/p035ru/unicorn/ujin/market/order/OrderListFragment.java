package p035ru.unicorn.ujin.market.order;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse;
import p035ru.unicorn.ujin.data.realm.Bank;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Feature;
import p035ru.unicorn.ujin.data.realm.Layout;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.marketplace.CartItem;
import p035ru.unicorn.ujin.market.MarketBaseFragment;
import p035ru.unicorn.ujin.market.model.MarketViewModel;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0014J\b\u0010\u0012\u001a\u00020\rH\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001d\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0002J \u0010$\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0%\u0018\u00010\u000fH\u0002J\b\u0010&\u001a\u00020\rH\u0014J\u0010\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\"H\u0002J\b\u0010)\u001a\u00020\rH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006+"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/OrderListFragment;", "Lru/unicorn/ujin/market/MarketBaseFragment;", "()V", "cartItemList", "", "Lru/unicorn/ujin/data/realm/marketplace/CartItem;", "decOffers", "", "", "[Ljava/lang/String;", "orderListAdapter", "Lru/unicorn/ujin/market/order/OrderListAdapter;", "handleCartEvent", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CartResponse;", "metricsScreenName", "onClearCartClicked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "openLoanFragment", "banner", "Lru/unicorn/ujin/data/realm/ContextBanner;", "setEmptyViewVisibility", "isVisible", "", "setOrderViewVisibility", "showData", "", "showToolbar", "updateToolbar", "isCartFull", "updateTotalData", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderListFragment */
/* compiled from: OrderListFragment.kt */
public final class OrderListFragment extends MarketBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private List<CartItem> cartItemList;
    private final String[] decOffers = {"товар", "товара", "товаров"};
    private OrderListAdapter orderListAdapter;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.order.OrderListFragment$WhenMappings */
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

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getResources().getString(R.string.cart));
        if (getMarketViewModel().isCartFull()) {
            BaseActivity baseActivity = getBaseActivity();
            String string = getResources().getString(R.string.remove_all_goods_message);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…remove_all_goods_message)");
            String string2 = getResources().getString(R.string.clear_cart);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.clear_cart)");
            baseActivity.setToolbarRight(initClearCartButtonList(new OrderListFragment$showToolbar$1(this), string, string2));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_order_list, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        List<CartItem> list;
        CartResponse cartResponse;
        RealmList<CartItem> list2;
        List filterNotNull;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Resource value = getMarketViewModel().getCartItemListLiveData().getValue();
        if (value == null || (cartResponse = (CartResponse) value.getData()) == null || (list2 = cartResponse.getList()) == null || (filterNotNull = CollectionsKt.filterNotNull(list2)) == null || (list = CollectionsKt.toMutableList(filterNotNull)) == null) {
            list = new ArrayList<>();
        }
        this.cartItemList = list;
        List<CartItem> list3 = this.cartItemList;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartItemList");
        }
        setEmptyViewVisibility(list3.isEmpty());
        List<CartItem> list4 = this.cartItemList;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartItemList");
        }
        setOrderViewVisibility(!list4.isEmpty());
        MarketViewModel marketViewModel = getMarketViewModel();
        Intrinsics.checkNotNullExpressionValue(marketViewModel, "marketViewModel");
        this.orderListAdapter = new OrderListAdapter(marketViewModel, new OrderListFragment$onViewCreated$1(this));
        OrderListAdapter orderListAdapter2 = this.orderListAdapter;
        if (orderListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderListAdapter");
        }
        List<CartItem> list5 = this.cartItemList;
        if (list5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartItemList");
        }
        orderListAdapter2.setData(list5);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvOrderList);
        OrderListAdapter orderListAdapter3 = this.orderListAdapter;
        if (orderListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderListAdapter");
        }
        recyclerView.setAdapter(orderListAdapter3);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnStartShopping)).setOnClickListener(new OrderListFragment$onViewCreated$3(this));
        getMarketViewModel().getCart();
        getMarketViewModel().getCartItemListLiveData().observe(getViewLifecycleOwner(), new OrderListFragment$onViewCreated$4(this));
        MarketViewModel marketViewModel2 = getMarketViewModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ReactConst.MARKET);
        Unit unit = Unit.INSTANCE;
        marketViewModel2.getContextBannerList(arrayList);
        getMarketViewModel().getContextBannerListLiveData().observe(getViewLifecycleOwner(), new OrderListFragment$onViewCreated$6(this));
    }

    /* access modifiers changed from: private */
    public final void handleCartEvent(Resource<CartResponse> resource) {
        Resource.Status status;
        List<CartItem> list;
        List filterNotNull;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(8);
                RealmList<CartItem> list2 = resource.getData().getList();
                if (list2 == null || (filterNotNull = CollectionsKt.filterNotNull(list2)) == null || (list = CollectionsKt.toMutableList(filterNotNull)) == null) {
                    list = new ArrayList<>();
                }
                this.cartItemList = list;
                List<CartItem> list3 = this.cartItemList;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cartItemList");
                }
                if (!list3.isEmpty()) {
                    setEmptyViewVisibility(false);
                    setOrderViewVisibility(true);
                    updateTotalData();
                    OrderListAdapter orderListAdapter2 = this.orderListAdapter;
                    if (orderListAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("orderListAdapter");
                    }
                    if (orderListAdapter2.getUpdatedPosition() == null) {
                        OrderListAdapter orderListAdapter3 = this.orderListAdapter;
                        if (orderListAdapter3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("orderListAdapter");
                        }
                        List<CartItem> list4 = this.cartItemList;
                        if (list4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cartItemList");
                        }
                        orderListAdapter3.setData(list4);
                    } else {
                        OrderListAdapter orderListAdapter4 = this.orderListAdapter;
                        if (orderListAdapter4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("orderListAdapter");
                        }
                        orderListAdapter4.setUpdatedPosition((Integer) null);
                    }
                } else {
                    setEmptyViewVisibility(true);
                    setOrderViewVisibility(false);
                    getMarketViewModel().clearUserLocalCart();
                }
                List<CartItem> list5 = this.cartItemList;
                if (list5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cartItemList");
                }
                updateToolbar(!list5.isEmpty());
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(8);
                getBaseActivity().showMessage(getResources().getString(R.string.internalError));
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                progressBar3.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void showData(Resource<List<ContextBanner>> resource) {
        Resource.Status status;
        String str;
        Layout layout;
        Bank bank;
        Layout layout2;
        RealmList<Feature> features;
        Layout layout3;
        RealmList<Feature> features2;
        Layout layout4;
        Resource<List<ContextBanner>> resource2 = resource;
        if (resource2 != null && (status = resource.getStatus()) != null) {
            boolean z = true;
            if (WhenMappings.$EnumSwitchMapping$1[status.ordinal()] == 1) {
                List data = resource.getData();
                boolean z2 = false;
                if ((data != null ? data.size() : 0) > 0) {
                    View childAt = ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.llOrderAndLoans)).getChildAt(0);
                    ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.llOrderAndLoans)).removeAllViews();
                    ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.llOrderAndLoans)).addView(childAt);
                    List data2 = resource.getData();
                    if (data2 != null) {
                        Iterable<ContextBanner> iterable = data2;
                        int i = 10;
                        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        for (ContextBanner contextBanner : iterable) {
                            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llOrderAndLoans);
                            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llOrderAndLoans);
                            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llOrderAndLoans");
                            View inflate = LayoutInflater.from(linearLayout2.getContext()).inflate(R.layout.item_loan, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llOrderAndLoans), z2);
                            Intrinsics.checkNotNullExpressionValue(inflate, "this");
                            ((RelativeLayout) inflate.findViewById(C5619R.C5622id.rlLoan)).setOnClickListener(new OrderListFragment$showData$$inlined$let$lambda$1(contextBanner, this, resource2));
                            GlideApp.with((View) (ImageView) inflate.findViewById(C5619R.C5622id.ivBackground)).load((contextBanner == null || (layout4 = contextBanner.getLayout()) == null) ? null : layout4.getBackground()).into((ImageView) inflate.findViewById(C5619R.C5622id.ivBackground));
                            if (!(contextBanner == null || (layout3 = contextBanner.getLayout()) == null || (features2 = layout3.getFeatures()) == null || (features2.isEmpty() ^ z) != z)) {
                                TextView textView = (TextView) inflate.findViewById(C5619R.C5622id.tvLoanTitle);
                                Intrinsics.checkNotNullExpressionValue(textView, "this.tvLoanTitle");
                                Layout layout5 = contextBanner.getLayout();
                                textView.setText(layout5 != null ? layout5.getTitle() : null);
                            }
                            LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(C5619R.C5622id.llLoanFeatures);
                            linearLayout3.removeAllViews();
                            if (contextBanner != null && (layout2 = contextBanner.getLayout()) != null && (features = layout2.getFeatures()) != null) {
                                Iterable<Feature> iterable2 = features;
                                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, i));
                                for (Feature feature : iterable2) {
                                    Intrinsics.checkNotNullExpressionValue(linearLayout3, "this");
                                    View inflate2 = LayoutInflater.from(linearLayout3.getContext()).inflate(R.layout.item_loan_feature, (LinearLayout) linearLayout3.findViewById(C5619R.C5622id.llLoanFeatures), false);
                                    TextView textView2 = (TextView) inflate2.findViewById(C5619R.C5622id.textTitle);
                                    Intrinsics.checkNotNullExpressionValue(textView2, "textTitle");
                                    textView2.setText(feature != null ? feature.getTitle() : null);
                                    TextView textView3 = (TextView) inflate2.findViewById(C5619R.C5622id.textValue);
                                    Intrinsics.checkNotNullExpressionValue(textView3, "textValue");
                                    textView3.setText(feature != null ? feature.getValue() : null);
                                    Unit unit = Unit.INSTANCE;
                                    linearLayout3.addView(inflate2);
                                    arrayList2.add(Unit.INSTANCE);
                                }
                                List list = (List) arrayList2;
                            }
                            ((DynamicBackgroundButton) inflate.findViewById(C5619R.C5622id.btnGetLoan)).setOnClickListener(new OrderListFragment$showData$$inlined$let$lambda$2(contextBanner, this, resource2));
                            if (contextBanner == null || (layout = contextBanner.getLayout()) == null || (bank = layout.getBank()) == null || (str = bank.getAccentColor()) == null) {
                                str = "";
                            }
                            int parseColor = Color.parseColor(str);
                            ((DynamicBackgroundButton) inflate.findViewById(C5619R.C5622id.btnGetLoan)).setCustomColors(parseColor, AppUtils.getDarkenColor(parseColor), AppUtils.getLightenColor(parseColor), Color.parseColor("#FFFFFF"));
                            Unit unit2 = Unit.INSTANCE;
                            linearLayout.addView(inflate);
                            arrayList.add(Unit.INSTANCE);
                            z = true;
                            z2 = false;
                            i = 10;
                        }
                        List list2 = (List) arrayList;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r12.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void openLoanFragment(p035ru.unicorn.ujin.data.realm.ContextBanner r12) {
        /*
            r11 = this;
            ru.unicorn.ujin.market.loan.DynamicLoanFragment$Companion r0 = p035ru.unicorn.ujin.market.loan.DynamicLoanFragment.Companion
            ru.unicorn.ujin.view.toolbar.ToolbarButtons r2 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.BACK
            if (r12 == 0) goto L_0x0012
            java.lang.String r1 = r12.getId()
            if (r1 == 0) goto L_0x0012
            int r1 = java.lang.Integer.parseInt(r1)
            r3 = r1
            goto L_0x0014
        L_0x0012:
            r1 = -1
            r3 = -1
        L_0x0014:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Я согласен с условиями обработки <a href=\""
            r1.append(r4)
            java.lang.String r4 = ""
            if (r12 == 0) goto L_0x0035
            ru.unicorn.ujin.data.realm.Layout r5 = r12.getLayout()
            if (r5 == 0) goto L_0x0035
            ru.unicorn.ujin.data.realm.Bank r5 = r5.getBank()
            if (r5 == 0) goto L_0x0035
            java.lang.String r5 = r5.getAgreementUrl()
            if (r5 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r5 = r4
        L_0x0036:
            r1.append(r5)
            java.lang.String r5 = "\">персональных данных</a>"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            if (r12 == 0) goto L_0x0058
            ru.unicorn.ujin.data.realm.Layout r1 = r12.getLayout()
            if (r1 == 0) goto L_0x0058
            ru.unicorn.ujin.data.realm.Bank r1 = r1.getBank()
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = r1.getAgreementUrl()
            if (r1 == 0) goto L_0x0058
            r6 = r1
            goto L_0x0059
        L_0x0058:
            r6 = r4
        L_0x0059:
            if (r12 == 0) goto L_0x006f
            ru.unicorn.ujin.data.realm.Layout r1 = r12.getLayout()
            if (r1 == 0) goto L_0x006f
            ru.unicorn.ujin.data.realm.Bank r1 = r1.getBank()
            if (r1 == 0) goto L_0x006f
            java.lang.String r1 = r1.getAccentColor()
            if (r1 == 0) goto L_0x006f
            r7 = r1
            goto L_0x0070
        L_0x006f:
            r7 = r4
        L_0x0070:
            if (r12 == 0) goto L_0x0086
            ru.unicorn.ujin.data.realm.Layout r1 = r12.getLayout()
            if (r1 == 0) goto L_0x0086
            ru.unicorn.ujin.data.realm.Bank r1 = r1.getBank()
            if (r1 == 0) goto L_0x0086
            java.lang.String r1 = r1.getLogo()
            if (r1 == 0) goto L_0x0086
            r8 = r1
            goto L_0x0087
        L_0x0086:
            r8 = r4
        L_0x0087:
            if (r12 == 0) goto L_0x009d
            ru.unicorn.ujin.data.realm.Layout r1 = r12.getLayout()
            if (r1 == 0) goto L_0x009d
            ru.unicorn.ujin.data.realm.Bank r1 = r1.getBank()
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = r1.getTitle()
            if (r1 == 0) goto L_0x009d
            r9 = r1
            goto L_0x009e
        L_0x009d:
            r9 = r4
        L_0x009e:
            if (r12 == 0) goto L_0x00ae
            ru.unicorn.ujin.data.realm.Layout r1 = r12.getLayout()
            if (r1 == 0) goto L_0x00ae
            java.lang.String r1 = r1.getTitle()
            if (r1 == 0) goto L_0x00ae
            r10 = r1
            goto L_0x00af
        L_0x00ae:
            r10 = r4
        L_0x00af:
            if (r12 == 0) goto L_0x00be
            ru.unicorn.ujin.data.realm.Layout r12 = r12.getLayout()
            if (r12 == 0) goto L_0x00be
            java.lang.String r12 = r12.getPhone()
            if (r12 == 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r12 = r4
        L_0x00bf:
            r1 = 3
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            ru.unicorn.ujin.market.loan.DynamicLoanFragment r12 = r0.newInstance(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.fragment.app.Fragment r12 = (androidx.fragment.app.Fragment) r12
            r0 = 0
            java.lang.String r1 = "fragmentLoan"
            r11.nextFragment(r12, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.order.OrderListFragment.openLoanFragment(ru.unicorn.ujin.data.realm.ContextBanner):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r0 = (r0 = (p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse) r0.getData()).getTotal();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateTotalData() {
        /*
            r4 = this;
            java.util.List<ru.unicorn.ujin.data.realm.marketplace.CartItem> r0 = r4.cartItemList
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "cartItemList"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0009:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0014
            r4.onClearCartClicked()
            goto L_0x00c4
        L_0x0014:
            ru.unicorn.ujin.market.model.MarketViewModel r0 = r4.getMarketViewModel()
            ru.unicorn.ujin.viewModel.SingleLiveEvent r0 = r0.getCartItemListLiveData()
            java.lang.Object r0 = r0.getValue()
            ru.unicorn.ujin.data.realm.Resource r0 = (p035ru.unicorn.ujin.data.realm.Resource) r0
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r0.getData()
            ru.unicorn.ujin.data.api.response.marketplace.CartResponse r0 = (p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse) r0
            if (r0 == 0) goto L_0x0037
            ru.unicorn.ujin.data.realm.marketplace.CartTotal r0 = r0.getTotal()
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r0.getPrice()
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            ru.unicorn.ujin.market.model.MarketViewModel r1 = r4.getMarketViewModel()
            ru.unicorn.ujin.viewModel.SingleLiveEvent r1 = r1.getCartItemListLiveData()
            java.lang.Object r1 = r1.getValue()
            ru.unicorn.ujin.data.realm.Resource r1 = (p035ru.unicorn.ujin.data.realm.Resource) r1
            r2 = 0
            if (r1 == 0) goto L_0x0062
            java.lang.Object r1 = r1.getData()
            ru.unicorn.ujin.data.api.response.marketplace.CartResponse r1 = (p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse) r1
            if (r1 == 0) goto L_0x0062
            ru.unicorn.ujin.data.realm.marketplace.CartTotal r1 = r1.getTotal()
            if (r1 == 0) goto L_0x0062
            java.lang.Integer r1 = r1.getQuantity()
            if (r1 == 0) goto L_0x0062
            int r1 = r1.intValue()
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x006e
            boolean r3 = kotlin.text.StringsKt.isBlank(r3)
            if (r3 == 0) goto L_0x006f
        L_0x006e:
            r2 = 1
        L_0x006f:
            if (r2 != 0) goto L_0x0096
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0)
            r0 = 2
            r3 = 4
            java.math.BigDecimal r0 = r2.setScale(r0, r3)
            int r2 = p035ru.unicorn.C5619R.C5622id.tvTotalAmount
            android.view.View r2 = r4._$_findCachedViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r3 = "tvTotalAmount"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            android.content.Context r3 = r4.getContext()
            android.text.SpannableString r0 = p035ru.unicorn.ujin.util.TextUtils.formatAmount((java.math.BigDecimal) r0, (android.content.Context) r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
        L_0x0096:
            int r0 = p035ru.unicorn.C5619R.C5622id.tvTotalInCart
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = "tvTotalInCart"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            int r0 = p035ru.unicorn.C5619R.C5622id.tvTotalGoods
            android.view.View r0 = r4._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = "tvTotalGoods"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.String[] r2 = r4.decOffers
            java.lang.String r1 = p035ru.unicorn.ujin.util.TextUtils.decOfNumber(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.order.OrderListFragment.updateTotalData():void");
    }

    /* access modifiers changed from: private */
    public final void onClearCartClicked() {
        getMarketViewModel().clearCart();
    }

    private final void updateToolbar(boolean z) {
        if (z) {
            return;
        }
        if (getBaseActivity().profileViewModel.getDemoStage() <= 0 || !getBaseActivity().flavor.isStage1Enabled()) {
            getBaseActivity().setToolbarRight(new ArrayList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(initDemoExitButton());
        getBaseActivity().setToolbarRight(arrayList);
    }

    private final void setOrderViewVisibility(boolean z) {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llOrderAndLoans);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llOrderAndLoans");
        int i = 0;
        linearLayout.setVisibility(z ? 0 : 8);
        CardView cardView = (CardView) _$_findCachedViewById(C5619R.C5622id.cvTotalInfo);
        Intrinsics.checkNotNullExpressionValue(cardView, "cvTotalInfo");
        if (!z) {
            i = 8;
        }
        cardView.setVisibility(i);
    }

    private final void setEmptyViewVisibility(boolean z) {
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoOrders);
        Intrinsics.checkNotNullExpressionValue(textView, "tvNoOrders");
        int i = 0;
        textView.setVisibility(z ? 0 : 8);
        TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoOrdersMessage);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvNoOrdersMessage");
        textView2.setVisibility(z ? 0 : 8);
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnStartShopping);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnStartShopping");
        if (!z) {
            i = 8;
        }
        dynamicBackgroundButton.setVisibility(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/market/order/OrderListFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/market/order/OrderListFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.order.OrderListFragment$Companion */
    /* compiled from: OrderListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OrderListFragment newInstance() {
            return new OrderListFragment();
        }
    }
}
