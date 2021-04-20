package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentConnectToCompanyBinding;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u000e\u001a\u00020\nH\u0002¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/ConnectToCompanyFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/PassCompanyVM;", "Lru/unicorn/databinding/FragmentConnectToCompanyBinding;", "()V", "getLayoutRes", "", "getMyToolbarTitle", "", "onFileChoose", "", "filePath", "onViewCreated", "viewModell", "showSuccesMessage", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ConnectToCompanyFragment */
/* compiled from: ConnectToCompanyFragment.kt */
public final class ConnectToCompanyFragment extends BaseBindingFragment<PassCompanyVM, FragmentConnectToCompanyBinding> {
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
    public int getLayoutRes() {
        return R.layout.fragment_connect_to_company;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassCompanyVM passCompanyVM) {
        SingleLiveEvent singleLiveEvent;
        SingleLiveEvent<String> showSuccess;
        FragmentConnectToCompanyBinding fragmentConnectToCompanyBinding = (FragmentConnectToCompanyBinding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentConnectToCompanyBinding, "viewDataBinding");
        fragmentConnectToCompanyBinding.setVm(passCompanyVM);
        if (passCompanyVM != null) {
            passCompanyVM.getCompanyById();
        }
        if (!(passCompanyVM == null || (showSuccess = passCompanyVM.getShowSuccess()) == null)) {
            showSuccess.observe(getViewLifecycleOwner(), new ConnectToCompanyFragment$onViewCreated$1(this));
        }
        if (passCompanyVM != null && (singleLiveEvent = passCompanyVM.showError) != null) {
            singleLiveEvent.observe(getViewLifecycleOwner(), new ConnectToCompanyFragment$onViewCreated$2(this));
        }
    }

    /* access modifiers changed from: private */
    public final void showSuccesMessage() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            MaterialDialog.positiveButton$default(MaterialDialog.message$default(new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.label_connect_success), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.button_OK), (CharSequence) null, new ConnectToCompanyFragment$showSuccesMessage$$inlined$let$lambda$1(this), 2, (Object) null).show();
        }
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_company);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_company)");
        return string;
    }
}
