package com.google.android.play.core.install.model;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.install.model.a */
public final class C2233a {

    /* renamed from: a */
    private static final Map<Integer, String> f1905a = new HashMap();

    /* renamed from: b */
    private static final Map<Integer, String> f1906b = new HashMap();

    static {
        f1905a.put(-2, "An unknown error occurred.");
        f1905a.put(-3, "The API is not available on this device.");
        f1905a.put(-4, "The request that was sent by the app is malformed.");
        f1905a.put(-5, "The install is unavailable to this user or device.");
        f1905a.put(-6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        f1905a.put(-7, "The install/update has not been (fully) downloaded yet.");
        f1905a.put(-8, "The install is already in progress and there is no UI flow to resume.");
        f1905a.put(-9, "The Play Store app is either not installed or not the official version.");
        f1905a.put(-10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        f1905a.put(-100, "An internal error happened in the Play Store.");
        f1906b.put(-2, "ERROR_UNKNOWN");
        f1906b.put(-3, "ERROR_API_NOT_AVAILABLE");
        f1906b.put(-4, "ERROR_INVALID_REQUEST");
        f1906b.put(-5, "ERROR_INSTALL_UNAVAILABLE");
        f1906b.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        f1906b.put(-7, "ERROR_DOWNLOAD_NOT_PRESENT");
        f1906b.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        f1906b.put(-100, "ERROR_INTERNAL_ERROR");
        f1906b.put(-9, "ERROR_PLAY_STORE_NOT_FOUND");
        f1906b.put(-10, "ERROR_APP_NOT_OWNED");
    }

    /* renamed from: a */
    public static String m1124a(int i) {
        Map<Integer, String> map = f1905a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) || !f1906b.containsKey(valueOf)) {
            return "";
        }
        String str = f1905a.get(valueOf);
        String str2 = f1906b.get(valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 103 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
