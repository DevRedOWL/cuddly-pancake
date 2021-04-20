package p035ru.unicorn.ujin.view.fragments.pass;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/pass/RegistrationFragment$initTabs$1", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.pass.RegistrationFragment$initTabs$1 */
/* compiled from: RegistrationFragment.kt */
public final class RegistrationFragment$initTabs$1 implements TabLayout.OnTabSelectedListener {
    final /* synthetic */ RegistrationFragment this$0;

    public void onTabReselected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
    }

    public void onTabUnselected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
    }

    RegistrationFragment$initTabs$1(RegistrationFragment registrationFragment) {
        this.this$0 = registrationFragment;
    }

    public void onTabSelected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.this$0.currentMode = tab.getPosition();
        ((TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPassword)).setText("");
        this.this$0.setButtonTextsByMode();
    }
}
