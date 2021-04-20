package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.C2380k;
import com.google.android.play.core.splitinstall.C2386p;
import java.io.File;

public class FakeSplitInstallManagerFactory {

    /* renamed from: a */
    private static FakeSplitInstallManager f2152a;

    public static FakeSplitInstallManager create(Context context) {
        try {
            File b = C2380k.m1526a(context).mo34023b();
            if (b == null) {
                throw new LocalTestingException("Failed to retrieve local testing directory path");
            } else if (b.exists()) {
                return create(context, b);
            } else {
                throw new LocalTestingException(String.format("Local testing directory not found: %s", new Object[]{b}));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized FakeSplitInstallManager create(Context context, File file) {
        FakeSplitInstallManager fakeSplitInstallManager;
        synchronized (FakeSplitInstallManagerFactory.class) {
            if (f2152a == null) {
                f2152a = createNewInstance(context, file);
            } else if (!f2152a.mo34040c().getAbsolutePath().equals(file.getAbsolutePath())) {
                throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", new Object[]{f2152a.mo34040c().getAbsolutePath(), file.getAbsolutePath()}));
            }
            fakeSplitInstallManager = f2152a;
        }
        return fakeSplitInstallManager;
    }

    public static FakeSplitInstallManager createNewInstance(Context context, File file) {
        SplitCompat.install(context);
        return new FakeSplitInstallManager(context, file, new C2386p(context, context.getPackageName()));
    }
}
