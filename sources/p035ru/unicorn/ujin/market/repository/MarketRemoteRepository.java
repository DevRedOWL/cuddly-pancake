package p035ru.unicorn.ujin.market.repository;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.request.AuthBody;
import p035ru.unicorn.ujin.data.api.request.SimpleBody;
import p035ru.unicorn.ujin.data.api.request.market.CartSetBody;
import p035ru.unicorn.ujin.data.api.request.market.CartSetDataBody;
import p035ru.unicorn.ujin.data.api.request.market.CategoryListBody;
import p035ru.unicorn.ujin.data.api.request.market.CategoryListDataBody;
import p035ru.unicorn.ujin.data.api.request.market.CompanyBody;
import p035ru.unicorn.ujin.data.api.request.market.CompanyDataBody;
import p035ru.unicorn.ujin.data.api.request.market.CompanyListBody;
import p035ru.unicorn.ujin.data.api.request.market.CompanyListDataBody;
import p035ru.unicorn.ujin.data.api.request.market.Consumer;
import p035ru.unicorn.ujin.data.api.request.market.CreateOrderBody;
import p035ru.unicorn.ujin.data.api.request.market.CreateOrderDataBody;
import p035ru.unicorn.ujin.data.api.request.market.OfferBody;
import p035ru.unicorn.ujin.data.api.request.market.OfferDataBody;
import p035ru.unicorn.ujin.data.api.request.market.OfferListBody;
import p035ru.unicorn.ujin.data.api.request.market.OfferListDataBody;
import p035ru.unicorn.ujin.data.api.request.market.OrderedOffer;
import p035ru.unicorn.ujin.data.api.request.market.SearchCategoryListBody;
import p035ru.unicorn.ujin.data.api.request.market.SearchCategoryListDataBody;
import p035ru.unicorn.ujin.data.api.request.market.TagListBody;
import p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse;
import p035ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData;
import p035ru.unicorn.ujin.data.api.response.marketplace.CompanyListResponseData;
import p035ru.unicorn.ujin.data.api.response.marketplace.CouponListResponseData;
import p035ru.unicorn.ujin.data.api.response.marketplace.OfferListResponseData;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.marketplace.Banner;
import p035ru.unicorn.ujin.data.realm.marketplace.CartOffer;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.market.loan.GetBannerRequestBody;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
import p035ru.unicorn.ujin.viewModel.events.market.CommentListEvent;
import p035ru.unicorn.ujin.viewModel.events.market.CompanyEvent;
import p035ru.unicorn.ujin.viewModel.events.market.CompanyListEvent;
import p035ru.unicorn.ujin.viewModel.events.market.CouponListEvent;
import p035ru.unicorn.ujin.viewModel.events.market.CreateCommentEvent;
import p035ru.unicorn.ujin.viewModel.events.market.CreateOrderEvent;
import p035ru.unicorn.ujin.viewModel.events.market.OfferEvent;
import p035ru.unicorn.ujin.viewModel.events.market.PromotionListEvent;
import p035ru.unicorn.ujin.viewModel.events.market.RedeemCouponEvent;
import p035ru.unicorn.ujin.viewModel.events.market.TagListEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.reactivex.subjects.PublishSubject;
import p046io.realm.Realm;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0+J2\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u0002012\u0006\u00104\u001a\u0002012\u0006\u00105\u001a\u000206JL\u00107\u001a\u00020/2\f\u00108\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u0010;\u001a\u0002012\u0006\u0010<\u001a\u0002012\u0006\u0010=\u001a\u0002012\u0006\u0010>\u001a\u0002012\u0006\u0010?\u001a\u0002012\u0006\u0010@\u001a\u0002012\u0006\u0010A\u001a\u000201J\u0012\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0+J.\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0,0+2\u0006\u0010E\u001a\u0002062\b\u0010F\u001a\u0004\u0018\u0001012\b\u0010G\u001a\u0004\u0018\u000101J2\u0010H\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010I\u001a\u0002062\u0006\u0010J\u001a\u0002062\u0006\u0010K\u001a\u000201J\u0014\u0010L\u001a\u00020/2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020109J2\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0,0+2\f\u0010P\u001a\b\u0012\u0004\u0012\u000201092\u0006\u0010E\u001a\u0002062\b\u0010G\u001a\u0004\u0018\u000101J2\u0010Q\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010R090,0+2\u0016\u0010S\u001a\u0012\u0012\u0004\u0012\u0002010Tj\b\u0012\u0004\u0012\u000201`UJ\u0012\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0,0+J\u0014\u0010X\u001a\u00020/2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020109J@\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0,0+2\f\u0010\\\u001a\b\u0012\u0004\u0012\u000201092\f\u0010M\u001a\b\u0012\u0004\u0012\u000201092\b\u0010G\u001a\u0004\u0018\u0001012\u0006\u0010E\u001a\u000206J(\u0010]\u001a\u00020/2\b\u0010^\u001a\u0004\u0018\u0001012\u0006\u0010_\u001a\u0002062\u0006\u0010I\u001a\u0002062\u0006\u0010J\u001a\u000206J\u0006\u0010`\u001a\u00020/J\u0015\u0010a\u001a\u00020/2\b\u0010b\u001a\u0004\u0018\u000106¢\u0006\u0002\u0010cJ$\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0,0+2\u0006\u0010E\u001a\u0002062\b\u0010G\u001a\u0004\u0018\u000101J\"\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0+2\u0006\u0010f\u001a\u0002012\u0006\u0010g\u001a\u000206R5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR5\u0010\t\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR5\u0010\f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR5\u0010\u000f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00100\u0010 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR5\u0010\u0012\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00130\u0013 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR5\u0010\u0015\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00160\u0016 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00160\u0016\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR5\u0010\u0018\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00190\u0019 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00190\u0019\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR5\u0010\u001b\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001c0\u001c \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\bR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R5\u0010$\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010%0% \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010%0%\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR5\u0010'\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010(0( \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010(0(\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\b¨\u0006h"}, mo51343d2 = {"Lru/unicorn/ujin/market/repository/MarketRemoteRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "commentListSubject", "Lio/reactivex/subjects/PublishSubject;", "Lru/unicorn/ujin/viewModel/events/market/CommentListEvent;", "kotlin.jvm.PlatformType", "getCommentListSubject", "()Lio/reactivex/subjects/PublishSubject;", "companyListSubject", "Lru/unicorn/ujin/viewModel/events/market/CompanyListEvent;", "getCompanyListSubject", "companySubject", "Lru/unicorn/ujin/viewModel/events/market/CompanyEvent;", "getCompanySubject", "couponListSubject", "Lru/unicorn/ujin/viewModel/events/market/CouponListEvent;", "getCouponListSubject", "createCommentSubject", "Lru/unicorn/ujin/viewModel/events/market/CreateCommentEvent;", "getCreateCommentSubject", "createOrderSubject", "Lru/unicorn/ujin/viewModel/events/market/CreateOrderEvent;", "getCreateOrderSubject", "offerSubject", "Lru/unicorn/ujin/viewModel/events/market/OfferEvent;", "getOfferSubject", "promotionListSubject", "Lru/unicorn/ujin/viewModel/events/market/PromotionListEvent;", "getPromotionListSubject", "realm", "Lio/realm/Realm;", "getRealm", "()Lio/realm/Realm;", "realm$delegate", "Lkotlin/Lazy;", "redeemCouponSubject", "Lru/unicorn/ujin/viewModel/events/market/RedeemCouponEvent;", "getRedeemCouponSubject", "tagListSubject", "Lru/unicorn/ujin/viewModel/events/market/TagListEvent;", "getTagListSubject", "clearCart", "Lio/reactivex/Flowable;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CartResponse;", "createComment", "", "threadId", "", "threadType", "authorName", "message", "vote", "", "createOrder", "offerList", "", "Lru/unicorn/ujin/data/realm/marketplace/CartOffer;", "surname", "name", "patronymic", "phone", "email", "address", "comment", "getCart", "getCategoryList", "Lru/unicorn/ujin/data/api/response/marketplace/CategoryListResponseData;", "page", "parentId", "search", "getCommentList", "limit", "offset", "order", "getCompanyDetails", "companyIds", "getCompanyList", "Lru/unicorn/ujin/data/api/response/marketplace/CompanyListResponseData;", "categoryId", "getContextBannerList", "Lru/unicorn/ujin/data/realm/ContextBanner;", "contexts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCouponList", "Lru/unicorn/ujin/data/api/response/marketplace/CouponListResponseData;", "getOffer", "offerIds", "getOfferList", "Lru/unicorn/ujin/data/api/response/marketplace/OfferListResponseData;", "categoryIds", "getPromotionList", "companyId", "onlyActive", "getTagList", "redeemCouponCode", "id", "(Ljava/lang/Integer;)V", "searchCategoryList", "setCart", "offerId", "quantity", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.repository.MarketRemoteRepository */
/* compiled from: MarketRemoteRepository.kt */
public final class MarketRemoteRepository extends BaseRemoteRepository {
    private final PublishSubject<CommentListEvent> commentListSubject = PublishSubject.create();
    private final PublishSubject<CompanyListEvent> companyListSubject = PublishSubject.create();
    private final PublishSubject<CompanyEvent> companySubject = PublishSubject.create();
    private final PublishSubject<CouponListEvent> couponListSubject = PublishSubject.create();
    private final PublishSubject<CreateCommentEvent> createCommentSubject = PublishSubject.create();
    private final PublishSubject<CreateOrderEvent> createOrderSubject = PublishSubject.create();
    private final PublishSubject<OfferEvent> offerSubject = PublishSubject.create();
    private final PublishSubject<PromotionListEvent> promotionListSubject = PublishSubject.create();
    private final Lazy realm$delegate = LazyKt.lazy(MarketRemoteRepository$realm$2.INSTANCE);
    private final PublishSubject<RedeemCouponEvent> redeemCouponSubject = PublishSubject.create();
    private final PublishSubject<TagListEvent> tagListSubject = PublishSubject.create();

    /* access modifiers changed from: private */
    public final Realm getRealm() {
        return (Realm) this.realm$delegate.getValue();
    }

    public final PublishSubject<OfferEvent> getOfferSubject() {
        return this.offerSubject;
    }

    public final PublishSubject<CompanyListEvent> getCompanyListSubject() {
        return this.companyListSubject;
    }

    public final PublishSubject<CompanyEvent> getCompanySubject() {
        return this.companySubject;
    }

    public final PublishSubject<CreateCommentEvent> getCreateCommentSubject() {
        return this.createCommentSubject;
    }

    public final PublishSubject<CommentListEvent> getCommentListSubject() {
        return this.commentListSubject;
    }

    public final PublishSubject<PromotionListEvent> getPromotionListSubject() {
        return this.promotionListSubject;
    }

    public final PublishSubject<CreateOrderEvent> getCreateOrderSubject() {
        return this.createOrderSubject;
    }

    public final PublishSubject<CouponListEvent> getCouponListSubject() {
        return this.couponListSubject;
    }

    public final PublishSubject<RedeemCouponEvent> getRedeemCouponSubject() {
        return this.redeemCouponSubject;
    }

    public final PublishSubject<TagListEvent> getTagListSubject() {
        return this.tagListSubject;
    }

    public final Flowable<Resource<OfferListResponseData>> getOfferList(List<String> list, List<String> list2, String str, int i) {
        Intrinsics.checkNotNullParameter(list, "categoryIds");
        Intrinsics.checkNotNullParameter(list2, "companyIds");
        Flowable<R> subscribeOn = getApi().getOfferList(getAppName(), i, new OfferListBody(new OfferListDataBody(list, list2, str), new AuthBody("api-token", getToken()))).map(MarketRemoteRepository$getOfferList$1.INSTANCE).onErrorReturn(MarketRemoteRepository$getOfferList$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getOfferList(appName…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final void getOffer(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "offerIds");
        getApi().getOffer(getAppName(), new OfferBody(new OfferDataBody(list), new AuthBody("api-token", getToken()))).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketRemoteRepository$getOffer$1(this), new MarketRemoteRepository$getOffer$2(this));
    }

    public final Flowable<Resource<CategoryListResponseData>> getCategoryList(int i, String str, String str2) {
        Flowable<R> subscribeOn = getApi().getCategoryList(getAppName(), i, new CategoryListBody(new CategoryListDataBody(true, str, str2), new AuthBody("api-token", getToken()))).map(MarketRemoteRepository$getCategoryList$1.INSTANCE).onErrorReturn(MarketRemoteRepository$getCategoryList$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getCategoryList(appN…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final void getTagList() {
        getApi().getTagList(getAppName(), new TagListBody(new AuthBody("api-token", getToken()))).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketRemoteRepository$getTagList$1(this), new MarketRemoteRepository$getTagList$2(this));
    }

    public final Flowable<Resource<CompanyListResponseData>> getCompanyList(List<String> list, int i, String str) {
        Intrinsics.checkNotNullParameter(list, Banner.Fields.categoryId);
        Flowable<R> subscribeOn = getApi().getCompanyList(getAppName(), i, new CompanyListBody(new CompanyListDataBody(list, str), new AuthBody("api-token", getToken()))).map(MarketRemoteRepository$getCompanyList$1.INSTANCE).onErrorReturn(MarketRemoteRepository$getCompanyList$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getCompanyList(appNa…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final void getCompanyDetails(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "companyIds");
        getApi().getCompanyDetails(getAppName(), new CompanyBody(new CompanyDataBody(list), new AuthBody("api-token", getToken()))).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketRemoteRepository$getCompanyDetails$1(this), new MarketRemoteRepository$getCompanyDetails$2(this));
    }

    public final void createComment(String str, String str2, String str3, String str4, int i) {
        Intrinsics.checkNotNullParameter(str3, "authorName");
        Intrinsics.checkNotNullParameter(str4, "message");
        getApi().marketCreateComment(getAppName(), getToken(), str, str2, str3, str4, i).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketRemoteRepository$createComment$1(this), new MarketRemoteRepository$createComment$2(this));
    }

    public final void getCommentList(String str, String str2, int i, int i2, String str3) {
        Intrinsics.checkNotNullParameter(str3, "order");
        getApi().marketGetCommentList(getAppName(), getToken(), str, str2, i, i2, str3).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketRemoteRepository$getCommentList$1(this, i2), new MarketRemoteRepository$getCommentList$2(this));
    }

    public final void getPromotionList(String str, int i, int i2, int i3) {
        getApi().marketGetPromotionList(getAppName(), getToken(), str, i, i2, i3).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketRemoteRepository$getPromotionList$1(this, i3), new MarketRemoteRepository$getPromotionList$2(this));
    }

    public final void createOrder(List<? extends CartOffer> list, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str7;
        List<? extends CartOffer> list2 = list;
        Intrinsics.checkNotNullParameter(list, "offerList");
        String str9 = str;
        Intrinsics.checkNotNullParameter(str, "surname");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "patronymic");
        Intrinsics.checkNotNullParameter(str4, "phone");
        Intrinsics.checkNotNullParameter(str5, "email");
        Intrinsics.checkNotNullParameter(str6, Contact.Type.address);
        Intrinsics.checkNotNullParameter(str8, "comment");
        List arrayList = new ArrayList();
        for (CartOffer cartOffer : list) {
            String id = cartOffer.getId();
            Integer quantity = cartOffer.getQuantity();
            arrayList.add(new OrderedOffer(id, quantity != null ? quantity.intValue() : 0));
        }
        getApi().marketCreateOrder(getAppName(), new CreateOrderBody(new CreateOrderDataBody(arrayList, new Consumer(str, str2, str3, str4, str5, str6), str8), new AuthBody("api-token", getToken()))).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketRemoteRepository$createOrder$1(this), new MarketRemoteRepository$createOrder$2(this));
    }

    public final Flowable<Resource<CouponListResponseData>> getCouponList() {
        Flowable<R> subscribeOn = getApi().marketGetCouponList(getAppName(), getToken()).map(MarketRemoteRepository$getCouponList$1.INSTANCE).onErrorReturn(MarketRemoteRepository$getCouponList$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.marketGetCouponList(…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final void redeemCouponCode(Integer num) {
        getApi().marketRedeemCouponCode(getAppName(), getToken(), num, getUser().getPhone()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new MarketRemoteRepository$redeemCouponCode$1(this), new MarketRemoteRepository$redeemCouponCode$2(this));
    }

    public final Flowable<Resource<List<ContextBanner>>> getContextBannerList(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "contexts");
        Flowable<R> subscribeOn = getApi().getBannerList(getToken(), new GetBannerRequestBody(arrayList)).map(MarketRemoteRepository$getContextBannerList$1.INSTANCE).onErrorReturn(MarketRemoteRepository$getContextBannerList$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getBannerList(getTok…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<CartResponse>> setCart(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "offerId");
        Flowable<R> subscribeOn = getApi().setCart(getAppName(), new CartSetBody(new CartSetDataBody(str, i), new AuthBody("api-token", getToken()))).map(MarketRemoteRepository$setCart$1.INSTANCE).onErrorReturn(MarketRemoteRepository$setCart$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.setCart(appName, bod…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<CartResponse>> getCart() {
        Flowable<R> subscribeOn = getApi().getCart(getAppName(), new SimpleBody(new AuthBody("api-token", getToken()))).map(MarketRemoteRepository$getCart$1.INSTANCE).onErrorReturn(MarketRemoteRepository$getCart$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getCart(appName, bod…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<CartResponse>> clearCart() {
        Flowable<R> subscribeOn = getApi().clearCart(getAppName(), new SimpleBody(new AuthBody("api-token", getToken()))).map(MarketRemoteRepository$clearCart$1.INSTANCE).onErrorReturn(MarketRemoteRepository$clearCart$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.clearCart(appName, b…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<CategoryListResponseData>> searchCategoryList(int i, String str) {
        Flowable<R> subscribeOn = getApi().searchCategoryList(getAppName(), i, new SearchCategoryListBody(new SearchCategoryListDataBody(str), new AuthBody("api-token", getToken()))).map(MarketRemoteRepository$searchCategoryList$1.INSTANCE).onErrorReturn(MarketRemoteRepository$searchCategoryList$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.searchCategoryList(a…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
