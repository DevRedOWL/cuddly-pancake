package com.yandex.metrica.impl.p039ob;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3125af;
import com.yandex.metrica.impl.p039ob.C3512i;
import com.yandex.metrica.impl.p039ob.C3618ky;
import com.yandex.metrica.impl.p039ob.C3644lq;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;

/* renamed from: com.yandex.metrica.impl.ob.kz */
public class C3621kz implements Closeable {

    /* renamed from: a */
    private final ReentrantReadWriteLock f3599a;

    /* renamed from: b */
    private final Lock f3600b;

    /* renamed from: c */
    private final Lock f3601c;

    /* renamed from: d */
    private final C3627lc f3602d;

    /* renamed from: e */
    private final C3622a f3603e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Object f3604f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final List<ContentValues> f3605g;

    /* renamed from: h */
    private final Context f3606h;

    /* renamed from: i */
    private final C3391en f3607i;

    /* renamed from: j */
    private final AtomicLong f3608j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final List<C3759nw> f3609k;

    /* renamed from: l */
    private final C3618ky f3610l;

    public C3621kz(C3391en enVar, C3627lc lcVar) {
        this(enVar, lcVar, new C3618ky(enVar.mo40027k(), enVar.mo39970a()));
    }

    public C3621kz(C3391en enVar, C3627lc lcVar, C3618ky kyVar) {
        this.f3599a = new ReentrantReadWriteLock();
        this.f3600b = this.f3599a.readLock();
        this.f3601c = this.f3599a.writeLock();
        this.f3604f = new Object();
        this.f3605g = new ArrayList(3);
        this.f3608j = new AtomicLong();
        this.f3609k = new ArrayList();
        this.f3602d = lcVar;
        this.f3606h = enVar.mo40027k();
        this.f3607i = enVar;
        this.f3610l = kyVar;
        this.f3608j.set(m3780e());
        this.f3603e = new C3622a(enVar);
        this.f3603e.setName(m3767a((C3402et) enVar));
    }

    /* renamed from: a */
    public void mo40401a() {
        this.f3603e.start();
    }

    /* renamed from: b */
    public long mo40408b() {
        this.f3600b.lock();
        try {
            return this.f3608j.get();
        } finally {
            this.f3600b.unlock();
        }
    }

    /* renamed from: a */
    public long mo40398a(Set<Integer> set) {
        this.f3600b.lock();
        Cursor cursor = null;
        long j = 0;
        try {
            SQLiteDatabase readableDatabase = this.f3602d.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM reports");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                int i = 0;
                for (Integer next : set) {
                    if (i > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + next);
                    i++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), (String[]) null);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        C3306cx.m2852a(cursor);
        this.f3600b.unlock();
        return j;
    }

    /* renamed from: a */
    public void mo40405a(C3759nw nwVar) {
        this.f3609k.add(nwVar);
    }

    /* renamed from: a */
    private static String m3767a(C3402et etVar) {
        return "DatabaseWorker [" + etVar.mo39985b().mo39995c() + "]";
    }

