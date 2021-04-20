package p046io.anyline.plugin.ocr;

import android.content.Context;
import android.graphics.PointF;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p007at.nineyards.anyline.AnylineDebugListener;
import p007at.nineyards.anyline.ImageProvider;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineRawResult;
import p007at.nineyards.anyline.modules.ocr.AnylineOcrConfig;
import p007at.nineyards.anyline.util.AssetUtil;
import p046io.anyline.plugin.AbstractScanPlugin;

/* renamed from: io.anyline.plugin.ocr.OcrScanPlugin */
public class OcrScanPlugin extends AbstractScanPlugin<OcrScanResult> {
    public static final String ANYLINE_OCR_BUNDLE_PATH = "anyline/module_anyline_ocr";

    /* renamed from: a */
    private static final String f5748a = OcrScanPlugin.class.getSimpleName();

    /* renamed from: b */
    private AnylineOcrConfig f5749b;

    /* renamed from: c */
    private AnylineImage f5750c;

    public OcrScanPlugin(Context context, String str, String str2, ImageProvider imageProvider, AnylineOcrConfig anylineOcrConfig) {
        super(context, str, str2, "anyline/module_anyline_ocr/anyline_assets.json", "anyline_ocr_line", ANYLINE_OCR_BUNDLE_PATH, imageProvider);
        this.f5749b = anylineOcrConfig;
        m6751a();
    }

    /* access modifiers changed from: protected */
    public void onReportsVariable(String str, Object obj) {
        if (AnylineDebugListener.THRESHOLD_IMAGE_VARIABLE_NAME.equals(str) && (obj instanceof AnylineImage)) {
            AnylineImage anylineImage = this.f5750c;
            if (anylineImage != null) {
                anylineImage.release();
            }
            this.f5750c = (AnylineImage) obj;
        }
        super.onReportsVariable(str, obj);
    }

    /* access modifiers changed from: protected */
    public void onFinishedWithOutput(Object obj) {
        invokeOnResult(new OcrScanResult(this.f5713id, (List<PointF>) null, this.currentConfidence, this.currentImage.clone(), getLastImageWithFullSize(), ((AnylineRawResult) obj).getResult("text"), this.f5750c));
    }

    public void start() {
        m6752b();
        super.start();
    }

