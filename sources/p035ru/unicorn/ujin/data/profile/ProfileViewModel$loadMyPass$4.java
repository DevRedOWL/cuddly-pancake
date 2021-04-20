package p035ru.unicorn.ujin.data.profile;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.ListMyPassIn;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/ListMyPassIn;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$loadMyPass$4 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$loadMyPass$4<T> implements Consumer<Resource<ListMyPassIn>> {
    final /* synthetic */ ProfileViewModel this$0;

    ProfileViewModel$loadMyPass$4(ProfileViewModel profileViewModel) {
        this.this$0 = profileViewModel;
    }

    public final void accept(Resource<ListMyPassIn> resource) {
        Intrinsics.checkNotNullExpressionValue(resource, "data");
        Integer error = resource.getError();
        if (error != null && error.intValue() == 0) {
            MutableLiveData access$getMyPassListMutable$p = this.this$0.myPassListMutable;
            ListMyPassIn data = resource.getData();
            access$getMyPassListMutable$p.setValue(data != null ? data.getPasses() : null);
            return;
        }
        SingleLiveEvent singleLiveEvent = this.this$0.showError;
        Intrinsics.checkNotNullExpressionValue(singleLiveEvent, "showError");
        singleLiveEvent.setValue(resource.getMessage());
    }
}
