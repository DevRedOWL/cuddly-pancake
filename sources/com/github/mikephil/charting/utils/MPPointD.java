package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool;
import java.util.List;

public class MPPointD extends ObjectPool.Poolable {
    private static ObjectPool<MPPointD> pool = ObjectPool.create(64, new MPPointD(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON));

    /* renamed from: x */
    public double f1363x;

    /* renamed from: y */
    public double f1364y;

    static {
        pool.setReplenishPercentage(0.5f);
    }

    public static MPPointD getInstance(double d, double d2) {
        MPPointD mPPointD = pool.get();
        mPPointD.f1363x = d;
        mPPointD.f1364y = d2;
        return mPPointD;
    }

    public static void recycleInstance(MPPointD mPPointD) {
        pool.recycle(mPPointD);
    }

    public static void recycleInstances(List<MPPointD> list) {
        pool.recycle(list);
    }

    /* access modifiers changed from: protected */
    public ObjectPool.Poolable instantiate() {
        return new MPPointD(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON);
    }

    private MPPointD(double d, double d2) {
        this.f1363x = d;
        this.f1364y = d2;
    }

    public String toString() {
        return "MPPointD, x: " + this.f1363x + ", y: " + this.f1364y;
    }
}
