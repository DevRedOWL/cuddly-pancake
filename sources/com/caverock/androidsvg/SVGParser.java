package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.facebook.react.uimanager.ViewProps;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.jetbrains.anko.DimensionsKt;
import org.videolan.libvlc.media.MediaPlayer;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;

class SVGParser {
    private static final String CURRENTCOLOR = "currentColor";
    public static final int ENTITY_WATCH_BUFFER_SIZE = 4096;
    private static final String FEATURE_STRING_PREFIX = "http://www.w3.org/TR/SVG11/feature#";
    private static final String NONE = "none";
    private static final String SVG_NAMESPACE = "http://www.w3.org/2000/svg";
    private static final String TAG = "SVGParser";
    private static final String VALID_DISPLAY_VALUES = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|";
    private static final String VALID_VISIBILITY_VALUES = "|visible|hidden|collapse|";
    private static final String XLINK_NAMESPACE = "http://www.w3.org/1999/xlink";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE = "alternate";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE_NO = "no";
    public static final String XML_STYLESHEET_ATTR_HREF = "href";
    public static final String XML_STYLESHEET_ATTR_MEDIA = "media";
    public static final String XML_STYLESHEET_ATTR_MEDIA_ALL = "all";
    public static final String XML_STYLESHEET_ATTR_TYPE = "type";
    private static final String XML_STYLESHEET_PROCESSING_INSTRUCTION = "xml-stylesheet";
    private SVG.SvgContainer currentElement = null;
    private int ignoreDepth;
    private boolean ignoring = false;
    private boolean inMetadataElement = false;
    private boolean inStyleElement = false;
    private StringBuilder metadataElementContents = null;
    private SVGElem metadataTag = null;
    private StringBuilder styleElementContents = null;
    private SVG svgDocument = null;

    private void debug(String str, Object... objArr) {
    }

    /* access modifiers changed from: private */
    public void endDocument() {
    }

