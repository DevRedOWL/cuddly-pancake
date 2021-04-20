package com.yandex.metrica.push.impl;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.metrica.push.PushService;

/* renamed from: com.yandex.metrica.push.impl.bj */
class C4360bj implements C4394j {

    /* renamed from: a */
    private final Context f5472a;

    /* renamed from: b */
    private final C4367bq f5473b;

    /* renamed from: c */
    private final String f5474c;

    /* renamed from: d */
    private FirebaseInstanceId f5475d;

    C4360bj(Context context) {
        this(context, new C4364bn(context));
    }

    C4360bj(Context context, C4368br brVar) {
        this.f5472a = context;
        this.f5473b = brVar.mo42000d();
        this.f5474c = brVar.mo42001e();
    }

    /* renamed from: a */
    public void mo41986a() {
        if (m6383f()) {
            this.f5475d = FirebaseInstanceId.getInstance(mo41985a(mo41989d().mo41996b()));
            PushService.m6275b(this.f5472a);
            return;
        }
        C4376by.m6446b("Google play services not available", new Object[0]);
        C4379ca.m6456c().mo42015a("Google play services not available");
    }

    /* renamed from: f */
    private boolean m6383f() {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f5472a) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public FirebaseApp mo41985a(FirebaseOptions firebaseOptions) {
        try {
            FirebaseApp.initializeApp(this.f5472a, firebaseOptions);
        } catch (Throwable unused) {
        }
        return FirebaseApp.getInstance();
    }

    /* renamed from: b */
    public String mo41987b() {
        try {
            return this.f5475d.getToken(mo41989d().mo41995a(), FirebaseMessaging.INSTANCE_ID_SCOPE);
        } catch (Exception e) {
            C4376by.m6445a(e, "Trying getting push token failed", new Object[0]);
            C4379ca.m6456c().mo42016a("Getting push token failed", (Throwable) e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Context mo41988c() {
        return this.f5472a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C4367bq mo41989d() {
        return this.f5473b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo41990e() {
        return this.f5474c;
    }
}
