package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$requestDeleteSubAccount$3 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$requestDeleteSubAccount$3<T> implements Consumer<Throwable> {
    final /* synthetic */ ProfileViewModel this$0;

    ProfileViewModel$requestDeleteSubAccount$3(ProfileViewModel profileViewModel) {
        this.this$0 = profileViewModel;
    }

    public final void accept(Throwable th) {
        this.this$0.getShowProgressLiveData().postValue(false);
        this.this$0.getDeleteSubAccountListLiveData().postValue(null);
        this.this$0.requestSubAccountList();
    }
}