package com.github.mikephil.charting.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.ObjectPool;
import java.util.List;

public class MPPointF extends ObjectPool.Poolable {
    public static final Parcelable.Creator<MPPointF> CREATOR = new Parcelable.Creator<MPPointF>() {
        public MPPointF createFromParcel(Parcel parcel) {
            MPPointF mPPointF = new MPPointF(0.0f, 0.0f);
            mPPointF.my_readFromParcel(parcel);
            return mPPointF;
        }

        public MPPointF[] newArray(int i) {
            return new MPPointF[i];
        }
    };
    private static ObjectPool<MPPointF> pool = ObjectPool.create(32, new MPPointF(0.0f, 0.0f));

    /* renamed from: x */
    public float f1365x;

    /* renamed from: y */
    public float f1366y;

    static {
        pool.setReplenishPercentage(0.5f);
    }

    public MPPointF() {
    }

    public MPPointF(float f, float f2) {
        this.f1365x = f;
        this.f1366y = f2;
    }

    public static MPPointF getInstance(float f, float f2) {
        MPPointF mPPointF = pool.get();
        mPPointF.f1365x = f;
        mPPointF.f1366y = f2;
        return mPPointF;
    }

    public static MPPointF getInstance() {
        return pool.get();
    }

    public static MPPointF getInstance(MPPointF mPPointF) {
        MPPointF mPPointF2 = pool.get();
        mPPointF2.f1365x = mPPointF.f1365x;
        mPPointF2.f1366y = mPPointF.f1366y;
        return mPPointF2;
    }

    public static void recycleInstance(MPPointF mPPointF) {
        pool.recycle(mPPointF);
    }

    public static void recycleInstances(List<MPPointF> list) {
        pool.recycle(list);
    }

    public void my_readFromParcel(Parcel parcel) {
        this.f1365x = parcel.readFloat();
        this.f1366y = parcel.readFloat();
    }

    public float getX() {
        return this.f1365x;
    }

    public float getY() {
        return this.f1366y;
    }

    /* access modifiers changed from: protected */
    public ObjectPool.Poolable instantiate() {
        return new MPPointF(0.0f, 0.0f);
    }
}
