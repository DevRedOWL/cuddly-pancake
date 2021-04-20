package p035ru.unicorn.ujin.viewModel;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.RealmViewModel$applyForMortgage$1 */
/* compiled from: RealmViewModel.kt */
final class RealmViewModel$applyForMortgage$1<T> implements Consumer<Resource<SimpleResponse>> {
    final /* synthetic */ RealmViewModel this$0;

    RealmViewModel$applyForMortgage$1(RealmViewModel realmViewModel) {
        this.this$0 = realmViewModel;
    }

    public final void accept(Resource<SimpleResponse> resource) {
        this.this$0.getApplyMortgageLiveData().setValue(resource);
    }
}
