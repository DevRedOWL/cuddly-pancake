package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger.FingerIterationAnswer;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/FingerIterationAnswer;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$startScanFinger$1 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$startScanFinger$1<T> implements Consumer<Resource<FingerIterationAnswer>> {
    final /* synthetic */ PassProfileVM this$0;

    PassProfileVM$startScanFinger$1(PassProfileVM passProfileVM) {
        this.this$0 = passProfileVM;
    }

    public final void accept(Resource<FingerIterationAnswer> resource) {
        Intrinsics.checkNotNullExpressionValue(resource, "resource");
        Integer error = resource.getError();
        if (error != null && error.intValue() == 0) {
            this.this$0.getIterationResult().setValue(resource.getData());
        } else {
            this.this$0.getIterationError().setValue(resource.getMessage());
        }
    }
}
