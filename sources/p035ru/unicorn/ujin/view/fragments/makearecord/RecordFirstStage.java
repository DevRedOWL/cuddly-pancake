package p035ru.unicorn.ujin.view.fragments.makearecord;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentFirstStageBinding;
import p035ru.unicorn.databinding.FragmentFirstStageEditBinding;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020,H\u0014J\b\u0010-\u001a\u00020.H\u0002J&\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020.H\u0002J\u001a\u00108\u001a\u00020.2\u0006\u00109\u001a\u0002002\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010:\u001a\u00020.H\u0014J\u000e\u0010;\u001a\u00020.2\u0006\u00109\u001a\u000200R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\u00020$X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006="}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/RecordFirstStage;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "binding", "Lru/unicorn/databinding/FragmentFirstStageBinding;", "getBinding", "()Lru/unicorn/databinding/FragmentFirstStageBinding;", "setBinding", "(Lru/unicorn/databinding/FragmentFirstStageBinding;)V", "changeBtn", "Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;", "getChangeBtn", "()Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;", "setChangeBtn", "(Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;)V", "editBinding", "Lru/unicorn/databinding/FragmentFirstStageEditBinding;", "getEditBinding", "()Lru/unicorn/databinding/FragmentFirstStageEditBinding;", "setEditBinding", "(Lru/unicorn/databinding/FragmentFirstStageEditBinding;)V", "isEdit", "", "()Z", "setEdit", "(Z)V", "ll", "Landroid/widget/LinearLayout;", "getLl", "()Landroid/widget/LinearLayout;", "setLl", "(Landroid/widget/LinearLayout;)V", "nextBtn", "getNextBtn", "setNextBtn", "recordViewModel", "Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "getRecordViewModel", "()Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "setRecordViewModel", "(Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;)V", "getLayoutRes", "", "metricsScreenName", "", "onChangeClick", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onNextClick", "onViewCreated", "view", "showToolbar", "slideUp", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordFirstStage */
/* compiled from: RecordFirstStage.kt */
public final class RecordFirstStage extends BaseFragment {
    private static final String ARG_MODE = "arg_mode";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private FragmentFirstStageBinding binding;
    public DynamicBackgroundButton changeBtn;
    private FragmentFirstStageEditBinding editBinding;
    private boolean isEdit = true;

    /* renamed from: ll */
    private LinearLayout f6919ll;
    public DynamicBackgroundButton nextBtn;
    public RecordsViewModel recordViewModel;

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
    public String metricsScreenName() {
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
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

    public final RecordsViewModel getRecordViewModel() {
        RecordsViewModel recordsViewModel = this.recordViewModel;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordViewModel");
        }
        return recordsViewModel;
    }

    public final void setRecordViewModel(RecordsViewModel recordsViewModel) {
        Intrinsics.checkNotNullParameter(recordsViewModel, "<set-?>");
        this.recordViewModel = recordsViewModel;
    }

    public final FragmentFirstStageEditBinding getEditBinding() {
        return this.editBinding;
    }

    public final void setEditBinding(FragmentFirstStageEditBinding fragmentFirstStageEditBinding) {
        this.editBinding = fragmentFirstStageEditBinding;
    }

    public final FragmentFirstStageBinding getBinding() {
        return this.binding;
    }

    public final void setBinding(FragmentFirstStageBinding fragmentFirstStageBinding) {
        this.binding = fragmentFirstStageBinding;
    }

    public final LinearLayout getLl() {
        return this.f6919ll;
    }

    public final void setLl(LinearLayout linearLayout) {
        this.f6919ll = linearLayout;
    }

    public final boolean isEdit() {
        return this.isEdit;
    }

