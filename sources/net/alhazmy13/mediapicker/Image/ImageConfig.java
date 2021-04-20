package net.alhazmy13.mediapicker.Image;

import android.os.Environment;
import java.io.Serializable;
import net.alhazmy13.mediapicker.Image.ImagePicker;
import net.alhazmy13.mediapicker.Image.ImageTags;

class ImageConfig implements Serializable {
    protected boolean allowMultiple = false;
    protected boolean allowOnlineImages = false;
    protected ImagePicker.ComperesLevel compressLevel = ImagePicker.ComperesLevel.NONE;
    protected boolean debug;
    protected String directory = (Environment.getExternalStorageDirectory() + ImageTags.Tags.IMAGE_PICKER_DIR);
    protected ImagePicker.Extension extension = ImagePicker.Extension.PNG;
    protected boolean isImgFromCamera;
    protected ImagePicker.Mode mode = ImagePicker.Mode.CAMERA;
    protected int reqHeight = 0;
    protected int reqWidth = 0;

    ImageConfig() {
    }

    public String toString() {
        return "ImageConfig{extension=" + this.extension + ", compressLevel=" + this.compressLevel + ", mode=" + this.mode + ", directory='" + this.directory + '\'' + ", reqHeight=" + this.reqHeight + ", reqWidth=" + this.reqWidth + ", allowMultiple=" + this.allowMultiple + ", isImgFromCamera=" + this.isImgFromCamera + ", allowOnlineImages=" + this.allowOnlineImages + ", debug=" + this.debug + '}';
    }
}
