package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryDialog;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo51343d2 = {"<anonymous>", "", "aLong", "", "invoke", "(Ljava/lang/Long;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$showChooseUjinDialog$1 */
/* compiled from: ProfileChooserFragment.kt */
final class ProfileChooserFragment$showChooseUjinDialog$1 extends Lambda implements Function1<Long, Unit> {
    final /* synthetic */ DataEntryDialog $dialog;
    final /* synthetic */ ProfileChooserFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProfileChooserFragment$showChooseUjinDialog$1(ProfileChooserFragment profileChooserFragment, DataEntryDialog dataEntryDialog) {
        super(1);
        this.this$0 = profileChooserFragment;
        this.$dialog = dataEntryDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Long) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Long l) {
        this.this$0.handleSave(this.$dialog);
    }
}
