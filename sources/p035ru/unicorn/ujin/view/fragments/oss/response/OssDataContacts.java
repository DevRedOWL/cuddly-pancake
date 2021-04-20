package p035ru.unicorn.ujin.view.fragments.oss.response;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BY\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0002\u0010\bJ\u001d\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003Jc\u0010\u0010\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R*\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR*\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR*\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/OssDataContacts;", "", "phoneList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "emailList", "siteList", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getEmailList", "()Ljava/util/ArrayList;", "getPhoneList", "getSiteList", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.response.OssDataContacts */
/* compiled from: OssResponse.kt */
public final class OssDataContacts {
    @SerializedName("emails")
    private final ArrayList<String> emailList;
    @SerializedName("phones")
    private final ArrayList<String> phoneList;
    @SerializedName("sites")
    private final ArrayList<String> siteList;

    public static /* synthetic */ OssDataContacts copy$default(OssDataContacts ossDataContacts, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = ossDataContacts.phoneList;
        }
        if ((i & 2) != 0) {
            arrayList2 = ossDataContacts.emailList;
        }
        if ((i & 4) != 0) {
            arrayList3 = ossDataContacts.siteList;
        }
        return ossDataContacts.copy(arrayList, arrayList2, arrayList3);
    }

    public final ArrayList<String> component1() {
        return this.phoneList;
    }

    public final ArrayList<String> component2() {
        return this.emailList;
    }

    public final ArrayList<String> component3() {
        return this.siteList;
    }

    public final OssDataContacts copy(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        return new OssDataContacts(arrayList, arrayList2, arrayList3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssDataContacts)) {
            return false;
        }
        OssDataContacts ossDataContacts = (OssDataContacts) obj;
        return Intrinsics.areEqual((Object) this.phoneList, (Object) ossDataContacts.phoneList) && Intrinsics.areEqual((Object) this.emailList, (Object) ossDataContacts.emailList) && Intrinsics.areEqual((Object) this.siteList, (Object) ossDataContacts.siteList);
    }

    public int hashCode() {
        ArrayList<String> arrayList = this.phoneList;
        int i = 0;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        ArrayList<String> arrayList2 = this.emailList;
        int hashCode2 = (hashCode + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        ArrayList<String> arrayList3 = this.siteList;
        if (arrayList3 != null) {
            i = arrayList3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "OssDataContacts(phoneList=" + this.phoneList + ", emailList=" + this.emailList + ", siteList=" + this.siteList + ")";
    }

    public OssDataContacts(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        this.phoneList = arrayList;
        this.emailList = arrayList2;
        this.siteList = arrayList3;
    }

    public final ArrayList<String> getPhoneList() {
        return this.phoneList;
    }

    public final ArrayList<String> getEmailList() {
        return this.emailList;
    }

    public final ArrayList<String> getSiteList() {
        return this.siteList;
    }
}
