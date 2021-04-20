package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import android.view.View;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentAnotherPassBinding;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$onViewCreated$4 */
/* compiled from: AnotherPassNewFragment.kt */
final class AnotherPassNewFragment$onViewCreated$4 implements View.OnClickListener {
    final /* synthetic */ AnotherPassViewModel $viewModell;
    final /* synthetic */ AnotherPassNewFragment this$0;

    AnotherPassNewFragment$onViewCreated$4(AnotherPassNewFragment anotherPassNewFragment, AnotherPassViewModel anotherPassViewModel) {
        this.this$0 = anotherPassNewFragment;
        this.$viewModell = anotherPassViewModel;
    }

    public final void onClick(View view) {
        ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable;
        CreateAnotherPassRequestBody createAnotherPassRequestBody;
        ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable2;
        CreateAnotherPassRequestBody createAnotherPassRequestBody2;
        View currentFocus;
        FragmentActivity activity = this.this$0.getActivity();
        if (!(activity == null || (currentFocus = activity.getCurrentFocus()) == null)) {
            currentFocus.clearFocus();
        }
        AnotherPassNewFragment anotherPassNewFragment = this.this$0;
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        anotherPassNewFragment.setCalendarDateTo(instance);
        this.this$0.getCalendarDateTo().add(6, 1);
        AnotherPassNewFragment anotherPassNewFragment2 = this.this$0;
        Calendar instance2 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance2, "Calendar.getInstance()");
        anotherPassNewFragment2.setCalendarDateFrom(instance2);
        this.this$0.getCalendarDateFrom().add(6, 1);
        AnotherPassViewModel anotherPassViewModel = this.$viewModell;
        if (!(anotherPassViewModel == null || (createAnotherPassBodyObservable2 = anotherPassViewModel.getCreateAnotherPassBodyObservable()) == null || (createAnotherPassRequestBody2 = createAnotherPassBodyObservable2.get()) == null)) {
            String formatDateYYYYMMDD = DateUtils.formatDateYYYYMMDD(this.this$0.getCalendarDateFrom().getTime());
            Intrinsics.checkNotNullExpressionValue(formatDateYYYYMMDD, "formatDateYYYYMMDD(calendarDateFrom.time)");
            createAnotherPassRequestBody2.setDateFrom(formatDateYYYYMMDD);
        }
        AnotherPassViewModel anotherPassViewModel2 = this.$viewModell;
        if (!(anotherPassViewModel2 == null || (createAnotherPassBodyObservable = anotherPassViewModel2.getCreateAnotherPassBodyObservable()) == null || (createAnotherPassRequestBody = createAnotherPassBodyObservable.get()) == null)) {
            String formatDateYYYYMMDD2 = DateUtils.formatDateYYYYMMDD(this.this$0.getCalendarDateTo().getTime());
            Intrinsics.checkNotNullExpressionValue(formatDateYYYYMMDD2, "formatDateYYYYMMDD(calendarDateTo.time)");
            createAnotherPassRequestBody.setDateTo(formatDateYYYYMMDD2);
        }
        ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).data11.value.setText(DateUtils.formatDate(this.this$0.getCalendarDateTo().getTime()));
        ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).data12.value.setText(DateUtils.formatDate(this.this$0.getCalendarDateTo().getTime()));
        TextInputLayout textInputLayout = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).data11.title;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "viewDataBinding.data11.title");
        textInputLayout.setError("");
        TextInputLayout textInputLayout2 = ((FragmentAnotherPassBinding) this.this$0.getViewDataBinding()).data12.title;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "viewDataBinding.data12.title");
        textInputLayout2.setError("");
        this.this$0.checkDatesAndLoadZoneList();
        UIHelper.hideKeyboard(this.this$0.getBaseActivity(), this.this$0._$_findCachedViewById(C5619R.C5622id.data11));
    }
}
