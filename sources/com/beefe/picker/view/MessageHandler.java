package com.beefe.picker.view;

import android.os.Handler;
import android.os.Message;
import com.beefe.picker.view.LoopView;

final class MessageHandler extends Handler {
    public static final int WHAT_INVALIDATE_LOOP_VIEW = 1000;
    public static final int WHAT_ITEM_SELECTED = 3000;
    public static final int WHAT_SMOOTH_SCROLL = 2000;
    final LoopView loopview;

    MessageHandler(LoopView loopView) {
        this.loopview = loopView;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1000) {
            this.loopview.invalidate();
        } else if (i == 2000) {
            this.loopview.smoothScroll(LoopView.ACTION.FLING);
        } else if (i == 3000) {
            this.loopview.onItemSelected();
        }
    }
}
