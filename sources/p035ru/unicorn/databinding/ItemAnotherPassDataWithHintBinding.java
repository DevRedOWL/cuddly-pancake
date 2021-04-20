package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;

/* renamed from: ru.unicorn.databinding.ItemAnotherPassDataWithHintBinding */
public abstract class ItemAnotherPassDataWithHintBinding extends ViewDataBinding {
    public final EditText hint;
    @Bindable
    protected String mHint;
    @Bindable
    protected Integer mInputType;
    @Bindable
    protected Boolean mIsEnabled;
    @Bindable
    protected Boolean mIsRequired;
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    @Bindable
    protected AnotherPassViewModel mVm;
    public final TextInputLayout title;
    public final TextInputEditText value;

    public abstract void setHint(String str);

    public abstract void setInputType(Integer num);

    public abstract void setIsEnabled(Boolean bool);

    public abstract void setIsRequired(Boolean bool);

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    public abstract void setVm(AnotherPassViewModel anotherPassViewModel);

    protected ItemAnotherPassDataWithHintBinding(Object obj, View view, int i, EditText editText, TextInputLayout textInputLayout, TextInputEditText textInputEditText) {
        super(obj, view, i);
        this.hint = editText;
        this.title = textInputLayout;
        this.value = textInputEditText;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getHint() {
        return this.mHint;
    }

    public String getValue() {
        return this.mValue;
    }

    public AnotherPassViewModel getVm() {
        return this.mVm;
    }

    public Boolean getIsRequired() {
        return this.mIsRequired;
    }

    public Integer getInputType() {
        return this.mInputType;
    }

    public Boolean getIsEnabled() {
        return this.mIsEnabled;
    }

    public static ItemAnotherPassDataWithHintBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAnotherPassDataWithHintBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemAnotherPassDataWithHintBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_another_pass_data_with_hint, viewGroup, z, obj);
    }

    public static ItemAnotherPassDataWithHintBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAnotherPassDataWithHintBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemAnotherPassDataWithHintBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_another_pass_data_with_hint, (ViewGroup) null, false, obj);
    }

    public static ItemAnotherPassDataWithHintBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAnotherPassDataWithHintBinding bind(View view, Object obj) {
        return (ItemAnotherPassDataWithHintBinding) bind(obj, view, R.layout.item_another_pass_data_with_hint);
    }
}
