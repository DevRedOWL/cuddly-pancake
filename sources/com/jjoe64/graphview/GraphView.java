package com.jjoe64.graphview;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.jjoe64.graphview.series.BaseSeries;
import com.jjoe64.graphview.series.Series;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GraphView extends View {
    private CursorMode mCursorMode;
    private GridLabelRenderer mGridLabelRenderer;
    private boolean mIsCursorMode;
    private LegendRenderer mLegendRenderer;
    private Paint mPaintTitle;
    private Paint mPreviewPaint;
    protected SecondScale mSecondScale;
    private List<Series> mSeries;
    private Styles mStyles;
    private TapDetector mTapDetector;
    private String mTitle;
    private Viewport mViewport;

    private static final class Styles {
        int titleColor;
        float titleTextSize;

        private Styles() {
        }
    }

    private class TapDetector {
        private long lastDown;
        private PointF lastPoint;

        private TapDetector() {
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.lastDown = System.currentTimeMillis();
                this.lastPoint = new PointF(motionEvent.getX(), motionEvent.getY());
                return false;
            } else if (this.lastDown <= 0 || motionEvent.getAction() != 2) {
                if (motionEvent.getAction() != 1 || System.currentTimeMillis() - this.lastDown >= 400) {
                    return false;
                }
                return true;
            } else if (Math.abs(motionEvent.getX() - this.lastPoint.x) <= 60.0f && Math.abs(motionEvent.getY() - this.lastPoint.y) <= 60.0f) {
                return false;
            } else {
                this.lastDown = 0;
                return false;
            }
        }
    }

    public GraphView(Context context) {
        super(context);
        init();
    }

    public GraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public GraphView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.mPreviewPaint = new Paint();
        this.mPreviewPaint.setTextAlign(Paint.Align.CENTER);
        this.mPreviewPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.mPreviewPaint.setTextSize(50.0f);
        this.mStyles = new Styles();
        this.mViewport = new Viewport(this);
        this.mGridLabelRenderer = new GridLabelRenderer(this);
        this.mLegendRenderer = new LegendRenderer(this);
        this.mSeries = new ArrayList();
        this.mPaintTitle = new Paint();
        this.mTapDetector = new TapDetector();
        loadStyles();
    }

    /* access modifiers changed from: protected */
    public void loadStyles() {
        this.mStyles.titleColor = this.mGridLabelRenderer.getHorizontalLabelsColor();
        this.mStyles.titleTextSize = this.mGridLabelRenderer.getTextSize();
    }

    public GridLabelRenderer getGridLabelRenderer() {
        return this.mGridLabelRenderer;
    }

    public void addSeries(Series series) {
        series.onGraphViewAttached(this);
        this.mSeries.add(series);
        onDataChanged(false, false);
    }

    public List<Series> getSeries() {
        return this.mSeries;
    }

    public void onDataChanged(boolean z, boolean z2) {
        this.mViewport.calcCompleteRange();
        SecondScale secondScale = this.mSecondScale;
        if (secondScale != null) {
            secondScale.calcCompleteRange();
        }
        this.mGridLabelRenderer.invalidate(z, z2);
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void drawGraphElements(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 11 && !canvas.isHardwareAccelerated()) {
            Log.w("GraphView", "GraphView should be used in hardware accelerated mode.You can use android:hardwareAccelerated=\"true\" on your activity. Read this for more info:https://developer.android.com/guide/topics/graphics/hardware-accel.html");
        }
        drawTitle(canvas);
        this.mViewport.drawFirst(canvas);
        this.mGridLabelRenderer.draw(canvas);
        for (Series draw : this.mSeries) {
            draw.draw(this, canvas, false);
        }
        SecondScale secondScale = this.mSecondScale;
        if (secondScale != null) {
            for (Series draw2 : secondScale.getSeries()) {
                draw2.draw(this, canvas, true);
            }
        }
        CursorMode cursorMode = this.mCursorMode;
        if (cursorMode != null) {
            cursorMode.draw(canvas);
        }
        this.mViewport.draw(canvas);
        this.mLegendRenderer.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawColor(Color.rgb(200, 200, 200));
            canvas.drawText("GraphView: No Preview available", (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2), this.mPreviewPaint);
            return;
        }
        drawGraphElements(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawTitle(Canvas canvas) {
        String str = this.mTitle;
        if (str != null && str.length() > 0) {
            this.mPaintTitle.setColor(this.mStyles.titleColor);
            this.mPaintTitle.setTextSize(this.mStyles.titleTextSize);
            this.mPaintTitle.setTextAlign(Paint.Align.CENTER);
            float textSize = this.mPaintTitle.getTextSize();
            canvas.drawText(this.mTitle, (float) (canvas.getWidth() / 2), textSize, this.mPaintTitle);
        }
    }

    /* access modifiers changed from: protected */
    public int getTitleHeight() {
        String str = this.mTitle;
        if (str == null || str.length() <= 0) {
            return 0;
        }
        return (int) this.mPaintTitle.getTextSize();
    }

    public Viewport getViewport() {
        return this.mViewport;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        onDataChanged(false, false);
    }

    public int getGraphContentLeft() {
        return getGridLabelRenderer().getStyles().padding + getGridLabelRenderer().getLabelVerticalWidth() + getGridLabelRenderer().getVerticalAxisTitleWidth();
    }

    public int getGraphContentTop() {
        return getGridLabelRenderer().getStyles().padding + getTitleHeight();
    }

    public int getGraphContentHeight() {
        return (((getHeight() - (getGridLabelRenderer().getStyles().padding * 2)) - getGridLabelRenderer().getLabelHorizontalHeight()) - getTitleHeight()) - getGridLabelRenderer().getHorizontalAxisTitleHeight();
    }

    public int getGraphContentWidth() {
        int width = (getWidth() - (getGridLabelRenderer().getStyles().padding * 2)) - getGridLabelRenderer().getLabelVerticalWidth();
        return this.mSecondScale != null ? (int) (((float) (width - getGridLabelRenderer().getLabelVerticalSecondScaleWidth())) - this.mSecondScale.getVerticalAxisTitleTextSize()) : width;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.mViewport.onTouchEvent(motionEvent);
        boolean onTouchEvent2 = super.onTouchEvent(motionEvent);
        if (this.mTapDetector.onTouchEvent(motionEvent)) {
            for (Series onTap : this.mSeries) {
                onTap.onTap(motionEvent.getX(), motionEvent.getY());
            }
            SecondScale secondScale = this.mSecondScale;
            if (secondScale != null) {
                for (Series onTap2 : secondScale.getSeries()) {
                    onTap2.onTap(motionEvent.getX(), motionEvent.getY());
                }
            }
        }
        return onTouchEvent || onTouchEvent2;
    }

    public void computeScroll() {
        super.computeScroll();
        this.mViewport.computeScroll();
    }

    public LegendRenderer getLegendRenderer() {
        return this.mLegendRenderer;
    }

    public void setLegendRenderer(LegendRenderer legendRenderer) {
        this.mLegendRenderer = legendRenderer;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public float getTitleTextSize() {
        return this.mStyles.titleTextSize;
    }

    public void setTitleTextSize(float f) {
        this.mStyles.titleTextSize = f;
    }

    public int getTitleColor() {
        return this.mStyles.titleColor;
    }

    public void setTitleColor(int i) {
        this.mStyles.titleColor = i;
    }

    public SecondScale getSecondScale() {
        if (this.mSecondScale == null) {
            this.mSecondScale = new SecondScale(this);
            this.mSecondScale.setVerticalAxisTitleTextSize(this.mGridLabelRenderer.mStyles.textSize);
        }
        return this.mSecondScale;
    }

    public void clearSecondScale() {
        SecondScale secondScale = this.mSecondScale;
        if (secondScale != null) {
            secondScale.removeAllSeries();
            this.mSecondScale = null;
        }
    }

    public void removeAllSeries() {
        this.mSeries.clear();
        onDataChanged(false, false);
    }

    public void removeSeries(Series<?> series) {
        this.mSeries.remove(series);
        onDataChanged(false, false);
    }

    public Bitmap takeSnapshot() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public void takeSnapshotAndShare(Context context, String str, String str2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap takeSnapshot = takeSnapshot();
        takeSnapshot.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        String insertImage = MediaStore.Images.Media.insertImage(context.getContentResolver(), takeSnapshot, str, (String) null);
        if (insertImage != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(insertImage));
            try {
                context.startActivity(Intent.createChooser(intent, str2));
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            throw new SecurityException("Could not get path from MediaStore. Please check permissions.");
        }
    }

    public void setCursorMode(boolean z) {
        this.mIsCursorMode = z;
        if (!this.mIsCursorMode) {
            this.mCursorMode = null;
            invalidate();
        } else if (this.mCursorMode == null) {
            this.mCursorMode = new CursorMode(this);
        }
        for (Series next : this.mSeries) {
            if (next instanceof BaseSeries) {
                ((BaseSeries) next).clearCursorModeCache();
            }
        }
    }

    public CursorMode getCursorMode() {
        return this.mCursorMode;
    }

    public boolean isCursorMode() {
        return this.mIsCursorMode;
    }
}
