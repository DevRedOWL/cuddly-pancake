package p035ru.unicorn.ujin.view.fragments.profileselection.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.data.registration.CreateApartmentData;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "Lorg/reactivestreams/Publisher;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/profile/User;", "kotlin.jvm.PlatformType", "createApartmentData", "Lru/unicorn/ujin/data/registration/CreateApartmentData;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractorImpl$joinToUjin$1 */
/* compiled from: ProfileSelectionInteractorImpl.kt */
final class ProfileSelectionInteractorImpl$joinToUjin$1<T, R> implements Function<Resource<CreateApartmentData>, Publisher<? extends Resource<User>>> {
    final /* synthetic */ ProfileSelectionInteractorImpl this$0;

    ProfileSelectionInteractorImpl$joinToUjin$1(ProfileSelectionInteractorImpl profileSelectionInteractorImpl) {
        this.this$0 = profileSelectionInteractorImpl;
    }

    public final Publisher<? extends Resource<User>> apply(Resource<CreateApartmentData> resource) {
        String str;
        Intrinsics.checkNotNullParameter(resource, "createApartmentData");
        this.this$0.createApartmentData = resource;
        ProfileRemoteRepository access$getProfileRepository$p = this.this$0.profileRepository;
        CreateApartmentData data = resource.getData();
        if (data == null || (str = data.getToken()) == null) {
            str = "";
        }
        return access$getProfileRepository$p.getUserFlowable(str);
    }
}
