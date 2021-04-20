package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemProfileEditableBindingImpl */
public class ItemProfileEditableBindingImpl extends ItemProfileEditableBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private InverseBindingListener valueandroidTextAttrChanged;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        sViewsWithIds.put(R.id.view4, 4);
    }

    public ItemProfileEditableBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private ItemProfileEditableBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[3], objArr[1], objArr[2], objArr[4]);
        this.valueandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String textString = TextViewBindingAdapter.getTextString(ItemProfileEditableBindingImpl.this.value);
                String str = ItemProfileEditableBindingImpl.this.mValue;
                ItemProfileEditableBindingImpl itemProfileEditableBindingImpl = ItemProfileEditableBindingImpl.this;
                if (itemProfileEditableBindingImpl != null) {
                    itemProfileEditableBindingImpl.setValue(textString);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.arrow.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.title.setTag((Object) null);
        this.value.setTag((Object) null);
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
        if (12 == i) {
            setValue((String) obj);
        } else if (4 == i) {
            setArrow((Boolean) obj);
        } else if (5 == i) {
            setTitle((String) obj);
        } else if (28 != i) {
            return false;
        } else {
            setHint((String) obj);
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

    public void setArrow(Boolean bool) {
        this.mArrow = bool;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    public void setHint(String str) {
        this.mHint = str;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(28);
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
        Boolean bool = this.mArrow;
        String str2 = this.mTitle;
        String str3 = this.mHint;
        int i = 0;
        int i2 = ((j & 18) > 0 ? 1 : ((j & 18) == 0 ? 0 : -1));
        if (i2 != 0) {
            boolean safeUnbox = ViewDataBinding.safeUnbox(bool);
            if (i2 != 0) {
                j |= safeUnbox ? 64 : 32;
            }
            if (!safeUnbox) {
                i = 4;
            }
        }
        int i3 = ((20 & j) > 0 ? 1 : ((20 & j) == 0 ? 0 : -1));
        int i4 = ((24 & j) > 0 ? 1 : ((24 & j) == 0 ? 0 : -1));
        if ((18 & j) != 0) {
            this.arrow.setVisibility(i);
        }
        if (i3 != 0) {
            TextViewBindingAdapter.setText(this.title, str2);
        }
        if (i4 != 0) {
            this.value.setHint(str3);
        }
        if ((17 & j) != 0) {
            TextViewBindingAdapter.setText(this.value, str);
        }
        if ((j & 16) != 0) {
            TextViewBindingAdapter.setTextWatcher(this.value, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.valueandroidTextAttrChanged);
        }
    }
}
