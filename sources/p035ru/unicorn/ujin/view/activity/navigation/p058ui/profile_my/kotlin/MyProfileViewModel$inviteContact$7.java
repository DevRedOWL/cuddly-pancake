package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.TeamMapper;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/TeamMapper;", "kotlin.jvm.PlatformType", "it", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.MyProfileViewModel$inviteContact$7 */
/* compiled from: MyProfileViewModel.kt */
final class MyProfileViewModel$inviteContact$7<T, R> implements Function<UserProfile, TeamMapper> {
    public static final MyProfileViewModel$inviteContact$7 INSTANCE = new MyProfileViewModel$inviteContact$7();

    MyProfileViewModel$inviteContact$7() {
    }

    public final TeamMapper apply(UserProfile userProfile) {
        Intrinsics.checkNotNullParameter(userProfile, "it");
        return TeamMapper.mapTo(userProfile);
    }
}
