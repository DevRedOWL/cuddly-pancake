package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.listener.C2318b;

/* renamed from: com.google.android.play.core.appupdate.a */
public final class C2095a extends C2318b<InstallState> {
    public C2095a(Context context) {
        super(new C2241ag("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33522a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (!context.getPackageName().equals(intent2.getStringExtra("package.name"))) {
            this.f1980a.mo33808a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent2.getStringExtra("package.name"));
            return;
        }
        this.f1980a.mo33808a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f1980a.mo33808a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        C2241ag agVar = this.f1980a;
        agVar.mo33808a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        agVar.mo33808a("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
        agVar.mo33808a("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
        InstallState a = InstallState.m1123a(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
        this.f1980a.mo33808a("ListenerRegistryBroadcastReceiver.onReceive: %s", a);
        mo33921i(a);
    }
}
