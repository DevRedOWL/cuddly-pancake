package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ns */
public class C3755ns {

    /* renamed from: a */
    private final C4281yc f3886a = new C4281yc();

    /* renamed from: a */
    public void mo40716a(Context context, C3753nq nqVar, C3832pr prVar) {
        try {
            C3754nr b = m4284b(context);
            String str = null;
            if (!(b == null || b.mo40713c() == null)) {
                str = b.mo40713c().mo40721a();
            }
            String a = new C3754nr(nqVar, new C3756nt(context, str, prVar), System.currentTimeMillis()).mo40711a();
            if (mo40718a()) {
                mo40717a(context, a);
            }
            m4283a(context, "credentials.dat", a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m4283a(Context context, String str, String str2) {
        C3137am.m2013a(context, str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40717a(Context context, String str) {
        C3137am.m2022b(context, "credentials.dat", str);
    }

    /* renamed from: a */
    public C3753nq mo40715a(Context context) {
        C3754nr b = m4284b(context);
        if (b == null) {
            return null;
        }
        return b.mo40712b();
    }

    /* renamed from: b */
    private C3754nr m4284b(Context context) {
        C3754nr b = mo40719b(context, context.getPackageName());
        if (b == null) {
            return null;
        }
        if (!mo40718a()) {
            return b;
        }
        C3754nr c = mo40720c(context, context.getPackageName());
        return c == null ? b : c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo40718a() {
        return C3137am.m2017a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3754nr mo40719b(Context context, String str) {
        return m4281a(context, str, context.getFileStreamPath("credentials.dat"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C3754nr mo40720c(Context context, String str) {
        return m4281a(context, str, new File(context.getNoBackupFilesDir(), "credentials.dat"));
    }

    /* renamed from: a */
    private C3754nr m4281a(Context context, String str, File file) {
        ApplicationInfo b = this.f3886a.mo41864b(context, str, 8192);
        if (b != null) {
            return m4285b(context, str, m4282a(file, context.getApplicationInfo().dataDir, b.dataDir));
        }
        return null;
    }

    /* renamed from: b */
    private C3754nr m4285b(Context context, String str, String str2) {
        try {
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            String a = C3137am.m2009a(context, file);
            if (a == null) {
                return null;
            }
            return new C3754nr(new JSONObject(a), file.lastModified());
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private String m4282a(File file, String str, String str2) {
        return file.getAbsolutePath().replace(str, str2);
    }
}
