package com.beefe.picker.view;

import java.util.TimerTask;

final class InertiaTimerTask extends TimerTask {

    /* renamed from: a */
    float f1186a = 2.14748365E9f;
    final LoopView loopView;
    final float velocityY;

    InertiaTimerTask(LoopView loopView2, float f) {
        this.loopView = loopView2;
        this.velocityY = f;
    }

    public final void run() {
        if (this.f1186a == 2.14748365E9f) {
            if (Math.abs(this.velocityY) <= 2000.0f) {
                this.f1186a = this.velocityY;
            } else if (this.velocityY > 0.0f) {
                this.f1186a = 2000.0f;
            } else {
                this.f1186a = -2000.0f;
            }
        }
        if (Math.abs(this.f1186a) < 0.0f || Math.abs(this.f1186a) > 20.0f) {
            this.loopView.totalScrollY -= (int) ((this.f1186a * 10.0f) / 1000.0f);
            if (!this.loopView.isLoop) {
                float f = this.loopView.lineSpacingMultiplier * ((float) this.loopView.maxTextHeight);
                if (this.loopView.totalScrollY <= ((int) (((float) (-this.loopView.initPosition)) * f))) {
                    this.f1186a = 40.0f;
                    LoopView loopView2 = this.loopView;
                    loopView2.totalScrollY = (int) (((float) (-loopView2.initPosition)) * f);
                } else if (this.loopView.totalScrollY >= ((int) (((float) ((this.loopView.items.size() - 1) - this.loopView.initPosition)) * f))) {
                    LoopView loopView3 = this.loopView;
                    loopView3.totalScrollY = (int) (((float) ((loopView3.items.size() - 1) - this.loopView.initPosition)) * f);
                    this.f1186a = -40.0f;
                }
            }
            float f2 = this.f1186a;
            if (f2 < 0.0f) {
                this.f1186a = f2 + 20.0f;
            } else {
                this.f1186a = f2 - 20.0f;
            }
            this.loopView.handler.sendEmptyMessage(1000);
            return;
        }
        this.loopView.cancelFuture();
        this.loopView.handler.sendEmptyMessage(MessageHandler.WHAT_SMOOTH_SCROLL);
    }
}
