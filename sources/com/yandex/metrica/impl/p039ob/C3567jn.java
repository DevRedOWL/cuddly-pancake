package com.yandex.metrica.impl.p039ob;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.yandex.metrica.ConfigurationService;

/* renamed from: com.yandex.metrica.impl.ob.jn */
public class C3567jn implements C3566jm, C3574jp {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f3490a;

    /* renamed from: b */
    private final AlarmManager f3491b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4228wh f3492c;

    public C3567jn(Context context) {
        this(context, (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), new C4227wg());
    }

    /* renamed from: a */
    public void mo40310a(final long j, boolean z) {
        C3306cx.m2854a(new C4235wn<AlarmManager>() {
            /* renamed from: a */
            public void mo39902a(AlarmManager alarmManager) throws Throwable {
                C3567jn jnVar = C3567jn.this;
                alarmManager.set(3, C3567jn.this.f3492c.mo41770c() + j, jnVar.m3634a(jnVar.f3490a));
            }
        }, this.f3491b, "scheduling wakeup in [ConfigurationServiceController]", "AlarmManager");
    }

    /* renamed from: a */
    public void mo40309a() {
        C3306cx.m2854a(new C4235wn<AlarmManager>() {
            /* renamed from: a */
            public void mo39902a(AlarmManager alarmManager) throws Throwable {
                C3567jn jnVar = C3567jn.this;
                alarmManager.cancel(jnVar.m3634a(jnVar.f3490a));
            }
        }, this.f3491b, "cancelling scheduled wakeup in [ConfigurationServiceController]", "AlarmManager");
    }

    /* renamed from: a */
    public void mo40311a(Bundle bundle) {
        try {
            this.f3490a.startService(new Intent().setComponent(new ComponentName(this.f3490a.getPackageName(), ConfigurationService.class.getName())).setAction("com.yandex.metrica.configuration.ACTION_INIT").putExtras(bundle));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public PendingIntent m3634a(Context context) {
        return PendingIntent.getService(context, 7695435, m3637b(context), 134217728);
    }

    /* renamed from: b */
    private Intent m3637b(Context context) {
        return new Intent(context, ConfigurationService.class).setAction("com.yandex.metrica.configuration.ACTION_SCHEDULED_START");
    }

    C3567jn(Context context, AlarmManager alarmManager, C4228wh whVar) {
        this.f3490a = context;
        this.f3491b = alarmManager;
        this.f3492c = whVar;
    }
}
