package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import com.github.mikephil.charting.utils.Utils;

class FontData {
    static final double DEFAULT_FONT_SIZE = 12.0d;
    private static final double DEFAULT_KERNING = 0.0d;
    private static final double DEFAULT_LETTER_SPACING = 0.0d;
    private static final double DEFAULT_WORD_SPACING = 0.0d;
    static final FontData Defaults = new FontData();
    private static final String FONT_DATA = "fontData";
    private static final String FONT_FEATURE_SETTINGS = "fontFeatureSettings";
    private static final String FONT_VARIANT_LIGATURES = "fontVariantLigatures";
    private static final String KERNING = "kerning";
    private static final String LETTER_SPACING = "letterSpacing";
    private static final String TEXT_ANCHOR = "textAnchor";
    private static final String TEXT_DECORATION = "textDecoration";
    private static final String WORD_SPACING = "wordSpacing";
    final ReadableMap fontData;
    final String fontFamily;
    final String fontFeatureSettings;
    final double fontSize;
    final FontStyle fontStyle;
    final FontVariantLigatures fontVariantLigatures;
    final FontWeight fontWeight;
    final double kerning;
    final double letterSpacing;
    final boolean manualKerning;
    final TextAnchor textAnchor;
    final TextDecoration textDecoration;
    final double wordSpacing;

    private FontData() {
        this.fontData = null;
        this.fontFamily = "";
        this.fontStyle = FontStyle.normal;
        this.fontWeight = FontWeight.Normal;
        this.fontFeatureSettings = "";
        this.fontVariantLigatures = FontVariantLigatures.normal;
        this.textAnchor = TextAnchor.start;
        this.textDecoration = TextDecoration.None;
        this.manualKerning = false;
        this.kerning = Utils.DOUBLE_EPSILON;
        this.fontSize = DEFAULT_FONT_SIZE;
        this.wordSpacing = Utils.DOUBLE_EPSILON;
        this.letterSpacing = Utils.DOUBLE_EPSILON;
    }

    private double toAbsolute(String str, double d, double d2) {
        return PropHelper.fromRelative(str, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, d, d2);
    }

    FontData(ReadableMap readableMap, FontData fontData2, double d) {
        double d2 = fontData2.fontSize;
        if (readableMap.hasKey(ViewProps.FONT_SIZE)) {
            this.fontSize = PropHelper.fromRelative(readableMap.getString(ViewProps.FONT_SIZE), d2, Utils.DOUBLE_EPSILON, 1.0d, d2);
        } else {
            this.fontSize = d2;
        }
        this.fontData = readableMap.hasKey(FONT_DATA) ? readableMap.getMap(FONT_DATA) : fontData2.fontData;
        this.fontFamily = readableMap.hasKey(ViewProps.FONT_FAMILY) ? readableMap.getString(ViewProps.FONT_FAMILY) : fontData2.fontFamily;
        this.fontStyle = readableMap.hasKey(ViewProps.FONT_STYLE) ? FontStyle.valueOf(readableMap.getString(ViewProps.FONT_STYLE)) : fontData2.fontStyle;
        this.fontWeight = readableMap.hasKey(ViewProps.FONT_WEIGHT) ? FontWeight.getEnum(readableMap.getString(ViewProps.FONT_WEIGHT)) : fontData2.fontWeight;
        this.fontFeatureSettings = readableMap.hasKey(FONT_FEATURE_SETTINGS) ? readableMap.getString(FONT_FEATURE_SETTINGS) : fontData2.fontFeatureSettings;
        this.fontVariantLigatures = readableMap.hasKey(FONT_VARIANT_LIGATURES) ? FontVariantLigatures.valueOf(readableMap.getString(FONT_VARIANT_LIGATURES)) : fontData2.fontVariantLigatures;
        this.textAnchor = readableMap.hasKey(TEXT_ANCHOR) ? TextAnchor.valueOf(readableMap.getString(TEXT_ANCHOR)) : fontData2.textAnchor;
        this.textDecoration = readableMap.hasKey(TEXT_DECORATION) ? TextDecoration.getEnum(readableMap.getString(TEXT_DECORATION)) : fontData2.textDecoration;
        boolean hasKey = readableMap.hasKey(KERNING);
        this.manualKerning = hasKey || fontData2.manualKerning;
        this.kerning = hasKey ? toAbsolute(readableMap.getString(KERNING), d, this.fontSize) : fontData2.kerning;
        this.wordSpacing = readableMap.hasKey(WORD_SPACING) ? toAbsolute(readableMap.getString(WORD_SPACING), d, this.fontSize) : fontData2.wordSpacing;
        this.letterSpacing = readableMap.hasKey("letterSpacing") ? toAbsolute(readableMap.getString("letterSpacing"), d, this.fontSize) : fontData2.letterSpacing;
    }
}
