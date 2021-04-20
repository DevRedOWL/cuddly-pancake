package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.OpenDatesIn;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/OpenDatesIn;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel$loadAvailableDates$subscribe$1 */
/* compiled from: RecordsViewModel.kt */
final class RecordsViewModel$loadAvailableDates$subscribe$1<T> implements Consumer<Resource<List<? extends OpenDatesIn>>> {
    final /* synthetic */ RecordsViewModel this$0;

    RecordsViewModel$loadAvailableDates$subscribe$1(RecordsViewModel recordsViewModel) {
        this.this$0 = recordsViewModel;
    }

    public final void accept(Resource<List<OpenDatesIn>> resource) {
        this.this$0.getOpenDates().setValue(resource);
    }
}
