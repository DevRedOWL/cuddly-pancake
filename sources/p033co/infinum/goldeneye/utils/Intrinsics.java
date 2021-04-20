package p033co.infinum.goldeneye.utils;

import android.content.Context;
import android.os.Looper;
import kotlin.Metadata;
import p033co.infinum.goldeneye.MissingCameraPermissionException;
import p033co.infinum.goldeneye.TaskOnMainThreadException;
import p033co.infinum.goldeneye.extensions.ContextKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, mo51343d2 = {"Lco/infinum/goldeneye/utils/Intrinsics;", "", "()V", "checkCameraPermission", "", "context", "Landroid/content/Context;", "checkMainThread", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.utils.Intrinsics */
/* compiled from: Intrinsics.kt */
public final class Intrinsics {
    public static final Intrinsics INSTANCE = new Intrinsics();

    private Intrinsics() {
    }

    public final void checkCameraPermission(Context context) throws MissingCameraPermissionException {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        if (!ContextKt.hasCameraPermission(context)) {
            throw MissingCameraPermissionException.INSTANCE;
        }
    }

    public final void checkMainThread() {
        if (kotlin.jvm.internal.Intrinsics.areEqual((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            throw TaskOnMainThreadException.INSTANCE;
        }
    }
}
