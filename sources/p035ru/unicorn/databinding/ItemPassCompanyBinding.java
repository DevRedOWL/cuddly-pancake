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

/* renamed from: ru.unicorn.databinding.ItemPassCompanyBinding */
public abstract class ItemPassCompanyBinding extends ViewDataBinding {
    public final TextInputEditText etTitleTicket;
    @Bindable
    protected Boolean mArrow;
    @Bindable
    protected String mHint;
    @Bindable
    protected Boolean mIsRequired;
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    public final TextInputLayout tilTitle;

    public abstract void setArrow(Boolean bool);

    public abstract void setHint(String str);

    public abstract void setIsRequired(Boolean bool);

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    protected ItemPassCompanyBinding(Object obj, View view, int i, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.etTitleTicket = textInputEditText;
        this.tilTitle = textInputLayout;
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

    public Boolean getIsRequired() {
        return this.mIsRequired;
    }

    public static ItemPassCompanyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassCompanyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemPassCompanyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_company, viewGroup, z, obj);
    }

    public static ItemPassCompanyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassCompanyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemPassCompanyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_company, (ViewGroup) null, false, obj);
    }

    public static ItemPassCompanyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassCompanyBinding bind(View view, Object obj) {
        return (ItemPassCompanyBinding) bind(obj, view, R.layout.item_pass_company);
    }
}
