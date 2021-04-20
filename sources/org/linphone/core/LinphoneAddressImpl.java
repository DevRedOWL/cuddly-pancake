package org.linphone.core;

import org.linphone.core.LinphoneAddress;

public class LinphoneAddressImpl implements LinphoneAddress {
    protected final long nativePtr;

    public enum WrapMode {
        FromNew,
        FromConst,
        FromExisting
    }

    private native long clone(long j);

    private native String getDisplayName(long j);

    private native String getDomain(long j);

    private native int getPort(long j);

    private native int getTransport(long j);

    private native String getUserName(long j);

    private native long newLinphoneAddressImpl(String str, String str2);

    private native long ref(long j);

    private native void setDisplayName(long j, String str);

    private native void setDomain(long j, String str);

    private native void setPort(long j, int i);

    private native void setTransport(long j, int i);

    private native void setUserName(long j, String str);

    private native String toString(long j);

    private native String toUri(long j);

    private native void unref(long j);

    protected LinphoneAddressImpl(String str) throws LinphoneCoreException {
        this.nativePtr = newLinphoneAddressImpl(str, (String) null);
        if (this.nativePtr == 0) {
            throw new LinphoneCoreException("Cannot create LinphoneAdress from [" + str + "]");
        }
    }

    protected LinphoneAddressImpl(String str, String str2, String str3) {
        this.nativePtr = newLinphoneAddressImpl((String) null, str3);
        setUserName(str);
        setDomain(str2);
    }

    private LinphoneAddressImpl(long j) {
        this(j, WrapMode.FromConst);
    }

    /* renamed from: org.linphone.core.LinphoneAddressImpl$1 */
    static /* synthetic */ class C54221 {
        static final /* synthetic */ int[] $SwitchMap$org$linphone$core$LinphoneAddressImpl$WrapMode = new int[WrapMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                org.linphone.core.LinphoneAddressImpl$WrapMode[] r0 = org.linphone.core.LinphoneAddressImpl.WrapMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$linphone$core$LinphoneAddressImpl$WrapMode = r0
                int[] r0 = $SwitchMap$org$linphone$core$LinphoneAddressImpl$WrapMode     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.linphone.core.LinphoneAddressImpl$WrapMode r1 = org.linphone.core.LinphoneAddressImpl.WrapMode.FromNew     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$linphone$core$LinphoneAddressImpl$WrapMode     // Catch:{ NoSuchFieldError -> 0x001f }
                org.linphone.core.LinphoneAddressImpl$WrapMode r1 = org.linphone.core.LinphoneAddressImpl.WrapMode.FromConst     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$org$linphone$core$LinphoneAddressImpl$WrapMode     // Catch:{ NoSuchFieldError -> 0x002a }
                org.linphone.core.LinphoneAddressImpl$WrapMode r1 = org.linphone.core.LinphoneAddressImpl.WrapMode.FromExisting     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.linphone.core.LinphoneAddressImpl.C54221.<clinit>():void");
        }
    }

    protected LinphoneAddressImpl(long j, WrapMode wrapMode) {
        int i = C54221.$SwitchMap$org$linphone$core$LinphoneAddressImpl$WrapMode[wrapMode.ordinal()];
        if (i == 1) {
            this.nativePtr = j;
        } else if (i == 2) {
            this.nativePtr = clone(j);
        } else if (i != 3) {
            this.nativePtr = 0;
        } else {
            this.nativePtr = ref(j);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        long j = this.nativePtr;
        if (j != 0) {
            unref(j);
        }
    }

    public String getDisplayName() {
        return getDisplayName(this.nativePtr);
    }

    public String getDomain() {
        return getDomain(this.nativePtr);
    }

    public String getUserName() {
        return getUserName(this.nativePtr);
    }

    public LinphoneAddress.TransportType getTransport() {
        return LinphoneAddress.TransportType.fromInt(getTransport(this.nativePtr));
    }

    public int getPort() {
        return getPort(this.nativePtr);
    }

    public String toString() {
        return toString(this.nativePtr);
    }

    public String toUri() {
        return toUri(this.nativePtr);
    }

    public String asString() {
        return toString();
    }

    public String asStringUriOnly() {
        return toUri(this.nativePtr);
    }

    public void clean() {
        throw new RuntimeException("Not implemented");
    }

    public void setDisplayName(String str) {
        setDisplayName(this.nativePtr, str);
    }

    public void setDomain(String str) {
        setDomain(this.nativePtr, str);
    }

    public void setPort(int i) {
        setPort(this.nativePtr, i);
    }

    public void setUserName(String str) {
        setUserName(this.nativePtr, str);
    }

    public void setTransport(LinphoneAddress.TransportType transportType) {
        setTransport(this.nativePtr, transportType.toInt());
    }
}
