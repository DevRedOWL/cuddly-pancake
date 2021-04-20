package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.generated.callback.OnClickListener;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;

/* renamed from: ru.unicorn.databinding.FragmentReturnTicketBindingImpl */
public class FragmentReturnTicketBindingImpl extends FragmentReturnTicketBinding implements OnClickListener.Listener {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private InverseBindingListener etCommentandroidTextAttrChanged;
    private final View.OnClickListener mCallback10;
    private final View.OnClickListener mCallback11;
    private final View.OnClickListener mCallback9;
    private long mDirtyFlags;
    private final NestedScrollView mboundView0;

    static {
        sViewsWithIds.put(R.id.tvTitle, 7);
        sViewsWithIds.put(R.id.rgReason, 8);
        sViewsWithIds.put(R.id.progressBar, 9);
    }

    public FragmentReturnTicketBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentReturnTicketBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, objArr[3], objArr[6], objArr[1], objArr[2], objArr[5], objArr[9], objArr[8], objArr[4], objArr[7]);
        this.etCommentandroidTextAttrChanged = new InverseBindingListener() {
            public void onChange() {
                String textString = TextViewBindingAdapter.getTextString(FragmentReturnTicketBindingImpl.this.etComment);
                HelpDeskViewModel helpDeskViewModel = FragmentReturnTicketBindingImpl.this.mVm;
                boolean z = true;
                if (helpDeskViewModel != null) {
                    ObservableField<String> observableField = helpDeskViewModel.commentReasonObservable;
                    if (observableField == null) {
                        z = false;
                    }
                    if (z) {
                        observableField.set(textString);
                    }
                }
            }
        };
        this.mDirtyFlags = -1;
        this.btnAnother.setTag((Object) null);
        this.btnConfirm.setTag((Object) null);
        this.btnNotDone.setTag((Object) null);
        this.btnNotFullyCompleted.setTag((Object) null);
        this.etComment.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.tilComment.setTag((Object) null);
        setRootTag(view);
        this.mCallback11 = new OnClickListener(this, 3);
        this.mCallback10 = new OnClickListener(this, 2);
        this.mCallback9 = new OnClickListener(this, 1);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 8;
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
        setVm((HelpDeskViewModel) obj);
        return true;
    }

    public void setVm(HelpDeskViewModel helpDeskViewModel) {
        this.mVm = helpDeskViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeVmReturnReasonObservable((ObservableField) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return onChangeVmCommentReasonObservable((ObservableField) obj, i2);
    }

    private boolean onChangeVmReturnReasonObservable(ObservableField<String> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmCommentReasonObservable(ObservableField<String> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r23 = this;
            r1 = r23
            monitor-enter(r23)
            long r2 = r1.mDirtyFlags     // Catch:{ all -> 0x0152 }
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x0152 }
            monitor-exit(r23)     // Catch:{ all -> 0x0152 }
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.HelpDeskViewModel r0 = r1.mVm
            r6 = 15
            long r8 = r2 & r6
            r10 = 14
            r12 = 13
            r14 = 128(0x80, double:6.32E-322)
            r6 = 2131886215(0x7f120087, float:1.9407003E38)
            r16 = 0
            r7 = 0
            int r18 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r18 == 0) goto L_0x0095
            if (r0 == 0) goto L_0x0025
            androidx.databinding.ObservableField<java.lang.String> r8 = r0.returnReasonObservable
            goto L_0x0027
        L_0x0025:
            r8 = r16
        L_0x0027:
            r1.updateRegistration((int) r7, (androidx.databinding.Observable) r8)
            if (r8 == 0) goto L_0x0033
            java.lang.Object r8 = r8.get()
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r9 = r1.btnConfirm
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getString(r6)
            if (r8 != r9) goto L_0x0043
            r9 = 1
            goto L_0x0044
        L_0x0043:
            r9 = 0
        L_0x0044:
            if (r18 == 0) goto L_0x004e
            if (r9 == 0) goto L_0x004a
            long r2 = r2 | r14
            goto L_0x004e
        L_0x004a:
            r18 = 64
            long r2 = r2 | r18
        L_0x004e:
            long r18 = r2 & r12
            int r20 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r20 == 0) goto L_0x0073
            com.google.android.material.textfield.TextInputLayout r7 = r1.tilComment
            android.content.res.Resources r7 = r7.getResources()
            java.lang.String r7 = r7.getString(r6)
            if (r8 != r7) goto L_0x0062
            r7 = 1
            goto L_0x0063
        L_0x0062:
            r7 = 0
        L_0x0063:
            if (r20 == 0) goto L_0x006e
            if (r7 == 0) goto L_0x006a
            r19 = 2048(0x800, double:1.0118E-320)
            goto L_0x006c
        L_0x006a:
            r19 = 1024(0x400, double:5.06E-321)
        L_0x006c:
            long r2 = r2 | r19
        L_0x006e:
            if (r7 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r7 = 4
            goto L_0x0074
        L_0x0073:
            r7 = 0
        L_0x0074:
            long r19 = r2 & r10
            int r21 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r21 == 0) goto L_0x0091
            if (r0 == 0) goto L_0x007f
            androidx.databinding.ObservableField<java.lang.String> r12 = r0.commentReasonObservable
            goto L_0x0081
        L_0x007f:
            r12 = r16
        L_0x0081:
            r13 = 1
            r1.updateRegistration((int) r13, (androidx.databinding.Observable) r12)
            if (r12 == 0) goto L_0x008e
            java.lang.Object r13 = r12.get()
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x009b
        L_0x008e:
            r13 = r16
            goto L_0x009b
        L_0x0091:
            r12 = r16
            r13 = r12
            goto L_0x009b
        L_0x0095:
            r8 = r16
            r12 = r8
            r13 = r12
            r7 = 0
            r9 = 0
        L_0x009b:
            long r14 = r14 & r2
            int r21 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r21 == 0) goto L_0x00b7
            if (r0 == 0) goto L_0x00a4
            androidx.databinding.ObservableField<java.lang.String> r12 = r0.commentReasonObservable
        L_0x00a4:
            r0 = 1
            r1.updateRegistration((int) r0, (androidx.databinding.Observable) r12)
            if (r12 == 0) goto L_0x00b1
            java.lang.Object r12 = r12.get()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
        L_0x00b1:
            boolean r12 = android.text.TextUtils.isEmpty(r13)
            r12 = r12 ^ r0
            goto L_0x00b9
        L_0x00b7:
            r0 = 1
            r12 = 0
        L_0x00b9:
            r14 = 15
            long r21 = r2 & r14
            r14 = 16
            int r17 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x00d2
            if (r9 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r12 = 0
        L_0x00c7:
            if (r17 == 0) goto L_0x00d3
            if (r12 == 0) goto L_0x00d0
            r21 = 32
            long r2 = r2 | r21
            goto L_0x00d3
        L_0x00d0:
            long r2 = r2 | r14
            goto L_0x00d3
        L_0x00d2:
            r12 = 0
        L_0x00d3:
            long r14 = r14 & r2
            int r9 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00e6
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r9 = r1.btnConfirm
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r6 = r9.getString(r6)
            if (r8 == r6) goto L_0x00e6
            r6 = 1
            goto L_0x00e7
        L_0x00e6:
            r6 = 0
        L_0x00e7:
            r8 = 15
            long r14 = r2 & r8
            int r8 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00fe
            if (r12 == 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r0 = r6
        L_0x00f3:
            if (r8 == 0) goto L_0x00ff
            if (r0 == 0) goto L_0x00fa
            r8 = 512(0x200, double:2.53E-321)
            goto L_0x00fc
        L_0x00fa:
            r8 = 256(0x100, double:1.265E-321)
        L_0x00fc:
            long r2 = r2 | r8
            goto L_0x00ff
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            r8 = 8
            long r8 = r8 & r2
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x012e
            android.widget.RadioButton r6 = r1.btnAnother
            android.view.View$OnClickListener r8 = r1.mCallback11
            r6.setOnClickListener(r8)
            android.widget.RadioButton r6 = r1.btnNotDone
            android.view.View$OnClickListener r8 = r1.mCallback9
            r6.setOnClickListener(r8)
            android.widget.RadioButton r6 = r1.btnNotFullyCompleted
            android.view.View$OnClickListener r8 = r1.mCallback10
            r6.setOnClickListener(r8)
            com.google.android.material.textfield.TextInputEditText r6 = r1.etComment
            r8 = r16
            androidx.databinding.adapters.TextViewBindingAdapter$BeforeTextChanged r8 = (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged) r8
            r9 = r16
            androidx.databinding.adapters.TextViewBindingAdapter$OnTextChanged r9 = (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged) r9
            r12 = r16
            androidx.databinding.adapters.TextViewBindingAdapter$AfterTextChanged r12 = (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged) r12
            androidx.databinding.InverseBindingListener r14 = r1.etCommentandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r6, r8, r9, r12, r14)
        L_0x012e:
            r8 = 15
            long r8 = r8 & r2
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x013a
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r6 = r1.btnConfirm
            r6.setEnabled(r0)
        L_0x013a:
            long r8 = r2 & r10
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0145
            com.google.android.material.textfield.TextInputEditText r0 = r1.etComment
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r13)
        L_0x0145:
            r8 = 13
            long r2 = r2 & r8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0151
            com.google.android.material.textfield.TextInputLayout r0 = r1.tilComment
            r0.setVisibility(r7)
        L_0x0151:
            return
        L_0x0152:
            r0 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x0152 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentReturnTicketBindingImpl.executeBindings():void");
    }

    public final void _internalCallbackOnClick(int i, View view) {
        boolean z = false;
        if (i == 1) {
            HelpDeskViewModel helpDeskViewModel = this.mVm;
            if (helpDeskViewModel != null) {
                z = true;
            }
            if (z) {
                helpDeskViewModel.setReturnReason(this.btnNotDone.getResources().getString(R.string.work_isnt_done));
            }
        } else if (i == 2) {
            HelpDeskViewModel helpDeskViewModel2 = this.mVm;
            if (helpDeskViewModel2 != null) {
                z = true;
            }
            if (z) {
                helpDeskViewModel2.setReturnReason(this.btnNotFullyCompleted.getResources().getString(R.string.work_isnt_fully_completed));
            }
        } else if (i == 3) {
            HelpDeskViewModel helpDeskViewModel3 = this.mVm;
            if (helpDeskViewModel3 != null) {
                z = true;
            }
            if (z) {
                helpDeskViewModel3.setReturnReason(this.btnAnother.getResources().getString(R.string.another_reason));
            }
        }
    }
}
