package p035ru.unicorn.ujin.view.fragments.profile.subAccounts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;
import androidx.core.app.NotificationCompat;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.SubAccountStatus;
import p035ru.unicorn.ujin.data.api.response.SubAccountsStatusesResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0017\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/subAccounts/NewSubAccountFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "selectedValue", "Lru/unicorn/ujin/view/dialogs/dataEntry/SelectValue;", "getLayoutRes", "", "handleAddEvent", "", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "handleLoadingProcess", "loading", "", "(Ljava/lang/Boolean;)V", "handleStatus", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SubAccountsStatusesResponseData;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.subAccounts.NewSubAccountFragment */
/* compiled from: NewSubAccountFragment.kt */
public final class NewSubAccountFragment extends BaseTitleFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public SelectValue selectedValue;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.subAccounts.NewSubAccountFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 3;
        }
    }

    @JvmStatic
    public static final NewSubAccountFragment newInstance(String str) {
        return Companion.newInstance(str);
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
        return R.layout.fragment_new_subaccount;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Добавление субаккаунта";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ SelectValue access$getSelectedValue$p(NewSubAccountFragment newSubAccountFragment) {
        SelectValue selectValue = newSubAccountFragment.selectedValue;
        if (selectValue == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedValue");
        }
        return selectValue;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/subAccounts/NewSubAccountFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/profile/subAccounts/NewSubAccountFragment;", "title", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.subAccounts.NewSubAccountFragment$Companion */
    /* compiled from: NewSubAccountFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final NewSubAccountFragment newInstance(String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            NewSubAccountFragment newSubAccountFragment = new NewSubAccountFragment();
            newSubAccountFragment.setTitle(str);
            return newSubAccountFragment;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        getProfileViewModel().getShowProgressLiveData().observe(getViewLifecycleOwner(), new NewSubAccountFragment$onCreateView$1(this));
        getProfileViewModel().getAddSubAccountLiveData().observe(getViewLifecycleOwner(), new NewSubAccountFragment$onCreateView$2(this));
        getProfileViewModel().getStatusesLiveData().observe(getViewLifecycleOwner(), new NewSubAccountFragment$onCreateView$3(this));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: private */
    public final void handleLoadingProcess(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etName);
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "etName");
            textInputEditText.setEnabled(!bool.booleanValue());
            PhoneMaskedEditText phoneMaskedEditText = (PhoneMaskedEditText) _$_findCachedViewById(C5619R.C5622id.etPhone);
            Intrinsics.checkNotNullExpressionValue(phoneMaskedEditText, "etPhone");
            phoneMaskedEditText.setEnabled(!bool.booleanValue());
            TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etComment);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etComment");
            textInputEditText2.setEnabled(!bool.booleanValue());
            TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C5619R.C5622id.tlAccessRights);
            Intrinsics.checkNotNullExpressionValue(tabLayout, "tlAccessRights");
            tabLayout.setEnabled(!bool.booleanValue());
            View _$_findCachedViewById = _$_findCachedViewById(C5619R.C5622id.status);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, NotificationCompat.CATEGORY_STATUS);
            _$_findCachedViewById.setEnabled(!bool.booleanValue());
            showLoader(bool, (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading));
        }
    }

    /* access modifiers changed from: private */
    public final void handleAddEvent(UpdateEvent updateEvent) {
        if (updateEvent != null) {
            boolean success = updateEvent.getSuccess();
            if (success) {
                getBaseActivity().showMessage((int) R.string.profileSuccessAddingSubAccount);
                backFragment();
            } else if (!success) {
                getBaseActivity().showMessage(updateEvent.getMessage());
            }
        } else {
            getBaseActivity().showMessage((int) R.string.profileErrorAddingSubAccount);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((TabLayout) _$_findCachedViewById(C5619R.C5622id.tlAccessRights)).addTab(((TabLayout) _$_findCachedViewById(C5619R.C5622id.tlAccessRights)).newTab().setText((CharSequence) getResources().getString(R.string.readAccess)).setTag("0"));
        ((TabLayout) _$_findCachedViewById(C5619R.C5622id.tlAccessRights)).addTab(((TabLayout) _$_findCachedViewById(C5619R.C5622id.tlAccessRights)).newTab().setText((CharSequence) getResources().getString(R.string.fullAccess)).setTag("1"));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnNewSubAccount)).setOnClickListener(new NewSubAccountFragment$onViewCreated$1(this));
        getProfileViewModel().requestSubAccountStatuses();
    }

    /* access modifiers changed from: private */
    public final void handleStatus(Resource<SubAccountsStatusesResponseData> resource) {
        ArrayList<SubAccountStatus> statusList;
        Resource.Status status = resource.getStatus();
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                handleLoadingProcess(true);
            } else if (i == 2) {
                handleLoadingProcess(false);
                showErrorMessage(resource.getMessage());
            } else if (i == 3) {
                handleLoadingProcess(false);
                SubAccountsStatusesResponseData data = resource.getData();
                if (data != null && (statusList = data.getStatusList()) != null && (!statusList.isEmpty())) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<SubAccountStatus> it = resource.getData().getStatusList().iterator();
                    while (it.hasNext()) {
                        SubAccountStatus next = it.next();
                        arrayList.add(new SelectValue(String.valueOf(next.getId()), next.getTitle()));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Object obj = arrayList.get(i2);
                        Intrinsics.checkNotNullExpressionValue(obj, "selectValueList[i]");
                        arrayList2.add(((SelectValue) obj).getText());
                    }
                    ArrayAdapter arrayAdapter = new ArrayAdapter(getBaseActivity(), R.layout.field_spinner_view, arrayList2);
                    arrayAdapter.setDropDownViewResource(17367058);
                    View _$_findCachedViewById = _$_findCachedViewById(C5619R.C5622id.status);
                    Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, NotificationCompat.CATEGORY_STATUS);
                    Spinner spinner = (Spinner) _$_findCachedViewById.findViewById(C5619R.C5622id.spinner);
                    Intrinsics.checkNotNullExpressionValue(spinner, "status.spinner");
                    spinner.setAdapter(arrayAdapter);
                    View _$_findCachedViewById2 = _$_findCachedViewById(C5619R.C5622id.status);
                    Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, NotificationCompat.CATEGORY_STATUS);
                    ((Spinner) _$_findCachedViewById2.findViewById(C5619R.C5622id.spinner)).setSelection(0);
                    Object obj2 = arrayList.get(0);
                    Intrinsics.checkNotNullExpressionValue(obj2, "selectValueList[0]");
                    this.selectedValue = (SelectValue) obj2;
                    View _$_findCachedViewById3 = _$_findCachedViewById(C5619R.C5622id.status);
                    Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, NotificationCompat.CATEGORY_STATUS);
                    Spinner spinner2 = (Spinner) _$_findCachedViewById3.findViewById(C5619R.C5622id.spinner);
                    Intrinsics.checkNotNullExpressionValue(spinner2, "status.spinner");
                    spinner2.setOnItemSelectedListener(new NewSubAccountFragment$handleStatus$2(this, arrayList));
                }
            }
        }
    }
}
