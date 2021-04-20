package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;

/* renamed from: ru.unicorn.databinding.ItemIdPassTitleSubtitleBindingImpl */
public class ItemIdPassTitleSubtitleBindingImpl extends ItemIdPassTitleSubtitleBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public ItemIdPassTitleSubtitleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    private ItemIdPassTitleSubtitleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[2], objArr[1]);
        this.mDirtyFlags = -1;
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.subtitle.setTag((Object) null);
        this.title.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4;
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
        if (5 == i) {
            setTitle((String) obj);
        } else if (27 != i) {
            return false;
        } else {
            setSubtitle((String) obj);
        }
        return true;
    }

    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    public void setSubtitle(String str) {
        this.mSubtitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(27);
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
        String str2 = this.mSubtitle;
        int i = ((5 & j) > 0 ? 1 : ((5 & j) == 0 ? 0 : -1));
        if ((j & 6) != 0) {
            TextViewBindingAdapter.setText(this.subtitle, str2);
        }
        if (i != 0) {
            TextViewBindingAdapter.setText(this.title, str);
        }
    }
}
