package com.yandex.metrica;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yandex.metrica.impl.p039ob.C3306cx;
import com.yandex.metrica.impl.p039ob.C3561jl;

public class ConfigurationServiceReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "com.yandex.metrica.configuration.service.PLC".equals(intent.getAction()) && C3306cx.m2857a(26)) {
            new C3561jl(context).mo40312b(intent.getExtras());
        }
    }
}
