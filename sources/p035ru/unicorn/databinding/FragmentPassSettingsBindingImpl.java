package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;

/* renamed from: ru.unicorn.databinding.FragmentPassSettingsBindingImpl */
public class FragmentPassSettingsBindingImpl extends FragmentPassSettingsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(10);
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    private final LinearLayout mboundView1;
    private final LinearLayout mboundView2;

    static {
        sIncludes.setIncludes(1, new String[]{"item_label_with_switch", "item_label_with_switch", "item_id_pass_items"}, new int[]{3, 4, 5}, new int[]{R.layout.item_label_with_switch, R.layout.item_label_with_switch, R.layout.item_id_pass_items});
        sIncludes.setIncludes(2, new String[]{"item_label_underline_with_arrow_2", "item_label_underline_with_arrow_2", "item_label_underline_with_arrow_2", "item_label_underline_with_arrow_2"}, new int[]{6, 7, 8, 9}, new int[]{R.layout.item_label_underline_with_arrow_2, R.layout.item_label_underline_with_arrow_2, R.layout.item_label_underline_with_arrow_2, R.layout.item_label_underline_with_arrow_2});
    }

    public FragmentPassSettingsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private FragmentPassSettingsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, objArr[6], objArr[7], objArr[8], objArr[9], objArr[3], objArr[4], objArr[5]);
        this.mDirtyFlags = -1;
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.mboundView1 = objArr[1];
        this.mboundView1.setTag((Object) null);
        this.mboundView2 = objArr[2];
        this.mboundView2.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 256;
        }
        this.open1.invalidateAll();
        this.open2.invalidateAll();
        this.passIcon.invalidateAll();
        this.choose1.invalidateAll();
        this.choose2.invalidateAll();
        this.choose3.invalidateAll();
        this.choose4.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.open2.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.passIcon.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.choose1.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.choose2.hasPendingBindings() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6.choose3.hasPendingBindings() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r6.choose4.hasPendingBindings() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.open1.hasPendingBindings() == false) goto L_0x0016;
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
            ru.unicorn.databinding.ItemLabelWithSwitchBinding r0 = r6.open1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemLabelWithSwitchBinding r0 = r6.open2
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemIdPassItemsBinding r0 = r6.passIcon
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemLabelUnderlineWithArrow2Binding r0 = r6.choose1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            ru.unicorn.databinding.ItemLabelUnderlineWithArrow2Binding r0 = r6.choose2
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x003a:
            ru.unicorn.databinding.ItemLabelUnderlineWithArrow2Binding r0 = r6.choose3
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x0043:
            ru.unicorn.databinding.ItemLabelUnderlineWithArrow2Binding r0 = r6.choose4
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentPassSettingsBindingImpl.hasPendingBindings():boolean");
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
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.open1.setLifecycleOwner(lifecycleOwner);
        this.open2.setLifecycleOwner(lifecycleOwner);
        this.passIcon.setLifecycleOwner(lifecycleOwner);
        this.choose1.setLifecycleOwner(lifecycleOwner);
        this.choose2.setLifecycleOwner(lifecycleOwner);
        this.choose3.setLifecycleOwner(lifecycleOwner);
        this.choose4.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return onChangePassIcon((ItemIdPassItemsBinding) obj, i2);
            case 1:
                return onChangeOpen2((ItemLabelWithSwitchBinding) obj, i2);
            case 2:
                return onChangeOpen1((ItemLabelWithSwitchBinding) obj, i2);
            case 3:
                return onChangeChoose4((ItemLabelUnderlineWithArrow2Binding) obj, i2);
            case 4:
                return onChangeChoose3((ItemLabelUnderlineWithArrow2Binding) obj, i2);
            case 5:
                return onChangeChoose2((ItemLabelUnderlineWithArrow2Binding) obj, i2);
            case 6:
                return onChangeChoose1((ItemLabelUnderlineWithArrow2Binding) obj, i2);
            default:
                return false;
        }
    }

    private boolean onChangePassIcon(ItemIdPassItemsBinding itemIdPassItemsBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeOpen2(ItemLabelWithSwitchBinding itemLabelWithSwitchBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeOpen1(ItemLabelWithSwitchBinding itemLabelWithSwitchBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeChoose4(ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeChoose3(ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeChoose2(ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeChoose1(ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        if ((j & 256) != 0) {
            this.choose1.setSize(16);
            this.choose1.setTitle(getRoot().getResources().getString(R.string.label_id_card));
            this.choose1.setVisibleArrow(true);
            this.choose2.setSize(16);
            this.choose2.setTitle(getRoot().getResources().getString(R.string.label_id_finger));
            this.choose2.setVisibleArrow(true);
            this.choose3.setSize(16);
            this.choose3.setTitle(getRoot().getResources().getString(R.string.label_id_ble));
            this.choose3.setVisibleArrow(true);
            this.choose4.setSize(16);
            this.choose4.setTitle(getRoot().getResources().getString(R.string.label_id_face));
            this.choose4.setVisibleArrow(true);
            this.open1.setLabel(getRoot().getResources().getString(R.string.label_open_screen_on));
            this.open1.setEnable(false);
            this.open2.setLabel(getRoot().getResources().getString(R.string.label_open_on_push_click));
            this.open2.setEnable(false);
        }
        executeBindingsOn(this.open1);
        executeBindingsOn(this.open2);
        executeBindingsOn(this.passIcon);
        executeBindingsOn(this.choose1);
        executeBindingsOn(this.choose2);
        executeBindingsOn(this.choose3);
        executeBindingsOn(this.choose4);
    }
}
