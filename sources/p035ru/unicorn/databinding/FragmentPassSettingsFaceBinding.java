package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentPassSettingsFaceBinding */
public abstract class FragmentPassSettingsFaceBinding extends ViewDataBinding {
    public final ItemLabelUnderlineWithArrow2Binding choose1;
    public final DynamicBackgroundButton deleteFace;
    public final ItemPassIdTitleWithImageBinding id1;
    public final ItemPassIdTitleWithImageBinding id2;
    @Bindable
    protected PassCompanyVM mVm;
    public final LinearLayout parent;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassSettingsFaceBinding(Object obj, View view, int i, ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding, DynamicBackgroundButton dynamicBackgroundButton, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding2, LinearLayout linearLayout) {
        super(obj, view, i);
        this.choose1 = itemLabelUnderlineWithArrow2Binding;
        setContainedBinding(this.choose1);
        this.deleteFace = dynamicBackgroundButton;
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.id2 = itemPassIdTitleWithImageBinding2;
        setContainedBinding(this.id2);
        this.parent = linearLayout;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassSettingsFaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsFaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassSettingsFaceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_settings_face, viewGroup, z, obj);
    }

    public static FragmentPassSettingsFaceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsFaceBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassSettingsFaceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_settings_face, (ViewGroup) null, false, obj);
    }

    public static FragmentPassSettingsFaceBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsFaceBinding bind(View view, Object obj) {
        return (FragmentPassSettingsFaceBinding) bind(obj, view, R.layout.fragment_pass_settings_face);
    }
}
