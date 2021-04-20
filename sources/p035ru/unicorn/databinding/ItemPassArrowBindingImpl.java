package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemPassArrowBindingImpl */
public class ItemPassArrowBindingImpl extends ItemPassArrowBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        sViewsWithIds.put(R.id.view4, 4);
    }

    public ItemPassArrowBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private ItemPassArrowBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[3], objArr[0], objArr[1], objArr[2], objArr[4]);
        this.mDirtyFlags = -1;
        this.arrow.setTag((Object) null);
        this.f6597cl.setTag((Object) null);
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
        if (5 == i) {
            setTitle((String) obj);
        } else if (12 == i) {
            setValue((String) obj);
        } else if (4 != i) {
            return false;
        } else {
            setArrow((Boolean) obj);
        }
        return true;
    }

    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    public void setValue(String str) {
        this.mValue = str;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(12);
        super.requestRebind();
    }

    public void setArrow(Boolean bool) {
        this.mArrow = bool;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        String str = this.mTitle;
        String str2 = this.mValue;
        Boolean bool = this.mArrow;
        int i = 0;
        int i2 = ((j & 12) > 0 ? 1 : ((j & 12) == 0 ? 0 : -1));
        if (i2 != 0) {
            boolean safeUnbox = ViewDataBinding.safeUnbox(bool);
            if (i2 != 0) {
                j |= safeUnbox ? 32 : 16;
            }
            if (!safeUnbox) {
                i = 4;
            }
        }
        if ((j & 12) != 0) {
            this.arrow.setVisibility(i);
        }
        if ((9 & j) != 0) {
            TextViewBindingAdapter.setText(this.title, str);
        }
        if ((j & 10) != 0) {
            TextViewBindingAdapter.setText(this.value, str2);
        }
    }
}
