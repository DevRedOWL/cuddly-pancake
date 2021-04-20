package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.databinding.ItemProfileChooserStage4Binding */
public abstract class ItemProfileChooserStage4Binding extends ViewDataBinding {
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    @Bindable
    protected ProfileSelectionVM mVm;
    public final TextView title;
    public final TextView underline;
    public final TextView value;

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    public abstract void setVm(ProfileSelectionVM profileSelectionVM);

    protected ItemProfileChooserStage4Binding(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.title = textView;
        this.underline = textView2;
        this.value = textView3;
    }

    public ProfileSelectionVM getVm() {
        return this.mVm;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getValue() {
        return this.mValue;
    }

    public static ItemProfileChooserStage4Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileChooserStage4Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemProfileChooserStage4Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_profile_chooser_stage_4, viewGroup, z, obj);
    }

    public static ItemProfileChooserStage4Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileChooserStage4Binding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemProfileChooserStage4Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_profile_chooser_stage_4, (ViewGroup) null, false, obj);
    }

    public static ItemProfileChooserStage4Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileChooserStage4Binding bind(View view, Object obj) {
        return (ItemProfileChooserStage4Binding) bind(obj, view, R.layout.item_profile_chooser_stage_4);
    }
}
