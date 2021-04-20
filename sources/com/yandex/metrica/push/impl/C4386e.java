package com.yandex.metrica.push.impl;

/* renamed from: com.yandex.metrica.push.impl.e */
public interface C4386e {

    /* renamed from: com.yandex.metrica.push.impl.e$b */
    public enum C4388b {
        SHOW,
        SILENCE
    }

    /* renamed from: a */
    C4387a mo41961a(C4402o oVar);

    /* renamed from: com.yandex.metrica.push.impl.e$a */
    public static class C4387a {

        /* renamed from: d */
        private static final C4387a f5502d = new C4387a(C4388b.SHOW, (String) null, (String) null);

        /* renamed from: a */
        public final C4388b f5503a;

        /* renamed from: b */
        public final String f5504b;

        /* renamed from: c */
        public final String f5505c;

        /* renamed from: a */
        public static C4387a m6482a() {
            return f5502d;
        }

        /* renamed from: a */
        public static C4387a m6483a(String str, String str2) {
            return new C4387a(C4388b.SILENCE, str, str2);
        }

        private C4387a(C4388b bVar, String str, String str2) {
            this.f5503a = bVar;
            this.f5504b = str;
            this.f5505c = str2;
        }
    }
}
