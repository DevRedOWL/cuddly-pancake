package com.angel.zoom;

import android.content.Context;
import android.content.res.Configuration;
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
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.Scroller;

public class ZoomImageView extends ImageView {
    private static final String DEBUG = "Angel";
    private static final float SUPER_MAX_MULTIPLIER = 1.5f;
    private static final float SUPER_MIN_MULTIPLIER = 0.5f;
    /* access modifiers changed from: private */
    public Context context;
    private ZoomVariables delayedZoomVariables;
    /* access modifiers changed from: private */
    public GestureDetector.OnDoubleTapListener doubleTapListener = null;
    /* access modifiers changed from: private */
    public Fling fling;
    private boolean imageRenderedAtLeastOnce;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float[] f1184m;
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
    /* access modifiers changed from: private */
    public float minScale;
    /* access modifiers changed from: private */
    public float normalizedScale;
    private boolean onDrawReady;
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
    public OnTouchImageViewListener touchImageViewListener = null;
    /* access modifiers changed from: private */
    public View.OnTouchListener userTouchListener = null;
    /* access modifiers changed from: private */
    public int viewHeight;
    /* access modifiers changed from: private */
    public int viewWidth;

    public interface OnTouchImageViewListener {
        void onMove();
    }

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

    private float getFixTrans(float f, float f2, float f3) {
        float f4;
        float f5;
        if (f3 <= f2) {
            f4 = f2 - f3;
            f5 = 0.0f;
        } else {
            f5 = f2 - f3;
            f4 = 0.0f;
        }
        if (f < f5) {
            return (-f) + f5;
        }
        if (f > f4) {
            return (-f) + f4;
        }
        return 0.0f;
    }

    public ZoomImageView(Context context2) {
        super(context2);
        sharedConstructing(context2);
    }

    public ZoomImageView(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        sharedConstructing(context2);
    }

    public ZoomImageView(Context context2, AttributeSet attributeSet, int i) {
        super(context2, attributeSet, i);
        sharedConstructing(context2);
    }

    private void sharedConstructing(Context context2) {
        super.setClickable(true);
        this.context = context2;
        this.mScaleDetector = new ScaleGestureDetector(context2, new ScaleListener(this, (C10761) null));
        this.mGestureDetector = new GestureDetector(context2, new GestureListener(this, (C10761) null));
        this.matrix = new Matrix();
        this.prevMatrix = new Matrix();
        this.f1184m = new float[9];
        this.normalizedScale = 1.0f;
        if (this.mScaleType == null) {
            this.mScaleType = ImageView.ScaleType.FIT_CENTER;
        }
        this.minScale = 1.0f;
        this.maxScale = 2.0f;
        this.superMinScale = this.minScale * 0.5f;
        this.superMaxScale = this.maxScale * SUPER_MAX_MULTIPLIER;
        setImageMatrix(this.matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        setState(State.NONE);
        this.onDrawReady = false;
        super.setOnTouchListener(new PrivateOnTouchListener(this, (C10761) null));
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

    public void setImageResource(int i) {
        super.setImageResource(i);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.FIT_START || scaleType == ImageView.ScaleType.FIT_END) {
            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
        } else if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(ImageView.ScaleType.MATRIX);
        } else {
            this.mScaleType = scaleType;
            if (this.onDrawReady) {
                setZoom(this);
            }
        }
    }

    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public boolean isZoomed() {
        return this.normalizedScale != 1.0f;
    }

    public RectF getZoomedRect() {
        if (this.mScaleType != ImageView.ScaleType.FIT_XY) {
            PointF transformCoordTouchToBitmap = transformCoordTouchToBitmap(0.0f, 0.0f, true);
            PointF transformCoordTouchToBitmap2 = transformCoordTouchToBitmap((float) this.viewWidth, (float) this.viewHeight, true);
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            return new RectF(transformCoordTouchToBitmap.x / intrinsicWidth, transformCoordTouchToBitmap.y / intrinsicHeight, transformCoordTouchToBitmap2.x / intrinsicWidth, transformCoordTouchToBitmap2.y / intrinsicHeight);
        }
        throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
    }

