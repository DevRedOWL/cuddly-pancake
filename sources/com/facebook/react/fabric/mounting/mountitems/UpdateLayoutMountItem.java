package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.mounting.MountingManager;

public class UpdateLayoutMountItem implements MountItem {
    private final int mHeight;
    private final int mLayoutDirection;
    private final int mReactTag;
    private final int mWidth;

    /* renamed from: mX */
    private final int f1323mX;

    /* renamed from: mY */
    private final int f1324mY;

    public UpdateLayoutMountItem(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mReactTag = i;
        this.f1323mX = i2;
        this.f1324mY = i3;
        this.mWidth = i4;
        this.mHeight = i5;
        this.mLayoutDirection = convertLayoutDirection(i6);
    }

    private int convertLayoutDirection(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Unsupported layout direction: " + i);
    }

    public void execute(MountingManager mountingManager) {
        mountingManager.updateLayout(this.mReactTag, this.f1323mX, this.f1324mY, this.mWidth, this.mHeight);
    }

    public int getX() {
        return this.f1323mX;
    }

    public int getY() {
        return this.f1324mY;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getLayoutDirection() {
        return this.mLayoutDirection;
    }

    public String toString() {
        return "UpdateLayoutMountItem [" + this.mReactTag + "] - x: " + this.f1323mX + " - y: " + this.f1324mY + " - height: " + this.mHeight + " - width: " + this.mWidth + " - layoutDirection: " + this.mLayoutDirection;
    }
}