    private static float hueToRgb(float f, float f2, float f3) {
        float f4;
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            f4 = (f2 - f) * f3;
        } else if (f3 < 3.0f) {
            return f2;
        } else {
            if (f3 >= 4.0f) {
                return f;
            }
            f4 = (f2 - f) * (4.0f - f3);
        }
        return f4 + f;
    }

    SVGParser() {
    }

    private enum SVGElem {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;
        
        private static final Map<String, SVGElem> cache = null;

        static {
            int i;
            cache = new HashMap();
            for (SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    cache.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    cache.put(sVGElem.name(), sVGElem);
                }
            }
        }

        public static SVGElem fromString(String str) {
            SVGElem sVGElem = cache.get(str);
            if (sVGElem != null) {
                return sVGElem;
            }
            return UNSUPPORTED;
        }
    }

    private enum SVGAttr {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;
        
        private static final Map<String, SVGAttr> cache = null;

        static {
            int i;
            cache = new HashMap();
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    cache.put("class", sVGAttr);
                } else if (sVGAttr != UNSUPPORTED) {
                    cache.put(sVGAttr.name().replace('_', '-'), sVGAttr);
                }
            }
        }

        public static SVGAttr fromString(String str) {
            SVGAttr sVGAttr = cache.get(str);
            if (sVGAttr != null) {
                return sVGAttr;
            }
            return UNSUPPORTED;
        }
    }

    private static class ColourKeywords {
        private static final Map<String, Integer> colourKeywords = new HashMap(47);

        private ColourKeywords() {
        }

        static {
            colourKeywords.put("aliceblue", -984833);
            colourKeywords.put("antiquewhite", -332841);
            colourKeywords.put("aqua", -16711681);
            colourKeywords.put("aquamarine", -8388652);
            colourKeywords.put("azure", -983041);
            colourKeywords.put("beige", -657956);
            colourKeywords.put("bisque", -6972);
            colourKeywords.put("black", Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
            colourKeywords.put("blanchedalmond", -5171);
            colourKeywords.put("blue", -16776961);
            colourKeywords.put("blueviolet", -7722014);
            colourKeywords.put("brown", -5952982);
            colourKeywords.put("burlywood", -2180985);
            colourKeywords.put("cadetblue", -10510688);
            colourKeywords.put("chartreuse", -8388864);
            colourKeywords.put("chocolate", -2987746);
            colourKeywords.put("coral", -32944);
            colourKeywords.put("cornflowerblue", -10185235);
            colourKeywords.put("cornsilk", -1828);
            colourKeywords.put("crimson", -2354116);
            colourKeywords.put("cyan", -16711681);
            colourKeywords.put("darkblue", -16777077);
            colourKeywords.put("darkcyan", -16741493);
            colourKeywords.put("darkgoldenrod", -4684277);
            colourKeywords.put("darkgray", -5658199);
            colourKeywords.put("darkgreen", -16751616);
            colourKeywords.put("darkgrey", -5658199);
            colourKeywords.put("darkkhaki", -4343957);
            colourKeywords.put("darkmagenta", -7667573);
            colourKeywords.put("darkolivegreen", -11179217);
            colourKeywords.put("darkorange", -29696);
            colourKeywords.put("darkorchid", -6737204);
            colourKeywords.put("darkred", -7667712);
            colourKeywords.put("darksalmon", -1468806);
            colourKeywords.put("darkseagreen", -7357297);
            colourKeywords.put("darkslateblue", -12042869);
            colourKeywords.put("darkslategray", -13676721);
            colourKeywords.put("darkslategrey", -13676721);
            colourKeywords.put("darkturquoise", -16724271);
            colourKeywords.put("darkviolet", -7077677);
            colourKeywords.put("deeppink", -60269);
            colourKeywords.put("deepskyblue", -16728065);
            colourKeywords.put("dimgray", -9868951);
            colourKeywords.put("dimgrey", -9868951);
            colourKeywords.put("dodgerblue", -14774017);
            colourKeywords.put("firebrick", -5103070);
            colourKeywords.put("floralwhite", -1296);
            colourKeywords.put("forestgreen", -14513374);
            colourKeywords.put("fuchsia", -65281);
            colourKeywords.put("gainsboro", -2302756);
            colourKeywords.put("ghostwhite", -460545);
            colourKeywords.put("gold", -10496);
            colourKeywords.put("goldenrod", -2448096);
            colourKeywords.put("gray", -8355712);
            colourKeywords.put("green", -16744448);
            colourKeywords.put("greenyellow", -5374161);
            colourKeywords.put("grey", -8355712);
            colourKeywords.put("honeydew", -983056);
            colourKeywords.put("hotpink", -38476);
            colourKeywords.put("indianred", -3318692);
            colourKeywords.put("indigo", -11861886);
            colourKeywords.put("ivory", -16);
            colourKeywords.put("khaki", -989556);
            colourKeywords.put("lavender", -1644806);
            colourKeywords.put("lavenderblush", -3851);
            colourKeywords.put("lawngreen", -8586240);
            colourKeywords.put("lemonchiffon", -1331);
            colourKeywords.put("lightblue", -5383962);
            colourKeywords.put("lightcoral", -1015680);
            colourKeywords.put("lightcyan", -2031617);
            colourKeywords.put("lightgoldenrodyellow", -329006);
            colourKeywords.put("lightgray", -2894893);
            colourKeywords.put("lightgreen", -7278960);
            colourKeywords.put("lightgrey", -2894893);
            colourKeywords.put("lightpink", -18751);
            colourKeywords.put("lightsalmon", -24454);
            colourKeywords.put("lightseagreen", -14634326);
            colourKeywords.put("lightskyblue", -7876870);
            colourKeywords.put("lightslategray", -8943463);
            colourKeywords.put("lightslategrey", -8943463);
            colourKeywords.put("lightsteelblue", -5192482);
            colourKeywords.put("lightyellow", -32);
            colourKeywords.put("lime", -16711936);
            colourKeywords.put("limegreen", -13447886);
            colourKeywords.put("linen", -331546);
            colourKeywords.put("magenta", -65281);
            colourKeywords.put("maroon", -8388608);
            colourKeywords.put("mediumaquamarine", -10039894);
            colourKeywords.put("mediumblue", -16777011);
            colourKeywords.put("mediumorchid", -4565549);
            colourKeywords.put("mediumpurple", -7114533);
            colourKeywords.put("mediumseagreen", -12799119);
            colourKeywords.put("mediumslateblue", -8689426);
            colourKeywords.put("mediumspringgreen", -16713062);
            colourKeywords.put("mediumturquoise", -12004916);
            colourKeywords.put("mediumvioletred", -3730043);
            colourKeywords.put("midnightblue", -15132304);
            colourKeywords.put("mintcream", -655366);
            colourKeywords.put("mistyrose", -6943);
            colourKeywords.put("moccasin", -6987);
            colourKeywords.put("navajowhite", -8531);
            colourKeywords.put("navy", -16777088);
            colourKeywords.put("oldlace", -133658);
            colourKeywords.put("olive", -8355840);
            colourKeywords.put("olivedrab", -9728477);
            colourKeywords.put("orange", -23296);
            colourKeywords.put("orangered", -47872);
            colourKeywords.put("orchid", -2461482);
            colourKeywords.put("palegoldenrod", -1120086);
            colourKeywords.put("palegreen", -6751336);
            colourKeywords.put("paleturquoise", -5247250);
            colourKeywords.put("palevioletred", -2396013);
            colourKeywords.put("papayawhip", -4139);
            colourKeywords.put("peachpuff", -9543);
            colourKeywords.put("peru", -3308225);
            colourKeywords.put("pink", -16181);
            colourKeywords.put("plum", -2252579);
            colourKeywords.put("powderblue", -5185306);
            colourKeywords.put("purple", -8388480);
            colourKeywords.put("rebeccapurple", -10079335);
            colourKeywords.put("red", Integer.valueOf(SupportMenu.CATEGORY_MASK));
            colourKeywords.put("rosybrown", -4419697);
            colourKeywords.put("royalblue", -12490271);
            colourKeywords.put("saddlebrown", -7650029);
            colourKeywords.put("salmon", -360334);
            colourKeywords.put("sandybrown", -744352);
            colourKeywords.put("seagreen", -13726889);
            colourKeywords.put("seashell", -2578);
            colourKeywords.put("sienna", -6270419);
            colourKeywords.put("silver", -4144960);
            colourKeywords.put("skyblue", -7876885);
            colourKeywords.put("slateblue", -9807155);
            colourKeywords.put("slategray", -9404272);
            colourKeywords.put("slategrey", -9404272);
            colourKeywords.put("snow", -1286);
            colourKeywords.put("springgreen", -16711809);
            colourKeywords.put("steelblue", -12156236);
            colourKeywords.put("tan", -2968436);
            colourKeywords.put("teal", -16744320);
            colourKeywords.put("thistle", -2572328);
            colourKeywords.put("tomato", -40121);
            colourKeywords.put("turquoise", -12525360);
            colourKeywords.put("violet", -1146130);
            colourKeywords.put("wheat", -663885);
            colourKeywords.put("white", -1);
            colourKeywords.put("whitesmoke", -657931);
            colourKeywords.put("yellow", Integer.valueOf(InputDeviceCompat.SOURCE_ANY));
            colourKeywords.put("yellowgreen", -6632142);
            colourKeywords.put("transparent", 0);
        }

        static Integer get(String str) {
            return colourKeywords.get(str);
        }
    }

    private static class FontSizeKeywords {
        private static final Map<String, SVG.Length> fontSizeKeywords = new HashMap(9);

        private FontSizeKeywords() {
        }

        static {
            fontSizeKeywords.put("xx-small", new SVG.Length(0.694f, SVG.Unit.pt));
            fontSizeKeywords.put("x-small", new SVG.Length(0.833f, SVG.Unit.pt));
            fontSizeKeywords.put("small", new SVG.Length(10.0f, SVG.Unit.pt));
            fontSizeKeywords.put("medium", new SVG.Length(12.0f, SVG.Unit.pt));
            fontSizeKeywords.put("large", new SVG.Length(14.4f, SVG.Unit.pt));
            fontSizeKeywords.put("x-large", new SVG.Length(17.3f, SVG.Unit.pt));
            fontSizeKeywords.put("xx-large", new SVG.Length(20.7f, SVG.Unit.pt));
            fontSizeKeywords.put("smaller", new SVG.Length(83.33f, SVG.Unit.percent));
            fontSizeKeywords.put("larger", new SVG.Length(120.0f, SVG.Unit.percent));
        }

        static SVG.Length get(String str) {
            return fontSizeKeywords.get(str);
        }
    }

    private static class FontWeightKeywords {
        private static final Map<String, Integer> fontWeightKeywords = new HashMap(13);

        private FontWeightKeywords() {
        }

        static {
            fontWeightKeywords.put("normal", 400);
            fontWeightKeywords.put("bold", 700);
            fontWeightKeywords.put("bolder", 1);
            fontWeightKeywords.put("lighter", -1);
            fontWeightKeywords.put("100", 100);
            fontWeightKeywords.put("200", 200);
            fontWeightKeywords.put("300", 300);
            fontWeightKeywords.put("400", 400);
            fontWeightKeywords.put("500", 500);
            fontWeightKeywords.put("600", 600);
            fontWeightKeywords.put("700", 700);
            fontWeightKeywords.put("800", 800);
            fontWeightKeywords.put("900", Integer.valueOf(MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR));
        }

        static Integer get(String str) {
            return fontWeightKeywords.get(str);
        }
    }

    private static class AspectRatioKeywords {
        private static final Map<String, PreserveAspectRatio.Alignment> aspectRatioKeywords = new HashMap(10);

        private AspectRatioKeywords() {
        }

        static {
            aspectRatioKeywords.put("none", PreserveAspectRatio.Alignment.none);
            aspectRatioKeywords.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            aspectRatioKeywords.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            aspectRatioKeywords.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            aspectRatioKeywords.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            aspectRatioKeywords.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            aspectRatioKeywords.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            aspectRatioKeywords.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            aspectRatioKeywords.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            aspectRatioKeywords.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }

        static PreserveAspectRatio.Alignment get(String str) {
            return aspectRatioKeywords.get(str);
        }
    }

    /* access modifiers changed from: package-private */
    public SVG parse(BufferedInputStream bufferedInputStream, boolean z) throws SVGParseException {
        if (!bufferedInputStream.markSupported()) {
            bufferedInputStream = new BufferedInputStream(bufferedInputStream);
        }
        try {
            bufferedInputStream.mark(3);
            int read = bufferedInputStream.read() + (bufferedInputStream.read() << 8);
            bufferedInputStream.reset();
            if (read == 35615) {
                bufferedInputStream = new BufferedInputStream(new GZIPInputStream(bufferedInputStream));
            }
        } catch (IOException unused) {
        }
        try {
            bufferedInputStream.mark(4096);
            parseUsingXmlPullParser(bufferedInputStream, z);
            return this.svgDocument;
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException unused2) {
                Log.e(TAG, "Exception thrown closing input stream");
            }
        }
    }

    private class XPPAttributesWrapper implements Attributes {
        private XmlPullParser parser;

        public int getIndex(String str) {
            return -1;
        }

        public int getIndex(String str, String str2) {
            return -1;
        }

        public String getType(int i) {
            return null;
        }

        public String getType(String str) {
            return null;
        }

        public String getType(String str, String str2) {
            return null;
        }

        public String getValue(String str) {
            return null;
        }

        public String getValue(String str, String str2) {
            return null;
        }

        public XPPAttributesWrapper(XmlPullParser xmlPullParser) {
            this.parser = xmlPullParser;
        }

        public int getLength() {
            return this.parser.getAttributeCount();
        }

        public String getURI(int i) {
            return this.parser.getAttributeNamespace(i);
        }

        public String getLocalName(int i) {
            return this.parser.getAttributeName(i);
        }

        public String getQName(int i) {
            String attributeName = this.parser.getAttributeName(i);
            if (this.parser.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.parser.getAttributePrefix(i) + ':' + attributeName;
        }

        public String getValue(int i) {
            return this.parser.getAttributeValue(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0116, code lost:
        throw new com.caverock.androidsvg.SVGParseException("Stream error", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0117, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        throw new com.caverock.androidsvg.SVGParseException("XML parser problem", r9);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0117 A[ExcHandler: XmlPullParserException (r9v1 'e' org.xmlpull.v1.XmlPullParserException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseUsingXmlPullParser(java.io.InputStream r9, boolean r10) throws com.caverock.androidsvg.SVGParseException {
        /*
            r8 = this;
            org.xmlpull.v1.XmlPullParser r0 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            com.caverock.androidsvg.SVGParser$XPPAttributesWrapper r1 = new com.caverock.androidsvg.SVGParser$XPPAttributesWrapper     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-docdecl"
            r3 = 0
            r0.setFeature(r2, r3)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r4 = 1
            r0.setFeature(r2, r4)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2 = 0
            r0.setInput(r9, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x001d:
            if (r2 == r4) goto L_0x010a
            if (r2 == 0) goto L_0x0101
            r5 = 8
            java.lang.String r6 = "SVGParser"
            if (r2 == r5) goto L_0x00d4
            r5 = 10
            if (r2 == r5) goto L_0x00ac
            r5 = 58
            r6 = 2
            if (r2 == r6) goto L_0x0080
            r7 = 3
            if (r2 == r7) goto L_0x0053
            r5 = 4
            if (r2 == r5) goto L_0x0044
            r5 = 5
            if (r2 == r5) goto L_0x003b
            goto L_0x0104
        L_0x003b:
            java.lang.String r2 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.text((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0104
        L_0x0044:
            int[] r2 = new int[r6]     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            char[] r5 = r0.getTextCharacters(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6 = r2[r3]     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2 = r2[r4]     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.text(r5, r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0104
        L_0x0053:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r6 == 0) goto L_0x0073
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r7 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x0073:
            java.lang.String r5 = r0.getNamespace()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.endElement(r5, r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0104
        L_0x0080:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r6 == 0) goto L_0x00a0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r7 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x00a0:
            java.lang.String r5 = r0.getNamespace()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.startElement(r5, r6, r2, r1)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0104
        L_0x00ac:
            if (r10 == 0) goto L_0x0104
            com.caverock.androidsvg.SVG r2 = r8.svgDocument     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            com.caverock.androidsvg.SVG$Svg r2 = r2.getRootElement()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r2 != 0) goto L_0x0104
            java.lang.String r2 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = "<!ENTITY "
            boolean r2 = r2.contains(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r2 == 0) goto L_0x0104
            java.lang.String r10 = "Switching to SAX parser to process entities"
            android.util.Log.d(r6, r10)     // Catch:{ IOException -> 0x00ce, XmlPullParserException -> 0x0117 }
            r9.reset()     // Catch:{ IOException -> 0x00ce, XmlPullParserException -> 0x0117 }
            r8.parseUsingSAX(r9)     // Catch:{ IOException -> 0x00ce, XmlPullParserException -> 0x0117 }
            goto L_0x00d3
        L_0x00ce:
            java.lang.String r9 = "Detected internal entity definitions, but could not parse them."
            android.util.Log.w(r6, r9)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x00d3:
            return
        L_0x00d4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = "PROC INSTR: "
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            android.util.Log.d(r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            com.caverock.androidsvg.SVGParser$TextScanner r2 = new com.caverock.androidsvg.SVGParser$TextScanner     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = r2.nextToken()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.util.Map r2 = r8.parseProcessingInstructionAttributes(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.handleProcessingInstruction(r5, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0104
        L_0x0101:
            r8.startDocument()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x0104:
            int r2 = r0.nextToken()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x001d
        L_0x010a:
            r8.endDocument()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            return
        L_0x010e:
            r9 = move-exception
            com.caverock.androidsvg.SVGParseException r10 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r0 = "Stream error"
            r10.<init>(r0, r9)
            throw r10
        L_0x0117:
            r9 = move-exception
            com.caverock.androidsvg.SVGParseException r10 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r0 = "XML parser problem"
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseUsingXmlPullParser(java.io.InputStream, boolean):void");
    }

    private void parseUsingSAX(InputStream inputStream) throws SVGParseException {
        Log.d(TAG, "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            SAXHandler sAXHandler = new SAXHandler();
            xMLReader.setContentHandler(sAXHandler);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", sAXHandler);
            xMLReader.parse(new InputSource(inputStream));
        } catch (ParserConfigurationException e) {
            throw new SVGParseException("XML parser problem", e);
        } catch (SAXException e2) {
            throw new SVGParseException("SVG parse error", e2);
        } catch (IOException e3) {
            throw new SVGParseException("Stream error", e3);
        }
    }

    private class SAXHandler extends DefaultHandler2 {
        private SAXHandler() {
        }

        public void startDocument() throws SAXException {
            SVGParser.this.startDocument();
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            SVGParser.this.startElement(str, str2, str3, attributes);
        }

        public void characters(char[] cArr, int i, int i2) throws SAXException {
            SVGParser.this.text(new String(cArr, i, i2));
        }

        public void endElement(String str, String str2, String str3) throws SAXException {
            SVGParser.this.endElement(str, str2, str3);
        }

        public void endDocument() throws SAXException {
            SVGParser.this.endDocument();
        }

        public void processingInstruction(String str, String str2) throws SAXException {
            SVGParser.this.handleProcessingInstruction(str, SVGParser.this.parseProcessingInstructionAttributes(new TextScanner(str2)));
        }
    }

    /* access modifiers changed from: private */
    public void startDocument() {
        this.svgDocument = new SVG();
    }

    /* access modifiers changed from: private */
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.ignoring) {
            this.ignoreDepth++;
        } else if (SVG_NAMESPACE.equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem fromString = SVGElem.fromString(str2);
            switch (fromString) {
                case svg:
                    svg(attributes);
                    return;
                case g:
                case a:
                    m590g(attributes);
                    return;
                case defs:
                    defs(attributes);
                    return;
                case use:
                    use(attributes);
                    return;
                case path:
                    path(attributes);
                    return;
                case rect:
                    rect(attributes);
                    return;
                case circle:
                    circle(attributes);
                    return;
                case ellipse:
                    ellipse(attributes);
                    return;
                case line:
                    line(attributes);
                    return;
                case polyline:
                    polyline(attributes);
                    return;
                case polygon:
                    polygon(attributes);
                    return;
                case text:
                    text(attributes);
                    return;
                case tspan:
                    tspan(attributes);
                    return;
                case tref:
                    tref(attributes);
                    return;
                case SWITCH:
                    zwitch(attributes);
                    return;
                case symbol:
                    symbol(attributes);
                    return;
                case marker:
                    marker(attributes);
                    return;
                case linearGradient:
                    linearGradient(attributes);
                    return;
                case radialGradient:
                    radialGradient(attributes);
                    return;
                case stop:
                    stop(attributes);
                    return;
                case title:
                case desc:
                    this.inMetadataElement = true;
                    this.metadataTag = fromString;
                    return;
                case clipPath:
                    clipPath(attributes);
                    return;
                case textPath:
                    textPath(attributes);
                    return;
                case pattern:
                    pattern(attributes);
                    return;
                case image:
                    image(attributes);
                    return;
                case view:
                    view(attributes);
                    return;
                case mask:
                    mask(attributes);
                    return;
                case style:
                    style(attributes);
                    return;
                case solidColor:
                    solidColor(attributes);
                    return;
                default:
                    this.ignoring = true;
                    this.ignoreDepth = 1;
                    return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void text(String str) throws SVGParseException {
        if (!this.ignoring) {
            if (this.inMetadataElement) {
                if (this.metadataElementContents == null) {
                    this.metadataElementContents = new StringBuilder(str.length());
                }
                this.metadataElementContents.append(str);
            } else if (this.inStyleElement) {
                if (this.styleElementContents == null) {
                    this.styleElementContents = new StringBuilder(str.length());
                }
                this.styleElementContents.append(str);
            } else if (this.currentElement instanceof SVG.TextContainer) {
                appendToTextContainer(str);
            }
        }
    }

    private void text(char[] cArr, int i, int i2) throws SVGParseException {
        if (!this.ignoring) {
            if (this.inMetadataElement) {
                if (this.metadataElementContents == null) {
                    this.metadataElementContents = new StringBuilder(i2);
                }
                this.metadataElementContents.append(cArr, i, i2);
            } else if (this.inStyleElement) {
                if (this.styleElementContents == null) {
                    this.styleElementContents = new StringBuilder(i2);
                }
                this.styleElementContents.append(cArr, i, i2);
            } else if (this.currentElement instanceof SVG.TextContainer) {
                appendToTextContainer(new String(cArr, i, i2));
            }
        }
    }

    private void appendToTextContainer(String str) throws SVGParseException {
        SVG.SvgObject svgObject;
        SVG.SvgConditionalContainer svgConditionalContainer = (SVG.SvgConditionalContainer) this.currentElement;
        int size = svgConditionalContainer.children.size();
        if (size == 0) {
            svgObject = null;
        } else {
            svgObject = svgConditionalContainer.children.get(size - 1);
        }
        if (svgObject instanceof SVG.TextSequence) {
            StringBuilder sb = new StringBuilder();
            SVG.TextSequence textSequence = (SVG.TextSequence) svgObject;
            sb.append(textSequence.text);
            sb.append(str);
            textSequence.text = sb.toString();
            return;
        }
        this.currentElement.addChild(new SVG.TextSequence(str));
    }

    /* access modifiers changed from: private */
    public void endElement(String str, String str2, String str3) throws SVGParseException {
        if (this.ignoring) {
            int i = this.ignoreDepth - 1;
            this.ignoreDepth = i;
            if (i == 0) {
                this.ignoring = false;
                return;
            }
        }
        if (SVG_NAMESPACE.equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i2 = C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGElem[SVGElem.fromString(str2).ordinal()];
            if (!(i2 == 1 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 13 || i2 == 14)) {
                switch (i2) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 31:
                        break;
                    case 22:
                    case 23:
                        this.inMetadataElement = false;
                        if (this.metadataElementContents != null) {
                            if (this.metadataTag == SVGElem.title) {
                                this.svgDocument.setTitle(this.metadataElementContents.toString());
                            } else if (this.metadataTag == SVGElem.desc) {
                                this.svgDocument.setDesc(this.metadataElementContents.toString());
                            }
                            this.metadataElementContents.setLength(0);
                            return;
                        }
                        return;
                    case 30:
                        StringBuilder sb = this.styleElementContents;
                        if (sb != null) {
                            this.inStyleElement = false;
                            parseCSSStyleSheet(sb.toString());
                            this.styleElementContents.setLength(0);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            this.currentElement = ((SVG.SvgObject) this.currentElement).parent;
        }
    }

    /* access modifiers changed from: private */
    public void handleProcessingInstruction(String str, Map<String, String> map) {
        String str2;
        String resolveCSSStyleSheet;
        if (str.equals(XML_STYLESHEET_PROCESSING_INSTRUCTION) && SVG.getFileResolver() != null) {
            if (map.get("type") != null && !"text/css".equals(map.get("type"))) {
                return;
            }
            if ((map.get(XML_STYLESHEET_ATTR_ALTERNATE) == null || "no".equals(map.get(XML_STYLESHEET_ATTR_ALTERNATE))) && (str2 = map.get(XML_STYLESHEET_ATTR_HREF)) != null && (resolveCSSStyleSheet = SVG.getFileResolver().resolveCSSStyleSheet(str2)) != null) {
                String str3 = map.get(XML_STYLESHEET_ATTR_MEDIA);
                if (str3 != null && !"all".equals(str3.trim())) {
                    resolveCSSStyleSheet = "@media " + str3 + " { " + resolveCSSStyleSheet + "}";
                }
                parseCSSStyleSheet(resolveCSSStyleSheet);
            }
        }
    }

    /* access modifiers changed from: private */
    public Map<String, String> parseProcessingInstructionAttributes(TextScanner textScanner) {
        HashMap hashMap = new HashMap();
        textScanner.skipWhitespace();
        String nextToken = textScanner.nextToken('=');
        while (nextToken != null) {
            textScanner.consume('=');
            hashMap.put(nextToken, textScanner.nextQuotedString());
            textScanner.skipWhitespace();
            nextToken = textScanner.nextToken('=');
        }
        return hashMap;
    }

    private void dumpNode(SVG.SvgObject svgObject, String str) {
        Log.d(TAG, str + svgObject);
        if (svgObject instanceof SVG.SvgConditionalContainer) {
            String str2 = str + "  ";
            for (SVG.SvgObject dumpNode : ((SVG.SvgConditionalContainer) svgObject).children) {
                dumpNode(dumpNode, str2);
            }
        }
    }

    private void svg(Attributes attributes) throws SVGParseException {
        debug("<svg>", new Object[0]);
        SVG.Svg svg = new SVG.Svg();
        svg.document = this.svgDocument;
        svg.parent = this.currentElement;
        parseAttributesCore(svg, attributes);
        parseAttributesStyle(svg, attributes);
        parseAttributesConditional(svg, attributes);
        parseAttributesViewBox(svg, attributes);
        parseAttributesSVG(svg, attributes);
        SVG.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            this.svgDocument.setRootElement(svg);
        } else {
            svgContainer.addChild(svg);
        }
        this.currentElement = svg;
    }

    private void parseAttributesSVG(SVG.Svg svg, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                svg.f1240x = parseLength(trim);
            } else if (i2 == 2) {
                svg.f1241y = parseLength(trim);
            } else if (i2 == 3) {
                svg.width = parseLength(trim);
                if (svg.width.isNegative()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                svg.height = parseLength(trim);
                if (svg.height.isNegative()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i2 == 5) {
                svg.version = trim;
            }
        }
    }

    /* renamed from: g */
    private void m590g(Attributes attributes) throws SVGParseException {
        debug("<g>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Group group = new SVG.Group();
            group.document = this.svgDocument;
            group.parent = this.currentElement;
            parseAttributesCore(group, attributes);
            parseAttributesStyle(group, attributes);
            parseAttributesTransform(group, attributes);
            parseAttributesConditional(group, attributes);
            this.currentElement.addChild(group);
            this.currentElement = group;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void defs(Attributes attributes) throws SVGParseException {
        debug("<defs>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Defs defs = new SVG.Defs();
            defs.document = this.svgDocument;
            defs.parent = this.currentElement;
            parseAttributesCore(defs, attributes);
            parseAttributesStyle(defs, attributes);
            parseAttributesTransform(defs, attributes);
            this.currentElement.addChild(defs);
            this.currentElement = defs;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void use(Attributes attributes) throws SVGParseException {
        debug("<use>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Use use = new SVG.Use();
            use.document = this.svgDocument;
            use.parent = this.currentElement;
            parseAttributesCore(use, attributes);
            parseAttributesStyle(use, attributes);
            parseAttributesTransform(use, attributes);
            parseAttributesConditional(use, attributes);
            parseAttributesUse(use, attributes);
            this.currentElement.addChild(use);
            this.currentElement = use;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesUse(SVG.Use use, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                use.f1264x = parseLength(trim);
            } else if (i2 == 2) {
                use.f1265y = parseLength(trim);
            } else if (i2 == 3) {
                use.width = parseLength(trim);
                if (use.width.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                use.height = parseLength(trim);
                if (use.height.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 == 6 && ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i)))) {
                use.href = trim;
            }
        }
    }

    private void image(Attributes attributes) throws SVGParseException {
        debug("<image>", new Object[0]);
        if (this.currentElement != null) {
            SVG.C1176Image image = new SVG.C1176Image();
            image.document = this.svgDocument;
            image.parent = this.currentElement;
            parseAttributesCore(image, attributes);
            parseAttributesStyle(image, attributes);
            parseAttributesTransform(image, attributes);
            parseAttributesConditional(image, attributes);
            parseAttributesImage(image, attributes);
            this.currentElement.addChild(image);
            this.currentElement = image;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesImage(SVG.C1176Image image, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                image.f1225x = parseLength(trim);
            } else if (i2 == 2) {
                image.f1226y = parseLength(trim);
            } else if (i2 == 3) {
                image.width = parseLength(trim);
                if (image.width.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                image.height = parseLength(trim);
                if (image.height.isNegative()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                if (i2 == 7) {
                    parsePreserveAspectRatio(image, trim);
                }
            } else if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                image.href = trim;
            }
        }
    }

    private void path(Attributes attributes) throws SVGParseException {
        debug("<path>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Path path = new SVG.Path();
            path.document = this.svgDocument;
            path.parent = this.currentElement;
            parseAttributesCore(path, attributes);
            parseAttributesStyle(path, attributes);
            parseAttributesTransform(path, attributes);
            parseAttributesConditional(path, attributes);
            parseAttributesPath(path, attributes);
            this.currentElement.addChild(path);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesPath(SVG.Path path, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 8) {
                path.f1233d = parsePath(trim);
            } else if (i2 != 9) {
                continue;
            } else {
                path.pathLength = Float.valueOf(parseFloat(trim));
                if (path.pathLength.floatValue() < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void rect(Attributes attributes) throws SVGParseException {
        debug("<rect>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Rect rect = new SVG.Rect();
            rect.document = this.svgDocument;
            rect.parent = this.currentElement;
            parseAttributesCore(rect, attributes);
            parseAttributesStyle(rect, attributes);
            parseAttributesTransform(rect, attributes);
            parseAttributesConditional(rect, attributes);
            parseAttributesRect(rect, attributes);
            this.currentElement.addChild(rect);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesRect(SVG.Rect rect, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                rect.f1238x = parseLength(trim);
            } else if (i2 == 2) {
                rect.f1239y = parseLength(trim);
            } else if (i2 == 3) {
                rect.width = parseLength(trim);
                if (rect.width.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                rect.height = parseLength(trim);
                if (rect.height.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i2 == 10) {
                rect.f1236rx = parseLength(trim);
                if (rect.f1236rx.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i2 != 11) {
                continue;
            } else {
                rect.f1237ry = parseLength(trim);
                if (rect.f1237ry.isNegative()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void circle(Attributes attributes) throws SVGParseException {
        debug("<circle>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Circle circle = new SVG.Circle();
            circle.document = this.svgDocument;
            circle.parent = this.currentElement;
            parseAttributesCore(circle, attributes);
            parseAttributesStyle(circle, attributes);
            parseAttributesTransform(circle, attributes);
            parseAttributesConditional(circle, attributes);
            parseAttributesCircle(circle, attributes);
            this.currentElement.addChild(circle);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesCircle(SVG.Circle circle, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (SVGAttr.fromString(attributes.getLocalName(i))) {
                case cx:
                    circle.f1218cx = parseLength(trim);
                    break;
                case cy:
                    circle.f1219cy = parseLength(trim);
                    break;
                case r:
                    circle.f1220r = parseLength(trim);
                    if (!circle.f1220r.isNegative()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
            }
        }
    }

    private void ellipse(Attributes attributes) throws SVGParseException {
        debug("<ellipse>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Ellipse ellipse = new SVG.Ellipse();
            ellipse.document = this.svgDocument;
            ellipse.parent = this.currentElement;
            parseAttributesCore(ellipse, attributes);
            parseAttributesStyle(ellipse, attributes);
            parseAttributesTransform(ellipse, attributes);
            parseAttributesConditional(ellipse, attributes);
            parseAttributesEllipse(ellipse, attributes);
            this.currentElement.addChild(ellipse);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesEllipse(SVG.Ellipse ellipse, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (SVGAttr.fromString(attributes.getLocalName(i))) {
                case rx:
                    ellipse.f1223rx = parseLength(trim);
                    if (!ellipse.f1223rx.isNegative()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                case ry:
                    ellipse.f1224ry = parseLength(trim);
                    if (!ellipse.f1224ry.isNegative()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                case cx:
                    ellipse.f1221cx = parseLength(trim);
                    break;
                case cy:
                    ellipse.f1222cy = parseLength(trim);
                    break;
            }
        }
    }

    private void line(Attributes attributes) throws SVGParseException {
        debug("<line>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Line line = new SVG.Line();
            line.document = this.svgDocument;
            line.parent = this.currentElement;
            parseAttributesCore(line, attributes);
            parseAttributesStyle(line, attributes);
            parseAttributesTransform(line, attributes);
            parseAttributesConditional(line, attributes);
            parseAttributesLine(line, attributes);
            this.currentElement.addChild(line);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesLine(SVG.Line line, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (SVGAttr.fromString(attributes.getLocalName(i))) {
                case x1:
                    line.f1227x1 = parseLength(trim);
                    break;
                case y1:
                    line.f1229y1 = parseLength(trim);
                    break;
                case x2:
                    line.f1228x2 = parseLength(trim);
                    break;
                case y2:
                    line.f1230y2 = parseLength(trim);
                    break;
            }
        }
    }

    private void polyline(Attributes attributes) throws SVGParseException {
        debug("<polyline>", new Object[0]);
        if (this.currentElement != null) {
            SVG.PolyLine polyLine = new SVG.PolyLine();
            polyLine.document = this.svgDocument;
            polyLine.parent = this.currentElement;
            parseAttributesCore(polyLine, attributes);
            parseAttributesStyle(polyLine, attributes);
            parseAttributesTransform(polyLine, attributes);
            parseAttributesConditional(polyLine, attributes);
            parseAttributesPolyLine(polyLine, attributes, "polyline");
            this.currentElement.addChild(polyLine);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesPolyLine(SVG.PolyLine polyLine, Attributes attributes, String str) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.points) {
                TextScanner textScanner = new TextScanner(attributes.getValue(i));
                ArrayList<Float> arrayList = new ArrayList<>();
                textScanner.skipWhitespace();
                while (!textScanner.empty()) {
                    float nextFloat = textScanner.nextFloat();
                    if (!Float.isNaN(nextFloat)) {
                        textScanner.skipCommaWhitespace();
                        float nextFloat2 = textScanner.nextFloat();
                        if (!Float.isNaN(nextFloat2)) {
                            textScanner.skipCommaWhitespace();
                            arrayList.add(Float.valueOf(nextFloat));
                            arrayList.add(Float.valueOf(nextFloat2));
                        } else {
                            throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                polyLine.points = new float[arrayList.size()];
                int i2 = 0;
                for (Float floatValue : arrayList) {
                    polyLine.points[i2] = floatValue.floatValue();
                    i2++;
                }
            }
        }
    }

    private void polygon(Attributes attributes) throws SVGParseException {
        debug("<polygon>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Polygon polygon = new SVG.Polygon();
            polygon.document = this.svgDocument;
            polygon.parent = this.currentElement;
            parseAttributesCore(polygon, attributes);
            parseAttributesStyle(polygon, attributes);
            parseAttributesTransform(polygon, attributes);
            parseAttributesConditional(polygon, attributes);
            parseAttributesPolyLine(polygon, attributes, "polygon");
            this.currentElement.addChild(polygon);
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void text(Attributes attributes) throws SVGParseException {
        debug("<text>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Text text = new SVG.Text();
            text.document = this.svgDocument;
            text.parent = this.currentElement;
            parseAttributesCore(text, attributes);
            parseAttributesStyle(text, attributes);
            parseAttributesTransform(text, attributes);
            parseAttributesConditional(text, attributes);
            parseAttributesTextPosition(text, attributes);
            this.currentElement.addChild(text);
            this.currentElement = text;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesTextPosition(SVG.TextPositionedContainer textPositionedContainer, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                textPositionedContainer.f1254x = parseLengthList(trim);
            } else if (i2 == 2) {
                textPositionedContainer.f1255y = parseLengthList(trim);
            } else if (i2 == 19) {
                textPositionedContainer.f1252dx = parseLengthList(trim);
            } else if (i2 == 20) {
                textPositionedContainer.f1253dy = parseLengthList(trim);
            }
        }
    }

    private void tspan(Attributes attributes) throws SVGParseException {
        debug("<tspan>", new Object[0]);
        SVG.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        } else if (svgContainer instanceof SVG.TextContainer) {
            SVG.TSpan tSpan = new SVG.TSpan();
            tSpan.document = this.svgDocument;
            tSpan.parent = this.currentElement;
            parseAttributesCore(tSpan, attributes);
            parseAttributesStyle(tSpan, attributes);
            parseAttributesConditional(tSpan, attributes);
            parseAttributesTextPosition(tSpan, attributes);
            this.currentElement.addChild(tSpan);
            this.currentElement = tSpan;
            if (tSpan.parent instanceof SVG.TextRoot) {
                tSpan.setTextRoot((SVG.TextRoot) tSpan.parent);
            } else {
                tSpan.setTextRoot(((SVG.TextChild) tSpan.parent).getTextRoot());
            }
        } else {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
    }

    private void tref(Attributes attributes) throws SVGParseException {
        debug("<tref>", new Object[0]);
        SVG.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        } else if (svgContainer instanceof SVG.TextContainer) {
            SVG.TRef tRef = new SVG.TRef();
            tRef.document = this.svgDocument;
            tRef.parent = this.currentElement;
            parseAttributesCore(tRef, attributes);
            parseAttributesStyle(tRef, attributes);
            parseAttributesConditional(tRef, attributes);
            parseAttributesTRef(tRef, attributes);
            this.currentElement.addChild(tRef);
            if (tRef.parent instanceof SVG.TextRoot) {
                tRef.setTextRoot((SVG.TextRoot) tRef.parent);
            } else {
                tRef.setTextRoot(((SVG.TextChild) tRef.parent).getTextRoot());
            }
        } else {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
    }

    private void parseAttributesTRef(SVG.TRef tRef, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 6 && ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i)))) {
                tRef.href = trim;
            }
        }
    }

    private void zwitch(Attributes attributes) throws SVGParseException {
        debug("<switch>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Switch switchR = new SVG.Switch();
            switchR.document = this.svgDocument;
            switchR.parent = this.currentElement;
            parseAttributesCore(switchR, attributes);
            parseAttributesStyle(switchR, attributes);
            parseAttributesTransform(switchR, attributes);
            parseAttributesConditional(switchR, attributes);
            this.currentElement.addChild(switchR);
            this.currentElement = switchR;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesConditional(SVG.SvgConditional svgConditional, Attributes attributes) throws SVGParseException {
        HashSet hashSet;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (SVGAttr.fromString(attributes.getLocalName(i))) {
                case requiredFeatures:
                    svgConditional.setRequiredFeatures(parseRequiredFeatures(trim));
                    break;
                case requiredExtensions:
                    svgConditional.setRequiredExtensions(trim);
                    break;
                case systemLanguage:
                    svgConditional.setSystemLanguage(parseSystemLanguage(trim));
                    break;
                case requiredFormats:
                    svgConditional.setRequiredFormats(parseRequiredFormats(trim));
                    break;
                case requiredFonts:
                    List<String> parseFontFamily = parseFontFamily(trim);
                    if (parseFontFamily == null) {
                        hashSet = new HashSet(0);
                    }
                    svgConditional.setRequiredFonts(hashSet);
                    break;
            }
        }
    }

    private void symbol(Attributes attributes) throws SVGParseException {
        debug("<symbol>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Symbol symbol = new SVG.Symbol();
            symbol.document = this.svgDocument;
            symbol.parent = this.currentElement;
            parseAttributesCore(symbol, attributes);
            parseAttributesStyle(symbol, attributes);
            parseAttributesConditional(symbol, attributes);
            parseAttributesViewBox(symbol, attributes);
            this.currentElement.addChild(symbol);
            this.currentElement = symbol;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void marker(Attributes attributes) throws SVGParseException {
        debug("<marker>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Marker marker = new SVG.Marker();
            marker.document = this.svgDocument;
            marker.parent = this.currentElement;
            parseAttributesCore(marker, attributes);
            parseAttributesStyle(marker, attributes);
            parseAttributesConditional(marker, attributes);
            parseAttributesViewBox(marker, attributes);
            parseAttributesMarker(marker, attributes);
            this.currentElement.addChild(marker);
            this.currentElement = marker;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesMarker(SVG.Marker marker, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (SVGAttr.fromString(attributes.getLocalName(i))) {
                case refX:
                    marker.refX = parseLength(trim);
                    break;
                case refY:
                    marker.refY = parseLength(trim);
                    break;
                case markerWidth:
                    marker.markerWidth = parseLength(trim);
                    if (!marker.markerWidth.isNegative()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                case markerHeight:
                    marker.markerHeight = parseLength(trim);
                    if (!marker.markerHeight.isNegative()) {
                        break;
                    } else {
                        throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                case markerUnits:
                    if ("strokeWidth".equals(trim)) {
                        marker.markerUnitsAreUser = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        marker.markerUnitsAreUser = true;
                        break;
                    } else {
                        throw new SVGParseException("Invalid value for attribute markerUnits");
                    }
                case orient:
                    if (!"auto".equals(trim)) {
                        marker.orient = Float.valueOf(parseFloat(trim));
                        break;
                    } else {
                        marker.orient = Float.valueOf(Float.NaN);
                        break;
                    }
            }
        }
    }

    private void linearGradient(Attributes attributes) throws SVGParseException {
        debug("<linearGradient>", new Object[0]);
        if (this.currentElement != null) {
            SVG.SvgLinearGradient svgLinearGradient = new SVG.SvgLinearGradient();
            svgLinearGradient.document = this.svgDocument;
            svgLinearGradient.parent = this.currentElement;
            parseAttributesCore(svgLinearGradient, attributes);
            parseAttributesStyle(svgLinearGradient, attributes);
            parseAttributesGradient(svgLinearGradient, attributes);
            parseAttributesLinearGradient(svgLinearGradient, attributes);
            this.currentElement.addChild(svgLinearGradient);
            this.currentElement = svgLinearGradient;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesGradient(com.caverock.androidsvg.SVG.GradientElement r6, org.xml.sax.Attributes r7) throws com.caverock.androidsvg.SVGParseException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r7.getLength()
            if (r1 >= r2) goto L_0x0097
            java.lang.String r2 = r7.getValue(r1)
            java.lang.String r2 = r2.trim()
            int[] r3 = com.caverock.androidsvg.SVGParser.C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr
            java.lang.String r4 = r7.getLocalName(r1)
            com.caverock.androidsvg.SVGParser$SVGAttr r4 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r4)
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 6
            if (r3 == r4) goto L_0x0079
            switch(r3) {
                case 32: goto L_0x0051;
                case 33: goto L_0x004a;
                case 34: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0093
        L_0x0027:
            com.caverock.androidsvg.SVG$GradientSpread r3 = com.caverock.androidsvg.SVG.GradientSpread.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x002e }
            r6.spreadMethod = r3     // Catch:{ IllegalArgumentException -> 0x002e }
            goto L_0x0093
        L_0x002e:
            com.caverock.androidsvg.SVGParseException r6 = new com.caverock.androidsvg.SVGParseException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = "\" is not a valid value."
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x004a:
            android.graphics.Matrix r2 = r5.parseTransformList(r2)
            r6.gradientTransform = r2
            goto L_0x0093
        L_0x0051:
            java.lang.String r3 = "objectBoundingBox"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0060
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r6.gradientUnitsAreUser = r2
            goto L_0x0093
        L_0x0060:
            java.lang.String r3 = "userSpaceOnUse"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0071
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.gradientUnitsAreUser = r2
            goto L_0x0093
        L_0x0071:
            com.caverock.androidsvg.SVGParseException r6 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r7 = "Invalid value for attribute gradientUnits"
            r6.<init>(r7)
            throw r6
        L_0x0079:
            java.lang.String r3 = r7.getURI(r1)
            java.lang.String r4 = ""
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0091
            java.lang.String r3 = r7.getURI(r1)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0093
        L_0x0091:
            r6.href = r2
        L_0x0093:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesGradient(com.caverock.androidsvg.SVG$GradientElement, org.xml.sax.Attributes):void");
    }

    private void parseAttributesLinearGradient(SVG.SvgLinearGradient svgLinearGradient, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (SVGAttr.fromString(attributes.getLocalName(i))) {
                case x1:
                    svgLinearGradient.f1243x1 = parseLength(trim);
                    break;
                case y1:
                    svgLinearGradient.f1245y1 = parseLength(trim);
                    break;
                case x2:
                    svgLinearGradient.f1244x2 = parseLength(trim);
                    break;
                case y2:
                    svgLinearGradient.f1246y2 = parseLength(trim);
                    break;
            }
        }
    }

    private void radialGradient(Attributes attributes) throws SVGParseException {
        debug("<radialGradient>", new Object[0]);
        if (this.currentElement != null) {
            SVG.SvgRadialGradient svgRadialGradient = new SVG.SvgRadialGradient();
            svgRadialGradient.document = this.svgDocument;
            svgRadialGradient.parent = this.currentElement;
            parseAttributesCore(svgRadialGradient, attributes);
            parseAttributesStyle(svgRadialGradient, attributes);
            parseAttributesGradient(svgRadialGradient, attributes);
            parseAttributesRadialGradient(svgRadialGradient, attributes);
            this.currentElement.addChild(svgRadialGradient);
            this.currentElement = svgRadialGradient;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesRadialGradient(com.caverock.androidsvg.SVG.SvgRadialGradient r5, org.xml.sax.Attributes r6) throws com.caverock.androidsvg.SVGParseException {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L_0x0060
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = com.caverock.androidsvg.SVGParser.C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr
            java.lang.String r3 = r6.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r3 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 35
            if (r2 == r3) goto L_0x0057
            r3 = 36
            if (r2 == r3) goto L_0x0050
            switch(r2) {
                case 12: goto L_0x0049;
                case 13: goto L_0x0042;
                case 14: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x005d
        L_0x002b:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r5.f1251r = r1
            com.caverock.androidsvg.SVG$Length r1 = r5.f1251r
            boolean r1 = r1.isNegative()
            if (r1 != 0) goto L_0x003a
            goto L_0x005d
        L_0x003a:
            com.caverock.androidsvg.SVGParseException r5 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r6 = "Invalid <radialGradient> element. r cannot be negative"
            r5.<init>(r6)
            throw r5
        L_0x0042:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r5.f1248cy = r1
            goto L_0x005d
        L_0x0049:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r5.f1247cx = r1
            goto L_0x005d
        L_0x0050:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r5.f1250fy = r1
            goto L_0x005d
        L_0x0057:
            com.caverock.androidsvg.SVG$Length r1 = parseLength(r1)
            r5.f1249fx = r1
        L_0x005d:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesRadialGradient(com.caverock.androidsvg.SVG$SvgRadialGradient, org.xml.sax.Attributes):void");
    }

    private void stop(Attributes attributes) throws SVGParseException {
        debug("<stop>", new Object[0]);
        SVG.SvgContainer svgContainer = this.currentElement;
        if (svgContainer == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        } else if (svgContainer instanceof SVG.GradientElement) {
            SVG.Stop stop = new SVG.Stop();
            stop.document = this.svgDocument;
            stop.parent = this.currentElement;
            parseAttributesCore(stop, attributes);
            parseAttributesStyle(stop, attributes);
            parseAttributesStop(stop, attributes);
            this.currentElement.addChild(stop);
            this.currentElement = stop;
        } else {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
    }

    private void parseAttributesStop(SVG.Stop stop, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 37) {
                stop.offset = parseGradientOffset(trim);
            }
        }
    }

    private Float parseGradientOffset(String str) throws SVGParseException {
        if (str.length() != 0) {
            int length = str.length();
            boolean z = true;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
            } else {
                z = false;
            }
            try {
                float parseFloat = parseFloat(str, 0, length);
                if (z) {
                    parseFloat /= 100.0f;
                }
                if (parseFloat < 0.0f) {
                    parseFloat = 0.0f;
                } else if (parseFloat > 100.0f) {
                    parseFloat = 100.0f;
                }
                return Float.valueOf(parseFloat);
            } catch (NumberFormatException e) {
                throw new SVGParseException("Invalid offset value in <stop>: " + str, e);
            }
        } else {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
    }

    private void solidColor(Attributes attributes) throws SVGParseException {
        debug("<solidColor>", new Object[0]);
        if (this.currentElement != null) {
            SVG.SolidColor solidColor = new SVG.SolidColor();
            solidColor.document = this.svgDocument;
            solidColor.parent = this.currentElement;
            parseAttributesCore(solidColor, attributes);
            parseAttributesStyle(solidColor, attributes);
            this.currentElement.addChild(solidColor);
            this.currentElement = solidColor;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void clipPath(Attributes attributes) throws SVGParseException {
        debug("<clipPath>", new Object[0]);
        if (this.currentElement != null) {
            SVG.ClipPath clipPath = new SVG.ClipPath();
            clipPath.document = this.svgDocument;
            clipPath.parent = this.currentElement;
            parseAttributesCore(clipPath, attributes);
            parseAttributesStyle(clipPath, attributes);
            parseAttributesTransform(clipPath, attributes);
            parseAttributesConditional(clipPath, attributes);
            parseAttributesClipPath(clipPath, attributes);
            this.currentElement.addChild(clipPath);
            this.currentElement = clipPath;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesClipPath(SVG.ClipPath clipPath, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(trim)) {
                    clipPath.clipPathUnitsAreUser = false;
                } else if ("userSpaceOnUse".equals(trim)) {
                    clipPath.clipPathUnitsAreUser = true;
                } else {
                    throw new SVGParseException("Invalid value for attribute clipPathUnits");
                }
            }
        }
    }

    private void textPath(Attributes attributes) throws SVGParseException {
        debug("<textPath>", new Object[0]);
        if (this.currentElement != null) {
            SVG.TextPath textPath = new SVG.TextPath();
            textPath.document = this.svgDocument;
            textPath.parent = this.currentElement;
            parseAttributesCore(textPath, attributes);
            parseAttributesStyle(textPath, attributes);
            parseAttributesConditional(textPath, attributes);
            parseAttributesTextPath(textPath, attributes);
            this.currentElement.addChild(textPath);
            this.currentElement = textPath;
            if (textPath.parent instanceof SVG.TextRoot) {
                textPath.setTextRoot((SVG.TextRoot) textPath.parent);
            } else {
                textPath.setTextRoot(((SVG.TextChild) textPath.parent).getTextRoot());
            }
        } else {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
    }

    private void parseAttributesTextPath(SVG.TextPath textPath, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                if (i2 == 39) {
                    textPath.startOffset = parseLength(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || XLINK_NAMESPACE.equals(attributes.getURI(i))) {
                textPath.href = trim;
            }
        }
    }

    private void pattern(Attributes attributes) throws SVGParseException {
        debug("<pattern>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Pattern pattern = new SVG.Pattern();
            pattern.document = this.svgDocument;
            pattern.parent = this.currentElement;
            parseAttributesCore(pattern, attributes);
            parseAttributesStyle(pattern, attributes);
            parseAttributesConditional(pattern, attributes);
            parseAttributesViewBox(pattern, attributes);
            parseAttributesPattern(pattern, attributes);
            this.currentElement.addChild(pattern);
            this.currentElement = pattern;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d8, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseAttributesPattern(com.caverock.androidsvg.SVG.Pattern r8, org.xml.sax.Attributes r9) throws com.caverock.androidsvg.SVGParseException {
        /*
            r7 = this;
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0005:
            int r2 = r9.getLength()
            if (r0 >= r2) goto L_0x00dc
            java.lang.String r2 = r9.getValue(r0)
            java.lang.String r2 = r2.trim()
            int[] r3 = com.caverock.androidsvg.SVGParser.C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr
            java.lang.String r4 = r9.getLocalName(r0)
            com.caverock.androidsvg.SVGParser$SVGAttr r4 = com.caverock.androidsvg.SVGParser.SVGAttr.fromString(r4)
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L_0x00d2
            r5 = 2
            if (r3 == r5) goto L_0x00cb
            r5 = 3
            if (r3 == r5) goto L_0x00b4
            r5 = 4
            if (r3 == r5) goto L_0x009d
            r5 = 6
            if (r3 == r5) goto L_0x0082
            java.lang.String r5 = "userSpaceOnUse"
            java.lang.String r6 = "objectBoundingBox"
            switch(r3) {
                case 40: goto L_0x0064;
                case 41: goto L_0x0044;
                case 42: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x00d8
        L_0x003c:
            android.graphics.Matrix r2 = r7.parseTransformList(r2)
            r8.patternTransform = r2
            goto L_0x00d8
        L_0x0044:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L_0x004e
            r8.patternContentUnitsAreUser = r1
            goto L_0x00d8
        L_0x004e:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x005c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r8.patternContentUnitsAreUser = r2
            goto L_0x00d8
        L_0x005c:
            com.caverock.androidsvg.SVGParseException r8 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r9 = "Invalid value for attribute patternContentUnits"
            r8.<init>(r9)
            throw r8
        L_0x0064:
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L_0x006d
            r8.patternUnitsAreUser = r1
            goto L_0x00d8
        L_0x006d:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x007a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r8.patternUnitsAreUser = r2
            goto L_0x00d8
        L_0x007a:
            com.caverock.androidsvg.SVGParseException r8 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r9 = "Invalid value for attribute patternUnits"
            r8.<init>(r9)
            throw r8
        L_0x0082:
            java.lang.String r3 = r9.getURI(r0)
            java.lang.String r4 = ""
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x009a
            java.lang.String r3 = r9.getURI(r0)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00d8
        L_0x009a:
            r8.href = r2
            goto L_0x00d8
        L_0x009d:
            com.caverock.androidsvg.SVG$Length r2 = parseLength(r2)
            r8.height = r2
            com.caverock.androidsvg.SVG$Length r2 = r8.height
            boolean r2 = r2.isNegative()
            if (r2 != 0) goto L_0x00ac
            goto L_0x00d8
        L_0x00ac:
            com.caverock.androidsvg.SVGParseException r8 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r9 = "Invalid <pattern> element. height cannot be negative"
            r8.<init>(r9)
            throw r8
        L_0x00b4:
            com.caverock.androidsvg.SVG$Length r2 = parseLength(r2)
            r8.width = r2
            com.caverock.androidsvg.SVG$Length r2 = r8.width
            boolean r2 = r2.isNegative()
            if (r2 != 0) goto L_0x00c3
            goto L_0x00d8
        L_0x00c3:
            com.caverock.androidsvg.SVGParseException r8 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r9 = "Invalid <pattern> element. width cannot be negative"
            r8.<init>(r9)
            throw r8
        L_0x00cb:
            com.caverock.androidsvg.SVG$Length r2 = parseLength(r2)
            r8.f1235y = r2
            goto L_0x00d8
        L_0x00d2:
            com.caverock.androidsvg.SVG$Length r2 = parseLength(r2)
            r8.f1234x = r2
        L_0x00d8:
            int r0 = r0 + 1
            goto L_0x0005
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseAttributesPattern(com.caverock.androidsvg.SVG$Pattern, org.xml.sax.Attributes):void");
    }

    private void view(Attributes attributes) throws SVGParseException {
        debug("<view>", new Object[0]);
        if (this.currentElement != null) {
            SVG.View view = new SVG.View();
            view.document = this.svgDocument;
            view.parent = this.currentElement;
            parseAttributesCore(view, attributes);
            parseAttributesConditional(view, attributes);
            parseAttributesViewBox(view, attributes);
            this.currentElement.addChild(view);
            this.currentElement = view;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void mask(Attributes attributes) throws SVGParseException {
        debug("<mask>", new Object[0]);
        if (this.currentElement != null) {
            SVG.Mask mask = new SVG.Mask();
            mask.document = this.svgDocument;
            mask.parent = this.currentElement;
            parseAttributesCore(mask, attributes);
            parseAttributesStyle(mask, attributes);
            parseAttributesConditional(mask, attributes);
            parseAttributesMask(mask, attributes);
            this.currentElement.addChild(mask);
            this.currentElement = mask;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseAttributesMask(SVG.Mask mask, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                mask.f1231x = parseLength(trim);
            } else if (i2 == 2) {
                mask.f1232y = parseLength(trim);
            } else if (i2 == 3) {
                mask.width = parseLength(trim);
                if (mask.width.isNegative()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                mask.height = parseLength(trim);
                if (mask.height.isNegative()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (i2 != 43) {
                if (i2 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(trim)) {
                    mask.maskContentUnitsAreUser = false;
                } else if ("userSpaceOnUse".equals(trim)) {
                    mask.maskContentUnitsAreUser = true;
                } else {
                    throw new SVGParseException("Invalid value for attribute maskContentUnits");
                }
            } else if ("objectBoundingBox".equals(trim)) {
                mask.maskUnitsAreUser = false;
            } else if ("userSpaceOnUse".equals(trim)) {
                mask.maskUnitsAreUser = true;
            } else {
                throw new SVGParseException("Invalid value for attribute maskUnits");
            }
        }
    }

    static class TextScanner {
        String input;
        int inputLength = 0;
        private NumberParser numberParser = new NumberParser();
        int position = 0;

        /* access modifiers changed from: package-private */
        public boolean isEOL(int i) {
            return i == 10 || i == 13;
        }

        /* access modifiers changed from: package-private */
        public boolean isWhitespace(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        TextScanner(String str) {
            this.input = str.trim();
            this.inputLength = this.input.length();
        }

        /* access modifiers changed from: package-private */
        public boolean empty() {
            return this.position == this.inputLength;
        }

        /* access modifiers changed from: package-private */
        public void skipWhitespace() {
            while (true) {
                int i = this.position;
                if (i < this.inputLength && isWhitespace(this.input.charAt(i))) {
                    this.position++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean skipCommaWhitespace() {
            skipWhitespace();
            int i = this.position;
            if (i == this.inputLength || this.input.charAt(i) != ',') {
                return false;
            }
            this.position++;
            skipWhitespace();
            return true;
        }

        /* access modifiers changed from: package-private */
        public float nextFloat() {
            float parseNumber = this.numberParser.parseNumber(this.input, this.position, this.inputLength);
            if (!Float.isNaN(parseNumber)) {
                this.position = this.numberParser.getEndPos();
            }
            return parseNumber;
        }

        /* access modifiers changed from: package-private */
        public float possibleNextFloat() {
            skipCommaWhitespace();
            float parseNumber = this.numberParser.parseNumber(this.input, this.position, this.inputLength);
            if (!Float.isNaN(parseNumber)) {
                this.position = this.numberParser.getEndPos();
            }
            return parseNumber;
        }

        /* access modifiers changed from: package-private */
        public float checkedNextFloat(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            skipCommaWhitespace();
            return nextFloat();
        }

        /* access modifiers changed from: package-private */
        public float checkedNextFloat(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            skipCommaWhitespace();
            return nextFloat();
        }

        /* access modifiers changed from: package-private */
        public Integer nextChar() {
            int i = this.position;
            if (i == this.inputLength) {
                return null;
            }
            String str = this.input;
            this.position = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        /* access modifiers changed from: package-private */
        public SVG.Length nextLength() {
            float nextFloat = nextFloat();
            if (Float.isNaN(nextFloat)) {
                return null;
            }
            SVG.Unit nextUnit = nextUnit();
            if (nextUnit == null) {
                return new SVG.Length(nextFloat, SVG.Unit.px);
            }
            return new SVG.Length(nextFloat, nextUnit);
        }

        /* access modifiers changed from: package-private */
        public Boolean nextFlag() {
            int i = this.position;
            if (i == this.inputLength) {
                return null;
            }
            char charAt = this.input.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            boolean z = true;
            this.position++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* access modifiers changed from: package-private */
        public Boolean checkedNextFlag(Object obj) {
            if (obj == null) {
                return null;
            }
            skipCommaWhitespace();
            return nextFlag();
        }

        /* access modifiers changed from: package-private */
        public boolean consume(char c) {
            int i = this.position;
            boolean z = i < this.inputLength && this.input.charAt(i) == c;
            if (z) {
                this.position++;
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public boolean consume(String str) {
            int length = str.length();
            int i = this.position;
            boolean z = i <= this.inputLength - length && this.input.substring(i, i + length).equals(str);
            if (z) {
                this.position += length;
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public int advanceChar() {
            int i = this.position;
            int i2 = this.inputLength;
            if (i == i2) {
                return -1;
            }
            this.position = i + 1;
            int i3 = this.position;
            if (i3 < i2) {
                return this.input.charAt(i3);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public String nextToken() {
            return nextToken(' ', false);
        }

        /* access modifiers changed from: package-private */
        public String nextToken(char c) {
            return nextToken(c, false);
        }

        /* access modifiers changed from: package-private */
        public String nextTokenWithWhitespace(char c) {
            return nextToken(c, true);
        }

        /* access modifiers changed from: package-private */
        public String nextToken(char c, boolean z) {
            if (empty()) {
                return null;
            }
            char charAt = this.input.charAt(this.position);
            if ((!z && isWhitespace(charAt)) || charAt == c) {
                return null;
            }
            int i = this.position;
            int advanceChar = advanceChar();
            while (advanceChar != -1 && advanceChar != c && (z || !isWhitespace(advanceChar))) {
                advanceChar = advanceChar();
            }
            return this.input.substring(i, this.position);
        }

        /* access modifiers changed from: package-private */
        public String nextWord() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            char charAt = this.input.charAt(i);
            if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                this.position = i;
                return null;
            }
            int advanceChar = advanceChar();
            while (true) {
                if ((advanceChar >= 65 && advanceChar <= 90) || (advanceChar >= 97 && advanceChar <= 122)) {
                    advanceChar = advanceChar();
                }
            }
            return this.input.substring(i, this.position);
        }

        /* access modifiers changed from: package-private */
        public String nextFunction() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            int charAt = this.input.charAt(i);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    int i2 = this.position;
                } else {
                    charAt = advanceChar();
                }
            }
            int i22 = this.position;
            while (isWhitespace(charAt)) {
                charAt = advanceChar();
            }
            if (charAt == 40) {
                this.position++;
                return this.input.substring(i, i22);
            }
            this.position = i;
            return null;
        }

        /* access modifiers changed from: package-private */
        public String ahead() {
            int i = this.position;
            while (!empty() && !isWhitespace(this.input.charAt(this.position))) {
                this.position++;
            }
            String substring = this.input.substring(i, this.position);
            this.position = i;
            return substring;
        }

        /* access modifiers changed from: package-private */
        public SVG.Unit nextUnit() {
            if (empty()) {
                return null;
            }
            if (this.input.charAt(this.position) == '%') {
                this.position++;
                return SVG.Unit.percent;
            }
            int i = this.position;
            if (i > this.inputLength - 2) {
                return null;
            }
            try {
                SVG.Unit valueOf = SVG.Unit.valueOf(this.input.substring(i, i + 2).toLowerCase(Locale.US));
                this.position += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean hasLetter() {
            int i = this.position;
            if (i == this.inputLength) {
                return false;
            }
            char charAt = this.input.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public String nextQuotedString() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            char charAt = this.input.charAt(i);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int advanceChar = advanceChar();
            while (advanceChar != -1 && advanceChar != charAt) {
                advanceChar = advanceChar();
            }
            if (advanceChar == -1) {
                this.position = i;
                return null;
            }
            this.position++;
            return this.input.substring(i + 1, this.position - 1);
        }

        /* access modifiers changed from: package-private */
        public String restOfText() {
            if (empty()) {
                return null;
            }
            int i = this.position;
            this.position = this.inputLength;
            return this.input.substring(i);
        }
    }

    private void parseAttributesCore(SVG.SvgElementBase svgElementBase, Attributes attributes) throws SVGParseException {
        int i = 0;
        while (i < attributes.getLength()) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                svgElementBase.f1242id = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    svgElementBase.spacePreserve = Boolean.FALSE;
                    return;
                } else if ("preserve".equals(trim)) {
                    svgElementBase.spacePreserve = Boolean.TRUE;
                    return;
                } else {
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + trim);
                }
            } else {
                i++;
            }
        }
    }

    private void parseAttributesStyle(SVG.SvgElementBase svgElementBase, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int i2 = C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (i2 == 45) {
                    parseStyle(svgElementBase, trim);
                } else if (i2 != 46) {
                    if (svgElementBase.baseStyle == null) {
                        svgElementBase.baseStyle = new SVG.Style();
                    }
                    processStyleProperty(svgElementBase.baseStyle, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    svgElementBase.classNames = CSSParser.parseClassAttribute(trim);
                }
            }
        }
    }

    private static void parseStyle(SVG.SvgElementBase svgElementBase, String str) {
        TextScanner textScanner = new TextScanner(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String nextToken = textScanner.nextToken(':');
            textScanner.skipWhitespace();
            if (textScanner.consume(':')) {
                textScanner.skipWhitespace();
                String nextTokenWithWhitespace = textScanner.nextTokenWithWhitespace(';');
                if (nextTokenWithWhitespace != null) {
                    textScanner.skipWhitespace();
                    if (textScanner.empty() || textScanner.consume(';')) {
                        if (svgElementBase.style == null) {
                            svgElementBase.style = new SVG.Style();
                        }
                        processStyleProperty(svgElementBase.style, nextToken, nextTokenWithWhitespace);
                        textScanner.skipWhitespace();
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    static void processStyleProperty(SVG.Style style, String str, String str2) {
        if (str2.length() != 0 && !str2.equals("inherit")) {
            switch (SVGAttr.fromString(str)) {
                case fill:
                    style.fill = parsePaintSpecifier(str2);
                    if (style.fill != null) {
                        style.specifiedFlags |= 1;
                        return;
                    }
                    return;
                case fill_rule:
                    style.fillRule = parseFillRule(str2);
                    if (style.fillRule != null) {
                        style.specifiedFlags |= 2;
                        return;
                    }
                    return;
                case fill_opacity:
                    style.fillOpacity = parseOpacity(str2);
                    if (style.fillOpacity != null) {
                        style.specifiedFlags |= 4;
                        return;
                    }
                    return;
                case stroke:
                    style.stroke = parsePaintSpecifier(str2);
                    if (style.stroke != null) {
                        style.specifiedFlags |= 8;
                        return;
                    }
                    return;
                case stroke_opacity:
                    style.strokeOpacity = parseOpacity(str2);
                    if (style.strokeOpacity != null) {
                        style.specifiedFlags |= 16;
                        return;
                    }
                    return;
                case stroke_width:
                    style.strokeWidth = parseLength(str2);
                    style.specifiedFlags |= 32;
                    return;
                case stroke_linecap:
                    style.strokeLineCap = parseStrokeLineCap(str2);
                    if (style.strokeLineCap != null) {
                        style.specifiedFlags |= 64;
                        return;
                    }
                    return;
                case stroke_linejoin:
                    style.strokeLineJoin = parseStrokeLineJoin(str2);
                    if (style.strokeLineJoin != null) {
                        style.specifiedFlags |= 128;
                        return;
                    }
                    return;
                case stroke_miterlimit:
                    style.strokeMiterLimit = Float.valueOf(parseFloat(str2));
                    style.specifiedFlags |= 256;
                    return;
                case stroke_dasharray:
                    if ("none".equals(str2)) {
                        style.strokeDashArray = null;
                        style.specifiedFlags |= 512;
                        return;
                    }
                    style.strokeDashArray = parseStrokeDashArray(str2);
                    if (style.strokeDashArray != null) {
                        style.specifiedFlags |= 512;
                        return;
                    }
                    return;
                case stroke_dashoffset:
                    style.strokeDashOffset = parseLength(str2);
                    style.specifiedFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    return;
                case opacity:
                    style.opacity = parseOpacity(str2);
                    style.specifiedFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                    return;
                case color:
                    try {
                        style.color = parseColour(str2);
                        style.specifiedFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                        return;
                    } catch (SVGParseException unused) {
                    }
                case font:
                    parseFont(style, str2);
                    return;
                case font_family:
                    style.fontFamily = parseFontFamily(str2);
                    if (style.fontFamily != null) {
                        style.specifiedFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                        return;
                    }
                    return;
                case font_size:
                    style.fontSize = parseFontSize(str2);
                    if (style.fontSize != null) {
                        style.specifiedFlags |= 16384;
                        return;
                    }
                    return;
                case font_weight:
                    style.fontWeight = parseFontWeight(str2);
                    if (style.fontWeight != null) {
                        style.specifiedFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                        return;
                    }
                    return;
                case font_style:
                    style.fontStyle = parseFontStyle(str2);
                    if (style.fontStyle != null) {
                        style.specifiedFlags |= 65536;
                        return;
                    }
                    return;
                case text_decoration:
                    style.textDecoration = parseTextDecoration(str2);
                    if (style.textDecoration != null) {
                        style.specifiedFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                        return;
                    }
                    return;
                case direction:
                    style.direction = parseTextDirection(str2);
                    if (style.direction != null) {
                        style.specifiedFlags |= 68719476736L;
                        return;
                    }
                    return;
                case text_anchor:
                    style.textAnchor = parseTextAnchor(str2);
                    if (style.textAnchor != null) {
                        style.specifiedFlags |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        return;
                    }
                    return;
                case overflow:
                    style.overflow = parseOverflow(str2);
                    if (style.overflow != null) {
                        style.specifiedFlags |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                        return;
                    }
                    return;
                case marker:
                    style.markerStart = parseFunctionalIRI(str2, str);
                    style.markerMid = style.markerStart;
                    style.markerEnd = style.markerStart;
                    style.specifiedFlags |= 14680064;
                    return;
                case marker_start:
                    style.markerStart = parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                    return;
                case marker_mid:
                    style.markerMid = parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= 4194304;
                    return;
                case marker_end:
                    style.markerEnd = parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= 8388608;
                    return;
                case display:
                    if (str2.indexOf(124) < 0) {
                        if (VALID_DISPLAY_VALUES.contains('|' + str2 + '|')) {
                            style.display = Boolean.valueOf(!str2.equals("none"));
                            style.specifiedFlags |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case visibility:
                    if (str2.indexOf(124) < 0) {
                        if (VALID_VISIBILITY_VALUES.contains('|' + str2 + '|')) {
                            style.visibility = Boolean.valueOf(str2.equals(ViewProps.VISIBLE));
                            style.specifiedFlags |= 33554432;
                            return;
                        }
                        return;
                    }
                    return;
                case stop_color:
                    if (str2.equals(CURRENTCOLOR)) {
                        style.stopColor = SVG.CurrentColor.getInstance();
                    } else {
                        try {
                            style.stopColor = parseColour(str2);
                        } catch (SVGParseException e) {
                            Log.w(TAG, e.getMessage());
                            return;
                        }
                    }
                    style.specifiedFlags |= 67108864;
                    return;
                case stop_opacity:
                    style.stopOpacity = parseOpacity(str2);
                    style.specifiedFlags |= 134217728;
                    return;
                case clip:
                    style.clip = parseClip(str2);
                    if (style.clip != null) {
                        style.specifiedFlags |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                        return;
                    }
                    return;
                case clip_path:
                    style.clipPath = parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= 268435456;
                    return;
                case clip_rule:
                    style.clipRule = parseFillRule(str2);
                    style.specifiedFlags |= 536870912;
                    return;
                case mask:
                    style.mask = parseFunctionalIRI(str2, str);
                    style.specifiedFlags |= 1073741824;
                    return;
                case solid_color:
                    if (str2.equals(CURRENTCOLOR)) {
                        style.solidColor = SVG.CurrentColor.getInstance();
                    } else {
                        try {
                            style.solidColor = parseColour(str2);
                        } catch (SVGParseException e2) {
                            Log.w(TAG, e2.getMessage());
                            return;
                        }
                    }
                    style.specifiedFlags |= CacheValidityPolicy.MAX_AGE;
                    return;
                case solid_opacity:
                    style.solidOpacity = parseOpacity(str2);
                    style.specifiedFlags |= 4294967296L;
                    return;
                case viewport_fill:
                    if (str2.equals(CURRENTCOLOR)) {
                        style.viewportFill = SVG.CurrentColor.getInstance();
                    } else {
                        try {
                            style.viewportFill = parseColour(str2);
                        } catch (SVGParseException e3) {
                            Log.w(TAG, e3.getMessage());
                            return;
                        }
                    }
                    style.specifiedFlags |= 8589934592L;
                    return;
                case viewport_fill_opacity:
                    style.viewportFillOpacity = parseOpacity(str2);
                    style.specifiedFlags |= 17179869184L;
                    return;
                case vector_effect:
                    style.vectorEffect = parseVectorEffect(str2);
                    if (style.vectorEffect != null) {
                        style.specifiedFlags |= 34359738368L;
                        return;
                    }
                    return;
                case image_rendering:
                    style.imageRendering = parseRenderQuality(str2);
                    if (style.imageRendering != null) {
                        style.specifiedFlags |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private void parseAttributesViewBox(SVG.SvgViewBoxContainer svgViewBoxContainer, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                parsePreserveAspectRatio(svgViewBoxContainer, trim);
            } else if (i2 == 87) {
                svgViewBoxContainer.viewBox = parseViewBox(trim);
            }
        }
    }

    private void parseAttributesTransform(SVG.HasTransform hasTransform, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.transform) {
                hasTransform.setTransform(parseTransformList(attributes.getValue(i)));
            }
        }
    }

    private Matrix parseTransformList(String str) throws SVGParseException {
        String str2 = str;
        Matrix matrix = new Matrix();
        TextScanner textScanner = new TextScanner(str2);
        textScanner.skipWhitespace();
        while (!textScanner.empty()) {
            String nextFunction = textScanner.nextFunction();
            if (nextFunction != null) {
                char c = 65535;
                switch (nextFunction.hashCode()) {
                    case -1081239615:
                        if (nextFunction.equals("matrix")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -925180581:
                        if (nextFunction.equals("rotate")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 109250890:
                        if (nextFunction.equals("scale")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 109493390:
                        if (nextFunction.equals("skewX")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 109493391:
                        if (nextFunction.equals("skewY")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1052832078:
                        if (nextFunction.equals("translate")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    textScanner.skipWhitespace();
                    float nextFloat = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat2 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat3 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat4 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat5 = textScanner.nextFloat();
                    textScanner.skipCommaWhitespace();
                    float nextFloat6 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat6) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{nextFloat, nextFloat3, nextFloat5, nextFloat2, nextFloat4, nextFloat6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                } else if (c == 1) {
                    textScanner.skipWhitespace();
                    float nextFloat7 = textScanner.nextFloat();
                    float possibleNextFloat = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat7) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    } else if (Float.isNaN(possibleNextFloat)) {
                        matrix.preTranslate(nextFloat7, 0.0f);
                    } else {
                        matrix.preTranslate(nextFloat7, possibleNextFloat);
                    }
                } else if (c == 2) {
                    textScanner.skipWhitespace();
                    float nextFloat8 = textScanner.nextFloat();
                    float possibleNextFloat2 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat8) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    } else if (Float.isNaN(possibleNextFloat2)) {
                        matrix.preScale(nextFloat8, nextFloat8);
                    } else {
                        matrix.preScale(nextFloat8, possibleNextFloat2);
                    }
                } else if (c == 3) {
                    textScanner.skipWhitespace();
                    float nextFloat9 = textScanner.nextFloat();
                    float possibleNextFloat3 = textScanner.possibleNextFloat();
                    float possibleNextFloat4 = textScanner.possibleNextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat9) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    } else if (Float.isNaN(possibleNextFloat3)) {
                        matrix.preRotate(nextFloat9);
                    } else if (!Float.isNaN(possibleNextFloat4)) {
                        matrix.preRotate(nextFloat9, possibleNextFloat3, possibleNextFloat4);
                    } else {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    }
                } else if (c == 4) {
                    textScanner.skipWhitespace();
                    float nextFloat10 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat10) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians((double) nextFloat10)), 0.0f);
                } else if (c == 5) {
                    textScanner.skipWhitespace();
                    float nextFloat11 = textScanner.nextFloat();
                    textScanner.skipWhitespace();
                    if (Float.isNaN(nextFloat11) || !textScanner.consume(')')) {
                        throw new SVGParseException("Invalid transform list: " + str2);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) nextFloat11)));
                } else {
                    throw new SVGParseException("Invalid transform list fn: " + nextFunction + ")");
                }
                if (textScanner.empty()) {
                    return matrix;
                }
                textScanner.skipCommaWhitespace();
            } else {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str2);
            }
        }
        return matrix;
    }

    static SVG.Length parseLength(String str) throws SVGParseException {
        if (str.length() != 0) {
            int length = str.length();
            SVG.Unit unit = SVG.Unit.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                unit = SVG.Unit.percent;
            } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    unit = SVG.Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new SVGParseException("Invalid length unit specifier: " + str);
                }
            }
            try {
                return new SVG.Length(parseFloat(str, 0, length), unit);
            } catch (NumberFormatException e) {
                throw new SVGParseException("Invalid length value: " + str, e);
            }
        } else {
            throw new SVGParseException("Invalid length value (empty string)");
        }
    }

    private static List<SVG.Length> parseLengthList(String str) throws SVGParseException {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            TextScanner textScanner = new TextScanner(str);
            textScanner.skipWhitespace();
            while (!textScanner.empty()) {
                float nextFloat = textScanner.nextFloat();
                if (!Float.isNaN(nextFloat)) {
                    SVG.Unit nextUnit = textScanner.nextUnit();
                    if (nextUnit == null) {
                        nextUnit = SVG.Unit.px;
                    }
                    arrayList.add(new SVG.Length(nextFloat, nextUnit));
                    textScanner.skipCommaWhitespace();
                } else {
                    throw new SVGParseException("Invalid length list value: " + textScanner.ahead());
                }
            }
            return arrayList;
        }
        throw new SVGParseException("Invalid length list (empty string)");
    }

    private static float parseFloat(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return parseFloat(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    private static float parseFloat(String str, int i, int i2) throws SVGParseException {
        float parseNumber = new NumberParser().parseNumber(str, i, i2);
        if (!Float.isNaN(parseNumber)) {
            return parseNumber;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    private static Float parseOpacity(String str) {
        try {
            float parseFloat = parseFloat(str);
            if (parseFloat < 0.0f) {
                parseFloat = 0.0f;
            } else if (parseFloat > 1.0f) {
                parseFloat = 1.0f;
            }
            return Float.valueOf(parseFloat);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private static SVG.Box parseViewBox(String str) throws SVGParseException {
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        float nextFloat = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float nextFloat2 = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float nextFloat3 = textScanner.nextFloat();
        textScanner.skipCommaWhitespace();
        float nextFloat4 = textScanner.nextFloat();
        if (Float.isNaN(nextFloat) || Float.isNaN(nextFloat2) || Float.isNaN(nextFloat3) || Float.isNaN(nextFloat4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        } else if (nextFloat3 < 0.0f) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        } else if (nextFloat4 >= 0.0f) {
            return new SVG.Box(nextFloat, nextFloat2, nextFloat3, nextFloat4);
        } else {
            throw new SVGParseException("Invalid viewBox. height cannot be negative");
        }
    }

    private static void parsePreserveAspectRatio(SVG.SvgPreserveAspectRatioContainer svgPreserveAspectRatioContainer, String str) throws SVGParseException {
        svgPreserveAspectRatioContainer.preserveAspectRatio = parsePreserveAspectRatio(str);
    }

    static PreserveAspectRatio parsePreserveAspectRatio(String str) throws SVGParseException {
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        String nextToken = textScanner.nextToken();
        if ("defer".equals(nextToken)) {
            textScanner.skipWhitespace();
            nextToken = textScanner.nextToken();
        }
        PreserveAspectRatio.Alignment alignment = AspectRatioKeywords.get(nextToken);
        PreserveAspectRatio.Scale scale = null;
        textScanner.skipWhitespace();
        if (!textScanner.empty()) {
            String nextToken2 = textScanner.nextToken();
            char c = 65535;
            int hashCode = nextToken2.hashCode();
            if (hashCode != 3347527) {
                if (hashCode == 109526418 && nextToken2.equals("slice")) {
                    c = 1;
                }
            } else if (nextToken2.equals("meet")) {
                c = 0;
            }
            if (c == 0) {
                scale = PreserveAspectRatio.Scale.meet;
            } else if (c == 1) {
                scale = PreserveAspectRatio.Scale.slice;
            } else {
                throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
            }
        }
        return new PreserveAspectRatio(alignment, scale);
    }

    private static SVG.SvgPaint parsePaintSpecifier(String str) {
        if (!str.startsWith("url(")) {
            return parseColourSpecifer(str);
        }
        int indexOf = str.indexOf(")");
        SVG.SvgPaint svgPaint = null;
        if (indexOf == -1) {
            return new SVG.PaintReference(str.substring(4).trim(), (SVG.SvgPaint) null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            svgPaint = parseColourSpecifer(trim2);
        }
        return new SVG.PaintReference(trim, svgPaint);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.SvgPaint parseColourSpecifer(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 3387192(0x33af38, float:4.746467E-39)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 1442907498(0x5601056a, float:3.5465063E13)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "currentColor"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0024
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = -1
        L_0x0025:
            if (r0 == 0) goto L_0x0035
            if (r0 == r2) goto L_0x0030
            com.caverock.androidsvg.SVG$Colour r3 = parseColour(r3)     // Catch:{ SVGParseException -> 0x002e }
            return r3
        L_0x002e:
            r3 = 0
            return r3
        L_0x0030:
            com.caverock.androidsvg.SVG$CurrentColor r3 = com.caverock.androidsvg.SVG.CurrentColor.getInstance()
            return r3
        L_0x0035:
            com.caverock.androidsvg.SVG$Colour r3 = com.caverock.androidsvg.SVG.Colour.TRANSPARENT
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseColourSpecifer(java.lang.String):com.caverock.androidsvg.SVG$SvgPaint");
    }

    private static SVG.Colour parseColour(String str) throws SVGParseException {
        int i = 5;
        if (str.charAt(0) == '#') {
            IntegerParser parseHex = IntegerParser.parseHex(str, 1, str.length());
            if (parseHex != null) {
                int endPos = parseHex.getEndPos();
                if (endPos == 4) {
                    int value = parseHex.value();
                    int i2 = value & 3840;
                    int i3 = value & DimensionsKt.HDPI;
                    int i4 = value & 15;
                    return new SVG.Colour(i4 | (i2 << 8) | -16777216 | (i2 << 12) | (i3 << 8) | (i3 << 4) | (i4 << 4));
                } else if (endPos == 5) {
                    int value2 = parseHex.value();
                    int i5 = 61440 & value2;
                    int i6 = value2 & 3840;
                    int i7 = value2 & DimensionsKt.HDPI;
                    int i8 = value2 & 15;
                    return new SVG.Colour((i8 << 24) | (i8 << 28) | (i5 << 8) | (i5 << 4) | (i6 << 4) | i6 | i7 | (i7 >> 4));
                } else if (endPos == 7) {
                    return new SVG.Colour(parseHex.value() | ViewCompat.MEASURED_STATE_MASK);
                } else {
                    if (endPos == 9) {
                        return new SVG.Colour((parseHex.value() >>> 8) | (parseHex.value() << 24));
                    }
                    throw new SVGParseException("Bad hex colour value: " + str);
                }
            } else {
                throw new SVGParseException("Bad hex colour value: " + str);
            }
        } else {
            String lowerCase = str.toLowerCase(Locale.US);
            boolean startsWith = lowerCase.startsWith("rgba(");
            if (startsWith || lowerCase.startsWith("rgb(")) {
                if (!startsWith) {
                    i = 4;
                }
                TextScanner textScanner = new TextScanner(str.substring(i));
                textScanner.skipWhitespace();
                float nextFloat = textScanner.nextFloat();
                if (!Float.isNaN(nextFloat) && textScanner.consume('%')) {
                    nextFloat = (nextFloat * 256.0f) / 100.0f;
                }
                float checkedNextFloat = textScanner.checkedNextFloat(nextFloat);
                if (!Float.isNaN(checkedNextFloat) && textScanner.consume('%')) {
                    checkedNextFloat = (checkedNextFloat * 256.0f) / 100.0f;
                }
                float checkedNextFloat2 = textScanner.checkedNextFloat(checkedNextFloat);
                if (!Float.isNaN(checkedNextFloat2) && textScanner.consume('%')) {
                    checkedNextFloat2 = (checkedNextFloat2 * 256.0f) / 100.0f;
                }
                if (startsWith) {
                    float checkedNextFloat3 = textScanner.checkedNextFloat(checkedNextFloat2);
                    textScanner.skipWhitespace();
                    if (!Float.isNaN(checkedNextFloat3) && textScanner.consume(')')) {
                        return new SVG.Colour((clamp255(checkedNextFloat3 * 256.0f) << 24) | (clamp255(nextFloat) << 16) | (clamp255(checkedNextFloat) << 8) | clamp255(checkedNextFloat2));
                    }
                    throw new SVGParseException("Bad rgba() colour value: " + str);
                }
                textScanner.skipWhitespace();
                if (!Float.isNaN(checkedNextFloat2) && textScanner.consume(')')) {
                    return new SVG.Colour((clamp255(nextFloat) << 16) | ViewCompat.MEASURED_STATE_MASK | (clamp255(checkedNextFloat) << 8) | clamp255(checkedNextFloat2));
                }
                throw new SVGParseException("Bad rgb() colour value: " + str);
            }
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
                return parseColourKeyword(lowerCase);
            }
            if (!startsWith2) {
                i = 4;
            }
            TextScanner textScanner2 = new TextScanner(str.substring(i));
            textScanner2.skipWhitespace();
            float nextFloat2 = textScanner2.nextFloat();
            float checkedNextFloat4 = textScanner2.checkedNextFloat(nextFloat2);
            if (!Float.isNaN(checkedNextFloat4)) {
                textScanner2.consume('%');
            }
            float checkedNextFloat5 = textScanner2.checkedNextFloat(checkedNextFloat4);
            if (!Float.isNaN(checkedNextFloat5)) {
                textScanner2.consume('%');
            }
            if (startsWith2) {
                float checkedNextFloat6 = textScanner2.checkedNextFloat(checkedNextFloat5);
                textScanner2.skipWhitespace();
                if (!Float.isNaN(checkedNextFloat6) && textScanner2.consume(')')) {
                    return new SVG.Colour((clamp255(checkedNextFloat6 * 256.0f) << 24) | hslToRgb(nextFloat2, checkedNextFloat4, checkedNextFloat5));
                }
                throw new SVGParseException("Bad hsla() colour value: " + str);
            }
            textScanner2.skipWhitespace();
            if (!Float.isNaN(checkedNextFloat5) && textScanner2.consume(')')) {
                return new SVG.Colour(hslToRgb(nextFloat2, checkedNextFloat4, checkedNextFloat5) | ViewCompat.MEASURED_STATE_MASK);
            }
            throw new SVGParseException("Bad hsl() colour value: " + str);
        }
    }

    private static int clamp255(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    private static int hslToRgb(float f, float f2, float f3) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        float f4 = f % 360.0f;
        if (i < 0) {
            f4 += 360.0f;
        }
        float f5 = f4 / 60.0f;
        float f6 = f2 / 100.0f;
        float f7 = f3 / 100.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f8 = f7 <= 0.5f ? (f6 + 1.0f) * f7 : (f7 + f6) - (f6 * f7);
        float f9 = (f7 * 2.0f) - f8;
        return clamp255(hueToRgb(f9, f8, f5 - 2.0f) * 256.0f) | (clamp255(hueToRgb(f9, f8, f5 + 2.0f) * 256.0f) << 16) | (clamp255(hueToRgb(f9, f8, f5) * 256.0f) << 8);
    }

    private static SVG.Colour parseColourKeyword(String str) throws SVGParseException {
        Integer num = ColourKeywords.get(str);
        if (num != null) {
            return new SVG.Colour(num.intValue());
        }
        throw new SVGParseException("Invalid colour keyword: " + str);
    }

    private static void parseFont(SVG.Style style, String str) {
        String nextToken;
        int i;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            TextScanner textScanner = new TextScanner(str);
            Integer num = null;
            SVG.Style.FontStyle fontStyle = null;
            String str2 = null;
            while (true) {
                nextToken = textScanner.nextToken('/');
                textScanner.skipWhitespace();
                if (nextToken != null) {
                    if (num == null || fontStyle == null) {
                        if (!nextToken.equals("normal") && ((num != null || (num = FontWeightKeywords.get(nextToken)) == null) && (fontStyle != null || (fontStyle = parseFontStyle(nextToken)) == null))) {
                            if (str2 != null || !nextToken.equals("small-caps")) {
                                break;
                            }
                            str2 = nextToken;
                        }
                    } else {
                        break;
                    }
                } else {
                    return;
                }
            }
            SVG.Length parseFontSize = parseFontSize(nextToken);
            if (textScanner.consume('/')) {
                textScanner.skipWhitespace();
                String nextToken2 = textScanner.nextToken();
                if (nextToken2 != null) {
                    try {
                        parseLength(nextToken2);
                    } catch (SVGParseException unused) {
                        return;
                    }
                }
                textScanner.skipWhitespace();
            }
            style.fontFamily = parseFontFamily(textScanner.restOfText());
            style.fontSize = parseFontSize;
            if (num == null) {
                i = 400;
            } else {
                i = num.intValue();
            }
            style.fontWeight = Integer.valueOf(i);
            if (fontStyle == null) {
                fontStyle = SVG.Style.FontStyle.Normal;
            }
            style.fontStyle = fontStyle;
            style.specifiedFlags |= 122880;
        }
    }

    private static List<String> parseFontFamily(String str) {
        TextScanner textScanner = new TextScanner(str);
        ArrayList arrayList = null;
        do {
            String nextQuotedString = textScanner.nextQuotedString();
            if (nextQuotedString == null) {
                nextQuotedString = textScanner.nextTokenWithWhitespace(',');
            }
            if (nextQuotedString == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(nextQuotedString);
            textScanner.skipCommaWhitespace();
        } while (!textScanner.empty());
        return arrayList;
    }

    private static SVG.Length parseFontSize(String str) {
        try {
            SVG.Length length = FontSizeKeywords.get(str);
            return length == null ? parseLength(str) : length;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private static Integer parseFontWeight(String str) {
        return FontWeightKeywords.get(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.Style.FontStyle parseFontStyle(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1657669071(0xffffffff9d31fa31, float:-2.35551E-21)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            if (r0 == r1) goto L_0x0020
            r1 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "normal"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "italic"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "oblique"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.caverock.androidsvg.SVG$Style$FontStyle r4 = com.caverock.androidsvg.SVG.Style.FontStyle.Oblique
            return r4
        L_0x0040:
            com.caverock.androidsvg.SVG$Style$FontStyle r4 = com.caverock.androidsvg.SVG.Style.FontStyle.Normal
            return r4
        L_0x0043:
            com.caverock.androidsvg.SVG$Style$FontStyle r4 = com.caverock.androidsvg.SVG.Style.FontStyle.Italic
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseFontStyle(java.lang.String):com.caverock.androidsvg.SVG$Style$FontStyle");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.Style.TextDecoration parseTextDecoration(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1171789332: goto L_0x0036;
                case -1026963764: goto L_0x002b;
                case 3387192: goto L_0x0021;
                case 93826908: goto L_0x0017;
                case 529818312: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0040
        L_0x000c:
            java.lang.String r0 = "overline"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0040
            r5 = 2
            goto L_0x0041
        L_0x0017:
            java.lang.String r0 = "blink"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0040
            r5 = 4
            goto L_0x0041
        L_0x0021:
            java.lang.String r0 = "none"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0040
            r5 = 0
            goto L_0x0041
        L_0x002b:
            java.lang.String r0 = "underline"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0040
            r5 = 1
            goto L_0x0041
        L_0x0036:
            java.lang.String r0 = "line-through"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0040
            r5 = 3
            goto L_0x0041
        L_0x0040:
            r5 = -1
        L_0x0041:
            if (r5 == 0) goto L_0x0059
            if (r5 == r4) goto L_0x0056
            if (r5 == r3) goto L_0x0053
            if (r5 == r2) goto L_0x0050
            if (r5 == r1) goto L_0x004d
            r5 = 0
            return r5
        L_0x004d:
            com.caverock.androidsvg.SVG$Style$TextDecoration r5 = com.caverock.androidsvg.SVG.Style.TextDecoration.Blink
            return r5
        L_0x0050:
            com.caverock.androidsvg.SVG$Style$TextDecoration r5 = com.caverock.androidsvg.SVG.Style.TextDecoration.LineThrough
            return r5
        L_0x0053:
            com.caverock.androidsvg.SVG$Style$TextDecoration r5 = com.caverock.androidsvg.SVG.Style.TextDecoration.Overline
            return r5
        L_0x0056:
            com.caverock.androidsvg.SVG$Style$TextDecoration r5 = com.caverock.androidsvg.SVG.Style.TextDecoration.Underline
            return r5
        L_0x0059:
            com.caverock.androidsvg.SVG$Style$TextDecoration r5 = com.caverock.androidsvg.SVG.Style.TextDecoration.None
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseTextDecoration(java.lang.String):com.caverock.androidsvg.SVG$Style$TextDecoration");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.Style.TextDirection parseTextDirection(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 107498(0x1a3ea, float:1.50637E-40)
            r2 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 113258(0x1ba6a, float:1.58708E-40)
            if (r0 == r1) goto L_0x0010
            goto L_0x0025
        L_0x0010:
            java.lang.String r0 = "rtl"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0025
            r3 = 1
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "ltr"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0025
            r3 = 0
            goto L_0x0026
        L_0x0025:
            r3 = -1
        L_0x0026:
            if (r3 == 0) goto L_0x002f
            if (r3 == r2) goto L_0x002c
            r3 = 0
            return r3
        L_0x002c:
            com.caverock.androidsvg.SVG$Style$TextDirection r3 = com.caverock.androidsvg.SVG.Style.TextDirection.RTL
            return r3
        L_0x002f:
            com.caverock.androidsvg.SVG$Style$TextDirection r3 = com.caverock.androidsvg.SVG.Style.TextDirection.LTR
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseTextDirection(java.lang.String):com.caverock.androidsvg.SVG$Style$TextDirection");
    }

    private static SVG.Style.FillRule parseFillRule(String str) {
        if ("nonzero".equals(str)) {
            return SVG.Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return SVG.Style.FillRule.EvenOdd;
        }
        return null;
    }

    private static SVG.Style.LineCap parseStrokeLineCap(String str) {
        if ("butt".equals(str)) {
            return SVG.Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineCap.Round;
        }
        if ("square".equals(str)) {
            return SVG.Style.LineCap.Square;
        }
        return null;
    }

    private static SVG.Style.LineJoin parseStrokeLineJoin(String str) {
        if ("miter".equals(str)) {
            return SVG.Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return SVG.Style.LineJoin.Bevel;
        }
        return null;
    }

    private static SVG.Length[] parseStrokeDashArray(String str) {
        SVG.Length nextLength;
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (textScanner.empty() || (nextLength = textScanner.nextLength()) == null || nextLength.isNegative()) {
            return null;
        }
        float floatValue = nextLength.floatValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(nextLength);
        while (!textScanner.empty()) {
            textScanner.skipCommaWhitespace();
            SVG.Length nextLength2 = textScanner.nextLength();
            if (nextLength2 == null || nextLength2.isNegative()) {
                return null;
            }
            arrayList.add(nextLength2);
            floatValue += nextLength2.floatValue();
        }
        if (floatValue == 0.0f) {
            return null;
        }
        return (SVG.Length[]) arrayList.toArray(new SVG.Length[arrayList.size()]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.Style.TextAnchor parseTextAnchor(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1074341483(0xffffffffbff6d995, float:-1.9285151)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002b
            r1 = 100571(0x188db, float:1.4093E-40)
            if (r0 == r1) goto L_0x0021
            r1 = 109757538(0x68ac462, float:5.219839E-35)
            if (r0 == r1) goto L_0x0016
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "start"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0035
            r4 = 0
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "end"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0035
            r4 = 2
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "middle"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = -1
        L_0x0036:
            if (r4 == 0) goto L_0x0044
            if (r4 == r3) goto L_0x0041
            if (r4 == r2) goto L_0x003e
            r4 = 0
            return r4
        L_0x003e:
            com.caverock.androidsvg.SVG$Style$TextAnchor r4 = com.caverock.androidsvg.SVG.Style.TextAnchor.End
            return r4
        L_0x0041:
            com.caverock.androidsvg.SVG$Style$TextAnchor r4 = com.caverock.androidsvg.SVG.Style.TextAnchor.Middle
            return r4
        L_0x0044:
            com.caverock.androidsvg.SVG$Style$TextAnchor r4 = com.caverock.androidsvg.SVG.Style.TextAnchor.Start
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseTextAnchor(java.lang.String):com.caverock.androidsvg.SVG$Style$TextAnchor");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean parseOverflow(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1217487446: goto L_0x002b;
                case -907680051: goto L_0x0020;
                case 3005871: goto L_0x0016;
                case 466743410: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0035
        L_0x000b:
            java.lang.String r0 = "visible"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0035
            r4 = 0
            goto L_0x0036
        L_0x0016:
            java.lang.String r0 = "auto"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0020:
            java.lang.String r0 = "scroll"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0035
            r4 = 3
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "hidden"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0035
            r4 = 2
            goto L_0x0036
        L_0x0035:
            r4 = -1
        L_0x0036:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0043
            if (r4 == r2) goto L_0x0040
            if (r4 == r1) goto L_0x0040
            r4 = 0
            return r4
        L_0x0040:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x0043:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseOverflow(java.lang.String):java.lang.Boolean");
    }

    private static SVG.CSSClipRect parseClip(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        TextScanner textScanner = new TextScanner(str.substring(5));
        textScanner.skipWhitespace();
        SVG.Length parseLengthOrAuto = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVG.Length parseLengthOrAuto2 = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVG.Length parseLengthOrAuto3 = parseLengthOrAuto(textScanner);
        textScanner.skipCommaWhitespace();
        SVG.Length parseLengthOrAuto4 = parseLengthOrAuto(textScanner);
        textScanner.skipWhitespace();
        if (textScanner.consume(')') || textScanner.empty()) {
            return new SVG.CSSClipRect(parseLengthOrAuto, parseLengthOrAuto2, parseLengthOrAuto3, parseLengthOrAuto4);
        }
        return null;
    }

    private static SVG.Length parseLengthOrAuto(TextScanner textScanner) {
        if (textScanner.consume("auto")) {
            return new SVG.Length(0.0f);
        }
        return textScanner.nextLength();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.Style.VectorEffect parseVectorEffect(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 3387192(0x33af38, float:4.746467E-39)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 1629199934(0x611b9e3e, float:1.794155E20)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "non-scaling-stroke"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0024
            r3 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "none"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0024
            r3 = 0
            goto L_0x0025
        L_0x0024:
            r3 = -1
        L_0x0025:
            if (r3 == 0) goto L_0x002e
            if (r3 == r2) goto L_0x002b
            r3 = 0
            return r3
        L_0x002b:
            com.caverock.androidsvg.SVG$Style$VectorEffect r3 = com.caverock.androidsvg.SVG.Style.VectorEffect.NonScalingStroke
            return r3
        L_0x002e:
            com.caverock.androidsvg.SVG$Style$VectorEffect r3 = com.caverock.androidsvg.SVG.Style.VectorEffect.None
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseVectorEffect(java.lang.String):com.caverock.androidsvg.SVG$Style$VectorEffect");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.Style.RenderQuality parseRenderQuality(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -933002398(0xffffffffc8638362, float:-232973.53)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002b
            r1 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r0 == r1) goto L_0x0021
            r1 = 362741610(0x159eff6a, float:6.4218664E-26)
            if (r0 == r1) goto L_0x0016
            goto L_0x0036
        L_0x0016:
            java.lang.String r0 = "optimizeSpeed"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0036
            r4 = 2
            goto L_0x0037
        L_0x0021:
            java.lang.String r0 = "auto"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0036
            r4 = 0
            goto L_0x0037
        L_0x002b:
            java.lang.String r0 = "optimizeQuality"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0036
            r4 = 1
            goto L_0x0037
        L_0x0036:
            r4 = -1
        L_0x0037:
            if (r4 == 0) goto L_0x0045
            if (r4 == r3) goto L_0x0042
            if (r4 == r2) goto L_0x003f
            r4 = 0
            return r4
        L_0x003f:
            com.caverock.androidsvg.SVG$Style$RenderQuality r4 = com.caverock.androidsvg.SVG.Style.RenderQuality.optimizeSpeed
            return r4
        L_0x0042:
            com.caverock.androidsvg.SVG$Style$RenderQuality r4 = com.caverock.androidsvg.SVG.Style.RenderQuality.optimizeQuality
            return r4
        L_0x0045:
            com.caverock.androidsvg.SVG$Style$RenderQuality r4 = com.caverock.androidsvg.SVG.Style.RenderQuality.auto
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parseRenderQuality(java.lang.String):com.caverock.androidsvg.SVG$Style$RenderQuality");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019f, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x021b, code lost:
        r2 = r8;
        r4 = r11;
        r1 = r15;
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0272, code lost:
        r0.skipCommaWhitespace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0279, code lost:
        if (r0.empty() == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x027b, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0280, code lost:
        if (r0.hasLetter() == false) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0282, code lost:
        r12 = r0.nextChar().intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.SVG.PathDefinition parsePath(java.lang.String r20) {
        /*
            com.caverock.androidsvg.SVGParser$TextScanner r0 = new com.caverock.androidsvg.SVGParser$TextScanner
            r1 = r20
            r0.<init>(r1)
            com.caverock.androidsvg.SVG$PathDefinition r9 = new com.caverock.androidsvg.SVG$PathDefinition
            r9.<init>()
            boolean r1 = r0.empty()
            if (r1 == 0) goto L_0x0013
            return r9
        L_0x0013:
            java.lang.Integer r1 = r0.nextChar()
            int r1 = r1.intValue()
            r2 = 77
            r10 = 109(0x6d, float:1.53E-43)
            if (r1 == r2) goto L_0x0024
            if (r1 == r10) goto L_0x0024
            return r9
        L_0x0024:
            r12 = r1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r13 = 0
            r14 = 0
        L_0x002b:
            r0.skipWhitespace()
            r5 = 108(0x6c, float:1.51E-43)
            r6 = 1073741824(0x40000000, float:2.0)
            java.lang.String r7 = " path segment"
            java.lang.String r8 = "Bad path coords for "
            java.lang.String r15 = "SVGParser"
            switch(r12) {
                case 65: goto L_0x0222;
                case 67: goto L_0x01ce;
                case 72: goto L_0x01a2;
                case 76: goto L_0x0172;
                case 77: goto L_0x0134;
                case 81: goto L_0x00f8;
                case 83: goto L_0x00ab;
                case 84: goto L_0x0072;
                case 86: goto L_0x0047;
                case 90: goto L_0x003c;
                case 97: goto L_0x0222;
                case 99: goto L_0x01ce;
                case 104: goto L_0x01a2;
                case 108: goto L_0x0172;
                case 109: goto L_0x0134;
                case 113: goto L_0x00f8;
                case 115: goto L_0x00ab;
                case 116: goto L_0x0072;
                case 118: goto L_0x0047;
                case 122: goto L_0x003c;
                default: goto L_0x003b;
            }
        L_0x003b:
            return r9
        L_0x003c:
            r9.close()
            r1 = r13
            r2 = r1
            r3 = r14
            r4 = r3
        L_0x0043:
            r18 = 0
            goto L_0x0272
        L_0x0047:
            float r4 = r0.nextFloat()
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 == 0) goto L_0x0068
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            char r1 = (char) r12
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r15, r0)
            return r9
        L_0x0068:
            r5 = 118(0x76, float:1.65E-43)
            if (r12 != r5) goto L_0x006d
            float r4 = r4 + r3
        L_0x006d:
            r9.lineTo(r1, r4)
            goto L_0x019f
        L_0x0072:
            float r5 = r1 * r6
            float r5 = r5 - r2
            float r6 = r6 * r3
            float r6 = r6 - r4
            float r2 = r0.nextFloat()
            float r4 = r0.checkedNextFloat((float) r2)
            boolean r16 = java.lang.Float.isNaN(r4)
            if (r16 == 0) goto L_0x009d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            char r1 = (char) r12
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r15, r0)
            return r9
        L_0x009d:
            r7 = 116(0x74, float:1.63E-43)
            if (r12 != r7) goto L_0x00a3
            float r2 = r2 + r1
            float r4 = r4 + r3
        L_0x00a3:
            r9.quadTo(r5, r6, r2, r4)
            r1 = r2
            r3 = r4
            r2 = r5
            r4 = r6
            goto L_0x0043
        L_0x00ab:
            float r5 = r1 * r6
            float r2 = r5 - r2
            float r6 = r6 * r3
            float r4 = r6 - r4
            float r5 = r0.nextFloat()
            float r6 = r0.checkedNextFloat((float) r5)
            float r11 = r0.checkedNextFloat((float) r6)
            float r16 = r0.checkedNextFloat((float) r11)
            boolean r17 = java.lang.Float.isNaN(r16)
            if (r17 == 0) goto L_0x00e0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            char r1 = (char) r12
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r15, r0)
            return r9
        L_0x00e0:
            r7 = 115(0x73, float:1.61E-43)
            if (r12 != r7) goto L_0x00e9
            float r11 = r11 + r1
            float r16 = r16 + r3
            float r5 = r5 + r1
            float r6 = r6 + r3
        L_0x00e9:
            r8 = r5
            r15 = r11
            r11 = r6
            r1 = r9
            r3 = r4
            r4 = r8
            r5 = r11
            r6 = r15
            r7 = r16
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            goto L_0x021b
        L_0x00f8:
            float r2 = r0.nextFloat()
            float r4 = r0.checkedNextFloat((float) r2)
            float r5 = r0.checkedNextFloat((float) r4)
            float r6 = r0.checkedNextFloat((float) r5)
            boolean r11 = java.lang.Float.isNaN(r6)
            if (r11 == 0) goto L_0x0125
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            char r1 = (char) r12
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r15, r0)
            return r9
        L_0x0125:
            r7 = 113(0x71, float:1.58E-43)
            if (r12 != r7) goto L_0x012d
            float r5 = r5 + r1
            float r6 = r6 + r3
            float r2 = r2 + r1
            float r4 = r4 + r3
        L_0x012d:
            r9.quadTo(r2, r4, r5, r6)
            r1 = r5
            r3 = r6
            goto L_0x0043
        L_0x0134:
            float r2 = r0.nextFloat()
            float r4 = r0.checkedNextFloat((float) r2)
            boolean r6 = java.lang.Float.isNaN(r4)
            if (r6 == 0) goto L_0x0159
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            char r1 = (char) r12
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r15, r0)
            return r9
        L_0x0159:
            if (r12 != r10) goto L_0x0163
            boolean r6 = r9.isEmpty()
            if (r6 != 0) goto L_0x0163
            float r2 = r2 + r1
            float r4 = r4 + r3
        L_0x0163:
            r9.moveTo(r2, r4)
            if (r12 != r10) goto L_0x0169
            goto L_0x016b
        L_0x0169:
            r5 = 76
        L_0x016b:
            r1 = r2
            r13 = r1
            r3 = r4
            r14 = r3
            r12 = r5
            goto L_0x0043
        L_0x0172:
            float r2 = r0.nextFloat()
            float r4 = r0.checkedNextFloat((float) r2)
            boolean r6 = java.lang.Float.isNaN(r4)
            if (r6 == 0) goto L_0x0197
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            char r1 = (char) r12
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r15, r0)
            return r9
        L_0x0197:
            if (r12 != r5) goto L_0x019b
            float r2 = r2 + r1
            float r4 = r4 + r3
        L_0x019b:
            r9.lineTo(r2, r4)
            r1 = r2
        L_0x019f:
            r3 = r4
            goto L_0x0043
        L_0x01a2:
            float r2 = r0.nextFloat()
            boolean r5 = java.lang.Float.isNaN(r2)
            if (r5 == 0) goto L_0x01c3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            char r1 = (char) r12
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r15, r0)
            return r9
        L_0x01c3:
            r5 = 104(0x68, float:1.46E-43)
            if (r12 != r5) goto L_0x01c8
            float r2 = r2 + r1
        L_0x01c8:
            r9.lineTo(r2, r3)
            r1 = r2
            goto L_0x0043
        L_0x01ce:
            float r2 = r0.nextFloat()
            float r4 = r0.checkedNextFloat((float) r2)
            float r5 = r0.checkedNextFloat((float) r4)
            float r6 = r0.checkedNextFloat((float) r5)
            float r11 = r0.checkedNextFloat((float) r6)
            float r16 = r0.checkedNextFloat((float) r11)
            boolean r17 = java.lang.Float.isNaN(r16)
            if (r17 == 0) goto L_0x0203
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            char r1 = (char) r12
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r15, r0)
            return r9
        L_0x0203:
            r7 = 99
            if (r12 != r7) goto L_0x020e
            float r11 = r11 + r1
            float r16 = r16 + r3
            float r2 = r2 + r1
            float r4 = r4 + r3
            float r5 = r5 + r1
            float r6 = r6 + r3
        L_0x020e:
            r3 = r4
            r8 = r5
            r15 = r11
            r11 = r6
            r1 = r9
            r4 = r8
            r5 = r11
            r6 = r15
            r7 = r16
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
        L_0x021b:
            r2 = r8
            r4 = r11
            r1 = r15
            r3 = r16
            goto L_0x0043
        L_0x0222:
            float r2 = r0.nextFloat()
            float r4 = r0.checkedNextFloat((float) r2)
            float r5 = r0.checkedNextFloat((float) r4)
            java.lang.Float r6 = java.lang.Float.valueOf(r5)
            java.lang.Boolean r6 = r0.checkedNextFlag(r6)
            java.lang.Boolean r11 = r0.checkedNextFlag(r6)
            float r10 = r0.checkedNextFloat((java.lang.Boolean) r11)
            float r17 = r0.checkedNextFloat((float) r10)
            boolean r18 = java.lang.Float.isNaN(r17)
            if (r18 != 0) goto L_0x028e
            r18 = 0
            int r19 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r19 < 0) goto L_0x028e
            int r19 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r19 >= 0) goto L_0x0253
            goto L_0x028e
        L_0x0253:
            r7 = 97
            if (r12 != r7) goto L_0x025a
            float r10 = r10 + r1
            float r17 = r17 + r3
        L_0x025a:
            boolean r6 = r6.booleanValue()
            boolean r7 = r11.booleanValue()
            r1 = r9
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r8 = r17
            r1.arcTo(r2, r3, r4, r5, r6, r7, r8)
            r1 = r10
            r2 = r1
            r3 = r17
            r4 = r3
        L_0x0272:
            r0.skipCommaWhitespace()
            boolean r5 = r0.empty()
            if (r5 == 0) goto L_0x027c
            return r9
        L_0x027c:
            boolean r5 = r0.hasLetter()
            if (r5 == 0) goto L_0x028a
            java.lang.Integer r5 = r0.nextChar()
            int r12 = r5.intValue()
        L_0x028a:
            r10 = 109(0x6d, float:1.53E-43)
            goto L_0x002b
        L_0x028e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            char r1 = (char) r12
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r15, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGParser.parsePath(java.lang.String):com.caverock.androidsvg.SVG$PathDefinition");
    }

    private static Set<String> parseRequiredFeatures(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String nextToken = textScanner.nextToken();
            if (nextToken.startsWith(FEATURE_STRING_PREFIX)) {
                hashSet.add(nextToken.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static Set<String> parseSystemLanguage(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            String nextToken = textScanner.nextToken();
            int indexOf = nextToken.indexOf(45);
            if (indexOf != -1) {
                nextToken = nextToken.substring(0, indexOf);
            }
            hashSet.add(new Locale(nextToken, "", "").getLanguage());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static Set<String> parseRequiredFormats(String str) {
        TextScanner textScanner = new TextScanner(str);
        HashSet hashSet = new HashSet();
        while (!textScanner.empty()) {
            hashSet.add(textScanner.nextToken());
            textScanner.skipWhitespace();
        }
        return hashSet;
    }

    private static String parseFunctionalIRI(String str, String str2) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }

    private void style(Attributes attributes) throws SVGParseException {
        debug("<style>", new Object[0]);
        if (this.currentElement != null) {
            String str = "all";
            boolean z = true;
            for (int i = 0; i < attributes.getLength(); i++) {
                String trim = attributes.getValue(i).trim();
                int i2 = C11791.$SwitchMap$com$caverock$androidsvg$SVGParser$SVGAttr[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (i2 == 88) {
                    z = trim.equals("text/css");
                } else if (i2 == 89) {
                    str = trim;
                }
            }
            if (!z || !CSSParser.mediaMatches(str, CSSParser.MediaType.screen)) {
                this.ignoring = true;
                this.ignoreDepth = 1;
                return;
            }
            this.inStyleElement = true;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }

    private void parseCSSStyleSheet(String str) {
        this.svgDocument.addCSSRules(new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document).parse(str));
    }
}
