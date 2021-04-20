package p035ru.unicorn.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* renamed from: ru.unicorn.databinding.ItemImageBindingImpl */
public class ItemImageBindingImpl extends ItemImageBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public ItemImageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, sIncludes, sViewsWithIds));
    }

    private ItemImageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[0]);
        this.mDirtyFlags = -1;
        this.arrow.setTag((Object) null);
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
        if (15 == i) {
            setResourc((Drawable) obj);
        } else if (3 == i) {
            setColor((Integer) obj);
        } else if (18 == i) {
            setVisible((Boolean) obj);
        } else if (22 != i) {
            return false;
        } else {
            setActive((Boolean) obj);
        }
        return true;
    }

    public void setResourc(Drawable drawable) {
        this.mResourc = drawable;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    public void setColor(Integer num) {
        this.mColor = num;
    }

    public void setVisible(Boolean bool) {
        this.mVisible = bool;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    public void setActive(Boolean bool) {
        this.mActive = bool;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(22);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.mDirtyFlags     // Catch:{ all -> 0x0081 }
            r2 = 0
            r15.mDirtyFlags = r2     // Catch:{ all -> 0x0081 }
            monitor-exit(r15)     // Catch:{ all -> 0x0081 }
            android.graphics.drawable.Drawable r4 = r15.mResourc
            java.lang.Boolean r5 = r15.mVisible
            java.lang.Boolean r6 = r15.mActive
            r7 = 20
            long r9 = r0 & r7
            r11 = 0
            int r12 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x002b
            boolean r5 = androidx.databinding.ViewDataBinding.safeUnbox((java.lang.Boolean) r5)
            if (r12 == 0) goto L_0x0025
            if (r5 == 0) goto L_0x0022
            r9 = 64
            goto L_0x0024
        L_0x0022:
            r9 = 32
        L_0x0024:
            long r0 = r0 | r9
        L_0x0025:
            if (r5 == 0) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            r5 = 8
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            r9 = 24
            long r12 = r0 & r9
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0054
            boolean r6 = androidx.databinding.ViewDataBinding.safeUnbox((java.lang.Boolean) r6)
            if (r14 == 0) goto L_0x0042
            if (r6 == 0) goto L_0x003f
            r11 = 256(0x100, double:1.265E-321)
            goto L_0x0041
        L_0x003f:
            r11 = 128(0x80, double:6.32E-322)
        L_0x0041:
            long r0 = r0 | r11
        L_0x0042:
            if (r6 == 0) goto L_0x004a
            android.widget.ImageView r6 = r15.arrow
            r11 = 2131099898(0x7f0600fa, float:1.7812162E38)
            goto L_0x004f
        L_0x004a:
            android.widget.ImageView r6 = r15.arrow
            r11 = 2131099899(0x7f0600fb, float:1.7812164E38)
        L_0x004f:
            int r6 = getColorFromResource(r6, r11)
            r11 = r6
        L_0x0054:
            long r9 = r9 & r0
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x006a
            int r6 = getBuildSdkInt()
            r9 = 21
            if (r6 < r9) goto L_0x006a
            android.widget.ImageView r6 = r15.arrow
            android.content.res.ColorStateList r9 = androidx.databinding.adapters.Converters.convertColorToColorStateList(r11)
            r6.setImageTintList(r9)
        L_0x006a:
            r9 = 17
            long r9 = r9 & r0
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0076
            android.widget.ImageView r6 = r15.arrow
            p035ru.unicorn.ujin.view.binding.BindingUtilKt.drawable(r6, r4)
        L_0x0076:
            long r0 = r0 & r7
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0080
            android.widget.ImageView r0 = r15.arrow
            r0.setVisibility(r5)
        L_0x0080:
            return
        L_0x0081:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0081 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.ItemImageBindingImpl.executeBindings():void");
    }
}
