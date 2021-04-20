package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentPassFingerSecondBinding;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragmentKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0006H\u0014J\b\u0010\u0012\u001a\u00020\fH\u0014J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0002H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\fH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/PassCreateFingerSecondFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassFingerSecondBinding;", "()V", "iterationCount", "", "getIterationCount", "()I", "setIterationCount", "(I)V", "sn", "", "getSn", "()Ljava/lang/String;", "setSn", "(Ljava/lang/String;)V", "getLayoutRes", "getMyToolbarTitle", "onFileChoose", "", "filePath", "onViewCreated", "viewModell", "showDialogMessage", "label", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.PassCreateFingerSecondFragment */
/* compiled from: PassCreateFingerSecondFragment.kt */
public final class PassCreateFingerSecondFragment extends BaseBindingFragment<PassProfileVM, FragmentPassFingerSecondBinding> {
    public static final String ARG_ITERATION_COUNT = "arg_iteration_count";
    public static final String ARG_LABEL = "arg_label";
    public static final String ARG_PARAM = "arg_param";
    public static final String ARG_SERIAL_NUMBER = "arg_serial_number";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private int iterationCount = -1;

    /* renamed from: sn */
    private String f6844sn = "";

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
        return R.layout.fragment_pass_finger_second;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    public final String getSn() {
        return this.f6844sn;
    }

    public final void setSn(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f6844sn = str;
    }

    public final int getIterationCount() {
        return this.iterationCount;
    }

    public final void setIterationCount(int i) {
        this.iterationCount = i;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassProfileVM passProfileVM) {
        Intrinsics.checkNotNullParameter(passProfileVM, "viewModell");
        ProgressBar progressBar = ((FragmentPassFingerSecondBinding) getViewDataBinding()).f6584pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "viewDataBinding.pb");
        AnotherPassDetailFragmentKt.setVisibleOrHide(progressBar, true);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("arg_serial_number");
            if (string == null) {
                string = "";
            }
            this.f6844sn = string;
            this.iterationCount = arguments.getInt(ARG_ITERATION_COUNT);
            String string2 = arguments.getString(ARG_PARAM);
            String string3 = arguments.getString("arg_label");
            if (string3 == null) {
                string3 = "";
            }
            Intrinsics.checkNotNullExpressionValue(string3, "it.getString(ARG_LABEL)?:\"\"");
            TextView textView = ((FragmentPassFingerSecondBinding) getViewDataBinding()).choose1.subtitle;
            Intrinsics.checkNotNullExpressionValue(textView, "viewDataBinding.choose1.subtitle");
            textView.setText(string3);
            passProfileVM.startScanFinger(this.f6844sn, this.iterationCount, string2);
        }
        ExtensionKt.observe((Fragment) this, passProfileVM.getIterationResult(), new PassCreateFingerSecondFragment$onViewCreated$2(this));
        ExtensionKt.observe((Fragment) this, passProfileVM.getIterationError(), new PassCreateFingerSecondFragment$onViewCreated$3(this));
    }

    /* access modifiers changed from: private */
    public final void showDialogMessage(String str) {
        DialogHelper.showDialog((Context) getActivity(), str, (DialogHelper.OnButtonDialogClick) new PassCreateFingerSecondFragment$showDialogMessage$1(this));
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_pass);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_pass)");
        return string;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/PassCreateFingerSecondFragment$Companion;", "", "()V", "ARG_ITERATION_COUNT", "", "ARG_LABEL", "ARG_PARAM", "ARG_SERIAL_NUMBER", "start", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/PassCreateFingerSecondFragment;", "iterationCount", "", "serialNumber", "text", "param", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.PassCreateFingerSecondFragment$Companion */
    /* compiled from: PassCreateFingerSecondFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PassCreateFingerSecondFragment start(int i, String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "serialNumber");
            Intrinsics.checkNotNullParameter(str2, "text");
            return start(i, str, str2, (String) null);
        }

        public final PassCreateFingerSecondFragment start(int i, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "serialNumber");
            Intrinsics.checkNotNullParameter(str2, "text");
            Bundle bundle = new Bundle();
            bundle.putInt(PassCreateFingerSecondFragment.ARG_ITERATION_COUNT, i);
            bundle.putString("arg_serial_number", str);
            bundle.putString("arg_label", str2);
            bundle.putString(PassCreateFingerSecondFragment.ARG_PARAM, str3);
            PassCreateFingerSecondFragment passCreateFingerSecondFragment = new PassCreateFingerSecondFragment();
            passCreateFingerSecondFragment.setArguments(bundle);
            return passCreateFingerSecondFragment;
        }
    }
}
