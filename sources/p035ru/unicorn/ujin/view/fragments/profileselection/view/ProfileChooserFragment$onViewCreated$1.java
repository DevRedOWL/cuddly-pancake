package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "position", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$onViewCreated$1 */
/* compiled from: ProfileChooserFragment.kt */
final class ProfileChooserFragment$onViewCreated$1<T> implements Observer<Integer> {
    final /* synthetic */ ProfileChooserFragment this$0;

    ProfileChooserFragment$onViewCreated$1(ProfileChooserFragment profileChooserFragment) {
        this.this$0 = profileChooserFragment;
    }

    public final void onChanged(Integer num) {
        ProfileChooserFragment profileChooserFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(num, "position");
        profileChooserFragment.onItemClick(num.intValue());
    }
}
