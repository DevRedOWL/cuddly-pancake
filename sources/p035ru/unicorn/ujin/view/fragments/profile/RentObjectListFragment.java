package p035ru.unicorn.ujin.view.fragments.profile;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.profile.RentObjectListResponse;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.data.realm.MetaData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.RentObject;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.util.TextUtils;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkinkRentaObject;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;
import p035ru.unicorn.ujin.view.fragments.profile.adapters.MyRentObjectListAdapter;
import p035ru.unicorn.ujin.view.fragments.profile.adapters.RentObjectListAdapter;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 42\u00020\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0010\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010!H\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u0007H\u0014J\u001a\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0018\u0010*\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010!H\u0002J\u0016\u0010,\u001a\u00020\u001f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\u0010\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020/H\u0002J\u0010\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u00065"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/RentObjectListFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "currentPage", "", "decMonths", "", "", "[Ljava/lang/String;", "endDateCal", "Ljava/util/Calendar;", "isLoaded", "", "lastPage", "mode", "monthText", "monthValue", "myRentObjectListAdapter", "Lru/unicorn/ujin/view/fragments/profile/adapters/MyRentObjectListAdapter;", "rentEndDate", "rentObjectListAdapter", "Lru/unicorn/ujin/view/fragments/profile/adapters/RentObjectListAdapter;", "rentStartDate", "rentaViewModel", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/MyRentaViewModel;", "selectedObject", "Lru/unicorn/ujin/data/realm/profile/RentObject;", "startDate", "startDateCal", "getLayoutRes", "handleCreateRent", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/myrentatype/talkingroom/TalkinkRentaObject;", "loadRentObjectList", "metricsScreenName", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showData", "Lru/unicorn/ujin/data/api/response/profile/RentObjectListResponse;", "showMyData", "data", "", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentInfo;", "showMyObjectRentedMessage", "rentObject", "showRentObjectConfirmation", "propertyId", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.RentObjectListFragment */
/* compiled from: RentObjectListFragment.kt */
public final class RentObjectListFragment extends BaseTitleFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String MODE_ALL = "all";
    public static final String MODE_MY = "my";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public int currentPage = 1;
    private final String[] decMonths = {"месяц", "месяца", "месяцев"};
    /* access modifiers changed from: private */
    public Calendar endDateCal;
    /* access modifiers changed from: private */
    public boolean isLoaded;
    /* access modifiers changed from: private */
    public int lastPage = 1;
    /* access modifiers changed from: private */
    public String mode = "all";
    private String monthText = "";
    /* access modifiers changed from: private */
    public int monthValue;
    /* access modifiers changed from: private */
    public MyRentObjectListAdapter myRentObjectListAdapter;
    /* access modifiers changed from: private */
    public String rentEndDate;
    /* access modifiers changed from: private */
    public RentObjectListAdapter rentObjectListAdapter;
    /* access modifiers changed from: private */
    public String rentStartDate;
    /* access modifiers changed from: private */
    public MyRentaViewModel rentaViewModel;
    /* access modifiers changed from: private */
    public RentObject selectedObject;
    /* access modifiers changed from: private */
    public String startDate;
    /* access modifiers changed from: private */
    public Calendar startDateCal;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.RentObjectListFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.LOADING.ordinal()] = 3;
        }
    }

    @JvmStatic
    public static final RentObjectListFragment newInstance() {
        return Companion.newInstance();
    }

    @JvmStatic
    public static final RentObjectListFragment newInstance(String str, int i) {
        return Companion.newInstance(str, i);
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

    public int getLayoutRes() {
        return R.layout.fragment_object_rent_list;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Профиль. Список объектов аренды";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ Calendar access$getEndDateCal$p(RentObjectListFragment rentObjectListFragment) {
        Calendar calendar = rentObjectListFragment.endDateCal;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endDateCal");
        }
        return calendar;
    }

    public static final /* synthetic */ MyRentObjectListAdapter access$getMyRentObjectListAdapter$p(RentObjectListFragment rentObjectListFragment) {
        MyRentObjectListAdapter myRentObjectListAdapter2 = rentObjectListFragment.myRentObjectListAdapter;
        if (myRentObjectListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myRentObjectListAdapter");
        }
        return myRentObjectListAdapter2;
    }

    public static final /* synthetic */ String access$getRentEndDate$p(RentObjectListFragment rentObjectListFragment) {
        String str = rentObjectListFragment.rentEndDate;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rentEndDate");
        }
        return str;
    }

    public static final /* synthetic */ RentObjectListAdapter access$getRentObjectListAdapter$p(RentObjectListFragment rentObjectListFragment) {
        RentObjectListAdapter rentObjectListAdapter2 = rentObjectListFragment.rentObjectListAdapter;
        if (rentObjectListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rentObjectListAdapter");
        }
        return rentObjectListAdapter2;
    }

    public static final /* synthetic */ String access$getRentStartDate$p(RentObjectListFragment rentObjectListFragment) {
        String str = rentObjectListFragment.rentStartDate;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rentStartDate");
        }
        return str;
    }

    public static final /* synthetic */ MyRentaViewModel access$getRentaViewModel$p(RentObjectListFragment rentObjectListFragment) {
        MyRentaViewModel myRentaViewModel = rentObjectListFragment.rentaViewModel;
        if (myRentaViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rentaViewModel");
        }
        return myRentaViewModel;
    }

    public static final /* synthetic */ String access$getStartDate$p(RentObjectListFragment rentObjectListFragment) {
        String str = rentObjectListFragment.startDate;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startDate");
        }
        return str;
    }

    public static final /* synthetic */ Calendar access$getStartDateCal$p(RentObjectListFragment rentObjectListFragment) {
        Calendar calendar = rentObjectListFragment.startDateCal;
        if (calendar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startDateCal");
        }
        return calendar;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        String string = getResources().getString(R.string.rent_objects);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.rent_objects)");
        setTitle(string);
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…ntaViewModel::class.java]");
        this.rentaViewModel = (MyRentaViewModel) viewModel;
        this.currentPage = 1;
        this.lastPage = 1;
        String str = this.mode;
        if (str.hashCode() == 96673 && str.equals("all")) {
            this.monthText = String.valueOf(this.monthValue) + " " + TextUtils.decOfNumber(this.monthValue, this.decMonths);
            String str2 = this.startDate;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startDate");
            }
            Calendar parseDate = DateUtils.parseDate(str2, DatePickerViewHolder.DATE_FORMAT);
            Intrinsics.checkNotNullExpressionValue(parseDate, "parseDate(startDate, DATE_FORMAT)");
            this.startDateCal = parseDate;
            Calendar calendar = this.startDateCal;
            if (calendar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startDateCal");
            }
            calendar.set(11, 0);
            Calendar calendar2 = this.startDateCal;
            if (calendar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startDateCal");
            }
            calendar2.set(12, 0);
            Calendar calendar3 = this.startDateCal;
            if (calendar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startDateCal");
            }
            calendar3.set(13, 0);
            String str3 = this.startDate;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startDate");
            }
            Calendar parseDate2 = DateUtils.parseDate(str3, DatePickerViewHolder.DATE_FORMAT);
            Intrinsics.checkNotNullExpressionValue(parseDate2, "parseDate(startDate, DATE_FORMAT)");
            this.endDateCal = parseDate2;
            Calendar calendar4 = this.endDateCal;
            if (calendar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endDateCal");
            }
            calendar4.add(2, this.monthValue);
            Calendar calendar5 = this.endDateCal;
            if (calendar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endDateCal");
            }
            calendar5.set(11, 23);
            Calendar calendar6 = this.endDateCal;
            if (calendar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endDateCal");
            }
            calendar6.set(12, 59);
            Calendar calendar7 = this.endDateCal;
            if (calendar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endDateCal");
            }
            calendar7.set(13, 59);
            SimpleDateFormat simpleDateFormat = DateUtils.YYYY_MM_DD_HH_MM;
            Calendar calendar8 = this.startDateCal;
            if (calendar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startDateCal");
            }
            String format = simpleDateFormat.format(calendar8.getTime());
            Intrinsics.checkNotNullExpressionValue(format, "YYYY_MM_DD_HH_MM.format(startDateCal.time)");
            this.rentStartDate = format;
            SimpleDateFormat simpleDateFormat2 = DateUtils.YYYY_MM_DD_HH_MM;
            Calendar calendar9 = this.endDateCal;
            if (calendar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endDateCal");
            }
            String format2 = simpleDateFormat2.format(calendar9.getTime());
            Intrinsics.checkNotNullExpressionValue(format2, "YYYY_MM_DD_HH_MM.format(endDateCal.time)");
            this.rentEndDate = format2;
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoRentObjects);
            Intrinsics.checkNotNullExpressionValue(textView, "tvNoRentObjects");
            textView.setText(getResources().getString(R.string.no_rent_objects));
            this.rentObjectListAdapter = new RentObjectListAdapter(new ArrayList(), new RentObjectListFragment$onViewCreated$1(this));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rentObjectListView);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), 1));
            RentObjectListAdapter rentObjectListAdapter2 = this.rentObjectListAdapter;
            if (rentObjectListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rentObjectListAdapter");
            }
            recyclerView.setAdapter(rentObjectListAdapter2);
            ((NestedScrollView) _$_findCachedViewById(C5619R.C5622id.rentObjectsLayout)).setOnScrollChangeListener(new RentObjectListFragment$onViewCreated$3(this));
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            progressBar.setVisibility(0);
            loadRentObjectList();
            getProfileViewModel().getRentObjectListLiveData().observe(getViewLifecycleOwner(), new RentObjectListFragment$onViewCreated$4(this));
        } else {
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnRentObject);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnRentObject");
            dynamicBackgroundButton.setVisibility(8);
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoRentObjects);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvNoRentObjects");
            textView2.setText(getResources().getString(R.string.no_my_rent_objects));
            this.myRentObjectListAdapter = new MyRentObjectListAdapter(new ArrayList(), new RentObjectListFragment$onViewCreated$5(this));
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rentObjectListView);
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
            recyclerView2.addItemDecoration(new DividerItemDecoration(recyclerView2.getContext(), 1));
            MyRentObjectListAdapter myRentObjectListAdapter2 = this.myRentObjectListAdapter;
            if (myRentObjectListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myRentObjectListAdapter");
            }
            recyclerView2.setAdapter(myRentObjectListAdapter2);
            ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
            progressBar2.setVisibility(0);
            MyRentaViewModel myRentaViewModel = this.rentaViewModel;
            if (myRentaViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rentaViewModel");
            }
            myRentaViewModel.getMyRentaUniqe();
            MyRentaViewModel myRentaViewModel2 = this.rentaViewModel;
            if (myRentaViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rentaViewModel");
            }
            myRentaViewModel2.getMyRentLiveData().observe(getViewLifecycleOwner(), new RentObjectListFragment$onViewCreated$7(this));
        }
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnRentObject)).setOnClickListener(new RentObjectListFragment$onViewCreated$8(this));
    }

    /* access modifiers changed from: private */
    public final void showRentObjectConfirmation(int i) {
        String str;
        RentObject rentObject = this.selectedObject;
        if (rentObject == null || (str = rentObject.getRentCost()) == null) {
            str = "0";
        }
        BigDecimal scale = new BigDecimal(str).setScale(2, 4);
        AlertDialog.Builder builder = new AlertDialog.Builder(getBaseActivity());
        Object[] objArr = new Object[4];
        String str2 = this.startDate;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startDate");
        }
        objArr[0] = str2;
        objArr[1] = this.monthText;
        objArr[2] = TextUtils.formatAmount(scale, getContext());
        objArr[3] = TextUtils.formatAmount(scale.multiply(new BigDecimal(this.monthValue)), getContext());
        builder.setMessage((CharSequence) getString(R.string.rent_object_confirmation, objArr)).setPositiveButton((int) R.string.rent_object, (DialogInterface.OnClickListener) new RentObjectListFragment$showRentObjectConfirmation$1(this, i)).setNegativeButton((int) R.string.cancel_label, (DialogInterface.OnClickListener) RentObjectListFragment$showRentObjectConfirmation$2.INSTANCE).show();
    }

    /* access modifiers changed from: private */
    public final void handleCreateRent(Resource<TalkinkRentaObject> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(0);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(8);
                showMessage(getString(R.string.object_rented_success));
                popTo(BaseActivity.FRAGMENT_PROFILE);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                progressBar3.setVisibility(8);
                showMessage(resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void showMyObjectRentedMessage(RentInfo rentInfo) {
        Calendar parseDate = DateUtils.parseDate(rentInfo.realmGet$startDateHuman(), "yyyy-MM-dd HH:mm:ss");
        Calendar parseDate2 = DateUtils.parseDate(rentInfo.realmGet$finishDateHuman(), "yyyy-MM-dd HH:mm:ss");
        PropertyRenta propRenta = rentInfo.getPropRenta();
        Intrinsics.checkNotNullExpressionValue(propRenta, "rentObject.propRenta");
        BigDecimal scale = new BigDecimal(propRenta.getRentCost()).setScale(2, 4);
        int monthsBetweenDates = DateUtils.monthsBetweenDates(parseDate, parseDate2);
        AlertDialog.Builder builder = new AlertDialog.Builder(getBaseActivity());
        PropertyRenta propRenta2 = rentInfo.getPropRenta();
        Intrinsics.checkNotNullExpressionValue(propRenta2, "rentObject.propRenta");
        builder.setTitle((CharSequence) propRenta2.getTitle()).setMessage((CharSequence) getString(R.string.my_object_rented_message, DateUtils.formatDateFromCalendar(parseDate, DatePickerViewHolder.DATE_FORMAT), DateUtils.formatDateFromCalendar(parseDate2, DatePickerViewHolder.DATE_FORMAT), TextUtils.formatAmount(scale.multiply(new BigDecimal(monthsBetweenDates)), getContext()))).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) RentObjectListFragment$showMyObjectRentedMessage$1.INSTANCE).show();
    }

    /* access modifiers changed from: private */
    public final void loadRentObjectList() {
        this.isLoaded = true;
        RentObjectListFragment rentObjectListFragment = this;
        if (rentObjectListFragment.rentStartDate != null && rentObjectListFragment.rentEndDate != null) {
            ProfileViewModel profileViewModel = getProfileViewModel();
            String str = this.rentStartDate;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rentStartDate");
            }
            String str2 = this.rentEndDate;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rentEndDate");
            }
            profileViewModel.getRentObjectList(str, str2, this.currentPage);
        }
    }

    /* access modifiers changed from: private */
    public final void showData(Resource<RentObjectListResponse> resource) {
        Resource.Status status;
        RealmList<RentObject> realmList = null;
        if (resource != null) {
            status = resource.getStatus();
        } else {
            status = null;
        }
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            int i2 = 1;
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(8);
                this.isLoaded = false;
                RentObjectListResponse data = resource.getData();
                if (data != null) {
                    realmList = data.getProperty();
                }
                Collection collection = realmList;
                if (collection == null || collection.isEmpty()) {
                    RentObjectListAdapter rentObjectListAdapter2 = this.rentObjectListAdapter;
                    if (rentObjectListAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rentObjectListAdapter");
                    }
                    if (rentObjectListAdapter2.getItemCount() == 0) {
                        NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.rentObjectsLayout);
                        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "rentObjectsLayout");
                        nestedScrollView.setVisibility(8);
                        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnRentObject);
                        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnRentObject");
                        dynamicBackgroundButton.setVisibility(8);
                        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoRentObjects);
                        Intrinsics.checkNotNullExpressionValue(textView, "tvNoRentObjects");
                        textView.setVisibility(0);
                    }
                } else if (this.currentPage == 1) {
                    MetaData meta = resource.getData().getMeta();
                    if (meta != null) {
                        i2 = meta.getLastPage();
                    }
                    this.lastPage = i2;
                    if (Intrinsics.areEqual((Object) this.mode, (Object) "all")) {
                        DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnRentObject);
                        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "btnRentObject");
                        dynamicBackgroundButton2.setVisibility(0);
                    }
                    NestedScrollView nestedScrollView2 = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.rentObjectsLayout);
                    Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "rentObjectsLayout");
                    nestedScrollView2.setVisibility(0);
                    TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoRentObjects);
                    Intrinsics.checkNotNullExpressionValue(textView2, "tvNoRentObjects");
                    textView2.setVisibility(8);
                    RentObjectListAdapter rentObjectListAdapter3 = this.rentObjectListAdapter;
                    if (rentObjectListAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rentObjectListAdapter");
                    }
                    rentObjectListAdapter3.setItems(CollectionsKt.toMutableList(collection));
                } else {
                    for (RentObject rentObject : CollectionsKt.toMutableList(collection)) {
                        RentObjectListAdapter rentObjectListAdapter4 = this.rentObjectListAdapter;
                        if (rentObjectListAdapter4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("rentObjectListAdapter");
                        }
                        Intrinsics.checkNotNullExpressionValue(rentObject, "item");
                        rentObjectListAdapter4.addItem(rentObject);
                    }
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(8);
                this.isLoaded = false;
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                progressBar3.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void showMyData(List<? extends RentInfo> list) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(8);
        if (list.isEmpty()) {
            NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.rentObjectsLayout);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "rentObjectsLayout");
            nestedScrollView.setVisibility(8);
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoRentObjects);
            Intrinsics.checkNotNullExpressionValue(textView, "tvNoRentObjects");
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoRentObjects);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvNoRentObjects");
        textView2.setVisibility(8);
        NestedScrollView nestedScrollView2 = (NestedScrollView) _$_findCachedViewById(C5619R.C5622id.rentObjectsLayout);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "rentObjectsLayout");
        nestedScrollView2.setVisibility(0);
        MyRentObjectListAdapter myRentObjectListAdapter2 = this.myRentObjectListAdapter;
        if (myRentObjectListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myRentObjectListAdapter");
        }
        myRentObjectListAdapter2.setItems(CollectionsKt.toMutableList(list));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/RentObjectListFragment$Companion;", "", "()V", "MODE_ALL", "", "MODE_MY", "newInstance", "Lru/unicorn/ujin/view/fragments/profile/RentObjectListFragment;", "startDate", "monthValue", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.RentObjectListFragment$Companion */
    /* compiled from: RentObjectListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final RentObjectListFragment newInstance(String str, int i) {
            Intrinsics.checkNotNullParameter(str, "startDate");
            RentObjectListFragment rentObjectListFragment = new RentObjectListFragment();
            rentObjectListFragment.mode = "all";
            rentObjectListFragment.startDate = str;
            rentObjectListFragment.monthValue = i;
            return rentObjectListFragment;
        }

        @JvmStatic
        public final RentObjectListFragment newInstance() {
            RentObjectListFragment rentObjectListFragment = new RentObjectListFragment();
            rentObjectListFragment.mode = RentObjectListFragment.MODE_MY;
            return rentObjectListFragment;
        }
    }
}
