package net.alhazmy13.mediapicker.Image;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import java.lang.ref.WeakReference;
import net.alhazmy13.mediapicker.Image.ImageTags;

public class ImagePicker {
    public static final String EXTRA_IMAGE_PATH = "EXTRA_IMAGE_PATH";
    public static final int IMAGE_PICKER_REQUEST_CODE = 42141;

    ImagePicker(Builder builder) {
        WeakReference access$000 = builder.context;
        ((Activity) access$000.get()).startActivityForResult(ImageActivity.getCallingIntent((Context) access$000.get(), builder.imageConfig), IMAGE_PICKER_REQUEST_CODE);
    }

    public static class Builder implements ImagePickerBuilderBase {
        /* access modifiers changed from: private */
        public final WeakReference<Activity> context;
        /* access modifiers changed from: private */
        public ImageConfig imageConfig = new ImageConfig();

        public Builder(Activity activity) {
            this.context = new WeakReference<>(activity);
        }

        public Builder compressLevel(ComperesLevel comperesLevel) {
            this.imageConfig.compressLevel = comperesLevel;
            return this;
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
            if (C50781.$SwitchMap$net$alhazmy13$mediapicker$Image$ImagePicker$Directory[directory.ordinal()] == 1) {
                ImageConfig imageConfig2 = this.imageConfig;
                imageConfig2.directory = Environment.getExternalStorageDirectory() + ImageTags.Tags.IMAGE_PICKER_DIR;
            }
            return this;
        }

        public Builder extension(Extension extension) {
            this.imageConfig.extension = extension;
            return this;
        }

        public Builder scale(int i, int i2) {
            ImageConfig imageConfig2 = this.imageConfig;
            imageConfig2.reqHeight = i2;
            imageConfig2.reqWidth = i;
            return this;
        }

        public Builder allowMultipleImages(boolean z) {
            this.imageConfig.allowMultiple = z;
            return this;
        }

        public Builder enableDebuggingMode(boolean z) {
            this.imageConfig.debug = z;
            return this;
        }

        public Builder allowOnlineImages(boolean z) {
            this.imageConfig.allowOnlineImages = z;
            return this;
        }

        public ImagePicker build() {
            return new ImagePicker(this);
        }

        public Activity getContext() {
            return (Activity) this.context.get();
        }
    }

    /* renamed from: net.alhazmy13.mediapicker.Image.ImagePicker$1 */
    static /* synthetic */ class C50781 {
        static final /* synthetic */ int[] $SwitchMap$net$alhazmy13$mediapicker$Image$ImagePicker$Directory = new int[Directory.values().length];

        static {
            try {
                $SwitchMap$net$alhazmy13$mediapicker$Image$ImagePicker$Directory[Directory.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum Extension {
        PNG(".png"),
        JPG(".jpg");
        
        private final String value;

        private Extension(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public enum ComperesLevel {
        HARD(20),
        MEDIUM(50),
        SOFT(80),
        NONE(100);
        
        private final int value;

        private ComperesLevel(int i) {
            this.value = i;
        }

        public int getValue() {
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
