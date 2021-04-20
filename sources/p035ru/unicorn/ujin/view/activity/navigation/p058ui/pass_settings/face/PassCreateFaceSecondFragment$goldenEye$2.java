package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.face;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.GoldenEye;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lco/infinum/goldeneye/GoldenEye;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.face.PassCreateFaceSecondFragment$goldenEye$2 */
/* compiled from: PassCreateFaceSecondFragment.kt */
final class PassCreateFaceSecondFragment$goldenEye$2 extends Lambda implements Function0<GoldenEye> {
    final /* synthetic */ PassCreateFaceSecondFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassCreateFaceSecondFragment$goldenEye$2(PassCreateFaceSecondFragment passCreateFaceSecondFragment) {
        super(0);
        this.this$0 = passCreateFaceSecondFragment;
    }

    public final GoldenEye invoke() {
        BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(access$getBaseActivity, "baseActivity");
        return new GoldenEye.Builder(access$getBaseActivity).build();
    }
}
