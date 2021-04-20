package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;

/* renamed from: ru.unicorn.databinding.FragmentPassSettingsBinding */
public abstract class FragmentPassSettingsBinding extends ViewDataBinding {
    public final ItemLabelUnderlineWithArrow2Binding choose1;
    public final ItemLabelUnderlineWithArrow2Binding choose2;
    public final ItemLabelUnderlineWithArrow2Binding choose3;
    public final ItemLabelUnderlineWithArrow2Binding choose4;
    @Bindable
    protected PassCompanyVM mVm;
    public final ItemLabelWithSwitchBinding open1;
    public final ItemLabelWithSwitchBinding open2;
    public final ItemIdPassItemsBinding passIcon;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassSettingsBinding(Object obj, View view, int i, ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding, ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding2, ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding3, ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding4, ItemLabelWithSwitchBinding itemLabelWithSwitchBinding, ItemLabelWithSwitchBinding itemLabelWithSwitchBinding2, ItemIdPassItemsBinding itemIdPassItemsBinding) {
        super(obj, view, i);
        this.choose1 = itemLabelUnderlineWithArrow2Binding;
        setContainedBinding(this.choose1);
        this.choose2 = itemLabelUnderlineWithArrow2Binding2;
        setContainedBinding(this.choose2);
        this.choose3 = itemLabelUnderlineWithArrow2Binding3;
        setContainedBinding(this.choose3);
        this.choose4 = itemLabelUnderlineWithArrow2Binding4;
        setContainedBinding(this.choose4);
        this.open1 = itemLabelWithSwitchBinding;
        setContainedBinding(this.open1);
        this.open2 = itemLabelWithSwitchBinding2;
        setContainedBinding(this.open2);
        this.passIcon = itemIdPassItemsBinding;
        setContainedBinding(this.passIcon);
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassSettingsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_settings, viewGroup, z, obj);
    }

    public static FragmentPassSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassSettingsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_settings, (ViewGroup) null, false, obj);
    }

    public static FragmentPassSettingsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsBinding bind(View view, Object obj) {
        return (FragmentPassSettingsBinding) bind(obj, view, R.layout.fragment_pass_settings);
    }
}
