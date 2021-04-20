package p035ru.unicorn.ujin.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/receiver/SmsReceiver;", "Landroid/content/BroadcastReceiver;", "listener", "Lru/unicorn/ujin/receiver/SmsReceiver$SmsListener;", "(Lru/unicorn/ujin/receiver/SmsReceiver$SmsListener;)V", "codePattern", "Lkotlin/text/Regex;", "getListener", "()Lru/unicorn/ujin/receiver/SmsReceiver$SmsListener;", "setListener", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "SmsListener", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.receiver.SmsReceiver */
/* compiled from: SmsReceiver.kt */
public final class SmsReceiver extends BroadcastReceiver {
    private final Regex codePattern = new Regex("(\\d{4})");
    private SmsListener listener;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/receiver/SmsReceiver$SmsListener;", "", "onCodeReceived", "", "code", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.receiver.SmsReceiver$SmsListener */
    /* compiled from: SmsReceiver.kt */
    public interface SmsListener {
        void onCodeReceived(String str);
    }

    public SmsReceiver(SmsListener smsListener) {
        Intrinsics.checkNotNullParameter(smsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listener = smsListener;
    }

    public final SmsListener getListener() {
        return this.listener;
    }

    public final void setListener(SmsListener smsListener) {
        Intrinsics.checkNotNullParameter(smsListener, "<set-?>");
        this.listener = smsListener;
    }

    public void onReceive(Context context, Intent intent) {
        Class<SmsReceiver> cls = SmsReceiver.class;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual((Object) SmsRetriever.SMS_RETRIEVED_ACTION, (Object) intent.getAction())) {
            Bundle extras = intent.getExtras();
            String str = null;
            Object obj = extras != null ? extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
            if (obj != null) {
                int statusCode = ((Status) obj).getStatusCode();
                if (statusCode == 0) {
                    Object obj2 = extras.get(SmsRetriever.EXTRA_SMS_MESSAGE);
                    if (obj2 != null) {
                        MatchResult find$default = Regex.find$default(this.codePattern, (String) obj2, 0, 2, (Object) null);
                        if (find$default != null) {
                            str = find$default.getValue();
                        }
                        if (str != null) {
                            this.listener.onCodeReceived(find$default.getValue());
                        } else {
                            Log.d(cls.getName(), "code not received");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (statusCode == 15) {
                    Log.d(cls.getName(), "timed out (5 minutes)");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.gms.common.api.Status");
            }
        }
    }
}
