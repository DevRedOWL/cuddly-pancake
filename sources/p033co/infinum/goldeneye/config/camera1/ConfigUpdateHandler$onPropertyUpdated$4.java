package p033co.infinum.goldeneye.config.camera1;

import android.hardware.Camera;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera1.ConfigUpdateHandler$onPropertyUpdated$4 */
/* compiled from: ConfigUpdateHandler.kt */
final class ConfigUpdateHandler$onPropertyUpdated$4 extends Lambda implements Function1<Camera.Parameters, Unit> {
    final /* synthetic */ ConfigUpdateHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfigUpdateHandler$onPropertyUpdated$4(ConfigUpdateHandler configUpdateHandler) {
        super(1);
        this.this$0 = configUpdateHandler;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Camera.Parameters) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Camera.Parameters parameters) {
        Intrinsics.checkParameterIsNotNull(parameters, "receiver$0");
        parameters.setAntibanding(this.this$0.config.getAntibandingMode().toCamera1());
    }
}
