package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;

/* renamed from: ru.unicorn.databinding.FragmentPassProfileBinding */
public abstract class FragmentPassProfileBinding extends ViewDataBinding {
    public final ItemPassProfileBinding first;
    @Bindable
    protected PassProfileVM mVm;
    public final ItemPassProfileBinding profile1;
    public final ItemPassProfileEmptyBinding profile10;
    public final ItemPassProfileBinding profile2;
    public final ItemPassProfileEmptyBinding profile3;
    public final ItemPassProfileBinding profile4;
    public final ItemPassProfileBinding profile5;
    public final ItemPassProfileBinding profile6;
    public final ItemPassProfileEmptyBinding profile7;
    public final ItemPassProfileBinding profile8;
    public final ItemPassProfileBinding profile9;

    /* renamed from: rv */
    public final RecyclerView f6585rv;

    public abstract void setVm(PassProfileVM passProfileVM);

    protected FragmentPassProfileBinding(Object obj, View view, int i, ItemPassProfileBinding itemPassProfileBinding, ItemPassProfileBinding itemPassProfileBinding2, ItemPassProfileEmptyBinding itemPassProfileEmptyBinding, ItemPassProfileBinding itemPassProfileBinding3, ItemPassProfileEmptyBinding itemPassProfileEmptyBinding2, ItemPassProfileBinding itemPassProfileBinding4, ItemPassProfileBinding itemPassProfileBinding5, ItemPassProfileBinding itemPassProfileBinding6, ItemPassProfileEmptyBinding itemPassProfileEmptyBinding3, ItemPassProfileBinding itemPassProfileBinding7, ItemPassProfileBinding itemPassProfileBinding8, RecyclerView recyclerView) {
        super(obj, view, i);
        this.first = itemPassProfileBinding;
        setContainedBinding(this.first);
        this.profile1 = itemPassProfileBinding2;
        setContainedBinding(this.profile1);
        this.profile10 = itemPassProfileEmptyBinding;
        setContainedBinding(this.profile10);
        this.profile2 = itemPassProfileBinding3;
        setContainedBinding(this.profile2);
        this.profile3 = itemPassProfileEmptyBinding2;
        setContainedBinding(this.profile3);
        this.profile4 = itemPassProfileBinding4;
        setContainedBinding(this.profile4);
        this.profile5 = itemPassProfileBinding5;
        setContainedBinding(this.profile5);
        this.profile6 = itemPassProfileBinding6;
        setContainedBinding(this.profile6);
        this.profile7 = itemPassProfileEmptyBinding3;
        setContainedBinding(this.profile7);
        this.profile8 = itemPassProfileBinding7;
        setContainedBinding(this.profile8);
        this.profile9 = itemPassProfileBinding8;
        setContainedBinding(this.profile9);
        this.f6585rv = recyclerView;
    }

    public PassProfileVM getVm() {
        return this.mVm;
    }

    public static FragmentPassProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_profile, viewGroup, z, obj);
    }

    public static FragmentPassProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassProfileBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_profile, (ViewGroup) null, false, obj);
    }

    public static FragmentPassProfileBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassProfileBinding bind(View view, Object obj) {
        return (FragmentPassProfileBinding) bind(obj, view, R.layout.fragment_pass_profile);
    }
}
