package org.linphone.core;

class PayloadTypeImpl implements PayloadType {
    public final long nativePtr;

    private native String getMime(long j);

    private native int getRate(long j);

    private native String getRecvFmtp(long j);

    private native String getSendFmtp(long j);

    private native void setRecvFmtp(long j, String str);

    private native void setSendFmtp(long j, String str);

    private native String toString(long j);

    protected PayloadTypeImpl(long j) {
        this.nativePtr = j;
    }

    public int getRate() {
        return getRate(this.nativePtr);
    }

    public String getMime() {
        return getMime(this.nativePtr);
    }

    public String toString() {
        return toString(this.nativePtr);
    }

    public void setRecvFmtp(String str) {
        setRecvFmtp(this.nativePtr, str);
    }

    public String getRecvFmtp() {
        return getRecvFmtp(this.nativePtr);
    }

    public void setSendFmtp(String str) {
        setSendFmtp(this.nativePtr, str);
    }

    public String getSendFmtp() {
        return getSendFmtp(this.nativePtr);
    }
}
