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

/* renamed from: ru.unicorn.databinding.FragmentPassCardFirstBindingImpl */
public class FragmentPassCardFirstBindingImpl extends FragmentPassCardFirstBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(10);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    private final LinearLayout mboundView1;

    static {
        sIncludes.setIncludes(1, new String[]{"item_pass_id_title_with_image", "item_id_pass_title_subtitle", "item_id_pass_title_subtitle", "item_id_pass_title_subtitle", "item_id_pass_title_subtitle"}, new int[]{2, 3, 4, 5, 6}, new int[]{R.layout.item_pass_id_title_with_image, R.layout.item_id_pass_title_subtitle, R.layout.item_id_pass_title_subtitle, R.layout.item_id_pass_title_subtitle, R.layout.item_id_pass_title_subtitle});
        sViewsWithIds.put(R.id.pb, 7);
        sViewsWithIds.put(R.id.rv, 8);
        sViewsWithIds.put(R.id.addCard, 9);
    }

    public FragmentPassCardFirstBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentPassCardFirstBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, objArr[9], objArr[3], objArr[4], objArr[5], objArr[6], objArr[2], objArr[7], objArr[8]);
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
            this.mDirtyFlags = 64;
        }
        this.id1.invalidateAll();
        this.choose1.invalidateAll();
        this.choose2.invalidateAll();
        this.choose3.invalidateAll();
        this.choose4.invalidateAll();
        requestRebind();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.choose1.hasPendingBindings() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.choose2.hasPendingBindings() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r6.choose3.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.choose4.hasPendingBindings() == false) goto L_0x003a;
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
            ru.unicorn.databinding.ItemPassIdTitleWithImageBinding r0 = r6.id1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemIdPassTitleSubtitleBinding r0 = r6.choose1
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemIdPassTitleSubtitleBinding r0 = r6.choose2
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemIdPassTitleSubtitleBinding r0 = r6.choose3
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            ru.unicorn.databinding.ItemIdPassTitleSubtitleBinding r0 = r6.choose4
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentPassCardFirstBindingImpl.hasPendingBindings():boolean");
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
        this.choose2.setLifecycleOwner(lifecycleOwner);
        this.choose3.setLifecycleOwner(lifecycleOwner);
        this.choose4.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeChoose4((ItemIdPassTitleSubtitleBinding) obj, i2);
        }
        if (i == 1) {
            return onChangeChoose3((ItemIdPassTitleSubtitleBinding) obj, i2);
        }
        if (i == 2) {
            return onChangeId1((ItemPassIdTitleWithImageBinding) obj, i2);
        }
        if (i == 3) {
            return onChangeChoose2((ItemIdPassTitleSubtitleBinding) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return onChangeChoose1((ItemIdPassTitleSubtitleBinding) obj, i2);
    }

    private boolean onChangeChoose4(ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeChoose3(ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeId1(ItemPassIdTitleWithImageBinding itemPassIdTitleWithImageBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeChoose2(ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeChoose1(ItemIdPassTitleSubtitleBinding itemIdPassTitleSubtitleBinding, int i) {
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
            this.choose1.setTitle(getRoot().getResources().getString(R.string.label_id_first_stage_title));
            this.choose1.setSubtitle(getRoot().getResources().getString(R.string.label_id_first_stage_subtitle_card));
            this.choose2.setTitle(getRoot().getResources().getString(R.string.label_id_second_stage_title));
            this.choose2.setSubtitle(getRoot().getResources().getString(R.string.label_id_second_stage_subtitle));
            this.choose3.setTitle(getRoot().getResources().getString(R.string.label_id_third_stage_title));
            this.choose3.setSubtitle(getRoot().getResources().getString(R.string.label_id_third_stage_subtitle_card));
            this.choose4.setTitle(getRoot().getResources().getString(R.string.label_id_fourth_stage_title));
            this.choose4.setSubtitle(getRoot().getResources().getString(R.string.label_id_fourth_stage_subtitle_card));
            this.id1.setLabel(getRoot().getResources().getString(R.string.label_id_card));
            this.id1.setRes(getDrawableFromResource(getRoot(), R.drawable.ic_svg_id_card));
        }
        executeBindingsOn(this.id1);
        executeBindingsOn(this.choose1);
        executeBindingsOn(this.choose2);
        executeBindingsOn(this.choose3);
        executeBindingsOn(this.choose4);
    }
}
