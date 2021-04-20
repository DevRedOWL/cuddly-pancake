package p035ru.unicorn.ujin.view.fragments.makearecord;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentThirdStageBinding;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.OpenDatesIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleCellsIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleItemIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleListIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.sections.CellsItemSection;
import p035ru.unicorn.ujin.view.fragments.makearecord.sections.DatesItemSection;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00100\u001a\u000201J\b\u00102\u001a\u000203H\u0004J\b\u00104\u001a\u000203H\u0002J\b\u00105\u001a\u000203H\u0004J\b\u00106\u001a\u000203H\u0002J\b\u00107\u001a\u000208H\u0014J\u0012\u00109\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010;H\u0002J&\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010D\u001a\u0002032\u0006\u0010E\u001a\u000201H\u0002J\u0012\u0010D\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010FH\u0002J\u001e\u0010G\u001a\u0002032\u0014\u0010H\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0J\u0018\u00010IH\u0002J\u0018\u0010K\u001a\u0002032\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010IH\u0002J\b\u0010M\u001a\u000203H\u0002J\u001a\u0010N\u001a\u0002032\u0006\u0010O\u001a\u00020=2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010P\u001a\u0002032\u0006\u0010Q\u001a\u00020RH\u0002J\b\u0010S\u001a\u000203H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R\u001a\u0010*\u001a\u00020+X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006T"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/RecordThirdStage;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "binding", "Lru/unicorn/databinding/FragmentThirdStageBinding;", "getBinding", "()Lru/unicorn/databinding/FragmentThirdStageBinding;", "setBinding", "(Lru/unicorn/databinding/FragmentThirdStageBinding;)V", "cellsItem", "Lru/unicorn/ujin/view/fragments/makearecord/sections/CellsItemSection;", "getCellsItem", "()Lru/unicorn/ujin/view/fragments/makearecord/sections/CellsItemSection;", "setCellsItem", "(Lru/unicorn/ujin/view/fragments/makearecord/sections/CellsItemSection;)V", "datesItem", "Lru/unicorn/ujin/view/fragments/makearecord/sections/DatesItemSection;", "getDatesItem", "()Lru/unicorn/ujin/view/fragments/makearecord/sections/DatesItemSection;", "setDatesItem", "(Lru/unicorn/ujin/view/fragments/makearecord/sections/DatesItemSection;)V", "glm", "Landroidx/recyclerview/widget/GridLayoutManager;", "getGlm", "()Landroidx/recyclerview/widget/GridLayoutManager;", "setGlm", "(Landroidx/recyclerview/widget/GridLayoutManager;)V", "horizontalSectionedAdapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getHorizontalSectionedAdapter", "()Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "setHorizontalSectionedAdapter", "(Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;)V", "llm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLlm", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLlm", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "verticalSectionedAdapter", "getVerticalSectionedAdapter", "setVerticalSectionedAdapter", "vm", "Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "getVm", "()Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "setVm", "(Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;)V", "getLayoutRes", "", "initHorisontalAdapter", "", "initSection", "initVerticalAdapter", "loadData", "metricsScreenName", "", "onCellClick", "data", "Lru/unicorn/ujin/view/fragments/makearecord/model/ScheduleCellsIn;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDateClick", "position", "Lru/unicorn/ujin/view/fragments/makearecord/model/OpenDatesIn;", "onLoadDates", "dates", "Lru/unicorn/ujin/data/realm/Resource;", "", "onLoadScheduleOrError", "Lru/unicorn/ujin/view/fragments/makearecord/model/ScheduleListIn;", "onNextClick", "onViewCreated", "view", "scrollSelectedItemInCenter", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "showToolbar", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordThirdStage */
/* compiled from: RecordThirdStage.kt */
public final class RecordThirdStage extends BaseFragment {
    private HashMap _$_findViewCache;
    public FragmentThirdStageBinding binding;
    private CellsItemSection cellsItem = new CellsItemSection();
    private DatesItemSection datesItem = new DatesItemSection();
    public GridLayoutManager glm;
    private SectionedAdapter horizontalSectionedAdapter = new SectionedAdapter();
    public LinearLayoutManager llm;
    private SectionedAdapter verticalSectionedAdapter = new SectionedAdapter();

