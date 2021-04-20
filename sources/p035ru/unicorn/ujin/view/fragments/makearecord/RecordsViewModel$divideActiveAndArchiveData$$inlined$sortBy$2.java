package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel$divideActiveAndArchiveData$$inlined$sortBy$2 */
/* compiled from: Comparisons.kt */
public final class RecordsViewModel$divideActiveAndArchiveData$$inlined$sortBy$2<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        return ComparisonsKt.compareValues(((Appointment) t).getId(), ((Appointment) t2).getId());
    }
}
