package p035ru.unicorn.ujin.market.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse;
import p035ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData;
import p035ru.unicorn.ujin.data.api.response.marketplace.CompanyListResponseData;
import p035ru.unicorn.ujin.data.api.response.marketplace.CouponListResponseData;
import p035ru.unicorn.ujin.data.api.response.marketplace.OfferListResponseData;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.marketplace.Banner;
import p035ru.unicorn.ujin.data.realm.marketplace.CartCompany;
import p035ru.unicorn.ujin.data.realm.marketplace.CartItem;
import p035ru.unicorn.ujin.data.realm.marketplace.CartOffer;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.data.realm.marketplace.Comment;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.data.realm.marketplace.Coupon;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.data.realm.marketplace.Promotion;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode;
import p035ru.unicorn.ujin.data.realm.marketplace.Tag;
import p035ru.unicorn.ujin.market.repository.MarketLocalRepository;
import p035ru.unicorn.ujin.market.repository.MarketRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
import p035ru.unicorn.ujin.viewModel.SingleLiveEvent;
import p035ru.unicorn.ujin.viewModel.events.market.CommentListEvent;
import p035ru.unicorn.ujin.viewModel.events.market.CompanyEvent;
import p035ru.unicorn.ujin.viewModel.events.market.CreateCommentEvent;
import p035ru.unicorn.ujin.viewModel.events.market.CreateOrderEvent;
import p035ru.unicorn.ujin.viewModel.events.market.OfferEvent;
import p035ru.unicorn.ujin.viewModel.events.market.PromotionListEvent;
import p035ru.unicorn.ujin.viewModel.events.market.RedeemCouponEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010A\u001a\u00020BH\u0007J\u0006\u0010C\u001a\u00020BJ2\u0010D\u001a\u00020B2\b\u0010E\u001a\u0004\u0018\u0001052\b\u0010F\u001a\u0004\u0018\u0001052\u0006\u0010G\u001a\u0002052\u0006\u0010H\u001a\u0002052\u0006\u0010I\u001a\u00020JJL\u0010K\u001a\u00020B2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00162\u0006\u0010N\u001a\u0002052\u0006\u0010O\u001a\u0002052\u0006\u0010P\u001a\u0002052\u0006\u0010Q\u001a\u0002052\u0006\u0010R\u001a\u0002052\u0006\u0010S\u001a\u0002052\u0006\u0010T\u001a\u000205J\b\u0010U\u001a\u00020BH\u0007J\u0012\u0010V\u001a\u0004\u0018\u00010?2\b\u0010W\u001a\u0004\u0018\u000105J\u0012\u0010X\u001a\u0004\u0018\u00010M2\b\u0010Y\u001a\u0004\u0018\u000105J\u0012\u0010Z\u001a\u0004\u0018\u00010[2\b\u0010W\u001a\u0004\u0018\u000105J\u0012\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010W\u001a\u0004\u0018\u000105J \u0010^\u001a\b\u0012\u0004\u0012\u00020]0>2\b\u0010E\u001a\u0004\u0018\u0001052\b\u0010F\u001a\u0004\u0018\u000105J\u0012\u0010_\u001a\u0004\u0018\u00010`2\b\u0010W\u001a\u0004\u0018\u000105J \u0010a\u001a\u00020B2\u0016\u0010b\u001a\u0012\u0012\u0004\u0012\u0002050cj\b\u0012\u0004\u0012\u000205`dH\u0007J\u0017\u0010e\u001a\u0004\u0018\u00010f2\b\u0010W\u001a\u0004\u0018\u00010J¢\u0006\u0002\u0010gJ\f\u0010h\u001a\b\u0012\u0004\u0012\u00020f0>J\u000e\u0010i\u001a\u00020J2\u0006\u0010Y\u001a\u000205J\u0006\u0010j\u001a\u00020JJ\u0012\u0010k\u001a\u0004\u0018\u00010l2\b\u0010W\u001a\u0004\u0018\u000105J\u0016\u0010m\u001a\b\u0012\u0004\u0012\u00020M0>2\b\u0010n\u001a\u0004\u0018\u000105J\u0012\u0010o\u001a\u0004\u0018\u00010p2\b\u0010W\u001a\u0004\u0018\u000105J\u0016\u0010q\u001a\b\u0012\u0004\u0012\u00020p0>2\b\u0010n\u001a\u0004\u0018\u000105J\f\u0010r\u001a\b\u0012\u0004\u0012\u00020s0\u0016J\u0006\u0010t\u001a\u00020#J\u0006\u0010\"\u001a\u00020#J$\u0010u\u001a\u00020B2\u0006\u0010v\u001a\u00020J2\b\u0010w\u001a\u0004\u0018\u0001052\b\u0010x\u001a\u0004\u0018\u000105H\u0007J*\u0010y\u001a\u00020B2\b\u0010E\u001a\u0004\u0018\u0001052\b\u0010F\u001a\u0004\u0018\u0001052\u0006\u0010z\u001a\u00020J2\u0006\u0010{\u001a\u00020JJ\u0014\u0010|\u001a\u00020B2\f\u0010}\u001a\b\u0012\u0004\u0012\u0002050\u0016J(\u0010~\u001a\u00020B2\f\u0010\u001a\b\u0012\u0004\u0012\u0002050\u00162\u0006\u0010v\u001a\u00020J2\b\u0010x\u001a\u0004\u0018\u000105H\u0007J\t\u0010\u0001\u001a\u00020BH\u0007J\u0016\u0010\u0001\u001a\u00020B2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002050\u0016J8\u0010\u0001\u001a\u00020B2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002050\u00162\f\u0010}\u001a\b\u0012\u0004\u0012\u0002050\u00162\b\u0010x\u001a\u0004\u0018\u0001052\u0006\u0010v\u001a\u00020JH\u0007J!\u0010\u0001\u001a\u00020B2\b\u0010n\u001a\u0004\u0018\u0001052\u0006\u0010z\u001a\u00020J2\u0006\u0010{\u001a\u00020JJ\u0007\u0010\u0001\u001a\u00020BJ\u0017\u0010\u0001\u001a\u00020B2\b\u0010W\u001a\u0004\u0018\u00010J¢\u0006\u0003\u0010\u0001J\u001b\u0010\u0001\u001a\u00020B2\u0006\u0010v\u001a\u00020J2\b\u0010x\u001a\u0004\u0018\u000105H\u0007J\u001a\u0010\u0001\u001a\u00020B2\u0006\u0010Y\u001a\u0002052\u0007\u0010\u0001\u001a\u00020JH\u0007J&\u0010\u0001\u001a\u0004\u0018\u00010f2\t\u0010\u0001\u001a\u0004\u0018\u00010J2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0003\u0010\u0001R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR%\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00160\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\bR\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\bR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\bR\u0017\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\bR\u000e\u00102\u001a\u000203X\u0004¢\u0006\u0002\n\u0000R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\bR\u0017\u00107\u001a\b\u0012\u0004\u0012\u0002050\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\bR\u0017\u00109\u001a\b\u0012\u0004\u0012\u0002050\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\bR\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020#0\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\bR\u001d\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0>0\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\b¨\u0006\u0001"}, mo51343d2 = {"Lru/unicorn/ujin/market/model/MarketViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "cartItemListLiveData", "Lru/unicorn/ujin/viewModel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CartResponse;", "getCartItemListLiveData", "()Lru/unicorn/ujin/viewModel/SingleLiveEvent;", "categoryListLiveData", "Lru/unicorn/ujin/data/api/response/marketplace/CategoryListResponseData;", "getCategoryListLiveData", "commentListLiveData", "Lru/unicorn/ujin/viewModel/events/market/CommentListEvent;", "getCommentListLiveData", "companyListLiveData", "Lru/unicorn/ujin/data/api/response/marketplace/CompanyListResponseData;", "getCompanyListLiveData", "companyLiveData", "Lru/unicorn/ujin/viewModel/events/market/CompanyEvent;", "getCompanyLiveData", "contextBannerListLiveData", "", "Lru/unicorn/ujin/data/realm/ContextBanner;", "getContextBannerListLiveData", "couponListLiveData", "Lru/unicorn/ujin/data/api/response/marketplace/CouponListResponseData;", "getCouponListLiveData", "createCommentLiveData", "Lru/unicorn/ujin/viewModel/events/market/CreateCommentEvent;", "getCreateCommentLiveData", "createOrderLiveData", "Lru/unicorn/ujin/viewModel/events/market/CreateOrderEvent;", "getCreateOrderLiveData", "isCommentListLoading", "", "localRepository", "Lru/unicorn/ujin/market/repository/MarketLocalRepository;", "offerListLiveData", "Lru/unicorn/ujin/data/api/response/marketplace/OfferListResponseData;", "getOfferListLiveData", "offerLiveData", "Lru/unicorn/ujin/viewModel/events/market/OfferEvent;", "getOfferLiveData", "promotionListLiveData", "Lru/unicorn/ujin/viewModel/events/market/PromotionListEvent;", "getPromotionListLiveData", "redeemCouponCodeLiveData", "Lru/unicorn/ujin/viewModel/events/market/RedeemCouponEvent;", "getRedeemCouponCodeLiveData", "remoteRepository", "Lru/unicorn/ujin/market/repository/MarketRemoteRepository;", "searchCategoryValueLiveData", "", "getSearchCategoryValueLiveData", "searchCompanyValueLiveData", "getSearchCompanyValueLiveData", "searchOfferValueLiveData", "getSearchOfferValueLiveData", "showProgressLiveData", "getShowProgressLiveData", "userCartItemListLiveData", "", "Lru/unicorn/ujin/data/realm/marketplace/CartItem;", "getUserCartItemListLiveData", "clearCart", "", "clearUserLocalCart", "createComment", "threadId", "threadType", "authorName", "message", "vote", "", "createOrder", "offerList", "Lru/unicorn/ujin/data/realm/marketplace/CartOffer;", "surname", "name", "patronymic", "phone", "email", "address", "comment", "getCart", "getCartItem", "id", "getCartOffer", "offerId", "getCategory", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "getComment", "Lru/unicorn/ujin/data/realm/marketplace/Comment;", "getCommentList", "getCompany", "Lru/unicorn/ujin/data/realm/marketplace/Company;", "getContextBannerList", "contexts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCoupon", "Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "(Ljava/lang/Integer;)Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "getCouponList", "getCurrentOfferQuantity", "getCurrentTotalQuantity", "getOffer", "Lru/unicorn/ujin/data/realm/marketplace/Offer;", "getOrderedOfferList", "companyId", "getPromotion", "Lru/unicorn/ujin/data/realm/marketplace/Promotion;", "getPromotionList", "getTagList", "Lru/unicorn/ujin/data/realm/marketplace/Tag;", "isCartFull", "loadCategoryList", "page", "parentId", "search", "loadCommentList", "limit", "offset", "loadCompanyDetails", "companyIds", "loadCompanyList", "categoryId", "loadCouponList", "loadOffer", "offerIds", "loadOfferList", "categoryIds", "loadPromotionList", "loadTagList", "redeemCouponCode", "(Ljava/lang/Integer;)V", "searchCategoryList", "setCart", "quantity", "updateRedeemedCoupon", "couponId", "code", "Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode;", "(Ljava/lang/Integer;Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode;)Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.model.MarketViewModel */
/* compiled from: MarketViewModel.kt */
public final class MarketViewModel extends BaseViewModel {
    private final SingleLiveEvent<Resource<CartResponse>> cartItemListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<CategoryListResponseData>> categoryListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<CommentListEvent> commentListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<CompanyListResponseData>> companyListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<CompanyEvent> companyLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<List<ContextBanner>>> contextBannerListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<CouponListResponseData>> couponListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<CreateCommentEvent> createCommentLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<CreateOrderEvent> createOrderLiveData = new SingleLiveEvent<>();
    /* access modifiers changed from: private */
    public boolean isCommentListLoading;
    /* access modifiers changed from: private */
    public final MarketLocalRepository localRepository = new MarketLocalRepository();
    private final SingleLiveEvent<Resource<OfferListResponseData>> offerListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<OfferEvent> offerLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<PromotionListEvent> promotionListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<RedeemCouponEvent> redeemCouponCodeLiveData = new SingleLiveEvent<>();
    /* access modifiers changed from: private */
    public final MarketRemoteRepository remoteRepository = new MarketRemoteRepository();
    private final SingleLiveEvent<String> searchCategoryValueLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<String> searchCompanyValueLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<String> searchOfferValueLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Boolean> showProgressLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<List<CartItem>> userCartItemListLiveData = new SingleLiveEvent<>();

