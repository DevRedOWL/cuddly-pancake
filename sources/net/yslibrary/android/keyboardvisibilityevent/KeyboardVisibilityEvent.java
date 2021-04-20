package net.yslibrary.android.keyboardvisibilityevent;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import net.yslibrary.android.keyboardvisibilityevent.util.UIUtil;

public class KeyboardVisibilityEvent {
    private static final int KEYBOARD_VISIBLE_THRESHOLD_DP = 100;

    public static void setEventListener(Activity activity, KeyboardVisibilityEventListener keyboardVisibilityEventListener) {
        final Unregistrar registerEventListener = registerEventListener(activity, keyboardVisibilityEventListener);
        activity.getApplication().registerActivityLifecycleCallbacks(new AutoActivityLifecycleCallback(activity) {
            /* access modifiers changed from: protected */
            public void onTargetActivityDestroyed() {
                registerEventListener.unregister();
            }
        });
    }

    public static Unregistrar registerEventListener(final Activity activity, final KeyboardVisibilityEventListener keyboardVisibilityEventListener) {
        if (activity == null) {
            throw new NullPointerException("Parameter:activity must not be null");
        } else if (keyboardVisibilityEventListener != null) {
            final View activityRoot = getActivityRoot(activity);
            C50902 r1 = new ViewTreeObserver.OnGlobalLayoutListener() {

                /* renamed from: r */
                private final Rect f6280r = new Rect();
                private final int visibleThreshold = Math.round(UIUtil.convertDpToPx(activity, 100.0f));
                private boolean wasOpened = false;

                public void onGlobalLayout() {
                    activityRoot.getWindowVisibleDisplayFrame(this.f6280r);
                    boolean z = activityRoot.getRootView().getHeight() - this.f6280r.height() > this.visibleThreshold;
                    if (z != this.wasOpened) {
                        this.wasOpened = z;
                        keyboardVisibilityEventListener.onVisibilityChanged(z);
                    }
                }
            };
            activityRoot.getViewTreeObserver().addOnGlobalLayoutListener(r1);
            return new SimpleUnregistrar(activity, r1);
        } else {
            throw new NullPointerException("Parameter:listener must not be null");
        }
    }

    public static boolean isKeyboardVisible(Activity activity) {
        Rect rect = new Rect();
        View activityRoot = getActivityRoot(activity);
        int round = Math.round(UIUtil.convertDpToPx(activity, 100.0f));
        activityRoot.getWindowVisibleDisplayFrame(rect);
        return activityRoot.getRootView().getHeight() - rect.height() > round;
    }

    static View getActivityRoot(Activity activity) {
        return ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
    }
}
