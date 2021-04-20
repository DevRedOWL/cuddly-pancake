package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.AnotherPassAdapter;
import p035ru.unicorn.ujin.view.fragments.anotherPass.events.AnotherPassListEvent;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0014J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0014¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassFragment;", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/BaseAnotherPassFragment;", "()V", "handlePassClick", "", "passe", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Passe;", "handlePassListEvent", "event", "Lru/unicorn/ujin/view/fragments/anotherPass/events/AnotherPassListEvent;", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFragment */
/* compiled from: AnotherPassFragment.kt */
public final class AnotherPassFragment extends BaseAnotherPassFragment {
    private HashMap _$_findViewCache;

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
        return "Экран очередных пропусков";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        Fragment findFragmentByTag = baseActivity.getSupportFragmentManager().findFragmentByTag(BaseActivity.FRAGMENT_ANOTHER_PASS_LIST);
        if (findFragmentByTag != null && (findFragmentByTag instanceof AnotherPassListFragment)) {
            ((AnotherPassListFragment) findFragmentByTag).showToolbar();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_another_pass_active, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnNewPass)).setOnClickListener(new AnotherPassFragment$onViewCreated$$inlined$apply$lambda$1(this));
        getPassViewModel().showLoader.observe(getViewLifecycleOwner(), new AnotherPassFragment$onViewCreated$2(this));
        getPassViewModel().getMyPassListMutableLiveData().observe(getViewLifecycleOwner(), new AnotherPassFragment$onViewCreated$3(this));
        getPassViewModel().getPassList();
    }

    /* access modifiers changed from: private */
    public final void handlePassListEvent(AnotherPassListEvent anotherPassListEvent) {
        if (anotherPassListEvent.getSuccess()) {
            ArrayList<Passe> passList = anotherPassListEvent.getPassList();
            if (passList == null || !(!passList.isEmpty())) {
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "rv");
                recyclerView.setVisibility(8);
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llMessage);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "llMessage");
                linearLayout.setVisibility(0);
                return;
            }
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv");
            recyclerView2.setAdapter(new AnotherPassAdapter(passList, new AnotherPassFragment$handlePassListEvent$1(this, passList)));
            return;
        }
        showMessage(anotherPassListEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public final void handlePassClick(Passe passe) {
        nextFragment(AnotherPassDetailFragment.Companion.newInstance(passe, false), false, BaseActivity.FRAGMENT_ANOTHER_PASS_DETAIL);
    }
}
