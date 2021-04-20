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

/* renamed from: ru.unicorn.databinding.FragmentCoronaCreateCompanyBinding */
public abstract class FragmentCoronaCreateCompanyBinding extends ViewDataBinding {
    public final DynamicBackgroundButton btnAddINN;
    public final DynamicBackgroundButton btnAddOGRN;
    public final DynamicBackgroundButton btnAddRent;
    public final DynamicBackgroundButton btnCreatePass;
    public final ItemPassCompanyBinding first;
    public final ItemPassCompanyBinding fiveth;
    public final ItemPassCompanyBinding fourth;
    @Bindable
    protected PassCompanyVM mVm;

    /* renamed from: pb */
    public final ProgressBar f6562pb;
    public final RecyclerView rvDocuments;
    public final ItemPassCompanyBinding second;
    public final ItemPassCompanyBinding third;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentCoronaCreateCompanyBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, DynamicBackgroundButton dynamicBackgroundButton2, DynamicBackgroundButton dynamicBackgroundButton3, DynamicBackgroundButton dynamicBackgroundButton4, ItemPassCompanyBinding itemPassCompanyBinding, ItemPassCompanyBinding itemPassCompanyBinding2, ItemPassCompanyBinding itemPassCompanyBinding3, ProgressBar progressBar, RecyclerView recyclerView, ItemPassCompanyBinding itemPassCompanyBinding4, ItemPassCompanyBinding itemPassCompanyBinding5) {
        super(obj, view, i);
        this.btnAddINN = dynamicBackgroundButton;
        this.btnAddOGRN = dynamicBackgroundButton2;
        this.btnAddRent = dynamicBackgroundButton3;
        this.btnCreatePass = dynamicBackgroundButton4;
        this.first = itemPassCompanyBinding;
        setContainedBinding(this.first);
        this.fiveth = itemPassCompanyBinding2;
        setContainedBinding(this.fiveth);
        this.fourth = itemPassCompanyBinding3;
        setContainedBinding(this.fourth);
        this.f6562pb = progressBar;
        this.rvDocuments = recyclerView;
        this.second = itemPassCompanyBinding4;
        setContainedBinding(this.second);
        this.third = itemPassCompanyBinding5;
        setContainedBinding(this.third);
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentCoronaCreateCompanyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCoronaCreateCompanyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentCoronaCreateCompanyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_corona_create_company, viewGroup, z, obj);
    }

    public static FragmentCoronaCreateCompanyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCoronaCreateCompanyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentCoronaCreateCompanyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_corona_create_company, (ViewGroup) null, false, obj);
    }

    public static FragmentCoronaCreateCompanyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCoronaCreateCompanyBinding bind(View view, Object obj) {
        return (FragmentCoronaCreateCompanyBinding) bind(obj, view, R.layout.fragment_corona_create_company);
    }
}
