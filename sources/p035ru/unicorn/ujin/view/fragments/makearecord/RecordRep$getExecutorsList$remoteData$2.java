package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/ExecutorsIn;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordRep$getExecutorsList$remoteData$2 */
/* compiled from: RecordRep.kt */
final class RecordRep$getExecutorsList$remoteData$2<T> implements Consumer<List<? extends ExecutorsIn>> {
    final /* synthetic */ RecordRep this$0;

    RecordRep$getExecutorsList$remoteData$2(RecordRep recordRep) {
        this.this$0 = recordRep;
    }

    public final void accept(List<? extends ExecutorsIn> list) {
        RecordRep recordRep = this.this$0;
        Collection collection = list;
        if (!(collection == null || collection.isEmpty())) {
            recordRep.getLocalRep().saveDataAsList(list, ExecutorsIn.class, true);
        }
    }
}
