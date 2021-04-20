package com.yandex.metrica.impl.p039ob;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.lp */
public class C3643lp implements C3640lm {

    /* renamed from: a */
    private final C3627lc f3678a;

    /* renamed from: a */
    public void mo40473a(SQLiteDatabase sQLiteDatabase) {
    }

    public C3643lp(C3627lc lcVar) {
        this.f3678a = lcVar;
    }

    /* renamed from: a */
    public SQLiteDatabase mo40472a() {
        try {
            return this.f3678a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
