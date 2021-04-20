package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;

/* renamed from: ru.unicorn.databinding.ItemIdPassItemsBinding */
public abstract class ItemIdPassItemsBinding extends ViewDataBinding {
    public final ItemImageBinding id1;
    public final ItemImageBinding id2;
    public final ItemImageBinding id3;
    public final ItemImageBinding id4;
    public final ItemImageBinding id5;
    @Bindable
    protected PassCompanyVM mVm;
    public final ProgressBar pbar;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected ItemIdPassItemsBinding(Object obj, View view, int i, ItemImageBinding itemImageBinding, ItemImageBinding itemImageBinding2, ItemImageBinding itemImageBinding3, ItemImageBinding itemImageBinding4, ItemImageBinding itemImageBinding5, ProgressBar progressBar) {
        super(obj, view, i);
        this.id1 = itemImageBinding;
        setContainedBinding(this.id1);
        this.id2 = itemImageBinding2;
        setContainedBinding(this.id2);
        this.id3 = itemImageBinding3;
        setContainedBinding(this.id3);
        this.id4 = itemImageBinding4;
        setContainedBinding(this.id4);
        this.id5 = itemImageBinding5;
        setContainedBinding(this.id5);
        this.pbar = progressBar;
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static ItemIdPassItemsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemIdPassItemsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemIdPassItemsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_id_pass_items, viewGroup, z, obj);
    }

    public static ItemIdPassItemsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemIdPassItemsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemIdPassItemsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_id_pass_items, (ViewGroup) null, false, obj);
    }

    public static ItemIdPassItemsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemIdPassItemsBinding bind(View view, Object obj) {
        return (ItemIdPassItemsBinding) bind(obj, view, R.layout.item_id_pass_items);
    }
}
