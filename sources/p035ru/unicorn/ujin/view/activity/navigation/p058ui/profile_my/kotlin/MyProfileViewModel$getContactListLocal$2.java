package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "kotlin.jvm.PlatformType", "", "it", "", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.MyProfileViewModel$getContactListLocal$2 */
/* compiled from: MyProfileViewModel.kt */
final class MyProfileViewModel$getContactListLocal$2<T, R> implements Function<List<? extends UserProfile>, Iterable<? extends UserProfile>> {
    public static final MyProfileViewModel$getContactListLocal$2 INSTANCE = new MyProfileViewModel$getContactListLocal$2();

    MyProfileViewModel$getContactListLocal$2() {
    }

    public final Iterable<UserProfile> apply(List<? extends UserProfile> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return list;
    }
}
