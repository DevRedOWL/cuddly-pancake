package p035ru.unicorn.ujin.view.fragments.mortgage;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.util.DateUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/mortgage/MortgageApplicationFragment$onViewCreated$2$3$1", "ru/unicorn/ujin/view/fragments/mortgage/MortgageApplicationFragment$$special$$inlined$apply$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.mortgage.MortgageApplicationFragment$onViewCreated$$inlined$let$lambda$1 */
/* compiled from: MortgageApplicationFragment.kt */
final class MortgageApplicationFragment$onViewCreated$$inlined$let$lambda$1 implements View.OnClickListener {
    final /* synthetic */ MortgageApplicationFragment this$0;

    MortgageApplicationFragment$onViewCreated$$inlined$let$lambda$1(MortgageApplicationFragment mortgageApplicationFragment) {
        this.this$0 = mortgageApplicationFragment;
    }

    public final void onClick(View view) {
        TextInputEditText textInputEditText = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etBirthday);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etBirthday");
        if (textInputEditText.getText() != null) {
            TextInputEditText textInputEditText2 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etBirthday);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etBirthday");
            if (String.valueOf(textInputEditText2.getText()).length() > 0) {
                TextInputEditText textInputEditText3 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etBirthday);
                Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etBirthday");
                Date formatDateFromString = DateUtils.formatDateFromString(String.valueOf(textInputEditText3.getText()));
                if (formatDateFromString != null) {
                    this.this$0.calendar.setTime(formatDateFromString);
                }
            }
        }
        this.this$0.showDatePickerDialog();
    }
}
