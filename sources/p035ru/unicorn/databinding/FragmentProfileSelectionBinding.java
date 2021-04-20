package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.databinding.FragmentProfileSelectionBinding */
public abstract class FragmentProfileSelectionBinding extends ViewDataBinding {
    public final DynamicBackgroundButton btnNext;
    public final ItemProfileChooserBinding commerce;
    public final ItemProfileChooserBinding demo;
    public final TextView description;
    public final AppCompatImageView ivLogo;
    public final ItemProfileChooserBinding justUjin;
    @Bindable
    protected ProfileChooserFragment.BindHelper mBinder;
    @Bindable
    protected ProfileSelectionVM mVm;
    public final ItemProfileChooserBinding newFlat;

    /* renamed from: uk */
    public final ItemProfileChooserBinding f6588uk;

    public abstract void setBinder(ProfileChooserFragment.BindHelper bindHelper);

    public abstract void setVm(ProfileSelectionVM profileSelectionVM);

    protected FragmentProfileSelectionBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ItemProfileChooserBinding itemProfileChooserBinding, ItemProfileChooserBinding itemProfileChooserBinding2, TextView textView, AppCompatImageView appCompatImageView, ItemProfileChooserBinding itemProfileChooserBinding3, ItemProfileChooserBinding itemProfileChooserBinding4, ItemProfileChooserBinding itemProfileChooserBinding5) {
        super(obj, view, i);
        this.btnNext = dynamicBackgroundButton;
        this.commerce = itemProfileChooserBinding;
        setContainedBinding(this.commerce);
        this.demo = itemProfileChooserBinding2;
        setContainedBinding(this.demo);
        this.description = textView;
        this.ivLogo = appCompatImageView;
        this.justUjin = itemProfileChooserBinding3;
        setContainedBinding(this.justUjin);
        this.newFlat = itemProfileChooserBinding4;
        setContainedBinding(this.newFlat);
        this.f6588uk = itemProfileChooserBinding5;
        setContainedBinding(this.f6588uk);
    }

    public ProfileChooserFragment.BindHelper getBinder() {
        return this.mBinder;
    }

    public ProfileSelectionVM getVm() {
        return this.mVm;
    }

    public static FragmentProfileSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentProfileSelectionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_profile_selection, viewGroup, z, obj);
    }

    public static FragmentProfileSelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileSelectionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentProfileSelectionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_profile_selection, (ViewGroup) null, false, obj);
    }

    public static FragmentProfileSelectionBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileSelectionBinding bind(View view, Object obj) {
        return (FragmentProfileSelectionBinding) bind(obj, view, R.layout.fragment_profile_selection);
    }
}
