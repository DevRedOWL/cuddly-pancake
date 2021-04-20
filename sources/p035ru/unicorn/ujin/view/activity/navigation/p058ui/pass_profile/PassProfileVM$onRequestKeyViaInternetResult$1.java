package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import android.util.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.mobileid.Api;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "result", "Lorg/mobileid/Api$RequestKeyResult;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$onRequestKeyViaInternetResult$1 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$onRequestKeyViaInternetResult$1 extends Lambda implements Function1<Api.RequestKeyResult, Unit> {
    final /* synthetic */ PassProfileVM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassProfileVM$onRequestKeyViaInternetResult$1(PassProfileVM passProfileVM) {
        super(1);
        this.this$0 = passProfileVM;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Api.RequestKeyResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Api.RequestKeyResult requestKeyResult) {
        Intrinsics.checkNotNullParameter(requestKeyResult, "result");
        int i = PassProfileVM.WhenMappings.$EnumSwitchMapping$1[requestKeyResult.ordinal()];
        if (i == 1) {
            this.this$0.getSaveBleGateResult().setValue(GateStatus.START_MIGRATION);
            Log.d("TAG", "XXX onRequestKeyViaInternetResult SUCCESS");
        } else if (i == 2) {
            this.this$0.getSaveBleGateResult().setValue(GateStatus.ERROR);
            Log.d("TAG", "XXX onRequestKeyViaInternetResult REJECTED");
        } else if (i != 3) {
            this.this$0.getSaveBleGateResult().setValue(GateStatus.ERROR);
            Log.d("TAG", "XXX onRequestKeyViaInternetResult else");
            this.this$0.getSaveBleGateResult().setValue(GateStatus.ERROR);
        } else {
            this.this$0.getSaveBleGateResult().setValue(GateStatus.ERROR);
            Log.d("TAG", "XXX onRequestKeyViaInternetResult UNKNOWN");
            this.this$0.getSaveBleGateResult().setValue(GateStatus.ERROR);
        }
    }
}
