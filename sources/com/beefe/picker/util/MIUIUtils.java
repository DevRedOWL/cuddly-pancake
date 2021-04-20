package com.beefe.picker.util;

import java.io.IOException;

public final class MIUIUtils {
    private static final String KEY_MIUI_INTERNAL_STORAGE = "ro.miui.internal.storage";
    private static final String KEY_MIUI_VERSION_CODE = "ro.miui.ui.version.code";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";

    public static boolean isMIUI() {
        try {
            BuildProperties newInstance = BuildProperties.newInstance();
            if (newInstance.getProperty(KEY_MIUI_VERSION_CODE, (String) null) == null && newInstance.getProperty(KEY_MIUI_VERSION_NAME, (String) null) == null && newInstance.getProperty(KEY_MIUI_INTERNAL_STORAGE, (String) null) == null) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
