package p035ru.unicorn.ujin.view.fragments.domru;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.viewModel.events.profile.ValidateSmsProviderEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/viewModel/events/profile/ValidateSmsProviderEvent;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.domru.CodeRecoverySecondFragment$onViewCreated$3 */
/* compiled from: CodeRecoverySecondFragment.kt */
final class CodeRecoverySecondFragment$onViewCreated$3<T> implements Observer<ValidateSmsProviderEvent> {
    final /* synthetic */ CodeRecoverySecondFragment this$0;

    CodeRecoverySecondFragment$onViewCreated$3(CodeRecoverySecondFragment codeRecoverySecondFragment) {
        this.this$0 = codeRecoverySecondFragment;
    }

    public final void onChanged(ValidateSmsProviderEvent validateSmsProviderEvent) {
        CodeRecoverySecondFragment codeRecoverySecondFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(validateSmsProviderEvent, "event");
        codeRecoverySecondFragment.handleEvent(validateSmsProviderEvent);
    }
}
