package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.q */
public class C3841q {

    /* renamed from: a */
    private final Context f4091a;

    /* renamed from: b */
    private final C3688lw f4092b;

    /* renamed from: c */
    private final String f4093c;

    /* renamed from: d */
    private final C4281yc f4094d;

    public C3841q(Context context, C3688lw lwVar) {
        this(context, lwVar, context.getPackageName(), new C4281yc());
    }

    C3841q(Context context, C3688lw lwVar, String str, C4281yc ycVar) {
        this.f4091a = context;
        this.f4092b = lwVar;
        this.f4093c = str;
        this.f4094d = ycVar;
    }

    /* renamed from: a */
    public List<String> mo40873a() {
        List<String> b = m4529b();
        if (b.isEmpty()) {
            b = m4530c();
            if (!b.isEmpty()) {
                m4528a(b);
            }
        }
        return b;
    }

    /* renamed from: b */
    private List<String> m4529b() {
        return this.f4092b.mo40552o();
    }

    /* renamed from: c */
    private List<String> m4530c() {
        Signature[] signatureArr;
        ArrayList arrayList = new ArrayList();
        try {
            if (C3306cx.m2857a(28)) {
                signatureArr = m4531d();
            } else {
                signatureArr = this.f4094d.mo41860a(this.f4091a, this.f4093c, 64).signatures;
            }
            if (signatureArr != null) {
                for (Signature a : signatureArr) {
                    String a2 = m4527a(a);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    private Signature[] m4531d() {
        SigningInfo signingInfo = this.f4094d.mo41860a(this.f4091a, this.f4093c, 134217728).signingInfo;
        if (signingInfo.hasMultipleSigners()) {
            return signingInfo.getApkContentsSigners();
        }
        return signingInfo.getSigningCertificateHistory();
    }

    /* renamed from: a */
    private String m4527a(Signature signature) {
        try {
            return C3303cu.m2826b(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m4528a(List<String> list) {
        this.f4092b.mo40526a(list).mo40567q();
    }
}
