package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.TeamMapper;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/TeamMapper;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.MyProfileViewModel$getContactList$1 */
/* compiled from: MyProfileViewModel.kt */
final class MyProfileViewModel$getContactList$1<T> implements Consumer<List<? extends TeamMapper>> {
    final /* synthetic */ MyProfileViewModel this$0;

    MyProfileViewModel$getContactList$1(MyProfileViewModel myProfileViewModel) {
        this.this$0 = myProfileViewModel;
    }

    public final void accept(List<? extends TeamMapper> list) {
        this.this$0.getTeamContactListLiveData().postValue(Resource.success(0, "", list));
    }
}
