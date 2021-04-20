package androidx.core.location;

import android.location.LocationManager;
import android.os.Build;
import org.mobileid.access.key.NetworkKey;

public final class LocationManagerCompat {
    public static boolean isLocationEnabled(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return locationManager.isLocationEnabled();
        }
        return locationManager.isProviderEnabled(NetworkKey.DEFAULT_STORAGE_ID) || locationManager.isProviderEnabled("gps");
    }

    private LocationManagerCompat() {
    }
}
