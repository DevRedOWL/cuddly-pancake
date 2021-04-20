package p035ru.unicorn.ujin.view.activity.domru;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Metadata;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.ProviderCity;
import p035ru.unicorn.ujin.view.customViews.citySearchView.SearchViewField;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "location", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "onSuccess"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.domru.RegisterDomruActivity$permissionGranted$1 */
/* compiled from: RegisterDomruActivity.kt */
final class RegisterDomruActivity$permissionGranted$1<TResult> implements OnSuccessListener<Location> {
    final /* synthetic */ RegisterDomruActivity this$0;

    RegisterDomruActivity$permissionGranted$1(RegisterDomruActivity registerDomruActivity) {
        this.this$0 = registerDomruActivity;
    }

    public final void onSuccess(Location location) {
        ProviderCity providerCity = null;
        if (location == null) {
            this.this$0.autoCityDetection = true;
            this.this$0.getFusedLocationClient().requestLocationUpdates(this.this$0.locationRequest, this.this$0.locationCallback, (Looper) null);
        }
        if (location != null) {
            providerCity = this.this$0.getClosestCity(location);
        }
        if (providerCity != null && this.this$0.autoCityDetection) {
            ((SearchViewField) this.this$0._$_findCachedViewById(C5619R.C5622id.cmbCity)).setCity(providerCity);
        }
    }
}
