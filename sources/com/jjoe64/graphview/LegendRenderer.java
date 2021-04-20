package com.jjoe64.graphview;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import androidx.core.view.ViewCompat;
import com.jjoe64.graphview.series.Series;
import java.util.ArrayList;
import java.util.List;

public class LegendRenderer {
    private int cachedLegendWidth;
    private final GraphView mGraphView;
    private boolean mIsVisible = false;
    private Paint mPaint = new Paint();
    private Styles mStyles;

    public enum LegendAlign {
        TOP,
        MIDDLE,
        BOTTOM
    }

    private final class Styles {
        LegendAlign align;
        int backgroundColor;
        Point fixedPosition;
        int margin;
        int padding;
        int spacing;
        int textColor;
        float textSize;
        int width;

        private Styles() {
        }

        /* synthetic */ Styles(LegendRenderer legendRenderer, C27451 r2) {
            this();
        }
    }

    public LegendRenderer(GraphView graphView) {
        this.mGraphView = graphView;
        this.mPaint.setTextAlign(Paint.Align.LEFT);
        this.mStyles = new Styles(this, (C27451) null);
        this.cachedLegendWidth = 0;
        resetStyles();
    }

    public void resetStyles() {
        this.mStyles.align = LegendAlign.MIDDLE;
        this.mStyles.textSize = this.mGraphView.getGridLabelRenderer().getTextSize();
        Styles styles = this.mStyles;
        styles.spacing = (int) (styles.textSize / 5.0f);
        Styles styles2 = this.mStyles;
        styles2.padding = (int) (styles2.textSize / 2.0f);
        Styles styles3 = this.mStyles;
        styles3.width = 0;
        styles3.backgroundColor = Color.argb(180, 100, 100, 100);
        Styles styles4 = this.mStyles;
        styles4.margin = (int) (styles4.textSize / 5.0f);
        TypedValue typedValue = new TypedValue();
        this.mGraphView.getContext().getTheme().resolveAttribute(16842818, typedValue, true);
        int i = ViewCompat.MEASURED_STATE_MASK;
        try {
            TypedArray obtainStyledAttributes = this.mGraphView.getContext().obtainStyledAttributes(typedValue.data, new int[]{16842806});
            int color = obtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
            obtainStyledAttributes.recycle();
            i = color;
        } catch (Exception unused) {
        }
        this.mStyles.textColor = i;
        this.cachedLegendWidth = 0;
    }

