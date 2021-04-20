package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$removeNotifications$2 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$removeNotifications$2<T> implements Consumer<Resource<String>> {
    final /* synthetic */ ProfileViewModel this$0;

    ProfileViewModel$removeNotifications$2(ProfileViewModel profileViewModel) {
        this.this$0 = profileViewModel;
    }

    public final void accept(Resource<String> resource) {
        this.this$0.getRemoveNotificationsLiveData().setValue(resource);
    }
}
