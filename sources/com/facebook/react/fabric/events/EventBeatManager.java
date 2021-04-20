package com.facebook.react.fabric.events;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.FabricSoLoader;
import com.facebook.react.uimanager.events.BatchEventDispatchedListener;

public class EventBeatManager implements BatchEventDispatchedListener {
    private final HybridData mHybridData = initHybrid();
    private final ReactApplicationContext mReactApplicationContext;

    /* access modifiers changed from: private */
    public native void beat();

    private static native HybridData initHybrid();

    static {
        FabricSoLoader.staticInit();
    }

    public EventBeatManager(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    public void onBatchEventDispatched() {
        dispatchEventsAsync();
    }

    private void dispatchEventsAsync() {
        if (this.mReactApplicationContext.isOnJSQueueThread()) {
            beat();
        } else {
            this.mReactApplicationContext.runOnJSQueueThread(new Runnable() {
                public void run() {
                    EventBeatManager.this.beat();
                }
            });
        }
    }
}
