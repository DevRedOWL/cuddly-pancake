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
import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarFinalValueListener;
import com.example.crystalrangeseekbar.C1204R;
import com.github.mikephil.charting.utils.Utils;

public class CrystalRangeSeekbar extends View {
    private static final int INVALID_POINTER_ID = 255;
    private final float NO_FIXED_GAP;
    private final float NO_STEP;
    private Paint _paint;
    private RectF _rect;
    private float absoluteMaxStartValue;
    private float absoluteMaxValue;
    private float absoluteMinStartValue;
    private float absoluteMinValue;
    private int barColor;
    private float barHeight;
    private int barHighlightColor;
    private float barPadding;
    private float cornerRadius;
    private int dataType;
    private float fixGap;
    private float gap;
    private Drawable leftDrawable;
    private Drawable leftDrawablePressed;
    private Bitmap leftThumb;
    private int leftThumbColor;
    private int leftThumbColorNormal;
    private int leftThumbColorPressed;
    private Bitmap leftThumbPressed;
    private int mActivePointerId;
    private boolean mIsDragging;
    private float maxStartValue;
    private float maxValue;
    private float minStartValue;
    private float minValue;
    private double normalizedMaxValue;
    private double normalizedMinValue;
    private OnRangeSeekbarChangeListener onRangeSeekbarChangeListener;
    private OnRangeSeekbarFinalValueListener onRangeSeekbarFinalValueListener;
    private int pointerIndex;
    private Thumb pressedThumb;
    private RectF rectLeftThumb;
    private RectF rectRightThumb;
    private Drawable rightDrawable;
    private Drawable rightDrawablePressed;
    private Bitmap rightThumb;
    private int rightThumbColor;
    private int rightThumbColorNormal;
    private int rightThumbColorPressed;
    private Bitmap rightThumbPressed;
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

    protected enum Thumb {
        MIN,
        MAX
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

    public CrystalRangeSeekbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public CrystalRangeSeekbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public CrystalRangeSeekbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.NO_STEP = -1.0f;
        this.NO_FIXED_GAP = -1.0f;
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
                this.maxStartValue = getMaxStartValue(obtainStyledAttributes);
                this.steps = getSteps(obtainStyledAttributes);
                this.gap = getGap(obtainStyledAttributes);
                this.fixGap = getFixedGap(obtainStyledAttributes);
                this.barColor = getBarColor(obtainStyledAttributes);
                this.barHighlightColor = getBarHighlightColor(obtainStyledAttributes);
                this.leftThumbColorNormal = getLeftThumbColor(obtainStyledAttributes);
                this.rightThumbColorNormal = getRightThumbColor(obtainStyledAttributes);
                this.leftThumbColorPressed = getLeftThumbColorPressed(obtainStyledAttributes);
                this.rightThumbColorPressed = getRightThumbColorPressed(obtainStyledAttributes);
                this.leftDrawable = getLeftDrawable(obtainStyledAttributes);
                this.rightDrawable = getRightDrawable(obtainStyledAttributes);
                this.leftDrawablePressed = getLeftDrawablePressed(obtainStyledAttributes);
                this.rightDrawablePressed = getRightDrawablePressed(obtainStyledAttributes);
                this.dataType = getDataType(obtainStyledAttributes);
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
        this.rightThumbColor = this.rightThumbColorNormal;
        this.leftThumb = getBitmap(this.leftDrawable);
        this.rightThumb = getBitmap(this.rightDrawable);
        this.leftThumbPressed = getBitmap(this.leftDrawablePressed);
        this.rightThumbPressed = getBitmap(this.rightDrawablePressed);
        Bitmap bitmap = this.leftThumbPressed;
        if (bitmap == null) {
            bitmap = this.leftThumb;
        }
        this.leftThumbPressed = bitmap;
        Bitmap bitmap2 = this.rightThumbPressed;
        if (bitmap2 == null) {
            bitmap2 = this.rightThumb;
        }
        this.rightThumbPressed = bitmap2;
        this.gap = Math.max(0.0f, Math.min(this.gap, this.absoluteMaxValue - this.absoluteMinValue));
        float f = this.gap;
        float f2 = this.absoluteMaxValue;
        this.gap = (f / (f2 - this.absoluteMinValue)) * 100.0f;
        float f3 = this.fixGap;
        if (f3 != -1.0f) {
            this.fixGap = Math.min(f3, f2);
            this.fixGap = (this.fixGap / (this.absoluteMaxValue - this.absoluteMinValue)) * 100.0f;
            addFixGap(true);
        }
        this.thumbWidth = getThumbWidth();
        this.thumbHeight = getThumbHeight();
        this.barHeight = getBarHeight();
        this.barPadding = getBarPadding();
        this._paint = new Paint(1);
        this._rect = new RectF();
        this.rectLeftThumb = new RectF();
        this.rectRightThumb = new RectF();
        this.pressedThumb = null;
        setMinStartValue();
        setMaxStartValue();
    }

