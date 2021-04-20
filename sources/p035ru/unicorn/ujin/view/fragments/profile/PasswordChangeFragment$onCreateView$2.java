package p035ru.unicorn.ujin.view.fragments.profile;

import androidx.lifecycle.Observer;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo51343d2 = {"<anonymous>", "", "loading", "", "onChanged", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.PasswordChangeFragment$onCreateView$2 */
/* compiled from: PasswordChangeFragment.kt */
final class PasswordChangeFragment$onCreateView$2<T> implements Observer<Boolean> {
    final /* synthetic */ PasswordChangeFragment this$0;

    PasswordChangeFragment$onCreateView$2(PasswordChangeFragment passwordChangeFragment) {
        this.this$0 = passwordChangeFragment;
    }

    public final void onChanged(Boolean bool) {
        this.this$0.handleLoading(bool);
    }
}
