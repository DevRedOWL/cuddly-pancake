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

/* renamed from: ru.unicorn.databinding.ItemLabelUnderlineWithArrow2Binding */
public abstract class ItemLabelUnderlineWithArrow2Binding extends ViewDataBinding {
    public final ImageView arrow;
    @Bindable
    protected Integer mSize;
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    @Bindable
    protected Boolean mVisible;
    @Bindable
    protected Boolean mVisibleArrow;
    public final ConstraintLayout parent;
    public final TextView title;
    public final TextView underline;

    public abstract void setSize(Integer num);

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    public abstract void setVisible(Boolean bool);

    public abstract void setVisibleArrow(Boolean bool);

    protected ItemLabelUnderlineWithArrow2Binding(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.arrow = imageView;
        this.parent = constraintLayout;
        this.title = textView;
        this.underline = textView2;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getValue() {
        return this.mValue;
    }

    public Boolean getVisibleArrow() {
        return this.mVisibleArrow;
    }

    public Integer getSize() {
        return this.mSize;
    }

    public Boolean getVisible() {
        return this.mVisible;
    }

    public static ItemLabelUnderlineWithArrow2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLabelUnderlineWithArrow2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemLabelUnderlineWithArrow2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_label_underline_with_arrow_2, viewGroup, z, obj);
    }

    public static ItemLabelUnderlineWithArrow2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLabelUnderlineWithArrow2Binding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemLabelUnderlineWithArrow2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_label_underline_with_arrow_2, (ViewGroup) null, false, obj);
    }

    public static ItemLabelUnderlineWithArrow2Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLabelUnderlineWithArrow2Binding bind(View view, Object obj) {
        return (ItemLabelUnderlineWithArrow2Binding) bind(obj, view, R.layout.item_label_underline_with_arrow_2);
    }
}
