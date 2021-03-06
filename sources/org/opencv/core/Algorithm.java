package org.opencv.core;

public class Algorithm {
    protected final long nativeObj;

    private static native void clear_0(long j);

    private static native void delete(long j);

    private static native String getDefaultName_0(long j);

    private static native void save_0(long j, String str);

    protected Algorithm(long j) {
        this.nativeObj = j;
    }

    public String getDefaultName() {
        return getDefaultName_0(this.nativeObj);
    }

    public void clear() {
        clear_0(this.nativeObj);
    }

    public void save(String str) {
        save_0(this.nativeObj, str);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        delete(this.nativeObj);
    }
}
