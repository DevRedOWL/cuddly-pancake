package p035ru.unicorn.ujin.view.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.ActivityRegistrationBinding;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.Constants;
import p035ru.unicorn.ujin.data.Profile;
import p035ru.unicorn.ujin.data.api.response.authorization.Register2coreResponseData;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.util.Validator;
import p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.RegViewModel;
import p035ru.unicorn.ujin.view.dialogs.ConfirmRegistrationDialogFragment;
import p035ru.unicorn.ujin.view.dialogs.ConfirmTermsDialog;
import p035ru.unicorn.ujin.view.dialogs.RestorePassDialog;
import p035ru.unicorn.ujin.view.dialogs.SuccessRegistrationDialogFragment;
import p035ru.unicorn.ujin.view.fragments.FlatFragment;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010!H\u0002J\u0018\u0010\"\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010!H\u0002J\b\u0010$\u001a\u00020\rH\u0016J\b\u0010%\u001a\u00020\u0011H\u0002J\b\u0010&\u001a\u00020\rH\u0002J\b\u0010'\u001a\u00020\u0011H\u0002J\u0018\u0010'\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0013H\u0002J\b\u0010)\u001a\u00020\u0011H\u0002J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\rH\u0002J\u0012\u0010,\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0010\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u0013H\u0002J \u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u0013H\u0002J\b\u00108\u001a\u00020\u0011H\u0016J\b\u00109\u001a\u00020\u0011H\u0002J\b\u0010:\u001a\u00020\u0011H\u0002J\b\u0010;\u001a\u00020\u0011H\u0014J\b\u0010<\u001a\u00020\u0011H\u0002J\b\u0010=\u001a\u00020\u0011H\u0002J\u0012\u0010>\u001a\u00020\u00112\b\u00103\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010?\u001a\u00020\u0011H\u0002J\b\u0010@\u001a\u00020\u0011H\u0002J\u0010\u0010A\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u0013H\u0002J\b\u0010C\u001a\u00020\u0011H\u0002J\u0017\u0010D\u001a\u00020\u00112\b\u0010E\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010FJ\b\u0010G\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006H"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/RegistrationActivity;", "Lru/unicorn/ujin/view/activity/BaseActivity;", "Lru/unicorn/ujin/view/dialogs/RestorePassDialog$ProceedDueToAppLvl;", "()V", "binding", "Lru/unicorn/databinding/ActivityRegistrationBinding;", "confirmDialog", "Lru/unicorn/ujin/view/dialogs/ConfirmRegistrationDialogFragment;", "confirmTermsDialog", "Lru/unicorn/ujin/view/dialogs/ConfirmTermsDialog;", "editTextWatcher", "Landroid/text/TextWatcher;", "passwordIsVisible", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "applyFlat", "", "flatUserToken", "", "stage", "", "checkValidData", "forgotPassClickListener", "getBottomNavigationMenuId", "getLoginValue", "gotoFlat", "handleButtonEnterClick", "handleLogin", "updateEvent", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "handleRegister1Core", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "handleRegister2Core", "Lru/unicorn/ujin/data/api/response/authorization/Register2coreResponseData;", "hasBottomSheet", "initTabs", "isRegisterDataValid", "login", "password", "loginDemo", "onConfirmTermsListener", "isConfirmed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGetSchema", "schemas", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schemas;", "onRegistrationFinished", "userToken", "onSendCodeListener", "userName", "phone", "code", "proceed", "proceedDueToAppLvl", "saveFirstLoginAfterRegistration", "showChatsFragment", "showConfirmRegistrationDialog", "showServiceRules", "showSuccessRegistrationDialog", "showTerms", "showTermsConfirmDialog", "startFlatActivity", "tabName", "togglePasswordVisibility", "toggleProgressVisibility", "visible", "(Ljava/lang/Boolean;)V", "updateFieldsByMode", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.RegistrationActivity */
/* compiled from: RegistrationActivity.kt */
public final class RegistrationActivity extends BaseActivity implements RestorePassDialog.ProceedDueToAppLvl {
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public ActivityRegistrationBinding binding;
    private ConfirmRegistrationDialogFragment confirmDialog;
    private ConfirmTermsDialog confirmTermsDialog;
    private TextWatcher editTextWatcher;
    private boolean passwordIsVisible;
    private SharedPreferences sharedPreferences;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.RegistrationActivity$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$1[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 3;
        }
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

