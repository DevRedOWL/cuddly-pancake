package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentApartmentListBinding */
public abstract class FragmentApartmentListBinding extends ViewDataBinding {
    public final LinearLayout apartmentParent;
    public final TextView apartmentTitle;
    public final DynamicBackgroundButton btnApplyChanges;
    public final LinearLayout commerceParent;
    public final TextView commerceTitle;
    public final ProgressBar progressBar;
    public final RadioGroup rgApartmentList;
    public final RadioGroup rgCommerceList;

    protected FragmentApartmentListBinding(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, DynamicBackgroundButton dynamicBackgroundButton, LinearLayout linearLayout2, TextView textView2, ProgressBar progressBar2, RadioGroup radioGroup, RadioGroup radioGroup2) {
        super(obj, view, i);
        this.apartmentParent = linearLayout;
        this.apartmentTitle = textView;
        this.btnApplyChanges = dynamicBackgroundButton;
        this.commerceParent = linearLayout2;
        this.commerceTitle = textView2;
        this.progressBar = progressBar2;
        this.rgApartmentList = radioGroup;
        this.rgCommerceList = radioGroup2;
    }

    public static FragmentApartmentListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentApartmentListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentApartmentListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_apartment_list, viewGroup, z, obj);
    }

    public static FragmentApartmentListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentApartmentListBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentApartmentListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_apartment_list, (ViewGroup) null, false, obj);
    }

    public static FragmentApartmentListBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentApartmentListBinding bind(View view, Object obj) {
        return (FragmentApartmentListBinding) bind(obj, view, R.layout.fragment_apartment_list);
    }
}
