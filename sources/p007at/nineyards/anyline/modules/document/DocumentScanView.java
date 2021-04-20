package p007at.nineyards.anyline.modules.document;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p007at.nineyards.anyline.AnylineDebugListener;
import p007at.nineyards.anyline.camera.AnylineViewConfig;
import p007at.nineyards.anyline.core.Polygon;
import p007at.nineyards.anyline.core.Square;
import p007at.nineyards.anyline.core.Vector_Point;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.modules.AnylineBaseModuleView;
import p007at.nineyards.anyline.util.NumUtil;
import p046io.anyline.plugin.ScanInfo;
import p046io.anyline.plugin.ScanInfoListener;
import p046io.anyline.plugin.ScanResult;
import p046io.anyline.plugin.ScanResultListener;
import p046io.anyline.plugin.ScanRunSkippedListener;
import p046io.anyline.plugin.document.DocumentScanPlugin;
import p046io.anyline.plugin.document.DocumentScanState;

/* renamed from: at.nineyards.anyline.modules.document.DocumentScanView */
public class DocumentScanView extends AnylineBaseModuleView<DocumentResultListener> {
    public static final String COLOR_GREEN = "#00E510";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f627a = DocumentScanView.class.getSimpleName();

    /* renamed from: b */
    private final SensorManager f628b;

    /* renamed from: c */
    private final Sensor f629c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f630d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public float f631e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f632f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Float f633g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ArrayDeque<Float> f634h;

    /* renamed from: i */
    private Double[] f635i;

    /* renamed from: j */
    private Double f636j;

    /* renamed from: k */
    private Double f637k;

    /* renamed from: l */
    private Double f638l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public DocumentResultListener f639m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public DocumentScanPlugin f640n;

    /* renamed from: o */
    private SensorEventListener f641o;

    /* renamed from: at.nineyards.anyline.modules.document.DocumentScanView$DocumentError */
    public enum DocumentError {
        DOCUMENT_OUTLINE_NOT_FOUND,
        DOCUMENT_SKEW_TOO_HIGH,
        GLARE_DETECTED,
        IMAGE_TOO_DARK,
        DOCUMENT_NOT_SHARP,
        SHAKE_DETECTED,
        DOCUMENT_BOUNDS_OUTSIDE_OF_TOLERANCE,
        DOCUMENT_RATIO_OUTSIDE_OF_TOLERANCE,
        UNKNOWN
    }

    /* renamed from: at.nineyards.anyline.modules.document.DocumentScanView$DocumentRatio */
    public enum DocumentRatio {
        DIN_AX_LANDSCAPE(1.41d),
        DIN_AX_PORTRAIT(0.707d),
        COMPLIMENTS_SLIP_LANDSCAPE(2.12d),
        COMPLIMENTS_SLIP_PORTRAIT(0.47d),
        BUSINESS_CARD_LANDSCAPE(1.58d),
        BUSINESS_CARD_PORTRAIT(0.633d),
        LETTER_LANDSCAPE(1.296d),
        LETTER_PORTRAIT(0.772d);
        

        /* renamed from: a */
        private final double f648a;

        private DocumentRatio(double d) {
            this.f648a = d;
        }

        public final double getRatio() {
            return this.f648a;
        }
    }

