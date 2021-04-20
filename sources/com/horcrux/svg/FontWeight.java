package com.horcrux.svg;

import com.facebook.common.internal.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

enum FontWeight {
    Normal("normal"),
    Bold("bold"),
    Bolder("bolder"),
    Lighter("lighter"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900");
    
    private static final Map<String, FontWeight> weightToEnum = null;
    private final String weight;

    static {
        int i;
        HashMap hashMap = new HashMap();
        for (FontWeight fontWeight : values()) {
            hashMap.put(fontWeight.weight, fontWeight);
        }
        weightToEnum = ImmutableMap.copyOf(hashMap);
    }

    private FontWeight(String str) {
        this.weight = str;
    }

    public static FontWeight getEnum(String str) {
        if (weightToEnum.containsKey(str)) {
            return weightToEnum.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    public String toString() {
        return this.weight;
    }
}
