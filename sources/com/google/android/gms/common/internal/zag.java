package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
final class zag implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ ConnectionCallbacks zaa;

    zag(ConnectionCallbacks connectionCallbacks) {
        this.zaa = connectionCallbacks;
    }

    public final void onConnected(Bundle bundle) {
        this.zaa.onConnected(bundle);
    }

    public final void onConnectionSuspended(int i) {
        this.zaa.onConnectionSuspended(i);
    }
}
