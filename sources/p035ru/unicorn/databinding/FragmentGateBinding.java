package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.MjpegView;

/* renamed from: ru.unicorn.databinding.FragmentGateBinding */
public abstract class FragmentGateBinding extends ViewDataBinding {
    public final DynamicBackgroundButton close;
    public final ConstraintLayout constraintLayout3;

    /* renamed from: cv */
    public final CardView f6572cv;
    public final MjpegView mjpegView;
    public final DynamicBackgroundButton open;

    /* renamed from: pb */
    public final ProgressBar f6573pb;
    public final TextView title;
    public final TextView underline;

    protected FragmentGateBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ConstraintLayout constraintLayout, CardView cardView, MjpegView mjpegView2, DynamicBackgroundButton dynamicBackgroundButton2, ProgressBar progressBar, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.close = dynamicBackgroundButton;
        this.constraintLayout3 = constraintLayout;
        this.f6572cv = cardView;
        this.mjpegView = mjpegView2;
        this.open = dynamicBackgroundButton2;
        this.f6573pb = progressBar;
        this.title = textView;
        this.underline = textView2;
    }

    public static FragmentGateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentGateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_gate, viewGroup, z, obj);
    }

    public static FragmentGateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGateBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentGateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_gate, (ViewGroup) null, false, obj);
    }

    public static FragmentGateBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentGateBinding bind(View view, Object obj) {
        return (FragmentGateBinding) bind(obj, view, R.layout.fragment_gate);
    }
}
