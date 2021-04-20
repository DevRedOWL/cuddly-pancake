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

/* renamed from: ru.unicorn.databinding.FragmentPassFingerSecondBinding */
public abstract class FragmentPassFingerSecondBinding extends ViewDataBinding {
    public final ItemIdPassTitleSubtitleBinding choose1;
    public final DynamicBackgroundButton fingerRepeat;
    public final ItemPassIdTitleWithImageBinding id1;
    @Bindable
    protected PassCompanyVM mVm;

    /* renamed from: pb */
    public final ProgressBar f6584pb;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassFingerSecondBinding(Object obj, View view, int i, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding, DynamicBackgroundButton dynamicBackgroundButton, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, ProgressBar progressBar) {
        super(obj, view, i);
        this.choose1 = itemIdPassTitleSubtitleBinding;
        setContainedBinding(this.choose1);
        this.fingerRepeat = dynamicBackgroundButton;
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.f6584pb = progressBar;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassFingerSecondBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFingerSecondBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassFingerSecondBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_finger_second, viewGroup, z, obj);
    }

    public static FragmentPassFingerSecondBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFingerSecondBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassFingerSecondBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_finger_second, (ViewGroup) null, false, obj);
    }

    public static FragmentPassFingerSecondBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFingerSecondBinding bind(View view, Object obj) {
        return (FragmentPassFingerSecondBinding) bind(obj, view, R.layout.fragment_pass_finger_second);
    }
}
