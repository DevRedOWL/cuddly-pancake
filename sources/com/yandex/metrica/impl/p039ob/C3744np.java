package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3949rs;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.np */
public interface C3744np<T> {
    /* renamed from: a */
    C3700mf<T> mo40705a(Context context);

    /* renamed from: com.yandex.metrica.impl.ob.np$a */
    public static class C3746a {

        /* renamed from: a */
        private final HashMap<Class<?>, C3744np<?>> f3867a;

        /* renamed from: b */
        private final C3744np<C4143uk> f3868b;

        /* renamed from: c */
        private final C3744np<C3949rs.C3954a> f3869c;

        /* renamed from: d */
        private final C3744np<List<C3835pu>> f3870d;

        /* renamed from: e */
        private final C3744np<C3827pn> f3871e;

        /* renamed from: f */
        private final C3744np<C4076te> f3872f;

        /* renamed from: com.yandex.metrica.impl.ob.np$a$a */
        private static final class C3752a {

            /* renamed from: a */
            static final C3746a f3878a = new C3746a();
        }

        /* renamed from: a */
        public static <T> C3744np<T> m4268a(Class<T> cls) {
            return C3752a.f3878a.mo40706c(cls);
        }

        /* renamed from: b */
        public static <T> C3744np<Collection<T>> m4269b(Class<T> cls) {
            return C3752a.f3878a.mo40707d(cls);
        }

        private C3746a() {
            this.f3867a = new HashMap<>();
            this.f3868b = new C3744np<C4143uk>() {
                /* renamed from: a */
                public C3700mf<C4143uk> mo40705a(Context context) {
                    return new C3701mg("startup_state", C3628ld.m3815a(context).mo40438b(), new C3743no(context).mo40700a(), new C3734nf());
                }
            };
            this.f3869c = new C3744np<C3949rs.C3954a>() {
                /* renamed from: a */
                public C3700mf<C3949rs.C3954a> mo40705a(Context context) {
                    return new C3701mg("provided_request_state", C3628ld.m3815a(context).mo40438b(), new C3743no(context).mo40704e(), new C3725na());
                }
            };
            this.f3870d = new C3744np<List<C3835pu>>() {
                /* renamed from: a */
                public C3700mf<List<C3835pu>> mo40705a(Context context) {
                    return new C3701mg("permission_list", C3628ld.m3815a(context).mo40438b(), new C3743no(context).mo40701b(), new C3721my());
                }
            };
            this.f3871e = new C3744np<C3827pn>() {
                /* renamed from: a */
                public C3700mf<C3827pn> mo40705a(Context context) {
                    return new C3701mg("app_permissions_state", C3628ld.m3815a(context).mo40438b(), new C3743no(context).mo40702c(), new C3707mm());
                }
            };
            this.f3872f = new C3744np<C4076te>() {
                /* renamed from: a */
                public C3700mf<C4076te> mo40705a(Context context) {
                    return new C3701mg("sdk_fingerprinting", C3628ld.m3815a(context).mo40438b(), new C3743no(context).mo40703d(), new C3732nd());
                }
            };
            this.f3867a.put(C4143uk.class, this.f3868b);
            this.f3867a.put(C3949rs.C3954a.class, this.f3869c);
            this.f3867a.put(C3835pu.class, this.f3870d);
            this.f3867a.put(C3827pn.class, this.f3871e);
            this.f3867a.put(C4076te.class, this.f3872f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public <T> C3744np<T> mo40706c(Class<T> cls) {
            return this.f3867a.get(cls);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <T> C3744np<Collection<T>> mo40707d(Class<T> cls) {
            return this.f3867a.get(cls);
        }
    }
}
