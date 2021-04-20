package com.google.android.play.core.review;

import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.splitcompat.C2345p;

public class ReviewManagerFactory {
    private ReviewManagerFactory() {
    }

    public static ReviewManager create(Context context) {
        PlayCoreDialogWrapperActivity.m1114a(context);
        return new C2323c(new C2328h(C2345p.m1447c(context)));
    }
}
