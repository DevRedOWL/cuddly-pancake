package org.videolan.libvlc;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.videolan.libvlc.util.HWDecoderUtil;

public class LibVLC extends VLCObject<Event> {
    private static final String TAG = "VLC/LibVLC";
    private static boolean sLoaded = false;
    final Context mAppContext;

    private native void nativeNew(String[] strArr, String str);

    private native void nativeRelease();

    private native void nativeSetUserAgent(String str, String str2);

    public native String changeset();

    public native String compiler();

    /* access modifiers changed from: protected */
    public Event onEventNative(int i, long j, long j2, float f) {
        return null;
    }

    public native String version();

    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    public static class Event extends VLCEvent {
        protected Event(int i) {
            super(i);
        }
    }

    public LibVLC(Context context, ArrayList<String> arrayList) {
        this.mAppContext = context.getApplicationContext();
        loadLibraries();
        arrayList = arrayList == null ? new ArrayList<>() : arrayList;
        Iterator<String> it = arrayList.iterator();
        boolean z = true;
        boolean z2 = true;
        while (it.hasNext()) {
            String next = it.next();
            z = next.startsWith("--aout=") ? false : z;
            z2 = next.startsWith("--android-display-chroma") ? false : z2;
            if (!z && !z2) {
                break;
            }
        }
        if (z || z2) {
            if (z) {
                if (HWDecoderUtil.getAudioOutputFromDevice() == HWDecoderUtil.AudioOutput.OPENSLES) {
                    arrayList.add("--aout=opensles");
                } else {
                    arrayList.add("--aout=android_audiotrack");
                }
            }
            if (z2) {
                arrayList.add("--android-display-chroma");
                arrayList.add("RV16");
            }
        }
        nativeNew((String[]) arrayList.toArray(new String[arrayList.size()]), context.getDir("vlc", 0).getAbsolutePath());
    }

    public LibVLC(Context context) {
        this(context, (ArrayList<String>) null);
    }

    /* access modifiers changed from: protected */
    public void onReleaseNative() {
        nativeRelease();
    }

    public void setUserAgent(String str, String str2) {
        nativeSetUserAgent(str, str2);
    }

    public static synchronized void loadLibraries() {
        synchronized (LibVLC.class) {
            if (!sLoaded) {
                sLoaded = true;
                try {
                    System.loadLibrary("c++_shared");
                    System.loadLibrary("vlc");
                    System.loadLibrary("vlcjni");
                } catch (UnsatisfiedLinkError e) {
                    Log.e(TAG, "Can't load vlcjni library: " + e);
                    System.exit(1);
                } catch (SecurityException e2) {
                    Log.e(TAG, "Encountered a security issue when loading vlcjni library: " + e2);
                    System.exit(1);
                }
            }
        }
    }
}
