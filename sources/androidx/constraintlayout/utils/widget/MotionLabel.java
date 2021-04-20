package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.constraintlayout.widget.C0185R;
import androidx.core.view.GravityCompat;
import com.google.android.material.badge.BadgeDrawable;

public class MotionLabel extends View implements FloatLayout {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    static String TAG = "MotionLabel";
    private boolean mAutoSize = false;
    private int mAutoSizeTextType = 0;
    float mBackgroundPanX = Float.NaN;
    float mBackgroundPanY = Float.NaN;
    private float mDeltaLeft;
    private float mFloatHeight;
    private float mFloatWidth;
    private String mFontFamily;
    private int mGravity = BadgeDrawable.TOP_START;
    private Layout mLayout;
    boolean mNotBuilt = true;
    Matrix mOutlinePositionMatrix;
    private int mPaddingBottom = 1;
    private int mPaddingLeft = 1;
    private int mPaddingRight = 1;
    private int mPaddingTop = 1;
    TextPaint mPaint = new TextPaint();
    Path mPath = new Path();
    RectF mRect;
    float mRotate = Float.NaN;
    /* access modifiers changed from: private */
    public float mRound = Float.NaN;
    /* access modifiers changed from: private */
    public float mRoundPercent = 0.0f;
    private int mStyleIndex;
    Paint mTempPaint;
    Rect mTempRect;
    private String mText = "Hello World";
    private Drawable mTextBackground;
    private Bitmap mTextBackgroundBitmap;
    private Rect mTextBounds = new Rect();
    private int mTextFillColor = 65535;
    private int mTextOutlineColor = 65535;
    private float mTextOutlineThickness = 0.0f;
    private float mTextPanX = 0.0f;
    private float mTextPanY = 0.0f;
    private BitmapShader mTextShader;
    private Matrix mTextShaderMatrix;
    private float mTextSize = 48.0f;
    private float mTextureHeight = Float.NaN;
    private float mTextureWidth = Float.NaN;
    private CharSequence mTransformed;
    private int mTypefaceIndex;
    private boolean mUseOutline = false;
    ViewOutlineProvider mViewOutlineProvider;
    float mZoom = Float.NaN;
    Paint paintCache = new Paint();
    float paintTextSize;

