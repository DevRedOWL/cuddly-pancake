package p035ru.unicorn.databinding;

import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemPassEditableBindingImpl */
public class ItemPassEditableBindingImpl extends ItemPassEditableBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private InverseBindingListener etTitleTicketandroidTextAttrChanged;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        sViewsWithIds.put(R.id.view4, 3);
    }

    public ItemPassEditableBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, sIncludes, sViewsWithIds));
    }

    private ItemPassEditableBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[2], objArr[1], objArr[3]);
        this.etTitleTicketandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String textString = TextViewBindingAdapter.getTextString(ItemPassEditableBindingImpl.this.etTitleTicket);
                String str = ItemPassEditableBindingImpl.this.mValue;
                ItemPassEditableBindingImpl itemPassEditableBindingImpl = ItemPassEditableBindingImpl.this;
                if (itemPassEditableBindingImpl != null) {
                    itemPassEditableBindingImpl.setValue(textString);
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
        String str;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        boolean z = false;
        String str2 = this.mValue;
        String str3 = this.mTitle;
        String str4 = this.mHint;
        int i = ((j & 17) > 0 ? 1 : ((j & 17) == 0 ? 0 : -1));
        if (i != 0) {
            z = TextUtils.isEmpty(str2);
            if (i != 0) {
                j |= z ? 64 : 32;
            }
            str = z ? this.tilTitle.getResources().getString(R.string.label_compulsory_field) : "";
        } else {
            str = null;
        }
        int i2 = ((20 & j) > 0 ? 1 : ((20 & j) == 0 ? 0 : -1));
        if ((24 & j) != 0) {
            this.etTitleTicket.setHint(str4);
        }
        if ((j & 17) != 0) {
            TextViewBindingAdapter.setText(this.etTitleTicket, str2);
            this.tilTitle.setError(str);
            this.tilTitle.setErrorEnabled(z);
        }
        if ((j & 16) != 0) {
            TextViewBindingAdapter.setTextWatcher(this.etTitleTicket, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.etTitleTicketandroidTextAttrChanged);
        }
        if (i2 != 0) {
            this.tilTitle.setHint((CharSequence) str3);
        }
    }
}
