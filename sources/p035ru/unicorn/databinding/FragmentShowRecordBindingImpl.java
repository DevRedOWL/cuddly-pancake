package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;

/* renamed from: ru.unicorn.databinding.FragmentShowRecordBindingImpl */
public class FragmentShowRecordBindingImpl extends FragmentShowRecordBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(9);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;

    static {
        sIncludes.setIncludes(1, new String[]{"item_finish_stage", "item_finish_stage", "item_finish_stage", "item_finish_stage"}, new int[]{2, 3, 4, 5}, new int[]{R.layout.item_finish_stage, R.layout.item_finish_stage, R.layout.item_finish_stage, R.layout.item_finish_stage});
        sViewsWithIds.put(R.id.rvFileList, 6);
        sViewsWithIds.put(R.id.nextBtn, 7);
        sViewsWithIds.put(R.id.pb, 8);
    }

    public FragmentShowRecordBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentShowRecordBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, objArr[2], objArr[5], objArr[1], objArr[7], objArr[8], objArr[6], objArr[3], objArr[0], objArr[4]);
        this.mDirtyFlags = -1;
        this.f6591ll.setTag((Object) null);
        this.f6593sv.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 128;
        }
        this.first.invalidateAll();
        this.second.invalidateAll();
        this.third.invalidateAll();
        this.fourth.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.second.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.third.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.fourth.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.first.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasPendingBindings() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.mDirtyFlags     // Catch:{ all -> 0x0033 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r6.first
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r6.second
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r6.third
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r6.fourth
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            r0 = 0
            return r0
        L_0x0033:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentShowRecordBindingImpl.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, Object obj) {
        if (21 == i) {
            setIsEditMode((Boolean) obj);
        } else if (26 != i) {
            return false;
        } else {
            setVm((RecordsViewModel) obj);
        }
        return true;
    }

    public void setIsEditMode(Boolean bool) {
        this.mIsEditMode = bool;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(21);
        super.requestRebind();
    }

    public void setVm(RecordsViewModel recordsViewModel) {
        this.mVm = recordsViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.first.setLifecycleOwner(lifecycleOwner);
        this.second.setLifecycleOwner(lifecycleOwner);
        this.third.setLifecycleOwner(lifecycleOwner);
        this.fourth.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeSecond((ItemFinishStageBinding) obj, i2);
        }
        if (i == 1) {
            return onChangeFourth((ItemFinishStageBinding) obj, i2);
        }
        if (i == 2) {
            return onChangeVmAppointment((ObservableField) obj, i2);
        }
        if (i == 3) {
            return onChangeFirst((ItemFinishStageBinding) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return onChangeThird((ItemFinishStageBinding) obj, i2);
    }

    private boolean onChangeSecond(ItemFinishStageBinding itemFinishStageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeFourth(ItemFinishStageBinding itemFinishStageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVmAppointment(ObservableField<Appointment> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeFirst(ItemFinishStageBinding itemFinishStageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeThird(ItemFinishStageBinding itemFinishStageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r23 = this;
            r1 = r23
            monitor-enter(r23)
            long r2 = r1.mDirtyFlags     // Catch:{ all -> 0x01a7 }
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x01a7 }
            monitor-exit(r23)     // Catch:{ all -> 0x01a7 }
            java.lang.Boolean r0 = r1.mIsEditMode
            ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel r6 = r1.mVm
            r8 = 160(0xa0, double:7.9E-322)
            long r10 = r2 & r8
            int r13 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0042
            boolean r10 = androidx.databinding.ViewDataBinding.safeUnbox((java.lang.Boolean) r0)
            if (r13 == 0) goto L_0x0024
            if (r10 == 0) goto L_0x0021
            r13 = 512(0x200, double:2.53E-321)
            goto L_0x0023
        L_0x0021:
            r13 = 256(0x100, double:1.265E-321)
        L_0x0023:
            long r2 = r2 | r13
        L_0x0024:
            if (r10 == 0) goto L_0x0032
            android.view.View r10 = r23.getRoot()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131886970(0x7f12037a, float:1.9408534E38)
            goto L_0x003d
        L_0x0032:
            android.view.View r10 = r23.getRoot()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131886972(0x7f12037c, float:1.9408538E38)
        L_0x003d:
            java.lang.String r10 = r10.getString(r11)
            goto L_0x0043
        L_0x0042:
            r10 = 0
        L_0x0043:
            r13 = 196(0xc4, double:9.7E-322)
            long r15 = r2 & r13
            r17 = 1024(0x400, double:5.06E-321)
            int r11 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x00ed
            if (r6 == 0) goto L_0x0054
            androidx.databinding.ObservableField r6 = r6.getAppointment()
            goto L_0x0055
        L_0x0054:
            r6 = 0
        L_0x0055:
            r15 = 2
            r1.updateRegistration((int) r15, (androidx.databinding.Observable) r6)
            if (r6 == 0) goto L_0x0062
            java.lang.Object r6 = r6.get()
            ru.unicorn.ujin.view.fragments.makearecord.model.Appointment r6 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment) r6
            goto L_0x0063
        L_0x0062:
            r6 = 0
        L_0x0063:
            if (r6 == 0) goto L_0x0086
            java.lang.String r15 = r6.getRegisteredName()
            java.lang.String r16 = r6.getDate()
            java.lang.String r19 = r6.getTimeStart()
            java.lang.String r20 = r6.getDescription()
            java.lang.String r21 = r6.getTimeEnd()
            ru.unicorn.ujin.view.fragments.makearecord.model.ToUser r22 = r6.getToUser()
            r7 = r16
            r12 = r19
            r8 = r21
            r9 = r22
            goto L_0x008d
        L_0x0086:
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r15 = 0
            r20 = 0
        L_0x008d:
            if (r15 == 0) goto L_0x0098
            java.lang.String r13 = " "
            boolean r13 = r15.contains(r13)
            r16 = r13
            goto L_0x009a
        L_0x0098:
            r16 = 0
        L_0x009a:
            if (r11 == 0) goto L_0x00a4
            if (r16 == 0) goto L_0x00a2
            r13 = 2048(0x800, double:1.0118E-320)
            long r2 = r2 | r13
            goto L_0x00a4
        L_0x00a2:
            long r2 = r2 | r17
        L_0x00a4:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            r7 = 32
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            if (r9 == 0) goto L_0x00bc
            java.lang.String r9 = r9.getFullname()
            goto L_0x00bd
        L_0x00bc:
            r9 = 0
        L_0x00bd:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = r13.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r7)
            java.lang.String r7 = r12.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            r11.append(r8)
            java.lang.String r12 = r11.toString()
            r7 = r20
            goto L_0x00f4
        L_0x00ed:
            r6 = 0
            r7 = 0
            r9 = 0
            r12 = 0
            r15 = 0
            r16 = 0
        L_0x00f4:
            long r13 = r2 & r17
            int r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0109
            if (r6 == 0) goto L_0x0101
            ru.unicorn.ujin.view.fragments.makearecord.model.FromUser r6 = r6.getUser()
            goto L_0x0102
        L_0x0101:
            r6 = 0
        L_0x0102:
            if (r6 == 0) goto L_0x0109
            java.lang.String r6 = r6.getFullname()
            goto L_0x010a
        L_0x0109:
            r6 = 0
        L_0x010a:
            r13 = 196(0xc4, double:9.7E-322)
            long r13 = r13 & r2
            int r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0118
            if (r16 == 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r15 = r6
        L_0x0115:
            r13 = 160(0xa0, double:7.9E-322)
            goto L_0x011b
        L_0x0118:
            r13 = 160(0xa0, double:7.9E-322)
            r15 = 0
        L_0x011b:
            long r13 = r13 & r2
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0139
            ru.unicorn.databinding.ItemFinishStageBinding r6 = r1.first
            r6.setEditMode(r0)
            ru.unicorn.databinding.ItemFinishStageBinding r6 = r1.fourth
            r6.setEditMode(r0)
            ru.unicorn.databinding.ItemFinishStageBinding r6 = r1.fourth
            r6.setTitle(r10)
            ru.unicorn.databinding.ItemFinishStageBinding r6 = r1.second
            r6.setEditMode(r0)
            ru.unicorn.databinding.ItemFinishStageBinding r6 = r1.third
            r6.setEditMode(r0)
        L_0x0139:
            r10 = 128(0x80, double:6.32E-322)
            long r2 = r2 & r10
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x017c
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.first
            android.view.View r2 = r23.getRoot()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131887042(0x7f1203c2, float:1.940868E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setTitle(r2)
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.second
            android.view.View r2 = r23.getRoot()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131887000(0x7f120398, float:1.9408595E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setTitle(r2)
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.third
            android.view.View r2 = r23.getRoot()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131887005(0x7f12039d, float:1.9408605E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setTitle(r2)
        L_0x017c:
            if (r8 == 0) goto L_0x0192
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.first
            r0.setValue(r15)
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.fourth
            r0.setValue(r7)
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.second
            r0.setValue(r9)
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.third
            r0.setValue(r12)
        L_0x0192:
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.first
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.second
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.third
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.fourth
            executeBindingsOn(r0)
            return
        L_0x01a7:
            r0 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x01a7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentShowRecordBindingImpl.executeBindings():void");
    }
}
