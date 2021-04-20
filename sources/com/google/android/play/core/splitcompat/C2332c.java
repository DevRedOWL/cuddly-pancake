package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.play.core.internal.C2258ax;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitcompat.c */
public final class C2332c {

    /* renamed from: a */
    private final long f2015a;

    /* renamed from: b */
    private final Context f2016b;

    /* renamed from: c */
    private File f2017c;

    public C2332c(Context context) throws PackageManager.NameNotFoundException {
        this.f2016b = context;
        this.f2015a = (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: o */
    public static void m1409o(File file) throws IOException {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File o : listFiles) {
                m1409o(o);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: p */
    private final File m1410p() throws IOException {
        File file = new File(m1411q(), "verified-splits");
        m1417w(file);
        return file;
    }

    /* renamed from: q */
    private final File m1411q() throws IOException {
        File file = new File(m1412r(), Long.toString(this.f2015a));
        m1417w(file);
        return file;
    }

    /* renamed from: r */
    private final File m1412r() throws IOException {
        if (this.f2017c == null) {
            Context context = this.f2016b;
            if (context != null) {
                this.f2017c = context.getFilesDir();
            } else {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
        }
        File file = new File(this.f2017c, "splitcompat");
        m1417w(file);
        return file;
    }

    /* renamed from: s */
    private final File m1413s() throws IOException {
        File file = new File(m1411q(), "native-libraries");
        m1417w(file);
        return file;
    }

    /* renamed from: t */
    private final File m1414t(String str) throws IOException {
        File u = m1415u(m1413s(), str);
        m1417w(u);
        return u;
    }

    /* renamed from: u */
    private static File m1415u(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* renamed from: v */
    private static String m1416v(String str) {
        return String.valueOf(str).concat(".apk");
    }

    /* renamed from: w */
    private static void m1417w(File file) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                throw new IOException(valueOf.length() != 0 ? "Unable to create directory: ".concat(valueOf) : new String("Unable to create directory: "));
            }
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    /* renamed from: a */
    public final void mo33946a() throws IOException {
        File r = m1412r();
        String[] list = r.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f2015a))) {
                    File file = new File(r, str);
                    String valueOf = String.valueOf(file);
                    long j = this.f2015a;
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118);
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(valueOf);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    Log.d("SplitCompat", sb.toString());
                    m1409o(file);
                }
            }
        }
    }

    /* renamed from: b */
    public final File mo33947b(String str) throws IOException {
        return m1415u(mo33952g(), m1416v(str));
    }

    /* renamed from: c */
    public final File mo33948c(String str) throws IOException {
        return m1415u(m1410p(), m1416v(str));
    }

    /* renamed from: d */
    public final File mo33949d(File file) throws IOException {
        return m1415u(m1410p(), file.getName());
    }

    /* renamed from: e */
    public final File mo33950e(String str, String str2) throws IOException {
        return m1415u(m1414t(str), str2);
    }

    /* renamed from: f */
    public final File mo33951f() throws IOException {
        return new File(m1411q(), "lock.tmp");
    }

    /* renamed from: g */
    public final File mo33952g() throws IOException {
        File file = new File(m1411q(), "unverified-splits");
        m1417w(file);
        return file;
    }

    /* renamed from: h */
    public final File mo33953h(String str) throws IOException {
        File file = new File(m1411q(), "dex");
        m1417w(file);
        File u = m1415u(file, str);
        m1417w(u);
        return u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Set<C2346q> mo33954i() throws IOException {
        File p = m1410p();
        HashSet hashSet = new HashSet();
        File[] listFiles = p.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    String name = file.getName();
                    hashSet.add(new C2346q(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final List<String> mo33955j() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = m1413s().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo33956k(String str) throws IOException {
        m1409o(m1414t(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo33957l(File file) throws IOException {
        C2258ax.m1182c(file.getParentFile().getParentFile().equals(m1413s()), "File to remove is not a native library");
        m1409o(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Set<File> mo33958m(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] listFiles = m1414t(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo33959n(String str) throws IOException {
        m1409o(mo33948c(str));
    }
}
