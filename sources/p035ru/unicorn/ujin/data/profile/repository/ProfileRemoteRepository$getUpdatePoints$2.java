package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Points;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo51343d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "t", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/Points;", "apply", "(Lru/unicorn/ujin/data/realm/Resource;)Ljava/lang/Boolean;"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$getUpdatePoints$2 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$getUpdatePoints$2<T, R> implements Function<Resource<Points>, Boolean> {
    public static final ProfileRemoteRepository$getUpdatePoints$2 INSTANCE = new ProfileRemoteRepository$getUpdatePoints$2();

    ProfileRemoteRepository$getUpdatePoints$2() {
    }

    public final Boolean apply(Resource<Points> resource) {
        boolean z;
        Intrinsics.checkNotNullParameter(resource, "t");
        Points data = resource.getData();
        Intrinsics.checkNotNullExpressionValue(data, "t.data");
        if (data.getPoints() != null) {
            Points data2 = resource.getData();
            Intrinsics.checkNotNullExpressionValue(data2, "t.data");
            if (data2.getPoints().size() > 0) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
