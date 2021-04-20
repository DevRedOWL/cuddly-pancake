package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.generated.callback.OnClickListener;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;

/* renamed from: ru.unicorn.databinding.FragmentConnectToCompanyBindingImpl */
public class FragmentConnectToCompanyBindingImpl extends FragmentConnectToCompanyBinding implements OnClickListener.Listener {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(7);
    private static final SparseIntArray sViewsWithIds = null;
    private ViewDataBinding.PropertyChangedInverseListener firstvalue;
    private ViewDataBinding.PropertyChangedInverseListener fivethvalue;
    private final View.OnClickListener mCallback6;
    private long mDirtyFlags;
    private InverseBindingListener mOldEventValue1273023114;
    private InverseBindingListener mOldEventValue1277483600;
    private InverseBindingListener mOldEventValue1725609181;
    private InverseBindingListener mOldEventValue449511799;
    private final ScrollView mboundView0;
    private final LinearLayout mboundView1;
    private ViewDataBinding.PropertyChangedInverseListener secondvalue;
    private ViewDataBinding.PropertyChangedInverseListener thirdvalue;

    static {
        sIncludes.setIncludes(1, new String[]{"item_pass_company_info", "item_pass_company_info", "item_pass_company_info", "item_pass_company_info"}, new int[]{3, 4, 5, 6}, new int[]{R.layout.item_pass_company_info, R.layout.item_pass_company_info, R.layout.item_pass_company_info, R.layout.item_pass_company_info});
    }

