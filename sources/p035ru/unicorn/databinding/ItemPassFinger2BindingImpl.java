package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;

/* renamed from: ru.unicorn.databinding.ItemPassFinger2BindingImpl */
public class ItemPassFinger2BindingImpl extends ItemPassFinger2Binding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        sViewsWithIds.put(R.id.iv, 1);
        sViewsWithIds.put(R.id.label, 2);
        sViewsWithIds.put(R.id.arrow, 3);
        sViewsWithIds.put(R.id.underline, 4);
    }

    public ItemPassFinger2BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private ItemPassFinger2BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[3], objArr[1], objArr[2], objArr[4]);
        this.mDirtyFlags = -1;
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
    }

    public void setPosition(Integer num) {
        this.mPosition = num;
    }

    public void setSelected(Integer num) {
        this.mSelected = num;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        synchronized (this) {
            long j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
    }
}