    public final void setEdit(boolean z) {
        this.isEdit = z;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/RecordFirstStage$Companion;", "", "()V", "ARG_MODE", "", "start", "Lru/unicorn/ujin/view/fragments/makearecord/RecordFirstStage;", "isEdit", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordFirstStage$Companion */
    /* compiled from: RecordFirstStage.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RecordFirstStage start(boolean z) {
            RecordFirstStage recordFirstStage = new RecordFirstStage();
            Bundle bundle = new Bundle();
            bundle.putBoolean("arg_mode", z);
            recordFirstStage.setArguments(bundle);
            return recordFirstStage;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout;
        DynamicBackgroundButton dynamicBackgroundButton;
        DynamicBackgroundButton dynamicBackgroundButton2;
        DynamicBackgroundButton dynamicBackgroundButton3;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        this.isEdit = arguments != null ? arguments.getBoolean("arg_mode", false) : false;
        if (!this.isEdit) {
            this.binding = (FragmentFirstStageBinding) DataBindingUtil.inflate(layoutInflater, getLayoutRes(), viewGroup, false);
            FragmentFirstStageBinding fragmentFirstStageBinding = this.binding;
            if (!(fragmentFirstStageBinding == null || (dynamicBackgroundButton3 = fragmentFirstStageBinding.changeBtn) == null)) {
                dynamicBackgroundButton3.setOnClickListener(new RecordFirstStage$onCreateView$1(this));
            }
            FragmentFirstStageBinding fragmentFirstStageBinding2 = this.binding;
            if (!(fragmentFirstStageBinding2 == null || (dynamicBackgroundButton2 = fragmentFirstStageBinding2.nextBtn) == null)) {
                dynamicBackgroundButton2.setOnClickListener(new RecordFirstStage$onCreateView$2(this));
            }
            FragmentFirstStageBinding fragmentFirstStageBinding3 = this.binding;
            if (fragmentFirstStageBinding3 != null) {
                return fragmentFirstStageBinding3.getRoot();
            }
            return null;
        }
        this.editBinding = (FragmentFirstStageEditBinding) DataBindingUtil.inflate(layoutInflater, getLayoutRes(), viewGroup, false);
        FragmentFirstStageEditBinding fragmentFirstStageEditBinding = this.editBinding;
        if (!(fragmentFirstStageEditBinding == null || (dynamicBackgroundButton = fragmentFirstStageEditBinding.nextBtn) == null)) {
            dynamicBackgroundButton.setOnClickListener(new RecordFirstStage$onCreateView$3(this));
        }
        FragmentFirstStageEditBinding fragmentFirstStageEditBinding2 = this.editBinding;
        if (!(fragmentFirstStageEditBinding2 == null || (linearLayout = fragmentFirstStageEditBinding2.f6568ll) == null)) {
            Intrinsics.checkNotNullExpressionValue(linearLayout, "it");
            slideUp(linearLayout);
        }
        FragmentFirstStageEditBinding fragmentFirstStageEditBinding3 = this.editBinding;
        if (fragmentFirstStageEditBinding3 != null) {
            return fragmentFirstStageEditBinding3.getRoot();
        }
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(RecordsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…rdsViewModel::class.java)");
        this.recordViewModel = (RecordsViewModel) viewModel;
        FragmentFirstStageEditBinding fragmentFirstStageEditBinding = this.editBinding;
        if (fragmentFirstStageEditBinding != null) {
            RecordsViewModel recordsViewModel = this.recordViewModel;
            if (recordsViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordViewModel");
            }
            fragmentFirstStageEditBinding.setVm(recordsViewModel);
        }
        FragmentFirstStageBinding fragmentFirstStageBinding = this.binding;
        if (fragmentFirstStageBinding != null) {
            RecordsViewModel recordsViewModel2 = this.recordViewModel;
            if (recordsViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recordViewModel");
            }
            fragmentFirstStageBinding.setVm(recordsViewModel2);
        }
    }

    /* access modifiers changed from: private */
    public final void onNextClick() {
        if (this.isEdit) {
            nextFragment(Companion.start(false), false);
        } else {
            nextFragment(RecordSecondStage.Companion.start(), false);
        }
    }

    /* access modifiers changed from: private */
    public final void onChangeClick() {
        nextFragment(Companion.start(true), false);
    }

    public final int getLayoutRes() {
        return this.isEdit ? R.layout.fragment_first_stage_edit : R.layout.fragment_first_stage;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_new_record));
    }

    public final void slideUp(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TranslateAnimation translateAnimation = new TranslateAnimation((float) (view.getWidth() - 400), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(500);
        translateAnimation.setFillAfter(true);
        view.startAnimation(translateAnimation);
    }
}
