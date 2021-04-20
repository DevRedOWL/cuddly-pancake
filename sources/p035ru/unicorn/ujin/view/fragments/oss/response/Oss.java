package p035ru.unicorn.ujin.view.fragments.oss.response;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b \b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0002\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J}\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0016R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006+"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "", "id", "", "title", "", "description", "statusTitle", "startDate", "endDate", "isVoted", "", "isVerified", "isActive", "status", "isArchived", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Z)V", "getDescription", "()Ljava/lang/String;", "getEndDate", "getId", "()I", "()Z", "getStartDate", "getStatus", "getStatusTitle", "getTitle", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.response.Oss */
/* compiled from: OssListResponse.kt */
public final class Oss {
    private final String description;
    @SerializedName("end_date")
    private final String endDate;

    /* renamed from: id */
    private final int f6930id;
    @SerializedName("is_active")
    private final boolean isActive;
    @SerializedName("is_archived")
    private final boolean isArchived;
    @SerializedName("is_verified")
    private final boolean isVerified;
    @SerializedName("is_voted")
    private final boolean isVoted;
    @SerializedName("start_date")
    private final String startDate;
    private final String status;
    @SerializedName("status_title")
    private final String statusTitle;
    @SerializedName("title")
    private final String title;

    public static /* synthetic */ Oss copy$default(Oss oss, int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, boolean z4, int i2, Object obj) {
        Oss oss2 = oss;
        int i3 = i2;
        return oss.copy((i3 & 1) != 0 ? oss2.f6930id : i, (i3 & 2) != 0 ? oss2.title : str, (i3 & 4) != 0 ? oss2.description : str2, (i3 & 8) != 0 ? oss2.statusTitle : str3, (i3 & 16) != 0 ? oss2.startDate : str4, (i3 & 32) != 0 ? oss2.endDate : str5, (i3 & 64) != 0 ? oss2.isVoted : z, (i3 & 128) != 0 ? oss2.isVerified : z2, (i3 & 256) != 0 ? oss2.isActive : z3, (i3 & 512) != 0 ? oss2.status : str6, (i3 & 1024) != 0 ? oss2.isArchived : z4);
    }

    public final int component1() {
        return this.f6930id;
    }

    public final String component10() {
        return this.status;
    }

    public final boolean component11() {
        return this.isArchived;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.statusTitle;
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
        return this.isActive;
    }

    public final Oss copy(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, boolean z4) {
        String str7 = str4;
        Intrinsics.checkNotNullParameter(str7, "startDate");
        String str8 = str5;
        Intrinsics.checkNotNullParameter(str8, "endDate");
        String str9 = str6;
        Intrinsics.checkNotNullParameter(str9, NotificationCompat.CATEGORY_STATUS);
        return new Oss(i, str, str2, str3, str7, str8, z, z2, z3, str9, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oss)) {
            return false;
        }
        Oss oss = (Oss) obj;
        return this.f6930id == oss.f6930id && Intrinsics.areEqual((Object) this.title, (Object) oss.title) && Intrinsics.areEqual((Object) this.description, (Object) oss.description) && Intrinsics.areEqual((Object) this.statusTitle, (Object) oss.statusTitle) && Intrinsics.areEqual((Object) this.startDate, (Object) oss.startDate) && Intrinsics.areEqual((Object) this.endDate, (Object) oss.endDate) && this.isVoted == oss.isVoted && this.isVerified == oss.isVerified && this.isActive == oss.isActive && Intrinsics.areEqual((Object) this.status, (Object) oss.status) && this.isArchived == oss.isArchived;
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6930id).hashCode() * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.statusTitle;
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
        boolean z3 = this.isActive;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        String str6 = this.status;
        if (str6 != null) {
            i = str6.hashCode();
        }
        int i5 = (i4 + i) * 31;
        boolean z4 = this.isArchived;
        if (z4) {
            z4 = true;
        }
        return i5 + (z4 ? 1 : 0);
    }

    public String toString() {
        return "Oss(id=" + this.f6930id + ", title=" + this.title + ", description=" + this.description + ", statusTitle=" + this.statusTitle + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", isVoted=" + this.isVoted + ", isVerified=" + this.isVerified + ", isActive=" + this.isActive + ", status=" + this.status + ", isArchived=" + this.isArchived + ")";
    }

    public Oss(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, boolean z4) {
        Intrinsics.checkNotNullParameter(str4, "startDate");
        Intrinsics.checkNotNullParameter(str5, "endDate");
        Intrinsics.checkNotNullParameter(str6, NotificationCompat.CATEGORY_STATUS);
        this.f6930id = i;
        this.title = str;
        this.description = str2;
        this.statusTitle = str3;
        this.startDate = str4;
        this.endDate = str5;
        this.isVoted = z;
        this.isVerified = z2;
        this.isActive = z3;
        this.status = str6;
        this.isArchived = z4;
    }

    public final int getId() {
        return this.f6930id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getStatusTitle() {
        return this.statusTitle;
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

    public final boolean isActive() {
        return this.isActive;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean isArchived() {
        return this.isArchived;
    }
}
