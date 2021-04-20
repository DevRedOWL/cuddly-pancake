package org.mobile.p055id.example.core.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0013\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\tH\u0002J\r\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo51343d2 = {"Lorg/mobile/id/example/core/connectivity/ConnectivityImpl;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lorg/mobile/id/example/core/connectivity/Connectivity;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "<set-?>", "", "isConnected", "()Z", "networkCallback", "getNetworkCallback", "()Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback$delegate", "Lkotlin/Lazy;", "supportNetworkCallback", "connectedToNetworkOlderV", "org/mobile/id/example/core/connectivity/ConnectivityImpl$getNetworkCallback$1", "()Lorg/mobile/id/example/core/connectivity/ConnectivityImpl$getNetworkCallback$1;", "onCreate", "", "onDestroy", "registerNetworkListener", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: org.mobile.id.example.core.connectivity.ConnectivityImpl */
/* compiled from: ConnectivityImpl.kt */
public final class ConnectivityImpl extends ConnectivityManager.NetworkCallback implements Connectivity {
    private final ConnectivityManager connectivityManager;
    /* access modifiers changed from: private */
    public boolean isConnected;
    private final Lazy networkCallback$delegate;
    private final boolean supportNetworkCallback;

    /* access modifiers changed from: private */
    public final ConnectivityManager.NetworkCallback getNetworkCallback() {
        return (ConnectivityManager.NetworkCallback) this.networkCallback$delegate.getValue();
    }

    public ConnectivityImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            this.connectivityManager = (ConnectivityManager) systemService;
            this.networkCallback$delegate = LazyKt.lazy(new ConnectivityImpl$networkCallback$2(this));
            this.supportNetworkCallback = Build.VERSION.SDK_INT >= 26;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    public boolean isConnected() {
        if (this.supportNetworkCallback) {
            return this.isConnected;
        }
        return connectedToNetworkOlderV();
    }

    public void onCreate() {
        if (this.supportNetworkCallback) {
            registerNetworkListener();
        }
    }

    private final void registerNetworkListener() {
        this.connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), getNetworkCallback());
    }

    /* renamed from: getNetworkCallback  reason: collision with other method in class */
    private final ConnectivityImpl$getNetworkCallback$1 m8471getNetworkCallback() {
        return new ConnectivityImpl$getNetworkCallback$1(this);
    }

    public void onDestroy() {
        if (this.supportNetworkCallback) {
            this.connectivityManager.unregisterNetworkCallback(getNetworkCallback());
        }
    }

    private final boolean connectedToNetworkOlderV() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
