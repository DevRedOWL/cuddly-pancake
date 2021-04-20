package p035ru.unicorn.ujin.view.activity.navigation.entity.video;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
import p046io.realm.C4675x1f47e00c;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u0003Bw\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012J\u0010\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u0000H\u0016J\u0010\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u0000H\u0016J\n\u00102\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u00103\u001a\u0004\u0018\u00010\u0005H\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0017\"\u0004\b\u001a\u0010\u0019R\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016¨\u00064"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/entity/video/Video;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "Lru/unicorn/ujin/view/activity/navigation/entity/video/IFullScreenData;", "id", "", "videourl", "videourlpeg", "preview", "ratio", "", "main", "", "title", "isFullscrenn", "", "isHasArchive", "newArchiveUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "()Z", "setFullscrenn", "(Z)V", "setHasArchive", "getMain", "()Ljava/lang/Integer;", "setMain", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getNewArchiveUrl", "setNewArchiveUrl", "getPreview", "setPreview", "getRatio", "()Ljava/lang/Double;", "setRatio", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getTitle", "setTitle", "getVideourl", "setVideourl", "getVideourlpeg", "setVideourlpeg", "areContentsTheSame", "other", "areItemsTheSame", "getVideoTitle", "getVideoUrl", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.video.Video */
/* compiled from: Video.kt */
public class C5788Video extends RealmObject implements Diffable<C5788Video>, IFullScreenData, C4675x1f47e00c {
    @SerializedName("id")

    /* renamed from: id */
    private String f6731id;
    @SerializedName("fullscreen")
    private boolean isFullscrenn;
    @SerializedName("has_archive")
    private boolean isHasArchive;
    @SerializedName("main")
    private Integer main;
    @SerializedName("url_archive")
    private String newArchiveUrl;
    @SerializedName("preview")
    private String preview;
    @SerializedName("ratio")
    private Double ratio;
    @SerializedName("title")
    private String title;
    @SerializedName("videourl")
    private String videourl;
    @SerializedName("mjpeg_new")
    private String videourlpeg;

    public C5788Video() {
        this((String) null, (String) null, (String) null, (String) null, (Double) null, (Integer) null, (String) null, false, false, (String) null, 1023, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public boolean areContentsTheSame(C5788Video video) {
        Intrinsics.checkNotNullParameter(video, Contact.Type.other);
        return true;
    }

    public boolean areItemsTheSame(C5788Video video) {
        Intrinsics.checkNotNullParameter(video, Contact.Type.other);
        return true;
    }

    public String realmGet$id() {
        return this.f6731id;
    }

    public boolean realmGet$isFullscrenn() {
        return this.isFullscrenn;
    }

    public boolean realmGet$isHasArchive() {
        return this.isHasArchive;
    }

    public Integer realmGet$main() {
        return this.main;
    }

    public String realmGet$newArchiveUrl() {
        return this.newArchiveUrl;
    }

    public String realmGet$preview() {
        return this.preview;
    }

    public Double realmGet$ratio() {
        return this.ratio;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$videourl() {
        return this.videourl;
    }

    public String realmGet$videourlpeg() {
        return this.videourlpeg;
    }

    public void realmSet$id(String str) {
        this.f6731id = str;
    }

    public void realmSet$isFullscrenn(boolean z) {
        this.isFullscrenn = z;
    }

    public void realmSet$isHasArchive(boolean z) {
        this.isHasArchive = z;
    }

    public void realmSet$main(Integer num) {
        this.main = num;
    }

    public void realmSet$newArchiveUrl(String str) {
        this.newArchiveUrl = str;
    }

    public void realmSet$preview(String str) {
        this.preview = str;
    }

    public void realmSet$ratio(Double d) {
        this.ratio = d;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$videourl(String str) {
        this.videourl = str;
    }

    public void realmSet$videourlpeg(String str) {
        this.videourlpeg = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C5788Video(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Double r17, java.lang.Integer r18, java.lang.String r19, boolean r20, boolean r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r12 = this;
            r0 = r12
            r1 = r23
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000c
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x000d
        L_0x000c:
            r2 = r13
        L_0x000d:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0015
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0016
        L_0x0015:
            r4 = r14
        L_0x0016:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x001e
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x0027
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0029
        L_0x0027:
            r6 = r16
        L_0x0029:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0031
            r7 = r3
            java.lang.Double r7 = (java.lang.Double) r7
            goto L_0x0033
        L_0x0031:
            r7 = r17
        L_0x0033:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x003b
            r8 = r3
            java.lang.Integer r8 = (java.lang.Integer) r8
            goto L_0x003d
        L_0x003b:
            r8 = r18
        L_0x003d:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0044
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0046
        L_0x0044:
            r3 = r19
        L_0x0046:
            r9 = r1 & 128(0x80, float:1.794E-43)
            r10 = 0
            if (r9 == 0) goto L_0x004d
            r9 = 0
            goto L_0x004f
        L_0x004d:
            r9 = r20
        L_0x004f:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r10 = r21
        L_0x0056:
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = ""
            goto L_0x005f
        L_0x005d:
            r1 = r22
        L_0x005f:
            r13 = r12
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r3
            r21 = r9
            r22 = r10
            r23 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x007f
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.entity.video.C5788Video.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Integer, java.lang.String, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getVideourl() {
        return realmGet$videourl();
    }

    public final void setVideourl(String str) {
        realmSet$videourl(str);
    }

    public final String getVideourlpeg() {
        return realmGet$videourlpeg();
    }

    public final void setVideourlpeg(String str) {
        realmSet$videourlpeg(str);
    }

    public final String getPreview() {
        return realmGet$preview();
    }

    public final void setPreview(String str) {
        realmSet$preview(str);
    }

    public final Double getRatio() {
        return realmGet$ratio();
    }

    public final void setRatio(Double d) {
        realmSet$ratio(d);
    }

    public final Integer getMain() {
        return realmGet$main();
    }

    public final void setMain(Integer num) {
        realmSet$main(num);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final boolean isFullscrenn() {
        return realmGet$isFullscrenn();
    }

    public final void setFullscrenn(boolean z) {
        realmSet$isFullscrenn(z);
    }

    public final boolean isHasArchive() {
        return realmGet$isHasArchive();
    }

    public final void setHasArchive(boolean z) {
        realmSet$isHasArchive(z);
    }

    public final String getNewArchiveUrl() {
        return realmGet$newArchiveUrl();
    }

    public final void setNewArchiveUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$newArchiveUrl(str);
    }

    public C5788Video(String str, String str2, String str3, String str4, Double d, Integer num, String str5, boolean z, boolean z2, String str6) {
        Intrinsics.checkNotNullParameter(str6, "newArchiveUrl");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$videourl(str2);
        realmSet$videourlpeg(str3);
        realmSet$preview(str4);
        realmSet$ratio(d);
        realmSet$main(num);
        realmSet$title(str5);
        realmSet$isFullscrenn(z);
        realmSet$isHasArchive(z2);
        realmSet$newArchiveUrl(str6);
    }

    public String getVideoUrl() {
        return realmGet$videourlpeg();
    }

    public String getVideoTitle() {
        return realmGet$title();
    }
}
