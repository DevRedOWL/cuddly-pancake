package p035ru.unicorn.ujin.view.fragments.newSmartNav;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Ljava/lang/Void;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.NewSmartNavFragment$callMethod$1 */
/* compiled from: NewSmartNavFragment.kt */
final class NewSmartNavFragment$callMethod$1<T> implements Observer<Resource<Void>> {
    final /* synthetic */ NewSmartNavFragment this$0;

    NewSmartNavFragment$callMethod$1(NewSmartNavFragment newSmartNavFragment) {
        this.this$0 = newSmartNavFragment;
    }

    public final void onChanged(Resource<Void> resource) {
        this.this$0.handleAction(resource);
    }
}
