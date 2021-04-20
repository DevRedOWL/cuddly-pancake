package p008c.p009a.p017d.p018a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.requester.background_requester.RequesterForegroundService;

/* renamed from: c.a.d.a.a */
public final class C0910a extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        StringBuilder sb = new StringBuilder();
        sb.append("BluetoothStateReceiver fired: ");
        String action = intent.getAction();
        Intrinsics.checkNotNull(action);
        sb.append(action);
        sb.toString();
        RequesterForegroundService.f6379d.mo60097a(context);
    }
}
