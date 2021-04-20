package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.generated.callback.OnClickListener;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.databinding.ItemProfileChooserBindingImpl */
public class ItemProfileChooserBindingImpl extends ItemProfileChooserBinding implements OnClickListener.Listener {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private final View.OnClickListener mCallback12;
    private final View.OnClickListener mCallback13;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public ItemProfileChooserBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, sIncludes, sViewsWithIds));
    }

    private ItemProfileChooserBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[1]);
        this.mDirtyFlags = -1;
        this.f6603cb.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        setRootTag(view);
        this.mCallback12 = new OnClickListener(this, 1);
        this.mCallback13 = new OnClickListener(this, 2);
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
            setVm((ProfileSelectionVM) obj);
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

    public void setVm(ProfileSelectionVM profileSelectionVM) {
        this.mVm = profileSelectionVM;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(26);
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
        int i;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        ProfileSelectionVM profileSelectionVM = this.mVm;
        String str = this.mTitle;
        Integer num = this.mPosition;
        Integer num2 = this.mSelected;
        boolean z = false;
        int i2 = ((j & 28) > 0 ? 1 : ((j & 28) == 0 ? 0 : -1));
        if (i2 != 0) {
            if (num == num2) {
                z = true;
            }
            if (i2 != 0) {
                j |= z ? 64 : 32;
            }
            i = getColorFromResource(this.f6603cb, z ? R.color.brandTextAsBrandMain : R.color.textSecondary);
        } else {
            i = 0;
        }
        if ((j & 28) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.f6603cb, z);
            this.f6603cb.setTextColor(i);
        }
        if ((16 & j) != 0) {
            this.f6603cb.setOnClickListener(this.mCallback13);
            this.mboundView0.setOnClickListener(this.mCallback12);
        }
        if ((j & 18) != 0) {
            TextViewBindingAdapter.setText(this.f6603cb, str);
        }
    }

    public final void _internalCallbackOnClick(int i, View view) {
        boolean z = false;
        if (i == 1) {
            ProfileSelectionVM profileSelectionVM = this.mVm;
            Integer num = this.mPosition;
            if (profileSelectionVM != null) {
                z = true;
            }
            if (z) {
                profileSelectionVM.checkCurrent(num.intValue());
            }
        } else if (i == 2) {
            ProfileSelectionVM profileSelectionVM2 = this.mVm;
            Integer num2 = this.mPosition;
            if (profileSelectionVM2 != null) {
                z = true;
            }
            if (z) {
                profileSelectionVM2.checkCurrent(num2.intValue());
            }
        }
    }
}
