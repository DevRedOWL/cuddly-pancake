package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;

/* renamed from: ru.unicorn.databinding.FragmentShowRecordBinding */
public abstract class FragmentShowRecordBinding extends ViewDataBinding {
    public final ItemFinishStageBinding first;
    public final ItemFinishStageBinding fourth;

    /* renamed from: ll */
    public final LinearLayout f6591ll;
    @Bindable
    protected Boolean mIsEditMode;
    @Bindable
    protected RecordsViewModel mVm;
    public final DynamicBackgroundButton nextBtn;

    /* renamed from: pb */
    public final ProgressBar f6592pb;
    public final RecyclerView rvFileList;
    public final ItemFinishStageBinding second;

    /* renamed from: sv */
    public final NestedScrollView f6593sv;
    public final ItemFinishStageBinding third;

    public abstract void setIsEditMode(Boolean bool);

    public abstract void setVm(RecordsViewModel recordsViewModel);

    protected FragmentShowRecordBinding(Object obj, View view, int i, ItemFinishStageBinding itemFinishStageBinding, ItemFinishStageBinding itemFinishStageBinding2, LinearLayout linearLayout, DynamicBackgroundButton dynamicBackgroundButton, ProgressBar progressBar, RecyclerView recyclerView, ItemFinishStageBinding itemFinishStageBinding3, NestedScrollView nestedScrollView, ItemFinishStageBinding itemFinishStageBinding4) {
        super(obj, view, i);
        this.first = itemFinishStageBinding;
        setContainedBinding(this.first);
        this.fourth = itemFinishStageBinding2;
        setContainedBinding(this.fourth);
        this.f6591ll = linearLayout;
        this.nextBtn = dynamicBackgroundButton;
        this.f6592pb = progressBar;
        this.rvFileList = recyclerView;
        this.second = itemFinishStageBinding3;
        setContainedBinding(this.second);
        this.f6593sv = nestedScrollView;
        this.third = itemFinishStageBinding4;
        setContainedBinding(this.third);
    }

    public Boolean getIsEditMode() {
        return this.mIsEditMode;
    }

    public RecordsViewModel getVm() {
        return this.mVm;
    }

    public static FragmentShowRecordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentShowRecordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentShowRecordBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_show_record, viewGroup, z, obj);
    }

    public static FragmentShowRecordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentShowRecordBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentShowRecordBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_show_record, (ViewGroup) null, false, obj);
    }

    public static FragmentShowRecordBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentShowRecordBinding bind(View view, Object obj) {
        return (FragmentShowRecordBinding) bind(obj, view, R.layout.fragment_show_record);
    }
}
