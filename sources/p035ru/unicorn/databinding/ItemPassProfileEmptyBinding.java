package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemPassProfileEmptyBinding */
public abstract class ItemPassProfileEmptyBinding extends ViewDataBinding {
    public final View line;
    @Bindable
    protected String mTitle;
    public final TextView title;

    public abstract void setTitle(String str);

    protected ItemPassProfileEmptyBinding(Object obj, View view, int i, View view2, TextView textView) {
        super(obj, view, i);
        this.line = view2;
        this.title = textView;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public static ItemPassProfileEmptyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassProfileEmptyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemPassProfileEmptyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_profile_empty, viewGroup, z, obj);
    }

    public static ItemPassProfileEmptyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassProfileEmptyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemPassProfileEmptyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_profile_empty, (ViewGroup) null, false, obj);
    }

    public static ItemPassProfileEmptyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassProfileEmptyBinding bind(View view, Object obj) {
        return (ItemPassProfileEmptyBinding) bind(obj, view, R.layout.item_pass_profile_empty);
    }
}