    private void savePreviousImageValues() {
        Matrix matrix2 = this.matrix;
        if (matrix2 != null && this.viewHeight != 0 && this.viewWidth != 0) {
            matrix2.getValues(this.f1184m);
            this.prevMatrix.setValues(this.f1184m);
            this.prevMatchViewHeight = this.matchViewHeight;
            this.prevMatchViewWidth = this.matchViewWidth;
            this.prevViewHeight = this.viewHeight;
            this.prevViewWidth = this.viewWidth;
        }
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putFloat("saveScale", this.normalizedScale);
        bundle.putFloat("matchViewHeight", this.matchViewHeight);
        bundle.putFloat("matchViewWidth", this.matchViewWidth);
        bundle.putInt("viewWidth", this.viewWidth);
        bundle.putInt("viewHeight", this.viewHeight);
        this.matrix.getValues(this.f1184m);
        bundle.putFloatArray("matrix", this.f1184m);
        bundle.putBoolean("imageRendered", this.imageRenderedAtLeastOnce);
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.normalizedScale = bundle.getFloat("saveScale");
            this.f1184m = bundle.getFloatArray("matrix");
            this.prevMatrix.setValues(this.f1184m);
            this.prevMatchViewHeight = bundle.getFloat("matchViewHeight");
            this.prevMatchViewWidth = bundle.getFloat("matchViewWidth");
            this.prevViewHeight = bundle.getInt("viewHeight");
            this.prevViewWidth = bundle.getInt("viewWidth");
            this.imageRenderedAtLeastOnce = bundle.getBoolean("imageRendered");
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
        savePreviousImageValues();
    }

    public float getMaxZoom() {
        return this.maxScale;
    }

    public void setMaxZoom(float f) {
        this.maxScale = f;
        this.superMaxScale = this.maxScale * SUPER_MAX_MULTIPLIER;
    }

    public float getMinZoom() {
        return this.minScale;
    }

    public float getCurrentZoom() {
        return this.normalizedScale;
    }

    public void setMinZoom(float f) {
        this.minScale = f;
        this.superMinScale = this.minScale * 0.5f;
    }

    public void resetZoom() {
        this.normalizedScale = 1.0f;
        fitImageToView();
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
        if (scaleType != this.mScaleType) {
            setScaleType(scaleType);
        }
        resetZoom();
        scaleImage((double) f, (float) (this.viewWidth / 2), (float) (this.viewHeight / 2), true);
        this.matrix.getValues(this.f1184m);
        this.f1184m[2] = -((f2 * getImageWidth()) - (((float) this.viewWidth) * 0.5f));
        this.f1184m[5] = -((f3 * getImageHeight()) - (((float) this.viewHeight) * 0.5f));
        this.matrix.setValues(this.f1184m);
        fixTrans();
        setImageMatrix(this.matrix);
    }

    public void setZoom(ZoomImageView zoomImageView) {
        PointF scrollPosition = zoomImageView.getScrollPosition();
        setZoom(zoomImageView.getCurrentZoom(), scrollPosition.x, scrollPosition.y, zoomImageView.getScaleType());
    }

