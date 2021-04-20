package p035ru.unicorn.ujin.view.fragments.rozmarin;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.RozmarinViewModel;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J(\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015H\u0004J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/rozmarin/BaseRozmarinFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "rozmarinViewModel", "Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/RozmarinViewModel;", "getRozmarinViewModel", "()Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/RozmarinViewModel;", "rozmarinViewModel$delegate", "Lkotlin/Lazy;", "metricsScreenName", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showAlert", "title", "message", "function", "Lkotlin/Function0;", "showProgress", "loading", "", "showResponse", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.rozmarin.BaseRozmarinFragment */
/* compiled from: BaseRozmarinFragment.kt */
public abstract class BaseRozmarinFragment extends BaseFragment {
    private HashMap _$_findViewCache;
    private final Lazy rozmarinViewModel$delegate = LazyKt.lazy(new BaseRozmarinFragment$rozmarinViewModel$2(this));

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

    public final RozmarinViewModel getRozmarinViewModel() {
        return (RozmarinViewModel) this.rozmarinViewModel$delegate.getValue();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        String string = getString(R.string.metricsChatListFragment);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.metricsChatListFragment)");
        return string;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner lifecycleOwner = this;
        getRozmarinViewModel().getRequestLiveData().observe(lifecycleOwner, new BaseRozmarinFragment$onViewCreated$1(this));
        getRozmarinViewModel().getShowProgressLiveData().observe(lifecycleOwner, new BaseRozmarinFragment$onViewCreated$2(this));
    }

    /* access modifiers changed from: private */
    public final void showProgress(boolean z) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    public final void showResponse(UpdateEvent updateEvent) {
        new AlertDialog.Builder(getBaseActivity()).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) BaseRozmarinFragment$showResponse$1.INSTANCE).setTitle(updateEvent.getSuccess() ? R.string.rozmarinRequestSent : R.string.rozmarinError).setMessage((CharSequence) updateEvent.getSuccess() ? getString(R.string.rozmarinManagerWillCallYou) : updateEvent.getMessage()).show();
    }

    /* access modifiers changed from: protected */
    public final void showAlert(String str, String str2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(function0, "function");
        new AlertDialog.Builder(getBaseActivity()).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) new BaseRozmarinFragment$showAlert$1(function0)).setNegativeButton((int) R.string.cancel, (DialogInterface.OnClickListener) BaseRozmarinFragment$showAlert$2.INSTANCE).setMessage((CharSequence) str2).setTitle((CharSequence) str).show();
    }
}
