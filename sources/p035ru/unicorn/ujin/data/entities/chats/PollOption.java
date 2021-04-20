package p035ru.unicorn.ujin.data.entities.chats;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/data/entities/chats/PollOption;", "", "id", "", "title", "", "count", "percent", "", "(ILjava/lang/String;ID)V", "getCount", "()I", "getId", "getPercent", "()D", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.entities.chats.PollOption */
/* compiled from: Message.kt */
public final class PollOption {
    private final int count;

    /* renamed from: id */
    private final int f6629id;
    private final double percent;
    private final String title;

    public static /* synthetic */ PollOption copy$default(PollOption pollOption, int i, String str, int i2, double d, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = pollOption.f6629id;
        }
        if ((i3 & 2) != 0) {
            str = pollOption.title;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            i2 = pollOption.count;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            d = pollOption.percent;
        }
        return pollOption.copy(i, str2, i4, d);
    }

    public final int component1() {
        return this.f6629id;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.count;
    }

    public final double component4() {
        return this.percent;
    }

    public final PollOption copy(int i, String str, int i2, double d) {
        Intrinsics.checkNotNullParameter(str, "title");
        return new PollOption(i, str, i2, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollOption)) {
            return false;
        }
        PollOption pollOption = (PollOption) obj;
        return this.f6629id == pollOption.f6629id && Intrinsics.areEqual((Object) this.title, (Object) pollOption.title) && this.count == pollOption.count && Double.compare(this.percent, pollOption.percent) == 0;
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6629id).hashCode() * 31;
        String str = this.title;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.valueOf(this.count).hashCode()) * 31) + Double.valueOf(this.percent).hashCode();
    }

    public String toString() {
        return "PollOption(id=" + this.f6629id + ", title=" + this.title + ", count=" + this.count + ", percent=" + this.percent + ")";
    }

    public PollOption(int i, String str, int i2, double d) {
        Intrinsics.checkNotNullParameter(str, "title");
        this.f6629id = i;
        this.title = str;
        this.count = i2;
        this.percent = d;
    }

    public final int getId() {
        return this.f6629id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getCount() {
        return this.count;
    }

    public final double getPercent() {
        return this.percent;
    }
}
