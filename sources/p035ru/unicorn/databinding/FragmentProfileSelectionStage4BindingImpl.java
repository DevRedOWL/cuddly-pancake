package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.databinding.FragmentProfileSelectionStage4BindingImpl */
public class FragmentProfileSelectionStage4BindingImpl extends FragmentProfileSelectionStage4Binding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(10);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    private final LinearLayout mboundView1;

    static {
        sIncludes.setIncludes(1, new String[]{"item_profile_chooser_stage_4", "item_profile_chooser_stage_4", "item_profile_chooser_stage_4"}, new int[]{3, 4, 5}, new int[]{R.layout.item_profile_chooser_stage_4, R.layout.item_profile_chooser_stage_4, R.layout.item_profile_chooser_stage_4});
        sViewsWithIds.put(R.id.underline, 6);
        sViewsWithIds.put(R.id.description, 7);
        sViewsWithIds.put(R.id.btn_next, 8);
        sViewsWithIds.put(R.id.pb, 9);
    }

    public FragmentProfileSelectionStage4BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentProfileSelectionStage4BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, objArr[8], objArr[7], objArr[3], objArr[9], objArr[5], objArr[2], objArr[4], objArr[6]);
        this.mDirtyFlags = -1;
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.mboundView1 = objArr[1];
        this.mboundView1.setTag((Object) null);
        this.title.setTag((Object) null);
        View view2 = view;
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 256;
        }
        this.one.invalidateAll();
        this.two.invalidateAll();
        this.three.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.two.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.three.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.one.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasPendingBindings() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.mDirtyFlags     // Catch:{ all -> 0x002a }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x002a }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x002a }
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r6.one
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r6.two
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r6.three
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            r0 = 0
            return r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentProfileSelectionStage4BindingImpl.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, Object obj) {
        if (26 != i) {
            return false;
        }
        setVm((ProfileSelectionVM) obj);
        return true;
    }

    public void setVm(ProfileSelectionVM profileSelectionVM) {
        this.mVm = profileSelectionVM;
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.one.setLifecycleOwner(lifecycleOwner);
        this.two.setLifecycleOwner(lifecycleOwner);
        this.three.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return onChangeVmSelectedBusCenter((LiveData) obj, i2);
            case 1:
                return onChangeOne((ItemProfileChooserStage4Binding) obj, i2);
            case 2:
                return onChangeVmSelectedBusCenterAddress((LiveData) obj, i2);
            case 3:
                return onChangeThree((ItemProfileChooserStage4Binding) obj, i2);
            case 4:
                return onChangeTwo((ItemProfileChooserStage4Binding) obj, i2);
            case 5:
                return onChangeVmSelectRoleName((LiveData) obj, i2);
            case 6:
                return onChangeVmSelectedCity((LiveData) obj, i2);
            default:
                return false;
        }
    }

    private boolean onChangeVmSelectedBusCenter(LiveData<BusinessCenterDTO> liveData, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeOne(ItemProfileChooserStage4Binding itemProfileChooserStage4Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVmSelectedBusCenterAddress(LiveData<BusinessBuildings> liveData, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeThree(ItemProfileChooserStage4Binding itemProfileChooserStage4Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeTwo(ItemProfileChooserStage4Binding itemProfileChooserStage4Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeVmSelectRoleName(LiveData<String> liveData, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeVmSelectedCity(LiveData<CityDTO> liveData, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r21 = this;
            r1 = r21
            monitor-enter(r21)
            long r2 = r1.mDirtyFlags     // Catch:{ all -> 0x014c }
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x014c }
            monitor-exit(r21)     // Catch:{ all -> 0x014c }
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM r0 = r1.mVm
            r6 = 485(0x1e5, double:2.396E-321)
            long r6 = r6 & r2
            r8 = 416(0x1a0, double:2.055E-321)
            r10 = 448(0x1c0, double:2.213E-321)
            r12 = 388(0x184, double:1.917E-321)
            r14 = 385(0x181, double:1.9E-321)
            r16 = 0
            int r17 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x00b2
            long r6 = r2 & r14
            int r17 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x0042
            if (r0 == 0) goto L_0x002a
            androidx.lifecycle.LiveData r6 = r0.getSelectedBusCenter()
            goto L_0x002c
        L_0x002a:
            r6 = r16
        L_0x002c:
            r7 = 0
            r1.updateLiveDataRegistration(r7, r6)
            if (r6 == 0) goto L_0x0039
            java.lang.Object r6 = r6.getValue()
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO r6 = (p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO) r6
            goto L_0x003b
        L_0x0039:
            r6 = r16
        L_0x003b:
            if (r6 == 0) goto L_0x0042
            java.lang.String r6 = r6.getTitle()
            goto L_0x0044
        L_0x0042:
            r6 = r16
        L_0x0044:
            long r17 = r2 & r12
            int r7 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0069
            if (r0 == 0) goto L_0x0051
            androidx.lifecycle.LiveData r7 = r0.getSelectedBusCenterAddress()
            goto L_0x0053
        L_0x0051:
            r7 = r16
        L_0x0053:
            r12 = 2
            r1.updateLiveDataRegistration(r12, r7)
            if (r7 == 0) goto L_0x0060
            java.lang.Object r7 = r7.getValue()
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings r7 = (p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings) r7
            goto L_0x0062
        L_0x0060:
            r7 = r16
        L_0x0062:
            if (r7 == 0) goto L_0x0069
            java.lang.String r7 = r7.getTitle()
            goto L_0x006b
        L_0x0069:
            r7 = r16
        L_0x006b:
            long r12 = r2 & r8
            int r19 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r19 == 0) goto L_0x0087
            if (r0 == 0) goto L_0x0078
            androidx.lifecycle.LiveData r12 = r0.getSelectRoleName()
            goto L_0x007a
        L_0x0078:
            r12 = r16
        L_0x007a:
            r13 = 5
            r1.updateLiveDataRegistration(r13, r12)
            if (r12 == 0) goto L_0x0087
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x0089
        L_0x0087:
            r12 = r16
        L_0x0089:
            long r19 = r2 & r10
            int r13 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00ad
            if (r0 == 0) goto L_0x0096
            androidx.lifecycle.LiveData r13 = r0.getSelectedCity()
            goto L_0x0098
        L_0x0096:
            r13 = r16
        L_0x0098:
            r14 = 6
            r1.updateLiveDataRegistration(r14, r13)
            if (r13 == 0) goto L_0x00a5
            java.lang.Object r13 = r13.getValue()
            ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO r13 = (p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO) r13
            goto L_0x00a7
        L_0x00a5:
            r13 = r16
        L_0x00a7:
            if (r13 == 0) goto L_0x00ad
            java.lang.String r16 = r13.getName()
        L_0x00ad:
            r13 = r7
            r7 = r6
            r6 = r16
            goto L_0x00b7
        L_0x00b2:
            r6 = r16
            r7 = r6
            r12 = r7
            r13 = r12
        L_0x00b7:
            r14 = 384(0x180, double:1.897E-321)
            long r14 = r14 & r2
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x00cd
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r14 = r1.one
            r14.setVm(r0)
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r14 = r1.three
            r14.setVm(r0)
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r14 = r1.two
            r14.setVm(r0)
        L_0x00cd:
            r14 = 256(0x100, double:1.265E-321)
            long r14 = r14 & r2
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0110
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.one
            android.view.View r14 = r21.getRoot()
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131888213(0x7f120855, float:1.9411055E38)
            java.lang.String r14 = r14.getString(r15)
            r0.setTitle(r14)
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.three
            android.view.View r14 = r21.getRoot()
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131888235(0x7f12086b, float:1.94111E38)
            java.lang.String r14 = r14.getString(r15)
            r0.setTitle(r14)
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.two
            android.view.View r14 = r21.getRoot()
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131888197(0x7f120845, float:1.9411023E38)
            java.lang.String r14 = r14.getString(r15)
            r0.setTitle(r14)
        L_0x0110:
            long r10 = r10 & r2
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x011a
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.one
            r0.setValue(r6)
        L_0x011a:
            long r8 = r8 & r2
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0124
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.three
            r0.setValue(r12)
        L_0x0124:
            r8 = 385(0x181, double:1.9E-321)
            long r8 = r8 & r2
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0130
            android.widget.TextView r0 = r1.title
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r7)
        L_0x0130:
            r6 = 388(0x184, double:1.917E-321)
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x013c
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.two
            r0.setValue(r13)
        L_0x013c:
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.one
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.two
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.three
            executeBindingsOn(r0)
            return
        L_0x014c:
            r0 = move-exception
            monitor-exit(r21)     // Catch:{ all -> 0x014c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentProfileSelectionStage4BindingImpl.executeBindings():void");
    }
}
