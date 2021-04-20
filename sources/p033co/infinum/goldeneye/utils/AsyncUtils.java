package p033co.infinum.goldeneye.utils;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Metadata;
import p033co.infinum.goldeneye.ThreadNotStartedException;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, mo51343d2 = {"Lco/infinum/goldeneye/utils/AsyncUtils;", "", "()V", "_backgroundHandler", "Landroid/os/Handler;", "backgroundHandler", "getBackgroundHandler", "()Landroid/os/Handler;", "backgroundThread", "Landroid/os/HandlerThread;", "startBackgroundThread", "", "stopBackgroundThread", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.utils.AsyncUtils */
/* compiled from: AsyncUtils.kt */
public final class AsyncUtils {
    public static final AsyncUtils INSTANCE = new AsyncUtils();
    private static Handler _backgroundHandler;
    private static HandlerThread backgroundThread;

    private AsyncUtils() {
    }

    public final Handler getBackgroundHandler() {
        Handler handler = _backgroundHandler;
        if (handler != null) {
            return handler;
        }
        throw ThreadNotStartedException.INSTANCE;
    }

    public final void startBackgroundThread() {
        if (_backgroundHandler == null) {
            backgroundThread = new HandlerThread("GoldenEye");
            HandlerThread handlerThread = backgroundThread;
            if (handlerThread != null) {
                handlerThread.start();
            }
            HandlerThread handlerThread2 = backgroundThread;
            _backgroundHandler = new Handler(handlerThread2 != null ? handlerThread2.getLooper() : null);
        }
    }

    public final void stopBackgroundThread() {
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                HandlerThread handlerThread = backgroundThread;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
            } else {
                HandlerThread handlerThread2 = backgroundThread;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                }
            }
            HandlerThread handlerThread3 = backgroundThread;
            if (handlerThread3 != null) {
                handlerThread3.join();
            }
        } catch (Throwable th) {
            _backgroundHandler = null;
            backgroundThread = null;
            throw th;
        }
        _backgroundHandler = null;
        backgroundThread = null;
    }
}
