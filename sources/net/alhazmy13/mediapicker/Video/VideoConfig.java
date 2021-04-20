package net.alhazmy13.mediapicker.Video;

import android.os.Environment;
import java.io.Serializable;
import net.alhazmy13.mediapicker.Video.VideoPicker;
import net.alhazmy13.mediapicker.Video.VideoTags;

class VideoConfig implements Serializable {
    protected boolean allowMultiple = false;
    protected boolean debug;
    protected String directory = (Environment.getExternalStorageDirectory() + VideoTags.Tags.IMAGE_PICKER_DIR);
    protected VideoPicker.Extension extension = VideoPicker.Extension.MP4;
    protected boolean isImgFromCamera;
    protected VideoPicker.Mode mode = VideoPicker.Mode.CAMERA;

    VideoConfig() {
    }

    public String toString() {
        return "ImageConfig{extension=" + this.extension + ", mode=" + this.mode + ", directory='" + this.directory + '\'' + ", allowMultiple=" + this.allowMultiple + ", isImgFromCamera=" + this.isImgFromCamera + ", debug=" + this.debug + '}';
    }
}
