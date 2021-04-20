package p035ru.unicorn.ujin.view.fragments.oss.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/OssGetSms;", "", "voteId", "", "(I)V", "getVoteId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.response.OssGetSms */
/* compiled from: OssGetSms.kt */
public final class OssGetSms {
    @SerializedName("vote_id")
    private final int voteId;

    public static /* synthetic */ OssGetSms copy$default(OssGetSms ossGetSms, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ossGetSms.voteId;
        }
        return ossGetSms.copy(i);
    }

    public final int component1() {
        return this.voteId;
    }

    public final OssGetSms copy(int i) {
        return new OssGetSms(i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OssGetSms) && this.voteId == ((OssGetSms) obj).voteId;
        }
        return true;
    }

    public int hashCode() {
        return Integer.valueOf(this.voteId).hashCode();
    }

    public String toString() {
        return "OssGetSms(voteId=" + this.voteId + ")";
    }

    public OssGetSms(int i) {
        this.voteId = i;
    }

    public final int getVoteId() {
        return this.voteId;
    }
}
