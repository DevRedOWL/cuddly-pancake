package com.yandex.metrica.impl.p039ob;

import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3623l;

/* renamed from: com.yandex.metrica.impl.ob.m */
public class C3692m {

    /* renamed from: a */
    private final Context f3811a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3543j f3812b;

    public C3692m(Context context) {
        this(context, new C3543j());
    }

    C3692m(Context context, C3543j jVar) {
        this.f3811a = context;
        this.f3812b = jVar;
    }

    /* renamed from: a */
    public C3623l mo40615a() {
        if (C3306cx.m2857a(28)) {
            return m4059b();
        }
        return null;
    }

    /* renamed from: b */
    private C3623l m4059b() {
        C36931 r1 = new C4236wo<ActivityManager, Boolean>() {
            /* renamed from: a */
            public Boolean mo39698a(ActivityManager activityManager) throws Throwable {
                return Boolean.valueOf(activityManager.isBackgroundRestricted());
            }
        };
        return new C3623l((C3623l.C3624a) C3306cx.m2841a(new C4236wo<UsageStatsManager, C3623l.C3624a>() {
            /* renamed from: a */
            public C3623l.C3624a mo39698a(UsageStatsManager usageStatsManager) {
                return C3692m.this.f3812b.mo40268a(usageStatsManager.getAppStandbyBucket());
            }
        }, (UsageStatsManager) this.f3811a.getSystemService("usagestats"), "getting app standby bucket", "usageStatsManager"), (Boolean) C3306cx.m2841a(r1, (ActivityManager) this.f3811a.getSystemService("activity"), "getting is background restricted", "activityManager"));
    }
}
