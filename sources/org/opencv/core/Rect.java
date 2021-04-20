package org.opencv.core;

import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

public class Rect {
    public int height;
    public int width;

    /* renamed from: x */
    public int f6486x;

    /* renamed from: y */
    public int f6487y;

    public Rect(int i, int i2, int i3, int i4) {
        this.f6486x = i;
        this.f6487y = i2;
        this.width = i3;
        this.height = i4;
    }

    public Rect() {
        this(0, 0, 0, 0);
    }

    public Rect(Point point, Point point2) {
        this.f6486x = (int) (point.f6481x < point2.f6481x ? point.f6481x : point2.f6481x);
        this.f6487y = (int) (point.f6482y < point2.f6482y ? point.f6482y : point2.f6482y);
        this.width = ((int) (point.f6481x > point2.f6481x ? point.f6481x : point2.f6481x)) - this.f6486x;
        this.height = ((int) (point.f6482y > point2.f6482y ? point.f6482y : point2.f6482y)) - this.f6487y;
    }

    public Rect(Point point, Size size) {
        this((int) point.f6481x, (int) point.f6482y, (int) size.width, (int) size.height);
    }

    public Rect(double[] dArr) {
        set(dArr);
    }

    public void set(double[] dArr) {
        int i = 0;
        if (dArr != null) {
            this.f6486x = dArr.length > 0 ? (int) dArr[0] : 0;
            this.f6487y = dArr.length > 1 ? (int) dArr[1] : 0;
            this.width = dArr.length > 2 ? (int) dArr[2] : 0;
            if (dArr.length > 3) {
                i = (int) dArr[3];
            }
            this.height = i;
            return;
        }
        this.f6486x = 0;
        this.f6487y = 0;
        this.width = 0;
        this.height = 0;
    }

    public Rect clone() {
        return new Rect(this.f6486x, this.f6487y, this.width, this.height);
    }

    /* renamed from: tl */
    public Point mo60348tl() {
        return new Point((double) this.f6486x, (double) this.f6487y);
    }

    /* renamed from: br */
    public Point mo60341br() {
        return new Point((double) (this.f6486x + this.width), (double) (this.f6487y + this.height));
    }

    public Size size() {
        return new Size((double) this.width, (double) this.height);
    }

    public double area() {
        return (double) (this.width * this.height);
    }

    public boolean contains(Point point) {
        return ((double) this.f6486x) <= point.f6481x && point.f6481x < ((double) (this.f6486x + this.width)) && ((double) this.f6487y) <= point.f6482y && point.f6482y < ((double) (this.f6487y + this.height));
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits((double) this.height);
        long doubleToLongBits2 = Double.doubleToLongBits((double) this.width);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits((double) this.f6486x);
        int i2 = (i * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits((double) this.f6487y);
        return (i2 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return this.f6486x == rect.f6486x && this.f6487y == rect.f6487y && this.width == rect.width && this.height == rect.height;
    }

    public String toString() {
        return "{" + this.f6486x + ", " + this.f6487y + ", " + this.width + MapPoint.JsonFields.f6911x + this.height + "}";
    }
}
