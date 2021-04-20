package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.ViewProps;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007at.nineyards.anyline.camera.CameraFeatures;
import p007at.nineyards.anyline.util.AssetUtil;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

/* renamed from: at.nineyards.anyline.camera.AnylineViewConfig */
public class AnylineViewConfig {
    public static final String TAG = AnylineViewConfig.class.getSimpleName();

    /* renamed from: A */
    private int f204A = 0;

    /* renamed from: B */
    private int f205B = 0;

    /* renamed from: C */
    private int f206C = 16;

    /* renamed from: D */
    private int f207D = 0;

    /* renamed from: E */
    private int f208E = 0;

    /* renamed from: F */
    private int f209F = 0;

    /* renamed from: G */
    private boolean f210G = true;

    /* renamed from: H */
    private boolean f211H = false;

    /* renamed from: I */
    private boolean f212I = false;

    /* renamed from: J */
    private boolean f213J = true;

    /* renamed from: K */
    private VisualFeedbackConfig f214K = null;

    /* renamed from: L */
    private CameraFeatures.LensFacing f215L = CameraFeatures.LensFacing.BACK;

    /* renamed from: M */
    private EnumSet<CameraFeatures.LensFacing> f216M = EnumSet.of(CameraFeatures.LensFacing.BACK);

    /* renamed from: a */
    private int f217a = 720;

    /* renamed from: b */
    private int f218b = 1280;

    /* renamed from: c */
    private int f219c = 0;

    /* renamed from: d */
    private int f220d = 0;

    /* renamed from: e */
    private int f221e = 0;

    /* renamed from: f */
    private int f222f = 0;

    /* renamed from: g */
    private CutoutStyle f223g = CutoutStyle.RECT;

    /* renamed from: h */
    private int f224h = 100;

    /* renamed from: i */
    private int f225i = 100;

    /* renamed from: j */
    private int f226j = 0;

    /* renamed from: k */
    private CutoutAlignment f227k = CutoutAlignment.CENTER;

    /* renamed from: l */
    private int f228l = 0;

    /* renamed from: m */
    private int f229m = 0;

    /* renamed from: n */
    private int f230n = 8;

    /* renamed from: o */
    private float f231o = 1.0f;

    /* renamed from: p */
    private int f232p = 2;

    /* renamed from: q */
    private int f233q = -1;

    /* renamed from: r */
    private Drawable f234r = null;

    /* renamed from: s */
    private int f235s = 0;

    /* renamed from: t */
    private int f236t = 0;

    /* renamed from: u */
    private int f237u = 0;

    /* renamed from: v */
    private int f238v = 0;

    /* renamed from: w */
    private int f239w = 0;

    /* renamed from: x */
    private int f240x = -1;

    /* renamed from: y */
    private FlashMode f241y = FlashMode.NONE;

    /* renamed from: z */
    private FlashAlignment f242z = FlashAlignment.BOTTOM_RIGHT;

    public AnylineViewConfig() {
    }

