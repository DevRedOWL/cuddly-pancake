package p035ru.unicorn.ujin.view.fragments.profileselection.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.TokenData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/TokenData;", "kotlin.jvm.PlatformType", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractorImpl$join$2 */
/* compiled from: ProfileSelectionInteractorImpl.kt */
final class ProfileSelectionInteractorImpl$join$2<T, R> implements Function<Resource<TokenData>, TokenData> {
    public static final ProfileSelectionInteractorImpl$join$2 INSTANCE = new ProfileSelectionInteractorImpl$join$2();

    ProfileSelectionInteractorImpl$join$2() {
    }

    public final TokenData apply(Resource<TokenData> resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        return resource.getData();
    }
}
