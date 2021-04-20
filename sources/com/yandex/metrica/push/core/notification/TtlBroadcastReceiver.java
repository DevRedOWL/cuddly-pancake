package com.yandex.metrica.push.core.notification;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.metrica.push.impl.C4376by;
import com.yandex.metrica.push.impl.C4380cb;
import com.yandex.metrica.push.impl.C4389f;

public class TtlBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("com.yandex.metrica.push.extra.PUSH_ID");
            int i = extras.getInt("com.yandex.metrica.push.extra.NOTIFICATION_ID");
            String string2 = extras.getString("com.yandex.metrica.push.extra.NOTIFICATION_TAG");
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                C4376by.m6447c("Canceling notification with id %d", Integer.valueOf(i));
                notificationManager.cancel(string2, i);
                if (!C4380cb.m6473b(string)) {
                    C4389f.m6484a(context).mo42031f().mo42043f().mo41970b(string, "by ttl");
                }
            }
        }
    }
}