    public final SingleLiveEvent<Resource<CategoryListResponseData>> getCategoryListLiveData() {
        return this.categoryListLiveData;
    }

    public final SingleLiveEvent<Resource<OfferListResponseData>> getOfferListLiveData() {
        return this.offerListLiveData;
    }

    public final SingleLiveEvent<OfferEvent> getOfferLiveData() {
        return this.offerLiveData;
    }

    public final SingleLiveEvent<Resource<CompanyListResponseData>> getCompanyListLiveData() {
        return this.companyListLiveData;
    }

    public final SingleLiveEvent<CompanyEvent> getCompanyLiveData() {
        return this.companyLiveData;
    }

    public final SingleLiveEvent<CreateCommentEvent> getCreateCommentLiveData() {
        return this.createCommentLiveData;
    }

    public final SingleLiveEvent<CommentListEvent> getCommentListLiveData() {
        return this.commentListLiveData;
    }

    public final SingleLiveEvent<PromotionListEvent> getPromotionListLiveData() {
        return this.promotionListLiveData;
    }

    public final SingleLiveEvent<CreateOrderEvent> getCreateOrderLiveData() {
        return this.createOrderLiveData;
    }

    public final SingleLiveEvent<Resource<List<ContextBanner>>> getContextBannerListLiveData() {
        return this.contextBannerListLiveData;
    }

