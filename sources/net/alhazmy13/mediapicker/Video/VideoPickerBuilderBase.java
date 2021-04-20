package net.alhazmy13.mediapicker.Video;

import net.alhazmy13.mediapicker.Video.VideoPicker;

public interface VideoPickerBuilderBase {
    VideoPicker build();

    VideoPicker.Builder directory(String str);

    VideoPicker.Builder directory(VideoPicker.Directory directory);

    VideoPicker.Builder enableDebuggingMode(boolean z);

    VideoPicker.Builder extension(VideoPicker.Extension extension);

    VideoPicker.Builder mode(VideoPicker.Mode mode);
}
