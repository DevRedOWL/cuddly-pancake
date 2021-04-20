package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import com.google.zxing.Result;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.mobileid.Api;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentPassBleQrBinding;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.GateStatus;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;
import p051me.dm7.barcodescanner.zxing.ZXingScannerView;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0002H\u0014J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0016H\u0002J\b\u0010#\u001a\u00020\u0012H\u0002R\u0012\u0010\u0007\u001a\u00020\bX\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassCreateBleQRFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassBleQrBinding;", "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "uniqeGateValue", "", "getUniqeGateValue", "()J", "uniqeGateValue$delegate", "Lkotlin/Lazy;", "finishMigration", "", "getLayoutRes", "", "getMyToolbarTitle", "", "handleResult", "rawResult", "Lcom/google/zxing/Result;", "onFileChoose", "filePath", "onPause", "onResume", "onStop", "onViewCreated", "viewModell", "showDialogMessage", "label", "startMigration", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleQRFragment */
/* compiled from: PassCreateBleQRFragment.kt */
public final class PassCreateBleQRFragment extends BaseBindingFragment<PassProfileVM, FragmentPassBleQrBinding> implements ZXingScannerView.ResultHandler, CoroutineScope {
    private final /* synthetic */ CoroutineScope $$delegate_0 = CoroutineScopeKt.MainScope();
    private HashMap _$_findViewCache;
    private final Lazy uniqeGateValue$delegate = LazyKt.lazy(PassCreateBleQRFragment$uniqeGateValue$2.INSTANCE);

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleQRFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[GateStatus.values().length];

        static {
            $EnumSwitchMapping$0[GateStatus.START_MIGRATION.ordinal()] = 1;
            $EnumSwitchMapping$0[GateStatus.FINISH_MIGRATION.ordinal()] = 2;
            $EnumSwitchMapping$0[GateStatus.SUCCESS.ordinal()] = 3;
            $EnumSwitchMapping$0[GateStatus.ERROR.ordinal()] = 4;
        }
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

    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_pass_ble_qr;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassProfileVM passProfileVM) {
        Intrinsics.checkNotNullParameter(passProfileVM, "viewModell");
        passProfileVM.startObserve();
        ExtensionKt.observe((Fragment) this, passProfileVM.getRequestAccessState(), PassCreateBleQRFragment$onViewCreated$1.INSTANCE);
        ExtensionKt.observe((Fragment) this, passProfileVM.getSaveBleGateResult(), new PassCreateBleQRFragment$onViewCreated$2(this));
        ((FragmentPassBleQrBinding) getViewDataBinding()).addBle.setOnClickListener(new PassCreateBleQRFragment$onViewCreated$3(this));
    }

    /* access modifiers changed from: private */
    public final void showDialogMessage(String str) {
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(baseActivity);
            builder.setPositiveButton((CharSequence) "Ok", (DialogInterface.OnClickListener) new PassCreateBleQRFragment$showDialogMessage$$inlined$let$lambda$1(this, str));
            builder.setMessage((CharSequence) str);
            builder.setCancelable(false);
            AlertDialog create = builder.create();
            Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
            if (!create.isShowing()) {
                create.show();
            }
        }
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
                ((PassProfileVM) getViewModell()).migrateKey(getUniqeGateValue());
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

    public void onResume() {
        super.onResume();
        Api api = Api.INSTANCE;
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        if (api.getDefaultKey(baseActivity) != null) {
            ((FragmentPassBleQrBinding) getViewDataBinding()).cameraView.stopCamera();
            String string = getString(R.string.already_has_key);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.already_has_key)");
            showDialogMessage(string);
            return;
        }
        ((FragmentPassBleQrBinding) getViewDataBinding()).cameraView.setResultHandler(this);
        ((FragmentPassBleQrBinding) getViewDataBinding()).cameraView.startCamera(0);
    }

    public void onPause() {
        super.onPause();
        ((FragmentPassBleQrBinding) getViewDataBinding()).cameraView.stopCamera();
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_pass);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_pass)");
        return string;
    }

    public void handleResult(Result result) {
        String text;
        if (result != null && (text = result.getText()) != null) {
            ((PassProfileVM) getViewModell()).onBarcodeRecieve(text);
        }
    }

    public void onStop() {
        super.onStop();
        ((PassProfileVM) getViewModell()).removeGateObserve();
    }
}
