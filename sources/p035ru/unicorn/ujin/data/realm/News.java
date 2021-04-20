package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001eBK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/News;", "Lio/realm/RealmObject;", "id", "", "title", "text", "dateText", "imageData", "Lru/unicorn/ujin/data/realm/ImageData;", "imageList", "Lio/realm/RealmList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/data/realm/ImageData;Lio/realm/RealmList;)V", "getDateText", "()Ljava/lang/String;", "setDateText", "(Ljava/lang/String;)V", "getId", "setId", "getImageData", "()Lru/unicorn/ujin/data/realm/ImageData;", "setImageData", "(Lru/unicorn/ujin/data/realm/ImageData;)V", "getImageList", "()Lio/realm/RealmList;", "setImageList", "(Lio/realm/RealmList;)V", "getText", "setText", "getTitle", "setTitle", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.News */
/* compiled from: News.kt */
public class News extends RealmObject implements ru_unicorn_ujin_data_realm_NewsRealmProxyInterface {
    @SerializedName("dt")
    private String dateText;
    @PrimaryKey

    /* renamed from: id */
    private String f6660id;
    @SerializedName("img")
    private ImageData imageData;
    @SerializedName("images")
    private RealmList<ImageData> imageList;
    private String text;
    private String title;

    public News() {
        this((String) null, (String) null, (String) null, (String) null, (ImageData) null, (RealmList) null, 63, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$dateText() {
        return this.dateText;
    }

    public String realmGet$id() {
        return this.f6660id;
    }

    public ImageData realmGet$imageData() {
        return this.imageData;
    }

    public RealmList realmGet$imageList() {
        return this.imageList;
    }

    public String realmGet$text() {
        return this.text;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$dateText(String str) {
        this.dateText = str;
    }

    public void realmSet$id(String str) {
        this.f6660id = str;
    }

    public void realmSet$imageData(ImageData imageData2) {
        this.imageData = imageData2;
    }

    public void realmSet$imageList(RealmList realmList) {
        this.imageList = realmList;
    }

    public void realmSet$text(String str) {
        this.text = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$id(str);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$title(str);
    }

    public final String getText() {
        return realmGet$text();
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$text(str);
    }

    public final String getDateText() {
        return realmGet$dateText();
    }

    public final void setDateText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$dateText(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ News(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, p035ru.unicorn.ujin.data.realm.ImageData r9, p046io.realm.RealmList r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            java.lang.String r0 = ""
            if (r12 == 0) goto L_0x0008
            r12 = r0
            goto L_0x0009
        L_0x0008:
            r12 = r5
        L_0x0009:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r6
        L_0x0010:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r7
        L_0x0017:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r8
        L_0x001d:
            r5 = r11 & 16
            r6 = 0
            if (r5 == 0) goto L_0x0025
            r9 = r6
            ru.unicorn.ujin.data.realm.ImageData r9 = (p035ru.unicorn.ujin.data.realm.ImageData) r9
        L_0x0025:
            r3 = r9
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002d
            r10 = r6
            io.realm.RealmList r10 = (p046io.realm.RealmList) r10
        L_0x002d:
            r11 = r10
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r2
            r9 = r0
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r5 = r4 instanceof p046io.realm.internal.RealmObjectProxy
            if (r5 == 0) goto L_0x0041
            r5 = r4
            io.realm.internal.RealmObjectProxy r5 = (p046io.realm.internal.RealmObjectProxy) r5
            r5.realm$injectObjectContext()
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.News.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.unicorn.ujin.data.realm.ImageData, io.realm.RealmList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ImageData getImageData() {
        return realmGet$imageData();
    }

    public final void setImageData(ImageData imageData2) {
        realmSet$imageData(imageData2);
    }

    public final RealmList<ImageData> getImageList() {
        return realmGet$imageList();
    }

    public final void setImageList(RealmList<ImageData> realmList) {
        realmSet$imageList(realmList);
    }

    public News(String str, String str2, String str3, String str4, ImageData imageData2, RealmList<ImageData> realmList) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "text");
        Intrinsics.checkNotNullParameter(str4, "dateText");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$title(str2);
        realmSet$text(str3);
        realmSet$dateText(str4);
        realmSet$imageData(imageData2);
        realmSet$imageList(realmList);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/News$Fields;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.News$Fields */
    /* compiled from: News.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        private static String f6661id = "id";

        private Fields() {
        }

        public final String getId() {
            return f6661id;
        }

        public final void setId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            f6661id = str;
        }
    }
}
