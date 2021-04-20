package p035ru.unicorn.ujin.data.api.response.marketplace;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/OfferData;", "", "id", "", "title", "price", "quantity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPrice", "getQuantity", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.OfferData */
/* compiled from: CreateOrderResponse.kt */
public final class OfferData {

    /* renamed from: id */
    private final String f6619id;
    private final String price;
    private final String quantity;
    private final String title;

    public static /* synthetic */ OfferData copy$default(OfferData offerData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offerData.f6619id;
        }
        if ((i & 2) != 0) {
            str2 = offerData.title;
        }
        if ((i & 4) != 0) {
            str3 = offerData.price;
        }
        if ((i & 8) != 0) {
            str4 = offerData.quantity;
        }
        return offerData.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f6619id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.price;
    }

    public final String component4() {
        return this.quantity;
    }

    public final OfferData copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "price");
        Intrinsics.checkNotNullParameter(str4, FirebaseAnalytics.Param.QUANTITY);
        return new OfferData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferData)) {
            return false;
        }
        OfferData offerData = (OfferData) obj;
        return Intrinsics.areEqual((Object) this.f6619id, (Object) offerData.f6619id) && Intrinsics.areEqual((Object) this.title, (Object) offerData.title) && Intrinsics.areEqual((Object) this.price, (Object) offerData.price) && Intrinsics.areEqual((Object) this.quantity, (Object) offerData.quantity);
    }

    public int hashCode() {
        String str = this.f6619id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.price;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.quantity;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "OfferData(id=" + this.f6619id + ", title=" + this.title + ", price=" + this.price + ", quantity=" + this.quantity + ")";
    }

    public OfferData(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "price");
        Intrinsics.checkNotNullParameter(str4, FirebaseAnalytics.Param.QUANTITY);
        this.f6619id = str;
        this.title = str2;
        this.price = str3;
        this.quantity = str4;
    }

    public final String getId() {
        return this.f6619id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getQuantity() {
        return this.quantity;
    }
}
