package net.alhazmy13.mediapicker.Video;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import java.lang.ref.WeakReference;
import net.alhazmy13.mediapicker.Video.VideoTags;

public class VideoPicker {
    public static final String EXTRA_VIDEO_PATH = "EXTRA_VIDEO_PATH";
    public static final int VIDEO_PICKER_REQUEST_CODE = 53213;

    VideoPicker(Builder builder) {
        WeakReference access$000 = builder.context;
        ((Activity) access$000.get()).startActivityForResult(VideoActivity.getCallingIntent((Context) access$000.get(), builder.imageConfig), VIDEO_PICKER_REQUEST_CODE);
    }

    public static class Builder implements VideoPickerBuilderBase {
        /* access modifiers changed from: private */
        public final WeakReference<Activity> context;
        /* access modifiers changed from: private */
        public VideoConfig imageConfig = new VideoConfig();

        public Builder(Activity activity) {
            this.context = new WeakReference<>(activity);
        }

        public Builder mode(Mode mode) {
            this.imageConfig.mode = mode;
            return this;
        }

        public Builder directory(String str) {
            this.imageConfig.directory = str;
            return this;
        }

        public Builder directory(Directory directory) {
            if (C50881.$SwitchMap$net$alhazmy13$mediapicker$Video$VideoPicker$Directory[directory.ordinal()] == 1) {
                VideoConfig videoConfig = this.imageConfig;
                videoConfig.directory = Environment.getExternalStorageDirectory() + VideoTags.Tags.IMAGE_PICKER_DIR;
            }
            return this;
        }

        public Builder extension(Extension extension) {
            this.imageConfig.extension = extension;
            return this;
        }

        public Builder enableDebuggingMode(boolean z) {
            this.imageConfig.debug = z;
            return this;
        }

        public VideoPicker build() {
            return new VideoPicker(this);
        }

        public Activity getContext() {
            return (Activity) this.context.get();
        }
    }

    /* renamed from: net.alhazmy13.mediapicker.Video.VideoPicker$1 */
    static /* synthetic */ class C50881 {
        static final /* synthetic */ int[] $SwitchMap$net$alhazmy13$mediapicker$Video$VideoPicker$Directory = new int[Directory.values().length];

        static {
            try {
                $SwitchMap$net$alhazmy13$mediapicker$Video$VideoPicker$Directory[Directory.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum Extension {
        MP4(".mp4");
        
        private final String value;

        private Extension(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public enum Mode {
        CAMERA(0),
        GALLERY(1),
        CAMERA_AND_GALLERY(2);
        
        private final int value;

        private Mode(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum Directory {
        DEFAULT(0);
        
        private final int value;

        private Directory(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }
}
