package com.yandex.metrica.push.impl;

import com.yandex.metrica.C4300p;
import com.yandex.metrica.push.impl.C4346bc;

/* renamed from: com.yandex.metrica.push.impl.ba */
public class C4344ba implements C4358bh {
    /* renamed from: a */
    public void mo41966a(String str) {
        m6327a((C4345bb) new C4356bf(str));
    }

    /* renamed from: b */
    public void mo41969b(String str) {
        m6327a((C4345bb) new C4356bf(str));
    }

    /* renamed from: a */
    private static void m6327a(C4345bb bbVar) {
        C4300p.rce(bbVar.mo41977a(), bbVar.mo41978b(), bbVar.mo41979c(), bbVar.mo41980d());
        C4359bi.m6382a();
    }

    /* renamed from: c */
    public void mo41972c(String str) {
        m6327a((C4345bb) new C4346bc(str, new C4346bc.C4347a(C4346bc.C4348b.RECEIVE)));
    }

    /* renamed from: d */
    public void mo41973d(String str) {
        m6327a((C4345bb) new C4346bc(str, new C4346bc.C4347a(C4346bc.C4348b.DISMISS)));
    }

    /* renamed from: e */
    public void mo41974e(String str) {
        m6327a((C4345bb) new C4346bc(str, new C4346bc.C4347a(C4346bc.C4348b.OPEN)));
    }

    /* renamed from: a */
    public void mo41967a(String str, String str2) {
        m6327a((C4345bb) new C4346bc(str, new C4346bc.C4349c(str2)));
    }

    /* renamed from: f */
    public void mo41975f(String str) {
        m6327a((C4345bb) new C4346bc(str, new C4346bc.C4347a(C4346bc.C4348b.PROCESSED)));
    }

    /* renamed from: g */
    public void mo41976g(String str) {
        m6327a((C4345bb) new C4346bc(str, new C4346bc.C4347a(C4346bc.C4348b.SHOWN)));
    }

    /* renamed from: a */
    public void mo41968a(String str, String str2, String str3) {
        m6327a((C4345bb) new C4346bc(str, new C4346bc.C4351e(str2, str3)));
    }

    /* renamed from: b */
    public void mo41970b(String str, String str2) {
        m6327a((C4345bb) new C4346bc(str, new C4346bc.C4350d(str2)));
    }

    /* renamed from: b */
    public void mo41971b(String str, String str2, String str3) {
        m6327a((C4345bb) new C4346bc(str, new C4346bc.C4352f(str2, str3)));
    }
}
