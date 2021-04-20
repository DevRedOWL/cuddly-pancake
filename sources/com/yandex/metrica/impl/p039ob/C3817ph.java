package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p038ac.C3098a;
import com.yandex.metrica.impl.p039ob.C4039sn;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ph */
public class C3817ph extends C4039sn {

    /* renamed from: a */
    private final C3774oh f4064a;

    private C3817ph(C3774oh ohVar) {
        this.f4064a = ohVar;
    }

    /* renamed from: a */
    public C3774oh mo40836a() {
        return this.f4064a;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ph$a */
    public static class C3819a {

        /* renamed from: a */
        public final C4143uk f4065a;

        /* renamed from: b */
        public final C3774oh f4066b;

        public C3819a(C4143uk ukVar, C3774oh ohVar) {
            this.f4065a = ukVar;
            this.f4066b = ohVar;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ph$b */
    protected static class C3820b implements C4039sn.C4043d<C3817ph, C3819a> {

        /* renamed from: a */
        private final Context f4067a;

        protected C3820b(Context context) {
            this.f4067a = context;
        }

        /* renamed from: a */
        public C3817ph mo40150a(C3819a aVar) {
            C3817ph phVar = new C3817ph(aVar.f4066b);
            Context context = this.f4067a;
            phVar.mo41287d(C3306cx.m2865b(context, context.getPackageName()));
            Context context2 = this.f4067a;
            phVar.mo41285c(C3306cx.m2844a(context2, context2.getPackageName()));
            phVar.mo41297i(C4232wk.m6042b(C4179v.m5795a(this.f4067a).mo41661a(aVar.f4065a), ""));
            phVar.mo41282a(aVar.f4065a);
            phVar.mo41283a(C4179v.m5795a(this.f4067a));
            phVar.mo41284b(this.f4067a.getPackageName());
            phVar.mo41289e(aVar.f4065a.f5087a);
            phVar.mo41290f(aVar.f4065a.f5088b);
            phVar.mo41293g(aVar.f4065a.f5089c);
            phVar.mo41281a(C3098a.m1836a().mo39395c(this.f4067a));
            return phVar;
        }
    }

    /* renamed from: b */
    public List<String> mo40837b() {
        return mo41288e().f5095i;
    }
}
