package org.opencv.core;

import com.github.mikephil.charting.utils.Utils;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

public class Size {
    public double height;
    public double width;

    public Size(double d, double d2) {
        this.width = d;
        this.height = d2;
    }

    public Size() {
        this(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON);
    }

    public Size(Point point) {
        this.width = point.f6481x;
        this.height = point.f6482y;
    }

    public Size(double[] dArr) {
        set(dArr);
    }

    public void set(double[] dArr) {
        double d = Utils.DOUBLE_EPSILON;
        if (dArr != null) {
            this.width = dArr.length > 0 ? dArr[0] : 0.0d;
            if (dArr.length > 1) {
                d = dArr[1];
            }
            this.height = d;
            return;
        }
        this.width = Utils.DOUBLE_EPSILON;
        this.height = Utils.DOUBLE_EPSILON;
    }

    public double area() {
        return this.width * this.height;
    }

    public Size clone() {
        return new Size(this.width, this.height);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.height);
        long doubleToLongBits2 = Double.doubleToLongBits(this.width);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public String toString() {
        return ((int) this.width) + MapPoint.JsonFields.f6911x + ((int) this.height);
    }
}
