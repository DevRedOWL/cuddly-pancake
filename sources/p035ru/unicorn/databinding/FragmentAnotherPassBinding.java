package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;

/* renamed from: ru.unicorn.databinding.FragmentAnotherPassBinding */
public abstract class FragmentAnotherPassBinding extends ViewDataBinding {
    public final DynamicBackgroundButton auto;
    public final RadioButton btnPassOneTime;
    public final RadioButton btnPassTime;
    public final CheckBox checkboxDifferentVehicleType;
    public final ItemFieldSpinnerBinding company;
    public final ItemAnotherPassDataBinding data1;
    public final ItemAnotherPassData2Binding data10;
    public final ItemAnotherPassData2Binding data11;
    public final ItemAnotherPassData2Binding data12;
    public final ItemAnotherPassData2Binding data13;
    public final ItemAnotherPassData2Binding data14;
    public final ItemAnotherPassDataBinding data16;
    public final ItemAnotherPassDataBinding data17;
    public final ItemAnotherPassDataBinding data18;
    public final ItemAnotherPassDataWithHintBinding data19;
    public final ItemAnotherPassDataBinding data2;
    public final ItemAnotherPassDataBinding data3;
    public final ItemAnotherPassDataBinding data4;
    public final ItemAnotherPassDataBinding data6;
    public final ItemAnotherPassDataBinding data7;
    public final ItemAnotherPassData2Binding data8;
    public final ItemAnotherPassDataBinding data9;
    public final DynamicBackgroundButton group;
    public final LinearLayout llAdditional;
    public final LinearLayout llZoneSlots;
    public final RadioGroup locationRadioGroup;
    @Bindable
    protected AnotherPassViewModel mVm;
    public final View paddingGroup;
    public final ProgressBar pbLoading;
    public final DynamicBackgroundButton rent;
    public final DynamicBackgroundButton save;

    /* renamed from: sv */
    public final ScrollView f6561sv;
    public final ItemAnotherTitleBinding title1;
    public final ItemAnotherGuestDataTitleBinding title10;
    public final ItemAnotherGuestDataTitleBinding title2;
    public final ItemAnotherTitleBinding title3;
    public final ItemAnotherTitleBinding title4;
    public final ItemAnotherTitleBinding title5;
    public final ItemAnotherTitleBinding title6;
    public final ItemAnotherTitleBinding title7;
    public final ItemAnotherTitleBinding title8;
    public final ItemAnotherTitleBinding title9;
    public final DynamicBackgroundButton today;
    public final DynamicBackgroundButton tomorrow;
    public final TextView tvNoPlaces;

