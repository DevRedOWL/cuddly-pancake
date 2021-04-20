package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2289ca;
import com.google.android.play.core.listener.C2318b;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.aq */
final class C2135aq extends C2318b<AssetPackState> {

    /* renamed from: c */
    private final C2171bz f1549c;

    /* renamed from: d */
    private final C2156bk f1550d;

    /* renamed from: e */
    private final C2289ca<C2220s> f1551e;

    /* renamed from: f */
    private final C2149bd f1552f;

    /* renamed from: g */
    private final C2159bn f1553g;

    /* renamed from: h */
    private final C2289ca<Executor> f1554h;

    /* renamed from: i */
    private final C2289ca<Executor> f1555i;

    /* renamed from: j */
    private final Handler f1556j = new Handler(Looper.getMainLooper());

    C2135aq(Context context, C2171bz bzVar, C2156bk bkVar, C2289ca<C2220s> caVar, C2159bn bnVar, C2149bd bdVar, C2289ca<Executor> caVar2, C2289ca<Executor> caVar3) {
        super(new C2241ag("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f1549c = bzVar;
        this.f1550d = bkVar;
        this.f1551e = caVar;
        this.f1553g = bnVar;
        this.f1552f = bdVar;
        this.f1554h = caVar2;
        this.f1555i = caVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33522a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f1980a.mo33809b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            AssetPackState c = AssetPackState.m816c(bundleExtra, stringArrayList.get(0), this.f1553g, C2137as.f1558b);
            this.f1980a.mo33808a("ListenerRegistryBroadcastReceiver.onReceive: %s", c);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f1552f.mo33686a(pendingIntent);
            }
            this.f1555i.mo33869a().execute(new C2133ao(this, bundleExtra, c));
            this.f1554h.mo33869a().execute(new C2134ap(this, bundleExtra));
            return;
        }
        this.f1980a.mo33809b("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo33626b(AssetPackState assetPackState) {
        this.f1556j.post(new C2132an(this, assetPackState));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo33627c(Bundle bundle) {
        if (this.f1549c.mo33704d(bundle)) {
            this.f1550d.mo33692a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo33628d(Bundle bundle, AssetPackState assetPackState) {
        if (this.f1549c.mo33705e(bundle)) {
            mo33626b(assetPackState);
            this.f1551e.mo33869a().mo33622j();
        }
    }
}
