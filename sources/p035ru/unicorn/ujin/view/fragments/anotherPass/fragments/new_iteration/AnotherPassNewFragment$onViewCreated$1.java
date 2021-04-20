package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$onViewCreated$1 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$onViewCreated$1 implements Runnable {
    final /* synthetic */ AnotherPassViewModel $viewModell;
    final /* synthetic */ AnotherPassNewFragment this$0;

    AnotherPassNewFragment$onViewCreated$1(AnotherPassNewFragment anotherPassNewFragment, AnotherPassViewModel anotherPassViewModel) {
        this.this$0 = anotherPassNewFragment;
        this.$viewModell = anotherPassViewModel;
    }

    public final void run() {
        SingleLiveEvent<Contact> chooseContactObservable;
        SingleLiveEvent<Contact> chooseContactObservable2;
        AnotherPassViewModel anotherPassViewModel = this.$viewModell;
        if (anotherPassViewModel != null) {
            anotherPassViewModel.updateUserData();
        }
        this.this$0.initDefaultData();
        AnotherPassViewModel anotherPassViewModel2 = this.$viewModell;
        if (!(anotherPassViewModel2 == null || (chooseContactObservable2 = anotherPassViewModel2.getChooseContactObservable()) == null)) {
            chooseContactObservable2.removeObserver(new Observer<Contact>(this) {
                final /* synthetic */ AnotherPassNewFragment$onViewCreated$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void onChanged(Contact contact) {
                    this.this$0.this$0.getViewLifecycleOwner();
                }
            });
        }
        AnotherPassViewModel anotherPassViewModel3 = this.$viewModell;
        if (anotherPassViewModel3 != null && (chooseContactObservable = anotherPassViewModel3.getChooseContactObservable()) != null) {
            chooseContactObservable.observe(this.this$0.getViewLifecycleOwner(), new Observer<Contact>(this) {
                final /* synthetic */ AnotherPassNewFragment$onViewCreated$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void onChanged(Contact contact) {
                    this.this$0.this$0.handleContactEvent(contact);
                }
            });
        }
    }
}
