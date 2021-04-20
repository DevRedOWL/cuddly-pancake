package com.yandex.metrica.push;

import android.app.NotificationChannel;
import android.content.Context;
import com.yandex.metrica.push.impl.C4389f;

public final class YandexMetricaPush {
    public static final String EXTRA_ACTION_INFO = ".extra.ACTION_INFO";
    public static final String EXTRA_PAYLOAD = ".extra.payload";
    public static final String OPEN_DEFAULT_ACTIVITY_ACTION = "com.yandex.metrica.push.action.OPEN";

    /* renamed from: a */
    private static volatile C4389f f5409a;

    /* renamed from: b */
    private static final Object f5410b = new Object();

    private YandexMetricaPush() {
    }

    public static synchronized void init(Context context) {
        synchronized (YandexMetricaPush.class) {
            if (f5409a == null) {
                synchronized (f5410b) {
                    if (f5409a == null) {
                        C4389f a = C4389f.m6484a(context);
                        a.mo42024a();
                        f5409a = a;
                    }
                }
            }
        }
    }

    public static synchronized String getToken() {
        String c;
        synchronized (YandexMetricaPush.class) {
            synchronized (f5410b) {
                m6286a();
            }
            c = f5409a.mo42028c();
        }
        return c;
    }

    /* renamed from: a */
    private static void m6286a() {
        if (f5409a == null) {
            throw new IllegalStateException("MetricaPush should be initialized by calling MetricaPush.init(Context).");
        }
    }

    public static synchronized NotificationChannel getDefaultNotificationChannel() {
        NotificationChannel i;
        synchronized (YandexMetricaPush.class) {
            synchronized (f5410b) {
                m6286a();
            }
            i = f5409a.mo42034i();
        }
        return i;
    }
}
