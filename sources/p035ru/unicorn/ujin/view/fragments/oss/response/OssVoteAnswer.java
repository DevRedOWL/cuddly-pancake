package p035ru.unicorn.ujin.view.fragments.oss.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/OssVoteAnswer;", "", "questionId", "", "answerId", "(II)V", "getAnswerId", "()I", "setAnswerId", "(I)V", "getQuestionId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.response.OssVoteAnswer */
/* compiled from: OssVoteAnswer.kt */
public final class OssVoteAnswer {
    @SerializedName("variant_id")
    private int answerId;
    @SerializedName("question_id")
    private final int questionId;

    public static /* synthetic */ OssVoteAnswer copy$default(OssVoteAnswer ossVoteAnswer, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ossVoteAnswer.questionId;
        }
        if ((i3 & 2) != 0) {
            i2 = ossVoteAnswer.answerId;
        }
        return ossVoteAnswer.copy(i, i2);
    }

    public final int component1() {
        return this.questionId;
    }

    public final int component2() {
        return this.answerId;
    }

    public final OssVoteAnswer copy(int i, int i2) {
        return new OssVoteAnswer(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssVoteAnswer)) {
            return false;
        }
        OssVoteAnswer ossVoteAnswer = (OssVoteAnswer) obj;
        return this.questionId == ossVoteAnswer.questionId && this.answerId == ossVoteAnswer.answerId;
    }

    public int hashCode() {
        return (Integer.valueOf(this.questionId).hashCode() * 31) + Integer.valueOf(this.answerId).hashCode();
    }

    public String toString() {
        return "OssVoteAnswer(questionId=" + this.questionId + ", answerId=" + this.answerId + ")";
    }

    public OssVoteAnswer(int i, int i2) {
        this.questionId = i;
        this.answerId = i2;
    }

    public final int getQuestionId() {
        return this.questionId;
    }

    public final int getAnswerId() {
        return this.answerId;
    }

    public final void setAnswerId(int i) {
        this.answerId = i;
    }
}
