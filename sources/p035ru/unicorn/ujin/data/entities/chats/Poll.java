package p035ru.unicorn.ujin.data.entities.chats;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, mo51343d2 = {"Lru/unicorn/ujin/data/entities/chats/Poll;", "", "id", "", "title", "", "count", "users", "voted", "", "createdAt", "optionList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/data/entities/chats/PollOption;", "author", "Lru/unicorn/ujin/data/entities/chats/AuthorPoll;", "(ILjava/lang/String;IIZLjava/lang/String;Ljava/util/ArrayList;Lru/unicorn/ujin/data/entities/chats/AuthorPoll;)V", "getAuthor", "()Lru/unicorn/ujin/data/entities/chats/AuthorPoll;", "getCount", "()I", "getCreatedAt", "()Ljava/lang/String;", "getId", "getOptionList", "()Ljava/util/ArrayList;", "getTitle", "getUsers", "getVoted", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.entities.chats.Poll */
/* compiled from: Message.kt */
public final class Poll {
    private final AuthorPoll author;
    private final int count;
    @SerializedName("created_at")
    private final String createdAt;
    @SerializedName("poll_id")

    /* renamed from: id */
    private final int f6628id;
    @SerializedName("options")
    private final ArrayList<PollOption> optionList;
    private final String title;
    private final int users;
    private final boolean voted;

    public static /* synthetic */ Poll copy$default(Poll poll, int i, String str, int i2, int i3, boolean z, String str2, ArrayList arrayList, AuthorPoll authorPoll, int i4, Object obj) {
        Poll poll2 = poll;
        int i5 = i4;
        return poll.copy((i5 & 1) != 0 ? poll2.f6628id : i, (i5 & 2) != 0 ? poll2.title : str, (i5 & 4) != 0 ? poll2.count : i2, (i5 & 8) != 0 ? poll2.users : i3, (i5 & 16) != 0 ? poll2.voted : z, (i5 & 32) != 0 ? poll2.createdAt : str2, (i5 & 64) != 0 ? poll2.optionList : arrayList, (i5 & 128) != 0 ? poll2.author : authorPoll);
    }

    public final int component1() {
        return this.f6628id;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.count;
    }

    public final int component4() {
        return this.users;
    }

    public final boolean component5() {
        return this.voted;
    }

    public final String component6() {
        return this.createdAt;
    }

    public final ArrayList<PollOption> component7() {
        return this.optionList;
    }

    public final AuthorPoll component8() {
        return this.author;
    }

    public final Poll copy(int i, String str, int i2, int i3, boolean z, String str2, ArrayList<PollOption> arrayList, AuthorPoll authorPoll) {
        Intrinsics.checkNotNullParameter(str, "title");
        ArrayList<PollOption> arrayList2 = arrayList;
        Intrinsics.checkNotNullParameter(arrayList2, "optionList");
        AuthorPoll authorPoll2 = authorPoll;
        Intrinsics.checkNotNullParameter(authorPoll2, "author");
        return new Poll(i, str, i2, i3, z, str2, arrayList2, authorPoll2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Poll)) {
            return false;
        }
        Poll poll = (Poll) obj;
        return this.f6628id == poll.f6628id && Intrinsics.areEqual((Object) this.title, (Object) poll.title) && this.count == poll.count && this.users == poll.users && this.voted == poll.voted && Intrinsics.areEqual((Object) this.createdAt, (Object) poll.createdAt) && Intrinsics.areEqual((Object) this.optionList, (Object) poll.optionList) && Intrinsics.areEqual((Object) this.author, (Object) poll.author);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6628id).hashCode() * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.valueOf(this.count).hashCode()) * 31) + Integer.valueOf(this.users).hashCode()) * 31;
        boolean z = this.voted;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str2 = this.createdAt;
        int hashCode3 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ArrayList<PollOption> arrayList = this.optionList;
        int hashCode4 = (hashCode3 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        AuthorPoll authorPoll = this.author;
        if (authorPoll != null) {
            i = authorPoll.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "Poll(id=" + this.f6628id + ", title=" + this.title + ", count=" + this.count + ", users=" + this.users + ", voted=" + this.voted + ", createdAt=" + this.createdAt + ", optionList=" + this.optionList + ", author=" + this.author + ")";
    }

    public Poll(int i, String str, int i2, int i3, boolean z, String str2, ArrayList<PollOption> arrayList, AuthorPoll authorPoll) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(arrayList, "optionList");
        Intrinsics.checkNotNullParameter(authorPoll, "author");
        this.f6628id = i;
        this.title = str;
        this.count = i2;
        this.users = i3;
        this.voted = z;
        this.createdAt = str2;
        this.optionList = arrayList;
        this.author = authorPoll;
    }

    public final int getId() {
        return this.f6628id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getUsers() {
        return this.users;
    }

    public final boolean getVoted() {
        return this.voted;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final ArrayList<PollOption> getOptionList() {
        return this.optionList;
    }

    public final AuthorPoll getAuthor() {
        return this.author;
    }
}
