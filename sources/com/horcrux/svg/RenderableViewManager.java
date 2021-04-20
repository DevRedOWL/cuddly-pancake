package com.horcrux.svg;

import android.view.View;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;

class RenderableViewManager extends ViewManager<View, LayoutShadowNode> {
    private static final String CLASS_CIRCLE = "RNSVGCircle";
    private static final String CLASS_CLIP_PATH = "RNSVGClipPath";
    private static final String CLASS_DEFS = "RNSVGDefs";
    private static final String CLASS_ELLIPSE = "RNSVGEllipse";
    private static final String CLASS_GROUP = "RNSVGGroup";
    private static final String CLASS_IMAGE = "RNSVGImage";
    private static final String CLASS_LINE = "RNSVGLine";
    private static final String CLASS_LINEAR_GRADIENT = "RNSVGLinearGradient";
    private static final String CLASS_PATH = "RNSVGPath";
    private static final String CLASS_RADIAL_GRADIENT = "RNSVGRadialGradient";
    private static final String CLASS_RECT = "RNSVGRect";
    private static final String CLASS_SYMBOL = "RNSVGSymbol";
    private static final String CLASS_TEXT = "RNSVGText";
    private static final String CLASS_TEXT_PATH = "RNSVGTextPath";
    private static final String CLASS_TSPAN = "RNSVGTSpan";
    private static final String CLASS_USE = "RNSVGUse";
    private final String mClassName;

    public void onDropViewInstance(View view) {
    }

    static RenderableViewManager createGroupViewManager() {
        return new RenderableViewManager(CLASS_GROUP);
    }

    static RenderableViewManager createPathViewManager() {
        return new RenderableViewManager(CLASS_PATH);
    }

    static RenderableViewManager createTextViewManager() {
        return new RenderableViewManager(CLASS_TEXT);
    }

    static RenderableViewManager createTSpanViewManager() {
        return new RenderableViewManager(CLASS_TSPAN);
    }

    static RenderableViewManager createTextPathViewManager() {
        return new RenderableViewManager(CLASS_TEXT_PATH);
    }

    static RenderableViewManager createImageViewManager() {
        return new RenderableViewManager(CLASS_IMAGE);
    }

    static RenderableViewManager createCircleViewManager() {
        return new RenderableViewManager(CLASS_CIRCLE);
    }

    static RenderableViewManager createEllipseViewManager() {
        return new RenderableViewManager(CLASS_ELLIPSE);
    }

    static RenderableViewManager createLineViewManager() {
        return new RenderableViewManager(CLASS_LINE);
    }

    static RenderableViewManager createRectViewManager() {
        return new RenderableViewManager(CLASS_RECT);
    }

    static RenderableViewManager createClipPathViewManager() {
        return new RenderableViewManager(CLASS_CLIP_PATH);
    }

    static RenderableViewManager createDefsViewManager() {
        return new RenderableViewManager(CLASS_DEFS);
    }

    static RenderableViewManager createUseViewManager() {
        return new RenderableViewManager(CLASS_USE);
    }

    static RenderableViewManager createSymbolManager() {
        return new RenderableViewManager(CLASS_SYMBOL);
    }

    static RenderableViewManager createLinearGradientManager() {
        return new RenderableViewManager(CLASS_LINEAR_GRADIENT);
    }

    static RenderableViewManager createRadialGradientManager() {
        return new RenderableViewManager(CLASS_RADIAL_GRADIENT);
    }

    private RenderableViewManager(String str) {
        this.mClassName = str;
    }

