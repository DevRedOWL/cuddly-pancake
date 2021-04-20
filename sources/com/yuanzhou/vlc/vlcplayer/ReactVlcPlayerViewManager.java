package com.yuanzhou.vlc.vlcplayer;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import javax.annotation.Nullable;

public class ReactVlcPlayerViewManager extends SimpleViewManager<ReactVlcPlayerView> {
    private static final String PROP_AUTO_ASPECT_RATIO = "autoAspectRatio";
    private static final String PROP_CLEAR = "clear";
    private static final String PROP_MUTED = "muted";
    private static final String PROP_PAUSED = "paused";
    private static final String PROP_POSITION = "position";
    private static final String PROP_PROGRESS_UPDATE_INTERVAL = "progressUpdateInterval";
    private static final String PROP_RATE = "rate";
    private static final String PROP_REPEAT = "repeat";
    private static final String PROP_RESUME = "resume";
    private static final String PROP_SEEK = "seek";
    private static final String PROP_SNAPSHOT_PATH = "snapshotPath";
    private static final String PROP_SRC = "source";
    private static final String PROP_SRC_IS_NETWORK = "isNetwork";
    private static final String PROP_SRC_TYPE = "type";
    private static final String PROP_SRC_URI = "uri";
    private static final String PROP_VIDEO_ASPECT_RATIO = "videoAspectRatio";
    private static final String PROP_VOLUME = "volume";
    private static final String REACT_CLASS = "RCTVLCPlayer";

    public String getName() {
        return REACT_CLASS;
    }

    /* access modifiers changed from: protected */
    public ReactVlcPlayerView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactVlcPlayerView(themedReactContext);
    }

    public void onDropViewInstance(ReactVlcPlayerView reactVlcPlayerView) {
        reactVlcPlayerView.cleanUpResources();
    }

    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        MapBuilder.Builder builder = MapBuilder.builder();
        for (String str : VideoEventEmitter.Events) {
            builder.put(str, MapBuilder.m697of("registrationName", str));
        }
        return builder.build();
    }

    @ReactProp(name = "clear")
    public void setClear(ReactVlcPlayerView reactVlcPlayerView, boolean z) {
        reactVlcPlayerView.cleanUpResources();
    }

    @ReactProp(name = "source")
    public void setSrc(ReactVlcPlayerView reactVlcPlayerView, @Nullable ReadableMap readableMap) {
        reactVlcPlayerView.getContext().getApplicationContext();
        String string = readableMap.hasKey("uri") ? readableMap.getString("uri") : null;
        if (readableMap.hasKey("type")) {
            readableMap.getString("type");
        }
        if (readableMap.getBoolean(PROP_SRC_IS_NETWORK)) {
            readableMap.getBoolean(PROP_SRC_IS_NETWORK);
        }
        if (readableMap.getBoolean("autoplay")) {
            readableMap.getBoolean("autoplay");
        }
        if (!TextUtils.isEmpty(string)) {
            reactVlcPlayerView.setSrc(readableMap);
        }
    }

    @ReactProp(defaultBoolean = false, name = "repeat")
    public void setRepeat(ReactVlcPlayerView reactVlcPlayerView, boolean z) {
        reactVlcPlayerView.setRepeatModifier(z);
    }

    @ReactProp(defaultFloat = 250.0f, name = "progressUpdateInterval")
    public void setInterval(ReactVlcPlayerView reactVlcPlayerView, float f) {
        reactVlcPlayerView.setmProgressUpdateInterval(f);
    }

    @ReactProp(defaultBoolean = false, name = "paused")
    public void setPaused(ReactVlcPlayerView reactVlcPlayerView, boolean z) {
        reactVlcPlayerView.setPausedModifier(z);
    }

    @ReactProp(defaultBoolean = false, name = "muted")
    public void setMuted(ReactVlcPlayerView reactVlcPlayerView, boolean z) {
        reactVlcPlayerView.setMutedModifier(z);
    }

    @ReactProp(defaultFloat = 1.0f, name = "volume")
    public void setVolume(ReactVlcPlayerView reactVlcPlayerView, float f) {
        reactVlcPlayerView.setVolumeModifier((int) f);
    }

    @ReactProp(name = "seek")
    public void setSeek(ReactVlcPlayerView reactVlcPlayerView, float f) {
        reactVlcPlayerView.seekTo((long) Math.round(f * 1000.0f));
    }

    @ReactProp(defaultBoolean = false, name = "autoAspectRatio")
    public void setAutoAspectRatio(ReactVlcPlayerView reactVlcPlayerView, boolean z) {
        reactVlcPlayerView.setAutoAspectRatio(z);
    }

    @ReactProp(defaultBoolean = true, name = "resume")
    public void setResume(ReactVlcPlayerView reactVlcPlayerView, boolean z) {
        reactVlcPlayerView.doResume(z);
    }

    @ReactProp(name = "rate")
    public void setRate(ReactVlcPlayerView reactVlcPlayerView, float f) {
        reactVlcPlayerView.setRateModifier(f);
    }

    @ReactProp(name = "position")
    public void setPosition(ReactVlcPlayerView reactVlcPlayerView, float f) {
        reactVlcPlayerView.setPosition(f);
    }

    @ReactProp(name = "videoAspectRatio")
    public void setVideoAspectRatio(ReactVlcPlayerView reactVlcPlayerView, String str) {
        reactVlcPlayerView.setAspectRatio(str);
    }

    @ReactProp(name = "snapshotPath")
    public void setSnapshotPath(ReactVlcPlayerView reactVlcPlayerView, String str) {
        reactVlcPlayerView.doSnapshot(str);
    }

    private boolean startsWithValidScheme(String str) {
        return str.startsWith("http://") || str.startsWith("https://") || str.startsWith("content://") || str.startsWith("file://") || str.startsWith("asset://");
    }
}
