package p035ru.unicorn.ujin;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ru.unicorn.ujin.MyReactPackage */
public class MyReactPackage implements ReactPackage {
    private ReactEventCallback callback;

    public MyReactPackage(ReactEventCallback reactEventCallback) {
        this.callback = reactEventCallback;
    }

    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactEventHook(reactApplicationContext, this.callback));
        return arrayList;
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
