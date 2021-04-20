package p035ru.unicorn.ujin.view.fragments.acceptance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import devs.mulham.horizontalcalendar.HorizontalCalendar;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.AcceptanceDate;
import p035ru.unicorn.ujin.data.realm.ApartmentState;
import p035ru.unicorn.ujin.data.realm.TimeSlot;
import p035ru.unicorn.ujin.view.adapters.TimeSlotsAdapter;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.RealmViewModel;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\fH\u0014J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u000eH\u0014R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/acceptance/AcceptanceDateFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "currentCalendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "timeSlots", "", "Lru/unicorn/ujin/data/realm/TimeSlot;", "timeSlotsAdapter", "Lru/unicorn/ujin/view/adapters/TimeSlotsAdapter;", "userToken", "", "checkAcceptanceState", "", "getTimeSlots", "date", "Ljava/util/Date;", "handleEvent", "updateEvent", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "hideTimeSlotsViews", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showTimeSlots", "visible", "", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.acceptance.AcceptanceDateFragment */
/* compiled from: AcceptanceDateFragment.kt */
public final class AcceptanceDateFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long THOUSAND = 1000;
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Calendar currentCalendar = Calendar.getInstance();
    private List<TimeSlot> timeSlots = new ArrayList();
    /* access modifiers changed from: private */
    public TimeSlotsAdapter timeSlotsAdapter;
    private String userToken = "";

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
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ TimeSlotsAdapter access$getTimeSlotsAdapter$p(AcceptanceDateFragment acceptanceDateFragment) {
        TimeSlotsAdapter timeSlotsAdapter2 = acceptanceDateFragment.timeSlotsAdapter;
        if (timeSlotsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeSlotsAdapter");
        }
        return timeSlotsAdapter2;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_acceptance));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        this.viewModel.getModelUpdateMutableLiveData().observe(getViewLifecycleOwner(), new AcceptanceDateFragment$onCreateView$1(this));
        View inflate = layoutInflater.inflate(R.layout.fragment_acceptance_date, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…e_date, container, false)");
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        long j;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.userToken = ProfileLocalRepository.Companion.getInstance().getUserToken();
        List<TimeSlot> list = this.timeSlots;
        RealmViewModel realmViewModel = this.viewModel;
        Intrinsics.checkNotNullExpressionValue(realmViewModel, "viewModel");
        String str = this.userToken;
        ProfileViewModel profileViewModel = getBaseActivity().profileViewModel;
        Intrinsics.checkNotNullExpressionValue(profileViewModel, "baseActivity.profileViewModel");
        this.timeSlotsAdapter = new TimeSlotsAdapter(list, realmViewModel, str, profileViewModel, new AcceptanceDateFragment$onViewCreated$1(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.timeSlotsView);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "timeSlotsView");
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.timeSlotsView);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "timeSlotsView");
        TimeSlotsAdapter timeSlotsAdapter2 = this.timeSlotsAdapter;
        if (timeSlotsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeSlotsAdapter");
        }
        recyclerView2.setAdapter(timeSlotsAdapter2);
        List<AcceptanceDate> acceptanceDates = this.viewModel.getAcceptanceDates();
        Calendar instance = Calendar.getInstance();
        instance.add(2, 1);
        Calendar instance2 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance2, "firstAvailableDate");
        Long date = acceptanceDates.get(0).getDate();
        if (date != null) {
            j = date.longValue() * 1000;
        } else {
            j = System.currentTimeMillis();
        }
        instance2.setTimeInMillis(j);
        TimeSlotsAdapter timeSlotsAdapter3 = this.timeSlotsAdapter;
        if (timeSlotsAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeSlotsAdapter");
        }
        Date time = instance2.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "firstAvailableDate.time");
        timeSlotsAdapter3.setDate(time);
        HorizontalCalendar build = new HorizontalCalendar.Builder(view, (int) R.id.horizontalCalendarView).range(instance2, instance).datesNumberOnScreen(5).defaultSelectedDate(instance2).build();
        Intrinsics.checkNotNullExpressionValue(build, "horizontalCalendar");
        build.setCalendarListener(new AcceptanceDateFragment$onViewCreated$2(this));
        Date time2 = instance2.getTime();
        Intrinsics.checkNotNullExpressionValue(time2, "firstAvailableDate.time");
        getTimeSlots(time2);
        this.viewModel.getRequestAcceptanceStateMutableLiveData().observe(getViewLifecycleOwner(), new AcceptanceDateFragment$onViewCreated$3(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        if (kotlin.collections.CollectionsKt.contains(r5, r4.getId()) == true) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ff, code lost:
        if (kotlin.collections.CollectionsKt.contains(r5, r4.getId()) == true) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011f, code lost:
        if (r8 != null) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0080 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleEvent(p035ru.unicorn.ujin.viewModel.events.UpdateEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "updateEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = p035ru.unicorn.C5619R.C5622id.progressBar
            android.view.View r0 = r7._$_findCachedViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            java.lang.String r1 = "progressBar"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            boolean r0 = r8.getSuccess()
            if (r0 == 0) goto L_0x014e
            ru.unicorn.ujin.viewModel.RealmViewModel r8 = r7.viewModel
            ru.unicorn.ujin.data.realm.ApartmentState r8 = r8.getApartmentState()
            ru.unicorn.ujin.view.adapters.TimeSlotsAdapter r0 = r7.timeSlotsAdapter
            java.lang.String r1 = "timeSlotsAdapter"
            if (r0 != 0) goto L_0x002c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x002c:
            r2 = 0
            if (r8 == 0) goto L_0x0034
            java.lang.String r3 = r8.getWindowId()
            goto L_0x0035
        L_0x0034:
            r3 = r2
        L_0x0035:
            r0.setReservedWindowId(r3)
            ru.unicorn.ujin.view.adapters.TimeSlotsAdapter r0 = r7.timeSlotsAdapter
            if (r0 != 0) goto L_0x003f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x003f:
            if (r8 == 0) goto L_0x0050
            io.realm.RealmList r3 = r8.getWindowList()
            if (r3 == 0) goto L_0x0050
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.toList(r3)
            if (r3 == 0) goto L_0x0050
            goto L_0x0057
        L_0x0050:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
        L_0x0057:
            r0.setReservedWindowList(r3)
            ru.unicorn.ujin.view.adapters.TimeSlotsAdapter r0 = r7.timeSlotsAdapter
            if (r0 != 0) goto L_0x0061
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0061:
            if (r8 == 0) goto L_0x0067
            java.lang.String r2 = r8.getAcceptanceDate()
        L_0x0067:
            r0.setReservedDate(r2)
            ru.unicorn.ujin.viewModel.RealmViewModel r8 = r7.viewModel
            java.util.List r8 = r8.getTimeSlots()
            r0 = 1
            if (r8 == 0) goto L_0x0122
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r8 = r8.iterator()
        L_0x0080:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0117
            java.lang.Object r3 = r8.next()
            r4 = r3
            ru.unicorn.ujin.data.realm.TimeSlot r4 = (p035ru.unicorn.ujin.data.realm.TimeSlot) r4
            java.lang.String r5 = r4.getState()
            java.lang.String r6 = "disable"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00c7
            ru.unicorn.ujin.view.adapters.TimeSlotsAdapter r5 = r7.timeSlotsAdapter
            if (r5 != 0) goto L_0x00a0
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00a0:
            java.lang.String r5 = r5.getReservedWindowId()
            java.lang.String r6 = r4.getId()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 != 0) goto L_0x010d
            ru.unicorn.ujin.view.adapters.TimeSlotsAdapter r5 = r7.timeSlotsAdapter
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00b5:
            java.util.List r5 = r5.getReservedWindowList()
            if (r5 == 0) goto L_0x00c7
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.String r6 = r4.getId()
            boolean r5 = kotlin.collections.CollectionsKt.contains(r5, r6)
            if (r5 == r0) goto L_0x010d
        L_0x00c7:
            java.lang.String r5 = r4.getState()
            java.lang.String r6 = "reserve"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0101
            ru.unicorn.ujin.view.adapters.TimeSlotsAdapter r5 = r7.timeSlotsAdapter
            if (r5 != 0) goto L_0x00da
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00da:
            java.lang.String r5 = r5.getReservedWindowId()
            java.lang.String r6 = r4.getId()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 != 0) goto L_0x010d
            ru.unicorn.ujin.view.adapters.TimeSlotsAdapter r5 = r7.timeSlotsAdapter
            if (r5 != 0) goto L_0x00ef
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00ef:
            java.util.List r5 = r5.getReservedWindowList()
            if (r5 == 0) goto L_0x0101
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.String r6 = r4.getId()
            boolean r5 = kotlin.collections.CollectionsKt.contains(r5, r6)
            if (r5 == r0) goto L_0x010d
        L_0x0101:
            java.lang.String r4 = r4.getState()
            java.lang.String r5 = "available"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x010f
        L_0x010d:
            r4 = 1
            goto L_0x0110
        L_0x010f:
            r4 = 0
        L_0x0110:
            if (r4 == 0) goto L_0x0080
            r2.add(r3)
            goto L_0x0080
        L_0x0117:
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r8 = kotlin.collections.CollectionsKt.toMutableList(r2)
            if (r8 == 0) goto L_0x0122
            goto L_0x0129
        L_0x0122:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r8 = (java.util.List) r8
        L_0x0129:
            r7.timeSlots = r8
            ru.unicorn.ujin.view.adapters.TimeSlotsAdapter r8 = r7.timeSlotsAdapter
            if (r8 != 0) goto L_0x0132
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0132:
            java.util.List<ru.unicorn.ujin.data.realm.TimeSlot> r2 = r7.timeSlots
            r8.setData(r2)
            java.util.List<ru.unicorn.ujin.data.realm.TimeSlot> r8 = r7.timeSlots
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r0
            r7.showTimeSlots(r8)
            ru.unicorn.ujin.view.adapters.TimeSlotsAdapter r8 = r7.timeSlotsAdapter
            if (r8 != 0) goto L_0x014a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x014a:
            r8.notifyDataSetChanged()
            goto L_0x0155
        L_0x014e:
            java.lang.String r8 = r8.getMessage()
            r7.showMessage((java.lang.String) r8)
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.acceptance.AcceptanceDateFragment.handleEvent(ru.unicorn.ujin.viewModel.events.UpdateEvent):void");
    }

    /* access modifiers changed from: private */
    public final void checkAcceptanceState() {
        List list;
        RealmList<String> windowList;
        ApartmentState apartmentState = this.viewModel.getApartmentState();
        TimeSlotsAdapter timeSlotsAdapter2 = this.timeSlotsAdapter;
        if (timeSlotsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeSlotsAdapter");
        }
        String str = null;
        timeSlotsAdapter2.setReservedWindowId(apartmentState != null ? apartmentState.getWindowId() : null);
        TimeSlotsAdapter timeSlotsAdapter3 = this.timeSlotsAdapter;
        if (timeSlotsAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeSlotsAdapter");
        }
        if (apartmentState == null || (windowList = apartmentState.getWindowList()) == null || (list = CollectionsKt.toList(windowList)) == null) {
            list = new ArrayList();
        }
        timeSlotsAdapter3.setReservedWindowList(list);
        TimeSlotsAdapter timeSlotsAdapter4 = this.timeSlotsAdapter;
        if (timeSlotsAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeSlotsAdapter");
        }
        if (apartmentState != null) {
            str = apartmentState.getAcceptanceDate();
        }
        timeSlotsAdapter4.setReservedDate(str);
        TimeSlotsAdapter timeSlotsAdapter5 = this.timeSlotsAdapter;
        if (timeSlotsAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeSlotsAdapter");
        }
        timeSlotsAdapter5.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    public final void getTimeSlots(Date date) {
        hideTimeSlotsViews();
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(0);
        this.viewModel.getAcceptanceTimeSlots(this.userToken, date);
    }

    private final void showTimeSlots(boolean z) {
        if (z) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.timeSlotsView);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "timeSlotsView");
            recyclerView.setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.noTimeSlotsLayout);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "noTimeSlotsLayout");
            linearLayout.setVisibility(8);
            return;
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.timeSlotsView);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "timeSlotsView");
        recyclerView2.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.noTimeSlotsLayout);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "noTimeSlotsLayout");
        linearLayout2.setVisibility(0);
    }

    private final void hideTimeSlotsViews() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.timeSlotsView);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "timeSlotsView");
        recyclerView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.noTimeSlotsLayout);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "noTimeSlotsLayout");
        linearLayout.setVisibility(8);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/acceptance/AcceptanceDateFragment$Companion;", "", "()V", "THOUSAND", "", "newInstance", "Lru/unicorn/ujin/view/fragments/acceptance/AcceptanceDateFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.acceptance.AcceptanceDateFragment$Companion */
    /* compiled from: AcceptanceDateFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AcceptanceDateFragment newInstance() {
            return new AcceptanceDateFragment();
        }
    }
}
