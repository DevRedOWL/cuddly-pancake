package com.horcrux.svg;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import javax.annotation.Nullable;

class SvgViewManager extends ViewGroupManager<SvgView> {
    private static final YogaMeasureFunction MEASURE_FUNCTION = new YogaMeasureFunction() {
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            throw new IllegalStateException("SurfaceView should have explicit width and height set");
        }
    };
    private static final String REACT_CLASS = "RNSVGSvgView";
    private static final SparseArray<SvgViewShadowNode> mTagToShadowNode = new SparseArray<>();
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();

    public String getName() {
        return REACT_CLASS;
    }

    SvgViewManager() {
    }

    static void setShadowNode(SvgViewShadowNode svgViewShadowNode) {
        mTagToShadowNode.put(svgViewShadowNode.getReactTag(), svgViewShadowNode);
    }

    static void setSvgView(SvgView svgView) {
        mTagToSvgView.put(svgView.getId(), svgView);
    }

    static void dropSvgView(SvgView svgView) {
        int id = svgView.getId();
        mTagToShadowNode.remove(id);
        mTagToSvgView.remove(id);
    }

    @Nullable
    static SvgView getSvgViewByTag(int i) {
        return mTagToSvgView.get(i);
    }

    @Nullable
    static SvgViewShadowNode getShadowNodeByTag(int i) {
        return mTagToShadowNode.get(i);
    }

    public Class<SvgViewShadowNode> getShadowNodeClass() {
        return SvgViewShadowNode.class;
    }

    public SvgViewShadowNode createShadowNodeInstance() {
        SvgViewShadowNode svgViewShadowNode = new SvgViewShadowNode();
        svgViewShadowNode.setMeasureFunction(MEASURE_FUNCTION);
        return svgViewShadowNode;
    }

    /* access modifiers changed from: protected */
    public SvgView createViewInstance(ThemedReactContext themedReactContext) {
        return new SvgView(themedReactContext);
    }

    public void updateExtraData(SvgView svgView, Object obj) {
        svgView.setBitmap((Bitmap) obj);
    }
}
