package p035ru.unicorn.ujin.view.fragments.anotherPass;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel$getEnterpriseList$5 */
/* compiled from: AnotherPassViewModel.kt */
final class AnotherPassViewModel$getEnterpriseList$5<T> implements Consumer<List<RentCompany>> {
    final /* synthetic */ AnotherPassViewModel this$0;

    AnotherPassViewModel$getEnterpriseList$5(AnotherPassViewModel anotherPassViewModel) {
        this.this$0 = anotherPassViewModel;
    }

    public final void accept(List<RentCompany> list) {
        this.this$0.getEnterpriseListMutableLiveData().setValue(list);
    }
}
