package p035ru.unicorn.ujin.data.profile.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.SplashscreenResponse;
import p035ru.unicorn.ujin.data.realm.ErrorData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.ServiceData;
import p035ru.unicorn.ujin.data.realm.Splashscreen;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SplashscreenResponse;", "kotlin.jvm.PlatformType", "resource", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$getSplashscreen$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$getSplashscreen$1<T, R> implements Function<Resource<SplashscreenResponse>, Resource<SplashscreenResponse>> {
    final /* synthetic */ ProfileRemoteRepository this$0;

    ProfileRemoteRepository$getSplashscreen$1(ProfileRemoteRepository profileRemoteRepository) {
        this.this$0 = profileRemoteRepository;
    }

    public final Resource<SplashscreenResponse> apply(Resource<SplashscreenResponse> resource) {
        String str;
        ErrorData error;
        Integer error2;
        ArrayList<Splashscreen> splashscreenList;
        Intrinsics.checkNotNullParameter(resource, "resource");
        SplashscreenResponse data = resource.getData();
        ErrorData errorData = null;
        Collection splashscreenList2 = data != null ? data.getSplashscreenList() : null;
        int i = 0;
        if (splashscreenList2 == null || splashscreenList2.isEmpty()) {
            LocalRepository.getInstance().removeData(Splashscreen.class);
        }
        SplashscreenResponse data2 = resource.getData();
        if (!(data2 == null || (splashscreenList = data2.getSplashscreenList()) == null || !(!splashscreenList.isEmpty()))) {
            ArrayList arrayList = new ArrayList();
            Iterator<Splashscreen> it = splashscreenList.iterator();
            while (it.hasNext()) {
                Splashscreen next = it.next();
                next.setToken(this.this$0.getToken());
                Intrinsics.checkNotNullExpressionValue(next, "item.apply {\n           …                        }");
                arrayList.add(next);
            }
            LocalRepository.getInstance().saveDataAsList(arrayList, Splashscreen.class, true);
        }
        ServiceData service = resource.getService();
        if (service != null) {
            errorData = service.getError();
        }
        if (errorData != null && ((error2 = resource.getError()) == null || error2.intValue() != 0)) {
            i = 1;
        }
        Integer valueOf = Integer.valueOf(i);
        ServiceData service2 = resource.getService();
        if (service2 == null || (error = service2.getError()) == null || (str = error.getMessage()) == null) {
            str = resource.getMessage();
        }
        if (str == null) {
            str = "";
        }
        return Resource.success(valueOf, str, resource.getData());
    }
}
