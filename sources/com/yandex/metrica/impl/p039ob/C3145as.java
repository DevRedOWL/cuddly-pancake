package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.as */
public class C3145as {
    /* renamed from: a */
    public static void m2059a() {
        m2061b();
    }

    /* renamed from: b */
    public static void m2061b() throws IllegalStateException {
        if (!m2060a("com.yandex.metrica.CounterConfiguration")) {
            throw new C3146a("\nClass com.yandex.metrica.CounterConfiguration isn't found.\nPerhaps this is due to obfuscation.\nIf you build your application with ProGuard,\nyou need to keep the Metrica for Apps.\nPlease try to use the following lines of code:\n##########################################\n-keep class com.yandex.metrica.** { *; }\n-dontwarn com.yandex.metrica.**\n##########################################");
        }
    }

    /* renamed from: a */
    public static boolean m2060a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.as$a */
    static class C3146a extends RuntimeException {
        public C3146a(String str) {
            super(str);
        }
    }
}
