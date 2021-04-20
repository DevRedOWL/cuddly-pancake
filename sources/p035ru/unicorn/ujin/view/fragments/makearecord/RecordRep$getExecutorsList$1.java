package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn;
import p046io.reactivex.Observable;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/ExecutorsIn;", "kotlin.jvm.PlatformType", "it", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordRep$getExecutorsList$1 */
/* compiled from: RecordRep.kt */
final class RecordRep$getExecutorsList$1<T, R> implements Function<List<? extends ExecutorsIn>, ObservableSource<? extends List<? extends ExecutorsIn>>> {
    final /* synthetic */ Observable $remoteData;

    RecordRep$getExecutorsList$1(Observable observable) {
        this.$remoteData = observable;
    }

    public final ObservableSource<? extends List<ExecutorsIn>> apply(List<? extends ExecutorsIn> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return this.$remoteData;
    }
}
