package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.service.zaq;
import com.google.android.gms.common.internal.service.zar;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaac;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.common.internal.zao;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zas;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class GoogleApiManager implements Handler.Callback {
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */
    public static final Status zab = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */
    public static final Object zag = new Object();
    private static GoogleApiManager zaj;
    /* access modifiers changed from: private */
    public long zac = 5000;
    /* access modifiers changed from: private */
    public long zad = 120000;
    /* access modifiers changed from: private */
    public long zae = 10000;
    /* access modifiers changed from: private */
    public boolean zaf = false;
    private zaaa zah;
    private zaac zai;
    /* access modifiers changed from: private */
    public final Context zak;
    /* access modifiers changed from: private */
    public final GoogleApiAvailability zal;
    /* access modifiers changed from: private */
    public final zaj zam;
    private final AtomicInteger zan = new AtomicInteger(1);
    private final AtomicInteger zao = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final Map<ApiKey<?>, zaa<?>> zap = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    public zay zaq = null;
    /* access modifiers changed from: private */
    public final Set<ApiKey<?>> zar = new ArraySet();
    private final Set<ApiKey<?>> zas = new ArraySet();
    /* access modifiers changed from: private */
    @NotOnlyInitialized
    public final Handler zat;
    /* access modifiers changed from: private */
    public volatile boolean zau = true;

    public static GoogleApiManager zaa(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zag) {
            if (zaj == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                zaj = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
            }
            googleApiManager = zaj;
        }
        return googleApiManager;
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    private static class zab {
        /* access modifiers changed from: private */
        public final ApiKey<?> zaa;
        /* access modifiers changed from: private */
        public final Feature zab;

        private zab(ApiKey<?> apiKey, Feature feature) {
            this.zaa = apiKey;
            this.zab = feature;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof zab)) {
                zab zab2 = (zab) obj;
                if (!Objects.equal(this.zaa, zab2.zaa) || !Objects.equal(this.zab, zab2.zab)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.zaa, this.zab);
        }

        public final String toString() {
            return Objects.toStringHelper(this).add("key", this.zaa).add("feature", this.zab).toString();
        }

        /* synthetic */ zab(ApiKey apiKey, Feature feature, zabd zabd) {
            this(apiKey, feature);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    private class zac implements zach, BaseGmsClient.ConnectionProgressReportCallbacks {
        /* access modifiers changed from: private */
        public final Api.Client zab;
        /* access modifiers changed from: private */
        public final ApiKey<?> zac;
        private IAccountAccessor zad = null;
        private Set<Scope> zae = null;
        /* access modifiers changed from: private */
        public boolean zaf = false;

        public zac(Api.Client client, ApiKey<?> apiKey) {
            this.zab = client;
            this.zac = apiKey;
        }

        public final void onReportServiceBinding(ConnectionResult connectionResult) {
            GoogleApiManager.this.zat.post(new zabj(this, connectionResult));
        }

        public final void zaa(ConnectionResult connectionResult) {
            zaa zaa2 = (zaa) GoogleApiManager.this.zap.get(this.zac);
            if (zaa2 != null) {
                zaa2.zaa(connectionResult);
            }
        }

        public final void zaa(IAccountAccessor iAccountAccessor, Set<Scope> set) {
            if (iAccountAccessor == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                zaa(new ConnectionResult(4));
                return;
            }
            this.zad = iAccountAccessor;
            this.zae = set;
            zaa();
        }

        /* access modifiers changed from: private */
        public final void zaa() {
            IAccountAccessor iAccountAccessor;
            if (this.zaf && (iAccountAccessor = this.zad) != null) {
                this.zab.getRemoteService(iAccountAccessor, this.zae);
            }
        }
    }

    public static GoogleApiManager zaa() {
        GoogleApiManager googleApiManager;
        synchronized (zag) {
            Preconditions.checkNotNull(zaj, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zaj;
        }
        return googleApiManager;
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public class zaa<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zap {
        private final Queue<zab> zab = new LinkedList();
        /* access modifiers changed from: private */
        @NotOnlyInitialized
        public final Api.Client zac;
        /* access modifiers changed from: private */
        public final ApiKey<O> zad;
        private final zav zae;
        private final Set<zaj> zaf = new HashSet();
        private final Map<ListenerHolder.ListenerKey<?>, zabv> zag = new HashMap();
        private final int zah;
        private final zace zai;
        private boolean zaj;
        private final List<zab> zak = new ArrayList();
        private ConnectionResult zal = null;
        private int zam = 0;

        public zaa(GoogleApi<O> googleApi) {
            this.zac = googleApi.zaa(GoogleApiManager.this.zat.getLooper(), (zaa<O>) this);
            this.zad = googleApi.getApiKey();
            this.zae = new zav();
            this.zah = googleApi.zaa();
            if (this.zac.requiresSignIn()) {
                this.zai = googleApi.zaa(GoogleApiManager.this.zak, GoogleApiManager.this.zat);
            } else {
                this.zai = null;
            }
        }

        public final void onConnected(Bundle bundle) {
            if (Looper.myLooper() == GoogleApiManager.this.zat.getLooper()) {
                zao();
            } else {
                GoogleApiManager.this.zat.post(new zabf(this));
            }
        }

        /* access modifiers changed from: private */
        public final void zao() {
            zad();
            zac(ConnectionResult.RESULT_SUCCESS);
            zaq();
            Iterator<zabv> it = this.zag.values().iterator();
            while (it.hasNext()) {
                zabv next = it.next();
                if (zaa(next.zaa.getRequiredFeatures()) != null) {
                    it.remove();
                } else {
                    try {
                        next.zaa.registerListener(this.zac, new TaskCompletionSource());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(3);
                        this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            zap();
            zar();
        }

        public final void onConnectionSuspended(int i) {
            if (Looper.myLooper() == GoogleApiManager.this.zat.getLooper()) {
                zaa(i);
            } else {
                GoogleApiManager.this.zat.post(new zabe(this, i));
            }
        }

        /* access modifiers changed from: private */
        public final void zaa(int i) {
            zad();
            this.zaj = true;
            this.zae.zaa(i, this.zac.getLastDisconnectMessage());
            GoogleApiManager.this.zat.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zat, 9, this.zad), GoogleApiManager.this.zac);
            GoogleApiManager.this.zat.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zat, 11, this.zad), GoogleApiManager.this.zad);
            GoogleApiManager.this.zam.zaa();
            for (zabv zabv : this.zag.values()) {
                zabv.zac.run();
            }
        }

        public final void zaa(ConnectionResult connectionResult) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            Api.Client client = this.zac;
            String name = client.getClass().getName();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(valueOf).length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            client.disconnect(sb.toString());
            onConnectionFailed(connectionResult);
        }

        private final boolean zab(ConnectionResult connectionResult) {
            synchronized (GoogleApiManager.zag) {
                if (GoogleApiManager.this.zaq == null || !GoogleApiManager.this.zar.contains(this.zad)) {
                    return false;
                }
                GoogleApiManager.this.zaq.zab(connectionResult, this.zah);
                return true;
            }
        }

        public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
            if (Looper.myLooper() == GoogleApiManager.this.zat.getLooper()) {
                onConnectionFailed(connectionResult);
            } else {
                GoogleApiManager.this.zat.post(new zabh(this, connectionResult));
            }
        }

        public final void onConnectionFailed(ConnectionResult connectionResult) {
            zaa(connectionResult, (Exception) null);
        }

        private final void zaa(ConnectionResult connectionResult, Exception exc) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            zace zace = this.zai;
            if (zace != null) {
                zace.zaa();
            }
            zad();
            GoogleApiManager.this.zam.zaa();
            zac(connectionResult);
            if (this.zac instanceof zar) {
                boolean unused = GoogleApiManager.this.zaf = true;
                GoogleApiManager.this.zat.sendMessageDelayed(GoogleApiManager.this.zat.obtainMessage(19), 300000);
            }
            if (connectionResult.getErrorCode() == 4) {
                zaa(GoogleApiManager.zab);
            } else if (this.zab.isEmpty()) {
                this.zal = connectionResult;
            } else if (exc != null) {
                Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
                zaa((Status) null, exc, false);
            } else if (!GoogleApiManager.this.zau) {
                zaa(zad(connectionResult));
            } else {
                zaa(zad(connectionResult), (Exception) null, true);
                if (!this.zab.isEmpty() && !zab(connectionResult) && !GoogleApiManager.this.zaa(connectionResult, this.zah)) {
                    if (connectionResult.getErrorCode() == 18) {
                        this.zaj = true;
                    }
                    if (this.zaj) {
                        GoogleApiManager.this.zat.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zat, 9, this.zad), GoogleApiManager.this.zac);
                    } else {
                        zaa(zad(connectionResult));
                    }
                }
            }
        }

        private final void zap() {
            ArrayList arrayList = new ArrayList(this.zab);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                zab zab2 = (zab) obj;
                if (!this.zac.isConnected()) {
                    return;
                }
                if (zab(zab2)) {
                    this.zab.remove(zab2);
                }
            }
        }

        public final void zaa(zab zab2) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            if (!this.zac.isConnected()) {
                this.zab.add(zab2);
                ConnectionResult connectionResult = this.zal;
                if (connectionResult == null || !connectionResult.hasResolution()) {
                    zai();
                } else {
                    onConnectionFailed(this.zal);
                }
            } else if (zab(zab2)) {
                zar();
            } else {
                this.zab.add(zab2);
            }
        }

        public final void zaa() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            zaa(GoogleApiManager.zaa);
            this.zae.zab();
            for (ListenerHolder.ListenerKey zag2 : (ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
                zaa((zab) new zag(zag2, new TaskCompletionSource()));
            }
            zac(new ConnectionResult(4));
            if (this.zac.isConnected()) {
                this.zac.onUserSignOut(new zabg(this));
            }
        }

        public final Api.Client zab() {
            return this.zac;
        }

        public final Map<ListenerHolder.ListenerKey<?>, zabv> zac() {
            return this.zag;
        }

        public final void zad() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            this.zal = null;
        }

        public final ConnectionResult zae() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            return this.zal;
        }

        private final boolean zab(zab zab2) {
            if (!(zab2 instanceof zad)) {
                zac(zab2);
                return true;
            }
            zad zad2 = (zad) zab2;
            Feature zaa2 = zaa(zad2.zac(this));
            if (zaa2 == null) {
                zac(zab2);
                return true;
            }
            String name = this.zac.getClass().getName();
            String name2 = zaa2.getName();
            long version = zaa2.getVersion();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(name2).length());
            sb.append(name);
            sb.append(" could not execute call because it requires feature (");
            sb.append(name2);
            sb.append(", ");
            sb.append(version);
            sb.append(").");
            Log.w("GoogleApiManager", sb.toString());
            if (!GoogleApiManager.this.zau || !zad2.zad(this)) {
                zad2.zaa((Exception) new UnsupportedApiCallException(zaa2));
                return true;
            }
            zab zab3 = new zab(this.zad, zaa2, (zabd) null);
            int indexOf = this.zak.indexOf(zab3);
            if (indexOf >= 0) {
                zab zab4 = this.zak.get(indexOf);
                GoogleApiManager.this.zat.removeMessages(15, zab4);
                GoogleApiManager.this.zat.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zat, 15, zab4), GoogleApiManager.this.zac);
                return false;
            }
            this.zak.add(zab3);
            GoogleApiManager.this.zat.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zat, 15, zab3), GoogleApiManager.this.zac);
            GoogleApiManager.this.zat.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zat, 16, zab3), GoogleApiManager.this.zad);
            ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
            if (zab(connectionResult)) {
                return false;
            }
            GoogleApiManager.this.zaa(connectionResult, this.zah);
            return false;
        }

        private final void zac(zab zab2) {
            zab2.zaa(this.zae, zak());
            try {
                zab2.zaa((zaa<?>) this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            } catch (Throwable th) {
                throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", new Object[]{this.zac.getClass().getName()}), th);
            }
        }

        private final void zaa(Status status, Exception exc, boolean z) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            boolean z2 = true;
            boolean z3 = status == null;
            if (exc != null) {
                z2 = false;
            }
            if (z3 != z2) {
                Iterator it = this.zab.iterator();
                while (it.hasNext()) {
                    zab zab2 = (zab) it.next();
                    if (!z || zab2.zaa == 2) {
                        if (status != null) {
                            zab2.zaa(status);
                        } else {
                            zab2.zaa(exc);
                        }
                        it.remove();
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Status XOR exception should be null");
        }

        /* access modifiers changed from: private */
        public final void zaa(Status status) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            zaa(status, (Exception) null, false);
        }

        public final void zaf() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            if (this.zaj) {
                zai();
            }
        }

        private final void zaq() {
            if (this.zaj) {
                GoogleApiManager.this.zat.removeMessages(11, this.zad);
                GoogleApiManager.this.zat.removeMessages(9, this.zad);
                this.zaj = false;
            }
        }

        public final void zag() {
            Status status;
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            if (this.zaj) {
                zaq();
                if (GoogleApiManager.this.zal.isGooglePlayServicesAvailable(GoogleApiManager.this.zak) == 18) {
                    status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                } else {
                    status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                }
                zaa(status);
                this.zac.disconnect("Timing out connection while resuming.");
            }
        }

        private final void zar() {
            GoogleApiManager.this.zat.removeMessages(12, this.zad);
            GoogleApiManager.this.zat.sendMessageDelayed(GoogleApiManager.this.zat.obtainMessage(12, this.zad), GoogleApiManager.this.zae);
        }

        public final boolean zah() {
            return zaa(true);
        }

        /* access modifiers changed from: private */
        public final boolean zaa(boolean z) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            if (!this.zac.isConnected() || this.zag.size() != 0) {
                return false;
            }
            if (this.zae.zaa()) {
                if (z) {
                    zar();
                }
                return false;
            }
            this.zac.disconnect("Timing out service connection.");
            return true;
        }

        public final void zai() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            if (!this.zac.isConnected() && !this.zac.isConnecting()) {
                try {
                    int zaa2 = GoogleApiManager.this.zam.zaa(GoogleApiManager.this.zak, this.zac);
                    if (zaa2 != 0) {
                        ConnectionResult connectionResult = new ConnectionResult(zaa2, (PendingIntent) null);
                        String name = this.zac.getClass().getName();
                        String valueOf = String.valueOf(connectionResult);
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + String.valueOf(valueOf).length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(valueOf);
                        Log.w("GoogleApiManager", sb.toString());
                        onConnectionFailed(connectionResult);
                        return;
                    }
                    zac zac2 = new zac(this.zac, this.zad);
                    if (this.zac.requiresSignIn()) {
                        ((zace) Preconditions.checkNotNull(this.zai)).zaa((zach) zac2);
                    }
                    try {
                        this.zac.connect(zac2);
                    } catch (SecurityException e) {
                        zaa(new ConnectionResult(10), (Exception) e);
                    }
                } catch (IllegalStateException e2) {
                    zaa(new ConnectionResult(10), (Exception) e2);
                }
            }
        }

        public final void zaa(zaj zaj2) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            this.zaf.add(zaj2);
        }

        private final void zac(ConnectionResult connectionResult) {
            for (zaj next : this.zaf) {
                String str = null;
                if (Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                    str = this.zac.getEndpointPackageName();
                }
                next.zaa(this.zad, connectionResult, str);
            }
            this.zaf.clear();
        }

        /* access modifiers changed from: package-private */
        public final boolean zaj() {
            return this.zac.isConnected();
        }

        public final boolean zak() {
            return this.zac.requiresSignIn();
        }

        public final int zal() {
            return this.zah;
        }

        private final Feature zaa(Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] availableFeatures = this.zac.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new Feature[0];
                }
                ArrayMap arrayMap = new ArrayMap(availableFeatures.length);
                for (Feature feature : availableFeatures) {
                    arrayMap.put(feature.getName(), Long.valueOf(feature.getVersion()));
                }
                for (Feature feature2 : featureArr) {
                    Long l = (Long) arrayMap.get(feature2.getName());
                    if (l == null || l.longValue() < feature2.getVersion()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public final void zaa(zab zab2) {
            if (!this.zak.contains(zab2) || this.zaj) {
                return;
            }
            if (!this.zac.isConnected()) {
                zai();
            } else {
                zap();
            }
        }

        /* access modifiers changed from: private */
        public final void zab(zab zab2) {
            Feature[] zac2;
            if (this.zak.remove(zab2)) {
                GoogleApiManager.this.zat.removeMessages(15, zab2);
                GoogleApiManager.this.zat.removeMessages(16, zab2);
                Feature zab3 = zab2.zab;
                ArrayList arrayList = new ArrayList(this.zab.size());
                for (zab zab4 : this.zab) {
                    if ((zab4 instanceof zad) && (zac2 = ((zad) zab4).zac(this)) != null && ArrayUtils.contains((T[]) zac2, zab3)) {
                        arrayList.add(zab4);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    zab zab5 = (zab) obj;
                    this.zab.remove(zab5);
                    zab5.zaa((Exception) new UnsupportedApiCallException(zab3));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int zam() {
            return this.zam;
        }

        /* access modifiers changed from: package-private */
        public final void zan() {
            this.zam++;
        }

        private final Status zad(ConnectionResult connectionResult) {
            return GoogleApiManager.zab((ApiKey<?>) this.zad, connectionResult);
        }
    }

    public static void reportSignOut() {
        synchronized (zag) {
            if (zaj != null) {
                GoogleApiManager googleApiManager = zaj;
                googleApiManager.zao.incrementAndGet();
                googleApiManager.zat.sendMessageAtFrontOfQueue(googleApiManager.zat.obtainMessage(10));
            }
        }
    }

    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zak = context;
        this.zat = new zas(looper, this);
        this.zal = googleApiAvailability;
        this.zam = new zaj(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zau = false;
        }
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public final int zab() {
        return this.zan.getAndIncrement();
    }

    public final void zaa(GoogleApi<?> googleApi) {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    private final zaa<?> zac(GoogleApi<?> googleApi) {
        ApiKey<?> apiKey = googleApi.getApiKey();
        zaa<?> zaa2 = this.zap.get(apiKey);
        if (zaa2 == null) {
            zaa2 = new zaa<>(googleApi);
            this.zap.put(apiKey, zaa2);
        }
        if (zaa2.zak()) {
            this.zas.add(apiKey);
        }
        zaa2.zai();
        return zaa2;
    }

    public final void zaa(zay zay) {
        synchronized (zag) {
            if (this.zaq != zay) {
                this.zaq = zay;
                this.zar.clear();
            }
            this.zar.addAll(zay.zac());
        }
    }

    /* access modifiers changed from: package-private */
    public final void zab(zay zay) {
        synchronized (zag) {
            if (this.zaq == zay) {
                this.zaq = null;
                this.zar.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zaa zaa(ApiKey<?> apiKey) {
        return this.zap.get(apiKey);
    }

    public final Task<Map<ApiKey<?>, String>> zaa(Iterable<? extends HasApiKey<?>> iterable) {
        zaj zaj2 = new zaj(iterable);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(2, zaj2));
        return zaj2.zab();
    }

    public final void zac() {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final Task<Boolean> zab(GoogleApi<?> googleApi) {
        zaz zaz = new zaz(googleApi.getApiKey());
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(14, zaz));
        return zaz.zab().getTask();
    }

    public final <O extends Api.ApiOptions> void zaa(GoogleApi<O> googleApi, int i, BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zaf zaf2 = new zaf(i, apiMethodImpl);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new zabu(zaf2, this.zao.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void zaa(GoogleApi<O> googleApi, int i, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        zaa(taskCompletionSource, taskApiCall.zab(), (GoogleApi<?>) googleApi);
        zah zah2 = new zah(i, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new zabu(zah2, this.zao.get(), googleApi)));
    }

    /* access modifiers changed from: package-private */
    public final boolean zad() {
        if (this.zaf) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int zaa2 = this.zam.zaa(this.zak, 203390000);
        if (zaa2 == -1 || zaa2 == 0) {
            return true;
        }
        return false;
    }

    public final <O extends Api.ApiOptions> Task<Void> zaa(GoogleApi<O> googleApi, RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaa(taskCompletionSource, registerListenerMethod.zab(), (GoogleApi<?>) googleApi);
        zae zae2 = new zae(new zabv(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(8, new zabu(zae2, this.zao.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> Task<Boolean> zaa(GoogleApi<O> googleApi, ListenerHolder.ListenerKey<?> listenerKey, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaa(taskCompletionSource, i, (GoogleApi<?>) googleApi);
        zag zag2 = new zag(listenerKey, taskCompletionSource);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(13, new zabu(zag2, this.zao.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    private final <T> void zaa(TaskCompletionSource<T> taskCompletionSource, int i, GoogleApi<?> googleApi) {
        zabr<T> zaa2;
        if (i != 0 && (zaa2 = zabr.zaa(this, i, googleApi.getApiKey())) != null) {
            Task<T> task = taskCompletionSource.getTask();
            Handler handler = this.zat;
            handler.getClass();
            task.addOnCompleteListener(zabc.zaa(handler), (OnCompleteListener<T>) zaa2);
        }
    }

    public boolean handleMessage(Message message) {
        zaa zaa2;
        long j = 300000;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.zae = j;
                this.zat.removeMessages(12);
                for (ApiKey<?> obtainMessage : this.zap.keySet()) {
                    Handler handler = this.zat;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.zae);
                }
                break;
            case 2:
                zaj zaj2 = (zaj) message.obj;
                Iterator<ApiKey<?>> it = zaj2.zaa().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ApiKey next = it.next();
                        zaa zaa3 = this.zap.get(next);
                        if (zaa3 == null) {
                            zaj2.zaa(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (zaa3.zaj()) {
                            zaj2.zaa(next, ConnectionResult.RESULT_SUCCESS, zaa3.zab().getEndpointPackageName());
                        } else {
                            ConnectionResult zae2 = zaa3.zae();
                            if (zae2 != null) {
                                zaj2.zaa(next, zae2, (String) null);
                            } else {
                                zaa3.zaa(zaj2);
                                zaa3.zai();
                            }
                        }
                    }
                }
            case 3:
                for (zaa next2 : this.zap.values()) {
                    next2.zad();
                    next2.zai();
                }
                break;
            case 4:
            case 8:
            case 13:
                zabu zabu = (zabu) message.obj;
                zaa<?> zaa4 = this.zap.get(zabu.zac.getApiKey());
                if (zaa4 == null) {
                    zaa4 = zac(zabu.zac);
                }
                if (zaa4.zak() && this.zao.get() != zabu.zab) {
                    zabu.zaa.zaa(zaa);
                    zaa4.zaa();
                    break;
                } else {
                    zaa4.zaa(zabu.zaa);
                    break;
                }
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<zaa<?>> it2 = this.zap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zaa2 = it2.next();
                        if (zaa2.zal() == i) {
                        }
                    } else {
                        zaa2 = null;
                    }
                }
                if (zaa2 != null) {
                    if (connectionResult.getErrorCode() != 13) {
                        zaa2.zaa(zab((ApiKey<?>) zaa2.zad, connectionResult));
                        break;
                    } else {
                        String errorString = this.zal.getErrorString(connectionResult.getErrorCode());
                        String errorMessage = connectionResult.getErrorMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(errorString);
                        sb.append(": ");
                        sb.append(errorMessage);
                        zaa2.zaa(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.zak.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zak.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new zabd(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zae = 300000;
                        break;
                    }
                }
                break;
            case 7:
                zac((GoogleApi<?>) (GoogleApi) message.obj);
                break;
            case 9:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zaf();
                    break;
                }
                break;
            case 10:
                for (ApiKey<?> remove : this.zas) {
                    zaa remove2 = this.zap.remove(remove);
                    if (remove2 != null) {
                        remove2.zaa();
                    }
                }
                this.zas.clear();
                break;
            case 11:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zag();
                    break;
                }
                break;
            case 12:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zah();
                    break;
                }
                break;
            case 14:
                zaz zaz = (zaz) message.obj;
                ApiKey<?> zaa5 = zaz.zaa();
                if (this.zap.containsKey(zaa5)) {
                    zaz.zab().setResult(Boolean.valueOf(this.zap.get(zaa5).zaa(false)));
                    break;
                } else {
                    zaz.zab().setResult(false);
                    break;
                }
            case 15:
                zab zab2 = (zab) message.obj;
                if (this.zap.containsKey(zab2.zaa)) {
                    this.zap.get(zab2.zaa).zaa(zab2);
                    break;
                }
                break;
            case 16:
                zab zab3 = (zab) message.obj;
                if (this.zap.containsKey(zab3.zaa)) {
                    this.zap.get(zab3.zaa).zab(zab3);
                    break;
                }
                break;
            case 17:
                zag();
                break;
            case 18:
                zabq zabq = (zabq) message.obj;
                if (zabq.zac != 0) {
                    zaaa zaaa = this.zah;
                    if (zaaa != null) {
                        List<zao> zab4 = zaaa.zab();
                        if (this.zah.zaa() != zabq.zab || (zab4 != null && zab4.size() >= zabq.zad)) {
                            this.zat.removeMessages(17);
                            zag();
                        } else {
                            this.zah.zaa(zabq.zaa);
                        }
                    }
                    if (this.zah == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zabq.zaa);
                        this.zah = new zaaa(zabq.zab, arrayList);
                        Handler handler2 = this.zat;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zabq.zac);
                        break;
                    }
                } else {
                    zah().zaa(new zaaa(zabq.zab, Arrays.asList(new zao[]{zabq.zaa})));
                    break;
                }
                break;
            case 19:
                this.zaf = false;
                break;
            default:
                int i2 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zaa(ConnectionResult connectionResult, int i) {
        return this.zal.zaa(this.zak, connectionResult, i);
    }

    public final void zab(ConnectionResult connectionResult, int i) {
        if (!zaa(connectionResult, i)) {
            Handler handler = this.zat;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* access modifiers changed from: private */
    public static Status zab(ApiKey<?> apiKey, ConnectionResult connectionResult) {
        String zaa2 = apiKey.zaa();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(zaa2).length() + 63 + String.valueOf(valueOf).length());
        sb.append("API: ");
        sb.append(zaa2);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final void zaa(zao zao2, int i, long j, int i2) {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(18, new zabq(zao2, i, j, i2)));
    }

    private final void zag() {
        zaaa zaaa = this.zah;
        if (zaaa != null) {
            if (zaaa.zaa() > 0 || zad()) {
                zah().zaa(zaaa);
            }
            this.zah = null;
        }
    }

    private final zaac zah() {
        if (this.zai == null) {
            this.zai = new zaq(this.zak);
        }
        return this.zai;
    }
}
