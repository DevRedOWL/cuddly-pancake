package p035ru.unicorn.ujin.view.customViews.dynamic.button;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.button.DynamicFormViewModel$sendDynamicRequest$subscribe$2 */
/* compiled from: DynamicFormViewModel.kt */
final class DynamicFormViewModel$sendDynamicRequest$subscribe$2<T> implements Consumer<Resource<Object>> {
    final /* synthetic */ DynamicFormViewModel this$0;

    DynamicFormViewModel$sendDynamicRequest$subscribe$2(DynamicFormViewModel dynamicFormViewModel) {
        this.this$0 = dynamicFormViewModel;
    }

    public final void accept(Resource<Object> resource) {
        this.this$0.getSendDynamicRequestV1().setValue(resource);
    }
}
