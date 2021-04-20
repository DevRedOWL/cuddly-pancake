package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import com.yandex.metrica.C3097i;
import com.yandex.metrica.impl.p039ob.C4230wj;

/* renamed from: com.yandex.metrica.impl.ob.hr */
public class C3503hr extends C3489hd {
    public C3503hr(C3391en enVar) {
        super(enVar);
    }

    /* renamed from: a */
    public boolean mo40170a(C4217w wVar) {
        mo40179b(wVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo40179b(C4217w wVar) {
        String l = wVar.mo41741l();
        C3097i a = C4230wj.m6032a(l);
        String h = mo40176a().mo40024h();
        C3097i a2 = C4230wj.m6032a(h);
        if (!a.equals(a2)) {
            if (m3432a(a, a2)) {
                wVar.mo40966a(h);
                m3431a(wVar, C4230wj.C4231a.LOGOUT);
            } else if (m3434c(a, a2)) {
                m3431a(wVar, C4230wj.C4231a.LOGIN);
            } else if (m3433b(a, a2)) {
                m3431a(wVar, C4230wj.C4231a.SWITCH);
            } else {
                m3431a(wVar, C4230wj.C4231a.UPDATE);
            }
            mo40176a().mo40017a(l);
        }
    }

    /* renamed from: a */
    private void m3431a(C4217w wVar, C4230wj.C4231a aVar) {
        wVar.mo40970c(C4230wj.m6033a(aVar));
        mo40176a().mo40021e().mo40092e(wVar);
    }

    /* renamed from: a */
    private boolean m3432a(C3097i iVar, C3097i iVar2) {
        return TextUtils.isEmpty(iVar.mo39382a()) && !TextUtils.isEmpty(iVar2.mo39382a());
    }

    /* renamed from: b */
    private boolean m3433b(C3097i iVar, C3097i iVar2) {
        return !TextUtils.isEmpty(iVar.mo39382a()) && !iVar.mo39382a().equals(iVar2.mo39382a());
    }

    /* renamed from: c */
    private boolean m3434c(C3097i iVar, C3097i iVar2) {
        return !TextUtils.isEmpty(iVar.mo39382a()) && TextUtils.isEmpty(iVar2.mo39382a());
    }
}
