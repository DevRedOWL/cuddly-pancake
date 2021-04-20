package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentPassFaceFirstBinding */
public abstract class FragmentPassFaceFirstBinding extends ViewDataBinding {
    public final DynamicBackgroundButton addFinger;
    public final ItemIdPassTitleSubtitleBinding choose1;
    public final ItemPassIdTitleWithImageBinding id1;
    @Bindable
    protected PassCompanyVM mVm;
    public final LinearLayout myPassItem;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassFaceFirstBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, LinearLayout linearLayout) {
        super(obj, view, i);
        this.addFinger = dynamicBackgroundButton;
        this.choose1 = itemIdPassTitleSubtitleBinding;
        setContainedBinding(this.choose1);
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.myPassItem = linearLayout;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassFaceFirstBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFaceFirstBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassFaceFirstBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_face_first, viewGroup, z, obj);
    }

    public static FragmentPassFaceFirstBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFaceFirstBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassFaceFirstBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_face_first, (ViewGroup) null, false, obj);
    }

    public static FragmentPassFaceFirstBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFaceFirstBinding bind(View view, Object obj) {
        return (FragmentPassFaceFirstBinding) bind(obj, view, R.layout.fragment_pass_face_first);
    }
}
