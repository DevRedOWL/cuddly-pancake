package p035ru.unicorn.ujin.view.fragments.makearecord.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003JW\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006."}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/model/CreateRecordOut;", "", "to_user_id", "", "date", "", "time_from", "time_to", "description", "registered_name", "attachments", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAttachments", "()Ljava/util/List;", "setAttachments", "(Ljava/util/List;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getRegistered_name", "setRegistered_name", "getTime_from", "setTime_from", "getTime_to", "setTime_to", "getTo_user_id", "()I", "setTo_user_id", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.model.CreateRecordOut */
/* compiled from: CreateRecordOut.kt */
public final class CreateRecordOut {
    private List<Integer> attachments;
    private String date;
    private String description;
    private String registered_name;
    private String time_from;
    private String time_to;
    private int to_user_id;

    public CreateRecordOut() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CreateRecordOut copy$default(CreateRecordOut createRecordOut, int i, String str, String str2, String str3, String str4, String str5, List<Integer> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = createRecordOut.to_user_id;
        }
        if ((i2 & 2) != 0) {
            str = createRecordOut.date;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            str2 = createRecordOut.time_from;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = createRecordOut.time_to;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            str4 = createRecordOut.description;
        }
        String str9 = str4;
        if ((i2 & 32) != 0) {
            str5 = createRecordOut.registered_name;
        }
        String str10 = str5;
        if ((i2 & 64) != 0) {
            list = createRecordOut.attachments;
        }
        return createRecordOut.copy(i, str6, str7, str8, str9, str10, list);
    }

    public final int component1() {
        return this.to_user_id;
    }

    public final String component2() {
        return this.date;
    }

    public final String component3() {
        return this.time_from;
    }

    public final String component4() {
        return this.time_to;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.registered_name;
    }

    public final List<Integer> component7() {
        return this.attachments;
    }

    public final CreateRecordOut copy(int i, String str, String str2, String str3, String str4, String str5, List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "date");
        Intrinsics.checkNotNullParameter(str2, "time_from");
        Intrinsics.checkNotNullParameter(str3, "time_to");
        Intrinsics.checkNotNullParameter(str4, "description");
        Intrinsics.checkNotNullParameter(str5, "registered_name");
        return new CreateRecordOut(i, str, str2, str3, str4, str5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateRecordOut)) {
            return false;
        }
        CreateRecordOut createRecordOut = (CreateRecordOut) obj;
        return this.to_user_id == createRecordOut.to_user_id && Intrinsics.areEqual((Object) this.date, (Object) createRecordOut.date) && Intrinsics.areEqual((Object) this.time_from, (Object) createRecordOut.time_from) && Intrinsics.areEqual((Object) this.time_to, (Object) createRecordOut.time_to) && Intrinsics.areEqual((Object) this.description, (Object) createRecordOut.description) && Intrinsics.areEqual((Object) this.registered_name, (Object) createRecordOut.registered_name) && Intrinsics.areEqual((Object) this.attachments, (Object) createRecordOut.attachments);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.to_user_id).hashCode() * 31;
        String str = this.date;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.time_from;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.time_to;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.description;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.registered_name;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<Integer> list = this.attachments;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "CreateRecordOut(to_user_id=" + this.to_user_id + ", date=" + this.date + ", time_from=" + this.time_from + ", time_to=" + this.time_to + ", description=" + this.description + ", registered_name=" + this.registered_name + ", attachments=" + this.attachments + ")";
    }

    public CreateRecordOut(int i, String str, String str2, String str3, String str4, String str5, List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "date");
        Intrinsics.checkNotNullParameter(str2, "time_from");
        Intrinsics.checkNotNullParameter(str3, "time_to");
        Intrinsics.checkNotNullParameter(str4, "description");
        Intrinsics.checkNotNullParameter(str5, "registered_name");
        this.to_user_id = i;
        this.date = str;
        this.time_from = str2;
        this.time_to = str3;
        this.description = str4;
        this.registered_name = str5;
        this.attachments = list;
    }

    public final int getTo_user_id() {
        return this.to_user_id;
    }

    public final void setTo_user_id(int i) {
        this.to_user_id = i;
    }

    public final String getDate() {
        return this.date;
    }

    public final void setDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.date = str;
    }

    public final String getTime_from() {
        return this.time_from;
    }

    public final void setTime_from(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.time_from = str;
    }

    public final String getTime_to() {
        return this.time_to;
    }

    public final void setTime_to(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.time_to = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final String getRegistered_name() {
        return this.registered_name;
    }

    public final void setRegistered_name(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.registered_name = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CreateRecordOut(int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.List r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0005
            r6 = -1
        L_0x0005:
            r14 = r13 & 2
            java.lang.String r0 = ""
            if (r14 == 0) goto L_0x000d
            r14 = r0
            goto L_0x000e
        L_0x000d:
            r14 = r7
        L_0x000e:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r8
        L_0x0015:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r9
        L_0x001c:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0022
            r3 = r0
            goto L_0x0023
        L_0x0022:
            r3 = r10
        L_0x0023:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = r11
        L_0x0029:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0035
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r12 = r7
            java.util.List r12 = (java.util.List) r12
        L_0x0035:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r0
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.makearecord.model.CreateRecordOut.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<Integer> getAttachments() {
        return this.attachments;
    }

    public final void setAttachments(List<Integer> list) {
        this.attachments = list;
    }
}
