package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;

public class NetworkConnectedController extends ConstraintController<NetworkState> {
    public NetworkConnectedController(Context context) {
        super(Trackers.getInstance(context).getNetworkStateTracker());
    }

    /* access modifiers changed from: package-private */
    public boolean hasConstraint(WorkSpec workSpec) {
        return workSpec.constraints.getRequiredNetworkType() == NetworkType.CONNECTED;
    }

    /* access modifiers changed from: package-private */
    public boolean isConstrained(NetworkState networkState) {
        if (Build.VERSION.SDK_INT < 26) {
            return !networkState.isConnected();
        }
        if (!networkState.isConnected() || !networkState.isValidated()) {
            return true;
        }
        return false;
    }
}
