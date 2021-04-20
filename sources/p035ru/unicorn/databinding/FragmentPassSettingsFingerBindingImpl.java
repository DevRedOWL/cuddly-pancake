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

/* renamed from: ru.unicorn.databinding.FragmentPassSettingsFingerBindingImpl */
public class FragmentPassSettingsFingerBindingImpl extends FragmentPassSettingsFingerBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(8);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    private final LinearLayout mboundView1;
    private final LinearLayout mboundView2;

    static {
        sIncludes.setIncludes(1, new String[]{"item_pass_id_title_with_image"}, new int[]{3}, new int[]{R.layout.item_pass_id_title_with_image});
        sIncludes.setIncludes(2, new String[]{"item_label_underline_with_arrow_2"}, new int[]{4}, new int[]{R.layout.item_label_underline_with_arrow_2});
        sViewsWithIds.put(R.id.rv, 5);
        sViewsWithIds.put(R.id.parent, 6);
        sViewsWithIds.put(R.id.deleteFinger, 7);
    }

    public FragmentPassSettingsFingerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    private FragmentPassSettingsFingerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, objArr[4], objArr[7], objArr[3], objArr[6], objArr[5]);
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
            this.mDirtyFlags = 8;
        }
        this.id1.invalidateAll();
        this.choose1.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.choose1.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
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
            long r0 = r6.mDirtyFlags     // Catch:{ all -> 0x0021 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0021 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0021 }
            ru.unicorn.databinding.ItemPassIdTitleWithImageBinding r0 = r6.id1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemLabelUnderlineWithArrow2Binding r0 = r6.choose1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0021 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentPassSettingsFingerBindingImpl.hasPendingBindings():boolean");
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
        this.choose1.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeId1((ItemPassIdTitleWithImageBinding) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return onChangeChoose1((ItemLabelUnderlineWithArrow2Binding) obj, i2);
    }

    private boolean onChangeId1(ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeChoose1(ItemLabelUnderlineWithArrow2Binding itemLabelUnderlineWithArrow2Binding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
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
        if ((j & 8) != 0) {
            this.choose1.setSize(16);
            this.choose1.setTitle(getRoot().getResources().getString(R.string.label_id_add));
            this.choose1.setVisibleArrow(true);
            this.id1.setLabel(getRoot().getResources().getString(R.string.label_id_finger));
            this.id1.setRes(getDrawableFromResource(getRoot(), R.drawable.ic_svg_id_touch));
        }
        executeBindingsOn(this.id1);
        executeBindingsOn(this.choose1);
    }
}
