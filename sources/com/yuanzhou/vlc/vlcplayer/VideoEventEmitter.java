package com.yuanzhou.vlc.vlcplayer;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class VideoEventEmitter {
    public static final String EVENT_END = "onVideoEnd";
    public static final String EVENT_LOAD_START = "onVideoLoadStart";
    public static final String EVENT_ON_ERROR = "onVideoError";
    public static final String EVENT_ON_IS_PLAYING = "onVideoPlaying";
    public static final String EVENT_ON_OPEN = "onVideoOpen";
    public static final String EVENT_ON_PAUSED = "onVideoPaused";
    public static final String EVENT_ON_VIDEO_BUFFERING = "onVideoBuffering";
    public static final String EVENT_ON_VIDEO_STATE_CHANGE = "onVideoStateChange";
    public static final String EVENT_ON_VIDEO_STOPPED = "onVideoStopped";
    public static final String EVENT_PROGRESS = "onVideoProgress";
    private static final String EVENT_PROP_ERROR = "error";
    private static final String EVENT_PROP_ERROR_EXCEPTION = "";
    private static final String EVENT_PROP_ERROR_STRING = "errorString";
    public static final String EVENT_SEEK = "onVideoSeek";
    public static final String EVENT_SNAPSHOT = "onSnapshot";
    static final String[] Events = {EVENT_LOAD_START, EVENT_PROGRESS, EVENT_SEEK, EVENT_END, EVENT_SNAPSHOT, EVENT_ON_IS_PLAYING, EVENT_ON_VIDEO_STATE_CHANGE, EVENT_ON_OPEN, EVENT_ON_PAUSED, EVENT_ON_VIDEO_BUFFERING, EVENT_ON_ERROR, EVENT_ON_VIDEO_STOPPED};
    private final RCTEventEmitter eventEmitter;
    private int viewId = -1;

    @Retention(RetentionPolicy.SOURCE)
    @interface VideoEvents {
    }

    VideoEventEmitter(ReactContext reactContext) {
        this.eventEmitter = (RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class);
    }

    /* access modifiers changed from: package-private */
    public void setViewId(int i) {
        this.viewId = i;
    }

    /* access modifiers changed from: package-private */
    public void loadStart() {
        receiveEvent(EVENT_LOAD_START, Arguments.createMap());
    }

    /* access modifiers changed from: package-private */
    public void progressChanged(double d, double d2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("currentTime", d);
        createMap.putDouble("duration", d2);
        receiveEvent(EVENT_PROGRESS, createMap);
    }

    /* access modifiers changed from: package-private */
    public void error(String str, Exception exc) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(EVENT_PROP_ERROR_STRING, str);
        createMap.putString("", exc.getMessage());
        Arguments.createMap().putMap("error", createMap);
    }

    /* access modifiers changed from: package-private */
    public void onSnapshot(int i) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("isSuccess", i);
        receiveEvent(EVENT_SNAPSHOT, createMap);
    }

    /* access modifiers changed from: package-private */
    public void isPlaying(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isPlaying", z);
        receiveEvent(EVENT_ON_IS_PLAYING, createMap);
    }

    /* access modifiers changed from: package-private */
    public void onVideoStateChange(WritableMap writableMap) {
        receiveEvent(EVENT_ON_VIDEO_STATE_CHANGE, writableMap);
    }

    /* access modifiers changed from: package-private */
    public void sendEvent(WritableMap writableMap, String str) {
        receiveEvent(str, writableMap);
    }

    private void receiveEvent(String str, WritableMap writableMap) {
        this.eventEmitter.receiveEvent(this.viewId, str, writableMap);
    }
}
