package p035ru.unicorn.databinding;

import android.support.p001v4.media.session.PlaybackStateCompat;
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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;

/* renamed from: ru.unicorn.databinding.FragmentPassProfileEditBindingImpl */
public class FragmentPassProfileEditBindingImpl extends FragmentPassProfileEditBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(12);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private ViewDataBinding.PropertyChangedInverseListener firstvalue;
    private long mDirtyFlags;
    private InverseBindingListener mOldEventValue1163459728;
    private InverseBindingListener mOldEventValue132899854;
    private InverseBindingListener mOldEventValue1448969046;
    private InverseBindingListener mOldEventValue2002835215;
    private InverseBindingListener mOldEventValue2082076908;
    private InverseBindingListener mOldEventValue214963961;
    private InverseBindingListener mOldEventValue579052578;
    private final ScrollView mboundView0;
    private final LinearLayout mboundView1;
    private ViewDataBinding.PropertyChangedInverseListener profile1value;
    private ViewDataBinding.PropertyChangedInverseListener profile2value;
    private ViewDataBinding.PropertyChangedInverseListener profile5value;
    private ViewDataBinding.PropertyChangedInverseListener profile6value;
    private ViewDataBinding.PropertyChangedInverseListener secondvalue;
    private ViewDataBinding.PropertyChangedInverseListener thirdvalue;

    static {
        sIncludes.setIncludes(1, new String[]{"item_profile_editable2", "item_profile_editable2", "item_profile_editable2", "item_profile_editable", "item_profile_editable2", "item_profile_editable", "item_profile_editable2", "item_pass_profile_empty"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9}, new int[]{R.layout.item_profile_editable2, R.layout.item_profile_editable2, R.layout.item_profile_editable2, R.layout.item_profile_editable, R.layout.item_profile_editable2, R.layout.item_profile_editable, R.layout.item_profile_editable2, R.layout.item_pass_profile_empty});
        sViewsWithIds.put(R.id.rv, 10);
        sViewsWithIds.put(R.id.pbar, 11);
    }

    public FragmentPassProfileEditBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentPassProfileEditBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 9, objArr[2], objArr[11], objArr[5], objArr[6], objArr[7], objArr[8], objArr[9], objArr[10], objArr[3], objArr[4]);
        this.firstvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentPassProfileEditBindingImpl.this.first.getValue();
                PassProfileVM passProfileVM = FragmentPassProfileEditBindingImpl.this.mVm;
                boolean z = true;
                if (passProfileVM != null) {
                    ObservableField<UserProfile> userData = passProfileVM.getUserData();
                    if (userData != null) {
                        UserProfile userProfile = userData.get();
                        if (userProfile != null) {
                            UserData userdata = userProfile.getUserdata();
                            if (userdata == null) {
                                z = false;
                            }
                            if (z) {
                                userdata.setSurname(value);
                            }
                        }
                    }
                }
            }
        };
        this.profile1value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentPassProfileEditBindingImpl.this.profile1.getValue();
                PassProfileVM passProfileVM = FragmentPassProfileEditBindingImpl.this.mVm;
                boolean z = true;
                if (passProfileVM != null) {
                    ObservableField<UserProfile> userData = passProfileVM.getUserData();
                    if (userData != null) {
                        UserProfile userProfile = userData.get();
                        if (userProfile != null) {
                            UserData userdata = userProfile.getUserdata();
                            if (userdata == null) {
                                z = false;
                            }
                            if (z) {
                                userdata.setGender(value);
                            }
                        }
                    }
                }
            }
        };
        this.profile2value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentPassProfileEditBindingImpl.this.profile2.getValue();
                PassProfileVM passProfileVM = FragmentPassProfileEditBindingImpl.this.mVm;
                boolean z = true;
                if (passProfileVM != null) {
                    ObservableField<UserProfile> userData = passProfileVM.getUserData();
                    if (userData != null) {
                        UserProfile userProfile = userData.get();
                        if (userProfile != null) {
                            UserData userdata = userProfile.getUserdata();
                            if (userdata == null) {
                                z = false;
                            }
                            if (z) {
                                userdata.setBirthday(value);
                            }
                        }
                    }
                }
            }
        };
        this.profile5value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentPassProfileEditBindingImpl.this.profile5.getValue();
                PassProfileVM passProfileVM = FragmentPassProfileEditBindingImpl.this.mVm;
                boolean z = true;
                if (passProfileVM != null) {
                    ObservableField<UserProfile> userData = passProfileVM.getUserData();
                    if (userData != null) {
                        UserProfile userProfile = userData.get();
                        if (userProfile != null) {
                            UserData userdata = userProfile.getUserdata();
                            if (userdata == null) {
                                z = false;
                            }
                            if (z) {
                                userdata.setPhone(value);
                            }
                        }
                    }
                }
            }
        };
        this.profile6value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentPassProfileEditBindingImpl.this.profile6.getValue();
                PassProfileVM passProfileVM = FragmentPassProfileEditBindingImpl.this.mVm;
                boolean z = true;
                if (passProfileVM != null) {
                    ObservableField<UserProfile> userData = passProfileVM.getUserData();
                    if (userData != null) {
                        UserProfile userProfile = userData.get();
                        if (userProfile != null) {
                            UserData userdata = userProfile.getUserdata();
                            if (userdata == null) {
                                z = false;
                            }
                            if (z) {
                                userdata.setEmail(value);
                            }
                        }
                    }
                }
            }
        };
        this.secondvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentPassProfileEditBindingImpl.this.second.getValue();
                PassProfileVM passProfileVM = FragmentPassProfileEditBindingImpl.this.mVm;
                boolean z = true;
                if (passProfileVM != null) {
                    ObservableField<UserProfile> userData = passProfileVM.getUserData();
                    if (userData != null) {
                        UserProfile userProfile = userData.get();
                        if (userProfile != null) {
                            UserData userdata = userProfile.getUserdata();
                            if (userdata == null) {
                                z = false;
                            }
                            if (z) {
                                userdata.setName(value);
                            }
                        }
                    }
                }
            }
        };
        this.thirdvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentPassProfileEditBindingImpl.this.third.getValue();
                PassProfileVM passProfileVM = FragmentPassProfileEditBindingImpl.this.mVm;
                boolean z = true;
                if (passProfileVM != null) {
                    ObservableField<UserProfile> userData = passProfileVM.getUserData();
                    if (userData != null) {
                        UserProfile userProfile = userData.get();
                        if (userProfile != null) {
                            UserData userdata = userProfile.getUserdata();
                            if (userdata == null) {
                                z = false;
                            }
                            if (z) {
                                userdata.setPatronymic(value);
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
            this.mDirtyFlags = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        this.first.invalidateAll();
        this.second.invalidateAll();
        this.third.invalidateAll();
        this.profile1.invalidateAll();
        this.profile2.invalidateAll();
        this.profile5.invalidateAll();
        this.profile6.invalidateAll();
        this.profile7.invalidateAll();
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
        if (r6.profile1.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.profile2.hasPendingBindings() == false) goto L_0x003a;
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
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
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
            long r0 = r6.mDirtyFlags     // Catch:{ all -> 0x0057 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0057 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0057 }
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r6.first
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r6.second
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r6.third
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemProfileEditableBinding r0 = r6.profile1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r6.profile2
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            ru.unicorn.databinding.ItemProfileEditableBinding r0 = r6.profile5
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r6.profile6
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x004c
            return r4
        L_0x004c:
            ru.unicorn.databinding.ItemPassProfileEmptyBinding r0 = r6.profile7
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0055
            return r4
        L_0x0055:
            r0 = 0
            return r0
        L_0x0057:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0057 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentPassProfileEditBindingImpl.hasPendingBindings():boolean");
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
            this.mDirtyFlags |= 512;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.first.setLifecycleOwner(lifecycleOwner);
        this.second.setLifecycleOwner(lifecycleOwner);
        this.third.setLifecycleOwner(lifecycleOwner);
        this.profile1.setLifecycleOwner(lifecycleOwner);
        this.profile2.setLifecycleOwner(lifecycleOwner);
        this.profile5.setLifecycleOwner(lifecycleOwner);
        this.profile6.setLifecycleOwner(lifecycleOwner);
        this.profile7.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return onChangeProfile1((ItemProfileEditableBinding) obj, i2);
            case 1:
                return onChangeSecond((ItemProfileEditable2Binding) obj, i2);
            case 2:
                return onChangeProfile5((ItemProfileEditableBinding) obj, i2);
            case 3:
                return onChangeVmUserData((ObservableField) obj, i2);
            case 4:
                return onChangeProfile7((ItemPassProfileEmptyBinding) obj, i2);
            case 5:
                return onChangeFirst((ItemProfileEditable2Binding) obj, i2);
            case 6:
                return onChangeProfile2((ItemProfileEditable2Binding) obj, i2);
            case 7:
                return onChangeThird((ItemProfileEditable2Binding) obj, i2);
            case 8:
                return onChangeProfile6((ItemProfileEditable2Binding) obj, i2);
            default:
                return false;
        }
    }

    private boolean onChangeProfile1(ItemProfileEditableBinding itemProfileEditableBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeSecond(ItemProfileEditable2Binding itemProfileEditable2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeProfile5(ItemProfileEditableBinding itemProfileEditableBinding, int i) {
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

    private boolean onChangeFirst(ItemProfileEditable2Binding itemProfileEditable2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeProfile2(ItemProfileEditable2Binding itemProfileEditable2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeThird(ItemProfileEditable2Binding itemProfileEditable2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeProfile6(ItemProfileEditable2Binding itemProfileEditable2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.mDirtyFlags     // Catch:{ all -> 0x01ab }
            r2 = 0
            r15.mDirtyFlags = r2     // Catch:{ all -> 0x01ab }
            monitor-exit(r15)     // Catch:{ all -> 0x01ab }
            ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM r4 = r15.mVm
            r5 = 1544(0x608, double:7.63E-321)
            long r5 = r5 & r0
            r7 = 0
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0053
            if (r4 == 0) goto L_0x0019
            androidx.databinding.ObservableField r4 = r4.getUserData()
            goto L_0x001a
        L_0x0019:
            r4 = r7
        L_0x001a:
            r5 = 3
            r15.updateRegistration((int) r5, (androidx.databinding.Observable) r4)
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
            if (r4 == 0) goto L_0x0053
            java.lang.String r7 = r4.getEmail()
            java.lang.String r5 = r4.getSurname()
            java.lang.String r6 = r4.getGender()
            java.lang.String r9 = r4.getPatronymic()
            java.lang.String r10 = r4.getName()
            java.lang.String r11 = r4.getPhone()
            java.lang.String r4 = r4.getBirthday()
            r14 = r9
            r9 = r7
            r7 = r11
            r11 = r14
            goto L_0x0059
        L_0x0053:
            r4 = r7
            r5 = r4
            r6 = r5
            r9 = r6
            r10 = r9
            r11 = r10
        L_0x0059:
            r12 = 1024(0x400, double:5.06E-321)
            long r0 = r0 & r12
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x013f
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.first
            android.view.View r1 = r15.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887913(0x7f120729, float:1.9410447E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.first
            androidx.databinding.InverseBindingListener r1 = r15.mOldEventValue579052578
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r2 = r15.firstvalue
            setBindingInverseListener(r0, r1, r2)
            ru.unicorn.databinding.ItemProfileEditableBinding r0 = r15.profile1
            android.view.View r1 = r15.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887049(0x7f1203c9, float:1.9408694E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemProfileEditableBinding r0 = r15.profile1
            androidx.databinding.InverseBindingListener r1 = r15.mOldEventValue1448969046
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r2 = r15.profile1value
            setBindingInverseListener(r0, r1, r2)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.profile2
            android.view.View r1 = r15.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131886922(0x7f12034a, float:1.9408437E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.profile2
            androidx.databinding.InverseBindingListener r1 = r15.mOldEventValue2002835215
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r2 = r15.profile2value
            setBindingInverseListener(r0, r1, r2)
            ru.unicorn.databinding.ItemProfileEditableBinding r0 = r15.profile5
            android.view.View r1 = r15.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887146(0x7f12042a, float:1.940889E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemProfileEditableBinding r0 = r15.profile5
            androidx.databinding.InverseBindingListener r1 = r15.mOldEventValue132899854
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r2 = r15.profile5value
            setBindingInverseListener(r0, r1, r2)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.profile6
            android.view.View r1 = r15.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131886541(0x7f1201cd, float:1.9407664E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.profile6
            androidx.databinding.InverseBindingListener r1 = r15.mOldEventValue2082076908
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r2 = r15.profile6value
            setBindingInverseListener(r0, r1, r2)
            ru.unicorn.databinding.ItemPassProfileEmptyBinding r0 = r15.profile7
            android.view.View r1 = r15.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887095(0x7f1203f7, float:1.9408787E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.second
            android.view.View r1 = r15.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887901(0x7f12071d, float:1.9410422E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.second
            androidx.databinding.InverseBindingListener r1 = r15.mOldEventValue1163459728
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r2 = r15.secondvalue
            setBindingInverseListener(r0, r1, r2)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.third
            android.view.View r1 = r15.getRoot()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131887903(0x7f12071f, float:1.9410426E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.third
            androidx.databinding.InverseBindingListener r1 = r15.mOldEventValue214963961
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r2 = r15.thirdvalue
            setBindingInverseListener(r0, r1, r2)
        L_0x013f:
            if (r8 == 0) goto L_0x0164
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.first
            r0.setValue(r5)
            ru.unicorn.databinding.ItemProfileEditableBinding r0 = r15.profile1
            r0.setValue(r6)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.profile2
            r0.setValue(r4)
            ru.unicorn.databinding.ItemProfileEditableBinding r0 = r15.profile5
            r0.setValue(r7)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.profile6
            r0.setValue(r9)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.second
            r0.setValue(r10)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.third
            r0.setValue(r11)
        L_0x0164:
            if (r12 == 0) goto L_0x0182
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r15.firstvalue
            r15.mOldEventValue579052578 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r15.profile1value
            r15.mOldEventValue1448969046 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r15.profile2value
            r15.mOldEventValue2002835215 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r15.profile5value
            r15.mOldEventValue132899854 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r15.profile6value
            r15.mOldEventValue2082076908 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r15.secondvalue
            r15.mOldEventValue1163459728 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r15.thirdvalue
            r15.mOldEventValue214963961 = r0
        L_0x0182:
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.first
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.second
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.third
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemProfileEditableBinding r0 = r15.profile1
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.profile2
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemProfileEditableBinding r0 = r15.profile5
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemProfileEditable2Binding r0 = r15.profile6
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemPassProfileEmptyBinding r0 = r15.profile7
            executeBindingsOn(r0)
            return
        L_0x01ab:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01ab }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentPassProfileEditBindingImpl.executeBindings():void");
    }
}
