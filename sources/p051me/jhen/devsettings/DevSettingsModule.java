package p051me.jhen.devsettings;

import android.os.Handler;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.devsupport.DevInternalSettings;
import com.facebook.react.devsupport.DevSupportManagerImpl;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* renamed from: me.jhen.devsettings.DevSettingsModule */
public class DevSettingsModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "DevSettings";
    /* access modifiers changed from: private */
    public DevSupportManagerImpl devManager = null;
    private ReactInstanceManager instanceManager = null;
    private ReactApplicationContext reactContext = null;
    private ReactNativeHost rnHost = null;
    private Boolean useDeveloperSupport = false;

    public String getName() {
        return "DevSettings";
    }

    public DevSettingsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        this.rnHost = ((ReactApplication) reactApplicationContext.getApplicationContext()).getReactNativeHost();
        this.instanceManager = this.rnHost.getReactInstanceManager();
        this.useDeveloperSupport = Boolean.valueOf(this.rnHost.getUseDeveloperSupport());
        if (this.useDeveloperSupport.booleanValue()) {
            this.devManager = (DevSupportManagerImpl) this.instanceManager.getDevSupportManager();
        }
    }

    /* access modifiers changed from: private */
    public void handleReloadJS() {
        getCurrentActivity().runOnUiThread(new Runnable() {
            public void run() {
                DevSettingsModule.this.devManager.handleReloadJS();
            }
        });
    }

    @ReactMethod
    public void reload() {
        if (this.useDeveloperSupport.booleanValue()) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    DevSettingsModule.this.handleReloadJS();
                }
            }, 50);
        }
    }

    @ReactMethod
    public void toggleElementInspector() {
        if (this.useDeveloperSupport.booleanValue()) {
            DevInternalSettings devInternalSettings = (DevInternalSettings) this.devManager.getDevSettings();
            devInternalSettings.setElementInspectorEnabled(!devInternalSettings.isElementInspectorEnabled());
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("toggleElementInspector", (Object) null);
        }
    }

    @ReactMethod
    public void setLiveReloadEnabled(boolean z) {
        if (this.useDeveloperSupport.booleanValue()) {
            DevInternalSettings devInternalSettings = (DevInternalSettings) this.devManager.getDevSettings();
            devInternalSettings.setReloadOnJSChangeEnabled(!devInternalSettings.isReloadOnJSChangeEnabled());
        }
    }

    @ReactMethod
    public void setHotLoadingEnabled(boolean z) {
        if (this.useDeveloperSupport.booleanValue()) {
            DevInternalSettings devInternalSettings = (DevInternalSettings) this.devManager.getDevSettings();
            Boolean valueOf = Boolean.valueOf(z != devInternalSettings.isHotModuleReplacementEnabled());
            devInternalSettings.setHotModuleReplacementEnabled(z);
            if (valueOf.booleanValue()) {
                reload();
            }
        }
    }

    @ReactMethod
    public void setIsDebuggingRemotely(boolean z) {
        if (this.useDeveloperSupport.booleanValue()) {
            DevInternalSettings devInternalSettings = (DevInternalSettings) this.devManager.getDevSettings();
            Boolean valueOf = Boolean.valueOf(z != devInternalSettings.isRemoteJSDebugEnabled());
            devInternalSettings.setRemoteJSDebugEnabled(z);
            if (valueOf.booleanValue()) {
                reload();
            }
        }
    }

    @ReactMethod
    public void show() {
        if (this.useDeveloperSupport.booleanValue()) {
            getCurrentActivity().runOnUiThread(new Runnable() {
                public void run() {
                    DevSettingsModule.this.devManager.showDevOptionsDialog();
                }
            });
        }
    }
}
