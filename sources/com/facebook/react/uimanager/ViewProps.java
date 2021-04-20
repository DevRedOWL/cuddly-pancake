package com.facebook.react.uimanager;

import java.util.Arrays;
import java.util.HashSet;

public class ViewProps {
    public static final String ACCESSIBILITY_ACTIONS = "accessibilityActions";
    public static final String ACCESSIBILITY_HINT = "accessibilityHint";
    public static final String ACCESSIBILITY_LABEL = "accessibilityLabel";
    public static final String ACCESSIBILITY_LIVE_REGION = "accessibilityLiveRegion";
    public static final String ACCESSIBILITY_ROLE = "accessibilityRole";
    public static final String ACCESSIBILITY_STATE = "accessibilityState";
    public static final String ACCESSIBILITY_STATES = "accessibilityStates";
    public static final String ALIGN_CONTENT = "alignContent";
    public static final String ALIGN_ITEMS = "alignItems";
    public static final String ALIGN_SELF = "alignSelf";
    public static final String ALLOW_FONT_SCALING = "allowFontScaling";
    public static final String ASPECT_RATIO = "aspectRatio";
    public static final String AUTO = "auto";
    public static final String BACKGROUND_COLOR = "backgroundColor";
    public static final String BORDER_BOTTOM_COLOR = "borderBottomColor";
    public static final String BORDER_BOTTOM_END_RADIUS = "borderBottomEndRadius";
    public static final String BORDER_BOTTOM_LEFT_RADIUS = "borderBottomLeftRadius";
    public static final String BORDER_BOTTOM_RIGHT_RADIUS = "borderBottomRightRadius";
    public static final String BORDER_BOTTOM_START_RADIUS = "borderBottomStartRadius";
    public static final String BORDER_BOTTOM_WIDTH = "borderBottomWidth";
    public static final String BORDER_COLOR = "borderColor";
    public static final String BORDER_END_COLOR = "borderEndColor";
    public static final String BORDER_END_WIDTH = "borderEndWidth";
    public static final String BORDER_LEFT_COLOR = "borderLeftColor";
    public static final String BORDER_LEFT_WIDTH = "borderLeftWidth";
    public static final String BORDER_RADIUS = "borderRadius";
    public static final String BORDER_RIGHT_COLOR = "borderRightColor";
    public static final String BORDER_RIGHT_WIDTH = "borderRightWidth";
    public static final int[] BORDER_SPACING_TYPES = {8, 4, 5, 1, 3, 0, 2};
    public static final String BORDER_START_COLOR = "borderStartColor";
    public static final String BORDER_START_WIDTH = "borderStartWidth";
    public static final String BORDER_TOP_COLOR = "borderTopColor";
    public static final String BORDER_TOP_END_RADIUS = "borderTopEndRadius";
    public static final String BORDER_TOP_LEFT_RADIUS = "borderTopLeftRadius";
    public static final String BORDER_TOP_RIGHT_RADIUS = "borderTopRightRadius";
    public static final String BORDER_TOP_START_RADIUS = "borderTopStartRadius";
    public static final String BORDER_TOP_WIDTH = "borderTopWidth";
    public static final String BORDER_WIDTH = "borderWidth";
    public static final String BOTTOM = "bottom";
    public static final String BOX_NONE = "box-none";
    public static final String COLLAPSABLE = "collapsable";
    public static final String COLOR = "color";
    public static final String DISPLAY = "display";
    public static final String ELEVATION = "elevation";
    public static final String ELLIPSIZE_MODE = "ellipsizeMode";
    public static final String ENABLED = "enabled";
    public static final String END = "end";
    public static final String FLEX = "flex";
    public static final String FLEX_BASIS = "flexBasis";
    public static final String FLEX_DIRECTION = "flexDirection";
    public static final String FLEX_GROW = "flexGrow";
    public static final String FLEX_SHRINK = "flexShrink";
    public static final String FLEX_WRAP = "flexWrap";
    public static final String FONT_FAMILY = "fontFamily";
    public static final String FONT_SIZE = "fontSize";
    public static final String FONT_STYLE = "fontStyle";
    public static final String FONT_WEIGHT = "fontWeight";
    public static final String HEIGHT = "height";
    public static final String HIDDEN = "hidden";
    public static final String IMPORTANT_FOR_ACCESSIBILITY = "importantForAccessibility";
    public static final String INCLUDE_FONT_PADDING = "includeFontPadding";
    public static final String JUSTIFY_CONTENT = "justifyContent";
    private static final HashSet<String> LAYOUT_ONLY_PROPS = new HashSet<>(Arrays.asList(new String[]{ALIGN_SELF, ALIGN_ITEMS, COLLAPSABLE, FLEX, FLEX_BASIS, FLEX_DIRECTION, FLEX_GROW, FLEX_SHRINK, FLEX_WRAP, JUSTIFY_CONTENT, ALIGN_CONTENT, "display", "position", RIGHT, TOP, BOTTOM, LEFT, "start", "end", "width", "height", MIN_WIDTH, MAX_WIDTH, MIN_HEIGHT, MAX_HEIGHT, MARGIN, MARGIN_VERTICAL, MARGIN_HORIZONTAL, MARGIN_LEFT, MARGIN_RIGHT, MARGIN_TOP, MARGIN_BOTTOM, MARGIN_START, MARGIN_END, PADDING, PADDING_VERTICAL, PADDING_HORIZONTAL, PADDING_LEFT, PADDING_RIGHT, PADDING_TOP, PADDING_BOTTOM, PADDING_START, PADDING_END}));
    public static final String LEFT = "left";
    public static final String LETTER_SPACING = "letterSpacing";
    public static final String LINE_HEIGHT = "lineHeight";
    public static final String MARGIN = "margin";
    public static final String MARGIN_BOTTOM = "marginBottom";
    public static final String MARGIN_END = "marginEnd";
    public static final String MARGIN_HORIZONTAL = "marginHorizontal";
    public static final String MARGIN_LEFT = "marginLeft";
    public static final String MARGIN_RIGHT = "marginRight";
    public static final String MARGIN_START = "marginStart";
    public static final String MARGIN_TOP = "marginTop";
    public static final String MARGIN_VERTICAL = "marginVertical";
    public static final String MAX_FONT_SIZE_MULTIPLIER = "maxFontSizeMultiplier";
    public static final String MAX_HEIGHT = "maxHeight";
    public static final String MAX_WIDTH = "maxWidth";
    public static final String MIN_HEIGHT = "minHeight";
    public static final String MIN_WIDTH = "minWidth";
    public static final String NATIVE_ID = "nativeID";
    public static final String NEEDS_OFFSCREEN_ALPHA_COMPOSITING = "needsOffscreenAlphaCompositing";
    public static final String NONE = "none";
    public static final String NUMBER_OF_LINES = "numberOfLines";

