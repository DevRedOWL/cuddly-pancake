package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import androidx.lifecycle.Observer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "resource", "", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFifthFragment$onViewCreated$1 */
/* compiled from: AnotherPathFifthFragment.kt */
final class AnotherPassFifthFragment$onViewCreated$1<T> implements Observer<List<RentCompany>> {
    final /* synthetic */ AnotherPassFifthFragment this$0;

    AnotherPassFifthFragment$onViewCreated$1(AnotherPassFifthFragment anotherPassFifthFragment) {
        this.this$0 = anotherPassFifthFragment;
    }

    public final void onChanged(List<RentCompany> list) {
        Intrinsics.checkNotNullParameter(list, "resource");
        this.this$0.showData(list);
    }
}
