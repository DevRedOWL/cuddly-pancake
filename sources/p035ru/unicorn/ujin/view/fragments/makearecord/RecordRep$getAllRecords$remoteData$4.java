package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "t", "", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordRep$getAllRecords$remoteData$4 */
/* compiled from: RecordRep.kt */
final class RecordRep$getAllRecords$remoteData$4<T, R> implements Function<Throwable, List<? extends Appointment>> {
    public static final RecordRep$getAllRecords$remoteData$4 INSTANCE = new RecordRep$getAllRecords$remoteData$4();

    RecordRep$getAllRecords$remoteData$4() {
    }

    public final List<Appointment> apply(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "t");
        return CollectionsKt.emptyList();
    }
}
