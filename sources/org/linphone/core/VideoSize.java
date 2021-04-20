package org.linphone.core;

import com.drew.metadata.photoshop.PhotoshopDirectory;
import org.jetbrains.anko.DimensionsKt;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

public final class VideoSize {
    public static final int CIF = 1;
    public static final int HVGA = 2;
    public static final int QCIF = 0;
    public static final int QVGA = 3;
    public static final VideoSize VIDEO_SIZE_1080P = new VideoSize(1920, PhotoshopDirectory.TAG_COUNT_INFORMATION);
    public static final VideoSize VIDEO_SIZE_720P = new VideoSize(1280, 720);
    public static final VideoSize VIDEO_SIZE_CIF = new VideoSize(352, 288);
    public static final VideoSize VIDEO_SIZE_HVGA = new VideoSize(DimensionsKt.XHDPI, DimensionsKt.XXHDPI);
    public static final VideoSize VIDEO_SIZE_QCIF = new VideoSize(176, 144);
    public static final VideoSize VIDEO_SIZE_QVGA = new VideoSize(DimensionsKt.XHDPI, DimensionsKt.HDPI);
    public static final VideoSize VIDEO_SIZE_VGA = new VideoSize(640, DimensionsKt.XXHDPI);
    public int height;
    public int width;

    public VideoSize() {
    }

    public VideoSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Deprecated
    public static final VideoSize createStandard(int i, boolean z) {
        if (i == 0) {
            return z ? new VideoSize(144, 176) : new VideoSize(176, 144);
        }
        if (i == 1) {
            return z ? new VideoSize(288, 352) : new VideoSize(352, 288);
        }
        if (i == 2) {
            return z ? new VideoSize(DimensionsKt.XHDPI, DimensionsKt.XXHDPI) : new VideoSize(DimensionsKt.XXHDPI, DimensionsKt.XHDPI);
        }
        if (i != 3) {
            return new VideoSize();
        }
        return z ? new VideoSize(DimensionsKt.HDPI, DimensionsKt.XHDPI) : new VideoSize(DimensionsKt.XHDPI, DimensionsKt.HDPI);
    }

    public boolean isValid() {
        return this.width > 0 && this.height > 0;
    }

    public int hashCode() {
        return ((this.height + 31) * 31) + this.width;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        return this.height == videoSize.height && this.width == videoSize.width;
    }

    public String toDisplayableString() {
        return this.width + MapPoint.JsonFields.f6911x + this.height;
    }

    public String toString() {
        return "width = " + this.width + " height = " + this.height;
    }

    public boolean isPortrait() {
        return this.height >= this.width;
    }

    public VideoSize createInverted() {
        return new VideoSize(this.height, this.width);
    }
}
