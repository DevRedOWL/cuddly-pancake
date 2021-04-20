package p035ru.unicorn.ujin.view.fragments.chats;

import android.os.CountDownTimer;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/chats/ChatFragment$initChat$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "l", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$initChat$1 */
/* compiled from: ChatFragment.kt */
public final class ChatFragment$initChat$1 extends CountDownTimer {
    final /* synthetic */ ChatFragment this$0;

    public void onTick(long j) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatFragment$initChat$1(ChatFragment chatFragment, long j, long j2) {
        super(j, j2);
        this.this$0 = chatFragment;
    }

    public void onFinish() {
        CountDownTimer countDownTimer = this.this$0.getCountDownTimer();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = this.this$0.getCountDownTimer();
        if (countDownTimer2 != null) {
            countDownTimer2.start();
        }
    }
}
