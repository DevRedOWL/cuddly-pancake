package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragmentKt;

/* renamed from: ru.unicorn.databinding.ItemPassCompanyBindingImpl */
public class ItemPassCompanyBindingImpl extends ItemPassCompanyBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private InverseBindingListener etTitleTicketandroidTextAttrChanged;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public ItemPassCompanyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    private ItemPassCompanyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[2], objArr[1]);
        this.etTitleTicketandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String textString = TextViewBindingAdapter.getTextString(ItemPassCompanyBindingImpl.this.etTitleTicket);
                String str = ItemPassCompanyBindingImpl.this.mValue;
                ItemPassCompanyBindingImpl itemPassCompanyBindingImpl = ItemPassCompanyBindingImpl.this;
                if (itemPassCompanyBindingImpl != null) {
                    itemPassCompanyBindingImpl.setValue(textString);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.etTitleTicket.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.tilTitle.setTag((Object) null);
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
        } else if (12 == i) {
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

    public void setIsRequired(Boolean bool) {
        this.mIsRequired = bool;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(16);
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
    }

    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    public void setHint(String str) {
        this.mHint = str;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        Boolean bool = this.mIsRequired;
        String str = this.mValue;
        boolean z = false;
        String str2 = this.mTitle;
        int i = ((33 & j) > 0 ? 1 : ((33 & j) == 0 ? 0 : -1));
        if (i != 0) {
            z = ViewDataBinding.safeUnbox(bool);
        }
        int i2 = ((40 & j) > 0 ? 1 : ((40 & j) == 0 ? 0 : -1));
        if ((34 & j) != 0) {
            TextViewBindingAdapter.setText(this.etTitleTicket, str);
        }
        if ((j & 32) != 0) {
            TextViewBindingAdapter.setTextWatcher(this.etTitleTicket, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.etTitleTicketandroidTextAttrChanged);
        }
        if (i2 != 0) {
            this.tilTitle.setHint((CharSequence) str2);
        }
        if (i != 0) {
            AnotherPassNewFragmentKt.format(this.tilTitle, z);
        }
    }
}
