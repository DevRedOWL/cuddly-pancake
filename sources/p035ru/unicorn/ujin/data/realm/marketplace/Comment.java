package p035ru.unicorn.ujin.data.realm.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.C4609xf6b1932;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001bBY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Comment;", "Lio/realm/RealmObject;", "id", "", "threadId", "threadType", "authorName", "message", "vote", "date", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorName", "()Ljava/lang/String;", "setAuthorName", "(Ljava/lang/String;)V", "getDate", "setDate", "getId", "setId", "getMessage", "setMessage", "getThreadId", "setThreadId", "getThreadType", "setThreadType", "getVote", "setVote", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Comment */
/* compiled from: Comment.kt */
public class Comment extends RealmObject implements C4609xf6b1932 {
    @SerializedName("author_name")
    private String authorName;
    @SerializedName("created_at")
    private String date;
    @PrimaryKey

    /* renamed from: id */
    private String f6679id;
    private String message;
    @SerializedName("thread_id")
    private String threadId;
    @SerializedName("thread_type")
    private String threadType;
    private String vote;

    public Comment() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$authorName() {
        return this.authorName;
    }

    public String realmGet$date() {
        return this.date;
    }

    public String realmGet$id() {
        return this.f6679id;
    }

    public String realmGet$message() {
        return this.message;
    }

    public String realmGet$threadId() {
        return this.threadId;
    }

    public String realmGet$threadType() {
        return this.threadType;
    }

    public String realmGet$vote() {
        return this.vote;
    }

    public void realmSet$authorName(String str) {
        this.authorName = str;
    }

    public void realmSet$date(String str) {
        this.date = str;
    }

    public void realmSet$id(String str) {
        this.f6679id = str;
    }

    public void realmSet$message(String str) {
        this.message = str;
    }

    public void realmSet$threadId(String str) {
        this.threadId = str;
    }

    public void realmSet$threadType(String str) {
        this.threadType = str;
    }

    public void realmSet$vote(String str) {
        this.vote = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Comment(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0008
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
        L_0x0008:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000f
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
        L_0x000f:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0017
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
        L_0x0017:
            r1 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001f
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
        L_0x001f:
            r2 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0027
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
        L_0x0027:
            r3 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002f
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
        L_0x002f:
            r4 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0037
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
        L_0x0037:
            r0 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            boolean r6 = r5 instanceof p046io.realm.internal.RealmObjectProxy
            if (r6 == 0) goto L_0x004d
            r6 = r5
            io.realm.internal.RealmObjectProxy r6 = (p046io.realm.internal.RealmObjectProxy) r6
            r6.realm$injectObjectContext()
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.Comment.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getThreadId() {
        return realmGet$threadId();
    }

    public final void setThreadId(String str) {
        realmSet$threadId(str);
    }

    public final String getThreadType() {
        return realmGet$threadType();
    }

    public final void setThreadType(String str) {
        realmSet$threadType(str);
    }

    public final String getAuthorName() {
        return realmGet$authorName();
    }

    public final void setAuthorName(String str) {
        realmSet$authorName(str);
    }

    public final String getMessage() {
        return realmGet$message();
    }

    public final void setMessage(String str) {
        realmSet$message(str);
    }

    public final String getVote() {
        return realmGet$vote();
    }

    public final void setVote(String str) {
        realmSet$vote(str);
    }

    public final String getDate() {
        return realmGet$date();
    }

    public final void setDate(String str) {
        realmSet$date(str);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Comment$Fields;", "", "()V", "id", "", "threadId", "threadType", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.Comment$Fields */
    /* compiled from: Comment.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        public static final String f6680id = "id";
        public static final String threadId = "threadId";
        public static final String threadType = "threadType";

        private Fields() {
        }
    }

    public Comment(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$threadId(str2);
        realmSet$threadType(str3);
        realmSet$authorName(str4);
        realmSet$message(str5);
        realmSet$vote(str6);
        realmSet$date(str7);
    }
}
