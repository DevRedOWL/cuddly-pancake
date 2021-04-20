package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentPassBleZeroBinding */
public abstract class FragmentPassBleZeroBinding extends ViewDataBinding {
    public final DynamicBackgroundButton addBle;
    public final CheckBox cbQr;
    public final CheckBox cbReader;
    public final TextView comment;
    public final ItemPassIdTitleWithImageBinding id1;
    public final LinearLayout linearLayout8;
    @Bindable
    protected PassCompanyVM mVm;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassBleZeroBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, CheckBox checkBox, CheckBox checkBox2, TextView textView, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, LinearLayout linearLayout) {
        super(obj, view, i);
        this.addBle = dynamicBackgroundButton;
        this.cbQr = checkBox;
        this.cbReader = checkBox2;
        this.comment = textView;
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.linearLayout8 = linearLayout;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassBleZeroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassBleZeroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassBleZeroBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_ble_zero, viewGroup, z, obj);
    }

    public static FragmentPassBleZeroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassBleZeroBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassBleZeroBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_ble_zero, (ViewGroup) null, false, obj);
    }

    public static FragmentPassBleZeroBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassBleZeroBinding bind(View view, Object obj) {
        return (FragmentPassBleZeroBinding) bind(obj, view, R.layout.fragment_pass_ble_zero);
    }
}
