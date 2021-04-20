package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentPassBleSecondBinding;
import p035ru.unicorn.ujin.ble.BleWorkerImpl;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothPeripheral;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001.B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0012H\u0014J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0012H\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u001bH\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0012H\u0016J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0002H\u0014J\u000e\u0010+\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0012J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u0012H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006/"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassCreateBleSecondFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassBleSecondBinding;", "Lru/unicorn/ujin/ble/BleWorkerImpl$BleWorkerResult;", "()V", "bleList", "", "Lru/unicorn/ujin/ble/data/BleReader;", "bleWorker", "Lru/unicorn/ujin/ble/BleWorkerImpl;", "getBleWorker", "()Lru/unicorn/ujin/ble/BleWorkerImpl;", "setBleWorker", "(Lru/unicorn/ujin/ble/BleWorkerImpl;)V", "central", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothCentral;", "deviceKey", "", "getDeviceKey", "()Ljava/lang/String;", "setDeviceKey", "(Ljava/lang/String;)V", "sn", "getSn", "setSn", "enableBT", "", "getLayoutRes", "", "getMyToolbarTitle", "onDestroyView", "onFailure", "toString", "onFileChoose", "filePath", "onGetPerifiral", "peripheral", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothPeripheral;", "onOpenDoorClick", "onSuccess", "onViewCreated", "viewModell", "sendLog", "showDialogMessage", "label", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleSecondFragment */
/* compiled from: PassCreateBleSecondFragment.kt */
public final class PassCreateBleSecondFragment extends BaseBindingFragment<PassProfileVM, FragmentPassBleSecondBinding> implements BleWorkerImpl.BleWorkerResult {
    public static final String ARG_DEVICE_MAC = "arg_device_mac";
    public static final String ARG_SERIAL_NUMBER = "arg_serial_number";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public List<BleReader> bleList = new ArrayList();
    private BleWorkerImpl bleWorker;
    /* access modifiers changed from: private */
    public BluetoothCentral central;
    private String deviceKey = "";

    /* renamed from: sn */
    private String f6842sn = "";

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
        return R.layout.fragment_pass_ble_second;
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    public final String getSn() {
        return this.f6842sn;
    }

    public final void setSn(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f6842sn = str;
    }

    public final String getDeviceKey() {
        return this.deviceKey;
    }

