package p035ru.unicorn.databinding;

import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.databinding.FragmentMorionServiceTicketBindingImpl */
public class FragmentMorionServiceTicketBindingImpl extends FragmentMorionServiceTicketBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = new ViewDataBinding.IncludedLayouts(17);
    private static final SparseIntArray sViewsWithIds = new SparseIntArray();
    private long mDirtyFlags;
    private final NestedScrollView mboundView0;
    private final TextView mboundView4;

    static {
        sIncludes.setIncludes(3, new String[]{"item_label_underline_with_arrow", "item_label_value", "item_label_value", "item_label_value", "item_label_value"}, new int[]{6, 7, 8, 9, 10}, new int[]{R.layout.item_label_underline_with_arrow, R.layout.item_label_value, R.layout.item_label_value, R.layout.item_label_value, R.layout.item_label_value});
        sViewsWithIds.put(R.id.ticketLayout, 11);
        sViewsWithIds.put(R.id.rvFileList, 12);
        sViewsWithIds.put(R.id.btn_go_chat, 13);
        sViewsWithIds.put(R.id.btnConfirm, 14);
        sViewsWithIds.put(R.id.btnReturn, 15);
        sViewsWithIds.put(R.id.progressBar, 16);
    }

    public FragmentMorionServiceTicketBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 17, sIncludes, sViewsWithIds));
    }

    private FragmentMorionServiceTicketBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, objArr[14], objArr[13], objArr[15], objArr[6], objArr[10], objArr[9], objArr[3], objArr[16], objArr[12], objArr[7], objArr[8], objArr[11], objArr[5], objArr[1], objArr[2]);
        this.mDirtyFlags = -1;
        this.f6574ll.setTag((Object) null);
        this.mboundView0 = objArr[0];
        this.mboundView0.setTag((Object) null);
        this.mboundView4 = objArr[4];
        this.mboundView4.setTag((Object) null);
        this.tvFilesTitle.setTag((Object) null);
        this.tvTicketNumber.setTag((Object) null);
        this.tvTicketTitle.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 64;
        }
        this.first.invalidateAll();
        this.second.invalidateAll();
        this.third.invalidateAll();
        this.fourth.invalidateAll();
        this.fiveth.invalidateAll();
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
        if (r6.fourth.hasPendingBindings() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.fiveth.hasPendingBindings() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
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
            long r0 = r6.mDirtyFlags     // Catch:{ all -> 0x003c }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x003c }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x003c }
            ru.unicorn.databinding.ItemLabelUnderlineWithArrowBinding r0 = r6.first
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            ru.unicorn.databinding.ItemLabelValueBinding r0 = r6.second
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            ru.unicorn.databinding.ItemLabelValueBinding r0 = r6.third
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0028
            return r4
        L_0x0028:
            ru.unicorn.databinding.ItemLabelValueBinding r0 = r6.fourth
            boolean r0 = r0.hasPendingBindings()
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x0031:
            ru.unicorn.databinding.ItemLabelValueBinding r0 = r6.fiveth
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.databinding.FragmentMorionServiceTicketBindingImpl.hasPendingBindings():boolean");
    }

    public boolean setVariable(int i, Object obj) {
        if (19 != i) {
            return false;
        }
        setTicket((ServiceTicket) obj);
        return true;
    }

    public void setTicket(ServiceTicket serviceTicket) {
        this.mTicket = serviceTicket;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(19);
        super.requestRebind();
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.first.setLifecycleOwner(lifecycleOwner);
        this.second.setLifecycleOwner(lifecycleOwner);
        this.third.setLifecycleOwner(lifecycleOwner);
        this.fourth.setLifecycleOwner(lifecycleOwner);
        this.fiveth.setLifecycleOwner(lifecycleOwner);
    }

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        if (i == 0) {
            return onChangeFourth((ItemLabelValueBinding) obj, i2);
        }
        if (i == 1) {
            return onChangeFiveth((ItemLabelValueBinding) obj, i2);
        }
        if (i == 2) {
            return onChangeFirst((ItemLabelUnderlineWithArrowBinding) obj, i2);
        }
        if (i == 3) {
            return onChangeThird((ItemLabelValueBinding) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return onChangeSecond((ItemLabelValueBinding) obj, i2);
    }

    private boolean onChangeFourth(ItemLabelValueBinding itemLabelValueBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeFiveth(ItemLabelValueBinding itemLabelValueBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeFirst(ItemLabelUnderlineWithArrowBinding itemLabelUnderlineWithArrowBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeThird(ItemLabelValueBinding itemLabelValueBinding, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeSecond(ItemLabelValueBinding itemLabelValueBinding, int i) {
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
        String str;
        int i;
        int i2;
        String str2;
        boolean z;
        String str3;
        int i3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        RealmList<ServiceFile> realmList;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z2;
        boolean z3;
        boolean z4;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        ServiceTicket serviceTicket = this.mTicket;
        int i4 = ((j & 96) > 0 ? 1 : ((j & 96) == 0 ? 0 : -1));
        if (i4 != 0) {
            if (serviceTicket != null) {
                String ticketStateTitle = serviceTicket.getTicketStateTitle();
                String ticketText = serviceTicket.getTicketText();
                String ticketTitle = serviceTicket.getTicketTitle();
                str3 = serviceTicket.getNumber();
                realmList = serviceTicket.getFileList();
                String humanDate = serviceTicket.getHumanDate();
                String humanEndDate = serviceTicket.getHumanEndDate();
                String str15 = ticketStateTitle;
                str13 = serviceTicket.getPerformerFio();
                str14 = humanEndDate;
                str9 = humanDate;
                str10 = ticketTitle;
                str11 = ticketText;
                str12 = str15;
            } else {
                str14 = null;
                str13 = null;
                str12 = null;
                str11 = null;
                str3 = null;
                realmList = null;
                str10 = null;
                str9 = null;
            }
            z = str3 != null;
            if (i4 != 0) {
                j = z ? j | PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : j | PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
            }
            if (realmList != null) {
                z2 = realmList.isEmpty();
            } else {
                z2 = false;
            }
            if ((j & 96) != 0) {
                j |= z2 ? PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID : 512;
            }
            if (str14 != null) {
                z3 = str14.equals("0");
            } else {
                z3 = false;
            }
            if ((j & 96) != 0) {
                j |= z3 ? 256 : 128;
            }
            if (str13 != null) {
                z4 = str13.isEmpty();
            } else {
                z4 = false;
            }
            if ((j & 96) != 0) {
                j |= z4 ? 16384 : PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            }
            int i5 = 8;
            i3 = z2 ? 8 : 0;
            int i6 = z3 ? 8 : 0;
            if (!z4) {
                i5 = 0;
            }
            i2 = i6;
            str2 = str11;
            str = str10;
            i = i5;
            str4 = str12;
            str5 = str13;
            str6 = str14;
            str7 = str9;
        } else {
            str7 = null;
            str6 = null;
            str5 = null;
            str4 = null;
            i3 = 0;
            str3 = null;
            z = false;
            str2 = null;
            i2 = 0;
            i = 0;
            str = null;
        }
        String format = (PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM & j) != 0 ? String.format(this.tvTicketNumber.getResources().getString(R.string.label_ticket), new Object[]{str3}) : null;
        int i7 = ((96 & j) > 0 ? 1 : ((96 & j) == 0 ? 0 : -1));
        if (i7 != 0) {
            str8 = z ? format : String.format(this.tvTicketNumber.getResources().getString(R.string.label_ticket), new Object[]{this.tvTicketNumber.getResources().getString(R.string.binding_empty_value)});
        } else {
            str8 = null;
        }
        if ((j & 64) != 0) {
            this.first.setVisibleArrow(true);
            this.first.setTitle(getRoot().getResources().getString(R.string.label_rent));
            this.fiveth.setTitle(getRoot().getResources().getString(R.string.label_ticket_last_change));
            this.fourth.setTitle(getRoot().getResources().getString(R.string.label_ticket_start));
            this.second.setTitle(getRoot().getResources().getString(R.string.label_performer));
            this.third.setTitle(getRoot().getResources().getString(R.string.label_status));
        }
        if (i7 != 0) {
            this.fiveth.getRoot().setVisibility(i2);
            this.fiveth.setResult(str6);
            this.fourth.setResult(str7);
            TextViewBindingAdapter.setText(this.mboundView4, str2);
            this.second.getRoot().setVisibility(i);
            this.second.setResult(str5);
            this.third.setResult(str4);
            this.tvFilesTitle.setVisibility(i3);
            TextViewBindingAdapter.setText(this.tvTicketNumber, str8);
            TextViewBindingAdapter.setText(this.tvTicketTitle, str);
        }
        executeBindingsOn(this.first);
        executeBindingsOn(this.second);
        executeBindingsOn(this.third);
        executeBindingsOn(this.fourth);
        executeBindingsOn(this.fiveth);
    }
}
