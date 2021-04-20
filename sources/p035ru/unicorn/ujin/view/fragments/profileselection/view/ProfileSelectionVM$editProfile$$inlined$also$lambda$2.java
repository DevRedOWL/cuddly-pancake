package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import kotlin.Metadata;
import p046io.reactivex.functions.Action;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo51343d2 = {"<anonymous>", "", "run", "ru/unicorn/ujin/view/fragments/profileselection/view/ProfileSelectionVM$editProfile$1$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM$editProfile$$inlined$also$lambda$2 */
/* compiled from: ProfileSelectionVM.kt */
final class ProfileSelectionVM$editProfile$$inlined$also$lambda$2 implements Action {
    final /* synthetic */ ProfileSelectionVM this$0;

    ProfileSelectionVM$editProfile$$inlined$also$lambda$2(ProfileSelectionVM profileSelectionVM) {
        this.this$0 = profileSelectionVM;
    }

    public final void run() {
        this.this$0.showLoader.postValue(false);
    }
}
