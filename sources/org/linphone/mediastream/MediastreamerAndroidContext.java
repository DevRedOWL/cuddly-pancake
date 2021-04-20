package org.linphone.mediastream;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import p035ru.unicorn.ujin.view.adapters.TimeSlotsAdapter;

public class MediastreamerAndroidContext {
    private static final int DEVICE_CHOICE = 0;
    public static final int DEVICE_HAS_BUILTIN_AEC = 1;
    public static final int DEVICE_HAS_BUILTIN_AEC_CRAPPY = 2;
    public static final int DEVICE_HAS_BUILTIN_OPENSLES_AEC = 8;
    public static final int DEVICE_USE_ANDROID_CAMCORDER = 512;
    public static final int DEVICE_USE_ANDROID_MIC = 4;
    private static MediastreamerAndroidContext instance;
    private static Context mContext;

    private native int enableFilterFromNameImpl(String str, boolean z);

    private native boolean filterFromNameEnabledImpl(String str);

    private native void setDeviceFavoriteBufferSize(int i);

    private native void setDeviceFavoriteSampleRate(int i);

    private MediastreamerAndroidContext() {
    }

    private static MediastreamerAndroidContext getInstance() {
        if (instance == null) {
            instance = new MediastreamerAndroidContext();
        }
        return instance;
    }

    public static Context getContext() {
        return mContext;
    }

    public static void setContext(Object obj) {
        if (obj != null) {
            mContext = (Context) obj;
            boolean hasSystemFeature = mContext.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
            boolean hasSystemFeature2 = mContext.getPackageManager().hasSystemFeature("android.hardware.audio.pro");
            Log.m6905i("[Device] hasLowLatencyFeature: " + hasSystemFeature + ", hasProFeature: " + hasSystemFeature2);
            MediastreamerAndroidContext instance2 = getInstance();
            if (Build.VERSION.SDK_INT >= 19) {
                AudioManager audioManager = (AudioManager) mContext.getSystemService("audio");
                int parseInt = parseInt(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"), 256);
                int parseInt2 = parseInt(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"), 44100);
                Log.m6905i("[Device] Output frames per buffer: " + parseInt + ", output sample rates: " + parseInt2 + " for OpenSLES MS sound card.");
                instance2.setDeviceFavoriteSampleRate(parseInt2);
                instance2.setDeviceFavoriteBufferSize(parseInt);
                return;
            }
            Log.m6905i("Android < 4.4 detected, android context not used.");
        }
    }

    public static boolean getSpeakerphoneAlwaysOn(Factory factory) {
        return (factory.getDeviceFlags() & 512) != 0;
    }

    private static int parseInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            Log.m6903e("Can't parse " + str + " to integer ; using default value " + i);
            return i;
        }
    }

    public static void enableFilterFromName(String str, boolean z) throws MediastreamException {
        if (getInstance().enableFilterFromNameImpl(str, z) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot ");
            sb.append(z ? "enable" : TimeSlotsAdapter.DISABLED);
            sb.append(" filter  name [");
            sb.append(str);
            sb.append("]");
            throw new MediastreamException(sb.toString());
        }
    }

    public static boolean filterFromNameEnabled(String str) {
        return getInstance().filterFromNameEnabledImpl(str);
    }
}
