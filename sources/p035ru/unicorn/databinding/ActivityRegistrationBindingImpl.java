package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;

/* renamed from: ru.unicorn.databinding.ActivityRegistrationBindingImpl */
public class ActivityRegistrationBindingImpl extends ActivityRegistrationBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ScrollView mboundView0;

    static {
        sViewsWithIds.put(R.id.relativeLayout_main_ID, 11);
        sViewsWithIds.put(R.id.imageBigLogo, 12);
        sViewsWithIds.put(R.id.bottomView, 13);
        sViewsWithIds.put(R.id.tabLayoutLoginRegister, 14);
        sViewsWithIds.put(R.id.tabLogin, 15);
        sViewsWithIds.put(R.id.tabRegister, 16);
        sViewsWithIds.put(R.id.linearLayout_login_pwd_ID, 17);
        sViewsWithIds.put(R.id.password_layout, 18);
        sViewsWithIds.put(R.id.layoutRemindPassword, 19);
        sViewsWithIds.put(R.id.textRemindPassword, 20);
        sViewsWithIds.put(R.id.barrier, 21);
        sViewsWithIds.put(R.id.cbTerms, 22);
        sViewsWithIds.put(R.id.tvCheckTerms, 23);
        sViewsWithIds.put(R.id.progressBar, 24);
    }

    public ActivityRegistrationBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 25, sIncludes, sViewsWithIds));
    }

    private ActivityRegistrationBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, objArr[21], objArr[13], objArr[10], objArr[22], objArr[3], objArr[5], objArr[4], objArr[1], objArr[12], objArr[6], objArr[8], objArr[19], objArr[17], objArr[18], objArr[24], objArr[11], objArr[14], objArr[15], objArr[16], objArr[20], objArr[23], objArr[7], objArr[2], objArr[9]);
        this.mDirtyFlags = -1;
        this.buttonEnter.setTag((Object) null);
        this.etLogin.setTag((Object) null);
        this.etPassword.setTag((Object) null);
        this.etPhone.setTag((Object) null);
        this.imageBack.setTag((Object) null);
        this.ivEye.setTag((Object) null);
        this.layoutCheckTermsOfUse.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.tvDemo.setTag((Object) null);
        this.tvLoginHint.setTag((Object) null);
        this.tvLoginTerms.setTag((Object) null);
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
        if (26 == i) {
            setVm((ProfileViewModel) obj);
            return true;
        } else if (8 == i) {
            setBackIsVisible((Boolean) obj);
            return true;
        } else if (1 != i) {
            return false;
        } else {
            setIsDemoButtonEnabled((Boolean) obj);
            return true;
        }
    }

    public void setVm(ProfileViewModel profileViewModel) {
        this.mVm = profileViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setBackIsVisible(Boolean bool) {
        this.mBackIsVisible = bool;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(8);
        super.requestRebind();
    }

    public void setIsDemoButtonEnabled(Boolean bool) {
        this.mIsDemoButtonEnabled = bool;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeVmLoginMode((ObservableField) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return onChangeVmLoginMethod((ObservableField) obj, i2);
    }

    private boolean onChangeVmLoginMode(ObservableField<Integer> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmLoginMethod(ObservableField<Integer> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r28 = this;
            r1 = r28
            monitor-enter(r28)
            long r2 = r1.mDirtyFlags     // Catch:{ all -> 0x01d2 }
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x01d2 }
            monitor-exit(r28)     // Catch:{ all -> 0x01d2 }
            ru.unicorn.ujin.data.profile.ProfileViewModel r0 = r1.mVm
            java.lang.Boolean r6 = r1.mBackIsVisible
            java.lang.Boolean r7 = r1.mIsDemoButtonEnabled
            r8 = 39
            long r8 = r8 & r2
            r10 = 38
            r12 = 37
            r14 = 0
            int r17 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x0131
            long r8 = r2 & r12
            r15 = 1
            int r18 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r18 == 0) goto L_0x00c5
            if (r0 == 0) goto L_0x002a
            androidx.databinding.ObservableField r8 = r0.getLoginMode()
            goto L_0x002b
        L_0x002a:
            r8 = 0
        L_0x002b:
            r1.updateRegistration((int) r14, (androidx.databinding.Observable) r8)
            if (r8 == 0) goto L_0x0037
            java.lang.Object r8 = r8.get()
            java.lang.Integer r8 = (java.lang.Integer) r8
            goto L_0x0038
        L_0x0037:
            r8 = 0
        L_0x0038:
            if (r8 == 0) goto L_0x004b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            boolean r9 = r8.equals(r9)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            boolean r14 = r8.equals(r14)
            goto L_0x004d
        L_0x004b:
            r9 = 0
            r14 = 0
        L_0x004d:
            if (r18 == 0) goto L_0x0073
            if (r9 == 0) goto L_0x0062
            r20 = 128(0x80, double:6.32E-322)
            long r2 = r2 | r20
            r20 = 512(0x200, double:2.53E-321)
            long r2 = r2 | r20
            r20 = 32768(0x8000, double:1.61895E-319)
            long r2 = r2 | r20
            r20 = 2097152(0x200000, double:1.0361308E-317)
            goto L_0x0071
        L_0x0062:
            r20 = 64
            long r2 = r2 | r20
            r20 = 256(0x100, double:1.265E-321)
            long r2 = r2 | r20
            r20 = 16384(0x4000, double:8.0948E-320)
            long r2 = r2 | r20
            r20 = 1048576(0x100000, double:5.180654E-318)
        L_0x0071:
            long r2 = r2 | r20
        L_0x0073:
            long r20 = r2 & r12
            int r8 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0082
            if (r14 == 0) goto L_0x007e
            r20 = 8192(0x2000, double:4.0474E-320)
            goto L_0x0080
        L_0x007e:
            r20 = 4096(0x1000, double:2.0237E-320)
        L_0x0080:
            long r2 = r2 | r20
        L_0x0082:
            if (r9 == 0) goto L_0x0087
            r18 = 0
            goto L_0x0089
        L_0x0087:
            r18 = 4
        L_0x0089:
            android.widget.EditText r8 = r1.etPassword
            android.content.res.Resources r8 = r8.getResources()
            if (r9 == 0) goto L_0x0095
            r12 = 2131887283(0x7f1204b3, float:1.9409169E38)
            goto L_0x0098
        L_0x0095:
            r12 = 2131887969(0x7f120761, float:1.941056E38)
        L_0x0098:
            java.lang.String r8 = r8.getString(r12)
            if (r9 == 0) goto L_0x00a0
            r12 = 0
            goto L_0x00a2
        L_0x00a0:
            r12 = 8
        L_0x00a2:
            if (r9 == 0) goto L_0x00ae
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r9 = r1.buttonEnter
            android.content.res.Resources r9 = r9.getResources()
            r13 = 2131887281(0x7f1204b1, float:1.9409165E38)
            goto L_0x00b7
        L_0x00ae:
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r9 = r1.buttonEnter
            android.content.res.Resources r9 = r9.getResources()
            r13 = 2131886355(0x7f120113, float:1.9407287E38)
        L_0x00b7:
            java.lang.String r9 = r9.getString(r13)
            if (r14 == 0) goto L_0x00c0
            r20 = 0
            goto L_0x00c2
        L_0x00c0:
            r20 = 4
        L_0x00c2:
            r14 = r20
            goto L_0x00cb
        L_0x00c5:
            r8 = 0
            r9 = 0
            r12 = 0
            r14 = 0
            r18 = 0
        L_0x00cb:
            long r22 = r2 & r10
            int r13 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x012a
            if (r0 == 0) goto L_0x00d8
            androidx.databinding.ObservableField r0 = r0.getLoginMethod()
            goto L_0x00d9
        L_0x00d8:
            r0 = 0
        L_0x00d9:
            r1.updateRegistration((int) r15, (androidx.databinding.Observable) r0)
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x00e6
        L_0x00e5:
            r0 = 0
        L_0x00e6:
            r19 = 0
            if (r0 == 0) goto L_0x00fb
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            boolean r4 = r0.equals(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            boolean r0 = r0.equals(r5)
            goto L_0x00fd
        L_0x00fb:
            r0 = 0
            r4 = 0
        L_0x00fd:
            if (r13 == 0) goto L_0x010a
            if (r4 == 0) goto L_0x0105
            r24 = 131072(0x20000, double:6.47582E-319)
            goto L_0x0108
        L_0x0105:
            r24 = 65536(0x10000, double:3.2379E-319)
        L_0x0108:
            long r2 = r2 | r24
        L_0x010a:
            long r24 = r2 & r10
            r22 = 0
            int r5 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r5 == 0) goto L_0x011b
            if (r0 == 0) goto L_0x0117
            r24 = 2048(0x800, double:1.0118E-320)
            goto L_0x0119
        L_0x0117:
            r24 = 1024(0x400, double:5.06E-321)
        L_0x0119:
            long r2 = r2 | r24
        L_0x011b:
            if (r4 == 0) goto L_0x011f
            r4 = 0
            goto L_0x0121
        L_0x011f:
            r4 = 8
        L_0x0121:
            if (r0 == 0) goto L_0x0125
            r0 = 0
            goto L_0x0127
        L_0x0125:
            r0 = 8
        L_0x0127:
            r5 = r18
            goto L_0x013a
        L_0x012a:
            r19 = 0
            r5 = r18
            r0 = 0
            r4 = 0
            goto L_0x013a
        L_0x0131:
            r19 = 0
            r0 = 0
            r4 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r14 = 0
        L_0x013a:
            r17 = 40
            long r24 = r2 & r17
            r22 = 0
            int r13 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r13 == 0) goto L_0x015b
            boolean r6 = androidx.databinding.ViewDataBinding.safeUnbox((java.lang.Boolean) r6)
            if (r13 == 0) goto L_0x0155
            if (r6 == 0) goto L_0x0150
            r24 = 524288(0x80000, double:2.590327E-318)
            goto L_0x0153
        L_0x0150:
            r24 = 262144(0x40000, double:1.295163E-318)
        L_0x0153:
            long r2 = r2 | r24
        L_0x0155:
            if (r6 == 0) goto L_0x0158
            goto L_0x015b
        L_0x0158:
            r6 = 8
            goto L_0x015c
        L_0x015b:
            r6 = 0
        L_0x015c:
            r24 = 48
            long r26 = r2 & r24
            r22 = 0
            int r13 = (r26 > r22 ? 1 : (r26 == r22 ? 0 : -1))
            if (r13 == 0) goto L_0x0181
            boolean r7 = androidx.databinding.ViewDataBinding.safeUnbox((java.lang.Boolean) r7)
            if (r13 == 0) goto L_0x0177
            if (r7 == 0) goto L_0x0172
            r26 = 8388608(0x800000, double:4.144523E-317)
            goto L_0x0175
        L_0x0172:
            r26 = 4194304(0x400000, double:2.0722615E-317)
        L_0x0175:
            long r2 = r2 | r26
        L_0x0177:
            if (r7 == 0) goto L_0x017c
            r16 = 0
            goto L_0x017e
        L_0x017c:
            r16 = 8
        L_0x017e:
            r7 = r16
            goto L_0x0182
        L_0x0181:
            r7 = 0
        L_0x0182:
            r15 = 37
            long r15 = r15 & r2
            r19 = 0
            int r13 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r13 == 0) goto L_0x01a9
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r13 = r1.buttonEnter
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r13, r9)
            android.widget.EditText r9 = r1.etPassword
            r9.setHint(r8)
            android.widget.ImageView r8 = r1.ivEye
            r8.setVisibility(r12)
            androidx.constraintlayout.widget.ConstraintLayout r8 = r1.layoutCheckTermsOfUse
            r8.setVisibility(r14)
            android.widget.TextView r8 = r1.tvLoginHint
            r8.setVisibility(r5)
            android.widget.TextView r8 = r1.tvLoginTerms
            r8.setVisibility(r5)
        L_0x01a9:
            long r8 = r2 & r10
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x01bb
            android.widget.EditText r5 = r1.etLogin
            r5.setVisibility(r0)
            ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText r0 = r1.etPhone
            r0.setVisibility(r4)
        L_0x01bb:
            long r4 = r2 & r17
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x01c6
            androidx.appcompat.widget.AppCompatImageView r0 = r1.imageBack
            r0.setVisibility(r6)
        L_0x01c6:
            long r2 = r2 & r24
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x01d1
            android.widget.TextView r0 = r1.tvDemo
            r0.setVisibility(r7)
        L_0x01d1:
            return
        L_0x01d2:
            r0 = move-exception
            monitor-exit(r28)     // Catch:{ all -> 0x01d2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.ActivityRegistrationBindingImpl.executeBindings():void");
    }
}
