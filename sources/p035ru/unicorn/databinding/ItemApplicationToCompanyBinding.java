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

/* renamed from: ru.unicorn.databinding.ItemApplicationToCompanyBinding */
public abstract class ItemApplicationToCompanyBinding extends ViewDataBinding {
    public final TextInputEditText etValue;
    @Bindable
    protected String mHint;
    @Bindable
    protected Boolean mIsRequired;
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    public final TextInputLayout tilValue;

    public abstract void setHint(String str);

    public abstract void setIsRequired(Boolean bool);

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    protected ItemApplicationToCompanyBinding(Object obj, View view, int i, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.etValue = textInputEditText;
        this.tilValue = textInputLayout;
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

    public String getHint() {
        return this.mHint;
    }

    public static ItemApplicationToCompanyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemApplicationToCompanyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemApplicationToCompanyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_application_to_company, viewGroup, z, obj);
    }

    public static ItemApplicationToCompanyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemApplicationToCompanyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemApplicationToCompanyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_application_to_company, (ViewGroup) null, false, obj);
    }

    public static ItemApplicationToCompanyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemApplicationToCompanyBinding bind(View view, Object obj) {
        return (ItemApplicationToCompanyBinding) bind(obj, view, R.layout.item_application_to_company);
    }
}
