package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragmentKt;

/* renamed from: ru.unicorn.databinding.ItemAnotherPassDataWithHintBindingImpl */
public class ItemAnotherPassDataWithHintBindingImpl extends ItemAnotherPassDataWithHintBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private InverseBindingListener valueandroidTextAttrChanged;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        sViewsWithIds.put(R.id.hint, 3);
    }

    public ItemAnotherPassDataWithHintBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, sIncludes, sViewsWithIds));
    }

    private ItemAnotherPassDataWithHintBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[3], objArr[1], objArr[2]);
        this.valueandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String textString = TextViewBindingAdapter.getTextString(ItemAnotherPassDataWithHintBindingImpl.this.value);
                String str = ItemAnotherPassDataWithHintBindingImpl.this.mValue;
                ItemAnotherPassDataWithHintBindingImpl itemAnotherPassDataWithHintBindingImpl = ItemAnotherPassDataWithHintBindingImpl.this;
                if (itemAnotherPassDataWithHintBindingImpl != null) {
                    itemAnotherPassDataWithHintBindingImpl.setValue(textString);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.title.setTag((Object) null);
        this.value.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 128;
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

    public void setHint(String str) {
        this.mHint = str;
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
        if ((j & 129) != 0) {
            z = ViewDataBinding.safeUnbox(bool);
        } else {
            z = false;
        }
        int i2 = ((j & 130) > 0 ? 1 : ((j & 130) == 0 ? 0 : -1));
        if (i2 != 0) {
            z2 = num == null;
            if (i2 != 0) {
                j |= z2 ? 512 : 256;
            }
        } else {
            z2 = false;
        }
        int i3 = ((j & 132) > 0 ? 1 : ((j & 132) == 0 ? 0 : -1));
        int i4 = ((j & 136) > 0 ? 1 : ((j & 136) == 0 ? 0 : -1));
        boolean safeUnbox = i4 != 0 ? ViewDataBinding.safeUnbox(bool2) : false;
        int i5 = ((j & 160) > 0 ? 1 : ((j & 160) == 0 ? 0 : -1));
        int i6 = ((130 & j) > 0 ? 1 : ((130 & j) == 0 ? 0 : -1));
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
        if ((j & 129) != 0) {
            AnotherPassNewFragmentKt.format(this.title, z);
        }
        if (i6 != 0 && getBuildSdkInt() >= 3) {
            this.value.setInputType(i);
        }
        if (i3 != 0) {
            TextViewBindingAdapter.setText(this.value, str);
        }
        if ((j & 128) != 0) {
            TextViewBindingAdapter.setTextWatcher(this.value, (TextViewBindingAdapter.BeforeTextChanged) null, (TextViewBindingAdapter.OnTextChanged) null, (TextViewBindingAdapter.AfterTextChanged) null, this.valueandroidTextAttrChanged);
        }
    }
}
