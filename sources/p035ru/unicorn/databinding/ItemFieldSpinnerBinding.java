package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemFieldSpinnerBinding */
public abstract class ItemFieldSpinnerBinding extends ViewDataBinding {
    @Bindable
    protected Boolean mIsRequired;
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    public final Spinner spinner;
    public final TextView titleTextView;

    public abstract void setIsRequired(Boolean bool);

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    protected ItemFieldSpinnerBinding(Object obj, View view, int i, Spinner spinner2, TextView textView) {
        super(obj, view, i);
        this.spinner = spinner2;
        this.titleTextView = textView;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getValue() {
        return this.mValue;
    }

    public Boolean getIsRequired() {
        return this.mIsRequired;
    }

    public static ItemFieldSpinnerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemFieldSpinnerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemFieldSpinnerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_field_spinner, viewGroup, z, obj);
    }

    public static ItemFieldSpinnerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemFieldSpinnerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemFieldSpinnerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_field_spinner, (ViewGroup) null, false, obj);
    }

    public static ItemFieldSpinnerBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemFieldSpinnerBinding bind(View view, Object obj) {
        return (ItemFieldSpinnerBinding) bind(obj, view, R.layout.item_field_spinner);
    }
}
