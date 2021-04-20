package p035ru.unicorn.ujin.view.activity.domru;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.receiver.SmsReceiver;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.adapters.domru.RegistrationPagerAdapter;
import p035ru.unicorn.ujin.view.customViews.SwitchSwipeableViewPager;
import p035ru.unicorn.ujin.view.fragments.AuthBaseFragment;
import p035ru.unicorn.ujin.view.fragments.domru.CodeRecoveryFirstFragment;
import p035ru.unicorn.ujin.view.fragments.domru.CodeRecoverySecondFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0004H\u0014J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u000fJ\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u000fH\u0014J\b\u0010\u001b\u001a\u00020\u000fH\u0014J\u000e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u001d\u001a\u00020\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/domru/SendingCodeActivity;", "Lru/unicorn/ujin/view/activity/BaseActivity;", "()V", "currentStep", "", "phone", "", "smsReceiver", "Lru/unicorn/ujin/receiver/SmsReceiver;", "steps", "", "Lru/unicorn/ujin/view/fragments/AuthBaseFragment;", "getBottomNavigationMenuId", "getPhone", "goToNextStep", "", "goToPreviousStep", "goToRegistrationActivity", "step", "hasBottomSheet", "", "hideKeyboard", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "setPhone", "showChatsFragment", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.domru.SendingCodeActivity */
/* compiled from: SendingCodeActivity.kt */
public final class SendingCodeActivity extends BaseActivity {
    private HashMap _$_findViewCache;
    private int currentStep;
    private String phone;
    private SmsReceiver smsReceiver;
    private final List<AuthBaseFragment> steps = CollectionsKt.listOf(CodeRecoveryFirstFragment.Companion.newInstance(), CodeRecoverySecondFragment.Companion.newInstance());

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
        this.smsReceiver = new SmsReceiver(new SendingCodeActivity$onCreate$smsListener$1());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION);
        SmsReceiver smsReceiver2 = this.smsReceiver;
        if (smsReceiver2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smsReceiver");
        }
        registerReceiver(smsReceiver2, intentFilter);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        SmsReceiver smsReceiver2 = this.smsReceiver;
        if (smsReceiver2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smsReceiver");
        }
        unregisterReceiver(smsReceiver2);
    }

    public void onBackPressed() {
        int i = this.currentStep;
        if (i == 0) {
            goToRegistrationActivity(0);
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

    public final void goToRegistrationActivity(int i) {
        Intent intent = new Intent(this, RegistrationUserActivity.class);
        intent.putExtra(RegistrationUserActivity.REGISTRATION_STEP, i);
        startActivity(intent);
        finish();
    }

    public final void setPhone(String str) {
        Intrinsics.checkNotNullParameter(str, "phone");
        this.phone = str;
    }

    public final String getPhone() {
        String str = this.phone;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("phone");
        }
        return str;
    }

    public final void hideKeyboard() {
        if (getCurrentFocus() != null) {
            UIHelper.hideKeyboard(this, getCurrentFocus());
        }
    }
}
