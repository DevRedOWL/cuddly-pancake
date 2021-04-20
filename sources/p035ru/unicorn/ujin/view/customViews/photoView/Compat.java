package p035ru.unicorn.ujin.view.customViews.photoView;

import android.os.Build;
import android.view.View;

/* renamed from: ru.unicorn.ujin.view.customViews.photoView.Compat */
class Compat {
    private static final int SIXTY_FPS_INTERVAL = 16;

    Compat() {
    }

    public static void postOnAnimation(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            postOnAnimationJellyBean(view, runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }

    private static void postOnAnimationJellyBean(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
