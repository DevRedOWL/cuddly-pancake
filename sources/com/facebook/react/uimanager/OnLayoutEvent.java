package com.facebook.react.uimanager;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.TouchesHelper;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

public class OnLayoutEvent extends Event<OnLayoutEvent> {
    private static final Pools.SynchronizedPool<OnLayoutEvent> EVENTS_POOL = new Pools.SynchronizedPool<>(20);
    private int mHeight;
    private int mWidth;

    /* renamed from: mX */
    private int f1327mX;

    /* renamed from: mY */
    private int f1328mY;

    public String getEventName() {
        return "topLayout";
    }

    public static OnLayoutEvent obtain(int i, int i2, int i3, int i4, int i5) {
        OnLayoutEvent acquire = EVENTS_POOL.acquire();
        if (acquire == null) {
            acquire = new OnLayoutEvent();
        }
        acquire.init(i, i2, i3, i4, i5);
        return acquire;
    }

    public void onDispose() {
        EVENTS_POOL.release(this);
    }

    private OnLayoutEvent() {
    }

    /* access modifiers changed from: protected */
    public void init(int i, int i2, int i3, int i4, int i5) {
        super.init(i);
        this.f1327mX = i2;
        this.f1328mY = i3;
        this.mWidth = i4;
        this.mHeight = i5;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(MapPoint.JsonFields.f6911x, (double) PixelUtil.toDIPFromPixel((float) this.f1327mX));
        createMap.putDouble(MapPoint.JsonFields.f6912y, (double) PixelUtil.toDIPFromPixel((float) this.f1328mY));
        createMap.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mWidth));
        createMap.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mHeight));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), createMap2);
    }
}
