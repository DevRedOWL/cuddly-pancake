package p033co.infinum.goldeneye.models;

import android.hardware.Camera;
import android.util.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0001¨\u0006\u0005"}, mo51343d2 = {"toInternalSize", "Lco/infinum/goldeneye/models/Size;", "Landroid/hardware/Camera$Size;", "Landroid/hardware/Camera;", "Landroid/util/Size;", "goldeneye_release"}, mo51344k = 2, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.models.SizeKt */
/* compiled from: Size.kt */
public final class SizeKt {
    public static final Size toInternalSize(Camera.Size size) {
        Intrinsics.checkParameterIsNotNull(size, "receiver$0");
        return new Size(size.width, size.height);
    }

    public static final Size toInternalSize(Size size) {
        Intrinsics.checkParameterIsNotNull(size, "receiver$0");
        return new Size(size.getWidth(), size.getHeight());
    }
}
