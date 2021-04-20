package p035ru.unicorn.ujin.view.fragments.profile.subAccounts;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.subAccounts.NewSubAccountFragment$onViewCreated$1 */
/* compiled from: NewSubAccountFragment.kt */
final class NewSubAccountFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ NewSubAccountFragment this$0;

    NewSubAccountFragment$onViewCreated$1(NewSubAccountFragment newSubAccountFragment) {
        this.this$0 = newSubAccountFragment;
    }

    public final void onClick(View view) {
        TextInputEditText textInputEditText = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etName);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etName");
        if (!StringsKt.isBlank(String.valueOf(textInputEditText.getText()))) {
            PhoneMaskedEditText phoneMaskedEditText = (PhoneMaskedEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPhone);
            Intrinsics.checkNotNullExpressionValue(phoneMaskedEditText, "etPhone");
            if (!StringsKt.isBlank(String.valueOf(phoneMaskedEditText.getText()))) {
                ProfileViewModel profileViewModel = this.this$0.getProfileViewModel();
                TextInputEditText textInputEditText2 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etName);
                Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etName");
                String valueOf = String.valueOf(textInputEditText2.getText());
                String value = ((PhoneMaskedEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPhone)).getValue();
                TabLayout tabLayout = (TabLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.tlAccessRights);
                Intrinsics.checkNotNullExpressionValue(tabLayout, "tlAccessRights");
                TabLayout.Tab tabAt = ((TabLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.tlAccessRights)).getTabAt(tabLayout.getSelectedTabPosition());
                String valueOf2 = String.valueOf(tabAt != null ? tabAt.getTag() : null);
                ArrayList arrayList = new ArrayList();
                arrayList.add(NewSubAccountFragment.access$getSelectedValue$p(this.this$0).getValue());
                Unit unit = Unit.INSTANCE;
                profileViewModel.requestAddSubAccount(valueOf, value, valueOf2, arrayList);
                return;
            }
        }
        this.this$0.getBaseActivity().showMessage((int) R.string.emptyFieldsMessage);
    }
}
