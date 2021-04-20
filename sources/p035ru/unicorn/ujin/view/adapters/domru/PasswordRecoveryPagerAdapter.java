package p035ru.unicorn.ujin.view.adapters.domru;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\rH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/domru/PasswordRecoveryPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "steps", "", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "getSteps", "()Ljava/util/List;", "setSteps", "(Ljava/util/List;)V", "getCount", "", "getItem", "position", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.domru.PasswordRecoveryPagerAdapter */
/* compiled from: PasswordRecoveryPagerAdapter.kt */
public final class PasswordRecoveryPagerAdapter extends FragmentPagerAdapter {
    private List<? extends Fragment> steps;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasswordRecoveryPagerAdapter(FragmentManager fragmentManager, List<? extends Fragment> list) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(list, "steps");
        Intrinsics.checkNotNull(fragmentManager);
        this.steps = list;
    }

    public final List<Fragment> getSteps() {
        return this.steps;
    }

    public final void setSteps(List<? extends Fragment> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.steps = list;
    }

    public Fragment getItem(int i) {
        return (Fragment) this.steps.get(i);
    }

    public int getCount() {
        return this.steps.size();
    }
}
