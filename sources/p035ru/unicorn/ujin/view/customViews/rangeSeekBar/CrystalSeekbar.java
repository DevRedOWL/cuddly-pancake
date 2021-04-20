package p035ru.unicorn.ujin.view.customViews.rangeSeekBar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.crystal.crystalrangeseekbar.interfaces.OnSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.interfaces.OnSeekbarFinalValueListener;
import com.github.mikephil.charting.utils.Utils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;

/* renamed from: ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalSeekbar */
public class CrystalSeekbar extends View {
    private static final int INVALID_POINTER_ID = 255;
    private final float NO_STEP;
    private float _barHeight;
    private Paint _paint;
    private RectF _rect;
    private float absoluteMaxValue;
    private float absoluteMinValue;
    private int barColor;
    private int barColorMode;
    private int barGradientEnd;
    private int barGradientStart;
    private float barHeight;
    private int barHighlightColor;
    private int barHighlightColorMode;
    private int barHighlightGradientEnd;
    private int barHighlightGradientStart;
    private float barPadding;
    private float cornerRadius;
    private int dataType;
    private int mActivePointerId;
    private boolean mIsDragging;
    private float maxValue;
    private float minStartValue;
    private float minValue;
    private int nextPosition;
    private double normalizedMaxValue;
    private double normalizedMinValue;
    private OnSeekbarChangeListener onSeekbarChangeListener;
    private OnSeekbarFinalValueListener onSeekbarFinalValueListener;
    private int pointerIndex;
    private int position;
    private Thumb pressedThumb;
    private RectF rectThumb;
    private boolean seekBarTouchEnabled;
    private float steps;
    private Bitmap thumb;
    private int thumbColor;
    private int thumbColorNormal;
    private int thumbColorPressed;
    private float thumbDiameter;
    private Drawable thumbDrawable;
    private Drawable thumbDrawablePressed;
    private float thumbHeight;
    private Bitmap thumbPressed;
    private float thumbWidth;

    /* renamed from: ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalSeekbar$ColorMode */
    public static final class ColorMode {
        public static final int GRADIENT = 1;
        public static final int SOLID = 0;
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalSeekbar$DataType */
    public static final class DataType {
        public static final int BYTE = 5;
        public static final int DOUBLE = 1;
        public static final int FLOAT = 3;
        public static final int INTEGER = 2;
        public static final int LONG = 0;
        public static final int SHORT = 4;
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalSeekbar$Position */
    public static final class Position {
        public static final int LEFT = 0;
        public static final int RIGHT = 1;
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalSeekbar$Thumb */
    protected enum Thumb {
        MIN
    }

    /* access modifiers changed from: protected */
    public void touchDown(float f, float f2) {
    }

    /* access modifiers changed from: protected */
    public void touchMove(float f, float f2) {
    }

    /* access modifiers changed from: protected */
    public void touchUp(float f, float f2) {
    }

