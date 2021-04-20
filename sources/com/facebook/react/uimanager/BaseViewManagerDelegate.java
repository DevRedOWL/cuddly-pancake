package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

public abstract class BaseViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode>> implements ViewManagerDelegate<T> {
    protected final U mViewManager;

    public BaseViewManagerDelegate(U u) {
        this.mViewManager = u;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProperty(T r5, java.lang.String r6, java.lang.Object r7) {
        /*
            r4 = this;
            int r0 = r6.hashCode()
            r1 = 0
            switch(r0) {
                case -1721943862: goto L_0x012f;
                case -1721943861: goto L_0x0123;
                case -1267206133: goto L_0x0117;
                case -1228066334: goto L_0x010c;
                case -908189618: goto L_0x0100;
                case -908189617: goto L_0x00f4;
                case -877170387: goto L_0x00e8;
                case -731417480: goto L_0x00dc;
                case -101663499: goto L_0x00d2;
                case -101359900: goto L_0x00c7;
                case -80891667: goto L_0x00ba;
                case -40300674: goto L_0x00ad;
                case -4379043: goto L_0x00a1;
                case 36255470: goto L_0x0096;
                case 333432965: goto L_0x008a;
                case 581268560: goto L_0x007e;
                case 588239831: goto L_0x0072;
                case 746986311: goto L_0x0066;
                case 1052666732: goto L_0x0059;
                case 1146842694: goto L_0x004e;
                case 1153872867: goto L_0x0043;
                case 1287124693: goto L_0x0038;
                case 1349188574: goto L_0x002c;
                case 1410320624: goto L_0x0021;
                case 1505602511: goto L_0x0016;
                case 2045685618: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x013b
        L_0x000a:
            java.lang.String r0 = "nativeID"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 15
            goto L_0x013c
        L_0x0016:
            java.lang.String r0 = "accessibilityActions"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 0
            goto L_0x013c
        L_0x0021:
            java.lang.String r0 = "accessibilityStates"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 6
            goto L_0x013c
        L_0x002c:
            java.lang.String r0 = "borderRadius"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 8
            goto L_0x013c
        L_0x0038:
            java.lang.String r0 = "backgroundColor"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 7
            goto L_0x013c
        L_0x0043:
            java.lang.String r0 = "accessibilityState"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 5
            goto L_0x013c
        L_0x004e:
            java.lang.String r0 = "accessibilityLabel"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 2
            goto L_0x013c
        L_0x0059:
            java.lang.String r0 = "transform"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 22
            goto L_0x013c
        L_0x0066:
            java.lang.String r0 = "importantForAccessibility"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 14
            goto L_0x013c
        L_0x0072:
            java.lang.String r0 = "borderBottomRightRadius"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 10
            goto L_0x013c
        L_0x007e:
            java.lang.String r0 = "borderBottomLeftRadius"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 9
            goto L_0x013c
        L_0x008a:
            java.lang.String r0 = "borderTopRightRadius"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 12
            goto L_0x013c
        L_0x0096:
            java.lang.String r0 = "accessibilityLiveRegion"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 3
            goto L_0x013c
        L_0x00a1:
            java.lang.String r0 = "elevation"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 13
            goto L_0x013c
        L_0x00ad:
            java.lang.String r0 = "rotation"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 18
            goto L_0x013c
        L_0x00ba:
            java.lang.String r0 = "renderToHardwareTextureAndroid"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 17
            goto L_0x013c
        L_0x00c7:
            java.lang.String r0 = "accessibilityRole"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 4
            goto L_0x013c
        L_0x00d2:
            java.lang.String r0 = "accessibilityHint"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 1
            goto L_0x013c
        L_0x00dc:
            java.lang.String r0 = "zIndex"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 25
            goto L_0x013c
        L_0x00e8:
            java.lang.String r0 = "testID"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 21
            goto L_0x013c
        L_0x00f4:
            java.lang.String r0 = "scaleY"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 20
            goto L_0x013c
        L_0x0100:
            java.lang.String r0 = "scaleX"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 19
            goto L_0x013c
        L_0x010c:
            java.lang.String r0 = "borderTopLeftRadius"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 11
            goto L_0x013c
        L_0x0117:
            java.lang.String r0 = "opacity"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 16
            goto L_0x013c
        L_0x0123:
            java.lang.String r0 = "translateY"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 24
            goto L_0x013c
        L_0x012f:
            java.lang.String r0 = "translateX"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x013b
            r6 = 23
            goto L_0x013c
        L_0x013b:
            r6 = -1
        L_0x013c:
            r0 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3 = 2143289344(0x7fc00000, float:NaN)
            switch(r6) {
                case 0: goto L_0x0287;
                case 1: goto L_0x027f;
                case 2: goto L_0x0277;
                case 3: goto L_0x026f;
                case 4: goto L_0x0267;
                case 5: goto L_0x025f;
                case 6: goto L_0x0257;
                case 7: goto L_0x0248;
                case 8: goto L_0x0239;
                case 9: goto L_0x022a;
                case 10: goto L_0x021a;
                case 11: goto L_0x020a;
                case 12: goto L_0x01fa;
                case 13: goto L_0x01ea;
                case 14: goto L_0x01e1;
                case 15: goto L_0x01d8;
                case 16: goto L_0x01c8;
                case 17: goto L_0x01b8;
                case 18: goto L_0x01a8;
                case 19: goto L_0x0198;
                case 20: goto L_0x0188;
                case 21: goto L_0x017f;
                case 22: goto L_0x0176;
                case 23: goto L_0x0166;
                case 24: goto L_0x0156;
                case 25: goto L_0x0146;
                default: goto L_0x0144;
            }
        L_0x0144:
            goto L_0x028e
        L_0x0146:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x014b
            goto L_0x0151
        L_0x014b:
            java.lang.Double r7 = (java.lang.Double) r7
            float r2 = r7.floatValue()
        L_0x0151:
            r6.setZIndex(r5, r2)
            goto L_0x028e
        L_0x0156:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x015b
            goto L_0x0161
        L_0x015b:
            java.lang.Double r7 = (java.lang.Double) r7
            float r2 = r7.floatValue()
        L_0x0161:
            r6.setTranslateY(r5, r2)
            goto L_0x028e
        L_0x0166:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x016b
            goto L_0x0171
        L_0x016b:
            java.lang.Double r7 = (java.lang.Double) r7
            float r2 = r7.floatValue()
        L_0x0171:
            r6.setTranslateX(r5, r2)
            goto L_0x028e
        L_0x0176:
            U r6 = r4.mViewManager
            com.facebook.react.bridge.ReadableArray r7 = (com.facebook.react.bridge.ReadableArray) r7
            r6.setTransform(r5, r7)
            goto L_0x028e
        L_0x017f:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setTestId(r5, r7)
            goto L_0x028e
        L_0x0188:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x018d
            goto L_0x0193
        L_0x018d:
            java.lang.Double r7 = (java.lang.Double) r7
            float r0 = r7.floatValue()
        L_0x0193:
            r6.setScaleY(r5, r0)
            goto L_0x028e
        L_0x0198:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x019d
            goto L_0x01a3
        L_0x019d:
            java.lang.Double r7 = (java.lang.Double) r7
            float r0 = r7.floatValue()
        L_0x01a3:
            r6.setScaleX(r5, r0)
            goto L_0x028e
        L_0x01a8:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x01ad
            goto L_0x01b3
        L_0x01ad:
            java.lang.Double r7 = (java.lang.Double) r7
            float r2 = r7.floatValue()
        L_0x01b3:
            r6.setRotation(r5, r2)
            goto L_0x028e
        L_0x01b8:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x01bd
            goto L_0x01c3
        L_0x01bd:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r1 = r7.booleanValue()
        L_0x01c3:
            r6.setRenderToHardwareTexture(r5, r1)
            goto L_0x028e
        L_0x01c8:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x01cd
            goto L_0x01d3
        L_0x01cd:
            java.lang.Double r7 = (java.lang.Double) r7
            float r0 = r7.floatValue()
        L_0x01d3:
            r6.setOpacity(r5, r0)
            goto L_0x028e
        L_0x01d8:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setNativeId(r5, r7)
            goto L_0x028e
        L_0x01e1:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setImportantForAccessibility(r5, r7)
            goto L_0x028e
        L_0x01ea:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x01ef
            goto L_0x01f5
        L_0x01ef:
            java.lang.Double r7 = (java.lang.Double) r7
            float r2 = r7.floatValue()
        L_0x01f5:
            r6.setElevation(r5, r2)
            goto L_0x028e
        L_0x01fa:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x01ff
            goto L_0x0205
        L_0x01ff:
            java.lang.Double r7 = (java.lang.Double) r7
            float r3 = r7.floatValue()
        L_0x0205:
            r6.setBorderTopRightRadius(r5, r3)
            goto L_0x028e
        L_0x020a:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x020f
            goto L_0x0215
        L_0x020f:
            java.lang.Double r7 = (java.lang.Double) r7
            float r3 = r7.floatValue()
        L_0x0215:
            r6.setBorderTopLeftRadius(r5, r3)
            goto L_0x028e
        L_0x021a:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x021f
            goto L_0x0225
        L_0x021f:
            java.lang.Double r7 = (java.lang.Double) r7
            float r3 = r7.floatValue()
        L_0x0225:
            r6.setBorderBottomRightRadius(r5, r3)
            goto L_0x028e
        L_0x022a:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x022f
            goto L_0x0235
        L_0x022f:
            java.lang.Double r7 = (java.lang.Double) r7
            float r3 = r7.floatValue()
        L_0x0235:
            r6.setBorderBottomLeftRadius(r5, r3)
            goto L_0x028e
        L_0x0239:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x023e
            goto L_0x0244
        L_0x023e:
            java.lang.Double r7 = (java.lang.Double) r7
            float r3 = r7.floatValue()
        L_0x0244:
            r6.setBorderRadius(r5, r3)
            goto L_0x028e
        L_0x0248:
            U r6 = r4.mViewManager
            if (r7 != 0) goto L_0x024d
            goto L_0x0253
        L_0x024d:
            java.lang.Double r7 = (java.lang.Double) r7
            int r1 = r7.intValue()
        L_0x0253:
            r6.setBackgroundColor(r5, r1)
            goto L_0x028e
        L_0x0257:
            U r6 = r4.mViewManager
            com.facebook.react.bridge.ReadableArray r7 = (com.facebook.react.bridge.ReadableArray) r7
            r6.setViewStates(r5, r7)
            goto L_0x028e
        L_0x025f:
            U r6 = r4.mViewManager
            com.facebook.react.bridge.ReadableMap r7 = (com.facebook.react.bridge.ReadableMap) r7
            r6.setViewState(r5, r7)
            goto L_0x028e
        L_0x0267:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setAccessibilityRole(r5, r7)
            goto L_0x028e
        L_0x026f:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setAccessibilityLiveRegion(r5, r7)
            goto L_0x028e
        L_0x0277:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setAccessibilityLabel(r5, r7)
            goto L_0x028e
        L_0x027f:
            U r6 = r4.mViewManager
            java.lang.String r7 = (java.lang.String) r7
            r6.setAccessibilityHint(r5, r7)
            goto L_0x028e
        L_0x0287:
            U r6 = r4.mViewManager
            com.facebook.react.bridge.ReadableArray r7 = (com.facebook.react.bridge.ReadableArray) r7
            r6.setAccessibilityActions(r5, r7)
        L_0x028e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.BaseViewManagerDelegate.setProperty(android.view.View, java.lang.String, java.lang.Object):void");
    }
}
