package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentPassFingerFirstBinding */
public abstract class FragmentPassFingerFirstBinding extends ViewDataBinding {
    public final DynamicBackgroundButton addFinger;
    public final ItemIdPassTitleSubtitleBinding choose1;
    public final ItemIdPassTitleSubtitleBinding choose2;
    public final ItemIdPassTitleSubtitleBinding choose3;
    public final ItemPassIdTitleWithImageBinding id1;
    @Bindable
    protected PassCompanyVM mVm;

    /* renamed from: rv */
    public final RecyclerView f6583rv;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassFingerFirstBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding2, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding3, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, RecyclerView recyclerView) {
        super(obj, view, i);
        this.addFinger = dynamicBackgroundButton;
        this.choose1 = itemIdPassTitleSubtitleBinding;
        setContainedBinding(this.choose1);
        this.choose2 = itemIdPassTitleSubtitleBinding2;
        setContainedBinding(this.choose2);
        this.choose3 = itemIdPassTitleSubtitleBinding3;
        setContainedBinding(this.choose3);
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.f6583rv = recyclerView;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassFingerFirstBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFingerFirstBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassFingerFirstBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_finger_first, viewGroup, z, obj);
    }

    public static FragmentPassFingerFirstBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFingerFirstBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassFingerFirstBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_finger_first, (ViewGroup) null, false, obj);
    }

    public static FragmentPassFingerFirstBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassFingerFirstBinding bind(View view, Object obj) {
        return (FragmentPassFingerFirstBinding) bind(obj, view, R.layout.fragment_pass_finger_first);
    }
}