    public CrystalRangeSeekbar setCornerRadius(float f) {
        this.cornerRadius = f;
        return this;
    }

    public CrystalRangeSeekbar setMinValue(float f) {
        this.minValue = f;
        this.absoluteMinValue = f;
        return this;
    }

    public CrystalRangeSeekbar setMaxValue(float f) {
        this.maxValue = f;
        this.absoluteMaxValue = f;
        return this;
    }

    public CrystalRangeSeekbar setMinStartValue(float f) {
        this.minStartValue = f;
        this.absoluteMinStartValue = f;
        return this;
    }

    public CrystalRangeSeekbar setMaxStartValue(float f) {
        this.maxStartValue = f;
        this.absoluteMaxStartValue = f;
        return this;
    }

    public CrystalRangeSeekbar setSteps(float f) {
        this.steps = f;
        return this;
    }

    public CrystalRangeSeekbar setGap(float f) {
        this.gap = f;
        return this;
    }

    public CrystalRangeSeekbar setFixGap(float f) {
        this.fixGap = f;
        return this;
    }

    public CrystalRangeSeekbar setBarColor(int i) {
        this.barColor = i;
        return this;
    }

    public CrystalRangeSeekbar setBarHighlightColor(int i) {
        this.barHighlightColor = i;
        return this;
    }

    public CrystalRangeSeekbar setLeftThumbColor(int i) {
        this.leftThumbColorNormal = i;
        return this;
    }

    public CrystalRangeSeekbar setLeftThumbHighlightColor(int i) {
        this.leftThumbColorPressed = i;
        return this;
    }

    public CrystalRangeSeekbar setLeftThumbDrawable(int i) {
        setLeftThumbDrawable(ContextCompat.getDrawable(getContext(), i));
        return this;
    }

    public CrystalRangeSeekbar setLeftThumbDrawable(Drawable drawable) {
        setLeftThumbBitmap(getBitmap(drawable));
        return this;
    }

    public CrystalRangeSeekbar setLeftThumbBitmap(Bitmap bitmap) {
        this.leftThumb = bitmap;
        return this;
    }

    public CrystalRangeSeekbar setLeftThumbHighlightDrawable(int i) {
        setLeftThumbHighlightDrawable(ContextCompat.getDrawable(getContext(), i));
        return this;
    }

    public CrystalRangeSeekbar setLeftThumbHighlightDrawable(Drawable drawable) {
        setLeftThumbHighlightBitmap(getBitmap(drawable));
        return this;
    }

    public CrystalRangeSeekbar setLeftThumbHighlightBitmap(Bitmap bitmap) {
        this.leftThumbPressed = bitmap;
        return this;
    }

    public CrystalRangeSeekbar setRightThumbColor(int i) {
        this.rightThumbColorNormal = i;
        return this;
    }

    public CrystalRangeSeekbar setRightThumbHighlightColor(int i) {
        this.rightThumbColorPressed = i;
        return this;
    }

    public CrystalRangeSeekbar setRightThumbDrawable(int i) {
        setRightThumbDrawable(ContextCompat.getDrawable(getContext(), i));
        return this;
    }

    public CrystalRangeSeekbar setRightThumbDrawable(Drawable drawable) {
        setRightThumbBitmap(getBitmap(drawable));
        return this;
    }

    public CrystalRangeSeekbar setRightThumbBitmap(Bitmap bitmap) {
        this.rightThumb = bitmap;
        return this;
    }

