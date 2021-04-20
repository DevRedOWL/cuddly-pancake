package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentPassBleFirstBinding;
import p035ru.unicorn.ujin.ble.data.PASS_TYPE;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger.BleReaderSection;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J-\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00062\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0002H\u0014J\b\u0010!\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassCreateBleFirstFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassBleFirstBinding;", "()V", "LOCATION_REQUEST_CODE", "", "adapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getAdapter", "()Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "bleReaderSection", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/BleReaderSection;", "bleEnable", "", "enableBT", "", "enableLocation", "getLayoutRes", "getMyToolbarTitle", "", "initRecyclerView", "onFileChoose", "filePath", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "viewModell", "permissionsGranted", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleFirstFragment */
/* compiled from: PassCreateBleFirstFragment.kt */
public final class PassCreateBleFirstFragment extends BaseBindingFragment<PassProfileVM, FragmentPassBleFirstBinding> {
    /* access modifiers changed from: private */
    public final int LOCATION_REQUEST_CODE = 52;
    private HashMap _$_findViewCache;
    private final SectionedAdapter adapter = new SectionedAdapter();
    /* access modifiers changed from: private */
    public final BleReaderSection bleReaderSection = new BleReaderSection();

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
        return R.layout.fragment_pass_ble_first;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    public final SectionedAdapter getAdapter() {
        return this.adapter;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassProfileVM passProfileVM) {
        Intrinsics.checkNotNullParameter(passProfileVM, "viewModell");
        passProfileVM.getSelectedFingerReader().setValue(-1);
        initRecyclerView();
        ((FragmentPassBleFirstBinding) getViewDataBinding()).addCard.setOnClickListener(new PassCreateBleFirstFragment$onViewCreated$1(this, passProfileVM));
        passProfileVM.loadBleBy(PASS_TYPE.BLE.getType());
        ExtensionKt.observe((Fragment) this, passProfileVM.getBleReaderDataFilterBy(), new PassCreateBleFirstFragment$onViewCreated$2(this));
        ExtensionKt.observe((Fragment) this, passProfileVM.getSelectedFingerReader(), new PassCreateBleFirstFragment$onViewCreated$3(this));
    }

    /* access modifiers changed from: private */
    public final void enableLocation() {
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    private final void initRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv");
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv");
        recyclerView2.setAdapter(this.adapter);
        this.adapter.addSectionSafety(this.bleReaderSection);
        this.disposable.add(this.bleReaderSection.getItemClick().subscribe(new PassCreateBleFirstFragment$initRecyclerView$1(this)));
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_pass);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_pass)");
        return string;
    }

    /* access modifiers changed from: private */
    public final boolean permissionsGranted() {
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            ApplicationInfo applicationInfo = baseActivity.getApplicationInfo();
            Integer valueOf = applicationInfo != null ? Integer.valueOf(applicationInfo.targetSdkVersion) : null;
            if (valueOf != null) {
                if (Build.VERSION.SDK_INT < 29 || valueOf.intValue() < 29) {
                    if (Build.VERSION.SDK_INT < 23 || baseActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        return true;
                    }
                } else if (baseActivity.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == this.LOCATION_REQUEST_CODE) {
            if (!(iArr.length == 0)) {
                int i2 = iArr[0];
            }
        }
    }

    public final boolean bleEnable() {
        Object systemService = getBaseActivity().getSystemService("bluetooth");
        if (systemService != null) {
            BluetoothAdapter adapter2 = ((BluetoothManager) systemService).getAdapter();
            Intrinsics.checkNotNullExpressionValue(adapter2, "bluetoothManager.adapter");
            return adapter2.isEnabled();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
    }

    /* access modifiers changed from: private */
    public final void enableBT() {
        BaseActivity baseActivity = getBaseActivity();
        Object systemService = baseActivity.getSystemService("bluetooth");
        if (systemService != null) {
            BluetoothAdapter adapter2 = ((BluetoothManager) systemService).getAdapter();
            Intrinsics.checkNotNullExpressionValue(adapter2, "bluetoothManager.adapter");
            if (!adapter2.isEnabled()) {
                Intrinsics.checkNotNullExpressionValue(baseActivity, "it");
                MaterialDialog.negativeButton$default(MaterialDialog.positiveButton$default(MaterialDialog.message$default(MaterialDialog.title$default(new MaterialDialog(baseActivity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.dialog_bt_label_error_title), (String) null, 2, (Object) null), Integer.valueOf(R.string.dialog_bt_label_error_message), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.button_enable), (CharSequence) null, new PassCreateBleFirstFragment$enableBT$$inlined$let$lambda$1(this), 2, (Object) null), Integer.valueOf(R.string.button_CANCEL), (CharSequence) null, PassCreateBleFirstFragment$enableBT$1$2.INSTANCE, 2, (Object) null).show();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
    }
}
