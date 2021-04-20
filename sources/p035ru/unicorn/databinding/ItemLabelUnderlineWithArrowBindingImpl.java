package p035ru.unicorn.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.databinding.ItemLabelUnderlineWithArrowBindingImpl */
public class ItemLabelUnderlineWithArrowBindingImpl extends ItemLabelUnderlineWithArrowBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        sViewsWithIds.put(R.id.underline, 3);
    }

    public ItemLabelUnderlineWithArrowBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, sIncludes, sViewsWithIds));
    }

    private ItemLabelUnderlineWithArrowBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[2], objArr[0], objArr[1], objArr[3]);
        this.mDirtyFlags = -1;
        this.arrow.setTag((Object) null);
        this.parent.setTag((Object) null);
        this.title.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 16;
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
        if (12 == i) {
            setValue((String) obj);
        } else if (2 == i) {
            setVisibleArrow((Boolean) obj);
        } else if (5 == i) {
            setTitle((String) obj);
        } else if (25 != i) {
            return false;
        } else {
            setSize((Integer) obj);
        }
        return true;
    }

    public void setValue(String str) {
        this.mValue = str;
    }

    public void setVisibleArrow(Boolean bool) {
        this.mVisibleArrow = bool;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(2);
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

    public void setSize(Integer num) {
        this.mSize = num;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(25);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r14 = this;
            monitor-enter(r14)
            long r0 = r14.mDirtyFlags     // Catch:{ all -> 0x0054 }
            r2 = 0
            r14.mDirtyFlags = r2     // Catch:{ all -> 0x0054 }
            monitor-exit(r14)     // Catch:{ all -> 0x0054 }
            java.lang.Boolean r4 = r14.mVisibleArrow
            java.lang.String r5 = r14.mTitle
            java.lang.Integer r6 = r14.mSize
            r7 = 18
            long r9 = r0 & r7
            r11 = 0
            int r12 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x002a
            boolean r4 = androidx.databinding.ViewDataBinding.safeUnbox((java.lang.Boolean) r4)
            if (r12 == 0) goto L_0x0025
            if (r4 == 0) goto L_0x0022
            r9 = 64
            goto L_0x0024
        L_0x0022:
            r9 = 32
        L_0x0024:
            long r0 = r0 | r9
        L_0x0025:
            if (r4 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = 0
        L_0x002b:
            r9 = 20
            long r9 = r9 & r0
            int r12 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r9 = 24
            long r9 = r9 & r0
            int r13 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003b
            int r11 = androidx.databinding.ViewDataBinding.safeUnbox((java.lang.Integer) r6)
        L_0x003b:
            long r0 = r0 & r7
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0045
            android.widget.ImageView r0 = r14.arrow
            r0.setVisibility(r4)
        L_0x0045:
            if (r12 == 0) goto L_0x004c
            android.widget.TextView r0 = r14.title
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r5)
        L_0x004c:
            if (r13 == 0) goto L_0x0053
            android.widget.TextView r0 = r14.title
            p035ru.unicorn.ujin.view.binding.BindingUtilKt.textSizeValue(r0, r11)
        L_0x0053:
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0054 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.ItemLabelUnderlineWithArrowBindingImpl.executeBindings():void");
    }
}
