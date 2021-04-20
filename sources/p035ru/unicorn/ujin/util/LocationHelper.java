package p035ru.unicorn.ujin.util;

import android.content.Context;
import android.content.DialogInterface;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import androidx.appcompat.app.AlertDialog;
import com.google.android.gms.location.LocationResult;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.access.key.NetworkKey;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/util/LocationHelper;", "", "()V", "gps_enabled", "", "lm", "Landroid/location/LocationManager;", "locationResult", "Lcom/google/android/gms/location/LocationResult;", "network_enabled", "isGPSEnabled", "context", "Landroid/content/Context;", "isLocationEnableChecker", "isLocationEnabled", "isNetworkProviderEnabled", "isPassiveProviderEnabled", "showLocationSettingsDialog", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.util.LocationHelper */
/* compiled from: LocationHelper.kt */
public final class LocationHelper {
    public static final LocationHelper INSTANCE = new LocationHelper();
    private static boolean gps_enabled;

    /* renamed from: lm */
    private static LocationManager f6713lm;
    private static LocationResult locationResult;
    private static boolean network_enabled;

    private LocationHelper() {
    }

    public final boolean isLocationEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        if (systemService != null) {
            return ((LocationManager) systemService).isProviderEnabled("gps");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    public final boolean isLocationEnableChecker(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 28) {
            Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
            if (systemService != null) {
                return ((LocationManager) systemService).isLocationEnabled();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
        } else if (Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void showLocationSettingsDialog(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage((CharSequence) context.getResources().getString(R.string.locationEnabledError)).setPositiveButton((CharSequence) context.getResources().getString(R.string.settings), (DialogInterface.OnClickListener) new LocationHelper$showLocationSettingsDialog$1(context)).setNegativeButton((CharSequence) context.getResources().getString(R.string.cancel), (DialogInterface.OnClickListener) LocationHelper$showLocationSettingsDialog$2.INSTANCE);
        builder.show();
    }

    public final boolean isGPSEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        if (systemService != null) {
            return ((LocationManager) systemService).isProviderEnabled("gps");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    public final boolean isNetworkProviderEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        if (systemService != null) {
            return ((LocationManager) systemService).isProviderEnabled(NetworkKey.DEFAULT_STORAGE_ID);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    public final boolean isPassiveProviderEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        if (systemService != null) {
            return ((LocationManager) systemService).isProviderEnabled("passive");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }
}
