package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.AttrRenta;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 /2\u00020\u0001:\u0001/BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019¨\u00060"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyObject;", "", "id", "", "title", "attributes", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/AttrRenta;", "building", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyBuilding;", "rents", "", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/ObjectRentInfo;", "status", "(Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/AttrRenta;Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyBuilding;Ljava/util/List;Ljava/lang/String;)V", "getAttributes", "()Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/AttrRenta;", "setAttributes", "(Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/AttrRenta;)V", "getBuilding", "()Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyBuilding;", "setBuilding", "(Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyBuilding;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getRents", "()Ljava/util/List;", "setRents", "(Ljava/util/List;)V", "getStatus", "setStatus", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyObject */
/* compiled from: CompanyObjectsResponse.kt */
public final class CompanyObject {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private AttrRenta attributes;
    private CompanyBuilding building;

    /* renamed from: id */
    private String f6805id;
    private List<ObjectRentInfo> rents;
    @SerializedName("is_owner")
    private String status;
    private String title;

    public static /* synthetic */ CompanyObject copy$default(CompanyObject companyObject, String str, String str2, AttrRenta attrRenta, CompanyBuilding companyBuilding, List<ObjectRentInfo> list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = companyObject.f6805id;
        }
        if ((i & 2) != 0) {
            str2 = companyObject.title;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            attrRenta = companyObject.attributes;
        }
        AttrRenta attrRenta2 = attrRenta;
        if ((i & 8) != 0) {
            companyBuilding = companyObject.building;
        }
        CompanyBuilding companyBuilding2 = companyBuilding;
        if ((i & 16) != 0) {
            list = companyObject.rents;
        }
        List<ObjectRentInfo> list2 = list;
        if ((i & 32) != 0) {
            str3 = companyObject.status;
        }
        return companyObject.copy(str, str4, attrRenta2, companyBuilding2, list2, str3);
    }

    public final String component1() {
        return this.f6805id;
    }

    public final String component2() {
        return this.title;
    }

    public final AttrRenta component3() {
        return this.attributes;
    }

    public final CompanyBuilding component4() {
        return this.building;
    }

    public final List<ObjectRentInfo> component5() {
        return this.rents;
    }

    public final String component6() {
        return this.status;
    }

    public final CompanyObject copy(String str, String str2, AttrRenta attrRenta, CompanyBuilding companyBuilding, List<ObjectRentInfo> list, String str3) {
        return new CompanyObject(str, str2, attrRenta, companyBuilding, list, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompanyObject)) {
            return false;
        }
        CompanyObject companyObject = (CompanyObject) obj;
        return Intrinsics.areEqual((Object) this.f6805id, (Object) companyObject.f6805id) && Intrinsics.areEqual((Object) this.title, (Object) companyObject.title) && Intrinsics.areEqual((Object) this.attributes, (Object) companyObject.attributes) && Intrinsics.areEqual((Object) this.building, (Object) companyObject.building) && Intrinsics.areEqual((Object) this.rents, (Object) companyObject.rents) && Intrinsics.areEqual((Object) this.status, (Object) companyObject.status);
    }

    public int hashCode() {
        String str = this.f6805id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AttrRenta attrRenta = this.attributes;
        int hashCode3 = (hashCode2 + (attrRenta != null ? attrRenta.hashCode() : 0)) * 31;
        CompanyBuilding companyBuilding = this.building;
        int hashCode4 = (hashCode3 + (companyBuilding != null ? companyBuilding.hashCode() : 0)) * 31;
        List<ObjectRentInfo> list = this.rents;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.status;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "CompanyObject(id=" + this.f6805id + ", title=" + this.title + ", attributes=" + this.attributes + ", building=" + this.building + ", rents=" + this.rents + ", status=" + this.status + ")";
    }

    public CompanyObject(String str, String str2, AttrRenta attrRenta, CompanyBuilding companyBuilding, List<ObjectRentInfo> list, String str3) {
        this.f6805id = str;
        this.title = str2;
        this.attributes = attrRenta;
        this.building = companyBuilding;
        this.rents = list;
        this.status = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompanyObject(String str, String str2, AttrRenta attrRenta, CompanyBuilding companyBuilding, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : attrRenta, (i & 8) != 0 ? null : companyBuilding, list, (i & 32) != 0 ? null : str3);
    }

    public final String getId() {
        return this.f6805id;
    }

    public final void setId(String str) {
        this.f6805id = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final AttrRenta getAttributes() {
        return this.attributes;
    }

    public final void setAttributes(AttrRenta attrRenta) {
        this.attributes = attrRenta;
    }

    public final CompanyBuilding getBuilding() {
        return this.building;
    }

    public final void setBuilding(CompanyBuilding companyBuilding) {
        this.building = companyBuilding;
    }

    public final List<ObjectRentInfo> getRents() {
        return this.rents;
    }

    public final void setRents(List<ObjectRentInfo> list) {
        this.rents = list;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyObject$Companion;", "", "()V", "toKeyList", "", "Lru/unicorn/ujin/view/activity/navigation/entity/IKeyValueData;", "data", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyObject;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyObject$Companion */
    /* compiled from: CompanyObjectsResponse.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            r2 = r10.getBuilding();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x007a, code lost:
            if ((r2 == null || kotlin.text.StringsKt.isBlank(r2)) == false) goto L_0x007c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x014b  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0150  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x015e  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0161  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x01c3  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x00c7  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x00cc  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x00da  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0108  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x010a  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x010d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData> toKeyList(p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject r10) {
            /*
                r9 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                r1 = 0
                if (r10 == 0) goto L_0x0015
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyBuilding r2 = r10.getBuilding()
                if (r2 == 0) goto L_0x0015
                java.lang.String r2 = r2.getComplexTitle()
                goto L_0x0016
            L_0x0015:
                r2 = r1
            L_0x0016:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0025
                boolean r2 = kotlin.text.StringsKt.isBlank(r2)
                if (r2 == 0) goto L_0x0023
                goto L_0x0025
            L_0x0023:
                r2 = 0
                goto L_0x0026
            L_0x0025:
                r2 = 1
            L_0x0026:
                if (r2 != 0) goto L_0x0040
                ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl r2 = new ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl
                if (r10 == 0) goto L_0x0037
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyBuilding r5 = r10.getBuilding()
                if (r5 == 0) goto L_0x0037
                java.lang.String r5 = r5.getComplexTitle()
                goto L_0x0038
            L_0x0037:
                r5 = r1
            L_0x0038:
                java.lang.String r6 = "Бизнес-центр"
                r2.<init>(r6, r5)
                r0.add(r2)
            L_0x0040:
                if (r10 == 0) goto L_0x004d
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyBuilding r2 = r10.getBuilding()
                if (r2 == 0) goto L_0x004d
                java.lang.String r2 = r2.getAddress()
                goto L_0x004e
            L_0x004d:
                r2 = r1
            L_0x004e:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                if (r2 == 0) goto L_0x005b
                boolean r2 = kotlin.text.StringsKt.isBlank(r2)
                if (r2 == 0) goto L_0x0059
                goto L_0x005b
            L_0x0059:
                r2 = 0
                goto L_0x005c
            L_0x005b:
                r2 = 1
            L_0x005c:
                if (r2 == 0) goto L_0x007c
                if (r10 == 0) goto L_0x006b
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyBuilding r2 = r10.getBuilding()
                if (r2 == 0) goto L_0x006b
                java.lang.String r2 = r2.getBuildingTitle()
                goto L_0x006c
            L_0x006b:
                r2 = r1
            L_0x006c:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                if (r2 == 0) goto L_0x0079
                boolean r2 = kotlin.text.StringsKt.isBlank(r2)
                if (r2 == 0) goto L_0x0077
                goto L_0x0079
            L_0x0077:
                r2 = 0
                goto L_0x007a
            L_0x0079:
                r2 = 1
            L_0x007a:
                if (r2 != 0) goto L_0x00bf
            L_0x007c:
                ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl r2 = new ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl
                if (r10 == 0) goto L_0x008b
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyBuilding r5 = r10.getBuilding()
                if (r5 == 0) goto L_0x008b
                java.lang.String r5 = r5.getAddress()
                goto L_0x008c
            L_0x008b:
                r5 = r1
            L_0x008c:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                if (r5 == 0) goto L_0x0099
                boolean r5 = kotlin.text.StringsKt.isBlank(r5)
                if (r5 == 0) goto L_0x0097
                goto L_0x0099
            L_0x0097:
                r5 = 0
                goto L_0x009a
            L_0x0099:
                r5 = 1
            L_0x009a:
                if (r5 == 0) goto L_0x00a9
                if (r10 == 0) goto L_0x00b6
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyBuilding r5 = r10.getBuilding()
                if (r5 == 0) goto L_0x00b6
                java.lang.String r5 = r5.getBuildingTitle()
                goto L_0x00b7
            L_0x00a9:
                if (r10 == 0) goto L_0x00b6
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyBuilding r5 = r10.getBuilding()
                if (r5 == 0) goto L_0x00b6
                java.lang.String r5 = r5.getAddress()
                goto L_0x00b7
            L_0x00b6:
                r5 = r1
            L_0x00b7:
                java.lang.String r6 = "Адрес"
                r2.<init>(r6, r5)
                r0.add(r2)
            L_0x00bf:
                if (r10 == 0) goto L_0x00cc
                ru.unicorn.ujin.view.activity.navigation.ui.myrenta.AttrRenta r2 = r10.getAttributes()
                if (r2 == 0) goto L_0x00cc
                java.lang.String r2 = r2.getArea()
                goto L_0x00cd
            L_0x00cc:
                r2 = r1
            L_0x00cd:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                if (r2 == 0) goto L_0x00da
                boolean r2 = kotlin.text.StringsKt.isBlank(r2)
                if (r2 == 0) goto L_0x00d8
                goto L_0x00da
            L_0x00d8:
                r2 = 0
                goto L_0x00db
            L_0x00da:
                r2 = 1
            L_0x00db:
                if (r2 != 0) goto L_0x00f5
                ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl r2 = new ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl
                if (r10 == 0) goto L_0x00ec
                ru.unicorn.ujin.view.activity.navigation.ui.myrenta.AttrRenta r5 = r10.getAttributes()
                if (r5 == 0) goto L_0x00ec
                java.lang.String r5 = r5.getArea()
                goto L_0x00ed
            L_0x00ec:
                r5 = r1
            L_0x00ed:
                java.lang.String r6 = "Площадь"
                r2.<init>(r6, r5)
                r0.add(r2)
            L_0x00f5:
                if (r10 == 0) goto L_0x00fc
                java.lang.String r2 = r10.getStatus()
                goto L_0x00fd
            L_0x00fc:
                r2 = r1
            L_0x00fd:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                if (r2 == 0) goto L_0x010a
                boolean r2 = kotlin.text.StringsKt.isBlank(r2)
                if (r2 == 0) goto L_0x0108
                goto L_0x010a
            L_0x0108:
                r2 = 0
                goto L_0x010b
            L_0x010a:
                r2 = 1
            L_0x010b:
                if (r2 != 0) goto L_0x011f
                ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl r2 = new ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl
                if (r10 == 0) goto L_0x0116
                java.lang.String r5 = r10.getStatus()
                goto L_0x0117
            L_0x0116:
                r5 = r1
            L_0x0117:
                java.lang.String r6 = "Статус"
                r2.<init>(r6, r5)
                r0.add(r2)
            L_0x011f:
                java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
                java.util.Locale r5 = java.util.Locale.getDefault()
                java.lang.String r6 = "dd.MM.yyyy"
                r2.<init>(r6, r5)
                java.lang.String r5 = "yyyy-MM-dd HH:mm:ss"
                if (r10 == 0) goto L_0x0190
                java.util.List r6 = r10.getRents()
                if (r6 == 0) goto L_0x0190
                java.util.Collection r6 = (java.util.Collection) r6
                boolean r6 = r6.isEmpty()
                r6 = r6 ^ r4
                if (r6 != r4) goto L_0x0190
                java.util.List r6 = r10.getRents()
                if (r6 == 0) goto L_0x0150
                java.lang.Object r6 = r6.get(r3)
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.ObjectRentInfo r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.ObjectRentInfo) r6
                if (r6 == 0) goto L_0x0150
                java.lang.String r6 = r6.getStartDate()
                goto L_0x0151
            L_0x0150:
                r6 = r1
            L_0x0151:
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                if (r6 == 0) goto L_0x015e
                boolean r6 = kotlin.text.StringsKt.isBlank(r6)
                if (r6 == 0) goto L_0x015c
                goto L_0x015e
            L_0x015c:
                r6 = 0
                goto L_0x015f
            L_0x015e:
                r6 = 1
            L_0x015f:
                if (r6 != 0) goto L_0x0190
                java.util.List r6 = r10.getRents()
                if (r6 == 0) goto L_0x0174
                java.lang.Object r6 = r6.get(r3)
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.ObjectRentInfo r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.ObjectRentInfo) r6
                if (r6 == 0) goto L_0x0174
                java.lang.String r6 = r6.getStartDate()
                goto L_0x0175
            L_0x0174:
                r6 = r1
            L_0x0175:
                java.util.Calendar r6 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r6, r5)
                ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl r7 = new ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl
                java.lang.String r8 = "startDate"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
                java.util.Date r6 = r6.getTime()
                java.lang.String r6 = r2.format(r6)
                java.lang.String r8 = "Дата начала аренды"
                r7.<init>(r8, r6)
                r0.add(r7)
            L_0x0190:
                if (r10 == 0) goto L_0x01f0
                java.util.List r6 = r10.getRents()
                if (r6 == 0) goto L_0x01f0
                java.util.Collection r6 = (java.util.Collection) r6
                boolean r6 = r6.isEmpty()
                r6 = r6 ^ r4
                if (r6 != r4) goto L_0x01f0
                java.util.List r6 = r10.getRents()
                if (r6 == 0) goto L_0x01b4
                java.lang.Object r6 = r6.get(r3)
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.ObjectRentInfo r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.ObjectRentInfo) r6
                if (r6 == 0) goto L_0x01b4
                java.lang.String r6 = r6.getFinishDate()
                goto L_0x01b5
            L_0x01b4:
                r6 = r1
            L_0x01b5:
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                if (r6 == 0) goto L_0x01c1
                boolean r6 = kotlin.text.StringsKt.isBlank(r6)
                if (r6 == 0) goto L_0x01c0
                goto L_0x01c1
            L_0x01c0:
                r4 = 0
            L_0x01c1:
                if (r4 != 0) goto L_0x01f0
                java.util.List r10 = r10.getRents()
                if (r10 == 0) goto L_0x01d5
                java.lang.Object r10 = r10.get(r3)
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.ObjectRentInfo r10 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.ObjectRentInfo) r10
                if (r10 == 0) goto L_0x01d5
                java.lang.String r1 = r10.getFinishDate()
            L_0x01d5:
                java.util.Calendar r10 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r1, r5)
                ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl r1 = new ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueDataImpl
                java.lang.String r3 = "finishDate"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
                java.util.Date r10 = r10.getTime()
                java.lang.String r10 = r2.format(r10)
                java.lang.String r2 = "Дата окончания аренды"
                r1.<init>(r2, r10)
                r0.add(r1)
            L_0x01f0:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject.Companion.toKeyList(ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyObject):java.util.List");
        }
    }
}
