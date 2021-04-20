package p033co.infinum.goldeneye.config.camera2;

import android.hardware.camera2.CaptureRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "", "Landroid/hardware/camera2/CaptureRequest$Builder;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera2.ConfigUpdateHandler$onPropertyUpdated$2 */
/* compiled from: ConfigUpdateHandler.kt */
final class ConfigUpdateHandler$onPropertyUpdated$2 extends Lambda implements Function1<CaptureRequest.Builder, Unit> {
    final /* synthetic */ ConfigUpdateHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigUpdateHandler$onPropertyUpdated$2(ConfigUpdateHandler configUpdateHandler) {
        super(1);
        this.this$0 = configUpdateHandler;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CaptureRequest.Builder) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(CaptureRequest.Builder builder) {
        Intrinsics.checkParameterIsNotNull(builder, "receiver$0");
        ConfigUpdateHandler configUpdateHandler = this.this$0;
        configUpdateHandler.updateFlashMode(builder, configUpdateHandler.config.getFlashMode());
    }
}
