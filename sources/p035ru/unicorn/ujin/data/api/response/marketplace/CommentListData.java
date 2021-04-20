package p035ru.unicorn.ujin.data.api.response.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.Comment;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/CommentListData;", "", "threadId", "", "threadType", "limit", "offset", "totalComments", "order", "comments", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/marketplace/Comment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;)V", "getComments", "()Lio/realm/RealmList;", "getLimit", "()Ljava/lang/String;", "getOffset", "getOrder", "getThreadId", "getThreadType", "getTotalComments", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.CommentListData */
/* compiled from: CommentListResponse.kt */
public final class CommentListData {
    private final RealmList<Comment> comments;
    private final String limit;
    private final String offset;
    private final String order;
    @SerializedName("thread_id")
    private final String threadId;
    @SerializedName("thread_type")
    private final String threadType;
    @SerializedName("total_comments")
    private final String totalComments;

    public static /* synthetic */ CommentListData copy$default(CommentListData commentListData, String str, String str2, String str3, String str4, String str5, String str6, RealmList<Comment> realmList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commentListData.threadId;
        }
        if ((i & 2) != 0) {
            str2 = commentListData.threadType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = commentListData.limit;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = commentListData.offset;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = commentListData.totalComments;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = commentListData.order;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            realmList = commentListData.comments;
        }
        return commentListData.copy(str, str7, str8, str9, str10, str11, realmList);
    }

    public final String component1() {
        return this.threadId;
    }

    public final String component2() {
        return this.threadType;
    }

    public final String component3() {
        return this.limit;
    }

    public final String component4() {
        return this.offset;
    }

    public final String component5() {
        return this.totalComments;
    }

    public final String component6() {
        return this.order;
    }

    public final RealmList<Comment> component7() {
        return this.comments;
    }

    public final CommentListData copy(String str, String str2, String str3, String str4, String str5, String str6, RealmList<Comment> realmList) {
        Intrinsics.checkNotNullParameter(str, "threadId");
        Intrinsics.checkNotNullParameter(str2, "threadType");
        Intrinsics.checkNotNullParameter(str3, "limit");
        Intrinsics.checkNotNullParameter(str4, "offset");
        Intrinsics.checkNotNullParameter(str6, "order");
        RealmList<Comment> realmList2 = realmList;
        Intrinsics.checkNotNullParameter(realmList2, "comments");
        return new CommentListData(str, str2, str3, str4, str5, str6, realmList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentListData)) {
            return false;
        }
        CommentListData commentListData = (CommentListData) obj;
        return Intrinsics.areEqual((Object) this.threadId, (Object) commentListData.threadId) && Intrinsics.areEqual((Object) this.threadType, (Object) commentListData.threadType) && Intrinsics.areEqual((Object) this.limit, (Object) commentListData.limit) && Intrinsics.areEqual((Object) this.offset, (Object) commentListData.offset) && Intrinsics.areEqual((Object) this.totalComments, (Object) commentListData.totalComments) && Intrinsics.areEqual((Object) this.order, (Object) commentListData.order) && Intrinsics.areEqual((Object) this.comments, (Object) commentListData.comments);
    }

    public int hashCode() {
        String str = this.threadId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.threadType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.limit;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.offset;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.totalComments;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.order;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        RealmList<Comment> realmList = this.comments;
        if (realmList != null) {
            i = realmList.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "CommentListData(threadId=" + this.threadId + ", threadType=" + this.threadType + ", limit=" + this.limit + ", offset=" + this.offset + ", totalComments=" + this.totalComments + ", order=" + this.order + ", comments=" + this.comments + ")";
    }

    public CommentListData(String str, String str2, String str3, String str4, String str5, String str6, RealmList<Comment> realmList) {
        Intrinsics.checkNotNullParameter(str, "threadId");
        Intrinsics.checkNotNullParameter(str2, "threadType");
        Intrinsics.checkNotNullParameter(str3, "limit");
        Intrinsics.checkNotNullParameter(str4, "offset");
        Intrinsics.checkNotNullParameter(str6, "order");
        Intrinsics.checkNotNullParameter(realmList, "comments");
        this.threadId = str;
        this.threadType = str2;
        this.limit = str3;
        this.offset = str4;
        this.totalComments = str5;
        this.order = str6;
        this.comments = realmList;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public final String getThreadType() {
        return this.threadType;
    }

    public final String getLimit() {
        return this.limit;
    }

    public final String getOffset() {
        return this.offset;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentListData(String str, String str2, String str3, String str4, String str5, String str6, RealmList realmList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, str6, realmList);
    }

    public final String getTotalComments() {
        return this.totalComments;
    }

    public final String getOrder() {
        return this.order;
    }

    public final RealmList<Comment> getComments() {
        return this.comments;
    }
}