    public CrystalRangeSeekbar setRightThumbHighlightDrawable(int i) {
        setRightThumbHighlightDrawable(ContextCompat.getDrawable(getContext(), i));
        return this;
    }

    public CrystalRangeSeekbar setRightThumbHighlightDrawable(Drawable drawable) {
        setRightThumbHighlightBitmap(getBitmap(drawable));
        return this;
    }

    public CrystalRangeSeekbar setRightThumbHighlightBitmap(Bitmap bitmap) {
        this.rightThumbPressed = bitmap;
        return this;
    }

    public CrystalRangeSeekbar setDataType(int i) {
        this.dataType = i;
        return this;
    }

    public void setOnRangeSeekbarChangeListener(OnRangeSeekbarChangeListener onRangeSeekbarChangeListener2) {
        this.onRangeSeekbarChangeListener = onRangeSeekbarChangeListener2;
        OnRangeSeekbarChangeListener onRangeSeekbarChangeListener3 = this.onRangeSeekbarChangeListener;
        if (onRangeSeekbarChangeListener3 != null) {
            onRangeSeekbarChangeListener3.valueChanged(getSelectedMinValue(), getSelectedMaxValue());
        }
    }

    public void setOnRangeSeekbarFinalValueListener(OnRangeSeekbarFinalValueListener onRangeSeekbarFinalValueListener2) {
        this.onRangeSeekbarFinalValueListener = onRangeSeekbarFinalValueListener2;
    }

    public Number getSelectedMinValue() {
        double d = this.normalizedMinValue;
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
        this.normalizedMinValue = Utils.DOUBLE_EPSILON;
        this.normalizedMaxValue = 100.0d;
        this.gap = Math.max(0.0f, Math.min(this.gap, this.absoluteMaxValue - this.absoluteMinValue));
        float f = this.gap;
        float f2 = this.absoluteMaxValue;
        this.gap = (f / (f2 - this.absoluteMinValue)) * 100.0f;
        float f3 = this.fixGap;
        if (f3 != -1.0f) {
            this.fixGap = Math.min(f3, f2);
            this.fixGap = (this.fixGap / (this.absoluteMaxValue - this.absoluteMinValue)) * 100.0f;
            addFixGap(true);
        }
        Bitmap bitmap = this.leftThumb;
        this.thumbWidth = bitmap != null ? (float) bitmap.getWidth() : getResources().getDimension(C1204R.dimen.thumb_width);
        Bitmap bitmap2 = this.rightThumb;
        this.thumbHeight = bitmap2 != null ? (float) bitmap2.getHeight() : getResources().getDimension(C1204R.dimen.thumb_height);
        this.barHeight = this.thumbHeight * 0.5f * 0.3f;
        this.barPadding = this.thumbWidth * 0.5f;
        float f4 = this.minStartValue;
        if (f4 <= this.absoluteMinValue) {
            this.minStartValue = 0.0f;
            setNormalizedMinValue((double) this.minStartValue);
        } else {
            float f5 = this.absoluteMaxValue;
            if (f4 >= f5) {
                this.minStartValue = f5;
                setMinStartValue();
            } else {
                setMinStartValue();
            }
        }
        float f6 = this.maxStartValue;
        if (f6 <= this.absoluteMinStartValue || f6 <= this.absoluteMinValue) {
            this.maxStartValue = 0.0f;
            setNormalizedMaxValue((double) this.maxStartValue);
        } else {
            float f7 = this.absoluteMaxValue;
            if (f6 >= f7) {
                this.maxStartValue = f7;
                setMaxStartValue();
            } else {
                setMaxStartValue();
            }
        }
        invalidate();
        OnRangeSeekbarChangeListener onRangeSeekbarChangeListener2 = this.onRangeSeekbarChangeListener;
        if (onRangeSeekbarChangeListener2 != null) {
            onRangeSeekbarChangeListener2.valueChanged(getSelectedMinValue(), getSelectedMaxValue());
        }
    }

    /* access modifiers changed from: protected */
    public Thumb getPressedThumb() {
        return this.pressedThumb;
    }

    /* access modifiers changed from: protected */
    public float getThumbWidth() {
        Bitmap bitmap = this.leftThumb;
        return bitmap != null ? (float) bitmap.getWidth() : getResources().getDimension(C1204R.dimen.thumb_width);
    }

