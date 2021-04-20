package p035ru.unicorn.ujin.view.fragments.profileselection.domain;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.data.registration.CreateApartment;
import p035ru.unicorn.ujin.data.registration.CreateApartmentData;
import p035ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractor;
import p046io.reactivex.functions.Consumer;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/profile/User;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractorImpl$joinToUjin$3 */
/* compiled from: ProfileSelectionInteractorImpl.kt */
final class ProfileSelectionInteractorImpl$joinToUjin$3<T> implements Consumer<Resource<User>> {
    final /* synthetic */ ProfileSelectionInteractorImpl this$0;

    ProfileSelectionInteractorImpl$joinToUjin$3(ProfileSelectionInteractorImpl profileSelectionInteractorImpl) {
        this.this$0 = profileSelectionInteractorImpl;
    }

    public final void accept(Resource<User> resource) {
        CreateApartmentData createApartmentData;
        CreateApartment apartment;
        Integer id;
        boolean z;
        String str;
        Resource access$getCreateApartmentData$p = this.this$0.createApartmentData;
        CharSequence message = access$getCreateApartmentData$p != null ? access$getCreateApartmentData$p.getMessage() : null;
        if (!(message == null || message.length() == 0)) {
            ProfileSelectionInteractor.Callback callback = this.this$0.getCallback();
            Resource access$getCreateApartmentData$p2 = this.this$0.createApartmentData;
            if (access$getCreateApartmentData$p2 == null || (str = access$getCreateApartmentData$p2.getMessage()) == null) {
                str = "Ошибка.";
            }
            callback.errorMessage(str);
            return;
        }
        Resource access$getCreateApartmentData$p3 = this.this$0.createApartmentData;
        if (access$getCreateApartmentData$p3 == null || (createApartmentData = (CreateApartmentData) access$getCreateApartmentData$p3.getData()) == null || (apartment = createApartmentData.getApartment()) == null || (id = apartment.getId()) == null) {
            this.this$0.getCallback().errorMessage("Ошибка присоединения");
            return;
        }
        int intValue = id.intValue();
        RealmList<Apartment> apartmentList = ProfileLocalRepository.Companion.getInstance().getUser().getApartmentList();
        if (apartmentList != null) {
            for (Apartment apartment2 : apartmentList) {
                Intrinsics.checkNotNullExpressionValue(apartment2, "apartment");
                Integer id2 = apartment2.getId();
                if (id2 != null && id2.intValue() == intValue) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    if (apartment2 != null) {
                        ProfileLocalRepository instance = ProfileLocalRepository.Companion.getInstance();
                        String userToken = apartment2.getUserToken();
                        Intrinsics.checkNotNullExpressionValue(userToken, "it.userToken");
                        instance.applyFlat(userToken, 3);
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        this.this$0.getCallback().onJoinUjin();
    }
}
