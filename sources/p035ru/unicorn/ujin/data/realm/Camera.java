package p035ru.unicorn.ujin.data.realm;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.IFullScreenData;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CameraRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\n\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Camera;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/entity/video/IFullScreenData;", "videourl", "", "preview", "(Ljava/lang/String;Ljava/lang/String;)V", "getPreview", "()Ljava/lang/String;", "setPreview", "(Ljava/lang/String;)V", "getVideourl", "setVideourl", "getVideoTitle", "getVideoUrl", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.Camera */
/* compiled from: Point.kt */
public class Camera extends RealmObject implements IFullScreenData, ru_unicorn_ujin_data_realm_CameraRealmProxyInterface {
    private String preview;
    private String videourl;

    public Camera() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getVideoTitle() {
        return "";
    }

    public String realmGet$preview() {
        return this.preview;
    }

    public String realmGet$videourl() {
        return this.videourl;
    }

    public void realmSet$preview(String str) {
        this.preview = str;
    }

    public void realmSet$videourl(String str) {
        this.videourl = str;
    }

    public final String getVideourl() {
        return realmGet$videourl();
    }

    public final void setVideourl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$videourl(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Camera(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getPreview() {
        return realmGet$preview();
    }

    public final void setPreview(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$preview(str);
    }

    public Camera(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "videourl");
        Intrinsics.checkNotNullParameter(str2, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$videourl(str);
        realmSet$preview(str2);
    }

    public String getVideoUrl() {
        return realmGet$videourl();
    }
}
