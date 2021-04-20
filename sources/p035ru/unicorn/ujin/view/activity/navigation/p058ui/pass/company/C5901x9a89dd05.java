package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import android.app.DatePickerDialog;
import android.view.View;
import android.widget.DatePicker;
import androidx.databinding.ObservableField;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.databinding.FragmentApplicationToCompanyBinding;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.request.ApplicationToCompanyBody;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/activity/navigation/ui/pass/company/ApplicationToCompanyFragment$onViewCreated$5$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$onViewCreated$$inlined$apply$lambda$1 */
/* compiled from: ApplicationToCompanyFragment.kt */
final class C5901x9a89dd05 implements View.OnClickListener {
    final /* synthetic */ PassCompanyVM $viewModell$inlined;
    final /* synthetic */ ApplicationToCompanyFragment this$0;

    C5901x9a89dd05(ApplicationToCompanyFragment applicationToCompanyFragment, PassCompanyVM passCompanyVM) {
        this.this$0 = applicationToCompanyFragment;
        this.$viewModell$inlined = passCompanyVM;
    }

    public final void onClick(View view) {
        UIHelper.hideKeyboard(this.this$0.getBaseActivity(), view);
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.this$0.getBaseActivity(), new DatePickerDialog.OnDateSetListener(this) {
            final /* synthetic */ C5901x9a89dd05 this$0;

            {
                this.this$0 = r1;
            }

            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                ObservableField<ApplicationToCompanyBody> applicationToCompanyBodyObservable;
                ApplicationToCompanyBody applicationToCompanyBody;
                Calendar instance = Calendar.getInstance();
                instance.set(1, i);
                instance.set(2, i2);
                instance.set(5, i3);
                PassCompanyVM passCompanyVM = this.this$0.$viewModell$inlined;
                if (!(passCompanyVM == null || (applicationToCompanyBodyObservable = passCompanyVM.getApplicationToCompanyBodyObservable()) == null || (applicationToCompanyBody = applicationToCompanyBodyObservable.get()) == null)) {
                    Intrinsics.checkNotNullExpressionValue(instance, "c");
                    String formatDateYYYYMMDD = DateUtils.formatDateYYYYMMDD(instance.getTime());
                    Intrinsics.checkNotNullExpressionValue(formatDateYYYYMMDD, "DateUtils.formatDateYYYYMMDD(c.time)");
                    applicationToCompanyBody.setBirthday(formatDateYYYYMMDD);
                }
                TextInputEditText textInputEditText = ((FragmentApplicationToCompanyBinding) this.this$0.this$0.getViewDataBinding()).birthday.etValue;
                Intrinsics.checkNotNullExpressionValue(instance, "c");
                textInputEditText.setText(DateUtils.formatDate(instance.getTime()));
            }
        }, instance.get(1), instance.get(2), instance.get(5));
        DatePicker datePicker = datePickerDialog.getDatePicker();
        Intrinsics.checkNotNullExpressionValue(datePicker, "datePickerDialog.datePicker");
        datePicker.setMaxDate(new Date().getTime());
        datePickerDialog.show();
    }
}
