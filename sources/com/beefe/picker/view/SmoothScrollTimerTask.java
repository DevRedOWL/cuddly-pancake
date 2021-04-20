package com.beefe.picker.view;

import java.util.TimerTask;

final class SmoothScrollTimerTask extends TimerTask {
    final LoopView loopView;
    int offset;
    int realOffset = 0;
    int realTotalOffset = Integer.MAX_VALUE;

    SmoothScrollTimerTask(LoopView loopView2, int i) {
        this.loopView = loopView2;
        this.offset = i;
    }

    public final void run() {
        if (this.realTotalOffset == Integer.MAX_VALUE) {
            this.realTotalOffset = this.offset;
        }
        int i = this.realTotalOffset;
        this.realOffset = (int) (((float) i) * 0.1f);
        if (this.realOffset == 0) {
            if (i < 0) {
                this.realOffset = -1;
            } else {
                this.realOffset = 1;
            }
        }
        if (Math.abs(this.realTotalOffset) <= 0) {
            this.loopView.cancelFuture();
            this.loopView.handler.sendEmptyMessage(3000);
            return;
        }
        this.loopView.totalScrollY += this.realOffset;
        this.loopView.handler.sendEmptyMessage(1000);
        this.realTotalOffset -= this.realOffset;
    }
}
