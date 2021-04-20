package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentPassSettingsFingerBinding;
import p035ru.unicorn.ujin.ble.data.PASS_TYPE;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.common.IPassFragment;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH\u0002¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/PassSettingsFingerFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassSettingsFingerBinding;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/common/IPassFragment;", "()V", "getLayoutRes", "", "getMyToolbarTitle", "", "onFileChoose", "", "filePath", "onViewCreated", "viewModell", "showDeleteDialog", "sn", "showDialogMessage", "label", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.PassSettingsFingerFragment */
/* compiled from: PassSettingsFingerFragment.kt */
public final class PassSettingsFingerFragment extends BaseBindingFragment<PassProfileVM, FragmentPassSettingsFingerBinding> implements IPassFragment {
    public static final String ARG_ICON_RES = "ARG_ICON_RES";
    public static final String ARG_PASS_TYPE = "ARG_PASS_TYPE";
    public static final String ARG_TITLE_RES = "ARG_TITLE_RES";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
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
        return R.layout.fragment_pass_settings_finger;
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
        Intrinsics.checkNotNullParameter(passProfileVM, "viewModell");
        Bundle arguments = getArguments();
        if (arguments != null) {
            TextView textView = ((FragmentPassSettingsFingerBinding) getViewDataBinding()).id1.f6602tv;
            Intrinsics.checkNotNullExpressionValue(textView, "viewDataBinding.id1.tv");
            textView.setText(getString(arguments.getInt("ARG_TITLE_RES")));
            ((FragmentPassSettingsFingerBinding) getViewDataBinding()).id1.f6601iv.setImageResource(arguments.getInt("ARG_ICON_RES"));
        }
        ((FragmentPassSettingsFingerBinding) getViewDataBinding()).choose1.parent.setOnClickListener(new PassSettingsFingerFragment$onViewCreated$2(this));
        passProfileVM.getMyPassBy(PASS_TYPE.FINGER.getType());
        ExtensionKt.observe((Fragment) this, passProfileVM.getBleKeyDataFilterBy(), new PassSettingsFingerFragment$onViewCreated$3(this));
    }

    /* access modifiers changed from: private */
    public final void showDeleteDialog(String str) {
        DialogHelper.showDialog(getActivity(), getString(R.string.delete), R.string.button_ok, R.string.cancel, new PassSettingsFingerFragment$showDeleteDialog$1(this, str));
    }

    /* access modifiers changed from: private */
    public final void showDialogMessage(String str) {
        DialogHelper.showDialog((Context) getActivity(), str, (DialogHelper.OnButtonDialogClick) new PassSettingsFingerFragment$showDialogMessage$1(this));
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_pass);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_pass)");
        return string;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/PassSettingsFingerFragment$Companion;", "", "()V", "ARG_ICON_RES", "", "ARG_PASS_TYPE", "ARG_TITLE_RES", "newInstance", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/PassSettingsFingerFragment;", "iconRes", "", "labelRes", "passType", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.PassSettingsFingerFragment$Companion */
    /* compiled from: PassSettingsFingerFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PassSettingsFingerFragment newInstance(int i, int i2, String str) {
            Intrinsics.checkNotNullParameter(str, "passType");
            PassSettingsFingerFragment passSettingsFingerFragment = new PassSettingsFingerFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("ARG_ICON_RES", i);
            bundle.putInt("ARG_TITLE_RES", i2);
            bundle.putString("ARG_PASS_TYPE", str);
            Unit unit = Unit.INSTANCE;
            passSettingsFingerFragment.setArguments(bundle);
            return passSettingsFingerFragment;
        }
    }
}
