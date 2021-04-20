package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zas;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class NonGmsServiceBrokerClient implements ServiceConnection, Api.Client {
    private static final String zaa = NonGmsServiceBrokerClient.class.getSimpleName();
    private final String zab;
    private final String zac;
    private final ComponentName zad;
    private final Context zae;
    private final ConnectionCallbacks zaf;
    private final Handler zag;
    private final OnConnectionFailedListener zah;
    private IBinder zai;
    private boolean zaj;
    private String zak;
    private String zal;

    public NonGmsServiceBrokerClient(Context context, Looper looper, String str, String str2, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, str, str2, (ComponentName) null, connectionCallbacks, onConnectionFailedListener);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    public final int getMinApkVersion() {
        return 0;
    }

    public final void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
    }

    public final Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    public final IBinder getServiceBrokerBinder() {
        return null;
    }

    public final void onUserSignOut(BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    public final boolean providesSignIn() {
        return false;
    }

    public final boolean requiresAccount() {
        return false;
    }

    public final boolean requiresGooglePlayServices() {
        return false;
    }

    public final boolean requiresSignIn() {
        return false;
    }

    public NonGmsServiceBrokerClient(Context context, Looper looper, ComponentName componentName, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, (String) null, (String) null, componentName, connectionCallbacks, onConnectionFailedListener);
    }

    private NonGmsServiceBrokerClient(Context context, Looper looper, String str, String str2, ComponentName componentName, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this.zaj = false;
        this.zak = null;
        this.zae = context;
        this.zag = new zas(looper);
        this.zaf = connectionCallbacks;
        this.zah = onConnectionFailedListener;
        boolean z = true;
        boolean z2 = (str == null || str2 == null) ? false : true;
        z = componentName == null ? false : z;
        if (!z2 ? !z : z) {
            throw new AssertionError("Must specify either package or component, but not both");
        }
        this.zab = str;
        this.zac = str2;
        this.zad = componentName;
    }

    private final void zab() {
        if (Thread.currentThread() != this.zag.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    private final void zab(String str) {
        String valueOf = String.valueOf(this.zai);
        boolean z = this.zaj;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(" binder: ");
        sb.append(valueOf);
        sb.append(", isConnecting: ");
        sb.append(z);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zag.post(new zabs(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.zag.post(new zabt(this));
    }

    public final void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        zab();
        zab("Connect started.");
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            if (this.zad != null) {
                intent.setComponent(this.zad);
            } else {
                intent.setPackage(this.zab).setAction(this.zac);
            }
            this.zaj = this.zae.bindService(intent, this, GmsClientSupervisor.getDefaultBindFlags());
            if (!this.zaj) {
                this.zai = null;
                this.zah.onConnectionFailed(new ConnectionResult(16));
            }
            zab("Finished connect.");
        } catch (SecurityException e) {
            this.zaj = false;
            this.zai = null;
            throw e;
        }
    }

    public final void disconnect(String str) {
        zab();
        this.zak = str;
        disconnect();
    }

    public final void disconnect() {
        zab();
        zab("Disconnect called.");
        try {
            this.zae.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.zaj = false;
        this.zai = null;
    }

    public final boolean isConnected() {
        zab();
        return this.zai != null;
    }

    public final boolean isConnecting() {
        zab();
        return this.zaj;
    }

    public final Intent getSignInIntent() {
        return new Intent();
    }

    public final String getEndpointPackageName() {
        String str = this.zab;
        if (str != null) {
            return str;
        }
        Preconditions.checkNotNull(this.zad);
        return this.zad.getPackageName();
    }

    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    public final String getLastDisconnectMessage() {
        return this.zak;
    }

    public final void zaa(String str) {
        this.zal = str;
    }

    public final IBinder getBinder() {
        zab();
        return this.zai;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zaa() {
        this.zaj = false;
        this.zai = null;
        zab("Disconnected.");
        this.zaf.onConnectionSuspended(1);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zaa(IBinder iBinder) {
        this.zaj = false;
        this.zai = iBinder;
        zab("Connected.");
        this.zaf.onConnected(new Bundle());
    }
}