    /* renamed from: ON */
    public static final String f1332ON = "on";
    public static final String ON_LAYOUT = "onLayout";
    public static final String OPACITY = "opacity";
    public static final String OVERFLOW = "overflow";
    public static final String PADDING = "padding";
    public static final String PADDING_BOTTOM = "paddingBottom";
    public static final String PADDING_END = "paddingEnd";
    public static final String PADDING_HORIZONTAL = "paddingHorizontal";
    public static final String PADDING_LEFT = "paddingLeft";
    public static final int[] PADDING_MARGIN_SPACING_TYPES = {8, 7, 6, 4, 5, 1, 3, 0, 2};
    public static final String PADDING_RIGHT = "paddingRight";
    public static final String PADDING_START = "paddingStart";
    public static final String PADDING_TOP = "paddingTop";
    public static final String PADDING_VERTICAL = "paddingVertical";
    public static final String POINTER_EVENTS = "pointerEvents";
    public static final String POSITION = "position";
    public static final int[] POSITION_SPACING_TYPES = {4, 5, 1, 3};
    public static final String RENDER_TO_HARDWARE_TEXTURE = "renderToHardwareTextureAndroid";
    public static final String RESIZE_METHOD = "resizeMethod";
    public static final String RESIZE_MODE = "resizeMode";
    public static final String RIGHT = "right";
    public static final String ROTATION = "rotation";
    public static final String SCALE_X = "scaleX";
    public static final String SCALE_Y = "scaleY";
    public static final String SCROLL = "scroll";
    public static final String START = "start";
    public static final String TEST_ID = "testID";
    public static final String TEXT_ALIGN = "textAlign";
    public static final String TEXT_ALIGN_VERTICAL = "textAlignVertical";
    public static final String TEXT_BREAK_STRATEGY = "textBreakStrategy";
    public static final String TEXT_DECORATION_LINE = "textDecorationLine";
    public static final String TOP = "top";
    public static final String TRANSFORM = "transform";
    public static final String TRANSLATE_X = "translateX";
    public static final String TRANSLATE_Y = "translateY";
    public static final String VIEW_CLASS_NAME = "RCTView";
    public static final String VISIBLE = "visible";
    public static final String WIDTH = "width";
    public static final String Z_INDEX = "zIndex";

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isLayoutOnly(com.facebook.react.bridge.ReadableMap r18, java.lang.String r19) {
        /*
            r0 = r18
            r1 = r19
            java.util.HashSet<java.lang.String> r2 = LAYOUT_ONLY_PROPS
            boolean r2 = r2.contains(r1)
            r3 = 1
            if (r2 == 0) goto L_0x000e
            return r3
        L_0x000e:
            java.lang.String r2 = "pointerEvents"
            boolean r2 = r2.equals(r1)
            r4 = 0
            if (r2 == 0) goto L_0x002f
            java.lang.String r0 = r18.getString(r19)
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = "box-none"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            return r3
        L_0x002f:
            int r5 = r19.hashCode()
            java.lang.String r6 = "overflow"
            java.lang.String r7 = "borderLeftWidth"
            java.lang.String r8 = "borderLeftColor"
            java.lang.String r9 = "opacity"
            java.lang.String r10 = "borderBottomWidth"
            java.lang.String r11 = "borderBottomColor"
            java.lang.String r12 = "borderTopWidth"
            java.lang.String r13 = "borderTopColor"
            java.lang.String r14 = "borderRightWidth"
            java.lang.String r15 = "borderRightColor"
            java.lang.String r2 = "borderWidth"
            switch(r5) {
                case -1989576717: goto L_0x00af;
                case -1971292586: goto L_0x00a6;
                case -1470826662: goto L_0x009e;
                case -1452542531: goto L_0x0095;
                case -1308858324: goto L_0x008d;
                case -1290574193: goto L_0x0084;
                case -1267206133: goto L_0x007c;
                case -242276144: goto L_0x0074;
                case -223992013: goto L_0x006c;
                case 529642498: goto L_0x0063;
                case 741115130: goto L_0x005b;
                case 1349188574: goto L_0x0050;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x00b7
        L_0x0050:
            java.lang.String r5 = "borderRadius"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00b7
            r1 = 1
            goto L_0x00b8
        L_0x005b:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00b7
            r1 = 6
            goto L_0x00b8
        L_0x0063:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00b7
            r1 = 11
            goto L_0x00b8
        L_0x006c:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00b7
            r1 = 7
            goto L_0x00b8
        L_0x0074:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00b7
            r1 = 2
            goto L_0x00b8
        L_0x007c:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00b7
            r1 = 0
            goto L_0x00b8
        L_0x0084:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00b7
            r1 = 10
            goto L_0x00b8
        L_0x008d:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00b7
            r1 = 5
            goto L_0x00b8
        L_0x0095:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00b7
            r1 = 8
            goto L_0x00b8
        L_0x009e:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00b7
            r1 = 4
            goto L_0x00b8
        L_0x00a6:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00b7
            r1 = 9
            goto L_0x00b8
        L_0x00af:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00b7
            r1 = 3
            goto L_0x00b8
        L_0x00b7:
            r1 = -1
        L_0x00b8:
            r16 = 0
            switch(r1) {
                case 0: goto L_0x018a;
                case 1: goto L_0x0165;
                case 2: goto L_0x0156;
                case 3: goto L_0x0147;
                case 4: goto L_0x0138;
                case 5: goto L_0x0129;
                case 6: goto L_0x0118;
                case 7: goto L_0x0107;
                case 8: goto L_0x00f6;
                case 9: goto L_0x00e5;
                case 10: goto L_0x00d4;
                case 11: goto L_0x00be;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            return r4
        L_0x00be:
            boolean r1 = r0.isNull(r6)
            if (r1 != 0) goto L_0x00d3
            java.lang.String r0 = r0.getString(r6)
            java.lang.String r1 = "visible"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            return r3
        L_0x00d4:
            boolean r1 = r0.isNull(r10)
            if (r1 != 0) goto L_0x00e4
            double r0 = r0.getDouble(r10)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r3 = 0
        L_0x00e4:
            return r3
        L_0x00e5:
            boolean r1 = r0.isNull(r14)
            if (r1 != 0) goto L_0x00f5
            double r0 = r0.getDouble(r14)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r3 = 0
        L_0x00f5:
            return r3
        L_0x00f6:
            boolean r1 = r0.isNull(r12)
            if (r1 != 0) goto L_0x0106
            double r0 = r0.getDouble(r12)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r3 = 0
        L_0x0106:
            return r3
        L_0x0107:
            boolean r1 = r0.isNull(r7)
            if (r1 != 0) goto L_0x0117
            double r0 = r0.getDouble(r7)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0116
            goto L_0x0117
        L_0x0116:
            r3 = 0
        L_0x0117:
            return r3
        L_0x0118:
            boolean r1 = r0.isNull(r2)
            if (r1 != 0) goto L_0x0128
            double r0 = r0.getDouble(r2)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0127
            goto L_0x0128
        L_0x0127:
            r3 = 0
        L_0x0128:
            return r3
        L_0x0129:
            boolean r1 = r0.isNull(r11)
            if (r1 != 0) goto L_0x0136
            int r0 = r0.getInt(r11)
            if (r0 != 0) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r3 = 0
        L_0x0137:
            return r3
        L_0x0138:
            boolean r1 = r0.isNull(r13)
            if (r1 != 0) goto L_0x0145
            int r0 = r0.getInt(r13)
            if (r0 != 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r3 = 0
        L_0x0146:
            return r3
        L_0x0147:
            boolean r1 = r0.isNull(r15)
            if (r1 != 0) goto L_0x0154
            int r0 = r0.getInt(r15)
            if (r0 != 0) goto L_0x0154
            goto L_0x0155
        L_0x0154:
            r3 = 0
        L_0x0155:
            return r3
        L_0x0156:
            boolean r1 = r0.isNull(r8)
            if (r1 != 0) goto L_0x0163
            int r0 = r0.getInt(r8)
            if (r0 != 0) goto L_0x0163
            goto L_0x0164
        L_0x0163:
            r3 = 0
        L_0x0164:
            return r3
        L_0x0165:
            java.lang.String r1 = "backgroundColor"
            boolean r5 = r0.hasKey(r1)
            if (r5 == 0) goto L_0x0174
            int r1 = r0.getInt(r1)
            if (r1 == 0) goto L_0x0174
            return r4
        L_0x0174:
            boolean r1 = r0.hasKey(r2)
            if (r1 == 0) goto L_0x0189
            boolean r1 = r0.isNull(r2)
            if (r1 != 0) goto L_0x0189
            double r0 = r0.getDouble(r2)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x0189
            return r4
        L_0x0189:
            return r3
        L_0x018a:
            boolean r1 = r0.isNull(r9)
            if (r1 != 0) goto L_0x019c
            double r0 = r0.getDouble(r9)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x019b
            goto L_0x019c
        L_0x019b:
            r3 = 0
        L_0x019c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.ViewProps.isLayoutOnly(com.facebook.react.bridge.ReadableMap, java.lang.String):boolean");
    }
}
