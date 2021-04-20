package org.mobileid;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.Api;
import p008c.p009a.p017d.p019b.C0911a;
import p008c.p009a.p017d.p023e.C0956d;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0004¨\u0006\t"}, mo51343d2 = {"org/mobileid/Api$getRequesterListenersAdapter$1", "Lc/a/d/e/d;", "", "found", "()V", "Lorg/mobileid/requester/bluetooth_access_requster/AccessPoint$Access;", "result", "(Lorg/mobileid/requester/bluetooth_access_requster/AccessPoint$Access;)V", "started", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class Api$getRequesterListenersAdapter$1 implements C0956d {
    public final /* synthetic */ Context $context;

    public Api$getRequesterListenersAdapter$1(Context context) {
        this.$context = context;
    }

    public void found() {
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = this.$context.getSystemService("vibrator");
            if (systemService != null) {
                ((Vibrator) systemService).vibrate(VibrationEffect.createOneShot(60, -1));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        }
        Object systemService2 = this.$context.getSystemService("vibrator");
        if (systemService2 != null) {
            ((Vibrator) systemService2).vibrate(60);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
    }

    public void result(C0911a.C0912a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "result");
        for (Api.RequestAccessListener result : Api.requestListeners) {
            result.result(Api.RequestAccessResult.Companion.valueOf(aVar));
        }
    }

    public void started() {
        for (Api.RequestAccessListener started : Api.requestListeners) {
            started.started();
        }
    }
}
