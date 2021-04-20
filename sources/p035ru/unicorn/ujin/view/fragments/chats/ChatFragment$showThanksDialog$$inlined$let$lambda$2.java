package p035ru.unicorn.ujin.view.fragments.chats;

import android.content.DialogInterface;
import android.widget.RatingBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.refactor_1.AppViewPagerFragment;
import p035ru.unicorn.ujin.view.fragments.FR_TAGS;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "i", "", "onClick", "ru/unicorn/ujin/view/fragments/chats/ChatFragment$showThanksDialog$1$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.ChatFragment$showThanksDialog$$inlined$let$lambda$2 */
/* compiled from: ChatFragment.kt */
final class ChatFragment$showThanksDialog$$inlined$let$lambda$2 implements DialogInterface.OnClickListener {
    final /* synthetic */ Ref.ObjectRef $message$inlined;
    final /* synthetic */ Ref.ObjectRef $negativeButton$inlined;
    final /* synthetic */ Ref.ObjectRef $positiveButton$inlined;
    final /* synthetic */ RatingBar $ratingBar$inlined;
    final /* synthetic */ ChatFragment this$0;

    ChatFragment$showThanksDialog$$inlined$let$lambda$2(ChatFragment chatFragment, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, RatingBar ratingBar, Ref.ObjectRef objectRef3) {
        this.this$0 = chatFragment;
        this.$message$inlined = objectRef;
        this.$positiveButton$inlined = objectRef2;
        this.$ratingBar$inlined = ratingBar;
        this.$negativeButton$inlined = objectRef3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.this$0.nextFragment(new AppViewPagerFragment(), false, FR_TAGS.TAG_TICKETS);
    }
}
