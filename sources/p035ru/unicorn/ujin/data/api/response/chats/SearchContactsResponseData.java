package p035ru.unicorn.ujin.data.api.response.chats;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.linphone.BuildConfig;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/chats/SearchContactsResponseData;", "", "allCount", "", "showCount", "", "debug", "contactList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/data/api/response/chats/SearchContactsResponseDataContact;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/ArrayList;)V", "getAllCount", "()Ljava/lang/String;", "getContactList", "()Ljava/util/ArrayList;", "getDebug", "getShowCount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.chats.SearchContactsResponseData */
/* compiled from: SearchContactsResponse.kt */
public final class SearchContactsResponseData {
    @SerializedName("all_count")
    private final String allCount;
    @SerializedName("contact")
    private final ArrayList<SearchContactsResponseDataContact> contactList;
    private final String debug;
    @SerializedName("show_count")
    private final int showCount;

    public static /* synthetic */ SearchContactsResponseData copy$default(SearchContactsResponseData searchContactsResponseData, String str, int i, String str2, ArrayList<SearchContactsResponseDataContact> arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = searchContactsResponseData.allCount;
        }
        if ((i2 & 2) != 0) {
            i = searchContactsResponseData.showCount;
        }
        if ((i2 & 4) != 0) {
            str2 = searchContactsResponseData.debug;
        }
        if ((i2 & 8) != 0) {
            arrayList = searchContactsResponseData.contactList;
        }
        return searchContactsResponseData.copy(str, i, str2, arrayList);
    }

    public final String component1() {
        return this.allCount;
    }

    public final int component2() {
        return this.showCount;
    }

    public final String component3() {
        return this.debug;
    }

    public final ArrayList<SearchContactsResponseDataContact> component4() {
        return this.contactList;
    }

    public final SearchContactsResponseData copy(String str, int i, String str2, ArrayList<SearchContactsResponseDataContact> arrayList) {
        Intrinsics.checkNotNullParameter(str, "allCount");
        Intrinsics.checkNotNullParameter(str2, BuildConfig.BUILD_TYPE);
        Intrinsics.checkNotNullParameter(arrayList, "contactList");
        return new SearchContactsResponseData(str, i, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchContactsResponseData)) {
            return false;
        }
        SearchContactsResponseData searchContactsResponseData = (SearchContactsResponseData) obj;
        return Intrinsics.areEqual((Object) this.allCount, (Object) searchContactsResponseData.allCount) && this.showCount == searchContactsResponseData.showCount && Intrinsics.areEqual((Object) this.debug, (Object) searchContactsResponseData.debug) && Intrinsics.areEqual((Object) this.contactList, (Object) searchContactsResponseData.contactList);
    }

    public int hashCode() {
        String str = this.allCount;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.showCount).hashCode()) * 31;
        String str2 = this.debug;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ArrayList<SearchContactsResponseDataContact> arrayList = this.contactList;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "SearchContactsResponseData(allCount=" + this.allCount + ", showCount=" + this.showCount + ", debug=" + this.debug + ", contactList=" + this.contactList + ")";
    }

    public SearchContactsResponseData(String str, int i, String str2, ArrayList<SearchContactsResponseDataContact> arrayList) {
        Intrinsics.checkNotNullParameter(str, "allCount");
        Intrinsics.checkNotNullParameter(str2, BuildConfig.BUILD_TYPE);
        Intrinsics.checkNotNullParameter(arrayList, "contactList");
        this.allCount = str;
        this.showCount = i;
        this.debug = str2;
        this.contactList = arrayList;
    }

    public final String getAllCount() {
        return this.allCount;
    }

    public final int getShowCount() {
        return this.showCount;
    }

    public final String getDebug() {
        return this.debug;
    }

    public final ArrayList<SearchContactsResponseDataContact> getContactList() {
        return this.contactList;
    }
}
