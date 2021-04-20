package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/FingerIterationAnswer;", "", "repeat", "", "nextIterationCount", "nextIterationText", "", "nextIterationParam", "assign", "(IILjava/lang/String;Ljava/lang/String;I)V", "getAssign", "()I", "getNextIterationCount", "getNextIterationParam", "()Ljava/lang/String;", "getNextIterationText", "getRepeat", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.FingerIterationAnswer */
/* compiled from: FingerIterationAnswer.kt */
public final class FingerIterationAnswer {
    private final int assign;
    @SerializedName("next_interation_count")
    private final int nextIterationCount;
    @SerializedName("next_interation_param")
    private final String nextIterationParam;
    @SerializedName("next_interation_text")
    private final String nextIterationText;
    private final int repeat;

    public FingerIterationAnswer() {
        this(0, 0, (String) null, (String) null, 0, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FingerIterationAnswer copy$default(FingerIterationAnswer fingerIterationAnswer, int i, int i2, String str, String str2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = fingerIterationAnswer.repeat;
        }
        if ((i4 & 2) != 0) {
            i2 = fingerIterationAnswer.nextIterationCount;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = fingerIterationAnswer.nextIterationText;
        }
        String str3 = str;
        if ((i4 & 8) != 0) {
            str2 = fingerIterationAnswer.nextIterationParam;
        }
        String str4 = str2;
        if ((i4 & 16) != 0) {
            i3 = fingerIterationAnswer.assign;
        }
        return fingerIterationAnswer.copy(i, i5, str3, str4, i3);
    }

    public final int component1() {
        return this.repeat;
    }

    public final int component2() {
        return this.nextIterationCount;
    }

    public final String component3() {
        return this.nextIterationText;
    }

    public final String component4() {
        return this.nextIterationParam;
    }

    public final int component5() {
        return this.assign;
    }

    public final FingerIterationAnswer copy(int i, int i2, String str, String str2, int i3) {
        Intrinsics.checkNotNullParameter(str, "nextIterationText");
        Intrinsics.checkNotNullParameter(str2, "nextIterationParam");
        return new FingerIterationAnswer(i, i2, str, str2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FingerIterationAnswer)) {
            return false;
        }
        FingerIterationAnswer fingerIterationAnswer = (FingerIterationAnswer) obj;
        return this.repeat == fingerIterationAnswer.repeat && this.nextIterationCount == fingerIterationAnswer.nextIterationCount && Intrinsics.areEqual((Object) this.nextIterationText, (Object) fingerIterationAnswer.nextIterationText) && Intrinsics.areEqual((Object) this.nextIterationParam, (Object) fingerIterationAnswer.nextIterationParam) && this.assign == fingerIterationAnswer.assign;
    }

    public int hashCode() {
        int hashCode = ((Integer.valueOf(this.repeat).hashCode() * 31) + Integer.valueOf(this.nextIterationCount).hashCode()) * 31;
        String str = this.nextIterationText;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.nextIterationParam;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 + i) * 31) + Integer.valueOf(this.assign).hashCode();
    }

    public String toString() {
        return "FingerIterationAnswer(repeat=" + this.repeat + ", nextIterationCount=" + this.nextIterationCount + ", nextIterationText=" + this.nextIterationText + ", nextIterationParam=" + this.nextIterationParam + ", assign=" + this.assign + ")";
    }

    public FingerIterationAnswer(int i, int i2, String str, String str2, int i3) {
        Intrinsics.checkNotNullParameter(str, "nextIterationText");
        Intrinsics.checkNotNullParameter(str2, "nextIterationParam");
        this.repeat = i;
        this.nextIterationCount = i2;
        this.nextIterationText = str;
        this.nextIterationParam = str2;
        this.assign = i3;
    }

    public final int getRepeat() {
        return this.repeat;
    }

    public final int getNextIterationCount() {
        return this.nextIterationCount;
    }

    public final String getNextIterationText() {
        return this.nextIterationText;
    }

    public final String getNextIterationParam() {
        return this.nextIterationParam;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FingerIterationAnswer(int r4, int r5, java.lang.String r6, java.lang.String r7, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L_0x0007
            r10 = 0
            goto L_0x0008
        L_0x0007:
            r10 = r4
        L_0x0008:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r5
        L_0x000e:
            r4 = r9 & 4
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0016
            r1 = r5
            goto L_0x0017
        L_0x0016:
            r1 = r6
        L_0x0017:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001d
            r2 = r5
            goto L_0x001e
        L_0x001d:
            r2 = r7
        L_0x001e:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0025
            r8 = -1
            r9 = -1
            goto L_0x0026
        L_0x0025:
            r9 = r8
        L_0x0026:
            r4 = r3
            r5 = r10
            r6 = r0
            r7 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger.FingerIterationAnswer.<init>(int, int, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getAssign() {
        return this.assign;
    }
}
