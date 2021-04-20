package p035ru.unicorn.ujin.view.activity.domru;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.textfield.TextInputEditText;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.Constants;
import p035ru.unicorn.ujin.data.realm.ProviderCity;
import p035ru.unicorn.ujin.util.DialogUtils;
import p035ru.unicorn.ujin.util.LocationHelper;
import p035ru.unicorn.ujin.util.PermissionHelper;
import p035ru.unicorn.ujin.util.Validator;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.RegistrationActivityKt;
import p035ru.unicorn.ujin.view.activity.WebViewActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.InternetHelper;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.citySearchView.SearchViewField;
import p035ru.unicorn.ujin.viewModel.events.profile.AuthProviderEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.CitiesProviderEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000223B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0014H\u0002J\b\u0010!\u001a\u00020\u0014H\u0007J\b\u0010\"\u001a\u00020\u0005H\u0002J\u0012\u0010#\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u0014H\u0014J\u0012\u0010'\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010*\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010)H\u0017J\b\u0010+\u001a\u00020\u0014H\u0014J\b\u0010,\u001a\u00020\u0014H\u0002J\b\u0010-\u001a\u00020\u0014H\u0002J\b\u0010.\u001a\u00020\u0014H\u0002J\b\u0010/\u001a\u00020\u0014H\u0002J\b\u00100\u001a\u00020\u0014H\u0002J\b\u00101\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X.¢\u0006\u0002\n\u0000¨\u00064"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/domru/RegisterDomruActivity;", "Lru/unicorn/ujin/view/activity/BaseActivity;", "Lru/unicorn/ujin/util/PermissionHelper$IPermissionCallback;", "()V", "autoCityDetection", "", "cityList", "", "Lru/unicorn/ujin/data/realm/ProviderCity;", "editLoginTextWatcher", "Landroid/text/TextWatcher;", "editTextWatcher", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "passwordVisible", "searchBroadcastReceiver", "Lru/unicorn/ujin/view/activity/domru/RegisterDomruActivity$SearchBroadcastReceiver;", "checkPermissions", "", "defineCity", "getBottomNavigationMenuId", "", "getClosestCity", "location", "Landroid/location/Location;", "handleEvent", "event", "Lru/unicorn/ujin/viewModel/events/profile/AuthProviderEvent;", "Lru/unicorn/ujin/viewModel/events/profile/CitiesProviderEvent;", "hasBottomSheet", "hideKeyboard", "initLocation", "isLoginDataValid", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "permissionDenied", "permission", "Lru/unicorn/ujin/util/PermissionHelper$RuntimePermissions;", "permissionGranted", "showChatsFragment", "showDemoMode", "showPasswordRecoveryActivity", "showRegistrationUserActivity", "showServiceRules", "showTerms", "togglePasswordVisibility", "Companion", "SearchBroadcastReceiver", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.domru.RegisterDomruActivity */
/* compiled from: RegisterDomruActivity.kt */
public final class RegisterDomruActivity extends BaseActivity implements PermissionHelper.IPermissionCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String PASSWORD_HAS_BEEN_SENT = "passwordHasBeenSent";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public boolean autoCityDetection = true;
    private List<? extends ProviderCity> cityList = CollectionsKt.emptyList();
    private TextWatcher editLoginTextWatcher = new RegisterDomruActivity$editLoginTextWatcher$1(this);
    private TextWatcher editTextWatcher = new RegisterDomruActivity$editTextWatcher$1(this);
    /* access modifiers changed from: private */
    public LocationCallback locationCallback;
    /* access modifiers changed from: private */
    public LocationRequest locationRequest;
    private boolean passwordVisible;
    /* access modifiers changed from: private */
    public SearchBroadcastReceiver searchBroadcastReceiver;

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

    public void permissionDenied(PermissionHelper.RuntimePermissions runtimePermissions) {
    }

    /* access modifiers changed from: protected */
    public void showChatsFragment() {
    }

    public static final /* synthetic */ SearchBroadcastReceiver access$getSearchBroadcastReceiver$p(RegisterDomruActivity registerDomruActivity) {
        SearchBroadcastReceiver searchBroadcastReceiver2 = registerDomruActivity.searchBroadcastReceiver;
        if (searchBroadcastReceiver2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBroadcastReceiver");
        }
        return searchBroadcastReceiver2;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_register_domru);
        ((ImageView) _$_findCachedViewById(C5619R.C5622id.ivEye)).setOnClickListener(new RegisterDomruActivity$onCreate$1(this));
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvForgotPassword)).setOnClickListener(new RegisterDomruActivity$onCreate$2(this));
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvDemo)).setOnClickListener(new RegisterDomruActivity$onCreate$3(this));
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvRegister)).setOnClickListener(new RegisterDomruActivity$onCreate$4(this));
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvLoginTerms);
        String string = textView.getResources().getString(R.string.termsOfUseLinkText);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.termsOfUseLinkText)");
        RegistrationActivityKt.makeLink(textView, string, new RegisterDomruActivity$onCreate$$inlined$with$lambda$1(this));
        String string2 = textView.getResources().getString(R.string.serviceRulesLinkText);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.serviceRulesLinkText)");
        RegistrationActivityKt.makeLink(textView, string2, new RegisterDomruActivity$onCreate$$inlined$with$lambda$2(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnLogin)).setOnClickListener(new RegisterDomruActivity$onCreate$6(this));
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etLogin)).addTextChangedListener(this.editLoginTextWatcher);
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword)).addTextChangedListener(this.editTextWatcher);
        if (getIntent().getBooleanExtra(PASSWORD_HAS_BEEN_SENT, false)) {
            DialogUtils dialogUtils = DialogUtils.INSTANCE;
            String string3 = getResources().getString(R.string.passwordHasBeenSent);
            Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.passwordHasBeenSent)");
            String string4 = getResources().getString(R.string.passwordHasBeenSentMessage);
            Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(R.st…sswordHasBeenSentMessage)");
            dialogUtils.showMessage(string3, string4, this);
        }
        if (getIntent().getBooleanExtra(ReactConst.EXIT, false)) {
            clearProfileDataForLogout();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constants.SEARCH_VIEW);
        intentFilter.addAction(Constants.SEARCH_RESULT);
        this.searchBroadcastReceiver = new SearchBroadcastReceiver();
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this);
        SearchBroadcastReceiver searchBroadcastReceiver2 = this.searchBroadcastReceiver;
        if (searchBroadcastReceiver2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBroadcastReceiver");
        }
        instance.registerReceiver(searchBroadcastReceiver2, intentFilter);
        LifecycleOwner lifecycleOwner = this;
        this.profileViewModel.getAuthProviderLiveData().observe(lifecycleOwner, new RegisterDomruActivity$onCreate$7(this));
        this.profileViewModel.getGetCitiesProviderLiveData().observe(lifecycleOwner, new RegisterDomruActivity$onCreate$8(this));
        this.profileViewModel.loadProviderCityList();
        initLocation();
    }

    /* access modifiers changed from: private */
    public final void hideKeyboard() {
        if (getCurrentFocus() != null) {
            UIHelper.hideKeyboard(this, getCurrentFocus());
        }
    }

    /* access modifiers changed from: private */
    public final void togglePasswordVisibility() {
        boolean z = this.passwordVisible;
        if (!z) {
            TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword);
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "etPassword");
            textInputEditText.setInputType(524288);
            ((ImageView) _$_findCachedViewById(C5619R.C5622id.ivEye)).setImageResource(R.drawable.eye_active_icon);
        } else if (z) {
            TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etPassword");
            textInputEditText2.setInputType(129);
            ((ImageView) _$_findCachedViewById(C5619R.C5622id.ivEye)).setImageResource(R.drawable.eye_icon);
        }
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword)).invalidate();
        this.passwordVisible = !this.passwordVisible;
    }

    /* access modifiers changed from: private */
    public final void showRegistrationUserActivity() {
        startActivity(new Intent(this, RegistrationUserActivity.class));
        finish();
    }

    /* access modifiers changed from: private */
    public final void showPasswordRecoveryActivity() {
        Intent putExtra = new Intent(this, PasswordWebViewActivity.class).putExtra("url", getString(R.string.passwordRecoveryLink));
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(this, PasswordWeb…ng.passwordRecoveryLink))");
        startActivity(putExtra);
        finish();
    }

    /* access modifiers changed from: private */
    public final void showDemoMode() {
        hideKeyboard();
        DialogUtils.INSTANCE.showProgressDialog(this);
        this.profileViewModel.providerAuthorize("demo", "demo", "1");
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
    public final void handleEvent(AuthProviderEvent authProviderEvent) {
        DialogUtils.INSTANCE.hideProgressDialog();
        if (authProviderEvent.getSuccess()) {
            startStageThree(ReactConst.SMARTFLAT, false);
            return;
        }
        Context context = this;
        if (InternetHelper.isNetworkConnectionAvailable(context)) {
            String message = authProviderEvent.getMessage();
            if (message == null || !(!StringsKt.isBlank(message))) {
                DialogUtils dialogUtils = DialogUtils.INSTANCE;
                String string = getResources().getString(R.string.internalError);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.internalError)");
                dialogUtils.showError(string, context);
                return;
            }
            DialogUtils.INSTANCE.showError(authProviderEvent.getMessage(), context);
            return;
        }
        DialogUtils dialogUtils2 = DialogUtils.INSTANCE;
        String string2 = getResources().getString(R.string.noInternetConnection);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.noInternetConnection)");
        dialogUtils2.showError(string2, context);
    }

    /* access modifiers changed from: private */
    public final void handleEvent(CitiesProviderEvent citiesProviderEvent) {
        if (citiesProviderEvent.getSuccess()) {
            this.cityList = this.profileViewModel.getProviderCityList();
            if (LocationHelper.INSTANCE.isLocationEnabled(this)) {
                checkPermissions();
            }
            defineCity();
        }
    }

    /* access modifiers changed from: private */
    public final void defineCity() {
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etLogin);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etLogin");
        String valueOf = String.valueOf(textInputEditText.getText());
        if (this.autoCityDetection && valueOf.length() >= 3 && Validator.containsOnlyDigits(valueOf)) {
            ProviderCity providerCity = null;
            if (valueOf != null) {
                String substring = valueOf.substring(0, 3);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Iterator<? extends ProviderCity> it = this.cityList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ProviderCity providerCity2 = (ProviderCity) it.next();
                    if (Intrinsics.areEqual((Object) providerCity2.getAccountPrefix(), (Object) substring)) {
                        providerCity = providerCity2;
                        break;
                    }
                }
                if (providerCity == null) {
                    if (valueOf != null) {
                        String substring2 = valueOf.substring(0, 2);
                        Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        for (ProviderCity providerCity3 : this.cityList) {
                            if (Intrinsics.areEqual((Object) providerCity3.getAccountPrefix(), (Object) substring2)) {
                                providerCity = providerCity3;
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                if (providerCity != null) {
                    ((SearchViewField) _$_findCachedViewById(C5619R.C5622id.cmbCity)).setCity(providerCity);
                } else {
                    ((SearchViewField) _$_findCachedViewById(C5619R.C5622id.cmbCity)).clearCity();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }

    private final void checkPermissions() {
        new PermissionHelper(this).checkForPermissions(this, PermissionHelper.RuntimePermissions.PERMISSION_REQUEST_FINE_LOCATION, this);
    }

    public void permissionGranted(PermissionHelper.RuntimePermissions runtimePermissions) {
        FusedLocationProviderClient fusedLocationClient = getFusedLocationClient();
        Intrinsics.checkNotNullExpressionValue(fusedLocationClient, "fusedLocationClient");
        Activity activity = this;
        fusedLocationClient.getLastLocation().addOnSuccessListener(activity, new RegisterDomruActivity$permissionGranted$1(this)).addOnFailureListener(activity, (OnFailureListener) RegisterDomruActivity$permissionGranted$2.INSTANCE);
    }

    public final void initLocation() {
        LocationRequest create = LocationRequest.create();
        create.setPriority(104);
        create.setInterval(20000);
        Unit unit = Unit.INSTANCE;
        this.locationRequest = create;
        this.locationCallback = new RegisterDomruActivity$initLocation$2(this);
        getFusedLocationClient().requestLocationUpdates(this.locationRequest, this.locationCallback, (Looper) null);
    }

    /* access modifiers changed from: private */
    public final ProviderCity getClosestCity(Location location) {
        if (this.cityList.isEmpty()) {
            return null;
        }
        double d = Double.MAX_VALUE;
        ProviderCity providerCity = null;
        int size = this.cityList.size();
        for (int i = 0; i < size; i++) {
            ProviderCity providerCity2 = (ProviderCity) this.cityList.get(i);
            Double latitude = providerCity2.getLatitude();
            if (latitude != null) {
                double doubleValue = latitude.doubleValue();
                Double longitude = providerCity2.getLongitude();
                if (longitude != null) {
                    double doubleValue2 = longitude.doubleValue();
                    double latitude2 = ((doubleValue - location.getLatitude()) * (doubleValue - location.getLatitude())) + ((doubleValue2 - location.getLongitude()) * (doubleValue2 - location.getLongitude()));
                    if (latitude2 < d) {
                        providerCity = providerCity2;
                        d = latitude2;
                    }
                }
            }
        }
        return providerCity;
    }

    /* access modifiers changed from: private */
    public final boolean isLoginDataValid() {
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etLogin);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etLogin");
        Editable text = textInputEditText.getText();
        if (text != null && !StringsKt.isBlank(text)) {
            TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPassword);
            Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etPassword");
            Editable text2 = textInputEditText2.getText();
            if (text2 != null && !StringsKt.isBlank(text2)) {
                return true;
            }
        }
        return false;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/domru/RegisterDomruActivity$SearchBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lru/unicorn/ujin/view/activity/domru/RegisterDomruActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.domru.RegisterDomruActivity$SearchBroadcastReceiver */
    /* compiled from: RegisterDomruActivity.kt */
    public final class SearchBroadcastReceiver extends BroadcastReceiver {
        public SearchBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -539175204) {
                    if (hashCode == 1425879700 && action.equals(Constants.SEARCH_RESULT)) {
                        SearchViewField searchViewField = (SearchViewField) RegisterDomruActivity.this._$_findCachedViewById(C5619R.C5622id.cmbCity);
                        Intrinsics.checkNotNullExpressionValue(searchViewField, "cmbCity");
                        boolean z = true;
                        searchViewField.setEnabled(true);
                        ((SearchViewField) RegisterDomruActivity.this._$_findCachedViewById(C5619R.C5622id.cmbCity)).setValue(intent.getStringExtra(Constants.SEARCH_SELECTED_VALUE));
                        ((SearchViewField) RegisterDomruActivity.this._$_findCachedViewById(C5619R.C5622id.cmbCity)).setId(intent.getStringExtra(Constants.SEARCH_SELECTED_ID));
                        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) RegisterDomruActivity.this._$_findCachedViewById(C5619R.C5622id.btnLogin);
                        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnLogin");
                        if (!RegisterDomruActivity.this.isLoginDataValid() || ((SearchViewField) RegisterDomruActivity.this._$_findCachedViewById(C5619R.C5622id.cmbCity)).getId() == null) {
                            z = false;
                        }
                        dynamicBackgroundButton.setEnabled(z);
                        RegisterDomruActivity.this.autoCityDetection = false;
                    }
                } else if (action.equals(Constants.SEARCH_VIEW)) {
                    RegisterDomruActivity registerDomruActivity = RegisterDomruActivity.this;
                    registerDomruActivity.startSearchViewActivity(((SearchViewField) registerDomruActivity._$_findCachedViewById(C5619R.C5622id.cmbCity)).getId());
                    SearchViewField searchViewField2 = (SearchViewField) RegisterDomruActivity.this._$_findCachedViewById(C5619R.C5622id.cmbCity);
                    Intrinsics.checkNotNullExpressionValue(searchViewField2, "cmbCity");
                    searchViewField2.setEnabled(false);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.searchBroadcastReceiver != null) {
            LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this);
            SearchBroadcastReceiver searchBroadcastReceiver2 = this.searchBroadcastReceiver;
            if (searchBroadcastReceiver2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBroadcastReceiver");
            }
            instance.unregisterReceiver(searchBroadcastReceiver2);
        }
        super.onDestroy();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/domru/RegisterDomruActivity$Companion;", "", "()V", "PASSWORD_HAS_BEEN_SENT", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.domru.RegisterDomruActivity$Companion */
    /* compiled from: RegisterDomruActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
