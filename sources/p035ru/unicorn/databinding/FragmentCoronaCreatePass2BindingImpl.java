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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.CoronaViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.CreatePassDTO;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;

/* renamed from: ru.unicorn.databinding.FragmentCoronaCreatePass2BindingImpl */
public class FragmentCoronaCreatePass2BindingImpl extends FragmentCoronaCreatePass2Binding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(7);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private InverseBindingListener mOldEventValue2019848636;
    private final ScrollView mboundView0;
    private final LinearLayout mboundView1;
    private ViewDataBinding.PropertyChangedInverseListener thirdvalue;

    static {
        sIncludes.setIncludes(1, new String[]{"item_pass", "item_pass_arrow", "item_pass_editable", "item_pass_arrow"}, new int[]{2, 3, 4, 5}, new int[]{R.layout.item_pass, R.layout.item_pass_arrow, R.layout.item_pass_editable, R.layout.item_pass_arrow});
        sViewsWithIds.put(R.id.btn_create_pass, 6);
    }

    public FragmentCoronaCreatePass2BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    private FragmentCoronaCreatePass2BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 8, objArr[6], objArr[2], objArr[5], objArr[3], objArr[4]);
        this.thirdvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentCoronaCreatePass2BindingImpl.this.third.getValue();
                CoronaViewModel coronaViewModel = FragmentCoronaCreatePass2BindingImpl.this.mVm;
                boolean z = true;
                if (coronaViewModel != null) {
                    ObservableField<CreatePassDTO> tempPass = coronaViewModel.getTempPass();
                    if (tempPass != null) {
                        CreatePassDTO createPassDTO = tempPass.get();
                        if (createPassDTO != null) {
                            ObservableField<String> text = createPassDTO.getText();
                            if (text == null) {
                                z = false;
                            }
                            if (z) {
                                text.set(value);
                            }
                        }
                    }
                }
            }
        };
        this.mDirtyFlags = -1;
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.mboundView1 = objArr[1];
        this.mboundView1.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 512;
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
            ru.unicorn.databinding.ItemPassBinding r0 = r6.first
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemPassArrowBinding r0 = r6.second
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemPassEditableBinding r0 = r6.third
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemPassArrowBinding r0 = r6.fourth
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentCoronaCreatePass2BindingImpl.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, Object obj) {
        if (26 != i) {
            return false;
        }
        setVm((CoronaViewModel) obj);
        return true;
    }

    public void setVm(CoronaViewModel coronaViewModel) {
        this.mVm = coronaViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 256;
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
        switch (i) {
            case 0:
                return onChangeSecond((ItemPassArrowBinding) obj, i2);
            case 1:
                return onChangeFourth((ItemPassArrowBinding) obj, i2);
            case 2:
                return onChangeVmCurrentAddress((ObservableField) obj, i2);
            case 3:
                return onChangeFirst((ItemPassBinding) obj, i2);
            case 4:
                return onChangeThird((ItemPassEditableBinding) obj, i2);
            case 5:
                return onChangeVmTempPass((ObservableField) obj, i2);
            case 6:
                return onChangeVmTempPassText((ObservableField) obj, i2);
            case 7:
                return onChangeVmTempPassTimeAsText((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    private boolean onChangeSecond(ItemPassArrowBinding itemPassArrowBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeFourth(ItemPassArrowBinding itemPassArrowBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVmCurrentAddress(ObservableField<ProfileAdress> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeFirst(ItemPassBinding itemPassBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeThird(ItemPassEditableBinding itemPassEditableBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeVmTempPass(ObservableField<CreatePassDTO> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeVmTempPassText(ObservableField<String> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeVmTempPassTimeAsText(ObservableField<String> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            long r2 = r1.mDirtyFlags     // Catch:{ all -> 0x017a }
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x017a }
            monitor-exit(r18)     // Catch:{ all -> 0x017a }
            ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaViewModel r0 = r1.mVm
            r6 = 996(0x3e4, double:4.92E-321)
            long r6 = r6 & r2
            r8 = 864(0x360, double:4.27E-321)
            r10 = 928(0x3a0, double:4.585E-321)
            r12 = 772(0x304, double:3.814E-321)
            r14 = 0
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0095
            long r6 = r2 & r12
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x0027
            androidx.databinding.ObservableField r6 = r0.getCurrentAddress()
            goto L_0x0028
        L_0x0027:
            r6 = r14
        L_0x0028:
            r7 = 2
            r1.updateRegistration((int) r7, (androidx.databinding.Observable) r6)
            if (r6 == 0) goto L_0x0035
            java.lang.Object r6 = r6.get()
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress) r6
            goto L_0x0036
        L_0x0035:
            r6 = r14
        L_0x0036:
            if (r6 == 0) goto L_0x003d
            java.lang.String r6 = r6.getAddress()
            goto L_0x003e
        L_0x003d:
            r6 = r14
        L_0x003e:
            r15 = 992(0x3e0, double:4.9E-321)
            long r15 = r15 & r2
            int r7 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0093
            if (r0 == 0) goto L_0x004c
            androidx.databinding.ObservableField r0 = r0.getTempPass()
            goto L_0x004d
        L_0x004c:
            r0 = r14
        L_0x004d:
            r7 = 5
            r1.updateRegistration((int) r7, (androidx.databinding.Observable) r0)
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.CreatePassDTO r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.CreatePassDTO) r0
            goto L_0x005b
        L_0x005a:
            r0 = r14
        L_0x005b:
            long r15 = r2 & r8
            int r7 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0076
            if (r0 == 0) goto L_0x0068
            androidx.databinding.ObservableField r7 = r0.getText()
            goto L_0x0069
        L_0x0068:
            r7 = r14
        L_0x0069:
            r15 = 6
            r1.updateRegistration((int) r15, (androidx.databinding.Observable) r7)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r7 = r7.get()
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0077
        L_0x0076:
            r7 = r14
        L_0x0077:
            long r15 = r2 & r10
            int r17 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x0097
            if (r0 == 0) goto L_0x0084
            androidx.databinding.ObservableField r0 = r0.getTimeAsText()
            goto L_0x0085
        L_0x0084:
            r0 = r14
        L_0x0085:
            r15 = 7
            r1.updateRegistration((int) r15, (androidx.databinding.Observable) r0)
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r0.get()
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x0097
        L_0x0093:
            r7 = r14
            goto L_0x0097
        L_0x0095:
            r6 = r14
            r7 = r6
        L_0x0097:
            r15 = 512(0x200, double:2.53E-321)
            long r15 = r15 & r2
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x013c
            ru.unicorn.databinding.ItemPassBinding r15 = r1.first
            android.view.View r16 = r18.getRoot()
            android.content.res.Resources r8 = r16.getResources()
            r9 = 2131887137(0x7f120421, float:1.9408873E38)
            java.lang.String r8 = r8.getString(r9)
            r15.setTitle(r8)
            ru.unicorn.databinding.ItemPassBinding r8 = r1.first
            android.view.View r9 = r18.getRoot()
            android.content.res.Resources r9 = r9.getResources()
            r15 = 2131886968(0x7f120378, float:1.940853E38)
            java.lang.String r9 = r9.getString(r15)
            r8.setValue(r9)
            ru.unicorn.databinding.ItemPassArrowBinding r8 = r1.fourth
            android.view.View r9 = r18.getRoot()
            android.content.res.Resources r9 = r9.getResources()
            r15 = 2131886956(0x7f12036c, float:1.9408505E38)
            java.lang.String r9 = r9.getString(r15)
            r8.setTitle(r9)
            ru.unicorn.databinding.ItemPassArrowBinding r8 = r1.fourth
            r9 = 1
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r9)
            r8.setArrow(r15)
            ru.unicorn.databinding.ItemPassArrowBinding r8 = r1.second
            android.view.View r15 = r18.getRoot()
            android.content.res.Resources r15 = r15.getResources()
            r12 = 2131886489(0x7f120199, float:1.9407558E38)
            java.lang.String r12 = r15.getString(r12)
            r8.setTitle(r12)
            ru.unicorn.databinding.ItemPassArrowBinding r8 = r1.second
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8.setArrow(r9)
            ru.unicorn.databinding.ItemPassEditableBinding r8 = r1.third
            android.view.View r9 = r18.getRoot()
            android.content.res.Resources r9 = r9.getResources()
            r12 = 2131886971(0x7f12037b, float:1.9408536E38)
            java.lang.String r9 = r9.getString(r12)
            r8.setTitle(r9)
            ru.unicorn.databinding.ItemPassEditableBinding r8 = r1.third
            androidx.databinding.InverseBindingListener r9 = r1.mOldEventValue2019848636
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r12 = r1.thirdvalue
            setBindingInverseListener(r8, r9, r12)
            ru.unicorn.databinding.ItemPassEditableBinding r8 = r1.third
            android.view.View r9 = r18.getRoot()
            android.content.res.Resources r9 = r9.getResources()
            r12 = 2131887133(0x7f12041d, float:1.9408864E38)
            java.lang.String r9 = r9.getString(r12)
            r8.setHint(r9)
            ru.unicorn.databinding.ItemPassEditableBinding r8 = r1.third
            r9 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8.setArrow(r9)
        L_0x013c:
            long r8 = r2 & r10
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x0147
            ru.unicorn.databinding.ItemPassArrowBinding r8 = r1.fourth
            r8.setValue(r14)
        L_0x0147:
            r8 = 772(0x304, double:3.814E-321)
            long r8 = r8 & r2
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x0153
            ru.unicorn.databinding.ItemPassArrowBinding r8 = r1.second
            r8.setValue(r6)
        L_0x0153:
            r8 = 864(0x360, double:4.27E-321)
            long r2 = r2 & r8
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x015f
            ru.unicorn.databinding.ItemPassEditableBinding r2 = r1.third
            r2.setValue(r7)
        L_0x015f:
            if (r0 == 0) goto L_0x0165
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.thirdvalue
            r1.mOldEventValue2019848636 = r0
        L_0x0165:
            ru.unicorn.databinding.ItemPassBinding r0 = r1.first
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassArrowBinding r0 = r1.second
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassEditableBinding r0 = r1.third
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassArrowBinding r0 = r1.fourth
            executeBindingsOn(r0)
            return
        L_0x017a:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x017a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentCoronaCreatePass2BindingImpl.executeBindings():void");
    }
}
