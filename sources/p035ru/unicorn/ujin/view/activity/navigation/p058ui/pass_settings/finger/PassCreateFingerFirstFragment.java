package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentPassFingerFirstBinding;
import p035ru.unicorn.ujin.ble.data.PASS_TYPE;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/PassCreateFingerFirstFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassFingerFirstBinding;", "()V", "adapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getAdapter", "()Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "bleReaderSection", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/BleReaderSection;", "getLayoutRes", "", "getMyToolbarTitle", "", "initRecyclerView", "", "onFileChoose", "filePath", "onViewCreated", "viewModell", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.PassCreateFingerFirstFragment */
/* compiled from: PassCreateFingerFirstFragment.kt */
public final class PassCreateFingerFirstFragment extends BaseBindingFragment<PassProfileVM, FragmentPassFingerFirstBinding> {
    private HashMap _$_findViewCache;
    private final SectionedAdapter adapter = new SectionedAdapter();
    /* access modifiers changed from: private */
    public final BleReaderSection bleReaderSection = new BleReaderSection();

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
        return R.layout.fragment_pass_finger_first;
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
        Intrinsics.checkNotNullParameter(passProfileVM, "viewModell");
        passProfileVM.getSelectedFingerReader().setValue(-1);
        initRecyclerView();
        ((FragmentPassFingerFirstBinding) getViewDataBinding()).addFinger.setOnClickListener(new PassCreateFingerFirstFragment$onViewCreated$1(this));
        passProfileVM.loadBleBy(PASS_TYPE.FINGER.getType());
        ExtensionKt.observe((Fragment) this, passProfileVM.getBleReaderDataFilterBy(), new PassCreateFingerFirstFragment$onViewCreated$2(this));
        ExtensionKt.observe((Fragment) this, passProfileVM.getSelectedFingerReader(), new PassCreateFingerFirstFragment$onViewCreated$3(this));
    }

    private final void initRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv");
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv");
        recyclerView2.setAdapter(this.adapter);
        this.adapter.addSectionSafety(this.bleReaderSection);
        this.disposable.add(this.bleReaderSection.getItemClick().subscribe(new PassCreateFingerFirstFragment$initRecyclerView$1(this)));
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_pass);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_pass)");
        return string;
    }
}
