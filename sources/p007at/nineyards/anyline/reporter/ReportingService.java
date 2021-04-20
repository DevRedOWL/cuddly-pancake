package p007at.nineyards.anyline.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007at.nineyards.anyline.BuildConfig;
import p007at.nineyards.anyline.camera.CameraFeatures;
import p007at.nineyards.anyline.core.Reporter;

/* renamed from: at.nineyards.anyline.reporter.ReportingService */
public class ReportingService {
    public static final String PREFS_NAME = "ReportingPrefs";
    protected static final String TAG = ReportingService.class.getSimpleName();

    /* renamed from: a */
    private static ReportingService f729a;

    /* renamed from: b */
    private final SharedPreferences f730b = this.f732d.getSharedPreferences(PREFS_NAME, 0);

    /* renamed from: c */
    private final SharedPreferences.Editor f731c = this.f730b.edit();

    /* renamed from: d */
    private Context f732d;

    /* renamed from: e */
    private String f733e;

    /* renamed from: f */
    private String f734f = (Build.MANUFACTURER + ":" + Build.MODEL);

    /* renamed from: g */
    private String f735g;

    /* renamed from: h */
    private String f736h;

    /* renamed from: i */
    private String f737i;

    /* renamed from: j */
    private String f738j;

    /* renamed from: k */
    private String f739k;

    /* renamed from: l */
    private String f740l;

    /* renamed from: m */
    private String f741m;

    private ReportingService(Context context) {
        this.f732d = context;
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        this.f733e = sb.toString();
        this.f736h = "50019840";
        this.f737i = BuildConfig.VERSION_NAME;
        String string = this.f730b.getString("uuid", "");
        if (string.isEmpty()) {
            string = UUID.randomUUID().toString();
            this.f731c.putString("uuid", string);
            this.f731c.commit();
        }
        this.f735g = string;
        this.f741m = context.getPackageName();
        try {
            this.f739k = this.f732d.getPackageManager().getPackageInfo(this.f732d.getApplicationInfo().packageName, 0).versionName;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f732d.getPackageManager().getPackageInfo(this.f732d.getApplicationInfo().packageName, 0).versionCode);
            this.f738j = sb2.toString();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Error getting applications version code.", e);
        }
        try {
            InetAddress a = m356a();
            if (a != null) {
                this.f740l = a.getHostAddress();
            }
        } catch (SocketException e2) {
            Log.e(TAG, "Error getting ip address.", e2);
        }
    }

    public static ReportingService getInstance(Context context) {
        if (f729a == null) {
            f729a = new ReportingService(context);
        }
        return f729a;
    }

    public void reportCameraFeatures(CameraFeatures... cameraFeaturesArr) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (CameraFeatures cameraFeatures : cameraFeaturesArr) {
                jSONArray.put(new JSONObject(cameraFeatures.toString()));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appBundleId", this.f741m).put("uuid", this.f735g).put("osVersion", this.f733e).put("deviceType", this.f734f).put("availableFeatures", jSONArray.toString());
            Reporter.getInstance().reportCameraParameters(jSONObject.toString());
            this.f731c.putBoolean("camera_features_reported_v2", true);
            this.f731c.putString("os_version", this.f733e);
            this.f731c.commit();
        } catch (JSONException unused) {
            Log.e(TAG, "could not create json array for all available cameras");
        }
    }

    public boolean isCameraFeatureReportingRequired() {
        if (!this.f730b.getBoolean("camera_features_reported_v2", false)) {
            return true;
        }
        if (this.f733e.equals(this.f730b.getString("os_version", ""))) {
            return false;
        }
        return true;
    }

    public String createStartValues() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appVersionNumber", this.f739k).put("osVersion", this.f733e).put("deviceType", this.f734f).put("uuid", this.f735g).put("anylineBuildNumber", this.f736h).put("anylineVersionNumber", this.f737i).put("appBuildNumber", this.f738j).put("ipAddress", this.f740l);
        } catch (JSONException e) {
            Log.e(TAG, "Error creating json with start values.", e);
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    private static InetAddress m356a() throws SocketException {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            if (!nextElement.isLoopback() && nextElement.isUp()) {
                for (InterfaceAddress next : nextElement.getInterfaceAddresses()) {
                    if (next.getAddress().getAddress().length == 4) {
                        return next.getAddress();
                    }
                }
                continue;
            }
        }
        return null;
    }
}
