package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.internal.C2237ac;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2251aq;
import com.google.android.play.core.tasks.C2415i;
import com.google.android.play.core.tasks.Task;

/* renamed from: com.google.android.play.core.review.h */
public final class C2328h {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C2241ag f2005b = new C2241ag("ReviewService");

    /* renamed from: a */
    final C2251aq<C2237ac> f2006a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f2007c;

    public C2328h(Context context) {
        this.f2007c = context.getPackageName();
        Context context2 = context;
        this.f2006a = new C2251aq(context2, f2005b, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), C2324d.f1999a);
    }

    /* renamed from: a */
    public final Task<ReviewInfo> mo33941a() {
        f2005b.mo33811d("requestInAppReview (%s)", this.f2007c);
        C2415i iVar = new C2415i();
        this.f2006a.mo33819a(new C2325e(this, iVar, iVar));
        return iVar.mo34074c();
    }
}
