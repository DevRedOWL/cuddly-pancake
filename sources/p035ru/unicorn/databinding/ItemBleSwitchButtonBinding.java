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

/* renamed from: ru.unicorn.databinding.ItemBleSwitchButtonBinding */
public abstract class ItemBleSwitchButtonBinding extends ViewDataBinding {
    @Bindable
    protected Boolean mIsCheck;
    @Bindable
    protected String mTitle;
    public final SwitchButton swich;
    public final TextView title;
    public final TextView underline;

    public abstract void setIsCheck(Boolean bool);

    public abstract void setTitle(String str);

    protected ItemBleSwitchButtonBinding(Object obj, View view, int i, SwitchButton switchButton, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.swich = switchButton;
        this.title = textView;
        this.underline = textView2;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public Boolean getIsCheck() {
        return this.mIsCheck;
    }

    public static ItemBleSwitchButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemBleSwitchButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemBleSwitchButtonBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_ble_switch_button, viewGroup, z, obj);
    }

    public static ItemBleSwitchButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemBleSwitchButtonBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemBleSwitchButtonBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_ble_switch_button, (ViewGroup) null, false, obj);
    }

    public static ItemBleSwitchButtonBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemBleSwitchButtonBinding bind(View view, Object obj) {
        return (ItemBleSwitchButtonBinding) bind(obj, view, R.layout.item_ble_switch_button);
    }
}
