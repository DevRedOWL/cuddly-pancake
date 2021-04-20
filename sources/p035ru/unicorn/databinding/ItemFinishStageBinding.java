package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemFinishStageBinding */
public abstract class ItemFinishStageBinding extends ViewDataBinding {
    public final ImageView arrow;
    @Bindable
    protected Boolean mEditMode;
    @Bindable
    protected String mTitle;
    @Bindable
    protected String mValue;
    public final ConstraintLayout parent;
    public final TextView subtitle;
    public final TextView title;
    public final TextView underline;

    public abstract void setEditMode(Boolean bool);

    public abstract void setTitle(String str);

    public abstract void setValue(String str);

    protected ItemFinishStageBinding(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.arrow = imageView;
        this.parent = constraintLayout;
        this.subtitle = textView;
        this.title = textView2;
        this.underline = textView3;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getValue() {
        return this.mValue;
    }

    public Boolean getEditMode() {
        return this.mEditMode;
    }

    public static ItemFinishStageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemFinishStageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemFinishStageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_finish_stage, viewGroup, z, obj);
    }

    public static ItemFinishStageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemFinishStageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemFinishStageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_finish_stage, (ViewGroup) null, false, obj);
    }

    public static ItemFinishStageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemFinishStageBinding bind(View view, Object obj) {
        return (ItemFinishStageBinding) bind(obj, view, R.layout.item_finish_stage);
    }
}
