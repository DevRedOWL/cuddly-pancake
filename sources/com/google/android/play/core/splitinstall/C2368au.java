package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2251aq;
import com.google.android.play.core.internal.C2273bl;
import com.google.android.play.core.internal.C2277bp;
import com.google.android.play.core.splitcompat.C2345p;
import com.google.android.play.core.tasks.C2415i;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.au */
final class C2368au {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C2241ag f2087b = new C2241ag("SplitInstallService");

    /* renamed from: c */
    private static final Intent f2088c = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    C2251aq<C2273bl> f2089a;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f2090d;

    public C2368au(Context context) {
        this.f2090d = context.getPackageName();
        if (C2277bp.m1260a(context)) {
            this.f2089a = new C2251aq(C2345p.m1447c(context), f2087b, "SplitInstallService", f2088c, C2350ac.f2060a);
        }
    }

    /* renamed from: i */
    static /* synthetic */ ArrayList m1492i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: j */
    static /* synthetic */ ArrayList m1493j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("language", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: l */
    static /* synthetic */ Bundle m1495l() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10901);
        return bundle;
    }

    /* renamed from: n */
    private static <T> Task<T> m1497n() {
        f2087b.mo33809b("onError(%d)", -14);
        return Tasks.m1600b(new SplitInstallException(-14));
    }

    /* renamed from: a */
    public final Task<Integer> mo34010a(Collection<String> collection, Collection<String> collection2) {
        if (this.f2089a == null) {
            return m1497n();
        }
        f2087b.mo33811d("startInstall(%s,%s)", collection, collection2);
        C2415i iVar = new C2415i();
        this.f2089a.mo33819a(new C2351ad(this, iVar, collection, collection2, iVar));
        return iVar.mo34074c();
    }

    /* renamed from: b */
    public final Task<Void> mo34011b(List<String> list) {
        if (this.f2089a == null) {
            return m1497n();
        }
        f2087b.mo33811d("deferredUninstall(%s)", list);
        C2415i iVar = new C2415i();
        this.f2089a.mo33819a(new C2352ae(this, iVar, list, iVar));
        return iVar.mo34074c();
    }

    /* renamed from: c */
    public final Task<Void> mo34012c(List<String> list) {
        if (this.f2089a == null) {
            return m1497n();
        }
        f2087b.mo33811d("deferredInstall(%s)", list);
        C2415i iVar = new C2415i();
        this.f2089a.mo33819a(new C2353af(this, iVar, list, iVar));
        return iVar.mo34074c();
    }

    /* renamed from: d */
    public final Task<Void> mo34013d(List<String> list) {
        if (this.f2089a == null) {
            return m1497n();
        }
        f2087b.mo33811d("deferredLanguageInstall(%s)", list);
        C2415i iVar = new C2415i();
        this.f2089a.mo33819a(new C2354ag(this, iVar, list, iVar));
        return iVar.mo34074c();
    }

    /* renamed from: e */
    public final Task<Void> mo34014e(List<String> list) {
        if (this.f2089a == null) {
            return m1497n();
        }
        f2087b.mo33811d("deferredLanguageUninstall(%s)", list);
        C2415i iVar = new C2415i();
        this.f2089a.mo33819a(new C2355ah(this, iVar, list, iVar));
        return iVar.mo34074c();
    }

    /* renamed from: f */
    public final Task<SplitInstallSessionState> mo34015f(int i) {
        if (this.f2089a == null) {
            return m1497n();
        }
        f2087b.mo33811d("getSessionState(%d)", Integer.valueOf(i));
        C2415i iVar = new C2415i();
        this.f2089a.mo33819a(new C2356ai(this, iVar, i, iVar));
        return iVar.mo34074c();
    }

    /* renamed from: g */
    public final Task<List<SplitInstallSessionState>> mo34016g() {
        if (this.f2089a == null) {
            return m1497n();
        }
        f2087b.mo33811d("getSessionStates", new Object[0]);
        C2415i iVar = new C2415i();
        this.f2089a.mo33819a(new C2357aj(this, iVar, iVar));
        return iVar.mo34074c();
    }

    /* renamed from: h */
    public final Task<Void> mo34017h(int i) {
        if (this.f2089a == null) {
            return m1497n();
        }
        f2087b.mo33811d("cancelInstall(%d)", Integer.valueOf(i));
        C2415i iVar = new C2415i();
        this.f2089a.mo33819a(new C2358ak(this, iVar, i, iVar));
        return iVar.mo34074c();
    }
}
