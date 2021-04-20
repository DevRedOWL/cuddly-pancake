package p035ru.unicorn.ujin.data.service.location;

import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: ru.unicorn.ujin.data.service.location.-$$Lambda$GeofencingHelper$8sxhQYjTK1k8oUpW-hTY8KxfyvI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$GeofencingHelper$8sxhQYjTK1k8oUpWhTY8KxfyvI implements OnFailureListener {
    public static final /* synthetic */ $$Lambda$GeofencingHelper$8sxhQYjTK1k8oUpWhTY8KxfyvI INSTANCE = new $$Lambda$GeofencingHelper$8sxhQYjTK1k8oUpWhTY8KxfyvI();

    private /* synthetic */ $$Lambda$GeofencingHelper$8sxhQYjTK1k8oUpWhTY8KxfyvI() {
    }

    public final void onFailure(Exception exc) {
        GeofencingHelper.lambda$addGeofence$1(exc);
    }
}