    public DocumentScanView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DocumentScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f633g = Float.valueOf(0.0f);
        this.f634h = new ArrayDeque<>(4);
        this.f635i = null;
        this.f636j = null;
        this.f637k = null;
        this.f638l = null;
        this.f641o = new SensorEventListener() {
            public final void onAccuracyChanged(Sensor sensor, int i) {
            }

            public final void onSensorChanged(SensorEvent sensorEvent) {
                if (DocumentScanView.this.f640n != null && DocumentScanView.this.f640n.getScanState() == DocumentScanState.PREVIEW && sensorEvent.sensor.getType() == 1) {
                    float f = sensorEvent.values[0];
                    float f2 = sensorEvent.values[1];
                    float f3 = sensorEvent.values[2];
                    DocumentScanView documentScanView = DocumentScanView.this;
                    float unused = documentScanView.f631e = documentScanView.f630d;
                    float unused2 = DocumentScanView.this.f630d = (float) Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)));
                    float abs = Math.abs(DocumentScanView.this.f630d - DocumentScanView.this.f631e);
                    DocumentScanView documentScanView2 = DocumentScanView.this;
                    float unused3 = documentScanView2.f632f = (documentScanView2.f632f * 0.9f) + abs;
                    if (DocumentScanView.this.f634h.size() >= 4) {
                        DocumentScanView documentScanView3 = DocumentScanView.this;
                        Float unused4 = documentScanView3.f633g = Float.valueOf(documentScanView3.f633g.floatValue() - ((Float) DocumentScanView.this.f634h.removeFirst()).floatValue());
                    }
                    DocumentScanView.this.f634h.add(Float.valueOf(DocumentScanView.this.f632f));
                    DocumentScanView documentScanView4 = DocumentScanView.this;
                    Float unused5 = documentScanView4.f633g = Float.valueOf(documentScanView4.f633g.floatValue() + DocumentScanView.this.f632f);
                    if (DocumentScanView.this.f633g.floatValue() / ((float) DocumentScanView.this.f634h.size()) > 3.2f) {
                        DocumentScanView.this.clearDrawing();
                        DocumentScanView.this.f640n.setSkipImages(true);
                        DocumentScanView.this.reportDebugVariable(AnylineDebugListener.DEVICE_SHAKE_WARNING_VARIABLE_NAME, true);
                        DocumentScanView.m249a(DocumentScanView.this, DocumentError.SHAKE_DETECTED);
                        return;
                    }
                    DocumentScanView.this.f640n.setSkipImages(false);
                }
            }
        };
        this.f628b = (SensorManager) context.getSystemService("sensor");
        this.f629c = this.f628b.getDefaultSensor(1);
    }

    public void setConfig(AnylineViewConfig anylineViewConfig) {
        if (anylineViewConfig.getFlashMode() == AnylineViewConfig.FlashMode.AUTO) {
            setLevelsForAutoFlash(40, 90, 10, 25);
        }
        super.setConfig(anylineViewConfig);
    }

    public void setDocumentRatios(Double... dArr) {
        this.f635i = dArr;
        DocumentScanPlugin documentScanPlugin = this.f640n;
        if (documentScanPlugin != null) {
            documentScanPlugin.setDocumentRatios(dArr);
        }
    }

    public void setMaxDocumentRatioDeviation(Double d) {
        this.f636j = d;
        DocumentScanPlugin documentScanPlugin = this.f640n;
        if (documentScanPlugin != null) {
            documentScanPlugin.setMaxDocumentRatioDeviation(d);
        }
    }

    public void setMaxDocumentOutputResolution(Double d, Double d2) {
        this.f637k = d;
        this.f638l = d2;
        DocumentScanPlugin documentScanPlugin = this.f640n;
        if (documentScanPlugin != null) {
            documentScanPlugin.setMaxDocumentOutputResolution(d, d2);
        }
    }

    public void initAnyline(String str, DocumentResultListener documentResultListener) {
        Double d;
        this.f639m = documentResultListener;
        this.f640n = new DocumentScanPlugin(getContext(), "DocumentModule", str, this);
        this.f640n.setCancelOnResult(this.isCancelOnResult);
        setScanPlugin(this.f640n);
        this.scanPlugin.addScanInfoListener(new ScanInfoListener() {
            public final void onInfo(ScanInfo scanInfo) {
                Object value = scanInfo.getValue();
                String key = scanInfo.getKey();
                if (DocumentScanView.this.f640n.getScanState() == DocumentScanState.PREVIEW) {
                    if (AnylineDebugListener.BRIGHTNESS_VARIABLE_NAME.equals(key)) {
                        float floatValue = NumUtil.asFloat(value).floatValue();
                        String unused = DocumentScanView.f627a;
                        DocumentScanView.this.calculateBrightnessCount((double) floatValue);
                    }
                    Polygon currentDocPolygon = DocumentScanView.this.f640n.getCurrentDocPolygon();
                    if ("$documentShapeAndBrightnessValid".equals(key) && currentDocPolygon != null) {
                        int intValue = NumUtil.asInteger(value).intValue();
                        if (currentDocPolygon.length() != 0) {
                            Vector_Point points = currentDocPolygon.points();
                            ArrayList arrayList = new ArrayList(currentDocPolygon.length());
                            boolean z = false;
                            for (int i = 0; ((long) i) < points.size(); i++) {
                                arrayList.add(points.get(i));
                            }
                            List a = DocumentScanView.m245a(DocumentScanView.this, (List) arrayList);
                            DocumentResultListener h = DocumentScanView.this.f639m;
                            if (intValue == 1) {
                                z = true;
                            }
                            if (!h.onDocumentOutlineDetected(a, z)) {
                                if (intValue == 1) {
                                    DocumentScanView.this.drawShape(a, Color.parseColor(DocumentScanView.COLOR_GREEN), 2, Color.argb(70, Color.red(Color.parseColor(DocumentScanView.COLOR_GREEN)), Color.green(Color.parseColor(DocumentScanView.COLOR_GREEN)), Color.blue(Color.parseColor(DocumentScanView.COLOR_GREEN))), 4);
                                } else {
                                    DocumentScanView.this.drawShape(a, SupportMenu.CATEGORY_MASK, 2, Color.argb(70, Color.red(SupportMenu.CATEGORY_MASK), Color.green(SupportMenu.CATEGORY_MASK), Color.blue(SupportMenu.CATEGORY_MASK)), 4);
                                }
                            }
                        }
                    }
                    if ("$previewImage".equals(key) && (value instanceof AnylineImage)) {
                        DocumentScanView.this.f639m.onPreviewProcessingSuccess((AnylineImage) value);
                        DocumentScanView.this.resetAutoFocusTimer();
                        DocumentScanView.this.commonOnFinishedAction();
                    }
                }
                if ("$cornerDetectionFinished".equals(key) && (value instanceof Square)) {
                    DocumentScanView.m248a(DocumentScanView.this, (Square) value);
                } else if ("$takePictureSuccess".equals(key)) {
                    DocumentScanView.this.f639m.onTakePictureSuccess();
                    DocumentScanView.this.clearDrawing();
                } else if ("$takePictureError".equals(key) && (value instanceof Throwable)) {
                    DocumentScanView.this.f639m.onTakePictureError((Throwable) value);
                    DocumentScanView.this.openCameraInBackground();
                } else if ("$takeCornerDetectionPictureSuccess".equals(key)) {
                    DocumentScanView.this.clearDrawing();
                } else if ("$transformedPicture".equals(key) && (value instanceof AnylineImage)) {
                    DocumentScanView.this.f639m.onPictureTransformed((AnylineImage) value);
                }
                if (DocumentScanView.this.isVariableAllowedForDebugReporting(key)) {
                    DocumentScanView.this.reportDebugVariable(key, value);
                }
            }
        });
        this.scanPlugin.addScanRunSkippedListener(new ScanRunSkippedListener() {
            /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onRunSkipped(p046io.anyline.plugin.ScanRunSkippedReason r4) {
                /*
                    r3 = this;
                    int r0 = r4.getCode()
                    r1 = 5001(0x1389, float:7.008E-42)
                    if (r0 == r1) goto L_0x005f
                    r1 = 5019(0x139b, float:7.033E-42)
                    if (r0 == r1) goto L_0x0057
                    r1 = 5020(0x139c, float:7.035E-42)
                    if (r0 == r1) goto L_0x004f
                    switch(r0) {
                        case 5009: goto L_0x005f;
                        case 5010: goto L_0x0047;
                        case 5011: goto L_0x003f;
                        case 5012: goto L_0x0037;
                        default: goto L_0x0013;
                    }
                L_0x0013:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    io.anyline.plugin.document.DocumentScanPlugin r0 = r0.f640n
                    io.anyline.plugin.document.DocumentScanState r0 = r0.getScanState()
                    io.anyline.plugin.document.DocumentScanState r1 = p046io.anyline.plugin.document.DocumentScanState.PICTURE
                    if (r0 == r1) goto L_0x002f
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    io.anyline.plugin.document.DocumentScanPlugin r0 = r0.f640n
                    io.anyline.plugin.document.DocumentScanState r0 = r0.getScanState()
                    io.anyline.plugin.document.DocumentScanState r1 = p046io.anyline.plugin.document.DocumentScanState.IMAGE_TRANSFORM
                    if (r0 != r1) goto L_0x009b
                L_0x002f:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    at.nineyards.anyline.modules.document.DocumentScanView$DocumentError r1 = p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError.UNKNOWN
                    p007at.nineyards.anyline.modules.document.DocumentScanView.m249a((p007at.nineyards.anyline.modules.document.DocumentScanView) r0, (p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError) r1)
                    goto L_0x009b
                L_0x0037:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    at.nineyards.anyline.modules.document.DocumentScanView$DocumentError r1 = p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError.IMAGE_TOO_DARK
                    p007at.nineyards.anyline.modules.document.DocumentScanView.m249a((p007at.nineyards.anyline.modules.document.DocumentScanView) r0, (p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError) r1)
                    goto L_0x009b
                L_0x003f:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    at.nineyards.anyline.modules.document.DocumentScanView$DocumentError r1 = p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError.DOCUMENT_NOT_SHARP
                    p007at.nineyards.anyline.modules.document.DocumentScanView.m249a((p007at.nineyards.anyline.modules.document.DocumentScanView) r0, (p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError) r1)
                    goto L_0x009b
                L_0x0047:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    at.nineyards.anyline.modules.document.DocumentScanView$DocumentError r1 = p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError.DOCUMENT_SKEW_TOO_HIGH
                    p007at.nineyards.anyline.modules.document.DocumentScanView.m249a((p007at.nineyards.anyline.modules.document.DocumentScanView) r0, (p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError) r1)
                    goto L_0x009b
                L_0x004f:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    at.nineyards.anyline.modules.document.DocumentScanView$DocumentError r1 = p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError.DOCUMENT_BOUNDS_OUTSIDE_OF_TOLERANCE
                    p007at.nineyards.anyline.modules.document.DocumentScanView.m249a((p007at.nineyards.anyline.modules.document.DocumentScanView) r0, (p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError) r1)
                    goto L_0x009b
                L_0x0057:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    at.nineyards.anyline.modules.document.DocumentScanView$DocumentError r1 = p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError.DOCUMENT_RATIO_OUTSIDE_OF_TOLERANCE
                    p007at.nineyards.anyline.modules.document.DocumentScanView.m249a((p007at.nineyards.anyline.modules.document.DocumentScanView) r0, (p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError) r1)
                    goto L_0x009b
                L_0x005f:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    io.anyline.plugin.document.DocumentScanPlugin r0 = r0.f640n
                    io.anyline.plugin.document.DocumentScanState r0 = r0.getScanState()
                    io.anyline.plugin.document.DocumentScanState r1 = p046io.anyline.plugin.document.DocumentScanState.CORNER_DETECTION
                    if (r0 != r1) goto L_0x007b
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    io.anyline.plugin.document.DocumentScanPlugin r1 = r0.f640n
                    at.nineyards.anyline.core.Square r1 = r1.getCurrentDocSquare()
                    p007at.nineyards.anyline.modules.document.DocumentScanView.m248a((p007at.nineyards.anyline.modules.document.DocumentScanView) r0, (p007at.nineyards.anyline.core.Square) r1)
                    goto L_0x0096
                L_0x007b:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    io.anyline.plugin.document.DocumentScanPlugin r0 = r0.f640n
                    boolean r0 = r0.isBrightnessValid()
                    if (r0 != 0) goto L_0x008f
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    at.nineyards.anyline.modules.document.DocumentScanView$DocumentError r1 = p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError.IMAGE_TOO_DARK
                    p007at.nineyards.anyline.modules.document.DocumentScanView.m249a((p007at.nineyards.anyline.modules.document.DocumentScanView) r0, (p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError) r1)
                    goto L_0x0096
                L_0x008f:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    at.nineyards.anyline.modules.document.DocumentScanView$DocumentError r1 = p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError.DOCUMENT_OUTLINE_NOT_FOUND
                    p007at.nineyards.anyline.modules.document.DocumentScanView.m249a((p007at.nineyards.anyline.modules.document.DocumentScanView) r0, (p007at.nineyards.anyline.modules.document.DocumentScanView.DocumentError) r1)
                L_0x0096:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    r0.clearDrawing()
                L_0x009b:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    io.anyline.plugin.document.DocumentScanPlugin r0 = r0.f640n
                    io.anyline.plugin.document.DocumentScanState r0 = r0.getScanState()
                    io.anyline.plugin.document.DocumentScanState r1 = p046io.anyline.plugin.document.DocumentScanState.PICTURE
                    if (r0 != r1) goto L_0x00ae
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    r0.clearDrawing()
                L_0x00ae:
                    at.nineyards.anyline.modules.document.DocumentScanView r0 = p007at.nineyards.anyline.modules.document.DocumentScanView.this
                    at.nineyards.anyline.core.RunFailure r1 = new at.nineyards.anyline.core.RunFailure
                    int r2 = r4.getCode()
                    java.lang.String r4 = r4.getText()
                    r1.<init>(r2, r4)
                    r0.reportDebugRunSkipped(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.modules.document.DocumentScanView.C07873.onRunSkipped(io.anyline.plugin.ScanRunSkippedReason):void");
            }
        });
        this.f640n.addScanResultListener(new ScanResultListener<ScanResult<AnylineImage>>() {
            public final void onResult(ScanResult<AnylineImage> scanResult) {
                DocumentScanView.this.clearDrawing();
                DocumentScanView.this.f639m.onResult(new DocumentResult(DocumentScanView.this.m243a(scanResult.getFullImage(), scanResult.getOutline()), scanResult.getConfidence(), scanResult.getCutoutImage(), scanResult.getFullImage(), scanResult.getResult()));
                if (!DocumentScanView.this.f640n.isCancelOnResult()) {
                    DocumentScanView.this.openCameraInBackground();
                }
            }
        });
        Double[] dArr = this.f635i;
        if (dArr != null) {
            this.f640n.setDocumentRatios(dArr);
        }
        Double d2 = this.f636j;
        if (d2 != null) {
            this.f640n.setMaxDocumentRatioDeviation(d2);
        }
        Double d3 = this.f637k;
        if (d3 != null && (d = this.f638l) != null) {
            this.f640n.setMaxDocumentOutputResolution(d3, d);
        }
    }

    public void setMinBrightness(float f) {
        this.f640n.setMinBrightness(f);
    }

    public AnylineImage getCurrentFullImage() {
        return this.f640n.getFullImage().clone();
    }

    public void startScanning() {
        super.startScanning();
        this.f630d = 9.80665f;
        this.f631e = 9.80665f;
        this.f632f = 0.0f;
        this.f628b.registerListener(this.f641o, this.f629c, 2);
    }

    public void cancelScanning() {
        this.f628b.unregisterListener(this.f641o);
        super.cancelScanning();
    }

    public void setCancelOnResult(boolean z) {
        this.isCancelOnResult = z;
        if (this.scanPlugin != null) {
            this.scanPlugin.setCancelOnResult(z);
        }
    }

    public void transformPicture(AnylineImage anylineImage, List<PointF> list) {
        DocumentScanPlugin documentScanPlugin = this.f640n;
        if (documentScanPlugin != null) {
            documentScanPlugin.transformPicture(anylineImage, list);
            return;
        }
        throw new IllegalStateException("This cannot be used before initAnyline is called.");
    }

    public void triggerPictureCornerDetection() {
        DocumentScanPlugin documentScanPlugin = this.f640n;
        if (documentScanPlugin != null) {
            documentScanPlugin.triggerPictureCornerDetection();
            return;
        }
        throw new IllegalStateException("This cannot be used before initAnyline is called.");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public List<PointF> m243a(AnylineImage anylineImage, List<PointF> list) {
        AnylineImage fullImage = this.f640n.getFullImage();
        float floatValue = this.f640n.getResizeWidth().floatValue();
        Integer contourBorder = this.f640n.getContourBorder();
        if (list == null || list.size() == 0) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(new PointF(0.0f, 0.0f));
            arrayList.add(new PointF((float) fullImage.getWidth(), 0.0f));
            arrayList.add(new PointF((float) fullImage.getWidth(), (float) fullImage.getHeight()));
            arrayList.add(new PointF(0.0f, (float) fullImage.getHeight()));
            return arrayList;
        }
        return m242a(0.0f, 0.0f, ((float) anylineImage.getWidth()) - 0.0f, floatValue, ((float) anylineImage.getWidth()) - 0.0f, floatValue, contourBorder.intValue(), list);
    }

    /* renamed from: a */
    private static List<PointF> m242a(float f, float f2, float f3, float f4, float f5, float f6, int i, List<PointF> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        float f7 = 1.0f;
        float f8 = 0.0f;
        if (f4 != Float.MIN_VALUE) {
            f7 = f3 / f4;
        }
        float f9 = f6 != Float.MIN_VALUE ? f5 / f6 : f7;
        if (i != Integer.MIN_VALUE) {
            f8 = ((float) i) * f7;
        }
        float f10 = f + f8;
        float f11 = f2 + f8;
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(new PointF((list.get(i2).x * f7) + f10, (list.get(i2).y * f9) + f11));
        }
        return arrayList;
    }

    /* renamed from: a */
    static /* synthetic */ void m249a(DocumentScanView documentScanView, DocumentError documentError) {
        DocumentScanState scanState = documentScanView.f640n.getScanState();
        if (scanState == DocumentScanState.PREVIEW) {
            documentScanView.f639m.onPreviewProcessingFailure(documentError);
        } else if (scanState == DocumentScanState.PICTURE) {
            documentScanView.f639m.onPictureProcessingFailure(documentError);
        } else if (scanState == DocumentScanState.IMAGE_TRANSFORM) {
            documentScanView.f639m.onPictureTransformError(documentError);
        }
    }

    /* renamed from: a */
    static /* synthetic */ List m245a(DocumentScanView documentScanView, List list) {
        DocumentScanPlugin documentScanPlugin = (DocumentScanPlugin) documentScanView.scanPlugin;
        Rect cutoutRect = documentScanView.getCutoutRect();
        return m242a((float) cutoutRect.left, (float) cutoutRect.top, (float) cutoutRect.width(), documentScanPlugin.getResizeWidth().floatValue(), (float) cutoutRect.width(), documentScanPlugin.getResizeWidth().floatValue(), documentScanPlugin.getContourBorder().intValue(), documentScanView.openCvPointListToPointFList(list));
    }

    /* renamed from: a */
    static /* synthetic */ void m248a(DocumentScanView documentScanView, Square square) {
        List<PointF> pointsFromSquare = DocumentScanPlugin.pointsFromSquare(square);
        AnylineImage fullImage = documentScanView.f640n.getFullImage();
        List<PointF> a = documentScanView.m243a(fullImage, pointsFromSquare);
        documentScanView.f639m.onPictureCornersDetected(fullImage.clone(), a);
        fullImage.release();
        documentScanView.commonOnFinishedAction();
    }
}
