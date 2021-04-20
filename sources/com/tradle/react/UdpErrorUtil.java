package com.tradle.react;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import javax.annotation.Nullable;

public class UdpErrorUtil {
    static WritableMap getError(@Nullable String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }
}
