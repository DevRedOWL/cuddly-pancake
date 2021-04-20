package org.mobile.p055id.example.core.connectivity;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.access.key.NetworkKey;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, mo51343d2 = {"org/mobile/id/example/core/connectivity/ConnectivityImpl$getNetworkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "onAvailable", "", "network", "Landroid/net/Network;", "onLosing", "maxMsToLive", "", "onLost", "onUnavailable", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: org.mobile.id.example.core.connectivity.ConnectivityImpl$getNetworkCallback$1 */
/* compiled from: ConnectivityImpl.kt */
public final class ConnectivityImpl$getNetworkCallback$1 extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ ConnectivityImpl this$0;

    public void onLosing(Network network, int i) {
        Intrinsics.checkNotNullParameter(network, NetworkKey.DEFAULT_STORAGE_ID);
    }

    ConnectivityImpl$getNetworkCallback$1(ConnectivityImpl connectivityImpl) {
        this.this$0 = connectivityImpl;
    }

    public void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, NetworkKey.DEFAULT_STORAGE_ID);
        this.this$0.isConnected = true;
    }

    public void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, NetworkKey.DEFAULT_STORAGE_ID);
        this.this$0.isConnected = false;
    }

    public void onUnavailable() {
        this.this$0.isConnected = false;
    }
}
