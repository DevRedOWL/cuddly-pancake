package org.jetbrains.anko;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo51341bv = {1, 0, 1}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 1, 5})
/* compiled from: Async.kt */
final class AsyncKt$runOnUiThread$1 implements Runnable {

    /* renamed from: $f */
    final /* synthetic */ Function1 f6305$f;
    final /* synthetic */ Context receiver$0;

    AsyncKt$runOnUiThread$1(Context context, Function1 function1) {
        this.receiver$0 = context;
        this.f6305$f = function1;
    }

    public final void run() {
        this.f6305$f.invoke(this.receiver$0);
    }
}
