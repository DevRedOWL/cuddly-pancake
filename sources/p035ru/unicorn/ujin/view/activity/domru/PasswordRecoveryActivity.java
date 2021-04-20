package p035ru.unicorn.ujin.view.activity.domru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.adapters.domru.PasswordRecoveryPagerAdapter;
import p035ru.unicorn.ujin.view.fragments.domru.PasswordRecoveryFirstFragment;
import p035ru.unicorn.ujin.view.fragments.domru.PasswordRecoverySecondFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0006\u0010\u0011\u001a\u00020\tJ\b\u0010\u0012\u001a\u00020\tH\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/domru/PasswordRecoveryActivity;", "Lru/unicorn/ujin/view/activity/BaseActivity;", "()V", "steps", "", "Landroidx/fragment/app/Fragment;", "getBottomNavigationMenuId", "", "goToAuthActivity", "", "goToNextStep", "goToPreviousStep", "hasBottomSheet", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "sendPassword", "showChatsFragment", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.domru.PasswordRecoveryActivity */
/* compiled from: PasswordRecoveryActivity.kt */
public final class PasswordRecoveryActivity extends BaseActivity {
    private HashMap _$_findViewCache;
    private final List<Fragment> steps = CollectionsKt.listOf(PasswordRecoveryFirstFragment.Companion.newInstance(), PasswordRecoverySecondFragment.Companion.newInstance());

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

    public final void sendPassword() {
    }

    /* access modifiers changed from: protected */
    public void showChatsFragment() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_restore_pass_domru);
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.vpPasswordRecoverySteps);
        Intrinsics.checkNotNullExpressionValue(viewPager, "vpPasswordRecoverySteps");
        viewPager.setAdapter(new PasswordRecoveryPagerAdapter(getSupportFragmentManager(), this.steps));
        ((ViewPager) _$_findCachedViewById(C5619R.C5622id.vpPasswordRecoverySteps)).setOnTouchListener(PasswordRecoveryActivity$onCreate$1.INSTANCE);
    }

    public final void goToNextStep() {
        ((ViewPager) _$_findCachedViewById(C5619R.C5622id.vpPasswordRecoverySteps)).setCurrentItem(1, true);
    }

    public final void goToPreviousStep() {
        ((ViewPager) _$_findCachedViewById(C5619R.C5622id.vpPasswordRecoverySteps)).setCurrentItem(0, true);
    }

    public final void goToAuthActivity() {
        startActivity(new Intent(this, RegisterDomruActivity.class));
        finish();
    }
}
