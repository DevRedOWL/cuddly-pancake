package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "kotlin.jvm.PlatformType", "data", "", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel$getAll$s$1 */
/* compiled from: RecordsViewModel.kt */
final class RecordsViewModel$getAll$s$1<T, R> implements Function<List<? extends Appointment>, Pair<? extends List<Appointment>, ? extends List<Appointment>>> {
    final /* synthetic */ RecordsViewModel this$0;

    RecordsViewModel$getAll$s$1(RecordsViewModel recordsViewModel) {
        this.this$0 = recordsViewModel;
    }

    public final Pair<List<Appointment>, List<Appointment>> apply(List<? extends Appointment> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        return this.this$0.divideActiveAndArchiveData(list);
    }
}
