package com.google.android.play.core.splitinstall.model;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.splitinstall.model.a */
public final class C2383a {

    /* renamed from: a */
    private static final Map<Integer, String> f2116a = new HashMap();

    /* renamed from: b */
    private static final Map<Integer, String> f2117b = new HashMap();

    static {
        f2116a.put(-1, "Too many sessions are running for current app, existing sessions must be resolved first.");
        f2116a.put(-2, "A requested module is not available (to this user/device, for the installed apk).");
        f2116a.put(-3, "Request is otherwise invalid.");
        f2116a.put(-4, "Requested session is not found.");
        f2116a.put(-5, "Split Install API is not available.");
        f2116a.put(-6, "Network error: unable to obtain split details.");
        f2116a.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        f2116a.put(-8, "Requested session contains modules from an existing active session and also new modules.");
        f2116a.put(-9, "Service handling split install has died.");
        f2116a.put(-10, "Install failed due to insufficient storage.");
        f2116a.put(-11, "Signature verification error when invoking SplitCompat.");
        f2116a.put(-12, "Error in SplitCompat emulation.");
        f2116a.put(-13, "Error in copying files for SplitCompat.");
        f2116a.put(-14, "The Play Store app is either not installed or not the official version.");
        f2116a.put(-15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        f2116a.put(-100, "Unknown error processing split install.");
        f2117b.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        f2117b.put(-2, "MODULE_UNAVAILABLE");
        f2117b.put(-3, "INVALID_REQUEST");
        f2117b.put(-4, "DOWNLOAD_NOT_FOUND");
        f2117b.put(-5, "API_NOT_AVAILABLE");
        f2117b.put(-6, "NETWORK_ERROR");
        f2117b.put(-7, "ACCESS_DENIED");
        f2117b.put(-8, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        f2117b.put(-9, "SERVICE_DIED");
        f2117b.put(-10, "INSUFFICIENT_STORAGE");
        f2117b.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        f2117b.put(-12, "SPLITCOMPAT_EMULATION_ERROR");
        f2117b.put(-13, "SPLITCOMPAT_COPY_ERROR");
        f2117b.put(-14, "PLAY_STORE_NOT_FOUND");
        f2117b.put(-15, "APP_NOT_OWNED");
    }

    /* renamed from: a */
    public static String m1534a(int i) {
        Map<Integer, String> map = f2116a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) || !f2117b.containsKey(valueOf)) {
            return "";
        }
        String str = f2116a.get(valueOf);
        String str2 = f2117b.get(valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 118 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
