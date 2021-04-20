package p035ru.unicorn.ujin.view.fragments.base.viewpager;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0013\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0002\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/base/viewpager/BaseViewPagerAdapter;", "Item", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "list", "", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "getList$app_kortrosRelease", "()Ljava/util/List;", "setList$app_kortrosRelease", "(Ljava/util/List;)V", "getCount", "", "getListItem", "position", "(I)Lru/unicorn/ujin/view/fragments/BaseFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.base.viewpager.BaseViewPagerAdapter */
/* compiled from: BaseViewPagerAdapter.kt */
public abstract class BaseViewPagerAdapter<Item extends BaseFragment> extends FragmentPagerAdapter {
    private List<Item> list;

    public final List<Item> getList$app_kortrosRelease() {
        return this.list;
    }

    public final void setList$app_kortrosRelease(List<Item> list2) {
        Intrinsics.checkNotNullParameter(list2, "<set-?>");
        this.list = list2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseViewPagerAdapter(FragmentManager fragmentManager, List<Item> list2) {
        super(fragmentManager, 1);
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Intrinsics.checkNotNullParameter(list2, "list");
        this.list = list2;
    }

    public int getCount() {
        return this.list.size();
    }

    public final Item getListItem(int i) {
        return (BaseFragment) this.list.get(i);
    }
}
