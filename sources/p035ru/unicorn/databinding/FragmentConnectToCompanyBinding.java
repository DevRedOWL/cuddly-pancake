package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentConnectToCompanyBinding */
public abstract class FragmentConnectToCompanyBinding extends ViewDataBinding {
    public final DynamicBackgroundButton btnCreatePass;
    public final ItemPassCompanyInfoBinding first;
    public final ItemPassCompanyInfoBinding fiveth;
    @Bindable
    protected PassCompanyVM mVm;
    public final ItemPassCompanyInfoBinding second;
    public final ItemPassCompanyInfoBinding third;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentConnectToCompanyBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ItemPassCompanyInfoBinding itemPassCompanyInfoBinding, ItemPassCompanyInfoBinding itemPassCompanyInfoBinding2, ItemPassCompanyInfoBinding itemPassCompanyInfoBinding3, ItemPassCompanyInfoBinding itemPassCompanyInfoBinding4) {
        super(obj, view, i);
        this.btnCreatePass = dynamicBackgroundButton;
        this.first = itemPassCompanyInfoBinding;
        setContainedBinding(this.first);
        this.fiveth = itemPassCompanyInfoBinding2;
        setContainedBinding(this.fiveth);
        this.second = itemPassCompanyInfoBinding3;
        setContainedBinding(this.second);
        this.third = itemPassCompanyInfoBinding4;
        setContainedBinding(this.third);
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentConnectToCompanyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentConnectToCompanyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentConnectToCompanyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_connect_to_company, viewGroup, z, obj);
    }

    public static FragmentConnectToCompanyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentConnectToCompanyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentConnectToCompanyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_connect_to_company, (ViewGroup) null, false, obj);
    }

    public static FragmentConnectToCompanyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentConnectToCompanyBinding bind(View view, Object obj) {
        return (FragmentConnectToCompanyBinding) bind(obj, view, R.layout.fragment_connect_to_company);
    }
}
