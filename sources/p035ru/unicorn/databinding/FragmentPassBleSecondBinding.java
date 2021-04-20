package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentPassBleSecondBinding */
public abstract class FragmentPassBleSecondBinding extends ViewDataBinding {
    public final DynamicBackgroundButton buttonSend;
    public final ItemIdPassTitleSubtitleBinding choose1;
    public final ItemPassIdTitleWithImageBinding id1;
    @Bindable
    protected PassCompanyVM mVm;

    /* renamed from: pb */
    public final ProgressBar f6578pb;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassBleSecondBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, ProgressBar progressBar) {
        super(obj, view, i);
        this.buttonSend = dynamicBackgroundButton;
        this.choose1 = itemIdPassTitleSubtitleBinding;
        setContainedBinding(this.choose1);
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.f6578pb = progressBar;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassBleSecondBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassBleSecondBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassBleSecondBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_ble_second, viewGroup, z, obj);
    }

    public static FragmentPassBleSecondBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassBleSecondBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassBleSecondBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_ble_second, (ViewGroup) null, false, obj);
    }

    public static FragmentPassBleSecondBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassBleSecondBinding bind(View view, Object obj) {
        return (FragmentPassBleSecondBinding) bind(obj, view, R.layout.fragment_pass_ble_second);
    }
}
