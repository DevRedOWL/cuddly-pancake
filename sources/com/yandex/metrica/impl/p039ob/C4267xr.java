package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.xr */
public class C4267xr extends C4266xq<byte[]> {
    /* renamed from: a */
    public /* bridge */ /* synthetic */ int mo41838a() {
        return super.mo41838a();
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ String mo41839b() {
        return super.mo41839b();
    }

    public C4267xr(int i, String str, C4216vz vzVar) {
        super(i, str, vzVar);
    }

    /* renamed from: a */
    public byte[] mo41840a(byte[] bArr) {
        if (bArr.length <= mo41838a()) {
            return bArr;
        }
        byte[] bArr2 = new byte[mo41838a()];
        System.arraycopy(bArr, 0, bArr2, 0, mo41838a());
        if (this.f5323a.mo41688c()) {
            this.f5323a.mo41685b("\"%s\" %s exceeded limit of %d bytes", mo41839b(), bArr, Integer.valueOf(mo41838a()));
        }
        return bArr2;
    }
}
