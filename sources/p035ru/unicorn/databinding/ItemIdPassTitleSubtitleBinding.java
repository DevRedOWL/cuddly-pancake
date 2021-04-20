package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemIdPassTitleSubtitleBinding */
public abstract class ItemIdPassTitleSubtitleBinding extends ViewDataBinding {
    @Bindable
    protected String mSubtitle;
    @Bindable
    protected String mTitle;
    public final TextView subtitle;
    public final TextView title;

    public abstract void setSubtitle(String str);

    public abstract void setTitle(String str);

    protected ItemIdPassTitleSubtitleBinding(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.subtitle = textView;
        this.title = textView2;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getSubtitle() {
        return this.mSubtitle;
    }

    public static ItemIdPassTitleSubtitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemIdPassTitleSubtitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemIdPassTitleSubtitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_id_pass_title_subtitle, viewGroup, z, obj);
    }

    public static ItemIdPassTitleSubtitleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemIdPassTitleSubtitleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemIdPassTitleSubtitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_id_pass_title_subtitle, (ViewGroup) null, false, obj);
    }

    public static ItemIdPassTitleSubtitleBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemIdPassTitleSubtitleBinding bind(View view, Object obj) {
        return (ItemIdPassTitleSubtitleBinding) bind(obj, view, R.layout.item_id_pass_title_subtitle);
    }
}
