package com.crystal.crystalrangeseekbar.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
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
import com.example.crystalrangeseekbar.C1204R;
import com.github.mikephil.charting.utils.Utils;

public class CrystalSeekbar extends View {
    private static final int INVALID_POINTER_ID = 255;
    private final float NO_STEP;
    private Paint _paint;
    private RectF _rect;
    private float absoluteMaxValue;
    private float absoluteMinValue;
    private int barColor;
    private float barHeight;
    private int barHighlightColor;
    private float barPadding;
    private float cornerRadius;
    private int dataType;
    private Drawable leftDrawable;
    private Drawable leftDrawablePressed;
    private Bitmap leftThumb;
    private int leftThumbColor;
    private int leftThumbColorNormal;
    private int leftThumbColorPressed;
    private Bitmap leftThumbPressed;
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
    private RectF rectLeftThumb;
    private float steps;
    private float thumbHeight;
    private float thumbWidth;

    public static final class DataType {
        public static final int BYTE = 5;
        public static final int DOUBLE = 1;
        public static final int FLOAT = 3;
        public static final int INTEGER = 2;
        public static final int LONG = 0;
        public static final int SHORT = 4;
    }

    public static final class Position {
        public static final int LEFT = 0;
        public static final int RIGHT = 1;
    }

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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1204R.styleable.CrystalRangeSeekbar);
            try {
                this.cornerRadius = getCornerRadius(obtainStyledAttributes);
                this.minValue = getMinValue(obtainStyledAttributes);
                this.maxValue = getMaxValue(obtainStyledAttributes);
                this.minStartValue = getMinStartValue(obtainStyledAttributes);
                this.steps = getSteps(obtainStyledAttributes);
                this.barColor = getBarColor(obtainStyledAttributes);
                this.barHighlightColor = getBarHighlightColor(obtainStyledAttributes);
                this.leftThumbColorNormal = getLeftThumbColor(obtainStyledAttributes);
                this.leftThumbColorPressed = getLeftThumbColorPressed(obtainStyledAttributes);
                this.leftDrawable = getLeftDrawable(obtainStyledAttributes);
                this.leftDrawablePressed = getLeftDrawablePressed(obtainStyledAttributes);
                this.dataType = getDataType(obtainStyledAttributes);
                this.position = getPosition(obtainStyledAttributes);
                this.nextPosition = this.position;
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
        this.leftThumbColor = this.leftThumbColorNormal;
        this.leftThumb = getBitmap(this.leftDrawable);
        this.leftThumbPressed = getBitmap(this.leftDrawablePressed);
        Bitmap bitmap = this.leftThumbPressed;
        if (bitmap == null) {
            bitmap = this.leftThumb;
        }
        this.leftThumbPressed = bitmap;
        this.thumbWidth = getThumbWidth();
        this.thumbHeight = getThumbHeight();
        this.barHeight = getBarHeight();
        this.barPadding = getBarPadding();
        this._paint = new Paint(1);
        this._rect = new RectF();
        this.rectLeftThumb = new RectF();
        this.pressedThumb = null;
        setMinStartValue();
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

    public CrystalSeekbar setBarColor(int i) {
        this.barColor = i;
        return this;
    }

    public CrystalSeekbar setBarHighlightColor(int i) {
        this.barHighlightColor = i;
        return this;
    }

    public CrystalSeekbar setLeftThumbColor(int i) {
        this.leftThumbColorNormal = i;
        return this;
    }

    public CrystalSeekbar setLeftThumbHighlightColor(int i) {
        this.leftThumbColorPressed = i;
        return this;
    }

    public CrystalSeekbar setLeftThumbDrawable(int i) {
        setLeftThumbDrawable(ContextCompat.getDrawable(getContext(), i));
        return this;
    }

    public CrystalSeekbar setLeftThumbDrawable(Drawable drawable) {
        setLeftThumbBitmap(getBitmap(drawable));
        return this;
    }

    public CrystalSeekbar setLeftThumbBitmap(Bitmap bitmap) {
        this.leftThumb = bitmap;
        return this;
    }

    public CrystalSeekbar setLeftThumbHighlightDrawable(int i) {
        setLeftThumbHighlightDrawable(ContextCompat.getDrawable(getContext(), i));
        return this;
    }

    public CrystalSeekbar setLeftThumbHighlightDrawable(Drawable drawable) {
        setLeftThumbHighlightBitmap(getBitmap(drawable));
        return this;
    }

    public CrystalSeekbar setLeftThumbHighlightBitmap(Bitmap bitmap) {
        this.leftThumbPressed = bitmap;
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

    public RectF getLeftThumbRect() {
        return this.rectLeftThumb;
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
        return this.leftThumbColor;
    }

    public int getLeftThumbColorPressed() {
        return this.leftThumbColorPressed;
    }

    public Drawable getLeftDrawable() {
        return this.leftDrawable;
    }

    public Drawable getLeftDrawablePressed() {
        return this.leftDrawablePressed;
    }

    public int getDataType() {
        return this.dataType;
    }

    public int getPosition() {
        return this.position;
    }

    public float getThumbWidth() {
        Bitmap bitmap = this.leftThumb;
        return bitmap != null ? (float) bitmap.getWidth() : getResources().getDimension(C1204R.dimen.thumb_width);
    }

    public float getThumbHeight() {
        Bitmap bitmap = this.leftThumb;
        return bitmap != null ? (float) bitmap.getHeight() : getResources().getDimension(C1204R.dimen.thumb_height);
    }

    public float getBarHeight() {
        return this.thumbHeight * 0.5f * 0.3f;
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
        throw new UnsupportedOperationException("Method not decompiled: com.crystal.crystalrangeseekbar.widgets.CrystalSeekbar.getSelectedMinValue():java.lang.Number");
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
        Bitmap bitmap = this.leftThumb;
        this.thumbWidth = bitmap != null ? (float) bitmap.getWidth() : getResources().getDimension(C1204R.dimen.thumb_width);
        Bitmap bitmap2 = this.leftThumb;
        this.thumbHeight = bitmap2 != null ? (float) bitmap2.getHeight() : getResources().getDimension(C1204R.dimen.thumb_height);
        this.barHeight = this.thumbHeight * 0.5f * 0.3f;
        this.barPadding = this.thumbWidth * 0.5f;
        float f = this.minStartValue;
        if (f < this.minValue) {
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
        return typedArray.getFloat(C1204R.styleable.CrystalRangeSeekbar_corner_radius, 0.0f);
    }

    /* access modifiers changed from: protected */
    public float getMinValue(TypedArray typedArray) {
        return typedArray.getFloat(C1204R.styleable.CrystalRangeSeekbar_min_value, 0.0f);
    }

    /* access modifiers changed from: protected */
    public float getMaxValue(TypedArray typedArray) {
        return typedArray.getFloat(C1204R.styleable.CrystalRangeSeekbar_max_value, 100.0f);
    }

    /* access modifiers changed from: protected */
    public float getMinStartValue(TypedArray typedArray) {
        return typedArray.getFloat(C1204R.styleable.CrystalRangeSeekbar_min_start_value, this.minValue);
    }

    /* access modifiers changed from: protected */
    public float getSteps(TypedArray typedArray) {
        return typedArray.getFloat(C1204R.styleable.CrystalRangeSeekbar_steps, -1.0f);
    }

    /* access modifiers changed from: protected */
    public int getBarColor(TypedArray typedArray) {
        return typedArray.getColor(C1204R.styleable.CrystalRangeSeekbar_bar_color, -7829368);
    }

    /* access modifiers changed from: protected */
    public int getBarHighlightColor(TypedArray typedArray) {
        return typedArray.getColor(C1204R.styleable.CrystalRangeSeekbar_bar_highlight_color, ViewCompat.MEASURED_STATE_MASK);
    }

    /* access modifiers changed from: protected */
    public int getLeftThumbColor(TypedArray typedArray) {
        return typedArray.getColor(C1204R.styleable.CrystalRangeSeekbar_left_thumb_color, ViewCompat.MEASURED_STATE_MASK);
    }

    /* access modifiers changed from: protected */
    public int getLeftThumbColorPressed(TypedArray typedArray) {
        return typedArray.getColor(C1204R.styleable.CrystalRangeSeekbar_left_thumb_color_pressed, -12303292);
    }

    /* access modifiers changed from: protected */
    public Drawable getLeftDrawable(TypedArray typedArray) {
        return typedArray.getDrawable(C1204R.styleable.CrystalRangeSeekbar_left_thumb_image);
    }

    /* access modifiers changed from: protected */
    public Drawable getLeftDrawablePressed(TypedArray typedArray) {
        return typedArray.getDrawable(C1204R.styleable.CrystalRangeSeekbar_left_thumb_image_pressed);
    }

    /* access modifiers changed from: protected */
    public int getDataType(TypedArray typedArray) {
        return typedArray.getInt(C1204R.styleable.CrystalRangeSeekbar_data_type, 2);
    }

    /* access modifiers changed from: protected */
    public final int getPosition(TypedArray typedArray) {
        int i = typedArray.getInt(C1204R.styleable.CrystalRangeSeekbar_position, 0);
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
        paint.setColor(this.barColor);
        paint.setAntiAlias(true);
        drawBar(canvas, paint, rectF);
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
        paint.setColor(this.barHighlightColor);
        drawHighlightBar(canvas, paint, rectF);
    }

    /* access modifiers changed from: protected */
    public void drawHighlightBar(Canvas canvas, Paint paint, RectF rectF) {
        float f = this.cornerRadius;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    /* access modifiers changed from: protected */
    public void setupLeftThumb(Canvas canvas, Paint paint, RectF rectF) {
        this.leftThumbColor = Thumb.MIN.equals(this.pressedThumb) ? this.leftThumbColorPressed : this.leftThumbColorNormal;
        paint.setColor(this.leftThumbColor);
        this.rectLeftThumb.left = normalizedToScreen(this.normalizedMinValue);
        RectF rectF2 = this.rectLeftThumb;
        rectF2.right = Math.min(rectF2.left + (getThumbWidth() / 2.0f) + this.barPadding, (float) getWidth());
        RectF rectF3 = this.rectLeftThumb;
        rectF3.top = 0.0f;
        rectF3.bottom = this.thumbHeight;
        if (this.leftThumb != null) {
            drawLeftThumbWithImage(canvas, paint, this.rectLeftThumb, Thumb.MIN.equals(this.pressedThumb) ? this.leftThumbPressed : this.leftThumb);
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
        if (isInThumbRange(f, this.normalizedMinValue)) {
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
            com.crystal.crystalrangeseekbar.widgets.CrystalSeekbar$Thumb r0 = r4.pressedThumb     // Catch:{ all -> 0x00ff }
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
            com.crystal.crystalrangeseekbar.widgets.CrystalSeekbar$Thumb r0 = r4.evalPressedThumb(r0)     // Catch:{ all -> 0x00ff }
            r4.pressedThumb = r0     // Catch:{ all -> 0x00ff }
            com.crystal.crystalrangeseekbar.widgets.CrystalSeekbar$Thumb r0 = r4.pressedThumb     // Catch:{ all -> 0x00ff }
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
        throw new UnsupportedOperationException("Method not decompiled: com.crystal.crystalrangeseekbar.widgets.CrystalSeekbar.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
