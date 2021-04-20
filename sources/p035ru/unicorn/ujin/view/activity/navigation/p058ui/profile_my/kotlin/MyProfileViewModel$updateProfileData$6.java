package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.FullProfileMapper;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/ProfileData;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.MyProfileViewModel$updateProfileData$6 */
/* compiled from: MyProfileViewModel.kt */
final class MyProfileViewModel$updateProfileData$6<T> implements Consumer<Resource<ProfileData>> {
    final /* synthetic */ MyProfileViewModel this$0;

    MyProfileViewModel$updateProfileData$6(MyProfileViewModel myProfileViewModel) {
        this.this$0 = myProfileViewModel;
    }

    public final void accept(Resource<ProfileData> resource) {
        SingleLiveEvent<Resource<List<FullProfileMapper>>> updateProfileLiveData = this.this$0.getUpdateProfileLiveData();
        Intrinsics.checkNotNullExpressionValue(resource, "data");
        updateProfileLiveData.setValue(Resource.success(0, "", FullProfileMapper.mapTo(resource.getData().getProfile(), false)));
    }
}
