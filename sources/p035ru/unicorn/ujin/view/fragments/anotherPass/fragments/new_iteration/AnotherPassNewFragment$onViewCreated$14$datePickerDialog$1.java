package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import androidx.databinding.ObservableField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.databinding.FragmentAnotherPassBinding;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\n¢\u0006\u0002\b\t"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/DatePicker;", "kotlin.jvm.PlatformType", "year", "", "month", "dayOfMonth", "onDateSet"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$onViewCreated$14$datePickerDialog$1 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$onViewCreated$14$datePickerDialog$1 implements DatePickerDialog.OnDateSetListener {
    final /* synthetic */ AnotherPassNewFragment$onViewCreated$14 this$0;

    AnotherPassNewFragment$onViewCreated$14$datePickerDialog$1(AnotherPassNewFragment$onViewCreated$14 anotherPassNewFragment$onViewCreated$14) {
        this.this$0 = anotherPassNewFragment$onViewCreated$14;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        ObservableField<IdentityDocument> createAnotherPassBodyDocumentObservable;
        IdentityDocument identityDocument;
        this.this$0.this$0.getCalendarIssuedDate().set(1, i);
        this.this$0.this$0.getCalendarIssuedDate().set(2, i2);
        this.this$0.this$0.getCalendarIssuedDate().set(5, i3);
        AnotherPassViewModel anotherPassViewModel = this.this$0.$viewModell;
        if (!(anotherPassViewModel == null || (createAnotherPassBodyDocumentObservable = anotherPassViewModel.getCreateAnotherPassBodyDocumentObservable()) == null || (identityDocument = createAnotherPassBodyDocumentObservable.get()) == null)) {
            String formatDateYYYYMMDD = DateUtils.formatDateYYYYMMDD(this.this$0.this$0.getCalendarIssuedDate().getTime());
            Intrinsics.checkNotNullExpressionValue(formatDateYYYYMMDD, "formatDateYYYYMMDD(calendarIssuedDate.time)");
            identityDocument.setIssuedDate(formatDateYYYYMMDD);
        }
        ((FragmentAnotherPassBinding) this.this$0.this$0.getViewDataBinding()).data10.value.setText(DateUtils.formatDate(this.this$0.this$0.getCalendarIssuedDate().getTime()));
    }
}
