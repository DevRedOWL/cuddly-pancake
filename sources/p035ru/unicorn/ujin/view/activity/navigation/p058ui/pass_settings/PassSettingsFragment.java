package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kyleduo.switchbutton.SwitchButton;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.Api;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentPassSettingsBinding;
import p035ru.unicorn.ujin.MainApplication;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/PassSettingsFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassSettingsBinding;", "()V", "getAllAvailableType", "", "getAssignKey", "getLayoutRes", "", "getMyToolbarTitle", "", "isVisible", "bla", "", "onFileChoose", "filePath", "onViewCreated", "viewModell", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.PassSettingsFragment */
/* compiled from: PassSettingsFragment.kt */
public final class PassSettingsFragment extends BaseBindingFragment<PassProfileVM, FragmentPassSettingsBinding> {
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
        return R.layout.fragment_pass_settings;
    }

    public final int isVisible(boolean z) {
        return z ? 0 : 8;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassProfileVM passProfileVM) {
        Api api = Api.INSTANCE;
        Context context = MainApplication.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "MainApplication.getContext()");
        if (api.getDefaultKey(context) != null) {
            View _$_findCachedViewById = _$_findCachedViewById(C5619R.C5622id.open1);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "open1");
            _$_findCachedViewById.setVisibility(0);
            SwitchButton switchButton = (SwitchButton) _$_findCachedViewById(C5619R.C5622id.switch1);
            Intrinsics.checkNotNullExpressionValue(switchButton, "switch1");
            Api api2 = Api.INSTANCE;
            BaseActivity baseActivity = getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            switchButton.setChecked(api2.isRequestAccessByScreenOnEnabled(baseActivity));
            ((SwitchButton) _$_findCachedViewById(C5619R.C5622id.switch1)).setOnCheckedChangeListener(PassSettingsFragment$onViewCreated$1$1.INSTANCE);
        }
        ((FragmentPassSettingsBinding) getViewDataBinding()).choose1.parent.setOnClickListener(new PassSettingsFragment$onViewCreated$2(this));
        ((FragmentPassSettingsBinding) getViewDataBinding()).choose2.parent.setOnClickListener(new PassSettingsFragment$onViewCreated$3(this));
        ((FragmentPassSettingsBinding) getViewDataBinding()).choose4.parent.setOnClickListener(new PassSettingsFragment$onViewCreated$4(this));
        getAllAvailableType();
        getAssignKey();
    }

    private final void getAssignKey() {
        ((PassProfileVM) getViewModell()).getAssignKey();
        ExtensionKt.observe((Fragment) this, ((PassProfileVM) getViewModell()).getAssignKeys(), new PassSettingsFragment$getAssignKey$1(this));
    }

    private final void getAllAvailableType() {
        ((PassProfileVM) getViewModell()).getAllAvailableType();
        ExtensionKt.observe((Fragment) this, ((PassProfileVM) getViewModell()).getAvailablePassType(), new PassSettingsFragment$getAllAvailableType$1(this));
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_pass);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_pass)");
        return string;
    }
}
