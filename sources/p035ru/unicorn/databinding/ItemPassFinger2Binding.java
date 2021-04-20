package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;

/* renamed from: ru.unicorn.databinding.ItemPassFinger2Binding */
public abstract class ItemPassFinger2Binding extends ViewDataBinding {
    public final ImageView arrow;

    /* renamed from: iv */
    public final ImageView f6599iv;
    public final TextView label;
    @Bindable
    protected Integer mPosition;
    @Bindable
    protected Integer mSelected;
    @Bindable
    protected String mTitle;
    @Bindable
    protected PassProfileVM mVm;
    public final TextView underline;

    public abstract void setPosition(Integer num);

    public abstract void setSelected(Integer num);

    public abstract void setTitle(String str);

    public abstract void setVm(PassProfileVM passProfileVM);

    protected ItemPassFinger2Binding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.arrow = imageView;
        this.f6599iv = imageView2;
        this.label = textView;
        this.underline = textView2;
    }

    public PassProfileVM getVm() {
        return this.mVm;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public Integer getPosition() {
        return this.mPosition;
    }

    public Integer getSelected() {
        return this.mSelected;
    }

    public static ItemPassFinger2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassFinger2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemPassFinger2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_finger_2, viewGroup, z, obj);
    }

    public static ItemPassFinger2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassFinger2Binding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemPassFinger2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_finger_2, (ViewGroup) null, false, obj);
    }

    public static ItemPassFinger2Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassFinger2Binding bind(View view, Object obj) {
        return (ItemPassFinger2Binding) bind(obj, view, R.layout.item_pass_finger_2);
    }
}
