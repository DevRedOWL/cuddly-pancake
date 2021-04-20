package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.cc */
public final class C2291cc<T> implements C2293ce, C2289ca {

    /* renamed from: a */
    private static final Object f1964a = new Object();

    /* renamed from: b */
    private volatile C2293ce<T> f1965b;

    /* renamed from: c */
    private volatile Object f1966c = f1964a;

    private C2291cc(C2293ce<T> ceVar) {
        this.f1965b = ceVar;
    }

    /* renamed from: b */
    public static <P extends C2293ce<T>, T> C2293ce<T> m1279b(P p) {
        C2269bh.m1220j(p);
        return p instanceof C2291cc ? p : new C2291cc(p);
    }

    /* renamed from: c */
    public static <P extends C2293ce<T>, T> C2289ca<T> m1280c(P p) {
        if (p instanceof C2289ca) {
            return (C2289ca) p;
        }
        C2269bh.m1220j(p);
        return new C2291cc(p);
    }

    /* renamed from: a */
    public final T mo33525a() {
        T t = this.f1966c;
        if (t == f1964a) {
            synchronized (this) {
                t = this.f1966c;
                if (t == f1964a) {
                    t = this.f1965b.mo33525a();
                    T t2 = this.f1966c;
                    if (t2 != f1964a && !(t2 instanceof C2292cd)) {
                        if (t2 != t) {
                            String valueOf = String.valueOf(t2);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f1966c = t;
                    this.f1965b = null;
                }
            }
        }
        return t;
    }
}
