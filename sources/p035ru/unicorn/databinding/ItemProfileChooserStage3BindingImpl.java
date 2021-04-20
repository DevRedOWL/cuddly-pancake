package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.generated.callback.OnClickListener;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.databinding.ItemProfileChooserStage3BindingImpl */
public class ItemProfileChooserStage3BindingImpl extends ItemProfileChooserStage3Binding implements OnClickListener.Listener {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private final View.OnClickListener mCallback2;
    private final View.OnClickListener mCallback3;
    private final View.OnClickListener mCallback4;
    private final View.OnClickListener mCallback5;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        sViewsWithIds.put(R.id.underline, 4);
    }

    public ItemProfileChooserStage3BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private ItemProfileChooserStage3BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[1], objArr[3], objArr[2], objArr[4]);
        this.mDirtyFlags = -1;
        this.f6604cb.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.subtitle.setTag((Object) null);
        this.title.setTag((Object) null);
        setRootTag(view);
        this.mCallback5 = new OnClickListener(this, 4);
        this.mCallback3 = new OnClickListener(this, 2);
        this.mCallback4 = new OnClickListener(this, 3);
        this.mCallback2 = new OnClickListener(this, 1);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 32;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean setVariable(int i, Object obj) {
        if (32 == i) {
            setPosition((Integer) obj);
        } else if (26 == i) {
            setVm((ProfileSelectionVM) obj);
        } else if (5 == i) {
            setTitle((String) obj);
        } else if (13 == i) {
            setSelected((Integer) obj);
        } else if (27 != i) {
            return false;
        } else {
            setSubtitle((String) obj);
        }
        return true;
    }

    public void setPosition(Integer num) {
        this.mPosition = num;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(32);
        super.requestRebind();
    }

    public void setVm(ProfileSelectionVM profileSelectionVM) {
        this.mVm = profileSelectionVM;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    public void setSelected(Integer num) {
        this.mSelected = num;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(13);
        super.requestRebind();
    }

    public void setSubtitle(String str) {
        this.mSubtitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(27);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        int i;
        int i2;
        long j2;
        long j3;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        Integer num = this.mPosition;
        ProfileSelectionVM profileSelectionVM = this.mVm;
        String str = this.mTitle;
        Integer num2 = this.mSelected;
        String str2 = this.mSubtitle;
        boolean z = false;
        int i3 = ((j & 41) > 0 ? 1 : ((j & 41) == 0 ? 0 : -1));
        if (i3 != 0) {
            if (num == num2) {
                z = true;
            }
            if (i3 != 0) {
                if (z) {
                    j3 = j | 128;
                    j2 = 512;
                } else {
                    j3 = j | 64;
                    j2 = 256;
                }
                j = j3 | j2;
            }
            TextView textView = this.title;
            i = z ? getColorFromResource(textView, R.color.brandTextAsBrandMain) : getColorFromResource(textView, R.color.brandTextPrimary);
            i2 = z ? getColorFromResource(this.subtitle, R.color.brandTextAsBrandMain) : getColorFromResource(this.subtitle, R.color.brandTextSecondary);
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = ((36 & j) > 0 ? 1 : ((36 & j) == 0 ? 0 : -1));
        int i5 = ((48 & j) > 0 ? 1 : ((48 & j) == 0 ? 0 : -1));
        if ((41 & j) != 0) {
            CompoundButtonBindingAdapter.setChecked(this.f6604cb, z);
            this.subtitle.setTextColor(i2);
            this.title.setTextColor(i);
        }
        if ((j & 32) != 0) {
            this.f6604cb.setOnClickListener(this.mCallback3);
            this.mboundView0.setOnClickListener(this.mCallback2);
            this.subtitle.setOnClickListener(this.mCallback5);
            this.title.setOnClickListener(this.mCallback4);
        }
        if (i5 != 0) {
            TextViewBindingAdapter.setText(this.subtitle, str2);
        }
        if (i4 != 0) {
            TextViewBindingAdapter.setText(this.title, str);
        }
    }

    public final void _internalCallbackOnClick(int i, View view) {
        boolean z = false;
        if (i == 1) {
            ProfileSelectionVM profileSelectionVM = this.mVm;
            Integer num = this.mPosition;
            if (profileSelectionVM != null) {
                z = true;
            }
            if (z) {
                profileSelectionVM.checkCurrentRole(num.intValue());
            }
        } else if (i == 2) {
            ProfileSelectionVM profileSelectionVM2 = this.mVm;
            Integer num2 = this.mPosition;
            if (profileSelectionVM2 != null) {
                z = true;
            }
            if (z) {
                profileSelectionVM2.checkCurrentRole(num2.intValue());
            }
        } else if (i == 3) {
            ProfileSelectionVM profileSelectionVM3 = this.mVm;
            Integer num3 = this.mPosition;
            if (profileSelectionVM3 != null) {
                z = true;
            }
            if (z) {
                profileSelectionVM3.checkCurrentRole(num3.intValue());
            }
        } else if (i == 4) {
            ProfileSelectionVM profileSelectionVM4 = this.mVm;
            Integer num4 = this.mPosition;
            if (profileSelectionVM4 != null) {
                z = true;
            }
            if (z) {
                profileSelectionVM4.checkCurrentRole(num4.intValue());
            }
        }
    }
}
