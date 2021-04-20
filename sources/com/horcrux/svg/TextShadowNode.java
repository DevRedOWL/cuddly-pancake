package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.VirtualNode;
import javax.annotation.Nullable;

class TextShadowNode extends GroupShadowNode {
    private AlignmentBaseline mAlignmentBaseline;
    private String mBaselineShift = null;
    @Nullable
    private ReadableArray mDeltaX;
    @Nullable
    private ReadableArray mDeltaY;
    TextLengthAdjust mLengthAdjust = TextLengthAdjust.spacing;
    @Nullable
    private ReadableArray mPositionX;
    @Nullable
    private ReadableArray mPositionY;
    @Nullable
    private ReadableArray mRotate;
    String mTextLength = null;

    TextShadowNode() {
    }

    @ReactProp(name = "textLength")
    public void setmTextLength(@Nullable String str) {
        this.mTextLength = str;
        markUpdated();
    }

    @ReactProp(name = "lengthAdjust")
    public void setLengthAdjust(@Nullable String str) {
        this.mLengthAdjust = TextLengthAdjust.valueOf(str);
        markUpdated();
    }

    @ReactProp(name = "alignmentBaseline")
    public void setMethod(@Nullable String str) {
        this.mAlignmentBaseline = AlignmentBaseline.getEnum(str);
        markUpdated();
    }

    @ReactProp(name = "baselineShift")
    public void setBaselineShift(@Nullable String str) {
        this.mBaselineShift = str;
        markUpdated();
    }

    @ReactProp(name = "verticalAlign")
    public void setVerticalAlign(@Nullable String str) {
        if (str != null) {
            String trim = str.trim();
            int lastIndexOf = trim.lastIndexOf(32);
            try {
                this.mAlignmentBaseline = AlignmentBaseline.getEnum(trim.substring(lastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.mAlignmentBaseline = AlignmentBaseline.baseline;
            }
            try {
                this.mBaselineShift = trim.substring(0, lastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.mBaselineShift = null;
            }
        } else {
            this.mAlignmentBaseline = AlignmentBaseline.baseline;
            this.mBaselineShift = null;
        }
        markUpdated();
    }

    @ReactProp(name = "rotate")
    public void setRotate(@Nullable ReadableArray readableArray) {
        this.mRotate = readableArray;
        markUpdated();
    }

    @ReactProp(name = "deltaX")
    public void setDeltaX(@Nullable ReadableArray readableArray) {
        this.mDeltaX = readableArray;
        markUpdated();
    }

    @ReactProp(name = "deltaY")
    public void setDeltaY(@Nullable ReadableArray readableArray) {
        this.mDeltaY = readableArray;
        markUpdated();
    }

    @ReactProp(name = "positionX")
    public void setPositionX(@Nullable ReadableArray readableArray) {
        this.mPositionX = readableArray;
        markUpdated();
    }

    @ReactProp(name = "positionY")
    public void setPositionY(@Nullable ReadableArray readableArray) {
        this.mPositionY = readableArray;
        markUpdated();
    }

    @ReactProp(name = "font")
    public void setFont(@Nullable ReadableMap readableMap) {
        this.mFont = readableMap;
        markUpdated();
    }

    public void draw(Canvas canvas, Paint paint, float f) {
        if (f > 0.01f) {
            setupGlyphContext(canvas);
            clip(canvas, paint);
            getGroupPath(canvas, paint);
            drawGroup(canvas, paint, f);
            releaseCachedPath();
        }
    }

    /* access modifiers changed from: protected */
    public Path getPath(Canvas canvas, Paint paint) {
        setupGlyphContext(canvas);
        Path groupPath = getGroupPath(canvas, paint);
        releaseCachedPath();
        return groupPath;
    }

    /* access modifiers changed from: package-private */
    public AlignmentBaseline getAlignmentBaseline() {
        AlignmentBaseline alignmentBaseline;
        if (this.mAlignmentBaseline == null) {
            ReactShadowNode parent = getParent();
            while (parent != null) {
                if (!(parent instanceof TextShadowNode) || (alignmentBaseline = ((TextShadowNode) parent).mAlignmentBaseline) == null) {
                    parent = parent.getParent();
                } else {
                    this.mAlignmentBaseline = alignmentBaseline;
                    return alignmentBaseline;
                }
            }
        }
        if (this.mAlignmentBaseline == null) {
            this.mAlignmentBaseline = AlignmentBaseline.baseline;
        }
        return this.mAlignmentBaseline;
    }

    /* access modifiers changed from: package-private */
    public String getBaselineShift() {
        String str;
        if (this.mBaselineShift == null) {
            ReactShadowNode parent = getParent();
            while (parent != null) {
                if (!(parent instanceof TextShadowNode) || (str = ((TextShadowNode) parent).mBaselineShift) == null) {
                    parent = parent.getParent();
                } else {
                    this.mBaselineShift = str;
                    return str;
                }
            }
        }
        return this.mBaselineShift;
    }

    /* access modifiers changed from: package-private */
    public void releaseCachedPath() {
        traverseChildren(new VirtualNode.NodeRunnable() {
            public void run(ReactShadowNode reactShadowNode) {
                if (reactShadowNode instanceof TextShadowNode) {
                    ((TextShadowNode) reactShadowNode).releaseCachedPath();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public Path getGroupPath(Canvas canvas, Paint paint) {
        pushGlyphContext();
        Path path = super.getPath(canvas, paint);
        popGlyphContext();
        return path;
    }

    /* access modifiers changed from: package-private */
    public void pushGlyphContext() {
        getTextRootGlyphContext().pushContext(!(this instanceof TextPathShadowNode) && !(this instanceof TSpanShadowNode), this, this.mFont, this.mPositionX, this.mPositionY, this.mDeltaX, this.mDeltaY, this.mRotate);
    }
}
