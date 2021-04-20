package com.horcrux.svg;

import com.facebook.common.internal.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

enum TextDecoration {
    None("none"),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");
    
    private static final Map<String, TextDecoration> decorationToEnum = null;
    private final String decoration;

    static {
        int i;
        HashMap hashMap = new HashMap();
        for (TextDecoration textDecoration : values()) {
            hashMap.put(textDecoration.decoration, textDecoration);
        }
        decorationToEnum = ImmutableMap.copyOf(hashMap);
    }

    private TextDecoration(String str) {
        this.decoration = str;
    }

    public static TextDecoration getEnum(String str) {
        if (decorationToEnum.containsKey(str)) {
            return decorationToEnum.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    public String toString() {
        return this.decoration;
    }
}
