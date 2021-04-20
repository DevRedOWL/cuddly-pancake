package com.budiyev.android.codescanner;

final class Point {

    /* renamed from: mX */
    private final int f1187mX;

    /* renamed from: mY */
    private final int f1188mY;

    public Point(int i, int i2) {
        this.f1187mX = i;
        this.f1188mY = i2;
    }

    public int getX() {
        return this.f1187mX;
    }

    public int getY() {
        return this.f1188mY;
    }

    public int hashCode() {
        int i = this.f1187mX;
        int i2 = this.f1188mY;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        if (this.f1187mX == point.f1187mX && this.f1188mY == point.f1188mY) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "(" + this.f1187mX + "; " + this.f1188mY + ")";
    }
}
