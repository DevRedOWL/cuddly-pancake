package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Pass;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.PassIn;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00132\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002J\u001c\u0010\u001b\u001a\u00020\u00132\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001c0\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0002H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/CoronaFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/CoronaViewModel;", "()V", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "passSection", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassSection;", "getPassSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassSection;", "getLayoutRes", "", "getMyToolbarTitle", "", "initSections", "", "onClick", "pass", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassIn;", "onGetPass", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;", "onLoadData", "", "onViewCreated", "vm", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaFragment */
/* compiled from: CoronaFragment.kt */
public final class CoronaFragment extends BaseSectionFragment<CoronaViewModel> {
    private HashMap _$_findViewCache;
    public AlertDialog dialog;
    private final PassSection passSection = new PassSection();

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
    public int getLayoutRes() {
        return R.layout.fragment_section_base_with_button;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final PassSection getPassSection() {
        return this.passSection;
    }

    public final AlertDialog getDialog() {
        AlertDialog alertDialog = this.dialog;
        if (alertDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        return alertDialog;
    }

    public final void setDialog(AlertDialog alertDialog) {
        Intrinsics.checkNotNullParameter(alertDialog, "<set-?>");
        this.dialog = alertDialog;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(CoronaViewModel coronaViewModel) {
        Intrinsics.checkNotNullParameter(coronaViewModel, "vm");
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.create);
        if (dynamicBackgroundButton != null) {
            dynamicBackgroundButton.setOnClickListener(new CoronaFragment$onViewCreated$1(this, coronaViewModel));
        }
        ProgressBar progressBar = this.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(0);
        coronaViewModel.getPassList();
        coronaViewModel.getPassListMutable().observe(getViewLifecycleOwner(), new CoronaFragment$onViewCreated$2(this));
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        this.sectionedAdapter.addSection(this.passSection);
        this.passSection.getItemClick().subscribe(new CoronaFragment$initSections$1(this));
    }

    /* access modifiers changed from: private */
    public final void onGetPass(Resource<Pass> resource) {
        Resource.Status status;
        Resource.Status status2;
        ProgressBar progressBar = this.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(4);
        if (resource == null || (status2 = resource.getStatus()) == null || !status2.equals(Resource.Status.SUCCESS)) {
            if (resource != null && (status = resource.getStatus()) != null && status.equals(Resource.Status.ERROR)) {
                AlertDialog showDialog2 = DialogHelper.showDialog2(getActivity(), "Ошибка загрузки пропуска");
                Intrinsics.checkNotNullExpressionValue(showDialog2, "DialogHelper.showDialog2…шибка загрузки пропуска\")");
                this.dialog = showDialog2;
                AlertDialog alertDialog = this.dialog;
                if (alertDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                }
                if (!alertDialog.isShowing()) {
                    AlertDialog alertDialog2 = this.dialog;
                    if (alertDialog2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    }
                    alertDialog2.show();
                }
            }
        } else if (!resource.getData().getState().getSlug().equals("revoked")) {
            nextFragment(new PassDetailFragment(), false);
        } else {
            AlertDialog showDialog22 = DialogHelper.showDialog2(getActivity(), "Ваш пропуск заблокирован, по причине: " + resource.getData().getRevokeComment());
            Intrinsics.checkNotNullExpressionValue(showDialog22, "DialogHelper.showDialog2… data.data.revokeComment)");
            this.dialog = showDialog22;
            AlertDialog alertDialog3 = this.dialog;
            if (alertDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            }
            if (!alertDialog3.isShowing()) {
                AlertDialog alertDialog4 = this.dialog;
                if (alertDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                }
                alertDialog4.show();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void onClick(PassIn passIn) {
        ProgressBar progressBar = this.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(0);
        ((CoronaViewModel) this.viewModell).currentPass(passIn);
        ((CoronaViewModel) this.viewModell).getPassDetailMutable().observe(this, new CoronaFragment$onClick$1(this));
    }

    /* access modifiers changed from: private */
    public final void onLoadData(Resource<List<PassIn>> resource) {
        ProgressBar progressBar = this.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(4);
        this.passSection.setData(resource.getData());
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_ticket);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_ticket)");
        return string;
    }
}
