package p035ru.unicorn.ujin.view.fragments.profileselection.domain;

import kotlin.Metadata;
import kotlin.Unit;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/profile/User;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractorImpl$join$4 */
/* compiled from: ProfileSelectionInteractorImpl.kt */
final class ProfileSelectionInteractorImpl$join$4<T> implements Consumer<Resource<User>> {
    public static final ProfileSelectionInteractorImpl$join$4 INSTANCE = new ProfileSelectionInteractorImpl$join$4();

    ProfileSelectionInteractorImpl$join$4() {
    }

    public final void accept(Resource<User> resource) {
        if (resource != null && resource.getData() != null) {
            LocalRepository.getInstance().delete(User.class);
            LocalRepository instance = LocalRepository.getInstance();
            User data = resource.getData();
            data.setUserLoggenIn(true);
            Unit unit = Unit.INSTANCE;
            instance.saveDataOrUpdate(data);
            LocalRepository.getInstance().delete(Schema.class);
            ViewmodelFactorys.getInstance().clear(SimpleViewModel.class);
        }
    }
}