    public final SingleLiveEvent<String> getSearchOfferValueLiveData() {
        return this.searchOfferValueLiveData;
    }

    public final SingleLiveEvent<String> getSearchCompanyValueLiveData() {
        return this.searchCompanyValueLiveData;
    }

    public final SingleLiveEvent<String> getSearchCategoryValueLiveData() {
        return this.searchCategoryValueLiveData;
    }

    public final SingleLiveEvent<Resource<CouponListResponseData>> getCouponListLiveData() {
        return this.couponListLiveData;
    }

    public final SingleLiveEvent<RedeemCouponEvent> getRedeemCouponCodeLiveData() {
        return this.redeemCouponCodeLiveData;
    }

    public final SingleLiveEvent<Resource<CartResponse>> getCartItemListLiveData() {
        return this.cartItemListLiveData;
    }

    public final SingleLiveEvent<List<CartItem>> getUserCartItemListLiveData() {
        return this.userCartItemListLiveData;
    }

    public final SingleLiveEvent<Boolean> getShowProgressLiveData() {
        return this.showProgressLiveData;
    }

    public final void loadOfferList(List<String> list, List<String> list2, String str, int i) {
        Intrinsics.checkNotNullParameter(list, "categoryIds");
        Intrinsics.checkNotNullParameter(list2, "companyIds");
        this.remoteRepository.getOfferList(list, list2, str, i).map(new MarketViewModel$loadOfferList$1(this)).doOnNext(new MarketViewModel$loadOfferList$2(this, i)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketViewModel$loadOfferList$3(this));
    }

