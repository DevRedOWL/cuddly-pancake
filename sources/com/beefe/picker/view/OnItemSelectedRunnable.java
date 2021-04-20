package com.beefe.picker.view;

final class OnItemSelectedRunnable implements Runnable {
    final LoopView loopView;

    OnItemSelectedRunnable(LoopView loopView2) {
        this.loopView = loopView2;
    }

    public final void run() {
        this.loopView.onItemSelectedListener.onItemSelected(this.loopView.getSelectedItem(), this.loopView.getSelectedIndex());
    }
}
