package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragmentKt;

/* renamed from: ru.unicorn.databinding.ItemFieldSpinnerBindingImpl */
public class ItemFieldSpinnerBindingImpl extends ItemFieldSpinnerBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        sViewsWithIds.put(R.id.spinner, 2);
    }

    public ItemFieldSpinnerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    private ItemFieldSpinnerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[2], objArr[1]);
        this.mDirtyFlags = -1;
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.titleTextView.setTag((Object) null);
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
        if (16 == i) {
            setIsRequired((Boolean) obj);
        } else if (5 == i) {
            setTitle((String) obj);
        } else if (12 != i) {
            return false;
        } else {
            setValue((String) obj);
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

    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    public void setValue(String str) {
        this.mValue = str;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        Boolean bool = this.mIsRequired;
        boolean z = false;
        String str = this.mTitle;
        int i = ((9 & j) > 0 ? 1 : ((9 & j) == 0 ? 0 : -1));
        if (i != 0) {
            z = ViewDataBinding.safeUnbox(bool);
        }
        if ((j & 10) != 0) {
            this.titleTextView.setText(str);
        }
        if (i != 0) {
            AnotherPassNewFragmentKt.format(this.titleTextView, z);
        }
    }
}