    public final void setDeviceKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceKey = str;
    }

    public final BleWorkerImpl getBleWorker() {
        return this.bleWorker;
    }

    public final void setBleWorker(BleWorkerImpl bleWorkerImpl) {
        this.bleWorker = bleWorkerImpl;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassProfileVM passProfileVM) {
        Intrinsics.checkNotNullParameter(passProfileVM, "viewModell");
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("arg_serial_number");
            if (string == null) {
                string = "";
            }
            this.f6842sn = string;
            passProfileVM.startAddBle(this.f6842sn);
        }
        ExtensionKt.observe((Fragment) this, passProfileVM.getSaveBleResult(), new PassCreateBleSecondFragment$onViewCreated$2(this));
        ExtensionKt.observe((Fragment) this, passProfileVM.getIterationError(), new PassCreateBleSecondFragment$onViewCreated$3(this));
        ExtensionKt.observe((Fragment) this, passProfileVM.getCurrentBleDevice(), new PassCreateBleSecondFragment$onViewCreated$4(this));
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonSend);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonSend");
        dynamicBackgroundButton.setVisibility(4);
        passProfileVM.loadAllBleDevice();
        ExtensionKt.observe((Fragment) this, passProfileVM.getAllBleDevice(), new PassCreateBleSecondFragment$onViewCreated$5(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonSend)).setOnClickListener(new PassCreateBleSecondFragment$onViewCreated$6(this));
    }

    /* access modifiers changed from: private */
    public final void showDialogMessage(String str) {
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            DialogHelper.showDialog((Context) baseActivity, str, (DialogHelper.OnButtonDialogClick) new C5912x557d0426(this, str));
        }
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_pass);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_pass)");
        return string;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassCreateBleSecondFragment$Companion;", "", "()V", "ARG_DEVICE_MAC", "", "ARG_SERIAL_NUMBER", "start", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassCreateBleSecondFragment;", "serialNumber", "mac", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleSecondFragment$Companion */
    /* compiled from: PassCreateBleSecondFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PassCreateBleSecondFragment start(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "serialNumber");
            Intrinsics.checkNotNullParameter(str2, "mac");
            Bundle bundle = new Bundle();
            bundle.putString("arg_serial_number", str);
            bundle.putString(PassCreateBleSecondFragment.ARG_DEVICE_MAC, str2);
            PassCreateBleSecondFragment passCreateBleSecondFragment = new PassCreateBleSecondFragment();
            passCreateBleSecondFragment.setArguments(bundle);
            return passCreateBleSecondFragment;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0092, code lost:
        if ((r0.length == 0) != false) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpenDoorClick() {
        /*
            r7 = this;
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentPassBleSecondBinding r0 = (p035ru.unicorn.databinding.FragmentPassBleSecondBinding) r0
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r0 = r0.buttonSend
            java.lang.String r1 = "viewDataBinding.buttonSend"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
            r0.setEnabled(r1)
            androidx.databinding.ViewDataBinding r0 = r7.getViewDataBinding()
            ru.unicorn.databinding.FragmentPassBleSecondBinding r0 = (p035ru.unicorn.databinding.FragmentPassBleSecondBinding) r0
            android.widget.ProgressBar r0 = r0.f6578pb
            java.lang.String r2 = "viewDataBinding.pb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r0.setVisibility(r1)
            java.util.List<ru.unicorn.ujin.ble.data.BleReader> r0 = r7.bleList
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r0 = r0.iterator()
        L_0x0036:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004a
            java.lang.Object r3 = r0.next()
            ru.unicorn.ujin.ble.data.BleReader r3 = (p035ru.unicorn.ujin.ble.data.BleReader) r3
            java.lang.String r3 = r3.getDeviceName()
            r2.add(r3)
            goto L_0x0036
        L_0x004a:
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object[] r0 = r2.toArray(r0)
            if (r0 == 0) goto L_0x00ab
            java.lang.String[] r0 = (java.lang.String[]) r0
            ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r2 = new ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral
            androidx.fragment.app.FragmentActivity r3 = r7.getActivity()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.String r4 = "activity!!"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            android.content.Context r3 = r3.getApplicationContext()
            ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleSecondFragment$onOpenDoorClick$1 r4 = new ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleSecondFragment$onOpenDoorClick$1
            r4.<init>(r7)
            ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentralCallback r4 = (p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentralCallback) r4
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            r2.<init>(r3, r4, r5)
            r7.central = r2
            ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r2 = r7.central
            if (r2 == 0) goto L_0x00aa
            boolean r2 = r2.isBluetoothEnabled()
            if (r2 == 0) goto L_0x00a0
            r2 = 1
            if (r0 == 0) goto L_0x0094
            int r3 = r0.length
            if (r3 != 0) goto L_0x0091
            r3 = 1
            goto L_0x0092
        L_0x0091:
            r3 = 0
        L_0x0092:
            if (r3 == 0) goto L_0x0095
        L_0x0094:
            r1 = 1
        L_0x0095:
            if (r1 == 0) goto L_0x0098
            return
        L_0x0098:
            ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r1 = r7.central
            if (r1 == 0) goto L_0x00aa
            r1.scanForPeripheralsWithNames(r0)
            goto L_0x00aa
        L_0x00a0:
            ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral r0 = r7.central
            if (r0 == 0) goto L_0x00a7
            r0.close()
        L_0x00a7:
            r7.enableBT()
        L_0x00aa:
            return
        L_0x00ab:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble.PassCreateBleSecondFragment.onOpenDoorClick():void");
    }

    private final void enableBT() {
        FragmentActivity activity = getActivity();
        Object systemService = activity != null ? activity.getSystemService("bluetooth") : null;
        if (systemService != null) {
            BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
            Intrinsics.checkNotNullExpressionValue(adapter, "bluetoothManager.adapter");
            if (!adapter.isEnabled()) {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    Intrinsics.checkNotNullExpressionValue(activity2, "it");
                    MaterialDialog.negativeButton$default(MaterialDialog.positiveButton$default(MaterialDialog.message$default(MaterialDialog.title$default(new MaterialDialog(activity2, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.dialog_bt_label_error_title), (String) null, 2, (Object) null), Integer.valueOf(R.string.dialog_bt_label_error_message), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.button_enable), (CharSequence) null, new PassCreateBleSecondFragment$enableBT$$inlined$let$lambda$1(this), 2, (Object) null), Integer.valueOf(R.string.button_CANCEL), (CharSequence) null, PassCreateBleSecondFragment$enableBT$1$2.INSTANCE, 2, (Object) null).show();
                    return;
                }
                return;
            }
            onOpenDoorClick();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
    }

    /* access modifiers changed from: private */
    public final void onGetPerifiral(BluetoothPeripheral bluetoothPeripheral) {
        String str;
        Object obj;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("arg_serial_number")) == null) {
            str = "";
        }
        Intrinsics.checkNotNullExpressionValue(str, "arguments?.getString(ARG_SERIAL_NUMBER)?:\"\"");
        Iterator it = this.bleList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String deviceMac = ((BleReader) obj).getDeviceMac();
            if (deviceMac != null) {
                String lowerCase = deviceMac.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                String address = bluetoothPeripheral.getAddress();
                Intrinsics.checkNotNullExpressionValue(address, "peripheral.address");
                if (address != null) {
                    String lowerCase2 = address.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    if (Intrinsics.areEqual((Object) lowerCase, (Object) lowerCase2)) {
                        break;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        BleReader bleReader = (BleReader) obj;
        if (bleReader != null) {
            Log.d("TAG", "MY BLE sn " + str.toString() + bleReader.getDeviceName() + ' ');
            ((PassProfileVM) getViewModell()).loadPassDeviceRemote(Util.toLongOrDefault(str, bleReader.getSerialNumber()));
        }
    }

    public void onSuccess(String str) {
        Intrinsics.checkNotNullParameter(str, "toString");
        DynamicBackgroundButton dynamicBackgroundButton = ((FragmentPassBleSecondBinding) getViewDataBinding()).buttonSend;
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "viewDataBinding.buttonSend");
        dynamicBackgroundButton.setEnabled(true);
        ProgressBar progressBar = ((FragmentPassBleSecondBinding) getViewDataBinding()).f6578pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "viewDataBinding.pb");
        progressBar.setVisibility(4);
        sendLog(str);
        showDialogMessage("Доступ по Bluetooth- ключу добавлен");
    }

    public void onFailure(String str) {
        Intrinsics.checkNotNullParameter(str, "toString");
        DynamicBackgroundButton dynamicBackgroundButton = ((FragmentPassBleSecondBinding) getViewDataBinding()).buttonSend;
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "viewDataBinding.buttonSend");
        dynamicBackgroundButton.setEnabled(true);
        ProgressBar progressBar = ((FragmentPassBleSecondBinding) getViewDataBinding()).f6578pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "viewDataBinding.pb");
        progressBar.setVisibility(4);
        sendLog(str);
        showDialogMessage("Ошибка добавления ключа");
    }

    public final void sendLog(String str) {
        Intrinsics.checkNotNullParameter(str, "toString");
        new RemoteRepository().inserLog(str);
    }

    public void onDestroyView() {
        BleWorkerImpl bleWorkerImpl = this.bleWorker;
        if (bleWorkerImpl != null) {
            bleWorkerImpl.onDestroy();
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
