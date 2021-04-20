package p035ru.unicorn.ujin.data.api.response.marketplace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.Promotion;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ*\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/PromotionListResponseData;", "", "promotions", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/marketplace/Promotion;", "totalCount", "", "(Lio/realm/RealmList;Ljava/lang/Integer;)V", "getPromotions", "()Lio/realm/RealmList;", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lio/realm/RealmList;Ljava/lang/Integer;)Lru/unicorn/ujin/data/api/response/marketplace/PromotionListResponseData;", "equals", "", "other", "hashCode", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.PromotionListResponseData */
/* compiled from: PromotionListResponse.kt */
public final class PromotionListResponseData {
    private final RealmList<Promotion> promotions;
    private final Integer totalCount;

    public static /* synthetic */ PromotionListResponseData copy$default(PromotionListResponseData promotionListResponseData, RealmList<Promotion> realmList, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            realmList = promotionListResponseData.promotions;
        }
        if ((i & 2) != 0) {
            num = promotionListResponseData.totalCount;
        }
        return promotionListResponseData.copy(realmList, num);
    }

    public final RealmList<Promotion> component1() {
        return this.promotions;
    }

    public final Integer component2() {
        return this.totalCount;
    }

    public final PromotionListResponseData copy(RealmList<Promotion> realmList, Integer num) {
        Intrinsics.checkNotNullParameter(realmList, "promotions");
        return new PromotionListResponseData(realmList, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionListResponseData)) {
            return false;
        }
        PromotionListResponseData promotionListResponseData = (PromotionListResponseData) obj;
        return Intrinsics.areEqual((Object) this.promotions, (Object) promotionListResponseData.promotions) && Intrinsics.areEqual((Object) this.totalCount, (Object) promotionListResponseData.totalCount);
    }

    public int hashCode() {
        RealmList<Promotion> realmList = this.promotions;
        int i = 0;
        int hashCode = (realmList != null ? realmList.hashCode() : 0) * 31;
        Integer num = this.totalCount;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "PromotionListResponseData(promotions=" + this.promotions + ", totalCount=" + this.totalCount + ")";
    }

    public PromotionListResponseData(RealmList<Promotion> realmList, Integer num) {
        Intrinsics.checkNotNullParameter(realmList, "promotions");
        this.promotions = realmList;
        this.totalCount = num;
    }

    public final RealmList<Promotion> getPromotions() {
        return this.promotions;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }
}
