package com.afollestad.materialdialogs;

import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* compiled from: DialogBehavior.kt */
final class ModalDialog$onPostShow$1 implements Runnable {
    final /* synthetic */ DialogActionButton $negativeBtn;

    ModalDialog$onPostShow$1(DialogActionButton dialogActionButton) {
        this.$negativeBtn = dialogActionButton;
    }

    public final void run() {
        this.$negativeBtn.requestFocus();
    }
}
