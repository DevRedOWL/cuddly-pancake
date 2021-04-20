package p046io.anyline.plugin.document;

import android.content.Context;
import android.graphics.PointF;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Point;
import p007at.nineyards.anyline.AnylineDebugListener;
import p007at.nineyards.anyline.CombinedImageProvider;
import p007at.nineyards.anyline.ImageProvider;
import p007at.nineyards.anyline.camera.HighResolutionImageListener;
import p007at.nineyards.anyline.camera.HighResolutionImageProvider;
import p007at.nineyards.anyline.core.Polygon;
import p007at.nineyards.anyline.core.RunFailure;
import p007at.nineyards.anyline.core.Square;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineRawResult;
import p007at.nineyards.anyline.util.NumUtil;
import p046io.anyline.plugin.AbstractScanPlugin;
import p046io.anyline.plugin.ScanResult;

/* renamed from: io.anyline.plugin.document.DocumentScanPlugin */
public class DocumentScanPlugin extends AbstractScanPlugin<ScanResult<AnylineImage>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5720a = DocumentScanPlugin.class.getSimpleName();

    /* renamed from: b */
    private DocumentScanState f5721b = DocumentScanState.PREVIEW;

    /* renamed from: c */
    private float f5722c = 60.0f;

    /* renamed from: d */
    private boolean f5723d = true;

    /* renamed from: e */
    private Polygon f5724e;

    /* renamed from: f */
    private Float f5725f = Float.valueOf(Float.MIN_VALUE);

    /* renamed from: g */
    private Integer f5726g = Integer.MIN_VALUE;

    /* renamed from: h */
    private Square f5727h;

    /* renamed from: i */
    private boolean f5728i;

    /* renamed from: j */
    private AnylineImage f5729j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public AnylineImage f5730k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public AnylineImage f5731l;

    /* renamed from: m */
    private CombinedImageProvider f5732m;

    public DocumentScanPlugin(Context context, String str, String str2, CombinedImageProvider combinedImageProvider) {
        super(context, str, str2, "anyline/module_document/anyline_assets.json", "document", "anyline/module_document", combinedImageProvider);
        this.f5732m = combinedImageProvider;
    }

    public void setImageProvider(ImageProvider imageProvider) {
        super.setImageProvider(imageProvider);
        if (imageProvider instanceof HighResolutionImageProvider) {
            this.f5732m = (CombinedImageProvider) imageProvider;
            return;
        }
        throw new IllegalArgumentException("The image provider for this plugin must also implement the HighResolutionImageProvider interface.");
    }

    public void setDocumentRatios(Double... dArr) {
        if (dArr == null || dArr.length == 0) {
            this.anylineController.setStartVariable("$documentRatios", (Object) null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Double valueOf : dArr) {
            sb.append(String.valueOf(valueOf));
            sb.append("|");
        }
        sb.setLength(sb.length() - 1);
        this.anylineController.setStartVariable("$documentRatios", sb.toString());
    }

    public void setMaxDocumentRatioDeviation(Double d) {
        this.anylineController.setStartVariable("$maxRatioDeviation", d);
    }

    public void setMaxDocumentOutputResolution(Double d, Double d2) {
        this.anylineController.setStartVariable("$maxOutputResolutionWidth", d);
        this.anylineController.setStartVariable("$maxOutputResolutionHeight", d2);
    }

    public void setCancelOnResult(boolean z) {
        this.f5723d = z;
        super.setCancelOnResult(z);
    }

    public boolean isCancelOnResult() {
        return this.f5723d;
    }

    public void setSkipImages(boolean z) {
        if (z) {
            this.anylineController.setStartVariable("$skip", 1);
        } else {
            this.anylineController.setStartVariable("$skip", 0);
        }
    }

    public void setMinBrightness(float f) {
        this.f5722c = f;
    }

    public DocumentScanState getScanState() {
        return this.f5721b;
    }

    public Polygon getCurrentDocPolygon() {
        return this.f5724e;
    }

    public Float getResizeWidth() {
        return this.f5725f;
    }

    public Integer getContourBorder() {
        return this.f5726g;
    }

    public Square getCurrentDocSquare() {
        return this.f5727h;
    }

    public boolean isBrightnessValid() {
        return this.f5728i;
    }

    public AnylineImage getCurrentCroppedImage() {
        return this.f5729j;
    }

    public AnylineImage getTransformedImage() {
        return this.f5730k;
    }

    public AnylineImage getFullImage() {
        return this.f5731l;
    }

    /* renamed from: io.anyline.plugin.document.DocumentScanPlugin$4 */
    static /* synthetic */ class C45034 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5737a = new int[DocumentScanState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                io.anyline.plugin.document.DocumentScanState[] r0 = p046io.anyline.plugin.document.DocumentScanState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5737a = r0
                int[] r0 = f5737a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.anyline.plugin.document.DocumentScanState r1 = p046io.anyline.plugin.document.DocumentScanState.PREVIEW     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5737a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.anyline.plugin.document.DocumentScanState r1 = p046io.anyline.plugin.document.DocumentScanState.PICTURE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f5737a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.anyline.plugin.document.DocumentScanState r1 = p046io.anyline.plugin.document.DocumentScanState.CORNER_DETECTION     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f5737a     // Catch:{ NoSuchFieldError -> 0x0035 }
                io.anyline.plugin.document.DocumentScanState r1 = p046io.anyline.plugin.document.DocumentScanState.IMAGE_TRANSFORM     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p046io.anyline.plugin.document.DocumentScanPlugin.C45034.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public void onReportsVariable(String str, Object obj) {
        int i = C45034.f5737a[this.f5721b.ordinal()];
        boolean z = true;
        if (i == 1) {
            if ("$brightnessValid".equals(str)) {
                if (NumUtil.asInteger(obj).intValue() != 1) {
                    z = false;
                }
                this.f5728i = z;
            }
            if ("$resizeWidth".equals(str)) {
                this.f5725f = NumUtil.asFloat(obj);
            }
            if ("$contourBorder".equals(str)) {
                this.f5726g = NumUtil.asInteger(obj);
            }
            if (AnylineDebugListener.SQUARE_VARIABLE_NAME.equals(str) && (obj instanceof Square)) {
                this.f5727h = (Square) obj;
            }
            if (AnylineDebugListener.POLYGON_VARIABLE_NAME.equals(str) && (obj instanceof Polygon)) {
                this.f5724e = (Polygon) obj;
            }
            if ("$resizedCroppedImage".equals(str) && (obj instanceof AnylineImage)) {
                AnylineImage anylineImage = this.f5729j;
                if (anylineImage != null) {
                    anylineImage.release();
                }
                this.f5729j = (AnylineImage) obj;
            }
        } else if (i == 2) {
            if (AnylineDebugListener.SQUARE_VARIABLE_NAME.equals(str) && (obj instanceof Square)) {
                this.f5727h = (Square) obj;
            }
            if (!"$result".equals(str) || !(obj instanceof AnylineRawResult)) {
                if ("$outImage".equals(str) && (obj instanceof AnylineImage)) {
                    AnylineImage anylineImage2 = this.f5730k;
                    if (anylineImage2 != null) {
                        anylineImage2.release();
                    }
                    this.f5730k = (AnylineImage) obj;
                }
            } else if (this.anylineController.isDebug()) {
                String str2 = f5720a;
                Log.d(str2, "Reporting result: " + ((AnylineRawResult) obj).toString());
            }
        } else if (i == 3) {
            if ("$resizeWidth".equals(str)) {
                this.f5725f = NumUtil.asFloat(obj);
            }
            if (AnylineDebugListener.SQUARE_VARIABLE_NAME.equals(str) && (obj instanceof Square)) {
                this.f5727h = (Square) obj;
            }
        } else if (i == 4 && "$outImage".equals(str) && (obj instanceof AnylineImage)) {
            AnylineImage anylineImage3 = this.f5730k;
            if (anylineImage3 != null) {
                anylineImage3.release();
            }
            this.f5730k = (AnylineImage) obj;
        }
        invokeOnInfo(str, obj);
    }

    /* access modifiers changed from: protected */
    public void onFinishedWithOutput(Object obj) {
        int i = C45034.f5737a[this.f5721b.ordinal()];
        if (i == 1) {
            AnylineImage clone = this.f5729j.clone();
            this.f5729j.release();
            invokeOnInfo("$previewImage", clone);
            stop();
            this.f5732m.takeHighResolutionImage();
        } else if (i == 2) {
            List<PointF> pointsFromSquare = pointsFromSquare(this.f5727h);
            String str = this.f5713id;
            AnylineImage anylineImage = this.f5731l;
            invokeOnResult(new ScanResult(str, pointsFromSquare, (Integer) null, anylineImage, anylineImage, this.f5730k));
            this.f5730k = null;
            this.f5731l = null;
            if (!this.f5723d) {
                m6748d();
            }
        } else if (i == 3) {
            invokeOnInfo("$cornerDetectionFinished", this.f5727h);
        } else if (i == 4) {
            this.f5731l.release();
            invokeOnInfo("$transformedPicture", this.f5730k);
            this.f5730k = null;
        }
        this.f5728i = true;
    }

    /* access modifiers changed from: protected */
    public void onAbortRun(RunFailure runFailure) {
        if (this.anylineController.isDebug()) {
            String str = f5720a;
            Log.d(str, "RunFailure: (" + runFailure.errorCode() + ") " + runFailure.getMessage());
        }
        this.f5728i = true;
        invokeOnRunSkipped(runFailure);
        if (this.f5721b == DocumentScanState.PICTURE) {
            m6748d();
        }
    }

    public void start() {
        m6745c();
        m6741b();
        m6739a(DocumentScanState.PREVIEW);
    }

    /* renamed from: b */
    private void m6741b() {
        CombinedImageProvider combinedImageProvider = this.f5732m;
        if (combinedImageProvider != null) {
            super.setImageProvider(combinedImageProvider);
        }
    }

    /* renamed from: a */
    private void m6739a(DocumentScanState documentScanState) {
        m6745c();
        this.f5721b = documentScanState;
        int i = C45034.f5737a[documentScanState.ordinal()];
        if (i == 1) {
            this.f5732m.setHighResolutionImageListener(new HighResolutionImageListener() {
                public final void onImageTaken(AnylineImage anylineImage) {
                    DocumentScanPlugin.this.invokeOnInfo("$takePictureSuccess", (Object) null);
                    if (DocumentScanPlugin.this.f5730k != null) {
                        DocumentScanPlugin.this.f5730k.release();
                        AnylineImage unused = DocumentScanPlugin.this.f5730k = null;
                    }
                    DocumentScanPlugin.m6736a(DocumentScanPlugin.this, anylineImage);
                }

                public final void onError(Throwable th) {
                    Log.e(DocumentScanPlugin.f5720a, "Could not take picture from the camera", th);
                    DocumentScanPlugin.this.invokeOnInfo("$takePictureError", th);
                    DocumentScanPlugin.this.m6748d();
                }
            });
        } else if (i == 2) {
            this.anylineController.setStartVariable("$isFullDoc", 1);
        } else if (i == 3) {
            this.anylineController.setStartVariable("$isCornerDetection", 1);
        } else if (i == 4) {
            this.anylineController.setStartVariable("$isImageTransform", 1);
        }
        this.anylineController.setStartVariable("$minBrightness", Float.valueOf(this.f5722c));
        super.start();
    }

    /* renamed from: a */
    private void m6735a(AnylineImage anylineImage) {
        super.setImageProvider(new ImageProvider() {

            /* renamed from: b */
            private boolean f5735b = true;

            public final boolean hasNewImage() {
                return this.f5735b;
            }

            public final AnylineImage getNewImage() {
                this.f5735b = false;
                return DocumentScanPlugin.this.f5731l;
            }
        });
        AnylineImage anylineImage2 = this.f5731l;
        if (anylineImage2 != null) {
            anylineImage2.release();
        }
        this.f5731l = anylineImage;
    }

    /* renamed from: c */
    private void m6745c() {
        this.anylineController.setStartVariable("$isCornerDetection", 0);
        this.anylineController.setStartVariable("$isImageTransform", 0);
        this.anylineController.setStartVariable("$isFullDoc", 0);
        this.anylineController.setStartVariable("$skip", 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m6748d() {
        stop();
        m6741b();
        this.anylineController.setCancelOnResult(this.f5723d);
        m6739a(DocumentScanState.PREVIEW);
    }

    public void transformPicture(AnylineImage anylineImage, List<PointF> list) {
        stop();
        m6735a(anylineImage.clone());
        this.anylineController.setStartVariable(AnylineDebugListener.SQUARE_VARIABLE_NAME, new Square(new Point((double) list.get(0).x, (double) list.get(0).y), new Point((double) list.get(1).x, (double) list.get(1).y), new Point((double) list.get(3).x, (double) list.get(3).y), new Point((double) list.get(2).x, (double) list.get(2).y)));
        this.anylineController.setCancelOnResult(true);
        m6739a(DocumentScanState.IMAGE_TRANSFORM);
    }

    public void triggerPictureCornerDetection() {
        stop();
        this.f5732m.setHighResolutionImageListener(new HighResolutionImageListener() {
            public final void onImageTaken(AnylineImage anylineImage) {
                DocumentScanPlugin.this.invokeOnInfo("$takeCornerDetectionPictureSuccess", (Object) null);
                if (DocumentScanPlugin.this.f5730k != null) {
                    DocumentScanPlugin.this.f5730k.release();
                    AnylineImage unused = DocumentScanPlugin.this.f5730k = null;
                }
                DocumentScanPlugin.m6742b(DocumentScanPlugin.this, anylineImage);
            }

            public final void onError(Throwable th) {
                Log.e(DocumentScanPlugin.f5720a, "Could not take picture from the camera", th);
                DocumentScanPlugin.this.invokeOnInfo("$takePictureError", th);
            }
        });
        this.f5732m.takeHighResolutionImage();
    }

    public static List<PointF> pointsFromSquare(Square square) {
        if (square == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m6732a(square.upLeft()));
        arrayList.add(m6732a(square.upRight()));
        arrayList.add(m6732a(square.downRight()));
        arrayList.add(m6732a(square.downLeft()));
        return arrayList;
    }

    /* renamed from: a */
    private static PointF m6732a(Point point) {
        return new PointF((float) point.f6481x, (float) point.f6482y);
    }

    /* renamed from: a */
    static /* synthetic */ void m6736a(DocumentScanPlugin documentScanPlugin, AnylineImage anylineImage) {
        documentScanPlugin.stop();
        documentScanPlugin.m6735a(anylineImage);
        documentScanPlugin.anylineController.setCancelOnResult(true);
        documentScanPlugin.m6739a(DocumentScanState.PICTURE);
    }

    /* renamed from: b */
    static /* synthetic */ void m6742b(DocumentScanPlugin documentScanPlugin, AnylineImage anylineImage) {
        documentScanPlugin.f5727h = null;
        documentScanPlugin.f5725f = null;
        documentScanPlugin.m6735a(anylineImage);
        documentScanPlugin.anylineController.setCancelOnResult(true);
        documentScanPlugin.m6739a(DocumentScanState.CORNER_DETECTION);
    }
}
