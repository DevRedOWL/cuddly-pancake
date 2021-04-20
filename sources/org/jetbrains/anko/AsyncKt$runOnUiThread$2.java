package org.jetbrains.anko;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(mo51341bv = {1, 0, 1}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 1, 5})
/* compiled from: Async.kt */
public final class AsyncKt$runOnUiThread$2 implements Runnable {

    /* renamed from: $f */
    final /* synthetic */ Function0 f6306$f;

    public AsyncKt$runOnUiThread$2(Function0 function0) {
        this.f6306$f = function0;
    }

    public final void run() {
        this.f6306$f.invoke();
    }
}
