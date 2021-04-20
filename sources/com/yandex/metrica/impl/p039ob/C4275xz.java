package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.xz */
public class C4275xz extends C4266xq<String> {
    /* renamed from: a */
    public /* bridge */ /* synthetic */ int mo41838a() {
        return super.mo41838a();
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ String mo41839b() {
        return super.mo41839b();
    }

    public C4275xz(int i, String str) {
        this(i, str, C4216vz.m5935h());
    }

    public C4275xz(int i, String str, C4216vz vzVar) {
        super(i, str, vzVar);
    }

    /* renamed from: a */
    public String mo41840a(String str) {
        if (str == null || str.length() <= mo41838a()) {
            return str;
        }
        String substring = str.substring(0, mo41838a());
        if (this.f5323a.mo41688c()) {
            this.f5323a.mo41685b("\"%s\" %s size exceeded limit of %d characters", mo41839b(), str, Integer.valueOf(mo41838a()));
        }
        return substring;
    }
}
