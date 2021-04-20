package com.yandex.metrica.impl.p039ob;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.yandex.metrica.impl.ob.wr */
public class C4239wr {

    /* renamed from: a */
    private final String f5281a;

    /* renamed from: b */
    private final byte[] f5282b;

    /* renamed from: c */
    private final byte[] f5283c;

    public C4239wr(String str, byte[] bArr, byte[] bArr2) {
        this.f5281a = str;
        this.f5282b = bArr;
        this.f5283c = bArr2;
    }

    /* renamed from: a */
    public byte[] mo41782a(byte[] bArr) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f5282b, "AES");
        Cipher instance = Cipher.getInstance(this.f5281a);
        instance.init(1, secretKeySpec, new IvParameterSpec(this.f5283c));
        return instance.doFinal(bArr);
    }

    /* renamed from: b */
    public byte[] mo41784b(byte[] bArr) throws Throwable {
        return mo41783a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public byte[] mo41783a(byte[] bArr, int i, int i2) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f5282b, "AES");
        Cipher instance = Cipher.getInstance(this.f5281a);
        instance.init(2, secretKeySpec, new IvParameterSpec(this.f5283c));
        return instance.doFinal(bArr, i, i2);
    }
}
