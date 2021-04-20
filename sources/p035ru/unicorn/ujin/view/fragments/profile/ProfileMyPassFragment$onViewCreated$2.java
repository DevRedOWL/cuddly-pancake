package p035ru.unicorn.ujin.view.fragments.profile;

import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo51343d2 = {"<anonymous>", "", "show", "", "invoke", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileMyPassFragment$onViewCreated$2 */
/* compiled from: ProfileMyPassFragment.kt */
final class ProfileMyPassFragment$onViewCreated$2 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ ProfileMyPassFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProfileMyPassFragment$onViewCreated$2(ProfileMyPassFragment profileMyPassFragment) {
        super(1);
        this.this$0 = profileMyPassFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Boolean bool) {
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            ProgressBar progressBar = this.this$0.f6913pb;
            Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
            ExtensionKt.setVisible(progressBar, booleanValue);
        }
    }
}