    public final void loadOffer(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "offerIds");
        this.compositeDisposable.add(this.remoteRepository.getOfferSubject().subscribe(new MarketViewModel$loadOffer$1(this)));
        this.remoteRepository.getOffer(list);
    }

    public final Offer getOffer(String str) {
        return this.localRepository.getOffer(str);
    }

    public final void loadCategoryList(int i, String str, String str2) {
        this.remoteRepository.getCategoryList(i, str, str2).map(new MarketViewModel$loadCategoryList$1(this)).doOnNext(new MarketViewModel$loadCategoryList$2(this, i)).filter(MarketViewModel$loadCategoryList$3.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketViewModel$loadCategoryList$4(this));
    }

    public final Category getCategory(String str) {
        return this.localRepository.getCategory(str);
    }

    public final void loadCompanyList(List<String> list, int i, String str) {
        Intrinsics.checkNotNullParameter(list, Banner.Fields.categoryId);
        this.remoteRepository.getCompanyList(list, i, str).map(new MarketViewModel$loadCompanyList$1(this)).doOnNext(new MarketViewModel$loadCompanyList$2(this, i)).filter(MarketViewModel$loadCompanyList$3.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketViewModel$loadCompanyList$4(this));
    }

    public final void loadCompanyDetails(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "companyIds");
        this.compositeDisposable.add(this.remoteRepository.getCompanySubject().subscribe(new MarketViewModel$loadCompanyDetails$1(this)));
        this.showProgressLiveData.setValue(true);
        this.remoteRepository.getCompanyDetails(list);
    }

    public final Company getCompany(String str) {
        return this.localRepository.getCompany(str);
    }

    public final void createComment(String str, String str2, String str3, String str4, int i) {
        Intrinsics.checkNotNullParameter(str3, "authorName");
        Intrinsics.checkNotNullParameter(str4, "message");
        this.compositeDisposable.add(this.remoteRepository.getCreateCommentSubject().subscribe(new MarketViewModel$createComment$1(this)));
        this.showProgressLiveData.setValue(true);
        this.remoteRepository.createComment(str, str2, str3, str4, i);
    }

    public final void loadCommentList(String str, String str2, int i, int i2) {
        this.compositeDisposable.add(this.remoteRepository.getCommentListSubject().subscribe(new MarketViewModel$loadCommentList$1(this)));
        this.isCommentListLoading = true;
        this.showProgressLiveData.setValue(true);
        this.remoteRepository.getCommentList(str, str2, i, i2, "asc");
    }

    public final List<Comment> getCommentList(String str, String str2) {
        return CollectionsKt.toMutableList(this.localRepository.getCommentList(str, str2));
    }

    public final boolean isCommentListLoading() {
        return this.isCommentListLoading;
    }

    public final Comment getComment(String str) {
        return this.localRepository.getComment(str);
    }

    public final List<CartOffer> getOrderedOfferList(String str) {
        return CollectionsKt.toMutableList(this.localRepository.getOrderedOfferList(str));
    }

    public final boolean isCartFull() {
        return this.localRepository.isCartFull();
    }

    public final void loadPromotionList(String str, int i, int i2) {
        this.compositeDisposable.add(this.remoteRepository.getPromotionListSubject().subscribe(new MarketViewModel$loadPromotionList$1(this)));
        this.showProgressLiveData.setValue(true);
        this.remoteRepository.getPromotionList(str, 1, i, i2);
    }

    public final List<Promotion> getPromotionList(String str) {
        return CollectionsKt.toMutableList(this.localRepository.getPromotionList(str));
    }

    public final Promotion getPromotion(String str) {
        return this.localRepository.getPromotion(str);
    }

    public final void createOrder(List<? extends CartOffer> list, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(list, "offerList");
        Intrinsics.checkNotNullParameter(str, "surname");
        Intrinsics.checkNotNullParameter(str2, "name");
        String str8 = str3;
        Intrinsics.checkNotNullParameter(str8, "patronymic");
        String str9 = str4;
        Intrinsics.checkNotNullParameter(str9, "phone");
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "email");
        String str11 = str6;
        Intrinsics.checkNotNullParameter(str11, Contact.Type.address);
        String str12 = str7;
        Intrinsics.checkNotNullParameter(str12, "comment");
        this.compositeDisposable.add(this.remoteRepository.getCreateOrderSubject().subscribe(new MarketViewModel$createOrder$1(this)));
        this.remoteRepository.createOrder(list, str, str2, str8, str9, str10, str11, str12);
    }

    public final void loadCouponList() {
        this.remoteRepository.getCouponList().map(new MarketViewModel$loadCouponList$1(this)).doOnNext(new MarketViewModel$loadCouponList$2(this)).filter(MarketViewModel$loadCouponList$3.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketViewModel$loadCouponList$4(this));
    }

    public final List<Coupon> getCouponList() {
        return CollectionsKt.toMutableList(this.localRepository.getCouponList());
    }

    public final Coupon getCoupon(Integer num) {
        return this.localRepository.getCoupon(num);
    }

    public final void redeemCouponCode(Integer num) {
        this.compositeDisposable.add(this.remoteRepository.getRedeemCouponSubject().subscribe(new MarketViewModel$redeemCouponCode$1(this)));
        this.remoteRepository.redeemCouponCode(num);
    }

    public final Coupon updateRedeemedCoupon(Integer num, RedeemedCode redeemedCode) {
        return this.localRepository.updateRedeemedCoupon(num, redeemedCode);
    }

    public final void loadTagList() {
        this.remoteRepository.getTagList();
    }

    public final List<Tag> getTagList() {
        return this.localRepository.getTagList();
    }

    public final void getContextBannerList(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "contexts");
        this.remoteRepository.getContextBannerList(arrayList).doOnNext(new MarketViewModel$getContextBannerList$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketViewModel$getContextBannerList$2(this));
    }

    public final void setCart(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "offerId");
        this.remoteRepository.setCart(str, i).map(new MarketViewModel$setCart$1(this)).filter(MarketViewModel$setCart$2.INSTANCE).doOnNext(new MarketViewModel$setCart$3(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketViewModel$setCart$4(this));
    }

    public final int getCurrentOfferQuantity(String str) {
        Integer quantity;
        Object obj;
        String str2;
        Intrinsics.checkNotNullParameter(str, "offerId");
        List<CartItem> value = this.userCartItemListLiveData.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        CartOffer cartOffer = null;
        for (CartItem offers : value) {
            RealmList<CartOffer> offers2 = offers.getOffers();
            if (offers2 != null) {
                Iterator it = offers2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    CartOffer cartOffer2 = (CartOffer) obj;
                    if (cartOffer2 != null) {
                        str2 = cartOffer2.getId();
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.areEqual((Object) str2, (Object) str)) {
                        break;
                    }
                }
                cartOffer = (CartOffer) obj;
                continue;
            } else {
                cartOffer = null;
                continue;
            }
            if (cartOffer != null) {
                break;
            }
        }
        if (cartOffer == null || (quantity = cartOffer.getQuantity()) == null) {
            return 0;
        }
        return quantity.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r3 = r3.getQuantity();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getCurrentTotalQuantity() {
        /*
            r4 = this;
            ru.unicorn.ujin.viewModel.SingleLiveEvent<java.util.List<ru.unicorn.ujin.data.realm.marketplace.CartItem>> r0 = r4.userCartItemListLiveData
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x000b
            goto L_0x0012
        L_0x000b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x0012:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x001a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r0.next()
            ru.unicorn.ujin.data.realm.marketplace.CartItem r3 = (p035ru.unicorn.ujin.data.realm.marketplace.CartItem) r3
            ru.unicorn.ujin.data.realm.marketplace.CartTotal r3 = r3.getTotal()
            if (r3 == 0) goto L_0x0037
            java.lang.Integer r3 = r3.getQuantity()
            if (r3 == 0) goto L_0x0037
            int r3 = r3.intValue()
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            int r2 = r2 + r3
            goto L_0x001a
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.model.MarketViewModel.getCurrentTotalQuantity():int");
    }

    public final CartItem getCartItem(String str) {
        Object obj;
        List value = this.userCartItemListLiveData.getValue();
        if (value == null) {
            value = new ArrayList();
        }
        Iterator it = value.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            CartCompany company = ((CartItem) obj).getCompany();
            if (company != null) {
                str2 = company.getId();
            }
            if (Intrinsics.areEqual((Object) str2, (Object) str)) {
                break;
            }
        }
        return (CartItem) obj;
    }

    public final CartOffer getCartOffer(String str) {
        Object obj;
        String str2;
        List<CartItem> value = this.userCartItemListLiveData.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        CartOffer cartOffer = null;
        for (CartItem offers : value) {
            RealmList<CartOffer> offers2 = offers.getOffers();
            if (offers2 != null) {
                Iterator it = offers2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    CartOffer cartOffer2 = (CartOffer) obj;
                    if (cartOffer2 != null) {
                        str2 = cartOffer2.getId();
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.areEqual((Object) str2, (Object) str)) {
                        break;
                    }
                }
                cartOffer = (CartOffer) obj;
                continue;
            } else {
                cartOffer = null;
                continue;
            }
            if (cartOffer != null) {
                break;
            }
        }
        return cartOffer;
    }

    public final void clearUserLocalCart() {
        this.userCartItemListLiveData.postValue(new ArrayList());
    }

    public final void getCart() {
        this.remoteRepository.getCart().map(new MarketViewModel$getCart$1(this)).filter(MarketViewModel$getCart$2.INSTANCE).doOnNext(new MarketViewModel$getCart$3(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketViewModel$getCart$4(this));
    }

    public final void clearCart() {
        this.remoteRepository.clearCart().map(new MarketViewModel$clearCart$1(this)).filter(MarketViewModel$clearCart$2.INSTANCE).doOnNext(new MarketViewModel$clearCart$3(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketViewModel$clearCart$4(this));
    }

    public final void searchCategoryList(int i, String str) {
        this.remoteRepository.searchCategoryList(i, str).map(new MarketViewModel$searchCategoryList$1(this)).doOnNext(new MarketViewModel$searchCategoryList$2(this, i)).filter(MarketViewModel$searchCategoryList$3.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketViewModel$searchCategoryList$4(this));
    }
}
