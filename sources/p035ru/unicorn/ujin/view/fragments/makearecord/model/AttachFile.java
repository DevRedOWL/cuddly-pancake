package p035ru.unicorn.ujin.view.fragments.makearecord.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/model/AttachFile;", "", "bytes", "", "id", "mimeType", "", "type", "name", "url", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBytes", "()I", "getId", "getMimeType", "()Ljava/lang/String;", "getName", "getType", "setType", "(Ljava/lang/String;)V", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.model.AttachFile */
/* compiled from: AttachDataIn.kt */
public final class AttachFile {
    private final int bytes;

    /* renamed from: id */
    private final int f6927id;
    @SerializedName("mime_type")
    private final String mimeType;
    private final String name;
    @SerializedName("custom_type")
    private String type;
    private final String url;

    public AttachFile() {
        this(0, 0, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AttachFile copy$default(AttachFile attachFile, int i, int i2, String str, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = attachFile.bytes;
        }
        if ((i3 & 2) != 0) {
            i2 = attachFile.f6927id;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = attachFile.mimeType;
        }
        String str5 = str;
        if ((i3 & 8) != 0) {
            str2 = attachFile.type;
        }
        String str6 = str2;
        if ((i3 & 16) != 0) {
            str3 = attachFile.name;
        }
        String str7 = str3;
        if ((i3 & 32) != 0) {
            str4 = attachFile.url;
        }
        return attachFile.copy(i, i4, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.bytes;
    }

    public final int component2() {
        return this.f6927id;
    }

    public final String component3() {
        return this.mimeType;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.url;
    }

    public final AttachFile copy(int i, int i2, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "mimeType");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "url");
        return new AttachFile(i, i2, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachFile)) {
            return false;
        }
        AttachFile attachFile = (AttachFile) obj;
        return this.bytes == attachFile.bytes && this.f6927id == attachFile.f6927id && Intrinsics.areEqual((Object) this.mimeType, (Object) attachFile.mimeType) && Intrinsics.areEqual((Object) this.type, (Object) attachFile.type) && Intrinsics.areEqual((Object) this.name, (Object) attachFile.name) && Intrinsics.areEqual((Object) this.url, (Object) attachFile.url);
    }

    public int hashCode() {
        int hashCode = ((Integer.valueOf(this.bytes).hashCode() * 31) + Integer.valueOf(this.f6927id).hashCode()) * 31;
        String str = this.mimeType;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.type;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.url;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "AttachFile(bytes=" + this.bytes + ", id=" + this.f6927id + ", mimeType=" + this.mimeType + ", type=" + this.type + ", name=" + this.name + ", url=" + this.url + ")";
    }

    public AttachFile(int i, int i2, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "mimeType");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "url");
        this.bytes = i;
        this.f6927id = i2;
        this.mimeType = str;
        this.type = str2;
        this.name = str3;
        this.url = str4;
    }

    public final int getBytes() {
        return this.bytes;
    }

    public final int getId() {
        return this.f6927id;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AttachFile(int r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = 0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r6
        L_0x000e:
            r5 = r11 & 4
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x0016
            r1 = r6
            goto L_0x0017
        L_0x0016:
            r1 = r7
        L_0x0017:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001d
            r2 = r6
            goto L_0x001e
        L_0x001d:
            r2 = r8
        L_0x001e:
            r5 = r11 & 16
            if (r5 == 0) goto L_0x0024
            r3 = r6
            goto L_0x0025
        L_0x0024:
            r3 = r9
        L_0x0025:
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002b
            r11 = r6
            goto L_0x002c
        L_0x002b:
            r11 = r10
        L_0x002c:
            r5 = r4
            r6 = r12
            r7 = r0
            r8 = r1
            r9 = r2
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachFile.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getUrl() {
        return this.url;
    }
}
