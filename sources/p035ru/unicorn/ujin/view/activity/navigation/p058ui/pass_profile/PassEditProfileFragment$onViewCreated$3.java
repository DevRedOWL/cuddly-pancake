package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import androidx.lifecycle.Observer;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "text", "", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassEditProfileFragment$onViewCreated$3 */
/* compiled from: PassEditProfileFragment.kt */
final class PassEditProfileFragment$onViewCreated$3<T> implements Observer<String> {
    final /* synthetic */ PassEditProfileFragment this$0;

    PassEditProfileFragment$onViewCreated$3(PassEditProfileFragment passEditProfileFragment) {
        this.this$0 = passEditProfileFragment;
    }

    public final void onChanged(String str) {
        this.this$0.showErrorMessage(str);
    }
}
