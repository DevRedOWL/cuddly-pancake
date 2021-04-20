package p035ru.unicorn.ujin.view.activity.navigation.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.InternetHelper */
public class InternetHelper {
    private boolean connectivity(Context context) {
        NetworkInfo[] allNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!(connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null)) {
            for (NetworkInfo state : allNetworkInfo) {
                if (state.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isWifiConnection(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    public static boolean isNetworkConnectionAvailable(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static InetAddress getBroadcastAddress(Context context) throws UnknownHostException {
        DhcpInfo dhcpInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getDhcpInfo();
        if (dhcpInfo == null) {
            return InetAddress.getByName("255.255.255.255");
        }
        int i = (~dhcpInfo.netmask) | (dhcpInfo.ipAddress & dhcpInfo.netmask);
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
        }
        return InetAddress.getByAddress(bArr);
    }
}
