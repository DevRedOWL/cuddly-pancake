package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemPassCompanyInfoBinding */
public abstract class ItemPassCompanyInfoBinding extends ViewDataBinding {
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    public final TextView title;
    public final TextView value;
    public final View view4;

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    protected ItemPassCompanyInfoBinding(Object obj, View view, int i, TextView textView, TextView textView2, View view2) {
        super(obj, view, i);
        this.title = textView;
        this.value = textView2;
        this.view4 = view2;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getValue() {
        return this.mValue;
    }

    public static ItemPassCompanyInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassCompanyInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemPassCompanyInfoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_company_info, viewGroup, z, obj);
    }

    public static ItemPassCompanyInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassCompanyInfoBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemPassCompanyInfoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_company_info, (ViewGroup) null, false, obj);
    }

    public static ItemPassCompanyInfoBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassCompanyInfoBinding bind(View view, Object obj) {
        return (ItemPassCompanyInfoBinding) bind(obj, view, R.layout.item_pass_company_info);
    }
}
