package p033co.infinum.goldeneye.extensions;

import android.content.Context;
import androidx.core.app.ActivityCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, mo51343d2 = {"hasAudioPermission", "", "Landroid/content/Context;", "hasCameraPermission", "hasPermission", "permission", "", "goldeneye_release"}, mo51344k = 2, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.extensions.ContextKt */
/* compiled from: Context.kt */
public final class ContextKt {
    public static final boolean hasCameraPermission(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        return hasPermission(context, "android.permission.CAMERA");
    }

    public static final boolean hasAudioPermission(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        return hasPermission(context, "android.permission.RECORD_AUDIO");
    }

    private static final boolean hasPermission(Context context, String str) {
        return ActivityCompat.checkSelfPermission(context, str) == 0;
    }
}
