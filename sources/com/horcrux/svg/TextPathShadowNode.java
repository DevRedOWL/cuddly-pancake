package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.uimanager.annotations.ReactProp;
import javax.annotation.Nullable;

class TextPathShadowNode extends TextShadowNode {
    private String mHref;
    private TextPathMethod mMethod = TextPathMethod.align;
    private TextPathMidLine mMidLine;
    private TextPathSide mSide;
    private TextPathSpacing mSpacing = TextPathSpacing.exact;
    @Nullable
    private String mStartOffset;

    /* access modifiers changed from: protected */
    public void popGlyphContext() {
    }

    /* access modifiers changed from: protected */
    public void pushGlyphContext() {
    }

    TextPathShadowNode() {
    }

    @ReactProp(name = "href")
    public void setHref(String str) {
        this.mHref = str;
        markUpdated();
    }

    @ReactProp(name = "startOffset")
    public void setStartOffset(@Nullable String str) {
        this.mStartOffset = str;
        markUpdated();
    }

    @ReactProp(name = "method")
    public void setMethod(@Nullable String str) {
        this.mMethod = TextPathMethod.valueOf(str);
        markUpdated();
    }

    @ReactProp(name = "spacing")
    public void setSpacing(@Nullable String str) {
        this.mSpacing = TextPathSpacing.valueOf(str);
        markUpdated();
    }

    @ReactProp(name = "side")
    public void setSide(@Nullable String str) {
        this.mSide = TextPathSide.valueOf(str);
        markUpdated();
    }

    @ReactProp(name = "midLine")
    public void setSharp(@Nullable String str) {
        this.mMidLine = TextPathMidLine.valueOf(str);
        markUpdated();
    }

    /* access modifiers changed from: package-private */
    public TextPathMethod getMethod() {
        return this.mMethod;
    }

    /* access modifiers changed from: package-private */
    public TextPathSpacing getSpacing() {
        return this.mSpacing;
    }

    /* access modifiers changed from: package-private */
    public TextPathSide getSide() {
        return this.mSide;
    }

    /* access modifiers changed from: package-private */
    public TextPathMidLine getMidLine() {
        return this.mMidLine;
    }

    /* access modifiers changed from: package-private */
    public String getStartOffset() {
        return this.mStartOffset;
    }

    public void draw(Canvas canvas, Paint paint, float f) {
        drawGroup(canvas, paint, f);
    }

    public Path getPath() {
        VirtualNode definedTemplate = getSvgShadowNode().getDefinedTemplate(this.mHref);
        if (definedTemplate == null || definedTemplate.getClass() != PathShadowNode.class) {
            return null;
        }
        return ((PathShadowNode) definedTemplate).getPath();
    }

    /* access modifiers changed from: protected */
    public Path getPath(Canvas canvas, Paint paint) {
        return getGroupPath(canvas, paint);
    }
}
