package com.yandex.metrica.impl.p039ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.lf */
public class C3630lf {

    /* renamed from: a */
    public static final String f3650a = C3630lf.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<String, Object> f3651b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<String, Object> f3652c;

    /* renamed from: d */
    private final String f3653d;

    /* renamed from: e */
    private final C3631a f3654e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile boolean f3655f;

    /* renamed from: g */
    private final C3640lm f3656g;

    public C3630lf(C3627lc lcVar, String str) {
        this(str, (C3640lm) new C3643lp(lcVar));
    }

    protected C3630lf(String str, C3640lm lmVar) {
        this.f3651b = new HashMap();
        this.f3652c = new HashMap();
        this.f3656g = lmVar;
        this.f3653d = str;
        this.f3654e = new C3631a(String.format(Locale.US, "YMM-DW-%s", new Object[]{Integer.valueOf(C4262xm.m6114b())}));
        this.f3654e.start();
    }

    /* renamed from: com.yandex.metrica.impl.ob.lf$a */
    private class C3631a extends C4261xl {
        public C3631a(String str) {
            super(str);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|(2:11|12)|13|14|15) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x001c A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                com.yandex.metrica.impl.ob.lf r0 = com.yandex.metrica.impl.p039ob.C3630lf.this
                java.util.Map r0 = r0.f3651b
                monitor-enter(r0)
                com.yandex.metrica.impl.ob.lf r1 = com.yandex.metrica.impl.p039ob.C3630lf.this     // Catch:{ all -> 0x005a }
                r1.m3841c()     // Catch:{ all -> 0x005a }
                com.yandex.metrica.impl.ob.lf r1 = com.yandex.metrica.impl.p039ob.C3630lf.this     // Catch:{ all -> 0x005a }
                r2 = 1
                boolean unused = r1.f3655f = r2     // Catch:{ all -> 0x005a }
                com.yandex.metrica.impl.ob.lf r1 = com.yandex.metrica.impl.p039ob.C3630lf.this     // Catch:{ all -> 0x005a }
                java.util.Map r1 = r1.f3651b     // Catch:{ all -> 0x005a }
                r1.notifyAll()     // Catch:{ all -> 0x005a }
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
            L_0x001c:
                boolean r0 = r3.mo41813c()
                if (r0 == 0) goto L_0x0059
                monitor-enter(r3)
                com.yandex.metrica.impl.ob.lf r0 = com.yandex.metrica.impl.p039ob.C3630lf.this     // Catch:{ all -> 0x0056 }
                java.util.Map r0 = r0.f3652c     // Catch:{ all -> 0x0056 }
                int r0 = r0.size()     // Catch:{ all -> 0x0056 }
                if (r0 != 0) goto L_0x0032
                r3.wait()     // Catch:{ InterruptedException -> 0x0032 }
            L_0x0032:
                java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0056 }
                com.yandex.metrica.impl.ob.lf r1 = com.yandex.metrica.impl.p039ob.C3630lf.this     // Catch:{ all -> 0x0056 }
                java.util.Map r1 = r1.f3652c     // Catch:{ all -> 0x0056 }
                r0.<init>(r1)     // Catch:{ all -> 0x0056 }
                com.yandex.metrica.impl.ob.lf r1 = com.yandex.metrica.impl.p039ob.C3630lf.this     // Catch:{ all -> 0x0056 }
                java.util.Map r1 = r1.f3652c     // Catch:{ all -> 0x0056 }
                r1.clear()     // Catch:{ all -> 0x0056 }
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                int r1 = r0.size()
                if (r1 <= 0) goto L_0x001c
                com.yandex.metrica.impl.ob.lf r1 = com.yandex.metrica.impl.p039ob.C3630lf.this
                r1.m3835a((java.util.Map<java.lang.String, java.lang.Object>) r0)
                r0.clear()
                goto L_0x001c
            L_0x0056:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                throw r0
            L_0x0059:
                return
            L_0x005a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3630lf.C3631a.run():void");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c A[Catch:{ all -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0021 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m3841c() {
        /*
            r13 = this;
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r3 = 0
            com.yandex.metrica.impl.ob.lm r4 = r13.f3656g     // Catch:{ all -> 0x008a }
            android.database.sqlite.SQLiteDatabase r4 = r4.mo40472a()     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0086
            java.lang.String r6 = r13.mo40451a()     // Catch:{ all -> 0x0084 }
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch:{ all -> 0x0084 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r4
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0084 }
        L_0x0021:
            boolean r6 = r5.moveToNext()     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x0082
            int r6 = r5.getColumnIndex(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x008c }
            int r7 = r5.getColumnIndex(r1)     // Catch:{ all -> 0x008c }
            java.lang.String r7 = r5.getString(r7)     // Catch:{ all -> 0x008c }
            int r8 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x008c }
            int r8 = r5.getInt(r8)     // Catch:{ all -> 0x008c }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x008c }
            if (r9 != 0) goto L_0x0021
            r9 = 1
            if (r8 == r9) goto L_0x0065
            r9 = 2
            if (r8 == r9) goto L_0x0060
            r9 = 3
            if (r8 == r9) goto L_0x005b
            r9 = 4
            if (r8 == r9) goto L_0x007a
            r9 = 5
            if (r8 == r9) goto L_0x0056
        L_0x0054:
            r7 = r3
            goto L_0x007a
        L_0x0056:
            java.lang.Float r7 = com.yandex.metrica.impl.p039ob.C4215vy.m5931b(r7)     // Catch:{ all -> 0x008c }
            goto L_0x007a
        L_0x005b:
            java.lang.Long r7 = com.yandex.metrica.impl.p039ob.C4215vy.m5930a(r7)     // Catch:{ all -> 0x008c }
            goto L_0x007a
        L_0x0060:
            java.lang.Integer r7 = com.yandex.metrica.impl.p039ob.C4215vy.m5932c(r7)     // Catch:{ all -> 0x008c }
            goto L_0x007a
        L_0x0065:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch:{ all -> 0x008c }
            if (r8 == 0) goto L_0x0070
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008c }
            goto L_0x007a
        L_0x0070:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x008c }
            if (r7 == 0) goto L_0x0054
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008c }
        L_0x007a:
            if (r7 == 0) goto L_0x0021
            java.util.Map<java.lang.String, java.lang.Object> r8 = r13.f3651b     // Catch:{ all -> 0x008c }
            r8.put(r6, r7)     // Catch:{ all -> 0x008c }
            goto L_0x0021
        L_0x0082:
            r3 = r5
            goto L_0x0086
        L_0x0084:
            r5 = r3
            goto L_0x008c
        L_0x0086:
            com.yandex.metrica.impl.p039ob.C3306cx.m2852a((android.database.Cursor) r3)
            goto L_0x008f
        L_0x008a:
            r4 = r3
            r5 = r4
        L_0x008c:
            com.yandex.metrica.impl.p039ob.C3306cx.m2852a((android.database.Cursor) r5)
        L_0x008f:
            com.yandex.metrica.impl.ob.lm r0 = r13.f3656g
            r0.mo40473a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3630lf.m3841c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo40451a() {
        return this.f3653d;
    }

    /* renamed from: b */
    public void mo40459b() {
        synchronized (this.f3654e) {
            this.f3654e.notifyAll();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3835a(Map<String, Object> map) {
        ContentValues[] contentValuesArr = new ContentValues[map.size()];
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            Object value = next.getValue();
            contentValues.put("key", (String) next.getKey());
            if (value == this) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", 5);
            }
            contentValuesArr[i] = contentValues;
            i++;
        }
        m3836a(contentValuesArr);
    }

