package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemLabelValueBindingImpl */
public class ItemLabelValueBindingImpl extends ItemLabelValueBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        sViewsWithIds.put(R.id.underline, 3);
    }

    public ItemLabelValueBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, sIncludes, sViewsWithIds));
    }

    private ItemLabelValueBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[0], objArr[1], objArr[3], objArr[2]);
        this.mDirtyFlags = -1;
        this.parent.setTag((Object) null);
        this.title.setTag((Object) null);
        this.value.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 8;
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
        if (6 == i) {
            setResult((String) obj);
        } else if (2 == i) {
            setVisibleArrow((Boolean) obj);
        } else if (5 != i) {
            return false;
        } else {
            setTitle((String) obj);
        }
        return true;
    }

    public void setResult(String str) {
        this.mResult = str;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(6);
        super.requestRebind();
    }

    public void setVisibleArrow(Boolean bool) {
        this.mVisibleArrow = bool;
    }

    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        String str = this.mResult;
        String str2 = this.mTitle;
        int i = ((9 & j) > 0 ? 1 : ((9 & j) == 0 ? 0 : -1));
        if ((j & 12) != 0) {
            TextViewBindingAdapter.setText(this.title, str2);
        }
        if (i != 0) {
            TextViewBindingAdapter.setText(this.value, str);
        }
    }
}
