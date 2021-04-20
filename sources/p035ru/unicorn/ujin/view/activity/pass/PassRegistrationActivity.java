package p035ru.unicorn.ujin.view.activity.pass;

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
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.adapters.domru.RegistrationPagerAdapter;
import p035ru.unicorn.ujin.view.customViews.SwitchSwipeableViewPager;
import p035ru.unicorn.ujin.view.fragments.AuthBaseFragment;
import p035ru.unicorn.ujin.view.fragments.pass.ConfirmationFragment;
import p035ru.unicorn.ujin.view.fragments.pass.RegistrationFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0012J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0012H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/pass/PassRegistrationActivity;", "Lru/unicorn/ujin/view/activity/BaseActivity;", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "phone", "getPhone", "setPhone", "steps", "", "Lru/unicorn/ujin/view/fragments/AuthBaseFragment;", "getBottomNavigationMenuId", "", "goToNextStep", "", "goToPreviousStep", "hasBottomSheet", "", "hideKeyboard", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showChatsFragment", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.pass.PassRegistrationActivity */
/* compiled from: PassRegistrationActivity.kt */
public final class PassRegistrationActivity extends BaseActivity {
    private HashMap _$_findViewCache;
    public String name;
    public String phone;
    private final List<AuthBaseFragment> steps = CollectionsKt.listOf(RegistrationFragment.Companion.newInstance(), ConfirmationFragment.Companion.newInstance());

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

    public final String getPhone() {
        String str = this.phone;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phone");
        }
        return str;
    }

    public final void setPhone(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phone = str;
    }

    public final String getName() {
        String str = this.name;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("name");
        }
        return str;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_registration_morion);
        SwitchSwipeableViewPager switchSwipeableViewPager = (SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpRegistrationSteps);
        Intrinsics.checkNotNullExpressionValue(switchSwipeableViewPager, "vpRegistrationSteps");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        switchSwipeableViewPager.setAdapter(new RegistrationPagerAdapter(supportFragmentManager, this.steps));
        if (getIntent().getBooleanExtra(ReactConst.EXIT, false)) {
            clearProfileDataForLogout();
        }
    }

    public final void hideKeyboard() {
        if (getCurrentFocus() != null) {
            UIHelper.hideKeyboard(this, getCurrentFocus());
        }
    }

    public final void goToNextStep() {
        ((SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpRegistrationSteps)).setCurrentItem(1, true);
    }

    public final void goToPreviousStep() {
        ((SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpRegistrationSteps)).setCurrentItem(0, true);
    }

    public void onBackPressed() {
        SwitchSwipeableViewPager switchSwipeableViewPager = (SwitchSwipeableViewPager) _$_findCachedViewById(C5619R.C5622id.vpRegistrationSteps);
        Intrinsics.checkNotNullExpressionValue(switchSwipeableViewPager, "vpRegistrationSteps");
        if (switchSwipeableViewPager.getCurrentItem() == 1) {
            goToPreviousStep();
        } else {
            super.onBackPressed();
        }
    }
}
