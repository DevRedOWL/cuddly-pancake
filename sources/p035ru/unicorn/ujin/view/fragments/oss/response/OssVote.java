package p035ru.unicorn.ujin.view.fragments.oss.response;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R&\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/OssVote;", "", "voteId", "", "answerList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/oss/response/OssVoteAnswer;", "Lkotlin/collections/ArrayList;", "(ILjava/util/ArrayList;)V", "getAnswerList", "()Ljava/util/ArrayList;", "getVoteId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.response.OssVote */
/* compiled from: OssVoteAnswer.kt */
public final class OssVote {
    @SerializedName("answers")
    private final ArrayList<OssVoteAnswer> answerList;
    @SerializedName("vote_id")
    private final int voteId;

    public static /* synthetic */ OssVote copy$default(OssVote ossVote, int i, ArrayList<OssVoteAnswer> arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ossVote.voteId;
        }
        if ((i2 & 2) != 0) {
            arrayList = ossVote.answerList;
        }
        return ossVote.copy(i, arrayList);
    }

    public final int component1() {
        return this.voteId;
    }

    public final ArrayList<OssVoteAnswer> component2() {
        return this.answerList;
    }

    public final OssVote copy(int i, ArrayList<OssVoteAnswer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "answerList");
        return new OssVote(i, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssVote)) {
            return false;
        }
        OssVote ossVote = (OssVote) obj;
        return this.voteId == ossVote.voteId && Intrinsics.areEqual((Object) this.answerList, (Object) ossVote.answerList);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.voteId).hashCode() * 31;
        ArrayList<OssVoteAnswer> arrayList = this.answerList;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public String toString() {
        return "OssVote(voteId=" + this.voteId + ", answerList=" + this.answerList + ")";
    }

    public OssVote(int i, ArrayList<OssVoteAnswer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "answerList");
        this.voteId = i;
        this.answerList = arrayList;
    }

    public final int getVoteId() {
        return this.voteId;
    }

    public final ArrayList<OssVoteAnswer> getAnswerList() {
        return this.answerList;
    }
}
