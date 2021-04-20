package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo51343d2 = {"<anonymous>", "", "run", "ru/unicorn/ujin/view/fragments/anotherPass/fragments/new_iteration/AnotherPassNewFragment$handleContactEvent$1$3"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$handleContactEvent$$inlined$let$lambda$2 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$handleContactEvent$$inlined$let$lambda$2 implements Runnable {
    final /* synthetic */ Contact $contact$inlined;
    final /* synthetic */ AnotherPassNewFragment this$0;

    AnotherPassNewFragment$handleContactEvent$$inlined$let$lambda$2(AnotherPassNewFragment anotherPassNewFragment, Contact contact) {
        this.this$0 = anotherPassNewFragment;
        this.$contact$inlined = contact;
    }

    public final void run() {
        ((AnotherPassViewModel) this.this$0.getViewModell()).changeUserData(this.$contact$inlined);
    }
}
