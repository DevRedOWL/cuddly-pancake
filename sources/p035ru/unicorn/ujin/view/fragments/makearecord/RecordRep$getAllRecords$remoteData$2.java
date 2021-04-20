package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordRep$getAllRecords$remoteData$2 */
/* compiled from: RecordRep.kt */
final class RecordRep$getAllRecords$remoteData$2<T> implements Predicate<List<? extends Appointment>> {
    public static final RecordRep$getAllRecords$remoteData$2 INSTANCE = new RecordRep$getAllRecords$remoteData$2();

    RecordRep$getAllRecords$remoteData$2() {
    }

    public final boolean test(List<? extends Appointment> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        return true;
    }
}
