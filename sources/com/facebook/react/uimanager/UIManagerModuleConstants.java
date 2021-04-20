package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.events.TouchEventType;
import com.facebook.react.views.picker.events.PickerItemSelectEvent;
import com.reactnativecommunity.webview.events.TopLoadingErrorEvent;
import com.reactnativecommunity.webview.events.TopLoadingFinishEvent;
import com.reactnativecommunity.webview.events.TopLoadingStartEvent;
import com.reactnativecommunity.webview.events.TopMessageEvent;
import java.util.HashMap;
import java.util.Map;

class UIManagerModuleConstants {
    public static final String ACTION_DISMISSED = "dismissed";
    public static final String ACTION_ITEM_SELECTED = "itemSelected";

    UIManagerModuleConstants() {
    }

    static Map getBubblingEventTypeConstants() {
        return MapBuilder.builder().put("topChange", MapBuilder.m697of("phasedRegistrationNames", MapBuilder.m698of("bubbled", "onChange", "captured", "onChangeCapture"))).put(PickerItemSelectEvent.EVENT_NAME, MapBuilder.m697of("phasedRegistrationNames", MapBuilder.m698of("bubbled", "onSelect", "captured", "onSelectCapture"))).put(TouchEventType.getJSEventName(TouchEventType.START), MapBuilder.m697of("phasedRegistrationNames", MapBuilder.m698of("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).put(TouchEventType.getJSEventName(TouchEventType.MOVE), MapBuilder.m697of("phasedRegistrationNames", MapBuilder.m698of("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).put(TouchEventType.getJSEventName(TouchEventType.END), MapBuilder.m697of("phasedRegistrationNames", MapBuilder.m698of("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).put(TouchEventType.getJSEventName(TouchEventType.CANCEL), MapBuilder.m697of("phasedRegistrationNames", MapBuilder.m698of("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).build();
    }

    static Map getDirectEventTypeConstants() {
        return MapBuilder.builder().put("topContentSizeChange", MapBuilder.m697of("registrationName", "onContentSizeChange")).put("topLayout", MapBuilder.m697of("registrationName", ViewProps.ON_LAYOUT)).put(TopLoadingErrorEvent.EVENT_NAME, MapBuilder.m697of("registrationName", "onLoadingError")).put(TopLoadingFinishEvent.EVENT_NAME, MapBuilder.m697of("registrationName", "onLoadingFinish")).put(TopLoadingStartEvent.EVENT_NAME, MapBuilder.m697of("registrationName", "onLoadingStart")).put("topSelectionChange", MapBuilder.m697of("registrationName", "onSelectionChange")).put(TopMessageEvent.EVENT_NAME, MapBuilder.m697of("registrationName", "onMessage")).put("topClick", MapBuilder.m697of("registrationName", "onClick")).put("topScrollBeginDrag", MapBuilder.m697of("registrationName", "onScrollBeginDrag")).put("topScrollEndDrag", MapBuilder.m697of("registrationName", "onScrollEndDrag")).put("topScroll", MapBuilder.m697of("registrationName", "onScroll")).put("topMomentumScrollBegin", MapBuilder.m697of("registrationName", "onMomentumScrollBegin")).put("topMomentumScrollEnd", MapBuilder.m697of("registrationName", "onMomentumScrollEnd")).build();
    }

    public static Map<String, Object> getConstants() {
        HashMap newHashMap = MapBuilder.newHashMap();
        newHashMap.put("UIView", MapBuilder.m697of("ContentMode", MapBuilder.m699of("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        newHashMap.put("StyleConstants", MapBuilder.m697of("PointerEventsValues", MapBuilder.m700of("none", Integer.valueOf(PointerEvents.NONE.ordinal()), "boxNone", Integer.valueOf(PointerEvents.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(PointerEvents.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(PointerEvents.AUTO.ordinal()))));
        newHashMap.put("PopupMenu", MapBuilder.m698of(ACTION_DISMISSED, ACTION_DISMISSED, ACTION_ITEM_SELECTED, ACTION_ITEM_SELECTED));
        newHashMap.put("AccessibilityEventTypes", MapBuilder.m699of("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return newHashMap;
    }
}
