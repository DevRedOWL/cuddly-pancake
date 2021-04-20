package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* renamed from: ru.unicorn.databinding.ItemApplicationToCompanyBindingImpl */
public class ItemApplicationToCompanyBindingImpl extends ItemApplicationToCompanyBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private InverseBindingListener etValueandroidTextAttrChanged;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public ItemApplicationToCompanyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    private ItemApplicationToCompanyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[2], objArr[1]);
        this.etValueandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String textString = TextViewBindingAdapter.getTextString(ItemApplicationToCompanyBindingImpl.this.etValue);
                String str = ItemApplicationToCompanyBindingImpl.this.mValue;
                ItemApplicationToCompanyBindingImpl itemApplicationToCompanyBindingImpl = ItemApplicationToCompanyBindingImpl.this;
                if (itemApplicationToCompanyBindingImpl != null) {
                    itemApplicationToCompanyBindingImpl.setValue(textString);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.etValue.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.tilValue.setTag((Object) null);
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
        if (16 == i) {
            setIsRequired((Boolean) obj);
        } else if (5 == i) {
            setTitle((String) obj);
        } else if (12 == i) {
            setValue((String) obj);
        } else if (28 != i) {
            return false;
        } else {
            setHint((String) obj);
        }
        return true;
    }

    public void setIsRequired(Boolean bool) {
        this.mIsRequired = bool;
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
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(12);
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
        String str = this.mTitle;
        String str2 = this.mValue;
        String str3 = this.mHint;
        int i = ((18 & j) > 0 ? 1 : ((18 & j) == 0 ? 0 : -1));
        int i2 = ((20 & j) > 0 ? 1 : ((20 & j) == 0 ? 0 : -1));
        if ((24 & j) != 0) {
            this.etValue.setHint(str3);
        }
        if (i2 != 0) {
            TextViewBindingAdapter.setText(this.etValue, str2);
        }
        if ((j & 16) != 0) {
            TextViewBindingAdapter.setTextWatcher(this.etValue, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.etValueandroidTextAttrChanged);
        }
        if (i != 0) {
            this.tilValue.setHint((CharSequence) str);
        }
    }
}
