package p035ru.unicorn.ujin.view.fragments.chats;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$initChat$9 */
/* compiled from: ChatFragment.kt */
final /* synthetic */ class ChatFragment$initChat$9 extends MutablePropertyReference0Impl {
    ChatFragment$initChat$9(ChatFragment chatFragment) {
        super(chatFragment, ChatFragment.class, "fcmToken", "getFcmToken()Ljava/lang/String;", 0);
    }

    public Object get() {
        return ((ChatFragment) this.receiver).getFcmToken();
    }

    public void set(Object obj) {
        ((ChatFragment) this.receiver).setFcmToken((String) obj);
    }
}
