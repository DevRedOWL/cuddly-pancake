package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C4039sn;

/* renamed from: com.yandex.metrica.impl.ob.sq */
public class C4047sq extends C4039sn {

    /* renamed from: a */
    private String f4789a;

    /* renamed from: E */
    public String mo41329E() {
        return this.f4789a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo41330l(String str) {
        this.f4789a = str;
    }

    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f4789a + '\'' + super.toString() + '}';
    }

    /* renamed from: com.yandex.metrica.impl.ob.sq$a */
    protected static abstract class C4048a<T extends C4047sq, A extends C4039sn.C4040a> extends C4039sn.C4041b<T, A> {

        /* renamed from: c */
        private final C4281yc f4790c;

        protected C4048a(Context context, String str) {
            this(context, str, new C4281yc());
        }

        protected C4048a(Context context, String str, C4281yc ycVar) {
            super(context, str);
            this.f4790c = ycVar;
        }

        /* renamed from: b */
        public T mo40153c(C4039sn.C4042c<A> cVar) {
            T t = (C4047sq) super.mo40150a(cVar);
            m5295a(t);
            return t;
        }

        /* renamed from: a */
        private void m5295a(T t) {
            String packageName = this.f4781a.getPackageName();
            ApplicationInfo b = this.f4790c.mo41864b(this.f4781a, this.f4782b, 0);
            if (b != null) {
                t.mo41330l(m5294a(b));
            } else if (TextUtils.equals(packageName, this.f4782b)) {
                t.mo41330l(m5294a(this.f4781a.getApplicationInfo()));
            } else {
                t.mo41330l("0");
            }
        }

        /* renamed from: a */
        private String m5294a(ApplicationInfo applicationInfo) {
            return (applicationInfo.flags & 2) != 0 ? "1" : "0";
        }
    }
}
