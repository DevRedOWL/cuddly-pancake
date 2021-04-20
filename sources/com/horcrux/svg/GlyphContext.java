package com.horcrux.svg;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import javax.annotation.Nullable;

class GlyphContext {
    private double mDX;
    private int mDXIndex = -1;
    private final ArrayList<Integer> mDXIndices = new ArrayList<>();
    private String[] mDXs = new String[0];
    private final ArrayList<String[]> mDXsContext = new ArrayList<>();
    private int mDXsIndex;
    private final ArrayList<Integer> mDXsIndices = new ArrayList<>();
    private double mDY;
    private int mDYIndex = -1;
    private final ArrayList<Integer> mDYIndices = new ArrayList<>();
    private String[] mDYs = new String[0];
    private final ArrayList<String[]> mDYsContext = new ArrayList<>();
    private int mDYsIndex;
    private final ArrayList<Integer> mDYsIndices = new ArrayList<>();
    private final ArrayList<FontData> mFontContext = new ArrayList<>();
    private double mFontSize = 12.0d;
    private final float mHeight;
    private int mRIndex = -1;
    private final ArrayList<Integer> mRIndices = new ArrayList<>();
    private double[] mRs = {0.0d};
    private final ArrayList<double[]> mRsContext = new ArrayList<>();
    private int mRsIndex;
    private final ArrayList<Integer> mRsIndices = new ArrayList<>();
    private final float mScale;
    private int mTop;
    private final float mWidth;

    /* renamed from: mX */
    private double f2271mX;
    private int mXIndex = -1;
    private final ArrayList<Integer> mXIndices = new ArrayList<>();
    private String[] mXs = new String[0];
    private final ArrayList<String[]> mXsContext = new ArrayList<>();
    private int mXsIndex;
    private final ArrayList<Integer> mXsIndices = new ArrayList<>();

    /* renamed from: mY */
    private double f2272mY;
    private int mYIndex = -1;
    private final ArrayList<Integer> mYIndices = new ArrayList<>();
    private String[] mYs = new String[0];
    private final ArrayList<String[]> mYsContext = new ArrayList<>();
    private int mYsIndex;
    private final ArrayList<Integer> mYsIndices = new ArrayList<>();
    private FontData topFont = FontData.Defaults;

    private void pushIndices() {
        this.mXsIndices.add(Integer.valueOf(this.mXsIndex));
        this.mYsIndices.add(Integer.valueOf(this.mYsIndex));
        this.mDXsIndices.add(Integer.valueOf(this.mDXsIndex));
        this.mDYsIndices.add(Integer.valueOf(this.mDYsIndex));
        this.mRsIndices.add(Integer.valueOf(this.mRsIndex));
    }

    GlyphContext(float f, float f2, float f3) {
        this.mScale = f;
        this.mWidth = f2;
        this.mHeight = f3;
        this.mXsContext.add(this.mXs);
        this.mYsContext.add(this.mYs);
        this.mDXsContext.add(this.mDXs);
        this.mDYsContext.add(this.mDYs);
        this.mRsContext.add(this.mRs);
        this.mXIndices.add(Integer.valueOf(this.mXIndex));
        this.mYIndices.add(Integer.valueOf(this.mYIndex));
        this.mDXIndices.add(Integer.valueOf(this.mDXIndex));
        this.mDYIndices.add(Integer.valueOf(this.mDYIndex));
        this.mRIndices.add(Integer.valueOf(this.mRIndex));
        this.mFontContext.add(this.topFont);
        pushIndices();
    }

    private void reset() {
        this.mRsIndex = 0;
        this.mDYsIndex = 0;
        this.mDXsIndex = 0;
        this.mYsIndex = 0;
        this.mXsIndex = 0;
        this.mRIndex = -1;
        this.mDYIndex = -1;
        this.mDXIndex = -1;
        this.mYIndex = -1;
        this.mXIndex = -1;
        this.mDY = Utils.DOUBLE_EPSILON;
        this.mDX = Utils.DOUBLE_EPSILON;
        this.f2272mY = Utils.DOUBLE_EPSILON;
        this.f2271mX = Utils.DOUBLE_EPSILON;
    }

    /* access modifiers changed from: package-private */
    public FontData getFont() {
        return this.topFont;
    }

