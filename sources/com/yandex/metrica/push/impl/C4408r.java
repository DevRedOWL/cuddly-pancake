package com.yandex.metrica.push.impl;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.yandex.metrica.push.YandexMetricaPush;
import com.yandex.metrica.push.core.notification.MetricaPushBroadcastReceiver;
import com.yandex.metrica.push.core.notification.TtlBroadcastReceiver;
import com.yandex.metrica.push.impl.C4399n;
import com.yandex.metrica.push.impl.C4403p;

/* renamed from: com.yandex.metrica.push.impl.r */
public class C4408r extends C4422z {

    /* renamed from: a */
    private final C4407q f5644a = new C4407q();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo42174a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public NotificationCompat.Builder mo42176a(Context context, C4402o oVar) {
        String str;
        String str2;
        if (oVar.mo42124e() == null) {
            str = null;
        } else {
            str = oVar.mo42124e().mo42139f();
        }
        if (oVar.mo42124e() == null) {
            str2 = null;
        } else {
            str2 = oVar.mo42124e().mo42141h();
        }
        if (C4380cb.m6473b(str) || C4380cb.m6473b(str2)) {
            return null;
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        mo42180a(context, builder, oVar);
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo42180a(Context context, NotificationCompat.Builder builder, C4402o oVar) {
        mo42181a(builder, oVar);
        mo42183b(builder, oVar);
        mo42182b(context, builder, oVar);
        mo42185c(builder, oVar);
        mo42187d(builder, oVar);
        mo42189e(builder, oVar);
        mo42191f(builder, oVar);
        mo42193g(builder, oVar);
        mo42195h(builder, oVar);
        mo42196i(builder, oVar);
        mo42197j(builder, oVar);
        mo42198k(builder, oVar);
        mo42199l(builder, oVar);
        mo42200m(builder, oVar);
        mo42201n(builder, oVar);
        mo42202o(builder, oVar);
        mo42203p(builder, oVar);
        mo42204q(builder, oVar);
        mo42205r(builder, oVar);
        mo42206s(builder, oVar);
        mo42207t(builder, oVar);
        mo42208u(builder, oVar);
        mo42209v(builder, oVar);
        mo42210w(builder, oVar);
        mo42184c(context, builder, oVar);
        mo42211x(builder, oVar);
        mo42192g(context, builder, oVar);
        mo42194h(context, builder, oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42181a(NotificationCompat.Builder builder, C4402o oVar) {
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        if (oVar.mo42124e() != null && oVar.mo42124e().mo42129B()) {
            builder.setSound(defaultUri);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42183b(NotificationCompat.Builder builder, C4402o oVar) {
        Bitmap bitmap;
        if (oVar.mo42124e() == null) {
            bitmap = null;
        } else {
            bitmap = oVar.mo42124e().mo42159z();
        }
        if (bitmap != null) {
            builder.setLargeIcon(bitmap);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42182b(Context context, NotificationCompat.Builder builder, C4402o oVar) {
        Integer num = null;
        Integer x = oVar.mo42124e() == null ? null : oVar.mo42124e().mo42157x();
        if (x == null) {
            Bundle a = C4380cb.m6467a(context);
            if (a != null && a.containsKey("com.yandex.metrica.push.default_notification_icon")) {
                num = Integer.valueOf(a.getInt("com.yandex.metrica.push.default_notification_icon"));
            }
            x = num;
        }
        if (x == null) {
            x = Integer.valueOf(context.getApplicationInfo().icon);
        }
        builder.setSmallIcon(x.intValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo42185c(NotificationCompat.Builder builder, C4402o oVar) {
        Boolean bool;
        if (oVar.mo42124e() == null) {
            bool = null;
        } else {
            bool = oVar.mo42124e().mo42137d();
        }
        if (bool != null) {
            builder.setAutoCancel(bool.booleanValue());
        } else {
            builder.setAutoCancel(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo42187d(NotificationCompat.Builder builder, C4402o oVar) {
        String str;
        if (oVar.mo42124e() == null) {
            str = null;
        } else {
            str = oVar.mo42124e().mo42136c();
        }
        if (!TextUtils.isEmpty(str)) {
            builder.setCategory(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo42189e(NotificationCompat.Builder builder, C4402o oVar) {
        Integer e = oVar.mo42124e() == null ? null : oVar.mo42124e().mo42138e();
        if (e != null) {
            builder.setColor(e.intValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo42191f(NotificationCompat.Builder builder, C4402o oVar) {
        String str;
        if (oVar.mo42124e() == null) {
            str = null;
        } else {
            str = oVar.mo42124e().mo42139f();
        }
        if (!C4380cb.m6473b(str)) {
            builder.setContentTitle(mo42175a(str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo42193g(NotificationCompat.Builder builder, C4402o oVar) {
        String str;
        if (oVar.mo42124e() == null) {
            str = null;
        } else {
            str = oVar.mo42124e().mo42140g();
        }
        if (!C4380cb.m6473b(str)) {
            builder.setContentInfo(mo42175a(str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo42195h(NotificationCompat.Builder builder, C4402o oVar) {
        String str;
        if (oVar.mo42124e() == null) {
            str = null;
        } else {
            str = oVar.mo42124e().mo42141h();
        }
        if (!C4380cb.m6473b(str)) {
            builder.setContentText(mo42175a(str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo42196i(NotificationCompat.Builder builder, C4402o oVar) {
        String str;
        if (oVar.mo42124e() == null) {
            str = null;
        } else {
            str = oVar.mo42124e().mo42142i();
        }
        if (!C4380cb.m6473b(str)) {
            builder.setSubText(mo42175a(str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo42197j(NotificationCompat.Builder builder, C4402o oVar) {
        String str;
        if (oVar.mo42124e() == null) {
            str = null;
        } else {
            str = oVar.mo42124e().mo42143j();
        }
        if (!C4380cb.m6473b(str)) {
            builder.setTicker(mo42175a(str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo42198k(NotificationCompat.Builder builder, C4402o oVar) {
        Integer num;
        if (oVar.mo42124e() == null) {
            num = null;
        } else {
            num = oVar.mo42124e().mo42144k();
        }
        if (num != null) {
            builder.setDefaults(num.intValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo42199l(NotificationCompat.Builder builder, C4402o oVar) {
        String m = oVar.mo42124e() == null ? null : oVar.mo42124e().mo42146m();
        if (!C4380cb.m6473b(m)) {
            builder.setGroup(m);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo42200m(NotificationCompat.Builder builder, C4402o oVar) {
        Boolean bool;
        if (oVar.mo42124e() == null) {
            bool = null;
        } else {
            bool = oVar.mo42124e().mo42145l();
        }
        if (bool != null) {
            builder.setGroupSummary(bool.booleanValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo42201n(NotificationCompat.Builder builder, C4402o oVar) {
        C4403p.C4406b bVar;
        if (oVar.mo42124e() == null) {
            bVar = null;
        } else {
            bVar = oVar.mo42124e().mo42147n();
        }
        if (bVar != null && bVar.mo42171d()) {
            builder.setLights(bVar.mo42168a().intValue(), bVar.mo42169b().intValue(), bVar.mo42170c().intValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo42202o(NotificationCompat.Builder builder, C4402o oVar) {
        Integer num;
        if (oVar.mo42124e() == null) {
            num = null;
        } else {
            num = oVar.mo42124e().mo42148o();
        }
        if (num != null) {
            builder.setNumber(num.intValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo42203p(NotificationCompat.Builder builder, C4402o oVar) {
        Boolean bool;
        if (oVar.mo42124e() == null) {
            bool = null;
        } else {
            bool = oVar.mo42124e().mo42149p();
        }
        if (bool != null) {
            builder.setOngoing(bool.booleanValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo42204q(NotificationCompat.Builder builder, C4402o oVar) {
        Boolean bool;
        if (oVar.mo42124e() == null) {
            bool = null;
        } else {
            bool = oVar.mo42124e().mo42150q();
        }
        if (bool != null) {
            builder.setOnlyAlertOnce(bool.booleanValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo42205r(NotificationCompat.Builder builder, C4402o oVar) {
        Integer num;
        if (oVar.mo42124e() == null) {
            num = null;
        } else {
            num = oVar.mo42124e().mo42151r();
        }
        if (num != null) {
            builder.setPriority(num.intValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo42206s(NotificationCompat.Builder builder, C4402o oVar) {
        Long s = oVar.mo42124e() == null ? null : oVar.mo42124e().mo42152s();
        if (s != null) {
            builder.setWhen(s.longValue());
        } else {
            builder.setWhen(System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo42207t(NotificationCompat.Builder builder, C4402o oVar) {
        Boolean bool;
        if (oVar.mo42124e() == null) {
            bool = null;
        } else {
            bool = oVar.mo42124e().mo42153t();
        }
        if (bool != null) {
            builder.setShowWhen(bool.booleanValue());
        } else {
            builder.setShowWhen(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo42208u(NotificationCompat.Builder builder, C4402o oVar) {
        String str;
        if (oVar.mo42124e() == null) {
            str = null;
        } else {
            str = oVar.mo42124e().mo42154u();
        }
        if (!C4380cb.m6473b(str)) {
            builder.setSortKey(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo42209v(NotificationCompat.Builder builder, C4402o oVar) {
        long[] jArr;
        if (oVar.mo42124e() == null) {
            jArr = null;
        } else {
            jArr = oVar.mo42124e().mo42155v();
        }
        if (jArr != null) {
            builder.setVibrate(jArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo42210w(NotificationCompat.Builder builder, C4402o oVar) {
        Integer num;
        if (oVar.mo42124e() == null) {
            num = null;
        } else {
            num = oVar.mo42124e().mo42156w();
        }
        if (num != null) {
            builder.setVisibility(num.intValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo42211x(NotificationCompat.Builder builder, C4402o oVar) {
        C4403p e = oVar.mo42124e();
        if (e == null) {
            return;
        }
        if (e.mo42128A() == null) {
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(e.mo42141h()));
        } else {
            builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(e.mo42128A()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo42184c(Context context, NotificationCompat.Builder builder, C4402o oVar) {
        mo42186d(context, builder, oVar);
        mo42188e(context, builder, oVar);
        mo42190f(context, builder, oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo42186d(Context context, NotificationCompat.Builder builder, C4402o oVar) {
        builder.setDeleteIntent(mo42173a(context, mo42177a(C4411u.CLEAR, oVar, (String) null), C4389f.m6484a(context).mo42031f().mo42044g().f5412b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo42188e(Context context, NotificationCompat.Builder builder, C4402o oVar) {
        String str;
        boolean z = C4389f.m6484a(context).mo42031f().mo42044g().f5413c;
        if (oVar.mo42124e() == null) {
            str = null;
        } else {
            str = oVar.mo42124e().mo42130C();
        }
        builder.setContentIntent(mo42173a(context, mo42177a(C4411u.CLICK, oVar, str), z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo42190f(Context context, NotificationCompat.Builder builder, C4402o oVar) {
        C4403p.C4404a[] aVarArr;
        C4312a g = C4389f.m6484a(context).mo42031f().mo42044g();
        if (oVar.mo42124e() == null) {
            aVarArr = null;
        } else {
            aVarArr = oVar.mo42124e().mo42131D();
        }
        if (aVarArr != null && aVarArr.length > 0) {
            for (C4403p.C4404a aVar : aVarArr) {
                if (!TextUtils.isEmpty(aVar.mo42161b())) {
                    builder.addAction(aVar.mo42163d() == null ? 0 : aVar.mo42163d().intValue(), aVar.mo42161b(), mo42173a(context, mo42178a(C4411u.ADDITIONAL_ACTION, oVar, aVar.mo42162c(), aVar), g.mo41952a(aVar.mo42160a())));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo42192g(Context context, NotificationCompat.Builder builder, C4402o oVar) {
        String E = oVar.mo42124e() == null ? null : oVar.mo42124e().mo42132E();
        if (C4380cb.m6473b(E)) {
            mo42179a(context);
            E = "yandex_metrica_push_v2";
        }
        builder.setChannelId(E);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo42194h(Context context, NotificationCompat.Builder builder, C4402o oVar) {
        Integer num;
        String str;
        Long l = null;
        if (C4380cb.m6470a(26)) {
            if (oVar.mo42124e() != null) {
                l = oVar.mo42124e().mo42158y();
            }
            if (l != null) {
                builder.setTimeoutAfter(l.longValue());
                return;
            }
            return;
        }
        if (oVar.mo42124e() == null) {
            num = null;
        } else {
            num = oVar.mo42124e().mo42135b();
        }
        if (oVar.mo42124e() == null) {
            str = null;
        } else {
            str = oVar.mo42124e().mo42134a();
        }
        if (oVar.mo42124e() != null) {
            l = oVar.mo42124e().mo42158y();
        }
        if (num != null && l != null) {
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, m6663b(context), new Intent(context, TtlBroadcastReceiver.class).putExtra("com.yandex.metrica.push.extra.PUSH_ID", oVar.mo42121b()).putExtra("com.yandex.metrica.push.extra.NOTIFICATION_ID", num).putExtra("com.yandex.metrica.push.extra.NOTIFICATION_TAG", str), 268435456);
            if (alarmManager != null) {
                alarmManager.set(1, System.currentTimeMillis() + l.longValue(), broadcast);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PendingIntent mo42173a(Context context, C4399n nVar, boolean z) {
        Intent a = !z ? this.f5644a.mo42172a(context, nVar.f5557b) : null;
        if (a == null) {
            a = new Intent(MetricaPushBroadcastReceiver.ACTION_BROADCAST_ACTION);
            a.putExtra("com.yandex.metrica.push.extra.ACTION_INFO", nVar);
            a.setPackage(context.getPackageName());
        } else {
            a.putExtra(YandexMetricaPush.EXTRA_ACTION_INFO, new C4378c(nVar).mo42019a());
            if (nVar.f5565j != null) {
                a.putExtras(nVar.f5565j);
            }
            if (nVar.f5566k) {
                a.setPackage(context.getPackageName());
            }
            a.putExtra(YandexMetricaPush.EXTRA_PAYLOAD, nVar.f5558c);
        }
        int b = m6663b(context);
        if (z) {
            return PendingIntent.getBroadcast(context, b, a, 268435456);
        }
        return PendingIntent.getActivity(context, b, a, 268435456);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4399n mo42177a(C4411u uVar, C4402o oVar, String str) {
        return mo42178a(uVar, oVar, str, (C4403p.C4404a) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4399n mo42178a(C4411u uVar, C4402o oVar, String str, C4403p.C4404a aVar) {
        String str2;
        Integer num;
        int i;
        Boolean bool = null;
        if (oVar.mo42124e() == null) {
            str2 = null;
        } else {
            str2 = oVar.mo42124e().mo42134a();
        }
        if (oVar.mo42124e() == null) {
            num = null;
        } else {
            num = oVar.mo42124e().mo42135b();
        }
        if (oVar.mo42124e() != null) {
            bool = oVar.mo42124e().mo42133F();
        }
        C4399n.C4401a e = C4399n.m6586a().mo42115c(oVar.mo42123d()).mo42110a(oVar.mo42121b()).mo42109a(uVar).mo42113b(str).mo42119e(str2);
        boolean z = false;
        if (num == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        C4399n.C4401a a = e.mo42107a(i).mo42108a(mo42174a());
        if (aVar != null) {
            a.mo42117d(aVar.mo42160a());
            if (aVar.mo42164e() != null) {
                a.mo42111a(aVar.mo42164e().booleanValue());
            }
            if (aVar.mo42165f() != null) {
                a.mo42114b(aVar.mo42165f().booleanValue());
            }
            if (aVar.mo42167h() != null) {
                if (aVar.mo42167h() == C4403p.C4404a.C4405a.OPEN_APP_URI) {
                    bool = Boolean.TRUE;
                }
                if (aVar.mo42167h() == C4403p.C4404a.C4405a.DO_NOTHING) {
                    a.mo42118d(true);
                }
            } else {
                bool = aVar.mo42166g();
            }
        }
        if (bool != null) {
            z = bool.booleanValue();
        }
        a.mo42116c(z);
        return a.mo42112a();
    }

    /* renamed from: b */
    private static int m6663b(Context context) {
        C4391h e = C4389f.m6484a(context).mo42030e();
        int b = e.mo42063b(0);
        if (b < 1512312345 || b > 1512322343) {
            b = 1512312345;
        }
        int i = b + 1;
        e.mo42055a(i);
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Spanned mo42175a(String str) {
        return Html.fromHtml(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42179a(Context context) {
        C4389f.m6484a(context).mo42033h().mo42215b();
    }
}
