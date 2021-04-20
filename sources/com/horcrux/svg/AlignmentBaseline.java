package com.horcrux.svg;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Map;

enum AlignmentBaseline {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom(ViewProps.BOTTOM),
    center("center"),
    top(ViewProps.TOP),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");
    
    private static final Map<String, AlignmentBaseline> alignmentToEnum = null;
    private final String alignment;

    static {
        int i;
        HashMap hashMap = new HashMap();
        for (AlignmentBaseline alignmentBaseline : values()) {
            hashMap.put(alignmentBaseline.alignment, alignmentBaseline);
        }
        alignmentToEnum = ImmutableMap.copyOf(hashMap);
    }

    private AlignmentBaseline(String str) {
        this.alignment = str;
    }

    public static AlignmentBaseline getEnum(String str) {
        if (alignmentToEnum.containsKey(str)) {
            return alignmentToEnum.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    public String toString() {
        return this.alignment;
    }
}
