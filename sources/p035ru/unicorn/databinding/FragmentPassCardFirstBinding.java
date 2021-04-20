package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentPassCardFirstBinding */
public abstract class FragmentPassCardFirstBinding extends ViewDataBinding {
    public final DynamicBackgroundButton addCard;
    public final ItemIdPassTitleSubtitleBinding choose1;
    public final ItemIdPassTitleSubtitleBinding choose2;
    public final ItemIdPassTitleSubtitleBinding choose3;
    public final ItemIdPassTitleSubtitleBinding choose4;
    public final ItemPassIdTitleWithImageBinding id1;
    @Bindable
    protected PassCompanyVM mVm;

    /* renamed from: pb */
    public final ProgressBar f6579pb;

    /* renamed from: rv */
    public final RecyclerView f6580rv;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentPassCardFirstBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding2, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding3, ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding4, ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, ProgressBar progressBar, RecyclerView recyclerView) {
        super(obj, view, i);
        this.addCard = dynamicBackgroundButton;
        this.choose1 = itemIdPassTitleSubtitleBinding;
        setContainedBinding(this.choose1);
        this.choose2 = itemIdPassTitleSubtitleBinding2;
        setContainedBinding(this.choose2);
        this.choose3 = itemIdPassTitleSubtitleBinding3;
        setContainedBinding(this.choose3);
        this.choose4 = itemIdPassTitleSubtitleBinding4;
        setContainedBinding(this.choose4);
        this.id1 = itemPassIdTitleWithImageBinding;
        setContainedBinding(this.id1);
        this.f6579pb = progressBar;
        this.f6580rv = recyclerView;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentPassCardFirstBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassCardFirstBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassCardFirstBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_card_first, viewGroup, z, obj);
    }

    public static FragmentPassCardFirstBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassCardFirstBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassCardFirstBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_card_first, (ViewGroup) null, false, obj);
    }

    public static FragmentPassCardFirstBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassCardFirstBinding bind(View view, Object obj) {
        return (FragmentPassCardFirstBinding) bind(obj, view, R.layout.fragment_pass_card_first);
    }
}
