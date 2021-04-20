package p035ru.unicorn.ujin.market.category;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/market/category/ViewPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "fragments", "", "Landroidx/fragment/app/Fragment;", "titles", "", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Ljava/util/List;)V", "currentPosition", "", "getFragments", "()Ljava/util/List;", "setFragments", "(Ljava/util/List;)V", "getTitles", "setTitles", "getCount", "getItem", "position", "getPageTitle", "", "setPrimaryItem", "", "container", "Landroid/view/ViewGroup;", "object", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.category.ViewPagerAdapter */
/* compiled from: ViewPagerAdapter.kt */
public final class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private int currentPosition = -1;
    private List<? extends Fragment> fragments;
    private List<String> titles;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewPagerAdapter(FragmentManager fragmentManager, List<? extends Fragment> list, List<String> list2) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Intrinsics.checkNotNullParameter(list, "fragments");
        Intrinsics.checkNotNullParameter(list2, "titles");
        this.fragments = list;
        this.titles = list2;
    }

    public final List<Fragment> getFragments() {
        return this.fragments;
    }

    public final List<String> getTitles() {
        return this.titles;
    }

    public final void setFragments(List<? extends Fragment> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.fragments = list;
    }

    public final void setTitles(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.titles = list;
    }

    public Fragment getItem(int i) {
        return (Fragment) this.fragments.get(i);
    }

    public int getCount() {
        return this.fragments.size();
    }

    public CharSequence getPageTitle(int i) {
        return this.titles.get(i);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(obj, "object");
        super.setPrimaryItem(viewGroup, i, obj);
        if (i != this.currentPosition && ((Fragment) obj).getView() != null) {
            this.currentPosition = i;
        }
    }
}
