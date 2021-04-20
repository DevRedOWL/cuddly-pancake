package p035ru.unicorn.ujin.view.fragments.makearecord;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentFifthStageBinding;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020-H\u0002J\u0006\u0010.\u001a\u00020/J\b\u00100\u001a\u00020-H\u0004J\b\u00101\u001a\u00020-H\u0002J\b\u00102\u001a\u000203H\u0014J\u0010\u00104\u001a\u00020-2\u0006\u00105\u001a\u00020\u0010H\u0002J&\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010>\u001a\u00020-H\u0002J\u0018\u0010?\u001a\u00020-2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010AH\u0002J\b\u0010C\u001a\u00020-H\u0002J\u001a\u0010D\u001a\u00020-2\u0006\u0010E\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010F\u001a\u00020-H\u0002J\b\u0010G\u001a\u00020-H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006I"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/RecordFivethStage;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "binding", "Lru/unicorn/databinding/FragmentFifthStageBinding;", "getBinding", "()Lru/unicorn/databinding/FragmentFifthStageBinding;", "setBinding", "(Lru/unicorn/databinding/FragmentFifthStageBinding;)V", "changeBtn", "Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;", "getChangeBtn", "()Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;", "setChangeBtn", "(Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;)V", "isEditMode", "", "llm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLlm", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLlm", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "nextBtn", "getNextBtn", "setNextBtn", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "getRv", "()Landroidx/recyclerview/widget/RecyclerView;", "setRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "sectionedAdapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getSectionedAdapter", "()Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "setSectionedAdapter", "(Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;)V", "vm", "Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "getVm", "()Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "setVm", "(Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;)V", "clearData", "", "getLayoutRes", "", "initAdapter", "loadData", "metricsScreenName", "", "onCreateDialogResult", "success", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onEditClick", "onRecordCreate", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "onSendClick", "onViewCreated", "view", "router", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordFivethStage */
/* compiled from: RecordFivethStage.kt */
public final class RecordFivethStage extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public FragmentFifthStageBinding binding;
    public DynamicBackgroundButton changeBtn;
    /* access modifiers changed from: private */
    public boolean isEditMode;
    public LinearLayoutManager llm;
    public DynamicBackgroundButton nextBtn;

    /* renamed from: rv */
    public RecyclerView f6920rv;
    private SectionedAdapter sectionedAdapter = new SectionedAdapter();

    /* renamed from: vm */
    public RecordsViewModel f6921vm;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordFivethStage$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
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
        return R.layout.fragment_fifth_stage;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final RecyclerView getRv() {
        RecyclerView recyclerView = this.f6920rv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        return recyclerView;
    }

    public final void setRv(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.f6920rv = recyclerView;
    }

    public final DynamicBackgroundButton getNextBtn() {
        DynamicBackgroundButton dynamicBackgroundButton = this.nextBtn;
        if (dynamicBackgroundButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nextBtn");
        }
        return dynamicBackgroundButton;
    }

    public final void setNextBtn(DynamicBackgroundButton dynamicBackgroundButton) {
        Intrinsics.checkNotNullParameter(dynamicBackgroundButton, "<set-?>");
        this.nextBtn = dynamicBackgroundButton;
    }

    public final DynamicBackgroundButton getChangeBtn() {
        DynamicBackgroundButton dynamicBackgroundButton = this.changeBtn;
        if (dynamicBackgroundButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("changeBtn");
        }
        return dynamicBackgroundButton;
    }

    public final void setChangeBtn(DynamicBackgroundButton dynamicBackgroundButton) {
        Intrinsics.checkNotNullParameter(dynamicBackgroundButton, "<set-?>");
        this.changeBtn = dynamicBackgroundButton;
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

    public final RecordsViewModel getVm() {
        RecordsViewModel recordsViewModel = this.f6921vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        return recordsViewModel;
    }

    public final void setVm(RecordsViewModel recordsViewModel) {
        Intrinsics.checkNotNullParameter(recordsViewModel, "<set-?>");
        this.f6921vm = recordsViewModel;
    }

    public final FragmentFifthStageBinding getBinding() {
        FragmentFifthStageBinding fragmentFifthStageBinding = this.binding;
        if (fragmentFifthStageBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return fragmentFifthStageBinding;
    }

    public final void setBinding(FragmentFifthStageBinding fragmentFifthStageBinding) {
        Intrinsics.checkNotNullParameter(fragmentFifthStageBinding, "<set-?>");
        this.binding = fragmentFifthStageBinding;
    }

    public final SectionedAdapter getSectionedAdapter() {
        return this.sectionedAdapter;
    }

    public final void setSectionedAdapter(SectionedAdapter sectionedAdapter2) {
        Intrinsics.checkNotNullParameter(sectionedAdapter2, "<set-?>");
        this.sectionedAdapter = sectionedAdapter2;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, getLayoutRes(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "DataBindingUtil.inflate(…tRes(), container, false)");
        this.binding = (FragmentFifthStageBinding) inflate;
        FragmentFifthStageBinding fragmentFifthStageBinding = this.binding;
        if (fragmentFifthStageBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        View root = fragmentFifthStageBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        View findViewById = root.findViewById(R.id.rv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "root.findViewById(R.id.rv)");
        this.f6920rv = (RecyclerView) findViewById;
        View findViewById2 = root.findViewById(R.id.nextBtn);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "root.findViewById(R.id.nextBtn)");
        this.nextBtn = (DynamicBackgroundButton) findViewById2;
        View findViewById3 = root.findViewById(R.id.changeBtn);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "root.findViewById(R.id.changeBtn)");
        this.changeBtn = (DynamicBackgroundButton) findViewById3;
        DynamicBackgroundButton dynamicBackgroundButton = this.nextBtn;
        if (dynamicBackgroundButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nextBtn");
        }
        dynamicBackgroundButton.setOnClickListener(new RecordFivethStage$onCreateView$1(this));
        DynamicBackgroundButton dynamicBackgroundButton2 = this.changeBtn;
        if (dynamicBackgroundButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("changeBtn");
        }
        dynamicBackgroundButton2.setOnClickListener(new RecordFivethStage$onCreateView$2(this));
        FragmentFifthStageBinding fragmentFifthStageBinding2 = this.binding;
        if (fragmentFifthStageBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        fragmentFifthStageBinding2.setIsEditMode(Boolean.valueOf(this.isEditMode));
        return root;
    }

    /* access modifiers changed from: private */
    public final void onSendClick() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            MaterialDialog.negativeButton$default(MaterialDialog.positiveButton$default(MaterialDialog.title$default(new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.label_send_record), (String) null, 2, (Object) null), Integer.valueOf(R.string.confirm), (CharSequence) null, new RecordFivethStage$onSendClick$$inlined$let$lambda$1(this), 2, (Object) null), Integer.valueOf(R.string.cancel), (CharSequence) null, RecordFivethStage$onSendClick$1$2.INSTANCE, 2, (Object) null).show();
            return;
        }
    }

    /* access modifiers changed from: private */
    public final void onEditClick() {
        nextFragment(Companion.start(true), false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(RecordsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…rdsViewModel::class.java)");
        this.f6921vm = (RecordsViewModel) viewModel;
        FragmentFifthStageBinding fragmentFifthStageBinding = this.binding;
        if (fragmentFifthStageBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        RecordsViewModel recordsViewModel = this.f6921vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        fragmentFifthStageBinding.setVm(recordsViewModel);
        initAdapter();
        router();
        loadData();
    }

    private final void router() {
        if (this.isEditMode) {
            FragmentFifthStageBinding fragmentFifthStageBinding = this.binding;
            if (fragmentFifthStageBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            fragmentFifthStageBinding.first.parent.setOnClickListener(new RecordFivethStage$router$1(this));
            FragmentFifthStageBinding fragmentFifthStageBinding2 = this.binding;
            if (fragmentFifthStageBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            fragmentFifthStageBinding2.second.parent.setOnClickListener(new RecordFivethStage$router$2(this));
            FragmentFifthStageBinding fragmentFifthStageBinding3 = this.binding;
            if (fragmentFifthStageBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            fragmentFifthStageBinding3.third.parent.setOnClickListener(new RecordFivethStage$router$3(this));
            FragmentFifthStageBinding fragmentFifthStageBinding4 = this.binding;
            if (fragmentFifthStageBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            fragmentFifthStageBinding4.fourth.parent.setOnClickListener(new RecordFivethStage$router$4(this));
        }
    }

    /* access modifiers changed from: protected */
    public final void initAdapter() {
        this.llm = new LinearLayoutManager(getActivity());
        LinearLayoutManager linearLayoutManager = this.llm;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llm");
        }
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView = this.f6920rv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        LinearLayoutManager linearLayoutManager2 = this.llm;
        if (linearLayoutManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llm");
        }
        recyclerView.setLayoutManager(linearLayoutManager2);
        RecyclerView recyclerView2 = this.f6920rv;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        recyclerView2.setAdapter(this.sectionedAdapter);
    }

    private final void loadData() {
        RecordsViewModel recordsViewModel = this.f6921vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel.getCreateRecordResult().observe(getViewLifecycleOwner(), new RecordFivethStage$loadData$1(this));
        RecordsViewModel recordsViewModel2 = this.f6921vm;
        if (recordsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel2.showLoader.observe(getViewLifecycleOwner(), new RecordFivethStage$loadData$2(this));
    }

    /* access modifiers changed from: private */
    public final void onRecordCreate(Resource<Appointment> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                onCreateDialogResult(true);
            } else if (i == 2) {
                onCreateDialogResult(false);
            }
        }
    }

    private final void onCreateDialogResult(boolean z) {
        int i = z ? R.string.label_record_success : R.string.label_record_error;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            MaterialDialog.positiveButton$default(MaterialDialog.title$default(new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(i), (String) null, 2, (Object) null), Integer.valueOf(R.string.button_ok), (CharSequence) null, new RecordFivethStage$onCreateDialogResult$$inlined$let$lambda$1(this, i, z), 2, (Object) null).show();
        }
    }

    /* access modifiers changed from: private */
    public final void clearData() {
        RecordsViewModel recordsViewModel = this.f6921vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel.clearData();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_new_record));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/RecordFivethStage$Companion;", "", "()V", "start", "Lru/unicorn/ujin/view/fragments/makearecord/RecordFivethStage;", "isEditMode", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordFivethStage$Companion */
    /* compiled from: RecordFivethStage.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RecordFivethStage start(boolean z) {
            RecordFivethStage recordFivethStage = new RecordFivethStage();
            recordFivethStage.isEditMode = z;
            return recordFivethStage;
        }
    }
}
