package p035ru.unicorn.ujin.view.fragments.oss.response;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/OssSmsSentData;", "", "sent", "", "(Z)V", "getSent", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.response.OssSmsSentData */
/* compiled from: OssSmsSentResponse.kt */
public final class OssSmsSentData {
    private final boolean sent;

    public static /* synthetic */ OssSmsSentData copy$default(OssSmsSentData ossSmsSentData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ossSmsSentData.sent;
        }
        return ossSmsSentData.copy(z);
    }

    public final boolean component1() {
        return this.sent;
    }

    public final OssSmsSentData copy(boolean z) {
        return new OssSmsSentData(z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OssSmsSentData) && this.sent == ((OssSmsSentData) obj).sent;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.sent;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "OssSmsSentData(sent=" + this.sent + ")";
    }

    public OssSmsSentData(boolean z) {
        this.sent = z;
    }

    public final boolean getSent() {
        return this.sent;
    }
}