    /* access modifiers changed from: protected */
    public List<Series> getAllSeries() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mGraphView.getSeries());
        if (this.mGraphView.mSecondScale != null) {
            arrayList.addAll(this.mGraphView.getSecondScale().getSeries());
        }
        return arrayList;
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        float height;
        float f3;
        Canvas canvas2 = canvas;
        if (this.mIsVisible) {
            this.mPaint.setTextSize(this.mStyles.textSize);
            int i = (int) (((double) this.mStyles.textSize) * 0.8d);
            List<Series> allSeries = getAllSeries();
            int i2 = this.mStyles.width;
            int i3 = 0;
            if (i2 == 0 && (i2 = this.cachedLegendWidth) == 0) {
                Rect rect = new Rect();
                for (Series next : allSeries) {
                    if (next.getTitle() != null) {
                        this.mPaint.getTextBounds(next.getTitle(), 0, next.getTitle().length(), rect);
                        i2 = Math.max(i2, rect.width());
                    }
                }
                if (i2 == 0) {
                    i2 = 1;
                }
                i2 += (this.mStyles.padding * 2) + i + this.mStyles.spacing;
                this.cachedLegendWidth = i2;
            }
            float size = ((this.mStyles.textSize + ((float) this.mStyles.spacing)) * ((float) allSeries.size())) - ((float) this.mStyles.spacing);
            if (this.mStyles.fixedPosition != null) {
                float graphContentTop = (float) (this.mGraphView.getGraphContentTop() + this.mStyles.margin + this.mStyles.fixedPosition.y);
                f = (float) (this.mGraphView.getGraphContentLeft() + this.mStyles.margin + this.mStyles.fixedPosition.x);
                f2 = graphContentTop;
            } else {
                f = (float) (((this.mGraphView.getGraphContentLeft() + this.mGraphView.getGraphContentWidth()) - i2) - this.mStyles.margin);
                int i4 = C27451.$SwitchMap$com$jjoe64$graphview$LegendRenderer$LegendAlign[this.mStyles.align.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        height = ((float) ((this.mGraphView.getGraphContentTop() + this.mGraphView.getGraphContentHeight()) - this.mStyles.margin)) - size;
                        f3 = (float) (this.mStyles.padding * 2);
                    } else {
                        height = (float) (this.mGraphView.getHeight() / 2);
                        f3 = size / 2.0f;
                    }
                    f2 = height - f3;
                } else {
                    f2 = (float) (this.mGraphView.getGraphContentTop() + this.mStyles.margin);
                }
            }
            float f4 = size + f2 + ((float) (this.mStyles.padding * 2));
            this.mPaint.setColor(this.mStyles.backgroundColor);
            canvas2.drawRoundRect(new RectF(f, f2, ((float) i2) + f, f4), 8.0f, 8.0f, this.mPaint);
            for (Series next2 : allSeries) {
                this.mPaint.setColor(next2.getColor());
                float f5 = (float) i3;
                float f6 = (float) i;
                int i5 = i;
                canvas2.drawRect(new RectF(((float) this.mStyles.padding) + f, ((float) this.mStyles.padding) + f2 + ((this.mStyles.textSize + ((float) this.mStyles.spacing)) * f5), ((float) this.mStyles.padding) + f + f6, ((float) this.mStyles.padding) + f2 + ((this.mStyles.textSize + ((float) this.mStyles.spacing)) * f5) + f6), this.mPaint);
                if (next2.getTitle() != null) {
                    this.mPaint.setColor(this.mStyles.textColor);
                    canvas2.drawText(next2.getTitle(), ((float) this.mStyles.padding) + f + f6 + ((float) this.mStyles.spacing), ((float) this.mStyles.padding) + f2 + this.mStyles.textSize + (f5 * (this.mStyles.textSize + ((float) this.mStyles.spacing))), this.mPaint);
                }
                i3++;
                i = i5;
            }
        }
    }

    /* renamed from: com.jjoe64.graphview.LegendRenderer$1 */
    static /* synthetic */ class C27451 {
        static final /* synthetic */ int[] $SwitchMap$com$jjoe64$graphview$LegendRenderer$LegendAlign = new int[LegendAlign.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.jjoe64.graphview.LegendRenderer$LegendAlign[] r0 = com.jjoe64.graphview.LegendRenderer.LegendAlign.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$jjoe64$graphview$LegendRenderer$LegendAlign = r0
                int[] r0 = $SwitchMap$com$jjoe64$graphview$LegendRenderer$LegendAlign     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.jjoe64.graphview.LegendRenderer$LegendAlign r1 = com.jjoe64.graphview.LegendRenderer.LegendAlign.TOP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$jjoe64$graphview$LegendRenderer$LegendAlign     // Catch:{ NoSuchFieldError -> 0x001f }
                com.jjoe64.graphview.LegendRenderer$LegendAlign r1 = com.jjoe64.graphview.LegendRenderer.LegendAlign.MIDDLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jjoe64.graphview.LegendRenderer.C27451.<clinit>():void");
        }
    }

    public boolean isVisible() {
        return this.mIsVisible;
    }

    public void setVisible(boolean z) {
        this.mIsVisible = z;
    }

    public float getTextSize() {
        return this.mStyles.textSize;
    }

    public void setTextSize(float f) {
        this.mStyles.textSize = f;
        this.cachedLegendWidth = 0;
    }

    public int getSpacing() {
        return this.mStyles.spacing;
    }

    public void setSpacing(int i) {
        this.mStyles.spacing = i;
    }

    public int getPadding() {
        return this.mStyles.padding;
    }

    public void setPadding(int i) {
        this.mStyles.padding = i;
    }

    public int getWidth() {
        return this.mStyles.width;
    }

    public void setWidth(int i) {
        this.mStyles.width = i;
    }

    public int getBackgroundColor() {
        return this.mStyles.backgroundColor;
    }

    public void setBackgroundColor(int i) {
        this.mStyles.backgroundColor = i;
    }

    public int getMargin() {
        return this.mStyles.margin;
    }

    public void setMargin(int i) {
        this.mStyles.margin = i;
    }

    public LegendAlign getAlign() {
        return this.mStyles.align;
    }

    public void setAlign(LegendAlign legendAlign) {
        this.mStyles.align = legendAlign;
    }

    public int getTextColor() {
        return this.mStyles.textColor;
    }

    public void setTextColor(int i) {
        this.mStyles.textColor = i;
    }

    public void setFixedPosition(int i, int i2) {
        this.mStyles.fixedPosition = new Point(i, i2);
    }
}
