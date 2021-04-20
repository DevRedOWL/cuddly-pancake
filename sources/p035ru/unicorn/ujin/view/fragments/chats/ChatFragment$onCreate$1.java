package p035ru.unicorn.ujin.view.fragments.chats;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.InstanceIdResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/iid/InstanceIdResult;", "kotlin.jvm.PlatformType", "onComplete"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$onCreate$1 */
/* compiled from: ChatFragment.kt */
final class ChatFragment$onCreate$1<TResult> implements OnCompleteListener<InstanceIdResult> {
    final /* synthetic */ ChatFragment this$0;

    ChatFragment$onCreate$1(ChatFragment chatFragment) {
        this.this$0 = chatFragment;
    }

    public final void onComplete(Task<InstanceIdResult> task) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        ChatFragment chatFragment = this.this$0;
        InstanceIdResult result = task.getResult();
        if (result == null || (str = result.getToken()) == null) {
            str = "";
        }
        chatFragment.setFcmToken(str);
    }
}
