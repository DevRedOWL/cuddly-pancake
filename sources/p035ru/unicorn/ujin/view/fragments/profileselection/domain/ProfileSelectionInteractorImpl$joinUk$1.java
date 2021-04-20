package p035ru.unicorn.ujin.view.fragments.profileselection.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.data.UkAttachApartment;
import p035ru.unicorn.ujin.data.UkAttachData;
import p035ru.unicorn.ujin.data.UkAttachRequest;
import p035ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "Lorg/reactivestreams/Publisher;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/profile/User;", "kotlin.jvm.PlatformType", "ukAttachData", "Lru/unicorn/ujin/data/UkAttachData;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractorImpl$joinUk$1 */
/* compiled from: ProfileSelectionInteractorImpl.kt */
final class ProfileSelectionInteractorImpl$joinUk$1<T, R> implements Function<Resource<UkAttachData>, Publisher<? extends Resource<User>>> {
    final /* synthetic */ ProfileSelectionInteractorImpl this$0;

    ProfileSelectionInteractorImpl$joinUk$1(ProfileSelectionInteractorImpl profileSelectionInteractorImpl) {
        this.this$0 = profileSelectionInteractorImpl;
    }

    public final Publisher<? extends Resource<User>> apply(Resource<UkAttachData> resource) {
        String str;
        UkAttachRequest request;
        UkAttachApartment apartment;
        Intrinsics.checkNotNullParameter(resource, "ukAttachData");
        this.this$0.ukAttachData = resource;
        ProfileRemoteRepository access$getProfileRepository$p = this.this$0.profileRepository;
        UkAttachData data = resource.getData();
        if (data == null || (request = data.getRequest()) == null || (apartment = request.getApartment()) == null || (str = apartment.getToken()) == null) {
            str = "";
        }
        return access$getProfileRepository$p.getUserFlowable(str);
    }
}
