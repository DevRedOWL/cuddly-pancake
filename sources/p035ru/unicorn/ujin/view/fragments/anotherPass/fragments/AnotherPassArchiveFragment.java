package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.AnotherPassAdapter;
import p035ru.unicorn.ujin.view.fragments.anotherPass.events.AnotherArchivePassListEvent;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0014J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassArchiveFragment;", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/BaseAnotherPassFragment;", "()V", "forSearch", "", "searchString", "", "handleArchivePassListEvent", "", "event", "Lru/unicorn/ujin/view/fragments/anotherPass/events/AnotherArchivePassListEvent;", "handlePassClick", "passe", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Passe;", "handleSearchArchivePassListEvent", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassArchiveFragment */
/* compiled from: AnotherPassArchiveFragment.kt */
public final class AnotherPassArchiveFragment extends BaseAnotherPassFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public boolean forSearch;
    /* access modifiers changed from: private */
    public String searchString = "";

    @JvmStatic
    public static final AnotherPassArchiveFragment newInstance(boolean z) {
        return Companion.newInstance(z);
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
            if (this.forSearch) {
                getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
                getBaseActivity().setTextTitle(getString(R.string.anotherPassArchiveSearch));
                return;
            }
            ((AnotherPassListFragment) findFragmentByTag).showToolbar();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_another_pass_archive, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (this.forSearch) {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C5619R.C5622id.searchLayout);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "searchLayout");
            constraintLayout.setVisibility(0);
            getPassViewModel().getMySearchArchivePassListMutableLiveData().observe(getViewLifecycleOwner(), new AnotherPassArchiveFragment$onViewCreated$1(this));
            ((EditText) _$_findCachedViewById(C5619R.C5622id.etSearch)).addTextChangedListener(new AnotherPassArchiveFragment$onViewCreated$2(this));
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(C5619R.C5622id.searchLayout);
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "searchLayout");
        constraintLayout2.setVisibility(8);
        getPassViewModel().getMyArchivePassListMutableLiveData().observe(getViewLifecycleOwner(), new AnotherPassArchiveFragment$onViewCreated$3(this));
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(0);
        getPassViewModel().getArchivePassList();
    }

    /* access modifiers changed from: private */
    public final void handleArchivePassListEvent(AnotherArchivePassListEvent anotherArchivePassListEvent) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(8);
        if (anotherArchivePassListEvent.getSuccess()) {
            ArrayList<Passe> passList = anotherArchivePassListEvent.getPassList();
            if (passList == null || !(!passList.isEmpty())) {
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "rv");
                recyclerView.setVisibility(8);
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvMessageTitle);
                Intrinsics.checkNotNullExpressionValue(textView, "tvMessageTitle");
                textView.setVisibility(0);
                return;
            }
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvMessageTitle);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvMessageTitle");
            textView2.setVisibility(8);
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv");
            recyclerView2.setVisibility(0);
            RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "rv");
            recyclerView3.setAdapter(new AnotherPassAdapter(passList, new AnotherPassArchiveFragment$handleArchivePassListEvent$1(this, passList)));
            return;
        }
        showMessage(anotherArchivePassListEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public final void handleSearchArchivePassListEvent(AnotherArchivePassListEvent anotherArchivePassListEvent) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(8);
        if (this.forSearch && this.searchString.length() < 3) {
            return;
        }
        if (anotherArchivePassListEvent.getSuccess()) {
            ArrayList<Passe> passList = anotherArchivePassListEvent.getPassList();
            if (passList == null || !(!passList.isEmpty())) {
                TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.view2);
                Intrinsics.checkNotNullExpressionValue(textView, "view2");
                textView.setVisibility(8);
                TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvSearchHint);
                Intrinsics.checkNotNullExpressionValue(textView2, "tvSearchHint");
                textView2.setText(getString(R.string.another_pass_search_no_result));
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "rv");
                recyclerView.setVisibility(8);
                return;
            }
            TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.view2);
            Intrinsics.checkNotNullExpressionValue(textView3, "view2");
            textView3.setVisibility(0);
            TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvSearchHint);
            Intrinsics.checkNotNullExpressionValue(textView4, "tvSearchHint");
            textView4.setText(getString(R.string.another_pass_search_result, Integer.valueOf(passList.size())));
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv");
            recyclerView2.setVisibility(0);
            RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "rv");
            recyclerView3.setAdapter(new AnotherPassAdapter(passList, new AnotherPassArchiveFragment$handleSearchArchivePassListEvent$1(this, passList)));
            return;
        }
        showMessage(anotherArchivePassListEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public final void handlePassClick(Passe passe) {
        nextFragment(AnotherPassDetailFragment.Companion.newInstance(passe, false), false, BaseActivity.FRAGMENT_ANOTHER_PASS_DETAIL);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassArchiveFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassArchiveFragment;", "forSearch", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassArchiveFragment$Companion */
    /* compiled from: AnotherPassArchiveFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final AnotherPassArchiveFragment newInstance(boolean z) {
            AnotherPassArchiveFragment anotherPassArchiveFragment = new AnotherPassArchiveFragment();
            anotherPassArchiveFragment.forSearch = z;
            return anotherPassArchiveFragment;
        }
    }
}
