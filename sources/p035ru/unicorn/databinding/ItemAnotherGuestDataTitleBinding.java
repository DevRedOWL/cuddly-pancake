package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.ItemAnotherGuestDataTitleBinding */
public abstract class ItemAnotherGuestDataTitleBinding extends ViewDataBinding {
    public final DynamicBackgroundButton btnAction;
    @Bindable
    protected String mBtnTitle;
    @Bindable
    protected String mTitle;
    public final ConstraintLayout parent;
    public final TextView tvDataTitle;

    public abstract void setBtnTitle(String str);

    public abstract void setTitle(String str);

    protected ItemAnotherGuestDataTitleBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.btnAction = dynamicBackgroundButton;
        this.parent = constraintLayout;
        this.tvDataTitle = textView;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getBtnTitle() {
        return this.mBtnTitle;
    }

    public static ItemAnotherGuestDataTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAnotherGuestDataTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemAnotherGuestDataTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_another_guest_data_title, viewGroup, z, obj);
    }

    public static ItemAnotherGuestDataTitleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAnotherGuestDataTitleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemAnotherGuestDataTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_another_guest_data_title, (ViewGroup) null, false, obj);
    }

    public static ItemAnotherGuestDataTitleBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAnotherGuestDataTitleBinding bind(View view, Object obj) {
        return (ItemAnotherGuestDataTitleBinding) bind(obj, view, R.layout.item_another_guest_data_title);
    }
}
