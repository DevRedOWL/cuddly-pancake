package com.jjoe64.graphview.series;

import java.io.Serializable;
import java.util.Date;

public class DataPoint implements DataPointInterface, Serializable {
    private static final long serialVersionUID = 1428263322645L;

    /* renamed from: x */
    private double f2291x;

    /* renamed from: y */
    private double f2292y;

    public DataPoint(double d, double d2) {
        this.f2291x = d;
        this.f2292y = d2;
    }

    public DataPoint(Date date, double d) {
        this.f2291x = (double) date.getTime();
        this.f2292y = d;
    }

    public double getX() {
        return this.f2291x;
    }

    public double getY() {
        return this.f2292y;
    }

    public String toString() {
        return "[" + this.f2291x + "/" + this.f2292y + "]";
    }
}
