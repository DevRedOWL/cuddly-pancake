package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.databinding.FragmentProfileSelectionStage3BindingImpl */
public class FragmentProfileSelectionStage3BindingImpl extends FragmentProfileSelectionStage3Binding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(8);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private ViewDataBinding.PropertyChangedInverseListener emailvalue;
    private long mDirtyFlags;
    private InverseBindingListener mOldEventValue1869660387;
    private InverseBindingListener mOldEventValue726265218;
    private InverseBindingListener mOldEventValue946972753;
    private InverseBindingListener mOldEventValue958926429;
    private final ScrollView mboundView0;
    private final LinearLayout mboundView1;
    private ViewDataBinding.PropertyChangedInverseListener namevalue;
    private ViewDataBinding.PropertyChangedInverseListener patronymicvalue;
    private ViewDataBinding.PropertyChangedInverseListener surnamevalue;

    static {
        sIncludes.setIncludes(1, new String[]{"item_pass_company", "item_pass_company", "item_pass_company", "item_pass_company"}, new int[]{3, 4, 5, 6}, new int[]{R.layout.item_pass_company, R.layout.item_pass_company, R.layout.item_pass_company, R.layout.item_pass_company});
        sViewsWithIds.put(R.id.underline, 7);
    }

    public FragmentProfileSelectionStage3BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    private FragmentProfileSelectionStage3BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, objArr[2], objArr[6], objArr[4], objArr[5], objArr[3], objArr[7]);
        this.emailvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentProfileSelectionStage3BindingImpl.this.email.getValue();
                ProfileSelectionVM profileSelectionVM = FragmentProfileSelectionStage3BindingImpl.this.mVm;
                if (profileSelectionVM != null) {
                    profileSelectionVM.setEmail(value);
                }
            }
        };
        this.namevalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentProfileSelectionStage3BindingImpl.this.name.getValue();
                ProfileSelectionVM profileSelectionVM = FragmentProfileSelectionStage3BindingImpl.this.mVm;
                if (profileSelectionVM != null) {
                    profileSelectionVM.setName(value);
                }
            }
        };
        this.patronymicvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentProfileSelectionStage3BindingImpl.this.patronymic.getValue();
                ProfileSelectionVM profileSelectionVM = FragmentProfileSelectionStage3BindingImpl.this.mVm;
                if (profileSelectionVM != null) {
                    profileSelectionVM.setPatronymic(value);
                }
            }
        };
        this.surnamevalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentProfileSelectionStage3BindingImpl.this.surname.getValue();
                ProfileSelectionVM profileSelectionVM = FragmentProfileSelectionStage3BindingImpl.this.mVm;
                if (profileSelectionVM != null) {
                    profileSelectionVM.setSurname(value);
                }
            }
        };
        this.mDirtyFlags = -1;
        this.btnNext.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.mboundView1 = objArr[1];
        this.mboundView1.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 64;
        }
        this.surname.invalidateAll();
        this.name.invalidateAll();
        this.patronymic.invalidateAll();
        this.email.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.name.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.patronymic.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.email.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.surname.hasPendingBindings() == false) goto L_0x0016;
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
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r6.surname
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r6.name
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r6.patronymic
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r6.email
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentProfileSelectionStage3BindingImpl.hasPendingBindings():boolean");
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
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.surname.setLifecycleOwner(lifecycleOwner);
        this.name.setLifecycleOwner(lifecycleOwner);
        this.patronymic.setLifecycleOwner(lifecycleOwner);
        this.email.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeName((ItemPassCompanyBinding) obj, i2);
        }
        if (i == 1) {
            return onChangeEmail((ItemPassCompanyBinding) obj, i2);
        }
        if (i == 2) {
            return onChangeVmSelectRole((LiveData) obj, i2);
        }
        if (i == 3) {
            return onChangePatronymic((ItemPassCompanyBinding) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return onChangeSurname((ItemPassCompanyBinding) obj, i2);
    }

    private boolean onChangeName(ItemPassCompanyBinding itemPassCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeEmail(ItemPassCompanyBinding itemPassCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVmSelectRole(LiveData<Integer> liveData, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangePatronymic(ItemPassCompanyBinding itemPassCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeSurname(ItemPassCompanyBinding itemPassCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r13v8, types: [java.lang.Integer] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.mDirtyFlags     // Catch:{ all -> 0x012b }
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x012b }
            monitor-exit(r17)     // Catch:{ all -> 0x012b }
            ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM r0 = r1.mVm
            r6 = 100
            long r8 = r2 & r6
            r10 = 96
            r13 = 0
            int r14 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x0062
            long r8 = r2 & r10
            int r15 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0030
            if (r0 == 0) goto L_0x0030
            java.lang.String r8 = r0.getSurname()
            java.lang.String r9 = r0.getPatronymic()
            java.lang.String r15 = r0.getName()
            java.lang.String r16 = r0.getEmail()
            goto L_0x0035
        L_0x0030:
            r8 = r13
            r9 = r8
            r15 = r9
            r16 = r15
        L_0x0035:
            if (r0 == 0) goto L_0x003c
            androidx.lifecycle.LiveData r0 = r0.getSelectRole()
            goto L_0x003d
        L_0x003c:
            r0 = r13
        L_0x003d:
            r12 = 2
            r1.updateLiveDataRegistration(r12, r0)
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r0.getValue()
            r13 = r0
            java.lang.Integer r13 = (java.lang.Integer) r13
        L_0x004a:
            if (r13 == 0) goto L_0x004e
            r12 = 1
            goto L_0x004f
        L_0x004e:
            r12 = 0
        L_0x004f:
            if (r14 == 0) goto L_0x0059
            if (r12 == 0) goto L_0x0056
            r13 = 256(0x100, double:1.265E-321)
            goto L_0x0058
        L_0x0056:
            r13 = 128(0x80, double:6.32E-322)
        L_0x0058:
            long r2 = r2 | r13
        L_0x0059:
            if (r12 == 0) goto L_0x005d
            r12 = 0
            goto L_0x005f
        L_0x005d:
            r0 = 4
            r12 = 4
        L_0x005f:
            r13 = r16
            goto L_0x0066
        L_0x0062:
            r8 = r13
            r9 = r8
            r15 = r9
            r12 = 0
        L_0x0066:
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0070
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r0 = r1.btnNext
            r0.setVisibility(r12)
        L_0x0070:
            r6 = 64
            long r6 = r6 & r2
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00eb
            ru.unicorn.databinding.ItemPassCompanyBinding r6 = r1.email
            android.view.View r7 = r17.getRoot()
            android.content.res.Resources r7 = r7.getResources()
            r12 = 2131887892(0x7f120714, float:1.9410404E38)
            java.lang.String r7 = r7.getString(r12)
            r6.setTitle(r7)
            ru.unicorn.databinding.ItemPassCompanyBinding r6 = r1.email
            androidx.databinding.InverseBindingListener r7 = r1.mOldEventValue946972753
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r12 = r1.emailvalue
            setBindingInverseListener(r6, r7, r12)
            ru.unicorn.databinding.ItemPassCompanyBinding r6 = r1.name
            android.view.View r7 = r17.getRoot()
            android.content.res.Resources r7 = r7.getResources()
            r12 = 2131887901(0x7f12071d, float:1.9410422E38)
            java.lang.String r7 = r7.getString(r12)
            r6.setTitle(r7)
            ru.unicorn.databinding.ItemPassCompanyBinding r6 = r1.name
            androidx.databinding.InverseBindingListener r7 = r1.mOldEventValue726265218
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r12 = r1.namevalue
            setBindingInverseListener(r6, r7, r12)
            ru.unicorn.databinding.ItemPassCompanyBinding r6 = r1.patronymic
            android.view.View r7 = r17.getRoot()
            android.content.res.Resources r7 = r7.getResources()
            r12 = 2131887903(0x7f12071f, float:1.9410426E38)
            java.lang.String r7 = r7.getString(r12)
            r6.setTitle(r7)
            ru.unicorn.databinding.ItemPassCompanyBinding r6 = r1.patronymic
            androidx.databinding.InverseBindingListener r7 = r1.mOldEventValue958926429
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r12 = r1.patronymicvalue
            setBindingInverseListener(r6, r7, r12)
            ru.unicorn.databinding.ItemPassCompanyBinding r6 = r1.surname
            android.view.View r7 = r17.getRoot()
            android.content.res.Resources r7 = r7.getResources()
            r12 = 2131887913(0x7f120729, float:1.9410447E38)
            java.lang.String r7 = r7.getString(r12)
            r6.setTitle(r7)
            ru.unicorn.databinding.ItemPassCompanyBinding r6 = r1.surname
            androidx.databinding.InverseBindingListener r7 = r1.mOldEventValue1869660387
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r12 = r1.surnamevalue
            setBindingInverseListener(r6, r7, r12)
        L_0x00eb:
            long r2 = r2 & r10
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0104
            ru.unicorn.databinding.ItemPassCompanyBinding r2 = r1.email
            r2.setValue(r13)
            ru.unicorn.databinding.ItemPassCompanyBinding r2 = r1.name
            r2.setValue(r15)
            ru.unicorn.databinding.ItemPassCompanyBinding r2 = r1.patronymic
            r2.setValue(r9)
            ru.unicorn.databinding.ItemPassCompanyBinding r2 = r1.surname
            r2.setValue(r8)
        L_0x0104:
            if (r0 == 0) goto L_0x0116
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.emailvalue
            r1.mOldEventValue946972753 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.namevalue
            r1.mOldEventValue726265218 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.patronymicvalue
            r1.mOldEventValue958926429 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.surnamevalue
            r1.mOldEventValue1869660387 = r0
        L_0x0116:
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r1.surname
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r1.name
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r1.patronymic
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassCompanyBinding r0 = r1.email
            executeBindingsOn(r0)
            return
        L_0x012b:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x012b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentProfileSelectionStage3BindingImpl.executeBindings():void");
    }
}
