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

/* renamed from: ru.unicorn.databinding.ItemLabelUnderlineWithArrowBinding */
public abstract class ItemLabelUnderlineWithArrowBinding extends ViewDataBinding {
    public final ImageView arrow;
    @Bindable
    protected Integer mSize;
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    @Bindable
    protected Boolean mVisibleArrow;
    public final ConstraintLayout parent;
    public final TextView title;
    public final TextView underline;

    public abstract void setSize(Integer num);

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    public abstract void setVisibleArrow(Boolean bool);

    protected ItemLabelUnderlineWithArrowBinding(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
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

    public static ItemLabelUnderlineWithArrowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLabelUnderlineWithArrowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemLabelUnderlineWithArrowBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_label_underline_with_arrow, viewGroup, z, obj);
    }

    public static ItemLabelUnderlineWithArrowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLabelUnderlineWithArrowBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemLabelUnderlineWithArrowBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_label_underline_with_arrow, (ViewGroup) null, false, obj);
    }

    public static ItemLabelUnderlineWithArrowBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLabelUnderlineWithArrowBinding bind(View view, Object obj) {
        return (ItemLabelUnderlineWithArrowBinding) bind(obj, view, R.layout.item_label_underline_with_arrow);
    }
}
