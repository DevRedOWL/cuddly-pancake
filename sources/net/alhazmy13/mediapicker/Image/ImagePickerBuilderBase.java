package net.alhazmy13.mediapicker.Image;

import net.alhazmy13.mediapicker.Image.ImagePicker;

public interface ImagePickerBuilderBase {
    ImagePicker.Builder allowMultipleImages(boolean z);

    ImagePicker.Builder allowOnlineImages(boolean z);

    ImagePicker build();

    ImagePicker.Builder compressLevel(ImagePicker.ComperesLevel comperesLevel);

    ImagePicker.Builder directory(String str);

    ImagePicker.Builder directory(ImagePicker.Directory directory);

    ImagePicker.Builder enableDebuggingMode(boolean z);

    ImagePicker.Builder extension(ImagePicker.Extension extension);

    ImagePicker.Builder mode(ImagePicker.Mode mode);

    ImagePicker.Builder scale(int i, int i2);
}
