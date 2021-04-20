package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ld */
public class C3628ld {

    /* renamed from: a */
    private static volatile C3628ld f3635a;

    /* renamed from: b */
    private final Map<String, C3627lc> f3636b;

    /* renamed from: c */
    private final Map<String, C3630lf> f3637c;

    /* renamed from: d */
    private final Map<String, C3617kx> f3638d;

    /* renamed from: e */
    private final C3625la f3639e;

    /* renamed from: f */
    private final Context f3640f;

    /* renamed from: g */
    private C3627lc f3641g;

    /* renamed from: h */
    private C3617kx f3642h;

    /* renamed from: i */
    private C3630lf f3643i;

    /* renamed from: j */
    private C3630lf f3644j;

    /* renamed from: k */
    private C3630lf f3645k;

    /* renamed from: l */
    private C3633lh f3646l;

    /* renamed from: m */
    private C3632lg f3647m;

    /* renamed from: n */
    private C3634li f3648n;

    /* renamed from: a */
    public static C3628ld m3815a(Context context) {
        if (f3635a == null) {
            synchronized (C3628ld.class) {
                if (f3635a == null) {
                    f3635a = new C3628ld(context.getApplicationContext());
                }
            }
        }
        return f3635a;
    }

    public C3628ld(Context context) {
        this(context, C3644lq.m3882a());
    }

    public C3628ld(Context context, C3625la laVar) {
        this.f3636b = new HashMap();
        this.f3637c = new HashMap();
        this.f3638d = new HashMap();
        this.f3640f = context;
        this.f3639e = laVar;
    }

    /* renamed from: a */
    public synchronized C3627lc mo40436a(C3379ek ekVar) {
        C3627lc lcVar;
        String d = m3819d(ekVar);
        lcVar = this.f3636b.get(d);
        if (lcVar == null) {
            lcVar = mo40437a(d, this.f3639e.mo40419a());
            this.f3636b.put(d, lcVar);
        }
        return lcVar;
    }

    /* renamed from: a */
    public synchronized C3627lc mo40435a() {
        if (this.f3641g == null) {
            this.f3641g = mo40437a("metrica_data.db", this.f3639e.mo40420b());
        }
        return this.f3641g;
    }

    /* renamed from: b */
    public synchronized C3630lf mo40439b(C3379ek ekVar) {
        C3630lf lfVar;
        String ekVar2 = ekVar.toString();
        lfVar = this.f3637c.get(ekVar2);
        if (lfVar == null) {
            lfVar = new C3630lf(mo40436a(ekVar), "preferences");
            this.f3637c.put(ekVar2, lfVar);
        }
        return lfVar;
    }

    /* renamed from: c */
    public synchronized C3617kx mo40440c(C3379ek ekVar) {
        C3617kx kxVar;
        String ekVar2 = ekVar.toString();
        kxVar = this.f3638d.get(ekVar2);
        if (kxVar == null) {
            kxVar = new C3617kx(new C3643lp(mo40436a(ekVar)), "binary_data");
            this.f3638d.put(ekVar2, kxVar);
        }
        return kxVar;
    }

    /* renamed from: b */
    public synchronized C3617kx mo40438b() {
        if (this.f3642h == null) {
            this.f3642h = new C3617kx(new C3643lp(mo40435a()), "binary_data");
        }
        return this.f3642h;
    }

    /* renamed from: c */
    public synchronized C3630lf mo40441c() {
        if (this.f3643i == null) {
            this.f3643i = new C3630lf(mo40435a(), "preferences");
        }
        return this.f3643i;
    }

    /* renamed from: d */
    public synchronized C3634li mo40442d() {
        if (this.f3648n == null) {
            this.f3648n = new C3634li(mo40435a(), "permissions");
        }
        return this.f3648n;
    }

    /* renamed from: e */
    public synchronized C3630lf mo40443e() {
        if (this.f3644j == null) {
            this.f3644j = new C3630lf(mo40435a(), "startup");
        }
        return this.f3644j;
    }

    /* renamed from: f */
    public synchronized C3630lf mo40444f() {
        if (this.f3645k == null) {
            this.f3645k = new C3630lf("preferences", (C3640lm) new C3642lo(this.f3640f, m3816a("metrica_client_data.db")));
        }
        return this.f3645k;
    }

    /* renamed from: g */
    public synchronized C3633lh mo40445g() {
        if (this.f3646l == null) {
            this.f3646l = new C3633lh(this.f3640f, mo40435a());
        }
        return this.f3646l;
    }

    /* renamed from: h */
    public synchronized C3632lg mo40446h() {
        if (this.f3647m == null) {
            this.f3647m = new C3632lg(this.f3640f, mo40435a());
        }
        return this.f3647m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3627lc mo40437a(String str, C3635lj ljVar) {
        return new C3627lc(this.f3640f, m3816a(str), ljVar);
    }

    /* renamed from: a */
    private String m3816a(String str) {
        return C3306cx.m2857a(21) ? m3818b(str) : str;
    }

    /* renamed from: b */
    private String m3818b(String str) {
        try {
            File noBackupFilesDir = this.f3640f.getNoBackupFilesDir();
            File file = new File(noBackupFilesDir, str);
            if (!file.exists()) {
                if (m3817a(noBackupFilesDir, str)) {
                    m3817a(noBackupFilesDir, str + "-journal");
                    m3817a(noBackupFilesDir, str + "-shm");
                    m3817a(noBackupFilesDir, str + "-wal");
                }
            }
            return file.getAbsolutePath();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    private boolean m3817a(File file, String str) {
        File databasePath = this.f3640f.getDatabasePath(str);
        if (databasePath == null || !databasePath.exists()) {
            return false;
        }
        return databasePath.renameTo(new File(file, str));
    }

    /* renamed from: d */
    private static String m3819d(C3379ek ekVar) {
        return "db_metrica_" + ekVar;
    }
}
