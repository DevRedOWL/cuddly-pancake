package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.CreatePassCompanyFragment$onViewCreated$6 */
/* compiled from: CreatePassCompanyFragment.kt */
final class CreatePassCompanyFragment$onViewCreated$6 implements View.OnClickListener {
    final /* synthetic */ CreatePassCompanyFragment this$0;

    CreatePassCompanyFragment$onViewCreated$6(CreatePassCompanyFragment createPassCompanyFragment) {
        this.this$0 = createPassCompanyFragment;
    }

    public final void onClick(View view) {
        this.this$0.mode = PassCompanyVM.Companion.getRENT();
        this.this$0.onFileChooserClick();
    }
}
