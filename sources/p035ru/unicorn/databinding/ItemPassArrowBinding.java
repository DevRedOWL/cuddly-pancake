package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemPassArrowBinding */
public abstract class ItemPassArrowBinding extends ViewDataBinding {
    public final ImageView arrow;

    /* renamed from: cl */
    public final ConstraintLayout f6597cl;
    @Bindable
    protected Boolean mArrow;
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    public final TextView title;
    public final TextView value;
    public final View view4;

    public abstract void setArrow(Boolean bool);

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    protected ItemPassArrowBinding(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, View view2) {
        super(obj, view, i);
        this.arrow = imageView;
        this.f6597cl = constraintLayout;
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

    public Boolean getArrow() {
        return this.mArrow;
    }

    public static ItemPassArrowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassArrowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemPassArrowBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_arrow, viewGroup, z, obj);
    }

    public static ItemPassArrowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassArrowBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemPassArrowBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_arrow, (ViewGroup) null, false, obj);
    }

    public static ItemPassArrowBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassArrowBinding bind(View view, Object obj) {
        return (ItemPassArrowBinding) bind(obj, view, R.layout.item_pass_arrow);
    }
}
