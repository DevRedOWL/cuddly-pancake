package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.appcompat.widget.AppCompatImageView;
import p035ru.unicorn.C5619R;

/* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView */
public class TouchImageView extends AppCompatImageView {
    public static final float AUTOMATIC_MIN_ZOOM = -1.0f;
    private static final String DEBUG = "DEBUG";
    private static final int DEFAULT_ZOOM_TIME = 500;
    private static final float SUPER_MAX_MULTIPLIER = 1.25f;
    private static final float SUPER_MIN_MULTIPLIER = 0.75f;
    private ZoomVariables delayedZoomVariables;
    /* access modifiers changed from: private */
    public GestureDetector.OnDoubleTapListener doubleTapListener;
    /* access modifiers changed from: private */
    public float doubleTapScale;
    /* access modifiers changed from: private */
    public Fling fling;
    private boolean imageRenderedAtLeastOnce;
    /* access modifiers changed from: private */
    public boolean isRotateImageToFitScreen;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float[] f6900m;
    /* access modifiers changed from: private */
    public GestureDetector mGestureDetector;
    /* access modifiers changed from: private */
    public ScaleGestureDetector mScaleDetector;
    private ImageView.ScaleType mScaleType;
    private float matchViewHeight;
    private float matchViewWidth;
    /* access modifiers changed from: private */
    public Matrix matrix;
    /* access modifiers changed from: private */
    public float maxScale;
    private boolean maxScaleIsSetByMultiplier;
    private float maxScaleMultiplier;
    /* access modifiers changed from: private */
    public float minScale;
    /* access modifiers changed from: private */
    public float normalizedScale;
    private boolean onDrawReady;
    private int orientation;
    private FixedPixel orientationChangeFixedPixel;
    private boolean orientationJustChanged;
    private float prevMatchViewHeight;
    private float prevMatchViewWidth;
    private Matrix prevMatrix;
    private int prevViewHeight;
    private int prevViewWidth;
    /* access modifiers changed from: private */
    public State state;
    private float superMaxScale;
    private float superMinScale;
    /* access modifiers changed from: private */
    public OnTouchImageViewListener touchImageViewListener;
    private float userSpecifiedMinScale;
    /* access modifiers changed from: private */
    public View.OnTouchListener userTouchListener;
    /* access modifiers changed from: private */
    public int viewHeight;
    private FixedPixel viewSizeChangeFixedPixel;
    /* access modifiers changed from: private */
    public int viewWidth;
    private boolean zoomEnabled;

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$FixedPixel */
    public enum FixedPixel {
        CENTER,
        TOP_LEFT,
        BOTTOM_RIGHT
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$OnTouchImageViewListener */
    public interface OnTouchImageViewListener {
        void onMove();
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$OnZoomFinishedListener */
    public interface OnZoomFinishedListener {
        void onZoomFinished();
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$State */
    private enum State {
        NONE,
        DRAG,
        ZOOM,
        FLING,
        ANIMATE_ZOOM
    }

    /* access modifiers changed from: private */
    public float getFixDragTrans(float f, float f2, float f3) {
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    private float getFixTrans(float f, float f2, float f3, float f4) {
        float f5;
        if (f3 <= f2) {
            float f6 = f4;
            f4 = (f2 + f4) - f3;
            f5 = f6;
        } else {
            f5 = (f2 + f4) - f3;
        }
        if (f < f5) {
            return (-f) + f5;
        }
        if (f > f4) {
            return (-f) + f4;
        }
        return 0.0f;
    }

    public TouchImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.orientationChangeFixedPixel = FixedPixel.CENTER;
        this.viewSizeChangeFixedPixel = FixedPixel.CENTER;
        this.orientationJustChanged = false;
        this.maxScaleIsSetByMultiplier = false;
        this.doubleTapListener = null;
        this.userTouchListener = null;
        this.touchImageViewListener = null;
        configureImageView(context, attributeSet, i);
    }

