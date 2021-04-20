package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.graphics.Color;
import org.json.JSONObject;
import p007at.nineyards.anyline.util.DimensUtil;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField;

/* renamed from: at.nineyards.anyline.camera.VisualFeedbackConfig */
public class VisualFeedbackConfig {

    /* renamed from: a */
    private FeedbackStyle f406a = FeedbackStyle.RECT;

    /* renamed from: b */
    private int f407b = Color.parseColor("#AA0099FF");

    /* renamed from: c */
    private int f408c = 2;

    /* renamed from: d */
    private int f409d = 0;

    /* renamed from: e */
    private int f410e = 1;

    /* renamed from: f */
    private AnimationStyle f411f = null;

    /* renamed from: g */
    private int f412g = 75;

    /* renamed from: h */
    private int f413h = 0;

    /* renamed from: at.nineyards.anyline.camera.VisualFeedbackConfig$FeedbackStyle */
    public enum FeedbackStyle {
        RECT,
        CONTOUR_RECT,
        CONTOUR_UNDERLINE,
        CONTOUR_POINT;

        public static FeedbackStyle fromInt(int i) {
            if (i == 1) {
                return CONTOUR_RECT;
            }
            if (i == 2) {
                return CONTOUR_UNDERLINE;
            }
            if (i == 3) {
                return CONTOUR_POINT;
            }
            return RECT;
        }
    }

    /* renamed from: at.nineyards.anyline.camera.VisualFeedbackConfig$AnimationStyle */
    public enum AnimationStyle {
        TRAVERSE_SINGLE,
        KITT,
        TRAVERSE_MULTI,
        RESIZE,
        BLINK,
        PULSE,
        PULSE_RANDOM;

        public static AnimationStyle fromInt(int i) {
            if (i == 1) {
                return KITT;
            }
            if (i == 2) {
                return TRAVERSE_MULTI;
            }
            if (i == 3) {
                return RESIZE;
            }
            if (i == 4) {
                return BLINK;
            }
            if (i == 5) {
                return PULSE;
            }
            if (i == 6) {
                return PULSE_RANDOM;
            }
            return TRAVERSE_SINGLE;
        }
    }

    public VisualFeedbackConfig() {
    }

    public VisualFeedbackConfig(JSONObject jSONObject, int i) {
        String optString = jSONObject.optString(ButtonField.JsonFields.style);
        if (!optString.isEmpty()) {
            try {
                this.f406a = FeedbackStyle.valueOf(optString.toUpperCase());
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException("The specified visual feedback style does not exist. Available styles: rect, contour_rect, contour_underline, contour_point");
            }
        }
        String optString2 = jSONObject.optString("strokeColor");
        if (!optString2.isEmpty()) {
            this.f407b = Color.parseColor("#" + optString2);
        }
        this.f408c = jSONObject.optInt("strokeWidth", this.f408c);
        String optString3 = jSONObject.optString("fillColor");
        if (!optString3.isEmpty()) {
            this.f409d = Color.parseColor("#" + optString3);
        }
        this.f410e = jSONObject.optInt("cornerRadius", i);
        String optString4 = jSONObject.optString("animation");
        if (optString4 != null && !optString4.isEmpty()) {
            try {
                this.f411f = AnimationStyle.valueOf(optString4.toUpperCase());
            } catch (IllegalArgumentException unused2) {
                throw new IllegalArgumentException("The specified animation style does not exist. Available styles: traverse_single, traverse_multi, kitt, resize, blink, pulse, pulse_random");
            }
        }
        this.f412g = jSONObject.optInt("animationDuration", this.f412g);
        this.f413h = jSONObject.optInt("redrawTimeout", this.f413h);
    }

    public FeedbackStyle getFeedbackStyle() {
        return this.f406a;
    }

    public void setFeedbackStyle(FeedbackStyle feedbackStyle) {
        this.f406a = feedbackStyle;
    }

    public int getStrokeColor() {
        return this.f407b;
    }

    public void setStrokeColor(int i) {
        this.f407b = i;
    }

    public int getStrokeWidthInDp() {
        return this.f408c;
    }

    public int getStrokeWidthInPix(Context context) {
        return DimensUtil.getPixFromDp(context, this.f408c);
    }

    public void setStrokeWidthInDp(int i) {
        this.f408c = i;
    }

    public int getFillColor() {
        return this.f409d;
    }

    public void setFillColor(int i) {
        this.f409d = i;
    }

    public int getCornerRadiusInDp() {
        return this.f410e;
    }

    public void setCornerRadiusInDp(int i) {
        this.f410e = i;
    }

    public AnimationStyle getAnimationStyle() {
        return this.f411f;
    }

    public void setAnimationStyle(AnimationStyle animationStyle) {
        this.f411f = animationStyle;
    }

    public int getAnimationDuration() {
        return this.f412g;
    }

    public void setAnimationDuration(int i) {
        this.f412g = i;
    }

    public int getRedrawTimeout() {
        return this.f413h;
    }

    public void setRedrawTimeout(int i) {
        this.f413h = i;
    }
}
