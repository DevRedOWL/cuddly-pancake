package p035ru.unicorn.ujin.view.fragments.oss.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/OssAnswer;", "", "id", "", "value", "", "isOpen", "", "(ILjava/lang/String;Z)V", "getId", "()I", "()Z", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.response.OssAnswer */
/* compiled from: OssResponse.kt */
public final class OssAnswer {

    /* renamed from: id */
    private final int f6931id;
    @SerializedName("is_open")
    private final boolean isOpen;
    private final String value;

    public static /* synthetic */ OssAnswer copy$default(OssAnswer ossAnswer, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ossAnswer.f6931id;
        }
        if ((i2 & 2) != 0) {
            str = ossAnswer.value;
        }
        if ((i2 & 4) != 0) {
            z = ossAnswer.isOpen;
        }
        return ossAnswer.copy(i, str, z);
    }

    public final int component1() {
        return this.f6931id;
    }

    public final String component2() {
        return this.value;
    }

    public final boolean component3() {
        return this.isOpen;
    }

    public final OssAnswer copy(int i, String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "value");
        return new OssAnswer(i, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssAnswer)) {
            return false;
        }
        OssAnswer ossAnswer = (OssAnswer) obj;
        return this.f6931id == ossAnswer.f6931id && Intrinsics.areEqual((Object) this.value, (Object) ossAnswer.value) && this.isOpen == ossAnswer.isOpen;
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6931id).hashCode() * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.isOpen;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public String toString() {
        return "OssAnswer(id=" + this.f6931id + ", value=" + this.value + ", isOpen=" + this.isOpen + ")";
    }

    public OssAnswer(int i, String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f6931id = i;
        this.value = str;
        this.isOpen = z;
    }

    public final int getId() {
        return this.f6931id;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isOpen() {
        return this.isOpen;
    }
}
