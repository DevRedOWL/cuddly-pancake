package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p051me.dm7.barcodescanner.zxing.ZXingScannerView;

/* renamed from: ru.unicorn.databinding.FragmentPassBleQrBinding */
public abstract class FragmentPassBleQrBinding extends ViewDataBinding {
    public final DynamicBackgroundButton addBle;
    public final ZXingScannerView cameraView;
    @Bindable
    protected PassCompanyVM mVm;
    public final View qrCodeHint;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassBleQrBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ZXingScannerView zXingScannerView, View view2) {
        super(obj, view, i);
        this.addBle = dynamicBackgroundButton;
        this.cameraView = zXingScannerView;
        this.qrCodeHint = view2;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassBleQrBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassBleQrBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassBleQrBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_ble_qr, viewGroup, z, obj);
    }

    public static FragmentPassBleQrBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassBleQrBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassBleQrBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_ble_qr, (ViewGroup) null, false, obj);
    }

    public static FragmentPassBleQrBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassBleQrBinding bind(View view, Object obj) {
        return (FragmentPassBleQrBinding) bind(obj, view, R.layout.fragment_pass_ble_qr);
    }
}