    private FontData getTopOrParentFont(GroupShadowNode groupShadowNode) {
        if (this.mTop > 0) {
            return this.topFont;
        }
        for (GroupShadowNode parentTextRoot = groupShadowNode.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            FontData font = parentTextRoot.getGlyphContext().getFont();
            if (font != FontData.Defaults) {
                return font;
            }
        }
        return FontData.Defaults;
    }

    private void pushNodeAndFont(GroupShadowNode groupShadowNode, @Nullable ReadableMap readableMap) {
        FontData topOrParentFont = getTopOrParentFont(groupShadowNode);
        this.mTop++;
        if (readableMap == null) {
            this.mFontContext.add(topOrParentFont);
            return;
        }
        FontData fontData = new FontData(readableMap, topOrParentFont, (double) this.mScale);
        this.mFontSize = fontData.fontSize;
        this.mFontContext.add(fontData);
        this.topFont = fontData;
    }

    /* access modifiers changed from: package-private */
    public void pushContext(GroupShadowNode groupShadowNode, @Nullable ReadableMap readableMap) {
        pushNodeAndFont(groupShadowNode, readableMap);
        pushIndices();
    }

    private String[] getStringArrayFromReadableArray(ReadableArray readableArray) {
        int size = readableArray.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = readableArray.getString(i);
        }
        return strArr;
    }

    private double[] getDoubleArrayFromReadableArray(ReadableArray readableArray) {
        int size = readableArray.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = Double.valueOf(readableArray.getString(i)).doubleValue();
        }
        return dArr;
    }

    /* access modifiers changed from: package-private */
    public void pushContext(boolean z, TextShadowNode textShadowNode, @Nullable ReadableMap readableMap, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        if (z) {
            reset();
        }
        pushNodeAndFont(textShadowNode, readableMap);
        if (!(readableArray == null || readableArray.size() == 0)) {
            this.mXsIndex++;
            this.mXIndex = -1;
            this.mXIndices.add(Integer.valueOf(this.mXIndex));
            this.mXs = getStringArrayFromReadableArray(readableArray);
            this.mXsContext.add(this.mXs);
        }
        if (!(readableArray2 == null || readableArray2.size() == 0)) {
            this.mYsIndex++;
            this.mYIndex = -1;
            this.mYIndices.add(Integer.valueOf(this.mYIndex));
            this.mYs = getStringArrayFromReadableArray(readableArray2);
            this.mYsContext.add(this.mYs);
        }
        if (!(readableArray3 == null || readableArray3.size() == 0)) {
            this.mDXsIndex++;
            this.mDXIndex = -1;
            this.mDXIndices.add(Integer.valueOf(this.mDXIndex));
            this.mDXs = getStringArrayFromReadableArray(readableArray3);
            this.mDXsContext.add(this.mDXs);
        }
        if (!(readableArray4 == null || readableArray4.size() == 0)) {
            this.mDYsIndex++;
            this.mDYIndex = -1;
            this.mDYIndices.add(Integer.valueOf(this.mDYIndex));
            this.mDYs = getStringArrayFromReadableArray(readableArray4);
            this.mDYsContext.add(this.mDYs);
        }
        if (!(readableArray5 == null || readableArray5.size() == 0)) {
            this.mRsIndex++;
            this.mRIndex = -1;
            this.mRIndices.add(Integer.valueOf(this.mRIndex));
            this.mRs = getDoubleArrayFromReadableArray(readableArray5);
            this.mRsContext.add(this.mRs);
        }
        pushIndices();
    }

    /* access modifiers changed from: package-private */
    public void popContext() {
        this.mFontContext.remove(this.mTop);
        this.mXsIndices.remove(this.mTop);
        this.mYsIndices.remove(this.mTop);
        this.mDXsIndices.remove(this.mTop);
        this.mDYsIndices.remove(this.mTop);
        this.mRsIndices.remove(this.mTop);
        this.mTop--;
        int i = this.mXsIndex;
        int i2 = this.mYsIndex;
        int i3 = this.mDXsIndex;
        int i4 = this.mDYsIndex;
        int i5 = this.mRsIndex;
        this.topFont = this.mFontContext.get(this.mTop);
        this.mXsIndex = this.mXsIndices.get(this.mTop).intValue();
        this.mYsIndex = this.mYsIndices.get(this.mTop).intValue();
        this.mDXsIndex = this.mDXsIndices.get(this.mTop).intValue();
        this.mDYsIndex = this.mDYsIndices.get(this.mTop).intValue();
        this.mRsIndex = this.mRsIndices.get(this.mTop).intValue();
        if (i != this.mXsIndex) {
            this.mXsContext.remove(i);
            this.mXs = this.mXsContext.get(this.mXsIndex);
            this.mXIndex = this.mXIndices.get(this.mXsIndex).intValue();
        }
        if (i2 != this.mYsIndex) {
            this.mYsContext.remove(i2);
            this.mYs = this.mYsContext.get(this.mYsIndex);
            this.mYIndex = this.mYIndices.get(this.mYsIndex).intValue();
        }
        if (i3 != this.mDXsIndex) {
            this.mDXsContext.remove(i3);
            this.mDXs = this.mDXsContext.get(this.mDXsIndex);
            this.mDXIndex = this.mDXIndices.get(this.mDXsIndex).intValue();
        }
        if (i4 != this.mDYsIndex) {
            this.mDYsContext.remove(i4);
            this.mDYs = this.mDYsContext.get(this.mDYsIndex);
            this.mDYIndex = this.mDYIndices.get(this.mDYsIndex).intValue();
        }
        if (i5 != this.mRsIndex) {
            this.mRsContext.remove(i5);
            this.mRs = this.mRsContext.get(this.mRsIndex);
            this.mRIndex = this.mRIndices.get(this.mRsIndex).intValue();
        }
    }

    private static void incrementIndices(ArrayList<Integer> arrayList, int i) {
        while (i >= 0) {
            arrayList.set(i, Integer.valueOf(arrayList.get(i).intValue() + 1));
            i--;
        }
    }

    /* access modifiers changed from: package-private */
    public double getFontSize() {
        return this.mFontSize;
    }

    /* access modifiers changed from: package-private */
    public double nextX(double d) {
        incrementIndices(this.mXIndices, this.mXsIndex);
        int i = this.mXIndex + 1;
        String[] strArr = this.mXs;
        if (i < strArr.length) {
            this.mDX = Utils.DOUBLE_EPSILON;
            this.mXIndex = i;
            this.f2271mX = PropHelper.fromRelative(strArr[i], (double) this.mWidth, Utils.DOUBLE_EPSILON, (double) this.mScale, this.mFontSize);
        }
        this.f2271mX += d;
        return this.f2271mX;
    }

    /* access modifiers changed from: package-private */
    public double nextY() {
        incrementIndices(this.mYIndices, this.mYsIndex);
        int i = this.mYIndex + 1;
        String[] strArr = this.mYs;
        if (i < strArr.length) {
            this.mDY = Utils.DOUBLE_EPSILON;
            this.mYIndex = i;
            this.f2272mY = PropHelper.fromRelative(strArr[i], (double) this.mHeight, Utils.DOUBLE_EPSILON, (double) this.mScale, this.mFontSize);
        }
        return this.f2272mY;
    }

    /* access modifiers changed from: package-private */
    public double nextDeltaX() {
        incrementIndices(this.mDXIndices, this.mDXsIndex);
        int i = this.mDXIndex + 1;
        String[] strArr = this.mDXs;
        if (i < strArr.length) {
            this.mDXIndex = i;
            this.mDX += PropHelper.fromRelative(strArr[i], (double) this.mWidth, Utils.DOUBLE_EPSILON, (double) this.mScale, this.mFontSize);
        }
        return this.mDX;
    }

    /* access modifiers changed from: package-private */
    public double nextDeltaY() {
        incrementIndices(this.mDYIndices, this.mDYsIndex);
        int i = this.mDYIndex + 1;
        String[] strArr = this.mDYs;
        if (i < strArr.length) {
            this.mDYIndex = i;
            this.mDY += PropHelper.fromRelative(strArr[i], (double) this.mHeight, Utils.DOUBLE_EPSILON, (double) this.mScale, this.mFontSize);
        }
        return this.mDY;
    }

    /* access modifiers changed from: package-private */
    public double nextRotation() {
        incrementIndices(this.mRIndices, this.mRsIndex);
        this.mRIndex = Math.min(this.mRIndex + 1, this.mRs.length - 1);
        return this.mRs[this.mRIndex];
    }

    /* access modifiers changed from: package-private */
    public float getWidth() {
        return this.mWidth;
    }

    /* access modifiers changed from: package-private */
    public float getHeight() {
        return this.mHeight;
    }
}
