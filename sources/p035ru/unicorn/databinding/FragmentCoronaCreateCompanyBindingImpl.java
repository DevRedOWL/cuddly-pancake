package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.generated.callback.OnClickListener;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyOUT;

/* renamed from: ru.unicorn.databinding.FragmentCoronaCreateCompanyBindingImpl */
public class FragmentCoronaCreateCompanyBindingImpl extends FragmentCoronaCreateCompanyBinding implements OnClickListener.Listener {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(13);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private ViewDataBinding.PropertyChangedInverseListener firstvalue;
    private ViewDataBinding.PropertyChangedInverseListener fivethvalue;
    private ViewDataBinding.PropertyChangedInverseListener fourthvalue;
    private final View.OnClickListener mCallback1;
    private long mDirtyFlags;
    private InverseBindingListener mOldEventValue1106921706;
    private InverseBindingListener mOldEventValue1151416645;
    private InverseBindingListener mOldEventValue1730794889;
    private InverseBindingListener mOldEventValue2056559304;
    private InverseBindingListener mOldEventValue37445242;
    private final RelativeLayout mboundView0;
    private final LinearLayout mboundView1;
    private ViewDataBinding.PropertyChangedInverseListener secondvalue;
    private ViewDataBinding.PropertyChangedInverseListener thirdvalue;

    static {
        sIncludes.setIncludes(1, new String[]{"item_pass_company", "item_pass_company", "item_pass_company", "item_pass_company", "item_pass_company"}, new int[]{3, 4, 5, 6, 7}, new int[]{R.layout.item_pass_company, R.layout.item_pass_company, R.layout.item_pass_company, R.layout.item_pass_company, R.layout.item_pass_company});
        sViewsWithIds.put(R.id.btnAddINN, 8);
        sViewsWithIds.put(R.id.btnAddOGRN, 9);
        sViewsWithIds.put(R.id.btnAddRent, 10);
        sViewsWithIds.put(R.id.rvDocuments, 11);
        sViewsWithIds.put(R.id.pb, 12);
    }

    public FragmentCoronaCreateCompanyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private FragmentCoronaCreateCompanyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, objArr[8], objArr[9], objArr[10], objArr[2], objArr[3], objArr[7], objArr[6], objArr[12], objArr[11], objArr[4], objArr[5]);
        this.firstvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentCoronaCreateCompanyBindingImpl.this.first.getValue();
                PassCompanyVM passCompanyVM = FragmentCoronaCreateCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<NewCompanyOUT> newCompany = passCompanyVM.getNewCompany();
                    if (newCompany != null) {
                        NewCompanyOUT newCompanyOUT = newCompany.get();
                        if (newCompanyOUT == null) {
                            z = false;
                        }
                        if (z) {
                            newCompanyOUT.setTitle(value);
                        }
                    }
                }
            }
        };
        this.fivethvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentCoronaCreateCompanyBindingImpl.this.fiveth.getValue();
                PassCompanyVM passCompanyVM = FragmentCoronaCreateCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<NewCompanyOUT> newCompany = passCompanyVM.getNewCompany();
                    if (newCompany != null) {
                        NewCompanyOUT newCompanyOUT = newCompany.get();
                        if (newCompanyOUT == null) {
                            z = false;
                        }
                        if (z) {
                            newCompanyOUT.setActual_address(value);
                        }
                    }
                }
            }
        };
        this.fourthvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentCoronaCreateCompanyBindingImpl.this.fourth.getValue();
                PassCompanyVM passCompanyVM = FragmentCoronaCreateCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<NewCompanyOUT> newCompany = passCompanyVM.getNewCompany();
                    if (newCompany != null) {
                        NewCompanyOUT newCompanyOUT = newCompany.get();
                        if (newCompanyOUT == null) {
                            z = false;
                        }
                        if (z) {
                            newCompanyOUT.setOkved(value);
                        }
                    }
                }
            }
        };
        this.secondvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentCoronaCreateCompanyBindingImpl.this.second.getValue();
                PassCompanyVM passCompanyVM = FragmentCoronaCreateCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<NewCompanyOUT> newCompany = passCompanyVM.getNewCompany();
                    if (newCompany != null) {
                        NewCompanyOUT newCompanyOUT = newCompany.get();
                        if (newCompanyOUT == null) {
                            z = false;
                        }
                        if (z) {
                            newCompanyOUT.setInn(value);
                        }
                    }
                }
            }
        };
        this.thirdvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentCoronaCreateCompanyBindingImpl.this.third.getValue();
                PassCompanyVM passCompanyVM = FragmentCoronaCreateCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<NewCompanyOUT> newCompany = passCompanyVM.getNewCompany();
                    if (newCompany != null) {
                        NewCompanyOUT newCompanyOUT = newCompany.get();
                        if (newCompanyOUT == null) {
                            z = false;
                        }
                        if (z) {
                            newCompanyOUT.setOgrn(value);
                        }
                    }
                }
            }
        };
        this.mDirtyFlags = -1;
        this.btnCreatePass.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.mboundView1 = objArr[1];
        this.mboundView1.setTag((Object) null);
        setRootTag(view);
        this.mCallback1 = new OnClickListener(this, 1);
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
        this.fiveth.invalidateAll();
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
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.fiveth.hasPendingBindings() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
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
            long r0 = r6.mDirtyFlags     // Catch:{ all -> 0x003c }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x003c }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x003c }
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r6.first
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r6.second
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r6.third
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r6.fourth
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r6.fiveth
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            r0 = 0
            return r0
        L_0x003c:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentCoronaCreateCompanyBindingImpl.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, Object obj) {
        if (26 != i) {
            return false;
        }
        setVm((PassCompanyVM) obj);
        return true;
    }

    public void setVm(PassCompanyVM passCompanyVM) {
        this.mVm = passCompanyVM;
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
        this.fiveth.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeVmNewCompany((ObservableField) obj, i2);
        }
        if (i == 1) {
            return onChangeSecond((ItemPassCompanyBinding) obj, i2);
        }
        if (i == 2) {
            return onChangeFourth((ItemPassCompanyBinding) obj, i2);
        }
        if (i == 3) {
            return onChangeFiveth((ItemPassCompanyBinding) obj, i2);
        }
        if (i == 4) {
            return onChangeFirst((ItemPassCompanyBinding) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return onChangeThird((ItemPassCompanyBinding) obj, i2);
    }

    private boolean onChangeVmNewCompany(ObservableField<NewCompanyOUT> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeSecond(ItemPassCompanyBinding itemPassCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeFourth(ItemPassCompanyBinding itemPassCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeFiveth(ItemPassCompanyBinding itemPassCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeFirst(ItemPassCompanyBinding itemPassCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeThird(ItemPassCompanyBinding itemPassCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.mDirtyFlags     // Catch:{ all -> 0x015b }
            r2 = 0
            r13.mDirtyFlags = r2     // Catch:{ all -> 0x015b }
            monitor-exit(r13)     // Catch:{ all -> 0x015b }
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM r4 = r13.mVm
            r5 = 193(0xc1, double:9.54E-322)
            long r5 = r5 & r0
            r7 = 0
            r8 = 0
            int r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x003f
            if (r4 == 0) goto L_0x001a
            androidx.databinding.ObservableField r4 = r4.getNewCompany()
            goto L_0x001b
        L_0x001a:
            r4 = r8
        L_0x001b:
            r13.updateRegistration((int) r7, (androidx.databinding.Observable) r4)
            if (r4 == 0) goto L_0x0027
            java.lang.Object r4 = r4.get()
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.NewCompanyOUT r4 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyOUT) r4
            goto L_0x0028
        L_0x0027:
            r4 = r8
        L_0x0028:
            if (r4 == 0) goto L_0x003f
            java.lang.String r8 = r4.getTitle()
            java.lang.String r5 = r4.getActual_address()
            java.lang.String r6 = r4.getOgrn()
            java.lang.String r10 = r4.getInn()
            java.lang.String r4 = r4.getOkved()
            goto L_0x0043
        L_0x003f:
            r4 = r8
            r5 = r4
            r6 = r5
            r10 = r6
        L_0x0043:
            r11 = 128(0x80, double:6.32E-322)
            long r0 = r0 & r11
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x0110
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r0 = r13.btnCreatePass
            android.view.View$OnClickListener r1 = r13.mCallback1
            r0.setOnClickListener(r1)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.first
            android.view.View r1 = r13.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887505(0x7f120591, float:1.9409619E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.first
            androidx.databinding.InverseBindingListener r1 = r13.mOldEventValue37445242
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r2 = r13.firstvalue
            setBindingInverseListener(r0, r1, r2)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.first
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r0.setIsRequired(r2)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.fiveth
            android.view.View r2 = r13.getRoot()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131886166(0x7f120056, float:1.9406903E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setTitle(r2)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.fiveth
            androidx.databinding.InverseBindingListener r2 = r13.mOldEventValue1106921706
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r3 = r13.fivethvalue
            setBindingInverseListener(r0, r2, r3)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.fiveth
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r0.setIsRequired(r2)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.fourth
            android.view.View r2 = r13.getRoot()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131886980(0x7f120384, float:1.9408554E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setTitle(r2)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.fourth
            androidx.databinding.InverseBindingListener r2 = r13.mOldEventValue1730794889
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r3 = r13.fourthvalue
            setBindingInverseListener(r0, r2, r3)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.fourth
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            r0.setIsRequired(r2)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.second
            android.view.View r2 = r13.getRoot()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131886976(0x7f120380, float:1.9408546E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setTitle(r2)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.second
            androidx.databinding.InverseBindingListener r2 = r13.mOldEventValue1151416645
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r3 = r13.secondvalue
            setBindingInverseListener(r0, r2, r3)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.second
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r0.setIsRequired(r2)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.third
            android.view.View r2 = r13.getRoot()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131886979(0x7f120383, float:1.9408552E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setTitle(r2)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.third
            androidx.databinding.InverseBindingListener r2 = r13.mOldEventValue2056559304
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r3 = r13.thirdvalue
            setBindingInverseListener(r0, r2, r3)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.third
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setIsRequired(r1)
        L_0x0110:
            if (r9 == 0) goto L_0x012b
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.first
            r0.setValue(r8)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.fiveth
            r0.setValue(r5)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.fourth
            r0.setValue(r4)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.second
            r0.setValue(r10)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.third
            r0.setValue(r6)
        L_0x012b:
            if (r11 == 0) goto L_0x0141
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r13.firstvalue
            r13.mOldEventValue37445242 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r13.fivethvalue
            r13.mOldEventValue1106921706 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r13.fourthvalue
            r13.mOldEventValue1730794889 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r13.secondvalue
            r13.mOldEventValue1151416645 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r13.thirdvalue
            r13.mOldEventValue2056559304 = r0
        L_0x0141:
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.first
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.second
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.third
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.fourth
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r13.fiveth
            executeBindingsOn(r0)
            return
        L_0x015b:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x015b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentCoronaCreateCompanyBindingImpl.executeBindings():void");
    }

    public final void _internalCallbackOnClick(int i, View view) {
        PassCompanyVM passCompanyVM = this.mVm;
        if (passCompanyVM != null) {
            passCompanyVM.createCompany();
        }
    }
}
