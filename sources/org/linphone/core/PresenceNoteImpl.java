package org.linphone.core;

public class PresenceNoteImpl implements PresenceNote {
    private long mNativePtr;

    private native String getContent(long j);

    private native String getLang(long j);

    private native long newPresenceNoteImpl(String str, String str2);

    private native int setContent(long j, String str);

    private native int setLang(long j, String str);

    private native void unref(long j);

    protected PresenceNoteImpl(long j) {
        this.mNativePtr = j;
    }

    protected PresenceNoteImpl(String str, String str2) {
        this.mNativePtr = newPresenceNoteImpl(str, str2);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        unref(this.mNativePtr);
    }

    public String getContent() {
        return getContent(this.mNativePtr);
    }

    public int setContent(String str) {
        return setContent(this.mNativePtr, str);
    }

    public String getLang() {
        return getLang(this.mNativePtr);
    }

    public int setLang(String str) {
        return setLang(this.mNativePtr, str);
    }

    public long getNativePtr() {
        return this.mNativePtr;
    }
}
