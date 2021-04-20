package p035ru.unicorn.ujin.view.fragments.oss.response;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u0019\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R&\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/OssQuestion;", "", "id", "", "question", "", "proposal", "type", "Lru/unicorn/ujin/view/fragments/oss/response/OssQuestionType;", "answerList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/oss/response/OssAnswer;", "Lkotlin/collections/ArrayList;", "(ILjava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/oss/response/OssQuestionType;Ljava/util/ArrayList;)V", "getAnswerList", "()Ljava/util/ArrayList;", "getId", "()I", "getProposal", "()Ljava/lang/String;", "getQuestion", "getType", "()Lru/unicorn/ujin/view/fragments/oss/response/OssQuestionType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.response.OssQuestion */
/* compiled from: OssResponse.kt */
public final class OssQuestion {
    @SerializedName("variants")
    private final ArrayList<OssAnswer> answerList;

    /* renamed from: id */
    private final int f6933id;
    private final String proposal;
    private final String question;
    private final OssQuestionType type;

    public static /* synthetic */ OssQuestion copy$default(OssQuestion ossQuestion, int i, String str, String str2, OssQuestionType ossQuestionType, ArrayList<OssAnswer> arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ossQuestion.f6933id;
        }
        if ((i2 & 2) != 0) {
            str = ossQuestion.question;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = ossQuestion.proposal;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            ossQuestionType = ossQuestion.type;
        }
        OssQuestionType ossQuestionType2 = ossQuestionType;
        if ((i2 & 16) != 0) {
            arrayList = ossQuestion.answerList;
        }
        return ossQuestion.copy(i, str3, str4, ossQuestionType2, arrayList);
    }

    public final int component1() {
        return this.f6933id;
    }

    public final String component2() {
        return this.question;
    }

    public final String component3() {
        return this.proposal;
    }

    public final OssQuestionType component4() {
        return this.type;
    }

    public final ArrayList<OssAnswer> component5() {
        return this.answerList;
    }

    public final OssQuestion copy(int i, String str, String str2, OssQuestionType ossQuestionType, ArrayList<OssAnswer> arrayList) {
        Intrinsics.checkNotNullParameter(str, "question");
        Intrinsics.checkNotNullParameter(ossQuestionType, "type");
        Intrinsics.checkNotNullParameter(arrayList, "answerList");
        return new OssQuestion(i, str, str2, ossQuestionType, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssQuestion)) {
            return false;
        }
        OssQuestion ossQuestion = (OssQuestion) obj;
        return this.f6933id == ossQuestion.f6933id && Intrinsics.areEqual((Object) this.question, (Object) ossQuestion.question) && Intrinsics.areEqual((Object) this.proposal, (Object) ossQuestion.proposal) && Intrinsics.areEqual((Object) this.type, (Object) ossQuestion.type) && Intrinsics.areEqual((Object) this.answerList, (Object) ossQuestion.answerList);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6933id).hashCode() * 31;
        String str = this.question;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.proposal;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        OssQuestionType ossQuestionType = this.type;
        int hashCode4 = (hashCode3 + (ossQuestionType != null ? ossQuestionType.hashCode() : 0)) * 31;
        ArrayList<OssAnswer> arrayList = this.answerList;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "OssQuestion(id=" + this.f6933id + ", question=" + this.question + ", proposal=" + this.proposal + ", type=" + this.type + ", answerList=" + this.answerList + ")";
    }

    public OssQuestion(int i, String str, String str2, OssQuestionType ossQuestionType, ArrayList<OssAnswer> arrayList) {
        Intrinsics.checkNotNullParameter(str, "question");
        Intrinsics.checkNotNullParameter(ossQuestionType, "type");
        Intrinsics.checkNotNullParameter(arrayList, "answerList");
        this.f6933id = i;
        this.question = str;
        this.proposal = str2;
        this.type = ossQuestionType;
        this.answerList = arrayList;
    }

    public final int getId() {
        return this.f6933id;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getProposal() {
        return this.proposal;
    }

    public final OssQuestionType getType() {
        return this.type;
    }

    public final ArrayList<OssAnswer> getAnswerList() {
        return this.answerList;
    }
}
