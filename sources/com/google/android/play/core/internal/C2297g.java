package com.google.android.play.core.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.play.core.internal.g */
final class C2297g extends C2298h {

    /* renamed from: a */
    private final byte[] f1975a;

    public C2297g(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f1975a = bArr;
    }

    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f1975a;
    }
}
