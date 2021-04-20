package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;

/* renamed from: ru.unicorn.databinding.ItemPassFingerBindingImpl */
public class ItemPassFingerBindingImpl extends ItemPassFingerBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public ItemPassFingerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, sIncludes, sViewsWithIds));
    }

    private ItemPassFingerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[1]);
        this.mDirtyFlags = -1;
        this.f6600cb.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 16;
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
        if (26 == i) {
            setVm((PassProfileVM) obj);
        } else if (5 == i) {
            setTitle((String) obj);
        } else if (32 == i) {
            setPosition((Integer) obj);
        } else if (13 != i) {
            return false;
        } else {
            setSelected((Integer) obj);
        }
        return true;
    }

    public void setVm(PassProfileVM passProfileVM) {
        this.mVm = passProfileVM;
    }

    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    public void setPosition(Integer num) {
        this.mPosition = num;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(32);
        super.requestRebind();
    }

    public void setSelected(Integer num) {
        this.mSelected = num;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(13);
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
        Integer num = this.mPosition;
        Integer num2 = this.mSelected;
        int i = ((18 & j) > 0 ? 1 : ((18 & j) == 0 ? 0 : -1));
        boolean z = false;
        int i2 = ((j & 28) > 0 ? 1 : ((j & 28) == 0 ? 0 : -1));
        if (i2 != 0 && num == num2) {
            z = true;
        }
        if (i2 != 0) {
            CompoundButtonBindingAdapter.setChecked(this.f6600cb, z);
        }
        if (i != 0) {
            TextViewBindingAdapter.setText(this.f6600cb, str);
        }
    }
}
