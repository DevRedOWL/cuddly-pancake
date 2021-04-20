package com.google.android.play.core.splitinstall;

import android.content.Context;

public final class InternalFrameworkListenerExtensions {
    private InternalFrameworkListenerExtensions() {
    }

    public static void registerFrameworkListener(Context context, SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        C2380k.m1526a(context).mo34022a().mo33973a(splitInstallStateUpdatedListener);
    }

    public static void unregisterFrameworkListener(Context context, SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        C2380k.m1526a(context).mo34022a().mo33974b(splitInstallStateUpdatedListener);
    }
}
