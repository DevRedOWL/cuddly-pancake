package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.FragmentBleSettingsBinding */
public abstract class FragmentBleSettingsBinding extends ViewDataBinding {
    public final ItemBleSwitchButtonBinding item1;

    protected FragmentBleSettingsBinding(Object obj, View view, int i, ItemBleSwitchButtonBinding itemBleSwitchButtonBinding) {
        super(obj, view, i);
        this.item1 = itemBleSwitchButtonBinding;
        setContainedBinding(this.item1);
    }

    public static FragmentBleSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBleSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentBleSettingsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_ble_settings, viewGroup, z, obj);
    }

    public static FragmentBleSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBleSettingsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentBleSettingsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_ble_settings, (ViewGroup) null, false, obj);
    }

    public static FragmentBleSettingsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBleSettingsBinding bind(View view, Object obj) {
        return (FragmentBleSettingsBinding) bind(obj, view, R.layout.fragment_ble_settings);
    }
}
