package p035ru.unicorn.ujin.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ble.BleWorkerImpl;
import p035ru.unicorn.ujin.data.Enums;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\rH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/ble/TransparentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lru/unicorn/ujin/ble/BleWorkerImpl$BleWorkerResult;", "()V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "profileViewModel", "Lru/unicorn/ujin/data/profile/ProfileViewModel;", "gotoBTSettings", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFailure", "toString", "", "onSuccess", "startScanBT", "startWork", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.TransparentActivity */
/* compiled from: TransparentActivity.kt */
public final class TransparentActivity extends AppCompatActivity implements BleWorkerImpl.BleWorkerResult {
    private HashMap _$_findViewCache;
    public Handler handler;
    private ProfileViewModel profileViewModel;

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
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Handler getHandler() {
        Handler handler2 = this.handler;
        if (handler2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
        }
        return handler2;
    }

    public final void setHandler(Handler handler2) {
        Intrinsics.checkNotNullParameter(handler2, "<set-?>");
        this.handler = handler2;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_transparent);
        ViewModel viewModel = ViewModelProviders.m13of((FragmentActivity) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(ProfileViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…ileViewModel::class.java]");
        this.profileViewModel = (ProfileViewModel) viewModel;
        if (!getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            finishAndRemoveTask();
        }
        startWork();
    }

    private final void startWork() {
        Object systemService = getSystemService("bluetooth");
        if (systemService != null) {
            BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
            Intrinsics.checkNotNullExpressionValue(adapter, "bluetoothManager.adapter");
            if (!adapter.isEnabled()) {
                MaterialDialog.negativeButton$default(MaterialDialog.positiveButton$default(MaterialDialog.message$default(MaterialDialog.title$default(new MaterialDialog(this, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.dialog_bt_label_error_title), (String) null, 2, (Object) null), Integer.valueOf(R.string.dialog_bt_label_error_message), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.button_enable), (CharSequence) null, new TransparentActivity$startWork$1(this), 2, (Object) null), Integer.valueOf(R.string.button_CANCEL), (CharSequence) null, new TransparentActivity$startWork$2(this), 2, (Object) null).show();
                return;
            }
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.f6517pb);
            Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
            ExtensionKt.setVisible(progressBar, true);
            startScanBT();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
    }

    private final void startScanBT() {
        Intent intent = getIntent();
        if (intent != null) {
            long longExtra = intent.getLongExtra(Enums.PushClickEventType.BLE_ACTION_BY_CLICK.getEventTypeID(), 0);
            if (longExtra != 0) {
                ProfileViewModel profileViewModel2 = this.profileViewModel;
                if (profileViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("profileViewModel");
                }
                profileViewModel2.loadPassDeviceRemote(longExtra);
                ProfileViewModel profileViewModel3 = this.profileViewModel;
                if (profileViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("profileViewModel");
                }
                ExtensionKt.observe((AppCompatActivity) this, profileViewModel3.getCurrentBleDevice(), new TransparentActivity$startScanBT$$inlined$let$lambda$1(longExtra, this));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void gotoBTSettings() {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), TransparentActivityKt.REQUEST_ENABLE_BT);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 435) {
            startWork();
        }
    }

    public void onSuccess(String str) {
        Intrinsics.checkNotNullParameter(str, "toString");
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.f6517pb);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        ExtensionKt.setVisible(progressBar, false);
        finishAndRemoveTask();
    }

    public void onFailure(String str) {
        Intrinsics.checkNotNullParameter(str, "toString");
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.f6517pb);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        ExtensionKt.setVisible(progressBar, false);
        finishAndRemoveTask();
    }
}
