package p035ru.unicorn.ujin;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: ru.unicorn.ujin.ReactEventHook */
public class ReactEventHook extends ReactContextBaseJavaModule {
    private final ReactEventCallback callback;

    public String getName() {
        return "EventHook";
    }

    public ReactEventHook(ReactApplicationContext reactApplicationContext, ReactEventCallback reactEventCallback) {
        super(reactApplicationContext);
        this.callback = reactEventCallback;
    }

    @ReactMethod
    public void sendEvent(String str, ReadableMap readableMap) {
        this.callback.onEventSent(str, readableMap);
    }
}
