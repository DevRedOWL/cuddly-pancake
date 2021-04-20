package com.yandex.metrica.push.core.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yandex.metrica.push.PushService;

public class MetricaPushNotificationStatusChangeHandler extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.app.action.APP_BLOCK_STATE_CHANGED".equals(action) || "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED".equals(action) || "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED".equals(action)) {
            PushService.m6273a(context, true);
        }
    }
}
