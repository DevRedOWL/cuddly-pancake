package com.google.android.play.core.internal;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.h */
class C2298h extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f1976a;

    public C2298h(X509Certificate x509Certificate) {
        this.f1976a = x509Certificate;
    }

    public final void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.f1976a.checkValidity();
    }

    public final void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        this.f1976a.checkValidity(date);
    }

    public final int getBasicConstraints() {
        return this.f1976a.getBasicConstraints();
    }

    public final Set<String> getCriticalExtensionOIDs() {
        return this.f1976a.getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        return this.f1976a.getEncoded();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f1976a.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f1976a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f1976a.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f1976a.getKeyUsage();
    }

    public final Set<String> getNonCriticalExtensionOIDs() {
        return this.f1976a.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f1976a.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f1976a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f1976a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f1976a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f1976a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f1976a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f1976a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f1976a.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f1976a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f1976a.getSubjectUniqueID();
    }

    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f1976a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f1976a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f1976a.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f1976a.toString();
    }

    public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f1976a.verify(publicKey);
    }

    public final void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f1976a.verify(publicKey, str);
    }
}
