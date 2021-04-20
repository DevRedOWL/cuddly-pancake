package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "aBoolean", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.CreatePassCompanyFragment$onViewCreated$3 */
/* compiled from: CreatePassCompanyFragment.kt */
final class CreatePassCompanyFragment$onViewCreated$3<T> implements Observer<Boolean> {
    final /* synthetic */ CreatePassCompanyFragment this$0;

    CreatePassCompanyFragment$onViewCreated$3(CreatePassCompanyFragment createPassCompanyFragment) {
        this.this$0 = createPassCompanyFragment;
    }

    public final void onChanged(Boolean bool) {
        CreatePassCompanyFragment createPassCompanyFragment = this.this$0;
        createPassCompanyFragment.showLoader(bool, createPassCompanyFragment.f6913pb);
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.btn_create_pass);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btn_create_pass");
        dynamicBackgroundButton.setEnabled(!(bool != null ? bool.booleanValue() : false));
    }
}