    private void configureImageView(Context context, AttributeSet attributeSet, int i) {
        super.setClickable(true);
        this.orientation = getResources().getConfiguration().orientation;
        this.mScaleDetector = new ScaleGestureDetector(context, new ScaleListener(this, (C59661) null));
        this.mGestureDetector = new GestureDetector(context, new GestureListener(this, (C59661) null));
        setMinZoom(-1.0f);
        this.matrix = new Matrix();
        this.prevMatrix = new Matrix();
        this.f6900m = new float[9];
        this.normalizedScale = 1.0f;
        if (this.mScaleType == null) {
            this.mScaleType = ImageView.ScaleType.FIT_CENTER;
        }
        this.minScale = 1.0f;
        this.maxScale = 3.0f;
        this.superMinScale = this.minScale * 0.75f;
        this.superMaxScale = this.maxScale * SUPER_MAX_MULTIPLIER;
        setImageMatrix(this.matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        setState(State.NONE);
        this.onDrawReady = false;
        super.setOnTouchListener(new PrivateOnTouchListener(this, (C59661) null));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C5619R.styleable.TouchImageView, i, 0);
        try {
            if (!isInEditMode()) {
                setZoomEnabled(obtainStyledAttributes.getBoolean(0, true));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setRotateImageToFitScreen(boolean z) {
        this.isRotateImageToFitScreen = z;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.userTouchListener = onTouchListener;
    }

    public void setOnTouchImageViewListener(OnTouchImageViewListener onTouchImageViewListener) {
        this.touchImageViewListener = onTouchImageViewListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.doubleTapListener = onDoubleTapListener;
    }

    public boolean isZoomEnabled() {
        return this.zoomEnabled;
    }

    public void setZoomEnabled(boolean z) {
        this.zoomEnabled = z;
    }

    public void setImageResource(int i) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageResource(i);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageBitmap(bitmap);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setImageDrawable(Drawable drawable) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageDrawable(drawable);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setImageURI(Uri uri) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageURI(uri);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(ImageView.ScaleType.MATRIX);
            return;
        }
        this.mScaleType = scaleType;
        if (this.onDrawReady) {
            setZoom(this);
        }
    }

    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public FixedPixel getOrientationChangeFixedPixel() {
        return this.orientationChangeFixedPixel;
    }

    public void setOrientationChangeFixedPixel(FixedPixel fixedPixel) {
        this.orientationChangeFixedPixel = fixedPixel;
    }

    public FixedPixel getViewSizeChangeFixedPixel() {
        return this.viewSizeChangeFixedPixel;
    }

    public void setViewSizeChangeFixedPixel(FixedPixel fixedPixel) {
        this.viewSizeChangeFixedPixel = fixedPixel;
    }

    public boolean isZoomed() {
        return this.normalizedScale != 1.0f;
    }

    public RectF getZoomedRect() {
        if (this.mScaleType != ImageView.ScaleType.FIT_XY) {
            PointF transformCoordTouchToBitmap = transformCoordTouchToBitmap(0.0f, 0.0f, true);
            PointF transformCoordTouchToBitmap2 = transformCoordTouchToBitmap((float) this.viewWidth, (float) this.viewHeight, true);
            float drawableWidth = (float) getDrawableWidth(getDrawable());
            float drawableHeight = (float) getDrawableHeight(getDrawable());
            return new RectF(transformCoordTouchToBitmap.x / drawableWidth, transformCoordTouchToBitmap.y / drawableHeight, transformCoordTouchToBitmap2.x / drawableWidth, transformCoordTouchToBitmap2.y / drawableHeight);
        }
        throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
    }

    public void savePreviousImageValues() {
        Matrix matrix2 = this.matrix;
        if (matrix2 != null && this.viewHeight != 0 && this.viewWidth != 0) {
            matrix2.getValues(this.f6900m);
            this.prevMatrix.setValues(this.f6900m);
            this.prevMatchViewHeight = this.matchViewHeight;
            this.prevMatchViewWidth = this.matchViewWidth;
            this.prevViewHeight = this.viewHeight;
            this.prevViewWidth = this.viewWidth;
        }
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("orientation", this.orientation);
        bundle.putFloat("saveScale", this.normalizedScale);
        bundle.putFloat("matchViewHeight", this.matchViewHeight);
        bundle.putFloat("matchViewWidth", this.matchViewWidth);
        bundle.putInt("viewWidth", this.viewWidth);
        bundle.putInt("viewHeight", this.viewHeight);
        this.matrix.getValues(this.f6900m);
        bundle.putFloatArray("matrix", this.f6900m);
        bundle.putBoolean("imageRendered", this.imageRenderedAtLeastOnce);
        bundle.putSerializable("viewSizeChangeFixedPixel", this.viewSizeChangeFixedPixel);
        bundle.putSerializable("orientationChangeFixedPixel", this.orientationChangeFixedPixel);
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.normalizedScale = bundle.getFloat("saveScale");
            this.f6900m = bundle.getFloatArray("matrix");
            this.prevMatrix.setValues(this.f6900m);
            this.prevMatchViewHeight = bundle.getFloat("matchViewHeight");
            this.prevMatchViewWidth = bundle.getFloat("matchViewWidth");
            this.prevViewHeight = bundle.getInt("viewHeight");
            this.prevViewWidth = bundle.getInt("viewWidth");
            this.imageRenderedAtLeastOnce = bundle.getBoolean("imageRendered");
            this.viewSizeChangeFixedPixel = (FixedPixel) bundle.getSerializable("viewSizeChangeFixedPixel");
            this.orientationChangeFixedPixel = (FixedPixel) bundle.getSerializable("orientationChangeFixedPixel");
            if (this.orientation != bundle.getInt("orientation")) {
                this.orientationJustChanged = true;
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.onDrawReady = true;
        this.imageRenderedAtLeastOnce = true;
        ZoomVariables zoomVariables = this.delayedZoomVariables;
        if (zoomVariables != null) {
            setZoom(zoomVariables.scale, this.delayedZoomVariables.focusX, this.delayedZoomVariables.focusY, this.delayedZoomVariables.scaleType);
            this.delayedZoomVariables = null;
        }
        super.onDraw(canvas);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = getResources().getConfiguration().orientation;
        if (i != this.orientation) {
            this.orientationJustChanged = true;
            this.orientation = i;
        }
        savePreviousImageValues();
    }

    public float getMaxZoom() {
        return this.maxScale;
    }

    public void setMaxZoom(float f) {
        this.maxScale = f;
        this.superMaxScale = this.maxScale * SUPER_MAX_MULTIPLIER;
        this.maxScaleIsSetByMultiplier = false;
    }

    public float getDoubleTapScale() {
        return this.doubleTapScale;
    }

    public void setDoubleTapScale(float f) {
        this.doubleTapScale = f;
    }

    public void setMaxZoomRatio(float f) {
        this.maxScaleMultiplier = f;
        this.maxScale = this.minScale * this.maxScaleMultiplier;
        this.superMaxScale = this.maxScale * SUPER_MAX_MULTIPLIER;
        this.maxScaleIsSetByMultiplier = true;
    }

    public float getMinZoom() {
        return this.minScale;
    }

    public float getCurrentZoom() {
        return this.normalizedScale;
    }

    public void setMinZoom(float f) {
        this.userSpecifiedMinScale = f;
        if (f != -1.0f) {
            this.minScale = this.userSpecifiedMinScale;
        } else if (this.mScaleType == ImageView.ScaleType.CENTER || this.mScaleType == ImageView.ScaleType.CENTER_CROP) {
            Drawable drawable = getDrawable();
            int drawableWidth = getDrawableWidth(drawable);
            int drawableHeight = getDrawableHeight(drawable);
            if (drawable != null && drawableWidth > 0 && drawableHeight > 0) {
                float f2 = ((float) this.viewWidth) / ((float) drawableWidth);
                float f3 = ((float) this.viewHeight) / ((float) drawableHeight);
                if (this.mScaleType == ImageView.ScaleType.CENTER) {
                    this.minScale = Math.min(f2, f3);
                } else {
                    this.minScale = Math.min(f2, f3) / Math.max(f2, f3);
                }
            }
        } else {
            this.minScale = 1.0f;
        }
        if (this.maxScaleIsSetByMultiplier) {
            setMaxZoomRatio(this.maxScaleMultiplier);
        }
        this.superMinScale = this.minScale * 0.75f;
    }

    public void resetZoom() {
        this.normalizedScale = 1.0f;
        fitImageToView();
    }

    public void resetZoomAnimated() {
        setZoomAnimated(1.0f, 0.5f, 0.5f);
    }

    public void setZoom(float f) {
        setZoom(f, 0.5f, 0.5f);
    }

    public void setZoom(float f, float f2, float f3) {
        setZoom(f, f2, f3, this.mScaleType);
    }

    public void setZoom(float f, float f2, float f3, ImageView.ScaleType scaleType) {
        if (!this.onDrawReady) {
            this.delayedZoomVariables = new ZoomVariables(f, f2, f3, scaleType);
            return;
        }
        if (this.userSpecifiedMinScale == -1.0f) {
            setMinZoom(-1.0f);
            float f4 = this.normalizedScale;
            float f5 = this.minScale;
            if (f4 < f5) {
                this.normalizedScale = f5;
            }
        }
        if (scaleType != this.mScaleType) {
            setScaleType(scaleType);
        }
        resetZoom();
        scaleImage((double) f, (float) (this.viewWidth / 2), (float) (this.viewHeight / 2), true);
        this.matrix.getValues(this.f6900m);
        this.f6900m[2] = -((f2 * getImageWidth()) - (((float) this.viewWidth) * 0.5f));
        this.f6900m[5] = -((f3 * getImageHeight()) - (((float) this.viewHeight) * 0.5f));
        this.matrix.setValues(this.f6900m);
        fixTrans();
        savePreviousImageValues();
        setImageMatrix(this.matrix);
    }

    public void setZoom(TouchImageView touchImageView) {
        PointF scrollPosition = touchImageView.getScrollPosition();
        setZoom(touchImageView.getCurrentZoom(), scrollPosition.x, scrollPosition.y, touchImageView.getScaleType());
    }

    public PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return new PointF(0.5f, 0.5f);
        }
        int drawableWidth = getDrawableWidth(drawable);
        int drawableHeight = getDrawableHeight(drawable);
        PointF transformCoordTouchToBitmap = transformCoordTouchToBitmap((float) (this.viewWidth / 2), (float) (this.viewHeight / 2), true);
        transformCoordTouchToBitmap.x /= (float) drawableWidth;
        transformCoordTouchToBitmap.y /= (float) drawableHeight;
        return transformCoordTouchToBitmap;
    }

