package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.FragmentNewSubaccountBindingImpl */
public class FragmentNewSubaccountBindingImpl extends FragmentNewSubaccountBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(12);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        sIncludes.setIncludes(0, new String[]{"item_field_spinner"}, new int[]{1}, new int[]{R.layout.item_field_spinner});
        sViewsWithIds.put(R.id.tilNewPassword, 2);
        sViewsWithIds.put(R.id.etName, 3);
        sViewsWithIds.put(R.id.tilPhone, 4);
        sViewsWithIds.put(R.id.etPhone, 5);
        sViewsWithIds.put(R.id.tilComment, 6);
        sViewsWithIds.put(R.id.etComment, 7);
        sViewsWithIds.put(R.id.tvAccessRightsHint, 8);
        sViewsWithIds.put(R.id.tlAccessRights, 9);
        sViewsWithIds.put(R.id.btnNewSubAccount, 10);
        sViewsWithIds.put(R.id.pbLoading, 11);
    }

    public FragmentNewSubaccountBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentNewSubaccountBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, objArr[10], objArr[7], objArr[3], objArr[5], objArr[11], objArr[1], objArr[6], objArr[2], objArr[4], objArr[9], objArr[8]);
        this.mDirtyFlags = -1;
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2;
        }
        this.status.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.status.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasPendingBindings() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.mDirtyFlags     // Catch:{ all -> 0x0018 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            ru.unicorn.databinding.ItemFieldSpinnerBinding r0 = r6.status
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentNewSubaccountBindingImpl.hasPendingBindings():boolean");
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.status.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onChangeStatus((ItemFieldSpinnerBinding) obj, i2);
    }

    private boolean onChangeStatus(ItemFieldSpinnerBinding itemFieldSpinnerBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        if ((j & 2) != 0) {
            this.status.setIsRequired(false);
        }
        executeBindingsOn(this.status);
    }
}
