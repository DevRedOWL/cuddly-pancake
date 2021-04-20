package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactDataList;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n¢\u0006\u0002\b\b"}, mo51343d2 = {"<anonymous>", "", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "kotlin.jvm.PlatformType", "", "it", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/ContactDataList;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.MyProfileViewModel$loadContactList$5 */
/* compiled from: MyProfileViewModel.kt */
final class MyProfileViewModel$loadContactList$5<T, R> implements Function<Resource<ContactDataList>, Iterable<? extends UserProfile>> {
    public static final MyProfileViewModel$loadContactList$5 INSTANCE = new MyProfileViewModel$loadContactList$5();

    MyProfileViewModel$loadContactList$5() {
    }

    public final Iterable<UserProfile> apply(Resource<ContactDataList> resource) {
        Intrinsics.checkNotNullParameter(resource, "it");
        return resource.getData().getItems();
    }
}
