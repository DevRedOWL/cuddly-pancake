package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.TeamMapper;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "data", "", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/TeamMapper;", "kotlin.jvm.PlatformType", "", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.MyProfileViewModel$destroyContact$8 */
/* compiled from: MyProfileViewModel.kt */
final class MyProfileViewModel$destroyContact$8<T> implements Consumer<List<TeamMapper>> {
    final /* synthetic */ MyProfileViewModel this$0;

    MyProfileViewModel$destroyContact$8(MyProfileViewModel myProfileViewModel) {
        this.this$0 = myProfileViewModel;
    }

    public final void accept(List<TeamMapper> list) {
        this.this$0.getTeamContactListLiveData().setValue(Resource.success(0, "", list));
    }
}
