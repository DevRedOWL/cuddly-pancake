package p035ru.unicorn.ujin.data.service.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.access.key.NetworkKey;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo51343d2 = {"ru/unicorn/ujin/data/service/location/BaseBleService$mReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.service.location.BaseBleService$mReceiver$1 */
/* compiled from: BaseBleService.kt */
public final class BaseBleService$mReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ BaseBleService this$0;

    BaseBleService$mReceiver$1(BaseBleService baseBleService) {
        this.this$0 = baseBleService;
    }

    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Log.d("TAG", "XXX onReceive ");
        String action = intent.getAction();
        boolean z = true;
        if (Intrinsics.areEqual((Object) action, (Object) "android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (intExtra == 10) {
                this.this$0.setBleEnable(false);
                this.this$0.updateBleStatus();
            } else if (intExtra == 12) {
                this.this$0.setBleEnable(true);
                this.this$0.updateBleStatus();
            }
        } else if (Intrinsics.areEqual((Object) action, (Object) "android.location.PROVIDERS_CHANGED")) {
            Intrinsics.checkNotNull(context);
            Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
            if (systemService != null) {
                LocationManager locationManager = (LocationManager) systemService;
                boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
                boolean isProviderEnabled2 = locationManager.isProviderEnabled(NetworkKey.DEFAULT_STORAGE_ID);
                BaseBleService baseBleService = this.this$0;
                if (!isProviderEnabled || !isProviderEnabled2) {
                    z = false;
                }
                baseBleService.setLocationEnable(z);
                this.this$0.updateBleStatus();
                if (!isProviderEnabled || !isProviderEnabled2) {
                    Log.d("TAG", "zxxx x GPS is disable");
                } else {
                    Log.d("TAG", "zxxx x GPS is enabled");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
            }
        } else if (Intrinsics.areEqual((Object) action, (Object) "android.intent.action.SCREEN_ON") || Intrinsics.areEqual((Object) action, (Object) "android.intent.action.SCREEN_OFF")) {
            Log.d("TAG", String.valueOf(Intrinsics.areEqual((Object) "zxxx x screen on " + action, (Object) "android.intent.action.SCREEN_ON")));
            this.this$0.notifyScreenStatus(Intrinsics.areEqual((Object) action, (Object) "android.intent.action.SCREEN_ON"));
        }
    }
}
