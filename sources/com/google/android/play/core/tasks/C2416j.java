package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.j */
public abstract class C2416j extends RuntimeException {
    public C2416j(String str) {
        super(str);
    }

    public C2416j(Throwable th) {
        super(th);
    }

    public abstract int getErrorCode();
}
