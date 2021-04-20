package p035ru.unicorn.ujin.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.yandex.metrica.push.YandexMetricaPush;

/* renamed from: ru.unicorn.ujin.receiver.YandexSilentPushReceiver */
public class YandexSilentPushReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.d("YANDEX PUSH", intent.getStringExtra(YandexMetricaPush.EXTRA_PAYLOAD));
    }
}
