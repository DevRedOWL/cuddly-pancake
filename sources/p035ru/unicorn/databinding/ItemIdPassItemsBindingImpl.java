package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;

/* renamed from: ru.unicorn.databinding.ItemIdPassItemsBindingImpl */
public class ItemIdPassItemsBindingImpl extends ItemIdPassItemsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(8);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final LinearLayout mboundView0;
    private final LinearLayout mboundView1;

    static {
        sIncludes.setIncludes(1, new String[]{"item_image", "item_image", "item_image", "item_image", "item_image"}, new int[]{2, 3, 4, 5, 6}, new int[]{R.layout.item_image, R.layout.item_image, R.layout.item_image, R.layout.item_image, R.layout.item_image});
        sViewsWithIds.put(R.id.pbar, 7);
    }

    public ItemIdPassItemsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    private ItemIdPassItemsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
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
            this.mDirtyFlags = 64;
        }
        this.id1.invalidateAll();
        this.id2.invalidateAll();
        this.id3.invalidateAll();
        this.id4.invalidateAll();
        this.id5.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.id2.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.id3.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.id4.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.id5.hasPendingBindings() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.id1.hasPendingBindings() == false) goto L_0x0016;
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
            ru.unicorn.databinding.ItemImageBinding r0 = r6.id1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemImageBinding r0 = r6.id2
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemImageBinding r0 = r6.id3
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemImageBinding r0 = r6.id4
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            ru.unicorn.databinding.ItemImageBinding r0 = r6.id5
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.ItemIdPassItemsBindingImpl.hasPendingBindings():boolean");
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
        this.id1.setLifecycleOwner(lifecycleOwner);
        this.id2.setLifecycleOwner(lifecycleOwner);
        this.id3.setLifecycleOwner(lifecycleOwner);
        this.id4.setLifecycleOwner(lifecycleOwner);
        this.id5.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeId1((ItemImageBinding) obj, i2);
        }
        if (i == 1) {
            return onChangeId2((ItemImageBinding) obj, i2);
        }
        if (i == 2) {
            return onChangeId3((ItemImageBinding) obj, i2);
        }
        if (i == 3) {
            return onChangeId4((ItemImageBinding) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return onChangeId5((ItemImageBinding) obj, i2);
    }

    private boolean onChangeId1(ItemImageBinding itemImageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeId2(ItemImageBinding itemImageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeId3(ItemImageBinding itemImageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeId4(ItemImageBinding itemImageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeId5(ItemImageBinding itemImageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
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
        if ((j & 64) != 0) {
            this.id1.setResourc(getDrawableFromResource(getRoot(), R.drawable.ic_svg_id_barcode));
            this.id1.setActive(false);
            this.id1.setVisible(false);
            this.id2.setResourc(getDrawableFromResource(getRoot(), R.drawable.ic_svg_id_ble));
            this.id2.setActive(false);
            this.id2.setVisible(false);
            this.id3.setResourc(getDrawableFromResource(getRoot(), R.drawable.ic_svg_id_card));
            this.id3.setActive(false);
            this.id3.setVisible(false);
            this.id4.setResourc(getDrawableFromResource(getRoot(), R.drawable.ic_svg_id_face));
            this.id4.setActive(false);
            this.id4.setVisible(false);
            this.id5.setResourc(getDrawableFromResource(getRoot(), R.drawable.ic_svg_id_touch));
            this.id5.setActive(false);
            this.id5.setVisible(false);
        }
        executeBindingsOn(this.id1);
        executeBindingsOn(this.id2);
        executeBindingsOn(this.id3);
        executeBindingsOn(this.id4);
        executeBindingsOn(this.id5);
    }
}
