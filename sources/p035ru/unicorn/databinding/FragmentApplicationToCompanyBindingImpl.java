package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.request.ApplicationToCompanyBody;

/* renamed from: ru.unicorn.databinding.FragmentApplicationToCompanyBindingImpl */
public class FragmentApplicationToCompanyBindingImpl extends FragmentApplicationToCompanyBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(11);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private ViewDataBinding.PropertyChangedInverseListener birthdayvalue;
    private ViewDataBinding.PropertyChangedInverseListener emailvalue;
    private long mDirtyFlags;
    private InverseBindingListener mOldEventValue1055878853;
    private InverseBindingListener mOldEventValue1304613108;
    private InverseBindingListener mOldEventValue1879881884;
    private InverseBindingListener mOldEventValue714489473;
    private InverseBindingListener mOldEventValue817967019;
    private InverseBindingListener mOldEventValue898367754;
    private final RelativeLayout mboundView0;
    private final LinearLayout mboundView1;
    private ViewDataBinding.PropertyChangedInverseListener namevalue;
    private ViewDataBinding.PropertyChangedInverseListener patronymicvalue;
    private ViewDataBinding.PropertyChangedInverseListener positionvalue;
    private ViewDataBinding.PropertyChangedInverseListener surnamevalue;

    static {
        sIncludes.setIncludes(1, new String[]{"item_application_to_company", "item_application_to_company", "item_application_to_company", "item_application_to_company", "item_application_to_company", "item_application_to_company", "item_application_to_company"}, new int[]{2, 3, 4, 5, 6, 7, 8}, new int[]{R.layout.item_application_to_company, R.layout.item_application_to_company, R.layout.item_application_to_company, R.layout.item_application_to_company, R.layout.item_application_to_company, R.layout.item_application_to_company, R.layout.item_application_to_company});
        sViewsWithIds.put(R.id.btnSendApp, 9);
        sViewsWithIds.put(R.id.pbLoading, 10);
    }

    public FragmentApplicationToCompanyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentApplicationToCompanyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 8, objArr[7], objArr[9], objArr[8], objArr[6], objArr[4], objArr[5], objArr[10], objArr[2], objArr[3]);
        this.birthdayvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentApplicationToCompanyBindingImpl.this.birthday.getValue();
                PassCompanyVM passCompanyVM = FragmentApplicationToCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<ApplicationToCompanyBody> applicationToCompanyBodyObservable = passCompanyVM.getApplicationToCompanyBodyObservable();
                    if (applicationToCompanyBodyObservable != null) {
                        ApplicationToCompanyBody applicationToCompanyBody = applicationToCompanyBodyObservable.get();
                        if (applicationToCompanyBody == null) {
                            z = false;
                        }
                        if (z) {
                            applicationToCompanyBody.setBirthday(value);
                        }
                    }
                }
            }
        };
        this.emailvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentApplicationToCompanyBindingImpl.this.email.getValue();
                PassCompanyVM passCompanyVM = FragmentApplicationToCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<ApplicationToCompanyBody> applicationToCompanyBodyObservable = passCompanyVM.getApplicationToCompanyBodyObservable();
                    if (applicationToCompanyBodyObservable != null) {
                        ApplicationToCompanyBody applicationToCompanyBody = applicationToCompanyBodyObservable.get();
                        if (applicationToCompanyBody == null) {
                            z = false;
                        }
                        if (z) {
                            applicationToCompanyBody.setEmail(value);
                        }
                    }
                }
            }
        };
        this.namevalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentApplicationToCompanyBindingImpl.this.name.getValue();
                PassCompanyVM passCompanyVM = FragmentApplicationToCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<ApplicationToCompanyBody> applicationToCompanyBodyObservable = passCompanyVM.getApplicationToCompanyBodyObservable();
                    if (applicationToCompanyBodyObservable != null) {
                        ApplicationToCompanyBody applicationToCompanyBody = applicationToCompanyBodyObservable.get();
                        if (applicationToCompanyBody == null) {
                            z = false;
                        }
                        if (z) {
                            applicationToCompanyBody.setName(value);
                        }
                    }
                }
            }
        };
        this.patronymicvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentApplicationToCompanyBindingImpl.this.patronymic.getValue();
                PassCompanyVM passCompanyVM = FragmentApplicationToCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<ApplicationToCompanyBody> applicationToCompanyBodyObservable = passCompanyVM.getApplicationToCompanyBodyObservable();
                    if (applicationToCompanyBodyObservable != null) {
                        ApplicationToCompanyBody applicationToCompanyBody = applicationToCompanyBodyObservable.get();
                        if (applicationToCompanyBody == null) {
                            z = false;
                        }
                        if (z) {
                            applicationToCompanyBody.setPatronymic(value);
                        }
                    }
                }
            }
        };
        this.positionvalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentApplicationToCompanyBindingImpl.this.position.getValue();
                PassCompanyVM passCompanyVM = FragmentApplicationToCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<ApplicationToCompanyBody> applicationToCompanyBodyObservable = passCompanyVM.getApplicationToCompanyBodyObservable();
                    if (applicationToCompanyBodyObservable != null) {
                        ApplicationToCompanyBody applicationToCompanyBody = applicationToCompanyBodyObservable.get();
                        if (applicationToCompanyBody == null) {
                            z = false;
                        }
                        if (z) {
                            applicationToCompanyBody.setPositionTitle(value);
                        }
                    }
                }
            }
        };
        this.surnamevalue = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentApplicationToCompanyBindingImpl.this.surname.getValue();
                PassCompanyVM passCompanyVM = FragmentApplicationToCompanyBindingImpl.this.mVm;
                boolean z = true;
                if (passCompanyVM != null) {
                    ObservableField<ApplicationToCompanyBody> applicationToCompanyBodyObservable = passCompanyVM.getApplicationToCompanyBodyObservable();
                    if (applicationToCompanyBodyObservable != null) {
                        ApplicationToCompanyBody applicationToCompanyBody = applicationToCompanyBodyObservable.get();
                        if (applicationToCompanyBody == null) {
                            z = false;
                        }
                        if (z) {
                            applicationToCompanyBody.setSurname(value);
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
        this.position.invalidateAll();
        this.surname.invalidateAll();
        this.name.invalidateAll();
        this.patronymic.invalidateAll();
        this.gender.invalidateAll();
        this.birthday.invalidateAll();
        this.email.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.surname.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.name.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.patronymic.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.gender.hasPendingBindings() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6.birthday.hasPendingBindings() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r6.email.hasPendingBindings() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.position.hasPendingBindings() == false) goto L_0x0016;
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
            ru.unicorn.databinding.ItemApplicationToCompanyBinding r0 = r6.position
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemApplicationToCompanyBinding r0 = r6.surname
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemApplicationToCompanyBinding r0 = r6.name
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemApplicationToCompanyBinding r0 = r6.patronymic
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            ru.unicorn.databinding.ItemApplicationToCompanyBinding r0 = r6.gender
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            ru.unicorn.databinding.ItemApplicationToCompanyBinding r0 = r6.birthday
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            ru.unicorn.databinding.ItemApplicationToCompanyBinding r0 = r6.email
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentApplicationToCompanyBindingImpl.hasPendingBindings():boolean");
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
            this.mDirtyFlags |= 256;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.position.setLifecycleOwner(lifecycleOwner);
        this.surname.setLifecycleOwner(lifecycleOwner);
        this.name.setLifecycleOwner(lifecycleOwner);
        this.patronymic.setLifecycleOwner(lifecycleOwner);
        this.gender.setLifecycleOwner(lifecycleOwner);
        this.birthday.setLifecycleOwner(lifecycleOwner);
        this.email.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return onChangeGender((ItemApplicationToCompanyBinding) obj, i2);
            case 1:
                return onChangePosition((ItemApplicationToCompanyBinding) obj, i2);
            case 2:
                return onChangeName((ItemApplicationToCompanyBinding) obj, i2);
            case 3:
                return onChangeVmApplicationToCompanyBodyObservable((ObservableField) obj, i2);
            case 4:
                return onChangeBirthday((ItemApplicationToCompanyBinding) obj, i2);
            case 5:
                return onChangeEmail((ItemApplicationToCompanyBinding) obj, i2);
            case 6:
                return onChangePatronymic((ItemApplicationToCompanyBinding) obj, i2);
            case 7:
                return onChangeSurname((ItemApplicationToCompanyBinding) obj, i2);
            default:
                return false;
        }
    }

    private boolean onChangeGender(ItemApplicationToCompanyBinding itemApplicationToCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangePosition(ItemApplicationToCompanyBinding itemApplicationToCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeName(ItemApplicationToCompanyBinding itemApplicationToCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeVmApplicationToCompanyBodyObservable(ObservableField<ApplicationToCompanyBody> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeBirthday(ItemApplicationToCompanyBinding itemApplicationToCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeEmail(ItemApplicationToCompanyBinding itemApplicationToCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangePatronymic(ItemApplicationToCompanyBinding itemApplicationToCompanyBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeSurname(ItemApplicationToCompanyBinding itemApplicationToCompanyBinding, int i) {
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
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        PassCompanyVM passCompanyVM = this.mVm;
        String str10 = null;
        int i = ((776 & j) > 0 ? 1 : ((776 & j) == 0 ? 0 : -1));
        if (i != 0) {
            ObservableField<ApplicationToCompanyBody> applicationToCompanyBodyObservable = passCompanyVM != null ? passCompanyVM.getApplicationToCompanyBodyObservable() : null;
            updateRegistration(3, (Observable) applicationToCompanyBodyObservable);
            ApplicationToCompanyBody applicationToCompanyBody = applicationToCompanyBodyObservable != null ? applicationToCompanyBodyObservable.get() : null;
            if (applicationToCompanyBody != null) {
                str5 = applicationToCompanyBody.getEmail();
                str4 = applicationToCompanyBody.getBirthday();
                String name = applicationToCompanyBody.getName();
                String enterpriseTitle = applicationToCompanyBody.getEnterpriseTitle();
                str8 = applicationToCompanyBody.getSurname();
                str7 = applicationToCompanyBody.getPatronymic();
                String str11 = enterpriseTitle;
                str9 = applicationToCompanyBody.getPositionTitle();
                str6 = name;
                str10 = str11;
            } else {
                str6 = null;
                str5 = null;
                str4 = null;
                str9 = null;
                str8 = null;
                str7 = null;
            }
            String str12 = str9;
            str3 = getRoot().getResources().getString(R.string.position_in_company) + " " + str10;
            str10 = str7;
            str = str8;
            str2 = str12;
        } else {
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        int i2 = ((j & 512) > 0 ? 1 : ((j & 512) == 0 ? 0 : -1));
        if (i2 != 0) {
            this.birthday.setTitle(getRoot().getResources().getString(R.string.label_birthday));
            setBindingInverseListener(this.birthday, this.mOldEventValue817967019, this.birthdayvalue);
            this.email.setTitle(getRoot().getResources().getString(R.string.contact_email));
            setBindingInverseListener(this.email, this.mOldEventValue1304613108, this.emailvalue);
            this.gender.setTitle(getRoot().getResources().getString(R.string.label_gender));
            this.name.setTitle(getRoot().getResources().getString(R.string.profileName));
            setBindingInverseListener(this.name, this.mOldEventValue1879881884, this.namevalue);
            this.patronymic.setTitle(getRoot().getResources().getString(R.string.profilePatronymic));
            setBindingInverseListener(this.patronymic, this.mOldEventValue1055878853, this.patronymicvalue);
            setBindingInverseListener(this.position, this.mOldEventValue714489473, this.positionvalue);
            this.position.setIsRequired(true);
            this.surname.setTitle(getRoot().getResources().getString(R.string.profileSurname));
            setBindingInverseListener(this.surname, this.mOldEventValue898367754, this.surnamevalue);
        }
        if (i != 0) {
            this.birthday.setValue(str4);
            this.email.setValue(str5);
            this.name.setValue(str6);
            this.patronymic.setValue(str10);
            this.position.setTitle(str3);
            this.position.setValue(str2);
            this.surname.setValue(str);
        }
        if (i2 != 0) {
            this.mOldEventValue817967019 = this.birthdayvalue;
            this.mOldEventValue1304613108 = this.emailvalue;
            this.mOldEventValue1879881884 = this.namevalue;
            this.mOldEventValue1055878853 = this.patronymicvalue;
            this.mOldEventValue714489473 = this.positionvalue;
            this.mOldEventValue898367754 = this.surnamevalue;
        }
        executeBindingsOn(this.position);
        executeBindingsOn(this.surname);
        executeBindingsOn(this.name);
        executeBindingsOn(this.patronymic);
        executeBindingsOn(this.gender);
        executeBindingsOn(this.birthday);
        executeBindingsOn(this.email);
    }
}
