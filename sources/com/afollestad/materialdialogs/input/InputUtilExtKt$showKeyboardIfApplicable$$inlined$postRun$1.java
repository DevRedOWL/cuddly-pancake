package com.afollestad.materialdialogs.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "run", "com/afollestad/materialdialogs/input/InputUtilExtKt$postRun$1"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* compiled from: InputUtilExt.kt */
public final class InputUtilExtKt$showKeyboardIfApplicable$$inlined$postRun$1 implements Runnable {
    final /* synthetic */ View $this_postRun;
    final /* synthetic */ MaterialDialog $this_showKeyboardIfApplicable$inlined;

    public InputUtilExtKt$showKeyboardIfApplicable$$inlined$postRun$1(View view, MaterialDialog materialDialog) {
        this.$this_postRun = view;
        this.$this_showKeyboardIfApplicable$inlined = materialDialog;
    }

    public final void run() {
        EditText editText = (EditText) this.$this_postRun;
        editText.requestFocus();
        Object systemService = this.$this_showKeyboardIfApplicable$inlined.getWindowContext().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
