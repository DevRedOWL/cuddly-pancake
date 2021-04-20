package p035ru.unicorn.databinding;

import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.generated.callback.OnClickListener;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData;

/* renamed from: ru.unicorn.databinding.FragmentAnotherPassBindingImpl */
public class FragmentAnotherPassBindingImpl extends FragmentAnotherPassBinding implements OnClickListener.Listener {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(48);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private ViewDataBinding.PropertyChangedInverseListener data10value;
    private ViewDataBinding.PropertyChangedInverseListener data13value;
    private ViewDataBinding.PropertyChangedInverseListener data14value;
    private ViewDataBinding.PropertyChangedInverseListener data16value;
    private ViewDataBinding.PropertyChangedInverseListener data17value;
    private ViewDataBinding.PropertyChangedInverseListener data18value;
    private ViewDataBinding.PropertyChangedInverseListener data19value;
    private ViewDataBinding.PropertyChangedInverseListener data1value;
    private ViewDataBinding.PropertyChangedInverseListener data2value;
    private ViewDataBinding.PropertyChangedInverseListener data3value;
    private ViewDataBinding.PropertyChangedInverseListener data4value;
    private ViewDataBinding.PropertyChangedInverseListener data6value;
    private ViewDataBinding.PropertyChangedInverseListener data7value;
    private ViewDataBinding.PropertyChangedInverseListener data8value;
    private ViewDataBinding.PropertyChangedInverseListener data9value;
    private final View.OnClickListener mCallback7;
    private final View.OnClickListener mCallback8;
    private long mDirtyFlags;
    private InverseBindingListener mOldEventValue1014356356;
    private InverseBindingListener mOldEventValue1038201812;
    private InverseBindingListener mOldEventValue1087010236;
    private InverseBindingListener mOldEventValue1244761327;
    private InverseBindingListener mOldEventValue1624672106;
    private InverseBindingListener mOldEventValue1642924196;
    private InverseBindingListener mOldEventValue1723965383;
    private InverseBindingListener mOldEventValue1771821638;
    private InverseBindingListener mOldEventValue1788437380;
    private InverseBindingListener mOldEventValue1967554960;
    private InverseBindingListener mOldEventValue2000388396;
    private InverseBindingListener mOldEventValue2139301308;
    private InverseBindingListener mOldEventValue368012094;
    private InverseBindingListener mOldEventValue524259739;
    private InverseBindingListener mOldEventValue53175204;
    private final RelativeLayout mboundView0;
    private final LinearLayout mboundView1;
    private final TextView mboundView4;
    private final TextView mboundView5;

