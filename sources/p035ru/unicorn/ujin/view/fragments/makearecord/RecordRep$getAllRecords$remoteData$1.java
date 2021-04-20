package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointments;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "result", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointments;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordRep$getAllRecords$remoteData$1 */
/* compiled from: RecordRep.kt */
final class RecordRep$getAllRecords$remoteData$1<T, R> implements Function<Resource<Appointments>, List<? extends Appointment>> {
    public static final RecordRep$getAllRecords$remoteData$1 INSTANCE = new RecordRep$getAllRecords$remoteData$1();

    RecordRep$getAllRecords$remoteData$1() {
    }

    public final List<Appointment> apply(Resource<Appointments> resource) {
        Intrinsics.checkNotNullParameter(resource, "result");
        return resource.getData().getAppointments();
    }
}
