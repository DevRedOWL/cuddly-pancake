package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;

/* renamed from: ru.unicorn.databinding.FragmentPassProfileEditBinding */
public abstract class FragmentPassProfileEditBinding extends ViewDataBinding {
    public final ItemProfileEditable2Binding first;
    @Bindable
    protected PassProfileVM mVm;
    public final ProgressBar pbar;
    public final ItemProfileEditableBinding profile1;
    public final ItemProfileEditable2Binding profile2;
    public final ItemProfileEditableBinding profile5;
    public final ItemProfileEditable2Binding profile6;
    public final ItemPassProfileEmptyBinding profile7;

    /* renamed from: rv */
    public final RecyclerView f6586rv;
    public final ItemProfileEditable2Binding second;
    public final ItemProfileEditable2Binding third;

    public abstract void setVm(PassProfileVM passProfileVM);

    protected FragmentPassProfileEditBinding(Object obj, View view, int i, ItemProfileEditable2Binding itemProfileEditable2Binding, ProgressBar progressBar, ItemProfileEditableBinding itemProfileEditableBinding, ItemProfileEditable2Binding itemProfileEditable2Binding2, ItemProfileEditableBinding itemProfileEditableBinding2, ItemProfileEditable2Binding itemProfileEditable2Binding3, ItemPassProfileEmptyBinding itemPassProfileEmptyBinding, RecyclerView recyclerView, ItemProfileEditable2Binding itemProfileEditable2Binding4, ItemProfileEditable2Binding itemProfileEditable2Binding5) {
        super(obj, view, i);
        this.first = itemProfileEditable2Binding;
        setContainedBinding(this.first);
        this.pbar = progressBar;
        this.profile1 = itemProfileEditableBinding;
        setContainedBinding(this.profile1);
        this.profile2 = itemProfileEditable2Binding2;
        setContainedBinding(this.profile2);
        this.profile5 = itemProfileEditableBinding2;
        setContainedBinding(this.profile5);
        this.profile6 = itemProfileEditable2Binding3;
        setContainedBinding(this.profile6);
        this.profile7 = itemPassProfileEmptyBinding;
        setContainedBinding(this.profile7);
        this.f6586rv = recyclerView;
        this.second = itemProfileEditable2Binding4;
        setContainedBinding(this.second);
        this.third = itemProfileEditable2Binding5;
        setContainedBinding(this.third);
    }

    public PassProfileVM getVm() {
        return this.mVm;
    }

    public static FragmentPassProfileEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassProfileEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassProfileEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_profile_edit, viewGroup, z, obj);
    }

    public static FragmentPassProfileEditBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassProfileEditBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassProfileEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_profile_edit, (ViewGroup) null, false, obj);
    }

    public static FragmentPassProfileEditBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassProfileEditBinding bind(View view, Object obj) {
        return (FragmentPassProfileEditBinding) bind(obj, view, R.layout.fragment_pass_profile_edit);
    }
}
