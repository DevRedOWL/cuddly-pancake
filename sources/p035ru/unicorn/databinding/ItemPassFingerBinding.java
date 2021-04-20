package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;

/* renamed from: ru.unicorn.databinding.ItemPassFingerBinding */
public abstract class ItemPassFingerBinding extends ViewDataBinding {

    /* renamed from: cb */
    public final CheckBox f6600cb;
    @Bindable
    protected Integer mPosition;
    @Bindable
    protected Integer mSelected;
    @Bindable
    protected String mTitle;
    @Bindable
    protected PassProfileVM mVm;

    public abstract void setPosition(Integer num);

    public abstract void setSelected(Integer num);

    public abstract void setTitle(String str);

    public abstract void setVm(PassProfileVM passProfileVM);

    protected ItemPassFingerBinding(Object obj, View view, int i, CheckBox checkBox) {
        super(obj, view, i);
        this.f6600cb = checkBox;
    }

    public PassProfileVM getVm() {
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

    public static ItemPassFingerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassFingerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemPassFingerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_finger, viewGroup, z, obj);
    }

    public static ItemPassFingerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassFingerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemPassFingerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_finger, (ViewGroup) null, false, obj);
    }

    public static ItemPassFingerBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassFingerBinding bind(View view, Object obj) {
        return (ItemPassFingerBinding) bind(obj, view, R.layout.item_pass_finger);
    }
}
