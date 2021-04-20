package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;

/* renamed from: ru.unicorn.databinding.FragmentFirstStageEditBindingImpl */
public class FragmentFirstStageEditBindingImpl extends FragmentFirstStageEditBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private InverseBindingListener editNameandroidTextAttrChanged;
    private InverseBindingListener editPatronimicandroidTextAttrChanged;
    private InverseBindingListener editSurnameandroidTextAttrChanged;
    private long mDirtyFlags;
    private final ScrollView mboundView0;

    static {
        sViewsWithIds.put(R.id.tv_stage, 4);
        sViewsWithIds.put(R.id.tv_label_fio, 5);
        sViewsWithIds.put(R.id.ll, 6);
        sViewsWithIds.put(R.id.tilSurname, 7);
        sViewsWithIds.put(R.id.tilName, 8);
        sViewsWithIds.put(R.id.tilPatronymic, 9);
        sViewsWithIds.put(R.id.nextBtn, 10);
        sViewsWithIds.put(R.id.guideline4, 11);
    }

    public FragmentFirstStageEditBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentFirstStageEditBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, objArr[2], objArr[3], objArr[1], objArr[11], objArr[6], objArr[10], objArr[8], objArr[9], objArr[7], objArr[5], objArr[4]);
        this.editNameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String textString = TextViewBindingAdapter.getTextString(FragmentFirstStageEditBindingImpl.this.editName);
                RecordsViewModel recordsViewModel = FragmentFirstStageEditBindingImpl.this.mVm;
                boolean z = true;
                if (recordsViewModel != null) {
                    ObservableField<String> name = recordsViewModel.getName();
                    if (name == null) {
                        z = false;
                    }
                    if (z) {
                        name.set(textString);
                    }
                }
            }
        };
        this.editPatronimicandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String textString = TextViewBindingAdapter.getTextString(FragmentFirstStageEditBindingImpl.this.editPatronimic);
                RecordsViewModel recordsViewModel = FragmentFirstStageEditBindingImpl.this.mVm;
                boolean z = true;
                if (recordsViewModel != null) {
                    ObservableField<String> patronimic = recordsViewModel.getPatronimic();
                    if (patronimic == null) {
                        z = false;
                    }
                    if (z) {
                        patronimic.set(textString);
                    }
                }
            }
        };
        this.editSurnameandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String textString = TextViewBindingAdapter.getTextString(FragmentFirstStageEditBindingImpl.this.editSurname);
                RecordsViewModel recordsViewModel = FragmentFirstStageEditBindingImpl.this.mVm;
                boolean z = true;
                if (recordsViewModel != null) {
                    ObservableField<String> surname = recordsViewModel.getSurname();
                    if (surname == null) {
                        z = false;
                    }
                    if (z) {
                        surname.set(textString);
                    }
                }
            }
        };
        this.mDirtyFlags = -1;
        this.editName.setTag((Object) null);
        this.editPatronimic.setTag((Object) null);
        this.editSurname.setTag((Object) null);
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
        if (26 != i) {
            return false;
        }
        setVm((RecordsViewModel) obj);
        return true;
    }

    public void setVm(RecordsViewModel recordsViewModel) {
        this.mVm = recordsViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 8;
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
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            long r2 = r1.mDirtyFlags     // Catch:{ all -> 0x00b5 }
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x00b5 }
            monitor-exit(r18)     // Catch:{ all -> 0x00b5 }
            ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel r0 = r1.mVm
            r6 = 31
            long r6 = r6 & r2
            r8 = 26
            r10 = 25
            r12 = 28
            r14 = 0
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x006f
            long r6 = r2 & r10
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0035
            if (r0 == 0) goto L_0x0027
            androidx.databinding.ObservableField r6 = r0.getPatronimic()
            goto L_0x0028
        L_0x0027:
            r6 = r14
        L_0x0028:
            r7 = 0
            r1.updateRegistration((int) r7, (androidx.databinding.Observable) r6)
            if (r6 == 0) goto L_0x0035
            java.lang.Object r6 = r6.get()
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0036
        L_0x0035:
            r6 = r14
        L_0x0036:
            long r15 = r2 & r8
            int r7 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0051
            if (r0 == 0) goto L_0x0043
            androidx.databinding.ObservableField r7 = r0.getSurname()
            goto L_0x0044
        L_0x0043:
            r7 = r14
        L_0x0044:
            r15 = 1
            r1.updateRegistration((int) r15, (androidx.databinding.Observable) r7)
            if (r7 == 0) goto L_0x0051
            java.lang.Object r7 = r7.get()
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0052
        L_0x0051:
            r7 = r14
        L_0x0052:
            long r15 = r2 & r12
            int r17 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x006d
            if (r0 == 0) goto L_0x005f
            androidx.databinding.ObservableField r0 = r0.getName()
            goto L_0x0060
        L_0x005f:
            r0 = r14
        L_0x0060:
            r15 = 2
            r1.updateRegistration((int) r15, (androidx.databinding.Observable) r0)
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0072
        L_0x006d:
            r0 = r14
            goto L_0x0072
        L_0x006f:
            r0 = r14
            r6 = r0
            r7 = r6
        L_0x0072:
            long r12 = r12 & r2
            int r15 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x007c
            com.google.android.material.textfield.TextInputEditText r12 = r1.editName
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r12, r0)
        L_0x007c:
            r12 = 16
            long r12 = r12 & r2
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a0
            com.google.android.material.textfield.TextInputEditText r0 = r1.editName
            r12 = r14
            androidx.databinding.adapters.TextViewBindingAdapter$BeforeTextChanged r12 = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) r12
            r13 = r14
            androidx.databinding.adapters.TextViewBindingAdapter$OnTextChanged r13 = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) r13
            androidx.databinding.adapters.TextViewBindingAdapter$AfterTextChanged r14 = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) r14
            androidx.databinding.InverseBindingListener r15 = r1.editNameandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r0, r12, r13, r14, r15)
            com.google.android.material.textfield.TextInputEditText r0 = r1.editPatronimic
            androidx.databinding.InverseBindingListener r15 = r1.editPatronimicandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r0, r12, r13, r14, r15)
            com.google.android.material.textfield.TextInputEditText r0 = r1.editSurname
            androidx.databinding.InverseBindingListener r15 = r1.editSurnameandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r0, r12, r13, r14, r15)
        L_0x00a0:
            long r10 = r10 & r2
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00aa
            com.google.android.material.textfield.TextInputEditText r0 = r1.editPatronimic
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r6)
        L_0x00aa:
            long r2 = r2 & r8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00b4
            com.google.android.material.textfield.TextInputEditText r0 = r1.editSurname
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r7)
        L_0x00b4:
            return
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x00b5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentFirstStageEditBindingImpl.executeBindings():void");
    }
}
