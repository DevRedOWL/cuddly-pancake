package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import p042cz.msebera.android.httpclient.HttpStatus;

/* compiled from: com.google.firebase:firebase-iid@@21.0.1 */
final /* synthetic */ class FcmBroadcastProcessor$$Lambda$4 implements Continuation {
    static final Continuation $instance = new FcmBroadcastProcessor$$Lambda$4();

    private FcmBroadcastProcessor$$Lambda$4() {
    }

    public Object then(Task task) {
        return Integer.valueOf(HttpStatus.SC_FORBIDDEN);
    }
}
