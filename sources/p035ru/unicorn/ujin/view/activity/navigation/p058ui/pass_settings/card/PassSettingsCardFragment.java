package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.card;

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
import p035ru.unicorn.databinding.FragmentPassSettingsCardBinding;
import p035ru.unicorn.ujin.ble.data.PASS_TYPE;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger.BleReaderSection;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0010H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/card/PassSettingsCardFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassSettingsCardBinding;", "()V", "adapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getAdapter", "()Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "bleReaderSection", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/BleReaderSection;", "getAvailableCards", "", "getLayoutRes", "", "getMyToolbarTitle", "", "onFileChoose", "filePath", "onViewCreated", "viewModell", "showDeleteDialog", "sn", "showDialogMessage", "label", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.card.PassSettingsCardFragment */
/* compiled from: PassSettingsCardFragment.kt */
public final class PassSettingsCardFragment extends BaseBindingFragment<PassProfileVM, FragmentPassSettingsCardBinding> {
    public static final String ARG_ICON_RES = "ARG_ICON_RES";
    public static final String ARG_PASS_TYPE = "ARG_PASS_TYPE";
    public static final String ARG_TITLE_RES = "ARG_TITLE_RES";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private final SectionedAdapter adapter = new SectionedAdapter();
    private final BleReaderSection bleReaderSection = new BleReaderSection();

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
        return R.layout.fragment_pass_settings_card;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    public final SectionedAdapter getAdapter() {
        return this.adapter;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassProfileVM passProfileVM) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            TextView textView = ((FragmentPassSettingsCardBinding) getViewDataBinding()).id1.f6602tv;
            Intrinsics.checkNotNullExpressionValue(textView, "viewDataBinding.id1.tv");
            textView.setText(getString(arguments.getInt("ARG_TITLE_RES")));
            ((FragmentPassSettingsCardBinding) getViewDataBinding()).id1.f6601iv.setImageResource(arguments.getInt("ARG_ICON_RES"));
        }
        ((FragmentPassSettingsCardBinding) getViewDataBinding()).choose1.parent.setOnClickListener(new PassSettingsCardFragment$onViewCreated$2(this));
        ((FragmentPassSettingsCardBinding) getViewDataBinding()).choose2.parent.setOnClickListener(new PassSettingsCardFragment$onViewCreated$3(this));
        getAvailableCards();
    }

    private final void getAvailableCards() {
        ((PassProfileVM) getViewModell()).getMyPassBy(PASS_TYPE.CARD.getType());
        ExtensionKt.observe((Fragment) this, ((PassProfileVM) getViewModell()).getBleKeyDataFilterBy(), new PassSettingsCardFragment$getAvailableCards$1(this));
    }

    /* access modifiers changed from: private */
    public final void showDeleteDialog(String str) {
        DialogHelper.showDialog(getActivity(), getString(R.string.delete), R.string.button_ok, R.string.cancel, new PassSettingsCardFragment$showDeleteDialog$1(this, str));
    }

    /* access modifiers changed from: private */
    public final void showDialogMessage(String str) {
        DialogHelper.showDialog((Context) getActivity(), str, (DialogHelper.OnButtonDialogClick) new PassSettingsCardFragment$showDialogMessage$1(this));
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_pass);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_pass)");
        return string;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/card/PassSettingsCardFragment$Companion;", "", "()V", "ARG_ICON_RES", "", "ARG_PASS_TYPE", "ARG_TITLE_RES", "newInstance", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/card/PassSettingsCardFragment;", "iconRes", "", "labelRes", "passType", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.card.PassSettingsCardFragment$Companion */
    /* compiled from: PassSettingsCardFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PassSettingsCardFragment newInstance(int i, int i2, String str) {
            Intrinsics.checkNotNullParameter(str, "passType");
            PassSettingsCardFragment passSettingsCardFragment = new PassSettingsCardFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("ARG_ICON_RES", i);
            bundle.putInt("ARG_TITLE_RES", i2);
            bundle.putString("ARG_PASS_TYPE", str);
            Unit unit = Unit.INSTANCE;
            passSettingsCardFragment.setArguments(bundle);
            return passSettingsCardFragment;
        }
    }
}
