package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentPassBleFirstBinding */
public abstract class FragmentPassBleFirstBinding extends ViewDataBinding {
    public final DynamicBackgroundButton addCard;
    public final ItemIdPassTitleSubtitleBinding choose1;
    public final ItemIdPassTitleSubtitleBinding choose2;
    public final ItemIdPassTitleSubtitleBinding choose3;
    public final ItemPassIdTitleWithImageBinding id1;
    @Bindable
    protected PassCompanyVM mVm;

    /* renamed from: pb */
    public final ProgressBar f6575pb;

    /* renamed from: rv */
    public final RecyclerView f6576rv;

    /* renamed from: sv */
    public final ScrollView f6577sv;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassBleFirstBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding2, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding3, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, ProgressBar progressBar, RecyclerView recyclerView, ScrollView scrollView) {
        super(obj, view, i);
        this.addCard = dynamicBackgroundButton;
        this.choose1 = itemIdPassTitleSubtitleBinding;
        setContainedBinding(this.choose1);
        this.choose2 = itemIdPassTitleSubtitleBinding2;
        setContainedBinding(this.choose2);
        this.choose3 = itemIdPassTitleSubtitleBinding3;
        setContainedBinding(this.choose3);
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.f6575pb = progressBar;
        this.f6576rv = recyclerView;
        this.f6577sv = scrollView;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassBleFirstBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassBleFirstBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassBleFirstBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_ble_first, viewGroup, z, obj);
    }

    public static FragmentPassBleFirstBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassBleFirstBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassBleFirstBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_ble_first, (ViewGroup) null, false, obj);
    }

    public static FragmentPassBleFirstBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassBleFirstBinding bind(View view, Object obj) {
        return (FragmentPassBleFirstBinding) bind(obj, view, R.layout.fragment_pass_ble_first);
    }
}
