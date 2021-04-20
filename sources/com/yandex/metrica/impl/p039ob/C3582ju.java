package com.yandex.metrica.impl.p039ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.ju */
public class C3582ju {

    /* renamed from: a */
    private Context f3511a;

    /* renamed from: b */
    private ServiceConnection f3512b;

    /* renamed from: c */
    private final C4281yc f3513c;

    public C3582ju(Context context) {
        this(context, new ServiceConnection() {
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }

            public void onServiceDisconnected(ComponentName componentName) {
            }
        }, new C4281yc());
    }

    /* renamed from: a */
    public void mo40333a(String str) {
        Intent a;
        if (!TextUtils.isEmpty(str) && (a = m3662a(this.f3511a, str)) != null) {
            this.f3511a.bindService(a, this.f3512b, 1);
        }
    }

    /* renamed from: a */
    public void mo40332a() {
        this.f3511a.unbindService(this.f3512b);
    }

    /* renamed from: a */
    private Intent m3662a(Context context, String str) {
        try {
            ResolveInfo resolveService = context.getPackageManager().resolveService(m3661a(context).setPackage(str), 0);
            if (resolveService != null) {
                return new Intent().setClassName(resolveService.serviceInfo.packageName, resolveService.serviceInfo.name).setAction("com.yandex.metrica.ACTION_C_BG_L");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private Intent m3661a(Context context) {
        Intent intent = new Intent("com.yandex.metrica.IMetricaService", Uri.parse("metrica://" + context.getPackageName()));
        m3663a(intent);
        return intent;
    }

    /* renamed from: a */
    private void m3663a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 12) {
            m3664b(intent);
        }
    }

    /* renamed from: b */
    private void m3664b(Intent intent) {
        intent.addFlags(32);
    }

    C3582ju(Context context, ServiceConnection serviceConnection, C4281yc ycVar) {
        this.f3511a = context;
        this.f3512b = serviceConnection;
        this.f3513c = ycVar;
    }
}
