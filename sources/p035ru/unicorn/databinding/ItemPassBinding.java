package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemPassBinding */
public abstract class ItemPassBinding extends ViewDataBinding {
    public final ImageView arrow;
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    public final TextView title;
    public final TextView value;
    public final View view4;

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    protected ItemPassBinding(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, View view2) {
        super(obj, view, i);
        this.arrow = imageView;
        this.title = textView;
        this.value = textView2;
        this.view4 = view2;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getValue() {
        return this.mValue;
    }

    public static ItemPassBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemPassBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass, viewGroup, z, obj);
    }

    public static ItemPassBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemPassBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass, (ViewGroup) null, false, obj);
    }

    public static ItemPassBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassBinding bind(View view, Object obj) {
        return (ItemPassBinding) bind(obj, view, R.layout.item_pass);
    }
}
