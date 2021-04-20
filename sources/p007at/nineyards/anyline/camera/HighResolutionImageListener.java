package p007at.nineyards.anyline.camera;

import p007at.nineyards.anyline.models.AnylineImage;

/* renamed from: at.nineyards.anyline.camera.HighResolutionImageListener */
public interface HighResolutionImageListener {
    void onError(Throwable th);

    void onImageTaken(AnylineImage anylineImage);
}
