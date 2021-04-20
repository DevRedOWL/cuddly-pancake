package org.opencv.core;

import com.github.mikephil.charting.utils.Utils;

public class RotatedRect {
    public double angle;
    public Point center;
    public Size size;

    public RotatedRect() {
        this.center = new Point();
        this.size = new Size();
        this.angle = Utils.DOUBLE_EPSILON;
    }

    public RotatedRect(Point point, Size size2, double d) {
        this.center = point.clone();
        this.size = size2.clone();
        this.angle = d;
    }

    public RotatedRect(double[] dArr) {
        this();
        set(dArr);
    }

    public void set(double[] dArr) {
        double d = Utils.DOUBLE_EPSILON;
        if (dArr != null) {
            this.center.f6481x = dArr.length > 0 ? dArr[0] : 0.0d;
            this.center.f6482y = dArr.length > 1 ? dArr[1] : 0.0d;
            this.size.width = dArr.length > 2 ? dArr[2] : 0.0d;
            this.size.height = dArr.length > 3 ? dArr[3] : 0.0d;
            if (dArr.length > 4) {
                d = dArr[4];
            }
            this.angle = d;
            return;
        }
        Point point = this.center;
        point.f6481x = Utils.DOUBLE_EPSILON;
        point.f6481x = Utils.DOUBLE_EPSILON;
        Size size2 = this.size;
        size2.width = Utils.DOUBLE_EPSILON;
        size2.height = Utils.DOUBLE_EPSILON;
        this.angle = Utils.DOUBLE_EPSILON;
    }

    public void points(Point[] pointArr) {
        double d = (this.angle * 3.141592653589793d) / 180.0d;
        double cos = Math.cos(d) * 0.5d;
        double sin = Math.sin(d) * 0.5d;
        pointArr[0] = new Point((this.center.f6481x - (this.size.height * sin)) - (this.size.width * cos), (this.center.f6482y + (this.size.height * cos)) - (this.size.width * sin));
        pointArr[1] = new Point((this.center.f6481x + (this.size.height * sin)) - (this.size.width * cos), (this.center.f6482y - (cos * this.size.height)) - (sin * this.size.width));
        pointArr[2] = new Point((this.center.f6481x * 2.0d) - pointArr[0].f6481x, (this.center.f6482y * 2.0d) - pointArr[0].f6482y);
        pointArr[3] = new Point((this.center.f6481x * 2.0d) - pointArr[1].f6481x, (this.center.f6482y * 2.0d) - pointArr[1].f6482y);
    }

    public Rect boundingRect() {
        Point[] pointArr = new Point[4];
        points(pointArr);
        Rect rect = new Rect((int) Math.floor(Math.min(Math.min(Math.min(pointArr[0].f6481x, pointArr[1].f6481x), pointArr[2].f6481x), pointArr[3].f6481x)), (int) Math.floor(Math.min(Math.min(Math.min(pointArr[0].f6482y, pointArr[1].f6482y), pointArr[2].f6482y), pointArr[3].f6482y)), (int) Math.ceil(Math.max(Math.max(Math.max(pointArr[0].f6481x, pointArr[1].f6481x), pointArr[2].f6481x), pointArr[3].f6481x)), (int) Math.ceil(Math.max(Math.max(Math.max(pointArr[0].f6482y, pointArr[1].f6482y), pointArr[2].f6482y), pointArr[3].f6482y)));
        rect.width -= rect.f6486x - 1;
        rect.height -= rect.f6487y - 1;
        return rect;
    }

    public RotatedRect clone() {
        return new RotatedRect(this.center, this.size, this.angle);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.center.f6481x);
        long doubleToLongBits2 = Double.doubleToLongBits(this.center.f6482y);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.size.width);
        int i2 = (i * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.size.height);
        long doubleToLongBits5 = Double.doubleToLongBits(this.angle);
        return (((i2 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotatedRect)) {
            return false;
        }
        RotatedRect rotatedRect = (RotatedRect) obj;
        return this.center.equals(rotatedRect.center) && this.size.equals(rotatedRect.size) && this.angle == rotatedRect.angle;
    }

    public String toString() {
        return "{ " + this.center + " " + this.size + " * " + this.angle + " }";
    }
}
