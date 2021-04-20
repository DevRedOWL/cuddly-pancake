package p035ru.unicorn.ujin.data.api.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Favourite;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/FavouritesListResponseData;", "", "token", "", "favouriteList", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/Favourite;", "ending", "root", "(Ljava/lang/String;Lio/realm/RealmList;Ljava/lang/String;Ljava/lang/String;)V", "getEnding", "()Ljava/lang/String;", "getFavouriteList", "()Lio/realm/RealmList;", "getRoot", "getToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.FavouritesListResponseData */
/* compiled from: FavouritesListResponse.kt */
public final class FavouritesListResponseData {
    private final String ending;
    @SerializedName("flat")
    private final RealmList<Favourite> favouriteList;
    private final String root;
    private final String token;

    public static /* synthetic */ FavouritesListResponseData copy$default(FavouritesListResponseData favouritesListResponseData, String str, RealmList<Favourite> realmList, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = favouritesListResponseData.token;
        }
        if ((i & 2) != 0) {
            realmList = favouritesListResponseData.favouriteList;
        }
        if ((i & 4) != 0) {
            str2 = favouritesListResponseData.ending;
        }
        if ((i & 8) != 0) {
            str3 = favouritesListResponseData.root;
        }
        return favouritesListResponseData.copy(str, realmList, str2, str3);
    }

    public final String component1() {
        return this.token;
    }

    public final RealmList<Favourite> component2() {
        return this.favouriteList;
    }

    public final String component3() {
        return this.ending;
    }

    public final String component4() {
        return this.root;
    }

    public final FavouritesListResponseData copy(String str, RealmList<Favourite> realmList, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "ending");
        Intrinsics.checkNotNullParameter(str3, "root");
        return new FavouritesListResponseData(str, realmList, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavouritesListResponseData)) {
            return false;
        }
        FavouritesListResponseData favouritesListResponseData = (FavouritesListResponseData) obj;
        return Intrinsics.areEqual((Object) this.token, (Object) favouritesListResponseData.token) && Intrinsics.areEqual((Object) this.favouriteList, (Object) favouritesListResponseData.favouriteList) && Intrinsics.areEqual((Object) this.ending, (Object) favouritesListResponseData.ending) && Intrinsics.areEqual((Object) this.root, (Object) favouritesListResponseData.root);
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        RealmList<Favourite> realmList = this.favouriteList;
        int hashCode2 = (hashCode + (realmList != null ? realmList.hashCode() : 0)) * 31;
        String str2 = this.ending;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.root;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "FavouritesListResponseData(token=" + this.token + ", favouriteList=" + this.favouriteList + ", ending=" + this.ending + ", root=" + this.root + ")";
    }

    public FavouritesListResponseData(String str, RealmList<Favourite> realmList, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "ending");
        Intrinsics.checkNotNullParameter(str3, "root");
        this.token = str;
        this.favouriteList = realmList;
        this.ending = str2;
        this.root = str3;
    }

    public final String getToken() {
        return this.token;
    }

    public final RealmList<Favourite> getFavouriteList() {
        return this.favouriteList;
    }

    public final String getEnding() {
        return this.ending;
    }

    public final String getRoot() {
        return this.root;
    }
}
