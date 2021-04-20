package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Points;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "t", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/Points;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$getUpdatePoints$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$getUpdatePoints$1<T> implements Predicate<Resource<Points>> {
    public static final ProfileRemoteRepository$getUpdatePoints$1 INSTANCE = new ProfileRemoteRepository$getUpdatePoints$1();

    ProfileRemoteRepository$getUpdatePoints$1() {
    }

    public final boolean test(Resource<Points> resource) {
        Intrinsics.checkNotNullParameter(resource, "t");
        return resource.getData() != null;
    }
}
