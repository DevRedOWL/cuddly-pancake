package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.model.C2383a;
import com.google.android.play.core.tasks.C2416j;

public class SplitInstallException extends C2416j {

    /* renamed from: a */
    private final int f2042a;

    public SplitInstallException(int i) {
        super(String.format("Split Install Error(%d): %s", new Object[]{Integer.valueOf(i), C2383a.m1534a(i)}));
        if (i != 0) {
            this.f2042a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    public int getErrorCode() {
        return this.f2042a;
    }
}
