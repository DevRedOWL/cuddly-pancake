package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import com.github.mikephil.charting.utils.Utils;

class ValueAnimatedNode extends AnimatedNode {
    Object mAnimatedObject = null;
    double mOffset = Utils.DOUBLE_EPSILON;
    double mValue = Double.NaN;
    private AnimatedNodeValueListener mValueListener;

    public ValueAnimatedNode() {
    }

    public ValueAnimatedNode(ReadableMap readableMap) {
        this.mValue = readableMap.getDouble("value");
        this.mOffset = readableMap.getDouble("offset");
    }

    public double getValue() {
        return this.mOffset + this.mValue;
    }

    public Object getAnimatedObject() {
        return this.mAnimatedObject;
    }

    public void flattenOffset() {
        this.mValue += this.mOffset;
        this.mOffset = Utils.DOUBLE_EPSILON;
    }

    public void extractOffset() {
        this.mOffset += this.mValue;
        this.mValue = Utils.DOUBLE_EPSILON;
    }

    public void onValueUpdate() {
        AnimatedNodeValueListener animatedNodeValueListener = this.mValueListener;
        if (animatedNodeValueListener != null) {
            animatedNodeValueListener.onValueUpdate(getValue());
        }
    }

    public void setValueListener(AnimatedNodeValueListener animatedNodeValueListener) {
        this.mValueListener = animatedNodeValueListener;
    }
}
