package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemProfileEditable2Binding */
public abstract class ItemProfileEditable2Binding extends ViewDataBinding {
    public final TextInputEditText etTitleTicket;
    @Bindable
    protected Boolean mArrow;
    @Bindable
    protected String mHint;
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    public final TextInputLayout tilTitle;
    public final View view4;

    public abstract void setArrow(Boolean bool);

    public abstract void setHint(String str);

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    protected ItemProfileEditable2Binding(Object obj, View view, int i, TextInputEditText textInputEditText, TextInputLayout textInputLayout, View view2) {
        super(obj, view, i);
        this.etTitleTicket = textInputEditText;
        this.tilTitle = textInputLayout;
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

    public static ItemProfileEditable2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileEditable2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemProfileEditable2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_profile_editable2, viewGroup, z, obj);
    }

    public static ItemProfileEditable2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileEditable2Binding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemProfileEditable2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_profile_editable2, (ViewGroup) null, false, obj);
    }

    public static ItemProfileEditable2Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemProfileEditable2Binding bind(View view, Object obj) {
        return (ItemProfileEditable2Binding) bind(obj, view, R.layout.item_profile_editable2);
    }
}
