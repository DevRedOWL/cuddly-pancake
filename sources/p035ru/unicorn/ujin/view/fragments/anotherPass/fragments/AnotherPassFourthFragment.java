package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0014J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0002J*\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0016J0\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0011H\u0002J\b\u0010,\u001a\u00020!H\u0002J\u001a\u0010-\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010.\u001a\u00020!H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u00060"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassFourthFragment;", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/BaseAnotherPassFragment;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "()V", "calendarEnd", "Ljava/util/Calendar;", "getCalendarEnd", "()Ljava/util/Calendar;", "setCalendarEnd", "(Ljava/util/Calendar;)V", "calendarStart", "getCalendarStart", "setCalendarStart", "dateFormat", "Ljava/text/SimpleDateFormat;", "sdf", "startDate", "", "getStartDate", "()Z", "setStartDate", "(Z)V", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDateEndClick", "", "onDateSet", "view", "Landroid/widget/DatePicker;", "year", "", "month", "day", "etDate", "Landroid/widget/EditText;", "startOfDay", "onDateStartClick", "onViewCreated", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFourthFragment */
/* compiled from: AnotherPassFourthFragment.kt */
public final class AnotherPassFourthFragment extends BaseAnotherPassFragment implements DatePickerDialog.OnDateSetListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public Calendar calendarEnd;
    public Calendar calendarStart;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat(DatePickerViewHolder.DATE_FORMAT, Locale.getDefault());
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    private boolean startDate = true;

    @JvmStatic
    public static final AnotherPassFourthFragment newInstance() {
        return Companion.newInstance();
    }

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
    public String metricsScreenName() {
        return "Экран выбора даты гостевого пропуска";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final Calendar getCalendarStart() {
        Calendar calendar = this.calendarStart;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
        }
        return calendar;
    }

    public final void setCalendarStart(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.calendarStart = calendar;
    }

    public final Calendar getCalendarEnd() {
        Calendar calendar = this.calendarEnd;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
        }
        return calendar;
    }

    public final void setCalendarEnd(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.calendarEnd = calendar;
    }

    public final boolean getStartDate() {
        return this.startDate;
    }

    public final void setStartDate(boolean z) {
        this.startDate = z;
    }

    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.parkingNewPass));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        BaseActivity baseActivity = getBaseActivity();
        View[] viewArr = new View[1];
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_toolbar_blue_button, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setText(getString(R.string.parkingNextStep));
            textView.setOnClickListener(new AnotherPassFourthFragment$showToolbar$$inlined$apply$lambda$1(this));
            Unit unit = Unit.INSTANCE;
            viewArr[0] = textView;
            baseActivity.setToolbarRight(CollectionsKt.arrayListOf(viewArr));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_another_pass_fourth, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etDateStart);
        textInputEditText.setFocusable(false);
        textInputEditText.setOnClickListener(new AnotherPassFourthFragment$onViewCreated$$inlined$apply$lambda$1(this));
        TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etDateEnd);
        textInputEditText2.setFocusable(false);
        textInputEditText2.setOnClickListener(new AnotherPassFourthFragment$onViewCreated$$inlined$apply$lambda$2(this));
        if (!StringsKt.isBlank(getPassViewModel().getCreateAnotherPassBody().getDateFrom())) {
            Calendar parseDate = DateUtils.parseDate(getPassViewModel().getCreateAnotherPassBody().getDateFrom(), "yyyy-MM-dd");
            Intrinsics.checkNotNullExpressionValue(parseDate, "parseDate(passViewModel.…y.dateFrom, \"yyyy-MM-dd\")");
            this.calendarStart = parseDate;
            Calendar parseDate2 = DateUtils.parseDate(getPassViewModel().getCreateAnotherPassBody().getDateTo(), "yyyy-MM-dd");
            Intrinsics.checkNotNullExpressionValue(parseDate2, "parseDate(passViewModel.…ody.dateTo, \"yyyy-MM-dd\")");
            this.calendarEnd = parseDate2;
        } else {
            Calendar instance = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
            this.calendarStart = instance;
            Calendar instance2 = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(instance2, "Calendar.getInstance()");
            this.calendarEnd = instance2;
        }
        Calendar calendar = this.calendarStart;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
        }
        this.startDate = true;
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        TextInputEditText textInputEditText3 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etDateStart);
        Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etDateStart");
        onDateSet(i, i2, i3, textInputEditText3, true);
        Calendar calendar2 = this.calendarEnd;
        if (calendar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
        }
        this.startDate = false;
        int i4 = calendar2.get(1);
        int i5 = calendar2.get(2);
        int i6 = calendar2.get(5);
        TextInputEditText textInputEditText4 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etDateEnd);
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "etDateEnd");
        onDateSet(i4, i5, i6, textInputEditText4, false);
    }

    private final void onDateSet(int i, int i2, int i3, EditText editText, boolean z) {
        EditText editText2 = editText;
        if (z) {
            Calendar calendar = this.calendarStart;
            if (calendar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
            }
            calendar.set(i, i2, i3, 0, 0, 0);
            SimpleDateFormat simpleDateFormat = this.dateFormat;
            Calendar calendar2 = this.calendarStart;
            if (calendar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
            }
            editText2.setText(simpleDateFormat.format(calendar2.getTime()));
            CreateAnotherPassRequestBody createAnotherPassBody = getPassViewModel().getCreateAnotherPassBody();
            SimpleDateFormat simpleDateFormat2 = this.sdf;
            Calendar calendar3 = this.calendarStart;
            if (calendar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
            }
            String format = simpleDateFormat2.format(calendar3.getTime());
            Intrinsics.checkNotNullExpressionValue(format, "sdf.format(calendarStart.time)");
            createAnotherPassBody.setDateFrom(format);
            Calendar calendar4 = this.calendarStart;
            if (calendar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
            }
            long timeInMillis = calendar4.getTimeInMillis();
            Calendar calendar5 = this.calendarEnd;
            if (calendar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
            }
            if (timeInMillis > calendar5.getTimeInMillis()) {
                Calendar calendar6 = this.calendarEnd;
                if (calendar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
                }
                calendar6.set(i, i2, i3, 23, 59, 59);
                TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etDateEnd);
                SimpleDateFormat simpleDateFormat3 = this.dateFormat;
                Calendar calendar7 = this.calendarEnd;
                if (calendar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
                }
                textInputEditText.setText(simpleDateFormat3.format(calendar7.getTime()));
                CreateAnotherPassRequestBody createAnotherPassBody2 = getPassViewModel().getCreateAnotherPassBody();
                SimpleDateFormat simpleDateFormat4 = this.sdf;
                Calendar calendar8 = this.calendarEnd;
                if (calendar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
                }
                String format2 = simpleDateFormat4.format(calendar8.getTime());
                Intrinsics.checkNotNullExpressionValue(format2, "sdf.format(calendarEnd.time)");
                createAnotherPassBody2.setDateTo(format2);
            }
        } else {
            Calendar calendar9 = this.calendarEnd;
            if (calendar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
            }
            calendar9.set(i, i2, i3, 23, 59, 59);
            SimpleDateFormat simpleDateFormat5 = this.dateFormat;
            Calendar calendar10 = this.calendarEnd;
            if (calendar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
            }
            editText2.setText(simpleDateFormat5.format(calendar10.getTime()));
            CreateAnotherPassRequestBody createAnotherPassBody3 = getPassViewModel().getCreateAnotherPassBody();
            SimpleDateFormat simpleDateFormat6 = this.sdf;
            Calendar calendar11 = this.calendarEnd;
            if (calendar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
            }
            String format3 = simpleDateFormat6.format(calendar11.getTime());
            Intrinsics.checkNotNullExpressionValue(format3, "sdf.format(calendarEnd.time)");
            createAnotherPassBody3.setDateTo(format3);
            Calendar calendar12 = this.calendarStart;
            if (calendar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
            }
            long timeInMillis2 = calendar12.getTimeInMillis();
            Calendar calendar13 = this.calendarEnd;
            if (calendar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
            }
            if (timeInMillis2 > calendar13.getTimeInMillis()) {
                Calendar calendar14 = this.calendarStart;
                if (calendar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
                }
                calendar14.set(i, i2, i3, 0, 0, 0);
                TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etDateStart);
                SimpleDateFormat simpleDateFormat7 = this.dateFormat;
                Calendar calendar15 = this.calendarStart;
                if (calendar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
                }
                textInputEditText2.setText(simpleDateFormat7.format(calendar15.getTime()));
                CreateAnotherPassRequestBody createAnotherPassBody4 = getPassViewModel().getCreateAnotherPassBody();
                SimpleDateFormat simpleDateFormat8 = this.sdf;
                Calendar calendar16 = this.calendarStart;
                if (calendar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
                }
                String format4 = simpleDateFormat8.format(calendar16.getTime());
                Intrinsics.checkNotNullExpressionValue(format4, "sdf.format(calendarStart.time)");
                createAnotherPassBody4.setDateFrom(format4);
            }
        }
        editText.clearFocus();
        UIHelper.hideKeyboard(getActivity(), editText2);
    }

    /* access modifiers changed from: private */
    public final void onDateStartClick() {
        Calendar calendar = this.calendarStart;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarStart");
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(getBaseActivity(), R.style.YCalendar, this, calendar.get(1), calendar.get(2), calendar.get(5));
        DatePicker datePicker = datePickerDialog.getDatePicker();
        Intrinsics.checkNotNullExpressionValue(datePicker, "datePickerDialog.datePicker");
        datePicker.setMinDate(new Date().getTime());
        datePickerDialog.show();
    }

    /* access modifiers changed from: private */
    public final void onDateEndClick() {
        Calendar calendar = this.calendarEnd;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarEnd");
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(getBaseActivity(), R.style.YCalendar, this, calendar.get(1), calendar.get(2), calendar.get(5));
        DatePicker datePicker = datePickerDialog.getDatePicker();
        Intrinsics.checkNotNullExpressionValue(datePicker, "datePickerDialog.datePicker");
        datePicker.setMinDate(new Date().getTime());
        datePickerDialog.show();
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(this.startDate ? C5619R.C5622id.etDateStart : C5619R.C5622id.etDateEnd);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "if (startDate) etDateStart else etDateEnd");
        onDateSet(i, i2, i3, textInputEditText, this.startDate);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassFourthFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassFourthFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFourthFragment$Companion */
    /* compiled from: AnotherPassFourthFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final AnotherPassFourthFragment newInstance() {
            return new AnotherPassFourthFragment();
        }
    }
}
