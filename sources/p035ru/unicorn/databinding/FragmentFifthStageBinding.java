package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;

/* renamed from: ru.unicorn.databinding.FragmentFifthStageBinding */
public abstract class FragmentFifthStageBinding extends ViewDataBinding {
    public final DynamicBackgroundButton changeBtn;
    public final ItemFinishStageBinding first;
    public final ItemFinishStageBinding fourth;

    /* renamed from: ll */
    public final LinearLayout f6563ll;
    @Bindable
    protected Boolean mIsEditMode;
    @Bindable
    protected RecordsViewModel mVm;
    public final DynamicBackgroundButton nextBtn;

    /* renamed from: pb */
    public final ProgressBar f6564pb;

    /* renamed from: rv */
    public final RecyclerView f6565rv;
    public final ItemFinishStageBinding second;

    /* renamed from: sv */
    public final ScrollView f6566sv;
    public final ItemFinishStageBinding third;
    public final TextView tvStage;
    public final TextView underline;

    public abstract void setIsEditMode(Boolean bool);

    public abstract void setVm(RecordsViewModel recordsViewModel);

    protected FragmentFifthStageBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ItemFinishStageBinding itemFinishStageBinding, ItemFinishStageBinding itemFinishStageBinding2, LinearLayout linearLayout, DynamicBackgroundButton dynamicBackgroundButton2, ProgressBar progressBar, RecyclerView recyclerView, ItemFinishStageBinding itemFinishStageBinding3, ScrollView scrollView, ItemFinishStageBinding itemFinishStageBinding4, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.changeBtn = dynamicBackgroundButton;
        this.first = itemFinishStageBinding;
        setContainedBinding(this.first);
        this.fourth = itemFinishStageBinding2;
        setContainedBinding(this.fourth);
        this.f6563ll = linearLayout;
        this.nextBtn = dynamicBackgroundButton2;
        this.f6564pb = progressBar;
        this.f6565rv = recyclerView;
        this.second = itemFinishStageBinding3;
        setContainedBinding(this.second);
        this.f6566sv = scrollView;
        this.third = itemFinishStageBinding4;
        setContainedBinding(this.third);
        this.tvStage = textView;
        this.underline = textView2;
    }

    public Boolean getIsEditMode() {
        return this.mIsEditMode;
    }

    public RecordsViewModel getVm() {
        return this.mVm;
    }

    public static FragmentFifthStageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFifthStageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentFifthStageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_fifth_stage, viewGroup, z, obj);
    }

    public static FragmentFifthStageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFifthStageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentFifthStageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_fifth_stage, (ViewGroup) null, false, obj);
    }

    public static FragmentFifthStageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFifthStageBinding bind(View view, Object obj) {
        return (FragmentFifthStageBinding) bind(obj, view, R.layout.fragment_fifth_stage);
    }
}
