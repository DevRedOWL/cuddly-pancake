package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.profile.RentObjectListResponse;
import p035ru.unicorn.ujin.data.realm.ErrorData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.ServiceData;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/profile/RentObjectListResponse;", "kotlin.jvm.PlatformType", "resource", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$getRentObjectList$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$getRentObjectList$1<T, R> implements Function<Resource<RentObjectListResponse>, Resource<RentObjectListResponse>> {
    public static final ProfileRemoteRepository$getRentObjectList$1 INSTANCE = new ProfileRemoteRepository$getRentObjectList$1();

    ProfileRemoteRepository$getRentObjectList$1() {
    }

    public final Resource<RentObjectListResponse> apply(Resource<RentObjectListResponse> resource) {
        String str;
        ErrorData error;
        Intrinsics.checkNotNullParameter(resource, "resource");
        ServiceData service = resource.getService();
        Integer valueOf = Integer.valueOf((service != null ? service.getError() : null) == null ? 0 : 1);
        ServiceData service2 = resource.getService();
        if (service2 == null || (error = service2.getError()) == null || (str = error.getMessage()) == null) {
            str = "";
        }
        return Resource.success(valueOf, str, resource.getData());
    }
}
