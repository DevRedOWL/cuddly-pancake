package p035ru.unicorn.ujin.view.fragments.profileselection.domain;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.functions.Consumer;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/profile/User;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractorImpl$joinToUjin$2 */
/* compiled from: ProfileSelectionInteractorImpl.kt */
final class ProfileSelectionInteractorImpl$joinToUjin$2<T> implements Consumer<Resource<User>> {
    public static final ProfileSelectionInteractorImpl$joinToUjin$2 INSTANCE = new ProfileSelectionInteractorImpl$joinToUjin$2();

    ProfileSelectionInteractorImpl$joinToUjin$2() {
    }

    public final void accept(Resource<User> resource) {
        User data;
        if (resource != null && (data = resource.getData()) != null) {
            LocalRepository.getInstance().delete(User.class);
            ProfileLocalRepository instance = ProfileLocalRepository.Companion.getInstance();
            RealmList<Apartment> apartmentList = data.getApartmentList();
            if (apartmentList != null) {
                Iterator<Apartment> it = apartmentList.iterator();
                while (it.hasNext()) {
                    Apartment next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "apartment");
                    ApartmentRequest apartmentRequest = next.getApartmentRequest();
                    if (apartmentRequest != null && (Intrinsics.areEqual((Object) apartmentRequest.getStatus(), (Object) ApartmentRequest.Consts.INSTANCE.getREJECTED()) || Intrinsics.areEqual((Object) apartmentRequest.getStatus(), (Object) ApartmentRequest.Consts.INSTANCE.getON_UK()))) {
                        next.setShowBottomNavigation(false);
                    }
                }
            }
            data.setUserLoggenIn(true);
            Unit unit = Unit.INSTANCE;
            instance.saveUserProfile(data);
            LocalRepository.getInstance().delete(Schema.class);
            ViewmodelFactorys.getInstance().clear(SimpleViewModel.class);
        }
    }
}
