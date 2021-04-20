package org.opencv.core;

import com.github.mikephil.charting.utils.Utils;

public class Point3 {

    /* renamed from: x */
    public double f6483x;

    /* renamed from: y */
    public double f6484y;

    /* renamed from: z */
    public double f6485z;

    public Point3(double d, double d2, double d3) {
        this.f6483x = d;
        this.f6484y = d2;
        this.f6485z = d3;
    }

    public Point3() {
        this(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON);
    }

    public Point3(Point point) {
        this.f6483x = point.f6481x;
        this.f6484y = point.f6482y;
        this.f6485z = Utils.DOUBLE_EPSILON;
    }

    public Point3(double[] dArr) {
        this();
        set(dArr);
    }

    public void set(double[] dArr) {
        double d = Utils.DOUBLE_EPSILON;
        if (dArr != null) {
            this.f6483x = dArr.length > 0 ? dArr[0] : 0.0d;
            this.f6484y = dArr.length > 1 ? dArr[1] : 0.0d;
            if (dArr.length > 2) {
                d = dArr[2];
            }
            this.f6485z = d;
            return;
        }
        this.f6483x = Utils.DOUBLE_EPSILON;
        this.f6484y = Utils.DOUBLE_EPSILON;
        this.f6485z = Utils.DOUBLE_EPSILON;
    }

    public Point3 clone() {
        return new Point3(this.f6483x, this.f6484y, this.f6485z);
    }

    public double dot(Point3 point3) {
        return (this.f6483x * point3.f6483x) + (this.f6484y * point3.f6484y) + (this.f6485z * point3.f6485z);
    }

    public Point3 cross(Point3 point3) {
        Point3 point32 = point3;
        double d = this.f6484y;
        double d2 = point32.f6485z;
        double d3 = this.f6485z;
        double d4 = point32.f6484y;
        double d5 = point32.f6483x;
        double d6 = (d * d2) - (d3 * d4);
        double d7 = this.f6483x;
        double d8 = (d7 * d4) - (d * d5);
        return new Point3(d6, (d3 * d5) - (d2 * d7), d8);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f6483x);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f6484y);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f6485z);
        return ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point3)) {
            return false;
        }
        Point3 point3 = (Point3) obj;
        return this.f6483x == point3.f6483x && this.f6484y == point3.f6484y && this.f6485z == point3.f6485z;
    }

    public String toString() {
        return "{" + this.f6483x + ", " + this.f6484y + ", " + this.f6485z + "}";
    }
}