    public MotionLabel(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setUpTheme(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0185R.styleable.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0185R.styleable.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == C0185R.styleable.MotionLabel_android_fontFamily) {
                    this.mFontFamily = obtainStyledAttributes.getString(index);
                } else if (index == C0185R.styleable.MotionLabel_android_textSize) {
                    this.mTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.mTextSize);
                } else if (index == C0185R.styleable.MotionLabel_android_textStyle) {
                    this.mStyleIndex = obtainStyledAttributes.getInt(index, this.mStyleIndex);
                } else if (index == C0185R.styleable.MotionLabel_android_typeface) {
                    this.mTypefaceIndex = obtainStyledAttributes.getInt(index, this.mTypefaceIndex);
                } else if (index == C0185R.styleable.MotionLabel_android_textColor) {
                    this.mTextFillColor = obtainStyledAttributes.getColor(index, this.mTextFillColor);
                } else if (index == C0185R.styleable.MotionLabel_borderRound) {
                    this.mRound = obtainStyledAttributes.getDimension(index, this.mRound);
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRound(this.mRound);
                    }
                } else if (index == C0185R.styleable.MotionLabel_borderRoundPercent) {
                    this.mRoundPercent = obtainStyledAttributes.getFloat(index, this.mRoundPercent);
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRoundPercent(this.mRoundPercent);
                    }
                } else if (index == C0185R.styleable.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == C0185R.styleable.MotionLabel_android_autoSizeTextType) {
                    this.mAutoSizeTextType = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0185R.styleable.MotionLabel_textOutlineColor) {
                    this.mTextOutlineColor = obtainStyledAttributes.getInt(index, this.mTextOutlineColor);
                    this.mUseOutline = true;
                } else if (index == C0185R.styleable.MotionLabel_textOutlineThickness) {
                    this.mTextOutlineThickness = obtainStyledAttributes.getDimension(index, this.mTextOutlineThickness);
                    this.mUseOutline = true;
                } else if (index == C0185R.styleable.MotionLabel_textBackground) {
                    this.mTextBackground = obtainStyledAttributes.getDrawable(index);
                    this.mUseOutline = true;
                } else if (index == C0185R.styleable.MotionLabel_textBackgroundPanX) {
                    this.mBackgroundPanX = obtainStyledAttributes.getFloat(index, this.mBackgroundPanX);
                } else if (index == C0185R.styleable.MotionLabel_textBackgroundPanY) {
                    this.mBackgroundPanY = obtainStyledAttributes.getFloat(index, this.mBackgroundPanY);
                } else if (index == C0185R.styleable.MotionLabel_textPanX) {
                    this.mTextPanX = obtainStyledAttributes.getFloat(index, this.mTextPanX);
                } else if (index == C0185R.styleable.MotionLabel_textPanY) {
                    this.mTextPanY = obtainStyledAttributes.getFloat(index, this.mTextPanY);
                } else if (index == C0185R.styleable.MotionLabel_textBackgroundRotate) {
                    this.mRotate = obtainStyledAttributes.getFloat(index, this.mRotate);
                } else if (index == C0185R.styleable.MotionLabel_textBackgroundZoom) {
                    this.mZoom = obtainStyledAttributes.getFloat(index, this.mZoom);
                } else if (index == C0185R.styleable.MotionLabel_textureHeight) {
                    this.mTextureHeight = obtainStyledAttributes.getDimension(index, this.mTextureHeight);
                } else if (index == C0185R.styleable.MotionLabel_textureWidth) {
                    this.mTextureWidth = obtainStyledAttributes.getDimension(index, this.mTextureWidth);
                }
            }
            obtainStyledAttributes.recycle();
        }
        setupTexture();
        setupPath();
    }

    private void setupTexture() {
        if (this.mTextBackground != null) {
            this.mTextShaderMatrix = new Matrix();
            int intrinsicWidth = this.mTextBackground.getIntrinsicWidth();
            int intrinsicHeight = this.mTextBackground.getIntrinsicHeight();
            int i = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.mTextureWidth) ? 128 : (int) this.mTextureWidth;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.mTextureHeight)) {
                    i = (int) this.mTextureHeight;
                }
                intrinsicHeight = i;
            }
            this.mTextBackgroundBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.mTextBackgroundBitmap);
            this.mTextBackground.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.mTextBackground.draw(canvas);
            this.mTextShader = new BitmapShader(this.mTextBackgroundBitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        }
    }

    private void adjustTexture(float f, float f2, float f3, float f4) {
        if (this.mTextShaderMatrix != null) {
            this.mFloatWidth = f3 - f;
            this.mFloatHeight = f4 - f2;
            updateShaderMatrix();
        }
    }

    public void setGravity(int i) {
        if ((i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 0) {
            i |= GravityCompat.START;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        int i2 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i3 = 8388615 & this.mGravity;
        if (i != this.mGravity) {
            invalidate();
        }
        this.mGravity = i;
        int i4 = this.mGravity & 112;
        if (i4 == 48) {
            this.mTextPanY = -1.0f;
        } else if (i4 != 80) {
            this.mTextPanY = 0.0f;
        } else {
            this.mTextPanY = 1.0f;
        }
        int i5 = this.mGravity & 7;
        if (i5 == 3) {
            this.mTextPanX = -1.0f;
        } else if (i5 != 5) {
            this.mTextPanX = 0.0f;
        } else {
            this.mTextPanX = 1.0f;
        }
    }

    private float getHorizontalOffset() {
        TextPaint textPaint = this.mPaint;
        String str = this.mText;
        return (((((Float.isNaN(this.mFloatWidth) ? (float) getMeasuredWidth() : this.mFloatWidth) - ((float) getPaddingLeft())) - ((float) getPaddingRight())) - textPaint.measureText(str, 0, str.length())) * (this.mTextPanX + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
        return ((((((Float.isNaN(this.mFloatHeight) ? (float) getMeasuredHeight() : this.mFloatHeight) - ((float) getPaddingTop())) - ((float) getPaddingBottom())) - (fontMetrics.descent - fontMetrics.ascent)) * (1.0f - this.mTextPanY)) / 2.0f) - ((float) ((int) fontMetrics.ascent));
    }

    private void setUpTheme(Context context, AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0185R.attr.colorPrimary, typedValue, true);
        TextPaint textPaint = this.mPaint;
        int i = typedValue.data;
        this.mTextFillColor = i;
        textPaint.setColor(i);
    }

    private void setText(CharSequence charSequence) {
        this.mText = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void setupPath() {
        this.mPaddingLeft = getPaddingLeft();
        this.mPaddingRight = getPaddingRight();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        setTypefaceFromAttrs(this.mFontFamily, this.mTypefaceIndex, this.mStyleIndex);
        this.mPaint.setColor(this.mTextFillColor);
        this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPaint.setFlags(128);
        setTextSize(this.mTextSize);
        this.mPaint.setAntiAlias(true);
    }

    /* access modifiers changed from: package-private */
    public void buildShape() {
        if (this.mUseOutline) {
            this.mPath.reset();
            String str = this.mText;
            int length = str.length();
            this.mPaint.getTextBounds(str, 0, length, this.mTextBounds);
            this.mPaint.getTextPath(str, 0, length, 0.0f, 0.0f, this.mPath);
            Rect rect = this.mTextBounds;
            rect.right--;
            this.mTextBounds.left++;
            this.mTextBounds.bottom++;
            Rect rect2 = this.mTextBounds;
            rect2.top--;
            RectF rectF = new RectF();
            rectF.bottom = (float) getHeight();
            rectF.right = (float) getWidth();
            this.mNotBuilt = false;
        }
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        this.mFloatWidth = (float) (i3 - i);
        this.mFloatHeight = (float) (i4 - i2);
        if (this.mAutoSize) {
            if (this.mTempRect == null) {
                this.mTempPaint = new Paint();
                this.mTempRect = new Rect();
                this.mTempPaint.set(this.mPaint);
                this.paintTextSize = this.mTempPaint.getTextSize();
            }
            Paint paint = this.mTempPaint;
            String str = this.mText;
            paint.getTextBounds(str, 0, str.length(), this.mTempRect);
            int width = this.mTempRect.width();
            int height = (int) (((float) this.mTempRect.height()) * 1.3f);
            float f = (this.mFloatWidth - ((float) this.mPaddingRight)) - ((float) this.mPaddingLeft);
            float f2 = (this.mFloatHeight - ((float) this.mPaddingBottom)) - ((float) this.mPaddingTop);
            float f3 = (float) width;
            float f4 = (float) height;
            if (f3 * f2 > f4 * f) {
                this.mPaint.setTextSize((this.paintTextSize * f) / f3);
            } else {
                this.mPaint.setTextSize((this.paintTextSize * f2) / f4);
            }
        }
        if (this.mUseOutline) {
            adjustTexture((float) i, (float) i2, (float) i3, (float) i4);
            buildShape();
        }
    }

    public void layout(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.mDeltaLeft = f - ((float) i);
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.mFloatWidth = f5;
        float f6 = f4 - f2;
        this.mFloatHeight = f6;
        adjustTexture(f, f2, f3, f4);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i6, BasicMeasure.EXACTLY));
            super.layout(i, i5, i2, i4);
        }
        if (this.mAutoSize) {
            if (this.mTempRect == null) {
                this.mTempPaint = new Paint();
                this.mTempRect = new Rect();
                this.mTempPaint.set(this.mPaint);
                this.paintTextSize = this.mTempPaint.getTextSize();
            }
            this.mFloatWidth = f5;
            this.mFloatHeight = f6;
            Paint paint = this.mTempPaint;
            String str = this.mText;
            paint.getTextBounds(str, 0, str.length(), this.mTempRect);
            int width = this.mTempRect.width();
            float height = ((float) this.mTempRect.height()) * 1.3f;
            float f7 = (f5 - ((float) this.mPaddingRight)) - ((float) this.mPaddingLeft);
            float f8 = (f6 - ((float) this.mPaddingBottom)) - ((float) this.mPaddingTop);
            float f9 = (float) width;
            if (f9 * f8 > height * f7) {
                this.mPaint.setTextSize((this.paintTextSize * f7) / f9);
            } else {
                this.mPaint.setTextSize((this.paintTextSize * f8) / height);
            }
            if (this.mUseOutline) {
                buildShape();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mUseOutline) {
            float horizontalOffset = ((float) this.mPaddingLeft) + getHorizontalOffset();
            canvas.drawText(this.mText, this.mDeltaLeft + horizontalOffset, ((float) this.mPaddingTop) + getVerticalOffset(), this.mPaint);
            return;
        }
        if (this.mNotBuilt) {
            buildShape();
        }
        if (this.mUseOutline) {
            if (this.mOutlinePositionMatrix == null) {
                this.mOutlinePositionMatrix = new Matrix();
            }
            this.paintCache.set(this.mPaint);
            this.mOutlinePositionMatrix.reset();
            float horizontalOffset2 = ((float) this.mPaddingLeft) + getHorizontalOffset();
            float verticalOffset = ((float) this.mPaddingTop) + getVerticalOffset();
            this.mOutlinePositionMatrix.postTranslate(horizontalOffset2, verticalOffset);
            this.mPath.transform(this.mOutlinePositionMatrix);
            BitmapShader bitmapShader = this.mTextShader;
            if (bitmapShader != null) {
                this.mPaint.setShader(bitmapShader);
            } else {
                this.mPaint.setColor(this.mTextFillColor);
            }
            this.mPaint.setStyle(Paint.Style.FILL);
            this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
            canvas.drawPath(this.mPath, this.mPaint);
            if (this.mTextShader != null) {
                this.mPaint.setShader((Shader) null);
            }
            this.mPaint.setColor(this.mTextOutlineColor);
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
            canvas.drawPath(this.mPath, this.mPaint);
            this.mOutlinePositionMatrix.reset();
            this.mOutlinePositionMatrix.postTranslate(-horizontalOffset2, -verticalOffset);
            this.mPath.transform(this.mOutlinePositionMatrix);
            this.mPaint.set(this.paintCache);
            return;
        }
        float horizontalOffset3 = ((float) this.mPaddingLeft) + getHorizontalOffset();
        float verticalOffset2 = ((float) this.mPaddingTop) + getVerticalOffset();
        this.mOutlinePositionMatrix.reset();
        this.mOutlinePositionMatrix.preTranslate(horizontalOffset3, verticalOffset2);
        this.mPath.transform(this.mOutlinePositionMatrix);
        this.mPaint.setColor(this.mTextFillColor);
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
        canvas.drawPath(this.mPath, this.mPaint);
        this.mOutlinePositionMatrix.reset();
        this.mOutlinePositionMatrix.preTranslate(-horizontalOffset3, -verticalOffset2);
        this.mPath.transform(this.mOutlinePositionMatrix);
    }

    public void setTextOutlineThickness(float f) {
        this.mTextOutlineThickness = f;
        this.mUseOutline = true;
        if (Float.isNaN(this.mTextOutlineThickness)) {
            this.mTextOutlineThickness = 1.0f;
            this.mUseOutline = false;
        }
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.mTextFillColor = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.mTextOutlineColor = i;
        this.mUseOutline = true;
        invalidate();
    }

    private void setTypefaceFromAttrs(String str, int i, int i2) {
        Typeface typeface;
        Typeface typeface2;
        if (str != null) {
            typeface = Typeface.create(str, i2);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z = true;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else if (i == 3) {
            typeface = Typeface.MONOSPACE;
        }
        float f = 0.0f;
        if (i2 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i2);
            } else {
                typeface2 = Typeface.create(typeface, i2);
            }
            setTypeface(typeface2);
            int i3 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i2;
            TextPaint textPaint = this.mPaint;
            if ((i3 & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.mPaint;
            if ((i3 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.mPaint.setFakeBoldText(false);
        this.mPaint.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    private void setTypeface(Typeface typeface) {
        if (this.mPaint.getTypeface() != typeface) {
            this.mPaint.setTypeface(typeface);
            if (this.mLayout != null) {
                this.mLayout = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public Typeface getTypeface() {
        return this.mPaint.getTypeface();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.mAutoSize = false;
        this.mPaddingLeft = getPaddingLeft();
        this.mPaddingRight = getPaddingRight();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.mPaint;
            String str = this.mText;
            textPaint.getTextBounds(str, 0, str.length(), this.mTextBounds);
            if (mode != 1073741824) {
                size = (int) (((float) this.mTextBounds.width()) + 0.99999f);
            }
            size += this.mPaddingLeft + this.mPaddingRight;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (((float) this.mPaint.getFontMetricsInt((Paint.FontMetricsInt) null)) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.mPaddingTop + this.mPaddingBottom + fontMetricsInt;
            }
        } else if (this.mAutoSizeTextType != 0) {
            this.mAutoSize = true;
        }
        setMeasuredDimension(size, size2);
    }

    public void setRoundPercent(float f) {
        boolean z = this.mRoundPercent != f;
        this.mRoundPercent = f;
        if (this.mRoundPercent != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.mViewOutlineProvider == null) {
                    this.mViewOutlineProvider = new ViewOutlineProvider() {
                        public void getOutline(View view, Outline outline) {
                            int width = MotionLabel.this.getWidth();
                            int height = MotionLabel.this.getHeight();
                            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionLabel.this.mRoundPercent) / 2.0f);
                        }
                    };
                    setOutlineProvider(this.mViewOutlineProvider);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.mRoundPercent) / 2.0f;
            this.mRect.set(0.0f, 0.0f, (float) width, (float) height);
            this.mPath.reset();
            this.mPath.addRoundRect(this.mRect, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.mRound = f;
            float f2 = this.mRoundPercent;
            this.mRoundPercent = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.mRound != f;
        this.mRound = f;
        if (this.mRound != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.mViewOutlineProvider == null) {
                    this.mViewOutlineProvider = new ViewOutlineProvider() {
                        public void getOutline(View view, Outline outline) {
                            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.mRound);
                        }
                    };
                    setOutlineProvider(this.mViewOutlineProvider);
                }
                setClipToOutline(true);
            }
            this.mRect.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.mPath.reset();
            Path path = this.mPath;
            RectF rectF = this.mRect;
            float f3 = this.mRound;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public float getRoundPercent() {
        return this.mRoundPercent;
    }

    public float getRound() {
        return this.mRound;
    }

    public void setTextSize(float f) {
        this.mTextSize = f;
        this.mPaint.setTextSize(f);
        buildShape();
        requestLayout();
        invalidate();
    }

    public int getTextOutlineColor() {
        return this.mTextOutlineColor;
    }

    public float getTextBackgroundPanX() {
        return this.mBackgroundPanX;
    }

    public float getTextBackgroundPanY() {
        return this.mBackgroundPanY;
    }

    public float getTextBackgroundZoom() {
        return this.mZoom;
    }

    public float getTextBackgroundRotate() {
        return this.mRotate;
    }

    public void setTextBackgroundPanX(float f) {
        this.mBackgroundPanX = f;
        String str = TAG;
        Log.v(str, Debug.getLoc() + " " + Debug.getName(this) + " " + f);
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.mBackgroundPanY = f;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.mZoom = f;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.mRotate = f;
        updateShaderMatrix();
        invalidate();
    }

    private void updateShaderMatrix() {
        float f = 0.0f;
        float f2 = Float.isNaN(this.mBackgroundPanX) ? 0.0f : this.mBackgroundPanX;
        float f3 = Float.isNaN(this.mBackgroundPanY) ? 0.0f : this.mBackgroundPanY;
        float f4 = Float.isNaN(this.mZoom) ? 1.0f : this.mZoom;
        if (!Float.isNaN(this.mRotate)) {
            f = this.mRotate;
        }
        this.mTextShaderMatrix.reset();
        float width = (float) this.mTextBackgroundBitmap.getWidth();
        float height = (float) this.mTextBackgroundBitmap.getHeight();
        float f5 = Float.isNaN(this.mTextureWidth) ? this.mFloatWidth : this.mTextureWidth;
        float f6 = Float.isNaN(this.mTextureHeight) ? this.mFloatHeight : this.mTextureHeight;
        float f7 = f4 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.mTextShaderMatrix.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.mTextureHeight)) {
            f11 = this.mTextureHeight / 2.0f;
        }
        float f12 = ((((!Float.isNaN(this.mTextureWidth) ? this.mTextureWidth / 2.0f : f9) * f2) + f5) - f8) * 0.5f;
        String str = TAG;
        Log.v(str, Debug.getLoc() + " " + Debug.getName(this) + "( " + f2 + " * (" + f9 + ") ");
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append(Debug.getLoc());
        sb.append(" ");
        sb.append(Debug.getName(this));
        sb.append(" tx = ");
        sb.append(f12);
        Log.v(str2, sb.toString());
        this.mTextShaderMatrix.postTranslate(f12, (((f3 * f11) + f6) - f10) * 0.5f);
        this.mTextShaderMatrix.postRotate(f, f5 / 2.0f, f6 / 2.0f);
        this.mTextShader.setLocalMatrix(this.mTextShaderMatrix);
    }

    public float getTextPanX() {
        return this.mTextPanX;
    }

    public void setTextPanX(float f) {
        this.mTextPanX = f;
        invalidate();
    }

    public float getTextPanY() {
        return this.mTextPanY;
    }

    public void setTextPanY(float f) {
        this.mTextPanY = f;
        invalidate();
    }

    public float getTextureHeight() {
        return this.mTextureHeight;
    }

    public void setTextureHeight(float f) {
        this.mTextureHeight = f;
        updateShaderMatrix();
        invalidate();
    }

    public float getTextureWidth() {
        return this.mTextureWidth;
    }

    public void setTextureWidth(float f) {
        this.mTextureWidth = f;
        updateShaderMatrix();
        invalidate();
    }
}
