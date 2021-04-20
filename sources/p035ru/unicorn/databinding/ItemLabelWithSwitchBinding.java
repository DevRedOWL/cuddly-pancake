package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kyleduo.switchbutton.SwitchButton;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemLabelWithSwitchBinding */
public abstract class ItemLabelWithSwitchBinding extends ViewDataBinding {
    @Bindable
    protected Boolean mEnable;
    @Bindable
    protected String mLabel;
    public final SwitchButton switch1;
    public final TextView textView15;

    public abstract void setEnable(Boolean bool);

    public abstract void setLabel(String str);

    protected ItemLabelWithSwitchBinding(Object obj, View view, int i, SwitchButton switchButton, TextView textView) {
        super(obj, view, i);
        this.switch1 = switchButton;
        this.textView15 = textView;
    }

    public String getLabel() {
        return this.mLabel;
    }

    public Boolean getEnable() {
        return this.mEnable;
    }

    public static ItemLabelWithSwitchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLabelWithSwitchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemLabelWithSwitchBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_label_with_switch, viewGroup, z, obj);
    }

    public static ItemLabelWithSwitchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLabelWithSwitchBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemLabelWithSwitchBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_label_with_switch, (ViewGroup) null, false, obj);
    }

    public static ItemLabelWithSwitchBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLabelWithSwitchBinding bind(View view, Object obj) {
        return (ItemLabelWithSwitchBinding) bind(obj, view, R.layout.item_label_with_switch);
    }
}
