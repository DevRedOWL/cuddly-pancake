package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;

/* renamed from: ru.unicorn.databinding.FragmentThirdStageBinding */
public abstract class FragmentThirdStageBinding extends ViewDataBinding {
    public final Guideline guideline;
    @Bindable
    protected RecordsViewModel mVm;
    public final DynamicBackgroundButton nextBtn;

    /* renamed from: pb */
    public final ProgressBar f6594pb;

    /* renamed from: rv */
    public final RecyclerView f6595rv;
    public final RecyclerView rv2;

    /* renamed from: sv */
    public final NestedScrollView f6596sv;
    public final TextView tvLabelFio;
    public final TextView tvStage;

    public abstract void setVm(RecordsViewModel recordsViewModel);

    protected FragmentThirdStageBinding(Object obj, View view, int i, Guideline guideline2, DynamicBackgroundButton dynamicBackgroundButton, ProgressBar progressBar, RecyclerView recyclerView, RecyclerView recyclerView2, NestedScrollView nestedScrollView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.guideline = guideline2;
        this.nextBtn = dynamicBackgroundButton;
        this.f6594pb = progressBar;
        this.f6595rv = recyclerView;
        this.rv2 = recyclerView2;
        this.f6596sv = nestedScrollView;
        this.tvLabelFio = textView;
        this.tvStage = textView2;
    }

    public RecordsViewModel getVm() {
        return this.mVm;
    }

    public static FragmentThirdStageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentThirdStageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentThirdStageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_third_stage, viewGroup, z, obj);
    }

    public static FragmentThirdStageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentThirdStageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentThirdStageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_third_stage, (ViewGroup) null, false, obj);
    }

    public static FragmentThirdStageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentThirdStageBinding bind(View view, Object obj) {
        return (FragmentThirdStageBinding) bind(obj, view, R.layout.fragment_third_stage);
    }
}
