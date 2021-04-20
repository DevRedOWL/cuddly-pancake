package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.databinding.ItemProfileChooserBinding */
public abstract class ItemProfileChooserBinding extends ViewDataBinding {

    /* renamed from: cb */
    public final CheckBox f6603cb;
    @Bindable
    protected Integer mPosition;
    @Bindable
    protected Integer mSelected;
    @Bindable
    protected String mTitle;
    @Bindable
    protected ProfileSelectionVM mVm;

    public abstract void setPosition(Integer num);

    public abstract void setSelected(Integer num);

    public abstract void setTitle(String str);

    public abstract void setVm(ProfileSelectionVM profileSelectionVM);

    protected ItemProfileChooserBinding(Object obj, View view, int i, CheckBox checkBox) {
        super(obj, view, i);
        this.f6603cb = checkBox;
    }

    public ProfileSelectionVM getVm() {
        return this.mVm;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public Integer getPosition() {
        return this.mPosition;
    }

    public Integer getSelected() {
        return this.mSelected;
    }

    public static ItemProfileChooserBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileChooserBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemProfileChooserBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_profile_chooser, viewGroup, z, obj);
    }

    public static ItemProfileChooserBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileChooserBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemProfileChooserBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_profile_chooser, (ViewGroup) null, false, obj);
    }

    public static ItemProfileChooserBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileChooserBinding bind(View view, Object obj) {
        return (ItemProfileChooserBinding) bind(obj, view, R.layout.item_profile_chooser);
    }
}
