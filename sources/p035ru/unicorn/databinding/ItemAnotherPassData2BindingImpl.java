package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragmentKt;

/* renamed from: ru.unicorn.databinding.ItemAnotherPassData2BindingImpl */
public class ItemAnotherPassData2BindingImpl extends ItemAnotherPassData2Binding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        sViewsWithIds.put(R.id.value, 2);
        sViewsWithIds.put(R.id.icon, 3);
    }

    public ItemAnotherPassData2BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, sIncludes, sViewsWithIds));
    }

    private ItemAnotherPassData2BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[3], objArr[0], objArr[1], objArr[2]);
        this.mDirtyFlags = -1;
        this.parent.setTag((Object) null);
        this.title.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 32;
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
        if (16 == i) {
            setIsRequired((Boolean) obj);
        } else if (26 == i) {
            setVm((AnotherPassViewModel) obj);
        } else if (5 == i) {
            setTitle((String) obj);
        } else if (12 == i) {
            setValue((String) obj);
        } else if (29 != i) {
            return false;
        } else {
            setIsEnabled((Boolean) obj);
        }
        return true;
    }

    public void setIsRequired(Boolean bool) {
        this.mIsRequired = bool;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(16);
        super.requestRebind();
    }

    public void setVm(AnotherPassViewModel anotherPassViewModel) {
        this.mVm = anotherPassViewModel;
    }

    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    public void setValue(String str) {
        this.mValue = str;
    }

    public void setIsEnabled(Boolean bool) {
        this.mIsEnabled = bool;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(29);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        Boolean bool = this.mIsRequired;
        String str = this.mTitle;
        Boolean bool2 = this.mIsEnabled;
        boolean z = false;
        int i = ((33 & j) > 0 ? 1 : ((33 & j) == 0 ? 0 : -1));
        boolean safeUnbox = i != 0 ? ViewDataBinding.safeUnbox(bool) : false;
        int i2 = ((36 & j) > 0 ? 1 : ((36 & j) == 0 ? 0 : -1));
        int i3 = ((j & 48) > 0 ? 1 : ((j & 48) == 0 ? 0 : -1));
        if (i3 != 0) {
            z = ViewDataBinding.safeUnbox(bool2);
        }
        if (i3 != 0) {
            this.title.setEnabled(z);
        }
        if (i2 != 0) {
            this.title.setHint((CharSequence) str);
        }
        if (i != 0) {
            AnotherPassNewFragmentKt.format(this.title, safeUnbox);
        }
    }
}