    public static final /* synthetic */ ActivityRegistrationBinding access$getBinding$p(RegistrationActivity registrationActivity) {
        ActivityRegistrationBinding activityRegistrationBinding = registrationActivity.binding;
        if (activityRegistrationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return activityRegistrationBinding;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R.layout.activity_registration);
        Intrinsics.checkNotNullExpressionValue(contentView, "DataBindingUtil.setConte…ut.activity_registration)");
        this.binding = (ActivityRegistrationBinding) contentView;
        ActivityRegistrationBinding activityRegistrationBinding = this.binding;
        if (activityRegistrationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding.setVm(this.profileViewModel);
        SharedPreferences sharedPreferences2 = getSharedPreferences(getString(R.string.app_name_app), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(get…p), Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences2;
        this.profileViewModel.getLoginMode().set(0);
        this.profileViewModel.getLoginMethod().set(0);
        LifecycleOwner lifecycleOwner = this;
        this.profileViewModel.getShowProgressLiveData().observe(lifecycleOwner, new RegistrationActivity$onCreate$1(this));
        this.profileViewModel.getLoginMutableLiveData().removeObservers(lifecycleOwner);
        this.profileViewModel.getLoginMutableLiveData().observe(lifecycleOwner, new RegistrationActivity$onCreate$2(this));
        this.profileViewModel.getRegister1coreMutableLiveData().observe(lifecycleOwner, new RegistrationActivity$onCreate$3(this));
        this.profileViewModel.getRegister2coreMutableLiveData().observe(lifecycleOwner, new RegistrationActivity$onCreate$4(this));
        if (!Flavor.Companion.current().isStage1Enabled() && getIntent().getBooleanExtra(ReactConst.EXIT, false)) {
            ProfileViewModel profileViewModel = this.profileViewModel;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            profileViewModel.logoutLocally(applicationContext);
        }
        ActivityRegistrationBinding activityRegistrationBinding2 = this.binding;
        if (activityRegistrationBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding2.setBackIsVisible(Boolean.valueOf(Flavor.Companion.current().isStage1Enabled()));
        ActivityRegistrationBinding activityRegistrationBinding3 = this.binding;
        if (activityRegistrationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding3.setIsDemoButtonEnabled(Boolean.valueOf(Flavor.Companion.current().isDemoButtonEnabled()));
        ActivityRegistrationBinding activityRegistrationBinding4 = this.binding;
        if (activityRegistrationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding4.tvDemo.setOnClickListener(new RegistrationActivity$onCreate$5(this));
        ActivityRegistrationBinding activityRegistrationBinding5 = this.binding;
        if (activityRegistrationBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding5.textRemindPassword.setOnClickListener(new RegistrationActivity$onCreate$6(this));
        ActivityRegistrationBinding activityRegistrationBinding6 = this.binding;
        if (activityRegistrationBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        ProgressBar progressBar = activityRegistrationBinding6.progressBar;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressBar");
        progressBar.setVisibility(4);
        ActivityRegistrationBinding activityRegistrationBinding7 = this.binding;
        if (activityRegistrationBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding7.imageBack.setOnClickListener(new RegistrationActivity$onCreate$7(this));
        ActivityRegistrationBinding activityRegistrationBinding8 = this.binding;
        if (activityRegistrationBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding8.ivEye.setOnClickListener(new RegistrationActivity$onCreate$8(this));
        ActivityRegistrationBinding activityRegistrationBinding9 = this.binding;
        if (activityRegistrationBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding9.buttonEnter.setOnClickListener(new RegistrationActivity$onCreate$9(this));
        this.editTextWatcher = new RegistrationActivity$onCreate$10(this);
        ActivityRegistrationBinding activityRegistrationBinding10 = this.binding;
        if (activityRegistrationBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding10.etLogin.addTextChangedListener(this.editTextWatcher);
        ActivityRegistrationBinding activityRegistrationBinding11 = this.binding;
        if (activityRegistrationBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding11.etPassword.addTextChangedListener(this.editTextWatcher);
        ActivityRegistrationBinding activityRegistrationBinding12 = this.binding;
        if (activityRegistrationBinding12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding12.etPhone.addTextChangedListener(this.editTextWatcher);
        ActivityRegistrationBinding activityRegistrationBinding13 = this.binding;
        if (activityRegistrationBinding13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding13.cbTerms.setOnCheckedChangeListener(new RegistrationActivity$onCreate$11(this));
        ActivityRegistrationBinding activityRegistrationBinding14 = this.binding;
        if (activityRegistrationBinding14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView = activityRegistrationBinding14.tvLoginHint;
        RegistrationActivityKt.makeLink(textView, "номер телефона", new RegistrationActivity$onCreate$$inlined$with$lambda$1(textView, this));
        RegistrationActivityKt.makeLink(textView, "электронную почту", new RegistrationActivity$onCreate$$inlined$with$lambda$2(textView, this));
        RegistrationActivityKt.underlineView(textView, "электронную почту");
        ActivityRegistrationBinding activityRegistrationBinding15 = this.binding;
        if (activityRegistrationBinding15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView2 = activityRegistrationBinding15.tvCheckTerms;
        String string = textView2.getResources().getString(R.string.termsOfUseLinkText);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.termsOfUseLinkText)");
        RegistrationActivityKt.makeLink(textView2, string, new RegistrationActivity$onCreate$$inlined$with$lambda$3(this));
        String string2 = textView2.getResources().getString(R.string.serviceRulesLinkText);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.serviceRulesLinkText)");
        RegistrationActivityKt.makeLink(textView2, string2, new RegistrationActivity$onCreate$$inlined$with$lambda$4(this));
        ActivityRegistrationBinding activityRegistrationBinding16 = this.binding;
        if (activityRegistrationBinding16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView3 = activityRegistrationBinding16.tvLoginTerms;
        String string3 = textView3.getResources().getString(R.string.termsOfUseLinkText);
        Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.termsOfUseLinkText)");
        RegistrationActivityKt.makeLink(textView3, string3, new RegistrationActivity$onCreate$$inlined$with$lambda$5(this));
        String string4 = textView3.getResources().getString(R.string.serviceRulesLinkText);
        Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(R.string.serviceRulesLinkText)");
        RegistrationActivityKt.makeLink(textView3, string4, new RegistrationActivity$onCreate$$inlined$with$lambda$6(this));
        initTabs();
        updateFieldsByMode();
    }

    private final void showTermsConfirmDialog() {
        this.confirmTermsDialog = ConfirmTermsDialog.Companion.newInstance(new RegistrationActivity$showTermsConfirmDialog$1(this), new RegistrationActivity$showTermsConfirmDialog$2(this), new RegistrationActivity$showTermsConfirmDialog$3(this));
        ConfirmTermsDialog confirmTermsDialog2 = this.confirmTermsDialog;
        if (confirmTermsDialog2 != null) {
            confirmTermsDialog2.setCancelable(false);
            confirmTermsDialog2.show(getSupportFragmentManager(), "");
        }
    }

    /* access modifiers changed from: private */
    public final void onConfirmTermsListener(boolean z) {
        if (z) {
            SharedPreferences sharedPreferences2 = this.sharedPreferences;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            }
            sharedPreferences2.edit().putBoolean(getLoginValue(), true).apply();
            login();
        }
    }

    /* access modifiers changed from: private */
    public final void togglePasswordVisibility() {
        if (this.passwordIsVisible) {
            ActivityRegistrationBinding activityRegistrationBinding = this.binding;
            if (activityRegistrationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            EditText editText = activityRegistrationBinding.etPassword;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.etPassword");
            editText.setInputType(129);
            ActivityRegistrationBinding activityRegistrationBinding2 = this.binding;
            if (activityRegistrationBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            activityRegistrationBinding2.ivEye.setImageResource(R.drawable.eye_icon);
        } else {
            ActivityRegistrationBinding activityRegistrationBinding3 = this.binding;
            if (activityRegistrationBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            EditText editText2 = activityRegistrationBinding3.etPassword;
            Intrinsics.checkNotNullExpressionValue(editText2, "binding.etPassword");
            editText2.setInputType(524288);
            ActivityRegistrationBinding activityRegistrationBinding4 = this.binding;
            if (activityRegistrationBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            activityRegistrationBinding4.ivEye.setImageResource(R.drawable.eye_active_icon);
        }
        ActivityRegistrationBinding activityRegistrationBinding5 = this.binding;
        if (activityRegistrationBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        activityRegistrationBinding5.etPassword.invalidate();
        ActivityRegistrationBinding activityRegistrationBinding6 = this.binding;
        if (activityRegistrationBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        EditText editText3 = activityRegistrationBinding6.etPassword;
        ActivityRegistrationBinding activityRegistrationBinding7 = this.binding;
        if (activityRegistrationBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        EditText editText4 = activityRegistrationBinding7.etPassword;
        Intrinsics.checkNotNullExpressionValue(editText4, "binding.etPassword");
        editText3.setSelection(editText4.getText().length());
        this.passwordIsVisible = !this.passwordIsVisible;
    }

    /* access modifiers changed from: private */
    public final void handleRegister1Core(Resource<String> resource) {
        int i;
        String str = null;
        Resource.Status status = resource != null ? resource.getStatus() : null;
        if (status != null && (i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) != 1) {
            if (i == 2) {
                ConfirmRegistrationDialogFragment confirmRegistrationDialogFragment = this.confirmDialog;
                if (confirmRegistrationDialogFragment == null || (confirmRegistrationDialogFragment != null && !confirmRegistrationDialogFragment.isVisible())) {
                    showConfirmRegistrationDialog();
                }
            } else if (i == 3) {
                if (resource != null) {
                    str = resource.getMessage();
                }
                showMessage(str);
            }
        }
    }

    private final void showConfirmRegistrationDialog() {
        ConfirmRegistrationDialogFragment.Companion companion = ConfirmRegistrationDialogFragment.Companion;
        ActivityRegistrationBinding activityRegistrationBinding = this.binding;
        if (activityRegistrationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        String value = activityRegistrationBinding.etPhone.getValue();
        ActivityRegistrationBinding activityRegistrationBinding2 = this.binding;
        if (activityRegistrationBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        EditText editText = activityRegistrationBinding2.etPassword;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etPassword");
        this.confirmDialog = companion.newInstance(value, editText.getText().toString(), new RegistrationActivity$showConfirmRegistrationDialog$1(this));
        ConfirmRegistrationDialogFragment confirmRegistrationDialogFragment = this.confirmDialog;
        if (confirmRegistrationDialogFragment != null) {
            confirmRegistrationDialogFragment.show(getSupportFragmentManager(), "");
        }
    }

    private final void showSuccessRegistrationDialog(String str) {
        if (str != null) {
            SuccessRegistrationDialogFragment.Companion.newInstance(str, new C5781x3eb35c01(str, this)).show(getSupportFragmentManager(), "");
        }
    }

    /* access modifiers changed from: private */
    public final void onSendCodeListener(String str, String str2, String str3) {
        this.profileViewModel.requestRegister2(str, str2, str3);
    }

    /* access modifiers changed from: private */
    public final void onRegistrationFinished(String str) {
        saveFirstLoginAfterRegistration();
        ActivityRegistrationBinding activityRegistrationBinding = this.binding;
        if (activityRegistrationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TabLayout.Tab tabAt = activityRegistrationBinding.tabLayoutLoginRegister.getTabAt(0);
        if (tabAt != null) {
            tabAt.select();
        }
        this.profileViewModel.requestUser(str);
    }

    /* access modifiers changed from: private */
    public final void handleRegister2Core(Resource<Register2coreResponseData> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            boolean z = true;
            if (i == 1) {
                return;
            }
            if (i == 2) {
                Register2coreResponseData data = resource.getData();
                String str = null;
                CharSequence token = data != null ? data.getToken() : null;
                if (token != null && !StringsKt.isBlank(token)) {
                    z = false;
                }
                if (z) {
                    ConfirmRegistrationDialogFragment confirmRegistrationDialogFragment = this.confirmDialog;
                    if (confirmRegistrationDialogFragment != null) {
                        confirmRegistrationDialogFragment.dismiss();
                    }
                    showMessage("Произошла непредвиденная ошибка, попробуйте авторизоваться с помощью пароля");
                    return;
                }
                ConfirmRegistrationDialogFragment confirmRegistrationDialogFragment2 = this.confirmDialog;
                if (confirmRegistrationDialogFragment2 != null) {
                    confirmRegistrationDialogFragment2.dismiss();
                }
                Register2coreResponseData data2 = resource.getData();
                if (data2 != null) {
                    str = data2.getToken();
                }
                showSuccessRegistrationDialog(str);
            } else if (i == 3) {
                ConfirmRegistrationDialogFragment confirmRegistrationDialogFragment3 = this.confirmDialog;
                if (confirmRegistrationDialogFragment3 != null) {
                    confirmRegistrationDialogFragment3.onInvalidCode();
                }
                showMessage(resource.getMessage());
            }
        }
    }

    private final void saveFirstLoginAfterRegistration() {
        getSharedPreferences(AppStage.SMARTFLAT.name(), 0).edit().putBoolean(Constants.SP_FIRST_LAUNCH_AFTER_REGISTARTION, true).apply();
    }

    /* access modifiers changed from: private */
    public final void handleLogin(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            int intExtra = getIntent().getIntExtra("requestCode", 0);
            Integer num = FlatFragment.BOOK_VISIT;
            if (num != null && intExtra == num.intValue()) {
                setResult(BaseActivity.LOGIN_RES);
                finish();
                return;
            }
            proceedDueToAppLvl();
            return;
        }
        showMessage(updateEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public final void toggleProgressVisibility(Boolean bool) {
        ActivityRegistrationBinding activityRegistrationBinding = this.binding;
        if (activityRegistrationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        ProgressBar progressBar = activityRegistrationBinding.progressBar;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressBar");
        progressBar.setVisibility(Intrinsics.areEqual((Object) bool, (Object) true) ? 0 : 8);
    }

    /* access modifiers changed from: private */
    public final void handleButtonEnterClick() {
        Integer num = this.profileViewModel.getLoginMode().get();
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1 && isRegisterDataValid())) {
            hideSoftKeyboard(this);
            if (num != null && num.intValue() == 0) {
                SharedPreferences sharedPreferences2 = this.sharedPreferences;
                if (sharedPreferences2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                }
                if (sharedPreferences2.getBoolean(getLoginValue(), false)) {
                    login();
                } else {
                    showTermsConfirmDialog();
                }
            } else {
                ProfileViewModel profileViewModel = this.profileViewModel;
                ActivityRegistrationBinding activityRegistrationBinding = this.binding;
                if (activityRegistrationBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                profileViewModel.requestRegister1(activityRegistrationBinding.etPhone.getValue());
            }
        }
    }

    private final boolean isRegisterDataValid() {
        ActivityRegistrationBinding activityRegistrationBinding = this.binding;
        if (activityRegistrationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        EditText editText = activityRegistrationBinding.etPassword;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etPassword");
        boolean isNameValid = Validator.isNameValid(editText.getText().toString());
        ActivityRegistrationBinding activityRegistrationBinding2 = this.binding;
        if (activityRegistrationBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        if (!activityRegistrationBinding2.etPhone.isValid()) {
            showMessage((int) R.string.checkPhone);
        } else if (!isNameValid) {
            showMessage(getString(R.string.checkName));
        }
        ActivityRegistrationBinding activityRegistrationBinding3 = this.binding;
        if (activityRegistrationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return activityRegistrationBinding3.etPhone.isValid() && isNameValid;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if ((r0.getText().toString().length() > 0) != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        if ((r0.getText().toString().length() > 0) != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e3, code lost:
        if (r0.isChecked() != false) goto L_0x00e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkValidData() {
        /*
            r6 = this;
            ru.unicorn.ujin.data.profile.ProfileViewModel r0 = r6.profileViewModel
            androidx.databinding.ObservableField r0 = r0.getLoginMode()
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r1 = "binding.etPassword"
            r2 = 1
            r3 = 0
            java.lang.String r4 = "binding"
            if (r0 != 0) goto L_0x0016
            goto L_0x00a1
        L_0x0016:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x00a1
            ru.unicorn.ujin.data.profile.ProfileViewModel r0 = r6.profileViewModel
            androidx.databinding.ObservableField r0 = r0.getLoginMethod()
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x002b
            goto L_0x0063
        L_0x002b:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0063
            ru.unicorn.databinding.ActivityRegistrationBinding r0 = r6.binding
            if (r0 != 0) goto L_0x0038
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0038:
            ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText r0 = r0.etPhone
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x00e6
            ru.unicorn.databinding.ActivityRegistrationBinding r0 = r6.binding
            if (r0 != 0) goto L_0x0047
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0047:
            android.widget.EditText r0 = r0.etPassword
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r0 == 0) goto L_0x00e6
            goto L_0x00e7
        L_0x0063:
            ru.unicorn.databinding.ActivityRegistrationBinding r0 = r6.binding
            if (r0 != 0) goto L_0x006a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x006a:
            android.widget.EditText r0 = r0.etLogin
            java.lang.String r5 = "binding.etLogin"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = p035ru.unicorn.ujin.util.Validator.isEmailValid(r0)
            if (r0 == 0) goto L_0x00e6
            ru.unicorn.databinding.ActivityRegistrationBinding r0 = r6.binding
            if (r0 != 0) goto L_0x0086
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0086:
            android.widget.EditText r0 = r0.etPassword
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x009d
            r0 = 1
            goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            if (r0 == 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00a1:
            ru.unicorn.databinding.ActivityRegistrationBinding r0 = r6.binding
            if (r0 != 0) goto L_0x00a8
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x00a8:
            ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText r0 = r0.etPhone
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x00e6
            ru.unicorn.databinding.ActivityRegistrationBinding r0 = r6.binding
            if (r0 != 0) goto L_0x00b7
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x00b7:
            android.widget.EditText r0 = r0.etPassword
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00ce
            r0 = 1
            goto L_0x00cf
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            if (r0 == 0) goto L_0x00e6
            ru.unicorn.databinding.ActivityRegistrationBinding r0 = r6.binding
            if (r0 != 0) goto L_0x00d8
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x00d8:
            android.widget.CheckBox r0 = r0.cbTerms
            java.lang.String r1 = "binding.cbTerms"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r2 = 0
        L_0x00e7:
            ru.unicorn.databinding.ActivityRegistrationBinding r0 = r6.binding
            if (r0 != 0) goto L_0x00ee
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x00ee:
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r0 = r0.buttonEnter
            java.lang.String r1 = "binding.buttonEnter"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.RegistrationActivity.checkValidData():void");
    }

    /* access modifiers changed from: private */
    public final void forgotPassClickListener() {
        RestorePassDialog restorePassDialog = new RestorePassDialog();
        restorePassDialog.setProceedDueToAppLvl(this);
        restorePassDialog.show(getSupportFragmentManager(), "restorePass");
    }

    private final void initTabs() {
        if (Flavor.Companion.current().isRegistrationEnabled()) {
            ActivityRegistrationBinding activityRegistrationBinding = this.binding;
            if (activityRegistrationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            TabLayout tabLayout = activityRegistrationBinding.tabLayoutLoginRegister;
            tabLayout.setVisibility(0);
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new RegistrationActivity$initTabs$$inlined$apply$lambda$1(this));
            Intrinsics.checkNotNullExpressionValue(tabLayout, "binding.tabLayoutLoginRe…         })\n            }");
            return;
        }
        ActivityRegistrationBinding activityRegistrationBinding2 = this.binding;
        if (activityRegistrationBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TabLayout tabLayout2 = activityRegistrationBinding2.tabLayoutLoginRegister;
        Intrinsics.checkNotNullExpressionValue(tabLayout2, "binding.tabLayoutLoginRegister");
        tabLayout2.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void showTerms() {
        startActivity(new Intent(this, WebViewActivity.class).putExtra("url", getString(R.string.termsOfUseLink)));
    }

    /* access modifiers changed from: private */
    public final void showServiceRules() {
        startActivity(new Intent(this, WebViewActivity.class).putExtra("url", getString(R.string.serviceRulesLink)));
    }

    /* access modifiers changed from: private */
    public final void loginDemo() {
        login("demo", "demo");
    }

    private final void login(String str, String str2) {
        this.profileViewModel.requestLogin(new Regex(" ").replace((CharSequence) str, ""), new Regex(" ").replace((CharSequence) str2, ""));
    }

    private final void login() {
        String loginValue = getLoginValue();
        ActivityRegistrationBinding activityRegistrationBinding = this.binding;
        if (activityRegistrationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        EditText editText = activityRegistrationBinding.etPassword;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etPassword");
        login(loginValue, editText.getText().toString());
    }

    private final String getLoginValue() {
        Integer num = this.profileViewModel.getLoginMethod().get();
        if (num != null && num.intValue() == 0) {
            ActivityRegistrationBinding activityRegistrationBinding = this.binding;
            if (activityRegistrationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            return activityRegistrationBinding.etPhone.getValue();
        }
        ActivityRegistrationBinding activityRegistrationBinding2 = this.binding;
        if (activityRegistrationBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        EditText editText = activityRegistrationBinding2.etLogin;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etLogin");
        return editText.getText().toString();
    }

    /* access modifiers changed from: private */
    public final void updateFieldsByMode() {
        Integer num = this.profileViewModel.getLoginMode().get();
        if (num != null && num.intValue() == 0) {
            ActivityRegistrationBinding activityRegistrationBinding = this.binding;
            if (activityRegistrationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            EditText editText = activityRegistrationBinding.etPassword;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.etPassword");
            editText.setInputType(129);
            if (this.passwordIsVisible) {
                togglePasswordVisibility();
            }
        } else if (num != null && num.intValue() == 1) {
            ActivityRegistrationBinding activityRegistrationBinding2 = this.binding;
            if (activityRegistrationBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            EditText editText2 = activityRegistrationBinding2.etPassword;
            Intrinsics.checkNotNullExpressionValue(editText2, "binding.etPassword");
            editText2.setInputType(1);
        }
    }

    private final void proceedDueToAppLvl() {
        Profile instance = Profile.getInstance(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(instance, "Profile.getInstance(applicationContext)");
        instance.setFirstTimeSinceLogin(true);
        ViewModel viewModel = ViewModelProviders.m12of((FragmentActivity) this).get(RegViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…RegViewModel::class.java]");
        ((RegViewModel) viewModel).sendFCMToken(false);
        List<Apartment> combineApartments = this.profileViewModel.getCombineApartments();
        List arrayList = new ArrayList();
        if (combineApartments != null) {
            if (Flavor.Companion.current().isStage1Enabled() || Flavor.Companion.current().isStage2Enabled()) {
                arrayList.addAll(combineApartments);
            } else {
                for (Apartment next : combineApartments) {
                    if (next != null) {
                        Apartment apartment = next;
                        Integer stage = apartment.getStage();
                        if (stage != null && stage.intValue() == 3) {
                            arrayList.add(apartment);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.realm.profile.Apartment");
                    }
                }
            }
        }
        this.profileLocalRepository.setUserLoggedIn(true);
        if (this.profileLocalRepository.getUser().getId() == 80) {
            this.profileLocalRepository.setDemoStage(3);
        }
        if (arrayList.size() > 1) {
            startStageThree(ReactConst.OTHER_FLAT, false);
        } else if (arrayList.size() > 0) {
            String userToken = ((Apartment) arrayList.get(0)).getUserToken();
            Intrinsics.checkNotNullExpressionValue(userToken, "apartmentList[0].userToken");
            Integer stage2 = ((Apartment) arrayList.get(0)).getStage();
            Intrinsics.checkNotNullExpressionValue(stage2, "apartmentList[0].stage");
            applyFlat(userToken, stage2.intValue());
            ProfileViewModel profileViewModel = this.profileViewModel;
            String buildingId = ((Apartment) arrayList.get(0)).getBuildingId();
            Intrinsics.checkNotNullExpressionValue(buildingId, "apartmentList[0].buildingId");
            profileViewModel.loadBuilding(buildingId);
        } else if (Flavor.Companion.current().isStage1Enabled()) {
            applyFlat(this.profileLocalRepository.getUser().getToken(), 1);
        } else if (Flavor.Companion.isCurrent(Flavor.MORIONDIGITAL)) {
            applyFlat(this.profileLocalRepository.getUser().getToken(), 3);
        } else {
            Toast.makeText(getApplicationContext(), R.string.askSupport, 1).show();
            this.profileViewModel.removeUserProfile();
        }
    }

    private final void applyFlat(String str, int i) {
        this.profileViewModel.applyFlat(str, i);
        gotoFlat();
    }

    private final void gotoFlat() {
        if (getIntent().getBooleanExtra(TermsActivity.MYSMARTFLATRN_REG_REQ, false)) {
            setResult(BaseActivity.LOGIN_RES);
            finish();
        } else if (Flavor.Companion.current().getHasDynamicBottomNavigationViewSupport()) {
            ActivityRegistrationBinding activityRegistrationBinding = this.binding;
            if (activityRegistrationBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            ProgressBar progressBar = activityRegistrationBinding.progressBar;
            Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressBar");
            progressBar.setVisibility(0);
            this.simpleViewModel.getSingleSchema(false);
            SimpleViewModel simpleViewModel = this.simpleViewModel;
            Intrinsics.checkNotNullExpressionValue(simpleViewModel, "simpleViewModel");
            simpleViewModel.getSchemasSingleEvent().observe(this, new RegistrationActivity$gotoFlat$1(this));
        } else {
            startFlatActivity(this.profileViewModel.getUser().isCurrentCommerce() ? ReactConst.SECURITYTAB : Flavor.Companion.current().getStage3DefaultScreen());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r0 != null) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onGetSchema(p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas r5) {
        /*
            r4 = this;
            ru.unicorn.databinding.ActivityRegistrationBinding r0 = r4.binding
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "binding"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0009:
            android.widget.ProgressBar r0 = r0.progressBar
            java.lang.String r1 = "binding.progressBar"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            io.realm.RealmList r5 = r5.getMeta()
            r0 = 0
            if (r5 == 0) goto L_0x0049
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0022:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r5.next()
            r2 = r1
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r2 = (p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema) r2
            java.lang.String r3 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.Boolean r2 = r2.getIsActive()
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0022
            goto L_0x0045
        L_0x0044:
            r1 = r0
        L_0x0045:
            r5 = r1
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r5 = (p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema) r5
            goto L_0x004a
        L_0x0049:
            r5 = r0
        L_0x004a:
            if (r5 == 0) goto L_0x0064
            ru.unicorn.ujin.view.customViews.BottomNavigationIds$Companion r1 = p035ru.unicorn.ujin.view.customViews.BottomNavigationIds.Companion
            java.lang.String r5 = r5.getActionValue()
            java.lang.String r2 = "it.actionValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            ru.unicorn.ujin.view.customViews.BottomNavigationIds r5 = r1.getByStringId(r5)
            if (r5 == 0) goto L_0x0061
            java.lang.String r0 = r5.getTabName()
        L_0x0061:
            if (r0 == 0) goto L_0x0064
            goto L_0x0081
        L_0x0064:
            r5 = r4
            ru.unicorn.ujin.view.activity.RegistrationActivity r5 = (p035ru.unicorn.ujin.view.activity.RegistrationActivity) r5
            ru.unicorn.ujin.data.profile.ProfileViewModel r5 = r5.profileViewModel
            ru.unicorn.ujin.data.realm.profile.User r5 = r5.getUser()
            boolean r5 = r5.isCurrentCommerce()
            if (r5 == 0) goto L_0x0076
            java.lang.String r5 = "security"
            goto L_0x0080
        L_0x0076:
            ru.unicorn.ujin.enums.Flavor$Companion r5 = p035ru.unicorn.ujin.enums.Flavor.Companion
            ru.unicorn.ujin.enums.Flavor r5 = r5.current()
            java.lang.String r5 = r5.getStage3DefaultScreen()
        L_0x0080:
            r0 = r5
        L_0x0081:
            r4.startFlatActivity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.RegistrationActivity.onGetSchema(ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas):void");
    }

    private final void startFlatActivity(String str) {
        if (this.profileViewModel.getUserStage() == 3) {
            startStageThree(str, false);
        } else if (this.profileViewModel.getUserStage() == 2) {
            startStageTwo(false);
        } else {
            startStageOne();
        }
    }

    public void proceed() {
        proceedDueToAppLvl();
    }
}
