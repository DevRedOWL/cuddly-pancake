package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemAnotherTitleBinding */
public abstract class ItemAnotherTitleBinding extends ViewDataBinding {
    @Bindable
    protected String mTitle;
    public final LinearLayout parent;

    public abstract void setTitle(String str);

    protected ItemAnotherTitleBinding(Object obj, View view, int i, LinearLayout linearLayout) {
        super(obj, view, i);
        this.parent = linearLayout;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public static ItemAnotherTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAnotherTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemAnotherTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_another_title, viewGroup, z, obj);
    }

    public static ItemAnotherTitleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAnotherTitleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemAnotherTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_another_title, (ViewGroup) null, false, obj);
    }

    public static ItemAnotherTitleBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAnotherTitleBinding bind(View view, Object obj) {
        return (ItemAnotherTitleBinding) bind(obj, view, R.layout.item_another_title);
    }
}
