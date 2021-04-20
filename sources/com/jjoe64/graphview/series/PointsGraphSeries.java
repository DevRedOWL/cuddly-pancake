package com.jjoe64.graphview.series;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import com.github.mikephil.charting.utils.Utils;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPointInterface;
import java.util.Iterator;

public class PointsGraphSeries<E extends DataPointInterface> extends BaseSeries<E> {
    private CustomShape mCustomShape;
    private Paint mPaint;
    private PointsGraphSeries<E>.Styles mStyles;

    public interface CustomShape {
        void draw(Canvas canvas, Paint paint, float f, float f2, DataPointInterface dataPointInterface);
    }

    public enum Shape {
        POINT,
        TRIANGLE,
        RECTANGLE
    }

    public void drawSelection(GraphView graphView, Canvas canvas, boolean z, DataPointInterface dataPointInterface) {
    }

    private final class Styles {
        Shape shape;
        float size;

        private Styles() {
        }
    }

    public PointsGraphSeries() {
        init();
    }

    public PointsGraphSeries(E[] eArr) {
        super(eArr);
        init();
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.mStyles = new Styles();
        this.mStyles.size = 20.0f;
        this.mPaint = new Paint();
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        setShape(Shape.POINT);
    }

    public void draw(GraphView graphView, Canvas canvas, boolean z) {
        double d;
        double d2;
        float f;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        resetDataPoints();
        double maxX = graphView.getViewport().getMaxX(false);
        double minX = graphView.getViewport().getMinX(false);
        if (z) {
            d2 = graphView.getSecondScale().getMaxY(false);
            d = graphView.getSecondScale().getMinY(false);
        } else {
            d2 = graphView.getViewport().getMaxY(false);
            d = graphView.getViewport().getMinY(false);
        }
        double d3 = d;
        Iterator values = getValues(minX, maxX);
        this.mPaint.setColor(getColor());
        double d4 = d2 - d3;
        double d5 = maxX - minX;
        float graphContentHeight = (float) graphView.getGraphContentHeight();
        float graphContentWidth = (float) graphView.getGraphContentWidth();
        float graphContentLeft = (float) graphView.getGraphContentLeft();
        float graphContentTop = (float) graphView.getGraphContentTop();
        while (values.hasNext()) {
            DataPointInterface dataPointInterface = (DataPointInterface) values.next();
            double d6 = minX;
            double d7 = (double) graphContentHeight;
            double y = ((dataPointInterface.getY() - d3) / d4) * d7;
            double d8 = d3;
            double d9 = (double) graphContentWidth;
            Iterator it = values;
            double x = d9 * ((dataPointInterface.getX() - d6) / d5);
            boolean z2 = x > d9;
            if (y < Utils.DOUBLE_EPSILON) {
                z2 = true;
            }
            if (y > d7) {
                z2 = true;
            }
            if (x < Utils.DOUBLE_EPSILON) {
                z2 = true;
            }
            float f5 = ((float) x) + 1.0f + graphContentLeft;
            float f6 = ((float) (((double) graphContentTop) - y)) + graphContentHeight;
            registerDataPoint(f5, f6, dataPointInterface);
            if (!z2) {
                CustomShape customShape = this.mCustomShape;
                if (customShape != null) {
                    f3 = graphContentTop;
                    f4 = graphContentLeft;
                    f2 = graphContentWidth;
                    f = graphContentHeight;
                    customShape.draw(canvas, this.mPaint, f5, f6, dataPointInterface);
                } else {
                    f3 = graphContentTop;
                    f4 = graphContentLeft;
                    f2 = graphContentWidth;
                    f = graphContentHeight;
                    if (this.mStyles.shape == Shape.POINT) {
                        canvas2.drawCircle(f5, f6, this.mStyles.size, this.mPaint);
                    } else if (this.mStyles.shape == Shape.RECTANGLE) {
                        canvas.drawRect(f5 - this.mStyles.size, f6 - this.mStyles.size, f5 + this.mStyles.size, f6 + this.mStyles.size, this.mPaint);
                    } else if (this.mStyles.shape == Shape.TRIANGLE) {
                        Point[] pointArr = new Point[3];
                        pointArr[0] = new Point((int) f5, (int) (f6 - getSize()));
                        double d10 = (double) f6;
                        Point[] pointArr2 = pointArr;
                        pointArr2[1] = new Point((int) (getSize() + f5), (int) ((((double) getSize()) * 0.67d) + d10));
                        pointArr2[2] = new Point((int) (f5 - getSize()), (int) (d10 + (((double) getSize()) * 0.67d)));
                        drawArrows(pointArr2, canvas2, this.mPaint);
                        graphContentLeft = f4;
                        graphContentTop = f3;
                        graphContentWidth = f2;
                        graphContentHeight = f;
                        minX = d6;
                        d3 = d8;
                        values = it;
                    }
                }
            } else {
                f3 = graphContentTop;
                f4 = graphContentLeft;
                f2 = graphContentWidth;
                f = graphContentHeight;
            }
            graphContentLeft = f4;
            graphContentTop = f3;
            graphContentWidth = f2;
            graphContentHeight = f;
            minX = d6;
            d3 = d8;
            values = it;
        }
    }

    private void drawArrows(Point[] pointArr, Canvas canvas, Paint paint) {
        Canvas canvas2 = canvas;
        canvas2.drawVertices(Canvas.VertexMode.TRIANGLES, 8, new float[]{(float) pointArr[0].x, (float) pointArr[0].y, (float) pointArr[1].x, (float) pointArr[1].y, (float) pointArr[2].x, (float) pointArr[2].y, (float) pointArr[0].x, (float) pointArr[0].y}, 0, (float[]) null, 0, (int[]) null, 0, (short[]) null, 0, 0, paint);
        Path path = new Path();
        path.moveTo((float) pointArr[0].x, (float) pointArr[0].y);
        path.lineTo((float) pointArr[1].x, (float) pointArr[1].y);
        path.lineTo((float) pointArr[2].x, (float) pointArr[2].y);
        canvas.drawPath(path, paint);
    }

    public float getSize() {
        return this.mStyles.size;
    }

    public void setSize(float f) {
        this.mStyles.size = f;
    }

    public Shape getShape() {
        return this.mStyles.shape;
    }

    public void setShape(Shape shape) {
        this.mStyles.shape = shape;
    }

    public void setCustomShape(CustomShape customShape) {
        this.mCustomShape = customShape;
    }
}
