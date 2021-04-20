package p033co.infinum.goldeneye;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.config.camera2.ConfigUpdateHandler;
import p033co.infinum.goldeneye.models.CameraProperty;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Lco/infinum/goldeneye/models/CameraProperty;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye2Impl$onConfigUpdateListener$1 */
/* compiled from: GoldenEye2Impl.kt */
final class GoldenEye2Impl$onConfigUpdateListener$1 extends Lambda implements Function1<CameraProperty, Unit> {
    final /* synthetic */ GoldenEye2Impl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GoldenEye2Impl$onConfigUpdateListener$1(GoldenEye2Impl goldenEye2Impl) {
        super(1);
        this.this$0 = goldenEye2Impl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CameraProperty) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(CameraProperty cameraProperty) {
        Intrinsics.checkParameterIsNotNull(cameraProperty, "it");
        ConfigUpdateHandler access$getConfigUpdateHandler$p = this.this$0.configUpdateHandler;
        if (access$getConfigUpdateHandler$p != null) {
            access$getConfigUpdateHandler$p.onPropertyUpdated(cameraProperty);
        }
    }
}