    /* renamed from: a */
    public void mo40403a(long j, C3557jh jhVar, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(j));
        contentValues.put("start_time", Long.valueOf(j2));
        contentValues.put("server_time_offset", Long.valueOf(C4229wi.m6030c()));
        contentValues.put("obtained_before_first_sync", Boolean.valueOf(C4222wd.m6001a().mo41762d()));
        contentValues.put("type", Integer.valueOf(jhVar.mo40305a()));
        new C4276y(this.f3606h).mo41854a(this.f3607i.mo40025i()).mo41853a(contentValues).mo41855a();
        mo40404a(contentValues);
    }

    /* renamed from: a */
    public void mo40406a(C4244ww wwVar, int i, C3554je jeVar, C3512i.C3513a aVar, C3400er erVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CardFragment.ARG_NUMBER, Long.valueOf(jeVar.mo40287c()));
        contentValues.put("global_number", Integer.valueOf(C3125af.m1962e(i) ? erVar.mo40068a() : 0));
        contentValues.put("number_of_type", Integer.valueOf(erVar.mo40069a(i)));
        contentValues.put("time", Long.valueOf(jeVar.mo40289d()));
        contentValues.put("session_id", Long.valueOf(jeVar.mo40282a()));
        contentValues.put("session_type", Integer.valueOf(jeVar.mo40286b().mo40305a()));
        new C4276y(this.f3606h).mo41854a(this.f3607i.mo40025i()).mo41853a(contentValues).mo41857a(wwVar, aVar);
        mo40410b(contentValues);
    }

    /* renamed from: e */
    private long m3780e() {
        this.f3600b.lock();
        long j = 0;
        try {
            SQLiteDatabase readableDatabase = this.f3602d.getReadableDatabase();
            if (readableDatabase != null) {
                j = C4199vl.m5869a(readableDatabase, "reports");
            }
        } catch (Throwable unused) {
        }
        this.f3600b.unlock();
        return j;
    }

    /* renamed from: a */
    public void mo40404a(ContentValues contentValues) {
        m3777c(contentValues);
    }

    /* renamed from: b */
    public void mo40410b(ContentValues contentValues) {
        synchronized (this.f3604f) {
            this.f3605g.add(contentValues);
        }
        synchronized (this.f3603e) {
            this.f3603e.notifyAll();
        }
    }

    /* renamed from: a */
    public int mo40397a(long j) {
        this.f3601c.lock();
        int i = 0;
        try {
            if (C3644lq.f3679a.booleanValue()) {
                m3783f();
            }
            SQLiteDatabase writableDatabase = this.f3602d.getWritableDatabase();
            if (writableDatabase != null) {
                i = writableDatabase.delete("sessions", C3644lq.C3653g.f3698d, new String[]{String.valueOf(j)});
            }
        } catch (Throwable unused) {
        }
        this.f3601c.unlock();
        return i;
    }

    /* renamed from: f */
    private void m3783f() {
        Cursor cursor;
        Cursor cursor2;
        this.f3600b.lock();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase readableDatabase = this.f3602d.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursor.moveToNext()) {
                        stringBuffer.append(cursor.getString(0));
                        stringBuffer.append(", ");
                    }
                    Cursor rawQuery = readableDatabase.rawQuery(" SELECT DISTINCT session_id From reports order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (rawQuery.moveToNext()) {
                        stringBuffer2.append(rawQuery.getString(0));
                        stringBuffer2.append(", ");
                    }
                    cursor2 = rawQuery;
                    cursor3 = cursor;
                } catch (Throwable unused) {
                    this.f3600b.unlock();
                    C3306cx.m2852a(cursor);
                    C3306cx.m2852a((Cursor) null);
                }
            } else {
                cursor2 = null;
            }
            this.f3600b.unlock();
            C3306cx.m2852a(cursor3);
            C3306cx.m2852a(cursor2);
        } catch (Throwable unused2) {
            cursor = null;
            this.f3600b.unlock();
            C3306cx.m2852a(cursor);
            C3306cx.m2852a((Cursor) null);
        }
    }

    /* renamed from: c */
    public void mo40411c() {
        SQLiteDatabase writableDatabase;
        try {
            this.f3601c.lock();
            if (this.f3608j.get() > this.f3607i.mo40025i().mo41349W() && (writableDatabase = this.f3602d.getWritableDatabase()) != null) {
                this.f3608j.addAndGet((long) (-m3765a(writableDatabase)));
            }
        } catch (Throwable unused) {
        }
        this.f3601c.unlock();
    }

    /* renamed from: a */
    private int m3765a(SQLiteDatabase sQLiteDatabase) {
        try {
            Integer[] numArr = new Integer[C3125af.f2495a.size()];
            Iterator it = C3125af.f2495a.iterator();
            int i = 0;
            while (it.hasNext()) {
                numArr[i] = Integer.valueOf(((C3125af.C3126a) it.next()).mo39462a());
                i++;
            }
            return this.f3610l.mo40396a(sQLiteDatabase, "reports", String.format("%1$s NOT IN (%2$s) AND (%3$s IN (SELECT %3$s FROM %4$s ORDER BY %5$s, %6$s LIMIT (SELECT count() FROM %4$s) / %7$s ))", new Object[]{"type", TextUtils.join(",", numArr), "id", "reports", "session_id", CardFragment.ARG_NUMBER, 10}), C3618ky.C3620b.DB_OVERFLOW, this.f3607i.mo39985b().mo39993a(), true).f3594b;
        } catch (Throwable th) {
            C4085tl.m5459a(this.f3606h).reportError("deleteExcessiveReports exception", th);
            return 0;
        }
    }

    /* renamed from: a */
    public void mo40402a(long j, int i, int i2, boolean z) throws SQLiteException {
        if (i2 > 0) {
            this.f3601c.lock();
            try {
                String format = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", new Object[]{"session_id", Long.toString(j), "session_type", Integer.toString(i), "id", "reports", Integer.toString(i2 - 1)});
                SQLiteDatabase writableDatabase = this.f3602d.getWritableDatabase();
                if (writableDatabase != null) {
                    C3618ky.C3619a a = this.f3610l.mo40396a(writableDatabase, "reports", format, C3618ky.C3620b.BAD_REQUEST, this.f3607i.mo39985b().mo39993a(), z);
                    if (a.f3593a != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ContentValues g : a.f3593a) {
                            arrayList.add(Integer.valueOf(m3784g(g)));
                        }
                        for (C3759nw b : this.f3609k) {
                            b.mo40728b(arrayList);
                        }
                    }
                    if (this.f3607i.mo40028l().mo41688c() && a.f3593a != null) {
                        m3770a(a.f3593a, "Event removed from db");
                    }
                    this.f3608j.addAndGet((long) (-a.f3594b));
                }
            } catch (Throwable unused) {
            }
            this.f3601c.unlock();
        }
    }

    /* renamed from: a */
    public Cursor mo40400a(Map<String, String> map) {
        this.f3600b.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f3602d.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.query("sessions", (String[]) null, m3768a("id >= ?", map), m3772a(new String[]{Long.toString(0)}, map), (String) null, (String) null, "id ASC", (String) null);
            }
        } catch (Throwable unused) {
        }
        this.f3600b.unlock();
        return cursor;
    }

    /* renamed from: a */
    public Cursor mo40399a(long j, C3557jh jhVar) throws SQLiteException {
        this.f3600b.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f3602d.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.query("reports", (String[]) null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j), Integer.toString(jhVar.mo40305a())}, (String) null, (String) null, "number ASC", (String) null);
            }
        } catch (Throwable unused) {
        }
        this.f3600b.unlock();
        return cursor;
    }

    /* renamed from: c */
    private void m3777c(ContentValues contentValues) {
        if (contentValues != null) {
            this.f3601c.lock();
            try {
                SQLiteDatabase writableDatabase = this.f3602d.getWritableDatabase();
                if (writableDatabase != null) {
                    writableDatabase.insertOrThrow("sessions", (String) null, contentValues);
                }
            } catch (Throwable unused) {
            }
            this.f3601c.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40407a(List<ContentValues> list) {
        SQLiteDatabase sQLiteDatabase;
        if (list != null && !list.isEmpty()) {
            this.f3601c.lock();
            try {
                sQLiteDatabase = this.f3602d.getWritableDatabase();
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.beginTransaction();
                        for (ContentValues next : list) {
                            sQLiteDatabase.insertOrThrow("reports", (String) null, next);
                            this.f3608j.incrementAndGet();
                            m3769a(next, "Event saved to db");
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        this.f3608j.get();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
                sQLiteDatabase = null;
            }
            C3306cx.m2853a(sQLiteDatabase);
            this.f3601c.unlock();
        }
    }

    /* renamed from: a */
    private void m3769a(ContentValues contentValues, String str) {
        if (C3125af.m1954b(m3778d(contentValues))) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(": ");
            sb.append(m3781e(contentValues));
            String f = m3782f(contentValues);
            if (C3125af.m1958c(m3784g(contentValues)) && !TextUtils.isEmpty(f)) {
                sb.append(" with value ");
                sb.append(f);
            }
            this.f3607i.mo40028l().mo41680a(sb.toString());
        }
    }

    /* renamed from: a */
    private void m3770a(List<ContentValues> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            m3769a(list.get(i), str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        com.yandex.metrica.impl.p039ob.C3306cx.m2852a((android.database.Cursor) null);
        r4.f3600b.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0034 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<android.content.ContentValues> mo40413d() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.Lock r1 = r4.f3600b
            r1.lock()
            r1 = 0
            com.yandex.metrica.impl.ob.lc r2 = r4.f3602d     // Catch:{ all -> 0x0034 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x002b
            java.lang.String r3 = com.yandex.metrica.impl.p039ob.C3644lq.C3653g.f3697c     // Catch:{ all -> 0x0034 }
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch:{ all -> 0x0034 }
        L_0x0019:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x002b
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            android.database.DatabaseUtils.cursorRowToContentValues(r1, r2)     // Catch:{ all -> 0x0034 }
            r0.add(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0019
        L_0x002b:
            com.yandex.metrica.impl.p039ob.C3306cx.m2852a((android.database.Cursor) r1)
            java.util.concurrent.locks.Lock r1 = r4.f3600b
            r1.unlock()
            goto L_0x003a
        L_0x0034:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            goto L_0x002b
        L_0x003a:
            return r0
        L_0x003b:
            r0 = move-exception
            com.yandex.metrica.impl.p039ob.C3306cx.m2852a((android.database.Cursor) r1)
            java.util.concurrent.locks.Lock r1 = r4.f3600b
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3621kz.mo40413d():java.util.List");
    }

    /* renamed from: b */
    public ContentValues mo40409b(long j, C3557jh jhVar) {
        ContentValues contentValues = new ContentValues();
        this.f3600b.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f3602d.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(String.format(Locale.US, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", new Object[]{Long.valueOf(j), Integer.valueOf(jhVar.mo40305a())}), (String[]) null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        C3306cx.m2852a(cursor);
        this.f3600b.unlock();
        return contentValues;
    }

    /* renamed from: a */
    private static String m3768a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        for (String next : map.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(next + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String[] m3772a(String[] strArr, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        for (Map.Entry<String, String> value : map.entrySet()) {
            arrayList.add(value.getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: d */
    private static int m3778d(ContentValues contentValues) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            return asInteger.intValue();
        }
        return -1;
    }

    /* renamed from: e */
    private String m3781e(ContentValues contentValues) {
        return m3774b(contentValues, "name");
    }

    /* renamed from: f */
    private String m3782f(ContentValues contentValues) {
        return m3774b(contentValues, "value");
    }

    /* renamed from: b */
    private String m3774b(ContentValues contentValues, String str) {
        return C3303cu.m2825b(contentValues.getAsString(str), "");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public int m3784g(ContentValues contentValues) {
        return m3775c(contentValues, "type");
    }

    /* renamed from: c */
    private int m3775c(ContentValues contentValues, String str) {
        return contentValues.getAsInteger(str).intValue();
    }

    /* renamed from: com.yandex.metrica.impl.ob.kz$a */
    private class C3622a extends C4261xl {

        /* renamed from: b */
        private C3391en f3612b;

        C3622a(C3391en enVar) {
            this.f3612b = enVar;
        }

        public void run() {
            ArrayList arrayList;
            while (mo41813c()) {
                try {
                    synchronized (this) {
                        if (C3621kz.this.m3785g()) {
                            wait();
                        }
                    }
                } catch (Throwable unused) {
                    mo41814b();
                }
                synchronized (C3621kz.this.f3604f) {
                    arrayList = new ArrayList(C3621kz.this.f3605g);
                    C3621kz.this.f3605g.clear();
                }
                C3621kz.this.mo40407a((List<ContentValues>) arrayList);
                mo40415a(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo40414a() {
            mo41814b();
            this.f3612b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo40415a(List<ContentValues> list) {
            ArrayList arrayList = new ArrayList();
            for (ContentValues a : list) {
                arrayList.add(Integer.valueOf(C3621kz.this.m3784g(a)));
            }
            for (C3759nw a2 : C3621kz.this.f3609k) {
                a2.mo40726a(arrayList);
            }
            if (this.f3612b != null) {
                this.f3612b.mo40015C().mo40729a();
            }
        }
    }

    public void close() {
        this.f3605g.clear();
        this.f3603e.mo40414a();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m3785g() {
        boolean isEmpty;
        synchronized (this.f3604f) {
            isEmpty = this.f3605g.isEmpty();
        }
        return isEmpty;
    }
}