    public CrystalSeekbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public CrystalSeekbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public CrystalSeekbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.NO_STEP = -1.0f;
        this.mActivePointerId = 255;
        this.normalizedMinValue = Utils.DOUBLE_EPSILON;
        this.normalizedMaxValue = 100.0d;
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5619R.styleable.CrystalSeekbar);
            try {
                this.cornerRadius = getCornerRadius(obtainStyledAttributes);
                this.minValue = getMinValue(obtainStyledAttributes);
                this.maxValue = getMaxValue(obtainStyledAttributes);
                this.minStartValue = getMinStartValue(obtainStyledAttributes);
                this.steps = getSteps(obtainStyledAttributes);
                this._barHeight = getBarHeight(obtainStyledAttributes);
                this.barColorMode = getBarColorMode(obtainStyledAttributes);
                this.barColor = getBarColor(obtainStyledAttributes);
                this.barGradientStart = getBarGradientStart(obtainStyledAttributes);
                this.barGradientEnd = getBarGradientEnd(obtainStyledAttributes);
                this.barHighlightColorMode = getBarHighlightColorMode(obtainStyledAttributes);
                this.barHighlightColor = getBarHighlightColor(obtainStyledAttributes);
                this.barHighlightGradientStart = getBarHighlightGradientStart(obtainStyledAttributes);
                this.barHighlightGradientEnd = getBarHighlightGradientEnd(obtainStyledAttributes);
                this.thumbColorNormal = getThumbColor(obtainStyledAttributes);
                this.thumbColorPressed = getThumbColorPressed(obtainStyledAttributes);
                this.thumbDrawable = getThumbDrawable(obtainStyledAttributes);
                this.thumbDrawablePressed = getThumbDrawablePressed(obtainStyledAttributes);
                this.dataType = getDataType(obtainStyledAttributes);
                this.position = getPosition(obtainStyledAttributes);
                this.nextPosition = this.position;
                this.thumbDiameter = getDiameter(obtainStyledAttributes);
                this.seekBarTouchEnabled = isSeekBarTouchEnabled(obtainStyledAttributes);
                obtainStyledAttributes.recycle();
                init();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.absoluteMinValue = this.minValue;
        this.absoluteMaxValue = this.maxValue;
        this.thumbColor = this.thumbColorNormal;
        this.thumb = getBitmap(this.thumbDrawable);
        this.thumbPressed = getBitmap(this.thumbDrawablePressed);
        Bitmap bitmap = this.thumbPressed;
        if (bitmap == null) {
            bitmap = this.thumb;
        }
        this.thumbPressed = bitmap;
        this.thumbWidth = getThumbWidth();
        this.thumbHeight = getThumbHeight();
        this.barHeight = getBarHeight();
        this.barPadding = getBarPadding();
        this._paint = new Paint(1);
        this._rect = new RectF();
        this.rectThumb = new RectF();
        this.pressedThumb = null;
        setMinStartValue();
        setWillNotDraw(false);
    }

    public CrystalSeekbar setCornerRadius(float f) {
        this.cornerRadius = f;
        return this;
    }

    public CrystalSeekbar setMinValue(float f) {
        this.minValue = f;
        this.absoluteMinValue = f;
        return this;
    }

    public CrystalSeekbar setMaxValue(float f) {
        this.maxValue = f;
        this.absoluteMaxValue = f;
        return this;
    }

    public CrystalSeekbar setMinStartValue(float f) {
        this.minStartValue = f;
        return this;
    }

    public CrystalSeekbar setSteps(float f) {
        this.steps = f;
        return this;
    }

    public CrystalSeekbar setBarHeight(float f) {
        this._barHeight = f;
        return this;
    }

    public CrystalSeekbar setBarColorMode(int i) {
        this.barColorMode = i;
        return this;
    }

    public CrystalSeekbar setBarColor(int i) {
        this.barColor = i;
        return this;
    }

    public CrystalSeekbar setBarGradientStart(int i) {
        this.barGradientStart = i;
        return this;
    }

    public CrystalSeekbar setBarGradientEnd(int i) {
        this.barGradientEnd = i;
        return this;
    }

    public CrystalSeekbar setBarHighlightColorMode(int i) {
        this.barHighlightColorMode = i;
        return this;
    }

    public CrystalSeekbar setBarHighlightColor(int i) {
        this.barHighlightColor = i;
        return this;
    }

    public CrystalSeekbar setBarHighlightGradientStart(int i) {
        this.barHighlightGradientStart = i;
        return this;
    }

    public CrystalSeekbar setBarHighlightGradientEnd(int i) {
        this.barHighlightGradientEnd = i;
        return this;
    }

    public CrystalSeekbar setThumbColor(int i) {
        this.thumbColorNormal = i;
        return this;
    }

    public CrystalSeekbar setThumbHighlightColor(int i) {
        this.thumbColorPressed = i;
        return this;
    }

    public CrystalSeekbar setThumbDrawable(int i) {
        setThumbDrawable(ContextCompat.getDrawable(getContext(), i));
        return this;
    }

    public CrystalSeekbar setThumbDrawable(Drawable drawable) {
        setThumbBitmap(getBitmap(drawable));
        return this;
    }

    public CrystalSeekbar setThumbBitmap(Bitmap bitmap) {
        this.thumb = bitmap;
        return this;
    }

    public CrystalSeekbar setThumbHighlightDrawable(int i) {
        setThumbHighlightDrawable(ContextCompat.getDrawable(getContext(), i));
        return this;
    }

    public CrystalSeekbar setThumbHighlightDrawable(Drawable drawable) {
        setThumbHighlightBitmap(getBitmap(drawable));
        return this;
    }

    public CrystalSeekbar setThumbHighlightBitmap(Bitmap bitmap) {
        this.thumbPressed = bitmap;
        return this;
    }

