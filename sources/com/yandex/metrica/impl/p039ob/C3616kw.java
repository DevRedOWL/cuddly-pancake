package com.yandex.metrica.impl.p039ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.kw */
public abstract class C3616kw {

    /* renamed from: a */
    private final C3627lc f3582a;

    /* renamed from: b */
    private final C3690ly f3583b;

    /* renamed from: c */
    private final AtomicLong f3584c;

    /* renamed from: d */
    private final AtomicLong f3585d;

    /* renamed from: e */
    private final AtomicLong f3586e;

    /* renamed from: f */
    private final ContentValues f3587f = new ContentValues();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract long mo40389c(long j);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C3690ly mo40392d(long j);

    /* renamed from: e */
    public abstract String mo40393e();

    C3616kw(C3627lc lcVar, C3690ly lyVar) {
        this.f3582a = lcVar;
        this.f3583b = lyVar;
        this.f3584c = new AtomicLong(m3742f());
        this.f3585d = new AtomicLong(mo40381a(Long.MAX_VALUE));
        this.f3586e = new AtomicLong(mo40389c(-1));
    }

    /* renamed from: a */
    public long mo40380a() {
        return this.f3584c.get();
    }

    /* renamed from: b */
    public long mo40385b() {
        return this.f3585d.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C3690ly mo40390c() {
        return this.f3583b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C3627lc mo40391d() {
        return this.f3582a;
    }

    /* renamed from: f */
    private long m3742f() {
        try {
            SQLiteDatabase readableDatabase = mo40391d().getReadableDatabase();
            if (readableDatabase != null) {
                return C4199vl.m5869a(readableDatabase, mo40393e());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40383a(long j, String str) {
        this.f3584c.incrementAndGet();
        this.f3586e.incrementAndGet();
        mo40392d(this.f3586e.get()).mo40567q();
        if (this.f3585d.get() > j) {
            this.f3585d.set(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40382a(int i) {
        this.f3584c.getAndAdd((long) (-i));
        this.f3585d.set(mo40381a(Long.MAX_VALUE));
    }

    /* renamed from: a */
    public long mo40381a(long j) {
        String format = String.format(Locale.US, "Select min(%s) from %s", new Object[]{"timestamp", mo40393e()});
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = mo40391d().getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(format, (String[]) null);
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    if (j2 != 0) {
                        j = j2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        C3306cx.m2852a(cursor);
        return j;
    }

    /* renamed from: b */
    public synchronized void mo40387b(long j, String str) {
        try {
            SQLiteDatabase writableDatabase = mo40391d().getWritableDatabase();
            if (writableDatabase != null) {
                if (writableDatabase.insert(mo40393e(), (String) null, m3741c(j, str)) != -1) {
                    mo40383a(j, str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private ContentValues m3741c(long j, String str) {
        this.f3587f.clear();
        this.f3587f.put("incremental_id", Long.valueOf(this.f3586e.get() + 1));
        this.f3587f.put("timestamp", Long.valueOf(j));
        this.f3587f.put("data", str);
        return this.f3587f;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|(2:7|(2:10|8))|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x004f */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.Map<java.lang.Long, java.lang.String> mo40386b(int r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0054 }
            r0.<init>()     // Catch:{ all -> 0x0054 }
            r1 = 0
            com.yandex.metrica.impl.ob.lc r2 = r12.mo40391d()     // Catch:{ all -> 0x004f }
            android.database.sqlite.SQLiteDatabase r3 = r2.getReadableDatabase()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x004f
            java.lang.String r4 = r12.mo40393e()     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "incremental_id"
            java.lang.String r5 = "data"
            java.lang.String[] r5 = new java.lang.String[]{r2, r5}     // Catch:{ all -> 0x004f }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "incremental_id ASC"
            java.lang.String r11 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x004f }
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x004f }
        L_0x002b:
            boolean r13 = r1.moveToNext()     // Catch:{ all -> 0x004f }
            if (r13 == 0) goto L_0x004f
            android.content.ContentValues r13 = r12.f3587f     // Catch:{ all -> 0x004f }
            r13.clear()     // Catch:{ all -> 0x004f }
            android.content.ContentValues r13 = r12.f3587f     // Catch:{ all -> 0x004f }
            com.yandex.metrica.impl.p039ob.C4199vl.m5870a((android.database.Cursor) r1, (android.content.ContentValues) r13)     // Catch:{ all -> 0x004f }
            android.content.ContentValues r13 = r12.f3587f     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "incremental_id"
            java.lang.Long r13 = r13.getAsLong(r2)     // Catch:{ all -> 0x004f }
            android.content.ContentValues r2 = r12.f3587f     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "data"
            java.lang.String r2 = r2.getAsString(r3)     // Catch:{ all -> 0x004f }
            com.yandex.metrica.impl.p039ob.C4197vj.m5865a(r0, r13, r2)     // Catch:{ all -> 0x004f }
            goto L_0x002b
        L_0x004f:
            com.yandex.metrica.impl.p039ob.C3306cx.m2852a((android.database.Cursor) r1)     // Catch:{ all -> 0x0054 }
            monitor-exit(r12)
            return r0
        L_0x0054:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3616kw.mo40386b(int):java.util.Map");
    }

    /* renamed from: b */
    public synchronized int mo40384b(long j) {
        int i;
        i = 0;
        String format = String.format(Locale.US, "%s <= ?", new Object[]{"incremental_id"});
        try {
            SQLiteDatabase writableDatabase = mo40391d().getWritableDatabase();
            if (writableDatabase != null && (i = writableDatabase.delete(mo40393e(), format, new String[]{String.valueOf(j)})) > 0) {
                mo40382a(i);
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    /* renamed from: c */
    public synchronized int mo40388c(int i) {
        int i2;
        i2 = 0;
        if (i < 1) {
            return 0;
        }
        String format = String.format(Locale.US, "%1$s <= (select max(%1$s) from (select %1$s from %2$s order by %1$s limit ?))", new Object[]{"incremental_id", mo40393e()});
        try {
            SQLiteDatabase writableDatabase = mo40391d().getWritableDatabase();
            if (writableDatabase != null && (i2 = writableDatabase.delete(mo40393e(), format, new String[]{String.valueOf(i)})) > 0) {
                mo40382a(i2);
            }
        } catch (Throwable unused) {
        }
        return i2;
    }
}
