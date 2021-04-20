package p035ru.unicorn.ujin.view.activity.navigation.entity.video;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Camera;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/entity/video/VideoDataSaver;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "sp", "Landroid/content/SharedPreferences;", "getSp", "()Landroid/content/SharedPreferences;", "setSp", "(Landroid/content/SharedPreferences;)V", "loadListOfVideo", "", "Lru/unicorn/ujin/view/activity/navigation/entity/video/IFullScreenData;", "vd", "Lru/unicorn/ujin/view/activity/navigation/entity/video/VideoDataSaver$VideoDataType;", "saveListOfVideo", "", "data", "", "Companion", "VideoDataType", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.video.VideoDataSaver */
/* compiled from: VideoDataSaver.kt */
public final class VideoDataSaver {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Context context;

    /* renamed from: sp */
    private SharedPreferences f6732sp;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.video.VideoDataSaver$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[VideoDataType.values().length];

        static {
            $EnumSwitchMapping$0[VideoDataType.FROM_VIDEO_PREVIEW.ordinal()] = 1;
        }
    }

    public VideoDataSaver(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
        Context context3 = this.context;
        SharedPreferences sharedPreferences = context3.getSharedPreferences(context3.getString(R.string.app_name_app), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…p), Context.MODE_PRIVATE)");
        this.f6732sp = sharedPreferences;
    }

    public final Context getContext() {
        return this.context;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/entity/video/VideoDataSaver$VideoDataType;", "", "videoDataKey", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getVideoDataKey", "()Ljava/lang/String;", "FROM_VIDEO_PREVIEW", "FROM_GATE_PREVIEW", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.video.VideoDataSaver$VideoDataType */
    /* compiled from: VideoDataSaver.kt */
    public enum VideoDataType {
        FROM_VIDEO_PREVIEW("key_from_video_preview"),
        FROM_GATE_PREVIEW("key_from_gate_preview");
        
        private final String videoDataKey;

        private VideoDataType(String str) {
            this.videoDataKey = str;
        }

        public final String getVideoDataKey() {
            return this.videoDataKey;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/entity/video/VideoDataSaver$Companion;", "", "()V", "getTypeByValue", "Lru/unicorn/ujin/view/activity/navigation/entity/video/VideoDataSaver$VideoDataType;", "key", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.video.VideoDataSaver$Companion */
    /* compiled from: VideoDataSaver.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VideoDataType getTypeByValue(String str) {
            Intrinsics.checkNotNullParameter(str, "key");
            for (VideoDataType videoDataType : VideoDataType.values()) {
                if (StringsKt.equals(videoDataType.getVideoDataKey(), str, true)) {
                    return videoDataType;
                }
            }
            return null;
        }
    }

    public final SharedPreferences getSp() {
        return this.f6732sp;
    }

    public final void setSp(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.f6732sp = sharedPreferences;
    }

    public final void saveListOfVideo(List<? extends IFullScreenData> list, VideoDataType videoDataType) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(videoDataType, "vd");
        this.f6732sp.edit().putString(videoDataType.getVideoDataKey(), new Gson().toJson((Object) list)).apply();
    }

    public final List<IFullScreenData> loadListOfVideo(VideoDataType videoDataType) {
        Intrinsics.checkNotNullParameter(videoDataType, "vd");
        String string = this.f6732sp.getString(videoDataType.getVideoDataKey(), (String) null);
        if (string == null) {
            return null;
        }
        if (WhenMappings.$EnumSwitchMapping$0[videoDataType.ordinal()] != 1) {
            Camera[] cameraArr = (Camera[]) new Gson().fromJson(string, Camera[].class);
            if (cameraArr != null) {
                return ArraysKt.toMutableList((T[]) cameraArr);
            }
            return null;
        }
        C5788Video[] videoArr = (C5788Video[]) new Gson().fromJson(string, C5788Video[].class);
        if (videoArr != null) {
            return ArraysKt.toMutableList((T[]) videoArr);
        }
        return null;
    }
}
