package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.mobile.p055id.example.core.connectivity.Connectivity;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentPassSettingsBleBinding;
import p035ru.unicorn.ujin.ble.TransparentActivityKt;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J-\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00062\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016¢\u0006\u0002\u0010!J\u0012\u0010\"\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006%"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassSettingsBleFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassSettingsBleBinding;", "()V", "CAMERA_REQUEST_PASS", "", "LOCATION_REQUEST_CODE_GATE", "LOCATION_REQUEST_CODE_NEDAP", "connectivity", "Lorg/mobile/id/example/core/connectivity/Connectivity;", "getConnectivity", "()Lorg/mobile/id/example/core/connectivity/Connectivity;", "connectivity$delegate", "Lkotlin/Lazy;", "checkGatePermission", "", "checkNedapPermissions", "getAssignKey", "getLayoutRes", "getMyToolbarTitle", "", "locationPermissionsGranted", "", "onDestroyView", "onFileChoose", "filePath", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "viewModell", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassSettingsBleFragment */
/* compiled from: PassSettingsBleFragment.kt */
public final class PassSettingsBleFragment extends BaseBindingFragment<PassProfileVM, FragmentPassSettingsBleBinding> {
    public static final String ARG_HAS_GATE = "ARG_HAS_GATE";
    public static final String ARG_ICON_RES = "ARG_ICON_RES";
    public static final String ARG_PASS_TYPE = "ARG_PASS_TYPE";
    public static final String ARG_TITLE_RES = "ARG_TITLE_RES";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int CAMERA_REQUEST_PASS = 11;
    private final int LOCATION_REQUEST_CODE_GATE = 44;
    private final int LOCATION_REQUEST_CODE_NEDAP = 43;
    private HashMap _$_findViewCache;
    private final Lazy connectivity$delegate = LazyKt.lazy(new PassSettingsBleFragment$connectivity$2(this));

    private final Connectivity getConnectivity() {
        return (Connectivity) this.connectivity$delegate.getValue();
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
        return R.layout.fragment_pass_settings_ble;
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassProfileVM passProfileVM) {
        getConnectivity().onCreate();
        Bundle arguments = getArguments();
        if (arguments != null) {
            TextView textView = ((FragmentPassSettingsBleBinding) getViewDataBinding()).id1.f6602tv;
            Intrinsics.checkNotNullExpressionValue(textView, "viewDataBinding.id1.tv");
            textView.setText(getString(arguments.getInt("ARG_TITLE_RES")));
            ((FragmentPassSettingsBleBinding) getViewDataBinding()).id1.f6601iv.setImageResource(arguments.getInt("ARG_ICON_RES"));
        }
        ((FragmentPassSettingsBleBinding) getViewDataBinding()).choose1.parent.setOnClickListener(new PassSettingsBleFragment$onViewCreated$2(this));
    }

    /* access modifiers changed from: private */
    public final void getAssignKey() {
        ((PassProfileVM) getViewModell()).loadAllBleDevice();
        ExtensionKt.observe((Fragment) this, ((PassProfileVM) getViewModell()).getAllBleDevice(), new PassSettingsBleFragment$getAssignKey$1(this));
    }

    /* access modifiers changed from: private */
    public final void checkNedapPermissions() {
        if (getConnectivity().isConnected()) {
            BleEnable bleEnable = BleEnable.INSTANCE;
            BaseActivity baseActivity = getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            if (!bleEnable.checkIsEnable(baseActivity)) {
                startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), TransparentActivityKt.REQUEST_ENABLE_BT);
            } else if (!locationPermissionsGranted()) {
                requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, this.LOCATION_REQUEST_CODE_NEDAP);
            } else {
                nextFragment(new PassCreateBleFirstFragment(), false);
            }
        } else {
            showErrorMessage("Отсутствует подключение к интрнету");
        }
    }

    /* access modifiers changed from: private */
    public final void checkGatePermission() {
        if (!locationPermissionsGranted()) {
            requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, this.LOCATION_REQUEST_CODE_GATE);
        } else if (ContextCompat.checkSelfPermission(getBaseActivity(), "android.permission.CAMERA") != 0) {
            requestPermissions(new String[]{"android.permission.CAMERA"}, this.CAMERA_REQUEST_PASS);
        } else {
            nextFragment(new PassCreateBleQRFragment(), false);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == this.CAMERA_REQUEST_PASS) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                showErrorMessage(getString(R.string.error_permission_not_granted));
            } else {
                checkGatePermission();
            }
        } else if (i == this.LOCATION_REQUEST_CODE_NEDAP) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                checkNedapPermissions();
            }
        } else if (i == this.LOCATION_REQUEST_CODE_GATE) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                checkGatePermission();
            }
        }
    }

    private final boolean locationPermissionsGranted() {
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        int i = baseActivity.getApplicationInfo().targetSdkVersion;
        if (Build.VERSION.SDK_INT < 29 || i < 29) {
            if (Build.VERSION.SDK_INT < 23 || getBaseActivity().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                return true;
            }
        } else if (getBaseActivity().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    public void onDestroyView() {
        getConnectivity().onDestroy();
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_pass);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_pass)");
        return string;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassSettingsBleFragment$Companion;", "", "()V", "ARG_HAS_GATE", "", "ARG_ICON_RES", "ARG_PASS_TYPE", "ARG_TITLE_RES", "newInstance", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassSettingsBleFragment;", "iconRes", "", "labelRes", "passType", "hasGate", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassSettingsBleFragment$Companion */
    /* compiled from: PassSettingsBleFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PassSettingsBleFragment newInstance(int i, int i2, String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "passType");
            PassSettingsBleFragment passSettingsBleFragment = new PassSettingsBleFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("ARG_ICON_RES", i);
            bundle.putInt("ARG_TITLE_RES", i2);
            bundle.putString("ARG_PASS_TYPE", str);
            bundle.putBoolean("ARG_HAS_GATE", z);
            Unit unit = Unit.INSTANCE;
            passSettingsBleFragment.setArguments(bundle);
            return passSettingsBleFragment;
        }
    }
}
