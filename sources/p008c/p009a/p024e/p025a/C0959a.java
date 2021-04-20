package p008c.p009a.p024e.p025a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.access.key.TimeKey;
import org.mobileid.time_key.key_watcher.KeyWatcherBroadcastReceiver;
import p008c.p009a.p014b.C0878g;

/* renamed from: c.a.e.a.a */
public final class C0959a {

    /* renamed from: a */
    public final C0960b f1026a;

    /* renamed from: b */
    public final Context f1027b;

    public C0959a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1027b = context;
        this.f1026a = new C0960b(context);
    }

    /* renamed from: a */
    public final void mo13020a(Context context, AlarmManager alarmManager, int i, Intent intent, long j) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent, 134217728);
        if (Build.VERSION.SDK_INT >= 24) {
            alarmManager.setExactAndAllowWhileIdle(0, j, broadcast);
        } else {
            alarmManager.setExact(0, j, broadcast);
        }
    }

    /* renamed from: a */
    public final void mo13021a(TimeKey timeKey, Pair<Integer, Integer> pair) {
        Intrinsics.checkNotNullParameter(timeKey, "timeKey");
        Intrinsics.checkNotNullParameter(pair, "startAndEndWatchIds");
        int intValue = pair.getFirst().intValue();
        int intValue2 = pair.getSecond().intValue();
        AlarmManager a = C0878g.m456a(this.f1027b);
        if (a != null) {
            Intent putExtra = new Intent(this.f1027b, KeyWatcherBroadcastReceiver.class).putExtra("ACTION", "DATE_FROM").putExtra("TIME_KEY_ID", timeKey.getId());
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, KeyWatch…a(TIME_KEY_ID, timeKeyId)");
            Intent putExtra2 = new Intent(this.f1027b, KeyWatcherBroadcastReceiver.class).putExtra("ACTION", "DATE_TILL").putExtra("TIME_KEY_ID", timeKey.getId());
            Intrinsics.checkNotNullExpressionValue(putExtra2, "Intent(context, KeyWatch…a(TIME_KEY_ID, timeKeyId)");
            if (!timeKey.started()) {
                AlarmManager alarmManager = a;
                mo13020a(this.f1027b, alarmManager, intValue, putExtra, ((long) 1000) * timeKey.dateFromSeconds());
            }
            mo13020a(this.f1027b, a, intValue2, putExtra2, timeKey.dateTillSeconds() * ((long) 1000));
        }
    }
}
