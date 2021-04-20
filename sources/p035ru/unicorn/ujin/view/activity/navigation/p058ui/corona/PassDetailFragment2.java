package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.mobileid.Api;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentPassDetail2Binding;
import p035ru.unicorn.ujin.ble.BleWorkerImpl;
import p035ru.unicorn.ujin.ble.TransparentActivityKt;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.data.Enums;
import p035ru.unicorn.ujin.data.MyPassIn;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.p057di.koin.KoinData;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.LocationHelper;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.TermsActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassDetailFragment2$bleCallBack$2;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Pass;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.GateStatus;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble.BleEnable;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.view.toolbar.ToolbarsHelper;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000¿\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0011\u0018\u0000 x2\u00020\u00012\u00020\u0002:\u0001xB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010E\u001a\u00020FH\u0002J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0002J\b\u0010H\u001a\u00020FH\u0002J\u0006\u0010I\u001a\u00020FJ\b\u0010J\u001a\u00020FH\u0002J\b\u0010K\u001a\u00020FH\u0002J\b\u0010L\u001a\u00020FH\u0002J\b\u0010M\u001a\u00020!H\u0004J\b\u0010N\u001a\u00020FH\u0002J\b\u0010O\u001a\u00020\u001aH\u0014J&\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\b\u0010X\u001a\u00020FH\u0016J\u0010\u0010Y\u001a\u00020F2\u0006\u0010Z\u001a\u00020\u001aH\u0016J\u0010\u0010[\u001a\u00020F2\u0006\u0010\\\u001a\u00020\u001aH\u0002J\b\u0010]\u001a\u00020FH\u0002J\b\u0010^\u001a\u00020FH\u0002J-\u0010_\u001a\u00020F2\u0006\u0010`\u001a\u00020!2\u000e\u0010a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0b2\u0006\u0010c\u001a\u00020dH\u0016¢\u0006\u0002\u0010eJ\u0010\u0010f\u001a\u00020F2\u0006\u0010Z\u001a\u00020\u001aH\u0016J\u001a\u0010g\u001a\u00020F2\u0006\u0010h\u001a\u00020Q2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\b\u0010i\u001a\u00020.H\u0002J\b\u0010j\u001a\u00020FH\u0002J\b\u0010k\u001a\u00020FH\u0002J\b\u0010l\u001a\u00020FH\u0002J\u0012\u0010l\u001a\u00020F2\b\u0010m\u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u0010n\u001a\u00020F2\u000e\u0010o\u001a\n\u0012\u0004\u0012\u00020q\u0018\u00010pH\u0002J\b\u0010r\u001a\u00020FH\u0002J\b\u0010s\u001a\u00020FH\u0014J\b\u0010t\u001a\u00020FH\u0002J\u001b\u0010u\u001a\u00020F2\u000e\u0010v\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010b¢\u0006\u0002\u0010wR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R-\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!0)j\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!`*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u00103\u001a\u000204X.¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010<\u001a\u00020=8BX\u0002¢\u0006\f\n\u0004\b@\u0010\u0015\u001a\u0004\b>\u0010?R\u000e\u0010A\u001a\u00020BX.¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX.¢\u0006\u0002\n\u0000¨\u0006y"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassDetailFragment2;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "Lru/unicorn/ujin/ble/BleWorkerImpl$BleWorkerResult;", "()V", "beginScan", "Ljava/util/Date;", "getBeginScan", "()Ljava/util/Date;", "setBeginScan", "(Ljava/util/Date;)V", "binding", "Lru/unicorn/databinding/FragmentPassDetail2Binding;", "getBinding", "()Lru/unicorn/databinding/FragmentPassDetail2Binding;", "setBinding", "(Lru/unicorn/databinding/FragmentPassDetail2Binding;)V", "bleCallBack", "ru/unicorn/ujin/view/activity/navigation/ui/corona/PassDetailFragment2$bleCallBack$2$1", "getBleCallBack", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassDetailFragment2$bleCallBack$2$1;", "bleCallBack$delegate", "Lkotlin/Lazy;", "bleList", "", "Lru/unicorn/ujin/ble/data/BleReader;", "bleListMac", "", "bleWorker", "Lru/unicorn/ujin/ble/BleWorkerImpl;", "getBleWorker", "()Lru/unicorn/ujin/ble/BleWorkerImpl;", "bleWorker$delegate", "busyCount", "", "getBusyCount", "()I", "setBusyCount", "(I)V", "central", "Lru/unicorn/ujin/ble/ble_helper_class/BluetoothCentral;", "mapOfScanResult", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getMapOfScanResult", "()Ljava/util/HashMap;", "needDestroy", "", "getNeedDestroy", "()Z", "setNeedDestroy", "(Z)V", "passProfileVM", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "qr", "getQr", "()Ljava/lang/String;", "setQr", "(Ljava/lang/String;)V", "requestDialog", "Landroidx/appcompat/app/AlertDialog;", "uniqeGateValue", "", "getUniqeGateValue", "()J", "uniqeGateValue$delegate", "vm", "Lru/unicorn/ujin/data/profile/ProfileViewModel;", "vmCorona", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/CoronaViewModel;", "checkAllPermissions", "", "checkPermissionFirst", "enableBT", "enableSettingIcon", "finishMigration", "gateMigration", "getGateKey", "getLayoutRes", "initCentral", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFailure", "toString", "onGetPerifiral", "address", "onOpenDoorClick", "onOpenGateClick", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSuccess", "onViewCreated", "view", "permissionsGranted", "registerAppShortCat", "sendBarcodeToMail", "showBarcode", "url", "showDetail", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;", "showRequestSentMessage", "showToolbar", "startMigration", "startScaning", "deviceNameList", "([Ljava/lang/String;)V", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2 */
/* compiled from: PassDetailFragment2.kt */
public final class PassDetailFragment2 extends BaseFragment implements BleWorkerImpl.BleWorkerResult {
    public static final long CANCEL_DIALOG_DELAY = 3000;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int LOCATION_REQUEST_CODE = 51;
    public static final int LOCATION_REQUEST_CODE_FOR_GATE = 52;
    private HashMap _$_findViewCache;
    private Date beginScan = new Date();
    public FragmentPassDetail2Binding binding;
    private final Lazy bleCallBack$delegate = LazyKt.lazy(new PassDetailFragment2$bleCallBack$2(this));
    /* access modifiers changed from: private */
    public List<BleReader> bleList = new ArrayList();
    /* access modifiers changed from: private */
    public List<String> bleListMac = new ArrayList();
    private final Lazy bleWorker$delegate = LazyKt.lazy(new PassDetailFragment2$bleWorker$2(this));
    private int busyCount;
    /* access modifiers changed from: private */
    public BluetoothCentral central;
    private final HashMap<String, Integer> mapOfScanResult = new HashMap<>();
    private boolean needDestroy;
    /* access modifiers changed from: private */
    public PassProfileVM passProfileVM;

    /* renamed from: qr */
    private String f6750qr = "";
    /* access modifiers changed from: private */
    public AlertDialog requestDialog;
    private final Lazy uniqeGateValue$delegate = LazyKt.lazy(PassDetailFragment2$uniqeGateValue$2.INSTANCE);

    /* renamed from: vm */
    private ProfileViewModel f6751vm;
    private CoronaViewModel vmCorona;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[GateStatus.values().length];

        static {
            $EnumSwitchMapping$0[GateStatus.START_MIGRATION.ordinal()] = 1;
            $EnumSwitchMapping$0[GateStatus.FINISH_MIGRATION.ordinal()] = 2;
        }
    }

    private final PassDetailFragment2$bleCallBack$2.C58091 getBleCallBack() {
        return (PassDetailFragment2$bleCallBack$2.C58091) this.bleCallBack$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final BleWorkerImpl getBleWorker() {
        return (BleWorkerImpl) this.bleWorker$delegate.getValue();
    }

    private final long getUniqeGateValue() {
        return ((Number) this.uniqeGateValue$delegate.getValue()).longValue();
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
    public final int getLayoutRes() {
        return R.layout.fragment_pass_detail;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static final /* synthetic */ PassProfileVM access$getPassProfileVM$p(PassDetailFragment2 passDetailFragment2) {
        PassProfileVM passProfileVM2 = passDetailFragment2.passProfileVM;
        if (passProfileVM2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passProfileVM");
        }
        return passProfileVM2;
    }

    public final boolean getNeedDestroy() {
        return this.needDestroy;
    }

    public final void setNeedDestroy(boolean z) {
        this.needDestroy = z;
    }

    public final FragmentPassDetail2Binding getBinding() {
        FragmentPassDetail2Binding fragmentPassDetail2Binding = this.binding;
        if (fragmentPassDetail2Binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return fragmentPassDetail2Binding;
    }

    public final void setBinding(FragmentPassDetail2Binding fragmentPassDetail2Binding) {
        Intrinsics.checkNotNullParameter(fragmentPassDetail2Binding, "<set-?>");
        this.binding = fragmentPassDetail2Binding;
    }

    public final String getQr() {
        return this.f6750qr;
    }

    public final void setQr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f6750qr = str;
    }

    public final Date getBeginScan() {
        return this.beginScan;
    }

    public final void setBeginScan(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.beginScan = date;
    }

    public final HashMap<String, Integer> getMapOfScanResult() {
        return this.mapOfScanResult;
    }

    public final int getBusyCount() {
        return this.busyCount;
    }

    public final void setBusyCount(int i) {
        this.busyCount = i;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_pass_detail2, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "DataBindingUtil.inflate(…etail2, container, false)");
        this.binding = (FragmentPassDetail2Binding) inflate;
        initCentral();
        FragmentPassDetail2Binding fragmentPassDetail2Binding = this.binding;
        if (fragmentPassDetail2Binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return fragmentPassDetail2Binding.getRoot();
    }

    private final void initCentral() {
        Context applicationContext;
        BluetoothCentral bluetoothCentral = this.central;
        BluetoothCentral bluetoothCentral2 = null;
        if (bluetoothCentral != null) {
            if (bluetoothCentral != null) {
                bluetoothCentral.stopScan();
            }
            BluetoothCentral bluetoothCentral3 = this.central;
            if (bluetoothCentral3 != null) {
                bluetoothCentral3.close();
            }
            this.central = null;
        }
        FragmentActivity activity = getActivity();
        if (!(activity == null || (applicationContext = activity.getApplicationContext()) == null)) {
            bluetoothCentral2 = new BluetoothCentral(applicationContext, getBleCallBack(), new Handler(Looper.getMainLooper()));
        }
        this.central = bluetoothCentral2;
    }

    /* access modifiers changed from: private */
    public final void onOpenGateClick() {
        checkAllPermissions();
    }

    /* access modifiers changed from: private */
    public final void onOpenDoorClick() {
        LocationHelper locationHelper = LocationHelper.INSTANCE;
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        if (!locationHelper.isLocationEnabled(baseActivity)) {
            showMessage("Для работы сервиса требуется включить геолокацию");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onOpenDoorClick ");
        BluetoothCentral bluetoothCentral = this.central;
        sb.append(bluetoothCentral != null ? bluetoothCentral.hashCode() : 0);
        Log.d("TAG", sb.toString());
        Iterable<BleReader> iterable = this.bleList;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (BleReader deviceMac : iterable) {
            arrayList.add(deviceMac.getDeviceMac());
        }
        Collection arrayList2 = new ArrayList();
        Iterator it = ((List) arrayList).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((String) next).length() <= 0) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        Object[] array = ((List) arrayList2).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            this.beginScan = new Date();
            BluetoothCentral bluetoothCentral2 = this.central;
            if (bluetoothCentral2 == null || !bluetoothCentral2.isScanning()) {
                this.busyCount = 0;
            } else {
                this.busyCount++;
                if (this.busyCount > 1) {
                    this.busyCount = 0;
                    initCentral();
                    startScaning(strArr);
                }
            }
            startScaning(strArr);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void startScaning(String[] strArr) {
        BluetoothCentral bluetoothCentral;
        BluetoothCentral bluetoothCentral2 = this.central;
        if (bluetoothCentral2 == null) {
            return;
        }
        if (bluetoothCentral2.isBluetoothEnabled() && bluetoothCentral2.permissionsGranted()) {
            showRequestSentMessage();
            if (strArr != null) {
                if ((!(strArr.length == 0)) && (bluetoothCentral = this.central) != null) {
                    bluetoothCentral.scanForPeripheralsWithAddresses(strArr);
                }
            }
        } else if (!bluetoothCentral2.isBluetoothEnabled()) {
            BluetoothCentral bluetoothCentral3 = this.central;
            if (bluetoothCentral3 != null) {
                bluetoothCentral3.close();
            }
            enableBT();
        } else {
            requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 51);
        }
    }

    private final void showRequestSentMessage() {
        AlertDialog alertDialog;
        new Handler().postDelayed(new PassDetailFragment2$showRequestSentMessage$1(this), CANCEL_DIALOG_DELAY);
        if (this.requestDialog == null) {
            this.requestDialog = new AlertDialog.Builder(getBaseActivity()).setMessage((int) R.string.request_sent).setPositiveButton((int) R.string.button_ok, (DialogInterface.OnClickListener) PassDetailFragment2$showRequestSentMessage$2.INSTANCE).create();
        }
        AlertDialog alertDialog2 = this.requestDialog;
        if (alertDialog2 != null && !alertDialog2.isShowing() && (alertDialog = this.requestDialog) != null) {
            alertDialog.show();
        }
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
                    MaterialDialog.negativeButton$default(MaterialDialog.positiveButton$default(MaterialDialog.message$default(MaterialDialog.title$default(new MaterialDialog(activity2, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.dialog_bt_label_error_title), (String) null, 2, (Object) null), Integer.valueOf(R.string.dialog_bt_label_error_message), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.button_enable), (CharSequence) null, new PassDetailFragment2$enableBT$$inlined$let$lambda$1(this), 2, (Object) null), Integer.valueOf(R.string.button_CANCEL), (CharSequence) null, PassDetailFragment2$enableBT$1$2.INSTANCE, 2, (Object) null).show();
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
    public final void onGetPerifiral(String str) {
        Object obj;
        Log.d("TAG", "MY address " + str + ' ');
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
                if (str != null) {
                    String lowerCase2 = str.toLowerCase();
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
            Log.d("TAG", "MY BLE 1 " + bleReader + ' ');
            showRequestSentMessage();
            ProfileViewModel profileViewModel = this.f6751vm;
            if (profileViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
            }
            profileViewModel.loadPassDeviceRemote(bleReader.getSerialNumber());
            ProfileViewModel profileViewModel2 = this.f6751vm;
            if (profileViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
            }
            ExtensionKt.observe((Fragment) this, profileViewModel2.getCurrentBleDevice(), new PassDetailFragment2$onGetPerifiral$$inlined$let$lambda$1(bleReader, this));
        }
    }

    private final void sendBarcodeToMail() {
        ProfileViewModel profileViewModel = this.f6751vm;
        if (profileViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        profileViewModel.onSendToMailClick();
        ProfileViewModel profileViewModel2 = this.f6751vm;
        if (profileViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        profileViewModel2.showError.observe(getViewLifecycleOwner(), new PassDetailFragment2$sendBarcodeToMail$1(this));
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Fragment fragment = this;
        ViewModel viewModel = ViewModelProviders.m11of(fragment, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(ProfileViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…ileViewModel::class.java)");
        this.f6751vm = (ProfileViewModel) viewModel;
        FragmentPassDetail2Binding fragmentPassDetail2Binding = this.binding;
        if (fragmentPassDetail2Binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        ProfileViewModel profileViewModel = this.f6751vm;
        if (profileViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        fragmentPassDetail2Binding.setVm(profileViewModel);
        ProfileViewModel profileViewModel2 = this.f6751vm;
        if (profileViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        MyPassIn myPassIn = profileViewModel2.getPass().get();
        String valueOf = String.valueOf(myPassIn != null ? Integer.valueOf(myPassIn.getId()) : null);
        if (valueOf == null) {
            valueOf = "";
        }
        this.f6750qr = valueOf;
        ViewModel viewModel2 = ViewModelProviders.m11of(fragment, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(PassProfileVM.class);
        Intrinsics.checkNotNullExpressionValue(viewModel2, "ViewModelProviders.of(th…assProfileVM::class.java)");
        this.passProfileVM = (PassProfileVM) viewModel2;
        ViewModel viewModel3 = ViewModelProviders.m11of(fragment, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(CoronaViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel3, "ViewModelProviders.of(th…onaViewModel::class.java)");
        this.vmCorona = (CoronaViewModel) viewModel3;
        CoronaViewModel coronaViewModel = this.vmCorona;
        if (coronaViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vmCorona");
        }
        coronaViewModel.getBarcode(this.f6750qr);
        CoronaViewModel coronaViewModel2 = this.vmCorona;
        if (coronaViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vmCorona");
        }
        coronaViewModel2.getQrCOde().observe(getViewLifecycleOwner(), new PassDetailFragment2$onViewCreated$1(this));
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbar");
        ExtensionKt.setVisible(progressBar, true);
        ProfileViewModel profileViewModel3 = this.f6751vm;
        if (profileViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        profileViewModel3.loadAllBleDevice();
        ProfileViewModel profileViewModel4 = this.f6751vm;
        if (profileViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        ExtensionKt.observe((Fragment) this, profileViewModel4.getAllBleDevice(), new PassDetailFragment2$onViewCreated$2(this));
        PassProfileVM passProfileVM2 = this.passProfileVM;
        if (passProfileVM2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passProfileVM");
        }
        ExtensionKt.observe((Fragment) this, passProfileVM2.getAllAssignKey(), new PassDetailFragment2$onViewCreated$3(this));
        ProfileViewModel profileViewModel5 = this.f6751vm;
        if (profileViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        ExtensionKt.observe((Fragment) this, profileViewModel5.getCurrentBleDevice(), new PassDetailFragment2$onViewCreated$4(this));
        PassProfileVM passProfileVM3 = this.passProfileVM;
        if (passProfileVM3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passProfileVM");
        }
        ExtensionKt.observe((Fragment) this, passProfileVM3.getAssignKeys(), new PassDetailFragment2$onViewCreated$5(this));
        PassProfileVM passProfileVM4 = this.passProfileVM;
        if (passProfileVM4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passProfileVM");
        }
        ExtensionKt.observe((Fragment) this, passProfileVM4.getAvailablePassType(), new PassDetailFragment2$onViewCreated$6(this));
        ProfileViewModel profileViewModel6 = this.f6751vm;
        if (profileViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        profileViewModel6.loadPassDeviceRemote();
        ProfileViewModel profileViewModel7 = this.f6751vm;
        if (profileViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        ExtensionKt.observe((Fragment) this, profileViewModel7.getHasBleDevice(), new PassDetailFragment2$onViewCreated$7(this));
        PassProfileVM passProfileVM5 = this.passProfileVM;
        if (passProfileVM5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("passProfileVM");
        }
        ExtensionKt.observe((Fragment) this, passProfileVM5.getSaveBleGateResult(), new PassDetailFragment2$onViewCreated$8(this));
    }

    /* access modifiers changed from: private */
    public final void startMigration() {
        boolean z = false;
        String string = getBaseActivity().getSharedPreferences(getString(R.string.app_name_app), 0).getString(ProfileLocalRepository.Companion.getInstance().getUserToken(), "");
        if (string != null) {
            if (string.length() == 0) {
                z = true;
            }
            if (z) {
                PassProfileVM passProfileVM2 = this.passProfileVM;
                if (passProfileVM2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("passProfileVM");
                }
                passProfileVM2.migrateKey(getUniqeGateValue());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void finishMigration() {
        boolean z = false;
        SharedPreferences sharedPreferences = getBaseActivity().getSharedPreferences(getString(R.string.app_name_app), 0);
        String userToken = ProfileLocalRepository.Companion.getInstance().getUserToken();
        String string = sharedPreferences.getString(userToken, "");
        if (string != null) {
            if (string.length() == 0) {
                z = true;
            }
            if (z) {
                sharedPreferences.edit().putString(userToken, String.valueOf(getUniqeGateValue())).apply();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void getGateKey() {
        if (KoinData.INSTANCE.isInit()) {
            Api api = Api.INSTANCE;
            BaseActivity baseActivity = getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            if (api.getDefaultKey(baseActivity) != null) {
                DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.openDoor);
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "openDoor");
                dynamicBackgroundButton.setVisibility(0);
                FragmentPassDetail2Binding fragmentPassDetail2Binding = this.binding;
                if (fragmentPassDetail2Binding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                fragmentPassDetail2Binding.openDoor.setOnClickListener(new PassDetailFragment2$getGateKey$$inlined$let$lambda$1(this));
                gateMigration();
            } else {
                DynamicBackgroundButton dynamicBackgroundButton2 = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.openDoor);
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "openDoor");
                dynamicBackgroundButton2.setVisibility(8);
            }
            Api api2 = Api.INSTANCE;
            BaseActivity baseActivity2 = getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
            Boolean valueOf = Boolean.valueOf(api2.isRequestAccessByScreenOnEnabled(baseActivity2));
            valueOf.booleanValue();
            if (valueOf != null) {
                valueOf.booleanValue();
                FragmentPassDetail2Binding fragmentPassDetail2Binding2 = this.binding;
                if (fragmentPassDetail2Binding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                fragmentPassDetail2Binding2.openDoor.setOnClickListener(new PassDetailFragment2$getGateKey$$inlined$let$lambda$2(this));
            }
        }
    }

    private final void gateMigration() {
        startMigration();
    }

    /* access modifiers changed from: private */
    public final void registerAppShortCat() {
        if (Build.VERSION.SDK_INT >= 25) {
            FragmentActivity activity = getActivity();
            ShortcutManager shortcutManager = activity != null ? (ShortcutManager) activity.getSystemService(ShortcutManager.class) : null;
            ShortcutInfo.Builder icon = new ShortcutInfo.Builder(getActivity(), "superID").setShortLabel(getString(R.string.label_short_my_pass_shortcut)).setIcon(Icon.createWithResource(getActivity(), R.drawable.ic_svg_qr));
            Intent intent = new Intent(getActivity(), TermsActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(32768);
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra(Enums.PushClickEventType.Companion.getEVENT_KEY(), Enums.PushClickEventType.PASS_SHOW_MY.getEventValue());
            Unit unit = Unit.INSTANCE;
            ShortcutInfo build = icon.setIntent(intent).build();
            Intrinsics.checkNotNullExpressionValue(build, "ShortcutInfo.Builder(act…                 .build()");
            if (shortcutManager != null) {
                shortcutManager.addDynamicShortcuts(Collections.singletonList(build));
            }
        }
    }

    private final void showDetail(Resource<Pass> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null && status.equals(Resource.Status.SUCCESS)) {
            this.f6750qr = resource.getData().getQr();
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_my_pass));
    }

    public final void enableSettingIcon() {
        ArrayList<View> createSingleButton = new ToolbarsHelper(getActivity()).createSingleButton(R.drawable.ic_svg_settings);
        if (createSingleButton != null) {
            getBaseActivity().setToolbarRight(createSingleButton);
            createSingleButton.get(0).setOnClickListener(new PassDetailFragment2$enableSettingIcon$$inlined$let$lambda$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void showBarcode(String str) {
        CharSequence charSequence = str;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            ImageView imageView = (ImageView) _$_findCachedViewById(C5619R.C5622id.barcode);
            Intrinsics.checkNotNullExpressionValue(imageView, "barcode");
            imageView.setVisibility(8);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(GlideApp.with((View) (ImageView) _$_findCachedViewById(C5619R.C5622id.barcode)).load(str).placeholder((int) R.drawable.ic_svg_zaglushka).diskCacheStrategy(DiskCacheStrategy.ALL).listener((RequestListener) new PassDetailFragment2$showBarcode$1(this)).into((ImageView) _$_findCachedViewById(C5619R.C5622id.barcode)), "GlideApp.with(barcode)\n …           .into(barcode)");
    }

    private final void showBarcode() {
        nextFragment(PassBarcodeFragment.Companion.start(this.f6750qr), false);
    }

    public void onSuccess(String str) {
        Intrinsics.checkNotNullParameter(str, "toString");
        FragmentPassDetail2Binding fragmentPassDetail2Binding = this.binding;
        if (fragmentPassDetail2Binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        DynamicBackgroundButton dynamicBackgroundButton = fragmentPassDetail2Binding.openDoor;
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "binding.openDoor");
        dynamicBackgroundButton.setEnabled(true);
    }

    public void onFailure(String str) {
        Intrinsics.checkNotNullParameter(str, "toString");
        FragmentPassDetail2Binding fragmentPassDetail2Binding = this.binding;
        if (fragmentPassDetail2Binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        DynamicBackgroundButton dynamicBackgroundButton = fragmentPassDetail2Binding.openDoor;
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "binding.openDoor");
        dynamicBackgroundButton.setEnabled(true);
    }

    public void onDestroyView() {
        BleWorkerImpl bleWorker = getBleWorker();
        if (bleWorker != null) {
            bleWorker.onDestroy();
        }
        BluetoothCentral bluetoothCentral = this.central;
        if (bluetoothCentral != null) {
            bluetoothCentral.stopScan();
        }
        BluetoothCentral bluetoothCentral2 = this.central;
        if (bluetoothCentral2 != null) {
            bluetoothCentral2.close();
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 51) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                onOpenDoorClick();
            }
        } else if (i == 52) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                DialogHelper.showDialog(getBaseActivity(), getString(R.string.rationale_enable_geo_2), R.string.button_enable, R.string.cancel, new PassDetailFragment2$onRequestPermissionsResult$1(this));
            } else if (KoinData.INSTANCE.isInit()) {
                Api api = Api.INSTANCE;
                BaseActivity baseActivity = getBaseActivity();
                Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
                Api.requestAccess$default(api, baseActivity, (String) null, 2, (Object) null);
            }
        }
    }

    private final void checkAllPermissions() {
        Collection checkPermissionFirst = checkPermissionFirst();
        if (!checkPermissionFirst.isEmpty()) {
            Object[] array = checkPermissionFirst.toArray(new String[0]);
            if (array != null) {
                requestPermissions((String[]) array, 52);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        BleEnable bleEnable = BleEnable.INSTANCE;
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        if (!bleEnable.checkIsEnable(baseActivity)) {
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), TransparentActivityKt.REQUEST_ENABLE_BT);
            return;
        }
        LocationHelper locationHelper = LocationHelper.INSTANCE;
        BaseActivity baseActivity2 = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
        if (!locationHelper.isLocationEnableChecker(baseActivity2)) {
            DialogHelper.showDialog(getActivity(), getString(R.string.rationale_enable_geo), R.string.button_enable, R.string.cancel, new PassDetailFragment2$checkAllPermissions$1(this));
        } else if (KoinData.INSTANCE.isInit()) {
            Api api = Api.INSTANCE;
            BaseActivity baseActivity3 = getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity3, "baseActivity");
            Api.requestAccess$default(api, baseActivity3, (String) null, 2, (Object) null);
        }
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

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassDetailFragment2$Companion;", "", "()V", "CANCEL_DIALOG_DELAY", "", "LOCATION_REQUEST_CODE", "", "LOCATION_REQUEST_CODE_FOR_GATE", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2$Companion */
    /* compiled from: PassDetailFragment2.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
