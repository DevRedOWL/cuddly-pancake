package com.swmansion.gesturehandler.react;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;

@ReactModule(name = "GestureHandlerRootView")
public class RNGestureHandlerRootViewManager extends ViewGroupManager<RNGestureHandlerRootView> {
    public static final String REACT_CLASS = "GestureHandlerRootView";

    public String getName() {
        return REACT_CLASS;
    }

    /* access modifiers changed from: protected */
    public RNGestureHandlerRootView createViewInstance(ThemedReactContext themedReactContext) {
        return new RNGestureHandlerRootView(themedReactContext);
    }

    public void onDropViewInstance(RNGestureHandlerRootView rNGestureHandlerRootView) {
        rNGestureHandlerRootView.tearDown();
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m698of(RNGestureHandlerEvent.EVENT_NAME, MapBuilder.m697of("registrationName", RNGestureHandlerEvent.EVENT_NAME), RNGestureHandlerStateChangeEvent.EVENT_NAME, MapBuilder.m697of("registrationName", RNGestureHandlerStateChangeEvent.EVENT_NAME));
    }
}
