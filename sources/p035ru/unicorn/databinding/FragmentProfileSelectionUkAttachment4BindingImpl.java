package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.databinding.FragmentProfileSelectionUkAttachment4BindingImpl */
public class FragmentProfileSelectionUkAttachment4BindingImpl extends FragmentProfileSelectionUkAttachment4Binding {
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

    public FragmentProfileSelectionUkAttachment4BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentProfileSelectionUkAttachment4BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentProfileSelectionUkAttachment4BindingImpl.hasPendingBindings():boolean");
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
                return onChangeOne((ItemProfileChooserStage4Binding) obj, i2);
            case 1:
                return onChangeVmSelectedBusCenterAddress((LiveData) obj, i2);
            case 2:
                return onChangeVmSelectedApartmentNumber((MutableLiveData) obj, i2);
            case 3:
                return onChangeVmSelectedBusCenter((LiveData) obj, i2);
            case 4:
                return onChangeThree((ItemProfileChooserStage4Binding) obj, i2);
            case 5:
                return onChangeTwo((ItemProfileChooserStage4Binding) obj, i2);
            case 6:
                return onChangeVmSelectedCity((LiveData) obj, i2);
            default:
                return false;
        }
    }

    private boolean onChangeOne(ItemProfileChooserStage4Binding itemProfileChooserStage4Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmSelectedBusCenterAddress(LiveData<BusinessBuildings> liveData, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVmSelectedApartmentNumber(MutableLiveData<String> mutableLiveData, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeVmSelectedBusCenter(LiveData<BusinessCenterDTO> liveData, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeThree(ItemProfileChooserStage4Binding itemProfileChooserStage4Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeTwo(ItemProfileChooserStage4Binding itemProfileChooserStage4Binding, int i) {
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
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r21 = this;
            r1 = r21
            monitor-enter(r21)
            long r2 = r1.mDirtyFlags     // Catch:{ all -> 0x0157 }
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x0157 }
            monitor-exit(r21)     // Catch:{ all -> 0x0157 }
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM r0 = r1.mVm
            r6 = 462(0x1ce, double:2.283E-321)
            long r6 = r6 & r2
            r8 = 392(0x188, double:1.937E-321)
            r10 = 388(0x184, double:1.917E-321)
            r12 = 448(0x1c0, double:2.213E-321)
            r14 = 386(0x182, double:1.907E-321)
            r16 = 0
            int r17 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x00ba
            long r6 = r2 & r14
            int r17 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x0042
            if (r0 == 0) goto L_0x002a
            androidx.lifecycle.LiveData r6 = r0.getSelectedBusCenterAddress()
            goto L_0x002c
        L_0x002a:
            r6 = r16
        L_0x002c:
            r7 = 1
            r1.updateLiveDataRegistration(r7, r6)
            if (r6 == 0) goto L_0x0039
            java.lang.Object r6 = r6.getValue()
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings r6 = (p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings) r6
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
            long r17 = r2 & r10
            int r7 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0069
            if (r0 == 0) goto L_0x0051
            androidx.lifecycle.MutableLiveData r7 = r0.getSelectedApartmentNumber()
            goto L_0x0053
        L_0x0051:
            r7 = r16
        L_0x0053:
            r14 = 2
            r1.updateLiveDataRegistration(r14, r7)
            if (r7 == 0) goto L_0x0060
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0062
        L_0x0060:
            r7 = r16
        L_0x0062:
            if (r7 == 0) goto L_0x0069
            java.lang.String r7 = r7.toString()
            goto L_0x006b
        L_0x0069:
            r7 = r16
        L_0x006b:
            long r14 = r2 & r8
            int r19 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r19 == 0) goto L_0x0090
            if (r0 == 0) goto L_0x0078
            androidx.lifecycle.LiveData r14 = r0.getSelectedBusCenter()
            goto L_0x007a
        L_0x0078:
            r14 = r16
        L_0x007a:
            r15 = 3
            r1.updateLiveDataRegistration(r15, r14)
            if (r14 == 0) goto L_0x0087
            java.lang.Object r14 = r14.getValue()
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO r14 = (p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO) r14
            goto L_0x0089
        L_0x0087:
            r14 = r16
        L_0x0089:
            if (r14 == 0) goto L_0x0090
            java.lang.String r14 = r14.getTitle()
            goto L_0x0092
        L_0x0090:
            r14 = r16
        L_0x0092:
            long r19 = r2 & r12
            int r15 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x00b6
            if (r0 == 0) goto L_0x009f
            androidx.lifecycle.LiveData r15 = r0.getSelectedCity()
            goto L_0x00a1
        L_0x009f:
            r15 = r16
        L_0x00a1:
            r8 = 6
            r1.updateLiveDataRegistration(r8, r15)
            if (r15 == 0) goto L_0x00ae
            java.lang.Object r8 = r15.getValue()
            ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO r8 = (p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO) r8
            goto L_0x00b0
        L_0x00ae:
            r8 = r16
        L_0x00b0:
            if (r8 == 0) goto L_0x00b6
            java.lang.String r16 = r8.getName()
        L_0x00b6:
            r8 = r6
            r6 = r16
            goto L_0x00bf
        L_0x00ba:
            r6 = r16
            r7 = r6
            r8 = r7
            r14 = r8
        L_0x00bf:
            r15 = 256(0x100, double:1.265E-321)
            long r15 = r15 & r2
            int r9 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0102
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r9 = r1.one
            android.view.View r15 = r21.getRoot()
            android.content.res.Resources r15 = r15.getResources()
            r10 = 2131888213(0x7f120855, float:1.9411055E38)
            java.lang.String r10 = r15.getString(r10)
            r9.setTitle(r10)
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r9 = r1.three
            android.view.View r10 = r21.getRoot()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131888198(0x7f120846, float:1.9411025E38)
            java.lang.String r10 = r10.getString(r11)
            r9.setTitle(r10)
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r9 = r1.two
            android.view.View r10 = r21.getRoot()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131888197(0x7f120845, float:1.9411023E38)
            java.lang.String r10 = r10.getString(r11)
            r9.setTitle(r10)
        L_0x0102:
            long r9 = r2 & r12
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x010d
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r9 = r1.one
            r9.setValue(r6)
        L_0x010d:
            r9 = 384(0x180, double:1.897E-321)
            long r9 = r9 & r2
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0123
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r6 = r1.one
            r6.setVm(r0)
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r6 = r1.three
            r6.setVm(r0)
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r6 = r1.two
            r6.setVm(r0)
        L_0x0123:
            r9 = 388(0x184, double:1.917E-321)
            long r9 = r9 & r2
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x012f
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.three
            r0.setValue(r7)
        L_0x012f:
            r6 = 392(0x188, double:1.937E-321)
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x013b
            android.widget.TextView r0 = r1.title
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r14)
        L_0x013b:
            r6 = 386(0x182, double:1.907E-321)
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0147
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.two
            r0.setValue(r8)
        L_0x0147:
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.one
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.two
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemProfileChooserStage4Binding r0 = r1.three
            executeBindingsOn(r0)
            return
        L_0x0157:
            r0 = move-exception
            monitor-exit(r21)     // Catch:{ all -> 0x0157 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentProfileSelectionUkAttachment4BindingImpl.executeBindings():void");
    }
}
