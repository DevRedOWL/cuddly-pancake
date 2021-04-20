package p035ru.unicorn.ujin.view.fragments.makearecord;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p035ru.unicorn.ujin.view.fragments.makearecord.sections.RecordSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0014J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0014\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0002H\u0014J\u0016\u0010\u0017\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/ListOfRecordFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "()V", "position", "", "recordSection", "Lru/unicorn/ujin/view/fragments/makearecord/sections/RecordSection;", "getLayoutRes", "getMyToolbarTitle", "", "initSections", "", "labelVisibility", "hasData", "", "onFabClick", "onRecordClick", "data", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "onResume", "onViewCreated", "viewModell", "showRecords", "", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.ListOfRecordFragment */
/* compiled from: ListOfRecordFragment.kt */
public final class ListOfRecordFragment extends BaseSectionFragment<RecordsViewModel> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public int position;
    private final RecordSection recordSection = new RecordSection();

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
        return R.layout.fragment_section_base_with_fab;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: private */
    public final void onFabClick() {
        ((RecordsViewModel) this.viewModell).clearData();
        nextFragment(new RecordFirstStage(), false);
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        SectionedAdapter sectionedAdapter = this.sectionedAdapter;
        Intrinsics.checkNotNullExpressionValue(sectionedAdapter, "sectionedAdapter");
        if (!sectionedAdapter.getSections().contains(this.recordSection)) {
            this.sectionedAdapter.addSection(this.recordSection);
            this.recordSection.getClickSubject().first().subscribe(new ListOfRecordFragment$initSections$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void onRecordClick(Appointment appointment) {
        if (appointment != null) {
            ((RecordsViewModel) this.viewModell).getAppointment().set(appointment);
            nextFragment(ShowRecordFragment.Companion.start(this.position), false);
        }
    }

    public void onResume() {
        super.onResume();
        if (getParentFragment() instanceof RecordsViewPagerFragment) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((RecordsViewPagerFragment) parentFragment).setCurrentPosition(this.position);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.fragments.makearecord.RecordsViewPagerFragment");
        }
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(RecordsViewModel recordsViewModel) {
        Intrinsics.checkNotNullParameter(recordsViewModel, "viewModell");
        FloatingActionButton floatingActionButton = (FloatingActionButton) _$_findCachedViewById(C5619R.C5622id.fab);
        if (floatingActionButton != null) {
            floatingActionButton.setOnClickListener(new ListOfRecordFragment$onViewCreated$1(this));
        }
        int i = this.position;
        if (i == 0) {
            recordsViewModel.getActiveRecordLiveData().observe(getViewLifecycleOwner(), new ListOfRecordFragment$onViewCreated$2(this));
        } else if (i == 1) {
            recordsViewModel.getArchiveRecordLiveData().observe(getViewLifecycleOwner(), new ListOfRecordFragment$onViewCreated$3(this));
        }
    }

    /* access modifiers changed from: private */
    public final void showRecords(List<? extends Appointment> list) {
        labelVisibility(!list.isEmpty());
        this.recordSection.setData(list);
    }

    private final void labelVisibility(boolean z) {
        if (z) {
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.label);
            if (textView != null) {
                textView.setVisibility(4);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.label);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return getString(R.string.label_record);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/ListOfRecordFragment$Companion;", "", "()V", "start", "Lru/unicorn/ujin/view/fragments/makearecord/ListOfRecordFragment;", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.ListOfRecordFragment$Companion */
    /* compiled from: ListOfRecordFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ListOfRecordFragment start(int i) {
            ListOfRecordFragment listOfRecordFragment = new ListOfRecordFragment();
            listOfRecordFragment.position = i;
            return listOfRecordFragment;
        }
    }
}
