package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;

/* renamed from: ru.unicorn.databinding.FragmentThirdStageBindingImpl */
public class FragmentThirdStageBindingImpl extends FragmentThirdStageBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        sViewsWithIds.put(R.id.sv, 1);
        sViewsWithIds.put(R.id.tv_stage, 2);
        sViewsWithIds.put(R.id.tv_label_fio, 3);
        sViewsWithIds.put(R.id.rv, 4);
        sViewsWithIds.put(R.id.rv2, 5);
        sViewsWithIds.put(R.id.pb, 6);
        sViewsWithIds.put(R.id.guideline, 7);
        sViewsWithIds.put(R.id.nextBtn, 8);
    }

    public FragmentThirdStageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentThirdStageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[7], objArr[8], objArr[6], objArr[4], objArr[5], objArr[1], objArr[3], objArr[2]);
        this.mDirtyFlags = -1;
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        View view2 = view;
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2;
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
        if (26 != i) {
            return false;
        }
        setVm((RecordsViewModel) obj);
        return true;
    }

    public void setVm(RecordsViewModel recordsViewModel) {
        this.mVm = recordsViewModel;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        synchronized (this) {
            long j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
    }
}
