package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentPassDetail2Binding */
public abstract class FragmentPassDetail2Binding extends ViewDataBinding {
    public final ImageView barcode;
    public final Fake1Binding fake1;
    public final Fake1Binding fake10;
    public final Fake1Binding fake11;
    public final Fake1Binding fake2;
    public final Fake1Binding fake3;
    public final Fake1Binding fake4;
    public final ItemIdPassItemsBinding itemIdPassParent;
    public final LinearLayout linearLayout7;
    @Bindable
    protected ProfileViewModel mVm;
    public final TextView number;
    public final DynamicBackgroundButton openDoor;

    /* renamed from: sv */
    public final ScrollView f6581sv;

    public abstract void setVm(ProfileViewModel profileViewModel);

    protected FragmentPassDetail2Binding(Object obj, View view, int i, ImageView imageView, Fake1Binding fake1Binding, Fake1Binding fake1Binding2, Fake1Binding fake1Binding3, Fake1Binding fake1Binding4, Fake1Binding fake1Binding5, Fake1Binding fake1Binding6, ItemIdPassItemsBinding itemIdPassItemsBinding, LinearLayout linearLayout, TextView textView, DynamicBackgroundButton dynamicBackgroundButton, ScrollView scrollView) {
        super(obj, view, i);
        this.barcode = imageView;
        this.fake1 = fake1Binding;
        setContainedBinding(this.fake1);
        this.fake10 = fake1Binding2;
        setContainedBinding(this.fake10);
        this.fake11 = fake1Binding3;
        setContainedBinding(this.fake11);
        this.fake2 = fake1Binding4;
        setContainedBinding(this.fake2);
        this.fake3 = fake1Binding5;
        setContainedBinding(this.fake3);
        this.fake4 = fake1Binding6;
        setContainedBinding(this.fake4);
        this.itemIdPassParent = itemIdPassItemsBinding;
        setContainedBinding(this.itemIdPassParent);
        this.linearLayout7 = linearLayout;
        this.number = textView;
        this.openDoor = dynamicBackgroundButton;
        this.f6581sv = scrollView;
    }

    public ProfileViewModel getVm() {
        return this.mVm;
    }

    public static FragmentPassDetail2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassDetail2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassDetail2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_detail2, viewGroup, z, obj);
    }

    public static FragmentPassDetail2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassDetail2Binding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassDetail2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_detail2, (ViewGroup) null, false, obj);
    }

    public static FragmentPassDetail2Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassDetail2Binding bind(View view, Object obj) {
        return (FragmentPassDetail2Binding) bind(obj, view, R.layout.fragment_pass_detail2);
    }
}
