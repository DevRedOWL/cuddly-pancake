package org.opencv.core;

import com.github.mikephil.charting.utils.Utils;

public class Point {

    /* renamed from: x */
    public double f6481x;

    /* renamed from: y */
    public double f6482y;

    public Point(double d, double d2) {
        this.f6481x = d;
        this.f6482y = d2;
    }

    public Point() {
        this(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON);
    }

    public Point(double[] dArr) {
        this();
        set(dArr);
    }

    public void set(double[] dArr) {
        double d = Utils.DOUBLE_EPSILON;
        if (dArr != null) {
            this.f6481x = dArr.length > 0 ? dArr[0] : 0.0d;
            if (dArr.length > 1) {
                d = dArr[1];
            }
            this.f6482y = d;
            return;
        }
        this.f6481x = Utils.DOUBLE_EPSILON;
        this.f6482y = Utils.DOUBLE_EPSILON;
    }

    public Point clone() {
        return new Point(this.f6481x, this.f6482y);
    }

    public double dot(Point point) {
        return (this.f6481x * point.f6481x) + (this.f6482y * point.f6482y);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f6481x);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f6482y);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return this.f6481x == point.f6481x && this.f6482y == point.f6482y;
    }

    public boolean inside(Rect rect) {
        return rect.contains(this);
    }

    public String toString() {
        return "{" + this.f6481x + ", " + this.f6482y + "}";
    }
}
