package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.FragmentGateBindingImpl */
public class FragmentGateBindingImpl extends FragmentGateBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        sViewsWithIds.put(R.id.constraintLayout3, 1);
        sViewsWithIds.put(R.id.cv, 2);
        sViewsWithIds.put(R.id.mjpegView, 3);
        sViewsWithIds.put(R.id.pb, 4);
        sViewsWithIds.put(R.id.title, 5);
        sViewsWithIds.put(R.id.open, 6);
        sViewsWithIds.put(R.id.close, 7);
        sViewsWithIds.put(R.id.underline, 8);
    }

    public FragmentGateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentGateBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[7], objArr[1], objArr[2], objArr[3], objArr[6], objArr[4], objArr[5], objArr[8]);
        this.mDirtyFlags = -1;
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        View view2 = view;
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1;
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

    /* access modifiers changed from: protected */
    public void executeBindings() {
        synchronized (this) {
            long j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
    }
}
