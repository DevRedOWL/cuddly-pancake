package p035ru.unicorn.ujin.view.fragments.chats;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "loaderVisibility", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$onViewCreated$2 */
/* compiled from: ChatFragment.kt */
final class ChatFragment$onViewCreated$2<T> implements Observer<Boolean> {
    final /* synthetic */ ChatFragment this$0;

    ChatFragment$onViewCreated$2(ChatFragment chatFragment) {
        this.this$0 = chatFragment;
    }

    public final void onChanged(Boolean bool) {
        ChatFragment chatFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(bool, "loaderVisibility");
        chatFragment.toggleProgressVisibility(bool.booleanValue());
    }
}
