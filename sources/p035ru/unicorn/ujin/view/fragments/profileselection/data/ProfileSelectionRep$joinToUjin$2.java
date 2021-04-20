package p035ru.unicorn.ujin.view.fragments.profileselection.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.registration.CreateApartmentData;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/registration/CreateApartmentData;", "kotlin.jvm.PlatformType", "t", "", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.data.ProfileSelectionRep$joinToUjin$2 */
/* compiled from: ProfileSelectionRep.kt */
final class ProfileSelectionRep$joinToUjin$2<T, R> implements Function<Throwable, Resource<CreateApartmentData>> {
    public static final ProfileSelectionRep$joinToUjin$2 INSTANCE = new ProfileSelectionRep$joinToUjin$2();

    ProfileSelectionRep$joinToUjin$2() {
    }

    public final Resource<CreateApartmentData> apply(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "t");
        return Resource.error(th.getMessage());
    }
}
