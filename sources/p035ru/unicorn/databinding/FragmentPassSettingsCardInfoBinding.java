package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;

/* renamed from: ru.unicorn.databinding.FragmentPassSettingsCardInfoBinding */
public abstract class FragmentPassSettingsCardInfoBinding extends ViewDataBinding {
    public final ItemPassIdTitleWithImageBinding id1;
    public final TextView label;
    @Bindable
    protected PassCompanyVM mVm;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassSettingsCardInfoBinding(Object obj, View view, int i, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, TextView textView) {
        super(obj, view, i);
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.label = textView;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassSettingsCardInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsCardInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassSettingsCardInfoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_settings_card_info, viewGroup, z, obj);
    }

    public static FragmentPassSettingsCardInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsCardInfoBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassSettingsCardInfoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_settings_card_info, (ViewGroup) null, false, obj);
    }

    public static FragmentPassSettingsCardInfoBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsCardInfoBinding bind(View view, Object obj) {
        return (FragmentPassSettingsCardInfoBinding) bind(obj, view, R.layout.fragment_pass_settings_card_info);
    }
}
