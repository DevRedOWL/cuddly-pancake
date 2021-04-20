package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.ChooseObjectListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/mycompany/ChooseObjectListFragment$onViewCreated$1$1", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/ChooseObjectListAdapter$OnObjectSelectedListener;", "onObjectSelected", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.ChooseObjectListFragment$onViewCreated$$inlined$let$lambda$1 */
/* compiled from: ChooseObjectListFragment.kt */
public final class ChooseObjectListFragment$onViewCreated$$inlined$let$lambda$1 implements ChooseObjectListAdapter.OnObjectSelectedListener {
    final /* synthetic */ ChooseObjectListFragment this$0;

    ChooseObjectListFragment$onViewCreated$$inlined$let$lambda$1(ChooseObjectListFragment chooseObjectListFragment) {
        this.this$0 = chooseObjectListFragment;
    }

    public void onObjectSelected(int i) {
        ChooseObjectListFragment chooseObjectListFragment = this.this$0;
        chooseObjectListFragment.selectedObject = ChooseObjectListFragment.access$getChooseObjectListAdapter$p(chooseObjectListFragment).getItem(i);
    }
}
