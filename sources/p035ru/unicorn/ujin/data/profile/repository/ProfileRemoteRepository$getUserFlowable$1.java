package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.activity.navigation.repository.base.UserResponse;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/profile/User;", "kotlin.jvm.PlatformType", "resource", "Lru/unicorn/ujin/view/activity/navigation/repository/base/UserResponse;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$getUserFlowable$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$getUserFlowable$1<T, R> implements Function<Resource<UserResponse>, Resource<User>> {
    public static final ProfileRemoteRepository$getUserFlowable$1 INSTANCE = new ProfileRemoteRepository$getUserFlowable$1();

    ProfileRemoteRepository$getUserFlowable$1() {
    }

    public final Resource<User> apply(Resource<UserResponse> resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Integer error = resource.getError();
        String message = resource.getMessage();
        UserResponse data = resource.getData();
        Intrinsics.checkNotNullExpressionValue(data, "resource.data");
        return Resource.success(error, message, data.getUser());
    }
}
