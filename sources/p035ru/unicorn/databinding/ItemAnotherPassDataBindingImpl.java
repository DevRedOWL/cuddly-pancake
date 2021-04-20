package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragmentKt;

/* renamed from: ru.unicorn.databinding.ItemAnotherPassDataBindingImpl */
public class ItemAnotherPassDataBindingImpl extends ItemAnotherPassDataBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private InverseBindingListener valueandroidTextAttrChanged;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public ItemAnotherPassDataBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, sIncludes, sViewsWithIds));
    }

    private ItemAnotherPassDataBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[0], objArr[1]);
        this.valueandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String textString = TextViewBindingAdapter.getTextString(ItemAnotherPassDataBindingImpl.this.value);
                String str = ItemAnotherPassDataBindingImpl.this.mValue;
                ItemAnotherPassDataBindingImpl itemAnotherPassDataBindingImpl = ItemAnotherPassDataBindingImpl.this;
                if (itemAnotherPassDataBindingImpl != null) {
                    itemAnotherPassDataBindingImpl.setValue(textString);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.title.setTag((Object) null);
        this.value.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 64;
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
        } else if (10 == i) {
            setInputType((Integer) obj);
        } else if (12 == i) {
            setValue((String) obj);
        } else if (29 == i) {
            setIsEnabled((Boolean) obj);
        } else if (26 == i) {
            setVm((AnotherPassViewModel) obj);
        } else if (5 != i) {
            return false;
        } else {
            setTitle((String) obj);
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

    public void setInputType(Integer num) {
        this.mInputType = num;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(10);
        super.requestRebind();
    }

    public void setValue(String str) {
        this.mValue = str;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(12);
        super.requestRebind();
    }

    public void setIsEnabled(Boolean bool) {
        this.mIsEnabled = bool;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(29);
        super.requestRebind();
    }

    public void setVm(AnotherPassViewModel anotherPassViewModel) {
        this.mVm = anotherPassViewModel;
    }

    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        Boolean bool = this.mIsRequired;
        Integer num = this.mInputType;
        String str = this.mValue;
        Boolean bool2 = this.mIsEnabled;
        String str2 = this.mTitle;
        int i = 0;
        if ((j & 65) != 0) {
            z = ViewDataBinding.safeUnbox(bool);
        } else {
            z = false;
        }
        int i2 = ((j & 66) > 0 ? 1 : ((j & 66) == 0 ? 0 : -1));
        if (i2 != 0) {
            z2 = num == null;
            if (i2 != 0) {
                j |= z2 ? 256 : 128;
            }
        } else {
            z2 = false;
        }
        int i3 = ((j & 68) > 0 ? 1 : ((j & 68) == 0 ? 0 : -1));
        int i4 = ((j & 72) > 0 ? 1 : ((j & 72) == 0 ? 0 : -1));
        boolean safeUnbox = i4 != 0 ? ViewDataBinding.safeUnbox(bool2) : false;
        int i5 = ((j & 96) > 0 ? 1 : ((j & 96) == 0 ? 0 : -1));
        int i6 = ((66 & j) > 0 ? 1 : ((66 & j) == 0 ? 0 : -1));
        if (i6 != 0) {
            if (z2) {
                i = 1;
            } else {
                i = num.intValue();
            }
        }
        if (i4 != 0) {
            this.title.setEnabled(safeUnbox);
            this.value.setEnabled(safeUnbox);
        }
        if (i5 != 0) {
            this.title.setHint((CharSequence) str2);
        }
        if ((j & 65) != 0) {
            AnotherPassNewFragmentKt.format(this.title, z);
        }
        if (i6 != 0 && getBuildSdkInt() >= 3) {
            this.value.setInputType(i);
        }
        if (i3 != 0) {
            TextViewBindingAdapter.setText(this.value, str);
        }
        if ((j & 64) != 0) {
            TextViewBindingAdapter.setTextWatcher(this.value, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.valueandroidTextAttrChanged);
        }
    }
}
