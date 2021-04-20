package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u001f\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0000H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/FileData;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "id", "", "name", "mimeType", "bytes", "meta", "Lru/unicorn/ujin/data/realm/FileMeta;", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/data/realm/FileMeta;Ljava/lang/String;)V", "getBytes", "()Ljava/lang/String;", "setBytes", "(Ljava/lang/String;)V", "getId", "setId", "getMeta", "()Lru/unicorn/ujin/data/realm/FileMeta;", "setMeta", "(Lru/unicorn/ujin/data/realm/FileMeta;)V", "getMimeType", "setMimeType", "getName", "setName", "getUrl", "setUrl", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.FileData */
/* compiled from: FileData.kt */
public class FileData extends RealmObject implements Diffable<FileData>, ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface {
    private String bytes;
    @PrimaryKey

    /* renamed from: id */
    private String f6653id;
    private FileMeta meta;
    @SerializedName("mime_type")
    private String mimeType;
    private String name;
    private String url;

    public FileData() {
        this((String) null, (String) null, (String) null, (String) null, (FileMeta) null, (String) null, 63, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$bytes() {
        return this.bytes;
    }

    public String realmGet$id() {
        return this.f6653id;
    }

    public FileMeta realmGet$meta() {
        return this.meta;
    }

    public String realmGet$mimeType() {
        return this.mimeType;
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$url() {
        return this.url;
    }

    public void realmSet$bytes(String str) {
        this.bytes = str;
    }

    public void realmSet$id(String str) {
        this.f6653id = str;
    }

    public void realmSet$meta(FileMeta fileMeta) {
        this.meta = fileMeta;
    }

    public void realmSet$mimeType(String str) {
        this.mimeType = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FileData(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, p035ru.unicorn.ujin.data.realm.FileMeta r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0008
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
        L_0x0008:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000f
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
        L_0x000f:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0017
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
        L_0x0017:
            r1 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001f
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
        L_0x001f:
            r2 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0027
            r9 = r0
            ru.unicorn.ujin.data.realm.FileMeta r9 = (p035ru.unicorn.ujin.data.realm.FileMeta) r9
        L_0x0027:
            r3 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x002f
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
        L_0x002f:
            r0 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            boolean r5 = r4 instanceof p046io.realm.internal.RealmObjectProxy
            if (r5 == 0) goto L_0x0044
            r5 = r4
            io.realm.internal.RealmObjectProxy r5 = (p046io.realm.internal.RealmObjectProxy) r5
            r5.realm$injectObjectContext()
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.FileData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.unicorn.ujin.data.realm.FileMeta, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getName() {
        return realmGet$name();
    }

    public final void setName(String str) {
        realmSet$name(str);
    }

    public final String getMimeType() {
        return realmGet$mimeType();
    }

    public final void setMimeType(String str) {
        realmSet$mimeType(str);
    }

    public final String getBytes() {
        return realmGet$bytes();
    }

    public final void setBytes(String str) {
        realmSet$bytes(str);
    }

    public final FileMeta getMeta() {
        return realmGet$meta();
    }

    public final void setMeta(FileMeta fileMeta) {
        realmSet$meta(fileMeta);
    }

    public final String getUrl() {
        return realmGet$url();
    }

    public final void setUrl(String str) {
        realmSet$url(str);
    }

    public FileData(String str, String str2, String str3, String str4, FileMeta fileMeta, String str5) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$name(str2);
        realmSet$mimeType(str3);
        realmSet$bytes(str4);
        realmSet$meta(fileMeta);
        realmSet$url(str5);
    }

    public boolean areItemsTheSame(FileData fileData) {
        return Intrinsics.areEqual((Object) realmGet$id(), (Object) fileData != null ? fileData.realmGet$id() : null);
    }

    public boolean areContentsTheSame(FileData fileData) {
        return Intrinsics.areEqual((Object) realmGet$url(), (Object) fileData != null ? fileData.realmGet$url() : null);
    }
}