    public AnylineViewConfig(Context context, String str) {
        try {
            m47a(context, AssetUtil.getAnylineAssetsJson(context, str));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public AnylineViewConfig(Context context, JSONObject jSONObject) {
        m47a(context, jSONObject);
    }

    /* renamed from: a */
    private void m47a(Context context, JSONObject jSONObject) {
        String optString = jSONObject.optString("captureResolution");
        if (!optString.isEmpty()) {
            if (optString.toLowerCase().endsWith("p")) {
                optString = optString.substring(0, optString.length() - 1);
            }
            try {
                int parseInt = Integer.parseInt(optString);
                this.f217a = parseInt;
                this.f218b = (int) Math.ceil((double) (((float) (parseInt * 16)) / 9.0f));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException("captureResolution is formatted badly should be something like 720 or 720p, but is " + optString);
            }
        }
        String optString2 = jSONObject.optString("pictureResolution");
        if (!optString2.isEmpty()) {
            if (optString2.toLowerCase().endsWith("p")) {
                optString2 = optString2.substring(0, optString2.length() - 1);
            }
            try {
                int parseInt2 = Integer.parseInt(optString2);
                this.f219c = parseInt2;
                this.f220d = (int) Math.ceil((double) (((float) (parseInt2 * 16)) / 9.0f));
            } catch (NumberFormatException unused2) {
                throw new IllegalArgumentException("pictureResolution is formatted badly should be something like 1080 or 1080p, but is " + optString2);
            }
        }
        String optString3 = jSONObject.optString("defaultCamera");
        if (!optString3.isEmpty()) {
            try {
                this.f215L = CameraFeatures.LensFacing.valueOf(optString3.toUpperCase());
            } catch (IllegalArgumentException unused3) {
                throw new IllegalArgumentException("defaultCamera can be one of BACK, FRONT or EXTERNAL but is " + optString3);
            }
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("fallbackCameras");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString4 = optJSONArray.optString(i);
                if (!optString4.isEmpty()) {
                    try {
                        arrayList.add(CameraFeatures.LensFacing.valueOf(optString4.toUpperCase()));
                    } catch (IllegalArgumentException unused4) {
                        throw new IllegalArgumentException("fallbackCameras elements can be one of BACK, FRONT or EXTERNAL, but is " + optString4);
                    }
                }
            }
            this.f216M = EnumSet.copyOf(arrayList);
        }
        String optString5 = jSONObject.optString("previewMinFps");
        String optString6 = jSONObject.optString("previewMaxFps");
        if (!optString5.isEmpty()) {
            try {
                this.f221e = Integer.parseInt(optString5);
            } catch (NumberFormatException unused5) {
                throw new IllegalArgumentException("previewMinFps is formatted badly should be something like 15000 or 30000, but is " + optString5);
            }
        }
        if (!optString6.isEmpty()) {
            try {
                this.f222f = Integer.parseInt(optString6);
            } catch (NumberFormatException unused6) {
                throw new IllegalArgumentException("previewMaxFps is formatted badly should be something like 15000 or 30000, but is " + optString5);
            }
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("cutout");
            this.f226j = jSONObject2.optInt("width", 0);
            String trim = jSONObject2.optString("maxWidthPercent").trim();
            String trim2 = jSONObject2.optString("maxHeightPercent").trim();
            try {
                if (!trim.isEmpty()) {
                    if (trim.endsWith("%")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    this.f224h = Integer.valueOf(trim).intValue();
                }
                if (!trim2.isEmpty()) {
                    if (trim2.endsWith("%")) {
                        trim2 = trim2.substring(0, trim2.length() - 1);
                    }
                    this.f225i = Integer.valueOf(trim2).intValue();
                }
                this.f227k = CutoutAlignment.fromString(jSONObject2.optString("alignment"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("ratioFromSize");
                if (optJSONObject != null) {
                    int optInt = optJSONObject.optInt("width", 0);
                    int optInt2 = optJSONObject.optInt("height", 0);
                    if (optInt == 0 || optInt2 == 0) {
                        throw new IllegalArgumentException("If ratioFromSize is specified there must be a width and height sub-element that are > 0");
                    }
                    this.f231o = ((float) optInt) / ((float) optInt2);
                }
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("offset");
                if (optJSONObject2 != null) {
                    this.f228l = optJSONObject2.optInt(MapPoint.JsonFields.f6911x);
                    this.f229m = optJSONObject2.optInt(MapPoint.JsonFields.f6912y);
                }
                this.f223g = CutoutStyle.fromString(jSONObject2.optString(ButtonField.JsonFields.style, "rect"));
                this.f230n = jSONObject2.optInt("cornerRadius", this.f230n);
                String optString7 = jSONObject2.optString("strokeColor");
                if (!optString7.isEmpty()) {
                    this.f233q = Color.parseColor("#" + optString7);
                }
                this.f232p = jSONObject2.optInt("strokeWidth", this.f232p);
                JSONObject optJSONObject3 = jSONObject2.optJSONObject("cropPadding");
                if (optJSONObject3 != null) {
                    this.f235s = optJSONObject3.optInt(MapPoint.JsonFields.f6911x, this.f235s);
                    this.f236t = optJSONObject3.optInt(MapPoint.JsonFields.f6912y, this.f236t);
                }
                JSONObject optJSONObject4 = jSONObject2.optJSONObject("cropOffset");
                if (optJSONObject4 != null) {
                    this.f237u = optJSONObject4.optInt(MapPoint.JsonFields.f6911x, this.f237u);
                    this.f238v = optJSONObject4.optInt(MapPoint.JsonFields.f6912y, this.f238v);
                }
                String optString8 = jSONObject2.optString("outerColor");
                if (!optString8.isEmpty()) {
                    float optDouble = (float) jSONObject2.optDouble("outerAlpha", Utils.DOUBLE_EPSILON);
                    String hexString = optDouble > 0.0f ? Integer.toHexString((int) (optDouble * 255.0f)) : "";
                    this.f239w = Color.parseColor("#" + hexString + optString8);
                }
                String optString9 = jSONObject2.optString("feedbackStrokeColor");
                if (!optString9.isEmpty()) {
                    this.f240x = Color.parseColor("#" + optString9);
                }
                Resources resources = context.getResources();
                String optString10 = jSONObject2.optString("image");
                if (!optString10.isEmpty() && this.f223g == CutoutStyle.IMAGE) {
                    int identifier = resources.getIdentifier(optString10, "drawable", context.getPackageName());
                    if (identifier != 0) {
                        this.f234r = resources.getDrawable(identifier);
                    } else {
                        throw new IllegalArgumentException("No drawable was found for the given overlayImage: " + optString10);
                    }
                }
                JSONObject optJSONObject5 = jSONObject.optJSONObject("flash");
                if (optJSONObject5 != null) {
                    this.f241y = FlashMode.fromString(optJSONObject5.optString("mode"));
                    this.f242z = FlashAlignment.fromString(optJSONObject5.optString("alignment"));
                    String optString11 = optJSONObject5.optString("imageOn");
                    String optString12 = optJSONObject5.optString("imageOff");
                    String optString13 = optJSONObject5.optString("imageAuto");
                    if (!optString11.isEmpty()) {
                        this.f207D = resources.getIdentifier(optString11, "drawable", context.getPackageName());
                    }
                    if (!optString12.isEmpty()) {
                        this.f208E = resources.getIdentifier(optString12, "drawable", context.getPackageName());
                    }
                    if (!optString13.isEmpty()) {
                        this.f209F = resources.getIdentifier(optString13, "drawable", context.getPackageName());
                    }
                    JSONObject optJSONObject6 = optJSONObject5.optJSONObject("offset");
                    if (optJSONObject6 != null) {
                        this.f204A = optJSONObject6.optInt(MapPoint.JsonFields.f6911x, this.f204A);
                        this.f205B = optJSONObject6.optInt(MapPoint.JsonFields.f6912y, this.f205B);
                    }
                }
                this.f211H = jSONObject.optBoolean("beepOnResult", this.f211H);
                this.f212I = jSONObject.optBoolean("vibrateOnResult", this.f212I);
                this.f210G = jSONObject.optBoolean("blinkAnimationOnResult", this.f210G);
                this.f213J = jSONObject.optBoolean("cancelOnResult", this.f213J);
                JSONObject optJSONObject7 = jSONObject.optJSONObject("visualFeedback");
                if (optJSONObject7 != null) {
                    this.f214K = new VisualFeedbackConfig(optJSONObject7, this.f230n);
                }
            } catch (NumberFormatException unused7) {
                throw new IllegalArgumentException("maxWidthPercent or maxHeightPercent formatted badly. Should be a percentage in the range 1% - 100%");
            }
        } catch (JSONException e) {
            throw new IllegalArgumentException("No or invalid cutout section in the config json. Error: " + e.getMessage());
        }
    }

    public int getPreferredPreviewWidth() {
        return this.f217a;
    }

    public void setPreferredPreviewWidth(int i) {
        this.f217a = i;
    }

    public int getPreferredPreviewHeight() {
        return this.f218b;
    }

    public void setPreferredPreviewHeight(int i) {
        this.f218b = i;
    }

    public int getPreferredPictureWidth() {
        return this.f219c;
    }

    public void setPreferredPictureWidth(int i) {
        this.f219c = i;
    }

    public int getPreferredPictureHeight() {
        return this.f220d;
    }

    public void setPreferredPictureHeight(int i) {
        this.f220d = i;
    }

    public int getPreferredMinPreviewFps() {
        return this.f221e;
    }

    public void setPreferredMinPreviewFps(int i) {
        this.f221e = i;
    }

    public int getPreferredMaxPreviewFps() {
        return this.f222f;
    }

    public void setPreferredMaxPreviewFps(int i) {
        this.f222f = i;
    }

    public CutoutAlignment getCutoutAlignment() {
        return this.f227k;
    }

    public void setCutoutAlignment(CutoutAlignment cutoutAlignment) {
        this.f227k = cutoutAlignment;
    }

    public int getCutoutMaxWidthPercent() {
        return this.f224h;
    }

    public void setCutoutMaxWidthPercent(int i) {
        this.f224h = i;
    }

    public int getCutoutMaxHeightPercent() {
        return this.f225i;
    }

    public void setCutoutMaxHeightPercent(int i) {
        this.f225i = i;
    }

    public int getCutoutWidth() {
        return this.f226j;
    }

    public void setCutoutWidth(int i) {
        this.f226j = i;
    }

    public int getCutoutOffsetX() {
        return this.f228l;
    }

    public void setCutoutOffsetX(int i) {
        this.f228l = i;
    }

    public int getCutoutOffsetY() {
        return this.f229m;
    }

    public void setCutoutOffsetY(int i) {
        this.f229m = i;
    }

    public CutoutStyle getCutoutStyle() {
        return this.f223g;
    }

    public void setCutoutStyle(CutoutStyle cutoutStyle) {
        this.f223g = cutoutStyle;
    }

    public int getCutoutCornerRadiusInDp() {
        return this.f230n;
    }

    public void setCutoutCornerRadiusInDp(int i) {
        this.f230n = i;
    }

    public float getCutoutRatio() {
        return this.f231o;
    }

    public void setCutoutRatio(float f) {
        this.f231o = f;
    }

    public int getCutoutStrokeWidthInDp() {
        return this.f232p;
    }

    public void setCutoutStrokeWidthInDp(int i) {
        this.f232p = i;
    }

    public int getCutoutStrokeColor() {
        return this.f233q;
    }

    public void setCutoutStrokeColor(int i) {
        this.f233q = i;
    }

    public int getCutoutCropPaddingX() {
        return this.f235s;
    }

    public void setCutoutCropPaddingX(int i) {
        this.f235s = i;
    }

    public int getCutoutCropPaddingY() {
        return this.f236t;
    }

    public void setCutoutCropPaddingY(int i) {
        this.f236t = i;
    }

    public int getCutoutCropOffsetX() {
        return this.f237u;
    }

    public void setCutoutCropOffsetX(int i) {
        this.f237u = i;
    }

    public int getCutoutCropOffsetY() {
        return this.f238v;
    }

    public void setCutoutCropOffsetY(int i) {
        this.f238v = i;
    }

    public int getCutoutOuterColor() {
        return this.f239w;
    }

    public void setCutoutOuterColor(int i) {
        this.f239w = i;
    }

    public int getCutoutFeedbackStrokeColor() {
        return this.f240x;
    }

    public void setCutoutFeedbackStrokeColor(int i) {
        this.f240x = i;
    }

    public Drawable getCutoutDrawable() {
        return this.f234r;
    }

    public void setCutoutDrawable(Drawable drawable) {
        this.f234r = drawable;
    }

    public FlashMode getFlashMode() {
        return this.f241y;
    }

    public void setFlashMode(FlashMode flashMode) {
        this.f241y = flashMode;
    }

    public FlashAlignment getFlashAlignment() {
        return this.f242z;
    }

    public void setFlashAlignment(FlashAlignment flashAlignment) {
        this.f242z = flashAlignment;
    }

    public int getFlashOffsetXInDp() {
        return this.f204A;
    }

    public void setFlashOffsetXInDp(int i) {
        this.f204A = i;
    }

    public int getFlashOffsetYInDp() {
        return this.f205B;
    }

    public void setFlashOffsetYInDp(int i) {
        this.f205B = i;
    }

    public int getFlashPaddingInDp() {
        return this.f206C;
    }

    public void setFlashPaddingInDp(int i) {
        this.f206C = i;
    }

    public int getFlashImageOnId() {
        return this.f207D;
    }

    public void setFlashImageOnId(int i) {
        this.f207D = i;
    }

    public int getFlashImageOffId() {
        return this.f208E;
    }

    public void setFlashImageOffId(int i) {
        this.f208E = i;
    }

    public int getFlashImageAutoId() {
        return this.f209F;
    }

    public void setFlashImageAutoId(int i) {
        this.f209F = i;
    }

    public boolean isBlinkOnResult() {
        return this.f210G;
    }

    public void setBlinkOnResult(boolean z) {
        this.f210G = z;
    }

    public boolean isBeepOnResult() {
        return this.f211H;
    }

    public void setBeepOnResult(boolean z) {
        this.f211H = z;
    }

    public boolean isVibrateOnResult() {
        return this.f212I;
    }

    public void setVibrateOnResult(boolean z) {
        this.f212I = z;
    }

    public boolean isCancelOnResult() {
        return this.f213J;
    }

    public void setCancelOnResult(boolean z) {
        this.f213J = z;
    }

    public VisualFeedbackConfig getVisualFeedbackConfig() {
        return this.f214K;
    }

    public void setVisualFeedbackConfig(VisualFeedbackConfig visualFeedbackConfig) {
        this.f214K = visualFeedbackConfig;
    }

    public CameraFeatures.LensFacing getDefaultLensFacing() {
        return this.f215L;
    }

    public void setDefaultLensFacing(CameraFeatures.LensFacing lensFacing) {
        this.f215L = lensFacing;
    }

    public EnumSet<CameraFeatures.LensFacing> getFallbackLensFacings() {
        return this.f216M;
    }

    public void setFallbackLensFacings(EnumSet<CameraFeatures.LensFacing> enumSet) {
        this.f216M = enumSet;
    }

    /* renamed from: at.nineyards.anyline.camera.AnylineViewConfig$CutoutAlignment */
    public enum CutoutAlignment {
        TOP,
        TOP_HALF,
        CENTER,
        BOTTOM_HALF,
        BOTTOM;

        public static CutoutAlignment fromString(String str) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.equals(ViewProps.TOP)) {
                return TOP;
            }
            if (lowerCase.equals("top_half")) {
                return TOP_HALF;
            }
            if (lowerCase.equals("middle") || lowerCase.equals("center")) {
                return CENTER;
            }
            if (lowerCase.equals("bottom_half")) {
                return BOTTOM_HALF;
            }
            if (lowerCase.equals(ViewProps.BOTTOM)) {
                return BOTTOM;
            }
            return CENTER;
        }

        public static CutoutAlignment fromInt(int i) {
            if (i == 0) {
                return TOP;
            }
            if (i == 1) {
                return TOP_HALF;
            }
            if (i == 2) {
                return CENTER;
            }
            if (i == 3) {
                return BOTTOM_HALF;
            }
            if (i == 4) {
                return BOTTOM;
            }
            return CENTER;
        }
    }

    /* renamed from: at.nineyards.anyline.camera.AnylineViewConfig$CutoutStyle */
    public enum CutoutStyle {
        RECT,
        IMAGE;

        public static CutoutStyle fromString(String str) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.equals("rect")) {
                return RECT;
            }
            if (lowerCase.equals("image")) {
                return IMAGE;
            }
            return RECT;
        }

        public static CutoutStyle fromInt(int i) {
            if (i == 0) {
                return RECT;
            }
            if (i == 1) {
                return IMAGE;
            }
            return RECT;
        }
    }

