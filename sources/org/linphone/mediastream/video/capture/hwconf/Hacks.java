package org.linphone.mediastream.video.capture.hwconf;

import android.hardware.Camera;
import android.os.Build;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.Version;

public final class Hacks {
    private static BuiltInEchoCancellerModel[] mBuiltInEchoCancellerModels = {new BuiltInEchoCancellerModel("samsung", "GT-I9100"), new BuiltInEchoCancellerModel("samsung", "GT-I9300")};

    private static class BuiltInEchoCancellerModel {
        public String manufacturer;
        public String model;

        public BuiltInEchoCancellerModel(String str, String str2) {
            this.manufacturer = str;
            this.model = str2;
        }
    }

    private Hacks() {
    }

    public static boolean isGalaxySOrTabWithFrontCamera() {
        return isGalaxySOrTab() && !isGalaxySOrTabWithoutFrontCamera();
    }

    private static boolean isGalaxySOrTabWithoutFrontCamera() {
        return isSC02B() || isSGHI896();
    }

    public static boolean isGalaxySOrTab() {
        return isGalaxyS() || isGalaxyTab();
    }

    public static boolean isGalaxyTab() {
        return isGTP1000();
    }

    private static boolean isGalaxyS() {
        return isGT9000() || isSC02B() || isSGHI896() || isSPHD700();
    }

    public static final boolean hasTwoCamerasRear0Front1() {
        return isLGP970() || isSPHD700() || isADR6400();
    }

    private static final boolean isADR6400() {
        return Build.MODEL.startsWith("ADR6400") || Build.DEVICE.startsWith("ADR6400");
    }

    private static final boolean isSPHD700() {
        return Build.DEVICE.startsWith("SPH-D700");
    }

    private static boolean isSGHI896() {
        return Build.DEVICE.startsWith("SGH-I896");
    }

    private static boolean isGT9000() {
        return Build.DEVICE.startsWith("GT-I9000");
    }

    private static boolean isSC02B() {
        return Build.DEVICE.startsWith("SC-02B");
    }

    private static boolean isGTP1000() {
        return Build.DEVICE.startsWith("GT-P1000");
    }

    private static final boolean isLGP970() {
        return Build.DEVICE.startsWith("LG-P970");
    }

    public static final void sleep(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException unused) {
        }
    }

    public static boolean needSoftvolume() {
        return isGalaxySOrTab() && Version.sdkStrictlyBelow(9);
    }

    public static boolean needGalaxySAudioHack() {
        return isGalaxySOrTab() && !isSC02B();
    }

    public static boolean needPausingCallForSpeakers() {
        return needGalaxySAudioHack();
    }

    public static boolean hasCamera() {
        int i;
        if (Version.sdkAboveOrEqual(9)) {
            try {
                i = ((Integer) Camera.class.getMethod("getNumberOfCameras", (Class[]) null).invoke((Object) null, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.m6903e("Error getting number of cameras");
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
        Log.m6905i("Hack: considering there IS a camera.\nIf it is not the case, report DEVICE and MODEL to linphone-users@nongnu.org");
        return true;
    }

    public static boolean hasBuiltInEchoCanceller() {
        BuiltInEchoCancellerModel[] builtInEchoCancellerModelArr = mBuiltInEchoCancellerModels;
        int length = builtInEchoCancellerModelArr.length;
        int i = 0;
        while (i < length) {
            BuiltInEchoCancellerModel builtInEchoCancellerModel = builtInEchoCancellerModelArr[i];
            if (!Build.MANUFACTURER.equals(builtInEchoCancellerModel.manufacturer) || !Build.MODEL.startsWith(builtInEchoCancellerModel.model)) {
                i++;
            } else {
                Log.m6905i(Build.MANUFACTURER + " " + Build.MODEL + " has a built-in echo canceller");
                return true;
            }
        }
        Log.m6905i(Build.MANUFACTURER + " " + Build.MODEL + " doesn't have a built-in echo canceller");
        return false;
    }
}
