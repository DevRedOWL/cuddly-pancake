package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.face;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.InitCallback;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/pass_settings/face/PassCreateFaceSecondFragment$findBackCamera$2$1", "Lco/infinum/goldeneye/InitCallback;", "onError", "", "t", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.face.PassCreateFaceSecondFragment$findBackCamera$$inlined$let$lambda$1 */
/* compiled from: PassCreateFaceSecondFragment.kt */
public final class C5916x626c3331 extends InitCallback {
    final /* synthetic */ PassCreateFaceSecondFragment this$0;

    C5916x626c3331(PassCreateFaceSecondFragment passCreateFaceSecondFragment) {
        this.this$0 = passCreateFaceSecondFragment;
    }

    public void onError(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "t");
        PassCreateFaceSecondFragment passCreateFaceSecondFragment = this.this$0;
        passCreateFaceSecondFragment.showErrorMessage(passCreateFaceSecondFragment.getString(R.string.error_on_message));
    }
}