    /* access modifiers changed from: private */
    public boolean orientationMismatch(Drawable drawable) {
        return (this.viewWidth > this.viewHeight) != (drawable.getIntrinsicWidth() > drawable.getIntrinsicHeight());
    }

    private int getDrawableWidth(Drawable drawable) {
        if (!orientationMismatch(drawable) || !this.isRotateImageToFitScreen) {
            return drawable.getIntrinsicWidth();
        }
        return drawable.getIntrinsicHeight();
    }

    private int getDrawableHeight(Drawable drawable) {
        if (!orientationMismatch(drawable) || !this.isRotateImageToFitScreen) {
            return drawable.getIntrinsicHeight();
        }
        return drawable.getIntrinsicWidth();
    }

    public void setScrollPosition(float f, float f2) {
        setZoom(this.normalizedScale, f, f2);
    }

    /* access modifiers changed from: private */
    public void fixTrans() {
        this.matrix.getValues(this.f6900m);
        float[] fArr = this.f6900m;
        this.matrix.postTranslate(getFixTrans(fArr[2], (float) this.viewWidth, getImageWidth(), (!this.isRotateImageToFitScreen || !orientationMismatch(getDrawable())) ? 0.0f : getImageWidth()), getFixTrans(fArr[5], (float) this.viewHeight, getImageHeight(), 0.0f));
    }

    /* access modifiers changed from: private */
    public void fixScaleTrans() {
        fixTrans();
        this.matrix.getValues(this.f6900m);
        float imageWidth = getImageWidth();
        int i = this.viewWidth;
        if (imageWidth < ((float) i)) {
            float imageWidth2 = (((float) i) - getImageWidth()) / 2.0f;
            if (this.isRotateImageToFitScreen && orientationMismatch(getDrawable())) {
                imageWidth2 += getImageWidth();
            }
            this.f6900m[2] = imageWidth2;
        }
        float imageHeight = getImageHeight();
        int i2 = this.viewHeight;
        if (imageHeight < ((float) i2)) {
            this.f6900m[5] = (((float) i2) - getImageHeight()) / 2.0f;
        }
        this.matrix.setValues(this.f6900m);
    }

    /* access modifiers changed from: private */
    public float getImageWidth() {
        return this.matchViewWidth * this.normalizedScale;
    }

