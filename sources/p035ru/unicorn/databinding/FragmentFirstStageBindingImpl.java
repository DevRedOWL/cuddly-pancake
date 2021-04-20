package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;

/* renamed from: ru.unicorn.databinding.FragmentFirstStageBindingImpl */
public class FragmentFirstStageBindingImpl extends FragmentFirstStageBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        sViewsWithIds.put(R.id.tv_stage, 2);
        sViewsWithIds.put(R.id.tv_label_fio, 3);
        sViewsWithIds.put(R.id.changeBtn, 4);
        sViewsWithIds.put(R.id.nextBtn, 5);
    }

    public FragmentFirstStageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    private FragmentFirstStageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, objArr[4], objArr[5], objArr[1], objArr[3], objArr[2]);
        this.mDirtyFlags = -1;
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.f6567rv.setTag((Object) null);
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
        if (31 == i) {
            setName((String) obj);
        } else if (26 != i) {
            return false;
        } else {
            setVm((RecordsViewModel) obj);
        }
        return true;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setVm(RecordsViewModel recordsViewModel) {
        this.mVm = recordsViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeVmPatronimic((ObservableField) obj, i2);
        }
        if (i == 1) {
            return onChangeVmSurname((ObservableField) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return onChangeVmName((ObservableField) obj, i2);
    }

    private boolean onChangeVmPatronimic(ObservableField<String> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmSurname(ObservableField<String> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVmName(ObservableField<String> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        ObservableField<String> observableField;
        ObservableField<String> observableField2;
        ObservableField<String> observableField3;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        RecordsViewModel recordsViewModel = this.mVm;
        String str = null;
        int i = ((j & 55) > 0 ? 1 : ((j & 55) == 0 ? 0 : -1));
        if (i != 0) {
            if (recordsViewModel != null) {
                observableField3 = recordsViewModel.getPatronimic();
                observableField2 = recordsViewModel.getSurname();
                observableField = recordsViewModel.getName();
            } else {
                observableField3 = null;
                observableField2 = null;
                observableField = null;
            }
            updateRegistration(0, (Observable) observableField3);
            updateRegistration(1, (Observable) observableField2);
            updateRegistration(2, (Observable) observableField);
            String str2 = observableField3 != null ? observableField3.get() : null;
            String str3 = observableField2 != null ? observableField2.get() : null;
            if (observableField != null) {
                str = observableField.get();
            }
            str = (((str3 + ' ') + str) + ' ') + str2;
        }
        if (i != 0) {
            TextViewBindingAdapter.setText(this.f6567rv, str);
        }
    }
}