    /* renamed from: a */
    private void m3836a(ContentValues[] contentValuesArr) {
        SQLiteDatabase sQLiteDatabase;
        if (contentValuesArr != null) {
            try {
                sQLiteDatabase = this.f3656g.mo40472a();
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.beginTransaction();
                        for (ContentValues contentValues : contentValuesArr) {
                            if (contentValues.getAsString("value") == null) {
                                sQLiteDatabase.delete(mo40451a(), "key = ?", new String[]{contentValues.getAsString("key")});
                            } else {
                                sQLiteDatabase.insertWithOnConflict(mo40451a(), (String) null, contentValues, 5);
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
                sQLiteDatabase = null;
            }
            C3306cx.m2853a(sQLiteDatabase);
            this.f3656g.mo40473a(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    public String mo40452a(String str, String str2) {
        Object c = m3839c(str);
        return c instanceof String ? (String) c : str2;
    }

    /* renamed from: a */
    public int mo40448a(String str, int i) {
        Object c = m3839c(str);
        return c instanceof Integer ? ((Integer) c).intValue() : i;
    }

    /* renamed from: a */
    public long mo40449a(String str, long j) {
        Object c = m3839c(str);
        return c instanceof Long ? ((Long) c).longValue() : j;
    }

    /* renamed from: a */
    public boolean mo40454a(String str, boolean z) {
        Object c = m3839c(str);
        return c instanceof Boolean ? ((Boolean) c).booleanValue() : z;
    }

    /* renamed from: a */
    public C3630lf mo40450a(String str) {
        synchronized (this.f3651b) {
            m3842d();
            this.f3651b.remove(str);
        }
        synchronized (this.f3654e) {
            this.f3652c.put(str, this);
            this.f3654e.notifyAll();
        }
        return this;
    }

    /* renamed from: b */
    public synchronized C3630lf mo40457b(String str, String str2) {
        mo40453a(str, (Object) str2);
        return this;
    }

    /* renamed from: b */
    public C3630lf mo40456b(String str, long j) {
        mo40453a(str, (Object) Long.valueOf(j));
        return this;
    }

    /* renamed from: b */
    public synchronized C3630lf mo40455b(String str, int i) {
        mo40453a(str, (Object) Integer.valueOf(i));
        return this;
    }

    /* renamed from: b */
    public C3630lf mo40458b(String str, boolean z) {
        mo40453a(str, (Object) Boolean.valueOf(z));
        return this;
    }

    /* renamed from: b */
    public boolean mo40460b(String str) {
        boolean containsKey;
        synchronized (this.f3651b) {
            m3842d();
            containsKey = this.f3651b.containsKey(str);
        }
        return containsKey;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40453a(String str, Object obj) {
        synchronized (this.f3651b) {
            m3842d();
            this.f3651b.put(str, obj);
        }
        synchronized (this.f3654e) {
            this.f3652c.put(str, obj);
            this.f3654e.notifyAll();
        }
    }

    /* renamed from: c */
    private Object m3839c(String str) {
        Object obj;
        synchronized (this.f3651b) {
            m3842d();
            obj = this.f3651b.get(str);
        }
        return obj;
    }

    /* renamed from: d */
    private void m3842d() {
        if (!this.f3655f) {
            try {
                this.f3651b.wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
