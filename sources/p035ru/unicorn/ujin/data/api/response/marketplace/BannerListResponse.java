package p035ru.unicorn.ujin.data.api.response.marketplace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.Banner;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/BannerListResponse;", "", "error", "", "message", "", "data", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/marketplace/Banner;", "(ILjava/lang/String;Lio/realm/RealmList;)V", "getData", "()Lio/realm/RealmList;", "getError", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.BannerListResponse */
/* compiled from: BannerListResponse.kt */
public final class BannerListResponse {
    private final RealmList<Banner> data;
    private final int error;
    private final String message;

    public static /* synthetic */ BannerListResponse copy$default(BannerListResponse bannerListResponse, int i, String str, RealmList<Banner> realmList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bannerListResponse.error;
        }
        if ((i2 & 2) != 0) {
            str = bannerListResponse.message;
        }
        if ((i2 & 4) != 0) {
            realmList = bannerListResponse.data;
        }
        return bannerListResponse.copy(i, str, realmList);
    }

    public final int component1() {
        return this.error;
    }

    public final String component2() {
        return this.message;
    }

    public final RealmList<Banner> component3() {
        return this.data;
    }

    public final BannerListResponse copy(int i, String str, RealmList<Banner> realmList) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(realmList, "data");
        return new BannerListResponse(i, str, realmList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerListResponse)) {
            return false;
        }
        BannerListResponse bannerListResponse = (BannerListResponse) obj;
        return this.error == bannerListResponse.error && Intrinsics.areEqual((Object) this.message, (Object) bannerListResponse.message) && Intrinsics.areEqual((Object) this.data, (Object) bannerListResponse.data);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.error).hashCode() * 31;
        String str = this.message;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        RealmList<Banner> realmList = this.data;
        if (realmList != null) {
            i = realmList.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "BannerListResponse(error=" + this.error + ", message=" + this.message + ", data=" + this.data + ")";
    }

    public BannerListResponse(int i, String str, RealmList<Banner> realmList) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(realmList, "data");
        this.error = i;
        this.message = str;
        this.data = realmList;
    }

    public final int getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final RealmList<Banner> getData() {
        return this.data;
    }
}
