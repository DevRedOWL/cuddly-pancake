package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.yandex.metrica.impl.p039ob.C3213bt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.v */
public class C4179v {

    /* renamed from: j */
    private static final Object f5202j = new Object();

    /* renamed from: k */
    private static volatile C4179v f5203k;

    /* renamed from: a */
    public final String f5204a = AbstractSpiCall.ANDROID_CLIENT_TYPE;

    /* renamed from: b */
    public final String f5205b = Build.MANUFACTURER;

    /* renamed from: c */
    public final String f5206c = Build.MODEL;

    /* renamed from: d */
    public final String f5207d = Build.VERSION.RELEASE;

    /* renamed from: e */
    public final int f5208e = Build.VERSION.SDK_INT;

    /* renamed from: f */
    public final C4183b f5209f;

    /* renamed from: g */
    public final String f5210g;

    /* renamed from: h */
    public final String f5211h;

    /* renamed from: i */
    public final List<String> f5212i;

    /* renamed from: l */
    private final C4181a f5213l;

    /* renamed from: com.yandex.metrica.impl.ob.v$b */
    public static final class C4183b {

        /* renamed from: a */
        public final int f5219a;

        /* renamed from: b */
        public final int f5220b;

        /* renamed from: c */
        public final int f5221c;

        /* renamed from: d */
        public final float f5222d;

        C4183b(Point point, int i, float f) {
            this.f5219a = Math.max(point.x, point.y);
            this.f5220b = Math.min(point.x, point.y);
            this.f5221c = i;
            this.f5222d = f;
        }
    }

    /* renamed from: a */
    public static C4179v m5795a(Context context) {
        if (f5203k == null) {
            synchronized (f5202j) {
                if (f5203k == null) {
                    f5203k = new C4179v(context.getApplicationContext());
                }
            }
        }
        return f5203k;
    }

    private C4179v(Context context) {
        this.f5213l = new C4181a(context);
        this.f5209f = new C4183b(C3213bt.m2395b(context), context.getResources().getDisplayMetrics().densityDpi, context.getResources().getDisplayMetrics().density);
        this.f5210g = C3213bt.m2391a(context).name().toLowerCase(Locale.US);
        this.f5211h = String.valueOf(C3213bt.C3221b.m2410c());
        this.f5212i = Collections.unmodifiableList(new ArrayList<String>() {
            {
                if (C3213bt.C3221b.m2408a()) {
                    add("Superuser.apk");
                }
                if (C3213bt.C3221b.m2409b()) {
                    add("su.so");
                }
            }
        });
    }

    /* renamed from: a */
    public String mo41660a() {
        return this.f5213l.mo41662a((C4143uk) null);
    }

    /* renamed from: a */
    public String mo41661a(C4143uk ukVar) {
        return this.f5213l.mo41662a(ukVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.v$a */
    public static class C4181a {

        /* renamed from: a */
        private String f5215a;

        /* renamed from: b */
        private Context f5216b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C4143uk f5217c;

        C4181a(Context context) {
            this.f5216b = context;
            C3350dr.m3043a().mo39931b((C3356dt) new C3362dx(this.f5215a));
            C3350dr.m3043a().mo39930a(this, C3367eb.class, C3358dv.m3057a(new C3357du<C3367eb>() {
                /* renamed from: a */
                public void mo39399a(C3367eb ebVar) {
                    synchronized (C4181a.this) {
                        C4143uk unused = C4181a.this.f5217c = ebVar.f3096b;
                    }
                }
            }).mo39939a());
            this.f5215a = m5800b(this.f5217c) ? m5799a(context) : null;
        }

        /* renamed from: a */
        private String m5799a(Context context) {
            try {
                return Settings.Secure.getString(context.getContentResolver(), "android_id");
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: a */
        public String mo41662a(C4143uk ukVar) {
            if (TextUtils.isEmpty(this.f5215a) && m5800b(ukVar)) {
                this.f5215a = m5799a(this.f5216b);
            }
            return this.f5215a;
        }

        /* renamed from: b */
        private synchronized boolean m5800b(C4143uk ukVar) {
            if (ukVar == null) {
                ukVar = this.f5217c;
            }
            return m5801c(ukVar);
        }

        /* renamed from: c */
        private boolean m5801c(C4143uk ukVar) {
            return ukVar != null && ukVar.f5101o.f5000g;
        }
    }
}
