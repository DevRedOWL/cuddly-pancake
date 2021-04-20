package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.DatePicker;
import androidx.appcompat.app.AlertDialog;
import androidx.databinding.ObservableField;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentCoronaCreatePass2Binding;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.CreatePassDTO;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Pass;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0014J*\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\u0016\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/CreateCoronaFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/CoronaViewModel;", "Lru/unicorn/databinding/FragmentCoronaCreatePass2Binding;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "()V", "getLayoutRes", "", "getMyToolbarTitle", "", "onDateSet", "", "view", "Landroid/widget/DatePicker;", "year", "month", "dayOfMonth", "onFileChoose", "filePath", "onViewCreated", "viewModell", "showAllAdresses", "showCreationResult", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;", "showDatePicker", "v", "Landroid/view/View;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.CreateCoronaFragment */
/* compiled from: CreateCoronaFragment.kt */
public final class CreateCoronaFragment extends BaseBindingFragment<CoronaViewModel, FragmentCoronaCreatePass2Binding> implements DatePickerDialog.OnDateSetListener {
    private HashMap _$_findViewCache;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_corona_create_pass2;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(CoronaViewModel coronaViewModel) {
        SingleLiveEvent<Resource<Pass>> createPassMutable;
        FragmentCoronaCreatePass2Binding fragmentCoronaCreatePass2Binding = (FragmentCoronaCreatePass2Binding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentCoronaCreatePass2Binding, "viewDataBinding");
        fragmentCoronaCreatePass2Binding.setVm(coronaViewModel);
        if (!(coronaViewModel == null || (createPassMutable = coronaViewModel.getCreatePassMutable()) == null)) {
            createPassMutable.observe(this, new CreateCoronaFragment$onViewCreated$1(this));
        }
        ((FragmentCoronaCreatePass2Binding) getViewDataBinding()).fourth.f6597cl.setOnClickListener(new CreateCoronaFragment$onViewCreated$2(this));
        ((FragmentCoronaCreatePass2Binding) getViewDataBinding()).btnCreatePass.setOnClickListener(new CreateCoronaFragment$onViewCreated$3(coronaViewModel));
        ((FragmentCoronaCreatePass2Binding) getViewDataBinding()).second.f6597cl.setOnClickListener(new CreateCoronaFragment$onViewCreated$4(this));
    }

    /* access modifiers changed from: private */
    public final void showAllAdresses() {
        nextFragment(new AllAdressesFragment(), false);
    }

    /* access modifiers changed from: private */
    public final void showCreationResult(Resource<Pass> resource) {
        if (resource.getStatus() == Resource.Status.SUCCESS) {
            new AlertDialog.Builder(getBaseActivity()).setMessage((CharSequence) getString(R.string.label_pass_created)).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) new CreateCoronaFragment$showCreationResult$1(this)).show();
        } else {
            new AlertDialog.Builder(getBaseActivity()).setMessage((CharSequence) getString(R.string.error_on_pass_create)).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) new CreateCoronaFragment$showCreationResult$2(this)).show();
        }
    }

    /* access modifiers changed from: private */
    public final void showDatePicker(View view) {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(view.getContext(), this, instance.get(1), instance.get(2), instance.get(5));
        DatePicker datePicker = datePickerDialog.getDatePicker();
        Intrinsics.checkNotNullExpressionValue(datePicker, "datePickerDialog.datePicker");
        datePicker.setMinDate(new Date().getTime());
        datePickerDialog.show();
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        ObservableField<Long> timeInMillis;
        ObservableField<String> timeAsText;
        Calendar instance = Calendar.getInstance();
        instance.set(1, i);
        instance.set(2, i2);
        instance.set(5, i3);
        CreatePassDTO createPassDTO = ((CoronaViewModel) getViewModell()).getTempPass().get();
        if (!(createPassDTO == null || (timeAsText = createPassDTO.getTimeAsText()) == null)) {
            Intrinsics.checkNotNullExpressionValue(instance, "c");
            timeAsText.set(DateUtils.formatDateYYYYMMDD(instance.getTime()));
        }
        CreatePassDTO createPassDTO2 = ((CoronaViewModel) getViewModell()).getTempPass().get();
        if (createPassDTO2 != null && (timeInMillis = createPassDTO2.getTimeInMillis()) != null) {
            Intrinsics.checkNotNullExpressionValue(instance, "c");
            Date time = instance.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "c.time");
            timeInMillis.set(Long.valueOf(time.getTime()));
        }
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_ticket);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_ticket)");
        return string;
    }
}
