package org.linphone.core;

public class LinphoneNatPolicyImpl implements LinphoneNatPolicy {
    protected final long mNativePtr;

    private native void clear(long j);

    private native void enableIce(long j, boolean z);

    private native void enableStun(long j, boolean z);

    private native void enableTurn(long j, boolean z);

    private native void enableUpnp(long j, boolean z);

    private native Object getCore(long j);

    private native String getStunServer(long j);

    private native String getStunServerUsername(long j);

    private native boolean iceEnabled(long j);

    private native void setStunServer(long j, String str);

    private native void setStunServerUsername(long j, String str);

    private native boolean stunEnabled(long j);

    private native boolean turnEnabled(long j);

    private native boolean upnpEnabled(long j);

    protected LinphoneNatPolicyImpl(long j) {
        this.mNativePtr = j;
    }

    private synchronized LinphoneCore getCore() {
        return (LinphoneCore) getCore(this.mNativePtr);
    }

    public void clear() {
        synchronized (getCore()) {
            clear(this.mNativePtr);
        }
    }

    public boolean stunEnabled() {
        boolean stunEnabled;
        synchronized (getCore()) {
            stunEnabled = stunEnabled(this.mNativePtr);
        }
        return stunEnabled;
    }

    public void enableStun(boolean z) {
        synchronized (getCore()) {
            enableStun(this.mNativePtr, z);
        }
    }

    public boolean turnEnabled() {
        boolean turnEnabled;
        synchronized (getCore()) {
            turnEnabled = turnEnabled(this.mNativePtr);
        }
        return turnEnabled;
    }

    public void enableTurn(boolean z) {
        synchronized (getCore()) {
            enableTurn(this.mNativePtr, z);
        }
    }

    public boolean iceEnabled() {
        boolean iceEnabled;
        synchronized (getCore()) {
            iceEnabled = iceEnabled(this.mNativePtr);
        }
        return iceEnabled;
    }

    public void enableIce(boolean z) {
        synchronized (getCore()) {
            enableIce(this.mNativePtr, z);
        }
    }

    public boolean upnpEnabled() {
        boolean upnpEnabled;
        synchronized (getCore()) {
            upnpEnabled = upnpEnabled(this.mNativePtr);
        }
        return upnpEnabled;
    }

    public void enableUpnp(boolean z) {
        synchronized (getCore()) {
            enableUpnp(this.mNativePtr, z);
        }
    }

    public String getStunServer() {
        String stunServer;
        synchronized (getCore()) {
            stunServer = getStunServer(this.mNativePtr);
        }
        return stunServer;
    }

    public void setStunServer(String str) {
        synchronized (getCore()) {
            setStunServer(this.mNativePtr, str);
        }
    }

    public String getStunServerUsername() {
        String stunServerUsername;
        synchronized (getCore()) {
            stunServerUsername = getStunServerUsername(this.mNativePtr);
        }
        return stunServerUsername;
    }

    public void setStunServerUsername(String str) {
        synchronized (getCore()) {
            setStunServerUsername(this.mNativePtr, str);
        }
    }
}
