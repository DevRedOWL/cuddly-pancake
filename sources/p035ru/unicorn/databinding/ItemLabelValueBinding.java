package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemLabelValueBinding */
public abstract class ItemLabelValueBinding extends ViewDataBinding {
    @Bindable
    protected String mResult;
    @Bindable
    protected String mTitle;
    @Bindable
    protected Boolean mVisibleArrow;
    public final ConstraintLayout parent;
    public final TextView title;
    public final TextView underline;
    public final TextView value;

    public abstract void setResult(String str);

    public abstract void setTitle(String str);

    public abstract void setVisibleArrow(Boolean bool);

    protected ItemLabelValueBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.parent = constraintLayout;
        this.title = textView;
        this.underline = textView2;
        this.value = textView3;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getResult() {
        return this.mResult;
    }

    public Boolean getVisibleArrow() {
        return this.mVisibleArrow;
    }

    public static ItemLabelValueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLabelValueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemLabelValueBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_label_value, viewGroup, z, obj);
    }

    public static ItemLabelValueBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLabelValueBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemLabelValueBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_label_value, (ViewGroup) null, false, obj);
    }

    public static ItemLabelValueBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemLabelValueBinding bind(View view, Object obj) {
        return (ItemLabelValueBinding) bind(obj, view, R.layout.item_label_value);
    }
}
