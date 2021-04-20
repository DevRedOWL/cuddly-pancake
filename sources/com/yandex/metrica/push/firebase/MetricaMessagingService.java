package com.yandex.metrica.push.firebase;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.yandex.metrica.push.PushService;
import com.yandex.metrica.push.impl.C4376by;
import com.yandex.metrica.push.impl.C4379ca;
import java.util.Map;

public class MetricaMessagingService extends FirebaseMessagingService {
    public static final String EVENT_PUSH_RECEIVED = "FirebaseMessagingService receive push";

    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        processPush((Context) this, remoteMessage);
    }

    public void onNewToken(String str) {
        C4379ca.m6456c().mo42015a("FirebaseInstanceIdService refresh token");
        PushService.m6276c(this);
    }

    public void processPush(Context context, RemoteMessage remoteMessage) {
        String from = remoteMessage.getFrom();
        Map<String, String> data = remoteMessage.getData();
        Bundle bundle = new Bundle();
        if (data != null) {
            for (Map.Entry next : data.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
        }
        C4376by.m6444a("Receive\nfrom: %s\nfullData: %s", from, bundle);
        processPush(context, bundle);
    }

    public void processPush(Context context, Bundle bundle) {
        C4379ca.m6456c().mo42015a(EVENT_PUSH_RECEIVED);
        PushService.m6272a(context, bundle);
    }
}
