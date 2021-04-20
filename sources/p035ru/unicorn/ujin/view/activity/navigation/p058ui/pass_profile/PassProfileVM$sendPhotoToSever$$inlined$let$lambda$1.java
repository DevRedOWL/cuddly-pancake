package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "kotlin.jvm.PlatformType", "accept", "ru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM$sendPhotoToSever$1$1$1", "ru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM$$special$$inlined$let$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$sendPhotoToSever$$inlined$let$lambda$1 */
/* compiled from: PassProfileVM.kt */
final class PassProfileVM$sendPhotoToSever$$inlined$let$lambda$1<T> implements Consumer<Resource<Unit>> {
    final /* synthetic */ PassProfileVM this$0;

    PassProfileVM$sendPhotoToSever$$inlined$let$lambda$1(PassProfileVM passProfileVM) {
        this.this$0 = passProfileVM;
    }

    public final void accept(Resource<Unit> resource) {
        SingleLiveEvent<Boolean> savePhotoResult = this.this$0.getSavePhotoResult();
        Intrinsics.checkNotNullExpressionValue(resource, "resource");
        Integer error = resource.getError();
        boolean z = true;
        if (error != null && error.intValue() == 1) {
            z = false;
        }
        savePhotoResult.setValue(Boolean.valueOf(z));
    }
}
