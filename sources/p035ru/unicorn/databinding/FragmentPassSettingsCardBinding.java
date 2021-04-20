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

/* renamed from: ru.unicorn.databinding.FragmentPassSettingsCardBinding */
public abstract class FragmentPassSettingsCardBinding extends ViewDataBinding {
    public final ItemLabelUnderlineWithArrow2Binding choose1;
    public final ItemLabelUnderlineWithArrow2Binding choose2;
    public final DynamicBackgroundButton deleteCard;
    public final ItemPassIdTitleWithImageBinding id1;
    public final ItemPassIdTitleWithImageBinding id2;
    @Bindable
    protected PassCompanyVM mVm;
    public final LinearLayout parent;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassSettingsCardBinding(Object obj, View view, int i, ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding, ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding2, DynamicBackgroundButton dynamicBackgroundButton, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding2, LinearLayout linearLayout) {
        super(obj, view, i);
        this.choose1 = itemLabelUnderlineWithArrow2Binding;
        setContainedBinding(this.choose1);
        this.choose2 = itemLabelUnderlineWithArrow2Binding2;
        setContainedBinding(this.choose2);
        this.deleteCard = dynamicBackgroundButton;
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.id2 = itemPassIdTitleWithImageBinding2;
        setContainedBinding(this.id2);
        this.parent = linearLayout;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassSettingsCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassSettingsCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_settings_card, viewGroup, z, obj);
    }

    public static FragmentPassSettingsCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsCardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassSettingsCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_settings_card, (ViewGroup) null, false, obj);
    }

    public static FragmentPassSettingsCardBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassSettingsCardBinding bind(View view, Object obj) {
        return (FragmentPassSettingsCardBinding) bind(obj, view, R.layout.fragment_pass_settings_card);
    }
}