    public PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        PointF transformCoordTouchToBitmap = transformCoordTouchToBitmap((float) (this.viewWidth / 2), (float) (this.viewHeight / 2), true);
        transformCoordTouchToBitmap.x /= (float) intrinsicWidth;
        transformCoordTouchToBitmap.y /= (float) intrinsicHeight;
        return transformCoordTouchToBitmap;
    }

    public void setScrollPosition(float f, float f2) {
        setZoom(this.normalizedScale, f, f2);
    }

    /* access modifiers changed from: private */
    public void fixTrans() {
        this.matrix.getValues(this.f1184m);
        float[] fArr = this.f1184m;
        float f = fArr[2];
        float f2 = fArr[5];
        float fixTrans = getFixTrans(f, (float) this.viewWidth, getImageWidth());
        float fixTrans2 = getFixTrans(f2, (float) this.viewHeight, getImageHeight());
        if (fixTrans != 0.0f || fixTrans2 != 0.0f) {
            this.matrix.postTranslate(fixTrans, fixTrans2);
        }
    }

    /* access modifiers changed from: private */
    public void fixScaleTrans() {
        fixTrans();
        this.matrix.getValues(this.f1184m);
        float imageWidth = getImageWidth();
        int i = this.viewWidth;
        if (imageWidth < ((float) i)) {
            this.f1184m[2] = (((float) i) - getImageWidth()) / 2.0f;
        }
        float imageHeight = getImageHeight();
        int i2 = this.viewHeight;
        if (imageHeight < ((float) i2)) {
            this.f1184m[5] = (((float) i2) - getImageHeight()) / 2.0f;
        }
        this.matrix.setValues(this.f1184m);
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
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.viewWidth = setViewSize(mode, size, intrinsicWidth);
        this.viewHeight = setViewSize(mode2, size2, intrinsicHeight);
        setMeasuredDimension(this.viewWidth, this.viewHeight);
        fitImageToView();
    }

    private void fitImageToView() {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0 && this.matrix != null && this.prevMatrix != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f = (float) intrinsicWidth;
            float f2 = ((float) this.viewWidth) / f;
            float f3 = (float) intrinsicHeight;
            float f4 = ((float) this.viewHeight) / f3;
            int i = C10761.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        f2 = Math.min(1.0f, Math.min(f2, f4));
                        f4 = f2;
                    } else if (i != 4) {
                        if (i != 5) {
                            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
                        }
                    }
                    f2 = Math.min(f2, f4);
                } else {
                    f2 = Math.max(f2, f4);
                }
                f4 = f2;
            } else {
                f2 = 1.0f;
                f4 = 1.0f;
            }
            int i2 = this.viewWidth;
            float f5 = ((float) i2) - (f2 * f);
            int i3 = this.viewHeight;
            float f6 = ((float) i3) - (f4 * f3);
            this.matchViewWidth = ((float) i2) - f5;
            this.matchViewHeight = ((float) i3) - f6;
            if (isZoomed() || this.imageRenderedAtLeastOnce) {
                if (this.prevMatchViewWidth == 0.0f || this.prevMatchViewHeight == 0.0f) {
                    savePreviousImageValues();
                }
                this.prevMatrix.getValues(this.f1184m);
                float[] fArr = this.f1184m;
                float f7 = this.matchViewWidth / f;
                float f8 = this.normalizedScale;
                fArr[0] = f7 * f8;
                fArr[4] = (this.matchViewHeight / f3) * f8;
                float f9 = fArr[2];
                float f10 = fArr[5];
                translateMatrixAfterRotate(2, f9, this.prevMatchViewWidth * f8, getImageWidth(), this.prevViewWidth, this.viewWidth, intrinsicWidth);
                translateMatrixAfterRotate(5, f10, this.prevMatchViewHeight * this.normalizedScale, getImageHeight(), this.prevViewHeight, this.viewHeight, intrinsicHeight);
                this.matrix.setValues(this.f1184m);
            } else {
                this.matrix.setScale(f2, f4);
                this.matrix.postTranslate(f5 / 2.0f, f6 / 2.0f);
                this.normalizedScale = 1.0f;
            }
            fixTrans();
            setImageMatrix(this.matrix);
        }
    }

    /* renamed from: com.angel.zoom.ZoomImageView$1 */
    static /* synthetic */ class C10761 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType = new int[ImageView.ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
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
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.angel.zoom.ZoomImageView.C10761.<clinit>():void");
        }
    }

    private int setViewSize(int i, int i2, int i3) {
        if (i != Integer.MIN_VALUE) {
            return i != 0 ? i2 : i3;
        }
        return Math.min(i3, i2);
    }

    private void translateMatrixAfterRotate(int i, float f, float f2, float f3, int i2, int i3, int i4) {
        float f4 = (float) i3;
        if (f3 < f4) {
            float[] fArr = this.f1184m;
            fArr[i] = (f4 - (((float) i4) * fArr[0])) * 0.5f;
        } else if (f > 0.0f) {
            this.f1184m[i] = -((f3 - f4) * 0.5f);
        } else {
            this.f1184m[i] = -((((Math.abs(f) + (((float) i2) * 0.5f)) / f2) * f3) - (f4 * 0.5f));
        }
    }

    /* access modifiers changed from: private */
    public void setState(State state2) {
        this.state = state2;
    }

    public boolean canScrollHorizontallyFroyo(int i) {
        return canScrollHorizontally(i);
    }

    public boolean canScrollHorizontally(int i) {
        this.matrix.getValues(this.f1184m);
        float f = this.f1184m[2];
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

    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private GestureListener() {
        }

        /* synthetic */ GestureListener(ZoomImageView zoomImageView, C10761 r2) {
            this();
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ZoomImageView.this.doubleTapListener != null) {
                return ZoomImageView.this.doubleTapListener.onSingleTapConfirmed(motionEvent);
            }
            return ZoomImageView.this.performClick();
        }

        public void onLongPress(MotionEvent motionEvent) {
            ZoomImageView.this.performLongClick();
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (ZoomImageView.this.fling != null) {
                ZoomImageView.this.fling.cancelFling();
            }
            ZoomImageView zoomImageView = ZoomImageView.this;
            Fling unused = zoomImageView.fling = new Fling((int) f, (int) f2);
            ZoomImageView zoomImageView2 = ZoomImageView.this;
            zoomImageView2.compatPostOnAnimation(zoomImageView2.fling);
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = ZoomImageView.this.doubleTapListener != null ? ZoomImageView.this.doubleTapListener.onDoubleTap(motionEvent) : false;
            if (ZoomImageView.this.state != State.NONE) {
                return onDoubleTap;
            }
            ZoomImageView.this.compatPostOnAnimation(new DoubleTapZoom(ZoomImageView.this.normalizedScale == ZoomImageView.this.minScale ? ZoomImageView.this.maxScale : ZoomImageView.this.minScale, motionEvent.getX(), motionEvent.getY(), false));
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (ZoomImageView.this.doubleTapListener != null) {
                return ZoomImageView.this.doubleTapListener.onDoubleTapEvent(motionEvent);
            }
            return false;
        }
    }

    private class PrivateOnTouchListener implements View.OnTouchListener {
        private PointF last;

        private PrivateOnTouchListener() {
            this.last = new PointF();
        }

        /* synthetic */ PrivateOnTouchListener(ZoomImageView zoomImageView, C10761 r2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
            if (r1 != 6) goto L_0x00c5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            /*
                r7 = this;
                com.angel.zoom.ZoomImageView r0 = com.angel.zoom.ZoomImageView.this
                android.view.ScaleGestureDetector r0 = r0.mScaleDetector
                r0.onTouchEvent(r9)
                com.angel.zoom.ZoomImageView r0 = com.angel.zoom.ZoomImageView.this
                android.view.GestureDetector r0 = r0.mGestureDetector
                r0.onTouchEvent(r9)
                android.graphics.PointF r0 = new android.graphics.PointF
                float r1 = r9.getX()
                float r2 = r9.getY()
                r0.<init>(r1, r2)
                com.angel.zoom.ZoomImageView r1 = com.angel.zoom.ZoomImageView.this
                com.angel.zoom.ZoomImageView$State r1 = r1.state
                com.angel.zoom.ZoomImageView$State r2 = com.angel.zoom.ZoomImageView.State.NONE
                r3 = 1
                if (r1 == r2) goto L_0x003e
                com.angel.zoom.ZoomImageView r1 = com.angel.zoom.ZoomImageView.this
                com.angel.zoom.ZoomImageView$State r1 = r1.state
                com.angel.zoom.ZoomImageView$State r2 = com.angel.zoom.ZoomImageView.State.DRAG
                if (r1 == r2) goto L_0x003e
                com.angel.zoom.ZoomImageView r1 = com.angel.zoom.ZoomImageView.this
                com.angel.zoom.ZoomImageView$State r1 = r1.state
                com.angel.zoom.ZoomImageView$State r2 = com.angel.zoom.ZoomImageView.State.FLING
                if (r1 != r2) goto L_0x00c5
            L_0x003e:
                int r1 = r9.getAction()
                if (r1 == 0) goto L_0x00a8
                if (r1 == r3) goto L_0x00a0
                r2 = 2
                if (r1 == r2) goto L_0x004e
                r0 = 6
                if (r1 == r0) goto L_0x00a0
                goto L_0x00c5
            L_0x004e:
                com.angel.zoom.ZoomImageView r1 = com.angel.zoom.ZoomImageView.this
                com.angel.zoom.ZoomImageView$State r1 = r1.state
                com.angel.zoom.ZoomImageView$State r2 = com.angel.zoom.ZoomImageView.State.DRAG
                if (r1 != r2) goto L_0x00c5
                float r1 = r0.x
                android.graphics.PointF r2 = r7.last
                float r2 = r2.x
                float r1 = r1 - r2
                float r2 = r0.y
                android.graphics.PointF r4 = r7.last
                float r4 = r4.y
                float r2 = r2 - r4
                com.angel.zoom.ZoomImageView r4 = com.angel.zoom.ZoomImageView.this
                int r5 = r4.viewWidth
                float r5 = (float) r5
                com.angel.zoom.ZoomImageView r6 = com.angel.zoom.ZoomImageView.this
                float r6 = r6.getImageWidth()
                float r1 = r4.getFixDragTrans(r1, r5, r6)
                com.angel.zoom.ZoomImageView r4 = com.angel.zoom.ZoomImageView.this
                int r5 = r4.viewHeight
                float r5 = (float) r5
                com.angel.zoom.ZoomImageView r6 = com.angel.zoom.ZoomImageView.this
                float r6 = r6.getImageHeight()
                float r2 = r4.getFixDragTrans(r2, r5, r6)
                com.angel.zoom.ZoomImageView r4 = com.angel.zoom.ZoomImageView.this
                android.graphics.Matrix r4 = r4.matrix
                r4.postTranslate(r1, r2)
                com.angel.zoom.ZoomImageView r1 = com.angel.zoom.ZoomImageView.this
                r1.fixTrans()
                android.graphics.PointF r1 = r7.last
                float r2 = r0.x
                float r0 = r0.y
                r1.set(r2, r0)
                goto L_0x00c5
            L_0x00a0:
                com.angel.zoom.ZoomImageView r0 = com.angel.zoom.ZoomImageView.this
                com.angel.zoom.ZoomImageView$State r1 = com.angel.zoom.ZoomImageView.State.NONE
                r0.setState(r1)
                goto L_0x00c5
            L_0x00a8:
                android.graphics.PointF r1 = r7.last
                r1.set(r0)
                com.angel.zoom.ZoomImageView r0 = com.angel.zoom.ZoomImageView.this
                com.angel.zoom.ZoomImageView$Fling r0 = r0.fling
                if (r0 == 0) goto L_0x00be
                com.angel.zoom.ZoomImageView r0 = com.angel.zoom.ZoomImageView.this
                com.angel.zoom.ZoomImageView$Fling r0 = r0.fling
                r0.cancelFling()
            L_0x00be:
                com.angel.zoom.ZoomImageView r0 = com.angel.zoom.ZoomImageView.this
                com.angel.zoom.ZoomImageView$State r1 = com.angel.zoom.ZoomImageView.State.DRAG
                r0.setState(r1)
            L_0x00c5:
                com.angel.zoom.ZoomImageView r0 = com.angel.zoom.ZoomImageView.this
                android.graphics.Matrix r1 = r0.matrix
                r0.setImageMatrix(r1)
                com.angel.zoom.ZoomImageView r0 = com.angel.zoom.ZoomImageView.this
                android.view.View$OnTouchListener r0 = r0.userTouchListener
                if (r0 == 0) goto L_0x00df
                com.angel.zoom.ZoomImageView r0 = com.angel.zoom.ZoomImageView.this
                android.view.View$OnTouchListener r0 = r0.userTouchListener
                r0.onTouch(r8, r9)
            L_0x00df:
                com.angel.zoom.ZoomImageView r8 = com.angel.zoom.ZoomImageView.this
                com.angel.zoom.ZoomImageView$OnTouchImageViewListener r8 = r8.touchImageViewListener
                if (r8 == 0) goto L_0x00f0
                com.angel.zoom.ZoomImageView r8 = com.angel.zoom.ZoomImageView.this
                com.angel.zoom.ZoomImageView$OnTouchImageViewListener r8 = r8.touchImageViewListener
                r8.onMove()
            L_0x00f0:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.angel.zoom.ZoomImageView.PrivateOnTouchListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private ScaleListener() {
        }

        /* synthetic */ ScaleListener(ZoomImageView zoomImageView, C10761 r2) {
            this();
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            ZoomImageView.this.setState(State.ZOOM);
            return true;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            ZoomImageView.this.scaleImage((double) scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), true);
            if (ZoomImageView.this.touchImageViewListener == null) {
                return true;
            }
            ZoomImageView.this.touchImageViewListener.onMove();
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
            ZoomImageView.this.setState(State.NONE);
            float access$700 = ZoomImageView.this.normalizedScale;
            boolean z = true;
            if (ZoomImageView.this.normalizedScale > ZoomImageView.this.maxScale) {
                access$700 = ZoomImageView.this.maxScale;
            } else if (ZoomImageView.this.normalizedScale < ZoomImageView.this.minScale) {
                access$700 = ZoomImageView.this.minScale;
            } else {
                z = false;
            }
            float f = access$700;
            if (z) {
                ZoomImageView zoomImageView = ZoomImageView.this;
                ZoomImageView.this.compatPostOnAnimation(new DoubleTapZoom(f, (float) (zoomImageView.viewWidth / 2), (float) (ZoomImageView.this.viewHeight / 2), true));
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

    private class DoubleTapZoom implements Runnable {
        private static final float ZOOM_TIME = 500.0f;
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
            ZoomImageView.this.setState(State.ANIMATE_ZOOM);
            this.startTime = System.currentTimeMillis();
            this.startZoom = ZoomImageView.this.normalizedScale;
            this.targetZoom = f;
            this.stretchImageToSuper = z;
            PointF access$2300 = ZoomImageView.this.transformCoordTouchToBitmap(f2, f3, false);
            this.bitmapX = access$2300.x;
            this.bitmapY = access$2300.y;
            this.startTouch = ZoomImageView.this.transformCoordBitmapToTouch(this.bitmapX, this.bitmapY);
            this.endTouch = new PointF((float) (ZoomImageView.this.viewWidth / 2), (float) (ZoomImageView.this.viewHeight / 2));
        }

        public void run() {
            float interpolate = interpolate();
            ZoomImageView.this.scaleImage(calculateDeltaScale(interpolate), this.bitmapX, this.bitmapY, this.stretchImageToSuper);
            translateImageToCenterTouchPosition(interpolate);
            ZoomImageView.this.fixScaleTrans();
            ZoomImageView zoomImageView = ZoomImageView.this;
            zoomImageView.setImageMatrix(zoomImageView.matrix);
            if (ZoomImageView.this.touchImageViewListener != null) {
                ZoomImageView.this.touchImageViewListener.onMove();
            }
            if (interpolate < 1.0f) {
                ZoomImageView.this.compatPostOnAnimation(this);
            } else {
                ZoomImageView.this.setState(State.NONE);
            }
        }

        private void translateImageToCenterTouchPosition(float f) {
            float f2 = this.startTouch.x + ((this.endTouch.x - this.startTouch.x) * f);
            float f3 = this.startTouch.y + (f * (this.endTouch.y - this.startTouch.y));
            PointF access$2400 = ZoomImageView.this.transformCoordBitmapToTouch(this.bitmapX, this.bitmapY);
            ZoomImageView.this.matrix.postTranslate(f2 - access$2400.x, f3 - access$2400.y);
        }

        private float interpolate() {
            return this.interpolator.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.startTime)) / ZOOM_TIME));
        }

        private double calculateDeltaScale(float f) {
            float f2 = this.startZoom;
            return ((double) (f2 + (f * (this.targetZoom - f2)))) / ((double) ZoomImageView.this.normalizedScale);
        }
    }

    /* access modifiers changed from: private */
    public PointF transformCoordTouchToBitmap(float f, float f2, boolean z) {
        this.matrix.getValues(this.f1184m);
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
        float[] fArr = this.f1184m;
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

    /* access modifiers changed from: private */
    public PointF transformCoordBitmapToTouch(float f, float f2) {
        this.matrix.getValues(this.f1184m);
        return new PointF(this.f1184m[2] + (getImageWidth() * (f / ((float) getDrawable().getIntrinsicWidth()))), this.f1184m[5] + (getImageHeight() * (f2 / ((float) getDrawable().getIntrinsicHeight()))));
    }

    private class Fling implements Runnable {
        int currX;
        int currY;
        CompatScroller scroller;

        Fling(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            ZoomImageView.this.setState(State.FLING);
            this.scroller = new CompatScroller(ZoomImageView.this.context);
            ZoomImageView.this.matrix.getValues(ZoomImageView.this.f1184m);
            int i7 = (int) ZoomImageView.this.f1184m[2];
            int i8 = (int) ZoomImageView.this.f1184m[5];
            if (ZoomImageView.this.getImageWidth() > ((float) ZoomImageView.this.viewWidth)) {
                i4 = ZoomImageView.this.viewWidth - ((int) ZoomImageView.this.getImageWidth());
                i3 = 0;
            } else {
                i4 = i7;
                i3 = i4;
            }
            if (ZoomImageView.this.getImageHeight() > ((float) ZoomImageView.this.viewHeight)) {
                i6 = ZoomImageView.this.viewHeight - ((int) ZoomImageView.this.getImageHeight());
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
                ZoomImageView.this.setState(State.NONE);
                this.scroller.forceFinished(true);
            }
        }

        public void run() {
            if (ZoomImageView.this.touchImageViewListener != null) {
                ZoomImageView.this.touchImageViewListener.onMove();
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
                ZoomImageView.this.matrix.postTranslate((float) i, (float) i2);
                ZoomImageView.this.fixTrans();
                ZoomImageView zoomImageView = ZoomImageView.this;
                zoomImageView.setImageMatrix(zoomImageView.matrix);
                ZoomImageView.this.compatPostOnAnimation(this);
            }
        }
    }

    private class CompatScroller {
        boolean isPreGingerbread;
        OverScroller overScroller;
        Scroller scroller;

        public CompatScroller(Context context) {
            if (Build.VERSION.SDK_INT < 9) {
                this.isPreGingerbread = true;
                this.scroller = new Scroller(context);
                return;
            }
            this.isPreGingerbread = false;
            this.overScroller = new OverScroller(context);
        }

        public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.isPreGingerbread) {
                this.scroller.fling(i, i2, i3, i4, i5, i6, i7, i8);
            } else {
                this.overScroller.fling(i, i2, i3, i4, i5, i6, i7, i8);
            }
        }

        public void forceFinished(boolean z) {
            if (this.isPreGingerbread) {
                this.scroller.forceFinished(z);
            } else {
                this.overScroller.forceFinished(z);
            }
        }

        public boolean isFinished() {
            if (this.isPreGingerbread) {
                return this.scroller.isFinished();
            }
            return this.overScroller.isFinished();
        }

        public boolean computeScrollOffset() {
            if (this.isPreGingerbread) {
                return this.scroller.computeScrollOffset();
            }
            this.overScroller.computeScrollOffset();
            return this.overScroller.computeScrollOffset();
        }

        public int getCurrX() {
            if (this.isPreGingerbread) {
                return this.scroller.getCurrX();
            }
            return this.overScroller.getCurrX();
        }

        public int getCurrY() {
            if (this.isPreGingerbread) {
                return this.scroller.getCurrY();
            }
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

    private class ZoomVariables {
        public float focusX;
        public float focusY;
        public float scale;
        public ImageView.ScaleType scaleType;

        public ZoomVariables(float f, float f2, float f3, ImageView.ScaleType scaleType2) {
            this.scale = f;
            this.focusX = f2;
            this.focusY = f3;
            this.scaleType = scaleType2;
        }
    }
}
