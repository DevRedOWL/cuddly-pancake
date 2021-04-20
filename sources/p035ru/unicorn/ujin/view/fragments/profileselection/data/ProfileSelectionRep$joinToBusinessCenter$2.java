package p035ru.unicorn.ujin.view.fragments.profileselection.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.TokenData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "tokenData", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/TokenData;", "kotlin.jvm.PlatformType", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.data.ProfileSelectionRep$joinToBusinessCenter$2 */
/* compiled from: ProfileSelectionRep.kt */
final class ProfileSelectionRep$joinToBusinessCenter$2<T> implements Predicate<Resource<TokenData>> {
    public static final ProfileSelectionRep$joinToBusinessCenter$2 INSTANCE = new ProfileSelectionRep$joinToBusinessCenter$2();

    ProfileSelectionRep$joinToBusinessCenter$2() {
    }

    public final boolean test(Resource<TokenData> resource) {
        Intrinsics.checkNotNullParameter(resource, "tokenData");
        return resource.getData() != null;
    }
}
