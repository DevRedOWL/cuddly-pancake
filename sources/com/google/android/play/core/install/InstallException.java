package com.google.android.play.core.install;

import com.google.android.play.core.install.model.C2233a;
import com.google.android.play.core.tasks.C2416j;

public class InstallException extends C2416j {

    /* renamed from: a */
    private final int f1899a;

    public InstallException(int i) {
        super(String.format("Install Error(%d): %s", new Object[]{Integer.valueOf(i), C2233a.m1124a(i)}));
        if (i != 0) {
            this.f1899a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    public int getErrorCode() {
        return this.f1899a;
    }
}
