package p035ru.unicorn.ujin.view.activity.morion;

import android.content.SharedPreferences;
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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabFragment;
import p035ru.unicorn.ujin.view.adapters.domru.RegistrationPagerAdapter;
import p035ru.unicorn.ujin.view.customViews.SwitchSwipeableViewPager;
import p035ru.unicorn.ujin.view.fragments.AuthBaseFragment;
import p035ru.unicorn.ujin.view.fragments.morion.ConfirmationFragment;
import p035ru.unicorn.ujin.view.fragments.morion.RegistrationFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u0018J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\u0012\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u0018H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/morion/MorionRegistrationActivity;", "Lru/unicorn/ujin/view/activity/BaseActivity;", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "phone", "getPhone", "setPhone", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "steps", "", "Lru/unicorn/ujin/view/fragments/AuthBaseFragment;", "getBottomNavigationMenuId", "", "goToNextStep", "", "goToPreviousStep", "hasBottomSheet", "", "hideKeyboard", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showChatsFragment", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.morion.MorionRegistrationActivity */
/* compiled from: MorionRegistrationActivity.kt */
public final class MorionRegistrationActivity extends BaseActivity {
    private HashMap _$_findViewCache;
    public String name;
    public String phone;
    public SharedPreferences sharedPreferences;
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

    public final SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences2 = this.sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        }
        return sharedPreferences2;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences2) {
        Intrinsics.checkNotNullParameter(sharedPreferences2, "<set-?>");
        this.sharedPreferences = sharedPreferences2;
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
        SharedPreferences sharedPreferences2 = getSharedPreferences(getString(R.string.app_name_app), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(get…p), Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences2;
        SharedPreferences sharedPreferences3 = this.sharedPreferences;
        if (sharedPreferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
        }
        sharedPreferences3.edit().putBoolean(ProfileTabFragment.SHOW_RESIDENT_MESSAGE, true).apply();
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
