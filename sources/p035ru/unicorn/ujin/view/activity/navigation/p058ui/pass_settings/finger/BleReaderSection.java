package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger;

import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001$B\u0005¢\u0006\u0002\u0010\u0005J6\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0018\u00010\u0003R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0014J\u0014\u0010\u001d\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u000bH\u0016J\u0012\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0016J\u000e\u0010#\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006%"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/BleReaderSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/MultiSection;", "Lru/unicorn/ujin/ble/data/BleReader;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/BleReaderSection$VH;", "Landroid/view/View$OnClickListener;", "()V", "itemClick", "Lio/reactivex/subjects/PublishSubject;", "getItemClick", "()Lio/reactivex/subjects/PublishSubject;", "selectedPosition", "", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "selectedReader", "getSelectedReader", "()Lru/unicorn/ujin/ble/data/BleReader;", "setSelectedReader", "(Lru/unicorn/ujin/ble/data/BleReader;)V", "bindViewHolder", "", "vh", "data", "position", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "onClick", "v", "setCurrentSelected", "VH", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.BleReaderSection */
/* compiled from: BleReaderSection.kt */
public final class BleReaderSection extends MultiSection<BleReader, C5919VH> implements View.OnClickListener {
    private final PublishSubject<BleReader> itemClick;
    private int selectedPosition = -1;
    private BleReader selectedReader;

    public int getLayoutId() {
        return R.layout.item_pass_finger;
    }

    public BleReaderSection() {
        PublishSubject<BleReader> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "PublishSubject.create()");
        this.itemClick = create;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final void setSelectedPosition(int i) {
        this.selectedPosition = i;
    }

    public final BleReader getSelectedReader() {
        return this.selectedReader;
    }

    public final void setSelectedReader(BleReader bleReader) {
        this.selectedReader = bleReader;
    }

    public final PublishSubject<BleReader> getItemClick() {
        return this.itemClick;
    }

    public void onClick(View view) {
        Object tag = view != null ? view.getTag() : null;
        if (tag != null) {
            int adapterPositionForViewHolder = getAdapterPositionForViewHolder((C5919VH) tag);
            BleReader bleReader = (BleReader) getData(adapterPositionForViewHolder);
            if (bleReader != null) {
                this.selectedReader = bleReader;
                this.selectedPosition = adapterPositionForViewHolder;
                this.itemClick.onNext(bleReader);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.BleReaderSection.VH");
    }

    public final void setCurrentSelected(int i) {
        List data;
        this.selectedPosition = i;
        if (i > -1 && (data = getData()) != null && data.size() - 1 >= i) {
            this.selectedReader = (BleReader) data.get(i);
        }
    }

    /* access modifiers changed from: protected */
    public C5919VH createViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new C5919VH(this, view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(C5919VH vh, BleReader bleReader, int i, List<Object> list) {
        Intrinsics.checkNotNullParameter(bleReader, "data");
        if (vh != null) {
            vh.bind(bleReader, i);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/BleReaderSection$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/BleReaderSection;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "bind", "", "data", "Lru/unicorn/ujin/ble/data/BleReader;", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.BleReaderSection$VH */
    /* compiled from: BleReaderSection.kt */
    public final class C5919VH extends RecyclerView.ViewHolder {
        final /* synthetic */ BleReaderSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5919VH(BleReaderSection bleReaderSection, View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.this$0 = bleReaderSection;
            view.setTag(this);
            CheckBox checkBox = (CheckBox) view.findViewById(C5619R.C5622id.f6508cb);
            Intrinsics.checkNotNullExpressionValue(checkBox, "itemView.cb");
            checkBox.setTag(this);
            view.setOnClickListener(onClickListener);
            ((CheckBox) view.findViewById(C5619R.C5622id.f6508cb)).setOnClickListener(onClickListener);
        }

        public final void bind(BleReader bleReader, int i) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            Intrinsics.checkNotNullExpressionValue(view.getContext(), "itemView.context");
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            CheckBox checkBox = (CheckBox) view2.findViewById(C5619R.C5622id.f6508cb);
            Intrinsics.checkNotNullExpressionValue(checkBox, "itemView.cb");
            checkBox.setText(bleReader != null ? bleReader.getDeviceTitle() : null);
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            CheckBox checkBox2 = (CheckBox) view3.findViewById(C5619R.C5622id.f6508cb);
            Intrinsics.checkNotNullExpressionValue(checkBox2, "itemView.cb");
            checkBox2.setChecked(this.this$0.getSelectedPosition() == i);
        }
    }
}
