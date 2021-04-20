package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3125af;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.r */
public class C3869r extends C4217w {

    /* renamed from: f */
    private HashMap<C3870a, Integer> f4204f;

    /* renamed from: g */
    private C4280yb<String> f4205g;

    /* renamed from: h */
    private C4280yb<String> f4206h;

    /* renamed from: i */
    private C4280yb<byte[]> f4207i;

    /* renamed from: j */
    private C4280yb<String> f4208j;

    /* renamed from: k */
    private C4280yb<String> f4209k;

    /* renamed from: com.yandex.metrica.impl.ob.r$a */
    public enum C3870a {
        NAME,
        VALUE,
        USER_INFO
    }

    public C3869r(C4216vz vzVar) {
        this.f4204f = new HashMap<>();
        m4674b(vzVar);
    }

    public C3869r(String str, int i, C4216vz vzVar) {
        this("", str, i, vzVar);
    }

    public C3869r(String str, String str2, int i, C4216vz vzVar) {
        this(str, str2, i, 0, vzVar);
    }

    public C3869r(String str, String str2, int i, int i2, C4216vz vzVar) {
        this.f4204f = new HashMap<>();
        m4674b(vzVar);
        this.f5256b = m4678g(str);
        this.f5255a = m4677f(str2);
        this.f5257c = i;
        this.f5258d = i2;
    }

    public C3869r(byte[] bArr, String str, int i, C4216vz vzVar) {
        this.f4204f = new HashMap<>();
        m4674b(vzVar);
        mo40967a(bArr);
        this.f5255a = m4677f(str);
        this.f5257c = i;
    }

    /* renamed from: a */
    public C3869r mo40965a(HashMap<C3870a, Integer> hashMap) {
        this.f4204f = hashMap;
        return this;
    }

    /* renamed from: a */
    public HashMap<C3870a, Integer> mo40968a() {
        return this.f4204f;
    }

    /* renamed from: b */
    private void m4674b(C4216vz vzVar) {
        this.f4205g = new C4275xz(1000, "event name", vzVar);
        this.f4206h = new C4274xy(245760, "event value", vzVar);
        this.f4207i = new C4267xr(245760, "event value bytes", vzVar);
        this.f4208j = new C4275xz(200, "user profile id", vzVar);
        this.f4209k = new C4275xz(10000, "UserInfo", vzVar);
    }

    /* renamed from: a */
    private void m4671a(String str, String str2, C3870a aVar) {
        if (C4270xu.m6146a(str, str2)) {
            this.f4204f.put(aVar, Integer.valueOf(C3303cu.m2829c(str).length - C3303cu.m2829c(str2).length));
        } else {
            this.f4204f.remove(aVar);
        }
        m4679u();
    }

    /* renamed from: a */
    private void m4672a(byte[] bArr, byte[] bArr2, C3870a aVar) {
        if (bArr.length != bArr2.length) {
            this.f4204f.put(aVar, Integer.valueOf(bArr.length - bArr2.length));
        } else {
            this.f4204f.remove(aVar);
        }
        m4679u();
    }

    /* renamed from: u */
    private void m4679u() {
        this.f5259e = 0;
        for (Integer intValue : this.f4204f.values()) {
            this.f5259e += intValue.intValue();
        }
    }

    /* renamed from: f */
    private String m4677f(String str) {
        String a = this.f4205g.mo41840a(str);
        m4671a(str, a, C3870a.NAME);
        return a;
    }

    /* renamed from: g */
    private String m4678g(String str) {
        String a = this.f4206h.mo41840a(str);
        m4671a(str, a, C3870a.VALUE);
        return a;
    }

    /* renamed from: b */
    private byte[] m4675b(byte[] bArr) {
        byte[] a = this.f4207i.mo41840a(bArr);
        m4672a(bArr, a, C3870a.VALUE);
        return a;
    }

    /* renamed from: a */
    public C4217w mo40966a(String str) {
        String a = this.f4209k.mo41840a(str);
        m4671a(str, a, C3870a.USER_INFO);
        return super.mo40966a(a);
    }

    /* renamed from: b */
    public C4217w mo40969b(String str) {
        return super.mo40969b(m4677f(str));
    }

    /* renamed from: c */
    public C4217w mo40970c(String str) {
        return super.mo40970c(m4678g(str));
    }

    /* renamed from: a */
    public final C4217w mo40967a(byte[] bArr) {
        return super.mo40967a(m4675b(bArr));
    }

    /* renamed from: d */
    public C4217w mo40971d(String str) {
        return super.mo40971d(this.f4208j.mo41840a(str));
    }

    /* renamed from: a */
    public static C4217w m4670a(String str, String str2) {
        return new C4217w().mo41723a(C3125af.C3126a.EVENT_TYPE_APP_ENVIRONMENT_UPDATED.mo39462a()).mo41729b(str, str2);
    }

    /* renamed from: b */
    public static C4217w m4673b() {
        return new C4217w().mo41723a(C3125af.C3126a.EVENT_TYPE_APP_ENVIRONMENT_CLEARED.mo39462a());
    }

    /* renamed from: c */
    public static C4217w m4676c() {
        return new C4217w().mo41723a(C3125af.C3126a.EVENT_TYPE_SEND_USER_PROFILE.mo39462a());
    }

    /* renamed from: a */
    static C4217w m4669a(String str, C4216vz vzVar) {
        return new C3869r(vzVar).mo41723a(C3125af.C3126a.EVENT_TYPE_SET_USER_PROFILE_ID.mo39462a()).mo40971d(str);
    }

    /* renamed from: a */
    static C4217w m4668a(C4216vz vzVar) {
        return new C3869r(vzVar).mo41723a(C3125af.C3126a.EVENT_TYPE_SEND_REVENUE_EVENT.mo39462a());
    }
}