    public void setAnylineOcrConfig(AnylineOcrConfig anylineOcrConfig) {
        this.f5749b = anylineOcrConfig;
        m6751a();
        if (isRunning()) {
            m6752b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6751a() {
        /*
            r8 = this;
            java.lang.String r0 = "."
            java.lang.String r1 = "/"
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r2 = r8.f5749b
            if (r2 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String[] r2 = r2.getLanguages()
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L_0x0010:
            if (r5 >= r3) goto L_0x001d
            r6 = r2[r5]
            if (r6 == 0) goto L_0x001a
            r7 = 0
            r8.copyTrainedData(r6, r7)
        L_0x001a:
            int r5 = r5 + 1
            goto L_0x0010
        L_0x001d:
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r2 = r8.f5749b
            java.lang.String r2 = r2.getCustomScript()
            java.lang.String r3 = "anyline/module_anyline_ocr"
            if (r2 == 0) goto L_0x0033
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            java.lang.String r1 = r1.getCustomScript()
            r0.loadScript(r1, r3)
            return
        L_0x0033:
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r2 = r8.f5749b
            java.lang.String r2 = r2.getCustomCmdFile()
            r5 = 1
            if (r2 == 0) goto L_0x0079
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r2 = r8.f5749b     // Catch:{ IOException -> 0x0072 }
            java.lang.String r2 = r2.getCustomCmdFile()     // Catch:{ IOException -> 0x0072 }
            int r6 = r2.lastIndexOf(r1)     // Catch:{ IOException -> 0x0072 }
            r7 = -1
            if (r6 == r7) goto L_0x0052
            int r1 = r2.lastIndexOf(r1)     // Catch:{ IOException -> 0x0072 }
            int r1 = r1 + r5
            java.lang.String r2 = r2.substring(r1)     // Catch:{ IOException -> 0x0072 }
        L_0x0052:
            int r1 = r2.lastIndexOf(r0)     // Catch:{ IOException -> 0x0072 }
            if (r1 == r7) goto L_0x0060
            int r0 = r2.lastIndexOf(r0)     // Catch:{ IOException -> 0x0072 }
            java.lang.String r2 = r2.substring(r4, r0)     // Catch:{ IOException -> 0x0072 }
        L_0x0060:
            at.nineyards.anyline.AnylineController r0 = r8.anylineController     // Catch:{ IOException -> 0x0072 }
            android.content.Context r1 = r8.context     // Catch:{ IOException -> 0x0072 }
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r4 = r8.f5749b     // Catch:{ IOException -> 0x0072 }
            java.lang.String r4 = r4.getCustomCmdFile()     // Catch:{ IOException -> 0x0072 }
            java.lang.String r1 = p007at.nineyards.anyline.util.AssetUtil.readFile(r1, r4)     // Catch:{ IOException -> 0x0072 }
            r0.loadScript(r2, r1, r3)     // Catch:{ IOException -> 0x0072 }
            return
        L_0x0072:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0079:
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r0 = r8.f5749b
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig$ScanMode r0 = r0.getScanMode()
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig$ScanMode r1 = p007at.nineyards.anyline.modules.ocr.AnylineOcrConfig.ScanMode.LINE
            java.lang.String r2 = "$isAllowLowercase"
            if (r0 != r1) goto L_0x00ba
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            java.lang.String r1 = "anyline_ocr_line"
            r0.loadCmdFile(r1, r3)
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            boolean r1 = r1.isRemoveSmallContours()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "$removeSmallContours"
            r0.setStartVariable(r2, r1)
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            boolean r1 = r1.isRemoveWhitespaces()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "$removeWhitespaces"
            r0.setStartVariable(r2, r1)
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            int r1 = r1.getMinSharpness()
            java.lang.String r2 = "$minSharpness"
            goto L_0x015b
        L_0x00ba:
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r0 = r8.f5749b
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig$ScanMode r0 = r0.getScanMode()
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig$ScanMode r1 = p007at.nineyards.anyline.modules.ocr.AnylineOcrConfig.ScanMode.GRID
            if (r0 != r1) goto L_0x0121
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            java.lang.String r1 = "anyline_ocr_grid"
            r0.loadCmdFile(r1, r3)
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            int r1 = r1.getCharCountX()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "$elementCountX"
            r0.setStartVariable(r2, r1)
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            int r1 = r1.getCharCountY()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "$elementCountY"
            r0.setStartVariable(r2, r1)
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            double r1 = r1.getCharPaddingXFactor()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.String r2 = "$paddingFactorX"
            r0.setStartVariable(r2, r1)
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            double r1 = r1.getCharPaddingYFactor()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.String r2 = "$paddingFactorY"
            r0.setStartVariable(r2, r1)
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            boolean r1 = r1.isBrightTextOnDark()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "$isBrightTextOnDark"
            r0.setStartVariable(r2, r1)
            goto L_0x0162
        L_0x0121:
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r0 = r8.f5749b
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig$ScanMode r0 = r0.getScanMode()
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig$ScanMode r1 = p007at.nineyards.anyline.modules.ocr.AnylineOcrConfig.ScanMode.AUTO
            if (r0 != r1) goto L_0x0162
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "anyline_ocr_auto"
            r0.append(r1)
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            boolean r1 = r1.areAllLanguagesAnyFiles()
            if (r1 == 0) goto L_0x0140
            java.lang.String r1 = "_any"
            goto L_0x0142
        L_0x0140:
            java.lang.String r1 = ""
        L_0x0142:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            at.nineyards.anyline.AnylineController r1 = r8.anylineController
            r1.loadCmdFile(r0, r3)
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            boolean r1 = r1.isAllowLowercase()
            if (r1 == 0) goto L_0x015a
            r1 = 1
            goto L_0x015b
        L_0x015a:
            r1 = 0
        L_0x015b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setStartVariable(r2, r1)
        L_0x0162:
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r0 = r8.f5749b
            int r0 = r0.getMinConfidence()
            if (r0 < 0) goto L_0x017b
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            int r1 = r1.getMinConfidence()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "$minConfidence"
            r0.setStartVariable(r2, r1)
        L_0x017b:
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r0 = r8.f5749b
            boolean r0 = r0.areAllLanguagesAnyFiles()
            if (r0 == 0) goto L_0x0196
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r0 = r8.f5749b
            java.lang.String[] r0 = r0.getLanguageFilenames()
            int r1 = r0.length
            if (r1 != r5) goto L_0x01b0
            at.nineyards.anyline.AnylineController r1 = r8.anylineController
            r0 = r0[r4]
            java.lang.String r2 = "$anyLanguages"
            r1.setStartVariable(r2, r0)
            goto L_0x01b0
        L_0x0196:
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            java.lang.String r1 = r1.getTesseractLanguagesAsJsonString()
            java.lang.String r2 = "$tesseractLanguages"
            r0.setStartVariable(r2, r1)
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            java.lang.String r1 = r1.getTesseractParametersAsJsonString()
            java.lang.String r2 = "$tesseractParameterDict"
            r0.setStartVariable(r2, r1)
        L_0x01b0:
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            java.lang.String r1 = r1.getValidationRegex()
            java.lang.String r2 = "$validationRegexString"
            r0.setStartVariable(r2, r1)
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r0 = r8.f5749b
            int r0 = r0.getMinCharHeight()
            if (r0 < 0) goto L_0x01d6
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            int r1 = r1.getMinCharHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "$minCharHeight"
            r0.setStartVariable(r2, r1)
        L_0x01d6:
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r0 = r8.f5749b
            int r0 = r0.getMaxCharHeight()
            if (r0 <= 0) goto L_0x01ef
            at.nineyards.anyline.AnylineController r0 = r8.anylineController
            at.nineyards.anyline.modules.ocr.AnylineOcrConfig r1 = r8.f5749b
            int r1 = r1.getMaxCharHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "$maxCharHeight"
            r0.setStartVariable(r2, r1)
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.anyline.plugin.ocr.OcrScanPlugin.m6751a():void");
    }

    /* renamed from: b */
    private void m6752b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("debugConfig", this.f5749b.toString());
        } catch (JSONException e) {
            String str = f5748a;
            Log.e(str, "Error while preparing the camera settings for reporting: " + e.getMessage());
        }
        this.anylineController.reportIncludeValues(jSONObject.toString());
    }

    public void copyTrainedData(String str, String str2) {
        copyTrainedData(this.context, str, str2);
    }

    public static void copyTrainedData(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean endsWith = str.endsWith(".traineddata");
        String str3 = "";
        String str4 = ANYLINE_OCR_BUNDLE_PATH;
        if (endsWith) {
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            if (!str.startsWith("tessdata")) {
                str3 = "/tessdata";
            }
            sb.append(str3);
            str4 = sb.toString();
        } else if (str.endsWith(".any")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            if (!str.startsWith("trained_models")) {
                str3 = "/trained_models";
            }
            sb2.append(str3);
            str4 = sb2.toString();
        }
        File file = new File(context.getFilesDir(), str4);
        if (str2 == null) {
            try {
                AssetUtil.copyAssetFile(context, str, file, false);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            AssetUtil.copyAssetFile(context, str, file, str2);
        }
        String str5 = f5748a;
        Log.d(str5, "Check/Copy custom traineddata duration(ms): " + (System.currentTimeMillis() - currentTimeMillis));
    }
}
