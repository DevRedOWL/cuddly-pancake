package com.google.android.play.core.missingsplits;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

@Deprecated
public class MissingSplitsManagerFactory {

    /* renamed from: a */
    private static final AtomicReference<Boolean> f1986a = new AtomicReference<>((Object) null);

    @Deprecated
    public static MissingSplitsManager create(Context context) {
        return new C2320b(context, Runtime.getRuntime(), new C2319a(context, context.getPackageManager()), f1986a);
    }
}
