package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.metrica.push.YandexMetricaPush;

/* renamed from: com.yandex.metrica.push.impl.q */
public class C4407q {
    /* renamed from: a */
    public Intent mo42172a(Context context, String str) {
        Intent intent;
        if (C4380cb.m6473b(str)) {
            intent = m6661a(context);
        } else {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        }
        if (intent != null) {
            intent.addFlags(268435456);
            intent.addFlags(67108864);
        }
        return intent;
    }

    /* renamed from: a */
    private static Intent m6661a(Context context) {
        Intent intent = null;
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (!(launchIntentForPackage == null || launchIntentForPackage.getComponent() == null)) {
                try {
                    intent = new Intent(context, Class.forName(launchIntentForPackage.getComponent().getClassName()));
                } catch (ClassNotFoundException unused) {
                    intent = launchIntentForPackage;
                }
                intent.setAction(YandexMetricaPush.OPEN_DEFAULT_ACTIVITY_ACTION);
            }
        } catch (Exception unused2) {
        }
        return intent;
    }
}
