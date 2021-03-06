package org.opencv.android;

import android.util.Log;
import java.util.StringTokenizer;
import org.opencv.core.Core;

class StaticHelper {
    private static native String getLibraryList();

    /* renamed from: a */
    public static boolean m6916a(boolean z) {
        String str;
        if (z) {
            m6915a("cudart");
            m6915a("nppc");
            m6915a("nppi");
            m6915a("npps");
            m6915a("cufft");
            m6915a("cublas");
        }
        Log.d("OpenCV/StaticHelper", "Trying to get library list");
        try {
            System.loadLibrary("opencv_info");
            str = getLibraryList();
        } catch (UnsatisfiedLinkError unused) {
            Log.e("OpenCV/StaticHelper", "OpenCV error: Cannot load info library for OpenCV");
            str = "";
        }
        Log.d("OpenCV/StaticHelper", "Library list: \"" + str + "\"");
        Log.d("OpenCV/StaticHelper", "First attempt to load libs");
        if (m6917b(str)) {
            Log.d("OpenCV/StaticHelper", "First attempt to load libs is OK");
            for (String i : Core.getBuildInformation().split(System.getProperty("line.separator"))) {
                Log.i("OpenCV/StaticHelper", i);
            }
            return true;
        }
        Log.d("OpenCV/StaticHelper", "First attempt to load libs fails");
        return false;
    }

    /* renamed from: a */
    private static boolean m6915a(String str) {
        Log.d("OpenCV/StaticHelper", "Trying to load library " + str);
        try {
            System.loadLibrary(str);
            Log.d("OpenCV/StaticHelper", "Library " + str + " loaded");
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.d("OpenCV/StaticHelper", "Cannot load library \"" + str + "\"");
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m6917b(String str) {
        Log.d("OpenCV/StaticHelper", "Trying to init OpenCV libs");
        boolean z = true;
        if (str == null || str.length() == 0) {
            return true & m6915a("opencv_java3");
        }
        Log.d("OpenCV/StaticHelper", "Trying to load libs by dependency list");
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            z &= m6915a(stringTokenizer.nextToken());
        }
        return z;
    }
}
