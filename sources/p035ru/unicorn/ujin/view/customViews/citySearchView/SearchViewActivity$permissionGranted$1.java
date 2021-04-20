package p035ru.unicorn.ujin.view.customViews.citySearchView;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "location", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "onSuccess"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.citySearchView.SearchViewActivity$permissionGranted$1 */
/* compiled from: SearchViewActivity.kt */
final class SearchViewActivity$permissionGranted$1<TResult> implements OnSuccessListener<Location> {
    final /* synthetic */ SearchViewActivity this$0;

    SearchViewActivity$permissionGranted$1(SearchViewActivity searchViewActivity) {
        this.this$0 = searchViewActivity;
    }

    public final void onSuccess(Location location) {
        SearchViewAdapter access$getSearchAdapter$p;
        if (location == null) {
            this.this$0.autoDetection = true;
            this.this$0.getFusedLocationClient().requestLocationUpdates(this.this$0.locationRequest, this.this$0.locationCallback, (Looper) null);
        }
        int access$getClosestCityIndex = location != null ? this.this$0.getClosestCityIndex(location) : -1;
        if (access$getClosestCityIndex != -1 && (access$getSearchAdapter$p = this.this$0.searchAdapter) != null) {
            access$getSearchAdapter$p.setItemSelected(access$getClosestCityIndex);
        }
    }
}
