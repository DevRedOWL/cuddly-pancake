package p035ru.unicorn.ujin.market.loan;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/market/loan/GetBannerResponse;", "", "banners", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/ContextBanner;", "(Lio/realm/RealmList;)V", "getBanners", "()Lio/realm/RealmList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.loan.GetBannerResponse */
/* compiled from: GetBannerResponse.kt */
public final class GetBannerResponse {
    private final RealmList<ContextBanner> banners;

    public static /* synthetic */ GetBannerResponse copy$default(GetBannerResponse getBannerResponse, RealmList<ContextBanner> realmList, int i, Object obj) {
        if ((i & 1) != 0) {
            realmList = getBannerResponse.banners;
        }
        return getBannerResponse.copy(realmList);
    }

    public final RealmList<ContextBanner> component1() {
        return this.banners;
    }

    public final GetBannerResponse copy(RealmList<ContextBanner> realmList) {
        return new GetBannerResponse(realmList);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GetBannerResponse) && Intrinsics.areEqual((Object) this.banners, (Object) ((GetBannerResponse) obj).banners);
        }
        return true;
    }

    public int hashCode() {
        RealmList<ContextBanner> realmList = this.banners;
        if (realmList != null) {
            return realmList.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "GetBannerResponse(banners=" + this.banners + ")";
    }

    public GetBannerResponse(RealmList<ContextBanner> realmList) {
        this.banners = realmList;
    }

    public final RealmList<ContextBanner> getBanners() {
        return this.banners;
    }
}
