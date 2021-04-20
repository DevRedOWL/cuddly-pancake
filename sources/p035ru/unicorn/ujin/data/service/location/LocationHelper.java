package p035ru.unicorn.ujin.data.service.location;

import android.content.Context;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.data.realm.Wifi;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.data.service.location.LocationHelper */
public class LocationHelper {
    public static boolean isLocationEnabled(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return !TextUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static float getDistancBetweenTwoPoints(Location location, double d, double d2) {
        if (location == null) {
            Location location2 = new Location("");
            location2.setLatitude(d);
            location2.setLatitude(d2);
            return 0.0f;
        }
        float[] fArr = new float[2];
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), d, d2, fArr);
        location.setLatitude(d);
        location.setLongitude(d2);
        return fArr[0];
    }

    public static Point createPoint(Context context, WifiManager wifiManager, Location location) {
        double d;
        List<Wifi> wifi = getWifi(wifiManager);
        RealmList realmList = new RealmList();
        if (wifi.size() > 0) {
            realmList.addAll(wifi);
        }
        Point point = new Point();
        point.setId(String.valueOf(System.currentTimeMillis()));
        point.setWifi(realmList);
        point.setGPSEnable(Boolean.valueOf(isLocationEnabled(context) && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0));
        point.setWIFIEnable(Boolean.valueOf(wifiManager.isWifiEnabled()));
        point.setRemove(false);
        double d2 = Utils.DOUBLE_EPSILON;
        if (location == null) {
            d = 0.0d;
        } else {
            d = location.getLongitude();
        }
        point.setLongitude(Double.valueOf(d));
        if (location != null) {
            d2 = location.getLatitude();
        }
        point.setLatitude(Double.valueOf(d2));
        return point;
    }

    public static List<Wifi> getWifi(WifiManager wifiManager) {
        ArrayList arrayList = new ArrayList();
        for (ScanResult next : wifiManager.getScanResults()) {
            arrayList.add(new Wifi(next.SSID, next.BSSID, Integer.valueOf(next.level), 0, 0));
        }
        return arrayList;
    }

    public static Location createLocation(Double d, Double d2) {
        Location location = new Location("");
        location.setLatitude(d2.doubleValue());
        location.setLongitude(d.doubleValue());
        return location;
    }

    public static Location createLocation(Point point) {
        return createLocation(point.getLongitude(), point.getLatitude());
    }

    public static boolean hasLocation(Point point) {
        return (point == null || point.getLatitude() == null || point.getLatitude().doubleValue() <= Utils.DOUBLE_EPSILON || point.getLongitude() == null || point.getLongitude().doubleValue() <= Utils.DOUBLE_EPSILON) ? false : true;
    }
}
