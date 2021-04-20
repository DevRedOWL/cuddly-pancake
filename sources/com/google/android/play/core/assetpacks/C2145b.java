package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2277bp;
import com.google.android.play.core.internal.C2313w;
import com.google.android.play.core.internal.C2316z;

/* renamed from: com.google.android.play.core.assetpacks.b */
final class C2145b extends C2313w {

    /* renamed from: a */
    private final C2241ag f1585a = new C2241ag("AssetPackExtractionService");

    /* renamed from: b */
    private final Context f1586b;

    /* renamed from: c */
    private final C2138at f1587c;

    C2145b(Context context, C2138at atVar) {
        this.f1586b = context;
        this.f1587c = atVar;
    }

    /* renamed from: d */
    private final synchronized void m934d(Bundle bundle) {
        ComponentName componentName;
        Intent intent = new Intent(this.f1586b, ExtractionForegroundService.class);
        int i = bundle.getInt("action_type");
        intent.putExtra("action_type", i);
        if (i == 1) {
            intent.putExtra("notification_channel_name", bundle.getString("notification_channel_name"));
            intent.putExtra("notification_title", bundle.getString("notification_title"));
            intent.putExtra("notification_subtext", bundle.getString("notification_subtext"));
            intent.putExtra("notification_timeout", bundle.getLong("notification_timeout"));
            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
            if (parcelable instanceof PendingIntent) {
                intent.putExtra("notification_on_click_intent", parcelable);
            }
            intent.putExtra("notification_color", bundle.getInt("notification_color"));
        }
        try {
            componentName = Build.VERSION.SDK_INT >= 26 ? this.f1586b.startForegroundService(intent) : this.f1586b.startService(intent);
        } catch (IllegalStateException | SecurityException e) {
            this.f1585a.mo33810c(e, "Failed starting installation service.", new Object[0]);
            componentName = null;
        }
        if (componentName == null) {
            this.f1585a.mo33809b("Failed starting installation service.", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo33677b(Bundle bundle, C2316z zVar) throws RemoteException {
        this.f1585a.mo33808a("updateServiceState AIDL call", new Object[0]);
        if (!C2277bp.m1260a(this.f1586b) || !C2277bp.m1261b(this.f1586b)) {
            zVar.mo33914d(new Bundle());
            return;
        }
        m934d(bundle);
        zVar.mo33913c(new Bundle(), new Bundle());
    }

    /* renamed from: c */
    public final void mo33678c(C2316z zVar) throws RemoteException {
        this.f1585a.mo33808a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!C2277bp.m1260a(this.f1586b) || !C2277bp.m1261b(this.f1586b)) {
            zVar.mo33914d(new Bundle());
            return;
        }
        this.f1587c.mo33656x();
        zVar.mo33915e(new Bundle());
    }
}
