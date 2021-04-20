package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import androidx.databinding.ObservableField;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.databinding.FragmentAnotherPassBinding;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, mo51343d2 = {"<anonymous>", "", "timePicker", "Landroid/widget/TimePicker;", "kotlin.jvm.PlatformType", "hour", "", "minute", "onTimeSet"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$onViewCreated$11$timeSetListener$1 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$onViewCreated$11$timeSetListener$1 implements TimePickerDialog.OnTimeSetListener {
    final /* synthetic */ AnotherPassNewFragment$onViewCreated$11 this$0;

    AnotherPassNewFragment$onViewCreated$11$timeSetListener$1(AnotherPassNewFragment$onViewCreated$11 anotherPassNewFragment$onViewCreated$11) {
        this.this$0 = anotherPassNewFragment$onViewCreated$11;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable;
        CreateAnotherPassRequestBody createAnotherPassRequestBody;
        this.this$0.this$0.getCalendarTimeFrom().set(11, i);
        this.this$0.this$0.getCalendarTimeFrom().set(12, i2);
        AnotherPassViewModel anotherPassViewModel = this.this$0.$viewModell;
        if (!(anotherPassViewModel == null || (createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable()) == null || (createAnotherPassRequestBody = createAnotherPassBodyObservable.get()) == null)) {
            String formatTimeFromCalendar = DateUtils.formatTimeFromCalendar(this.this$0.this$0.getCalendarTimeFrom());
            Intrinsics.checkNotNullExpressionValue(formatTimeFromCalendar, "formatTimeFromCalendar(calendarTimeFrom)");
            createAnotherPassRequestBody.setTimeFrom(formatTimeFromCalendar);
        }
        ((FragmentAnotherPassBinding) this.this$0.this$0.getViewDataBinding()).data13.value.setText(DateUtils.formatTimeFromCalendar(this.this$0.this$0.getCalendarTimeFrom()));
        TextInputLayout textInputLayout = ((FragmentAnotherPassBinding) this.this$0.this$0.getViewDataBinding()).data13.title;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "viewDataBinding.data13.title");
        textInputLayout.setError("");
        this.this$0.this$0.checkDatesAndLoadZoneList();
    }
}
