package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Pass;

/* renamed from: ru.unicorn.databinding.FragmentPassDetailBindingImpl */
public class FragmentPassDetailBindingImpl extends FragmentPassDetailBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(12);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    private final TextView mboundView5;

    static {
        sIncludes.setIncludes(4, new String[]{"fake_1", "fake_1", "fake_1", "fake_1"}, new int[]{6, 7, 8, 9}, new int[]{R.layout.fake_1, R.layout.fake_1, R.layout.fake_1, R.layout.fake_1});
        sViewsWithIds.put(R.id.dynamicBackgroundButton, 10);
        sViewsWithIds.put(R.id.dynamicBackgroundButton2, 11);
    }

    public FragmentPassDetailBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentPassDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, objArr[3], objArr[10], objArr[11], objArr[6], objArr[7], objArr[8], objArr[9], objArr[4], objArr[1], objArr[2]);
        this.mDirtyFlags = -1;
        this.description.setTag((Object) null);
        this.linearLayout7.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.mboundView5 = objArr[5];
        this.mboundView5.setTag((Object) null);
        this.number.setTag((Object) null);
        this.status.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 32;
        }
        this.fake1.invalidateAll();
        this.fake2.invalidateAll();
        this.fake3.invalidateAll();
        this.fake4.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.fake2.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.fake3.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.fake4.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.fake1.hasPendingBindings() == false) goto L_0x0016;
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
            ru.unicorn.databinding.Fake1Binding r0 = r6.fake1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.Fake1Binding r0 = r6.fake2
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.Fake1Binding r0 = r6.fake3
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.Fake1Binding r0 = r6.fake4
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentPassDetailBindingImpl.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, Object obj) {
        if (20 != i) {
            return false;
        }
        setPass((Pass) obj);
        return true;
    }

    public void setPass(Pass pass) {
        this.mPass = pass;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(20);
        super.requestRebind();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.fake1.setLifecycleOwner(lifecycleOwner);
        this.fake2.setLifecycleOwner(lifecycleOwner);
        this.fake3.setLifecycleOwner(lifecycleOwner);
        this.fake4.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeFake3((Fake1Binding) obj, i2);
        }
        if (i == 1) {
            return onChangeFake2((Fake1Binding) obj, i2);
        }
        if (i == 2) {
            return onChangeFake1((Fake1Binding) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return onChangeFake4((Fake1Binding) obj, i2);
    }

    private boolean onChangeFake3(Fake1Binding fake1Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeFake2(Fake1Binding fake1Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeFake1(Fake1Binding fake1Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeFake4(Fake1Binding fake1Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x023e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r29 = this;
            r1 = r29
            monitor-enter(r29)
            long r2 = r1.mDirtyFlags     // Catch:{ all -> 0x02a3 }
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x02a3 }
            monitor-exit(r29)     // Catch:{ all -> 0x02a3 }
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.Pass r0 = r1.mPass
            r6 = 48
            long r8 = r2 & r6
            int r15 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x01c1
            if (r0 == 0) goto L_0x0038
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.Enterprise r8 = r0.getEnterprise()
            java.lang.String r9 = r0.getPassNumber()
            java.lang.String r16 = r0.getWorkTimeFrom()
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.User r17 = r0.getUser()
            java.lang.String r18 = r0.getActiveTo()
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.Type r19 = r0.getType()
            java.lang.String r0 = r0.getWorkTimeTo()
            r12 = r0
            r13 = r16
            r0 = r18
            goto L_0x0041
        L_0x0038:
            r0 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r17 = 0
            r19 = 0
        L_0x0041:
            if (r8 == 0) goto L_0x004c
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.Director r20 = r8.getDirector()
            java.lang.String r8 = r8.getTitle()
            goto L_0x004f
        L_0x004c:
            r8 = 0
            r20 = 0
        L_0x004f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            android.widget.TextView r10 = r1.number
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131887589(0x7f1205e5, float:1.940979E38)
            java.lang.String r10 = r10.getString(r11)
            r14.append(r10)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.widget.TextView r10 = r1.status
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131887588(0x7f1205e4, float:1.9409787E38)
            java.lang.String r10 = r10.getString(r11)
            r9.append(r10)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            if (r17 == 0) goto L_0x0096
            java.lang.String r9 = r17.getFullname()
            java.lang.String r10 = r17.getEmail()
            java.lang.String r11 = r17.getPhone()
            goto L_0x0099
        L_0x0096:
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0099:
            if (r19 == 0) goto L_0x00a2
            java.lang.String r17 = r19.getTitle()
            r4 = r17
            goto L_0x00a3
        L_0x00a2:
            r4 = 0
        L_0x00a3:
            if (r20 == 0) goto L_0x00b0
            java.lang.String r5 = r20.getPhone()
            java.lang.String r17 = r20.getFullname()
            r26 = r17
            goto L_0x00b3
        L_0x00b0:
            r5 = 0
            r26 = 0
        L_0x00b3:
            if (r8 != 0) goto L_0x00b8
            r17 = 1
            goto L_0x00ba
        L_0x00b8:
            r17 = 0
        L_0x00ba:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            android.widget.TextView r4 = r1.description
            android.content.res.Resources r4 = r4.getResources()
            r7 = 2131888310(0x7f1208b6, float:1.9411252E38)
            java.lang.String r4 = r4.getString(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            if (r15 == 0) goto L_0x00e0
            if (r17 == 0) goto L_0x00dd
            r6 = 512(0x200, double:2.53E-321)
            goto L_0x00df
        L_0x00dd:
            r6 = 256(0x100, double:1.265E-321)
        L_0x00df:
            long r2 = r2 | r6
        L_0x00e0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.widget.TextView r7 = r1.mboundView5
            android.content.res.Resources r7 = r7.getResources()
            r15 = 2131887170(0x7f120442, float:1.940894E38)
            java.lang.String r7 = r7.getString(r15)
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            if (r5 != 0) goto L_0x0100
            r5 = 1
            goto L_0x0101
        L_0x0100:
            r5 = 0
        L_0x0101:
            if (r17 == 0) goto L_0x0106
            r7 = 8
            goto L_0x0107
        L_0x0106:
            r7 = 0
        L_0x0107:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r4)
            r4 = 32
            r15.append(r4)
            java.lang.String r15 = r15.toString()
            r19 = 48
            long r27 = r2 & r19
            r24 = 0
            int r17 = (r27 > r24 ? 1 : (r27 == r24 ? 0 : -1))
            if (r17 == 0) goto L_0x012d
            if (r5 == 0) goto L_0x0129
            r27 = 2048(0x800, double:1.0118E-320)
            long r2 = r2 | r27
            goto L_0x012d
        L_0x0129:
            r21 = 1024(0x400, double:5.06E-321)
            long r2 = r2 | r21
        L_0x012d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            android.widget.TextView r6 = r1.mboundView5
            android.content.res.Resources r6 = r6.getResources()
            r27 = r0
            r0 = 2131887266(0x7f1204a2, float:1.9409134E38)
            java.lang.String r0 = r6.getString(r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r15)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r0 = r26
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r4)
            r4 = 32
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r4)
            android.widget.TextView r4 = r1.description
            android.content.res.Resources r4 = r4.getResources()
            r15 = 2131887249(0x7f120491, float:1.94091E38)
            java.lang.String r4 = r4.getString(r15)
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r4)
            r4 = 32
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r4)
            r13.append(r12)
            java.lang.String r4 = r13.toString()
            r12 = r10
            r21 = 1024(0x400, double:5.06E-321)
            r10 = r9
            r9 = r8
            r8 = r4
            r4 = r27
            goto L_0x01ce
        L_0x01c1:
            r0 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r21 = 1024(0x400, double:5.06E-321)
        L_0x01ce:
            long r21 = r2 & r21
            r23 = 0
            int r13 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r13 == 0) goto L_0x01da
            if (r0 != 0) goto L_0x01da
            r0 = 1
            goto L_0x01db
        L_0x01da:
            r0 = 0
        L_0x01db:
            r19 = 48
            long r21 = r2 & r19
            int r13 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r13 == 0) goto L_0x01f5
            if (r5 == 0) goto L_0x01e6
            r0 = 1
        L_0x01e6:
            if (r13 == 0) goto L_0x01f0
            if (r0 == 0) goto L_0x01ed
            r15 = 128(0x80, double:6.32E-322)
            goto L_0x01ef
        L_0x01ed:
            r15 = 64
        L_0x01ef:
            long r2 = r2 | r15
        L_0x01f0:
            if (r0 == 0) goto L_0x01f5
            r0 = 4
            r13 = 4
            goto L_0x01f6
        L_0x01f5:
            r13 = 0
        L_0x01f6:
            r15 = 48
            long r15 = r15 & r2
            r17 = 0
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0235
            android.widget.TextView r0 = r1.description
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r8)
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake1
            android.view.View r0 = r0.getRoot()
            r0.setVisibility(r7)
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake1
            r0.setValue(r9)
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake2
            r0.setValue(r10)
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake3
            r0.setValue(r12)
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake4
            r0.setValue(r11)
            android.widget.TextView r0 = r1.mboundView5
            r0.setVisibility(r13)
            android.widget.TextView r0 = r1.mboundView5
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r6)
            android.widget.TextView r0 = r1.number
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r14)
            android.widget.TextView r0 = r1.status
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r4)
        L_0x0235:
            r4 = 32
            long r2 = r2 & r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x028e
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake1
            android.view.View r2 = r29.getRoot()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131886523(0x7f1201bb, float:1.9407627E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setKey(r2)
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake2
            android.view.View r2 = r29.getRoot()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131887048(0x7f1203c8, float:1.9408692E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setKey(r2)
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake3
            android.view.View r2 = r29.getRoot()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131887892(0x7f120714, float:1.9410404E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setKey(r2)
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake4
            android.view.View r2 = r29.getRoot()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131887146(0x7f12042a, float:1.940889E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setKey(r2)
        L_0x028e:
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake1
            executeBindingsOn(r0)
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake2
            executeBindingsOn(r0)
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake3
            executeBindingsOn(r0)
            ru.unicorn.databinding.Fake1Binding r0 = r1.fake4
            executeBindingsOn(r0)
            return
        L_0x02a3:
            r0 = move-exception
            monitor-exit(r29)     // Catch:{ all -> 0x02a3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentPassDetailBindingImpl.executeBindings():void");
    }
}
