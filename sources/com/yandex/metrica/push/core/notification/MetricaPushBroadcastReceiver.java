package com.yandex.metrica.push.core.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yandex.metrica.push.impl.C4389f;

public class MetricaPushBroadcastReceiver extends BroadcastReceiver {
    public static final String ACTION_BROADCAST_ACTION = "com.yandex.metrica.push.action.NOTIFICATION_ACTION";

    public void onReceive(Context context, Intent intent) {
        if (ACTION_BROADCAST_ACTION.equals(intent.getAction())) {
            Context applicationContext = context.getApplicationContext();
            C4389f.m6484a(applicationContext).mo42031f().mo42041d().mo42212a(applicationContext, intent);
        }
    }
}
