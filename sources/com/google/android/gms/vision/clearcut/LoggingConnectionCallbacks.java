package com.google.android.gms.vision.clearcut;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

public class LoggingConnectionCallbacks implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public void onConnected(Bundle bundle) {
        throw new NoSuchMethodError();
    }

    public void onConnectionSuspended(int i) {
        throw new NoSuchMethodError();
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        throw new NoSuchMethodError();
    }
}
