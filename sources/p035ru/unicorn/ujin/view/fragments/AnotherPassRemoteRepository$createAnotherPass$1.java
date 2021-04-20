package p035ru.unicorn.ujin.view.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.AnotherPassResponse;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/anotherPass/response/AnotherPassResponse;", "kotlin.jvm.PlatformType", "resource", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.AnotherPassRemoteRepository$createAnotherPass$1 */
/* compiled from: AnotherPassRemoteRepository.kt */
final class AnotherPassRemoteRepository$createAnotherPass$1<T, R> implements Function<Resource<AnotherPassResponse>, Resource<AnotherPassResponse>> {
    public static final AnotherPassRemoteRepository$createAnotherPass$1 INSTANCE = new AnotherPassRemoteRepository$createAnotherPass$1();

    AnotherPassRemoteRepository$createAnotherPass$1() {
    }

    public final Resource<AnotherPassResponse> apply(Resource<AnotherPassResponse> resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Integer error = resource.getError();
        int i = 1;
        if (error == null || error.intValue() != 1) {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        String message = resource.getMessage();
        if (message == null) {
            message = "";
        }
        return Resource.success(valueOf, message, resource.getData());
    }
}
