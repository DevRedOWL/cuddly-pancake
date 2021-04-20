package p035ru.unicorn.databinding;

import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.MyPassIn;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Enterprise;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.User;

/* renamed from: ru.unicorn.databinding.FragmentPassDetail2BindingImpl */
public class FragmentPassDetail2BindingImpl extends FragmentPassDetail2Binding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(12);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;

    static {
        sIncludes.setIncludes(1, new String[]{"item_id_pass_items", "fake_1", "fake_1", "fake_1", "fake_1", "fake_1", "fake_1"}, new int[]{3, 4, 5, 6, 7, 8, 9}, new int[]{R.layout.item_id_pass_items, R.layout.fake_1, R.layout.fake_1, R.layout.fake_1, R.layout.fake_1, R.layout.fake_1, R.layout.fake_1});
        sViewsWithIds.put(R.id.barcode, 10);
        sViewsWithIds.put(R.id.openDoor, 11);
    }

    public FragmentPassDetail2BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private FragmentPassDetail2BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 8, objArr[10], objArr[6], objArr[4], objArr[5], objArr[7], objArr[8], objArr[9], objArr[3], objArr[1], objArr[2], objArr[11], objArr[0]);
        this.mDirtyFlags = -1;
        this.linearLayout7.setTag((Object) null);
        this.number.setTag((Object) null);
        this.f6581sv.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 512;
        }
        this.itemIdPassParent.invalidateAll();
        this.fake10.invalidateAll();
        this.fake11.invalidateAll();
        this.fake1.invalidateAll();
        this.fake2.invalidateAll();
        this.fake3.invalidateAll();
        this.fake4.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.fake10.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.fake11.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.fake1.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.fake2.hasPendingBindings() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6.fake3.hasPendingBindings() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r6.fake4.hasPendingBindings() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.itemIdPassParent.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasPendingBindings() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.mDirtyFlags     // Catch:{ all -> 0x004e }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x004e }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x004e }
            ru.unicorn.databinding.ItemIdPassItemsBinding r0 = r6.itemIdPassParent
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.Fake1Binding r0 = r6.fake10
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.Fake1Binding r0 = r6.fake11
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.Fake1Binding r0 = r6.fake1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            ru.unicorn.databinding.Fake1Binding r0 = r6.fake2
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            ru.unicorn.databinding.Fake1Binding r0 = r6.fake3
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            ru.unicorn.databinding.Fake1Binding r0 = r6.fake4
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x004c
            return r4
        L_0x004c:
            r0 = 0
            return r0
        L_0x004e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x004e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentPassDetail2BindingImpl.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, Object obj) {
        if (26 != i) {
            return false;
        }
        setVm((ProfileViewModel) obj);
        return true;
    }

    public void setVm(ProfileViewModel profileViewModel) {
        this.mVm = profileViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.itemIdPassParent.setLifecycleOwner(lifecycleOwner);
        this.fake10.setLifecycleOwner(lifecycleOwner);
        this.fake11.setLifecycleOwner(lifecycleOwner);
        this.fake1.setLifecycleOwner(lifecycleOwner);
        this.fake2.setLifecycleOwner(lifecycleOwner);
        this.fake3.setLifecycleOwner(lifecycleOwner);
        this.fake4.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return onChangeFake1((Fake1Binding) obj, i2);
            case 1:
                return onChangeFake3((Fake1Binding) obj, i2);
            case 2:
                return onChangeFake11((Fake1Binding) obj, i2);
            case 3:
                return onChangeFake2((Fake1Binding) obj, i2);
            case 4:
                return onChangeFake4((Fake1Binding) obj, i2);
            case 5:
                return onChangeItemIdPassParent((ItemIdPassItemsBinding) obj, i2);
            case 6:
                return onChangeFake10((Fake1Binding) obj, i2);
            case 7:
                return onChangeVmPass((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    private boolean onChangeFake1(Fake1Binding fake1Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeFake3(Fake1Binding fake1Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeFake11(Fake1Binding fake1Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeFake2(Fake1Binding fake1Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeFake4(Fake1Binding fake1Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeItemIdPassParent(ItemIdPassItemsBinding itemIdPassItemsBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeFake10(Fake1Binding fake1Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeVmPass(ObservableField<MyPassIn> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        int i2;
        int i3;
        String str7;
        String str8;
        Enterprise enterprise;
        User user;
        String str9;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        ProfileViewModel profileViewModel = this.mVm;
        int i4 = ((j & 896) > 0 ? 1 : ((j & 896) == 0 ? 0 : -1));
        if (i4 != 0) {
            ObservableField<MyPassIn> pass = profileViewModel != null ? profileViewModel.getPass() : null;
            updateRegistration(7, (Observable) pass);
            MyPassIn myPassIn = pass != null ? pass.get() : null;
            if (myPassIn != null) {
                enterprise = myPassIn.getEnterprise();
                str8 = myPassIn.getPassNumber();
                str3 = myPassIn.getFullName();
                str2 = myPassIn.getActiveFrom();
                str = myPassIn.getActiveTo();
                user = myPassIn.getUser();
            } else {
                user = null;
                enterprise = null;
                str8 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            str6 = enterprise != null ? enterprise.getTitle() : null;
            str4 = this.number.getResources().getString(R.string.pass_number) + str8;
            boolean z = true;
            boolean z2 = str2 == null;
            boolean z3 = str == null;
            if (i4 != 0) {
                j |= z2 ? PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH : PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            }
            if ((j & 896) != 0) {
                j |= z3 ? PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            }
            if (user != null) {
                String phone = user.getPhone();
                str7 = user.getEmail();
                str9 = phone;
            } else {
                str7 = null;
                str9 = null;
            }
            if (str6 != null) {
                z = false;
            }
            i3 = z2 ? 8 : 0;
            i2 = z3 ? 8 : 0;
            if ((j & 896) != 0) {
                j |= z ? PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : 16384;
            }
            i = z ? 8 : 0;
            str5 = str9;
        } else {
            str7 = null;
            i3 = 0;
            i2 = 0;
            str6 = null;
            str5 = null;
            i = 0;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if ((896 & j) != 0) {
            this.fake1.getRoot().setVisibility(i);
            this.fake1.setValue(str6);
            this.fake10.getRoot().setVisibility(i3);
            this.fake10.setValue(str2);
            this.fake11.getRoot().setVisibility(i2);
            this.fake11.setValue(str);
            this.fake2.setValue(str3);
            this.fake3.setValue(str7);
            this.fake4.setValue(str5);
            TextViewBindingAdapter.setText(this.number, str4);
        }
        if ((j & 512) != 0) {
            this.fake1.setKey(getRoot().getResources().getString(R.string.company));
            this.fake10.setKey(getRoot().getResources().getString(R.string.activeFrom));
            this.fake11.setKey(getRoot().getResources().getString(R.string.activeTo));
            this.fake2.setKey(getRoot().getResources().getString(R.string.label_fullname));
            this.fake3.setKey(getRoot().getResources().getString(R.string.profileEmail));
            this.fake4.setKey(getRoot().getResources().getString(R.string.label_phone));
        }
        executeBindingsOn(this.itemIdPassParent);
        executeBindingsOn(this.fake10);
        executeBindingsOn(this.fake11);
        executeBindingsOn(this.fake1);
        executeBindingsOn(this.fake2);
        executeBindingsOn(this.fake3);
        executeBindingsOn(this.fake4);
    }
}
