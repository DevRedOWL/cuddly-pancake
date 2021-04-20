package p035ru.unicorn.ujin.view.fragments.oss.response;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\b\u0018\u00002\u00020\u0001B\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0015J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0019\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00101\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001eR&\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019¨\u00065"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/OssData;", "", "id", "", "title", "", "description", "detailedDescription", "startDate", "endDate", "isVoted", "", "isVerified", "isArchived", "questionList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/oss/response/OssQuestion;", "Lkotlin/collections/ArrayList;", "contacts", "Lru/unicorn/ujin/view/fragments/oss/response/OssDataContacts;", "status", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/ArrayList;Lru/unicorn/ujin/view/fragments/oss/response/OssDataContacts;Ljava/lang/String;)V", "getContacts", "()Lru/unicorn/ujin/view/fragments/oss/response/OssDataContacts;", "getDescription", "()Ljava/lang/String;", "getDetailedDescription", "getEndDate", "getId", "()I", "()Z", "getQuestionList", "()Ljava/util/ArrayList;", "getStartDate", "getStatus", "getTitle", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.response.OssData */
/* compiled from: OssResponse.kt */
public final class OssData {
    private final OssDataContacts contacts;
    private final String description;
    @SerializedName("detailed_information")
    private final String detailedDescription;
    @SerializedName("end_date")
    private final String endDate;

    /* renamed from: id */
    private final int f6932id;
    @SerializedName("is_archived")
    private final boolean isArchived;
    @SerializedName("is_verified")
    private final boolean isVerified;
    @SerializedName("is_voted")
    private final boolean isVoted;
    @SerializedName("questions")
    private final ArrayList<OssQuestion> questionList;
    @SerializedName("start_date")
    private final String startDate;
    private final String status;
    @SerializedName("title")
    private final String title;

    public static /* synthetic */ OssData copy$default(OssData ossData, int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, ArrayList arrayList, OssDataContacts ossDataContacts, String str6, int i2, Object obj) {
        OssData ossData2 = ossData;
        int i3 = i2;
        return ossData.copy((i3 & 1) != 0 ? ossData2.f6932id : i, (i3 & 2) != 0 ? ossData2.title : str, (i3 & 4) != 0 ? ossData2.description : str2, (i3 & 8) != 0 ? ossData2.detailedDescription : str3, (i3 & 16) != 0 ? ossData2.startDate : str4, (i3 & 32) != 0 ? ossData2.endDate : str5, (i3 & 64) != 0 ? ossData2.isVoted : z, (i3 & 128) != 0 ? ossData2.isVerified : z2, (i3 & 256) != 0 ? ossData2.isArchived : z3, (i3 & 512) != 0 ? ossData2.questionList : arrayList, (i3 & 1024) != 0 ? ossData2.contacts : ossDataContacts, (i3 & 2048) != 0 ? ossData2.status : str6);
    }

    public final int component1() {
        return this.f6932id;
    }

    public final ArrayList<OssQuestion> component10() {
        return this.questionList;
    }

    public final OssDataContacts component11() {
        return this.contacts;
    }

    public final String component12() {
        return this.status;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.detailedDescription;
    }

    public final String component5() {
        return this.startDate;
    }

    public final String component6() {
        return this.endDate;
    }

    public final boolean component7() {
        return this.isVoted;
    }

    public final boolean component8() {
        return this.isVerified;
    }

    public final boolean component9() {
        return this.isArchived;
    }

    public final OssData copy(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, ArrayList<OssQuestion> arrayList, OssDataContacts ossDataContacts, String str6) {
        String str7 = str4;
        Intrinsics.checkNotNullParameter(str7, "startDate");
        String str8 = str5;
        Intrinsics.checkNotNullParameter(str8, "endDate");
        ArrayList<OssQuestion> arrayList2 = arrayList;
        Intrinsics.checkNotNullParameter(arrayList2, "questionList");
        return new OssData(i, str, str2, str3, str7, str8, z, z2, z3, arrayList2, ossDataContacts, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssData)) {
            return false;
        }
        OssData ossData = (OssData) obj;
        return this.f6932id == ossData.f6932id && Intrinsics.areEqual((Object) this.title, (Object) ossData.title) && Intrinsics.areEqual((Object) this.description, (Object) ossData.description) && Intrinsics.areEqual((Object) this.detailedDescription, (Object) ossData.detailedDescription) && Intrinsics.areEqual((Object) this.startDate, (Object) ossData.startDate) && Intrinsics.areEqual((Object) this.endDate, (Object) ossData.endDate) && this.isVoted == ossData.isVoted && this.isVerified == ossData.isVerified && this.isArchived == ossData.isArchived && Intrinsics.areEqual((Object) this.questionList, (Object) ossData.questionList) && Intrinsics.areEqual((Object) this.contacts, (Object) ossData.contacts) && Intrinsics.areEqual((Object) this.status, (Object) ossData.status);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6932id).hashCode() * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.detailedDescription;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.startDate;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.endDate;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.isVoted;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        boolean z2 = this.isVerified;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.isArchived;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        ArrayList<OssQuestion> arrayList = this.questionList;
        int hashCode7 = (i4 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        OssDataContacts ossDataContacts = this.contacts;
        int hashCode8 = (hashCode7 + (ossDataContacts != null ? ossDataContacts.hashCode() : 0)) * 31;
        String str6 = this.status;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        return "OssData(id=" + this.f6932id + ", title=" + this.title + ", description=" + this.description + ", detailedDescription=" + this.detailedDescription + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", isVoted=" + this.isVoted + ", isVerified=" + this.isVerified + ", isArchived=" + this.isArchived + ", questionList=" + this.questionList + ", contacts=" + this.contacts + ", status=" + this.status + ")";
    }

    public OssData(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, ArrayList<OssQuestion> arrayList, OssDataContacts ossDataContacts, String str6) {
        Intrinsics.checkNotNullParameter(str4, "startDate");
        Intrinsics.checkNotNullParameter(str5, "endDate");
        Intrinsics.checkNotNullParameter(arrayList, "questionList");
        this.f6932id = i;
        this.title = str;
        this.description = str2;
        this.detailedDescription = str3;
        this.startDate = str4;
        this.endDate = str5;
        this.isVoted = z;
        this.isVerified = z2;
        this.isArchived = z3;
        this.questionList = arrayList;
        this.contacts = ossDataContacts;
        this.status = str6;
    }

    public final int getId() {
        return this.f6932id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDetailedDescription() {
        return this.detailedDescription;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final boolean isVoted() {
        return this.isVoted;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public final boolean isArchived() {
        return this.isArchived;
    }

    public final ArrayList<OssQuestion> getQuestionList() {
        return this.questionList;
    }

    public final OssDataContacts getContacts() {
        return this.contacts;
    }

    public final String getStatus() {
        return this.status;
    }
}
