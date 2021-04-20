package p035ru.unicorn.ujin.view.fragments.makearecord;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.CreateRecordOut;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo51343d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Lkotlin/Unit;)Lio/reactivex/ObservableSource;"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel$createRecord$7 */
/* compiled from: RecordsViewModel.kt */
final class RecordsViewModel$createRecord$7<T, R> implements Function<Unit, ObservableSource<? extends Resource<Appointment>>> {
    final /* synthetic */ CreateRecordOut $record;
    final /* synthetic */ RecordsViewModel this$0;

    RecordsViewModel$createRecord$7(RecordsViewModel recordsViewModel, CreateRecordOut createRecordOut) {
        this.this$0 = recordsViewModel;
        this.$record = createRecordOut;
    }

    public final ObservableSource<? extends Resource<Appointment>> apply(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "it");
        return this.this$0.recordRep.createRecord(this.$record);
    }
}
