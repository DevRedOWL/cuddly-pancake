package com.google.android.play.core.review.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;

public class FakeReviewManager implements ReviewManager {

    /* renamed from: a */
    private final Context f2008a;

    /* renamed from: b */
    private ReviewInfo f2009b;

    public FakeReviewManager(Context context) {
        this.f2008a = context;
    }

    public Task<Void> launchReviewFlow(Activity activity, ReviewInfo reviewInfo) {
        return reviewInfo != this.f2009b ? Tasks.m1600b(new C2329a()) : Tasks.m1599a(null);
    }

    public Task<ReviewInfo> requestReviewFlow() {
        this.f2009b = ReviewInfo.m1388b(PendingIntent.getBroadcast(this.f2008a, 0, new Intent(), 0));
        return Tasks.m1599a(this.f2009b);
    }
}
