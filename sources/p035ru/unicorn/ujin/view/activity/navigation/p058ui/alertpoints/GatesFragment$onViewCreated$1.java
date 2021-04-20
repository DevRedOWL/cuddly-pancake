package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Points;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/Points;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$onViewCreated$1 */
/* compiled from: GatesFragment.kt */
final class GatesFragment$onViewCreated$1<T> implements Observer<Resource<Points>> {
    final /* synthetic */ GatesFragment this$0;

    GatesFragment$onViewCreated$1(GatesFragment gatesFragment) {
        this.this$0 = gatesFragment;
    }

    public final void onChanged(Resource<Points> resource) {
        this.this$0.showData(resource);
    }
}
