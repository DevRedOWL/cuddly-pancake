package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentPassSettingsFingerBinding */
public abstract class FragmentPassSettingsFingerBinding extends ViewDataBinding {
    public final ItemLabelUnderlineWithArrow2Binding choose1;
    public final DynamicBackgroundButton deleteFinger;
    public final ItemPassIdTitleWithImageBinding id1;
    @Bindable
    protected PassCompanyVM mVm;
    public final LinearLayout parent;

    /* renamed from: rv */
    public final RecyclerView f6587rv;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassSettingsFingerBinding(Object obj, View view, int i, ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding, DynamicBackgroundButton dynamicBackgroundButton, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, LinearLayout linearLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.choose1 = itemLabelUnderlineWithArrow2Binding;
        setContainedBinding(this.choose1);
        this.deleteFinger = dynamicBackgroundButton;
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.parent = linearLayout;
        this.f6587rv = recyclerView;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassSettingsFingerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsFingerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassSettingsFingerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_settings_finger, viewGroup, z, obj);
    }

    public static FragmentPassSettingsFingerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsFingerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassSettingsFingerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_settings_finger, (ViewGroup) null, false, obj);
    }

    public static FragmentPassSettingsFingerBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsFingerBinding bind(View view, Object obj) {
        return (FragmentPassSettingsFingerBinding) bind(obj, view, R.layout.fragment_pass_settings_finger);
    }
}
