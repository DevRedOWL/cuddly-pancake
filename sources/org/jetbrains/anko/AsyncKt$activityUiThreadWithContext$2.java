package org.jetbrains.anko;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(mo51341bv = {1, 0, 1}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "T", "Landroid/app/Activity;", "run"}, mo51344k = 3, mo51345mv = {1, 1, 5})
/* compiled from: Async.kt */
final class AsyncKt$activityUiThreadWithContext$2 implements Runnable {
    final /* synthetic */ Activity $activity;

    /* renamed from: $f */
    final /* synthetic */ Function2 f6301$f;

    AsyncKt$activityUiThreadWithContext$2(Function2 function2, Activity activity) {
        this.f6301$f = function2;
        this.$activity = activity;
    }

    public final void run() {
        Function2 function2 = this.f6301$f;
        Activity activity = this.$activity;
        function2.invoke(activity, activity);
    }
}