    public String getName() {
        return this.mClassName;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.uimanager.LayoutShadowNode createShadowNodeInstance() {
        /*
            r3 = this;
            java.lang.String r0 = r3.mClassName
            int r1 = r0.hashCode()
            switch(r1) {
                case -1866779881: goto L_0x00ae;
                case -1487762378: goto L_0x00a4;
                case -503960650: goto L_0x0099;
                case -503718244: goto L_0x008f;
                case -503606579: goto L_0x0085;
                case -503543668: goto L_0x007b;
                case -503483435: goto L_0x0071;
                case -154787361: goto L_0x0066;
                case -68462182: goto L_0x005b;
                case 748220957: goto L_0x0050;
                case 1000530296: goto L_0x0045;
                case 1473223232: goto L_0x0039;
                case 1560255703: goto L_0x002e;
                case 1561939891: goto L_0x0022;
                case 1571338294: goto L_0x0017;
                case 1852960317: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x00b9
        L_0x000b:
            java.lang.String r1 = "RNSVGClipPath"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 10
            goto L_0x00ba
        L_0x0017:
            java.lang.String r1 = "RNSVGTSpan"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 7
            goto L_0x00ba
        L_0x0022:
            java.lang.String r1 = "RNSVGImage"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 9
            goto L_0x00ba
        L_0x002e:
            java.lang.String r1 = "RNSVGGroup"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 0
            goto L_0x00ba
        L_0x0039:
            java.lang.String r1 = "RNSVGSymbol"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 13
            goto L_0x00ba
        L_0x0045:
            java.lang.String r1 = "RNSVGCircle"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 2
            goto L_0x00ba
        L_0x0050:
            java.lang.String r1 = "RNSVGLinearGradient"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 14
            goto L_0x00ba
        L_0x005b:
            java.lang.String r1 = "RNSVGTextPath"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 8
            goto L_0x00ba
        L_0x0066:
            java.lang.String r1 = "RNSVGUse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 12
            goto L_0x00ba
        L_0x0071:
            java.lang.String r1 = "RNSVGText"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 6
            goto L_0x00ba
        L_0x007b:
            java.lang.String r1 = "RNSVGRect"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 5
            goto L_0x00ba
        L_0x0085:
            java.lang.String r1 = "RNSVGPath"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 1
            goto L_0x00ba
        L_0x008f:
            java.lang.String r1 = "RNSVGLine"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 4
            goto L_0x00ba
        L_0x0099:
            java.lang.String r1 = "RNSVGDefs"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 11
            goto L_0x00ba
        L_0x00a4:
            java.lang.String r1 = "RNSVGEllipse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 3
            goto L_0x00ba
        L_0x00ae:
            java.lang.String r1 = "RNSVGRadialGradient"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 15
            goto L_0x00ba
        L_0x00b9:
            r0 = -1
        L_0x00ba:
            switch(r0) {
                case 0: goto L_0x0130;
                case 1: goto L_0x012a;
                case 2: goto L_0x0124;
                case 3: goto L_0x011e;
                case 4: goto L_0x0118;
                case 5: goto L_0x0112;
                case 6: goto L_0x010c;
                case 7: goto L_0x0106;
                case 8: goto L_0x0100;
                case 9: goto L_0x00fa;
                case 10: goto L_0x00f4;
                case 11: goto L_0x00ee;
                case 12: goto L_0x00e8;
                case 13: goto L_0x00e2;
                case 14: goto L_0x00dc;
                case 15: goto L_0x00d6;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected type "
            r1.append(r2)
            java.lang.String r2 = r3.mClassName
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d6:
            com.horcrux.svg.RadialGradientShadowNode r0 = new com.horcrux.svg.RadialGradientShadowNode
            r0.<init>()
            return r0
        L_0x00dc:
            com.horcrux.svg.LinearGradientShadowNode r0 = new com.horcrux.svg.LinearGradientShadowNode
            r0.<init>()
            return r0
        L_0x00e2:
            com.horcrux.svg.SymbolShadowNode r0 = new com.horcrux.svg.SymbolShadowNode
            r0.<init>()
            return r0
        L_0x00e8:
            com.horcrux.svg.UseShadowNode r0 = new com.horcrux.svg.UseShadowNode
            r0.<init>()
            return r0
        L_0x00ee:
            com.horcrux.svg.DefsShadowNode r0 = new com.horcrux.svg.DefsShadowNode
            r0.<init>()
            return r0
        L_0x00f4:
            com.horcrux.svg.ClipPathShadowNode r0 = new com.horcrux.svg.ClipPathShadowNode
            r0.<init>()
            return r0
        L_0x00fa:
            com.horcrux.svg.ImageShadowNode r0 = new com.horcrux.svg.ImageShadowNode
            r0.<init>()
            return r0
        L_0x0100:
            com.horcrux.svg.TextPathShadowNode r0 = new com.horcrux.svg.TextPathShadowNode
            r0.<init>()
            return r0
        L_0x0106:
            com.horcrux.svg.TSpanShadowNode r0 = new com.horcrux.svg.TSpanShadowNode
            r0.<init>()
            return r0
        L_0x010c:
            com.horcrux.svg.TextShadowNode r0 = new com.horcrux.svg.TextShadowNode
            r0.<init>()
            return r0
        L_0x0112:
            com.horcrux.svg.RectShadowNode r0 = new com.horcrux.svg.RectShadowNode
            r0.<init>()
            return r0
        L_0x0118:
            com.horcrux.svg.LineShadowNode r0 = new com.horcrux.svg.LineShadowNode
            r0.<init>()
            return r0
        L_0x011e:
            com.horcrux.svg.EllipseShadowNode r0 = new com.horcrux.svg.EllipseShadowNode
            r0.<init>()
            return r0
        L_0x0124:
            com.horcrux.svg.CircleShadowNode r0 = new com.horcrux.svg.CircleShadowNode
            r0.<init>()
            return r0
        L_0x012a:
            com.horcrux.svg.PathShadowNode r0 = new com.horcrux.svg.PathShadowNode
            r0.<init>()
            return r0
        L_0x0130:
            com.horcrux.svg.GroupShadowNode r0 = new com.horcrux.svg.GroupShadowNode
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.RenderableViewManager.createShadowNodeInstance():com.facebook.react.uimanager.LayoutShadowNode");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Class<? extends com.facebook.react.uimanager.LayoutShadowNode> getShadowNodeClass() {
        /*
            r3 = this;
            java.lang.String r0 = r3.mClassName
            int r1 = r0.hashCode()
            switch(r1) {
                case -1866779881: goto L_0x00ae;
                case -1487762378: goto L_0x00a4;
                case -503960650: goto L_0x0099;
                case -503718244: goto L_0x008f;
                case -503606579: goto L_0x0085;
                case -503543668: goto L_0x007b;
                case -503483435: goto L_0x0071;
                case -154787361: goto L_0x0066;
                case -68462182: goto L_0x005b;
                case 748220957: goto L_0x0050;
                case 1000530296: goto L_0x0045;
                case 1473223232: goto L_0x0039;
                case 1560255703: goto L_0x002e;
                case 1561939891: goto L_0x0022;
                case 1571338294: goto L_0x0017;
                case 1852960317: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x00b9
        L_0x000b:
            java.lang.String r1 = "RNSVGClipPath"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 10
            goto L_0x00ba
        L_0x0017:
            java.lang.String r1 = "RNSVGTSpan"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 7
            goto L_0x00ba
        L_0x0022:
            java.lang.String r1 = "RNSVGImage"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 9
            goto L_0x00ba
        L_0x002e:
            java.lang.String r1 = "RNSVGGroup"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 0
            goto L_0x00ba
        L_0x0039:
            java.lang.String r1 = "RNSVGSymbol"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 13
            goto L_0x00ba
        L_0x0045:
            java.lang.String r1 = "RNSVGCircle"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 2
            goto L_0x00ba
        L_0x0050:
            java.lang.String r1 = "RNSVGLinearGradient"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 14
            goto L_0x00ba
        L_0x005b:
            java.lang.String r1 = "RNSVGTextPath"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 8
            goto L_0x00ba
        L_0x0066:
            java.lang.String r1 = "RNSVGUse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 12
            goto L_0x00ba
        L_0x0071:
            java.lang.String r1 = "RNSVGText"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 6
            goto L_0x00ba
        L_0x007b:
            java.lang.String r1 = "RNSVGRect"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 5
            goto L_0x00ba
        L_0x0085:
            java.lang.String r1 = "RNSVGPath"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 1
            goto L_0x00ba
        L_0x008f:
            java.lang.String r1 = "RNSVGLine"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 4
            goto L_0x00ba
        L_0x0099:
            java.lang.String r1 = "RNSVGDefs"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 11
            goto L_0x00ba
        L_0x00a4:
            java.lang.String r1 = "RNSVGEllipse"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 3
            goto L_0x00ba
        L_0x00ae:
            java.lang.String r1 = "RNSVGRadialGradient"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b9
            r0 = 15
            goto L_0x00ba
        L_0x00b9:
            r0 = -1
        L_0x00ba:
            switch(r0) {
                case 0: goto L_0x0103;
                case 1: goto L_0x0100;
                case 2: goto L_0x00fd;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00f7;
                case 5: goto L_0x00f4;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00ee;
                case 8: goto L_0x00eb;
                case 9: goto L_0x00e8;
                case 10: goto L_0x00e5;
                case 11: goto L_0x00e2;
                case 12: goto L_0x00df;
                case 13: goto L_0x00dc;
                case 14: goto L_0x00d9;
                case 15: goto L_0x00d6;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected type "
            r1.append(r2)
            java.lang.String r2 = r3.mClassName
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d6:
            java.lang.Class<com.horcrux.svg.RadialGradientShadowNode> r0 = com.horcrux.svg.RadialGradientShadowNode.class
            return r0
        L_0x00d9:
            java.lang.Class<com.horcrux.svg.LinearGradientShadowNode> r0 = com.horcrux.svg.LinearGradientShadowNode.class
            return r0
        L_0x00dc:
            java.lang.Class<com.horcrux.svg.SymbolShadowNode> r0 = com.horcrux.svg.SymbolShadowNode.class
            return r0
        L_0x00df:
            java.lang.Class<com.horcrux.svg.UseShadowNode> r0 = com.horcrux.svg.UseShadowNode.class
            return r0
        L_0x00e2:
            java.lang.Class<com.horcrux.svg.DefsShadowNode> r0 = com.horcrux.svg.DefsShadowNode.class
            return r0
        L_0x00e5:
            java.lang.Class<com.horcrux.svg.ClipPathShadowNode> r0 = com.horcrux.svg.ClipPathShadowNode.class
            return r0
        L_0x00e8:
            java.lang.Class<com.horcrux.svg.ImageShadowNode> r0 = com.horcrux.svg.ImageShadowNode.class
            return r0
        L_0x00eb:
            java.lang.Class<com.horcrux.svg.TextPathShadowNode> r0 = com.horcrux.svg.TextPathShadowNode.class
            return r0
        L_0x00ee:
            java.lang.Class<com.horcrux.svg.TSpanShadowNode> r0 = com.horcrux.svg.TSpanShadowNode.class
            return r0
        L_0x00f1:
            java.lang.Class<com.horcrux.svg.TextShadowNode> r0 = com.horcrux.svg.TextShadowNode.class
            return r0
        L_0x00f4:
            java.lang.Class<com.horcrux.svg.RectShadowNode> r0 = com.horcrux.svg.RectShadowNode.class
            return r0
        L_0x00f7:
            java.lang.Class<com.horcrux.svg.LineShadowNode> r0 = com.horcrux.svg.LineShadowNode.class
            return r0
        L_0x00fa:
            java.lang.Class<com.horcrux.svg.EllipseShadowNode> r0 = com.horcrux.svg.EllipseShadowNode.class
            return r0
        L_0x00fd:
            java.lang.Class<com.horcrux.svg.CircleShadowNode> r0 = com.horcrux.svg.CircleShadowNode.class
            return r0
        L_0x0100:
            java.lang.Class<com.horcrux.svg.PathShadowNode> r0 = com.horcrux.svg.PathShadowNode.class
            return r0
        L_0x0103:
            java.lang.Class<com.horcrux.svg.GroupShadowNode> r0 = com.horcrux.svg.GroupShadowNode.class
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.RenderableViewManager.getShadowNodeClass():java.lang.Class");
    }

    /* access modifiers changed from: protected */
    public View createViewInstance(ThemedReactContext themedReactContext) {
        throw new IllegalStateException("SVG elements does not map into a native view");
    }

    public void updateExtraData(View view, Object obj) {
        throw new IllegalStateException("SVG elements does not map into a native view");
    }
}
