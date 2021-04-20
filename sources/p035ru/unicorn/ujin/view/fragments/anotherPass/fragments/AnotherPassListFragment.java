package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0002J\u0018\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0002J\b\u0010\f\u001a\u00020\rH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassListFragment;", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/BaseAnotherPassFragment;", "()V", "lastPosition", "", "checkAndShowSearchButton", "", "initRightButtonList", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "initTransparentRightButtonList", "metricsScreenName", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "AnotherPassPagerAdapter", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassListFragment */
/* compiled from: AnotherPassListFragment.kt */
public final class AnotherPassListFragment extends BaseAnotherPassFragment {
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public int lastPosition;

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
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Очередной фрагмент списка пропусков";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle("Гостевой пропуск");
        checkAndShowSearchButton();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_another_pass_list, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(C5619R.C5622id.vpPass);
        Intrinsics.checkNotNullExpressionValue(viewPager, "vpPass");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        viewPager.setAdapter(new AnotherPassPagerAdapter(this, childFragmentManager));
        ((ViewPager) _$_findCachedViewById(C5619R.C5622id.vpPass)).addOnPageChangeListener(new AnotherPassListFragment$onViewCreated$1(this));
        ((TabLayout) _$_findCachedViewById(C5619R.C5622id.tlPass)).setupWithViewPager((ViewPager) _$_findCachedViewById(C5619R.C5622id.vpPass));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassListFragment$AnotherPassPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassListFragment;Landroidx/fragment/app/FragmentManager;)V", "getCount", "", "getItem", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/BaseAnotherPassFragment;", "position", "getPageTitle", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassListFragment$AnotherPassPagerAdapter */
    /* compiled from: AnotherPassListFragment.kt */
    public final class AnotherPassPagerAdapter extends FragmentStatePagerAdapter {
        final /* synthetic */ AnotherPassListFragment this$0;

        public int getCount() {
            return 2;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AnotherPassPagerAdapter(AnotherPassListFragment anotherPassListFragment, FragmentManager fragmentManager) {
            super(fragmentManager);
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            this.this$0 = anotherPassListFragment;
        }

        public BaseAnotherPassFragment getItem(int i) {
            return i == 0 ? new AnotherPassFragment() : new AnotherPassArchiveFragment();
        }

        public String getPageTitle(int i) {
            String str;
            if (i != 0) {
                str = i != 1 ? "" : this.this$0.getString(R.string.anotherPassArchiveTab);
            } else {
                str = this.this$0.getString(R.string.anotherPassActiveTab);
            }
            Intrinsics.checkNotNullExpressionValue(str, "when (position) {\n      …     else -> \"\"\n        }");
            return str;
        }
    }

    /* access modifiers changed from: private */
    public final void checkAndShowSearchButton() {
        int i = this.lastPosition;
        if (i == 0) {
            getBaseActivity().setToolbarRight(initTransparentRightButtonList());
        } else if (i == 1) {
            getBaseActivity().setToolbarRight(initRightButtonList());
        }
    }

    private final ArrayList<View> initRightButtonList() {
        ArrayList<View> arrayList = new ArrayList<>();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_24dp, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            ImageButton imageButton = (ImageButton) inflate;
            imageButton.setImageResource(R.drawable.icon_search_magnifier);
            imageButton.setOnClickListener(new AnotherPassListFragment$initRightButtonList$1(this));
            arrayList.add(imageButton);
            return arrayList;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
    }

    private final ArrayList<View> initTransparentRightButtonList() {
        ArrayList<View> arrayList = new ArrayList<>();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_24dp, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            ImageButton imageButton = (ImageButton) inflate;
            imageButton.setImageResource(R.drawable.icon_search_magnifier);
            imageButton.setAlpha(0.0f);
            arrayList.add(imageButton);
            return arrayList;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
    }
}
