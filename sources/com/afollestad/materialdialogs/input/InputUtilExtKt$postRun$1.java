package com.afollestad.materialdialogs.input;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "run"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* compiled from: InputUtilExt.kt */
public final class InputUtilExtKt$postRun$1 implements Runnable {
    final /* synthetic */ Function1 $exec;
    final /* synthetic */ View $this_postRun;

    public InputUtilExtKt$postRun$1(View view, Function1 function1) {
        this.$this_postRun = view;
        this.$exec = function1;
    }

    public final void run() {
        this.$exec.invoke(this.$this_postRun);
    }
}
