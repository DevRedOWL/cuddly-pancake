package p033co.infinum.goldeneye;

import android.graphics.Bitmap;
import android.view.TextureView;
import com.facebook.common.util.UriUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.config.CameraConfig;
import p033co.infinum.goldeneye.config.CameraInfo;
import p033co.infinum.goldeneye.models.CameraApi;
import p033co.infinum.goldeneye.models.CameraState;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JR\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u000fH\u0017J8\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u000fH\u0016J@\u0010\u0019\u001a\u00020\t2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u000f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068DX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u001e"}, mo51343d2 = {"Lco/infinum/goldeneye/BaseGoldenEye;", "Lco/infinum/goldeneye/GoldenEye;", "version", "Lco/infinum/goldeneye/models/CameraApi;", "(Lco/infinum/goldeneye/models/CameraApi;)V", "isConfigAvailable", "", "()Z", "open", "", "textureView", "Landroid/view/TextureView;", "cameraInfo", "Lco/infinum/goldeneye/config/CameraInfo;", "onReady", "Lkotlin/Function1;", "Lco/infinum/goldeneye/config/CameraConfig;", "onActive", "Lkotlin/Function0;", "onError", "", "startRecording", "file", "Ljava/io/File;", "onVideoRecorded", "takePicture", "onPictureTaken", "Landroid/graphics/Bitmap;", "onShutter", "Companion", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.BaseGoldenEye */
/* compiled from: BaseGoldenEye.kt */
public abstract class BaseGoldenEye implements GoldenEye {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static CameraState state = CameraState.CLOSED;
    public static CameraApi version;

    public BaseGoldenEye(CameraApi cameraApi) {
        Intrinsics.checkParameterIsNotNull(cameraApi, ClientCookie.VERSION_ATTR);
        version = cameraApi;
    }

    public static final /* synthetic */ CameraApi access$getVersion$cp() {
        CameraApi cameraApi = version;
        if (cameraApi == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ClientCookie.VERSION_ATTR);
        }
        return cameraApi;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lco/infinum/goldeneye/BaseGoldenEye$Companion;", "", "()V", "state", "Lco/infinum/goldeneye/models/CameraState;", "getState", "()Lco/infinum/goldeneye/models/CameraState;", "setState", "(Lco/infinum/goldeneye/models/CameraState;)V", "version", "Lco/infinum/goldeneye/models/CameraApi;", "getVersion", "()Lco/infinum/goldeneye/models/CameraApi;", "setVersion", "(Lco/infinum/goldeneye/models/CameraApi;)V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.BaseGoldenEye$Companion */
    /* compiled from: BaseGoldenEye.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CameraApi getVersion() {
            return BaseGoldenEye.access$getVersion$cp();
        }

        public final void setVersion(CameraApi cameraApi) {
            Intrinsics.checkParameterIsNotNull(cameraApi, "<set-?>");
            BaseGoldenEye.version = cameraApi;
        }

        public final CameraState getState() {
            return BaseGoldenEye.state;
        }

        public final void setState(CameraState cameraState) {
            Intrinsics.checkParameterIsNotNull(cameraState, "<set-?>");
            BaseGoldenEye.state = cameraState;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean isConfigAvailable() {
        switch (state) {
            case CLOSED:
            case INITIALIZING:
                return false;
            case READY:
            case ACTIVE:
            case TAKING_PICTURE:
            case RECORDING_VIDEO:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public void open(TextureView textureView, CameraInfo cameraInfo, Function1<? super CameraConfig, Unit> function1, Function0<Unit> function0, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        Intrinsics.checkParameterIsNotNull(cameraInfo, "cameraInfo");
        Intrinsics.checkParameterIsNotNull(function12, "onError");
        open(textureView, cameraInfo, new BaseGoldenEye$open$1(function1, function0, function12));
    }

    public void takePicture(Function1<? super Bitmap, Unit> function1, Function1<? super Throwable, Unit> function12, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function1, "onPictureTaken");
        Intrinsics.checkParameterIsNotNull(function12, "onError");
        takePicture(new BaseGoldenEye$takePicture$1(function1, function12, function0));
    }

    public void startRecording(File file, Function1<? super File, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(file, UriUtil.LOCAL_FILE_SCHEME);
        Intrinsics.checkParameterIsNotNull(function1, "onVideoRecorded");
        Intrinsics.checkParameterIsNotNull(function12, "onError");
        startRecording(file, new BaseGoldenEye$startRecording$1(function1, function12));
    }
}
