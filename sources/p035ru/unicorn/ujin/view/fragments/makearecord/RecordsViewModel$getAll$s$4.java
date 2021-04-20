package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "data", "Lkotlin/Pair;", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel$getAll$s$4 */
/* compiled from: RecordsViewModel.kt */
final class RecordsViewModel$getAll$s$4<T> implements Consumer<Pair<? extends List<Appointment>, ? extends List<Appointment>>> {
    final /* synthetic */ RecordsViewModel this$0;

    RecordsViewModel$getAll$s$4(RecordsViewModel recordsViewModel) {
        this.this$0 = recordsViewModel;
    }

    public final void accept(Pair<? extends List<Appointment>, ? extends List<Appointment>> pair) {
        this.this$0.getActiveRecordLiveData().setValue(pair.getFirst());
        this.this$0.getArchiveRecordLiveData().setValue(pair.getSecond());
    }
}
