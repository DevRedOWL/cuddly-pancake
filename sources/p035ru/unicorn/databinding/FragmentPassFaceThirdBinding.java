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

/* renamed from: ru.unicorn.databinding.FragmentPassFaceThirdBinding */
public abstract class FragmentPassFaceThirdBinding extends ViewDataBinding {
    public final ItemIdPassTitleSubtitleBinding choose1;
    public final ItemPassIdTitleWithImageBinding id1;
    @Bindable
    protected PassCompanyVM mVm;

    /* renamed from: pb */
    public final ProgressBar f6582pb;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassFaceThirdBinding(Object obj, View view, int i, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, ProgressBar progressBar) {
        super(obj, view, i);
        this.choose1 = itemIdPassTitleSubtitleBinding;
        setContainedBinding(this.choose1);
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.f6582pb = progressBar;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassFaceThirdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFaceThirdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassFaceThirdBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_face_third, viewGroup, z, obj);
    }

    public static FragmentPassFaceThirdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFaceThirdBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassFaceThirdBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_face_third, (ViewGroup) null, false, obj);
    }

    public static FragmentPassFaceThirdBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFaceThirdBinding bind(View view, Object obj) {
        return (FragmentPassFaceThirdBinding) bind(obj, view, R.layout.fragment_pass_face_third);
    }
}
