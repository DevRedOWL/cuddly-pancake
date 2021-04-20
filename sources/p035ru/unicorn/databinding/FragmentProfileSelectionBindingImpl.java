package p035ru.unicorn.databinding;

import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.databinding.FragmentProfileSelectionBindingImpl */
public class FragmentProfileSelectionBindingImpl extends FragmentProfileSelectionBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(10);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    private final LinearLayout mboundView1;

    static {
        sIncludes.setIncludes(1, new String[]{"item_profile_chooser", "item_profile_chooser", "item_profile_chooser", "item_profile_chooser", "item_profile_chooser"}, new int[]{2, 3, 4, 5, 6}, new int[]{R.layout.item_profile_chooser, R.layout.item_profile_chooser, R.layout.item_profile_chooser, R.layout.item_profile_chooser, R.layout.item_profile_chooser});
        sViewsWithIds.put(R.id.ivLogo, 7);
        sViewsWithIds.put(R.id.description, 8);
        sViewsWithIds.put(R.id.btn_next, 9);
    }

    public FragmentProfileSelectionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentProfileSelectionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, objArr[9], objArr[4], objArr[6], objArr[8], objArr[7], objArr[3], objArr[2], objArr[5]);
        this.mDirtyFlags = -1;
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.mboundView1 = objArr[1];
        this.mboundView1.setTag((Object) null);
        View view2 = view;
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 256;
        }
        this.newFlat.invalidateAll();
        this.justUjin.invalidateAll();
        this.commerce.invalidateAll();
        this.f6588uk.invalidateAll();
        this.demo.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.justUjin.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.commerce.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.f6588uk.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.demo.hasPendingBindings() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.newFlat.hasPendingBindings() == false) goto L_0x0016;
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
            ru.unicorn.databinding.ItemProfileChooserBinding r0 = r6.newFlat
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemProfileChooserBinding r0 = r6.justUjin
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemProfileChooserBinding r0 = r6.commerce
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemProfileChooserBinding r0 = r6.f6588uk
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            ru.unicorn.databinding.ItemProfileChooserBinding r0 = r6.demo
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentProfileSelectionBindingImpl.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, Object obj) {
        if (26 == i) {
            setVm((ProfileSelectionVM) obj);
        } else if (11 != i) {
            return false;
        } else {
            setBinder((ProfileChooserFragment.BindHelper) obj);
        }
        return true;
    }

    public void setVm(ProfileSelectionVM profileSelectionVM) {
        this.mVm = profileSelectionVM;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setBinder(ProfileChooserFragment.BindHelper bindHelper) {
        this.mBinder = bindHelper;
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.newFlat.setLifecycleOwner(lifecycleOwner);
        this.justUjin.setLifecycleOwner(lifecycleOwner);
        this.commerce.setLifecycleOwner(lifecycleOwner);
        this.f6588uk.setLifecycleOwner(lifecycleOwner);
        this.demo.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeDemo((ItemProfileChooserBinding) obj, i2);
        }
        if (i == 1) {
            return onChangeJustUjin((ItemProfileChooserBinding) obj, i2);
        }
        if (i == 2) {
            return onChangeUk((ItemProfileChooserBinding) obj, i2);
        }
        if (i == 3) {
            return onChangeVmSelectNumber((LiveData) obj, i2);
        }
        if (i == 4) {
            return onChangeNewFlat((ItemProfileChooserBinding) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return onChangeCommerce((ItemProfileChooserBinding) obj, i2);
    }

    private boolean onChangeDemo(ItemProfileChooserBinding itemProfileChooserBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeJustUjin(ItemProfileChooserBinding itemProfileChooserBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeUk(ItemProfileChooserBinding itemProfileChooserBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeVmSelectNumber(LiveData<Integer> liveData, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeNewFlat(ItemProfileChooserBinding itemProfileChooserBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeCommerce(ItemProfileChooserBinding itemProfileChooserBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        ProfileSelectionVM profileSelectionVM = this.mVm;
        ProfileChooserFragment.BindHelper bindHelper = this.mBinder;
        Integer num = null;
        if ((j & 328) != 0) {
            LiveData<Integer> selectNumber = profileSelectionVM != null ? profileSelectionVM.getSelectNumber() : null;
            updateLiveDataRegistration(3, selectNumber);
            if (selectNumber != null) {
                num = selectNumber.getValue();
            }
        }
        int i5 = ((j & 384) > 0 ? 1 : ((j & 384) == 0 ? 0 : -1));
        if (i5 != 0) {
            if (bindHelper != null) {
                z3 = bindHelper.getShowNewApartment();
                z2 = bindHelper.getShowNewCommerce();
                z = bindHelper.getShowAddUK();
                z4 = bindHelper.getShowJustUjin();
            } else {
                z4 = false;
                z3 = false;
                z2 = false;
                z = false;
            }
            if (i5 != 0) {
                j |= z3 ? PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID : 512;
            }
            if ((j & 384) != 0) {
                j |= z2 ? 16384 : PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            if ((j & 384) != 0) {
                j |= z ? 65536 : PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
            }
            if ((j & 384) != 0) {
                j |= z4 ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            int i6 = 8;
            i2 = z3 ? 0 : 8;
            i = z2 ? 0 : 8;
            int i7 = z ? 0 : 8;
            if (z4) {
                i6 = 0;
            }
            i4 = i6;
            i3 = i7;
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        if ((j & 384) != 0) {
            this.commerce.getRoot().setVisibility(i);
            this.justUjin.getRoot().setVisibility(i4);
            this.newFlat.getRoot().setVisibility(i2);
            this.f6588uk.getRoot().setVisibility(i3);
        }
        if ((256 & j) != 0) {
            this.commerce.setPosition(2);
            this.commerce.setTitle(getRoot().getResources().getString(R.string.label_choose_commerce));
            this.demo.setPosition(4);
            this.demo.setTitle(getRoot().getResources().getString(R.string.label_choose_demo));
            this.justUjin.setPosition(1);
            this.justUjin.setTitle(getRoot().getResources().getString(R.string.label_choose_just_ujin));
            this.newFlat.setPosition(0);
            this.newFlat.setTitle(getRoot().getResources().getString(R.string.label_choose_new_flat));
            this.f6588uk.setPosition(3);
            this.f6588uk.setTitle(getRoot().getResources().getString(R.string.label_choose_uk));
        }
        if ((328 & j) != 0) {
            this.commerce.setSelected(num);
            this.demo.setSelected(num);
            this.justUjin.setSelected(num);
            this.newFlat.setSelected(num);
            this.f6588uk.setSelected(num);
        }
        if ((j & 320) != 0) {
            this.commerce.setVm(profileSelectionVM);
            this.demo.setVm(profileSelectionVM);
            this.justUjin.setVm(profileSelectionVM);
            this.newFlat.setVm(profileSelectionVM);
            this.f6588uk.setVm(profileSelectionVM);
        }
        executeBindingsOn(this.newFlat);
        executeBindingsOn(this.justUjin);
        executeBindingsOn(this.commerce);
        executeBindingsOn(this.f6588uk);
        executeBindingsOn(this.demo);
    }
}
