package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import androidx.lifecycle.Observer;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "text", "", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ConnectToCompanyFragment$onViewCreated$2 */
/* compiled from: ConnectToCompanyFragment.kt */
final class ConnectToCompanyFragment$onViewCreated$2<T> implements Observer<String> {
    final /* synthetic */ ConnectToCompanyFragment this$0;

    ConnectToCompanyFragment$onViewCreated$2(ConnectToCompanyFragment connectToCompanyFragment) {
        this.this$0 = connectToCompanyFragment;
    }

    public final void onChanged(String str) {
        this.this$0.showErrorMessage(str);
    }
}
