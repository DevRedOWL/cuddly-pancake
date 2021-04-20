package p035ru.unicorn.ujin.view.activity.sapfir;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.loopj.android.http.AsyncHttpClient;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.RegViewModel;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.viewModel.events.GetHardwareCountEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0014J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010 \u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0002J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0002J\u0012\u0010+\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0010\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\rH\u0002J\u0010\u00100\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\rH\u0002J\b\u00101\u001a\u00020\u0016H\u0002J\b\u00102\u001a\u00020\u0016H\u0014J\u0018\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u0002052\u0006\u0010)\u001a\u00020*H\u0004J\b\u00106\u001a\u00020%H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u00068"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/sapfir/SapfirRegistrationActivity;", "Lru/unicorn/ujin/view/activity/BaseActivity;", "()V", "editSMSWatcher", "Landroid/text/TextWatcher;", "getEditSMSWatcher$app_kortrosRelease", "()Landroid/text/TextWatcher;", "setEditSMSWatcher$app_kortrosRelease", "(Landroid/text/TextWatcher;)V", "editTextWatcher", "getEditTextWatcher$app_kortrosRelease", "setEditTextWatcher$app_kortrosRelease", "prefix", "", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "token", "getToken", "setToken", "applyFlat", "", "flatUserToken", "stage", "", "exit", "it", "getBottomNavigationMenuId", "handleBackClick", "handleButtonEnterClick", "handleGetUser", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "handleHardwareCount", "Lru/unicorn/ujin/viewModel/events/GetHardwareCountEvent;", "hasBottomSheet", "", "isEditTextsValid", "showMessages", "keyboardShown", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "registerMSF", "url", "registerStep2", "sendSMSCode", "showChatsFragment", "showKeyboard", "activity", "Landroid/app/Activity;", "validateLogin", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.sapfir.SapfirRegistrationActivity */
/* compiled from: SapfirRegistrationActivity.kt */
public final class SapfirRegistrationActivity extends BaseActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int REGISTRATION_REQUEST_CODE = 1;
    private HashMap _$_findViewCache;
    private TextWatcher editSMSWatcher = new SapfirRegistrationActivity$editSMSWatcher$1(this);
    private TextWatcher editTextWatcher = new SapfirRegistrationActivity$editTextWatcher$1(this);
    public String prefix;
    public String token;

    @JvmStatic
    public static final void startForResult(Activity activity) {
        Companion.startForResult(activity);
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
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public int getBottomNavigationMenuId() {
        return 0;
    }

    public boolean hasBottomSheet() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void showChatsFragment() {
    }

    public final String getToken() {
        String str = this.token;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("token");
        }
        return str;
    }

    public final void setToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public final String getPrefix() {
        String str = this.prefix;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefix");
        }
        return str;
    }

    public final void setPrefix(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.prefix = str;
    }

    public final TextWatcher getEditTextWatcher$app_kortrosRelease() {
        return this.editTextWatcher;
    }

    public final void setEditTextWatcher$app_kortrosRelease(TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "<set-?>");
        this.editTextWatcher = textWatcher;
    }

    public final TextWatcher getEditSMSWatcher$app_kortrosRelease() {
        return this.editSMSWatcher;
    }

    public final void setEditSMSWatcher$app_kortrosRelease(TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "<set-?>");
        this.editSMSWatcher = textWatcher;
    }

    /* access modifiers changed from: private */
    public final void sendSMSCode() {
        hideSoftKeyboard(this);
        StringBuilder sb = new StringBuilder();
        String str = this.prefix;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefix");
        }
        sb.append(str);
        sb.append("auth/registry-step-2/");
        sb.append("?login=");
        EditText editText = (EditText) _$_findCachedViewById(C5619R.C5622id.editTextLogin);
        Intrinsics.checkNotNullExpressionValue(editText, "editTextLogin");
        sb.append(editText.getText());
        sb.append("&code=");
        EditText editText2 = (EditText) _$_findCachedViewById(C5619R.C5622id.editTextSMS);
        Intrinsics.checkNotNullExpressionValue(editText2, "editTextSMS");
        sb.append(editText2.getText());
        sb.append("&app=sapfir");
        String sb2 = sb.toString();
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(0);
        registerStep2(sb2);
    }

    private final void registerStep2(String str) {
        ((EditText) _$_findCachedViewById(C5619R.C5622id.editTextSMS)).setText("");
        new AsyncHttpClient(true, 80, 443).get(str, new SapfirRegistrationActivity$registerStep2$1(this));
    }

    /* access modifiers changed from: private */
    public final void handleGetUser(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            ViewModel viewModel = ViewModelProviders.m12of((FragmentActivity) this).get(RegViewModel.class);
            Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…RegViewModel::class.java)");
            ((RegViewModel) viewModel).sendFCMToken(false);
            setResult(-1);
            finish();
            return;
        }
        showMessage(updateEvent.getMessage());
    }

    private final void applyFlat(String str, int i) {
        this.profileViewModel.applyFlat(str, i);
        setResult(-1, getIntent());
        finish();
    }

    private final void handleHardwareCount(GetHardwareCountEvent getHardwareCountEvent) {
        if (getHardwareCountEvent.getSuccess()) {
            Integer count = getHardwareCountEvent.getCount();
            if (count != null) {
                exit(count.intValue());
            } else {
                exit(0);
            }
            exit(0);
        } else {
            Toast.makeText(getApplicationContext(), getHardwareCountEvent.getMessage(), 1).show();
        }
        this.viewModel.getGetHardwareMutableLiveData().removeObservers(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        setContentView((int) R.layout.activity_sapfir_registration);
        this.prefix = "https://api-product.mysmartflat.ru/api/";
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(4);
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonEnter)).setOnClickListener(new SapfirRegistrationActivity$onCreate$1(this));
        ((EditText) _$_findCachedViewById(C5619R.C5622id.editTextLogin)).addTextChangedListener(this.editTextWatcher);
        this.editTextWatcher.onTextChanged("", 0, 0, 0);
        ((EditText) _$_findCachedViewById(C5619R.C5622id.editTextSMS)).addTextChangedListener(this.editSMSWatcher);
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvResendSMS)).setOnClickListener(new SapfirRegistrationActivity$onCreate$2(this));
        ((AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivBack)).setOnClickListener(new SapfirRegistrationActivity$onCreate$3(this));
    }

    /* access modifiers changed from: private */
    public final void handleBackClick() {
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C5619R.C5622id.rlRegistrationStep1);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlRegistrationStep1");
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(C5619R.C5622id.rlRegistrationStep2);
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlRegistrationStep2");
        relativeLayout2.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void handleButtonEnterClick() {
        if (isEditTextsValid(true)) {
            hideSoftKeyboard(this);
            StringBuilder sb = new StringBuilder();
            String str = this.prefix;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prefix");
            }
            sb.append(str);
            sb.append("auth/registry-step-1/");
            sb.append("?login=");
            EditText editText = (EditText) _$_findCachedViewById(C5619R.C5622id.editTextLogin);
            Intrinsics.checkNotNullExpressionValue(editText, "editTextLogin");
            sb.append(editText.getText());
            sb.append("&app=sapfir");
            registerMSF(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public final boolean isEditTextsValid(boolean z) {
        boolean validateLogin = validateLogin();
        if (z && !validateLogin) {
            Toast.makeText(getApplicationContext(), R.string.checkLogin, 1).show();
        }
        return validateLogin;
    }

    private final boolean validateLogin() {
        EditText editText = (EditText) _$_findCachedViewById(C5619R.C5622id.editTextLogin);
        Intrinsics.checkNotNullExpressionValue(editText, "editTextLogin");
        return AppUtils.isPhoneValid(editText.getText().toString());
    }

    /* access modifiers changed from: protected */
    public final void showKeyboard(Activity activity, View view) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "rootView");
        if (!keyboardShown(view)) {
            Object systemService = activity.getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).showSoftInput(view, 1);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    private final boolean keyboardShown(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "rootView.resources");
        return ((float) (view.getBottom() - rect.bottom)) > ((float) 100) * resources.getDisplayMetrics().density;
    }

    private final void registerMSF(String str) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(0);
        new AsyncHttpClient(true, 80, 443).get(str, new SapfirRegistrationActivity$registerMSF$1(this));
    }

    /* access modifiers changed from: private */
    public final void exit(int i) {
        Intent intent = new Intent();
        intent.putExtra("deviceCount", i);
        setResult(-1, intent);
        finish();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/sapfir/SapfirRegistrationActivity$Companion;", "", "()V", "REGISTRATION_REQUEST_CODE", "", "hideSoftKeyboard", "", "activity", "Landroid/app/Activity;", "startForResult", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.sapfir.SapfirRegistrationActivity$Companion */
    /* compiled from: SapfirRegistrationActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void startForResult(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivityForResult(new Intent(activity, SapfirRegistrationActivity.class), 1);
        }

        public final void hideSoftKeyboard(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Object systemService = activity.getSystemService("input_method");
            if (systemService != null) {
                View currentFocus = activity.getCurrentFocus();
                Intrinsics.checkNotNull(currentFocus);
                Intrinsics.checkNotNullExpressionValue(currentFocus, "activity.currentFocus!!");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }
}
