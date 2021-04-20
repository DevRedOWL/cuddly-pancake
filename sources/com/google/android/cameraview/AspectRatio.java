package com.google.android.cameraview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.SparseArrayCompat;

public class AspectRatio implements Comparable<AspectRatio>, Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new Parcelable.Creator<AspectRatio>() {
        public AspectRatio createFromParcel(Parcel parcel) {
            return AspectRatio.m704of(parcel.readInt(), parcel.readInt());
        }

        public AspectRatio[] newArray(int i) {
            return new AspectRatio[i];
        }
    };
    private static final SparseArrayCompat<SparseArrayCompat<AspectRatio>> sCache = new SparseArrayCompat<>(16);

    /* renamed from: mX */
    private final int f1367mX;

    /* renamed from: mY */
    private final int f1368mY;

    public int describeContents() {
        return 0;
    }

    /* renamed from: of */
    public static AspectRatio m704of(int i, int i2) {
        int gcd = gcd(i, i2);
        int i3 = i / gcd;
        int i4 = i2 / gcd;
        SparseArrayCompat sparseArrayCompat = sCache.get(i3);
        if (sparseArrayCompat == null) {
            AspectRatio aspectRatio = new AspectRatio(i3, i4);
            SparseArrayCompat sparseArrayCompat2 = new SparseArrayCompat();
            sparseArrayCompat2.put(i4, aspectRatio);
            sCache.put(i3, sparseArrayCompat2);
            return aspectRatio;
        }
        AspectRatio aspectRatio2 = (AspectRatio) sparseArrayCompat.get(i4);
        if (aspectRatio2 != null) {
            return aspectRatio2;
        }
        AspectRatio aspectRatio3 = new AspectRatio(i3, i4);
        sparseArrayCompat.put(i4, aspectRatio3);
        return aspectRatio3;
    }

    public static AspectRatio parse(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            try {
                return m704of(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Malformed aspect ratio: " + str, e);
            }
        } else {
            throw new IllegalArgumentException("Malformed aspect ratio: " + str);
        }
    }

    private AspectRatio(int i, int i2) {
        this.f1367mX = i;
        this.f1368mY = i2;
    }

    public int getX() {
        return this.f1367mX;
    }

    public int getY() {
        return this.f1368mY;
    }

    public boolean matches(Size size) {
        int gcd = gcd(size.getWidth(), size.getHeight());
        return this.f1367mX == size.getWidth() / gcd && this.f1368mY == size.getHeight() / gcd;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AspectRatio)) {
            return false;
        }
        AspectRatio aspectRatio = (AspectRatio) obj;
        if (this.f1367mX == aspectRatio.f1367mX && this.f1368mY == aspectRatio.f1368mY) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f1367mX + ":" + this.f1368mY;
    }

    public float toFloat() {
        return ((float) this.f1367mX) / ((float) this.f1368mY);
    }

    public int hashCode() {
        int i = this.f1368mY;
        int i2 = this.f1367mX;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public int compareTo(AspectRatio aspectRatio) {
        if (equals(aspectRatio)) {
            return 0;
        }
        return toFloat() - aspectRatio.toFloat() > 0.0f ? 1 : -1;
    }

    public AspectRatio inverse() {
        return m704of(this.f1368mY, this.f1367mX);
    }

    private static int gcd(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = i4 % i;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1367mX);
        parcel.writeInt(this.f1368mY);
    }
}
