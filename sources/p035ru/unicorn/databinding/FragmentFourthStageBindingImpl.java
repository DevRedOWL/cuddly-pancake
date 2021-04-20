package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;

/* renamed from: ru.unicorn.databinding.FragmentFourthStageBindingImpl */
public class FragmentFourthStageBindingImpl extends FragmentFourthStageBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private InverseBindingListener etTitleTicketandroidTextAttrChanged;
    private long mDirtyFlags;

    static {
        sViewsWithIds.put(R.id.tv_stage, 2);
        sViewsWithIds.put(R.id.tv_label_fio, 3);
        sViewsWithIds.put(R.id.underline, 4);
        sViewsWithIds.put(R.id.til_title, 5);
        sViewsWithIds.put(R.id.rv, 6);
        sViewsWithIds.put(R.id.changeBtn, 7);
        sViewsWithIds.put(R.id.nextBtn, 8);
        sViewsWithIds.put(R.id.pb, 9);
    }

    public FragmentFourthStageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentFourthStageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, objArr[7], objArr[1], objArr[8], objArr[9], objArr[6], objArr[0], objArr[5], objArr[3], objArr[2], objArr[4]);
        this.etTitleTicketandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String textString = TextViewBindingAdapter.getTextString(FragmentFourthStageBindingImpl.this.etTitleTicket);
                RecordsViewModel recordsViewModel = FragmentFourthStageBindingImpl.this.mVm;
                boolean z = true;
                if (recordsViewModel != null) {
                    ObservableField<String> comment = recordsViewModel.getComment();
                    if (comment == null) {
                        z = false;
                    }
                    if (z) {
                        comment.set(textString);
                    }
                }
            }
        };
        this.mDirtyFlags = -1;
        this.etTitleTicket.setTag((Object) null);
        this.f6571sv.setTag((Object) null);
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
        if (26 != i) {
            return false;
        }
        setVm((RecordsViewModel) obj);
        return true;
    }

    public void setVm(RecordsViewModel recordsViewModel) {
        this.mVm = recordsViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return onChangeVmComment((ObservableField) obj, i2);
    }

    private boolean onChangeVmComment(ObservableField<String> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.mDirtyFlags     // Catch:{ all -> 0x0046 }
            r2 = 0
            r9.mDirtyFlags = r2     // Catch:{ all -> 0x0046 }
            monitor-exit(r9)     // Catch:{ all -> 0x0046 }
            ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel r4 = r9.mVm
            r5 = 7
            long r5 = r5 & r0
            r7 = 0
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0027
            if (r4 == 0) goto L_0x0019
            androidx.databinding.ObservableField r4 = r4.getComment()
            goto L_0x001a
        L_0x0019:
            r4 = r7
        L_0x001a:
            r5 = 0
            r9.updateRegistration((int) r5, (androidx.databinding.Observable) r4)
            if (r4 == 0) goto L_0x0027
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0028
        L_0x0027:
            r4 = r7
        L_0x0028:
            if (r8 == 0) goto L_0x002f
            com.google.android.material.textfield.TextInputEditText r5 = r9.etTitleTicket
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r4)
        L_0x002f:
            r4 = 4
            long r0 = r0 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0045
            com.google.android.material.textfield.TextInputEditText r0 = r9.etTitleTicket
            r1 = r7
            androidx.databinding.adapters.TextViewBindingAdapter$BeforeTextChanged r1 = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) r1
            r2 = r7
            androidx.databinding.adapters.TextViewBindingAdapter$OnTextChanged r2 = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) r2
            androidx.databinding.adapters.TextViewBindingAdapter$AfterTextChanged r7 = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) r7
            androidx.databinding.InverseBindingListener r3 = r9.etTitleTicketandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r0, r1, r2, r7, r3)
        L_0x0045:
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0046 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentFourthStageBindingImpl.executeBindings():void");
    }
}
