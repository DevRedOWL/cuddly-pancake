package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;

/* renamed from: ru.unicorn.databinding.FragmentFirstStageBinding */
public abstract class FragmentFirstStageBinding extends ViewDataBinding {
    public final DynamicBackgroundButton changeBtn;
    @Bindable
    protected String mName;
    @Bindable
    protected RecordsViewModel mVm;
    public final DynamicBackgroundButton nextBtn;

    /* renamed from: rv */
    public final TextView f6567rv;
    public final TextView tvLabelFio;
    public final TextView tvStage;

    public abstract void setName(String str);

    public abstract void setVm(RecordsViewModel recordsViewModel);

    protected FragmentFirstStageBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, DynamicBackgroundButton dynamicBackgroundButton2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.changeBtn = dynamicBackgroundButton;
        this.nextBtn = dynamicBackgroundButton2;
        this.f6567rv = textView;
        this.tvLabelFio = textView2;
        this.tvStage = textView3;
    }

    public RecordsViewModel getVm() {
        return this.mVm;
    }

    public String getName() {
        return this.mName;
    }

    public static FragmentFirstStageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFirstStageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentFirstStageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_first_stage, viewGroup, z, obj);
    }

    public static FragmentFirstStageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFirstStageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentFirstStageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_first_stage, (ViewGroup) null, false, obj);
    }

    public static FragmentFirstStageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFirstStageBinding bind(View view, Object obj) {
        return (FragmentFirstStageBinding) bind(obj, view, R.layout.fragment_first_stage);
    }
}
