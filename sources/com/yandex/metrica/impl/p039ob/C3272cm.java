package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.yandex.metrica.impl.p039ob.C3196bi;
import com.yandex.metrica.impl.p039ob.C3512i;
import com.yandex.metrica.impl.p039ob.C3744np;
import com.yandex.metrica.impl.p039ob.C4143uk;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.cm */
public class C3272cm extends C3196bi {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3690ly f2895a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f2896b;

    public C3272cm(Context context) {
        this.f2896b = context;
        this.f2895a = new C3690ly(C3628ld.m3815a(context).mo40441c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public SparseArray<C3196bi.C3197a> mo39628a() {
        return new SparseArray<C3196bi.C3197a>() {
            {
                put(29, new C3278e(C3272cm.this.f2896b));
                put(39, new C3279f());
                put(47, new C3280g());
                put(60, new C3281h());
                put(62, new C3282i());
                put(66, new C3283j());
                put(67, new C3275b(C3744np.C3746a.m4268a(C4143uk.class).mo40705a(C3272cm.this.f2896b), new C3691lz(C3628ld.m3815a(C3272cm.this.f2896b).mo40443e(), C3272cm.this.f2896b.getPackageName())));
                put(68, new C3288k());
                put(72, new C3274a(C3744np.C3746a.m4269b(C3835pu.class).mo40705a(C3272cm.this.f2896b), C3744np.C3746a.m4268a(C4143uk.class).mo40705a(C3272cm.this.f2896b), new C3755ns()));
                put(73, new C3276c(C3272cm.this.f2895a, new C3848qf(C3272cm.this.f2896b, new C3414fb(C3272cm.this.f2896b.getPackageName(), (String) null).toString())));
                put(82, new C3277d(C3744np.C3746a.m4269b(C3835pu.class).mo40705a(C3272cm.this.f2896b), C3744np.C3746a.m4268a(C3827pn.class).mo40705a(C3272cm.this.f2896b)));
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo39627a(C3849qg qgVar) {
        int a = qgVar.mo40887a();
        return a == -1 ? this.f2895a.mo40571a(-1) : a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39630a(C3849qg qgVar, int i) {
        this.f2895a.mo40578b(i).mo40567q();
        qgVar.mo40930b().mo40902j();
    }

    /* renamed from: com.yandex.metrica.impl.ob.cm$e */
    static class C3278e implements C3196bi.C3197a {

        /* renamed from: a */
        private C3851qi f2907a;

        /* renamed from: b */
        private C3691lz f2908b;

        C3278e(Context context) {
            this.f2907a = new C3851qi(context);
            this.f2908b = new C3691lz(C3628ld.m3815a(context).mo40443e(), context.getPackageName());
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            String a = this.f2907a.mo40934a((String) null);
            if (!TextUtils.isEmpty(a)) {
                this.f2908b.mo40605b(a).mo40567q();
                C3851qi.m4619a(context);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.cm$f */
    static class C3279f implements C3196bi.C3197a {
        C3279f() {
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            C3848qf qfVar = new C3848qf(context, context.getPackageName());
            SharedPreferences a = C3854ql.m4639a(context, "_boundentrypreferences");
            String string = a.getString(C3848qf.f4128d.mo40945a(), (String) null);
            long j = a.getLong(C3848qf.f4129e.mo40945a(), -1);
            if (string != null && j != -1) {
                qfVar.mo40913a(new C3512i.C3513a(string, j)).mo40902j();
                a.edit().remove(C3848qf.f4128d.mo40945a()).remove(C3848qf.f4129e.mo40945a()).apply();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.cm$h */
    static class C3281h implements C3196bi.C3197a {
        C3281h() {
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            m2643a(context, new C3690ly(C3628ld.m3815a(context).mo40441c()));
        }

        /* renamed from: a */
        private void m2643a(Context context, C3690ly lyVar) {
            long j = new C3691lz(C3628ld.m3815a(context).mo40443e(), context.getPackageName()).mo40604a().f5106t;
            boolean z = true;
            boolean z2 = j > 0;
            if (lyVar.mo40581c(-1) <= 0) {
                z = false;
            }
            if (z2 || z) {
                lyVar.mo40587d(false).mo40567q();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.cm$i */
    static class C3282i implements C3196bi.C3197a {
        C3282i() {
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            C3691lz lzVar = new C3691lz(C3628ld.m3815a(context).mo40443e(), context.getPackageName());
            String i = lzVar.mo40613i((String) null);
            if (i != null) {
                lzVar.mo40602a((List<String>) Collections.singletonList(i));
            }
            String j = lzVar.mo40614j((String) null);
            if (j != null) {
                lzVar.mo40606b((List<String>) Collections.singletonList(j));
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.cm$b */
    static class C3275b implements C3196bi.C3197a {

        /* renamed from: a */
        private C3700mf f2901a;

        /* renamed from: b */
        private C3691lz f2902b;

        public C3275b(C3700mf mfVar, C3691lz lzVar) {
            this.f2901a = mfVar;
            this.f2902b = lzVar;
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            this.f2901a.mo40625a(this.f2902b.mo40604a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.cm$k */
    static class C3288k implements C3196bi.C3197a {
        C3288k() {
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            C3700mf<C4143uk> a = C3744np.C3746a.m4268a(C4143uk.class).mo40705a(context);
            C4143uk a2 = a.mo40624a();
            a.mo40625a(a2.mo41562a().mo41575a(a2.f5106t > 0).mo41584c(true).mo41576a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.cm$c */
    static class C3276c implements C3196bi.C3197a {

        /* renamed from: a */
        private final C3690ly f2903a;

        /* renamed from: b */
        private final C3848qf f2904b;

        public C3276c(C3690ly lyVar, C3848qf qfVar) {
            this.f2903a = lyVar;
            this.f2904b = qfVar;
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            Boolean b = this.f2904b.mo40917b();
            this.f2904b.mo40922d().mo40902j();
            if (b != null) {
                this.f2903a.mo40575a(b.booleanValue()).mo40567q();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.cm$a */
    static class C3274a implements C3196bi.C3197a {

        /* renamed from: a */
        private final C3700mf<Collection<C3835pu>> f2898a;

        /* renamed from: b */
        private final C3700mf<C4143uk> f2899b;

        /* renamed from: c */
        private final C3755ns f2900c;

        public C3274a(C3700mf<Collection<C3835pu>> mfVar, C3700mf<C4143uk> mfVar2, C3755ns nsVar) {
            this.f2898a = mfVar;
            this.f2899b = mfVar2;
            this.f2900c = nsVar;
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            m2631c(context);
            C4143uk.C4145a a = this.f2899b.mo40624a().mo41562a();
            m2628a(context, a);
            m2629a(a);
            this.f2899b.mo40625a(a.mo41576a());
            m2630b(context);
        }

        /* renamed from: b */
        private void m2630b(Context context) {
            context.getSharedPreferences("com.yandex.metrica.configuration", 0).edit().clear().apply();
        }

        /* renamed from: a */
        private void m2629a(C4143uk.C4145a aVar) {
            aVar.mo41584c(true);
        }

        /* renamed from: a */
        private void m2628a(Context context, C4143uk.C4145a aVar) {
            C3753nq a = this.f2900c.mo40715a(context);
            if (a != null) {
                aVar.mo41578b(a.f3879a).mo41585d(a.f3880b);
            }
        }

        /* renamed from: c */
        private void m2631c(Context context) {
            C3634li d = C3628ld.m3815a(context).mo40442d();
            List<C3835pu> a = d.mo40462a();
            if (a != null) {
                this.f2898a.mo40625a(a);
                d.mo40463b();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.cm$g */
    static class C3280g implements C3196bi.C3197a {
        C3280g() {
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            C3690ly lyVar = new C3690ly(C3628ld.m3815a(context).mo40441c());
            m2641c(context, lyVar);
            m2640b(context, lyVar);
            m2638a(context, lyVar);
            lyVar.mo40567q();
            C3842qa qaVar = new C3842qa(context);
            qaVar.mo40874a();
            qaVar.mo40875b();
            m2639b(context);
        }

        /* renamed from: b */
        private void m2639b(Context context) {
            new C3755ns().mo40716a(context, new C3753nq(C4232wk.m6042b(new C3691lz(C3628ld.m3815a(context).mo40443e(), context.getPackageName()).mo40604a().f5088b, ""), (String) null), new C3832pr(new C3826pm()));
        }

        /* renamed from: a */
        private void m2638a(Context context, C3690ly lyVar) {
            C3848qf qfVar = new C3848qf(context, new C3414fb(context.getPackageName(), (String) null).toString());
            Boolean b = qfVar.mo40917b();
            qfVar.mo40922d();
            if (b != null) {
                lyVar.mo40575a(b.booleanValue());
            }
            String b2 = qfVar.mo40918b((String) null);
            if (!TextUtils.isEmpty(b2)) {
                lyVar.mo40574a(b2);
            }
            qfVar.mo40922d().mo40920c().mo40902j();
        }

        /* renamed from: b */
        private void m2640b(Context context, C3690ly lyVar) {
            C3850qh qhVar = new C3850qh(context, context.getPackageName());
            long a = qhVar.mo40932a(0);
            if (a != 0) {
                lyVar.mo40572a(a);
            }
            qhVar.mo40887a();
        }

        /* renamed from: c */
        private void m2641c(Context context, C3690ly lyVar) {
            C3852qj qjVar = new C3852qj(context);
            if (qjVar.mo40887a()) {
                lyVar.mo40580b(true);
                qjVar.mo40944b();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.cm$j */
    static class C3283j implements C3196bi.C3197a {
        C3283j() {
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            mo39814b(context);
            m2647d(context);
        }

        /* renamed from: d */
        private void m2647d(Context context) {
            new C3691lz(C3628ld.m3815a(context).mo40443e(), context.getPackageName()).mo40568r(new C3853qk("LAST_STARTUP_CLIDS_SAVE_TIME").mo40947b()).mo40567q();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo39814b(Context context) {
            for (File file : mo39815c(context).listFiles(new C3284a(Arrays.asList(new FilenameFilter[]{new C3285b(new C3287d(context.getPackageName())), new C3285b(new C3286c())})))) {
                try {
                    if (!file.delete()) {
                        C4085tl.m5459a(context).reportEvent("Can not delete file", new JSONObject().put("fileName", file.getName()).toString());
                    }
                } catch (Throwable th) {
                    C4085tl.m5459a(context).reportError("Can not delete file", th);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public File mo39815c(Context context) {
            if (C3306cx.m2857a(21)) {
                return context.getNoBackupFilesDir();
            }
            return new File(context.getFilesDir().getParentFile(), "databases");
        }

        /* renamed from: a */
        static String m2646a(String str) {
            return str.endsWith("-journal") ? str.replace("-journal", "") : str;
        }

        /* renamed from: com.yandex.metrica.impl.ob.cm$j$a */
        static class C3284a implements FilenameFilter {

            /* renamed from: a */
            final Iterable<FilenameFilter> f2909a;

            C3284a(Iterable<FilenameFilter> iterable) {
                this.f2909a = iterable;
            }

            public boolean accept(File file, String str) {
                for (FilenameFilter accept : this.f2909a) {
                    if (accept.accept(file, str)) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.cm$j$b */
        static class C3285b implements FilenameFilter {

            /* renamed from: a */
            private final FilenameFilter f2910a;

            C3285b(FilenameFilter filenameFilter) {
                this.f2910a = filenameFilter;
            }

            public boolean accept(File file, String str) {
                if (!str.startsWith("db_metrica_")) {
                    return false;
                }
                try {
                    return this.f2910a.accept(file, C3283j.m2646a(str));
                } catch (Throwable unused) {
                    return false;
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.cm$j$d */
        static class C3287d implements FilenameFilter {

            /* renamed from: a */
            private final String f2911a;

            C3287d(String str) {
                this.f2911a = str;
            }

            public boolean accept(File file, String str) {
                return !str.contains(this.f2911a);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.cm$j$c */
        static class C3286c implements FilenameFilter {
            C3286c() {
            }

            public boolean accept(File file, String str) {
                return str.endsWith("null");
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.cm$d */
    static class C3277d implements C3196bi.C3197a {

        /* renamed from: a */
        private final C3700mf<Collection<C3835pu>> f2905a;

        /* renamed from: b */
        private final C3700mf<C3827pn> f2906b;

        C3277d(C3700mf<Collection<C3835pu>> mfVar, C3700mf<C3827pn> mfVar2) {
            this.f2905a = mfVar;
            this.f2906b = mfVar2;
        }

        /* renamed from: a */
        public void mo39632a(Context context) {
            this.f2906b.mo40625a(new C3827pn(new ArrayList(this.f2905a.mo40624a()), (C3623l) null, new ArrayList()));
        }
    }
}
