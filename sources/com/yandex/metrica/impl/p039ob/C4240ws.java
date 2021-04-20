package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.ws */
public class C4240ws implements C4245wx {

    /* renamed from: a */
    private final C4239wr f5284a;

    C4240ws(Context context) {
        this(new C4238wq(context));
    }

    C4240ws(C4238wq wqVar) {
        this(new C4239wr("AES/CBC/PKCS5Padding", wqVar.mo41780a(), wqVar.mo41781b()));
    }

    C4240ws(C4239wr wrVar) {
        this.f5284a = wrVar;
    }

    /* renamed from: a */
    public C4244ww mo41785a(C4217w wVar) {
        String e = wVar.mo41734e();
        String str = null;
        if (!TextUtils.isEmpty(e)) {
            try {
                byte[] a = this.f5284a.mo41782a(e.getBytes("UTF-8"));
                if (a != null) {
                    str = Base64.encodeToString(a, 0);
                }
            } catch (Throwable unused) {
            }
        }
        return new C4244ww(wVar.mo40970c(str), mo41786a());
    }

    /* renamed from: a */
    public byte[] mo41787a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            return this.f5284a.mo41784b(Base64.decode(bArr, 0));
        } catch (Throwable unused) {
            return bArr2;
        }
    }

    /* renamed from: a */
    public C4247wz mo41786a() {
        return C4247wz.AES_VALUE_ENCRYPTION;
    }
}
