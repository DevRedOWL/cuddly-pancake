package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.os.Build;

/* renamed from: com.yandex.metrica.impl.ob.jo */
public class C3570jo {

    /* renamed from: a */
    private final C3573c f3496a;

    /* renamed from: com.yandex.metrica.impl.ob.jo$c */
    interface C3573c {
        /* renamed from: a */
        C3566jm mo40320a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.jo$b */
    static class C3572b implements C3573c {

        /* renamed from: a */
        private final C3567jn f3498a;

        public C3572b(Context context) {
            this.f3498a = new C3567jn(context);
        }

        /* renamed from: a */
        public C3566jm mo40320a() {
            return this.f3498a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.jo$a */
    static class C3571a implements C3573c {

        /* renamed from: a */
        private final C3561jl f3497a;

        public C3571a(Context context) {
            this.f3497a = new C3561jl(context);
        }

        /* renamed from: a */
        public C3566jm mo40320a() {
            return this.f3497a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3570jo(Context context) {
        this(Build.VERSION.SDK_INT >= 26 ? new C3571a(context) : new C3572b(context));
    }

    C3570jo(C3573c cVar) {
        this.f3496a = cVar;
    }

    /* renamed from: a */
    public C3566jm mo40319a() {
        return this.f3496a.mo40320a();
    }
}
