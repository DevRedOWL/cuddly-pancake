package p035ru.unicorn.ujin.view.fragments.profileselection.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.TokenData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/TokenData;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.data.ProfileSelectionRep$joinToBusinessCenter$3 */
/* compiled from: ProfileSelectionRep.kt */
final class ProfileSelectionRep$joinToBusinessCenter$3<T> implements Consumer<Resource<TokenData>> {
    final /* synthetic */ ProfileSelectionRep this$0;

    ProfileSelectionRep$joinToBusinessCenter$3(ProfileSelectionRep profileSelectionRep) {
        this.this$0 = profileSelectionRep;
    }

    public final void accept(Resource<TokenData> resource) {
        LocalRepository localRep = this.this$0.getLocalRep();
        Intrinsics.checkNotNullExpressionValue(resource, "it");
        localRep.saveUserToken(resource.getData());
    }
}
