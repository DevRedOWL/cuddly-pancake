package p035ru.unicorn.ujin.view.fragments.profile.subAccounts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0014J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u001a\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/subAccounts/SubAccountListFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "getLayoutRes", "", "handleButtonSubAccountDelete", "", "phone", "", "handleSubAccountList", "event", "Lru/unicorn/ujin/view/fragments/profile/subAccounts/SubAccountEvent;", "handleUpdateEvent", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment */
/* compiled from: SubAccountListFragment.kt */
public final class SubAccountListFragment extends BaseTitleFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;

    @JvmStatic
    public static final SubAccountListFragment newInstance(String str) {
        return Companion.newInstance(str);
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

    public int getLayoutRes() {
        return R.layout.fragment_subaccount_list;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Субаккаунты";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/subAccounts/SubAccountListFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/profile/subAccounts/SubAccountListFragment;", "title", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment$Companion */
    /* compiled from: SubAccountListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SubAccountListFragment newInstance(String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            SubAccountListFragment subAccountListFragment = new SubAccountListFragment();
            subAccountListFragment.setTitle(str);
            return subAccountListFragment;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        getProfileViewModel().getShowProgressLiveData().observe(getViewLifecycleOwner(), new SubAccountListFragment$onCreateView$1(this));
        getProfileViewModel().getSubAccountListLiveData().observe(getViewLifecycleOwner(), new SubAccountListFragment$onCreateView$2(this));
        getProfileViewModel().getDeleteSubAccountListLiveData().observe(getViewLifecycleOwner(), new SubAccountListFragment$onCreateView$3(this));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: private */
    public final void handleUpdateEvent(UpdateEvent updateEvent) {
        if (updateEvent != null) {
            boolean success = updateEvent.getSuccess();
            if (success) {
                getBaseActivity().showMessage((int) R.string.profileSuccessDeletingSubAccount);
            } else if (!success) {
                getBaseActivity().showMessage(updateEvent.getMessage());
            }
        } else {
            getBaseActivity().showMessage((int) R.string.profileErrorDeletingSubAccount);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.Unit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: androidx.recyclerview.widget.RecyclerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlin.Unit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: kotlin.Unit} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: kotlin.Unit} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0040, code lost:
        if (r3 != 0) goto L_0x005f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleSubAccountList(p035ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountEvent r8) {
        /*
            r7 = this;
            r0 = 2131887908(0x7f120724, float:1.9410436E38)
            if (r8 == 0) goto L_0x0068
            boolean r1 = r8.getSuccess()
            r2 = 1
            if (r1 != r2) goto L_0x0050
            ru.unicorn.ujin.data.api.response.SubAccountsResponseData r1 = r8.getData()
            if (r1 == 0) goto L_0x0043
            int r3 = p035ru.unicorn.C5619R.C5622id.rvSubAccountList
            android.view.View r3 = r7._$_findCachedViewById(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r5 = r3.getContext()
            r6 = 0
            r4.<init>(r5, r2, r6)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r4
            r3.setLayoutManager(r4)
            ru.unicorn.ujin.view.adapters.SubAccountsAdapter r2 = new ru.unicorn.ujin.view.adapters.SubAccountsAdapter
            io.realm.RealmList r4 = r1.getSubAccountList()
            java.util.List r4 = (java.util.List) r4
            ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment$handleSubAccountList$$inlined$let$lambda$1 r5 = new ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment$handleSubAccountList$$inlined$let$lambda$1
            r5.<init>(r1, r7, r8)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r2.<init>(r4, r5)
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = (androidx.recyclerview.widget.RecyclerView.Adapter) r2
            r3.setAdapter(r2)
            if (r3 == 0) goto L_0x0043
            goto L_0x005f
        L_0x0043:
            r8 = r7
            ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment r8 = (p035ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment) r8
            ru.unicorn.ujin.view.activity.BaseActivity r8 = r8.getBaseActivity()
            r8.showMessage((int) r0)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            goto L_0x005f
        L_0x0050:
            if (r1 != 0) goto L_0x0062
            ru.unicorn.ujin.view.activity.BaseActivity r1 = r7.getBaseActivity()
            java.lang.String r8 = r8.getMessage()
            r1.showMessage((java.lang.String) r8)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
        L_0x005f:
            if (r3 == 0) goto L_0x0068
            goto L_0x0074
        L_0x0062:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x0068:
            r8 = r7
            ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment r8 = (p035ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment) r8
            ru.unicorn.ujin.view.activity.BaseActivity r8 = r8.getBaseActivity()
            r8.showMessage((int) r0)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment.handleSubAccountList(ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountEvent):void");
    }

    /* access modifiers changed from: private */
    public final void handleButtonSubAccountDelete(String str) {
        getProfileViewModel().requestDeleteSubAccount(str);
    }

    public void onResume() {
        super.onResume();
        getProfileViewModel().requestSubAccountList();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnNewSubAccount)).setOnClickListener(new SubAccountListFragment$onViewCreated$1(this));
    }
}