    /* renamed from: at.nineyards.anyline.camera.AnylineViewConfig$FlashMode */
    public enum FlashMode {
        AUTO,
        MANUAL,
        NONE;

        public static FlashMode fromString(String str) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.equals("auto")) {
                return AUTO;
            }
            if (lowerCase.equals("manual")) {
                return MANUAL;
            }
            if (lowerCase.equals("none")) {
                return NONE;
            }
            return NONE;
        }

        public static FlashMode fromInt(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return MANUAL;
            }
            if (i == 2) {
                return AUTO;
            }
            return NONE;
        }
    }

    /* renamed from: at.nineyards.anyline.camera.AnylineViewConfig$FlashAlignment */
    public enum FlashAlignment {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        BOTTOM,
        TOP;

        public static FlashAlignment fromString(String str) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.equals("top_left")) {
                return TOP_LEFT;
            }
            if (lowerCase.equals("top_right")) {
                return TOP_RIGHT;
            }
            if (lowerCase.equals(ViewProps.TOP)) {
                return TOP;
            }
            if (lowerCase.equals("bottom_left")) {
                return BOTTOM_LEFT;
            }
            if (lowerCase.equals("bottom_right")) {
                return BOTTOM_RIGHT;
            }
            if (lowerCase.equals(ViewProps.BOTTOM)) {
                return BOTTOM;
            }
            return TOP_LEFT;
        }

        public static FlashAlignment fromInt(int i) {
            if (i == 0) {
                return TOP_LEFT;
            }
            if (i == 1) {
                return TOP_RIGHT;
            }
            if (i == 2) {
                return TOP;
            }
            if (i == 3) {
                return BOTTOM_LEFT;
            }
            if (i == 4) {
                return BOTTOM_RIGHT;
            }
            if (i == 5) {
                return BOTTOM;
            }
            return TOP_LEFT;
        }
    }
}
