package com.bumptech.glide.manager;

import android.app.Activity;

final class DoNothingFirstFrameWaiter implements FrameWaiter {
    public void registerSelf(Activity activity) {
    }

    DoNothingFirstFrameWaiter() {
    }
}
