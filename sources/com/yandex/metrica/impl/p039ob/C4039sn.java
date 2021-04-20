package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.yandex.metrica.C3089b;
import com.yandex.metrica.impl.p038ac.C3098a;
import java.util.Locale;
import p042cz.msebera.android.httpclient.client.cache.HeaderConstants;

/* renamed from: com.yandex.metrica.impl.ob.sn */
public class C4039sn {

    /* renamed from: a */
    private String f4759a;

    /* renamed from: b */
    private C4179v f4760b;

    /* renamed from: c */
    private final String f4761c = "3.8.0";

    /* renamed from: d */
    private final String f4762d = "66508";

    /* renamed from: e */
    private final String f4763e;

    /* renamed from: f */
    private final String f4764f;

    /* renamed from: g */
    private final String f4765g;

    /* renamed from: h */
    private String f4766h;

    /* renamed from: i */
    private String f4767i;

    /* renamed from: j */
    private String f4768j;

    /* renamed from: k */
    private String f4769k;

    /* renamed from: l */
    private String f4770l;

    /* renamed from: m */
    private String f4771m;

    /* renamed from: n */
    private String f4772n;

    /* renamed from: o */
    private String f4773o;

    /* renamed from: p */
    private C3098a.C3104c f4774p;

    /* renamed from: q */
    private String f4775q;

    /* renamed from: r */
    private String f4776r;

    /* renamed from: s */
    private C4143uk f4777s;

    /* renamed from: com.yandex.metrica.impl.ob.sn$d */
    public interface C4043d<T extends C4039sn, D> {
        /* renamed from: a */
        T mo40150a(D d);
    }

    /* renamed from: h */
    public String mo41294h() {
        return "2";
    }

    /* renamed from: i */
    public String mo41296i() {
        return "3.8.0";
    }

    /* renamed from: j */
    public String mo41298j() {
        return "66508";
    }

    /* renamed from: l */
    public String mo41302l() {
        return AbstractSpiCall.ANDROID_CLIENT_TYPE;
    }

    public C4039sn() {
        this.f4763e = TextUtils.isEmpty("") ? HeaderConstants.PUBLIC : "public_";
        this.f4764f = AbstractSpiCall.ANDROID_CLIENT_TYPE;
        this.f4765g = "2";
        this.f4766h = C3266ci.m2614b();
        this.f4775q = C3089b.PHONE.name().toLowerCase(Locale.US);
    }

