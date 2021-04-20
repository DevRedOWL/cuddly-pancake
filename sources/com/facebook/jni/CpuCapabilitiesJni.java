package com.facebook.jni;

import com.facebook.soloader.SoLoader;

public class CpuCapabilitiesJni {
    public static native boolean nativeDeviceSupportsNeon();

    public static native boolean nativeDeviceSupportsVFPFP16();

    public static native boolean nativeDeviceSupportsX86();

    static {
        SoLoader.loadLibrary("fb");
    }
}
