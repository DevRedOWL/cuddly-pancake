package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.work.ListenableWorker;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import com.kyleduo.switchbutton.SwitchButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentBleSettingsBinding;
import p035ru.unicorn.databinding.ItemBleSwitchButtonBinding;
import p035ru.unicorn.ujin.data.service.location.LocationService;
import p035ru.unicorn.ujin.data.service.location.ServiceRunningChecker;
import p035ru.unicorn.ujin.util.ServiceHelper;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J-\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00052\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100 2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010!J\u001a\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u000bH\u0002J\b\u0010&\u001a\u00020\u0014H\u0014J\b\u0010'\u001a\u00020\u0014H\u0002J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/BleSettingsFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/alertpoints/OnButtonClick;", "()V", "PERMISSION_REQUEST_CODE", "", "binding", "Lru/unicorn/databinding/FragmentBleSettingsBinding;", "sPref", "Landroid/content/SharedPreferences;", "allGranted", "", "grantResults", "", "checkPermissionFirst", "", "", "loadResult", "metricsScreenName", "onClick", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "saveChoose", "checked", "showToolbar", "startServiceIfNeeded", "startWorkerForWatching", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.BleSettingsFragment */
/* compiled from: BleSettingsFragment.kt */
public final class BleSettingsFragment extends BaseFragment implements OnButtonClick {
    private final int PERMISSION_REQUEST_CODE = 321;
    private HashMap _$_findViewCache;
    private FragmentBleSettingsBinding binding;
    private SharedPreferences sPref;

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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        this.binding = (FragmentBleSettingsBinding) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_ble_settings, viewGroup, false);
        FragmentBleSettingsBinding fragmentBleSettingsBinding = this.binding;
        if (fragmentBleSettingsBinding != null) {
            return fragmentBleSettingsBinding.getRoot();
        }
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        ItemBleSwitchButtonBinding itemBleSwitchButtonBinding;
        SwitchButton switchButton;
        ItemBleSwitchButtonBinding itemBleSwitchButtonBinding2;
        SwitchButton switchButton2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            this.sPref = baseActivity.getSharedPreferences(getString(R.string.app_name), 0);
        }
        startServiceIfNeeded();
        FragmentBleSettingsBinding fragmentBleSettingsBinding = this.binding;
        if (!(fragmentBleSettingsBinding == null || (itemBleSwitchButtonBinding2 = fragmentBleSettingsBinding.item1) == null || (switchButton2 = itemBleSwitchButtonBinding2.swich) == null)) {
            switchButton2.setCheckedImmediatelyNoEvent(loadResult());
        }
        FragmentBleSettingsBinding fragmentBleSettingsBinding2 = this.binding;
        if (fragmentBleSettingsBinding2 != null && (itemBleSwitchButtonBinding = fragmentBleSettingsBinding2.item1) != null && (switchButton = itemBleSwitchButtonBinding.swich) != null) {
            switchButton.setOnCheckedChangeListener(new BleSettingsFragment$onViewCreated$2(this));
        }
    }

    public void onClick() {
        List<String> checkPermissionFirst = checkPermissionFirst();
        if (checkPermissionFirst.isEmpty()) {
            saveChoose(true);
            startWorkerForWatching(true);
            ServiceHelper.startLocationService(getBaseActivity());
            return;
        }
        Object[] array = checkPermissionFirst.toArray(new String[0]);
        if (array != null) {
            requestPermissions((String[]) array, this.PERMISSION_REQUEST_CODE);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final void startServiceIfNeeded() {
        if (loadResult() && !ServiceHelper.isMyServiceRunning(LocationService.class, getBaseActivity())) {
            ServiceHelper.stopLocationService(getBaseActivity());
        }
    }

    /* access modifiers changed from: private */
    public final void startWorkerForWatching(boolean z) {
        WorkRequest build = ((PeriodicWorkRequest.Builder) new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ServiceRunningChecker.class, 30, TimeUnit.MINUTES).addTag(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO)).build();
        Intrinsics.checkNotNullExpressionValue(build, "PeriodicWorkRequest\n    …\n                .build()");
        PeriodicWorkRequest periodicWorkRequest = (PeriodicWorkRequest) build;
        if (z) {
            WorkManager.getInstance().enqueue((WorkRequest) periodicWorkRequest);
        } else {
            WorkManager.getInstance().cancelAllWorkByTag(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO);
        }
    }

    /* access modifiers changed from: private */
    public final void saveChoose(boolean z) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        SharedPreferences sharedPreferences = this.sPref;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putBoolean = edit.putBoolean(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO, z)) != null) {
            putBoolean.apply();
        }
    }

    private final boolean loadResult() {
        SharedPreferences sharedPreferences = this.sPref;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(BleSettingsFragmentKt.USER_ENABLE_START_SERVICE_AUTO, false);
        }
        return false;
    }

    private final List<String> checkPermissionFirst() {
        List<String> arrayList = new ArrayList<>();
        int checkSelfPermission = ContextCompat.checkSelfPermission(getBaseActivity(), "android.permission.ACCESS_COARSE_LOCATION");
        int checkSelfPermission2 = ContextCompat.checkSelfPermission(getBaseActivity(), "android.permission.ACCESS_FINE_LOCATION");
        if (checkSelfPermission != 0) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        if (checkSelfPermission2 != 0) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (Build.VERSION.SDK_INT >= 29 && ContextCompat.checkSelfPermission(getBaseActivity(), "android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
            arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        return arrayList;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ItemBleSwitchButtonBinding itemBleSwitchButtonBinding;
        SwitchButton switchButton;
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != this.PERMISSION_REQUEST_CODE || !allGranted(iArr)) {
            FragmentBleSettingsBinding fragmentBleSettingsBinding = this.binding;
            if (!(fragmentBleSettingsBinding == null || (itemBleSwitchButtonBinding = fragmentBleSettingsBinding.item1) == null || (switchButton = itemBleSwitchButtonBinding.swich) == null)) {
                switchButton.setCheckedNoEvent(false);
            }
            saveChoose(false);
            startWorkerForWatching(false);
            return;
        }
        saveChoose(true);
        startWorkerForWatching(true);
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            ServiceHelper.startLocationService(baseActivity);
        }
    }

    private final boolean allGranted(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.ble_settings_title));
    }
}
