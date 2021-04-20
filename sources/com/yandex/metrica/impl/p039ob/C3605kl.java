package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.kl */
public class C3605kl {

    /* renamed from: a */
    public final String f3555a;

    /* renamed from: b */
    public final Throwable f3556b;

    /* renamed from: c */
    public final C3599kg f3557c;

    /* renamed from: d */
    public final String f3558d;

    /* renamed from: e */
    public final Boolean f3559e;

    public C3605kl(Throwable th, C3599kg kgVar, String str, Boolean bool) {
        this.f3556b = th;
        if (th == null) {
            this.f3555a = "";
        } else {
            this.f3555a = th.getClass().getName();
        }
        this.f3557c = kgVar;
        this.f3558d = str;
        this.f3559e = bool;
    }

    @Deprecated
    /* renamed from: a */
    public Throwable mo40351a() {
        return this.f3556b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Throwable th = this.f3556b;
        if (th != null) {
            for (StackTraceElement stackTraceElement : C3306cx.m2871b(th)) {
                sb.append("at " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")\n");
            }
        }
        return "UnhandledException{errorName='" + this.f3555a + '\'' + ", exception=" + this.f3556b + "\n" + sb.toString() + '}';
    }
}
