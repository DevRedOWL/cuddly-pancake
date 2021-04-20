package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.impl.ob.lo */
public class C3642lo implements C3640lm {

    /* renamed from: a */
    private final Context f3673a;

    /* renamed from: b */
    private final String f3674b;

    /* renamed from: c */
    private final C3625la f3675c;

    /* renamed from: d */
    private final C3641ln f3676d;

    /* renamed from: e */
    private C3627lc f3677e;

    public C3642lo(Context context, String str) {
        this(context, str, new C3641ln(context, str), C3644lq.m3882a());
    }

    public C3642lo(Context context, String str, C3641ln lnVar, C3625la laVar) {
        this.f3673a = context;
        this.f3674b = str;
        this.f3676d = lnVar;
        this.f3675c = laVar;
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase mo40472a() {
        try {
            this.f3676d.mo40474a();
            this.f3677e = new C3627lc(this.f3673a, this.f3674b, this.f3675c.mo40421c());
        } catch (Throwable unused) {
            return null;
        }
        return this.f3677e.getWritableDatabase();
    }

    /* renamed from: a */
    public synchronized void mo40473a(SQLiteDatabase sQLiteDatabase) {
        C3306cx.m2868b(sQLiteDatabase);
        C3306cx.m2855a((Closeable) this.f3677e);
        this.f3676d.mo40475b();
        this.f3677e = null;
    }
}
