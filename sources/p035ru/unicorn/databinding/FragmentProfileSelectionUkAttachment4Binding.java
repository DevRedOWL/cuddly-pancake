package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.databinding.FragmentProfileSelectionUkAttachment4Binding */
public abstract class FragmentProfileSelectionUkAttachment4Binding extends ViewDataBinding {
    public final DynamicBackgroundButton btnNext;
    public final TextView description;
    @Bindable
    protected ProfileSelectionVM mVm;
    public final ItemProfileChooserStage4Binding one;

    /* renamed from: pb */
    public final ProgressBar f6590pb;
    public final ItemProfileChooserStage4Binding three;
    public final TextView title;
    public final ItemProfileChooserStage4Binding two;
    public final TextView underline;

    public abstract void setVm(ProfileSelectionVM profileSelectionVM);

    protected FragmentProfileSelectionUkAttachment4Binding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, TextView textView, ItemProfileChooserStage4Binding itemProfileChooserStage4Binding, ProgressBar progressBar, ItemProfileChooserStage4Binding itemProfileChooserStage4Binding2, TextView textView2, ItemProfileChooserStage4Binding itemProfileChooserStage4Binding3, TextView textView3) {
        super(obj, view, i);
        this.btnNext = dynamicBackgroundButton;
        this.description = textView;
        this.one = itemProfileChooserStage4Binding;
        setContainedBinding(this.one);
        this.f6590pb = progressBar;
        this.three = itemProfileChooserStage4Binding2;
        setContainedBinding(this.three);
        this.title = textView2;
        this.two = itemProfileChooserStage4Binding3;
        setContainedBinding(this.two);
        this.underline = textView3;
    }

    public ProfileSelectionVM getVm() {
        return this.mVm;
    }

    public static FragmentProfileSelectionUkAttachment4Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileSelectionUkAttachment4Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentProfileSelectionUkAttachment4Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_profile_selection_uk_attachment_4, viewGroup, z, obj);
    }

    public static FragmentProfileSelectionUkAttachment4Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileSelectionUkAttachment4Binding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentProfileSelectionUkAttachment4Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_profile_selection_uk_attachment_4, (ViewGroup) null, false, obj);
    }

    public static FragmentProfileSelectionUkAttachment4Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileSelectionUkAttachment4Binding bind(View view, Object obj) {
        return (FragmentProfileSelectionUkAttachment4Binding) bind(obj, view, R.layout.fragment_profile_selection_uk_attachment_4);
    }
}
