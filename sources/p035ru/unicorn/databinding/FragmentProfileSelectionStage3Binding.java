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
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.databinding.FragmentProfileSelectionStage3Binding */
public abstract class FragmentProfileSelectionStage3Binding extends ViewDataBinding {
    public final DynamicBackgroundButton btnNext;
    public final ItemPassCompanyBinding email;
    @Bindable
    protected ProfileSelectionVM mVm;
    public final ItemPassCompanyBinding name;
    public final ItemPassCompanyBinding patronymic;
    public final ItemPassCompanyBinding surname;
    public final TextView underline;

    public abstract void setVm(ProfileSelectionVM profileSelectionVM);

    protected FragmentProfileSelectionStage3Binding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ItemPassCompanyBinding itemPassCompanyBinding, ItemPassCompanyBinding itemPassCompanyBinding2, ItemPassCompanyBinding itemPassCompanyBinding3, ItemPassCompanyBinding itemPassCompanyBinding4, TextView textView) {
        super(obj, view, i);
        this.btnNext = dynamicBackgroundButton;
        this.email = itemPassCompanyBinding;
        setContainedBinding(this.email);
        this.name = itemPassCompanyBinding2;
        setContainedBinding(this.name);
        this.patronymic = itemPassCompanyBinding3;
        setContainedBinding(this.patronymic);
        this.surname = itemPassCompanyBinding4;
        setContainedBinding(this.surname);
        this.underline = textView;
    }

    public ProfileSelectionVM getVm() {
        return this.mVm;
    }

    public static FragmentProfileSelectionStage3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileSelectionStage3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentProfileSelectionStage3Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_profile_selection_stage_3, viewGroup, z, obj);
    }

    public static FragmentProfileSelectionStage3Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileSelectionStage3Binding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentProfileSelectionStage3Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_profile_selection_stage_3, (ViewGroup) null, false, obj);
    }

    public static FragmentProfileSelectionStage3Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileSelectionStage3Binding bind(View view, Object obj) {
        return (FragmentProfileSelectionStage3Binding) bind(obj, view, R.layout.fragment_profile_selection_stage_3);
    }
}
