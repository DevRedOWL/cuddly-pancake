package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.CoronaViewModel;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentCoronaCreatePass2Binding */
public abstract class FragmentCoronaCreatePass2Binding extends ViewDataBinding {
    public final DynamicBackgroundButton btnCreatePass;
    public final ItemPassBinding first;
    public final ItemPassArrowBinding fourth;
    @Bindable
    protected CoronaViewModel mVm;
    public final ItemPassArrowBinding second;
    public final ItemPassEditableBinding third;

    public abstract void setVm(CoronaViewModel coronaViewModel);

    protected FragmentCoronaCreatePass2Binding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ItemPassBinding itemPassBinding, ItemPassArrowBinding itemPassArrowBinding, ItemPassArrowBinding itemPassArrowBinding2, ItemPassEditableBinding itemPassEditableBinding) {
        super(obj, view, i);
        this.btnCreatePass = dynamicBackgroundButton;
        this.first = itemPassBinding;
        setContainedBinding(this.first);
        this.fourth = itemPassArrowBinding;
        setContainedBinding(this.fourth);
        this.second = itemPassArrowBinding2;
        setContainedBinding(this.second);
        this.third = itemPassEditableBinding;
        setContainedBinding(this.third);
    }

    public CoronaViewModel getVm() {
        return this.mVm;
    }

    public static FragmentCoronaCreatePass2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCoronaCreatePass2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentCoronaCreatePass2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_corona_create_pass2, viewGroup, z, obj);
    }

    public static FragmentCoronaCreatePass2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCoronaCreatePass2Binding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentCoronaCreatePass2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_corona_create_pass2, (ViewGroup) null, false, obj);
    }

    public static FragmentCoronaCreatePass2Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCoronaCreatePass2Binding bind(View view, Object obj) {
        return (FragmentCoronaCreatePass2Binding) bind(obj, view, R.layout.fragment_corona_create_pass2);
    }
}
