package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;

/* renamed from: ru.unicorn.databinding.ItemAnotherPassData2Binding */
public abstract class ItemAnotherPassData2Binding extends ViewDataBinding {
    public final AppCompatImageView icon;
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
    public final ConstraintLayout parent;
    public final TextInputLayout title;
    public final TextInputEditText value;

    public abstract void setIsEnabled(Boolean bool);

    public abstract void setIsRequired(Boolean bool);

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    public abstract void setVm(AnotherPassViewModel anotherPassViewModel);

    protected ItemAnotherPassData2Binding(Object obj, View view, int i, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextInputEditText textInputEditText) {
        super(obj, view, i);
        this.icon = appCompatImageView;
        this.parent = constraintLayout;
        this.title = textInputLayout;
        this.value = textInputEditText;
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

    public Boolean getIsEnabled() {
        return this.mIsEnabled;
    }

    public AnotherPassViewModel getVm() {
        return this.mVm;
    }

    public static ItemAnotherPassData2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAnotherPassData2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemAnotherPassData2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_another_pass_data_2, viewGroup, z, obj);
    }

    public static ItemAnotherPassData2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAnotherPassData2Binding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemAnotherPassData2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_another_pass_data_2, (ViewGroup) null, false, obj);
    }

    public static ItemAnotherPassData2Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAnotherPassData2Binding bind(View view, Object obj) {
        return (ItemAnotherPassData2Binding) bind(obj, view, R.layout.item_another_pass_data_2);
    }
}
