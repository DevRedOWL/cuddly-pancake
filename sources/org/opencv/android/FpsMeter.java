package org.opencv.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import java.text.DecimalFormat;
import org.opencv.core.Core;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

public class FpsMeter {

    /* renamed from: e */
    private static final DecimalFormat f6471e = new DecimalFormat("0.00");

    /* renamed from: a */
    Paint f6472a;

    /* renamed from: b */
    boolean f6473b = false;

    /* renamed from: c */
    int f6474c = 0;

    /* renamed from: d */
    int f6475d = 0;

    /* renamed from: f */
    private int f6476f;

    /* renamed from: g */
    private double f6477g;

    /* renamed from: h */
    private long f6478h;

    /* renamed from: i */
    private String f6479i;

    public void init() {
        this.f6476f = 0;
        this.f6477g = Core.getTickFrequency();
        this.f6478h = Core.getTickCount();
        this.f6479i = "";
        this.f6472a = new Paint();
        this.f6472a.setColor(-16776961);
        this.f6472a.setTextSize(20.0f);
    }

    public void measure() {
        if (!this.f6473b) {
            init();
            this.f6473b = true;
            return;
        }
        this.f6476f++;
        if (this.f6476f % 20 == 0) {
            long tickCount = Core.getTickCount();
            double d = (this.f6477g * 20.0d) / ((double) (tickCount - this.f6478h));
            this.f6478h = tickCount;
            if (this.f6474c == 0 || this.f6475d == 0) {
                this.f6479i = f6471e.format(d) + " FPS";
            } else {
                this.f6479i = f6471e.format(d) + " FPS@" + Integer.valueOf(this.f6474c) + MapPoint.JsonFields.f6911x + Integer.valueOf(this.f6475d);
            }
            Log.i("FpsMeter", this.f6479i);
        }
    }

    public void setResolution(int i, int i2) {
        this.f6474c = i;
        this.f6475d = i2;
    }

    public void draw(Canvas canvas, float f, float f2) {
        Log.d("FpsMeter", this.f6479i);
        canvas.drawText(this.f6479i, f, f2, this.f6472a);
    }
}
