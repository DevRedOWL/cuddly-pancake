package p035ru.unicorn.databinding;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemImageBinding */
public abstract class ItemImageBinding extends ViewDataBinding {
    public final ImageView arrow;
    @Bindable
    protected Boolean mActive;
    @Bindable
    protected Integer mColor;
    @Bindable
    protected Drawable mResourc;
    @Bindable
    protected Boolean mVisible;

    public abstract void setActive(Boolean bool);

    public abstract void setColor(Integer num);

    public abstract void setResourc(Drawable drawable);

    public abstract void setVisible(Boolean bool);

    protected ItemImageBinding(Object obj, View view, int i, ImageView imageView) {
        super(obj, view, i);
        this.arrow = imageView;
    }

    public Integer getColor() {
        return this.mColor;
    }

    public Drawable getResourc() {
        return this.mResourc;
    }

    public Boolean getVisible() {
        return this.mVisible;
    }

    public Boolean getActive() {
        return this.mActive;
    }

    public static ItemImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_image, viewGroup, z, obj);
    }

    public static ItemImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemImageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_image, (ViewGroup) null, false, obj);
    }

    public static ItemImageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemImageBinding bind(View view, Object obj) {
        return (ItemImageBinding) bind(obj, view, R.layout.item_image);
    }
}
