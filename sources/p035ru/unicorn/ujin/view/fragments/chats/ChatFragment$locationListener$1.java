package p035ru.unicorn.ujin.view.fragments.chats;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/chats/ChatFragment$locationListener$1", "Landroid/location/LocationListener;", "onLocationChanged", "", "location", "Landroid/location/Location;", "onProviderDisabled", "s", "", "onProviderEnabled", "onStatusChanged", "i", "", "bundle", "Landroid/os/Bundle;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$locationListener$1 */
/* compiled from: ChatFragment.kt */
public final class ChatFragment$locationListener$1 implements LocationListener {
    final /* synthetic */ ChatFragment this$0;

    public void onProviderDisabled(String str) {
        Intrinsics.checkNotNullParameter(str, "s");
    }

    public void onProviderEnabled(String str) {
        Intrinsics.checkNotNullParameter(str, "s");
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "s");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    ChatFragment$locationListener$1(ChatFragment chatFragment) {
        this.this$0 = chatFragment;
    }

    public void onLocationChanged(Location location) {
        Intrinsics.checkNotNullParameter(location, FirebaseAnalytics.Param.LOCATION);
        this.this$0.longitude = location.getLongitude();
        this.this$0.latitude = location.getLatitude();
    }
}
