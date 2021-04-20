package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemFinishStageBindingImpl */
public class ItemFinishStageBindingImpl extends ItemFinishStageBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        sViewsWithIds.put(R.id.underline, 4);
    }

    public ItemFinishStageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private ItemFinishStageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[3], objArr[0], objArr[2], objArr[1], objArr[4]);
        this.mDirtyFlags = -1;
        this.arrow.setTag((Object) null);
        this.parent.setTag((Object) null);
        this.subtitle.setTag((Object) null);
        this.title.setTag((Object) null);
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
        if (12 == i) {
            setValue((String) obj);
        } else if (5 == i) {
            setTitle((String) obj);
        } else if (30 != i) {
            return false;
        } else {
            setEditMode((Boolean) obj);
        }
        return true;
    }

    public void setValue(String str) {
        this.mValue = str;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(12);
        super.requestRebind();
    }

    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    public void setEditMode(Boolean bool) {
        this.mEditMode = bool;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(30);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        String str = this.mValue;
        String str2 = this.mTitle;
        Boolean bool = this.mEditMode;
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
            TextViewBindingAdapter.setText(this.subtitle, str);
        }
        if ((j & 10) != 0) {
            TextViewBindingAdapter.setText(this.title, str2);
        }
    }
}
