package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;

/* renamed from: ru.unicorn.databinding.FragmentPassSettingsBleBinding */
public abstract class FragmentPassSettingsBleBinding extends ViewDataBinding {
    public final ItemLabelUnderlineWithArrow2Binding choose1;
    public final ItemPassIdTitleWithImageBinding id1;
    @Bindable
    protected PassCompanyVM mVm;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassSettingsBleBinding(Object obj, View view, int i, ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding) {
        super(obj, view, i);
        this.choose1 = itemLabelUnderlineWithArrow2Binding;
        setContainedBinding(this.choose1);
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassSettingsBleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsBleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassSettingsBleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_settings_ble, viewGroup, z, obj);
    }

    public static FragmentPassSettingsBleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsBleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassSettingsBleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_settings_ble, (ViewGroup) null, false, obj);
    }

    public static FragmentPassSettingsBleBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsBleBinding bind(View view, Object obj) {
        return (FragmentPassSettingsBleBinding) bind(obj, view, R.layout.fragment_pass_settings_ble);
    }
}
