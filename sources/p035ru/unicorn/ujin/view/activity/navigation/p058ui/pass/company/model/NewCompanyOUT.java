package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CreateMyCompanyFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J_\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u00061"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/NewCompanyOUT;", "", "title", "", "ogrn", "inn", "okved", "legal_address", "postal_address", "actual_address", "attachments", "", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/NewCompanyAttachment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getActual_address", "()Ljava/lang/String;", "setActual_address", "(Ljava/lang/String;)V", "getAttachments", "()Ljava/util/List;", "setAttachments", "(Ljava/util/List;)V", "getInn", "setInn", "getLegal_address", "setLegal_address", "getOgrn", "setOgrn", "getOkved", "setOkved", "getPostal_address", "setPostal_address", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.NewCompanyOUT */
/* compiled from: NewCompanyOUT.kt */
public final class NewCompanyOUT {
    private String actual_address;
    private List<NewCompanyAttachment> attachments;
    private String inn;
    private String legal_address;
    private String ogrn;
    private String okved;
    private String postal_address;
    private String title;

    public NewCompanyOUT() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ NewCompanyOUT copy$default(NewCompanyOUT newCompanyOUT, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, Object obj) {
        NewCompanyOUT newCompanyOUT2 = newCompanyOUT;
        int i2 = i;
        return newCompanyOUT.copy((i2 & 1) != 0 ? newCompanyOUT2.title : str, (i2 & 2) != 0 ? newCompanyOUT2.ogrn : str2, (i2 & 4) != 0 ? newCompanyOUT2.inn : str3, (i2 & 8) != 0 ? newCompanyOUT2.okved : str4, (i2 & 16) != 0 ? newCompanyOUT2.legal_address : str5, (i2 & 32) != 0 ? newCompanyOUT2.postal_address : str6, (i2 & 64) != 0 ? newCompanyOUT2.actual_address : str7, (i2 & 128) != 0 ? newCompanyOUT2.attachments : list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.ogrn;
    }

    public final String component3() {
        return this.inn;
    }

    public final String component4() {
        return this.okved;
    }

    public final String component5() {
        return this.legal_address;
    }

    public final String component6() {
        return this.postal_address;
    }

    public final String component7() {
        return this.actual_address;
    }

    public final List<NewCompanyAttachment> component8() {
        return this.attachments;
    }

    public final NewCompanyOUT copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<NewCompanyAttachment> list) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "ogrn");
        Intrinsics.checkNotNullParameter(str3, CreateMyCompanyFragment.INN);
        Intrinsics.checkNotNullParameter(str4, "okved");
        Intrinsics.checkNotNullParameter(str5, "legal_address");
        String str8 = str6;
        Intrinsics.checkNotNullParameter(str8, "postal_address");
        String str9 = str7;
        Intrinsics.checkNotNullParameter(str9, "actual_address");
        List<NewCompanyAttachment> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "attachments");
        return new NewCompanyOUT(str, str2, str3, str4, str5, str8, str9, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewCompanyOUT)) {
            return false;
        }
        NewCompanyOUT newCompanyOUT = (NewCompanyOUT) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) newCompanyOUT.title) && Intrinsics.areEqual((Object) this.ogrn, (Object) newCompanyOUT.ogrn) && Intrinsics.areEqual((Object) this.inn, (Object) newCompanyOUT.inn) && Intrinsics.areEqual((Object) this.okved, (Object) newCompanyOUT.okved) && Intrinsics.areEqual((Object) this.legal_address, (Object) newCompanyOUT.legal_address) && Intrinsics.areEqual((Object) this.postal_address, (Object) newCompanyOUT.postal_address) && Intrinsics.areEqual((Object) this.actual_address, (Object) newCompanyOUT.actual_address) && Intrinsics.areEqual((Object) this.attachments, (Object) newCompanyOUT.attachments);
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.ogrn;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.inn;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.okved;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.legal_address;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.postal_address;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.actual_address;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<NewCompanyAttachment> list = this.attachments;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        return "NewCompanyOUT(title=" + this.title + ", ogrn=" + this.ogrn + ", inn=" + this.inn + ", okved=" + this.okved + ", legal_address=" + this.legal_address + ", postal_address=" + this.postal_address + ", actual_address=" + this.actual_address + ", attachments=" + this.attachments + ")";
    }

    public NewCompanyOUT(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<NewCompanyAttachment> list) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "ogrn");
        Intrinsics.checkNotNullParameter(str3, CreateMyCompanyFragment.INN);
        Intrinsics.checkNotNullParameter(str4, "okved");
        Intrinsics.checkNotNullParameter(str5, "legal_address");
        Intrinsics.checkNotNullParameter(str6, "postal_address");
        Intrinsics.checkNotNullParameter(str7, "actual_address");
        Intrinsics.checkNotNullParameter(list, "attachments");
        this.title = str;
        this.ogrn = str2;
        this.inn = str3;
        this.okved = str4;
        this.legal_address = str5;
        this.postal_address = str6;
        this.actual_address = str7;
        this.attachments = list;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getOgrn() {
        return this.ogrn;
    }

    public final void setOgrn(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ogrn = str;
    }

    public final String getInn() {
        return this.inn;
    }

    public final void setInn(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.inn = str;
    }

    public final String getOkved() {
        return this.okved;
    }

    public final void setOkved(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.okved = str;
    }

    public final String getLegal_address() {
        return this.legal_address;
    }

    public final void setLegal_address(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.legal_address = str;
    }

    public final String getPostal_address() {
        return this.postal_address;
    }

    public final void setPostal_address(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.postal_address = str;
    }

    public final String getActual_address() {
        return this.actual_address;
    }

    public final void setActual_address(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.actual_address = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NewCompanyOUT(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r10
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r11
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r12
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r13
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0027
        L_0x0026:
            r6 = r14
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002e
        L_0x002d:
            r7 = r15
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r2 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            goto L_0x0043
        L_0x0041:
            r0 = r17
        L_0x0043:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r2
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyOUT.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<NewCompanyAttachment> getAttachments() {
        return this.attachments;
    }

    public final void setAttachments(List<NewCompanyAttachment> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.attachments = list;
    }
}
