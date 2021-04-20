package com.yandex.metrica;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3320db;
import com.yandex.metrica.impl.p039ob.C4206vr;
import com.yandex.metrica.impl.p039ob.C4216vz;
import com.yandex.metrica.impl.p039ob.C4284yf;
import com.yandex.metrica.impl.p039ob.C4285yg;
import com.yandex.metrica.impl.p039ob.C4289yk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class MetricaEventHandler extends BroadcastReceiver {

    /* renamed from: a */
    public static final Set<BroadcastReceiver> f2371a = new HashSet();

    /* renamed from: b */
    private static final C4289yk<BroadcastReceiver[]> f2372b = new C4285yg(new C4284yf("Broadcast receivers"));

    public void onReceive(Context context, Intent intent) {
        if (mo39302a(intent)) {
            mo39301a(context, intent);
        }
        C4216vz a = C4206vr.m5905a();
        for (BroadcastReceiver next : f2371a) {
            String format = String.format("Sending referrer to %s", new Object[]{next.getClass().getName()});
            if (a.mo41688c()) {
                a.mo41680a(format);
            }
            next.onReceive(context, intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo39302a(Intent intent) {
        return "com.android.vending.INSTALL_REFERRER".equals(intent.getAction());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39301a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        if (!TextUtils.isEmpty(stringExtra)) {
            C3320db.m2944a(context).mo39886a(stringExtra);
        }
    }

    /* renamed from: a */
    static void m1748a(BroadcastReceiver... broadcastReceiverArr) {
        f2372b.mo40671a(broadcastReceiverArr);
        Collections.addAll(f2371a, broadcastReceiverArr);
    }
}
