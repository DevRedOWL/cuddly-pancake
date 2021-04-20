package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.common.PlayCoreVersion;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2251aq;
import com.google.android.play.core.internal.C2277bp;
import com.google.android.play.core.internal.C2305o;
import com.google.android.play.core.splitcompat.C2345p;
import com.google.android.play.core.tasks.C2415i;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;

/* renamed from: com.google.android.play.core.appupdate.o */
final class C2109o {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C2241ag f1445b = new C2241ag("AppUpdateService");

    /* renamed from: c */
    private static final Intent f1446c = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    C2251aq<C2305o> f1447a;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f1448d;

    /* renamed from: e */
    private final Context f1449e;

    /* renamed from: f */
    private final C2111q f1450f;

    public C2109o(Context context, C2111q qVar) {
        this.f1448d = context.getPackageName();
        this.f1449e = context;
        this.f1450f = qVar;
        if (C2277bp.m1260a(context)) {
            this.f1447a = new C2251aq(C2345p.m1447c(context), f1445b, "AppUpdateService", f1446c, C2103i.f1433a);
        }
    }

    /* renamed from: d */
    static /* synthetic */ Bundle m787d(C2109o oVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(m793j());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(oVar.f1449e.getPackageManager().getPackageInfo(oVar.f1449e.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f1445b.mo33809b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: h */
    static /* synthetic */ AppUpdateInfo m791h(C2109o oVar, Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        return AppUpdateInfo.m763a(str, bundle2.getInt("version.code", -1), bundle2.getInt("update.availability"), bundle2.getInt("install.status", 0), bundle2.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle2.getInt("client.version.staleness")), bundle2.getInt("in.app.update.priority", 0), bundle2.getLong("bytes.downloaded"), bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), oVar.f1450f.mo33534a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"));
    }

    /* renamed from: i */
    private static <T> Task<T> m792i() {
        f1445b.mo33809b("onError(%d)", -9);
        return Tasks.m1600b(new InstallException(-9));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static Bundle m793j() {
        Bundle bundle = new Bundle();
        bundle.putAll(PlayCoreVersion.m1116b("app_update"));
        bundle.putInt("playcore.version.code", 10901);
        return bundle;
    }

    /* renamed from: a */
    public final Task<AppUpdateInfo> mo33532a(String str) {
        if (this.f1447a == null) {
            return m792i();
        }
        f1445b.mo33811d("requestUpdateInfo(%s)", str);
        C2415i iVar = new C2415i();
        this.f1447a.mo33819a(new C2104j(this, iVar, str, iVar));
        return iVar.mo34074c();
    }

    /* renamed from: b */
    public final Task<Void> mo33533b(String str) {
        if (this.f1447a == null) {
            return m792i();
        }
        f1445b.mo33811d("completeUpdate(%s)", str);
        C2415i iVar = new C2415i();
        this.f1447a.mo33819a(new C2105k(this, iVar, iVar, str));
        return iVar.mo34074c();
    }
}
