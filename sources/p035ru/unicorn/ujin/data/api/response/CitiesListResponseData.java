package p035ru.unicorn.ujin.data.api.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.City;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/CitiesListResponseData;", "", "token", "", "mapTitle", "cityList", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/City;", "(Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;)V", "getCityList", "()Lio/realm/RealmList;", "getMapTitle", "()Ljava/lang/String;", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.CitiesListResponseData */
/* compiled from: CitiesListResponse.kt */
public final class CitiesListResponseData {
    @SerializedName("city")
    private final RealmList<City> cityList;
    @SerializedName("map_title")
    private final String mapTitle;
    private final String token;

    public static /* synthetic */ CitiesListResponseData copy$default(CitiesListResponseData citiesListResponseData, String str, String str2, RealmList<City> realmList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = citiesListResponseData.token;
        }
        if ((i & 2) != 0) {
            str2 = citiesListResponseData.mapTitle;
        }
        if ((i & 4) != 0) {
            realmList = citiesListResponseData.cityList;
        }
        return citiesListResponseData.copy(str, str2, realmList);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.mapTitle;
    }

    public final RealmList<City> component3() {
        return this.cityList;
    }

    public final CitiesListResponseData copy(String str, String str2, RealmList<City> realmList) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "mapTitle");
        return new CitiesListResponseData(str, str2, realmList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CitiesListResponseData)) {
            return false;
        }
        CitiesListResponseData citiesListResponseData = (CitiesListResponseData) obj;
        return Intrinsics.areEqual((Object) this.token, (Object) citiesListResponseData.token) && Intrinsics.areEqual((Object) this.mapTitle, (Object) citiesListResponseData.mapTitle) && Intrinsics.areEqual((Object) this.cityList, (Object) citiesListResponseData.cityList);
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mapTitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        RealmList<City> realmList = this.cityList;
        if (realmList != null) {
            i = realmList.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CitiesListResponseData(token=" + this.token + ", mapTitle=" + this.mapTitle + ", cityList=" + this.cityList + ")";
    }

    public CitiesListResponseData(String str, String str2, RealmList<City> realmList) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "mapTitle");
        this.token = str;
        this.mapTitle = str2;
        this.cityList = realmList;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getMapTitle() {
        return this.mapTitle;
    }

    public final RealmList<City> getCityList() {
        return this.cityList;
    }
}
