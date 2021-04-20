package p035ru.unicorn.databinding;

import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;

/* renamed from: ru.unicorn.databinding.FragmentPassProfileBindingImpl */
public class FragmentPassProfileBindingImpl extends FragmentPassProfileBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(14);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    private final LinearLayout mboundView1;

    static {
        sIncludes.setIncludes(1, new String[]{"item_pass_profile", "item_pass_profile", "item_pass_profile", "item_pass_profile_empty", "item_pass_profile", "item_pass_profile", "item_pass_profile", "item_pass_profile_empty", "item_pass_profile", "item_pass_profile", "item_pass_profile_empty"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, new int[]{R.layout.item_pass_profile, R.layout.item_pass_profile, R.layout.item_pass_profile, R.layout.item_pass_profile_empty, R.layout.item_pass_profile, R.layout.item_pass_profile, R.layout.item_pass_profile, R.layout.item_pass_profile_empty, R.layout.item_pass_profile, R.layout.item_pass_profile, R.layout.item_pass_profile_empty});
        sViewsWithIds.put(R.id.rv, 13);
    }

    public FragmentPassProfileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 14, sIncludes, sViewsWithIds));
    }

    private FragmentPassProfileBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 12, objArr[2], objArr[3], objArr[12], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8], objArr[9], objArr[10], objArr[11], objArr[13]);
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
            this.mDirtyFlags = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        this.first.invalidateAll();
        this.profile1.invalidateAll();
        this.profile2.invalidateAll();
        this.profile3.invalidateAll();
        this.profile4.invalidateAll();
        this.profile5.invalidateAll();
        this.profile6.invalidateAll();
        this.profile7.invalidateAll();
        this.profile8.invalidateAll();
        this.profile9.invalidateAll();
        this.profile10.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.profile1.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.profile2.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.profile3.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.profile4.hasPendingBindings() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6.profile5.hasPendingBindings() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r6.profile6.hasPendingBindings() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (r6.profile7.hasPendingBindings() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r6.profile8.hasPendingBindings() == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        if (r6.profile9.hasPendingBindings() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006d, code lost:
        if (r6.profile10.hasPendingBindings() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
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
            long r0 = r6.mDirtyFlags     // Catch:{ all -> 0x0072 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r6.first
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r6.profile1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r6.profile2
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemPassProfileEmptyBinding r0 = r6.profile3
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r6.profile4
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r6.profile5
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r6.profile6
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x004c
            return r4
        L_0x004c:
            ru.unicorn.databinding.ItemPassProfileEmptyBinding r0 = r6.profile7
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0055
            return r4
        L_0x0055:
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r6.profile8
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x005e
            return r4
        L_0x005e:
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r6.profile9
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0067
            return r4
        L_0x0067:
            ru.unicorn.databinding.ItemPassProfileEmptyBinding r0 = r6.profile10
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0070
            return r4
        L_0x0070:
            r0 = 0
            return r0
        L_0x0072:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentPassProfileBindingImpl.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, Object obj) {
        if (26 != i) {
            return false;
        }
        setVm((PassProfileVM) obj);
        return true;
    }

    public void setVm(PassProfileVM passProfileVM) {
        this.mVm = passProfileVM;
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.first.setLifecycleOwner(lifecycleOwner);
        this.profile1.setLifecycleOwner(lifecycleOwner);
        this.profile2.setLifecycleOwner(lifecycleOwner);
        this.profile3.setLifecycleOwner(lifecycleOwner);
        this.profile4.setLifecycleOwner(lifecycleOwner);
        this.profile5.setLifecycleOwner(lifecycleOwner);
        this.profile6.setLifecycleOwner(lifecycleOwner);
        this.profile7.setLifecycleOwner(lifecycleOwner);
        this.profile8.setLifecycleOwner(lifecycleOwner);
        this.profile9.setLifecycleOwner(lifecycleOwner);
        this.profile10.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return onChangeProfile1((ItemPassProfileBinding) obj, i2);
            case 1:
                return onChangeProfile3((ItemPassProfileEmptyBinding) obj, i2);
            case 2:
                return onChangeProfile5((ItemPassProfileBinding) obj, i2);
            case 3:
                return onChangeVmUserData((ObservableField) obj, i2);
            case 4:
                return onChangeProfile7((ItemPassProfileEmptyBinding) obj, i2);
            case 5:
                return onChangeProfile9((ItemPassProfileBinding) obj, i2);
            case 6:
                return onChangeProfile10((ItemPassProfileEmptyBinding) obj, i2);
            case 7:
                return onChangeFirst((ItemPassProfileBinding) obj, i2);
            case 8:
                return onChangeProfile2((ItemPassProfileBinding) obj, i2);
            case 9:
                return onChangeProfile4((ItemPassProfileBinding) obj, i2);
            case 10:
                return onChangeProfile6((ItemPassProfileBinding) obj, i2);
            case 11:
                return onChangeProfile8((ItemPassProfileBinding) obj, i2);
            default:
                return false;
        }
    }

    private boolean onChangeProfile1(ItemPassProfileBinding itemPassProfileBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeProfile3(ItemPassProfileEmptyBinding itemPassProfileEmptyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeProfile5(ItemPassProfileBinding itemPassProfileBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeVmUserData(ObservableField<UserProfile> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeProfile7(ItemPassProfileEmptyBinding itemPassProfileEmptyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeProfile9(ItemPassProfileBinding itemPassProfileBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeProfile10(ItemPassProfileEmptyBinding itemPassProfileEmptyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeFirst(ItemPassProfileBinding itemPassProfileBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeProfile2(ItemPassProfileBinding itemPassProfileBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeProfile4(ItemPassProfileBinding itemPassProfileBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        return true;
    }

    private boolean onChangeProfile6(ItemPassProfileBinding itemPassProfileBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        return true;
    }

    private boolean onChangeProfile8(ItemPassProfileBinding itemPassProfileBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r11 = this;
            monitor-enter(r11)
            long r0 = r11.mDirtyFlags     // Catch:{ all -> 0x01ba }
            r2 = 0
            r11.mDirtyFlags = r2     // Catch:{ all -> 0x01ba }
            monitor-exit(r11)     // Catch:{ all -> 0x01ba }
            ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM r4 = r11.mVm
            r5 = 12296(0x3008, double:6.075E-320)
            long r5 = r5 & r0
            r7 = 0
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x003f
            if (r4 == 0) goto L_0x0019
            androidx.databinding.ObservableField r4 = r4.getUserData()
            goto L_0x001a
        L_0x0019:
            r4 = r7
        L_0x001a:
            r5 = 3
            r11.updateRegistration((int) r5, (androidx.databinding.Observable) r4)
            if (r4 == 0) goto L_0x0027
            java.lang.Object r4 = r4.get()
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile r4 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile) r4
            goto L_0x0028
        L_0x0027:
            r4 = r7
        L_0x0028:
            if (r4 == 0) goto L_0x002f
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r4 = r4.getUserdata()
            goto L_0x0030
        L_0x002f:
            r4 = r7
        L_0x0030:
            if (r4 == 0) goto L_0x003f
            java.lang.String r7 = r4.getEmail()
            java.lang.String r5 = r4.getFullname()
            java.lang.String r4 = r4.getPhone()
            goto L_0x0041
        L_0x003f:
            r4 = r7
            r5 = r4
        L_0x0041:
            r9 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0 & r9
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0171
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.first
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887048(0x7f1203c8, float:1.9408692E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile1
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887049(0x7f1203c9, float:1.9408694E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile1
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887050(0x7f1203ca, float:1.9408696E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setValue(r1)
            ru.unicorn.databinding.ItemPassProfileEmptyBinding r0 = r11.profile10
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887095(0x7f1203f7, float:1.9408787E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile2
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131886922(0x7f12034a, float:1.9408437E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile2
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131886923(0x7f12034b, float:1.9408439E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setValue(r1)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile4
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887093(0x7f1203f5, float:1.9408783E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile4
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887094(0x7f1203f6, float:1.9408785E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setValue(r1)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile5
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887146(0x7f12042a, float:1.940889E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile6
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887892(0x7f120714, float:1.9410404E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassProfileEmptyBinding r0 = r11.profile7
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131886932(0x7f120354, float:1.9408457E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile8
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131886936(0x7f120358, float:1.9408465E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile8
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131886968(0x7f120378, float:1.940853E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setValue(r1)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile9
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131886935(0x7f120357, float:1.9408463E38)
            java.lang.String r1 = r1.getString(r3)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile9
            android.view.View r1 = r11.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r2)
            r0.setValue(r1)
        L_0x0171:
            if (r8 == 0) goto L_0x0182
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.first
            r0.setValue(r5)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile5
            r0.setValue(r4)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile6
            r0.setValue(r7)
        L_0x0182:
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.first
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile1
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile2
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassProfileEmptyBinding r0 = r11.profile3
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile4
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile5
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile6
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassProfileEmptyBinding r0 = r11.profile7
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile8
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassProfileBinding r0 = r11.profile9
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassProfileEmptyBinding r0 = r11.profile10
            executeBindingsOn(r0)
            return
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01ba }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentPassProfileBindingImpl.executeBindings():void");
    }
}