    public abstract void setVm(AnotherPassViewModel anotherPassViewModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentAnotherPassBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, RadioButton radioButton, RadioButton radioButton2, CheckBox checkBox, ItemFieldSpinnerBinding itemFieldSpinnerBinding, ItemAnotherPassDataBinding itemAnotherPassDataBinding, ItemAnotherPassData2Binding itemAnotherPassData2Binding, ItemAnotherPassData2Binding itemAnotherPassData2Binding2, ItemAnotherPassData2Binding itemAnotherPassData2Binding3, ItemAnotherPassData2Binding itemAnotherPassData2Binding4, ItemAnotherPassData2Binding itemAnotherPassData2Binding5, ItemAnotherPassDataBinding itemAnotherPassDataBinding2, ItemAnotherPassDataBinding itemAnotherPassDataBinding3, ItemAnotherPassDataBinding itemAnotherPassDataBinding4, ItemAnotherPassDataWithHintBinding itemAnotherPassDataWithHintBinding, ItemAnotherPassDataBinding itemAnotherPassDataBinding5, ItemAnotherPassDataBinding itemAnotherPassDataBinding6, ItemAnotherPassDataBinding itemAnotherPassDataBinding7, ItemAnotherPassDataBinding itemAnotherPassDataBinding8, ItemAnotherPassDataBinding itemAnotherPassDataBinding9, ItemAnotherPassData2Binding itemAnotherPassData2Binding6, ItemAnotherPassDataBinding itemAnotherPassDataBinding10, DynamicBackgroundButton dynamicBackgroundButton2, LinearLayout linearLayout, LinearLayout linearLayout2, RadioGroup radioGroup, View view2, ProgressBar progressBar, DynamicBackgroundButton dynamicBackgroundButton3, DynamicBackgroundButton dynamicBackgroundButton4, ScrollView scrollView, ItemAnotherTitleBinding itemAnotherTitleBinding, ItemAnotherGuestDataTitleBinding itemAnotherGuestDataTitleBinding, ItemAnotherGuestDataTitleBinding itemAnotherGuestDataTitleBinding2, ItemAnotherTitleBinding itemAnotherTitleBinding2, ItemAnotherTitleBinding itemAnotherTitleBinding3, ItemAnotherTitleBinding itemAnotherTitleBinding4, ItemAnotherTitleBinding itemAnotherTitleBinding5, ItemAnotherTitleBinding itemAnotherTitleBinding6, ItemAnotherTitleBinding itemAnotherTitleBinding7, ItemAnotherTitleBinding itemAnotherTitleBinding8, DynamicBackgroundButton dynamicBackgroundButton5, DynamicBackgroundButton dynamicBackgroundButton6, TextView textView) {
        super(obj, view, i);
        this.auto = dynamicBackgroundButton;
        this.btnPassOneTime = radioButton;
        this.btnPassTime = radioButton2;
        this.checkboxDifferentVehicleType = checkBox;
        this.company = itemFieldSpinnerBinding;
        setContainedBinding(this.company);
        this.data1 = itemAnotherPassDataBinding;
        setContainedBinding(this.data1);
        this.data10 = itemAnotherPassData2Binding;
        setContainedBinding(this.data10);
        this.data11 = itemAnotherPassData2Binding2;
        setContainedBinding(this.data11);
        this.data12 = itemAnotherPassData2Binding3;
        setContainedBinding(this.data12);
        this.data13 = itemAnotherPassData2Binding4;
        setContainedBinding(this.data13);
        this.data14 = itemAnotherPassData2Binding5;
        setContainedBinding(this.data14);
        this.data16 = itemAnotherPassDataBinding2;
        setContainedBinding(this.data16);
        this.data17 = itemAnotherPassDataBinding3;
        setContainedBinding(this.data17);
        this.data18 = itemAnotherPassDataBinding4;
        setContainedBinding(this.data18);
        this.data19 = itemAnotherPassDataWithHintBinding;
        setContainedBinding(this.data19);
        this.data2 = itemAnotherPassDataBinding5;
        setContainedBinding(this.data2);
        this.data3 = itemAnotherPassDataBinding6;
        setContainedBinding(this.data3);
        this.data4 = itemAnotherPassDataBinding7;
        setContainedBinding(this.data4);
        this.data6 = itemAnotherPassDataBinding8;
        setContainedBinding(this.data6);
        this.data7 = itemAnotherPassDataBinding9;
        setContainedBinding(this.data7);
        this.data8 = itemAnotherPassData2Binding6;
        setContainedBinding(this.data8);
        this.data9 = itemAnotherPassDataBinding10;
        setContainedBinding(this.data9);
        this.group = dynamicBackgroundButton2;
        this.llAdditional = linearLayout;
        this.llZoneSlots = linearLayout2;
        this.locationRadioGroup = radioGroup;
        this.paddingGroup = view2;
        this.pbLoading = progressBar;
        this.rent = dynamicBackgroundButton3;
        this.save = dynamicBackgroundButton4;
        this.f6561sv = scrollView;
        this.title1 = itemAnotherTitleBinding;
        setContainedBinding(this.title1);
        this.title10 = itemAnotherGuestDataTitleBinding;
        setContainedBinding(this.title10);
        this.title2 = itemAnotherGuestDataTitleBinding2;
        setContainedBinding(this.title2);
        this.title3 = itemAnotherTitleBinding2;
        setContainedBinding(this.title3);
        this.title4 = itemAnotherTitleBinding3;
        setContainedBinding(this.title4);
        this.title5 = itemAnotherTitleBinding4;
        setContainedBinding(this.title5);
        this.title6 = itemAnotherTitleBinding5;
        setContainedBinding(this.title6);
        this.title7 = itemAnotherTitleBinding6;
        setContainedBinding(this.title7);
        this.title8 = itemAnotherTitleBinding7;
        setContainedBinding(this.title8);
        this.title9 = itemAnotherTitleBinding8;
        setContainedBinding(this.title9);
        this.today = dynamicBackgroundButton5;
        this.tomorrow = dynamicBackgroundButton6;
        this.tvNoPlaces = textView;
    }

    public AnotherPassViewModel getVm() {
        return this.mVm;
    }

    public static FragmentAnotherPassBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAnotherPassBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentAnotherPassBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_another_pass, viewGroup, z, obj);
    }

    public static FragmentAnotherPassBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAnotherPassBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentAnotherPassBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_another_pass, (ViewGroup) null, false, obj);
    }

    public static FragmentAnotherPassBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAnotherPassBinding bind(View view, Object obj) {
        return (FragmentAnotherPassBinding) bind(obj, view, R.layout.fragment_another_pass);
    }
}
