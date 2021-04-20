package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentPassFingerSecondBinding;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragmentKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/FingerIterationAnswer;", "kotlin.jvm.PlatformType", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.PassCreateFingerSecondFragment$onViewCreated$2 */
/* compiled from: PassCreateFingerSecondFragment.kt */
final class PassCreateFingerSecondFragment$onViewCreated$2 extends Lambda implements Function1<FingerIterationAnswer, Unit> {
    final /* synthetic */ PassCreateFingerSecondFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassCreateFingerSecondFragment$onViewCreated$2(PassCreateFingerSecondFragment passCreateFingerSecondFragment) {
        super(1);
        this.this$0 = passCreateFingerSecondFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FingerIterationAnswer) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(final FingerIterationAnswer fingerIterationAnswer) {
        if (fingerIterationAnswer.getAssign() != 1) {
            TextView textView = ((FragmentPassFingerSecondBinding) this.this$0.getViewDataBinding()).choose1.subtitle;
            Intrinsics.checkNotNullExpressionValue(textView, "viewDataBinding.choose1.subtitle");
            textView.setText(this.this$0.getString(R.string.label_finger_success));
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                TextView textView2 = ((FragmentPassFingerSecondBinding) this.this$0.getViewDataBinding()).choose1.subtitle;
                Intrinsics.checkNotNullExpressionValue(textView2, "viewDataBinding.choose1.subtitle");
                textView2.setGravity(17);
                ((FragmentPassFingerSecondBinding) this.this$0.getViewDataBinding()).choose1.subtitle.setTextColor(ContextCompat.getColor(activity, R.color.brandMain));
            }
            ProgressBar progressBar = ((FragmentPassFingerSecondBinding) this.this$0.getViewDataBinding()).f6584pb;
            Intrinsics.checkNotNullExpressionValue(progressBar, "viewDataBinding.pb");
            progressBar.setVisibility(4);
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.fingerRepeat);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "fingerRepeat");
            AnotherPassDetailFragmentKt.setVisibleOrGone(dynamicBackgroundButton, true);
            ((DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.fingerRepeat)).setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ PassCreateFingerSecondFragment$onViewCreated$2 this$0;

                {
                    this.this$0 = r1;
                }

                public final void onClick(View view) {
                    this.this$0.this$0.nextFragment(PassCreateFingerSecondFragment.Companion.start(fingerIterationAnswer.getNextIterationCount(), this.this$0.this$0.getSn(), fingerIterationAnswer.getNextIterationText(), fingerIterationAnswer.getNextIterationParam()), false);
                }
            });
            return;
        }
        ProgressBar progressBar2 = ((FragmentPassFingerSecondBinding) this.this$0.getViewDataBinding()).f6584pb;
        Intrinsics.checkNotNullExpressionValue(progressBar2, "viewDataBinding.pb");
        progressBar2.setVisibility(4);
        PassCreateFingerSecondFragment passCreateFingerSecondFragment = this.this$0;
        String string = passCreateFingerSecondFragment.getString(R.string.text_finger_success);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.text_finger_success)");
        passCreateFingerSecondFragment.showDialogMessage(string);
    }
}
