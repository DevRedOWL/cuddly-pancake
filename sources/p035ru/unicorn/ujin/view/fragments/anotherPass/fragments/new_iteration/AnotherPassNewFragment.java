package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentAnotherPassBinding;
import p035ru.unicorn.ujin.data.realm.Building;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.service.location.LocationService;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.BaseAnotherPassFragment;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.ContactListFragment;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.AnotherPassResponse;
import p035ru.unicorn.ujin.view.fragments.parking.ParkingViewModel;
import p035ru.unicorn.ujin.view.fragments.parking.adapters.ZoneSlotsAdapter;
import p035ru.unicorn.ujin.view.fragments.parking.events.EmployeeSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.EmployeeSlot;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 P2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001PB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0002J\b\u0010.\u001a\u00020,H\u0002J\b\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u000202H\u0014J\u0012\u00103\u001a\u00020,2\b\u00104\u001a\u0004\u0018\u000105H\u0002J\u0010\u00106\u001a\u00020,2\u0006\u00107\u001a\u000208H\u0002J\u0016\u00109\u001a\u00020,2\f\u00107\u001a\b\u0012\u0004\u0012\u00020;0:H\u0002J\u001a\u0010<\u001a\u00020,2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010>H\u0002J\b\u0010@\u001a\u00020,H\u0002J\u0010\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u000202H\u0016J\b\u0010C\u001a\u00020,H\u0016J+\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u0002002\f\u0010F\u001a\b\u0012\u0004\u0012\u0002020G2\u0006\u0010H\u001a\u00020IH\u0016¢\u0006\u0002\u0010JJ\b\u0010K\u001a\u00020,H\u0016J\u0012\u0010L\u001a\u00020,2\b\u0010M\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010N\u001a\u00020,H\u0002J\u0006\u0010O\u001a\u00020\u001bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001f¨\u0006Q"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/new_iteration/AnotherPassNewFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/fragments/anotherPass/AnotherPassViewModel;", "Lru/unicorn/databinding/FragmentAnotherPassBinding;", "()V", "calendarDateBirthday", "Ljava/util/Calendar;", "getCalendarDateBirthday", "()Ljava/util/Calendar;", "setCalendarDateBirthday", "(Ljava/util/Calendar;)V", "calendarDateFrom", "getCalendarDateFrom", "setCalendarDateFrom", "calendarDateTo", "getCalendarDateTo", "setCalendarDateTo", "calendarIssuedDate", "getCalendarIssuedDate", "setCalendarIssuedDate", "calendarTimeFrom", "getCalendarTimeFrom", "setCalendarTimeFrom", "calendarTimeTo", "getCalendarTimeTo", "setCalendarTimeTo", "clearData", "", "getClearData", "()Z", "setClearData", "(Z)V", "isCommerce", "setCommerce", "parkingViewModel", "Lru/unicorn/ujin/view/fragments/parking/ParkingViewModel;", "getParkingViewModel", "()Lru/unicorn/ujin/view/fragments/parking/ParkingViewModel;", "parkingViewModel$delegate", "Lkotlin/Lazy;", "showRent", "getShowRent", "setShowRent", "askForContactPermission", "", "checkAndShowAuto", "checkDatesAndLoadZoneList", "getLayoutRes", "", "getMyToolbarTitle", "", "handleContactEvent", "contact", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/Contact;", "handleEmployeeSlots", "event", "Lru/unicorn/ujin/view/fragments/parking/events/EmployeeSlotsEvent;", "handlePassCreate", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/anotherPass/response/AnotherPassResponse;", "handleSlotClick", "slot", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "zone", "initDefaultData", "onFileChoose", "filePath", "onPause", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "viewModell", "showContactList", "valid", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment */
/* compiled from: AnotherPassNewFragment.kt */
public final class AnotherPassNewFragment extends BaseBindingFragment<AnotherPassViewModel, FragmentAnotherPassBinding> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int PERMISSION_REQUEST_CONTACT = 20;
    private HashMap _$_findViewCache;
    private Calendar calendarDateBirthday;
    private Calendar calendarDateFrom;
    private Calendar calendarDateTo;
    private Calendar calendarIssuedDate;
    private Calendar calendarTimeFrom;
    private Calendar calendarTimeTo;
    private boolean clearData;
    private boolean isCommerce;
    private final Lazy parkingViewModel$delegate = LazyKt.lazy(new AnotherPassNewFragment$parkingViewModel$2(this));
    private boolean showRent;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 2;
        }
    }

    private final ParkingViewModel getParkingViewModel() {
        return (ParkingViewModel) this.parkingViewModel$delegate.getValue();
    }

    @JvmStatic
    public static final AnotherPassNewFragment newInstance(boolean z) {
        return Companion.newInstance(z);
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
    public int getLayoutRes() {
        return R.layout.fragment_another_pass;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    public AnotherPassNewFragment() {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        this.calendarDateFrom = instance;
        Calendar instance2 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance2, "Calendar.getInstance()");
        this.calendarDateTo = instance2;
        Calendar instance3 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance3, "Calendar.getInstance()");
        this.calendarTimeFrom = instance3;
        Calendar instance4 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance4, "Calendar.getInstance()");
        this.calendarTimeTo = instance4;
        Calendar instance5 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance5, "Calendar.getInstance()");
        this.calendarDateBirthday = instance5;
        Calendar instance6 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance6, "Calendar.getInstance()");
        this.calendarIssuedDate = instance6;
    }

    public final boolean getShowRent() {
        return this.showRent;
    }

    public final void setShowRent(boolean z) {
        this.showRent = z;
    }

    public final Calendar getCalendarDateFrom() {
        return this.calendarDateFrom;
    }

    public final void setCalendarDateFrom(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.calendarDateFrom = calendar;
    }

    public final Calendar getCalendarDateTo() {
        return this.calendarDateTo;
    }

    public final void setCalendarDateTo(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.calendarDateTo = calendar;
    }

    public final Calendar getCalendarTimeFrom() {
        return this.calendarTimeFrom;
    }

    public final void setCalendarTimeFrom(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.calendarTimeFrom = calendar;
    }

    public final Calendar getCalendarTimeTo() {
        return this.calendarTimeTo;
    }

    public final void setCalendarTimeTo(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.calendarTimeTo = calendar;
    }

    public final Calendar getCalendarDateBirthday() {
        return this.calendarDateBirthday;
    }

    public final void setCalendarDateBirthday(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.calendarDateBirthday = calendar;
    }

    public final Calendar getCalendarIssuedDate() {
        return this.calendarIssuedDate;
    }

    public final void setCalendarIssuedDate(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.calendarIssuedDate = calendar;
    }

    public final boolean isCommerce() {
        return this.isCommerce;
    }

    public final void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public final boolean getClearData() {
        return this.clearData;
    }

    public final void setClearData(boolean z) {
        this.clearData = z;
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.anotherPassNew);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.anotherPassNew)");
        return string;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(AnotherPassViewModel anotherPassViewModel) {
        SingleLiveEvent<Resource<AnotherPassResponse>> createAnotherPassMutableLiveData;
        MutableLiveData<List<RentCompany>> enterpriseListMutableLiveData;
        ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable;
        CreateAnotherPassRequestBody createAnotherPassRequestBody;
        ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable2;
        CreateAnotherPassRequestBody createAnotherPassRequestBody2;
        Building building;
        String endWorkTime;
        ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable3;
        CreateAnotherPassRequestBody createAnotherPassRequestBody3;
        ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable4;
        CreateAnotherPassRequestBody createAnotherPassRequestBody4;
        Building building2;
        String startWorkTime;
        CreateAnotherPassRequestBody createAnotherPassBody;
        String strategy;
        FragmentAnotherPassBinding fragmentAnotherPassBinding = (FragmentAnotherPassBinding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentAnotherPassBinding, "viewDataBinding");
        fragmentAnotherPassBinding.setLifecycleOwner(getViewLifecycleOwner());
        FragmentAnotherPassBinding fragmentAnotherPassBinding2 = (FragmentAnotherPassBinding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentAnotherPassBinding2, "viewDataBinding");
        fragmentAnotherPassBinding2.setVm(anotherPassViewModel);
        if (this.clearData) {
            if (anotherPassViewModel != null) {
                anotherPassViewModel.initPassBody();
            }
            this.clearData = false;
        }
        this.isCommerce = getBaseActivity().profileViewModel.getUser().isCurrentCommerce();
        new Handler().postDelayed(new AnotherPassNewFragment$onViewCreated$1(this, anotherPassViewModel), 500);
        boolean z = true;
        if (!(anotherPassViewModel == null || (createAnotherPassBody = anotherPassViewModel.getCreateAnotherPassBody()) == null || (strategy = createAnotherPassBody.getStrategy()) == null || !(!StringsKt.isBlank(strategy)))) {
            String strategy2 = anotherPassViewModel.getCreateAnotherPassBody().getStrategy();
            int hashCode = strategy2.hashCode();
            if (hashCode != -1320264141) {
                if (hashCode == 1984986705 && strategy2.equals("temporary")) {
                    RadioButton radioButton = (RadioButton) _$_findCachedViewById(C5619R.C5622id.btnPassTime);
                    Intrinsics.checkNotNullExpressionValue(radioButton, "btnPassTime");
                    radioButton.setChecked(true);
                }
            } else if (strategy2.equals("onetime")) {
                RadioButton radioButton2 = (RadioButton) _$_findCachedViewById(C5619R.C5622id.btnPassOneTime);
                Intrinsics.checkNotNullExpressionValue(radioButton2, "btnPassOneTime");
                radioButton2.setChecked(true);
            }
            RadioButton radioButton3 = (RadioButton) _$_findCachedViewById(C5619R.C5622id.btnPassTime);
            Intrinsics.checkNotNullExpressionValue(radioButton3, "btnPassTime");
            radioButton3.setChecked(true);
        }
        ((FragmentAnotherPassBinding) getViewDataBinding()).btnPassOneTime.setOnClickListener(new AnotherPassNewFragment$onViewCreated$2(this, anotherPassViewModel));
        ((FragmentAnotherPassBinding) getViewDataBinding()).today.setOnClickListener(new AnotherPassNewFragment$onViewCreated$3(this, anotherPassViewModel));
        ((FragmentAnotherPassBinding) getViewDataBinding()).tomorrow.setOnClickListener(new AnotherPassNewFragment$onViewCreated$4(this, anotherPassViewModel));
        ((FragmentAnotherPassBinding) getViewDataBinding()).rent.setOnClickListener(new AnotherPassNewFragment$onViewCreated$5(this));
        ((FragmentAnotherPassBinding) getViewDataBinding()).save.setOnClickListener(new AnotherPassNewFragment$onViewCreated$6(this, anotherPassViewModel));
        ((FragmentAnotherPassBinding) getViewDataBinding()).group.setOnClickListener(new AnotherPassNewFragment$onViewCreated$7(this));
        ((FragmentAnotherPassBinding) getViewDataBinding()).auto.setOnClickListener(new AnotherPassNewFragment$onViewCreated$8(this, anotherPassViewModel));
        ((FragmentAnotherPassBinding) getViewDataBinding()).data11.icon.setOnClickListener(new AnotherPassNewFragment$onViewCreated$9(this, anotherPassViewModel));
        ((FragmentAnotherPassBinding) getViewDataBinding()).data12.icon.setOnClickListener(new AnotherPassNewFragment$onViewCreated$10(this, anotherPassViewModel));
        String str = null;
        if (!(anotherPassViewModel == null || (createAnotherPassBodyObservable4 = anotherPassViewModel.getCreateAnotherPassBodyObservable()) == null || (createAnotherPassRequestBody4 = createAnotherPassBodyObservable4.get()) == null)) {
            Building building3 = getBaseActivity().profileViewModel.getBuilding();
            CharSequence startWorkTime2 = building3 != null ? building3.getStartWorkTime() : null;
            String str2 = "00:00";
            if (!((startWorkTime2 == null || StringsKt.isBlank(startWorkTime2)) || (building2 = getBaseActivity().profileViewModel.getBuilding()) == null || (startWorkTime = building2.getStartWorkTime()) == null)) {
                str2 = startWorkTime;
            }
            createAnotherPassRequestBody4.setTimeFrom(str2);
        }
        Calendar parseTime = DateUtils.parseTime((anotherPassViewModel == null || (createAnotherPassBodyObservable3 = anotherPassViewModel.getCreateAnotherPassBodyObservable()) == null || (createAnotherPassRequestBody3 = createAnotherPassBodyObservable3.get()) == null) ? null : createAnotherPassRequestBody3.getTimeFrom());
        Intrinsics.checkNotNullExpressionValue(parseTime, "parseTime(viewModell?.cr…ervable?.get()?.timeFrom)");
        this.calendarTimeFrom = parseTime;
        ((FragmentAnotherPassBinding) getViewDataBinding()).data13.value.setText(DateUtils.formatTimeFromCalendar(this.calendarTimeFrom));
        ((FragmentAnotherPassBinding) getViewDataBinding()).data13.icon.setOnClickListener(new AnotherPassNewFragment$onViewCreated$11(this, anotherPassViewModel));
        if (!(anotherPassViewModel == null || (createAnotherPassBodyObservable2 = anotherPassViewModel.getCreateAnotherPassBodyObservable()) == null || (createAnotherPassRequestBody2 = createAnotherPassBodyObservable2.get()) == null)) {
            Building building4 = getBaseActivity().profileViewModel.getBuilding();
            CharSequence endWorkTime2 = building4 != null ? building4.getEndWorkTime() : null;
            if (endWorkTime2 != null && !StringsKt.isBlank(endWorkTime2)) {
                z = false;
            }
            String str3 = "23:59";
            if (!(z || (building = getBaseActivity().profileViewModel.getBuilding()) == null || (endWorkTime = building.getEndWorkTime()) == null)) {
                str3 = endWorkTime;
            }
            createAnotherPassRequestBody2.setTimeTo(str3);
        }
        if (!(anotherPassViewModel == null || (createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable()) == null || (createAnotherPassRequestBody = createAnotherPassBodyObservable.get()) == null)) {
            str = createAnotherPassRequestBody.getTimeTo();
        }
        Calendar parseTime2 = DateUtils.parseTime(str);
        Intrinsics.checkNotNullExpressionValue(parseTime2, "parseTime(viewModell?.cr…bservable?.get()?.timeTo)");
        this.calendarTimeTo = parseTime2;
        ((FragmentAnotherPassBinding) getViewDataBinding()).data14.value.setText(DateUtils.formatTimeFromCalendar(this.calendarTimeTo));
        ((FragmentAnotherPassBinding) getViewDataBinding()).data14.icon.setOnClickListener(new AnotherPassNewFragment$onViewCreated$12(this, anotherPassViewModel));
        ((FragmentAnotherPassBinding) getViewDataBinding()).data8.icon.setOnClickListener(new AnotherPassNewFragment$onViewCreated$13(this, anotherPassViewModel));
        ((FragmentAnotherPassBinding) getViewDataBinding()).data10.icon.setOnClickListener(new AnotherPassNewFragment$onViewCreated$14(this, anotherPassViewModel));
        if (!(anotherPassViewModel == null || (enterpriseListMutableLiveData = anotherPassViewModel.getEnterpriseListMutableLiveData()) == null)) {
            enterpriseListMutableLiveData.observe(getViewLifecycleOwner(), new AnotherPassNewFragment$onViewCreated$15(this, anotherPassViewModel));
        }
        if (!(anotherPassViewModel == null || (createAnotherPassMutableLiveData = anotherPassViewModel.getCreateAnotherPassMutableLiveData()) == null)) {
            createAnotherPassMutableLiveData.observe(getViewLifecycleOwner(), new AnotherPassNewFragment$onViewCreated$16(this));
        }
        ((FragmentAnotherPassBinding) getViewDataBinding()).title2.btnAction.setOnClickListener(new AnotherPassNewFragment$onViewCreated$17(this));
        ((FragmentAnotherPassBinding) getViewDataBinding()).title10.btnAction.setOnClickListener(new AnotherPassNewFragment$onViewCreated$18(this, anotherPassViewModel));
        ((CheckBox) _$_findCachedViewById(C5619R.C5622id.checkboxDifferentVehicleType)).setOnCheckedChangeListener(new AnotherPassNewFragment$onViewCreated$19(this));
    }

    public void onResume() {
        super.onResume();
        getBaseActivity().addEditTextToVehicleMask((EditText) _$_findCachedViewById(C5619R.C5622id.data19).findViewById(R.id.value), (EditText) _$_findCachedViewById(C5619R.C5622id.data19).findViewById(R.id.hint));
    }

    public void onPause() {
        super.onPause();
        getBaseActivity().removeEditTextFromVehicleMask((EditText) _$_findCachedViewById(C5619R.C5622id.data19).findViewById(R.id.value));
    }

    /* access modifiers changed from: private */
    public final void handleContactEvent(Contact contact) {
        if (contact != null) {
            CharSequence id = contact.getId();
            boolean z = false;
            if (!(id == null || StringsKt.isBlank(id))) {
                if (!(!StringsKt.isBlank(((AnotherPassViewModel) getViewModell()).getCreateAnotherPassBody().getName())) && !(!StringsKt.isBlank(((AnotherPassViewModel) getViewModell()).getCreateAnotherPassBody().getSurname())) && !(!StringsKt.isBlank(((AnotherPassViewModel) getViewModell()).getCreateAnotherPassBody().getPatronymic()))) {
                    CharSequence email = ((AnotherPassViewModel) getViewModell()).getCreateAnotherPassBody().getEmail();
                    if (email == null || StringsKt.isBlank(email)) {
                        z = true;
                    }
                    if (z && !(!StringsKt.isBlank(((AnotherPassViewModel) getViewModell()).getCreateAnotherPassBody().getPhone()))) {
                        new Handler().post(new AnotherPassNewFragment$handleContactEvent$$inlined$let$lambda$2(this, contact));
                        return;
                    }
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getBaseActivity());
                builder.setTitle((CharSequence) getResources().getString(R.string.add_contact_attention)).setMessage((CharSequence) getResources().getString(R.string.add_contact_message)).setPositiveButton((CharSequence) getResources().getString(R.string.add_contact_change), (DialogInterface.OnClickListener) new AnotherPassNewFragment$handleContactEvent$$inlined$let$lambda$1(this, contact)).setNegativeButton((CharSequence) getResources().getString(R.string.add_contact_cancel), (DialogInterface.OnClickListener) AnotherPassNewFragment$handleContactEvent$1$2.INSTANCE);
                AlertDialog create = builder.create();
                Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
                create.show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = (r0 = r0.getCreateAnotherPassBodyObservable()).get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initDefaultData() {
        /*
            r7 = this;
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            r1 = 0
            if (r0 == 0) goto L_0x001c
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.getDateFrom()
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x002c
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r0 = 0
            goto L_0x002d
        L_0x002c:
            r0 = 1
        L_0x002d:
            java.lang.String r4 = "yyyy-MM-dd"
            if (r0 != 0) goto L_0x0071
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x004c
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r0.getDateFrom()
            goto L_0x004d
        L_0x004c:
            r0 = r1
        L_0x004d:
            java.util.Calendar r0 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r0, r4)
            java.lang.String r5 = "parseDate(viewModell?.cr…?.dateFrom, \"yyyy-MM-dd\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r7.calendarDateFrom = r0
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data11
            com.google.android.material.textfield.TextInputEditText r0 = r0.value
            java.util.Calendar r5 = r7.calendarDateFrom
            java.util.Date r5 = r5.getTime()
            java.lang.String r5 = p035ru.unicorn.ujin.util.DateUtils.formatDate((java.util.Date) r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.setText(r5)
        L_0x0071:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x008c
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = r0.getDateTo()
            goto L_0x008d
        L_0x008c:
            r0 = r1
        L_0x008d:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x009a
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r0 = 0
            goto L_0x009b
        L_0x009a:
            r0 = 1
        L_0x009b:
            if (r0 != 0) goto L_0x00dd
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x00b8
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = r0.getDateTo()
            goto L_0x00b9
        L_0x00b8:
            r0 = r1
        L_0x00b9:
            java.util.Calendar r0 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r0, r4)
            java.lang.String r5 = "parseDate(viewModell?.cr…()?.dateTo, \"yyyy-MM-dd\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r7.calendarDateTo = r0
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data12
            com.google.android.material.textfield.TextInputEditText r0 = r0.value
            java.util.Calendar r5 = r7.calendarDateTo
            java.util.Date r5 = r5.getTime()
            java.lang.String r5 = p035ru.unicorn.ujin.util.DateUtils.formatDate((java.util.Date) r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.setText(r5)
        L_0x00dd:
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data11
            java.lang.String r5 = "viewDataBinding.data11"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r0.setIsRequired(r5)
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data11
            android.content.res.Resources r5 = r7.getResources()
            r6 = 2131887002(0x7f12039a, float:1.9408599E38)
            java.lang.String r5 = r5.getString(r6)
            r0.setTitle(r5)
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data12
            java.lang.String r5 = "viewDataBinding.data12"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r0.setIsRequired(r5)
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data12
            android.content.res.Resources r5 = r7.getResources()
            r6 = 2131887004(0x7f12039c, float:1.9408603E38)
            java.lang.String r5 = r5.getString(r6)
            r0.setTitle(r5)
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x014c
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = r0.getTimeFrom()
            goto L_0x014d
        L_0x014c:
            r0 = r1
        L_0x014d:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x015a
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r0 = 0
            goto L_0x015b
        L_0x015a:
            r0 = 1
        L_0x015b:
            if (r0 != 0) goto L_0x0199
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x0178
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x0178
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x0178
            java.lang.String r0 = r0.getTimeFrom()
            goto L_0x0179
        L_0x0178:
            r0 = r1
        L_0x0179:
            java.util.Calendar r0 = p035ru.unicorn.ujin.util.DateUtils.parseTime(r0)
            java.lang.String r5 = "parseTime(viewModell?.cr…ervable?.get()?.timeFrom)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r7.calendarTimeFrom = r0
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data13
            com.google.android.material.textfield.TextInputEditText r0 = r0.value
            java.util.Calendar r5 = r7.calendarTimeFrom
            java.lang.String r5 = p035ru.unicorn.ujin.util.DateUtils.formatTimeFromCalendar(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.setText(r5)
        L_0x0199:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x01b4
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x01b4
            java.lang.String r0 = r0.getTimeTo()
            goto L_0x01b5
        L_0x01b4:
            r0 = r1
        L_0x01b5:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x01c2
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x01c0
            goto L_0x01c2
        L_0x01c0:
            r0 = 0
            goto L_0x01c3
        L_0x01c2:
            r0 = 1
        L_0x01c3:
            if (r0 != 0) goto L_0x0201
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x01e0
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x01e0
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = r0.getTimeTo()
            goto L_0x01e1
        L_0x01e0:
            r0 = r1
        L_0x01e1:
            java.util.Calendar r0 = p035ru.unicorn.ujin.util.DateUtils.parseTime(r0)
            java.lang.String r5 = "parseTime(viewModell?.cr…bservable?.get()?.timeTo)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r7.calendarTimeTo = r0
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data14
            com.google.android.material.textfield.TextInputEditText r0 = r0.value
            java.util.Calendar r5 = r7.calendarTimeTo
            java.lang.String r5 = p035ru.unicorn.ujin.util.DateUtils.formatTimeFromCalendar(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.setText(r5)
        L_0x0201:
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data13
            java.lang.String r5 = "viewDataBinding.data13"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r0.setIsRequired(r5)
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data13
            android.content.res.Resources r5 = r7.getResources()
            r6 = 2131887240(0x7f120488, float:1.9409081E38)
            java.lang.String r5 = r5.getString(r6)
            r0.setTitle(r5)
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data14
            java.lang.String r5 = "viewDataBinding.data14"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r0.setIsRequired(r5)
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data14
            android.content.res.Resources r5 = r7.getResources()
            r6 = 2131887241(0x7f120489, float:1.9409084E38)
            java.lang.String r5 = r5.getString(r6)
            r0.setTitle(r5)
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x0270
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x0270
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x0270
            java.lang.String r0 = r0.getBirthday()
            goto L_0x0271
        L_0x0270:
            r0 = r1
        L_0x0271:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x027e
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x027c
            goto L_0x027e
        L_0x027c:
            r0 = 0
            goto L_0x027f
        L_0x027e:
            r0 = 1
        L_0x027f:
            if (r0 != 0) goto L_0x02c1
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x029c
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x029c
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x029c
            java.lang.String r0 = r0.getBirthday()
            goto L_0x029d
        L_0x029c:
            r0 = r1
        L_0x029d:
            java.util.Calendar r0 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r0, r4)
            java.lang.String r5 = "parseDate(viewModell?.cr…?.birthday, \"yyyy-MM-dd\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r7.calendarDateBirthday = r0
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data8
            com.google.android.material.textfield.TextInputEditText r0 = r0.value
            java.util.Calendar r5 = r7.calendarDateBirthday
            java.util.Date r5 = r5.getTime()
            java.lang.String r5 = p035ru.unicorn.ujin.util.DateUtils.formatDate((java.util.Date) r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.setText(r5)
        L_0x02c1:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x02dc
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyDocumentObservable()
            if (r0 == 0) goto L_0x02dc
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r0
            if (r0 == 0) goto L_0x02dc
            java.lang.String r0 = r0.getIssuedDate()
            goto L_0x02dd
        L_0x02dc:
            r0 = r1
        L_0x02dd:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x02ea
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x02e8
            goto L_0x02ea
        L_0x02e8:
            r0 = 0
            goto L_0x02eb
        L_0x02ea:
            r0 = 1
        L_0x02eb:
            if (r0 != 0) goto L_0x032d
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x0308
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyDocumentObservable()
            if (r0 == 0) goto L_0x0308
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r0
            if (r0 == 0) goto L_0x0308
            java.lang.String r0 = r0.getIssuedDate()
            goto L_0x0309
        L_0x0308:
            r0 = r1
        L_0x0309:
            java.util.Calendar r0 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r0, r4)
            java.lang.String r4 = "parseDate(viewModell?.cr…issuedDate, \"yyyy-MM-dd\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r7.calendarIssuedDate = r0
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data10
            com.google.android.material.textfield.TextInputEditText r0 = r0.value
            java.util.Calendar r4 = r7.calendarIssuedDate
            java.util.Date r4 = r4.getTime()
            java.lang.String r4 = p035ru.unicorn.ujin.util.DateUtils.formatDate((java.util.Date) r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
        L_0x032d:
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data8
            java.lang.String r4 = "viewDataBinding.data8"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r0.setIsRequired(r4)
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data8
            android.content.res.Resources r4 = r7.getResources()
            r5 = 2131887882(0x7f12070a, float:1.9410384E38)
            java.lang.String r4 = r4.getString(r5)
            r0.setTitle(r4)
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data10
            java.lang.String r4 = "viewDataBinding.data10"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r0.setIsRequired(r4)
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data10
            android.content.res.Resources r4 = r7.getResources()
            r5 = 2131887141(0x7f120425, float:1.940888E38)
            java.lang.String r4 = r4.getString(r5)
            r0.setTitle(r4)
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x0394
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = r0.getCreateAnotherPassBody()
            if (r0 == 0) goto L_0x0394
            java.util.ArrayList r0 = r0.getVehicles()
            goto L_0x0395
        L_0x0394:
            r0 = r1
        L_0x0395:
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x03a2
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03a0
            goto L_0x03a2
        L_0x03a0:
            r0 = 0
            goto L_0x03a3
        L_0x03a2:
            r0 = 1
        L_0x03a3:
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x0472
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyVehicleObservable()
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData) r0
            if (r0 == 0) goto L_0x03dc
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r5 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r5 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r5
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r5 = r5.getCreateAnotherPassBody()
            java.util.ArrayList r5 = r5.getVehicles()
            if (r5 == 0) goto L_0x03d8
            java.lang.Object r5 = r5.get(r3)
            ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData r5 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData) r5
            if (r5 == 0) goto L_0x03d8
            java.lang.String r5 = r5.getBrand()
            if (r5 == 0) goto L_0x03d8
            goto L_0x03d9
        L_0x03d8:
            r5 = r4
        L_0x03d9:
            r0.setBrand(r5)
        L_0x03dc:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyVehicleObservable()
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData) r0
            if (r0 == 0) goto L_0x0411
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r5 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r5 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r5
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r5 = r5.getCreateAnotherPassBody()
            java.util.ArrayList r5 = r5.getVehicles()
            if (r5 == 0) goto L_0x040d
            java.lang.Object r5 = r5.get(r3)
            ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData r5 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData) r5
            if (r5 == 0) goto L_0x040d
            java.lang.String r5 = r5.getNumber()
            if (r5 == 0) goto L_0x040d
            goto L_0x040e
        L_0x040d:
            r5 = r4
        L_0x040e:
            r0.setNumber(r5)
        L_0x0411:
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r0.data18
            com.google.android.material.textfield.TextInputEditText r0 = r0.value
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r5 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r5 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r5
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r5 = r5.getCreateAnotherPassBody()
            java.util.ArrayList r5 = r5.getVehicles()
            if (r5 == 0) goto L_0x043a
            java.lang.Object r5 = r5.get(r3)
            ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData r5 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData) r5
            if (r5 == 0) goto L_0x043a
            java.lang.String r5 = r5.getBrand()
            if (r5 == 0) goto L_0x043a
            goto L_0x043b
        L_0x043a:
            r5 = r4
        L_0x043b:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.setText(r5)
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassDataWithHintBinding r0 = r0.data19
            com.google.android.material.textfield.TextInputEditText r0 = r0.value
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r5 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r5 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r5
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r5 = r5.getCreateAnotherPassBody()
            java.util.ArrayList r5 = r5.getVehicles()
            if (r5 == 0) goto L_0x0469
            java.lang.Object r5 = r5.get(r3)
            ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData r5 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData) r5
            if (r5 == 0) goto L_0x0469
            java.lang.String r5 = r5.getNumber()
            if (r5 == 0) goto L_0x0469
            goto L_0x046a
        L_0x0469:
            r5 = r4
        L_0x046a:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.setText(r5)
            r7.checkAndShowAuto()
        L_0x0472:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x0484
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = r0.getCreateAnotherPassBody()
            if (r0 == 0) goto L_0x0484
            java.util.ArrayList r1 = r0.getIdentityDocuments()
        L_0x0484:
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0490
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x048f
            goto L_0x0490
        L_0x048f:
            r2 = 0
        L_0x0490:
            if (r2 != 0) goto L_0x0560
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyDocumentObservable()
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r0
            if (r0 == 0) goto L_0x04c7
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r1 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r1 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r1
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r1 = r1.getCreateAnotherPassBody()
            java.util.ArrayList r1 = r1.getIdentityDocuments()
            if (r1 == 0) goto L_0x04c3
            java.lang.Object r1 = r1.get(r3)
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r1 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r1
            if (r1 == 0) goto L_0x04c3
            java.lang.String r1 = r1.getType()
            if (r1 == 0) goto L_0x04c3
            goto L_0x04c4
        L_0x04c3:
            r1 = r4
        L_0x04c4:
            r0.setType(r1)
        L_0x04c7:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyDocumentObservable()
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r0
            if (r0 == 0) goto L_0x04fc
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r1 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r1 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r1
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r1 = r1.getCreateAnotherPassBody()
            java.util.ArrayList r1 = r1.getIdentityDocuments()
            if (r1 == 0) goto L_0x04f8
            java.lang.Object r1 = r1.get(r3)
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r1 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r1
            if (r1 == 0) goto L_0x04f8
            java.lang.String r1 = r1.getNumber()
            if (r1 == 0) goto L_0x04f8
            goto L_0x04f9
        L_0x04f8:
            r1 = r4
        L_0x04f9:
            r0.setNumber(r1)
        L_0x04fc:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyDocumentObservable()
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r0
            if (r0 == 0) goto L_0x0531
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r1 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r1 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r1
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r1 = r1.getCreateAnotherPassBody()
            java.util.ArrayList r1 = r1.getIdentityDocuments()
            if (r1 == 0) goto L_0x052d
            java.lang.Object r1 = r1.get(r3)
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r1 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r1
            if (r1 == 0) goto L_0x052d
            java.lang.String r1 = r1.getIssuedDate()
            if (r1 == 0) goto L_0x052d
            goto L_0x052e
        L_0x052d:
            r1 = r4
        L_0x052e:
            r0.setIssuedDate(r1)
        L_0x0531:
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r0.data9
            com.google.android.material.textfield.TextInputEditText r0 = r0.value
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r1 = r7.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r1 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r1
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r1 = r1.getCreateAnotherPassBody()
            java.util.ArrayList r1 = r1.getIdentityDocuments()
            if (r1 == 0) goto L_0x055a
            java.lang.Object r1 = r1.get(r3)
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r1 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r1
            if (r1 == 0) goto L_0x055a
            java.lang.String r1 = r1.getNumber()
            if (r1 == 0) goto L_0x055a
            goto L_0x055b
        L_0x055a:
            r1 = r4
        L_0x055b:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0560:
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r0.data1
            com.google.android.material.textfield.TextInputEditText r0 = r0.value
            r0.requestFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment.initDefaultData():void");
    }

    private final void checkAndShowAuto() {
        View currentFocus;
        FragmentActivity activity = getActivity();
        if (!(activity == null || (currentFocus = activity.getCurrentFocus()) == null)) {
            currentFocus.clearFocus();
        }
        VehicleData vehicleData = ((AnotherPassViewModel) getViewModell()).getCreateAnotherPassBodyVehicleObservable().get();
        String str = null;
        CharSequence brand = vehicleData != null ? vehicleData.getBrand() : null;
        boolean z = true;
        if (brand == null || StringsKt.isBlank(brand)) {
            VehicleData vehicleData2 = ((AnotherPassViewModel) getViewModell()).getCreateAnotherPassBodyVehicleObservable().get();
            CharSequence number = vehicleData2 != null ? vehicleData2.getNumber() : null;
            if (number == null || StringsKt.isBlank(number)) {
                return;
            }
        }
        DynamicBackgroundButton dynamicBackgroundButton = ((FragmentAnotherPassBinding) getViewDataBinding()).auto;
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "viewDataBinding.auto");
        dynamicBackgroundButton.setVisibility(8);
        View _$_findCachedViewById = _$_findCachedViewById(C5619R.C5622id.data18);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "data18");
        _$_findCachedViewById.setVisibility(0);
        View _$_findCachedViewById2 = _$_findCachedViewById(C5619R.C5622id.data19);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "data19");
        _$_findCachedViewById2.setVisibility(0);
        CheckBox checkBox = (CheckBox) _$_findCachedViewById(C5619R.C5622id.checkboxDifferentVehicleType);
        Intrinsics.checkNotNullExpressionValue(checkBox, "checkboxDifferentVehicleType");
        checkBox.setVisibility(0);
        LinearLayout linearLayout = ((FragmentAnotherPassBinding) getViewDataBinding()).title8.parent;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "viewDataBinding.title8.parent");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = ((FragmentAnotherPassBinding) getViewDataBinding()).title9.parent;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "viewDataBinding.title9.parent");
        linearLayout2.setVisibility(0);
        ConstraintLayout constraintLayout = ((FragmentAnotherPassBinding) getViewDataBinding()).title10.parent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "viewDataBinding.title10.parent");
        constraintLayout.setVisibility(0);
        LinearLayout linearLayout3 = ((FragmentAnotherPassBinding) getViewDataBinding()).llZoneSlots;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "viewDataBinding.llZoneSlots");
        linearLayout3.setVisibility(0);
        ((FragmentAnotherPassBinding) getViewDataBinding()).data18.value.requestFocus();
        LinearLayout linearLayout4 = ((FragmentAnotherPassBinding) getViewDataBinding()).llAdditional;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "viewDataBinding.llAdditional");
        if (linearLayout4.getChildCount() == 0) {
            View _$_findCachedViewById3 = _$_findCachedViewById(C5619R.C5622id.title6);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "title6");
            _$_findCachedViewById3.setVisibility(8);
        }
        AnotherPassViewModel anotherPassViewModel = (AnotherPassViewModel) getViewModell();
        if (anotherPassViewModel != null) {
            anotherPassViewModel.setAutoShowing(true);
        }
        TextInputEditText textInputEditText = ((FragmentAnotherPassBinding) getViewDataBinding()).data11.value;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "viewDataBinding.data11.value");
        Editable text = textInputEditText.getText();
        CharSequence obj = text != null ? text.toString() : null;
        if (!(obj == null || StringsKt.isBlank(obj))) {
            TextInputEditText textInputEditText2 = ((FragmentAnotherPassBinding) getViewDataBinding()).data12.value;
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "viewDataBinding.data12.value");
            Editable text2 = textInputEditText2.getText();
            if (text2 != null) {
                str = text2.toString();
            }
            CharSequence charSequence = str;
            if (charSequence != null && !StringsKt.isBlank(charSequence)) {
                z = false;
            }
            if (!z) {
                checkDatesAndLoadZoneList();
                return;
            }
        }
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoPlaces);
        textView.setVisibility(0);
        textView.setText(getString(R.string.label_no_parking_places));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = (r0 = r0.getCreateAnotherPassBodyObservable()).get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkDatesAndLoadZoneList() {
        /*
            r10 = this;
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r10.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isAutoShowing()
            if (r0 == 0) goto L_0x003e
        L_0x000e:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r10.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            r1 = 0
            if (r0 == 0) goto L_0x002a
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r0.getStrategy()
            goto L_0x002b
        L_0x002a:
            r0 = r1
        L_0x002b:
            android.content.res.Resources r2 = r10.getResources()
            r3 = 2131886208(0x7f120080, float:1.9406988E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 2
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.equals$default(r0, r2, r4, r3, r1)
            if (r0 == 0) goto L_0x003f
        L_0x003e:
            return
        L_0x003f:
            androidx.databinding.ViewDataBinding r0 = r10.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data11
            com.google.android.material.textfield.TextInputEditText r0 = r0.value
            java.lang.String r2 = "viewDataBinding.data11.value"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r0.toString()
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2 = 1
            if (r0 == 0) goto L_0x0068
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r0 = 0
            goto L_0x0069
        L_0x0068:
            r0 = 1
        L_0x0069:
            if (r0 != 0) goto L_0x011c
            androidx.databinding.ViewDataBinding r0 = r10.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r0.data12
            com.google.android.material.textfield.TextInputEditText r0 = r0.value
            java.lang.String r3 = "viewDataBinding.data12.value"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r0.toString()
            goto L_0x0086
        L_0x0085:
            r0 = r1
        L_0x0086:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0092
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r2 = 0
        L_0x0092:
            if (r2 == 0) goto L_0x0096
            goto L_0x011c
        L_0x0096:
            int r0 = p035ru.unicorn.C5619R.C5622id.pbLoading
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            java.lang.String r2 = "pbLoading"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r0.setVisibility(r4)
            ru.unicorn.ujin.view.fragments.parking.ParkingViewModel r0 = r10.getParkingViewModel()
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r0 = r0.getEmployeeSlotsMutableLiveData()
            androidx.lifecycle.LifecycleOwner r2 = r10.getViewLifecycleOwner()
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$checkDatesAndLoadZoneList$1 r3 = new ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$checkDatesAndLoadZoneList$1
            r3.<init>(r10)
            androidx.lifecycle.Observer r3 = (androidx.lifecycle.Observer) r3
            r0.observe(r2, r3)
            ru.unicorn.ujin.view.fragments.parking.ParkingViewModel r4 = r10.getParkingViewModel()
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r10.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = r0.getEnterpriseId()
            goto L_0x00d8
        L_0x00d7:
            r0 = r1
        L_0x00d8:
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.util.Calendar r6 = r10.calendarDateFrom
            java.util.Calendar r7 = r10.calendarDateTo
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r10.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x00fc
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = r0.getTimeFrom()
            r8 = r0
            goto L_0x00fd
        L_0x00fc:
            r8 = r1
        L_0x00fd:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r10.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            if (r0 == 0) goto L_0x0117
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            if (r0 == 0) goto L_0x0117
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x0117
            java.lang.String r1 = r0.getTimeTo()
        L_0x0117:
            r9 = r1
            r4.getFreeSlots(r5, r6, r7, r8, r9)
            goto L_0x0135
        L_0x011c:
            androidx.databinding.ViewDataBinding r0 = r10.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            android.widget.TextView r0 = r0.tvNoPlaces
            java.lang.String r1 = "viewDataBinding.tvNoPlaces"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 2131887110(0x7f120406, float:1.9408818E38)
            java.lang.String r1 = r10.getString(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment.checkDatesAndLoadZoneList():void");
    }

    /* access modifiers changed from: private */
    public final void handleEmployeeSlots(EmployeeSlotsEvent employeeSlotsEvent) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(8);
        if (employeeSlotsEvent.getSuccess()) {
            ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots)).removeAllViews();
            ArrayList<EmployeeSlot> slotList = employeeSlotsEvent.getSlotList();
            if (slotList == null) {
                return;
            }
            if (slotList.size() > 0) {
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoPlaces);
                Intrinsics.checkNotNullExpressionValue(textView, "tvNoPlaces");
                textView.setVisibility(8);
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots);
                LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "llZoneSlots");
                View inflate = LayoutInflater.from(linearLayout2.getContext()).inflate(R.layout.item_zone_slots, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llZoneSlots), false);
                Intrinsics.checkNotNullExpressionValue(inflate, "this");
                TextView textView2 = (TextView) inflate.findViewById(C5619R.C5622id.tvZoneName);
                Intrinsics.checkNotNullExpressionValue(textView2, "this.tvZoneName");
                textView2.setVisibility(8);
                ArrayList arrayList = new ArrayList();
                Iterator<EmployeeSlot> it = slotList.iterator();
                while (it.hasNext()) {
                    EmployeeSlot next = it.next();
                    arrayList.add(new Zone(Integer.valueOf(next.getId()), next.getNumber(), (FileData) null, (FileData) null));
                }
                ((RecyclerView) inflate.findViewById(C5619R.C5622id.rvZoneSlots)).setAdapter(new ZoneSlotsAdapter(arrayList, new AnotherPassNewFragment$handleEmployeeSlots$$inlined$let$lambda$1(arrayList, slotList, this)));
                Unit unit = Unit.INSTANCE;
                linearLayout.addView(inflate);
                return;
            }
            TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoPlaces);
            textView3.setVisibility(0);
            textView3.setText(getString(R.string.label_no_parking_places_by_date));
            return;
        }
        TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoPlaces);
        textView4.setVisibility(0);
        textView4.setText(getString(R.string.label_no_parking_places_by_date));
        showMessage(employeeSlotsEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public final void handleSlotClick(Zone zone, Zone zone2) {
        ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable;
        CreateAnotherPassRequestBody createAnotherPassRequestBody;
        AnotherPassViewModel anotherPassViewModel = (AnotherPassViewModel) getViewModell();
        if (anotherPassViewModel != null && (createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable()) != null && (createAnotherPassRequestBody = createAnotherPassBodyObservable.get()) != null) {
            createAnotherPassRequestBody.setSlotId(String.valueOf(zone.getId()));
        }
    }

    /* access modifiers changed from: private */
    public final void handlePassCreate(Resource<AnotherPassResponse> resource) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(8);
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.save);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, LocationService.SAVE_PLACE);
        dynamicBackgroundButton.setEnabled(false);
        Resource.Status status = resource.getStatus();
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                showMessage(resource.getMessage());
                DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.save);
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, LocationService.SAVE_PLACE);
                dynamicBackgroundButton2.setEnabled(true);
            } else if (i == 2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(BaseAnotherPassFragment.FRAGMENT_ANOTHER_PASS_NEW);
                nextFragmentWithoutStack(AnotherPassDetailFragment.Companion.newInstance(resource.getData().getPass(), true), false, arrayList, BaseActivity.FRAGMENT_ANOTHER_PASS_DETAIL);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e1, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) "-1") == false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0201, code lost:
        if ((r6 == null || kotlin.text.StringsKt.isBlank(r6)) != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0203, code lost:
        r0 = ((p035ru.unicorn.databinding.FragmentAnotherPassBinding) getViewDataBinding()).company.titleTextView;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "viewDataBinding.company.titleTextView");
        r0.setError("Выберите компанию");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0219, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean valid() {
        /*
            r10 = this;
            androidx.databinding.ViewDataBinding r0 = r10.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r0.data1
            java.lang.String r1 = "viewDataBinding.data1"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.databinding.ViewDataBinding r1 = r10.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r1 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r1
            ru.unicorn.databinding.ItemAnotherPassDataBinding r1 = r1.data2
            java.lang.String r2 = "viewDataBinding.data2"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.databinding.ViewDataBinding r2 = r10.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r2 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r2
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r2.data11
            java.lang.String r3 = "viewDataBinding.data11"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            androidx.databinding.ViewDataBinding r3 = r10.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r3 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r3
            ru.unicorn.databinding.ItemAnotherPassData2Binding r3 = r3.data12
            java.lang.String r4 = "viewDataBinding.data12"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            androidx.databinding.ViewDataBinding r4 = r10.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r4 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r4
            ru.unicorn.databinding.ItemAnotherPassData2Binding r4 = r4.data13
            java.lang.String r5 = "viewDataBinding.data13"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            androidx.databinding.ViewDataBinding r5 = r10.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r5 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r5
            ru.unicorn.databinding.ItemAnotherPassData2Binding r5 = r5.data14
            java.lang.String r6 = "viewDataBinding.data14"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            androidx.databinding.ViewDataBinding r6 = r10.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r6 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r6
            ru.unicorn.databinding.ItemFieldSpinnerBinding r6 = r6.company
            java.lang.String r7 = "viewDataBinding.company"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.String r6 = r6.getValue()
            androidx.databinding.ViewDataBinding r7 = r10.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r7 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r7
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r7 = r7.auto
            java.lang.String r8 = "viewDataBinding.auto"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            com.google.android.material.textfield.TextInputEditText r7 = r0.value
            java.lang.String r8 = "fio.value"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            android.text.Editable r7 = r7.getText()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x008a
            boolean r7 = kotlin.text.StringsKt.isBlank(r7)
            if (r7 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r7 = 0
            goto L_0x008b
        L_0x008a:
            r7 = 1
        L_0x008b:
            if (r7 == 0) goto L_0x00a1
            com.google.android.material.textfield.TextInputEditText r1 = r0.value
            r1.requestFocus()
            com.google.android.material.textfield.TextInputLayout r0 = r0.title
            java.lang.String r1 = "fio.title"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Фамилия обязательное поле для заполнения"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setError(r1)
            return r9
        L_0x00a1:
            com.google.android.material.textfield.TextInputEditText r0 = r1.value
            java.lang.String r7 = "name.value"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x00bd
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r0 = 0
            goto L_0x00be
        L_0x00bd:
            r0 = 1
        L_0x00be:
            if (r0 == 0) goto L_0x00d4
            com.google.android.material.textfield.TextInputEditText r0 = r1.value
            r0.requestFocus()
            com.google.android.material.textfield.TextInputLayout r0 = r1.title
            java.lang.String r1 = "name.title"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Имя обязательное поле для заполнения"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setError(r1)
            return r9
        L_0x00d4:
            com.google.android.material.textfield.TextInputEditText r0 = r2.value
            java.lang.String r1 = "startDate.value"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x00f0
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x00ee
            goto L_0x00f0
        L_0x00ee:
            r0 = 0
            goto L_0x00f1
        L_0x00f0:
            r0 = 1
        L_0x00f1:
            if (r0 == 0) goto L_0x0102
            com.google.android.material.textfield.TextInputLayout r0 = r2.title
            java.lang.String r1 = "startDate.title"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Дата начала обязательное поле для заполнения"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setError(r1)
            return r9
        L_0x0102:
            com.google.android.material.textfield.TextInputEditText r0 = r3.value
            java.lang.String r1 = "finishDate.value"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x011e
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r0 = 0
            goto L_0x011f
        L_0x011e:
            r0 = 1
        L_0x011f:
            if (r0 == 0) goto L_0x0130
            com.google.android.material.textfield.TextInputLayout r0 = r3.title
            java.lang.String r1 = "finishDate.title"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Дата окончания обязательное поле для заполнения"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setError(r1)
            return r9
        L_0x0130:
            com.google.android.material.textfield.TextInputEditText r0 = r4.value
            java.lang.String r1 = "startTime.value"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x014c
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r0 = 0
            goto L_0x014d
        L_0x014c:
            r0 = 1
        L_0x014d:
            if (r0 == 0) goto L_0x015e
            com.google.android.material.textfield.TextInputLayout r0 = r4.title
            java.lang.String r1 = "startTime.title"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Время начала обязательное поле для заполнения"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setError(r1)
            return r9
        L_0x015e:
            com.google.android.material.textfield.TextInputEditText r0 = r5.value
            java.lang.String r2 = "finishTime.value"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x017a
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0178
            goto L_0x017a
        L_0x0178:
            r0 = 0
            goto L_0x017b
        L_0x017a:
            r0 = 1
        L_0x017b:
            java.lang.String r3 = "finishTime.title"
            if (r0 == 0) goto L_0x018c
            com.google.android.material.textfield.TextInputLayout r0 = r5.title
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.String r1 = "Время окончания обязательное поле для заполнения"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setError(r1)
            return r9
        L_0x018c:
            com.google.android.material.textfield.TextInputEditText r0 = r5.value
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.google.android.material.textfield.TextInputEditText r2 = r4.value
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            android.text.Editable r1 = r2.getText()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L_0x01b9
            com.google.android.material.textfield.TextInputLayout r0 = r5.title
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.String r1 = "Время окончания должно быть больше даты начала"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setError(r1)
            return r9
        L_0x01b9:
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion r0 = p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r0 = r0.getInstance()
            ru.unicorn.ujin.data.realm.profile.User r0 = r0.getUser()
            boolean r0 = r0.isCurrentCommerce()
            if (r0 != 0) goto L_0x01e3
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r10.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = r0.getCreateAnotherPassBody()
            java.lang.String r0 = r0.getEnterpriseId()
            java.lang.String r1 = "-1"
            if (r0 == 0) goto L_0x01dc
            goto L_0x01dd
        L_0x01dc:
            r0 = r1
        L_0x01dd:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 != 0) goto L_0x0203
        L_0x01e3:
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion r0 = p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r0 = r0.getInstance()
            ru.unicorn.ujin.data.realm.profile.User r0 = r0.getUser()
            boolean r0 = r0.isCurrentCommerce()
            if (r0 == 0) goto L_0x021a
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x0200
            boolean r0 = kotlin.text.StringsKt.isBlank(r6)
            if (r0 == 0) goto L_0x01fe
            goto L_0x0200
        L_0x01fe:
            r0 = 0
            goto L_0x0201
        L_0x0200:
            r0 = 1
        L_0x0201:
            if (r0 == 0) goto L_0x021a
        L_0x0203:
            androidx.databinding.ViewDataBinding r0 = r10.getViewDataBinding()
            ru.unicorn.databinding.FragmentAnotherPassBinding r0 = (p035ru.unicorn.databinding.FragmentAnotherPassBinding) r0
            ru.unicorn.databinding.ItemFieldSpinnerBinding r0 = r0.company
            android.widget.TextView r0 = r0.titleTextView
            java.lang.String r1 = "viewDataBinding.company.titleTextView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Выберите компанию"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setError(r1)
            return r9
        L_0x021a:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r10.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x02b1
            java.lang.String r0 = r0.getStrategy()
            if (r0 == 0) goto L_0x02a9
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "onetime"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x02b1
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r10.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            boolean r0 = r0.isAutoShowing()
            if (r0 == 0) goto L_0x02b1
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r10.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyVehicleObservable()
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData) r0
            if (r0 == 0) goto L_0x02b1
            java.lang.String r0 = r0.getNumber()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0272
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0270
            goto L_0x0272
        L_0x0270:
            r0 = 0
            goto L_0x0273
        L_0x0272:
            r0 = 1
        L_0x0273:
            if (r0 == 0) goto L_0x027b
            java.lang.String r0 = "Укажите госномер автомобиля"
            r10.showMessage((java.lang.String) r0)
            return r9
        L_0x027b:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r10.getViewModell()
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel) r0
            androidx.databinding.ObservableField r0 = r0.getCreateAnotherPassBodyObservable()
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x0292
            java.lang.String r0 = r0.getSlotId()
            goto L_0x0293
        L_0x0292:
            r0 = 0
        L_0x0293:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x02a0
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x029e
            goto L_0x02a0
        L_0x029e:
            r0 = 0
            goto L_0x02a1
        L_0x02a0:
            r0 = 1
        L_0x02a1:
            if (r0 == 0) goto L_0x02b1
            java.lang.String r0 = "Выберите парковочное место"
            r10.showMessage((java.lang.String) r0)
            return r9
        L_0x02a9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x02b1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment.valid():boolean");
    }

    private final void showContactList() {
        ((AnotherPassViewModel) getViewModell()).saveData();
        ((FragmentAnotherPassBinding) getViewDataBinding()).data19.value.setText("");
        ((AnotherPassViewModel) getViewModell()).setCheckSaveData(true);
        nextFragment(new ContactListFragment(), false, BaseAnotherPassFragment.FRAGMENT_ANOTHER_PASS_CONTACT_LIST);
    }

    /* access modifiers changed from: private */
    public final void askForContactPermission() {
        if (Build.VERSION.SDK_INT < 23) {
            showContactList();
        } else if (ContextCompat.checkSelfPermission(getBaseActivity(), "android.permission.READ_CONTACTS") == 0) {
            showContactList();
        } else if (ActivityCompat.shouldShowRequestPermissionRationale(getBaseActivity(), "android.permission.READ_CONTACTS")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getBaseActivity());
            builder.setTitle((CharSequence) getResources().getString(R.string.anotherPassDataContactsTitle)).setMessage((CharSequence) getResources().getString(R.string.anotherPassDataContactsMessage)).setPositiveButton((CharSequence) getResources().getString(R.string.anotherPassDataContactsAllow), (DialogInterface.OnClickListener) new AnotherPassNewFragment$askForContactPermission$1(this)).setNegativeButton((CharSequence) getResources().getString(R.string.anotherPassDataContactsDeny), (DialogInterface.OnClickListener) AnotherPassNewFragment$askForContactPermission$2.INSTANCE);
            AlertDialog create = builder.create();
            Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
            create.show();
        } else {
            ActivityCompat.requestPermissions(getBaseActivity(), new String[]{"android.permission.READ_CONTACTS"}, 20);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        if (i == 20) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                getBaseActivity().showMessage(getResources().getString(R.string.anotherPassDataContactsDenied));
            } else {
                showContactList();
            }
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/new_iteration/AnotherPassNewFragment$Companion;", "", "()V", "PERMISSION_REQUEST_CONTACT", "", "newInstance", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/new_iteration/AnotherPassNewFragment;", "clearData", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragment$Companion */
    /* compiled from: AnotherPassNewFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final AnotherPassNewFragment newInstance(boolean z) {
            AnotherPassNewFragment anotherPassNewFragment = new AnotherPassNewFragment();
            anotherPassNewFragment.setClearData(z);
            return anotherPassNewFragment;
        }
    }
}
