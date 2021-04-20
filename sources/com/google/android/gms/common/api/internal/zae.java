package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class zae extends zac<Void> {
    private final zabv zac;

    public zae(zabv zabv, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.zac = zabv;
    }

    public final /* bridge */ /* synthetic */ void zaa(zav zav, boolean z) {
    }

    public final void zab(GoogleApiManager.zaa<?> zaa) throws RemoteException {
        this.zac.zaa.registerListener(zaa.zab(), this.zab);
        ListenerHolder.ListenerKey<?> listenerKey = this.zac.zaa.getListenerKey();
        if (listenerKey != null) {
            zaa.zac().put(listenerKey, this.zac);
        }
    }

    public final Feature[] zac(GoogleApiManager.zaa<?> zaa) {
        return this.zac.zaa.getRequiredFeatures();
    }

    public final boolean zad(GoogleApiManager.zaa<?> zaa) {
        return this.zac.zaa.zaa();
    }

    public final /* bridge */ /* synthetic */ void zaa(Exception exc) {
        super.zaa(exc);
    }

    public final /* bridge */ /* synthetic */ void zaa(Status status) {
        super.zaa(status);
    }
}
