package com.yandex.metrica.impl.p039ob;

import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.lj */
public class C3635lj {

    /* renamed from: a */
    private final String f3660a;

    /* renamed from: b */
    private final C3655lr f3661b;

    /* renamed from: c */
    private final C3655lr f3662c;

    /* renamed from: d */
    private final SparseArray<C3655lr> f3663d;

    /* renamed from: e */
    private final C3638lk f3664e;

    /* renamed from: com.yandex.metrica.impl.ob.lj$a */
    public static class C3637a {
        /* renamed from: a */
        public C3635lj mo40469a(String str, C3655lr lrVar, C3655lr lrVar2, SparseArray<C3655lr> sparseArray, C3638lk lkVar) {
            return new C3635lj(str, lrVar, lrVar2, sparseArray, lkVar);
        }
    }

    private C3635lj(String str, C3655lr lrVar, C3655lr lrVar2, SparseArray<C3655lr> sparseArray, C3638lk lkVar) {
        this.f3660a = str;
        this.f3661b = lrVar;
        this.f3662c = lrVar2;
        this.f3663d = sparseArray;
        this.f3664e = lkVar;
    }

    /* renamed from: a */
    public void mo40464a(SQLiteDatabase sQLiteDatabase) {
        try {
            if (this.f3664e != null && !this.f3664e.mo40470a(sQLiteDatabase)) {
                mo40468c(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo40467b(SQLiteDatabase sQLiteDatabase) {
        mo40466a(this.f3661b, sQLiteDatabase);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40466a(C3655lr lrVar, SQLiteDatabase sQLiteDatabase) {
        try {
            lrVar.mo40476a(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo40465a(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = 1
            if (r6 <= r5) goto L_0x0017
            r1 = 0
            int r5 = r5 + r0
        L_0x0005:
            if (r5 > r6) goto L_0x0018
            android.util.SparseArray<com.yandex.metrica.impl.ob.lr> r2 = r3.f3663d     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x0017 }
            com.yandex.metrica.impl.ob.lr r2 = (com.yandex.metrica.impl.p039ob.C3655lr) r2     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x0014
            r2.mo40476a(r4)     // Catch:{ all -> 0x0017 }
        L_0x0014:
            int r5 = r5 + 1
            goto L_0x0005
        L_0x0017:
            r1 = 1
        L_0x0018:
            com.yandex.metrica.impl.ob.lk r5 = r3.f3664e
            boolean r5 = r5.mo40470a(r4)
            r5 = r5 ^ r0
            r5 = r5 | r1
            if (r5 == 0) goto L_0x0025
            r3.mo40468c(r4)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3635lj.mo40465a(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo40468c(SQLiteDatabase sQLiteDatabase) {
        m3864b(this.f3662c, sQLiteDatabase);
        mo40466a(this.f3661b, sQLiteDatabase);
    }

    /* renamed from: b */
    private void m3864b(C3655lr lrVar, SQLiteDatabase sQLiteDatabase) {
        try {
            lrVar.mo40476a(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }
}