    static {
        sIncludes.setIncludes(1, new String[]{"item_another_title", "item_another_guest_data_title", "item_another_pass_data", "item_another_pass_data", "item_another_pass_data", "item_another_pass_data", "item_another_pass_data", "item_another_pass_data", "item_another_title", "item_another_pass_data_2", "item_another_pass_data", "item_another_pass_data_2", "item_another_title", "item_another_pass_data_2", "item_another_pass_data_2", "item_another_pass_data_2", "item_another_pass_data_2", "item_another_title", "item_field_spinner", "item_another_pass_data", "item_another_title", "item_another_pass_data", "item_another_guest_data_title", "item_another_title", "item_another_title", "item_another_pass_data", "item_another_pass_data_with_hint", "item_another_title"}, new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37}, new int[]{R.layout.item_another_title, R.layout.item_another_guest_data_title, R.layout.item_another_pass_data, R.layout.item_another_pass_data, R.layout.item_another_pass_data, R.layout.item_another_pass_data, R.layout.item_another_pass_data, R.layout.item_another_pass_data, R.layout.item_another_title, R.layout.item_another_pass_data_2, R.layout.item_another_pass_data, R.layout.item_another_pass_data_2, R.layout.item_another_title, R.layout.item_another_pass_data_2, R.layout.item_another_pass_data_2, R.layout.item_another_pass_data_2, R.layout.item_another_pass_data_2, R.layout.item_another_title, R.layout.item_field_spinner, R.layout.item_another_pass_data, R.layout.item_another_title, R.layout.item_another_pass_data, R.layout.item_another_guest_data_title, R.layout.item_another_title, R.layout.item_another_title, R.layout.item_another_pass_data, R.layout.item_another_pass_data_with_hint, R.layout.item_another_title});
        sViewsWithIds.put(R.id.sv, 38);
        sViewsWithIds.put(R.id.location_radio_group, 39);
        sViewsWithIds.put(R.id.today, 40);
        sViewsWithIds.put(R.id.tomorrow, 41);
        sViewsWithIds.put(R.id.paddingGroup, 42);
        sViewsWithIds.put(R.id.llAdditional, 43);
        sViewsWithIds.put(R.id.group, 44);
        sViewsWithIds.put(R.id.rent, 45);
        sViewsWithIds.put(R.id.save, 46);
        sViewsWithIds.put(R.id.pbLoading, 47);
    }

    public FragmentAnotherPassBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 48, sIncludes, sViewsWithIds));
    }

    private FragmentAnotherPassBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 34, objArr[9], objArr[3], objArr[2], objArr[8], objArr[28], objArr[12], objArr[21], objArr[23], objArr[24], objArr[25], objArr[26], objArr[29], objArr[31], objArr[35], objArr[36], objArr[13], objArr[14], objArr[15], objArr[16], objArr[17], objArr[19], objArr[20], objArr[44], objArr[43], objArr[6], objArr[39], objArr[42], objArr[47], objArr[45], objArr[46], objArr[38], objArr[10], objArr[32], objArr[11], objArr[18], objArr[22], objArr[27], objArr[37], objArr[30], objArr[34], objArr[33], objArr[40], objArr[41], objArr[7]);
        this.data1value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data1.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable();
                    if (createAnotherPassBodyObservable != null) {
                        CreateAnotherPassRequestBody createAnotherPassRequestBody = createAnotherPassBodyObservable.get();
                        if (createAnotherPassRequestBody == null) {
                            z = false;
                        }
                        if (z) {
                            createAnotherPassRequestBody.setSurname(value);
                        }
                    }
                }
            }
        };
        this.data10value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data10.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<IdentityDocument> createAnotherPassBodyDocumentObservable = anotherPassViewModel.getCreateAnotherPassBodyDocumentObservable();
                    if (createAnotherPassBodyDocumentObservable != null) {
                        IdentityDocument identityDocument = createAnotherPassBodyDocumentObservable.get();
                        if (identityDocument == null) {
                            z = false;
                        }
                        if (z) {
                            identityDocument.setIssuedDate(value);
                        }
                    }
                }
            }
        };
        this.data13value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data13.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable();
                    if (createAnotherPassBodyObservable != null) {
                        CreateAnotherPassRequestBody createAnotherPassRequestBody = createAnotherPassBodyObservable.get();
                        if (createAnotherPassRequestBody == null) {
                            z = false;
                        }
                        if (z) {
                            createAnotherPassRequestBody.setTimeFrom(value);
                        }
                    }
                }
            }
        };
        this.data14value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data14.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable();
                    if (createAnotherPassBodyObservable != null) {
                        CreateAnotherPassRequestBody createAnotherPassRequestBody = createAnotherPassBodyObservable.get();
                        if (createAnotherPassRequestBody == null) {
                            z = false;
                        }
                        if (z) {
                            createAnotherPassRequestBody.setTimeTo(value);
                        }
                    }
                }
            }
        };
        this.data16value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data16.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable();
                    if (createAnotherPassBodyObservable != null) {
                        CreateAnotherPassRequestBody createAnotherPassRequestBody = createAnotherPassBodyObservable.get();
                        if (createAnotherPassRequestBody == null) {
                            z = false;
                        }
                        if (z) {
                            createAnotherPassRequestBody.setComment(value);
                        }
                    }
                }
            }
        };
        this.data17value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data17.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable();
                    if (createAnotherPassBodyObservable != null) {
                        CreateAnotherPassRequestBody createAnotherPassRequestBody = createAnotherPassBodyObservable.get();
                        if (createAnotherPassRequestBody == null) {
                            z = false;
                        }
                        if (z) {
                            createAnotherPassRequestBody.setPersonsCount(value);
                        }
                    }
                }
            }
        };
        this.data18value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data18.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<VehicleData> createAnotherPassBodyVehicleObservable = anotherPassViewModel.getCreateAnotherPassBodyVehicleObservable();
                    if (createAnotherPassBodyVehicleObservable != null) {
                        VehicleData vehicleData = createAnotherPassBodyVehicleObservable.get();
                        if (vehicleData == null) {
                            z = false;
                        }
                        if (z) {
                            vehicleData.setBrand(value);
                        }
                    }
                }
            }
        };
        this.data19value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data19.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<VehicleData> createAnotherPassBodyVehicleObservable = anotherPassViewModel.getCreateAnotherPassBodyVehicleObservable();
                    if (createAnotherPassBodyVehicleObservable != null) {
                        VehicleData vehicleData = createAnotherPassBodyVehicleObservable.get();
                        if (vehicleData == null) {
                            z = false;
                        }
                        if (z) {
                            vehicleData.setNumber(value);
                        }
                    }
                }
            }
        };
        this.data2value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data2.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable();
                    if (createAnotherPassBodyObservable != null) {
                        CreateAnotherPassRequestBody createAnotherPassRequestBody = createAnotherPassBodyObservable.get();
                        if (createAnotherPassRequestBody == null) {
                            z = false;
                        }
                        if (z) {
                            createAnotherPassRequestBody.setName(value);
                        }
                    }
                }
            }
        };
        this.data3value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data3.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable();
                    if (createAnotherPassBodyObservable != null) {
                        CreateAnotherPassRequestBody createAnotherPassRequestBody = createAnotherPassBodyObservable.get();
                        if (createAnotherPassRequestBody == null) {
                            z = false;
                        }
                        if (z) {
                            createAnotherPassRequestBody.setPatronymic(value);
                        }
                    }
                }
            }
        };
        this.data4value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data4.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable();
                    if (createAnotherPassBodyObservable != null) {
                        CreateAnotherPassRequestBody createAnotherPassRequestBody = createAnotherPassBodyObservable.get();
                        if (createAnotherPassRequestBody == null) {
                            z = false;
                        }
                        if (z) {
                            createAnotherPassRequestBody.setPhone(value);
                        }
                    }
                }
            }
        };
        this.data6value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data6.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable();
                    if (createAnotherPassBodyObservable != null) {
                        CreateAnotherPassRequestBody createAnotherPassRequestBody = createAnotherPassBodyObservable.get();
                        if (createAnotherPassRequestBody == null) {
                            z = false;
                        }
                        if (z) {
                            createAnotherPassRequestBody.setEmail(value);
                        }
                    }
                }
            }
        };
        this.data7value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data7.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable();
                    if (createAnotherPassBodyObservable != null) {
                        CreateAnotherPassRequestBody createAnotherPassRequestBody = createAnotherPassBodyObservable.get();
                        if (createAnotherPassRequestBody == null) {
                            z = false;
                        }
                        if (z) {
                            createAnotherPassRequestBody.setCompany(value);
                        }
                    }
                }
            }
        };
        this.data8value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data8.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable = anotherPassViewModel.getCreateAnotherPassBodyObservable();
                    if (createAnotherPassBodyObservable != null) {
                        CreateAnotherPassRequestBody createAnotherPassRequestBody = createAnotherPassBodyObservable.get();
                        if (createAnotherPassRequestBody == null) {
                            z = false;
                        }
                        if (z) {
                            createAnotherPassRequestBody.setBirthday(value);
                        }
                    }
                }
            }
        };
        this.data9value = new ViewDataBinding.PropertyChangedInverseListener(12) {
            public void onChange() {
                String value = FragmentAnotherPassBindingImpl.this.data9.getValue();
                AnotherPassViewModel anotherPassViewModel = FragmentAnotherPassBindingImpl.this.mVm;
                boolean z = true;
                if (anotherPassViewModel != null) {
                    ObservableField<IdentityDocument> createAnotherPassBodyDocumentObservable = anotherPassViewModel.getCreateAnotherPassBodyDocumentObservable();
                    if (createAnotherPassBodyDocumentObservable != null) {
                        IdentityDocument identityDocument = createAnotherPassBodyDocumentObservable.get();
                        if (identityDocument == null) {
                            z = false;
                        }
                        if (z) {
                            identityDocument.setNumber(value);
                        }
                    }
                }
            }
        };
        this.mDirtyFlags = -1;
        this.auto.setTag((Object) null);
        this.btnPassOneTime.setTag((Object) null);
        this.btnPassTime.setTag((Object) null);
        this.checkboxDifferentVehicleType.setTag((Object) null);
        this.llZoneSlots.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.mboundView1 = objArr[1];
        this.mboundView1.setTag((Object) null);
        this.mboundView4 = objArr[4];
        this.mboundView4.setTag((Object) null);
        this.mboundView5 = objArr[5];
        this.mboundView5.setTag((Object) null);
        this.tvNoPlaces.setTag((Object) null);
        setRootTag(view);
        this.mCallback8 = new OnClickListener(this, 2);
        this.mCallback7 = new OnClickListener(this, 1);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 34359738368L;
        }
        this.title1.invalidateAll();
        this.title2.invalidateAll();
        this.data1.invalidateAll();
        this.data2.invalidateAll();
        this.data3.invalidateAll();
        this.data4.invalidateAll();
        this.data6.invalidateAll();
        this.data7.invalidateAll();
        this.title3.invalidateAll();
        this.data8.invalidateAll();
        this.data9.invalidateAll();
        this.data10.invalidateAll();
        this.title4.invalidateAll();
        this.data11.invalidateAll();
        this.data12.invalidateAll();
        this.data13.invalidateAll();
        this.data14.invalidateAll();
        this.title5.invalidateAll();
        this.company.invalidateAll();
        this.data16.invalidateAll();
        this.title7.invalidateAll();
        this.data17.invalidateAll();
        this.title10.invalidateAll();
        this.title9.invalidateAll();
        this.title8.invalidateAll();
        this.data18.invalidateAll();
        this.data19.invalidateAll();
        this.title6.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.title2.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.data1.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.data2.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.data3.hasPendingBindings() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6.data4.hasPendingBindings() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r6.data6.hasPendingBindings() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (r6.data7.hasPendingBindings() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r6.title3.hasPendingBindings() == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        if (r6.data8.hasPendingBindings() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006d, code lost:
        if (r6.data9.hasPendingBindings() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0076, code lost:
        if (r6.data10.hasPendingBindings() == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0078, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007f, code lost:
        if (r6.title4.hasPendingBindings() == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0081, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0088, code lost:
        if (r6.data11.hasPendingBindings() == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0091, code lost:
        if (r6.data12.hasPendingBindings() == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0093, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009a, code lost:
        if (r6.data13.hasPendingBindings() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a3, code lost:
        if (r6.data14.hasPendingBindings() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a5, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ac, code lost:
        if (r6.title5.hasPendingBindings() == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ae, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b5, code lost:
        if (r6.company.hasPendingBindings() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b7, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00be, code lost:
        if (r6.data16.hasPendingBindings() == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c0, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c7, code lost:
        if (r6.title7.hasPendingBindings() == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d0, code lost:
        if (r6.data17.hasPendingBindings() == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00d9, code lost:
        if (r6.title10.hasPendingBindings() == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00db, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e2, code lost:
        if (r6.title9.hasPendingBindings() == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00e4, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00eb, code lost:
        if (r6.title8.hasPendingBindings() == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00ed, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00f4, code lost:
        if (r6.data18.hasPendingBindings() == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00f6, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00fd, code lost:
        if (r6.data19.hasPendingBindings() == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00ff, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0106, code lost:
        if (r6.title6.hasPendingBindings() == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.title1.hasPendingBindings() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0108, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0109, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasPendingBindings() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.mDirtyFlags     // Catch:{ all -> 0x010b }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x010b }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x010b }
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r6.title1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemAnotherGuestDataTitleBinding r0 = r6.title2
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r6.data1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r6.data2
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r6.data3
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r6.data4
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r6.data6
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x004c
            return r4
        L_0x004c:
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r6.data7
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0055
            return r4
        L_0x0055:
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r6.title3
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x005e
            return r4
        L_0x005e:
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r6.data8
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0067
            return r4
        L_0x0067:
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r6.data9
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0070
            return r4
        L_0x0070:
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r6.data10
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0079
            return r4
        L_0x0079:
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r6.title4
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0082
            return r4
        L_0x0082:
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r6.data11
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x008b
            return r4
        L_0x008b:
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r6.data12
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0094
            return r4
        L_0x0094:
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r6.data13
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x009d
            return r4
        L_0x009d:
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r6.data14
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x00a6
            return r4
        L_0x00a6:
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r6.title5
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x00af
            return r4
        L_0x00af:
            ru.unicorn.databinding.ItemFieldSpinnerBinding r0 = r6.company
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x00b8
            return r4
        L_0x00b8:
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r6.data16
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x00c1
            return r4
        L_0x00c1:
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r6.title7
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x00ca
            return r4
        L_0x00ca:
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r6.data17
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x00d3
            return r4
        L_0x00d3:
            ru.unicorn.databinding.ItemAnotherGuestDataTitleBinding r0 = r6.title10
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x00dc
            return r4
        L_0x00dc:
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r6.title9
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x00e5
            return r4
        L_0x00e5:
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r6.title8
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x00ee
            return r4
        L_0x00ee:
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r6.data18
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x00f7
            return r4
        L_0x00f7:
            ru.unicorn.databinding.ItemAnotherPassDataWithHintBinding r0 = r6.data19
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0100
            return r4
        L_0x0100:
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r6.title6
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0109
            return r4
        L_0x0109:
            r0 = 0
            return r0
        L_0x010b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x010b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentAnotherPassBindingImpl.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, Object obj) {
        if (26 != i) {
            return false;
        }
        setVm((AnotherPassViewModel) obj);
        return true;
    }

    public void setVm(AnotherPassViewModel anotherPassViewModel) {
        this.mVm = anotherPassViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 17179869184L;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.title1.setLifecycleOwner(lifecycleOwner);
        this.title2.setLifecycleOwner(lifecycleOwner);
        this.data1.setLifecycleOwner(lifecycleOwner);
        this.data2.setLifecycleOwner(lifecycleOwner);
        this.data3.setLifecycleOwner(lifecycleOwner);
        this.data4.setLifecycleOwner(lifecycleOwner);
        this.data6.setLifecycleOwner(lifecycleOwner);
        this.data7.setLifecycleOwner(lifecycleOwner);
        this.title3.setLifecycleOwner(lifecycleOwner);
        this.data8.setLifecycleOwner(lifecycleOwner);
        this.data9.setLifecycleOwner(lifecycleOwner);
        this.data10.setLifecycleOwner(lifecycleOwner);
        this.title4.setLifecycleOwner(lifecycleOwner);
        this.data11.setLifecycleOwner(lifecycleOwner);
        this.data12.setLifecycleOwner(lifecycleOwner);
        this.data13.setLifecycleOwner(lifecycleOwner);
        this.data14.setLifecycleOwner(lifecycleOwner);
        this.title5.setLifecycleOwner(lifecycleOwner);
        this.company.setLifecycleOwner(lifecycleOwner);
        this.data16.setLifecycleOwner(lifecycleOwner);
        this.title7.setLifecycleOwner(lifecycleOwner);
        this.data17.setLifecycleOwner(lifecycleOwner);
        this.title10.setLifecycleOwner(lifecycleOwner);
        this.title9.setLifecycleOwner(lifecycleOwner);
        this.title8.setLifecycleOwner(lifecycleOwner);
        this.data18.setLifecycleOwner(lifecycleOwner);
        this.data19.setLifecycleOwner(lifecycleOwner);
        this.title6.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return onChangeTitle3((ItemAnotherTitleBinding) obj, i2);
            case 1:
                return onChangeVmCreateAnotherPassBodyDocumentObservable((ObservableField) obj, i2);
            case 2:
                return onChangeData4((ItemAnotherPassDataBinding) obj, i2);
            case 3:
                return onChangeTitle2((ItemAnotherGuestDataTitleBinding) obj, i2);
            case 4:
                return onChangeVmCreateAnotherPassBodyVehicleObservableGet((VehicleData) obj, i2);
            case 5:
                return onChangeVmCreateAnotherPassBodyObservableGet((CreateAnotherPassRequestBody) obj, i2);
            case 6:
                return onChangeData16((ItemAnotherPassDataBinding) obj, i2);
            case 7:
                return onChangeTitle9((ItemAnotherTitleBinding) obj, i2);
            case 8:
                return onChangeTitle1((ItemAnotherTitleBinding) obj, i2);
            case 9:
                return onChangeData13((ItemAnotherPassData2Binding) obj, i2);
            case 10:
                return onChangeData2((ItemAnotherPassDataBinding) obj, i2);
            case 11:
                return onChangeTitle8((ItemAnotherTitleBinding) obj, i2);
            case 12:
                return onChangeTitle10((ItemAnotherGuestDataTitleBinding) obj, i2);
            case 13:
                return onChangeData14((ItemAnotherPassData2Binding) obj, i2);
            case 14:
                return onChangeData3((ItemAnotherPassDataBinding) obj, i2);
            case 15:
                return onChangeTitle7((ItemAnotherTitleBinding) obj, i2);
            case 16:
                return onChangeVmCreateAnotherPassBodyObservable((ObservableField) obj, i2);
            case 17:
                return onChangeData8((ItemAnotherPassData2Binding) obj, i2);
            case 18:
                return onChangeData11((ItemAnotherPassData2Binding) obj, i2);
            case 19:
                return onChangeData19((ItemAnotherPassDataWithHintBinding) obj, i2);
            case 20:
                return onChangeVmCreateAnotherPassBodyDocumentObservableGet((IdentityDocument) obj, i2);
            case 21:
                return onChangeTitle6((ItemAnotherTitleBinding) obj, i2);
            case 22:
                return onChangeData9((ItemAnotherPassDataBinding) obj, i2);
            case 23:
                return onChangeData12((ItemAnotherPassData2Binding) obj, i2);
            case 24:
                return onChangeData1((ItemAnotherPassDataBinding) obj, i2);
            case 25:
                return onChangeTitle5((ItemAnotherTitleBinding) obj, i2);
            case 26:
                return onChangeData6((ItemAnotherPassDataBinding) obj, i2);
            case 27:
                return onChangeCompany((ItemFieldSpinnerBinding) obj, i2);
            case 28:
                return onChangeData17((ItemAnotherPassDataBinding) obj, i2);
            case 29:
                return onChangeVmCreateAnotherPassBodyVehicleObservable((ObservableField) obj, i2);
            case 30:
                return onChangeTitle4((ItemAnotherTitleBinding) obj, i2);
            case 31:
                return onChangeData10((ItemAnotherPassData2Binding) obj, i2);
            case 32:
                return onChangeData7((ItemAnotherPassDataBinding) obj, i2);
            case 33:
                return onChangeData18((ItemAnotherPassDataBinding) obj, i2);
            default:
                return false;
        }
    }

    private boolean onChangeTitle3(ItemAnotherTitleBinding itemAnotherTitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmCreateAnotherPassBodyDocumentObservable(ObservableField<IdentityDocument> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeData4(ItemAnotherPassDataBinding itemAnotherPassDataBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeTitle2(ItemAnotherGuestDataTitleBinding itemAnotherGuestDataTitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeVmCreateAnotherPassBodyVehicleObservableGet(VehicleData vehicleData, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeVmCreateAnotherPassBodyObservableGet(CreateAnotherPassRequestBody createAnotherPassRequestBody, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeData16(ItemAnotherPassDataBinding itemAnotherPassDataBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeTitle9(ItemAnotherTitleBinding itemAnotherTitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeTitle1(ItemAnotherTitleBinding itemAnotherTitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeData13(ItemAnotherPassData2Binding itemAnotherPassData2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        return true;
    }

    private boolean onChangeData2(ItemAnotherPassDataBinding itemAnotherPassDataBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        return true;
    }

    private boolean onChangeTitle8(ItemAnotherTitleBinding itemAnotherTitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        return true;
    }

    private boolean onChangeTitle10(ItemAnotherGuestDataTitleBinding itemAnotherGuestDataTitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        return true;
    }

    private boolean onChangeData14(ItemAnotherPassData2Binding itemAnotherPassData2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        return true;
    }

    private boolean onChangeData3(ItemAnotherPassDataBinding itemAnotherPassDataBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16384;
        }
        return true;
    }

    private boolean onChangeTitle7(ItemAnotherTitleBinding itemAnotherTitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
        }
        return true;
    }

    private boolean onChangeVmCreateAnotherPassBodyObservable(ObservableField<CreateAnotherPassRequestBody> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 65536;
        }
        return true;
    }

    private boolean onChangeData8(ItemAnotherPassData2Binding itemAnotherPassData2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        }
        return true;
    }

    private boolean onChangeData11(ItemAnotherPassData2Binding itemAnotherPassData2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        }
        return true;
    }

    private boolean onChangeData19(ItemAnotherPassDataWithHintBinding itemAnotherPassDataWithHintBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        }
        return true;
    }

    private boolean onChangeVmCreateAnotherPassBodyDocumentObservableGet(IdentityDocument identityDocument, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        return true;
    }

    private boolean onChangeTitle6(ItemAnotherTitleBinding itemAnotherTitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
        }
        return true;
    }

    private boolean onChangeData9(ItemAnotherPassDataBinding itemAnotherPassDataBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4194304;
        }
        return true;
    }

    private boolean onChangeData12(ItemAnotherPassData2Binding itemAnotherPassData2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8388608;
        }
        return true;
    }

    private boolean onChangeData1(ItemAnotherPassDataBinding itemAnotherPassDataBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16777216;
        }
        return true;
    }

    private boolean onChangeTitle5(ItemAnotherTitleBinding itemAnotherTitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 33554432;
        }
        return true;
    }

    private boolean onChangeData6(ItemAnotherPassDataBinding itemAnotherPassDataBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 67108864;
        }
        return true;
    }

    private boolean onChangeCompany(ItemFieldSpinnerBinding itemFieldSpinnerBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 134217728;
        }
        return true;
    }

    private boolean onChangeData17(ItemAnotherPassDataBinding itemAnotherPassDataBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 268435456;
        }
        return true;
    }

    private boolean onChangeVmCreateAnotherPassBodyVehicleObservable(ObservableField<VehicleData> observableField, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 536870912;
        }
        return true;
    }

    private boolean onChangeTitle4(ItemAnotherTitleBinding itemAnotherTitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1073741824;
        }
        return true;
    }

    private boolean onChangeData10(ItemAnotherPassData2Binding itemAnotherPassData2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= CacheValidityPolicy.MAX_AGE;
        }
        return true;
    }

    private boolean onChangeData7(ItemAnotherPassDataBinding itemAnotherPassDataBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4294967296L;
        }
        return true;
    }

    private boolean onChangeData18(ItemAnotherPassDataBinding itemAnotherPassDataBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8589934592L;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0895  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x08fb  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0914  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0924  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r53 = this;
            r1 = r53
            monitor-enter(r53)
            long r2 = r1.mDirtyFlags     // Catch:{ all -> 0x09ed }
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x09ed }
            monitor-exit(r53)     // Catch:{ all -> 0x09ed }
            ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel r0 = r1.mVm
            r6 = 52077592626(0xc20110032, double:2.57297494346E-313)
            long r6 = r6 & r2
            r8 = 2
            r9 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            r13 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            r17 = 36028797018963968(0x80000000000000, double:2.8480945388892178E-306)
            r19 = 51540656130(0xc00100002, double:2.5464467558E-313)
            r21 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            r25 = 51539673120(0xc00010020, double:2.54639818865E-313)
            r12 = 1
            r28 = 0
            r29 = 0
            int r30 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r30 == 0) goto L_0x0277
            long r6 = r2 & r19
            int r30 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r30 == 0) goto L_0x0061
            if (r0 == 0) goto L_0x0041
            androidx.databinding.ObservableField r6 = r0.getCreateAnotherPassBodyDocumentObservable()
            goto L_0x0043
        L_0x0041:
            r6 = r28
        L_0x0043:
            r1.updateRegistration((int) r12, (androidx.databinding.Observable) r6)
            if (r6 == 0) goto L_0x004f
            java.lang.Object r6 = r6.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r6 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r6
            goto L_0x0051
        L_0x004f:
            r6 = r28
        L_0x0051:
            r7 = 20
            r1.updateRegistration((int) r7, (androidx.databinding.Observable) r6)
            if (r6 == 0) goto L_0x0061
            java.lang.String r7 = r6.getIssuedDate()
            java.lang.String r6 = r6.getNumber()
            goto L_0x0064
        L_0x0061:
            r6 = r28
            r7 = r6
        L_0x0064:
            long r30 = r2 & r25
            int r32 = (r30 > r4 ? 1 : (r30 == r4 ? 0 : -1))
            if (r32 == 0) goto L_0x01a2
            if (r0 == 0) goto L_0x0079
            androidx.databinding.ObservableField r30 = r0.getCreateAnotherPassBodyObservable()
            boolean r31 = r0.isAutoShowing()
            r15 = r30
            r16 = r31
            goto L_0x007d
        L_0x0079:
            r15 = r28
            r16 = 0
        L_0x007d:
            r11 = 16
            r1.updateRegistration((int) r11, (androidx.databinding.Observable) r15)
            if (r32 == 0) goto L_0x00a3
            if (r16 == 0) goto L_0x0090
            long r2 = r2 | r21
            r33 = 562949953421312(0x2000000000000, double:2.781342323134002E-309)
            long r2 = r2 | r33
            long r2 = r2 | r13
            long r2 = r2 | r17
            goto L_0x00a3
        L_0x0090:
            r33 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r2 = r2 | r33
            r33 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r2 = r2 | r33
            r33 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r2 = r2 | r33
            r33 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            long r2 = r2 | r33
        L_0x00a3:
            if (r15 == 0) goto L_0x00ac
            java.lang.Object r11 = r15.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r11 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r11
            goto L_0x00ae
        L_0x00ac:
            r11 = r28
        L_0x00ae:
            r15 = 5
            r1.updateRegistration((int) r15, (androidx.databinding.Observable) r11)
            r15 = r16 ^ 1
            long r33 = r2 & r25
            int r32 = (r33 > r4 ? 1 : (r33 == r4 ? 0 : -1))
            if (r32 == 0) goto L_0x00c5
            if (r15 == 0) goto L_0x00be
            long r2 = r2 | r9
            goto L_0x00c5
        L_0x00be:
            r33 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            long r2 = r2 | r33
        L_0x00c5:
            if (r11 == 0) goto L_0x0106
            java.lang.String r32 = r11.getName()
            java.lang.String r33 = r11.getTimeFrom()
            java.lang.String r34 = r11.getBirthday()
            java.lang.String r35 = r11.getTimeTo()
            java.lang.String r36 = r11.getStrategy()
            java.lang.String r37 = r11.getCompany()
            java.lang.String r38 = r11.getDateFrom()
            java.lang.String r39 = r11.getEmail()
            java.lang.String r40 = r11.getPatronymic()
            java.lang.String r41 = r11.getDateTo()
            java.lang.String r42 = r11.getPhone()
            java.lang.String r43 = r11.getComment()
            java.lang.String r44 = r11.getPersonsCount()
            java.lang.String r11 = r11.getSurname()
            r52 = r36
            r36 = r11
            r11 = r52
            goto L_0x0122
        L_0x0106:
            r11 = r28
            r32 = r11
            r33 = r32
            r34 = r33
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
        L_0x0122:
            android.widget.TextView r9 = r1.mboundView5
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131887242(0x7f12048a, float:1.9409086E38)
            java.lang.String r9 = r9.getString(r10)
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r29] = r33
            r10[r12] = r35
            java.lang.String r9 = java.lang.String.format(r9, r10)
            if (r11 == 0) goto L_0x015d
            android.view.View r10 = r53.getRoot()
            android.content.res.Resources r10 = r10.getResources()
            r8 = 2131886204(0x7f12007c, float:1.940698E38)
            java.lang.String r10 = r10.getString(r8)
            boolean r10 = r11.equals(r10)
            android.widget.TextView r12 = r1.mboundView4
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getString(r8)
            boolean r8 = r11.equals(r12)
            goto L_0x015f
        L_0x015d:
            r8 = 0
            r10 = 0
        L_0x015f:
            long r45 = r2 & r25
            int r12 = (r45 > r4 ? 1 : (r45 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x016e
            if (r10 == 0) goto L_0x016a
            r45 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            goto L_0x016c
        L_0x016a:
            r45 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
        L_0x016c:
            long r2 = r2 | r45
        L_0x016e:
            long r45 = r2 & r25
            int r12 = (r45 > r4 ? 1 : (r45 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x017d
            if (r8 == 0) goto L_0x0179
            r45 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            goto L_0x017b
        L_0x0179:
            r45 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
        L_0x017b:
            long r2 = r2 | r45
        L_0x017d:
            if (r10 == 0) goto L_0x0181
            r12 = 0
            goto L_0x0183
        L_0x0181:
            r12 = 8
        L_0x0183:
            if (r8 == 0) goto L_0x018f
            android.widget.TextView r8 = r1.mboundView4
            android.content.res.Resources r8 = r8.getResources()
            r13 = 2131887491(0x7f120583, float:1.940959E38)
            goto L_0x0198
        L_0x018f:
            android.widget.TextView r8 = r1.mboundView4
            android.content.res.Resources r8 = r8.getResources()
            r13 = 2131888164(0x7f120824, float:1.9410956E38)
        L_0x0198:
            java.lang.String r8 = r8.getString(r13)
            r13 = 51539607552(0xc00000000, double:2.54639494916E-313)
            goto L_0x01ca
        L_0x01a2:
            r8 = r28
            r9 = r8
            r11 = r9
            r32 = r11
            r33 = r32
            r34 = r33
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r10 = 0
            r12 = 0
            r13 = 51539607552(0xc00000000, double:2.54639494916E-313)
            r15 = 0
            r16 = 0
        L_0x01ca:
            long r47 = r2 & r13
            int r13 = (r47 > r4 ? 1 : (r47 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x01e9
            if (r0 == 0) goto L_0x01d7
            boolean r14 = r0.getHasBuildingTime()
            goto L_0x01d8
        L_0x01d7:
            r14 = 0
        L_0x01d8:
            if (r13 == 0) goto L_0x01e3
            if (r14 == 0) goto L_0x01df
            r47 = 144115188075855872(0x200000000000000, double:4.7783097267364807E-299)
            goto L_0x01e1
        L_0x01df:
            r47 = 72057594037927936(0x100000000000000, double:7.2911220195563975E-304)
        L_0x01e1:
            long r2 = r2 | r47
        L_0x01e3:
            if (r14 == 0) goto L_0x01e6
            goto L_0x01e9
        L_0x01e6:
            r13 = 8
            goto L_0x01ea
        L_0x01e9:
            r13 = 0
        L_0x01ea:
            r23 = 52076478480(0xc20000010, double:2.57291989734E-313)
            long r47 = r2 & r23
            int r14 = (r47 > r4 ? 1 : (r47 == r4 ? 0 : -1))
            if (r14 == 0) goto L_0x024b
            if (r0 == 0) goto L_0x01fc
            androidx.databinding.ObservableField r14 = r0.getCreateAnotherPassBodyVehicleObservable()
            goto L_0x01fe
        L_0x01fc:
            r14 = r28
        L_0x01fe:
            r4 = 29
            r1.updateRegistration((int) r4, (androidx.databinding.Observable) r14)
            if (r14 == 0) goto L_0x020c
            java.lang.Object r4 = r14.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData r4 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData) r4
            goto L_0x020e
        L_0x020c:
            r4 = r28
        L_0x020e:
            r5 = 4
            r1.updateRegistration((int) r5, (androidx.databinding.Observable) r4)
            if (r4 == 0) goto L_0x024b
            java.lang.String r28 = r4.getBrand()
            java.lang.String r4 = r4.getNumber()
            r49 = r6
            r51 = r8
            r50 = r9
            r5 = r33
            r9 = r38
            r14 = r41
            r6 = r43
            r8 = r44
            r33 = r28
            r38 = r37
            r28 = r10
            r37 = r34
            r10 = r40
            r34 = r7
            r7 = r35
            r35 = r13
            r13 = r12
            r12 = r36
            r36 = r0
            r0 = r42
            r52 = r32
            r32 = r4
            r4 = r52
            goto L_0x029f
        L_0x024b:
            r49 = r6
            r51 = r8
            r50 = r9
            r4 = r32
            r5 = r33
            r9 = r38
            r14 = r41
            r6 = r43
            r8 = r44
            r32 = r28
            r33 = r32
            r38 = r37
            r28 = r10
            r37 = r34
            r10 = r40
            r34 = r7
            r7 = r35
            r35 = r13
            r13 = r12
            r12 = r36
            r36 = r0
            r0 = r42
            goto L_0x029f
        L_0x0277:
            r36 = r0
            r0 = r28
            r4 = r0
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r14 = r12
            r32 = r14
            r33 = r32
            r34 = r33
            r37 = r34
            r38 = r37
            r39 = r38
            r49 = r39
            r50 = r49
            r51 = r50
            r13 = 0
            r15 = 0
            r16 = 0
            r28 = 0
            r35 = 0
        L_0x029f:
            long r21 = r2 & r21
            r40 = 0
            int r42 = (r21 > r40 ? 1 : (r21 == r40 ? 0 : -1))
            if (r42 == 0) goto L_0x02bf
            if (r11 == 0) goto L_0x02bf
            r21 = r0
            android.widget.TextView r0 = r1.tvNoPlaces
            android.content.res.Resources r0 = r0.getResources()
            r22 = r10
            r10 = 2131886204(0x7f12007c, float:1.940698E38)
            java.lang.String r0 = r0.getString(r10)
            boolean r0 = r11.equals(r0)
            goto L_0x02c4
        L_0x02bf:
            r21 = r0
            r22 = r10
            r0 = 0
        L_0x02c4:
            long r17 = r2 & r17
            r40 = 0
            int r10 = (r17 > r40 ? 1 : (r17 == r40 ? 0 : -1))
            if (r10 == 0) goto L_0x02e2
            if (r11 == 0) goto L_0x02e2
            android.widget.CheckBox r10 = r1.checkboxDifferentVehicleType
            android.content.res.Resources r10 = r10.getResources()
            r17 = r0
            r0 = 2131886204(0x7f12007c, float:1.940698E38)
            java.lang.String r10 = r10.getString(r0)
            boolean r0 = r11.equals(r10)
            goto L_0x02e5
        L_0x02e2:
            r17 = r0
            r0 = 0
        L_0x02e5:
            long r40 = r2 & r25
            r42 = 0
            int r10 = (r40 > r42 ? 1 : (r40 == r42 ? 0 : -1))
            if (r10 == 0) goto L_0x0309
            if (r16 == 0) goto L_0x02f0
            goto L_0x02f2
        L_0x02f0:
            r28 = 0
        L_0x02f2:
            if (r10 == 0) goto L_0x0303
            if (r28 == 0) goto L_0x02fc
            r40 = 137438953472(0x2000000000, double:6.7903865311E-313)
            goto L_0x0301
        L_0x02fc:
            r40 = 68719476736(0x1000000000, double:3.39519326554E-313)
        L_0x0301:
            long r2 = r2 | r40
        L_0x0303:
            if (r28 == 0) goto L_0x0306
            goto L_0x0309
        L_0x0306:
            r10 = 8
            goto L_0x030a
        L_0x0309:
            r10 = 0
        L_0x030a:
            r40 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            long r40 = r2 & r40
            r42 = 0
            int r18 = (r40 > r42 ? 1 : (r40 == r42 ? 0 : -1))
            if (r18 == 0) goto L_0x032c
            if (r11 == 0) goto L_0x032c
            r18 = r0
            android.widget.LinearLayout r0 = r1.llZoneSlots
            android.content.res.Resources r0 = r0.getResources()
            r28 = r4
            r4 = 2131886204(0x7f12007c, float:1.940698E38)
            java.lang.String r0 = r0.getString(r4)
            boolean r0 = r11.equals(r0)
            goto L_0x0331
        L_0x032c:
            r18 = r0
            r28 = r4
            r0 = 0
        L_0x0331:
            r40 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            long r40 = r2 & r40
            r42 = 0
            int r4 = (r40 > r42 ? 1 : (r40 == r42 ? 0 : -1))
            if (r4 == 0) goto L_0x0354
            if (r11 == 0) goto L_0x0354
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r4 = r1.auto
            android.content.res.Resources r4 = r4.getResources()
            r40 = r0
            r0 = 2131886204(0x7f12007c, float:1.940698E38)
            java.lang.String r0 = r4.getString(r0)
            boolean r0 = r11.equals(r0)
            goto L_0x0357
        L_0x0354:
            r40 = r0
            r0 = 0
        L_0x0357:
            long r41 = r2 & r25
            r43 = 0
            int r4 = (r41 > r43 ? 1 : (r41 == r43 ? 0 : -1))
            if (r4 == 0) goto L_0x03d7
            if (r16 == 0) goto L_0x0362
            goto L_0x0364
        L_0x0362:
            r17 = 0
        L_0x0364:
            if (r15 == 0) goto L_0x0367
            goto L_0x0368
        L_0x0367:
            r0 = 0
        L_0x0368:
            if (r16 == 0) goto L_0x036b
            goto L_0x036d
        L_0x036b:
            r40 = 0
        L_0x036d:
            if (r16 == 0) goto L_0x0370
            goto L_0x0372
        L_0x0370:
            r18 = 0
        L_0x0372:
            if (r4 == 0) goto L_0x0382
            if (r17 == 0) goto L_0x037c
            r15 = 2199023255552(0x20000000000, double:1.0864618449742E-311)
            goto L_0x0381
        L_0x037c:
            r15 = 1099511627776(0x10000000000, double:5.43230922487E-312)
        L_0x0381:
            long r2 = r2 | r15
        L_0x0382:
            long r15 = r2 & r25
            r41 = 0
            int r4 = (r15 > r41 ? 1 : (r15 == r41 ? 0 : -1))
            if (r4 == 0) goto L_0x0392
            if (r0 == 0) goto L_0x038f
            r15 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            goto L_0x0391
        L_0x038f:
            r15 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
        L_0x0391:
            long r2 = r2 | r15
        L_0x0392:
            long r15 = r2 & r25
            int r4 = (r15 > r41 ? 1 : (r15 == r41 ? 0 : -1))
            if (r4 == 0) goto L_0x03a6
            if (r40 == 0) goto L_0x03a0
            r15 = 549755813888(0x8000000000, double:2.716154612436E-312)
            goto L_0x03a5
        L_0x03a0:
            r15 = 274877906944(0x4000000000, double:1.358077306218E-312)
        L_0x03a5:
            long r2 = r2 | r15
        L_0x03a6:
            long r15 = r2 & r25
            int r4 = (r15 > r41 ? 1 : (r15 == r41 ? 0 : -1))
            if (r4 == 0) goto L_0x03ba
            if (r18 == 0) goto L_0x03b4
            r15 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            goto L_0x03b9
        L_0x03b4:
            r15 = 17592186044416(0x100000000000, double:8.6916947597938E-311)
        L_0x03b9:
            long r2 = r2 | r15
        L_0x03ba:
            if (r17 == 0) goto L_0x03be
            r4 = 0
            goto L_0x03c0
        L_0x03be:
            r4 = 8
        L_0x03c0:
            if (r0 == 0) goto L_0x03c4
            r0 = 0
            goto L_0x03c6
        L_0x03c4:
            r0 = 8
        L_0x03c6:
            if (r40 == 0) goto L_0x03ca
            r11 = 0
            goto L_0x03cc
        L_0x03ca:
            r11 = 8
        L_0x03cc:
            if (r18 == 0) goto L_0x03d1
            r27 = 0
            goto L_0x03d3
        L_0x03d1:
            r27 = 8
        L_0x03d3:
            r15 = r4
            r4 = r27
            goto L_0x03db
        L_0x03d7:
            r0 = 0
            r4 = 0
            r11 = 0
            r15 = 0
        L_0x03db:
            long r16 = r2 & r25
            r25 = 0
            int r18 = (r16 > r25 ? 1 : (r16 == r25 ? 0 : -1))
            r16 = r2
            if (r18 == 0) goto L_0x0493
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r2 = r1.auto
            r2.setVisibility(r0)
            android.widget.CheckBox r0 = r1.checkboxDifferentVehicleType
            r0.setVisibility(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data1
            r0.setValue(r12)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data11
            r0.setValue(r9)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data12
            r0.setValue(r14)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data13
            android.view.View r0 = r0.getRoot()
            r0.setVisibility(r13)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data13
            r0.setValue(r5)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data14
            android.view.View r0 = r0.getRoot()
            r0.setVisibility(r13)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data14
            r0.setValue(r7)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data16
            r0.setValue(r6)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data17
            r0.setValue(r8)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data18
            android.view.View r0 = r0.getRoot()
            r0.setVisibility(r10)
            ru.unicorn.databinding.ItemAnotherPassDataWithHintBinding r0 = r1.data19
            android.view.View r0 = r0.getRoot()
            r0.setVisibility(r10)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data2
            r2 = r28
            r0.setValue(r2)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data3
            r2 = r22
            r0.setValue(r2)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data4
            r2 = r21
            r0.setValue(r2)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data6
            r2 = r39
            r0.setValue(r2)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data7
            r2 = r38
            r0.setValue(r2)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data8
            r2 = r37
            r0.setValue(r2)
            android.widget.LinearLayout r0 = r1.llZoneSlots
            r0.setVisibility(r11)
            android.widget.TextView r0 = r1.mboundView4
            r8 = r51
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r8)
            android.widget.TextView r0 = r1.mboundView5
            r9 = r50
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r9)
            ru.unicorn.databinding.ItemAnotherGuestDataTitleBinding r0 = r1.title10
            android.view.View r0 = r0.getRoot()
            r0.setVisibility(r10)
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r1.title8
            android.view.View r0 = r0.getRoot()
            r0.setVisibility(r10)
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r1.title9
            android.view.View r0 = r0.getRoot()
            r0.setVisibility(r10)
            android.widget.TextView r0 = r1.tvNoPlaces
            r0.setVisibility(r15)
        L_0x0493:
            r2 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r2 = r16 & r2
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0888
            android.widget.RadioButton r2 = r1.btnPassOneTime
            android.view.View$OnClickListener r3 = r1.mCallback8
            r2.setOnClickListener(r3)
            android.widget.RadioButton r2 = r1.btnPassTime
            android.view.View$OnClickListener r3 = r1.mCallback7
            r2.setOnClickListener(r3)
            ru.unicorn.databinding.ItemFieldSpinnerBinding r2 = r1.company
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsRequired(r4)
            ru.unicorn.databinding.ItemFieldSpinnerBinding r2 = r1.company
            android.view.View r4 = r53.getRoot()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131886975(0x7f12037f, float:1.9408544E38)
            java.lang.String r4 = r4.getString(r5)
            r2.setTitle(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsRequired(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsEnabled(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data1
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887913(0x7f120729, float:1.9410447E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data1
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue1244761327
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data1value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data10
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r29)
            r2.setIsEnabled(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data10
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887141(0x7f120425, float:1.940888E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data10
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue2000388396
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data10value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data11
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsRequired(r4)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data11
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r29)
            r2.setIsEnabled(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data11
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887002(0x7f12039a, float:1.9408599E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data12
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsRequired(r4)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data12
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r29)
            r2.setIsEnabled(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data12
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887004(0x7f12039c, float:1.9408603E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data13
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsRequired(r4)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data13
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r29)
            r2.setIsEnabled(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data13
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue1771821638
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data13value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data13
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887240(0x7f120488, float:1.9409081E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data14
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsRequired(r4)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data14
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r29)
            r2.setIsEnabled(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data14
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue1087010236
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data14value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data14
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887241(0x7f120489, float:1.9409084E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data16
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsEnabled(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data16
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887161(0x7f120439, float:1.9408921E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data16
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue1723965383
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data16value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data17
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsEnabled(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data17
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131886990(0x7f12038e, float:1.9408574E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data17
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.setInputType(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data17
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue1788437380
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data17value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data18
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsEnabled(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data18
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131886929(0x7f120351, float:1.940845E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data18
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue368012094
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data18value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassDataWithHintBinding r2 = r1.data19
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsEnabled(r4)
            ru.unicorn.databinding.ItemAnotherPassDataWithHintBinding r2 = r1.data19
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887118(0x7f12040e, float:1.9408834E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassDataWithHintBinding r2 = r1.data19
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue1624672106
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data19value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data2
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsRequired(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsEnabled(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data2
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887901(0x7f12071d, float:1.9410422E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data2
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue1014356356
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data2value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data3
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsEnabled(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data3
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887903(0x7f12071f, float:1.9410426E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data3
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue1967554960
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data3value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data4
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsEnabled(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data4
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887146(0x7f12042a, float:1.940889E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data4
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue1038201812
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data4value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data6
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsEnabled(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data6
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887892(0x7f120714, float:1.9410404E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data6
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue2139301308
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data6value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data7
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.setIsEnabled(r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data7
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887254(0x7f120496, float:1.940911E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data7
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue1642924196
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data7value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data8
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r29)
            r2.setIsEnabled(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data8
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887882(0x7f12070a, float:1.9410384E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data8
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue524259739
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data8value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data9
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.setIsEnabled(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data9
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.setInputType(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data9
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887140(0x7f120424, float:1.9408879E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data9
            androidx.databinding.InverseBindingListener r3 = r1.mOldEventValue53175204
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r4 = r1.data9value
            setBindingInverseListener(r2, r3, r4)
            ru.unicorn.databinding.ItemAnotherTitleBinding r2 = r1.title1
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131886965(0x7f120375, float:1.9408524E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherGuestDataTitleBinding r2 = r1.title10
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131888300(0x7f1208ac, float:1.9411231E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setBtnTitle(r3)
            ru.unicorn.databinding.ItemAnotherGuestDataTitleBinding r2 = r1.title10
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887915(0x7f12072b, float:1.941045E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherGuestDataTitleBinding r2 = r1.title2
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131886179(0x7f120063, float:1.940693E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setBtnTitle(r3)
            ru.unicorn.databinding.ItemAnotherGuestDataTitleBinding r2 = r1.title2
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131886198(0x7f120076, float:1.9406968E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherTitleBinding r2 = r1.title3
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131886958(0x7f12036e, float:1.940851E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherTitleBinding r2 = r1.title4
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887003(0x7f12039b, float:1.94086E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherTitleBinding r2 = r1.title5
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131886187(0x7f12006b, float:1.9406946E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherTitleBinding r2 = r1.title6
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887024(0x7f1203b0, float:1.9408643E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherTitleBinding r2 = r1.title7
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887052(0x7f1203cc, float:1.94087E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherTitleBinding r2 = r1.title8
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131886920(0x7f120348, float:1.9408432E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
            ru.unicorn.databinding.ItemAnotherTitleBinding r2 = r1.title9
            android.view.View r3 = r53.getRoot()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131887131(0x7f12041b, float:1.940886E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setTitle(r3)
        L_0x0888:
            r2 = 51539607552(0xc00000000, double:2.54639494916E-313)
            long r2 = r16 & r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x08f3
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data1
            r3 = r36
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data10
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data11
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data12
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data13
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data14
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data16
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data17
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data18
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassDataWithHintBinding r2 = r1.data19
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data2
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data3
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data4
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data6
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data7
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data8
            r2.setVm(r3)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data9
            r2.setVm(r3)
            android.widget.TextView r2 = r1.mboundView5
            r13 = r35
            r2.setVisibility(r13)
        L_0x08f3:
            long r2 = r16 & r19
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0909
            ru.unicorn.databinding.ItemAnotherPassData2Binding r2 = r1.data10
            r7 = r34
            r2.setValue(r7)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data9
            r6 = r49
            r2.setValue(r6)
        L_0x0909:
            r2 = 52076478480(0xc20000010, double:2.57291989734E-313)
            long r2 = r16 & r2
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0922
            ru.unicorn.databinding.ItemAnotherPassDataBinding r2 = r1.data18
            r3 = r33
            r2.setValue(r3)
            ru.unicorn.databinding.ItemAnotherPassDataWithHintBinding r2 = r1.data19
            r4 = r32
            r2.setValue(r4)
        L_0x0922:
            if (r0 == 0) goto L_0x0960
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data1value
            r1.mOldEventValue1244761327 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data10value
            r1.mOldEventValue2000388396 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data13value
            r1.mOldEventValue1771821638 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data14value
            r1.mOldEventValue1087010236 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data16value
            r1.mOldEventValue1723965383 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data17value
            r1.mOldEventValue1788437380 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data18value
            r1.mOldEventValue368012094 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data19value
            r1.mOldEventValue1624672106 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data2value
            r1.mOldEventValue1014356356 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data3value
            r1.mOldEventValue1967554960 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data4value
            r1.mOldEventValue1038201812 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data6value
            r1.mOldEventValue2139301308 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data7value
            r1.mOldEventValue1642924196 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data8value
            r1.mOldEventValue524259739 = r0
            androidx.databinding.ViewDataBinding$PropertyChangedInverseListener r0 = r1.data9value
            r1.mOldEventValue53175204 = r0
        L_0x0960:
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r1.title1
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherGuestDataTitleBinding r0 = r1.title2
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data1
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data2
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data3
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data4
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data6
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data7
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r1.title3
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data8
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data9
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data10
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r1.title4
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data11
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data12
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data13
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassData2Binding r0 = r1.data14
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r1.title5
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemFieldSpinnerBinding r0 = r1.company
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data16
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r1.title7
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data17
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherGuestDataTitleBinding r0 = r1.title10
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r1.title9
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r1.title8
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassDataBinding r0 = r1.data18
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherPassDataWithHintBinding r0 = r1.data19
            executeBindingsOn(r0)
            ru.unicorn.databinding.ItemAnotherTitleBinding r0 = r1.title6
            executeBindingsOn(r0)
            return
        L_0x09ed:
            r0 = move-exception
            monitor-exit(r53)     // Catch:{ all -> 0x09ed }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentAnotherPassBindingImpl.executeBindings():void");
    }

    public final void _internalCallbackOnClick(int i, View view) {
        boolean z = false;
        if (i == 1) {
            AnotherPassViewModel anotherPassViewModel = this.mVm;
            if (anotherPassViewModel != null) {
                z = true;
            }
            if (z) {
                anotherPassViewModel.setTemporaryStrategy();
            }
        } else if (i == 2) {
            AnotherPassViewModel anotherPassViewModel2 = this.mVm;
            if (anotherPassViewModel2 != null) {
                z = true;
            }
            if (z) {
                anotherPassViewModel2.setOnetimeStrategy();
            }
        }
    }
}
