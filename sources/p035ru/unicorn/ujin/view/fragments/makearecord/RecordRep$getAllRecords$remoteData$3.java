package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordRep$getAllRecords$remoteData$3 */
/* compiled from: RecordRep.kt */
final class RecordRep$getAllRecords$remoteData$3<T> implements Consumer<List<? extends Appointment>> {
    final /* synthetic */ RecordRep this$0;

    RecordRep$getAllRecords$remoteData$3(RecordRep recordRep) {
        this.this$0 = recordRep;
    }

    public final void accept(List<? extends Appointment> list) {
        this.this$0.getLocalRep().saveListOrUpdate(list, Appointment.class);
    }
}
