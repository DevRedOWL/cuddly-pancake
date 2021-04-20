package p033co.infinum.goldeneye.extensions;

import android.hardware.camera2.CaptureResult;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0005"}, mo51343d2 = {"isExposureReady", "", "Landroid/hardware/camera2/CaptureResult;", "isFocusReady", "isLocked", "goldeneye_release"}, mo51344k = 2, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.extensions.CaptureResultKt */
/* compiled from: CaptureResult.kt */
public final class CaptureResultKt {
    public static final boolean isLocked(CaptureResult captureResult) {
        return isFocusReady(captureResult) && isExposureReady(captureResult);
    }

    private static final boolean isExposureReady(CaptureResult captureResult) {
        if (captureResult == null) {
            return false;
        }
        Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AE_MODE);
        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
        if ((num != null && num.intValue() == 0) || num2 == null || num2.intValue() == 2 || num2.intValue() == 4 || num2.intValue() == 3) {
            return true;
        }
        return false;
    }

    public static final boolean isFocusReady(CaptureResult captureResult) {
        if (captureResult == null) {
            return false;
        }
        Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_MODE);
        if ((num2 != null && num2.intValue() == 0) || ((num != null && num.intValue() == 0) || ((num != null && num.intValue() == 4) || ((num != null && num.intValue() == 5) || ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 6)))))) {
            return true;
        }
        return false;
    }
}
