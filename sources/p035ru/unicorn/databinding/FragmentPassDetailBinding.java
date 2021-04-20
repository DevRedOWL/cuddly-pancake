package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Pass;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentPassDetailBinding */
public abstract class FragmentPassDetailBinding extends ViewDataBinding {
    public final TextView description;
    public final DynamicBackgroundButton dynamicBackgroundButton;
    public final DynamicBackgroundButton dynamicBackgroundButton2;
    public final Fake1Binding fake1;
    public final Fake1Binding fake2;
    public final Fake1Binding fake3;
    public final Fake1Binding fake4;
    public final LinearLayout linearLayout7;
    @Bindable
    protected Pass mPass;
    public final TextView number;
    public final TextView status;

    public abstract void setPass(Pass pass);

    protected FragmentPassDetailBinding(Object obj, View view, int i, TextView textView, DynamicBackgroundButton dynamicBackgroundButton3, DynamicBackgroundButton dynamicBackgroundButton4, Fake1Binding fake1Binding, Fake1Binding fake1Binding2, Fake1Binding fake1Binding3, Fake1Binding fake1Binding4, LinearLayout linearLayout, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.description = textView;
        this.dynamicBackgroundButton = dynamicBackgroundButton3;
        this.dynamicBackgroundButton2 = dynamicBackgroundButton4;
        this.fake1 = fake1Binding;
        setContainedBinding(this.fake1);
        this.fake2 = fake1Binding2;
        setContainedBinding(this.fake2);
        this.fake3 = fake1Binding3;
        setContainedBinding(this.fake3);
        this.fake4 = fake1Binding4;
        setContainedBinding(this.fake4);
        this.linearLayout7 = linearLayout;
        this.number = textView2;
        this.status = textView3;
    }

    public Pass getPass() {
        return this.mPass;
    }

    public static FragmentPassDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPassDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_detail, viewGroup, z, obj);
    }

    public static FragmentPassDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassDetailBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPassDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_pass_detail, (ViewGroup) null, false, obj);
    }

    public static FragmentPassDetailBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPassDetailBinding bind(View view, Object obj) {
        return (FragmentPassDetailBinding) bind(obj, view, R.layout.fragment_pass_detail);
    }
}
