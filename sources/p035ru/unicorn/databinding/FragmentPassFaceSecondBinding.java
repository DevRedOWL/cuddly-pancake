package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentPassFaceSecondBinding */
public abstract class FragmentPassFaceSecondBinding extends ViewDataBinding {
    public final ItemIdPassTitleSubtitleBinding choose1;
    public final DynamicBackgroundButton confirm;
    public final ItemPassIdTitleWithImageBinding id1;
    @Bindable
    protected PassCompanyVM mVm;
    public final DynamicBackgroundButton makePhoto;
    public final TextureView previewVideoView;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassFaceSecondBinding(Object obj, View view, int i, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding, DynamicBackgroundButton dynamicBackgroundButton, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, DynamicBackgroundButton dynamicBackgroundButton2, TextureView textureView) {
        super(obj, view, i);
        this.choose1 = itemIdPassTitleSubtitleBinding;
        setContainedBinding(this.choose1);
        this.confirm = dynamicBackgroundButton;
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.makePhoto = dynamicBackgroundButton2;
        this.previewVideoView = textureView;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassFaceSecondBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFaceSecondBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassFaceSecondBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_face_second, viewGroup, z, obj);
    }

    public static FragmentPassFaceSecondBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFaceSecondBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassFaceSecondBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_face_second, (ViewGroup) null, false, obj);
    }

    public static FragmentPassFaceSecondBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFaceSecondBinding bind(View view, Object obj) {
        return (FragmentPassFaceSecondBinding) bind(obj, view, R.layout.fragment_pass_face_second);
    }
}
