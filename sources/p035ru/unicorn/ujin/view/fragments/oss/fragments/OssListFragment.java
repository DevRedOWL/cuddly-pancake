package p035ru.unicorn.ujin.view.fragments.oss.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.oss.fragments.OssActiveArchiveFragment;
import p035ru.unicorn.ujin.view.fragments.oss.response.Oss;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/fragments/OssListFragment;", "Lru/unicorn/ujin/view/fragments/oss/fragments/OssBaseFragment;", "()V", "ossToConfirm", "Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "getOssToConfirm", "()Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "setOssToConfirm", "(Lru/unicorn/ujin/view/fragments/oss/response/Oss;)V", "handleOssList", "", "event", "Lru/unicorn/ujin/view/fragments/oss/events/OssListEvent;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "OssPagerAdapter", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssListFragment */
/* compiled from: OssListFragment.kt */
public final class OssListFragment extends OssBaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private Oss ossToConfirm;

    @JvmStatic
    public static final OssListFragment newInstance(String str) {
        return Companion.newInstance(str);
    }

    @JvmStatic
    public static final OssListFragment newInstance(String str, Oss oss) {
        return Companion.newInstance(str, oss);
    }

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
        return "Экран голосований";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final Oss getOssToConfirm() {
        return this.ossToConfirm;
    }

    public final void setOssToConfirm(Oss oss) {
        this.ossToConfirm = oss;
    }

    public void showToolbar() {
        super.showToolbar();
        getBaseActivity().hideToolbarShadow();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_oss_list, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getOssViewModel().showLoader.observe(getViewLifecycleOwner(), new OssListFragment$onViewCreated$1(this));
        getOssViewModel().getOssListMutableLiveData().observe(getViewLifecycleOwner(), new OssListFragment$onViewCreated$2(this));
        getOssViewModel().requestOssList();
        Oss oss = this.ossToConfirm;
        if (oss != null) {
            showSmsConfirmation(oss);
            this.ossToConfirm = null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r0.getOssList();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleOssList(p035ru.unicorn.ujin.view.fragments.oss.events.OssListEvent r5) {
        /*
            r4 = this;
            boolean r0 = r5.getSuccess()
            if (r0 == 0) goto L_0x0072
            ru.unicorn.ujin.view.fragments.oss.response.OssListResponseData r0 = r5.getOssList()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            java.util.ArrayList r0 = r0.getOssList()
            if (r0 == 0) goto L_0x0018
            int r0 = r0.size()
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 <= 0) goto L_0x0061
            int r0 = p035ru.unicorn.C5619R.C5622id.vpOss
            android.view.View r0 = r4._$_findCachedViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            java.lang.String r1 = "vpOss"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            ru.unicorn.ujin.view.fragments.oss.fragments.OssListFragment$OssPagerAdapter r1 = new ru.unicorn.ujin.view.fragments.oss.fragments.OssListFragment$OssPagerAdapter
            ru.unicorn.ujin.view.fragments.oss.response.OssListResponseData r5 = r5.getOssList()
            if (r5 == 0) goto L_0x0037
            java.util.ArrayList r5 = r5.getOssList()
            if (r5 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x003c:
            androidx.fragment.app.FragmentManager r2 = r4.getChildFragmentManager()
            java.lang.String r3 = "childFragmentManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>(r4, r5, r2)
            androidx.viewpager.widget.PagerAdapter r1 = (androidx.viewpager.widget.PagerAdapter) r1
            r0.setAdapter(r1)
            int r5 = p035ru.unicorn.C5619R.C5622id.tlOss
            android.view.View r5 = r4._$_findCachedViewById(r5)
            com.google.android.material.tabs.TabLayout r5 = (com.google.android.material.tabs.TabLayout) r5
            int r0 = p035ru.unicorn.C5619R.C5622id.vpOss
            android.view.View r0 = r4._$_findCachedViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r5.setupWithViewPager(r0)
            goto L_0x0079
        L_0x0061:
            int r5 = p035ru.unicorn.C5619R.C5622id.tvNoOss
            android.view.View r5 = r4._$_findCachedViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r0 = "tvNoOss"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r5.setVisibility(r1)
            goto L_0x0079
        L_0x0072:
            java.lang.String r5 = r5.getMessage()
            r4.showMessage((java.lang.String) r5)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.oss.fragments.OssListFragment.handleOssList(ru.unicorn.ujin.view.fragments.oss.events.OssListEvent):void");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/fragments/OssListFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/oss/fragments/OssListFragment;", "title", "", "ossToConfirm", "Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssListFragment$Companion */
    /* compiled from: OssListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final OssListFragment newInstance(String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            OssListFragment ossListFragment = new OssListFragment();
            ossListFragment.setTitle(str);
            return ossListFragment;
        }

        @JvmStatic
        public final OssListFragment newInstance(String str, Oss oss) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(oss, "ossToConfirm");
            OssListFragment ossListFragment = new OssListFragment();
            ossListFragment.setTitle(str);
            ossListFragment.setOssToConfirm(oss);
            return ossListFragment;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\fH\u0016R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/fragments/OssListFragment$OssPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "ossList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "Lkotlin/collections/ArrayList;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lru/unicorn/ujin/view/fragments/oss/fragments/OssListFragment;Ljava/util/ArrayList;Landroidx/fragment/app/FragmentManager;)V", "getOssList", "()Ljava/util/ArrayList;", "getCount", "", "getItem", "Lru/unicorn/ujin/view/fragments/oss/fragments/OssActiveArchiveFragment;", "position", "getPageTitle", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssListFragment$OssPagerAdapter */
    /* compiled from: OssListFragment.kt */
    public final class OssPagerAdapter extends FragmentStatePagerAdapter {
        private final ArrayList<Oss> ossList;
        final /* synthetic */ OssListFragment this$0;

        public int getCount() {
            return 2;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OssPagerAdapter(OssListFragment ossListFragment, ArrayList<Oss> arrayList, FragmentManager fragmentManager) {
            super(fragmentManager);
            Intrinsics.checkNotNullParameter(arrayList, "ossList");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            this.this$0 = ossListFragment;
            this.ossList = arrayList;
        }

        public final ArrayList<Oss> getOssList() {
            return this.ossList;
        }

        public OssActiveArchiveFragment getItem(int i) {
            OssListFragment ossListFragment;
            int i2;
            OssActiveArchiveFragment.Companion companion = OssActiveArchiveFragment.Companion;
            String title = this.this$0.getTitle();
            Collection arrayList = new ArrayList();
            for (Object next : this.ossList) {
                boolean isArchived = ((Oss) next).isArchived();
                if (i == 0) {
                    isArchived = !isArchived;
                }
                if (isArchived) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            if (i == 0) {
                ossListFragment = this.this$0;
                i2 = R.string.ossNoActiveOsses;
            } else {
                ossListFragment = this.this$0;
                i2 = R.string.ossNoArchiveOsses;
            }
            String string = ossListFragment.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "if (position == 0) getSt…string.ossNoArchiveOsses)");
            return companion.newInstance(title, list, string);
        }

        public String getPageTitle(int i) {
            String str;
            if (i != 0) {
                str = i != 1 ? "" : this.this$0.getString(R.string.ossArchive);
            } else {
                str = this.this$0.getString(R.string.ossActive);
            }
            Intrinsics.checkNotNullExpressionValue(str, "when (position) {\n      …     else -> \"\"\n        }");
            return str;
        }
    }
}
