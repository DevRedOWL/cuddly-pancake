package p007at.nineyards.anyline;

import p007at.nineyards.anyline.models.AnylineImage;

/* renamed from: at.nineyards.anyline.ImageProvider */
public interface ImageProvider {
    AnylineImage getNewImage();

    boolean hasNewImage();
}
