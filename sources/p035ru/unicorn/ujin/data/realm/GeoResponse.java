package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/GeoResponse;", "", "nextSessionInSeconds", "", "nextPassiveInMeters", "nextActiveInMeters", "(III)V", "getNextActiveInMeters", "()I", "setNextActiveInMeters", "(I)V", "getNextPassiveInMeters", "setNextPassiveInMeters", "getNextSessionInSeconds", "setNextSessionInSeconds", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.GeoResponse */
/* compiled from: GeoResponse.kt */
public final class GeoResponse {
    @SerializedName("distance_active")
    private int nextActiveInMeters;
    @SerializedName("distance_passive")
    private int nextPassiveInMeters;
    @SerializedName("time")
    private int nextSessionInSeconds;

    public static /* synthetic */ GeoResponse copy$default(GeoResponse geoResponse, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = geoResponse.nextSessionInSeconds;
        }
        if ((i4 & 2) != 0) {
            i2 = geoResponse.nextPassiveInMeters;
        }
        if ((i4 & 4) != 0) {
            i3 = geoResponse.nextActiveInMeters;
        }
        return geoResponse.copy(i, i2, i3);
    }

    public final int component1() {
        return this.nextSessionInSeconds;
    }

    public final int component2() {
        return this.nextPassiveInMeters;
    }

    public final int component3() {
        return this.nextActiveInMeters;
    }

    public final GeoResponse copy(int i, int i2, int i3) {
        return new GeoResponse(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoResponse)) {
            return false;
        }
        GeoResponse geoResponse = (GeoResponse) obj;
        return this.nextSessionInSeconds == geoResponse.nextSessionInSeconds && this.nextPassiveInMeters == geoResponse.nextPassiveInMeters && this.nextActiveInMeters == geoResponse.nextActiveInMeters;
    }

    public int hashCode() {
        return (((Integer.valueOf(this.nextSessionInSeconds).hashCode() * 31) + Integer.valueOf(this.nextPassiveInMeters).hashCode()) * 31) + Integer.valueOf(this.nextActiveInMeters).hashCode();
    }

    public String toString() {
        return "GeoResponse(nextSessionInSeconds=" + this.nextSessionInSeconds + ", nextPassiveInMeters=" + this.nextPassiveInMeters + ", nextActiveInMeters=" + this.nextActiveInMeters + ")";
    }

    public GeoResponse(int i, int i2, int i3) {
        this.nextSessionInSeconds = i;
        this.nextPassiveInMeters = i2;
        this.nextActiveInMeters = i3;
    }

    public final int getNextSessionInSeconds() {
        return this.nextSessionInSeconds;
    }

    public final void setNextSessionInSeconds(int i) {
        this.nextSessionInSeconds = i;
    }

    public final int getNextPassiveInMeters() {
        return this.nextPassiveInMeters;
    }

    public final void setNextPassiveInMeters(int i) {
        this.nextPassiveInMeters = i;
    }

    public final int getNextActiveInMeters() {
        return this.nextActiveInMeters;
    }

    public final void setNextActiveInMeters(int i) {
        this.nextActiveInMeters = i;
    }
}
