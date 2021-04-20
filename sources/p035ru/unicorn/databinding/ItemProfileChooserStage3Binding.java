package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.databinding.ItemProfileChooserStage3Binding */
public abstract class ItemProfileChooserStage3Binding extends ViewDataBinding {

    /* renamed from: cb */
    public final CheckBox f6604cb;
    @Bindable
    protected Integer mPosition;
    @Bindable
    protected Integer mSelected;
    @Bindable
    protected String mSubtitle;
    @Bindable
    protected String mTitle;
    @Bindable
    protected ProfileSelectionVM mVm;
    public final TextView subtitle;
    public final TextView title;
    public final TextView underline;

    public abstract void setPosition(Integer num);

    public abstract void setSelected(Integer num);

    public abstract void setSubtitle(String str);

    public abstract void setTitle(String str);

    public abstract void setVm(ProfileSelectionVM profileSelectionVM);

    protected ItemProfileChooserStage3Binding(Object obj, View view, int i, CheckBox checkBox, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.f6604cb = checkBox;
        this.subtitle = textView;
        this.title = textView2;
        this.underline = textView3;
    }

    public ProfileSelectionVM getVm() {
        return this.mVm;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getSubtitle() {
        return this.mSubtitle;
    }

    public Integer getPosition() {
        return this.mPosition;
    }

    public Integer getSelected() {
        return this.mSelected;
    }

    public static ItemProfileChooserStage3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileChooserStage3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemProfileChooserStage3Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_profile_chooser_stage_3, viewGroup, z, obj);
    }

    public static ItemProfileChooserStage3Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileChooserStage3Binding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemProfileChooserStage3Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_profile_chooser_stage_3, (ViewGroup) null, false, obj);
    }

    public static ItemProfileChooserStage3Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileChooserStage3Binding bind(View view, Object obj) {
        return (ItemProfileChooserStage3Binding) bind(obj, view, R.layout.item_profile_chooser_stage_3);
    }
}
