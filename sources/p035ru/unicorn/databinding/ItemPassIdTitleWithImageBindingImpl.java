package p035ru.unicorn.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.unicorn.ujin.view.binding.BindingUtilKt;

/* renamed from: ru.unicorn.databinding.ItemPassIdTitleWithImageBindingImpl */
public class ItemPassIdTitleWithImageBindingImpl extends ItemPassIdTitleWithImageBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public ItemPassIdTitleWithImageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    private ItemPassIdTitleWithImageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[2], objArr[1]);
        this.mDirtyFlags = -1;
        this.f6601iv.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.f6602tv.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean setVariable(int i, Object obj) {
        if (23 == i) {
            setLabel((String) obj);
        } else if (17 != i) {
            return false;
        } else {
            setRes((Drawable) obj);
        }
        return true;
    }

    public void setLabel(String str) {
        this.mLabel = str;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(23);
        super.requestRebind();
    }

    public void setRes(Drawable drawable) {
        this.mRes = drawable;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(17);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        String str = this.mLabel;
        Drawable drawable = this.mRes;
        int i = ((5 & j) > 0 ? 1 : ((5 & j) == 0 ? 0 : -1));
        if ((j & 6) != 0) {
            BindingUtilKt.drawable(this.f6601iv, drawable);
        }
        if (i != 0) {
            TextViewBindingAdapter.setText(this.f6602tv, str);
        }
    }
}
