package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.Fake2Binding */
public abstract class Fake2Binding extends ViewDataBinding {
    @Bindable
    protected String mKey;
    @Bindable
    protected String mValue;
    public final TextView subtitle;
    public final TextView title;
    public final View view4;

    public abstract void setKey(String str);

    public abstract void setValue(String str);

    protected Fake2Binding(Object obj, View view, int i, TextView textView, TextView textView2, View view2) {
        super(obj, view, i);
        this.subtitle = textView;
        this.title = textView2;
        this.view4 = view2;
    }

    public String getKey() {
        return this.mKey;
    }

    public String getValue() {
        return this.mValue;
    }

    public static Fake2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static Fake2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (Fake2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fake_2, viewGroup, z, obj);
    }

    public static Fake2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static Fake2Binding inflate(LayoutInflater layoutInflater, Object obj) {
        return (Fake2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fake_2, (ViewGroup) null, false, obj);
    }

    public static Fake2Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static Fake2Binding bind(View view, Object obj) {
        return (Fake2Binding) bind(obj, view, R.layout.fake_2);
    }
}
