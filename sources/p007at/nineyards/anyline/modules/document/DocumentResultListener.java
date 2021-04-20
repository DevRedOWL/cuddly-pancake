package p007at.nineyards.anyline.modules.document;

import android.graphics.PointF;
import java.util.List;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.modules.AnylineModuleResultListener;
import p007at.nineyards.anyline.modules.document.DocumentScanView;

/* renamed from: at.nineyards.anyline.modules.document.DocumentResultListener */
public interface DocumentResultListener extends AnylineModuleResultListener<DocumentResult> {
    boolean onDocumentOutlineDetected(List<PointF> list, boolean z);

    void onPictureCornersDetected(AnylineImage anylineImage, List<PointF> list);

    void onPictureProcessingFailure(DocumentScanView.DocumentError documentError);

    void onPictureTransformError(DocumentScanView.DocumentError documentError);

    void onPictureTransformed(AnylineImage anylineImage);

    void onPreviewProcessingFailure(DocumentScanView.DocumentError documentError);

    void onPreviewProcessingSuccess(AnylineImage anylineImage);

    void onTakePictureError(Throwable th);

    void onTakePictureSuccess();
}
