package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemProfileEditableBinding */
public abstract class ItemProfileEditableBinding extends ViewDataBinding {
    public final ImageView arrow;
    @Bindable
    protected Boolean mArrow;
    @Bindable
    protected String mHint;
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    public final TextView title;
    public final EditText value;
    public final View view4;

    public abstract void setArrow(Boolean bool);

    public abstract void setHint(String str);

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    protected ItemProfileEditableBinding(Object obj, View view, int i, ImageView imageView, TextView textView, EditText editText, View view2) {
        super(obj, view, i);
        this.arrow = imageView;
        this.title = textView;
        this.value = editText;
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

    public String getHint() {
        return this.mHint;
    }

    public static ItemProfileEditableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileEditableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemProfileEditableBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_profile_editable, viewGroup, z, obj);
    }

    public static ItemProfileEditableBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileEditableBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemProfileEditableBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_profile_editable, (ViewGroup) null, false, obj);
    }

    public static ItemProfileEditableBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileEditableBinding bind(View view, Object obj) {
        return (ItemProfileEditableBinding) bind(obj, view, R.layout.item_profile_editable);
    }
}