    /* renamed from: d */
    public String mo41286d() {
        return this.f4759a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo41284b(String str) {
        this.f4759a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C4143uk mo41288e() {
        return this.f4777s;
    }

    /* renamed from: f */
    public synchronized boolean mo41291f() {
        return !C3303cu.m2823a(mo41310t(), mo41308r(), this.f4772n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41283a(C4179v vVar) {
        this.f4760b = vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41282a(C4143uk ukVar) {
        this.f4777s = ukVar;
    }

    /* renamed from: g */
    public String mo41292g() {
        return C4232wk.m6042b(this.f4760b.f5205b, "");
    }

    /* renamed from: k */
    public String mo41300k() {
        return this.f4763e;
    }

    /* renamed from: m */
    public String mo41303m() {
        return this.f4760b.f5206c;
    }

    /* renamed from: n */
    public String mo41304n() {
        return this.f4760b.f5207d;
    }

    /* renamed from: o */
    public int mo41305o() {
        return this.f4760b.f5208e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo41285c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f4768j = str;
        }
    }

    /* renamed from: p */
    public String mo41306p() {
        return C4232wk.m6042b(this.f4768j, "");
    }

    /* renamed from: q */
    public String mo41307q() {
        return C4232wk.m6042b(this.f4767i, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo41287d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f4767i = str;
        }
    }

    /* renamed from: r */
    public synchronized String mo41308r() {
        return C4232wk.m6042b(this.f4770l, "");
    }

    /* renamed from: s */
    public synchronized String mo41309s() {
        return C4232wk.m6042b(this.f4771m, "");
    }

    /* renamed from: t */
    public synchronized String mo41310t() {
        return C4232wk.m6042b(this.f4769k, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public synchronized void mo41289e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f4769k = str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public synchronized void mo41290f(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f4770l = str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public synchronized void mo41293g(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f4771m = str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public synchronized void mo41295h(String str) {
        this.f4772n = str;
    }

    /* renamed from: i */
    public void mo41297i(String str) {
        this.f4773o = str;
    }

    /* renamed from: u */
    public String mo41311u() {
        return this.f4760b.f5211h;
    }

    /* renamed from: v */
    public String mo41312v() {
        return this.f4766h;
    }

    /* renamed from: w */
    public int mo41313w() {
        return this.f4760b.f5209f.f5219a;
    }

    /* renamed from: x */
    public int mo41314x() {
        return this.f4760b.f5209f.f5220b;
    }

    /* renamed from: y */
    public int mo41315y() {
        return this.f4760b.f5209f.f5221c;
    }

    /* renamed from: z */
    public float mo41316z() {
        return this.f4760b.f5209f.f5222d;
    }

    /* renamed from: A */
    public String mo41277A() {
        return C4232wk.m6042b(this.f4776r, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo41299j(String str) {
        this.f4776r = str;
    }

    /* renamed from: B */
    public String mo41278B() {
        return this.f4773o;
    }

    /* renamed from: C */
    public String mo41279C() {
        return C4232wk.m6042b(this.f4775q, C3089b.PHONE.name().toLowerCase(Locale.US));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo41301k(String str) {
        this.f4775q = str;
    }

    /* renamed from: D */
    public C3098a.C3104c mo41280D() {
        return this.f4774p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41281a(C3098a.C3104c cVar) {
        this.f4774p = cVar;
    }

    /* renamed from: com.yandex.metrica.impl.ob.sn$c */
    public static class C4042c<A> {

        /* renamed from: a */
        public final C4143uk f4783a;

        /* renamed from: b */
        public final A f4784b;

        public C4042c(C4143uk ukVar, A a) {
            this.f4783a = ukVar;
            this.f4784b = a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sn$a */
    public static abstract class C4040a<I, O> implements C4038sm<I, O> {

        /* renamed from: c */
        public final String f4778c;

        /* renamed from: d */
        public final String f4779d;

        /* renamed from: e */
        public final String f4780e;

        public C4040a(String str, String str2, String str3) {
            this.f4778c = str;
            this.f4779d = str2;
            this.f4780e = str3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sn$b */
    protected static abstract class C4041b<T extends C4039sn, A extends C4040a> implements C4043d<T, C4042c<A>> {

        /* renamed from: a */
        final Context f4781a;

        /* renamed from: b */
        final String f4782b;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract T mo40151b();

        protected C4041b(Context context, String str) {
            this.f4781a = context;
            this.f4782b = str;
        }

        /* renamed from: c */
        public T mo40150a(C4042c<A> cVar) {
            T b = mo40151b();
            C4179v a = C4179v.m5795a(this.f4781a);
            b.mo41283a(a);
            b.mo41282a(cVar.f4783a);
            b.mo41301k(mo41317a(this.f4781a, ((C4040a) cVar.f4784b).f4778c));
            b.mo41297i(C4232wk.m6042b(a.mo41661a(cVar.f4783a), ""));
            m5273c(b, cVar);
            m5271a(b, this.f4782b, ((C4040a) cVar.f4784b).f4779d, this.f4781a);
            m5272b(b, this.f4782b, ((C4040a) cVar.f4784b).f4780e, this.f4781a);
            b.mo41284b(this.f4782b);
            b.mo41281a(C3098a.m1836a().mo39395c(this.f4781a));
            b.mo41299j(C3150aw.m2072a(this.f4781a).mo39530a());
            return b;
        }

        /* renamed from: a */
        private void m5271a(T t, String str, String str2, Context context) {
            if (TextUtils.isEmpty(str2)) {
                str2 = C3306cx.m2865b(context, str);
            }
            t.mo41287d(str2);
        }

        /* renamed from: b */
        private void m5272b(T t, String str, String str2, Context context) {
            if (TextUtils.isEmpty(str2)) {
                str2 = C3306cx.m2844a(context, str);
            }
            t.mo41285c(str2);
        }

        /* renamed from: c */
        private synchronized void m5273c(T t, C4042c<A> cVar) {
            t.mo41289e(mo40149a(cVar));
            mo41318a(t, cVar);
            mo41319b(t, cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo41318a(T t, C4042c<A> cVar) {
            t.mo41290f(cVar.f4783a.f5088b);
            t.mo41295h(cVar.f4783a.f5090d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo41319b(T t, C4042c<A> cVar) {
            t.mo41293g(cVar.f4783a.f5089c);
        }

        /* renamed from: a */
        private String mo40149a(C4042c<A> cVar) {
            return cVar.f4783a.f5087a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo41317a(Context context, String str) {
            return str == null ? C4179v.m5795a(context).f5210g : str;
        }
    }
}
