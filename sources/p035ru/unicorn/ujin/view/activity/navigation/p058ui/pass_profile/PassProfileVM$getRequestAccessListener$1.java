package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.Api;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM$getRequestAccessListener$1", "Lorg/mobileid/Api$RequestAccessListener;", "result", "", "Lorg/mobileid/Api$RequestAccessResult;", "started", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$getRequestAccessListener$1 */
/* compiled from: PassProfileVM.kt */
public final class PassProfileVM$getRequestAccessListener$1 implements Api.RequestAccessListener {
    final /* synthetic */ PassProfileVM this$0;

    PassProfileVM$getRequestAccessListener$1(PassProfileVM passProfileVM) {
        this.this$0 = passProfileVM;
    }

    public void started() {
        this.this$0.onRequestAccessStarted();
    }

    public void result(Api.RequestAccessResult requestAccessResult) {
        Intrinsics.checkNotNullParameter(requestAccessResult, "result");
        this.this$0.onRequestAccessResult(requestAccessResult);
    }
}
