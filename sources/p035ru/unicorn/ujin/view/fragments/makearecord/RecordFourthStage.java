package p035ru.unicorn.ujin.view.fragments.makearecord;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentFourthStageBinding;
import p035ru.unicorn.ujin.view.WrapContentLinearLayoutManager;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview;
import p035ru.unicorn.ujin.view.fragments.base.attach.section.AddAttachSection;
import p035ru.unicorn.ujin.view.fragments.base.attach.section.ShowAttachSection;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00101\u001a\u000202J\b\u00103\u001a\u000204H\u0004J\b\u00105\u001a\u000204H\u0002J\b\u00106\u001a\u000207H\u0014J&\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010@\u001a\u0002042\u0006\u0010A\u001a\u000207H\u0016J\b\u0010B\u001a\u000204H\u0002J\u0012\u0010C\u001a\u0002042\b\u0010D\u001a\u0004\u0018\u00010EH\u0002J\u001a\u0010F\u001a\u0002042\u0006\u0010G\u001a\u0002092\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J \u0010H\u001a\u0002042\u0016\u0010I\u001a\u0012\u0012\u0004\u0012\u00020E0Jj\b\u0012\u0004\u0012\u00020E`KH\u0002J\b\u0010L\u001a\u000204H\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006M"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/RecordFourthStage;", "Lru/unicorn/ujin/view/fragments/makearecord/AttachBaseFragment;", "()V", "adapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getAdapter", "()Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "addAttach", "Lru/unicorn/ujin/view/fragments/base/attach/section/AddAttachSection;", "getAddAttach", "()Lru/unicorn/ujin/view/fragments/base/attach/section/AddAttachSection;", "setAddAttach", "(Lru/unicorn/ujin/view/fragments/base/attach/section/AddAttachSection;)V", "binding", "Lru/unicorn/databinding/FragmentFourthStageBinding;", "getBinding", "()Lru/unicorn/databinding/FragmentFourthStageBinding;", "setBinding", "(Lru/unicorn/databinding/FragmentFourthStageBinding;)V", "llm", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLlm", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLlm", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "nextBtn", "Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;", "getNextBtn", "()Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;", "setNextBtn", "(Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;)V", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "getRv", "()Landroidx/recyclerview/widget/RecyclerView;", "setRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "showAttach", "Lru/unicorn/ujin/view/fragments/base/attach/section/ShowAttachSection;", "getShowAttach", "()Lru/unicorn/ujin/view/fragments/base/attach/section/ShowAttachSection;", "setShowAttach", "(Lru/unicorn/ujin/view/fragments/base/attach/section/ShowAttachSection;)V", "vm", "Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "getVm", "()Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "setVm", "(Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;)V", "getLayoutRes", "", "initAdapter", "", "initSection", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFileChoose", "filePath", "onNextClick", "onRemoveAttachClick", "data", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "onViewCreated", "view", "showAttaches", "files", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "showToolbar", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordFourthStage */
/* compiled from: RecordFourthStage.kt */
public final class RecordFourthStage extends AttachBaseFragment {
    private HashMap _$_findViewCache;
    private final SectionedAdapter adapter = new SectionedAdapter();
    private AddAttachSection addAttach = new AddAttachSection();
    public FragmentFourthStageBinding binding;
    public LinearLayoutManager llm;
    public DynamicBackgroundButton nextBtn;

    /* renamed from: rv */
    public RecyclerView f6922rv;
    private ShowAttachSection showAttach = new ShowAttachSection();

    /* renamed from: vm */
    public RecordsViewModel f6923vm;

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
        return R.layout.fragment_fourth_stage;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final SectionedAdapter getAdapter() {
        return this.adapter;
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

    public final RecyclerView getRv() {
        RecyclerView recyclerView = this.f6922rv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        return recyclerView;
    }

    public final void setRv(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.f6922rv = recyclerView;
    }

    public final ShowAttachSection getShowAttach() {
        return this.showAttach;
    }

    public final void setShowAttach(ShowAttachSection showAttachSection) {
        Intrinsics.checkNotNullParameter(showAttachSection, "<set-?>");
        this.showAttach = showAttachSection;
    }

    public final AddAttachSection getAddAttach() {
        return this.addAttach;
    }

    public final void setAddAttach(AddAttachSection addAttachSection) {
        Intrinsics.checkNotNullParameter(addAttachSection, "<set-?>");
        this.addAttach = addAttachSection;
    }

    public final FragmentFourthStageBinding getBinding() {
        FragmentFourthStageBinding fragmentFourthStageBinding = this.binding;
        if (fragmentFourthStageBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return fragmentFourthStageBinding;
    }

    public final void setBinding(FragmentFourthStageBinding fragmentFourthStageBinding) {
        Intrinsics.checkNotNullParameter(fragmentFourthStageBinding, "<set-?>");
        this.binding = fragmentFourthStageBinding;
    }

    public final RecordsViewModel getVm() {
        RecordsViewModel recordsViewModel = this.f6923vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        return recordsViewModel;
    }

    public final void setVm(RecordsViewModel recordsViewModel) {
        Intrinsics.checkNotNullParameter(recordsViewModel, "<set-?>");
        this.f6923vm = recordsViewModel;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, getLayoutRes(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "DataBindingUtil.inflate(…tRes(), container, false)");
        this.binding = (FragmentFourthStageBinding) inflate;
        FragmentFourthStageBinding fragmentFourthStageBinding = this.binding;
        if (fragmentFourthStageBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        View root = fragmentFourthStageBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        View findViewById = root.findViewById(R.id.rv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "root.findViewById(R.id.rv)");
        this.f6922rv = (RecyclerView) findViewById;
        View findViewById2 = root.findViewById(R.id.nextBtn);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "root.findViewById(R.id.nextBtn)");
        this.nextBtn = (DynamicBackgroundButton) findViewById2;
        DynamicBackgroundButton dynamicBackgroundButton = this.nextBtn;
        if (dynamicBackgroundButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nextBtn");
        }
        dynamicBackgroundButton.setOnClickListener(new RecordFourthStage$onCreateView$1(this));
        initAdapter();
        initSection();
        return root;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(RecordsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…rdsViewModel::class.java)");
        this.f6923vm = (RecordsViewModel) viewModel;
        RecordsViewModel recordsViewModel = this.f6923vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel.getAttachesLiveData().observe(getViewLifecycleOwner(), new RecordFourthStage$onViewCreated$1(this));
        FragmentFourthStageBinding fragmentFourthStageBinding = this.binding;
        if (fragmentFourthStageBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        RecordsViewModel recordsViewModel2 = this.f6923vm;
        if (recordsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        fragmentFourthStageBinding.setVm(recordsViewModel2);
        RecordsViewModel recordsViewModel3 = this.f6923vm;
        if (recordsViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        CharSequence charSequence = recordsViewModel3.getComment().get();
        int i = 0;
        if (!(charSequence == null || StringsKt.isBlank(charSequence))) {
            FragmentFourthStageBinding fragmentFourthStageBinding2 = this.binding;
            if (fragmentFourthStageBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            View root = fragmentFourthStageBinding2.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            TextInputEditText textInputEditText = (TextInputEditText) root.findViewById(C5619R.C5622id.et_title_ticket);
            RecordsViewModel recordsViewModel4 = this.f6923vm;
            if (recordsViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
            }
            textInputEditText.setText(recordsViewModel4.getComment().get());
            RecordsViewModel recordsViewModel5 = this.f6923vm;
            if (recordsViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
            }
            String str = recordsViewModel5.getComment().get();
            if (str != null) {
                i = str.length();
            }
            textInputEditText.setSelection(i);
        }
    }

    /* access modifiers changed from: private */
    public final void showAttaches(HashSet<AttachablePreview> hashSet) {
        this.showAttach.setData(CollectionsKt.toList(hashSet));
    }

    /* access modifiers changed from: private */
    public final void onNextClick() {
        nextFragment(RecordFivethStage.Companion.start(false), false);
    }

    private final void initSection() {
        if (!this.adapter.getSections().contains(this.showAttach)) {
            this.adapter.addSection(this.showAttach);
            this.showAttach.getOnClickSubject().subscribe(new RecordFourthStage$initSection$1(this));
        }
        if (!this.adapter.getSections().contains(this.addAttach)) {
            this.adapter.addSection(this.addAttach);
            AddAttachSection addAttachSection = this.addAttach;
            addAttachSection.initDefaultValue();
            addAttachSection.getClickSubject().subscribe(new RecordFourthStage$initSection$$inlined$apply$lambda$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void onRemoveAttachClick(AttachablePreview attachablePreview) {
        if (attachablePreview != null) {
            RecordsViewModel recordsViewModel = this.f6923vm;
            if (recordsViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
            }
            recordsViewModel.removeFile(attachablePreview);
        }
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        RecordsViewModel recordsViewModel = this.f6923vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel.attachFile(str);
    }

    /* access modifiers changed from: protected */
    public final void initAdapter() {
        this.llm = new WrapContentLinearLayoutManager(getActivity());
        RecyclerView recyclerView = this.f6922rv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        LinearLayoutManager linearLayoutManager = this.llm;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llm");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.f6922rv;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        recyclerView2.setAdapter(this.adapter);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_new_record));
    }
}
