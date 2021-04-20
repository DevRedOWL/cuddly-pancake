package p035ru.unicorn.ujin.view.fragments.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.util.TextUtils;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ApiValues;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DatePickerField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0014J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/RentObjectFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "decMonths", "", "", "[Ljava/lang/String;", "monthList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/dialogs/dataEntry/SelectValue;", "Lkotlin/collections/ArrayList;", "monthText", "monthValue", "", "rentaViewModel", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/MyRentaViewModel;", "startDate", "getLayoutRes", "metricsScreenName", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.RentObjectFragment */
/* compiled from: RentObjectFragment.kt */
public final class RentObjectFragment extends BaseTitleFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DATE_PICKER_FIELD = "datePickerField";
    public static final String SPINNER_FIELD = "spinnerField";
    private HashMap _$_findViewCache;
    private final String[] decMonths = {"месяц", "месяца", "месяцев"};
    /* access modifiers changed from: private */
    public final ArrayList<SelectValue> monthList = new ArrayList<>();
    /* access modifiers changed from: private */
    public String monthText = "";
    /* access modifiers changed from: private */
    public int monthValue = 1;
    private MyRentaViewModel rentaViewModel;
    /* access modifiers changed from: private */
    public String startDate = "";

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
        return R.layout.fragment_rent_object;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Профиль. Аренда объекта.";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void showToolbar() {
        getBaseActivity().setTextTitle(getTitle());
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        BaseActivity baseActivity = getBaseActivity();
        View[] viewArr = new View[1];
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_toolbar_blue_button, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setText(getString(R.string.button_next));
            textView.setOnClickListener(new RentObjectFragment$showToolbar$$inlined$apply$lambda$1(this));
            Unit unit = Unit.INSTANCE;
            viewArr[0] = textView;
            baseActivity.setToolbarRight(CollectionsKt.arrayListOf(viewArr));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        String string = getResources().getString(R.string.rent_object_title);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.rent_object_title)");
        setTitle(string);
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…ntaViewModel::class.java]");
        this.rentaViewModel = (MyRentaViewModel) viewModel;
        if (this.monthList.isEmpty()) {
            for (int i = 1; i <= 6; i++) {
                ArrayList<SelectValue> arrayList = this.monthList;
                String valueOf = String.valueOf(i);
                arrayList.add(new SelectValue(valueOf, String.valueOf(i) + " " + TextUtils.decOfNumber(i, this.decMonths)));
            }
        }
        Calendar instance = Calendar.getInstance();
        if (this.startDate.length() > 0) {
            instance = DateUtils.parseDate(this.startDate, DatePickerViewHolder.DATE_FORMAT);
        }
        ArrayList arrayList2 = new ArrayList();
        DatePickerField datePickerField = new DatePickerField(getResources().getString(R.string.rent_start_date), "", instance, Calendar.getInstance());
        datePickerField.setName(DATE_PICKER_FIELD);
        datePickerField.setRequired(true);
        Unit unit = Unit.INSTANCE;
        SelectField selectField = new SelectField(getResources().getString(R.string.rent_period), "", String.valueOf(this.monthValue), this.monthList, (ApiValues) null);
        selectField.setName(SPINNER_FIELD);
        selectField.setRequired(true);
        Unit unit2 = Unit.INSTANCE;
        arrayList2.addAll(CollectionsKt.listOf(datePickerField, selectField));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDynamic);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(new DataEntryAdapter(arrayList2));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/RentObjectFragment$Companion;", "", "()V", "DATE_PICKER_FIELD", "", "SPINNER_FIELD", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.RentObjectFragment$Companion */
    /* compiled from: RentObjectFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