    /* access modifiers changed from: protected */
    public float getThumbHeight() {
        Bitmap bitmap = this.leftThumb;
        return bitmap != null ? (float) bitmap.getHeight() : getResources().getDimension(C1204R.dimen.thumb_height);
    }

    /* access modifiers changed from: protected */
    public float getBarHeight() {
        return this.thumbHeight * 0.5f * 0.3f;
    }

    /* access modifiers changed from: protected */
    public float getBarPadding() {
        return this.thumbWidth * 0.5f;
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
    public float getMaxStartValue(TypedArray typedArray) {
        return typedArray.getFloat(C1204R.styleable.CrystalRangeSeekbar_max_start_value, this.maxValue);
    }

    /* access modifiers changed from: protected */
    public float getSteps(TypedArray typedArray) {
        return typedArray.getFloat(C1204R.styleable.CrystalRangeSeekbar_steps, -1.0f);
    }

    /* access modifiers changed from: protected */
    public float getGap(TypedArray typedArray) {
        return typedArray.getFloat(C1204R.styleable.CrystalRangeSeekbar_gap, 0.0f);
    }

    /* access modifiers changed from: protected */
    public float getFixedGap(TypedArray typedArray) {
        return typedArray.getFloat(C1204R.styleable.CrystalRangeSeekbar_fix_gap, -1.0f);
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
    public int getRightThumbColor(TypedArray typedArray) {
        return typedArray.getColor(C1204R.styleable.CrystalRangeSeekbar_right_thumb_color, ViewCompat.MEASURED_STATE_MASK);
    }

    /* access modifiers changed from: protected */
    public int getLeftThumbColorPressed(TypedArray typedArray) {
        return typedArray.getColor(C1204R.styleable.CrystalRangeSeekbar_left_thumb_color_pressed, -12303292);
    }

    /* access modifiers changed from: protected */
    public int getRightThumbColorPressed(TypedArray typedArray) {
        return typedArray.getColor(C1204R.styleable.CrystalRangeSeekbar_right_thumb_color_pressed, -12303292);
    }

    /* access modifiers changed from: protected */
    public Drawable getLeftDrawable(TypedArray typedArray) {
        return typedArray.getDrawable(C1204R.styleable.CrystalRangeSeekbar_left_thumb_image);
    }

    /* access modifiers changed from: protected */
    public Drawable getRightDrawable(TypedArray typedArray) {
        return typedArray.getDrawable(C1204R.styleable.CrystalRangeSeekbar_right_thumb_image);
    }

    /* access modifiers changed from: protected */
    public Drawable getLeftDrawablePressed(TypedArray typedArray) {
        return typedArray.getDrawable(C1204R.styleable.CrystalRangeSeekbar_left_thumb_image_pressed);
    }

    /* access modifiers changed from: protected */
    public Drawable getRightDrawablePressed(TypedArray typedArray) {
        return typedArray.getDrawable(C1204R.styleable.CrystalRangeSeekbar_right_thumb_image_pressed);
    }

    /* access modifiers changed from: protected */
    public int getDataType(TypedArray typedArray) {
        return typedArray.getInt(C1204R.styleable.CrystalRangeSeekbar_data_type, 2);
    }

    /* access modifiers changed from: protected */
    public RectF getLeftThumbRect() {
        return this.rectLeftThumb;
    }

    /* access modifiers changed from: protected */
    public RectF getRightThumbRect() {
        return this.rectRightThumb;
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
        rectF.left = normalizedToScreen(this.normalizedMinValue) + (getThumbWidth() / 2.0f);
        rectF.right = normalizedToScreen(this.normalizedMaxValue) + (getThumbWidth() / 2.0f);
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
    public void setupRightThumb(Canvas canvas, Paint paint, RectF rectF) {
        this.rightThumbColor = Thumb.MAX.equals(this.pressedThumb) ? this.rightThumbColorPressed : this.rightThumbColorNormal;
        paint.setColor(this.rightThumbColor);
        this.rectRightThumb.left = normalizedToScreen(this.normalizedMaxValue);
        RectF rectF2 = this.rectRightThumb;
        rectF2.right = Math.min(rectF2.left + (getThumbWidth() / 2.0f) + this.barPadding, (float) getWidth());
        RectF rectF3 = this.rectRightThumb;
        rectF3.top = 0.0f;
        rectF3.bottom = this.thumbHeight;
        if (this.rightThumb != null) {
            drawRightThumbWithImage(canvas, paint, this.rectRightThumb, Thumb.MAX.equals(this.pressedThumb) ? this.rightThumbPressed : this.rightThumb);
        } else {
            drawRightThumbWithColor(canvas, paint, rectF3);
        }
    }

    /* access modifiers changed from: protected */
    public void drawRightThumbWithColor(Canvas canvas, Paint paint, RectF rectF) {
        canvas.drawOval(rectF, paint);
    }

    /* access modifiers changed from: protected */
    public void drawRightThumbWithImage(Canvas canvas, Paint paint, RectF rectF, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, rectF.left, rectF.top, paint);
    }

    /* access modifiers changed from: protected */
    public void trackTouchEvent(MotionEvent motionEvent) {
        try {
            float x = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
            if (Thumb.MIN.equals(this.pressedThumb)) {
                setNormalizedMinValue(screenToNormalized(x));
            } else if (Thumb.MAX.equals(this.pressedThumb)) {
                setNormalizedMaxValue(screenToNormalized(x));
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

    private void setMaxStartValue() {
        float f = this.maxStartValue;
        if (f < this.absoluteMaxValue) {
            float f2 = this.absoluteMinValue;
            if (f > f2 && f > this.absoluteMinStartValue) {
                this.maxStartValue = Math.max(this.absoluteMaxStartValue, f2);
                float f3 = this.maxStartValue;
                float f4 = this.absoluteMinValue;
                this.maxStartValue = f3 - f4;
                this.maxStartValue = (this.maxStartValue / (this.absoluteMaxValue - f4)) * 100.0f;
                setNormalizedMaxValue((double) this.maxStartValue);
            }
        }
    }

    private Thumb evalPressedThumb(float f) {
        boolean isInThumbRange = isInThumbRange(f, this.normalizedMinValue);
        boolean isInThumbRange2 = isInThumbRange(f, this.normalizedMaxValue);
        if (isInThumbRange && isInThumbRange2) {
            return f / ((float) getWidth()) > 0.5f ? Thumb.MIN : Thumb.MAX;
        }
        if (isInThumbRange) {
            return Thumb.MIN;
        }
        if (isInThumbRange2) {
            return Thumb.MAX;
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
        float f = this.fixGap;
        if (f == -1.0f || f <= 0.0f) {
            addMinGap();
        } else {
            addFixGap(true);
        }
        invalidate();
    }

    private void setNormalizedMaxValue(double d) {
        this.normalizedMaxValue = Math.max(Utils.DOUBLE_EPSILON, Math.min(100.0d, Math.max(d, this.normalizedMinValue)));
        float f = this.fixGap;
        if (f == -1.0f || f <= 0.0f) {
            addMaxGap();
        } else {
            addFixGap(false);
        }
        invalidate();
    }

    private void addFixGap(boolean z) {
        if (z) {
            double d = this.normalizedMinValue;
            float f = this.fixGap;
            this.normalizedMaxValue = d + ((double) f);
            if (this.normalizedMaxValue >= 100.0d) {
                this.normalizedMaxValue = 100.0d;
                this.normalizedMinValue = this.normalizedMaxValue - ((double) f);
                return;
            }
            return;
        }
        double d2 = this.normalizedMaxValue;
        float f2 = this.fixGap;
        this.normalizedMinValue = d2 - ((double) f2);
        if (this.normalizedMinValue <= Utils.DOUBLE_EPSILON) {
            this.normalizedMinValue = Utils.DOUBLE_EPSILON;
            this.normalizedMaxValue = this.normalizedMinValue + ((double) f2);
        }
    }

    private void addMinGap() {
        double d = this.normalizedMinValue;
        float f = this.gap;
        if (((double) f) + d > this.normalizedMaxValue) {
            double d2 = ((double) f) + d;
            this.normalizedMaxValue = d2;
            this.normalizedMaxValue = Math.max(Utils.DOUBLE_EPSILON, Math.min(100.0d, Math.max(d2, d)));
            double d3 = this.normalizedMinValue;
            double d4 = this.normalizedMaxValue;
            float f2 = this.gap;
            if (d3 >= d4 - ((double) f2)) {
                this.normalizedMinValue = d4 - ((double) f2);
            }
        }
    }

    private void addMaxGap() {
        double d = this.normalizedMaxValue;
        float f = this.gap;
        if (d - ((double) f) < this.normalizedMinValue) {
            double d2 = d - ((double) f);
            this.normalizedMinValue = d2;
            this.normalizedMinValue = Math.max(Utils.DOUBLE_EPSILON, Math.min(100.0d, Math.min(d2, d)));
            double d3 = this.normalizedMaxValue;
            double d4 = this.normalizedMinValue;
            float f2 = this.gap;
            if (d3 <= ((double) f2) + d4) {
                this.normalizedMaxValue = d4 + ((double) f2);
            }
        }
    }

    private double normalizedToValue(double d) {
        float f = this.maxValue;
        float f2 = this.minValue;
        return ((d / 100.0d) * ((double) (f - f2))) + ((double) f2);
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
            setupRightThumb(canvas, this._paint, this._rect);
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(getMeasureSpecWith(i), getMeasureSpecHeight(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010a, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.isEnabled()     // Catch:{ all -> 0x010b }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            monitor-exit(r4)
            return r1
        L_0x000a:
            int r0 = r5.getAction()     // Catch:{ all -> 0x010b }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 1
            if (r0 == 0) goto L_0x00c2
            if (r0 == r2) goto L_0x0073
            r3 = 2
            if (r0 == r3) goto L_0x0046
            r3 = 3
            if (r0 == r3) goto L_0x0028
            r5 = 5
            if (r0 == r5) goto L_0x0109
            r5 = 6
            if (r0 == r5) goto L_0x0023
            goto L_0x0109
        L_0x0023:
            r4.invalidate()     // Catch:{ all -> 0x010b }
            goto L_0x0109
        L_0x0028:
            boolean r0 = r4.mIsDragging     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x0041
            r4.onStopTrackingTouch()     // Catch:{ all -> 0x010b }
            r4.setPressed(r1)     // Catch:{ all -> 0x010b }
            int r0 = r4.pointerIndex     // Catch:{ all -> 0x010b }
            float r0 = r5.getX(r0)     // Catch:{ all -> 0x010b }
            int r1 = r4.pointerIndex     // Catch:{ all -> 0x010b }
            float r5 = r5.getY(r1)     // Catch:{ all -> 0x010b }
            r4.touchUp(r0, r5)     // Catch:{ all -> 0x010b }
        L_0x0041:
            r4.invalidate()     // Catch:{ all -> 0x010b }
            goto L_0x0109
        L_0x0046:
            com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar$Thumb r0 = r4.pressedThumb     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x0109
            boolean r0 = r4.mIsDragging     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x0060
            int r0 = r4.pointerIndex     // Catch:{ all -> 0x010b }
            float r0 = r5.getX(r0)     // Catch:{ all -> 0x010b }
            int r1 = r4.pointerIndex     // Catch:{ all -> 0x010b }
            float r1 = r5.getY(r1)     // Catch:{ all -> 0x010b }
            r4.touchMove(r0, r1)     // Catch:{ all -> 0x010b }
            r4.trackTouchEvent(r5)     // Catch:{ all -> 0x010b }
        L_0x0060:
            com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener r5 = r4.onRangeSeekbarChangeListener     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x0109
            com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener r5 = r4.onRangeSeekbarChangeListener     // Catch:{ all -> 0x010b }
            java.lang.Number r0 = r4.getSelectedMinValue()     // Catch:{ all -> 0x010b }
            java.lang.Number r1 = r4.getSelectedMaxValue()     // Catch:{ all -> 0x010b }
            r5.valueChanged(r0, r1)     // Catch:{ all -> 0x010b }
            goto L_0x0109
        L_0x0073:
            boolean r0 = r4.mIsDragging     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x00a1
            r4.trackTouchEvent(r5)     // Catch:{ all -> 0x010b }
            r4.onStopTrackingTouch()     // Catch:{ all -> 0x010b }
            r4.setPressed(r1)     // Catch:{ all -> 0x010b }
            int r0 = r4.pointerIndex     // Catch:{ all -> 0x010b }
            float r0 = r5.getX(r0)     // Catch:{ all -> 0x010b }
            int r1 = r4.pointerIndex     // Catch:{ all -> 0x010b }
            float r5 = r5.getY(r1)     // Catch:{ all -> 0x010b }
            r4.touchUp(r0, r5)     // Catch:{ all -> 0x010b }
            com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarFinalValueListener r5 = r4.onRangeSeekbarFinalValueListener     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x00aa
            com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarFinalValueListener r5 = r4.onRangeSeekbarFinalValueListener     // Catch:{ all -> 0x010b }
            java.lang.Number r0 = r4.getSelectedMinValue()     // Catch:{ all -> 0x010b }
            java.lang.Number r1 = r4.getSelectedMaxValue()     // Catch:{ all -> 0x010b }
            r5.finalValue(r0, r1)     // Catch:{ all -> 0x010b }
            goto L_0x00aa
        L_0x00a1:
            r4.onStartTrackingTouch()     // Catch:{ all -> 0x010b }
            r4.trackTouchEvent(r5)     // Catch:{ all -> 0x010b }
            r4.onStopTrackingTouch()     // Catch:{ all -> 0x010b }
        L_0x00aa:
            r5 = 0
            r4.pressedThumb = r5     // Catch:{ all -> 0x010b }
            r4.invalidate()     // Catch:{ all -> 0x010b }
            com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener r5 = r4.onRangeSeekbarChangeListener     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x0109
            com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener r5 = r4.onRangeSeekbarChangeListener     // Catch:{ all -> 0x010b }
            java.lang.Number r0 = r4.getSelectedMinValue()     // Catch:{ all -> 0x010b }
            java.lang.Number r1 = r4.getSelectedMaxValue()     // Catch:{ all -> 0x010b }
            r5.valueChanged(r0, r1)     // Catch:{ all -> 0x010b }
            goto L_0x0109
        L_0x00c2:
            int r0 = r5.getPointerCount()     // Catch:{ all -> 0x010b }
            int r0 = r0 - r2
            int r0 = r5.getPointerId(r0)     // Catch:{ all -> 0x010b }
            r4.mActivePointerId = r0     // Catch:{ all -> 0x010b }
            int r0 = r4.mActivePointerId     // Catch:{ all -> 0x010b }
            int r0 = r5.findPointerIndex(r0)     // Catch:{ all -> 0x010b }
            r4.pointerIndex = r0     // Catch:{ all -> 0x010b }
            int r0 = r4.pointerIndex     // Catch:{ all -> 0x010b }
            float r0 = r5.getX(r0)     // Catch:{ all -> 0x010b }
            com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar$Thumb r0 = r4.evalPressedThumb(r0)     // Catch:{ all -> 0x010b }
            r4.pressedThumb = r0     // Catch:{ all -> 0x010b }
            com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar$Thumb r0 = r4.pressedThumb     // Catch:{ all -> 0x010b }
            if (r0 != 0) goto L_0x00eb
            boolean r5 = super.onTouchEvent(r5)     // Catch:{ all -> 0x010b }
            monitor-exit(r4)
            return r5
        L_0x00eb:
            int r0 = r4.pointerIndex     // Catch:{ all -> 0x010b }
            float r0 = r5.getX(r0)     // Catch:{ all -> 0x010b }
            int r1 = r4.pointerIndex     // Catch:{ all -> 0x010b }
            float r1 = r5.getY(r1)     // Catch:{ all -> 0x010b }
            r4.touchDown(r0, r1)     // Catch:{ all -> 0x010b }
            r4.setPressed(r2)     // Catch:{ all -> 0x010b }
            r4.invalidate()     // Catch:{ all -> 0x010b }
            r4.onStartTrackingTouch()     // Catch:{ all -> 0x010b }
            r4.trackTouchEvent(r5)     // Catch:{ all -> 0x010b }
            r4.attemptClaimDrag()     // Catch:{ all -> 0x010b }
        L_0x0109:
            monitor-exit(r4)
            return r2
        L_0x010b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
