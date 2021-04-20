package p035ru.unicorn.databinding;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemPassIdTitleWithImageBinding */
public abstract class ItemPassIdTitleWithImageBinding extends ViewDataBinding {

    /* renamed from: iv */
    public final ImageView f6601iv;
    @Bindable
    protected String mLabel;
    @Bindable
    protected Drawable mRes;

    /* renamed from: tv */
    public final TextView f6602tv;

    public abstract void setLabel(String str);

    public abstract void setRes(Drawable drawable);

    protected ItemPassIdTitleWithImageBinding(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.f6601iv = imageView;
        this.f6602tv = textView;
    }

    public String getLabel() {
        return this.mLabel;
    }

    public Drawable getRes() {
        return this.mRes;
    }

    public static ItemPassIdTitleWithImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassIdTitleWithImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemPassIdTitleWithImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_id_title_with_image, viewGroup, z, obj);
    }

    public static ItemPassIdTitleWithImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassIdTitleWithImageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemPassIdTitleWithImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_pass_id_title_with_image, (ViewGroup) null, false, obj);
    }

    public static ItemPassIdTitleWithImageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemPassIdTitleWithImageBinding bind(View view, Object obj) {
        return (ItemPassIdTitleWithImageBinding) bind(obj, view, R.layout.item_pass_id_title_with_image);
    }
}
