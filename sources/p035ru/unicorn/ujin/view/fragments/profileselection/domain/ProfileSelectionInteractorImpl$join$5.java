package p035ru.unicorn.ujin.view.fragments.profileselection.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractor;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/profile/User;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractorImpl$join$5 */
/* compiled from: ProfileSelectionInteractorImpl.kt */
final class ProfileSelectionInteractorImpl$join$5<T> implements Consumer<Resource<User>> {
    final /* synthetic */ ProfileSelectionInteractorImpl this$0;

    ProfileSelectionInteractorImpl$join$5(ProfileSelectionInteractorImpl profileSelectionInteractorImpl) {
        this.this$0 = profileSelectionInteractorImpl;
    }

    public final void accept(Resource<User> resource) {
        Intrinsics.checkNotNullExpressionValue(resource, "it");
        CharSequence message = resource.getMessage();
        if (!(message == null || message.length() == 0)) {
            ProfileSelectionInteractor.Callback callback = this.this$0.getCallback();
            String message2 = resource.getMessage();
            Intrinsics.checkNotNullExpressionValue(message2, "it.message");
            callback.errorMessage(message2);
            return;
        }
        this.this$0.getCallback().onJoin();
    }
}
