package p035ru.unicorn.databinding;

import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.OpenDatesIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleCellsIn;

/* renamed from: ru.unicorn.databinding.FragmentFifthStageBindingImpl */
public class FragmentFifthStageBindingImpl extends FragmentFifthStageBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(12);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;

    static {
        sIncludes.setIncludes(2, new String[]{"item_finish_stage", "item_finish_stage", "item_finish_stage", "item_finish_stage"}, new int[]{4, 5, 6, 7}, new int[]{R.layout.item_finish_stage, R.layout.item_finish_stage, R.layout.item_finish_stage, R.layout.item_finish_stage});
        sViewsWithIds.put(R.id.underline, 8);
        sViewsWithIds.put(R.id.rv, 9);
        sViewsWithIds.put(R.id.nextBtn, 10);
        sViewsWithIds.put(R.id.pb, 11);
    }

    public FragmentFifthStageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private FragmentFifthStageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 11, objArr[3], objArr[4], objArr[7], objArr[2], objArr[10], objArr[11], objArr[9], objArr[5], objArr[0], objArr[6], objArr[1], objArr[8]);
        this.mDirtyFlags = -1;
        this.changeBtn.setTag((Object) null);
        this.f6563ll.setTag((Object) null);
        this.f6566sv.setTag((Object) null);
        this.tvStage.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentFifthStageBindingImpl.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, Object obj) {
        if (26 == i) {
            setVm((RecordsViewModel) obj);
        } else if (21 != i) {
            return false;
        } else {
            setIsEditMode((Boolean) obj);
        }
        return true;
    }

    public void setVm(RecordsViewModel recordsViewModel) {
        this.mVm = recordsViewModel;
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setIsEditMode(Boolean bool) {
        this.mIsEditMode = bool;
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        notifyPropertyChanged(21);
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
        switch (i) {
            case 0:
                return onChangeVmExecutorsIn((ObservableField) obj, i2);
            case 1:
                return onChangeFourth((ItemFinishStageBinding) obj, i2);
            case 2:
                return onChangeFirst((ItemFinishStageBinding) obj, i2);
            case 3:
                return onChangeThird((ItemFinishStageBinding) obj, i2);
            case 4:
                return onChangeVmName((ObservableField) obj, i2);
            case 5:
                return onChangeVmChoosenCell((ObservableField) obj, i2);
            case 6:
                return onChangeVmPatronimic((ObservableField) obj, i2);
            case 7:
                return onChangeVmSurname((ObservableField) obj, i2);
            case 8:
                return onChangeSecond((ItemFinishStageBinding) obj, i2);
            case 9:
                return onChangeVmComment((ObservableField) obj, i2);
            case 10:
                return onChangeVmChoosenDate((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    private boolean onChangeVmExecutorsIn(ObservableField<ExecutorsIn> observableField, int i) {
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

    private boolean onChangeFirst(ItemFinishStageBinding itemFinishStageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeThird(ItemFinishStageBinding itemFinishStageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeVmName(ObservableField<String> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeVmChoosenCell(ObservableField<ScheduleCellsIn> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeVmPatronimic(ObservableField<String> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeVmSurname(ObservableField<String> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeSecond(ItemFinishStageBinding itemFinishStageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeVmComment(ObservableField<String> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        return true;
    }

    private boolean onChangeVmChoosenDate(ObservableField<OpenDatesIn> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r22 = this;
            r1 = r22
            monitor-enter(r22)
            long r2 = r1.mDirtyFlags     // Catch:{ all -> 0x02a7 }
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x02a7 }
            monitor-exit(r22)     // Catch:{ all -> 0x02a7 }
            ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel r0 = r1.mVm
            java.lang.Boolean r6 = r1.mIsEditMode
            r7 = 12017(0x2ef1, double:5.937E-320)
            long r7 = r7 & r2
            r9 = 4
            r12 = 11296(0x2c20, double:5.581E-320)
            r14 = 10448(0x28d0, double:5.162E-320)
            r16 = 10241(0x2801, double:5.0597E-320)
            r10 = 0
            int r18 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r18 == 0) goto L_0x0191
            long r7 = r2 & r16
            int r18 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r18 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x002a
            androidx.databinding.ObservableField r7 = r0.getExecutorsIn()
            goto L_0x002b
        L_0x002a:
            r7 = 0
        L_0x002b:
            r1.updateRegistration((int) r10, (androidx.databinding.Observable) r7)
            if (r7 == 0) goto L_0x0037
            java.lang.Object r7 = r7.get()
            ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn r7 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn) r7
            goto L_0x0038
        L_0x0037:
            r7 = 0
        L_0x0038:
            if (r7 == 0) goto L_0x003f
            java.lang.String r7 = r7.getTitle()
            goto L_0x0040
        L_0x003f:
            r7 = 0
        L_0x0040:
            long r18 = r2 & r14
            r8 = 32
            int r20 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r20 == 0) goto L_0x00c7
            if (r0 == 0) goto L_0x005d
            androidx.databinding.ObservableField r18 = r0.getName()
            androidx.databinding.ObservableField r19 = r0.getPatronimic()
            androidx.databinding.ObservableField r20 = r0.getSurname()
            r10 = r18
            r11 = r19
            r14 = r20
            goto L_0x0060
        L_0x005d:
            r10 = 0
            r11 = 0
            r14 = 0
        L_0x0060:
            r1.updateRegistration((int) r9, (androidx.databinding.Observable) r10)
            r15 = 6
            r1.updateRegistration((int) r15, (androidx.databinding.Observable) r11)
            r15 = 7
            r1.updateRegistration((int) r15, (androidx.databinding.Observable) r14)
            if (r10 == 0) goto L_0x0074
            java.lang.Object r10 = r10.get()
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0075
        L_0x0074:
            r10 = 0
        L_0x0075:
            if (r11 == 0) goto L_0x007e
            java.lang.Object r11 = r11.get()
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x007f
        L_0x007e:
            r11 = 0
        L_0x007f:
            if (r14 == 0) goto L_0x0088
            java.lang.Object r14 = r14.get()
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x0089
        L_0x0088:
            r14 = 0
        L_0x0089:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            r15.append(r8)
            java.lang.String r14 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            r15.append(r10)
            java.lang.String r10 = r15.toString()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r8)
            java.lang.String r10 = r14.toString()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r11)
            java.lang.String r10 = r14.toString()
            r11 = r10
            goto L_0x00c8
        L_0x00c7:
            r11 = 0
        L_0x00c8:
            long r14 = r2 & r12
            int r10 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x0170
            if (r0 == 0) goto L_0x00d9
            androidx.databinding.ObservableField r10 = r0.getChoosenCell()
            androidx.databinding.ObservableField r14 = r0.getChoosenDate()
            goto L_0x00db
        L_0x00d9:
            r10 = 0
            r14 = 0
        L_0x00db:
            r15 = 5
            r1.updateRegistration((int) r15, (androidx.databinding.Observable) r10)
            r15 = 10
            r1.updateRegistration((int) r15, (androidx.databinding.Observable) r14)
            if (r10 == 0) goto L_0x00ed
            java.lang.Object r10 = r10.get()
            ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleCellsIn r10 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleCellsIn) r10
            goto L_0x00ee
        L_0x00ed:
            r10 = 0
        L_0x00ee:
            if (r14 == 0) goto L_0x00f7
            java.lang.Object r14 = r14.get()
            ru.unicorn.ujin.view.fragments.makearecord.model.OpenDatesIn r14 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.OpenDatesIn) r14
            goto L_0x00f8
        L_0x00f7:
            r14 = 0
        L_0x00f8:
            if (r10 == 0) goto L_0x0103
            java.lang.String r15 = r10.getTimeStart()
            java.lang.String r10 = r10.getTimeEnd()
            goto L_0x0105
        L_0x0103:
            r10 = 0
            r15 = 0
        L_0x0105:
            if (r14 == 0) goto L_0x0113
            java.lang.String r21 = r14.getDayOfWeekHuman()
            java.lang.String r14 = r14.getDate()
            r9 = r14
            r14 = r21
            goto L_0x0115
        L_0x0113:
            r9 = 0
            r14 = 0
        L_0x0115:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            r12.append(r8)
            java.lang.String r9 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            r12.append(r15)
            java.lang.String r9 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r10)
            java.lang.String r8 = r9.toString()
            goto L_0x0171
        L_0x0170:
            r8 = 0
        L_0x0171:
            r9 = 10752(0x2a00, double:5.312E-320)
            long r12 = r2 & r9
            int r9 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x018f
            if (r0 == 0) goto L_0x0180
            androidx.databinding.ObservableField r0 = r0.getComment()
            goto L_0x0181
        L_0x0180:
            r0 = 0
        L_0x0181:
            r9 = 9
            r1.updateRegistration((int) r9, (androidx.databinding.Observable) r0)
            if (r0 == 0) goto L_0x018f
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0195
        L_0x018f:
            r0 = 0
            goto L_0x0195
        L_0x0191:
            r0 = 0
            r7 = 0
            r8 = 0
            r11 = 0
        L_0x0195:
            r9 = 12288(0x3000, double:6.071E-320)
            long r12 = r2 & r9
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x01f5
            boolean r12 = androidx.databinding.ViewDataBinding.safeUnbox((java.lang.Boolean) r6)
            if (r14 == 0) goto L_0x01bc
            if (r12 == 0) goto L_0x01b1
            r13 = 32768(0x8000, double:1.61895E-319)
            long r2 = r2 | r13
            r13 = 131072(0x20000, double:6.47582E-319)
            long r2 = r2 | r13
            r13 = 524288(0x80000, double:2.590327E-318)
            goto L_0x01bb
        L_0x01b1:
            r13 = 16384(0x4000, double:8.0948E-320)
            long r2 = r2 | r13
            r13 = 65536(0x10000, double:3.2379E-319)
            long r2 = r2 | r13
            r13 = 262144(0x40000, double:1.295163E-318)
        L_0x01bb:
            long r2 = r2 | r13
        L_0x01bc:
            android.view.View r13 = r22.getRoot()
            android.content.res.Resources r13 = r13.getResources()
            if (r12 == 0) goto L_0x01ca
            r14 = 2131886970(0x7f12037a, float:1.9408534E38)
            goto L_0x01cd
        L_0x01ca:
            r14 = 2131886972(0x7f12037c, float:1.9408538E38)
        L_0x01cd:
            java.lang.String r13 = r13.getString(r14)
            if (r12 == 0) goto L_0x01d6
            r18 = 4
            goto L_0x01d8
        L_0x01d6:
            r18 = 0
        L_0x01d8:
            if (r12 == 0) goto L_0x01e4
            android.widget.TextView r12 = r1.tvStage
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131887253(0x7f120495, float:1.9409108E38)
            goto L_0x01ed
        L_0x01e4:
            android.widget.TextView r12 = r1.tvStage
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131887236(0x7f120484, float:1.9409073E38)
        L_0x01ed:
            java.lang.String r12 = r12.getString(r14)
            r14 = r12
            r12 = r18
            goto L_0x01f8
        L_0x01f5:
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x01f8:
            long r9 = r9 & r2
            int r15 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0220
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r9 = r1.changeBtn
            r9.setVisibility(r12)
            ru.unicorn.databinding.ItemFinishStageBinding r9 = r1.first
            r9.setEditMode(r6)
            ru.unicorn.databinding.ItemFinishStageBinding r9 = r1.fourth
            r9.setEditMode(r6)
            ru.unicorn.databinding.ItemFinishStageBinding r9 = r1.fourth
            r9.setTitle(r13)
            ru.unicorn.databinding.ItemFinishStageBinding r9 = r1.second
            r9.setEditMode(r6)
            ru.unicorn.databinding.ItemFinishStageBinding r9 = r1.third
            r9.setEditMode(r6)
            android.widget.TextView r6 = r1.tvStage
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r6, r14)
        L_0x0220:
            r9 = 8192(0x2000, double:4.0474E-320)
            long r9 = r9 & r2
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0263
            ru.unicorn.databinding.ItemFinishStageBinding r6 = r1.first
            android.view.View r9 = r22.getRoot()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131887042(0x7f1203c2, float:1.940868E38)
            java.lang.String r9 = r9.getString(r10)
            r6.setTitle(r9)
            ru.unicorn.databinding.ItemFinishStageBinding r6 = r1.second
            android.view.View r9 = r22.getRoot()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131887000(0x7f120398, float:1.9408595E38)
            java.lang.String r9 = r9.getString(r10)
            r6.setTitle(r9)
            ru.unicorn.databinding.ItemFinishStageBinding r6 = r1.third
            android.view.View r9 = r22.getRoot()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131887005(0x7f12039d, float:1.9408605E38)
            java.lang.String r9 = r9.getString(r10)
            r6.setTitle(r9)
        L_0x0263:
            r9 = 10448(0x28d0, double:5.162E-320)
            long r9 = r9 & r2
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x026f
            ru.unicorn.databinding.ItemFinishStageBinding r6 = r1.first
            r6.setValue(r11)
        L_0x026f:
            r9 = 10752(0x2a00, double:5.312E-320)
            long r9 = r9 & r2
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x027b
            ru.unicorn.databinding.ItemFinishStageBinding r6 = r1.fourth
            r6.setValue(r0)
        L_0x027b:
            long r9 = r2 & r16
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0286
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.second
            r0.setValue(r7)
        L_0x0286:
            r6 = 11296(0x2c20, double:5.581E-320)
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0292
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.third
            r0.setValue(r8)
        L_0x0292:
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.first
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.second
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.third
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemFinishStageBinding r0 = r1.fourth
            executeBindingsOn(r0)
            return
        L_0x02a7:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x02a7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentFifthStageBindingImpl.executeBindings():void");
    }
}
