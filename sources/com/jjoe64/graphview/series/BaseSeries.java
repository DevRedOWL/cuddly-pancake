package com.jjoe64.graphview.series;

import android.graphics.Canvas;
import android.graphics.PointF;
import com.github.mikephil.charting.utils.Utils;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPointInterface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class BaseSeries<E extends DataPointInterface> implements Series<E> {
    private int mColor = -16746548;
    /* access modifiers changed from: private */
    public final List<E> mData = new ArrayList();
    private Map<PointF, E> mDataPoints = new HashMap();
    private List<WeakReference<GraphView>> mGraphViews = new ArrayList();
    private double mHighestYCache = Double.NaN;
    private Boolean mIsCursorModeCache;
    private double mLowestYCache = Double.NaN;
    protected OnDataPointTapListener mOnDataPointTapListener;
    private String mTitle;

    public abstract void drawSelection(GraphView graphView, Canvas canvas, boolean z, DataPointInterface dataPointInterface);

    public BaseSeries() {
    }

    public BaseSeries(E[] eArr) {
        for (E add : eArr) {
            this.mData.add(add);
        }
        checkValueOrder((DataPointInterface) null);
    }

    public double getLowestValueX() {
        if (this.mData.isEmpty()) {
            return Utils.DOUBLE_EPSILON;
        }
        return ((DataPointInterface) this.mData.get(0)).getX();
    }

    public double getHighestValueX() {
        if (this.mData.isEmpty()) {
            return Utils.DOUBLE_EPSILON;
        }
        List<E> list = this.mData;
        return ((DataPointInterface) list.get(list.size() - 1)).getX();
    }

    public double getLowestValueY() {
        if (this.mData.isEmpty()) {
            return Utils.DOUBLE_EPSILON;
        }
        if (!Double.isNaN(this.mLowestYCache)) {
            return this.mLowestYCache;
        }
        double y = ((DataPointInterface) this.mData.get(0)).getY();
        for (int i = 1; i < this.mData.size(); i++) {
            double y2 = ((DataPointInterface) this.mData.get(i)).getY();
            if (y > y2) {
                y = y2;
            }
        }
        this.mLowestYCache = y;
        return y;
    }

    public double getHighestValueY() {
        if (this.mData.isEmpty()) {
            return Utils.DOUBLE_EPSILON;
        }
        if (!Double.isNaN(this.mHighestYCache)) {
            return this.mHighestYCache;
        }
        double y = ((DataPointInterface) this.mData.get(0)).getY();
        for (int i = 1; i < this.mData.size(); i++) {
            double y2 = ((DataPointInterface) this.mData.get(i)).getY();
            if (y < y2) {
                y = y2;
            }
        }
        this.mHighestYCache = y;
        return y;
    }

    public Iterator<E> getValues(double d, double d2) {
        if (d <= getLowestValueX() && d2 >= getHighestValueX()) {
            return this.mData.iterator();
        }
        final double d3 = d;
        final double d4 = d2;
        return new Iterator<E>() {
            E nextNextValue = null;
            E nextValue = null;

            /* renamed from: org  reason: collision with root package name */
            Iterator<E> f7030org = BaseSeries.this.mData.iterator();
            boolean plusOne;

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
            /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            {
                /*
                    r3 = this;
                    com.jjoe64.graphview.series.BaseSeries.this = r4
                    r2 = r5
                    r4 = r7
                    r3.<init>()
                    com.jjoe64.graphview.series.BaseSeries r4 = com.jjoe64.graphview.series.BaseSeries.this
                    java.util.List r4 = r4.mData
                    java.util.Iterator r4 = r4.iterator()
                    r3.f7030org = r4
                    r4 = 0
                    r3.nextValue = r4
                    r3.nextNextValue = r4
                    r5 = 1
                    r3.plusOne = r5
                    java.util.Iterator<E> r6 = r3.f7030org
                    boolean r6 = r6.hasNext()
                    if (r6 == 0) goto L_0x002e
                    java.util.Iterator<E> r6 = r3.f7030org
                    java.lang.Object r6 = r6.next()
                    com.jjoe64.graphview.series.DataPointInterface r6 = (com.jjoe64.graphview.series.DataPointInterface) r6
                    goto L_0x002f
                L_0x002e:
                    r6 = r4
                L_0x002f:
                    if (r6 == 0) goto L_0x0066
                    double r7 = r6.getX()
                    double r0 = r2
                    int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                    if (r2 < 0) goto L_0x003e
                    r3.nextValue = r6
                    goto L_0x0067
                L_0x003e:
                    java.util.Iterator<E> r7 = r3.f7030org
                    boolean r7 = r7.hasNext()
                    if (r7 == 0) goto L_0x0066
                    java.util.Iterator<E> r7 = r3.f7030org
                    java.lang.Object r7 = r7.next()
                    com.jjoe64.graphview.series.DataPointInterface r7 = (com.jjoe64.graphview.series.DataPointInterface) r7
                    r3.nextValue = r7
                    E r7 = r3.nextValue
                    double r7 = r7.getX()
                    double r0 = r2
                    int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                    if (r2 < 0) goto L_0x0063
                    E r7 = r3.nextValue
                    r3.nextNextValue = r7
                    r3.nextValue = r6
                    goto L_0x0067
                L_0x0063:
                    E r6 = r3.nextValue
                    goto L_0x003e
                L_0x0066:
                    r5 = 0
                L_0x0067:
                    if (r5 != 0) goto L_0x006b
                    r3.nextValue = r4
                L_0x006b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.jjoe64.graphview.series.BaseSeries.C27521.<init>(com.jjoe64.graphview.series.BaseSeries, double, double):void");
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

            public E next() {
                if (hasNext()) {
                    E e = this.nextValue;
                    if (e.getX() > d4) {
                        this.plusOne = false;
                    }
                    E e2 = this.nextNextValue;
                    if (e2 != null) {
                        this.nextValue = e2;
                        this.nextNextValue = null;
                    } else if (this.f7030org.hasNext()) {
                        this.nextValue = (DataPointInterface) this.f7030org.next();
                    } else {
                        this.nextValue = null;
                    }
                    return e;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                E e = this.nextValue;
                return e != null && (e.getX() <= d4 || this.plusOne);
            }
        };
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public int getColor() {
        return this.mColor;
    }

    public void setColor(int i) {
        this.mColor = i;
    }

    public void setOnDataPointTapListener(OnDataPointTapListener onDataPointTapListener) {
        this.mOnDataPointTapListener = onDataPointTapListener;
    }

    public void onTap(float f, float f2) {
        DataPointInterface findDataPoint;
        if (this.mOnDataPointTapListener != null && (findDataPoint = findDataPoint(f, f2)) != null) {
            this.mOnDataPointTapListener.onTap(this, findDataPoint);
        }
    }

    /* access modifiers changed from: protected */
    public E findDataPoint(float f, float f2) {
        E e = null;
        float f3 = Float.NaN;
        for (Map.Entry next : this.mDataPoints.entrySet()) {
            float f4 = ((PointF) next.getKey()).x - f;
            float f5 = ((PointF) next.getKey()).y - f2;
            float sqrt = (float) Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
            if (e == null || sqrt < f3) {
                e = (DataPointInterface) next.getValue();
                f3 = sqrt;
            }
        }
        if (e == null || f3 >= 120.0f) {
            return null;
        }
        return e;
    }

    public E findDataPointAtX(float f) {
        E e = null;
        float f2 = Float.NaN;
        for (Map.Entry next : this.mDataPoints.entrySet()) {
            float abs = Math.abs(((PointF) next.getKey()).x - f);
            if (e == null || abs < f2) {
                e = (DataPointInterface) next.getValue();
                f2 = abs;
            }
        }
        if (e == null || f2 >= 200.0f) {
            return null;
        }
        return e;
    }

    /* access modifiers changed from: protected */
    public void registerDataPoint(float f, float f2, E e) {
        if (this.mOnDataPointTapListener != null || isCursorMode()) {
            this.mDataPoints.put(new PointF(f, f2), e);
        }
    }

    private boolean isCursorMode() {
        Boolean bool = this.mIsCursorModeCache;
        if (bool != null) {
            return bool.booleanValue();
        }
        for (WeakReference next : this.mGraphViews) {
            if (next != null && next.get() != null && ((GraphView) next.get()).isCursorMode()) {
                Boolean bool2 = true;
                this.mIsCursorModeCache = bool2;
                return bool2.booleanValue();
            }
        }
        Boolean bool3 = false;
        this.mIsCursorModeCache = bool3;
        return bool3.booleanValue();
    }

    /* access modifiers changed from: protected */
    public void resetDataPoints() {
        this.mDataPoints.clear();
    }

    public void resetData(E[] eArr) {
        this.mData.clear();
        for (E add : eArr) {
            this.mData.add(add);
        }
        checkValueOrder((DataPointInterface) null);
        this.mLowestYCache = Double.NaN;
        this.mHighestYCache = Double.NaN;
        for (WeakReference next : this.mGraphViews) {
            if (!(next == null || next.get() == null)) {
                ((GraphView) next.get()).onDataChanged(true, false);
            }
        }
    }

    public void onGraphViewAttached(GraphView graphView) {
        this.mGraphViews.add(new WeakReference(graphView));
    }

    public void appendData(E e, boolean z, int i, boolean z2) {
        checkValueOrder(e);
        boolean z3 = true;
        if (!this.mData.isEmpty()) {
            double x = e.getX();
            List<E> list = this.mData;
            if (x < ((DataPointInterface) list.get(list.size() - 1)).getX()) {
                throw new IllegalArgumentException("new x-value must be greater then the last value. x-values has to be ordered in ASC.");
            }
        }
        synchronized (this.mData) {
            if (this.mData.size() < i) {
                this.mData.add(e);
            } else {
                this.mData.remove(0);
                this.mData.add(e);
            }
            double y = e.getY();
            if (!Double.isNaN(this.mHighestYCache) && y > this.mHighestYCache) {
                this.mHighestYCache = y;
            }
            if (!Double.isNaN(this.mLowestYCache) && y < this.mLowestYCache) {
                this.mLowestYCache = y;
            }
        }
        if (!z2) {
            if (this.mData.size() == 1) {
                z3 = false;
            }
            for (WeakReference next : this.mGraphViews) {
                if (!(next == null || next.get() == null)) {
                    if (z) {
                        ((GraphView) next.get()).getViewport().scrollToEnd();
                    } else {
                        ((GraphView) next.get()).onDataChanged(z3, z);
                    }
                }
            }
        }
    }

    public void appendData(E e, boolean z, int i) {
        appendData(e, z, i, false);
    }

    public boolean isEmpty() {
        return this.mData.isEmpty();
    }

    /* access modifiers changed from: protected */
    public void checkValueOrder(DataPointInterface dataPointInterface) {
        if (this.mData.size() <= 1) {
            return;
        }
        if (dataPointInterface != null) {
            double x = dataPointInterface.getX();
            List<E> list = this.mData;
            if (x < ((DataPointInterface) list.get(list.size() - 1)).getX()) {
                throw new IllegalArgumentException("new x-value must be greater then the last value. x-values has to be ordered in ASC.");
            }
            return;
        }
        double x2 = ((DataPointInterface) this.mData.get(0)).getX();
        for (int i = 1; i < this.mData.size(); i++) {
            if (((DataPointInterface) this.mData.get(i)).getX() != Double.NaN) {
                if (x2 <= ((DataPointInterface) this.mData.get(i)).getX()) {
                    x2 = ((DataPointInterface) this.mData.get(i)).getX();
                } else {
                    throw new IllegalArgumentException("The order of the values is not correct. X-Values have to be ordered ASC. First the lowest x value and at least the highest x value.");
                }
            }
        }
    }

    public void clearCursorModeCache() {
        this.mIsCursorModeCache = null;
    }

    public void clearReference(GraphView graphView) {
        for (WeakReference next : this.mGraphViews) {
            if (next != null && next.get() != null && next.get() == graphView) {
                this.mGraphViews.remove(next);
                return;
            }
        }
    }
}