    public CrystalSeekbar setDataType(int i) {
        this.dataType = i;
        return this;
    }

    public CrystalSeekbar setPosition(int i) {
        this.nextPosition = i;
        return this;
    }

    public void setOnSeekbarChangeListener(OnSeekbarChangeListener onSeekbarChangeListener2) {
        this.onSeekbarChangeListener = onSeekbarChangeListener2;
        OnSeekbarChangeListener onSeekbarChangeListener3 = this.onSeekbarChangeListener;
        if (onSeekbarChangeListener3 != null) {
            onSeekbarChangeListener3.valueChanged(getSelectedMinValue());
        }
    }

    public void setOnSeekbarFinalValueListener(OnSeekbarFinalValueListener onSeekbarFinalValueListener2) {
        this.onSeekbarFinalValueListener = onSeekbarFinalValueListener2;
    }

    public Thumb getPressedThumb() {
        return this.pressedThumb;
    }

    public RectF getThumbRect() {
        return this.rectThumb;
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public float getMinValue() {
        return this.minValue;
    }

    public float getMaxValue() {
        return this.maxValue;
    }

    public float getMinStartValue() {
        return this.minStartValue;
    }

    public float getSteps() {
        return this.steps;
    }

    public int getBarColor() {
        return this.barColor;
    }

    public int getBarHighlightColor() {
        return this.barHighlightColor;
    }

    public int getLeftThumbColor() {
        return this.thumbColor;
    }

    public int getLeftThumbColorPressed() {
        return this.thumbColorPressed;
    }

    public Drawable getLeftDrawable() {
        return this.thumbDrawable;
    }

    public Drawable getLeftDrawablePressed() {
        return this.thumbDrawablePressed;
    }

    public int getDataType() {
        return this.dataType;
    }

    public int getPosition() {
        return this.position;
    }

    public float getThumbWidth() {
        Bitmap bitmap = this.thumb;
        return bitmap != null ? (float) bitmap.getWidth() : getThumbDiameter();
    }

    public float getThumbHeight() {
        Bitmap bitmap = this.thumb;
        return bitmap != null ? (float) bitmap.getHeight() : getThumbDiameter();
    }

    /* access modifiers changed from: protected */
    public float getThumbDiameter() {
        float f = this.thumbDiameter;
        return f > 0.0f ? f : getResources().getDimension(R.dimen.thumb_width);
    }

    public float getBarHeight() {
        float f = this._barHeight;
        return f > 0.0f ? f : this.thumbHeight * 0.5f * 0.3f;
    }

    public float getDiameter(TypedArray typedArray) {
        return (float) typedArray.getDimensionPixelSize(22, getResources().getDimensionPixelSize(R.dimen.thumb_height));
    }

    /* access modifiers changed from: protected */
    public boolean isSeekBarTouchEnabled(TypedArray typedArray) {
        return typedArray.getBoolean(18, false);
    }

    public float getBarPadding() {
        return this.thumbWidth * 0.5f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Number getSelectedMinValue() {
        /*
            r9 = this;
            double r0 = r9.normalizedMinValue
            float r2 = r9.steps
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x002a
            float r3 = r9.absoluteMaxValue
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r3 / r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x002a
            float r5 = r9.absoluteMinValue
            float r3 = r3 - r5
            float r2 = r2 / r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r3
            float r3 = r2 / r4
            double r3 = (double) r3
            double r5 = (double) r2
            double r7 = r0 % r5
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0028
            double r0 = r0 - r7
            double r0 = r0 + r5
            goto L_0x0032
        L_0x0028:
            double r0 = r0 - r7
            goto L_0x0032
        L_0x002a:
            float r2 = r9.steps
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x004c
        L_0x0032:
            int r2 = r9.position
            if (r2 != 0) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            float r2 = r9.maxValue
            double r2 = (double) r2
            double r0 = r0 - r2
            double r0 = java.lang.Math.abs(r0)
        L_0x003f:
            double r0 = r9.normalizedToValue(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Number r0 = r9.formatValue(r0)
            return r0
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "steps out of range "
            r1.append(r2)
            float r2 = r9.steps
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalSeekbar.getSelectedMinValue():java.lang.Number");
    }

    public Number getSelectedMaxValue() {
        double d = this.normalizedMaxValue;
        float f = this.steps;
        if (f > 0.0f) {
            float f2 = this.absoluteMaxValue;
            if (f <= f2 / 2.0f) {
                float f3 = (f / (f2 - this.absoluteMinValue)) * 100.0f;
                double d2 = (double) f3;
                double d3 = d % d2;
                d = d3 > ((double) (f3 / 2.0f)) ? (d - d3) + d2 : d - d3;
                return formatValue(Double.valueOf(normalizedToValue(d)));
            }
        }
        if (this.steps != -1.0f) {
            throw new IllegalStateException("steps out of range " + this.steps);
        }
        return formatValue(Double.valueOf(normalizedToValue(d)));
    }

    public void apply() {
        Bitmap bitmap = this.thumb;
        this.thumbWidth = bitmap != null ? (float) bitmap.getWidth() : getResources().getDimension(R.dimen.thumb_width);
        Bitmap bitmap2 = this.thumb;
        this.thumbHeight = bitmap2 != null ? (float) bitmap2.getHeight() : getResources().getDimension(R.dimen.thumb_height);
        this.barHeight = this.thumbHeight * 0.5f * 0.3f;
        this.barPadding = this.thumbWidth * 0.5f;
        float f = this.minStartValue;
        if (f <= this.minValue) {
            this.minStartValue = 0.0f;
            setNormalizedMinValue((double) this.minStartValue);
        } else {
            float f2 = this.maxValue;
            if (f > f2) {
                this.minStartValue = f2;
                setNormalizedMinValue((double) this.minStartValue);
            } else {
                if (this.nextPosition != this.position) {
                    this.minStartValue = (float) Math.abs(this.normalizedMaxValue - this.normalizedMinValue);
                }
                float f3 = this.minStartValue;
                if (f3 > this.minValue) {
                    this.minStartValue = Math.min(f3, this.absoluteMaxValue);
                    float f4 = this.minStartValue;
                    float f5 = this.absoluteMinValue;
                    this.minStartValue = f4 - f5;
                    this.minStartValue = (this.minStartValue / (this.absoluteMaxValue - f5)) * 100.0f;
                }
                setNormalizedMinValue((double) this.minStartValue);
                this.position = this.nextPosition;
            }
        }
        invalidate();
        OnSeekbarChangeListener onSeekbarChangeListener2 = this.onSeekbarChangeListener;
        if (onSeekbarChangeListener2 != null) {
            onSeekbarChangeListener2.valueChanged(getSelectedMinValue());
        }
    }

    /* access modifiers changed from: protected */
    public Bitmap getBitmap(Drawable drawable) {
        if (drawable != null) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public float getCornerRadius(TypedArray typedArray) {
        return typedArray.getFloat(9, 0.0f);
    }

    /* access modifiers changed from: protected */
    public float getMinValue(TypedArray typedArray) {
        return typedArray.getFloat(17, 0.0f);
    }

    /* access modifiers changed from: protected */
    public float getMaxValue(TypedArray typedArray) {
        return typedArray.getFloat(15, 100.0f);
    }

    /* access modifiers changed from: protected */
    public float getMinStartValue(TypedArray typedArray) {
        return typedArray.getFloat(16, this.minValue);
    }

    /* access modifiers changed from: protected */
    public float getSteps(TypedArray typedArray) {
        return typedArray.getFloat(19, -1.0f);
    }

    /* access modifiers changed from: protected */
    public float getBarHeight(TypedArray typedArray) {
        return (float) typedArray.getDimensionPixelSize(4, 0);
    }

    /* access modifiers changed from: protected */
    public int getBarColorMode(TypedArray typedArray) {
        return typedArray.getInt(1, 0);
    }

    /* access modifiers changed from: protected */
    public int getBarColor(TypedArray typedArray) {
        return typedArray.getColor(0, -7829368);
    }

    /* access modifiers changed from: protected */
    public int getBarGradientStart(TypedArray typedArray) {
        return typedArray.getColor(3, -7829368);
    }

    /* access modifiers changed from: protected */
    public int getBarGradientEnd(TypedArray typedArray) {
        return typedArray.getColor(2, -12303292);
    }

    /* access modifiers changed from: protected */
    public int getBarHighlightColorMode(TypedArray typedArray) {
        return typedArray.getInt(6, 0);
    }

    /* access modifiers changed from: protected */
    public int getBarHighlightColor(TypedArray typedArray) {
        return typedArray.getColor(5, ViewCompat.MEASURED_STATE_MASK);
    }

    /* access modifiers changed from: protected */
    public int getBarHighlightGradientStart(TypedArray typedArray) {
        return typedArray.getColor(8, -12303292);
    }

    /* access modifiers changed from: protected */
    public int getBarHighlightGradientEnd(TypedArray typedArray) {
        return typedArray.getColor(7, ViewCompat.MEASURED_STATE_MASK);
    }

    /* access modifiers changed from: protected */
    public int getThumbColor(TypedArray typedArray) {
        return typedArray.getColor(20, ViewCompat.MEASURED_STATE_MASK);
    }

    /* access modifiers changed from: protected */
    public int getThumbColorPressed(TypedArray typedArray) {
        return typedArray.getColor(21, -12303292);
    }

    /* access modifiers changed from: protected */
    public Drawable getThumbDrawable(TypedArray typedArray) {
        return typedArray.getDrawable(23);
    }

    /* access modifiers changed from: protected */
    public Drawable getThumbDrawablePressed(TypedArray typedArray) {
        return typedArray.getDrawable(24);
    }

    /* access modifiers changed from: protected */
    public int getDataType(TypedArray typedArray) {
        return typedArray.getInt(10, 2);
    }

    /* access modifiers changed from: protected */
    public final int getPosition(TypedArray typedArray) {
        int i = typedArray.getInt(13, 0);
        this.normalizedMinValue = i == 0 ? this.normalizedMinValue : this.normalizedMaxValue;
        return i;
    }

    /* access modifiers changed from: protected */
    public void setupBar(Canvas canvas, Paint paint, RectF rectF) {
        rectF.left = this.barPadding;
        rectF.top = (((float) getHeight()) - this.barHeight) * 0.5f;
        rectF.right = ((float) getWidth()) - this.barPadding;
        rectF.bottom = (((float) getHeight()) + this.barHeight) * 0.5f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        if (this.barColorMode == 0) {
            paint.setColor(this.barColor);
            drawBar(canvas, paint, rectF);
            return;
        }
        paint.setShader(new LinearGradient(rectF.left, rectF.bottom, rectF.right, rectF.top, this.barGradientStart, this.barGradientEnd, Shader.TileMode.MIRROR));
        drawBar(canvas, paint, rectF);
        paint.setShader((Shader) null);
    }

    /* access modifiers changed from: protected */
    public void drawBar(Canvas canvas, Paint paint, RectF rectF) {
        float f = this.cornerRadius;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    /* access modifiers changed from: protected */
    public void setupHighlightBar(Canvas canvas, Paint paint, RectF rectF) {
        if (this.position == 1) {
            rectF.left = normalizedToScreen(this.normalizedMinValue) + (getThumbWidth() / 2.0f);
            rectF.right = ((float) getWidth()) - (getThumbWidth() / 2.0f);
        } else {
            rectF.left = getThumbWidth() / 2.0f;
            rectF.right = normalizedToScreen(this.normalizedMinValue) + (getThumbWidth() / 2.0f);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        if (this.barHighlightColorMode == 0) {
            paint.setColor(this.barHighlightColor);
            drawHighlightBar(canvas, paint, rectF);
            return;
        }
        paint.setShader(new LinearGradient(rectF.left, rectF.bottom, rectF.right, rectF.top, this.barHighlightGradientStart, this.barHighlightGradientEnd, Shader.TileMode.MIRROR));
        drawHighlightBar(canvas, paint, rectF);
        paint.setShader((Shader) null);
    }

    /* access modifiers changed from: protected */
    public void drawHighlightBar(Canvas canvas, Paint paint, RectF rectF) {
        float f = this.cornerRadius;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    /* access modifiers changed from: protected */
    public void setupLeftThumb(Canvas canvas, Paint paint, RectF rectF) {
        this.thumbColor = Thumb.MIN.equals(this.pressedThumb) ? this.thumbColorPressed : this.thumbColorNormal;
        paint.setColor(this.thumbColor);
        this.rectThumb.left = normalizedToScreen(this.normalizedMinValue);
        RectF rectF2 = this.rectThumb;
        rectF2.right = Math.min(rectF2.left + (getThumbWidth() / 2.0f) + this.barPadding, (float) getWidth());
        RectF rectF3 = this.rectThumb;
        rectF3.top = 0.0f;
        rectF3.bottom = this.thumbHeight;
        if (this.thumb != null) {
            drawLeftThumbWithImage(canvas, paint, this.rectThumb, Thumb.MIN.equals(this.pressedThumb) ? this.thumbPressed : this.thumb);
        } else {
            drawLeftThumbWithColor(canvas, paint, rectF3);
        }
    }

    /* access modifiers changed from: protected */
    public void drawLeftThumbWithColor(Canvas canvas, Paint paint, RectF rectF) {
        canvas.drawOval(rectF, paint);
    }

    /* access modifiers changed from: protected */
    public void drawLeftThumbWithImage(Canvas canvas, Paint paint, RectF rectF, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, rectF.left, rectF.top, paint);
    }

    /* access modifiers changed from: protected */
    public void trackTouchEvent(MotionEvent motionEvent) {
        try {
            float x = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
            if (Thumb.MIN.equals(this.pressedThumb)) {
                setNormalizedMinValue(screenToNormalized(x));
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public int getMeasureSpecWith(int i) {
        if (View.MeasureSpec.getMode(i) != 0) {
            return View.MeasureSpec.getSize(i);
        }
        return 200;
    }

    /* access modifiers changed from: protected */
    public int getMeasureSpecHeight(int i) {
        int round = Math.round(this.thumbHeight);
        return View.MeasureSpec.getMode(i) != 0 ? Math.min(round, View.MeasureSpec.getSize(i)) : round;
    }

    /* access modifiers changed from: protected */
    public final void log(Object obj) {
        Log.d("CRS=>", String.valueOf(obj));
    }

    private void setMinStartValue() {
        float f = this.minStartValue;
        if (f > this.minValue && f < this.maxValue) {
            this.minStartValue = Math.min(f, this.absoluteMaxValue);
            float f2 = this.minStartValue;
            float f3 = this.absoluteMinValue;
            this.minStartValue = f2 - f3;
            this.minStartValue = (this.minStartValue / (this.absoluteMaxValue - f3)) * 100.0f;
            setNormalizedMinValue((double) this.minStartValue);
        }
    }

    private Thumb evalPressedThumb(float f) {
        boolean isInThumbRange = isInThumbRange(f, this.normalizedMinValue);
        if (this.seekBarTouchEnabled || isInThumbRange) {
            return Thumb.MIN;
        }
        return null;
    }

    private boolean isInThumbRange(float f, double d) {
        float normalizedToScreen = normalizedToScreen(d);
        float thumbWidth2 = normalizedToScreen - (getThumbWidth() / 2.0f);
        float thumbWidth3 = (getThumbWidth() / 2.0f) + normalizedToScreen;
        float thumbWidth4 = f - (getThumbWidth() / 2.0f);
        if (normalizedToScreen <= ((float) getWidth()) - this.thumbWidth) {
            f = thumbWidth4;
        }
        return f >= thumbWidth2 && f <= thumbWidth3;
    }

    private void onStartTrackingTouch() {
        this.mIsDragging = true;
    }

    private void onStopTrackingTouch() {
        this.mIsDragging = false;
    }

    private float normalizedToScreen(double d) {
        return (((float) d) / 100.0f) * (((float) getWidth()) - (this.barPadding * 2.0f));
    }

    private double screenToNormalized(float f) {
        double width = (double) getWidth();
        float f2 = this.barPadding;
        if (width <= ((double) (f2 * 2.0f))) {
            return Utils.DOUBLE_EPSILON;
        }
        double d = width - ((double) (2.0f * f2));
        return Math.min(100.0d, Math.max(Utils.DOUBLE_EPSILON, ((((double) f) / d) * 100.0d) - ((((double) f2) / d) * 100.0d)));
    }

    private void setNormalizedMinValue(double d) {
        this.normalizedMinValue = Math.max(Utils.DOUBLE_EPSILON, Math.min(100.0d, Math.min(d, this.normalizedMaxValue)));
        invalidate();
    }

    private void setNormalizedMaxValue(double d) {
        this.normalizedMaxValue = Math.max(Utils.DOUBLE_EPSILON, Math.min(100.0d, Math.max(d, this.normalizedMinValue)));
        invalidate();
    }

    private double normalizedToValue(double d) {
        float f = this.maxValue;
        float f2 = this.minValue;
        double d2 = (d / 100.0d) * ((double) (f - f2));
        return this.position == 0 ? d2 + ((double) f2) : d2;
    }

    private void attemptClaimDrag() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    private <T extends Number> Number formatValue(T t) throws IllegalArgumentException {
        Double d = (Double) t;
        int i = this.dataType;
        if (i == 0) {
            return Long.valueOf(d.longValue());
        }
        if (i == 1) {
            return d;
        }
        if (i == 2) {
            return Long.valueOf(Math.round(d.doubleValue()));
        }
        if (i == 3) {
            return Float.valueOf(d.floatValue());
        }
        if (i == 4) {
            return Short.valueOf(d.shortValue());
        }
        if (i == 5) {
            return Byte.valueOf(d.byteValue());
        }
        throw new IllegalArgumentException("Number class '" + t.getClass().getName() + "' is not supported");
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode()) {
            setupBar(canvas, this._paint, this._rect);
            setupHighlightBar(canvas, this._paint, this._rect);
            setupLeftThumb(canvas, this._paint, this._rect);
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(getMeasureSpecWith(i), getMeasureSpecHeight(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fe, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.isEnabled()     // Catch:{ all -> 0x00ff }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            monitor-exit(r4)
            return r1
        L_0x000a:
            int r0 = r5.getAction()     // Catch:{ all -> 0x00ff }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 1
            if (r0 == 0) goto L_0x00b6
            if (r0 == r2) goto L_0x006f
            r3 = 2
            if (r0 == r3) goto L_0x0046
            r3 = 3
            if (r0 == r3) goto L_0x0028
            r5 = 5
            if (r0 == r5) goto L_0x00fd
            r5 = 6
            if (r0 == r5) goto L_0x0023
            goto L_0x00fd
        L_0x0023:
            r4.invalidate()     // Catch:{ all -> 0x00ff }
            goto L_0x00fd
        L_0x0028:
            boolean r0 = r4.mIsDragging     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x0041
            r4.onStopTrackingTouch()     // Catch:{ all -> 0x00ff }
            r4.setPressed(r1)     // Catch:{ all -> 0x00ff }
            int r0 = r4.pointerIndex     // Catch:{ all -> 0x00ff }
            float r0 = r5.getX(r0)     // Catch:{ all -> 0x00ff }
            int r1 = r4.pointerIndex     // Catch:{ all -> 0x00ff }
            float r5 = r5.getY(r1)     // Catch:{ all -> 0x00ff }
            r4.touchUp(r0, r5)     // Catch:{ all -> 0x00ff }
        L_0x0041:
            r4.invalidate()     // Catch:{ all -> 0x00ff }
            goto L_0x00fd
        L_0x0046:
            ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalSeekbar$Thumb r0 = r4.pressedThumb     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r4.mIsDragging     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x0060
            int r0 = r4.pointerIndex     // Catch:{ all -> 0x00ff }
            float r0 = r5.getX(r0)     // Catch:{ all -> 0x00ff }
            int r1 = r4.pointerIndex     // Catch:{ all -> 0x00ff }
            float r1 = r5.getY(r1)     // Catch:{ all -> 0x00ff }
            r4.touchMove(r0, r1)     // Catch:{ all -> 0x00ff }
            r4.trackTouchEvent(r5)     // Catch:{ all -> 0x00ff }
        L_0x0060:
            com.crystal.crystalrangeseekbar.interfaces.OnSeekbarChangeListener r5 = r4.onSeekbarChangeListener     // Catch:{ all -> 0x00ff }
            if (r5 == 0) goto L_0x00fd
            com.crystal.crystalrangeseekbar.interfaces.OnSeekbarChangeListener r5 = r4.onSeekbarChangeListener     // Catch:{ all -> 0x00ff }
            java.lang.Number r0 = r4.getSelectedMinValue()     // Catch:{ all -> 0x00ff }
            r5.valueChanged(r0)     // Catch:{ all -> 0x00ff }
            goto L_0x00fd
        L_0x006f:
            boolean r0 = r4.mIsDragging     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x0099
            r4.trackTouchEvent(r5)     // Catch:{ all -> 0x00ff }
            r4.onStopTrackingTouch()     // Catch:{ all -> 0x00ff }
            r4.setPressed(r1)     // Catch:{ all -> 0x00ff }
            int r0 = r4.pointerIndex     // Catch:{ all -> 0x00ff }
            float r0 = r5.getX(r0)     // Catch:{ all -> 0x00ff }
            int r1 = r4.pointerIndex     // Catch:{ all -> 0x00ff }
            float r5 = r5.getY(r1)     // Catch:{ all -> 0x00ff }
            r4.touchUp(r0, r5)     // Catch:{ all -> 0x00ff }
            com.crystal.crystalrangeseekbar.interfaces.OnSeekbarFinalValueListener r5 = r4.onSeekbarFinalValueListener     // Catch:{ all -> 0x00ff }
            if (r5 == 0) goto L_0x00a2
            com.crystal.crystalrangeseekbar.interfaces.OnSeekbarFinalValueListener r5 = r4.onSeekbarFinalValueListener     // Catch:{ all -> 0x00ff }
            java.lang.Number r0 = r4.getSelectedMinValue()     // Catch:{ all -> 0x00ff }
            r5.finalValue(r0)     // Catch:{ all -> 0x00ff }
            goto L_0x00a2
        L_0x0099:
            r4.onStartTrackingTouch()     // Catch:{ all -> 0x00ff }
            r4.trackTouchEvent(r5)     // Catch:{ all -> 0x00ff }
            r4.onStopTrackingTouch()     // Catch:{ all -> 0x00ff }
        L_0x00a2:
            r5 = 0
            r4.pressedThumb = r5     // Catch:{ all -> 0x00ff }
            r4.invalidate()     // Catch:{ all -> 0x00ff }
            com.crystal.crystalrangeseekbar.interfaces.OnSeekbarChangeListener r5 = r4.onSeekbarChangeListener     // Catch:{ all -> 0x00ff }
            if (r5 == 0) goto L_0x00fd
            com.crystal.crystalrangeseekbar.interfaces.OnSeekbarChangeListener r5 = r4.onSeekbarChangeListener     // Catch:{ all -> 0x00ff }
            java.lang.Number r0 = r4.getSelectedMinValue()     // Catch:{ all -> 0x00ff }
            r5.valueChanged(r0)     // Catch:{ all -> 0x00ff }
            goto L_0x00fd
        L_0x00b6:
            int r0 = r5.getPointerCount()     // Catch:{ all -> 0x00ff }
            int r0 = r0 - r2
            int r0 = r5.getPointerId(r0)     // Catch:{ all -> 0x00ff }
            r4.mActivePointerId = r0     // Catch:{ all -> 0x00ff }
            int r0 = r4.mActivePointerId     // Catch:{ all -> 0x00ff }
            int r0 = r5.findPointerIndex(r0)     // Catch:{ all -> 0x00ff }
            r4.pointerIndex = r0     // Catch:{ all -> 0x00ff }
            int r0 = r4.pointerIndex     // Catch:{ all -> 0x00ff }
            float r0 = r5.getX(r0)     // Catch:{ all -> 0x00ff }
            ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalSeekbar$Thumb r0 = r4.evalPressedThumb(r0)     // Catch:{ all -> 0x00ff }
            r4.pressedThumb = r0     // Catch:{ all -> 0x00ff }
            ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalSeekbar$Thumb r0 = r4.pressedThumb     // Catch:{ all -> 0x00ff }
            if (r0 != 0) goto L_0x00df
            boolean r5 = super.onTouchEvent(r5)     // Catch:{ all -> 0x00ff }
            monitor-exit(r4)
            return r5
        L_0x00df:
            int r0 = r4.pointerIndex     // Catch:{ all -> 0x00ff }
            float r0 = r5.getX(r0)     // Catch:{ all -> 0x00ff }
            int r1 = r4.pointerIndex     // Catch:{ all -> 0x00ff }
            float r1 = r5.getY(r1)     // Catch:{ all -> 0x00ff }
            r4.touchDown(r0, r1)     // Catch:{ all -> 0x00ff }
            r4.setPressed(r2)     // Catch:{ all -> 0x00ff }
            r4.invalidate()     // Catch:{ all -> 0x00ff }
            r4.onStartTrackingTouch()     // Catch:{ all -> 0x00ff }
            r4.trackTouchEvent(r5)     // Catch:{ all -> 0x00ff }
            r4.attemptClaimDrag()     // Catch:{ all -> 0x00ff }
        L_0x00fd:
            monitor-exit(r4)
            return r2
        L_0x00ff:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.rangeSeekBar.CrystalSeekbar.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