    public FragmentConnectToCompanyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    private FragmentConnectToCompanyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, objArr[2], objArr[3], objArr[6], objArr[4], objArr[5]);
        this.firstvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentConnectToCompanyBindingImpl.this.first.getValue();
                PassCompanyVM passCompanyVM = FragmentConnectToCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<RentCompany> currentCompanyOUT = passCompanyVM.getCurrentCompanyOUT();
                    if (currentCompanyOUT != null) {
                        RentCompany rentCompany = currentCompanyOUT.get();
                        if (rentCompany == null) {
                            z = false;
                        }
                        if (z) {
                            rentCompany.setTitle(value);
                        }
                    }
                }
            }
        };
        this.fivethvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentConnectToCompanyBindingImpl.this.fiveth.getValue();
                PassCompanyVM passCompanyVM = FragmentConnectToCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<RentCompany> currentCompanyOUT = passCompanyVM.getCurrentCompanyOUT();
                    if (currentCompanyOUT != null) {
                        RentCompany rentCompany = currentCompanyOUT.get();
                        if (rentCompany == null) {
                            z = false;
                        }
                        if (z) {
                            rentCompany.setOkved(value);
                        }
                    }
                }
            }
        };
        this.secondvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentConnectToCompanyBindingImpl.this.second.getValue();
                PassCompanyVM passCompanyVM = FragmentConnectToCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<RentCompany> currentCompanyOUT = passCompanyVM.getCurrentCompanyOUT();
                    if (currentCompanyOUT != null) {
                        RentCompany rentCompany = currentCompanyOUT.get();
                        if (rentCompany == null) {
                            z = false;
                        }
                        if (z) {
                            rentCompany.setInn(value);
                        }
                    }
                }
            }
        };
        this.thirdvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentConnectToCompanyBindingImpl.this.third.getValue();
                PassCompanyVM passCompanyVM = FragmentConnectToCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<RentCompany> currentCompanyOUT = passCompanyVM.getCurrentCompanyOUT();
                    if (currentCompanyOUT != null) {
                        RentCompany rentCompany = currentCompanyOUT.get();
                        if (rentCompany == null) {
                            z = false;
                        }
                        if (z) {
                            rentCompany.setOgrn(value);
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
        this.mCallback6 = new OnClickListener(this, 1);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 64;
        }
        this.first.invalidateAll();
        this.second.invalidateAll();
        this.third.invalidateAll();
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
        if (r6.fiveth.hasPendingBindings() == false) goto L_0x0031;
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
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r6.first
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r6.second
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r6.third
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r6.fiveth
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentConnectToCompanyBindingImpl.hasPendingBindings():boolean");
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
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.first.setLifecycleOwner(lifecycleOwner);
        this.second.setLifecycleOwner(lifecycleOwner);
        this.third.setLifecycleOwner(lifecycleOwner);
        this.fiveth.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeVmCurrentCompanyOUT((ObservableField) obj, i2);
        }
        if (i == 1) {
            return onChangeFirst((ItemPassCompanyInfoBinding) obj, i2);
        }
        if (i == 2) {
            return onChangeSecond((ItemPassCompanyInfoBinding) obj, i2);
        }
        if (i == 3) {
            return onChangeThird((ItemPassCompanyInfoBinding) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return onChangeFiveth((ItemPassCompanyInfoBinding) obj, i2);
    }

    private boolean onChangeVmCurrentCompanyOUT(ObservableField<RentCompany> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeFirst(ItemPassCompanyInfoBinding itemPassCompanyInfoBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeSecond(ItemPassCompanyInfoBinding itemPassCompanyInfoBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeThird(ItemPassCompanyInfoBinding itemPassCompanyInfoBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeFiveth(ItemPassCompanyInfoBinding itemPassCompanyInfoBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r11 = this;
            monitor-enter(r11)
            long r0 = r11.mDirtyFlags     // Catch:{ all -> 0x00fd }
            r2 = 0
            r11.mDirtyFlags = r2     // Catch:{ all -> 0x00fd }
            monitor-exit(r11)     // Catch:{ all -> 0x00fd }
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM r4 = r11.mVm
            r5 = 97
            long r5 = r5 & r0
            r7 = 0
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x003b
            if (r4 == 0) goto L_0x0019
            androidx.databinding.ObservableField r4 = r4.getCurrentCompanyOUT()
            goto L_0x001a
        L_0x0019:
            r4 = r7
        L_0x001a:
            r5 = 0
            r11.updateRegistration((int) r5, (androidx.databinding.Observable) r4)
            if (r4 == 0) goto L_0x0027
            java.lang.Object r4 = r4.get()
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r4 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany) r4
            goto L_0x0028
        L_0x0027:
            r4 = r7
        L_0x0028:
            if (r4 == 0) goto L_0x003b
            java.lang.String r7 = r4.getTitle()
            java.lang.String r5 = r4.getInn()
            java.lang.String r6 = r4.getOkved()
            java.lang.String r4 = r4.getOgrn()
            goto L_0x003e
        L_0x003b:
            r4 = r7
            r5 = r4
            r6 = r5
        L_0x003e:
            r9 = 64
            long r0 = r0 & r9
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x00c0
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r0 = r11.btnCreatePass
            android.view.View$OnClickListener r1 = r11.mCallback6
            r0.setOnClickListener(r1)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.first
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887128(0x7f120418, float:1.9408854E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.first
            androidx.databinding.InverseBindingListener r1 = r11.mOldEventValue1277483600
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r2 = r11.firstvalue
            setBindingInverseListener(r0, r1, r2)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.fiveth
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131886980(0x7f120384, float:1.9408554E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.fiveth
            androidx.databinding.InverseBindingListener r1 = r11.mOldEventValue449511799
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r2 = r11.fivethvalue
            setBindingInverseListener(r0, r1, r2)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.second
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131886976(0x7f120380, float:1.9408546E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.second
            androidx.databinding.InverseBindingListener r1 = r11.mOldEventValue1725609181
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r2 = r11.secondvalue
            setBindingInverseListener(r0, r1, r2)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.third
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131886979(0x7f120383, float:1.9408552E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.third
            androidx.databinding.InverseBindingListener r1 = r11.mOldEventValue1273023114
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r2 = r11.thirdvalue
            setBindingInverseListener(r0, r1, r2)
        L_0x00c0:
            if (r8 == 0) goto L_0x00d6
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.first
            r0.setValue(r7)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.fiveth
            r0.setValue(r6)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.second
            r0.setValue(r5)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.third
            r0.setValue(r4)
        L_0x00d6:
            if (r9 == 0) goto L_0x00e8
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r11.firstvalue
            r11.mOldEventValue1277483600 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r11.fivethvalue
            r11.mOldEventValue449511799 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r11.secondvalue
            r11.mOldEventValue1725609181 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r11.thirdvalue
            r11.mOldEventValue1273023114 = r0
        L_0x00e8:
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.first
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.second
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.third
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassCompanyInfoBinding r0 = r11.fiveth
            executeBindingsOn(r0)
            return
        L_0x00fd:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00fd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentConnectToCompanyBindingImpl.executeBindings():void");
    }

    public final void _internalCallbackOnClick(int i, View view) {
        PassCompanyVM passCompanyVM = this.mVm;
        if (passCompanyVM != null) {
            passCompanyVM.connectTo();
        }
    }
}
