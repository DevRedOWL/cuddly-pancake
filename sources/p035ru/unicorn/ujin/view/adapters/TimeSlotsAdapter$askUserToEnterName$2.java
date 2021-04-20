package p035ru.unicorn.ujin.view.adapters;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryDialog;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.TimeSlotsAdapter$askUserToEnterName$2 */
/* compiled from: TimeSlotsAdapter.kt */
final class TimeSlotsAdapter$askUserToEnterName$2 extends Lambda implements Function1<Long, Unit> {
    final /* synthetic */ DataEntryDialog $dialog;
    final /* synthetic */ TimeSlotsAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TimeSlotsAdapter$askUserToEnterName$2(TimeSlotsAdapter timeSlotsAdapter, DataEntryDialog dataEntryDialog) {
        super(1);
        this.this$0 = timeSlotsAdapter;
        this.$dialog = dataEntryDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j) {
        this.this$0.handleSave(this.$dialog);
    }
}
