package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "onClick", "ru/unicorn/ujin/view/fragments/anotherPass/fragments/new_iteration/AnotherPassNewFragment$handleContactEvent$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$handleContactEvent$$inlined$let$lambda$1 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$handleContactEvent$$inlined$let$lambda$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ Contact $contact$inlined;
    final /* synthetic */ AnotherPassNewFragment this$0;

    AnotherPassNewFragment$handleContactEvent$$inlined$let$lambda$1(AnotherPassNewFragment anotherPassNewFragment, Contact contact) {
        this.this$0 = anotherPassNewFragment;
        this.$contact$inlined = contact;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        ((AnotherPassViewModel) this.this$0.getViewModell()).changeUserData(this.$contact$inlined);
        dialogInterface.cancel();
    }
}
