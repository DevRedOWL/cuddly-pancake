package p035ru.unicorn.ujin.market.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.Banner;
import p035ru.unicorn.ujin.data.realm.marketplace.CartItem;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.data.realm.marketplace.Comment;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.data.realm.marketplace.Coupon;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.data.realm.marketplace.Promotion;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode;
import p035ru.unicorn.ujin.data.realm.marketplace.Tag;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.BaseLocalRepository;
import p046io.realm.Realm;
import p046io.realm.RealmResults;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\u0007J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007J0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0018J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J&\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004J\b\u0010$\u001a\u0004\u0018\u00010\u0007J\u0006\u0010%\u001a\u00020&J!\u0010'\u001a\u0004\u0018\u00010\u00172\b\u0010(\u001a\u0004\u0018\u00010\u00122\b\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0002\u0010+¨\u0006,"}, mo51343d2 = {"Lru/unicorn/ujin/market/repository/MarketLocalRepository;", "Lru/unicorn/ujin/view/activity/navigation/ui/addhardware/create/BaseLocalRepository;", "()V", "getBannerList", "", "Lru/unicorn/ujin/data/realm/marketplace/Banner;", "categoryId", "", "getCategory", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "id", "getCategoryList", "getComment", "Lru/unicorn/ujin/data/realm/marketplace/Comment;", "getCommentList", "threadId", "threadType", "limit", "", "offset", "getCompany", "Lru/unicorn/ujin/data/realm/marketplace/Company;", "getCoupon", "Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "(Ljava/lang/Integer;)Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "getCouponList", "getOffer", "Lru/unicorn/ujin/data/realm/marketplace/Offer;", "getOrderedOfferList", "Lru/unicorn/ujin/data/realm/marketplace/CartOffer;", "companyId", "getPromotion", "Lru/unicorn/ujin/data/realm/marketplace/Promotion;", "getPromotionList", "getTagList", "Lru/unicorn/ujin/data/realm/marketplace/Tag;", "getUserToken", "isCartFull", "", "updateRedeemedCoupon", "couponId", "code", "Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode;", "(Ljava/lang/Integer;Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode;)Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.repository.MarketLocalRepository */
/* compiled from: MarketLocalRepository.kt */
public final class MarketLocalRepository extends BaseLocalRepository {
    public MarketLocalRepository() {
        this.realm = Realm.getDefaultInstance();
    }

    public final String getUserToken() {
        User user = (User) this.realm.where(User.class).findFirst();
        if (user != null) {
            return user.getToken();
        }
        return null;
    }

    public final Offer getOffer(String str) {
        return (Offer) this.realm.where(Offer.class).equalTo("id", str).findFirst();
    }

    public final List<Category> getCategoryList() {
        RealmResults<E> findAll = this.realm.where(Category.class).findAll();
        Intrinsics.checkNotNullExpressionValue(findAll, "realm.where(Category::class.java).findAll()");
        return findAll;
    }

    public final Category getCategory(String str) {
        Category category;
        Category category2 = (Category) this.realm.where(Category.class).equalTo("id", str).findFirst();
        if (category2 != null && (category = (Category) this.realm.copyFromRealm(category2)) != null) {
            return category;
        }
        MarketLocalRepository marketLocalRepository = this;
        return null;
    }

    public final Company getCompany(String str) {
        return (Company) this.realm.where(Company.class).equalTo("id", str).findFirst();
    }

