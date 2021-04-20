package p035ru.unicorn.ujin.view.customViews.citySearchView;

import android.location.Location;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/view/customViews/citySearchView/SearchViewActivity$initLocation$2", "Lcom/google/android/gms/location/LocationCallback;", "onLocationResult", "", "locationResult", "Lcom/google/android/gms/location/LocationResult;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.citySearchView.SearchViewActivity$initLocation$2 */
/* compiled from: SearchViewActivity.kt */
public final class SearchViewActivity$initLocation$2 extends LocationCallback {
    final /* synthetic */ SearchViewActivity this$0;

    SearchViewActivity$initLocation$2(SearchViewActivity searchViewActivity) {
        this.this$0 = searchViewActivity;
    }

    public void onLocationResult(LocationResult locationResult) {
        SearchViewAdapter access$getSearchAdapter$p;
        if (locationResult != null) {
            Location lastLocation = locationResult.getLastLocation();
            int access$getClosestCityIndex = lastLocation != null ? this.this$0.getClosestCityIndex(lastLocation) : -1;
            if (!(access$getClosestCityIndex == -1 || !this.this$0.autoDetection || (access$getSearchAdapter$p = this.this$0.searchAdapter) == null)) {
                access$getSearchAdapter$p.setItemSelected(access$getClosestCityIndex);
            }
            this.this$0.getFusedLocationClient().removeLocationUpdates(this.this$0.locationCallback);
        }
    }
}
