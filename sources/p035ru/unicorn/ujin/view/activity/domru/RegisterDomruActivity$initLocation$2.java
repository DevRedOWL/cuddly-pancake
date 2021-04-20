package p035ru.unicorn.ujin.view.activity.domru;

import android.location.Location;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import kotlin.Metadata;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.ProviderCity;
import p035ru.unicorn.ujin.view.customViews.citySearchView.SearchViewField;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/domru/RegisterDomruActivity$initLocation$2", "Lcom/google/android/gms/location/LocationCallback;", "onLocationResult", "", "locationResult", "Lcom/google/android/gms/location/LocationResult;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.domru.RegisterDomruActivity$initLocation$2 */
/* compiled from: RegisterDomruActivity.kt */
public final class RegisterDomruActivity$initLocation$2 extends LocationCallback {
    final /* synthetic */ RegisterDomruActivity this$0;

    RegisterDomruActivity$initLocation$2(RegisterDomruActivity registerDomruActivity) {
        this.this$0 = registerDomruActivity;
    }

    public void onLocationResult(LocationResult locationResult) {
        if (locationResult != null) {
            Location lastLocation = locationResult.getLastLocation();
            ProviderCity access$getClosestCity = lastLocation != null ? this.this$0.getClosestCity(lastLocation) : null;
            if (access$getClosestCity != null && this.this$0.autoCityDetection) {
                ((SearchViewField) this.this$0._$_findCachedViewById(C5619R.C5622id.cmbCity)).setCity(access$getClosestCity);
            }
            this.this$0.getFusedLocationClient().removeLocationUpdates(this.this$0.locationCallback);
        }
    }
}
