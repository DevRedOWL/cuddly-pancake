package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.C2289ca;
import com.google.android.play.core.internal.C2291cc;
import com.google.android.play.core.internal.C2293ce;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.bl */
public final class C2157bl implements C2293ce<C2156bk> {

    /* renamed from: a */
    private final C2293ce f1652a;

    /* renamed from: b */
    private final C2293ce f1653b;

    /* renamed from: c */
    private final C2293ce f1654c;

    /* renamed from: d */
    private final C2293ce f1655d;

    /* renamed from: e */
    private final C2293ce f1656e;

    /* renamed from: f */
    private final C2293ce f1657f;

    /* renamed from: g */
    private final C2293ce f1658g;

    /* renamed from: h */
    private final C2293ce f1659h;

    /* renamed from: i */
    private final /* synthetic */ int f1660i = 0;

    public C2157bl(C2293ce<C2171bz> ceVar, C2293ce<C2220s> ceVar2, C2293ce<C2154bi> ceVar3, C2293ce<C2203dd> ceVar4, C2293ce<C2187co> ceVar5, C2293ce<C2192ct> ceVar6, C2293ce<C2196cx> ceVar7, C2293ce<C2175cc> ceVar8) {
        this.f1652a = ceVar;
        this.f1653b = ceVar2;
        this.f1654c = ceVar3;
        this.f1655d = ceVar4;
        this.f1656e = ceVar5;
        this.f1657f = ceVar6;
        this.f1658g = ceVar7;
        this.f1659h = ceVar8;
    }

    public C2157bl(C2293ce<Context> ceVar, C2293ce<C2171bz> ceVar2, C2293ce<C2156bk> ceVar3, C2293ce<C2220s> ceVar4, C2293ce<C2159bn> ceVar5, C2293ce<C2149bd> ceVar6, C2293ce<Executor> ceVar7, C2293ce<Executor> ceVar8, byte[] bArr) {
        this.f1652a = ceVar;
        this.f1658g = ceVar2;
        this.f1659h = ceVar3;
        this.f1653b = ceVar4;
        this.f1656e = ceVar5;
        this.f1657f = ceVar6;
        this.f1654c = ceVar7;
        this.f1655d = ceVar8;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33525a() {
        if (this.f1660i != 0) {
            Context b = ((C2216o) this.f1652a).mo33525a();
            Object a = this.f1658g.mo33525a();
            Object a2 = this.f1659h.mo33525a();
            C2289ca c = C2291cc.m1280c(this.f1653b);
            Object a3 = this.f1656e.mo33525a();
            Object a4 = this.f1657f.mo33525a();
            return new C2135aq(b, (C2171bz) a, (C2156bk) a2, c, (C2159bn) a3, (C2149bd) a4, C2291cc.m1280c(this.f1654c), C2291cc.m1280c(this.f1655d));
        }
        Object a5 = this.f1652a.mo33525a();
        return new C2156bk((C2171bz) a5, C2291cc.m1280c(this.f1653b), (C2154bi) this.f1654c.mo33525a(), (C2203dd) this.f1655d.mo33525a(), (C2187co) this.f1656e.mo33525a(), (C2192ct) this.f1657f.mo33525a(), (C2196cx) this.f1658g.mo33525a(), (C2175cc) this.f1659h.mo33525a());
    }
}
