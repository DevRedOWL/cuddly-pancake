package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.t */
final class C2390t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SplitInstallRequest f2134a;

    /* renamed from: b */
    final /* synthetic */ C2402v f2135b;

    C2390t(C2402v vVar, SplitInstallRequest splitInstallRequest) {
        this.f2135b = vVar;
        this.f2134a = splitInstallRequest;
    }

    public final void run() {
        C2389s d = this.f2135b.f2186b;
        List<String> moduleNames = this.f2134a.getModuleNames();
        List c = C2402v.m1589e(this.f2134a.getLanguages());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt(NotificationCompat.CATEGORY_STATUS, 5);
        bundle.putInt("error_code", 0);
        if (!moduleNames.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList(moduleNames));
        }
        if (!c.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList(c));
        }
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        d.mo34038k(SplitInstallSessionState.m1454d(bundle));
    }
}