    /* access modifiers changed from: private */
    public float getImageHeight() {
        return this.matchViewHeight * this.normalizedScale;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int drawableWidth = getDrawableWidth(drawable);
        int drawableHeight = getDrawableHeight(drawable);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int viewSize = setViewSize(mode, size, drawableWidth);
        int viewSize2 = setViewSize(mode2, size2, drawableHeight);
        if (!this.orientationJustChanged) {
            savePreviousImageValues();
        }
        setMeasuredDimension((viewSize - getPaddingLeft()) - getPaddingRight(), (viewSize2 - getPaddingTop()) - getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.viewWidth = i;
        this.viewHeight = i2;
        fitImageToView();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r3 = java.lang.Math.min(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r8 = r15.viewWidth;
        r11 = ((float) r8) - (r3 * r4);
        r12 = r15.viewHeight;
        r13 = ((float) r12) - (r5 * r6);
        r15.matchViewWidth = ((float) r8) - r11;
        r15.matchViewHeight = ((float) r12) - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        if (isZoomed() != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        if (r15.imageRenderedAtLeastOnce != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        if (r15.isRotateImageToFitScreen == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        if (orientationMismatch(r2) == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        r15.matrix.setRotate(90.0f);
        r15.matrix.postTranslate(r4, 0.0f);
        r15.matrix.postScale(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        r15.matrix.setScale(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ba, code lost:
        r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.C59661.$SwitchMap$android$widget$ImageView$ScaleType[r15.mScaleType.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c4, code lost:
        if (r0 == 5) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c7, code lost:
        if (r0 == 6) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
        r15.matrix.postTranslate(r11 / 2.0f, r13 / 2.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d3, code lost:
        r15.matrix.postTranslate(r11, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        r15.matrix.postTranslate(0.0f, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00de, code lost:
        r15.normalizedScale = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e6, code lost:
        if (r15.prevMatchViewWidth == 0.0f) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ec, code lost:
        if (r15.prevMatchViewHeight != 0.0f) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ee, code lost:
        savePreviousImageValues();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f1, code lost:
        r15.prevMatrix.getValues(r15.f6900m);
        r2 = r15.f6900m;
        r3 = r15.matchViewWidth / r4;
        r4 = r15.normalizedScale;
        r2[0] = r3 * r4;
        r2[4] = (r15.matchViewHeight / r6) * r4;
        r3 = r2[2];
        r11 = r2[5];
        r8 = r0;
        r15.f6900m[2] = newTranslationAfterChange(r3, r4 * r15.prevMatchViewWidth, getImageWidth(), r15.prevViewWidth, r15.viewWidth, r7, r8);
        r15.f6900m[5] = newTranslationAfterChange(r11, r15.prevMatchViewHeight * r15.normalizedScale, getImageHeight(), r15.prevViewHeight, r15.viewHeight, r9, r8);
        r15.matrix.setValues(r15.f6900m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014b, code lost:
        fixTrans();
        setImageMatrix(r15.matrix);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void fitImageToView() {
        /*
            r15 = this;
            boolean r0 = r15.orientationJustChanged
            if (r0 == 0) goto L_0x0007
            ru.unicorn.ujin.view.customViews.TouchImageView$FixedPixel r0 = r15.orientationChangeFixedPixel
            goto L_0x0009
        L_0x0007:
            ru.unicorn.ujin.view.customViews.TouchImageView$FixedPixel r0 = r15.viewSizeChangeFixedPixel
        L_0x0009:
            r1 = 0
            r15.orientationJustChanged = r1
            android.graphics.drawable.Drawable r2 = r15.getDrawable()
            if (r2 == 0) goto L_0x0153
            int r3 = r2.getIntrinsicWidth()
            if (r3 == 0) goto L_0x0153
            int r3 = r2.getIntrinsicHeight()
            if (r3 != 0) goto L_0x0020
            goto L_0x0153
        L_0x0020:
            android.graphics.Matrix r3 = r15.matrix
            if (r3 == 0) goto L_0x0153
            android.graphics.Matrix r3 = r15.prevMatrix
            if (r3 != 0) goto L_0x002a
            goto L_0x0153
        L_0x002a:
            float r3 = r15.userSpecifiedMinScale
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x003f
            r15.setMinZoom(r4)
            float r3 = r15.normalizedScale
            float r4 = r15.minScale
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x003f
            r15.normalizedScale = r4
        L_0x003f:
            int r7 = r15.getDrawableWidth(r2)
            int r9 = r15.getDrawableHeight(r2)
            int r3 = r15.viewWidth
            float r3 = (float) r3
            float r4 = (float) r7
            float r3 = r3 / r4
            int r5 = r15.viewHeight
            float r5 = (float) r5
            float r6 = (float) r9
            float r5 = r5 / r6
            int[] r8 = p035ru.unicorn.ujin.view.customViews.TouchImageView.C59661.$SwitchMap$android$widget$ImageView$ScaleType
            android.widget.ImageView$ScaleType r10 = r15.mScaleType
            int r10 = r10.ordinal()
            r8 = r8[r10]
            r10 = 1065353216(0x3f800000, float:1.0)
            switch(r8) {
                case 1: goto L_0x0075;
                case 2: goto L_0x0070;
                case 3: goto L_0x0061;
                case 4: goto L_0x006a;
                case 5: goto L_0x006a;
                case 6: goto L_0x006a;
                case 7: goto L_0x0079;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0079
        L_0x0061:
            float r3 = java.lang.Math.min(r3, r5)
            float r3 = java.lang.Math.min(r10, r3)
            r5 = r3
        L_0x006a:
            float r3 = java.lang.Math.min(r3, r5)
        L_0x006e:
            r5 = r3
            goto L_0x0079
        L_0x0070:
            float r3 = java.lang.Math.max(r3, r5)
            goto L_0x006e
        L_0x0075:
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x0079:
            int r8 = r15.viewWidth
            float r11 = (float) r8
            float r12 = r3 * r4
            float r11 = r11 - r12
            int r12 = r15.viewHeight
            float r13 = (float) r12
            float r14 = r5 * r6
            float r13 = r13 - r14
            float r8 = (float) r8
            float r8 = r8 - r11
            r15.matchViewWidth = r8
            float r8 = (float) r12
            float r8 = r8 - r13
            r15.matchViewHeight = r8
            boolean r8 = r15.isZoomed()
            r12 = 5
            r14 = 0
            if (r8 != 0) goto L_0x00e2
            boolean r8 = r15.imageRenderedAtLeastOnce
            if (r8 != 0) goto L_0x00e2
            boolean r0 = r15.isRotateImageToFitScreen
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r15.orientationMismatch(r2)
            if (r0 == 0) goto L_0x00b5
            android.graphics.Matrix r0 = r15.matrix
            r1 = 1119092736(0x42b40000, float:90.0)
            r0.setRotate(r1)
            android.graphics.Matrix r0 = r15.matrix
            r0.postTranslate(r4, r14)
            android.graphics.Matrix r0 = r15.matrix
            r0.postScale(r3, r5)
            goto L_0x00ba
        L_0x00b5:
            android.graphics.Matrix r0 = r15.matrix
            r0.setScale(r3, r5)
        L_0x00ba:
            int[] r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.C59661.$SwitchMap$android$widget$ImageView$ScaleType
            android.widget.ImageView$ScaleType r1 = r15.mScaleType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r12) goto L_0x00d9
            r1 = 6
            if (r0 == r1) goto L_0x00d3
            android.graphics.Matrix r0 = r15.matrix
            r1 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r1
            float r13 = r13 / r1
            r0.postTranslate(r11, r13)
            goto L_0x00de
        L_0x00d3:
            android.graphics.Matrix r0 = r15.matrix
            r0.postTranslate(r11, r13)
            goto L_0x00de
        L_0x00d9:
            android.graphics.Matrix r0 = r15.matrix
            r0.postTranslate(r14, r14)
        L_0x00de:
            r15.normalizedScale = r10
            goto L_0x014b
        L_0x00e2:
            float r2 = r15.prevMatchViewWidth
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x00ee
            float r2 = r15.prevMatchViewHeight
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x00f1
        L_0x00ee:
            r15.savePreviousImageValues()
        L_0x00f1:
            android.graphics.Matrix r2 = r15.prevMatrix
            float[] r3 = r15.f6900m
            r2.getValues(r3)
            float[] r2 = r15.f6900m
            float r3 = r15.matchViewWidth
            float r3 = r3 / r4
            float r4 = r15.normalizedScale
            float r3 = r3 * r4
            r2[r1] = r3
            r1 = 4
            float r3 = r15.matchViewHeight
            float r3 = r3 / r6
            float r3 = r3 * r4
            r2[r1] = r3
            r10 = 2
            r3 = r2[r10]
            r11 = r2[r12]
            float r1 = r15.prevMatchViewWidth
            float r4 = r4 * r1
            float r5 = r15.getImageWidth()
            float[] r13 = r15.f6900m
            int r6 = r15.prevViewWidth
            int r8 = r15.viewWidth
            r1 = r15
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r0
            float r1 = r1.newTranslationAfterChange(r2, r3, r4, r5, r6, r7, r8)
            r13[r10] = r1
            float r1 = r15.prevMatchViewHeight
            float r2 = r15.normalizedScale
            float r3 = r1 * r2
            float r4 = r15.getImageHeight()
            float[] r10 = r15.f6900m
            int r5 = r15.prevViewHeight
            int r6 = r15.viewHeight
            r1 = r15
            r2 = r11
            r7 = r9
            float r0 = r1.newTranslationAfterChange(r2, r3, r4, r5, r6, r7, r8)
            r10[r12] = r0
            android.graphics.Matrix r0 = r15.matrix
            float[] r1 = r15.f6900m
            r0.setValues(r1)
        L_0x014b:
            r15.fixTrans()
            android.graphics.Matrix r0 = r15.matrix
            r15.setImageMatrix(r0)
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.TouchImageView.fitImageToView():void");
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$1 */
    static /* synthetic */ class C59661 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType = new int[ImageView.ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$android$widget$ImageView$ScaleType = r0
                int[] r0 = $SwitchMap$android$widget$ImageView$ScaleType     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$android$widget$ImageView$ScaleType     // Catch:{ NoSuchFieldError -> 0x001f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$android$widget$ImageView$ScaleType     // Catch:{ NoSuchFieldError -> 0x002a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$android$widget$ImageView$ScaleType     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$android$widget$ImageView$ScaleType     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = $SwitchMap$android$widget$ImageView$ScaleType     // Catch:{ NoSuchFieldError -> 0x004b }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = $SwitchMap$android$widget$ImageView$ScaleType     // Catch:{ NoSuchFieldError -> 0x0056 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.TouchImageView.C59661.<clinit>():void");
        }
    }

    private int setViewSize(int i, int i2, int i3) {
        if (i != Integer.MIN_VALUE) {
            return i != 0 ? i2 : i3;
        }
        return Math.min(i3, i2);
    }

    private float newTranslationAfterChange(float f, float f2, float f3, int i, int i2, int i3, FixedPixel fixedPixel) {
        float f4 = (float) i2;
        float f5 = 0.5f;
        if (f3 < f4) {
            return (f4 - (((float) i3) * this.f6900m[0])) * 0.5f;
        }
        if (f > 0.0f) {
            return -((f3 - f4) * 0.5f);
        }
        if (fixedPixel == FixedPixel.BOTTOM_RIGHT) {
            f5 = 1.0f;
        } else if (fixedPixel == FixedPixel.TOP_LEFT) {
            f5 = 0.0f;
        }
        return -(((((-f) + (((float) i) * f5)) / f2) * f3) - (f4 * f5));
    }

    /* access modifiers changed from: private */
    public void setState(State state2) {
        this.state = state2;
    }

    @Deprecated
    public boolean canScrollHorizontallyFroyo(int i) {
        return canScrollHorizontally(i);
    }

    public boolean canScrollHorizontally(int i) {
        this.matrix.getValues(this.f6900m);
        float f = this.f6900m[2];
        if (getImageWidth() < ((float) this.viewWidth)) {
            return false;
        }
        if (f >= -1.0f && i < 0) {
            return false;
        }
        if (Math.abs(f) + ((float) this.viewWidth) + 1.0f < getImageWidth() || i <= 0) {
            return true;
        }
        return false;
    }

    public boolean canScrollVertically(int i) {
        this.matrix.getValues(this.f6900m);
        float f = this.f6900m[5];
        if (getImageHeight() < ((float) this.viewHeight)) {
            return false;
        }
        if (f >= -1.0f && i < 0) {
            return false;
        }
        if (Math.abs(f) + ((float) this.viewHeight) + 1.0f < getImageHeight() || i <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$GestureListener */
    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private GestureListener() {
        }

        /* synthetic */ GestureListener(TouchImageView touchImageView, C59661 r2) {
            this();
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (TouchImageView.this.doubleTapListener != null) {
                return TouchImageView.this.doubleTapListener.onSingleTapConfirmed(motionEvent);
            }
            return TouchImageView.this.performClick();
        }

        public void onLongPress(MotionEvent motionEvent) {
            TouchImageView.this.performLongClick();
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (TouchImageView.this.fling != null) {
                TouchImageView.this.fling.cancelFling();
            }
            TouchImageView touchImageView = TouchImageView.this;
            Fling unused = touchImageView.fling = new Fling((int) f, (int) f2);
            TouchImageView touchImageView2 = TouchImageView.this;
            touchImageView2.compatPostOnAnimation(touchImageView2.fling);
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean z = false;
            if (!TouchImageView.this.isZoomEnabled()) {
                return false;
            }
            if (TouchImageView.this.doubleTapListener != null) {
                z = TouchImageView.this.doubleTapListener.onDoubleTap(motionEvent);
            }
            if (TouchImageView.this.state != State.NONE) {
                return z;
            }
            float access$800 = TouchImageView.this.doubleTapScale == 0.0f ? TouchImageView.this.maxScale : TouchImageView.this.doubleTapScale;
            if (TouchImageView.this.normalizedScale != TouchImageView.this.minScale) {
                access$800 = TouchImageView.this.minScale;
            }
            TouchImageView.this.compatPostOnAnimation(new DoubleTapZoom(access$800, motionEvent.getX(), motionEvent.getY(), false));
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (TouchImageView.this.doubleTapListener != null) {
                return TouchImageView.this.doubleTapListener.onDoubleTapEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$PrivateOnTouchListener */
    private class PrivateOnTouchListener implements View.OnTouchListener {
        private PointF last;

        private PrivateOnTouchListener() {
            this.last = new PointF();
        }

        /* synthetic */ PrivateOnTouchListener(TouchImageView touchImageView, C59661 r2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
            if (r1 != 6) goto L_0x00de;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            /*
                r7 = this;
                ru.unicorn.ujin.view.customViews.TouchImageView r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                android.graphics.drawable.Drawable r0 = r0.getDrawable()
                if (r0 != 0) goto L_0x0011
                ru.unicorn.ujin.view.customViews.TouchImageView r8 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                ru.unicorn.ujin.view.customViews.TouchImageView$State r9 = p035ru.unicorn.ujin.view.customViews.TouchImageView.State.NONE
                r8.setState(r9)
                r8 = 0
                return r8
            L_0x0011:
                ru.unicorn.ujin.view.customViews.TouchImageView r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                boolean r0 = r0.isZoomEnabled()
                if (r0 == 0) goto L_0x0022
                ru.unicorn.ujin.view.customViews.TouchImageView r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                android.view.ScaleGestureDetector r0 = r0.mScaleDetector
                r0.onTouchEvent(r9)
            L_0x0022:
                ru.unicorn.ujin.view.customViews.TouchImageView r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                android.view.GestureDetector r0 = r0.mGestureDetector
                r0.onTouchEvent(r9)
                android.graphics.PointF r0 = new android.graphics.PointF
                float r1 = r9.getX()
                float r2 = r9.getY()
                r0.<init>(r1, r2)
                ru.unicorn.ujin.view.customViews.TouchImageView r1 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                ru.unicorn.ujin.view.customViews.TouchImageView$State r1 = r1.state
                ru.unicorn.ujin.view.customViews.TouchImageView$State r2 = p035ru.unicorn.ujin.view.customViews.TouchImageView.State.NONE
                r3 = 1
                if (r1 == r2) goto L_0x0057
                ru.unicorn.ujin.view.customViews.TouchImageView r1 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                ru.unicorn.ujin.view.customViews.TouchImageView$State r1 = r1.state
                ru.unicorn.ujin.view.customViews.TouchImageView$State r2 = p035ru.unicorn.ujin.view.customViews.TouchImageView.State.DRAG
                if (r1 == r2) goto L_0x0057
                ru.unicorn.ujin.view.customViews.TouchImageView r1 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                ru.unicorn.ujin.view.customViews.TouchImageView$State r1 = r1.state
                ru.unicorn.ujin.view.customViews.TouchImageView$State r2 = p035ru.unicorn.ujin.view.customViews.TouchImageView.State.FLING
                if (r1 != r2) goto L_0x00de
            L_0x0057:
                int r1 = r9.getAction()
                if (r1 == 0) goto L_0x00c1
                if (r1 == r3) goto L_0x00b9
                r2 = 2
                if (r1 == r2) goto L_0x0067
                r0 = 6
                if (r1 == r0) goto L_0x00b9
                goto L_0x00de
            L_0x0067:
                ru.unicorn.ujin.view.customViews.TouchImageView r1 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                ru.unicorn.ujin.view.customViews.TouchImageView$State r1 = r1.state
                ru.unicorn.ujin.view.customViews.TouchImageView$State r2 = p035ru.unicorn.ujin.view.customViews.TouchImageView.State.DRAG
                if (r1 != r2) goto L_0x00de
                float r1 = r0.x
                android.graphics.PointF r2 = r7.last
                float r2 = r2.x
                float r1 = r1 - r2
                float r2 = r0.y
                android.graphics.PointF r4 = r7.last
                float r4 = r4.y
                float r2 = r2 - r4
                ru.unicorn.ujin.view.customViews.TouchImageView r4 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                int r5 = r4.viewWidth
                float r5 = (float) r5
                ru.unicorn.ujin.view.customViews.TouchImageView r6 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                float r6 = r6.getImageWidth()
                float r1 = r4.getFixDragTrans(r1, r5, r6)
                ru.unicorn.ujin.view.customViews.TouchImageView r4 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                int r5 = r4.viewHeight
                float r5 = (float) r5
                ru.unicorn.ujin.view.customViews.TouchImageView r6 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                float r6 = r6.getImageHeight()
                float r2 = r4.getFixDragTrans(r2, r5, r6)
                ru.unicorn.ujin.view.customViews.TouchImageView r4 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                android.graphics.Matrix r4 = r4.matrix
                r4.postTranslate(r1, r2)
                ru.unicorn.ujin.view.customViews.TouchImageView r1 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                r1.fixTrans()
                android.graphics.PointF r1 = r7.last
                float r2 = r0.x
                float r0 = r0.y
                r1.set(r2, r0)
                goto L_0x00de
            L_0x00b9:
                ru.unicorn.ujin.view.customViews.TouchImageView r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                ru.unicorn.ujin.view.customViews.TouchImageView$State r1 = p035ru.unicorn.ujin.view.customViews.TouchImageView.State.NONE
                r0.setState(r1)
                goto L_0x00de
            L_0x00c1:
                android.graphics.PointF r1 = r7.last
                r1.set(r0)
                ru.unicorn.ujin.view.customViews.TouchImageView r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                ru.unicorn.ujin.view.customViews.TouchImageView$Fling r0 = r0.fling
                if (r0 == 0) goto L_0x00d7
                ru.unicorn.ujin.view.customViews.TouchImageView r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                ru.unicorn.ujin.view.customViews.TouchImageView$Fling r0 = r0.fling
                r0.cancelFling()
            L_0x00d7:
                ru.unicorn.ujin.view.customViews.TouchImageView r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                ru.unicorn.ujin.view.customViews.TouchImageView$State r1 = p035ru.unicorn.ujin.view.customViews.TouchImageView.State.DRAG
                r0.setState(r1)
            L_0x00de:
                ru.unicorn.ujin.view.customViews.TouchImageView r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                android.graphics.Matrix r1 = r0.matrix
                r0.setImageMatrix(r1)
                ru.unicorn.ujin.view.customViews.TouchImageView r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                android.view.View$OnTouchListener r0 = r0.userTouchListener
                if (r0 == 0) goto L_0x00f8
                ru.unicorn.ujin.view.customViews.TouchImageView r0 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                android.view.View$OnTouchListener r0 = r0.userTouchListener
                r0.onTouch(r8, r9)
            L_0x00f8:
                ru.unicorn.ujin.view.customViews.TouchImageView r8 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                ru.unicorn.ujin.view.customViews.TouchImageView$OnTouchImageViewListener r8 = r8.touchImageViewListener
                if (r8 == 0) goto L_0x0109
                ru.unicorn.ujin.view.customViews.TouchImageView r8 = p035ru.unicorn.ujin.view.customViews.TouchImageView.this
                ru.unicorn.ujin.view.customViews.TouchImageView$OnTouchImageViewListener r8 = r8.touchImageViewListener
                r8.onMove()
            L_0x0109:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.TouchImageView.PrivateOnTouchListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$ScaleListener */
    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private ScaleListener() {
        }

        /* synthetic */ ScaleListener(TouchImageView touchImageView, C59661 r2) {
            this();
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            TouchImageView.this.setState(State.ZOOM);
            return true;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            TouchImageView.this.scaleImage((double) scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), true);
            if (TouchImageView.this.touchImageViewListener == null) {
                return true;
            }
            TouchImageView.this.touchImageViewListener.onMove();
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
            TouchImageView.this.setState(State.NONE);
            float access$900 = TouchImageView.this.normalizedScale;
            boolean z = true;
            if (TouchImageView.this.normalizedScale > TouchImageView.this.maxScale) {
                access$900 = TouchImageView.this.maxScale;
            } else if (TouchImageView.this.normalizedScale < TouchImageView.this.minScale) {
                access$900 = TouchImageView.this.minScale;
            } else {
                z = false;
            }
            float f = access$900;
            if (z) {
                TouchImageView touchImageView = TouchImageView.this;
                TouchImageView.this.compatPostOnAnimation(new DoubleTapZoom(f, (float) (touchImageView.viewWidth / 2), (float) (TouchImageView.this.viewHeight / 2), true));
            }
        }
    }

    /* access modifiers changed from: private */
    public void scaleImage(double d, float f, float f2, boolean z) {
        float f3;
        float f4;
        if (z) {
            f3 = this.superMinScale;
            f4 = this.superMaxScale;
        } else {
            f3 = this.minScale;
            f4 = this.maxScale;
        }
        float f5 = this.normalizedScale;
        this.normalizedScale = (float) (((double) f5) * d);
        float f6 = this.normalizedScale;
        if (f6 > f4) {
            this.normalizedScale = f4;
            d = (double) (f4 / f5);
        } else if (f6 < f3) {
            this.normalizedScale = f3;
            d = (double) (f3 / f5);
        }
        float f7 = (float) d;
        this.matrix.postScale(f7, f7, f, f2);
        fixScaleTrans();
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$DoubleTapZoom */
    private class DoubleTapZoom implements Runnable {
        private float bitmapX;
        private float bitmapY;
        private PointF endTouch;
        private AccelerateDecelerateInterpolator interpolator = new AccelerateDecelerateInterpolator();
        private long startTime;
        private PointF startTouch;
        private float startZoom;
        private boolean stretchImageToSuper;
        private float targetZoom;

        DoubleTapZoom(float f, float f2, float f3, boolean z) {
            TouchImageView.this.setState(State.ANIMATE_ZOOM);
            this.startTime = System.currentTimeMillis();
            this.startZoom = TouchImageView.this.normalizedScale;
            this.targetZoom = f;
            this.stretchImageToSuper = z;
            PointF transformCoordTouchToBitmap = TouchImageView.this.transformCoordTouchToBitmap(f2, f3, false);
            this.bitmapX = transformCoordTouchToBitmap.x;
            this.bitmapY = transformCoordTouchToBitmap.y;
            this.startTouch = TouchImageView.this.transformCoordBitmapToTouch(this.bitmapX, this.bitmapY);
            this.endTouch = new PointF((float) (TouchImageView.this.viewWidth / 2), (float) (TouchImageView.this.viewHeight / 2));
        }

        public void run() {
            if (TouchImageView.this.getDrawable() == null) {
                TouchImageView.this.setState(State.NONE);
                return;
            }
            float interpolate = interpolate();
            TouchImageView.this.scaleImage(calculateDeltaScale(interpolate), this.bitmapX, this.bitmapY, this.stretchImageToSuper);
            translateImageToCenterTouchPosition(interpolate);
            TouchImageView.this.fixScaleTrans();
            TouchImageView touchImageView = TouchImageView.this;
            touchImageView.setImageMatrix(touchImageView.matrix);
            if (TouchImageView.this.touchImageViewListener != null) {
                TouchImageView.this.touchImageViewListener.onMove();
            }
            if (interpolate < 1.0f) {
                TouchImageView.this.compatPostOnAnimation(this);
            } else {
                TouchImageView.this.setState(State.NONE);
            }
        }

        private void translateImageToCenterTouchPosition(float f) {
            float f2 = this.startTouch.x + ((this.endTouch.x - this.startTouch.x) * f);
            float f3 = this.startTouch.y + (f * (this.endTouch.y - this.startTouch.y));
            PointF transformCoordBitmapToTouch = TouchImageView.this.transformCoordBitmapToTouch(this.bitmapX, this.bitmapY);
            TouchImageView.this.matrix.postTranslate(f2 - transformCoordBitmapToTouch.x, f3 - transformCoordBitmapToTouch.y);
        }

        private float interpolate() {
            return this.interpolator.getInterpolation(Math.min(1.0f, (float) ((System.currentTimeMillis() - this.startTime) / 500)));
        }

        private double calculateDeltaScale(float f) {
            float f2 = this.startZoom;
            return ((double) (f2 + (f * (this.targetZoom - f2)))) / ((double) TouchImageView.this.normalizedScale);
        }
    }

    /* access modifiers changed from: protected */
    public PointF transformCoordTouchToBitmap(float f, float f2, boolean z) {
        this.matrix.getValues(this.f6900m);
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
        float[] fArr = this.f6900m;
        float f3 = fArr[2];
        float f4 = fArr[5];
        float imageWidth = ((f - f3) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f2 - f4) * intrinsicHeight) / getImageHeight();
        if (z) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    /* access modifiers changed from: protected */
    public PointF transformCoordBitmapToTouch(float f, float f2) {
        this.matrix.getValues(this.f6900m);
        return new PointF(this.f6900m[2] + (getImageWidth() * (f / ((float) getDrawable().getIntrinsicWidth()))), this.f6900m[5] + (getImageHeight() * (f2 / ((float) getDrawable().getIntrinsicHeight()))));
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$Fling */
    private class Fling implements Runnable {
        int currX;
        int currY;
        CompatScroller scroller;

        Fling(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            TouchImageView.this.setState(State.FLING);
            this.scroller = new CompatScroller(TouchImageView.this.getContext());
            TouchImageView.this.matrix.getValues(TouchImageView.this.f6900m);
            int i7 = (int) TouchImageView.this.f6900m[2];
            int i8 = (int) TouchImageView.this.f6900m[5];
            if (TouchImageView.this.isRotateImageToFitScreen && TouchImageView.this.orientationMismatch(TouchImageView.this.getDrawable())) {
                i7 = (int) (((float) i7) - TouchImageView.this.getImageWidth());
            }
            if (TouchImageView.this.getImageWidth() > ((float) TouchImageView.this.viewWidth)) {
                i4 = TouchImageView.this.viewWidth - ((int) TouchImageView.this.getImageWidth());
                i3 = 0;
            } else {
                i4 = i7;
                i3 = i4;
            }
            if (TouchImageView.this.getImageHeight() > ((float) TouchImageView.this.viewHeight)) {
                i6 = TouchImageView.this.viewHeight - ((int) TouchImageView.this.getImageHeight());
                i5 = 0;
            } else {
                i6 = i8;
                i5 = i6;
            }
            this.scroller.fling(i7, i8, i, i2, i4, i3, i6, i5);
            this.currX = i7;
            this.currY = i8;
        }

        public void cancelFling() {
            if (this.scroller != null) {
                TouchImageView.this.setState(State.NONE);
                this.scroller.forceFinished(true);
            }
        }

        public void run() {
            if (TouchImageView.this.touchImageViewListener != null) {
                TouchImageView.this.touchImageViewListener.onMove();
            }
            if (this.scroller.isFinished()) {
                this.scroller = null;
            } else if (this.scroller.computeScrollOffset()) {
                int currX2 = this.scroller.getCurrX();
                int currY2 = this.scroller.getCurrY();
                int i = currX2 - this.currX;
                int i2 = currY2 - this.currY;
                this.currX = currX2;
                this.currY = currY2;
                TouchImageView.this.matrix.postTranslate((float) i, (float) i2);
                TouchImageView.this.fixTrans();
                TouchImageView touchImageView = TouchImageView.this;
                touchImageView.setImageMatrix(touchImageView.matrix);
                TouchImageView.this.compatPostOnAnimation(this);
            }
        }
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$CompatScroller */
    private class CompatScroller {
        OverScroller overScroller;

        CompatScroller(Context context) {
            this.overScroller = new OverScroller(context);
        }

        /* access modifiers changed from: package-private */
        public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.overScroller.fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        /* access modifiers changed from: package-private */
        public void forceFinished(boolean z) {
            this.overScroller.forceFinished(z);
        }

        public boolean isFinished() {
            return this.overScroller.isFinished();
        }

        /* access modifiers changed from: package-private */
        public boolean computeScrollOffset() {
            this.overScroller.computeScrollOffset();
            return this.overScroller.computeScrollOffset();
        }

        /* access modifiers changed from: package-private */
        public int getCurrX() {
            return this.overScroller.getCurrX();
        }

        /* access modifiers changed from: package-private */
        public int getCurrY() {
            return this.overScroller.getCurrY();
        }
    }

    /* access modifiers changed from: private */
    public void compatPostOnAnimation(Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            postOnAnimation(runnable);
        } else {
            postDelayed(runnable, 16);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$ZoomVariables */
    private class ZoomVariables {
        float focusX;
        float focusY;
        float scale;
        ImageView.ScaleType scaleType;

        ZoomVariables(float f, float f2, float f3, ImageView.ScaleType scaleType2) {
            this.scale = f;
            this.focusX = f2;
            this.focusY = f3;
            this.scaleType = scaleType2;
        }
    }

    private void printMatrixInfo() {
        float[] fArr = new float[9];
        this.matrix.getValues(fArr);
        Log.d(DEBUG, "Scale: " + fArr[0] + " TransX: " + fArr[2] + " TransY: " + fArr[5]);
    }

    public void setZoomAnimated(float f, float f2, float f3) {
        setZoomAnimated(f, f2, f3, 500);
    }

    public void setZoomAnimated(float f, float f2, float f3, int i) {
        compatPostOnAnimation(new AnimatedZoom(f, new PointF(f2, f3), i));
    }

    public void setZoomAnimated(float f, float f2, float f3, int i, OnZoomFinishedListener onZoomFinishedListener) {
        AnimatedZoom animatedZoom = new AnimatedZoom(f, new PointF(f2, f3), i);
        animatedZoom.setListener(onZoomFinishedListener);
        compatPostOnAnimation(animatedZoom);
    }

    public void setZoomAnimated(float f, float f2, float f3, OnZoomFinishedListener onZoomFinishedListener) {
        AnimatedZoom animatedZoom = new AnimatedZoom(f, new PointF(f2, f3), 500);
        animatedZoom.setListener(onZoomFinishedListener);
        compatPostOnAnimation(animatedZoom);
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.TouchImageView$AnimatedZoom */
    private class AnimatedZoom implements Runnable {
        private LinearInterpolator interpolator = new LinearInterpolator();
        private OnZoomFinishedListener listener;
        private PointF startFocus;
        private long startTime;
        private float startZoom;
        private PointF targetFocus;
        private float targetZoom;
        private final int zoomTimeMillis;

        AnimatedZoom(float f, PointF pointF, int i) {
            TouchImageView.this.setState(State.ANIMATE_ZOOM);
            this.startTime = System.currentTimeMillis();
            this.startZoom = TouchImageView.this.normalizedScale;
            this.targetZoom = f;
            this.zoomTimeMillis = i;
            this.startFocus = TouchImageView.this.getScrollPosition();
            this.targetFocus = pointF;
        }

        public void run() {
            float interpolate = interpolate();
            float f = this.startZoom;
            TouchImageView.this.setZoom(f + ((this.targetZoom - f) * interpolate), this.startFocus.x + ((this.targetFocus.x - this.startFocus.x) * interpolate), this.startFocus.y + ((this.targetFocus.y - this.startFocus.y) * interpolate));
            if (interpolate < 1.0f) {
                TouchImageView.this.compatPostOnAnimation(this);
                return;
            }
            TouchImageView.this.setState(State.NONE);
            OnZoomFinishedListener onZoomFinishedListener = this.listener;
            if (onZoomFinishedListener != null) {
                onZoomFinishedListener.onZoomFinished();
            }
        }

        private float interpolate() {
            return this.interpolator.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.startTime)) / ((float) this.zoomTimeMillis)));
        }

        /* access modifiers changed from: package-private */
        public void setListener(OnZoomFinishedListener onZoomFinishedListener) {
            this.listener = onZoomFinishedListener;
        }
    }
}