    /* renamed from: vm */
    public RecordsViewModel f6924vm;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordThirdStage$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 3;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.LOADING.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 3;
        }
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

    public final int getLayoutRes() {
        return R.layout.fragment_third_stage;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final FragmentThirdStageBinding getBinding() {
        FragmentThirdStageBinding fragmentThirdStageBinding = this.binding;
        if (fragmentThirdStageBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return fragmentThirdStageBinding;
    }

    public final void setBinding(FragmentThirdStageBinding fragmentThirdStageBinding) {
        Intrinsics.checkNotNullParameter(fragmentThirdStageBinding, "<set-?>");
        this.binding = fragmentThirdStageBinding;
    }

    public final LinearLayoutManager getLlm() {
        LinearLayoutManager linearLayoutManager = this.llm;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llm");
        }
        return linearLayoutManager;
    }

    public final void setLlm(LinearLayoutManager linearLayoutManager) {
        Intrinsics.checkNotNullParameter(linearLayoutManager, "<set-?>");
        this.llm = linearLayoutManager;
    }

    public final GridLayoutManager getGlm() {
        GridLayoutManager gridLayoutManager = this.glm;
        if (gridLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("glm");
        }
        return gridLayoutManager;
    }

    public final void setGlm(GridLayoutManager gridLayoutManager) {
        Intrinsics.checkNotNullParameter(gridLayoutManager, "<set-?>");
        this.glm = gridLayoutManager;
    }

    public final RecordsViewModel getVm() {
        RecordsViewModel recordsViewModel = this.f6924vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        return recordsViewModel;
    }

    public final void setVm(RecordsViewModel recordsViewModel) {
        Intrinsics.checkNotNullParameter(recordsViewModel, "<set-?>");
        this.f6924vm = recordsViewModel;
    }

    public final CellsItemSection getCellsItem() {
        return this.cellsItem;
    }

    public final void setCellsItem(CellsItemSection cellsItemSection) {
        Intrinsics.checkNotNullParameter(cellsItemSection, "<set-?>");
        this.cellsItem = cellsItemSection;
    }

    public final DatesItemSection getDatesItem() {
        return this.datesItem;
    }

    public final void setDatesItem(DatesItemSection datesItemSection) {
        Intrinsics.checkNotNullParameter(datesItemSection, "<set-?>");
        this.datesItem = datesItemSection;
    }

    public final SectionedAdapter getHorizontalSectionedAdapter() {
        return this.horizontalSectionedAdapter;
    }

    public final void setHorizontalSectionedAdapter(SectionedAdapter sectionedAdapter) {
        Intrinsics.checkNotNullParameter(sectionedAdapter, "<set-?>");
        this.horizontalSectionedAdapter = sectionedAdapter;
    }

    public final SectionedAdapter getVerticalSectionedAdapter() {
        return this.verticalSectionedAdapter;
    }

    public final void setVerticalSectionedAdapter(SectionedAdapter sectionedAdapter) {
        Intrinsics.checkNotNullParameter(sectionedAdapter, "<set-?>");
        this.verticalSectionedAdapter = sectionedAdapter;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, getLayoutRes(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "DataBindingUtil.inflate(…tRes(), container, false)");
        this.binding = (FragmentThirdStageBinding) inflate;
        FragmentThirdStageBinding fragmentThirdStageBinding = this.binding;
        if (fragmentThirdStageBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return fragmentThirdStageBinding.getRoot();
    }

    /* access modifiers changed from: private */
    public final void onNextClick() {
        RecordsViewModel recordsViewModel = this.f6924vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        if (recordsViewModel.getChoosenCell().get() != null) {
            RecordsViewModel recordsViewModel2 = this.f6924vm;
            if (recordsViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
            }
            if (recordsViewModel2.getChoosenDate().get() != null) {
                nextFragment(new RecordFourthStage(), false);
                return;
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            MaterialDialog.positiveButton$default(MaterialDialog.message$default(new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.error_no_time_slot), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.button_OK), (CharSequence) null, RecordThirdStage$onNextClick$1$1.INSTANCE, 2, (Object) null).show();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(RecordsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…rdsViewModel::class.java)");
        this.f6924vm = (RecordsViewModel) viewModel;
        FragmentThirdStageBinding fragmentThirdStageBinding = this.binding;
        if (fragmentThirdStageBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        RecordsViewModel recordsViewModel = this.f6924vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        fragmentThirdStageBinding.setVm(recordsViewModel);
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.nextBtn)).setOnClickListener(new RecordThirdStage$onViewCreated$1(this));
        initHorisontalAdapter();
        initVerticalAdapter();
        initSection();
        loadData();
        RecordsViewModel recordsViewModel2 = this.f6924vm;
        if (recordsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel2.getChoosenCell().set(null);
    }

    /* access modifiers changed from: protected */
    public final void initHorisontalAdapter() {
        this.llm = new LinearLayoutManager(getActivity());
        LinearLayoutManager linearLayoutManager = this.llm;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llm");
        }
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv");
        LinearLayoutManager linearLayoutManager2 = this.llm;
        if (linearLayoutManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llm");
        }
        recyclerView.setLayoutManager(linearLayoutManager2);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv");
        recyclerView2.setAdapter(this.horizontalSectionedAdapter);
        ((RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv)).addOnScrollListener(new RecordThirdStage$initHorisontalAdapter$1(this));
    }

    /* access modifiers changed from: private */
    public final void scrollSelectedItemInCenter(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            Resources system = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
            recyclerView.postDelayed(new RecordThirdStage$scrollSelectedItemInCenter$1(linearLayoutManager, findLastCompletelyVisibleItemPosition, system.getDisplayMetrics().widthPixels / 4), 200);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    /* access modifiers changed from: protected */
    public final void initVerticalAdapter() {
        this.glm = new GridLayoutManager(getActivity(), 2);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rv2);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv2");
        GridLayoutManager gridLayoutManager = this.glm;
        if (gridLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("glm");
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rv2);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv2");
        recyclerView2.setAdapter(this.verticalSectionedAdapter);
    }

    private final void initSection() {
        if (!this.horizontalSectionedAdapter.getSections().contains(this.datesItem)) {
            this.horizontalSectionedAdapter.addSection(this.datesItem);
        }
        if (!this.verticalSectionedAdapter.getSections().contains(this.cellsItem)) {
            this.verticalSectionedAdapter.addSection(this.cellsItem);
        }
        this.datesItem.getItemClickSubject().subscribe(new RecordThirdStage$initSection$1(this));
        this.datesItem.getClickSubject().subscribe(new RecordThirdStage$initSection$2(this));
        this.cellsItem.getClickSubject().subscribe(new RecordThirdStage$initSection$3(this));
    }

    /* access modifiers changed from: private */
    public final void onDateClick(int i) {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        ((RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv)).postDelayed(new RecordThirdStage$onDateClick$1(this, i, system.getDisplayMetrics().widthPixels / 4), 300);
    }

    /* access modifiers changed from: private */
    public final void onDateClick(OpenDatesIn openDatesIn) {
        this.cellsItem.setSelectedPosition(-1);
        this.cellsItem.shimmer(true);
        RecordsViewModel recordsViewModel = this.f6924vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel.getChoosenDate().set(openDatesIn);
        RecordsViewModel recordsViewModel2 = this.f6924vm;
        if (recordsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        String str = null;
        recordsViewModel2.getChoosenCell().set(null);
        RecordsViewModel recordsViewModel3 = this.f6924vm;
        if (recordsViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        if (openDatesIn != null) {
            str = openDatesIn.getDate();
        }
        recordsViewModel3.loadScheduler(str);
    }

    /* access modifiers changed from: private */
    public final void onCellClick(ScheduleCellsIn scheduleCellsIn) {
        RecordsViewModel recordsViewModel = this.f6924vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel.getChoosenCell().set(scheduleCellsIn);
    }

    private final void loadData() {
        this.cellsItem.setSelectedPosition(-1);
        this.cellsItem.shimmer(true);
        this.cellsItem.setData(CollectionsKt.emptyList());
        RecordsViewModel recordsViewModel = this.f6924vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel.loadAvailableDates();
        RecordsViewModel recordsViewModel2 = this.f6924vm;
        if (recordsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel2.getOpenDates().observe(getViewLifecycleOwner(), new RecordThirdStage$loadData$1(this));
        RecordsViewModel recordsViewModel3 = this.f6924vm;
        if (recordsViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel3.getScheduleData().observe(getViewLifecycleOwner(), new RecordThirdStage$loadData$2(this));
    }

    /* access modifiers changed from: private */
    public final void onLoadDates(Resource<List<OpenDatesIn>> resource) {
        Resource.Status status = resource != null ? resource.getStatus() : null;
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 2) {
                this.cellsItem.shimmer(true);
            } else if (i == 3) {
                this.cellsItem.shimmer(false);
                this.datesItem.setData(resource.getData());
                List<OpenDatesIn> data = resource.getData();
                Intrinsics.checkNotNullExpressionValue(data, "dates.data");
                if (!data.isEmpty()) {
                    RecordsViewModel recordsViewModel = this.f6924vm;
                    if (recordsViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                    }
                    recordsViewModel.getChoosenDate().set(resource.getData().get(0));
                    RecordsViewModel recordsViewModel2 = this.f6924vm;
                    if (recordsViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                    }
                    recordsViewModel2.loadScheduler(((OpenDatesIn) resource.getData().get(0)).getDate());
                    this.cellsItem.setSelectedPosition(-1);
                    this.cellsItem.shimmer(true);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void onLoadScheduleOrError(Resource<ScheduleListIn> resource) {
        ScheduleItemIn schedule;
        List<ScheduleCellsIn> list = null;
        Resource.Status status = resource != null ? resource.getStatus() : null;
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            if (i == 1) {
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 2) {
                this.cellsItem.shimmer(true);
                this.cellsItem.setData(CollectionsKt.emptyList());
            } else if (i == 3) {
                this.cellsItem.shimmer(false);
                CellsItemSection cellsItemSection = this.cellsItem;
                ScheduleListIn data = resource.getData();
                if (!(data == null || (schedule = data.getSchedule()) == null)) {
                    list = schedule.getCells();
                }
                cellsItemSection.setData(list);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_new_record));
    }
}
