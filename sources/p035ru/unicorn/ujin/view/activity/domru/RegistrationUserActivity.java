package p035ru.unicorn.ujin.view.activity.domru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.WebViewActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.adapters.domru.RegistrationPagerAdapter;
import p035ru.unicorn.ujin.view.customViews.SwitchSwipeableViewPager;
import p035ru.unicorn.ujin.view.fragments.AuthBaseFragment;
import p035ru.unicorn.ujin.view.fragments.domru.RegistrationFirstFragment;
import p035ru.unicorn.ujin.view.fragments.domru.RegistrationSecondFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0004H\u0014J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\nJ\b\u0010\u0011\u001a\u00020\nH\u0016J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\nH\u0014J\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/domru/RegistrationUserActivity;", "Lru/unicorn/ujin/view/activity/BaseActivity;", "()V", "currentStep", "", "steps", "", "Lru/unicorn/ujin/view/fragments/AuthBaseFragment;", "getBottomNavigationMenuId", "goToAuthActivity", "", "goToCodeRecovery", "goToNextStep", "goToPreviousStep", "hasBottomSheet", "", "hideKeyboard", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showChatsFragment", "showServiceRules", "showTerms", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.domru.RegistrationUserActivity */
/* compiled from: RegistrationUserActivity.kt */
public final class RegistrationUserActivity extends BaseActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REGISTRATION_STEP = "registrationStep";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public int currentStep;
    private final List<AuthBaseFragment> steps = CollectionsKt.listOf(RegistrationFirstFragment.Companion.newInstance(), RegistrationSecondFragment.Companion.newInstance());

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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_registration_user);
        SwitchSwipeableViewPager switchSwipeableViewPager = (SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpRegistrationSteps);
        Intrinsics.checkNotNullExpressionValue(switchSwipeableViewPager, "vpRegistrationSteps");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        switchSwipeableViewPager.setAdapter(new RegistrationPagerAdapter(supportFragmentManager, this.steps));
        if (getIntent().getIntExtra(REGISTRATION_STEP, 0) != 0) {
            ((SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpRegistrationSteps)).setCurrentItem(1, true);
        }
        ((SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpRegistrationSteps)).addOnPageChangeListener(new RegistrationUserActivity$onCreate$1(this));
    }

    public void onBackPressed() {
        int i = this.currentStep;
        if (i == 0) {
            goToAuthActivity();
        } else if (i == 1) {
            goToPreviousStep();
        }
    }

    public final void goToNextStep() {
        ((SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpRegistrationSteps)).setCurrentItem(1, true);
    }

    public final void goToPreviousStep() {
        ((SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpRegistrationSteps)).setCurrentItem(0, true);
    }

    public final void goToAuthActivity() {
        startActivity(new Intent(this, RegisterDomruActivity.class));
        finish();
    }

    public final void goToCodeRecovery() {
        startActivity(new Intent(this, SendingCodeActivity.class));
        finish();
    }

    public final void showTerms() {
        startActivity(new Intent(this, WebViewActivity.class).putExtra("url", getString(R.string.termsOfUseLink)));
    }

    public final void showServiceRules() {
        startActivity(new Intent(this, WebViewActivity.class).putExtra("url", getString(R.string.serviceRulesLink)));
    }

    public final void hideKeyboard() {
        if (getCurrentFocus() != null) {
            UIHelper.hideKeyboard(this, getCurrentFocus());
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/domru/RegistrationUserActivity$Companion;", "", "()V", "REGISTRATION_STEP", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.domru.RegistrationUserActivity$Companion */
    /* compiled from: RegistrationUserActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
