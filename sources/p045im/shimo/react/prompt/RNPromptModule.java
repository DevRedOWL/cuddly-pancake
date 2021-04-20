package p045im.shimo.react.prompt;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = "PromptAndroid")
/* renamed from: im.shimo.react.prompt.RNPromptModule */
public class RNPromptModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final Map<String, Object> CONSTANTS = MapBuilder.m701of(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, "dismissed", "dismissed", KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);
    static final String FRAGMENT_TAG = "im.shimo.react.prompt.RNPromptModule";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_DEFAULT_VALUE = "defaultValue";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_PLACEHOLDER = "placeholder";
    static final String KEY_STYLE = "style";
    static final String KEY_TITLE = "title";
    static final String KEY_TYPE = "type";
    static final String NAME = "PromptAndroid";
    private boolean mIsInForeground;

    public String getName() {
        return NAME;
    }

    public void onHostDestroy() {
    }

    public RNPromptModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    public void onHostPause() {
        this.mIsInForeground = false;
    }

    public void onHostResume() {
        this.mIsInForeground = true;
        FragmentManagerHelper fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.showPendingAlert();
        } else {
            FLog.m658w((Class<?>) DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @ReactMethod
    public void promptWithArgs(ReadableMap readableMap, Callback callback) {
        FragmentManagerHelper fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            FLog.m658w((Class<?>) RNPromptModule.class, "Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("title")) {
            bundle.putString("title", readableMap.getString("title"));
        }
        if (readableMap.hasKey(KEY_MESSAGE) && !readableMap.getString(KEY_MESSAGE).isEmpty()) {
            bundle.putString(KEY_MESSAGE, readableMap.getString(KEY_MESSAGE));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey("items")) {
            ReadableArray array = readableMap.getArray("items");
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray("items", charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        if (readableMap.hasKey("type")) {
            bundle.putString("type", readableMap.getString("type"));
        }
        if (readableMap.hasKey("style")) {
            bundle.putString("style", readableMap.getString("style"));
        }
        if (readableMap.hasKey(KEY_DEFAULT_VALUE)) {
            bundle.putString(KEY_DEFAULT_VALUE, readableMap.getString(KEY_DEFAULT_VALUE));
        }
        if (readableMap.hasKey("placeholder")) {
            bundle.putString("placeholder", readableMap.getString("placeholder"));
        }
        fragmentManagerHelper.showNewAlert(this.mIsInForeground, bundle, callback);
    }

    /* renamed from: im.shimo.react.prompt.RNPromptModule$FragmentManagerHelper */
    private class FragmentManagerHelper {
        @Nullable
        private final FragmentManager mFragmentManager;
        @Nullable
        private RNPromptFragment mFragmentToShow;

        public FragmentManagerHelper(FragmentManager fragmentManager) {
            this.mFragmentManager = fragmentManager;
        }

        public void showPendingAlert() {
            RNPromptFragment rNPromptFragment = this.mFragmentToShow;
            if (rNPromptFragment != null) {
                rNPromptFragment.show(this.mFragmentManager, RNPromptModule.FRAGMENT_TAG);
                this.mFragmentToShow = null;
            }
        }

        private void dismissExisting() {
            RNPromptFragment rNPromptFragment;
            FragmentManager fragmentManager = this.mFragmentManager;
            if (fragmentManager != null && (rNPromptFragment = (RNPromptFragment) fragmentManager.findFragmentByTag(RNPromptModule.FRAGMENT_TAG)) != null) {
                rNPromptFragment.dismiss();
            }
        }

        public void showNewAlert(boolean z, Bundle bundle, Callback callback) {
            dismissExisting();
            PromptFragmentListener promptFragmentListener = callback != null ? new PromptFragmentListener(callback) : null;
            RNPromptFragment rNPromptFragment = new RNPromptFragment();
            rNPromptFragment.setListener(promptFragmentListener);
            rNPromptFragment.setArguments(bundle);
            if (z) {
                if (bundle.containsKey(RNPromptModule.KEY_CANCELABLE)) {
                    rNPromptFragment.setCancelable(bundle.getBoolean(RNPromptModule.KEY_CANCELABLE));
                }
                rNPromptFragment.show(this.mFragmentManager, RNPromptModule.FRAGMENT_TAG);
                return;
            }
            this.mFragmentToShow = rNPromptFragment;
        }
    }

    /* renamed from: im.shimo.react.prompt.RNPromptModule$PromptFragmentListener */
    class PromptFragmentListener implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
        private final Callback mCallback;
        private boolean mCallbackConsumed = false;

        public PromptFragmentListener(Callback callback) {
            this.mCallback = callback;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            onConfirm(i, "");
        }

        public void onConfirm(int i, String str) {
            if (!this.mCallbackConsumed && RNPromptModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.mCallback.invoke(RNPromptModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i), str);
                this.mCallbackConsumed = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.mCallbackConsumed && RNPromptModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.mCallback.invoke("dismissed");
                this.mCallbackConsumed = true;
            }
        }
    }

    public Map<String, Object> getConstants() {
        return CONSTANTS;
    }

    @Nullable
    private FragmentManagerHelper getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return new FragmentManagerHelper(currentActivity.getFragmentManager());
    }
}