    public final boolean isCartFull() {
        return this.realm.where(CartItem.class).findFirst() != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r5 = kotlin.collections.CollectionsKt.filterNotNull((r5 = r1.getOffers()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p035ru.unicorn.ujin.data.realm.marketplace.CartOffer> getOrderedOfferList(java.lang.String r5) {
        /*
            r4 = this;
            io.realm.Realm r0 = r4.realm
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartItem> r1 = p035ru.unicorn.ujin.data.realm.marketplace.CartItem.class
            io.realm.RealmQuery r0 = r0.where(r1)
            io.realm.RealmResults r0 = r0.findAll()
            java.lang.String r1 = "cartItemList"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            r3 = r1
            ru.unicorn.ujin.data.realm.marketplace.CartItem r3 = (p035ru.unicorn.ujin.data.realm.marketplace.CartItem) r3
            ru.unicorn.ujin.data.realm.marketplace.CartCompany r3 = r3.getCompany()
            if (r3 == 0) goto L_0x002f
            java.lang.String r2 = r3.getId()
        L_0x002f:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)
            if (r2 == 0) goto L_0x0017
            goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            ru.unicorn.ujin.data.realm.marketplace.CartItem r1 = (p035ru.unicorn.ujin.data.realm.marketplace.CartItem) r1
            if (r1 == 0) goto L_0x004a
            io.realm.RealmList r5 = r1.getOffers()
            if (r5 == 0) goto L_0x004a
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = kotlin.collections.CollectionsKt.filterNotNull(r5)
            if (r5 == 0) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L_0x004e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.repository.MarketLocalRepository.getOrderedOfferList(java.lang.String):java.util.List");
    }

    public final List<Banner> getBannerList(String str) {
        RealmResults<E> findAll = this.realm.where(Banner.class).equalTo(Banner.Fields.categoryId, str).findAll();
        Intrinsics.checkNotNullExpressionValue(findAll, "realm.where(Banner::clas…d)\n            .findAll()");
        return findAll;
    }

    public final List<Promotion> getPromotionList(String str) {
        RealmResults<E> findAll = this.realm.where(Promotion.class).equalTo("companyId", str).findAll();
        Intrinsics.checkNotNullExpressionValue(findAll, "realm.where(Promotion::c…d)\n            .findAll()");
        return findAll;
    }

    public final List<Promotion> getPromotionList(String str, int i, int i2) {
        RealmResults<E> findAll = this.realm.where(Promotion.class).equalTo("companyId", str).findAll();
        int i3 = i + i2;
        if (findAll.size() < i3) {
            Intrinsics.checkNotNullExpressionValue(findAll, "promotionList");
            return findAll;
        }
        List<Promotion> subList = findAll.subList(i2, i3);
        Intrinsics.checkNotNullExpressionValue(subList, "promotionList.subList(offset, offset + limit)");
        return subList;
    }

    public final Promotion getPromotion(String str) {
        return (Promotion) this.realm.where(Promotion.class).equalTo("id", str).findFirst();
    }

    public final List<Comment> getCommentList(String str, String str2) {
        RealmResults<E> findAll = this.realm.where(Comment.class).equalTo("threadId", str).equalTo("threadType", str2).findAll();
        Intrinsics.checkNotNullExpressionValue(findAll, "realm.where(Comment::cla…e)\n            .findAll()");
        return findAll;
    }

    public final List<Comment> getCommentList(String str, String str2, int i, int i2) {
        RealmResults<E> findAll = this.realm.where(Comment.class).equalTo("threadId", str).equalTo("threadType", str2).findAll();
        int i3 = i + i2;
        if (findAll.size() < i3) {
            Intrinsics.checkNotNullExpressionValue(findAll, "commentList");
            return findAll;
        }
        List<Comment> subList = findAll.subList(i2, i3);
        Intrinsics.checkNotNullExpressionValue(subList, "commentList.subList(offset, offset + limit)");
        return subList;
    }

    public final Comment getComment(String str) {
        return (Comment) this.realm.where(Comment.class).equalTo("id", str).findFirst();
    }

    public final List<Coupon> getCouponList() {
        RealmResults<E> findAll = this.realm.where(Coupon.class).findAll();
        if (findAll == null) {
            return CollectionsKt.emptyList();
        }
        List<Coupon> copyFromRealm = this.realm.copyFromRealm(findAll);
        Intrinsics.checkNotNullExpressionValue(copyFromRealm, "realm.copyFromRealm(it)");
        return copyFromRealm;
    }

    public final Coupon updateRedeemedCoupon(Integer num, RedeemedCode redeemedCode) {
        Coupon coupon = (Coupon) this.realm.where(Coupon.class).equalTo("id", num).findFirst();
        if (!(coupon == null || redeemedCode == null)) {
            this.realm.executeTransaction(new MarketLocalRepository$updateRedeemedCoupon$$inlined$let$lambda$1(this, redeemedCode, coupon));
        }
        return coupon;
    }

    public final Coupon getCoupon(Integer num) {
        return (Coupon) this.realm.where(Coupon.class).equalTo("id", num).findFirst();
    }

    public final List<Tag> getTagList() {
        RealmResults<E> findAll = this.realm.where(Tag.class).findAll();
        if (findAll == null) {
            return CollectionsKt.emptyList();
        }
        List<Tag> copyFromRealm = this.realm.copyFromRealm(findAll);
        Intrinsics.checkNotNullExpressionValue(copyFromRealm, "realm.copyFromRealm(it)");
        return copyFromRealm;
    }
}
