package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.tasks.C2415i;
import com.google.android.play.core.tasks.Task;

/* renamed from: com.google.android.play.core.review.c */
public final class C2323c implements ReviewManager {

    /* renamed from: a */
    private final C2328h f1997a;

    /* renamed from: b */
    private final Handler f1998b = new Handler(Looper.getMainLooper());

    C2323c(C2328h hVar) {
        this.f1997a = hVar;
    }

    public final Task<Void> launchReviewFlow(Activity activity, ReviewInfo reviewInfo) {
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.mo33932a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C2415i iVar = new C2415i();
        intent.putExtra("result_receiver", new C2322b(this.f1998b, iVar));
        activity.startActivity(intent);
        return iVar.mo34074c();
    }

    public final Task<ReviewInfo> requestReviewFlow() {
        return this.f1997a.mo33941a();
    }
}
