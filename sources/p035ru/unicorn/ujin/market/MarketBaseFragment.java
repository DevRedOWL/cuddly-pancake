package p035ru.unicorn.ujin.market;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.market.category.CategoryFragment;
import p035ru.unicorn.ujin.market.comment.CommentFragment;
import p035ru.unicorn.ujin.market.comment.CommentListFragment;
import p035ru.unicorn.ujin.market.comment.NewCommentFragment;
import p035ru.unicorn.ujin.market.company.CompanyFragment;
import p035ru.unicorn.ujin.market.coupon.CouponListFragment;
import p035ru.unicorn.ujin.market.exampleOfWork.ExampleGalleryFragment;
import p035ru.unicorn.ujin.market.exampleOfWork.ExampleListFragment;
import p035ru.unicorn.ujin.market.model.MarketViewModel;
import p035ru.unicorn.ujin.market.offer.OfferFragment;
import p035ru.unicorn.ujin.market.offer.OfferListFragment;
import p035ru.unicorn.ujin.market.order.OrderFormFragment;
import p035ru.unicorn.ujin.market.order.OrderListFragment;
import p035ru.unicorn.ujin.market.order.PaymentResultFragment;
import p035ru.unicorn.ujin.market.promotion.PromotionFragment;
import p035ru.unicorn.ujin.market.promotion.PromotionListFragment;
import p035ru.unicorn.ujin.market.search.SearchViewFragment;
import p035ru.unicorn.ujin.metrics.MetricsFacade;
import p035ru.unicorn.ujin.metrics.MetricsKeys;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.PaymentWebViewActivity;
import p035ru.unicorn.ujin.view.activity.WebViewActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0017\b&\u0018\u0000 P2\u00020\u0001:\u0001PB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J4\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u001bj\b\u0012\u0004\u0012\u00020\u0019`\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0017J\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u001bj\b\u0012\u0004\u0012\u00020\u0019`\u001cJ\u001e\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u001bj\b\u0012\u0004\u0012\u00020\u0019`\u001c2\u0006\u0010#\u001a\u00020$J&\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u001bj\b\u0012\u0004\u0012\u00020\u0019`\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$J0\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u001bj\b\u0012\u0004\u0012\u00020\u0019`\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u0017J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0017H\u0002J\u0010\u0010)\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010\u0017J\"\u0010+\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010\u00172\b\u0010,\u001a\u0004\u0018\u00010\u00172\u0006\u0010-\u001a\u00020\u0017J&\u0010.\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0017H\u0002J\u0010\u0010/\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u00010\u0017J\u001a\u00101\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u00010\u00172\b\u00103\u001a\u0004\u0018\u00010\u0017J\"\u00104\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010\u00172\b\u00105\u001a\u0004\u0018\u00010\u00172\u0006\u0010-\u001a\u00020\u0017J,\u00104\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010\u00172\b\u00105\u001a\u0004\u0018\u00010\u00172\u0006\u0010-\u001a\u00020\u00172\u0006\u00106\u001a\u00020$H\u0002J\u0006\u00107\u001a\u00020\u0015J\u0018\u00108\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010\u00172\u0006\u00109\u001a\u00020:J\u0010\u0010;\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010\u0017J\u001a\u0010<\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u00010\u00172\b\u00103\u001a\u0004\u0018\u00010\u0017J \u0010=\u001a\u00020\u00152\b\u0010>\u001a\u0004\u0018\u00010\u00172\u0006\u00106\u001a\u00020$2\u0006\u0010-\u001a\u00020\u0017J\u0018\u0010=\u001a\u00020\u00152\b\u0010>\u001a\u0004\u0018\u00010\u00172\u0006\u0010-\u001a\u00020\u0017J*\u0010?\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u00010\u00172\u0006\u00103\u001a\u00020\u00172\u0006\u00106\u001a\u00020$2\u0006\u0010-\u001a\u00020\u0017H\u0002J \u0010?\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u00010\u00172\u0006\u00103\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0017J\u0018\u0010@\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u00010\u00172\u0006\u00103\u001a\u00020\u0017J\u000e\u0010A\u001a\u00020\u00152\u0006\u00106\u001a\u00020$J\u001e\u0010B\u001a\u00020\u00152\u0006\u0010C\u001a\u00020$2\u0006\u0010D\u001a\u00020\u00172\u0006\u00106\u001a\u00020$J\u0010\u0010E\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u00010\u0017J\u0010\u0010F\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010\u0017J\u0012\u0010G\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010\u0017H\u0002J*\u0010H\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010\u00172\b\u0010,\u001a\u0004\u0018\u00010\u00172\u0006\u0010-\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0017J\u0016\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0017J\u0016\u0010K\u001a\u00020\u00152\u0006\u0010L\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0017J\u000e\u0010M\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u0017J\u0016\u0010O\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0017R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006Q"}, mo51343d2 = {"Lru/unicorn/ujin/market/MarketBaseFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "marketViewModel", "Lru/unicorn/ujin/market/model/MarketViewModel;", "getMarketViewModel", "()Lru/unicorn/ujin/market/model/MarketViewModel;", "marketViewModel$delegate", "Lkotlin/Lazy;", "profileViewModel", "Lru/unicorn/ujin/data/profile/ProfileViewModel;", "getProfileViewModel", "()Lru/unicorn/ujin/data/profile/ProfileViewModel;", "profileViewModel$delegate", "searchView", "Landroidx/appcompat/widget/SearchView;", "getSearchView", "()Landroidx/appcompat/widget/SearchView;", "setSearchView", "(Landroidx/appcompat/widget/SearchView;)V", "copyToClipboard", "", "text", "", "initCenterLayout", "Landroid/view/View;", "initClearCartButtonList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "clearCall", "Lkotlin/Function0;", "clearMessage", "clearButton", "initCloseButtonList", "initRightButtonList", "hasSearch", "", "checkDemoExit", "categoryId", "removeFragmentFromBackstack", "tag", "showCartMessage", "companyId", "showCategoryFragment", "categoryTitle", "event", "showClearCartDialog", "showCommentFragment", "commentId", "showCommentListFragment", "id", "type", "showCompanyFragment", "companyTitle", "clearBackStack", "showCouponListFragment", "showExampleGalleryFragment", "position", "", "showExampleListFragment", "showNewCommentFragment", "showOfferFragment", "offerId", "showOfferListFragment", "showOrderFormFragment", "showOrderListFragment", "showPaymentResultFragment", "success", "paymentUrl", "showPromotionFragment", "showPromotionListFragment", "showSearchViewFragment", "showSubCategoryFragment", "startCallIntent", "number", "startEmailIntent", "value", "startPaymentActivity", "url", "startWebIntent", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.MarketBaseFragment */
/* compiled from: MarketBaseFragment.kt */
public abstract class MarketBaseFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String FRAGMENT_CATEGORY = "fragmentCategory";
    public static final String FRAGMENT_COMMENT = "fragmentComment";
    public static final String FRAGMENT_COMMENT_LIST = "fragmentCommentList";
    public static final String FRAGMENT_COMMENT_PAGER = "fragmentCommentPager";
    public static final String FRAGMENT_COMPANY = "fragmentCompany";
    public static final String FRAGMENT_COMPANY_INFO = "fragmentInfo";
    public static final String FRAGMENT_COMPANY_LIST = "fragmentCompanyList";
    public static final String FRAGMENT_COMPANY_PRODUCT = "fragmentCompanyProduct";
    public static final String FRAGMENT_COMPANY_SERVICE = "fragmentCompanyService";
    public static final String FRAGMENT_COUPON_LIST = "fragmentCouponList";
    public static final String FRAGMENT_EXAMPLE_GALLERY = "fragmentExampleGallery";
    public static final String FRAGMENT_EXAMPLE_LIST = "fragmentExampleList";
    public static final String FRAGMENT_EXAMPLE_PAGER = "fragmentExamplePager";
    public static final String FRAGMENT_NEW_COMMENT = "fragmentNewComment";
    public static final String FRAGMENT_OFFER = "fragmentOffer";
    public static final String FRAGMENT_OFFER_LIST = "fragmentOfferList";
    public static final String FRAGMENT_ORDER = "fragmentOrder";
    public static final String FRAGMENT_ORDER_FORM = "fragmentOrderForm";
    public static final String FRAGMENT_ORDER_LIST = "fragmentOrderList";
    public static final String FRAGMENT_PAYMENT_RESULT = "fragmentPaymentResult";
    public static final String FRAGMENT_PROMOTION = "fragmentPromotion";
    public static final String FRAGMENT_PROMOTION_LIST = "fragmentPromotionList";
    public static final String FRAGMENT_PROMOTION_PAGER = "fragmentPromotionPager";
    public static final String FRAGMENT_SEARCH_VIEW = "fragmentSearchView";
    public static final String FRAGMENT_SUB_CATEGORY = "fragmentSubCategory";
    public static final String SMART_HOME_CATEGORY_ID = "2";
    public static final String UJIN_COMPANY_ID = "29";
    private HashMap _$_findViewCache;
    private final Lazy marketViewModel$delegate = LazyKt.lazy(new MarketBaseFragment$marketViewModel$2(this));
    private final Lazy profileViewModel$delegate = LazyKt.lazy(new MarketBaseFragment$profileViewModel$2(this));
    private SearchView searchView;

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

    public final MarketViewModel getMarketViewModel() {
        return (MarketViewModel) this.marketViewModel$delegate.getValue();
    }

    public final ProfileViewModel getProfileViewModel() {
        return (ProfileViewModel) this.profileViewModel$delegate.getValue();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final SearchView getSearchView() {
        return this.searchView;
    }

    public final void setSearchView(SearchView searchView2) {
        this.searchView = searchView2;
    }

    public final void showCategoryFragment(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str3, "event");
        getBaseActivity().showFragment(CategoryFragment.Companion.newInstance(str, str2, str3), FRAGMENT_CATEGORY, false);
    }

    public final void showSubCategoryFragment(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str3, "event");
        Intrinsics.checkNotNullParameter(str4, "tag");
        getBaseActivity().showFragment(CategoryFragment.Companion.newInstance(str, str2, str3), str4, false);
    }

    public final void showOfferListFragment(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(str3, "event");
        showOfferListFragment(str, str2, false, str3);
    }

    private final void showOfferListFragment(String str, String str2, boolean z, String str3) {
        if (z) {
            removeFragmentFromBackStack(FRAGMENT_SEARCH_VIEW);
        }
        getBaseActivity().showFragment(OfferListFragment.Companion.newInstance(str, str2, str3), FRAGMENT_OFFER_LIST, false);
    }

    public final void showOfferFragment(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "event");
        showOfferFragment(str, false, str2);
    }

    public final void showOfferFragment(String str, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(str2, "event");
        if (z) {
            removeFragmentFromBackStack(FRAGMENT_SEARCH_VIEW);
        }
        getBaseActivity().showFragment(OfferFragment.Companion.newInstance(str, str2), "fragmentOffer", false);
    }

    public final void showCommentListFragment(String str, String str2) {
        getBaseActivity().showFragment(CommentListFragment.Companion.newInstance(str, str2), FRAGMENT_COMMENT_LIST, false);
    }

    public final void showNewCommentFragment(String str, String str2) {
        getBaseActivity().showFragment(NewCommentFragment.Companion.newInstance(str, str2), FRAGMENT_NEW_COMMENT, false);
    }

    public final void showCommentFragment(String str) {
        getBaseActivity().showFragment(CommentFragment.Companion.newInstance(str), FRAGMENT_COMMENT, false);
    }

    public final void showCompanyFragment(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str3, "event");
        showCompanyFragment(str, str2, str3, false);
    }

    private final void showCompanyFragment(String str, String str2, String str3, boolean z) {
        if (z) {
            removeFragmentFromBackStack(FRAGMENT_SEARCH_VIEW);
        }
        getBaseActivity().showFragment(CompanyFragment.Companion.newInstance(str, str2, str3), "fragmentCompany", false);
    }

    public final void showOrderListFragment(boolean z) {
        if (z) {
            removeFragmentFromBackStack(FRAGMENT_ORDER);
            removeFragmentFromBackStack(FRAGMENT_ORDER_FORM);
            removeFragmentFromBackStack(FRAGMENT_PAYMENT_RESULT);
        }
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        if (baseActivity.getSupportFragmentManager().findFragmentByTag(FRAGMENT_ORDER_LIST) == null) {
            MetricsFacade.Companion companion = MetricsFacade.Companion;
            String value = MetricsKeys.market.getValue();
            HashMap hashMap = new HashMap();
            hashMap.put(MetricsKeys.cart.getValue(), "");
            Unit unit = Unit.INSTANCE;
            companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
            getBaseActivity().showFragment(OrderListFragment.Companion.newInstance(), FRAGMENT_ORDER_LIST, false);
        }
    }

    public final void showOrderFormFragment(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "type");
        getBaseActivity().showFragment(OrderFormFragment.Companion.newInstance(str, str2), FRAGMENT_ORDER_FORM, false);
    }

    /* access modifiers changed from: private */
    public final void showSearchViewFragment(String str) {
        getBaseActivity().showFragment(SearchViewFragment.Companion.newInstance(str), FRAGMENT_SEARCH_VIEW, false);
    }

    public final void showPromotionListFragment(String str) {
        getBaseActivity().showFragment(PromotionListFragment.Companion.newInstance(str), FRAGMENT_PROMOTION_LIST, false);
    }

    public final void showPromotionFragment(String str) {
        getBaseActivity().showFragment(PromotionFragment.Companion.newInstance(str), FRAGMENT_PROMOTION, false);
    }

    public final void showExampleListFragment(String str) {
        getBaseActivity().showFragment(ExampleListFragment.Companion.newInstance(str), FRAGMENT_EXAMPLE_LIST, false);
    }

    public final void showExampleGalleryFragment(String str, int i) {
        getBaseActivity().showFragment(ExampleGalleryFragment.Companion.newInstance(str, i), FRAGMENT_EXAMPLE_GALLERY, false);
    }

    private final void removeFragmentFromBackstack(String str) {
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        if (baseActivity.getSupportFragmentManager().findFragmentByTag(str) != null) {
            BaseActivity baseActivity2 = getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
            baseActivity2.getSupportFragmentManager().popBackStack(str, 1);
        }
    }

    public final void showPaymentResultFragment(boolean z, String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "paymentUrl");
        if (z2) {
            removeFragmentFromBackStack(FRAGMENT_ORDER);
            removeFragmentFromBackStack(FRAGMENT_ORDER_FORM);
        }
        getBaseActivity().showFragment(PaymentResultFragment.Companion.newInstance(Boolean.valueOf(z), str), FRAGMENT_PAYMENT_RESULT, false);
    }

    public final void showCouponListFragment() {
        getBaseActivity().showFragment(CouponListFragment.Companion.newInstance(), FRAGMENT_COUPON_LIST, false);
    }

    public final void startPaymentActivity(String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intent intent = new Intent(getActivity(), PaymentWebViewActivity.class);
        intent.putExtra("paymentUrl", str);
        startActivityForResult(intent, 1);
    }

    public final ArrayList<View> initRightButtonList(boolean z, boolean z2, String str) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (z) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_24dp, getBaseActivity().llButtonsRight, false);
            if (inflate != null) {
                ImageButton imageButton = (ImageButton) inflate;
                imageButton.setImageResource(R.drawable.icon_search_magnifier);
                imageButton.setOnClickListener(new MarketBaseFragment$initRightButtonList$1(this, str));
                arrayList.add(imageButton);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
            }
        }
        View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_cart, getBaseActivity().llButtonsRight, false);
        if (inflate2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate2;
            View viewById = constraintLayout.getViewById(R.id.tvCount);
            if (viewById != null) {
                TextView textView = (TextView) viewById;
                int currentTotalQuantity = getMarketViewModel().getCurrentTotalQuantity();
                if (currentTotalQuantity == 0) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(String.valueOf(currentTotalQuantity));
                }
                constraintLayout.setOnClickListener(new MarketBaseFragment$initRightButtonList$2(this));
                arrayList.add(constraintLayout);
                if (z2 && getBaseActivity().profileViewModel.getDemoStage() > 0 && getBaseActivity().flavor.isStage1Enabled()) {
                    arrayList.add(initDemoExitButton());
                }
                return arrayList;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
    }

    public final ArrayList<View> initRightButtonList(boolean z) {
        return initRightButtonList(z, false, (String) null);
    }

    public final ArrayList<View> initRightButtonList(boolean z, boolean z2) {
        return initRightButtonList(z, z2, (String) null);
    }

    public final View initCenterLayout() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_search_view, getBaseActivity().centerLayout, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "searchLayout");
        this.searchView = (SearchView) inflate.findViewById(C5619R.C5622id.searchView);
        ((AppCompatImageView) inflate.findViewById(C5619R.C5622id.ivSearchBack)).setOnClickListener(new MarketBaseFragment$initCenterLayout$1(this, inflate));
        return inflate;
    }

    public final ArrayList<View> initCloseButtonList() {
        ArrayList<View> arrayList = new ArrayList<>();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_24dp, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            ImageButton imageButton = (ImageButton) inflate;
            imageButton.setImageResource(R.drawable.icon_close);
            imageButton.setOnClickListener(new MarketBaseFragment$initCloseButtonList$1(this));
            arrayList.add(imageButton);
            return arrayList;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
    }

    public final ArrayList<View> initClearCartButtonList(Function0<Unit> function0, String str, String str2) {
        Intrinsics.checkNotNullParameter(function0, "clearCall");
        Intrinsics.checkNotNullParameter(str, "clearMessage");
        Intrinsics.checkNotNullParameter(str2, "clearButton");
        ArrayList<View> arrayList = new ArrayList<>();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_24dp, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            ImageButton imageButton = (ImageButton) inflate;
            imageButton.setImageResource(R.drawable.ic_wastebasket);
            imageButton.setOnClickListener(new MarketBaseFragment$initClearCartButtonList$1(this, function0, str, str2));
            arrayList.add(imageButton);
            return arrayList;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
    }

    /* access modifiers changed from: private */
    public final void showClearCartDialog(Function0<Unit> function0, String str, String str2) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getBaseActivity());
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        View inflate = baseActivity.getLayoutInflater().inflate(R.layout.bottom_sheet_clear_cart, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "sheetView");
        TextView textView = (TextView) inflate.findViewById(C5619R.C5622id.tvClearCartMessage);
        Intrinsics.checkNotNullExpressionValue(textView, "sheetView.tvClearCartMessage");
        textView.setText(str);
        TextView textView2 = (TextView) inflate.findViewById(C5619R.C5622id.tvClearCart);
        Intrinsics.checkNotNullExpressionValue(textView2, "sheetView.tvClearCart");
        textView2.setText(str2);
        ((RelativeLayout) inflate.findViewById(C5619R.C5622id.clearCartLayout)).setOnClickListener(new MarketBaseFragment$showClearCartDialog$1(function0, bottomSheetDialog));
        bottomSheetDialog.setContentView(inflate);
        bottomSheetDialog.show();
    }

    public final void showCartMessage(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getBaseActivity());
        builder.setTitle((CharSequence) getResources().getString(R.string.items_added_to_cart)).setPositiveButton((CharSequence) getResources().getString(R.string.continue_shopping), (DialogInterface.OnClickListener) MarketBaseFragment$showCartMessage$1.INSTANCE).setNegativeButton((CharSequence) getResources().getString(R.string.go_to_cart), (DialogInterface.OnClickListener) new MarketBaseFragment$showCartMessage$2(this));
        AlertDialog create = builder.create();
        Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
        create.show();
    }

    public final void startCallIntent(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_NUMBER);
        Intrinsics.checkNotNullParameter(str2, "event");
        if (str2.length() > 0) {
            MetricsFacade.Companion companion = MetricsFacade.Companion;
            String value = MetricsKeys.market.getValue();
            HashMap hashMap = new HashMap();
            String value2 = MetricsKeys.marketAction.getValue();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(MetricsKeys.marketActionCall.getValue(), str2);
            Unit unit = Unit.INSTANCE;
            hashMap.put(value2, hashMap2);
            Unit unit2 = Unit.INSTANCE;
            companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
        }
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + str)));
    }

    public final void startWebIntent(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "event");
        if (str2.length() > 0) {
            MetricsFacade.Companion companion = MetricsFacade.Companion;
            String value = MetricsKeys.market.getValue();
            HashMap hashMap = new HashMap();
            String value2 = MetricsKeys.marketAction.getValue();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(MetricsKeys.marketActionWeb.getValue(), str2);
            Unit unit = Unit.INSTANCE;
            hashMap.put(value2, hashMap2);
            Unit unit2 = Unit.INSTANCE;
            companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
        }
        Intent putExtra = new Intent(getContext(), WebViewActivity.class).putExtra("url", str);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, WebViewA…WebViewActivity.URL, url)");
        startActivity(putExtra);
    }

    public final void startEmailIntent(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "value");
        Intrinsics.checkNotNullParameter(str2, "event");
        if (str2.length() > 0) {
            MetricsFacade.Companion companion = MetricsFacade.Companion;
            String value = MetricsKeys.market.getValue();
            HashMap hashMap = new HashMap();
            String value2 = MetricsKeys.marketAction.getValue();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(MetricsKeys.marketActionEmail.getValue(), str2);
            Unit unit = Unit.INSTANCE;
            hashMap.put(value2, hashMap2);
            Unit unit2 = Unit.INSTANCE;
            companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:" + str));
        startActivity(intent);
    }

    public final void copyToClipboard(String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        Context context = getContext();
        ClipboardManager clipboardManager = (ClipboardManager) (context != null ? context.getSystemService("clipboard") : null);
        ClipData newPlainText = ClipData.newPlainText("", str);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
        Toast.makeText(getContext(), "Текст скопирован!", 1).show();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/market/MarketBaseFragment$Companion;", "", "()V", "FRAGMENT_CATEGORY", "", "FRAGMENT_COMMENT", "FRAGMENT_COMMENT_LIST", "FRAGMENT_COMMENT_PAGER", "FRAGMENT_COMPANY", "FRAGMENT_COMPANY_INFO", "FRAGMENT_COMPANY_LIST", "FRAGMENT_COMPANY_PRODUCT", "FRAGMENT_COMPANY_SERVICE", "FRAGMENT_COUPON_LIST", "FRAGMENT_EXAMPLE_GALLERY", "FRAGMENT_EXAMPLE_LIST", "FRAGMENT_EXAMPLE_PAGER", "FRAGMENT_NEW_COMMENT", "FRAGMENT_OFFER", "FRAGMENT_OFFER_LIST", "FRAGMENT_ORDER", "FRAGMENT_ORDER_FORM", "FRAGMENT_ORDER_LIST", "FRAGMENT_PAYMENT_RESULT", "FRAGMENT_PROMOTION", "FRAGMENT_PROMOTION_LIST", "FRAGMENT_PROMOTION_PAGER", "FRAGMENT_SEARCH_VIEW", "FRAGMENT_SUB_CATEGORY", "SMART_HOME_CATEGORY_ID", "UJIN_COMPANY_ID", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.MarketBaseFragment$Companion */
    /* compiled from: MarketBaseFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
