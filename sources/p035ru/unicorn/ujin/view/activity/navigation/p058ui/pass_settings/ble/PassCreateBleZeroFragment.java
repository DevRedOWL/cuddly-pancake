package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.mobile.p055id.example.core.connectivity.Connectivity;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentPassBleZeroBinding;
import p035ru.unicorn.ujin.ble.TransparentActivityKt;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J-\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00062\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0002H\u0014J\b\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassCreateBleZeroFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassBleZeroBinding;", "()V", "CAMERA_REQUEST_PASS", "", "LOCATION_REQUEST_CODE", "connectivity", "Lorg/mobile/id/example/core/connectivity/Connectivity;", "getConnectivity", "()Lorg/mobile/id/example/core/connectivity/Connectivity;", "connectivity$delegate", "Lkotlin/Lazy;", "checkAllPermissions", "", "getLayoutRes", "getMyToolbarTitle", "", "getPhotoPermission", "onDestroyView", "onFileChoose", "filePath", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "viewModell", "permissionsGranted", "", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleZeroFragment */
/* compiled from: PassCreateBleZeroFragment.kt */
public final class PassCreateBleZeroFragment extends BaseBindingFragment<PassProfileVM, FragmentPassBleZeroBinding> {
    public static final String ARG_HAS_GATE = "ARG_HAS_GATE";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int CAMERA_REQUEST_PASS = 11;
    private final int LOCATION_REQUEST_CODE = 43;
    private HashMap _$_findViewCache;
    private final Lazy connectivity$delegate = LazyKt.lazy(new PassCreateBleZeroFragment$connectivity$2(this));

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
        return R.layout.fragment_pass_ble_zero;
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassProfileVM passProfileVM) {
        Intrinsics.checkNotNullParameter(passProfileVM, "viewModell");
        getConnectivity().onCreate();
        Bundle arguments = getArguments();
        if (arguments != null) {
            CheckBox checkBox = ((FragmentPassBleZeroBinding) getViewDataBinding()).cbQr;
            Intrinsics.checkNotNullExpressionValue(checkBox, "viewDataBinding.cbQr");
            ExtensionKt.setVisible(checkBox, true);
            if (arguments.getBoolean("ARG_HAS_GATE", false)) {
                CheckBox checkBox2 = ((FragmentPassBleZeroBinding) getViewDataBinding()).cbQr;
                Intrinsics.checkNotNullExpressionValue(checkBox2, "viewDataBinding.cbQr");
                ExtensionKt.setVisible(checkBox2, true);
                CheckBox checkBox3 = ((FragmentPassBleZeroBinding) getViewDataBinding()).cbReader;
                Intrinsics.checkNotNullExpressionValue(checkBox3, "viewDataBinding.cbReader");
                checkBox3.setChecked(true);
            }
        }
        ((FragmentPassBleZeroBinding) getViewDataBinding()).cbReader.setOnCheckedChangeListener(new PassCreateBleZeroFragment$onViewCreated$2(this));
        ((FragmentPassBleZeroBinding) getViewDataBinding()).cbQr.setOnCheckedChangeListener(new PassCreateBleZeroFragment$onViewCreated$3(this));
        ((FragmentPassBleZeroBinding) getViewDataBinding()).addBle.setOnClickListener(new PassCreateBleZeroFragment$onViewCreated$4(this));
    }

    /* access modifiers changed from: private */
    public final void checkAllPermissions() {
        if (getConnectivity().isConnected()) {
            BleEnable bleEnable = BleEnable.INSTANCE;
            BaseActivity baseActivity = getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            if (!bleEnable.checkIsEnable(baseActivity)) {
                startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), TransparentActivityKt.REQUEST_ENABLE_BT);
            } else if (permissionsGranted()) {
                getPhotoPermission();
            } else {
                requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, this.LOCATION_REQUEST_CODE);
            }
        } else {
            showErrorMessage("Отсутствует подключение к интрнету");
        }
    }

    private final void getPhotoPermission() {
        if (ContextCompat.checkSelfPermission(getBaseActivity(), "android.permission.CAMERA") == 0) {
            nextFragment(new PassCreateBleQRFragment(), false);
        } else {
            ActivityCompat.requestPermissions(getBaseActivity(), new String[]{"android.permission.CAMERA"}, this.CAMERA_REQUEST_PASS);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (!(!(iArr.length == 0)) || iArr[0] != 0) {
            showErrorMessage(getString(R.string.error_permission_not_granted));
        } else {
            nextFragment(new PassCreateBleQRFragment(), false);
        }
    }

    public void onResume() {
        super.onResume();
        CheckBox checkBox = ((FragmentPassBleZeroBinding) getViewDataBinding()).cbReader;
        Intrinsics.checkNotNullExpressionValue(checkBox, "viewDataBinding.cbReader");
        checkBox.setChecked(true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        getConnectivity().onDestroy();
        _$_clearFindViewByIdCache();
    }

    private final boolean permissionsGranted() {
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

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_pass);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_pass)");
        return string;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassCreateBleZeroFragment$Companion;", "", "()V", "ARG_HAS_GATE", "", "newInstance", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassCreateBleZeroFragment;", "hasGate", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleZeroFragment$Companion */
    /* compiled from: PassCreateBleZeroFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PassCreateBleZeroFragment newInstance(boolean z) {
            PassCreateBleZeroFragment passCreateBleZeroFragment = new PassCreateBleZeroFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_HAS_GATE", z);
            Unit unit = Unit.INSTANCE;
            passCreateBleZeroFragment.setArguments(bundle);
            return passCreateBleZeroFragment;
        }
    }
}
